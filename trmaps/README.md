# Character Translation Maps

This directory contains mappings from Unicode code points to character or character sequence identifiers and vice versa, used to perform translation or remapping, e.g. between Unicode characters and ASCII-based transcription schemes, or between characters in the Private Use Area and characters in Unicode proper (useful for converting legacy data once a script has been accepted for encoding).

Files in this directory are plain text files. Non-empty, non-comment lines must match one of three patterns:

To indicate that a Unicode code point is unmapped:

	U(\+([1-9A-F]|10)?[0-9A-F]{4})+\s+\?

To map a Unicode code point to an identifier:

	U(\+([1-9A-F]|10)?[0-9A-F]{4})+\s+([0-9A-Za-z_]+)

To map an identifier to a Unicode code point:

	([0-9A-Za-z_]+)\s+U(\+([1-9A-F]|10)?[0-9A-F]{4})+

Both directions must be stated explicitly.

The `trmaplint.py` tool will check these files for syntax, duplicate mappings, and round-tripping, but will not actually perform any translation or remapping.
