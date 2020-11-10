#!/bin/bash
set -euo pipefail
set -x

scriptdir=$(cd $(dirname $0) && pwd)
outdir=${1:-}
if [ -z "${outdir}" ]; then
  echo "Usage: $0 OUTDIR"
  exit 1
fi

# resolve path
outdir=$(cd ${outdir} && pwd)

# repo root
cd ${scriptdir}/..

# install deps
deps="mkdocs mkdocs-awesome-pages-plugin mkdocs-material"
pip3 install ${deps} || pip install ${deps}

# stage some content from the repo
cp CHANGELOG.md docs/project/
cp CONTRIBUTING.md docs/project/
cp ROADMAP.md docs/project/

for module in cdk8s cdk8s-plus; do
  cat packages/${module}/API.md | sed "s/# API Reference/# ${module}/" > "docs/reference/${module}.API.md"
done

mkdocs build --site-dir $outdir
