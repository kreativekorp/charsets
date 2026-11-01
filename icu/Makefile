all:
	for u in ucm/*.ucm; do echo "$$u..."; makeconv -d cnv "$$u" || echo 'Oh well. We tried.'; done

clean:
	rm -rf cnv/*

.PHONY: all clean
