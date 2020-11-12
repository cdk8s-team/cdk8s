#!/bin/bash
set -euo pipefail
set -x

scriptdir=$(cd $(dirname $0) && pwd)
outdir=${1:-${scriptdir}/../website/public/docs}

# resolve path
mkdir -p "${outdir}"
outdir=$(cd ${outdir} && pwd)

# repo root
cd ${scriptdir}/..

# install deps
pip3 install -r docs/requirements.txt

# stage some content from the repo
cp CHANGELOG.md docs/project/
cp CONTRIBUTING.md docs/project/
cp ROADMAP.md docs/project/

for module in cdk8s cdk8s-plus; do
  cat packages/${module}/API.md | sed "s/# API Reference/# ${module}/" > "docs/reference/${module}.md"
done

version=$(node -p "require('./lerna.json').version")
version_dir="v${version}"
mkdocs build --site-dir ${outdir}/${version_dir}

# create a redirect to the latest version
echo "<meta http-equiv='refresh' content='0; URL=${version_dir}' />" > ${outdir}/index.html
ln -s ${version_dir} ${outdir}/latest

