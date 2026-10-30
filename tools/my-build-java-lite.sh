#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/java/Charsets"
make

for i in `locate charsetskk.jar`; do
	if [ "$(stat -L -c %d:%i "$i")" != "$(stat -L -c %d:%i charsetskk.jar)" ]; then
		cp charsetskk.jar "$i"
	fi
done
