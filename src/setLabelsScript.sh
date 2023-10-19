#!/bin/bash

TESTING_MODE_INPUT="$1"
if [ TESTING_MODE_INPUT = "true" ]
then
  echo labels="auto-approve" >> $GITHUB_OUTPUT
else
  echo "SUMU WHY"
  echo $TESTING_MODE_INPUT
  # echo labels="" >> $GITHUB_OUTPUT
fi