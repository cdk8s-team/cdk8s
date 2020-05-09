#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language python

cdk8s import --language python

# Exclude the .tgz files because their headers differ
# because they were zipped at different times.
diff -r --exclude=*.tgz imports ${scriptdir}/expected-from-config

rm -rf imports

cdk8s import mattermost_crd.yaml --language python

diff -r --exclude=*.tgz imports ${scriptdir}/expected-from-cli

rm -rf imports

echo "PASS"