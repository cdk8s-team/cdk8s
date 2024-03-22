#!/bin/bash

TESTING_MODE_INPUT="$1"
if [ $TESTING_MODE_INPUT = "false" ]
then
  echo "testingMode = false, 'auto-approve' label should be added"
  echo labels="auto-approve" >> $GITHUB_OUTPUT
else
  echo "testingMode = true, no labels should be added"
  echo labels="" >> $GITHUB_OUTPUT
fi