# Character Encoding Development and Build Tools

This directory contains tools used to work with and generate code from files in the `tables` directory. The tools in this directory are not intended to be used to perform encoding and decoding of text in production.

The most important of these tools are:

* `tablint.py` - Validates files in the `tables` directory.

* `gen-icu.py` - Generates UCM files for use by ICU (International Components for Unicode).

* `gen-java.py` - Generates Java source files for the `com.kreative.charset` package (in the `java` directory).

* `gen-js.py` - Generates JavaScript source files for the `charsets.js` library (in the `js` directory).

* `verify-icu.py` - Verifies the behavior of character encodings under `uconv` against the original mapping tables.

* `verify-js.js` - Verifies the behavior of character encodings under `charsets.js` against the original mapping tables.

* `build-icu.sh` - Runs `gen-icu.py`, compiles the generated UCM files to CNV files, then runs `verify-icu.py`.

* `build-java.sh` - Runs `gen-java.py`, compiles the `com.kreative.charset` package, creates `charsetskk.jar`, then runs `com.kreative.charset.test.VerifyTable` to verify the behavior of character encodings under Java against the original mapping tables.

* `build-js.sh` - Runs `gen-js.py`, then runs `verify-js.js`.

* `trmaplint.py` - Validates files in the `trmaps` directory.

* `emojidata.js` and `emojidata.py` - Libraries for retrieving emoji-related character properties.

* `largetype.py` - Generates "large type" renderings of standard input or command line arguments.

