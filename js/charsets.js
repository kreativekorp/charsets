(function(module,window){

class CharsetDecoder {
	static #mergeUint8Array(a, b) {
		if (a && b && a.length && b.length) {
			const c = new Uint8Array(a.length + b.length);
			c.set(a); c.set(b, a.length); return c;
		}
		if (a && a.length) return a;
		if (b && b.length) return b;
		return a || b;
	}
	static #minimize(name) {
		const tokens = [];
		const token = /([0-9]+)|([A-Za-z]+)/g;
		let m; while ((m = token.exec(name))) {
			if (m[1]) tokens.push(m[1].replace(/^0*/, '#'));
			if (m[2]) tokens.push(m[2].toLowerCase());
		}
		return tokens.join('');
	}
	static #decoderList = [];
	static #decoderMap = {};
	#nativeDecoder = null;
	#customDecoder = null;
	#encoding;
	#fatal = false;
	#ignoreBOM = false;
	#tail = null;
	#state = {};
	// Creates and returns a new CharsetDecoder.
	// @param(label) A string identifying the character encoding
	//       that this decoder will use. This may be any valid label.
	//       Defaults to "utf-8".
	// @param(options) An object with the following properties:
	//       fatal
	//             A boolean value indicating if the decode() method
	//             must throw a TypeError when decoding invalid data.
	//             It defaults to false, which means that the decoder
	//             will substitute malformed data with a replacement
	//             character.
	//       ignoreBOM
	//             A boolean value indicating whether the byte order
	//             mark will be included in the output or skipped over.
	//             It defaults to false, which means that the byte order
	//             mark will be skipped over when decoding and will not
	//             be included in the decoded text.
	constructor(label='utf-8', options={}) {
		// Parse options.
		const encoding = String(label);
		const fatal = options && options.fatal && true || false;
		const ignoreBOM = options && options.ignoreBOM && true || false;
		// Try using a built-in TextDecoder.
		try {
			const newOptions = {'fatal': fatal, 'ignoreBOM': ignoreBOM};
			this.#nativeDecoder = new TextDecoder(encoding, newOptions);
			this.#encoding = this.#nativeDecoder.encoding;
			this.#fatal = this.#nativeDecoder.fatal;
			this.#ignoreBOM = this.#nativeDecoder.ignoreBOM;
			return;
		} catch (error) {}
		// Look for our own decoder.
		const key = CharsetDecoder.#minimize(encoding);
		if (CharsetDecoder.#decoderMap[key]) {
			this.#customDecoder = CharsetDecoder.#decoderMap[key];
			this.#encoding = this.#customDecoder.name;
			this.#fatal = fatal;
			this.#ignoreBOM = ignoreBOM;
			return;
		}
		throw new RangeError("CharsetDecoder constructor: The given encoding '" + encoding + "' is not supported.");
	}
	// A string containing the name of the character encoding system
	// that this CharsetDecoder will use.
	get encoding() {
		return this.#encoding;
	}
	// A boolean indicating whether the error mode is fatal.
	get fatal() {
		return this.#fatal;
	}
	// A boolean indicating whether the byte order mark is ignored.
	get ignoreBOM() {
		return this.#ignoreBOM;
	}
	// Decodes the given bytes into a JavaScript string and returns it.
	// @param(buffer) An ArrayBuffer, a TypedArray, or a DataView object
	//       containing the encoded text to decode.
	// @param(options) An object with the property:
	//       stream
	//             A boolean flag indicating whether additional data
	//             will follow in subsequent calls to decode(). Set
	//             to true if processing the data in chunks, and false
	//             for the final chunk or if the data is not chunked.
	//             It defaults to false.
	// @return A string.
	decode(buffer, options={}) {
		// Parse options.
		const stream = options && options.stream && true || false;
		// Perform the decoding using a built-in TextDecoder.
		if (this.#nativeDecoder) {
			const decodeOptions = {'stream': stream};
			return this.#nativeDecoder.decode(buffer, decodeOptions);
		}
		// Perform the decoding using our own decoder.
		const uint8Array = CharsetDecoder.#mergeUint8Array(this.#tail, (
			(buffer instanceof ArrayBuffer) ? new Uint8Array(buffer) :
			new Uint8Array(buffer.buffer, buffer.byteOffset, buffer.byteLength)
		));
		this.#tail = null;
		const string = (
			this.#customDecoder.decode ?
			this.#customDecoder.decode(uint8Array, {
				'replacement': this.#customDecoder.replacement,
				'fatal': this.#fatal,
				'ignoreBOM': this.#ignoreBOM,
				'tail': tail => this.#tail = tail,
				'state': this.#state,
				'stream': stream
			}) :
			this.#tableDecode(uint8Array, stream)
		);
		if (!stream) {
			this.#tail = null;
			this.#state = {};
		}
		return string;
	}
	#tableDecode(inbuf, stream) {
		let inpos = 0;
		const inlen = inbuf.byteLength;
		const out = [];
		const stack = [];
		while (inpos < inlen) {
			const ip = inpos;
			let sp = 0;
			let state = 0;
			let input = inbuf[inpos++];
			let nextState = this.#customDecoder.getNextState(state, input);
			while (nextState && inpos < inlen) {
				stack[sp++] = state;
				stack[sp++] = input;
				state = nextState;
				input = inbuf[inpos++];
				nextState = this.#customDecoder.getNextState(state, input);
			}
			const underflow = nextState && inpos >= inlen;
			for (;;) {
				const output = this.#customDecoder.getOutput(state, input);
				if (output) {
					Array.prototype.push.apply(out, output);
					inpos = ip + (sp >> 1) + 1;
					break;
				}
				if (sp) {
					input = stack[--sp];
					state = stack[--sp];
					continue;
				}
				if (underflow && stream) {
					this.#tail = new Uint8Array(inbuf.buffer, inbuf.byteOffset + ip, inbuf.byteLength - ip);
					return String.fromCharCode.apply(String, out);
				}
				if (this.#fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
				Array.prototype.push.apply(out, this.#customDecoder.replacement);
				if (underflow) return String.fromCharCode.apply(String, out);
				inpos = ip + 1;
				break;
			}
		}
		return String.fromCharCode.apply(String, out);
	}
	// Returns a list of canonical names of supported character encodings.
	static availableCharsets() {
		const charsets = [
			'utf-8', 'ibm866', 'iso-8859-2', 'iso-8859-3', 'iso-8859-4',
			'iso-8859-5', 'iso-8859-6', 'iso-8859-7', 'iso-8859-8',
			'iso-8859-8-i', 'iso-8859-10', 'iso-8859-13', 'iso-8859-14',
			'iso-8859-15', 'iso-8859-16', 'koi8-r', 'koi8-u', 'macintosh',
			'windows-874', 'windows-1250', 'windows-1251', 'windows-1252',
			'windows-1253', 'windows-1254', 'windows-1255', 'windows-1256',
			'windows-1257', 'windows-1258', 'x-mac-cyrillic', 'gbk', 'gb18030',
			'big5', 'euc-jp', 'iso-2022-jp', 'shift_jis', 'euc-kr', 'utf-16be',
			'utf-16le', 'x-user-defined'
		];
		const encountered = {
			'unicode-1-1-utf-8':1, 'utf-8':1, 'utf8':1, '866':1, 'cp866':1,
			'csibm866':1, 'ibm866':1, 'csisolatin2':1, 'iso-8859-2':1,
			'iso-ir-101':1, 'iso8859-2':1, 'iso88592':1, 'iso_8859-2':1,
			'iso_8859-2:1987':1, 'l2':1, 'latin2':1, 'csisolatin3':1,
			'iso-8859-3':1, 'iso-ir-109':1, 'iso8859-3':1, 'iso88593':1,
			'iso_8859-3':1, 'iso_8859-3:1988':1, 'l3':1, 'latin3':1,
			'csisolatin4':1, 'iso-8859-4':1, 'iso-ir-110':1, 'iso8859-4':1,
			'iso88594':1, 'iso_8859-4':1, 'iso_8859-4:1988':1, 'l4':1,
			'latin4':1, 'csisolatincyrillic':1, 'cyrillic':1, 'iso-8859-5':1,
			'iso-ir-144':1, 'iso88595':1, 'iso_8859-5':1, 'iso_8859-5:1988':1,
			'arabic':1, 'asmo-708':1, 'csiso88596e':1, 'csiso88596i':1,
			'csisolatinarabic':1, 'ecma-114':1, 'iso-8859-6':1,
			'iso-8859-6-e':1, 'iso-8859-6-i':1, 'iso-ir-127':1, 'iso8859-6':1,
			'iso88596':1, 'iso_8859-6':1, 'iso_8859-6:1987':1,
			'csisolatingreek':1, 'ecma-118':1, 'elot_928':1, 'greek':1,
			'greek8':1, 'iso-8859-7':1, 'iso-ir-126':1, 'iso8859-7':1,
			'iso88597':1, 'iso_8859-7':1, 'iso_8859-7:1987':1, 'sun_eu_greek':1,
			'csiso88598e':1, 'csisolatinhebrew':1, 'hebrew':1, 'iso-8859-8':1,
			'iso-8859-8-e':1, 'iso-ir-138':1, 'iso8859-8':1, 'iso88598':1,
			'iso_8859-8':1, 'iso_8859-8:1988':1, 'visual':1, 'csiso88598i':1,
			'iso-8859-8-i':1, 'logical':1, 'csisolatin6':1, 'iso-8859-10':1,
			'iso-ir-157':1, 'iso8859-10':1, 'iso885910':1, 'l6':1, 'latin6':1,
			'iso-8859-13':1, 'iso8859-13':1, 'iso885913':1, 'iso-8859-14':1,
			'iso8859-14':1, 'iso885914':1, 'csisolatin9':1, 'iso-8859-15':1,
			'iso8859-15':1, 'iso885915':1, 'l9':1, 'latin9':1, 'iso-8859-16':1,
			'cskoi8r':1, 'koi':1, 'koi8':1, 'koi8-r':1, 'koi8_r':1, 'koi8-u':1,
			'csmacintosh':1, 'mac':1, 'macintosh':1, 'x-mac-roman':1,
			'dos-874':1, 'iso-8859-11':1, 'iso8859-11':1, 'iso885911':1,
			'tis-620':1, 'windows-874':1, 'cp1250':1, 'windows-1250':1,
			'x-cp1250':1, 'cp1251':1, 'windows-1251':1, 'x-cp1251':1,
			'ansi_x3.4-1968':1, 'ascii':1, 'cp1252':1, 'cp819':1,
			'csisolatin1':1, 'ibm819':1, 'iso-8859-1':1, 'iso-ir-100':1,
			'iso8859-1':1, 'iso88591':1, 'iso_8859-1':1, 'iso_8859-1:1987':1,
			'l1':1, 'latin1':1, 'us-ascii':1, 'windows-1252':1, 'x-cp1252':1,
			'cp1253':1, 'windows-1253':1, 'x-cp1253':1, 'cp1254':1,
			'csisolatin5':1, 'iso-8859-9':1, 'iso-ir-148':1, 'iso8859-9':1,
			'iso88599':1, 'iso_8859-9':1, 'iso_8859-9:1989':1, 'l5':1,
			'latin5':1, 'windows-1254':1, 'x-cp1254':1, 'cp1255':1,
			'windows-1255':1, 'x-cp1255':1, 'cp1256':1, 'windows-1256':1,
			'x-cp1256':1, 'cp1257':1, 'windows-1257':1, 'x-cp1257':1,
			'cp1258':1, 'windows-1258':1, 'x-cp1258':1, 'x-mac-cyrillic':1,
			'x-mac-ukrainian':1, 'chinese':1, 'csgb2312':1, 'csiso58gb231280':1,
			'gb2312':1, 'gb_2312':1, 'gb_2312-80':1, 'gbk':1, 'iso-ir-58':1,
			'x-gbk':1, 'gb18030':1, 'big5':1, 'big5-hkscs':1, 'cn-big5':1,
			'csbig5':1, 'x-x-big5':1, 'cseucpkdfmtjapanese':1, 'euc-jp':1,
			'x-euc-jp':1, 'csiso2022jp':1, 'iso-2022-jp':1, 'csshiftjis':1,
			'ms_kanji':1, 'shift-jis':1, 'shift_jis':1, 'sjis':1,
			'windows-31j':1, 'x-sjis':1, 'cseuckr':1, 'csksc56011987':1,
			'euc-kr':1, 'iso-ir-149':1, 'korean':1, 'ks_c_5601-1987':1,
			'ks_c_5601-1989':1, 'ksc5601':1, 'ksc_5601':1, 'windows-949':1,
			'utf-16be':1, 'utf-16':1, 'utf-16le':1, 'x-user-defined':1
		};
		for (const decoder of CharsetDecoder.#decoderList) {
			if (!encountered[decoder.name]) {
				charsets.push(decoder.name);
				encountered[decoder.name]=1;
			}
			for (const alias of decoder.aliases) {
				encountered[alias]=1;
			}
		}
		return charsets;
	}
	static register(name, aliases, maxCharsPerByte, data) {
		const key = CharsetDecoder.#minimize(name);
		if (!key) throw new RangeError('CharsetDecoder register: Attempt to register an encoding with an empty name.');
		const maxcpb = Number(maxCharsPerByte) || 0;
		if (maxcpb < 1) throw new RangeError('CharsetDecoder register: Invalid maximum characters per byte: ' + maxCharsPerByte);
		const decoder = {'name': String(name), 'aliases': [], 'maxCharsPerByte': maxcpb};
		const keys = [key];
		if (aliases) {
			for (const alias of aliases) {
				const a = String(alias);
				const k = CharsetDecoder.#minimize(alias);
				if (!k) throw new RangeError('CharsetDecoder register: Attempt to register an encoding with an empty name.');
				if (decoder.name != a && decoder.aliases.indexOf(a) < 0) decoder.aliases.push(a);
				if (keys.indexOf(k) < 0) keys.push(k);
			}
		}
		if (data && typeof data.decode === 'function') {
			decoder.decode = data.decode;
		} else if (data && typeof data.getNextState === 'function' && typeof data.getOutput === 'function') {
			decoder.getNextState = data.getNextState;
			decoder.getOutput = data.getOutput;
		} else if (data && typeof data.nextState === 'object' && typeof data.output === 'object') {
			const nextState = data.nextState;
			const output = data.output;
			decoder.getNextState = function(state, input) { return nextState[state] && nextState[state][input] || 0; };
			decoder.getOutput = function(state, input) { return output[state] && output[state][input] || null; };
		} else {
			throw new TypeError("CharsetDecoder register: The given encoding '" + name + "' is missing its definition.");
		}
		if (data && typeof data.replacement === 'object' && data.replacement.length) {
			decoder.replacement = data.replacement;
		} else {
			decoder.replacement = [0xFFFD];
		}
		let installed = false;
		for (const k of keys) {
			if (CharsetDecoder.#decoderMap[k]) continue;
			CharsetDecoder.#decoderMap[k] = decoder;
			installed = true;
		}
		if (installed) CharsetDecoder.#decoderList.push(decoder);
		else throw new RangeError("CharsetDecoder register: The given encoding '" + name + "' is already registered.");
	}
}

function utf32DecodeFn(littleEndian) {
	return function(buffer, options) {
		const dataView = new DataView(buffer.buffer, buffer.byteOffset, buffer.byteLength);
		let lookForBOM = !options.ignoreBOM && !options.state.ignoreBOM;
		let inpos = 0;
		const inlen = buffer.byteLength;
		const out = [];
		while (inpos + 4 <= inlen) {
			const cp = dataView.getUint32(inpos, littleEndian);
			inpos += 4;
			if (lookForBOM) {
				lookForBOM = false;
				options.state.ignoreBOM = true;
				if (cp === 0xFEFF) continue;
			}
			if (cp < 0xD800 || cp > 0xDFFF && cp <= 0x10FFFF) out.push(cp);
			else if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
			else Array.prototype.push.apply(out, options.replacement);
		}
		if (inpos < inlen) {
			if (options.stream) options.tail(new Uint8Array(buffer.buffer, buffer.byteOffset + inpos, buffer.byteLength - inpos));
			else if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
			else Array.prototype.push.apply(out, options.replacement);
		}
		return String.fromCodePoint.apply(String, out);
	};
}

CharsetDecoder.register('utf-32be', [], 1, {decode: utf32DecodeFn(false)});
CharsetDecoder.register('utf-32le', ['utf-32'], 1, {decode: utf32DecodeFn(true)});

function cesu8DecodeFn() {
	const readSequence = function(buffer, inpos, inlen) {
		if (inpos >= inlen) return {'underflow': -1};
		const lead = buffer[inpos++];
		if (lead < 0x80) return {'cp': lead, 'len': 1};
		if (lead < 0xC2 || lead > 0xEF) return {'malformed': 1};
		if (inpos >= inlen) return {'underflow': 1};
		const cont1 = buffer[inpos++];
		if (cont1 < 0x80 || cont1 > 0xBF) return {'malformed': 2};
		if (lead < 0xE0) return {'cp': (((lead & 0x1F) << 6) | (cont1 & 0x3F)), 'len': 2};
		if (lead === 0xE0 && cont1 < 0xA0) return {'malformed': 2};
		if (inpos >= inlen) return {'underflow': 2};
		const cont2 = buffer[inpos++];
		if (cont2 < 0x80 || cont2 > 0xBF) return {'malformed': 3};
		return {'cp': (((lead & 0x0F) << 12) | ((cont1 & 0x3F) << 6) | (cont2 & 0x3F)), 'len': 3};
	};
	return function(buffer, options) {
		let inpos = 0;
		const inlen = buffer.byteLength;
		const out = [];
		while (inpos < inlen) {
			const ch = readSequence(buffer, inpos, inlen);
			if (ch.underflow) {
				if (options.stream) options.tail(new Uint8Array(buffer.buffer, buffer.byteOffset+inpos, buffer.byteLength-inpos));
				else if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
				else Array.prototype.push.apply(out, options.replacement);
				break;
			} else if (ch.malformed) {
				if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
				else Array.prototype.push.apply(out, options.replacement);
				inpos++;
			} else if (ch.cp >= 0xD800 && ch.cp <= 0xDBFF) {
				const cl = readSequence(buffer, inpos + 3, inlen);
				if (cl.underflow) {
					if (options.stream) options.tail(new Uint8Array(buffer.buffer, buffer.byteOffset+inpos, buffer.byteLength-inpos));
					else if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
					else Array.prototype.push.apply(out, options.replacement);
					if (options.stream) break;
					inpos += 3;
				} else if (cl.malformed || cl.cp < 0xDC00 || cl.cp > 0xDFFF) {
					if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
					else Array.prototype.push.apply(out, options.replacement);
					inpos += 3;
				} else {
					out.push(ch.cp, cl.cp);
					inpos += 6;
				}
			} else if (ch.cp >= 0xDC00 && ch.cp <= 0xDFFF) {
				if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
				else Array.prototype.push.apply(out, options.replacement);
				inpos += 3;
			} else {
				out.push(ch.cp);
				inpos += ch.len;
			}
		}
		return String.fromCharCode.apply(String, out);
	};
}

CharsetDecoder.register('CESU-8', [], 1, {decode: cesu8DecodeFn()});

function nonLossyASCIIDecodeFn() {
	const alphabet = {
		0x30:0, 0x31:1, 0x32:2, 0x33:3, 0x34:4,
		0x35:5, 0x36:6, 0x37:7, 0x38:8, 0x39:9,
		0x41:10, 0x42:11, 0x43:12, 0x44:13, 0x45:14, 0x46:15,
		0x61:10, 0x62:11, 0x63:12, 0x64:13, 0x65:14, 0x66:15
	};
	const readDigits = function(buffer, inpos, inlen, count, radix, prefixLen) {
		let value = 0;
		for (let i = 0; i < count; i++) {
			if (inpos >= inlen) return {'underflow': prefixLen + i};
			const digit = alphabet[buffer[inpos++]];
			if (digit === undefined || digit >= radix) return {'malformed': prefixLen + i};
			value = value * radix + digit;
		}
		return {'result': value};
	};
	const underflow = function(buffer, options, out, ip) {
		if (options.stream) options.tail(new Uint8Array(buffer.buffer, buffer.byteOffset+ip, buffer.byteLength-ip));
		else if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
		else Array.prototype.push.apply(out, options.replacement);
		return buffer.byteLength;
	};
	const malformed = function(options, out, ip, length) {
		if (options.fatal) throw new TypeError('CharsetDecoder.decode: Decoding failed.');
		else Array.prototype.push.apply(out, options.replacement);
		return ip + length;
	};
	const readLowSurrogate = function(buffer, options, inpos, inlen, out, ip, highSurrogate) {
		if (inpos >= inlen) return underflow(buffer, options, out, ip);
		const b = buffer[inpos++];
		if (b !== 0x5C) return malformed(options, out, ip, 6);
		if (inpos >= inlen) return underflow(buffer, options, out, ip);
		const e = buffer[inpos++];
		if (e !== 0x55 && e !== 0x75) return malformed(options, out, ip, 6);
		const r = readDigits(buffer, inpos, inlen, 4, 16, 8);
		if (r.underflow) return underflow(buffer, options, out, ip);
		if (r.malformed) return malformed(options, out, ip, r.malformed);
		if (r.result < 0xDC00 || r.result > 0xDFFF) return malformed(options, out, ip, 6);
		out.push(highSurrogate, r.result);
		return inpos + 4;
	};
	const readHexEscape = function(buffer, options, inpos, inlen, out, ip) {
		const r = readDigits(buffer, inpos, inlen, 4, 16, 2);
		if (r.underflow) return underflow(buffer, options, out, ip);
		if (r.malformed) return malformed(options, out, ip, r.malformed);
		if (r.result < 0xD800 || r.result > 0xDFFF) { out.push(r.result); return inpos + 4; }
		if (r.result >= 0xDC00 && r.result <= 0xDFFF) return malformed(options, out, ip, 6);
		return readLowSurrogate(buffer, options, inpos + 4, inlen, out, ip, r.result);
	};
	const readOctEscape = function(buffer, options, inpos, inlen, out, ip, mostSignificantDigit) {
		const r = readDigits(buffer, inpos, inlen, 2, 8, 2);
		if (r.underflow) return underflow(buffer, options, out, ip);
		if (r.malformed) return malformed(options, out, ip, r.malformed);
		out.push((mostSignificantDigit << 6) | r.result);
		return inpos + 2;
	};
	const readEscape = function(buffer, options, inpos, inlen, out, ip) {
		if (inpos >= inlen) return underflow(buffer, options, out, ip);
		const e = buffer[inpos++];
		if (e === 0x5C) { out.push(0x5C); return inpos; }
		if (e === 0x55 || e === 0x75) return readHexEscape(buffer, options, inpos, inlen, out, ip);
		if (e >= 0x30 && e <= 0x33) return readOctEscape(buffer, options, inpos, inlen, out, ip, e & 7);
		return malformed(options, out, ip, 2);
	};
	const readSequence = function(buffer, options, inpos, inlen, out) {
		const ip = inpos; const b = buffer[inpos++];
		if (b === 0x5C) return readEscape(buffer, options, inpos, inlen, out, ip);
		if (b >= 0x80) return malformed(options, out, ip, 1);
		out.push(b);
		return inpos;
	};
	return function(buffer, options) {
		let inpos = 0; const inlen = buffer.byteLength; const out = [];
		while (inpos < inlen) inpos = readSequence(buffer, options, inpos, inlen, out);
		return String.fromCharCode.apply(String, out);
	};
}

CharsetDecoder.register('x-us-ascii-non-lossy', [], 1, {decode: nonLossyASCIIDecodeFn()});

class CharsetEncoder {
	static #minimize(name) {
		const tokens = [];
		const token = /([0-9]+)|([A-Za-z]+)/g;
		let m; while ((m = token.exec(name))) {
			if (m[1]) tokens.push(m[1].replace(/^0*/, '#'));
			if (m[2]) tokens.push(m[2].toLowerCase());
		}
		return tokens.join('');
	}
	static #encoderList = [];
	static #encoderMap = {};
	#nativeEncoder = null;
	#customEncoder = null;
	#encoding;
	#fatal = false;
	#addBOM = false;
	#removeBOM = false;
	// Creates and returns a new CharsetEncoder.
	// @param(label) A string identifying the character encoding
	//       that this encoder will use. This may be any valid label.
	//       Defaults to "utf-8".
	// @param(options) An object with the following properties:
	//       fatal
	//             A boolean value indicating if the encode() method
	//             must throw a RangeError when encountering a character
	//             that cannot be encoded. It defaults to false, which
	//             means that the encoder will substitute unencodable
	//             characters with a replacement character.
	//       addBOM
	//             A boolean value indicating whether a byte order mark
	//             will be included in the output. It defaults to false,
	//             which means that the byte order mark will not be
	//             included in the encoded text.
	//       removeBOM
	//             A boolean value indicating whether a byte order mark
	//             will be skipped over in the input. It defaults to false,
	//             which means that if a byte order mark is included in
	//             the input, it will also be included in the encoded text.
	constructor(label='utf-8', options={}) {
		// Parse options.
		const encoding = String(label);
		const fatal = options && options.fatal && true || false;
		const addBOM = options && options.addBOM && true || false;
		const removeBOM = options && options.removeBOM && true || false;
		if (addBOM && removeBOM) {
			throw new RangeError("CharsetEncoder constructor: Cannot specify both addBOM and removeBOM.");
		}
		// Try using a built-in TextEncoder.
		const key = CharsetEncoder.#minimize(encoding);
		if (key === 'utf#8') {
			try {
				this.#nativeEncoder = new TextEncoder();
				this.#encoding = this.#nativeEncoder.encoding;
				this.#fatal = fatal;
				this.#addBOM = addBOM;
				this.#removeBOM = removeBOM;
				return;
			} catch (error) {}
		}
		// Look for our own encoder.
		if (CharsetEncoder.#encoderMap[key]) {
			this.#customEncoder = CharsetEncoder.#encoderMap[key];
			this.#encoding = this.#customEncoder.name;
			this.#fatal = fatal;
			this.#addBOM = addBOM;
			this.#removeBOM = removeBOM;
			return;
		}
		throw new RangeError("CharsetEncoder constructor: The given encoding '" + encoding + "' is not supported.");
	}
	// A string containing the name of the character encoding system
	// that this CharsetEncoder will use.
	get encoding() {
		return this.#encoding;
	}
	// A boolean indicating whether the error mode is fatal.
	get fatal() {
		return this.#fatal;
	}
	// A boolean indicating whether the byte order mark is added.
	get addBOM() {
		return this.#addBOM;
	}
	// A boolean indicating whether the byte order mark is removed.
	get removeBOM() {
		return this.#removeBOM;
	}
	// Takes a string as input, and returns a Uint8Array containing
	// the encoded string.
	// @param(string) A string containing the text to encode.
	// @return A Uint8Array object containing the encoded input string.
	encode(string) {
		// Normalize string.
		string = String(string)
		if (this.#addBOM && !string.startsWith('\uFEFF')) string = '\uFEFF' + string;
		if (this.#removeBOM && string.startsWith('\uFEFF')) string = string.substring(1);
		// Perform the encoding using a built-in TextEncoder.
		if (this.#nativeEncoder) {
			return this.#nativeEncoder.encode(string);
		}
		// Perform the encoding using our own encoder.
		const maxLength = Math.ceil(string.length * this.#customEncoder.maxBytesPerChar);
		const uint8Array = new Uint8Array(maxLength);
		const result = (
			this.#customEncoder.encodeInto ?
			this.#customEncoder.encodeInto(string, uint8Array, {
				'replacement': this.#customEncoder.replacement,
				'fatal': this.#fatal,
				'stream': false
			}) :
			this.#tableEncodeInto(string, uint8Array, false)
		);
		if (result.read < string.length) throw new RangeError('CharsetEncoder encode: Encoding failed.');
		return new Uint8Array(uint8Array.buffer, uint8Array.byteOffset, result.written);
	}
	// Takes a string to encode and a destination Uint8Array to put
	// the encoded text into, and returns an object indicating the
	// progress of the encoding.
	// @param(string) A string containing the text to encode.
	// @param(uint8Array) A Uint8Array object instance to place the
	//       resulting encoded text into.
	// @return An object, which contains two members:
	//       read
	//             The number of UTF-16 code units from the source
	//             that have been converted. This may be less than
	//             string.length if uint8Array did not have enough
	//             space.
	//       written
	//             The number of bytes modified in the destination
	//             Uint8Array. The bytes written are guaranteed to
	//             form complete byte sequences.
	encodeInto(string, uint8Array) {
		// Normalize string.
		string = String(string)
		if (this.#addBOM && !string.startsWith('\uFEFF')) string = '\uFEFF' + string;
		if (this.#removeBOM && string.startsWith('\uFEFF')) string = string.substring(1);
		// Perform the encoding using a built-in TextEncoder.
		if (this.#nativeEncoder) {
			return this.#nativeEncoder.encodeInto(string, uint8Array);
		}
		// Perform the encoding using our own encoder.
		return (
			this.#customEncoder.encodeInto ?
			this.#customEncoder.encodeInto(string, uint8Array, {
				'replacement': this.#customEncoder.replacement,
				'fatal': this.#fatal,
				'stream': true
			}) :
			this.#tableEncodeInto(string, uint8Array, true)
		);
	}
	#tableEncodeInto(string, uint8Array, stream) {
		let inpos = 0;
		let outpos = 0;
		const inlen = string.length;
		const outlen = uint8Array.byteLength;
		const stack = [];
		while (inpos < inlen) {
			const ip = inpos;
			let sp = 0;
			let state = 0;
			let input = string.charCodeAt(inpos++);
			let nextState = this.#customEncoder.getNextState(state, input);
			while (nextState && inpos < inlen) {
				stack[sp++] = state;
				stack[sp++] = input;
				state = nextState;
				input = string.charCodeAt(inpos++);
				nextState = this.#customEncoder.getNextState(state, input);
			}
			const underflow = nextState && inpos >= inlen;
			for (;;) {
				const output = this.#customEncoder.getOutput(state, input);
				if (output) {
					const overflow = (outpos + output.length > outlen);
					if (overflow) return {'read': ip, 'written': outpos};
					uint8Array.set(output, outpos);
					outpos += output.length;
					inpos = ip + (sp >> 1) + 1;
					break;
				}
				if (sp) {
					input = stack[--sp];
					state = stack[--sp];
					continue;
				}
				if (underflow && stream) return {'read': ip, 'written': outpos};
				if (this.#fatal) throw new RangeError('CharsetEncoder.encodeInto: Encoding failed.');
				const overflow = (outpos + this.#customEncoder.replacement.length > outlen);
				if (overflow) return {'read': ip, 'written': outpos};
				uint8Array.set(this.#customEncoder.replacement, outpos);
				outpos += this.#customEncoder.replacement.length;
				if (underflow) return {'read': inpos, 'written': outpos};
				if (ip < inlen && string.charCodeAt(ip) >= 0xD800 && string.charCodeAt(ip) <= 0xDBFF) {
					if (ip+1 < inlen && string.charCodeAt(ip+1) >= 0xDC00 && string.charCodeAt(ip+1) <= 0xDFFF) {
						inpos = ip + 2;
						break;
					}
				}
				inpos = ip + 1;
				break;
			}
		}
		return {'read': inpos, 'written': outpos};
	}
	// Returns a list of canonical names of supported character encodings.
	static availableCharsets() {
		const charsets = ['utf-8'];
		const encountered = {'unicode-1-1-utf-8':1, 'utf-8':1, 'utf8':1};
		for (const encoder of CharsetEncoder.#encoderList) {
			if (!encountered[encoder.name]) {
				charsets.push(encoder.name);
				encountered[encoder.name]=1;
			}
			for (const alias of encoder.aliases) {
				encountered[alias]=1;
			}
		}
		return charsets;
	}
	static register(name, aliases, maxBytesPerChar, data) {
		const key = CharsetEncoder.#minimize(name);
		if (!key) throw new RangeError('CharsetEncoder register: Attempt to register an encoding with an empty name.');
		const maxbpc = Number(maxBytesPerChar) || 0;
		if (maxbpc < 1) throw new RangeError('CharsetEncoder register: Invalid maximum bytes per character: ' + maxBytesPerChar);
		const encoder = {'name': String(name), 'aliases': [], 'maxBytesPerChar': maxbpc};
		const keys = [key];
		if (aliases) {
			for (const alias of aliases) {
				const a = String(alias);
				const k = CharsetEncoder.#minimize(alias);
				if (!k) throw new RangeError('CharsetEncoder register: Attempt to register an encoding with an empty name.');
				if (encoder.name != a && encoder.aliases.indexOf(a) < 0) encoder.aliases.push(a);
				if (keys.indexOf(k) < 0) keys.push(k);
			}
		}
		if (data && typeof data.encodeInto === 'function') {
			encoder.encodeInto = data.encodeInto;
		} else if (data && typeof data.getNextState === 'function' && typeof data.getOutput === 'function') {
			encoder.getNextState = data.getNextState;
			encoder.getOutput = data.getOutput;
		} else if (data && typeof data.nextState === 'object' && typeof data.output === 'object') {
			const nextState = data.nextState;
			const output = data.output;
			encoder.getNextState = function(state, input) { return nextState[state] && nextState[state][input] || 0; };
			encoder.getOutput = function(state, input) { return output[state] && output[state][input] || null; };
		} else {
			throw new TypeError("CharsetEncoder register: The given encoding '" + name + "' is missing its definition.");
		}
		if (data && typeof data.replacement === 'object' && data.replacement.length) {
			encoder.replacement = data.replacement;
		} else {
			encoder.replacement = [0x3F];
		}
		let installed = false;
		for (const k of keys) {
			if (CharsetEncoder.#encoderMap[k]) continue;
			CharsetEncoder.#encoderMap[k] = encoder;
			installed = true;
		}
		if (installed) CharsetEncoder.#encoderList.push(encoder);
		else throw new RangeError("CharsetEncoder register: The given encoding '" + name + "' is already registered.");
	}
}

function utf16EncodeFn(littleEndian) {
	return function(string, buffer, options) {
		const dataView = new DataView(buffer.buffer, buffer.byteOffset, buffer.byteLength);
		let inpos = 0;
		let outpos = 0;
		const inlen = string.length;
		const outlen = buffer.byteLength;
		while (inpos < inlen) {
			const cp = string.codePointAt(inpos);
			if (cp > 0xFFFF) {
				if (outpos + 4 > outlen) break;
				dataView.setUint16(outpos+0, string.charCodeAt(inpos+0), littleEndian);
				dataView.setUint16(outpos+2, string.charCodeAt(inpos+1), littleEndian);
				outpos += 4;
				inpos += 2;
			} else if (cp < 0xD800 || cp > 0xDFFF) {
				if (outpos + 2 > outlen) break;
				dataView.setUint16(outpos, string.charCodeAt(inpos), littleEndian);
				outpos += 2;
				inpos++;
			} else {
				if (outpos + 2 > outlen) break;
				dataView.setUint16(outpos, 0xFFFD, littleEndian);
				outpos += 2;
				inpos++;
			}
		}
		return {'read': inpos, 'written': outpos};
	};
}

CharsetEncoder.register('utf-16be', [], 2, {encodeInto: utf16EncodeFn(false)});
CharsetEncoder.register('utf-16le', ['utf-16'], 2, {encodeInto: utf16EncodeFn(true)});

function utf32EncodeFn(littleEndian) {
	return function(string, buffer, options) {
		const dataView = new DataView(buffer.buffer, buffer.byteOffset, buffer.byteLength);
		let inpos = 0;
		let outpos = 0;
		const inlen = string.length;
		const outlen = buffer.byteLength;
		while (inpos < inlen) {
			const cp = string.codePointAt(inpos);
			if (cp > 0xFFFF) {
				if (outpos + 4 > outlen) break;
				dataView.setUint32(outpos, cp, littleEndian);
				outpos += 4;
				inpos += 2;
			} else if (cp < 0xD800 || cp > 0xDFFF) {
				if (outpos + 4 > outlen) break;
				dataView.setUint32(outpos, cp, littleEndian);
				outpos += 4;
				inpos++;
			} else {
				if (outpos + 4 > outlen) break;
				dataView.setUint32(outpos, 0xFFFD, littleEndian);
				outpos += 4;
				inpos++;
			}
		}
		return {'read': inpos, 'written': outpos};
	};
}

CharsetEncoder.register('utf-32be', [], 4, {encodeInto: utf32EncodeFn(false)});
CharsetEncoder.register('utf-32le', ['utf-32'], 4, {encodeInto: utf32EncodeFn(true)});

function cesu8EncodeFn() {
	const write3 = function(buffer, outpos, cp) {
		buffer[outpos++] = 0xE0 | ((cp >> 12) & 0x0F);
		buffer[outpos++] = 0x80 | ((cp >>  6) & 0x3F);
		buffer[outpos++] = 0x80 | ((cp >>  0) & 0x3F);
	};
	return function(string, buffer, options) {
		let inpos = 0;
		let outpos = 0;
		const inlen = string.length;
		const outlen = buffer.byteLength;
		while (inpos < inlen) {
			const cp = string.codePointAt(inpos);
			if (cp < 0x80) {
				if (outpos >= outlen) break;
				buffer[outpos++] = cp;
				inpos++;
			} else if (cp < 0x800) {
				if (outpos + 2 > outlen) break;
				buffer[outpos++] = 0xC0 | ((cp >> 6) & 0x1F);
				buffer[outpos++] = 0x80 | ((cp >> 0) & 0x3F);
				inpos++;
			} else if (cp > 0xFFFF) {
				if (outpos + 6 > outlen) break;
				write3(buffer, outpos+0, string.charCodeAt(inpos+0));
				write3(buffer, outpos+3, string.charCodeAt(inpos+1));
				outpos += 6;
				inpos += 2;
			} else if (cp < 0xD800 || cp > 0xDFFF) {
				if (outpos + 3 > outlen) break;
				write3(buffer, outpos, cp);
				outpos += 3;
				inpos++;
			} else {
				if (outpos + 3 > outlen) break;
				write3(buffer, outpos, 0xFFFD);
				outpos += 3;
				inpos++;
			}
		}
		return {'read': inpos, 'written': outpos};
	};
}

CharsetEncoder.register('CESU-8', [], 3, {encodeInto: cesu8EncodeFn()});

function nonLossyASCIIEncodeFn() {
	const alphabet = [0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x61,0x62,0x63,0x64,0x65,0x66];
	const writeOct = function(buffer, outpos, cp) {
		buffer[outpos++] = 0x5C;
		buffer[outpos++] = alphabet[(cp >> 6) & 3];
		buffer[outpos++] = alphabet[(cp >> 3) & 7];
		buffer[outpos++] = alphabet[(cp >> 0) & 7];
	};
	const writeHex = function(buffer, outpos, cp) {
		buffer[outpos++] = 0x5C;
		buffer[outpos++] = 0x75;
		buffer[outpos++] = alphabet[(cp >> 12) & 15];
		buffer[outpos++] = alphabet[(cp >>  8) & 15];
		buffer[outpos++] = alphabet[(cp >>  4) & 15];
		buffer[outpos++] = alphabet[(cp >>  0) & 15];
	};
	return function(string, buffer, options) {
		let inpos = 0;
		let outpos = 0;
		const inlen = string.length;
		const outlen = buffer.byteLength;
		while (inpos < inlen) {
			const cp = string.codePointAt(inpos);
			if (cp == 0x5C) {
				if (outpos + 2 > outlen) break;
				buffer[outpos++] = 0x5C;
				buffer[outpos++] = 0x5C;
				inpos++;
			} else if (cp <= 0x7F) {
				if (outpos >= outlen) break;
				buffer[outpos++] = cp;
				inpos++;
			} else if (cp <= 0xFF) {
				if (outpos + 4 > outlen) break;
				writeOct(buffer, outpos, cp);
				outpos += 4;
				inpos++;
			} else if (cp > 0xFFFF) {
				if (outpos + 12 > outlen) break;
				writeHex(buffer, outpos+0, string.charCodeAt(inpos+0));
				writeHex(buffer, outpos+6, string.charCodeAt(inpos+1));
				outpos += 12;
				inpos += 2;
			} else if (cp < 0xD800 || cp > 0xDFFF) {
				if (outpos + 6 > outlen) break;
				writeHex(buffer, outpos, cp);
				outpos += 6;
				inpos++;
			} else {
				if (outpos + 6 > outlen) break;
				writeHex(buffer, outpos, 0xFFFD);
				outpos += 6;
				inpos++;
			}
		}
		return {'read': inpos, 'written': outpos};
	};
}

CharsetEncoder.register('x-us-ascii-non-lossy', [], 6, {encodeInto: nonLossyASCIIEncodeFn()});

if (module) {
	module.exports = {
		'CharsetDecoder': CharsetDecoder,
		'CharsetEncoder': CharsetEncoder,
		'require': function(cs) { module.require('./charsets/' + cs); }
	};
}

if (window) {
	window.CharsetDecoder = CharsetDecoder;
	window.CharsetEncoder = CharsetEncoder;
}

})(((typeof module === 'object') ? module : null), ((typeof window === 'object') ? window : null));