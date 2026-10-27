#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/java/Charsets"
rm -rf src/com/kreative/charset/generated

cd "$REPO_ROOT/tools"
python3 gen-java.py

cd "$REPO_ROOT/java/Charsets"
make

for i in `locate charsetskk.jar`; do
	if [ "$(stat -L -c %d:%i "$i")" != "$(stat -L -c %d:%i charsetskk.jar)" ]; then
		cp charsetskk.jar "$i"
	fi
done

# Some of Java's Mac encodings are older versions and we can't override them.
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacCroatian.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacCyrillic.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacGreek.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacSymbol.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacThai.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-MacTurkish.txt

# Some of Java's IBM encodings use different mappings as well.
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM856.txt # -generic has MACRON and MIDDLE DOT; Java has OVERLINE and BULLET
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM875.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM970.txt # Java lacks a mapping from 0xA2C1 to U+2299 needed for round-trip
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1006.txt # A bunch of disagreements about Arabic presentation forms
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1025.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1112.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1122.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1123.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1166.txt # -generic maintains LINE FEED vs NEXT LINE; Java unifies them
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1383.txt # Java maps U+F83D and U+F83E to byte sequences that don't round-trip
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM33722.txt # Java lacks a mapping from 0xA2C3 to U+FFE4 needed for round-trip

java -cp charsetskk.jar \
	com.kreative.charset.test.VerifyTable \
	../../tables/*.txt -t ../../tests/*.txt
