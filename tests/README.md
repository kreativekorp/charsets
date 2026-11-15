# Character Encoding Test Cases

This directory contains test cases for character encodings beyond the mappings given in the `tables` directory. These test cases are used to verify correct encoding and decoding of text strings as opposed to individual characters.

These text files use the same format as the text files in the `tables` directory. See the `README.md` file in that directory for details.

The file name (without the .txt extension) is used as the identifier for the encoding under test.

The `tablint.py` tool with the `-t` option will check these files for syntax and duplicate mappings, but will not actually perform the tests. The `verify-icu.py` and `verify-js.js` tools will actually perform the tests.
