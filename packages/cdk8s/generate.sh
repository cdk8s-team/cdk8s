#!/bin/bash
set -euo pipefail

out=lib/.generated

mkdir -p $out

gen() {
  echo -n "$1 " 
  if [ -f $out/$1.ts ]; then
    echo "skipped"
    return
  fi

  curl -s https://kubernetesjsonschema.dev/v1.13.5-standalone/$1.json > /tmp/$1.json
  npx json2ts /tmp/$1.json > $out/$1.ts
  echo "done"
}

gen deploymentspec-apps-v1
gen objectmeta-meta-v1
gen servicespec-v1
gen configmap-v1
gen horizontalpodautoscaler-autoscaling-v2beta1
gen ingressspec-extensions-v1beta1
