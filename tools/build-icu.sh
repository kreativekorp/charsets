#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

cd "$REPO_ROOT/icu"
make clean
rm -rf ucm/*

cd "$REPO_ROOT/tools"
python3 gen-icu.py

cd "$REPO_ROOT/icu"
make all
