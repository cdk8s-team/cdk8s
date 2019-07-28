import fs = require('fs');
import path = require('path');
import { Stack } from '../lib';
import { App } from '@aws-cdk/core';

const YAML = require('yaml');

export function synth(stack: Stack) {
  const app = stack.node.root as App;
  const assembly = app.synth();
  const filePath = path.join(assembly.directory, stack.assemblyFileName);
  return YAML.parseAllDocuments(fs.readFileSync(filePath, 'utf-8'));
}