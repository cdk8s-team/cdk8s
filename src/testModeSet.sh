#!/bin/bash

TESTING_MODE_INPUT="$1"
echo testingMode=${TESTING_MODE_INPUT:-"true"} >> $GITHUB_ENV
# echo testingMode=${TESTING_MODE_INPUT:-"true"}