SRCFILES := $(shell find src -name \*.java)
RESFILES := $(shell find src -type f \! -name .\* \! -name \*.java | sed s/^src\\///)
PACKAGES := $(shell find src -name \*.java | sed -E s/^src\\/\|\\/[^\\/]+$$//g | grep -v \\.java$$ | sort | uniq | tr / .)

all: clean bin doc charsetskk.jar

eclipseall: eclipseclean charsetskk.jar

clean:
	rm -rf bin
	rm -rf doc
	rm -rf *.jar
	rm -rf dist
	rm -rf *.jmod
	rm -rf mods
	rm -rf com.kreative.charset

eclipseclean:
	rm -rf *.jar
	rm -rf dist
	rm -rf *.jmod
	rm -rf mods
	rm -rf com.kreative.charset

bin: src
	mkdir -p bin
ifeq ($(origin JAVACFLAGS), undefined)
	$(eval JAVACFLAGS = $(shell dep/minJavaVerOpts))
endif
	javac $(JAVACFLAGS) -sourcepath src $(SRCFILES) -d bin
	$(foreach res,$(RESFILES),cp src/$(res) bin/$(res);)

doc: src
	mkdir -p doc
	javadoc $(JAVADOCFLAGS) -sourcepath src $(PACKAGES) -d doc

charsetskk.jar: bin
	export COPYFILE_DISABLE=true
	find bin -name .DS_Store -delete
	rm -rf dist
	mkdir -p dist/META-INF/services
	cp dep/java.nio.charset.spi.CharsetProvider dist/META-INF/services/
	jar cmf dep/MANIFEST.MF charsetskk.jar -C dist META-INF -C bin com/kreative/charset
	rm -rf dist

com.kreative.charset.jmod: src
	export COPYFILE_DISABLE=true
	find src -name .DS_Store -delete
	rm -rf mods
	rm -rf com.kreative.charset
	cp -Rf src com.kreative.charset
	cp dep/module-info.txt com.kreative.charset/module-info.java
	javac --module-source-path . $(shell find com.kreative.charset -name \*.java) -d mods
	jmod create --class-path mods/com.kreative.charset com.kreative.charset.jmod
	rm -rf com.kreative.charset
	rm -rf mods

.PHONY: all eclipseall clean eclipseclean
