#!/bin/bash
set -e
scriptdir=$(cd $(dirname $0) && pwd)

cd $(mktemp -d)
mkdir test && cd test

cp ${scriptdir}/cdk8s.yaml  .
cp ${scriptdir}/mattermost_crd.yaml .
cp ${scriptdir}/example_multiple_crd.yaml .

cdk8s import mattermost:=mattermost_crd.yaml --language java

diff -r <(grep -qrvE "^(javax.annotation.Generated)" imports) <(grep -qrvE "^(javax.annotation.Generated)" ${scriptdir}/expected-named-from-cli)

cdk8s import --language java

diff -r <(grep -qrvE "^(javax.annotation.Generated)" imports) <(grep -qrvE "^(javax.annotation.Generated)" ${scriptdir}/expected-from-config)

rm -rf imports

cdk8s import mattermost_crd.yaml --language java

diff -r <(grep -qrvE "^(javax.annotation.Generated)" imports) <(grep -qrvE "^(javax.annotation.Generated)" ${scriptdir}/expected-from-cli)

rm -rf imports

echo "PASS"