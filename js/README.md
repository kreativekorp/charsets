# charsets.js

The charsets.js library provides the `CharsetDecoder` and `CharsetEncoder` classes, which extend the standard `TextDecoder` and `TextEncoder` classes with support for additional character encodings. It can be loaded as a module in NodeJS or as an external script in the browser.

The charsets.js library not only supports all character encodings supported by `TextDecoder` and `TextEncoder`, but also provides its own implementations of other character encodings and can be extended by loading additional external files.

| Name                   | Decoder          | Encoder                    |
| ---------------------- | ---------------- | -------------------------- |
| `utf-8`                | `TextDecoder`    | `TextEncoder`              |
| `utf-16be`             | `TextDecoder`    | `CharsetEncoder`           |
| `utf-16le`             | `TextDecoder`    | `CharsetEncoder`           |
| `utf-32be`             | `CharsetDecoder` | `CharsetEncoder`           |
| `utf-32le`             | `CharsetDecoder` | `CharsetEncoder`           |
| `CESU-8`               | `CharsetDecoder` | `CharsetEncoder`           |
| `x-us-ascii-non-lossy` | `CharsetDecoder` | `CharsetEncoder`           |
| `ibm866`               | `TextDecoder`    | `x-IBM866.js` †            |
| `iso-8859-2`           | `TextDecoder`    | `x-iso-8859-2.js` †        |
| `iso-8859-3`           | `TextDecoder`    | `x-iso-8859-3.js` †        |
| `iso-8859-4`           | `TextDecoder`    | `x-iso-8859-4.js` †        |
| `iso-8859-5`           | `TextDecoder`    | `x-iso-8859-5.js` †        |
| `iso-8859-6`           | `TextDecoder`    | `x-iso-8859-6.js` †        |
| `iso-8859-7`           | `TextDecoder`    | `x-iso-8859-7.js` †        |
| `iso-8859-8`           | `TextDecoder`    | `x-iso-8859-8.js` †        |
| `iso-8859-8-i`         | `TextDecoder`    | `x-iso-8859-8.js` †        |
| `iso-8859-10`          | `TextDecoder`    | `x-iso-8859-10.js` †       |
| `iso-8859-13`          | `TextDecoder`    | `x-iso-8859-13.js` †       |
| `iso-8859-14`          | `TextDecoder`    | `x-iso-8859-14.js` †       |
| `iso-8859-15`          | `TextDecoder`    | `x-iso-8859-15.js` †       |
| `iso-8859-16`          | `TextDecoder`    | `x-iso-8859-16.js` †       |
| `koi8-r`               | `TextDecoder`    | `x-koi8-r.js` †            |
| `koi8-u`               | `TextDecoder`    | `x-koi8-u.js` †            |
| `macintosh`            | `TextDecoder`    | `x-MacRoman-1999.js` †     |
| `windows-874`          | `TextDecoder`    | `x-windows-874.js` †       |
| `windows-1250`         | `TextDecoder`    | `x-windows-1250.js` †      |
| `windows-1251`         | `TextDecoder`    | `x-windows-1251.js` †      |
| `windows-1252`         | `TextDecoder`    | `x-windows-1252.js` †      |
| `windows-1253`         | `TextDecoder`    | `x-windows-1253.js` †      |
| `windows-1254`         | `TextDecoder`    | `x-windows-1254.js` †      |
| `windows-1255`         | `TextDecoder`    | `x-windows-1255.js` †      |
| `windows-1256`         | `TextDecoder`    | `x-windows-1256.js` †      |
| `windows-1257`         | `TextDecoder`    | `x-windows-1257.js` †      |
| `windows-1258`         | `TextDecoder`    | `x-windows-1258.js` †      |
| `x-mac-cyrillic`       | `TextDecoder`    | `x-MacCyrillic-1999.js` †  |
| `gbk`                  | `TextDecoder`    |                            |
| `gb18030`              | `TextDecoder`    |                            |
| `big5`                 | `TextDecoder`    | `x-big5.js` †              |
| `euc-jp`               | `TextDecoder`    |                            |
| `iso-2022-jp`          | `TextDecoder`    |                            |
| `shift_jis`            | `TextDecoder`    | `x-shift-jis-generic.js` † |
| `euc-kr`               | `TextDecoder`    |                            |
| `x-user-defined`       | `TextDecoder`    |                            |

† Available under another name by loading an external file. May not exactly match the `TextDecoder` implementation.
