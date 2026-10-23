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
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM856.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM875.txt
GLOBIGNORE=$GLOBIGNORE:../../tables/x-IBM1006.txt

java -cp charsetskk.jar \
	com.kreative.charset.test.VerifyTable \
	../../tables/*.txt -t ../../tests/*.txt
