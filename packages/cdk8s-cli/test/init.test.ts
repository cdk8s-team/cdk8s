import * as fs from 'fs-extra';
import * as path from 'path';
import { withTempDir } from './util';
import { shell } from '../lib/util';

jest.setTimeout(30_000);

const cli = path.join(__dirname, '..', 'bin', 'cdk8s');
const env = { ...process.env, CLI_TEST: '1' };

test('typescript-app', async () => {
  await withTempDir('heythere', async () => {
    await shell(cli, [ 'init', 'typescript-app' ], { env });
    await shell('yarn', [ 'synth' ]);

    const output = await fs.readFile('dist/heythere.k8s.yaml', 'utf-8');
    expect(output).toMatchSnapshot();
  });
});

