#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language java

for f in `find imports/*`
do
    diff -I '^@javax.annotation.Generated' $f ${scriptdir}/expected-named-from-cli/${f#*/}
done

rm -rf imports

cdk8s import --language java

for f in `find imports/*`
do
    diff -I '^@javax.annotation.Generated' $f ${scriptdir}/expected-from-config/${f#*/}
done

rm -rf imports

cdk8s import mattermost_crd.yaml --language java

for f in `find imports/*`
do
    diff -I '^@javax.annotation.Generated' $f ${scriptdir}/expected-from-cli/${f#*/}
done

rm -rf imports

echo "PASS"