#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/tools"
python3 gen-java.py

cd "$REPO_ROOT/java/Charsets"
make

java -cp charsetskk.jar \
	com.kreative.charset.test.VerifyTable \
	../../tables/*.txt -t ../../tests/*.txt
