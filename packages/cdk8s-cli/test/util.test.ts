import * as path from 'path';
import * as fs from 'fs-extra';
import { synthApp } from '../src/util';

test('outdir to be created', async () => {
  await synthApp('node ../../examples/typescript/hello/index.js', __dirname);

  expect(fs.existsSync(__dirname)).toBe(true);

  fs.removeSync(path.join(__dirname, 'hello-k8s.k8s.yaml'));
});
