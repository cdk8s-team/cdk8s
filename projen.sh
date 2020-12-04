set -euo pipefail
scriptdir=$(cd $(dirname $0) && pwd)

cd ${scriptdir}

yarn add --ignore-workspace-root-check projen@0.5.10
yarn add --ignore-workspace-root-check typescript@3.9.7

${scriptdir}/node_modules/.bin/tsc -p ${scriptdir}/projen-contrib/
${scriptdir}/node_modules/.bin/tsc -p ${scriptdir}/.projenrc/

cd ${scriptdir}/.projenrc && ${scriptdir}/node_modules/.bin/projen