#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)
cd $(mktemp -d)
mkdir test && cd test

# import match_snapshot function
source ${scriptdir}/../common.sh

# hidden files should be ignored
touch .foo
mkdir .bar

# check versions
echo cdk8s-cli version: $(cdk8s --version)
echo go version: $(go version)

# initialize an empty project
cdk8s init go-app

# put some code in it
cp ${scriptdir}/main.go .

# build
cdk8s synth

# show output
cat dist/test.k8s.yaml
match_snapshot dist ${scriptdir}/expected

echo "PASS"