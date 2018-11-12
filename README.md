Sample project for bundling up Gatling tests into an executable jar. This builds on the Gatling Maven plugin and allows the user to use Maven to bring in dependencies, but run the tests without Maven. The most interesting file here is going to be the pom.

Based on 

* https://github.com/gatling/gatling-maven-plugin-demo
* https://stackoverflow.com/questions/27893423/build-executable-jar-for-gatling-load-test

To build the jar:

	mvn clean install

To run the jar:

	chmod +x target/run.sh
	./run.sh
