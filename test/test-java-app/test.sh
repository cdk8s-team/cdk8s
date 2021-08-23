#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)
cd $(mktemp -d)
mkdir test && cd test

# hidden files should be ignored
touch .foo
mkdir .bar

# check version
echo cdk8s-cli version: $(cdk8s --version)

# initialize an empty project
cdk8s init java-app

# put some code in it
rm src/main/java/com/mycompany/app/Main.java
cp -r ${scriptdir}/src .

# build
mvn compile
cdk8s synth

# show output
diff dist ${scriptdir}/expected

echo "PASS"