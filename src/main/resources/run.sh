#!/bin/sh

USER_ARGS=""

COMPILATION_CLASSPATH=`find -L . -maxdepth 1 -name "*.jar" -type f -exec printf :{} ';'`

#java $JAVA_OPTS $USER_ARGS -cp $COMPILATION_CLASSPATH io.gatling.app.Gatling -s MySimulation

java -cp $COMPILATION_CLASSPATH io.gatling.app.Gatling -s MySimulation