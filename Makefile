
ANTLRDIR=/usr/local/Cellar/antlr/4.5
ANTLRLIB=$(ANTLRDIR)/antlr-4.5-complete.jar
ANTLR=$(ANTLRDIR)/bin/antlr4
GRUN=$(ANTLRDIR)/bin/grun

all: testgrammar parser

parser: pddl.g4
	mkdir -p parser && \
	$(ANTLR) -Dlanguage=Python3 -o parser pddl.g4

testgrammar: pddl.g4
	mkdir -p tmp && \
	$(ANTLR) -o tmp pddl.g4 && \
	cd tmp && javac *.java && \
	$(GRUN) pddl domain -tree ../domain-01.pddl

