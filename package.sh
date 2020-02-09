#!/bin/bash
set -euo pipefail
out=$(npm pack)
rm -fr dist
mkdir -p dist/js
mv ${out} dist/js

