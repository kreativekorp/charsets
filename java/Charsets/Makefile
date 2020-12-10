SRCFILES := $(shell find src -name \*.java)
PACKAGES := $(shell find src -name \*.java | sed -E s/^src\\/\|\\/[^\\/]+$$//g | sort | uniq | tr / .)

all: clean bin doc charsetskk.jar

eclipseall: eclipseclean charsetskk.jar

clean:
	rm -rf bin
	rm -rf doc
	rm -rf *.jar
	rm -rf dist

eclipseclean:
	rm -rf *.jar
	rm -rf dist

bin: src
	mkdir -p bin
	javac -sourcepath src $(SRCFILES) -d bin

doc: src
	mkdir -p doc
	javadoc -sourcepath src $(PACKAGES) -d doc

charsetskk.jar: bin
	export COPYFILE_DISABLE=true
	find bin -name .DS_Store -delete
	rm -rf dist
	mkdir -p dist/META-INF/services
	cp dep/java.nio.charset.spi.CharsetProvider dist/META-INF/services/
	jar cmf dep/MANIFEST.MF charsetskk.jar -C dist META-INF -C bin com/kreative/charset
	rm -rf dist

.PHONY: all eclipseall clean eclipseclean
