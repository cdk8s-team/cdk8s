#!/bin/sh
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language java

cdk8s import --language java

# Exclude some files because their annotations differ
# because they were pacmak-ed at different times.
diff -r --exclude=*.java --exclude=*.xml --exclude=*.tgz imports ${scriptdir}/expected-from-config

rm -rf imports

cdk8s import mattermost_crd.yaml --language java

diff -r --exclude=*.java --exclude=*.xml --exclude=*.tgz imports ${scriptdir}/expected-from-cli

rm -rf imports

echo "PASS"