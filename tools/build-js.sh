#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/js"
rm -rf charsets/*.js

cd "$REPO_ROOT/tools"
python3 gen-js.py
node verify-js.js
