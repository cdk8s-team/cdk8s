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

# debug
pipenv --version

# check version
echo cdk8s-cli version: $(cdk8s --version)

# initialize an empty project
cdk8s init python-app

# put some code in it
cp ${scriptdir}/main.py .

# build
cdk8s synth

# show output
match_snapshot dist ${scriptdir}/expected

echo "PASS"