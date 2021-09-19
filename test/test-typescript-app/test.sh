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

# check version
echo cdk8s-cli version: $(cdk8s --version)

# initialize an empty project
cdk8s init typescript-app

# the init will create the placeholder test and run it, creating a snapshot
# which will cause errors later. So removing that snapshot...
rm -rf __snapshots__

# put some code in it
cp ${scriptdir}/main.ts .
cp ${scriptdir}/main.test.ts .

# build
yarn compile && yarn test -u && yarn synth

# show output
match_snapshot dist ${scriptdir}/expected

echo "PASS"
