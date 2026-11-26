(function(module,window){

class CharacterTranslator {
	static #minimize(name) {
		name = String(name).replaceAll(/[^A-Za-z0-9]+/g, '-');
		return name.replaceAll(/^-|-$/g, '').toLowerCase();
	}
	static #trmapList = [];
	static #trmapMap = {};
	#maxChars = 0;
	#inputMap = {};
	#outputMap = {};
	constructor(inputMaps, outputMaps) {
		for (const inputName of inputMaps) {
			const trmap = CharacterTranslator.#trmapMap[CharacterTranslator.#minimize(inputName)];
			if (!trmap) throw new RangeError("CharacterTranslator constructor: The given map '" + inputName + "' is not supported.");
			if (trmap.maxChars > this.#maxChars) this.#maxChars = trmap.maxChars;
			for (const key in trmap.charsToId) {
				if (this.#inputMap[key]) throw new RangeError("CharacterTranslator constructor: The given map '" + inputName + "' conflicts with another given map.");
				this.#inputMap[key] = trmap.charsToId[key];
			}
		}
		for (const outputName of outputMaps) {
			const trmap = CharacterTranslator.#trmapMap[CharacterTranslator.#minimize(outputName)];
			if (!trmap) throw new RangeError("CharacterTranslator constructor: The given map '" + outputName + "' is not supported.");
			for (const key in trmap.idToChars) {
				if (this.#outputMap[key]) throw new RangeError("CharacterTranslator constructor: The given map '" + outputName + "' conflicts with another given map.");
				this.#outputMap[key] = trmap.idToChars[key];
			}
		}
	}
	translate(string) {
		string = String(string);
		let inpos = 0;
		const inlen = string.length;
		let output = '';
		while (inpos < inlen) {
			let n = this.#maxChars;
			for (;;) {
				const s = string.substring(inpos, inpos + n);
				const k = this.#inputMap[s];
				if (k) {
					output += (this.#outputMap[k] || '\uFFFD');
					inpos += n;
					break;
				}
				if (--n) continue;
				output += string.substring(inpos, inpos + 1);
				inpos++;
				break;
			}
		}
		return output;
	}
	static availableMaps() {
		const names = [];
		for (const trmap of CharacterTranslator.#trmapList) names.push(trmap.name);
		return names;
	}
	static getDescription(name) {
		const key = CharacterTranslator.#minimize(name);
		const trmap = CharacterTranslator.#trmapMap[key];
		return trmap && trmap.description || null;
	}
	static register(trmap) {
		const key = CharacterTranslator.#minimize(trmap.name);
		if (!key) throw new RangeError('CharacterTranslator register: Attempt to register a map with an empty name.');
		const maxChars = Number(trmap.maxChars) || 0;
		if (maxChars < 1) throw new RangeError('CharacterTranslator register: Invalid maximum characters: ' + maxChars);
		if (CharacterTranslator.#trmapMap[key]) {
			throw new RangeError("CharacterTranslator register: The given map '" + trmap.name + "' is already registered.");
		} else {
			CharacterTranslator.#trmapMap[key] = trmap;
			CharacterTranslator.#trmapList.push(trmap);
		}
	}
}

if (module) {
	module.exports = {
		'CharacterTranslator': CharacterTranslator,
		'require': function(name) { module.require('./trmaps/' + name); }
	};
}

if (window) {
	window.CharacterTranslator = CharacterTranslator;
}

})(((typeof module === 'object') ? module : null), ((typeof window === 'object') ? window : null));