.PHONY: build clean

build:
	javac -sourcepath src -cp lib/junit-4.11.jar -d build/classes/ src/cplx/Complex.java
	javac -sourcepath test -cp lib/junit-4.11.jar:build/classes -d build/test/classes test/cplx/ComplexTest.java
	java -classpath lib/junit-4.11.jar:build/classes/cplx:build/test/classes org.junit.runner.JUnitCore cplx.ComplexTest

clean:
	rm -rf build/classes/*
	rm -rf test/classes/*
