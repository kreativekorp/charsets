#!/usr/bin/bash -e
REPO_ROOT="$(dirname "$(dirname "$(readlink -fm "$0")")")"

# Hall of Shame
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM300.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM437.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM720.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM737.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM775.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM834.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM850.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM851.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM852.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM855.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM857.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM858.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM860.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM861.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM862.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM863.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM864.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM865.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM866.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM868.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM869.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM874.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM922.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM942.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM942C.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM943.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM943C.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM948.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM949.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM949C.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM950.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM970.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM1046.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM1098.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM1133.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM1381.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM1383.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-IBM33722.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-MacDevanagari.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-MacGujarati.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-MacGurmukhi.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-bcd-*.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-big5.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-cns-11643.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-ets-300-706-g2*.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-gsm0338.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-hp-1816-1425.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-hp-roman-8.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-iso-646-*.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-iso-6937.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-iso-8859-16.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-iso-ir-68.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-kz-1048.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-smalltalk72.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-windows-932.txt'
GLOBIGNORE=$GLOBIGNORE:'../tables/x-windows-950.txt'
GLOBIGNORE=$GLOBIGNORE:'../tests/x-apple2gs.txt'
GLOBIGNORE=$GLOBIGNORE:'../tests/x-hp-1816-1425.txt'
GLOBIGNORE=$GLOBIGNORE:'../tests/x-smalltalk72.txt'
GLOBIGNORE=$GLOBIGNORE:'../tests/x-smalltalk78.txt'

cd "$REPO_ROOT/icu"
make clean
rm -rf ucm/*

cd "$REPO_ROOT/tools"
python3 gen-icu.py ../tables/*.txt

cd "$REPO_ROOT/icu"
make all

cd "$REPO_ROOT/tools"
python3 verify-icu.py ../tables/*.txt -t ../tests/*.txt
