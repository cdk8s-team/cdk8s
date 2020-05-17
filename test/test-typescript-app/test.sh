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

# put some code in it
cp ${scriptdir}/main.ts .
cp ${scriptdir}/main.test.ts .

# build
yarn build

# show output
diff dist ${scriptdir}/expected

echo "PASS"
