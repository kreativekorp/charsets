# Character Encodings

This repository contains mapping tables for and implementations of various character encodings.

In particular, it is the home of such for those originating from 8-bit and 16-bit home computer systems, terminals, and broadcast standards of the 70s, 80s, and 90s, as investigated by the Terminals Working Group and whose characters were accepted into Unicode in the Symbols for Legacy Computing and Symbols for Legacy Computing Supplement blocks.

This repository is not to be confused with https://github.com/kreativekorp/charset, which contains additional data and tools for building the Character Encodings web site at https://www.kreativekorp.com/charset/.

## Roadmap

* `icu` - Mapping files for ICU (International Components for Unicode).

* `java` - Implementation for Java using the standard Java Service Provider Interface.

* `js` - Implementation for JavaScript. The `charset.js` library provides `CharsetDecoder` and `CharsetEncoder`, extensions of the standard `TextDecoder` and `TextEncoder` classes.

* `tables` - Mapping tables for character encodings.

* `tests` - Test cases for character encodings.

* `tidbits` - Miscellaneous interesting files.

* `tocs` - Indices of names and identifiers for character encodings.

* `tools` - Tools for developing and compiling character encodings.

* `traits` - Data files to supplement the Unicode Character Database.

* `trmaps` - Mapping tables for translation or remapping of Unicode code points.

See the `README.md` file in each directory for more details.
