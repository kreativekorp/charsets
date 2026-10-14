# Legacy Computing Character Encoding Tables

This directory contains text files describing character encodings originating from legacy computers.

Unlike the Format A mapping tables provided by Unicode and others, these text files have a well-defined syntax and provide mappings both from the legacy encoding to Unicode and from Unicode to the legacy encoding.

The file name (without the .txt extension) is always used as the canonical identifier for the encoding described therein. Each line (not including comments) must match the pattern `^0x([0-9A-F]{2})+\s+U(\+([1-9A-F]|10)?[0-9A-F]{4})+$` to map a byte sequence to a character sequence, or the pattern `^U(\+([1-9A-F]|10)?[0-9A-F]{4})+\s+0x([0-9A-F]{2})+$` to map a character sequence to a byte sequence. Both directions must be stated explicitly. Mappings for control characters must also be stated explicitly.

If the file consists of a single line starting with `./` and ending with `.txt`, the file's name is used as an alias for the encoding whose canonical identifier is the remaining text. (This is not an include directive; if used, it must be the only line in the file.)

The `tablint.py` tool will check these files for syntax, duplicate mappings, and round-tripping, but will not actually perform any encoding or decoding.
