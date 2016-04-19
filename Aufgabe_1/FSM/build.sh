#! /bin/sh

DIR=/Users/gerd/Development/FSM
ANTLR=/Users/gerd/Development/antlr-4.5.3-complete.jar

java -jar $ANTLR -visitor -no-listener $1.g4
javac -cp .:$ANTLR *.java
