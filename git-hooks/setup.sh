#!/bin/bash

##############################################
# Setup shared .git hooks for this project.
#

hooksdir="$(cd $(dirname $0) && pwd)"

git config core.hooksPath ${hooksdir}
echo "Configured core.hooksPath to ${hooksdir}"
