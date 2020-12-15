#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)
cd $(mktemp -d)
mkdir test && cd test

# hidden files should be ignored
touch .foo
mkdir .bar

# debug
pipenv --version

# initialize an empty project
cdk8s init python-app

# put some code in it
cp ${scriptdir}/main.py .

# build
cdk8s synth

# show output
diff --strip-trailing-cr dist ${scriptdir}/expected

echo "PASS"