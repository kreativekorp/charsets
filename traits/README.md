# Character Properties

This directory contains data files for character properties not included in the standard Unicode Character Database. These properties may be particularly useful for processing text from legacy computer systems.

The files in this directory are in the Unicode Unihan Database format.

The properties include:

* `kEmojiStyle` - The emoji style equivalent of a text style character. Provides for the equivalent of adding U+FE0F to a character with an emoji variation sequence in `emoji-variation-sequences.txt`.

* `kTextStyle` - The text style equivalent of an emoji style character. Provides for the equivalent of adding U+FE0E to a character with an emoji variation sequence in `emoji-variation-sequences.txt`.

* `kLargeType` - The "large type pieces" used to compose a glyph for a character using the HP 2640 series "large type" character set according to the original reference manual. Property values are a sequence of Unicode code points given in order from top to bottom, left to right. The `largetype.py` tool uses this file to render large type glyphs from standard input or command line arguments.

* `kReverseVideo` - The "inverse video" or "reverse video" equivalent of a Unicode character, where available. Normally, reverse video is considered out of scope for plain text and therefore the responsibility of a higher-level protocol, such as the ISO 6429 escape sequences SGR 7 ("negative image") and SGR 27 ("positive image"). However, some inverse video characters have been encoded either as part of a collection of characters from beyond a legacy platform's usual mechanism for reverse video (e.g. U+25D8 INVERSE BULLET and U+25D9 INVERSE WHITE CIRCLE from the IBM PC or U+1FBB1 INVERSE CHECK MARK from the Apple II) or as a consequence of its definition as a block element (e.g. U+2580 UPPER HALF BLOCK is the inverse video equivalent of U+2584 LOWER HALF BLOCK and vice versa). Notably absent are any NEGATIVE SQUARED characters: these are not considered inverse video as their glyphs usually include a margin and rounded corners, unlike true inverse video glyphs which fill the entire character cell.
