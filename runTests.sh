#!/bin/bash
rm -rf *.class
javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . test/*.java
java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* TestRunner