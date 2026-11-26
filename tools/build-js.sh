#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/js"
rm -rf charsets/*.js
rm -rf trmaps/*.js

cd "$REPO_ROOT/tools"
python3 gen-js.py
python3 trmapgen-js.py
node verify-js.js
