#!/bin/bash

ANTLR_PATH="../lib/antlr-3.5-complete.jar";
JUNIT_PATH="../lib/junit.jar";
MAIN_CLASS_NAME="columbia.plt.tt.interpreter.TTMain";


if [ -z "$1" ]
then
	echo "Usage : TT <AbsoluteFilePath>";
	exit 1;
else
	fileName=$1;
fi

echo "Interpreting : ${fileName}"
cd $PWD/classes/ ;

java  -cp .:$ANTLR_PATH:$JUNIT_PATH $MAIN_CLASS_NAME $fileName




