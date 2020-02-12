import { App } from '@aws-cdk/core';
import { HelloKube } from './hello';
import * as path from 'path';
import * as fs from 'fs';

test('snapshot', () => {
  const app = new App();
  const chart = new HelloKube(app, 'hello');
  const asm = app.synth();

  const manifest = fs.readFileSync(path.join(asm.directory, chart.manifestFile), 'utf-8');
  expect(manifest).toMatchSnapshot();
});