#!/usr/bin/env node

const fs = require('node:fs');
const path = require('node:path');
const emojidata = require('./emojidata');
const charsets = require('../js/charsets');
charsets.require('all');

const CODE_POINT = /\bU\+(([1-9A-F]|10)?[0-9A-F]{4})\b/g;
const BYTES_TO_CHARS = /^0x(([0-9A-F]{2})+)\s+U((\+([1-9A-F]|10)?[0-9A-F]{4})+)$/;
const CHARS_TO_BYTES = /^U((\+([1-9A-F]|10)?[0-9A-F]{4})+)\s+0x(([0-9A-F]{2})+)$/;
const ERROR = '\x1B[1;31mERROR:\x1B[0m';
const WARN = '\x1B[1;33mWARN:\x1B[0m';
const OK = '\x1B[1;32mOK\x1B[0m';
const ALL_OK = '\x1B[1;32mALL OK\x1B[0m';

function extractEmoji(codePoints) {
	const emoji = [];
	for (let i = 0; i < codePoints.length; i++) {
		if (emojidata.EMOJI_WITH_VARIATION_SEQUENCES.includes(codePoints[i])) {
			if (i+1 < codePoints.length) {
				if (codePoints[i+1] == emojidata.EMOJI_STYLE) {
					emoji.push(codePoints[i]);
					continue;
				}
				if (codePoints[i+1] == emojidata.TEXT_STYLE) {
					continue;
				}
			}
		}
		if (emojidata.EMOJI_PRESENTATION.includes(codePoints[i])) {
			emoji.push(codePoints[i]);
		}
	}
	return emoji;
}

function emojiToText(codePoint) {
	if (emojidata.EMOJI_TO_TEXT_VARIANT[codePoint]) {
		return [emojidata.EMOJI_TO_TEXT_VARIANT[codePoint]];
	}
	if (emojidata.EMOJI_WITH_VARIATION_SEQUENCES.includes(codePoint)) {
		return [codePoint, emojidata.TEXT_STYLE];
	}
	return null;
}

function hexToBytes(hex) {
	const b = [];
	for (let i = 0; i < hex.length; i += 2) {
		const bs = hex.substring(i, i + 2);
		b.push(parseInt(bs, 16) & 0xFF);
	}
	return b;
}

function hexToChars(hex) {
	const c = [];
	for (const cs of hex.split('+')) {
		c.push(parseInt(cs, 16));
	}
	return c;
}

function bytesToHex(bytes, delimiter='') {
	const s = [];
	for (const b of bytes) {
		let h = Number(b).toString(16).toUpperCase();
		while (h.length < 2) h = '0' + h;
		s.push(h);
	}
	return s.join(delimiter);
}

function charsToHex(chars, delimiter='+') {
	const s = [];
	for (const c of chars) {
		let h = Number(c).toString(16).toUpperCase();
		while (h.length < 4) h = '0' + h;
		s.push(h);
	}
	return s.join(delimiter);
}

function stringToChars(s) {
	const cps = [];
	for (let i = 0; i < s.length; i++) {
		const cp = s.codePointAt(i);
		if (cp > 0xFFFF) i++;
		cps.push(cp);
	}
	return cps;
}

function verifyLines(lines, charset, roundTrip) {
	const allowedEmoji = {};
	const bytesToChars = {};
	const charsToBytes = {};
	const puaChars = {};
	let ok = true;
	for (let line of lines) {
		const o = line.indexOf('#');
		const comment = (o < 0) ? '' : line.substring(o + 1).trim();
		line = (o < 0) ? line.trim() : line.substring(0, o).trim();
		if (comment.startsWith('Allow-Emoji:')) {
			let m; while ((m = CODE_POINT.exec(comment))) {
				const cp = parseInt(m[1], 16);
				allowedEmoji[cp] = cp;
			}
		}
		if (!line) continue;
		const bm = BYTES_TO_CHARS.exec(line);
		if (bm) {
			const bs = hexToBytes(bm[1]);
			const cps = hexToChars(bm[3].substring(1));
			if (roundTrip) {
				for (const emoji of extractEmoji(cps)) {
					if (allowedEmoji[emoji]) continue;
					const text = emojiToText(emoji);
					if (text) {
						console.log(
							'  ' + WARN + ' Mapping 0x' + bm[1] + ' -> U' + bm[3] +
							' contains emoji U+' + charsToHex([emoji]) + ';' +
							' suggested replacement: U+' + charsToHex(text)
						);
					} else {
						console.log(
							'  ' + WARN + ' Mapping 0x' + bm[1] + ' -> U' + bm[3] +
							' contains emoji U+' + charsToHex([emoji])
						);
					}
				}
			}
			for (const cp of cps) {
				if (roundTrip && cp >= 0xD800 && cp <= 0xDFFF) {
					console.log('  ' + ERROR + ' Use of UTF-16 surrogate in character sequence U' + bm[3]);
					ok = false;
				}
				if ((cp >= 0xE000 && cp <= 0xF8FF) || cp >= 0xF0000) {
					puaChars[cp] = cp;
				}
			}
			if (bytesToChars[bs]) {
				console.log('  ' + ERROR + ' Duplicate mapping for byte sequence 0x' + bm[1]);
				ok = false;
			} else {
				bytesToChars[bs] = cps;
				try {
					const expected = String.fromCodePoint.apply(String, cps);
					const actual = new charsets.CharsetDecoder(charset).decode(new Uint8Array(bs));
					if (actual !== expected) {
						console.log('  ' + ERROR + ' Decode failed for byte sequence 0x' + bm[1]);
						console.log(
							'  * Got: ' + charsToHex(stringToChars(actual)) +
							' * Want: ' + charsToHex(stringToChars(expected))
						);
						ok = false;
					}
				} catch (error) {
					console.log('  ' + ERROR + ' Decode failed for byte sequence 0x' + bm[1]);
					console.log('  * ' + error);
					ok = false;
				}
			}
			continue;
		}
		const cm = CHARS_TO_BYTES.exec(line);
		if (cm) {
			const cps = hexToChars(cm[1].substring(1));
			const bs = hexToBytes(cm[4]);
			for (const cp of cps) {
				if (roundTrip && cp >= 0xD800 && cp <= 0xDFFF) {
					console.log('  ' + ERROR + ' Use of UTF-16 surrogate in character sequence U' + cm[1]);
					ok = false;
				}
				if ((cp >= 0xE000 && cp <= 0xF8FF) || cp >= 0xF0000) {
					puaChars[cp] = cp;
				}
			}
			if (charsToBytes[cps]) {
				console.log('  ' + ERROR + ' Duplicate mapping for character sequence U' + cm[1]);
				ok = false;
			} else {
				charsToBytes[cps] = bs;
				try {
					const expected = new Uint8Array(bs);
					const string = String.fromCodePoint.apply(String, cps);
					const actual = new charsets.CharsetEncoder(charset).encode(string);
					if (String(actual) !== String(expected)) {
						console.log('  ' + ERROR + ' Encode failed for character sequence U' + cm[1]);
						console.log('  * Got: ' + bytesToHex(actual) + ' * Want: ' + bytesToHex(expected));
						ok = false;
					}
				} catch (error) {
					console.log('  ' + ERROR + ' Encode failed for character sequence U' + cm[1]);
					console.log('  * ' + error);
					ok = false;
				}
			}
			continue;
		}
		console.log('  ' + ERROR + ' Syntax error in line: ' + line);
		ok = false;
	}
	if (roundTrip) {
		const charOutputs = Object.values(bytesToChars);
		if (!charOutputs.length) {
			console.log('  ' + ERROR + ' No byte sequences mapped to any character sequences');
			ok = false;
		}
		const byteOutputs = Object.values(charsToBytes);
		if (!byteOutputs.length) {
			console.log('  ' + ERROR + ' No character sequences mapped to any byte sequences');
			ok = false;
		}
		for (const cbs of byteOutputs) {
			const ccs = bytesToChars[cbs];
			const rbs = charsToBytes[ccs];
			if (String(cbs) != String(rbs)) {
				const cbss = (cbs && cbs.length) ? ('0x' + bytesToHex(cbs)) : 'unmapped';
				const rbss = (rbs && rbs.length) ? ('0x' + bytesToHex(rbs)) : 'unmapped';
				console.log('  ' + ERROR + ' Failed to roundtrip ' + cbss + '; returned as ' + rbss);
				ok = false;
			}
		}
		for (const ccs of charOutputs) {
			const cbs = charsToBytes[ccs];
			const rcs = bytesToChars[cbs];
			if (String(ccs) != String(rcs)) {
				const ccss = (ccs && ccs.length) ? ('U' + charsToHex(ccs)) : 'unmapped';
				const rcss = (rcs && rcs.length) ? ('U' + charsToHex(rcs)) : 'unmapped';
				console.log('  ' + ERROR + ' Failed to roundtrip ' + ccss + '; returned as ' + rcss);
				ok = false;
			}
		}
	}
	const puaCharArray = Object.keys(puaChars);
	if (puaCharArray.length) {
		puaCharArray.sort((a,b) => a - b);
		console.log('  PUA ' + charsToHex(puaCharArray, ' '));
	}
	if (ok) {
		console.log(
			'  ' + OK +
			' ' + Object.keys(bytesToChars).length +
			' ' + Object.keys(charsToBytes).length
		);
	}
	return ok;
}

function verifyFile(file, charset, roundTrip) {
	const contents = fs.readFileSync(file, 'UTF-8');
	const lines = contents.split(/\r\n|\r|\n/).filter(line => line);
	if (lines.length == 1 && lines[0].startsWith('./') && lines[0].endsWith('.txt')) {
		console.log('  -> ' + lines[0]);
		const dpath = path.join(path.dirname(file), lines[0].substring(2));
		return verifyFile(dpath, charset, roundTrip);
	} else {
		return verifyLines(lines, charset, roundTrip);
	}
}

function verify(file, charset, roundTrip) {
	if (fs.lstatSync(file).isDirectory()) {
		let ok = true;
		const children = fs.readdirSync(file);
		children.sort((a,b) => a.localeCompare(b));
		for (const child of children) {
			if (child.startsWith('.') || child.endsWith('\r')) continue;
			const cpath = path.join(file, child);
			if (fs.lstatSync(cpath).isDirectory() || child.endsWith('.txt')) {
				if (!verify(cpath, charset, roundTrip)) {
					ok = false;
				}
			}
		}
		return ok;
	} else {
		const name = path.basename(file);
		console.log(name);
		try {
			return verifyFile(file, (charset || (
				name.endsWith('.txt') ?
				name.substring(0, name.length - 4) :
				name
			)), roundTrip);
		} catch (error) {
			console.log('  ' + ERROR + ' ' + error);
		}
	}
}

function main(argv) {
	let parseOpts = true;
	let charset = null;
	let roundTrip = true;
	let ok = true;
	let argi = 2;
	if (argi < argv.length) {
		while (argi < argv.length) {
			const arg = argv[argi++];
			if (parseOpts && arg.startsWith('-')) {
				if (arg === '--') {
					parseOpts = false;
				} else if (arg === '-c' && argi < argv.length) {
					charset = argv[argi++];
				} else if (arg === '-C') {
					charset = null;
				} else if (arg === '-t') {
					roundTrip = false;
				} else if (arg === '-T') {
					roundTrip = true;
				} else {
					console.log(ERROR + ' Unknown option: ' + arg);
					ok = false;
				}
			} else if (!verify(arg, charset, roundTrip)) {
				ok = false;
			}
		}
	} else {
		const ok1 = verify(path.join(__dirname, '..', 'tables'), null, true);
		const ok2 = verify(path.join(__dirname, '..', 'tests'), null, false);
		ok = ok1 && ok2;
	}
	if (ok) console.log(ALL_OK);
}

main(process.argv);