#!/bin/bash

TESTING_MODE_INPUT="$1"
if [ $TESTING_MODE_INPUT = "false" ]
then
  echo "ok, we got here"
  echo labels="auto-approve" >> $GITHUB_OUTPUT
else
  echo "hello?"
  echo labels="" >> $GITHUB_OUTPUT
fi