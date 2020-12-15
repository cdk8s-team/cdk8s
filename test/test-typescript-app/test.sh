#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

# hidden files should be ignored
touch .foo
mkdir .bar

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
diff --strip-trailing-cr dist ${scriptdir}/expected

echo "PASS"
