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
cdk8s init go-app

# put some code in it
cp ${scriptdir}/main.go .

# build
cdk8s synth

# show output
cat dist/test.k8s.yaml
diff dist ${scriptdir}/expected

echo "PASS"