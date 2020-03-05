import { execSync } from 'child_process';
import * as os from 'os';
import * as fs from 'fs';
import * as path from 'path';

const cli = path.join(__dirname, '..', 'bin', 'cdk8s');

test('typescript-app', () => {
  withTempDir('heythere', () => {
    shell(`${cli} init typescript-app`);
    shell(`yarn synth`);
    expect(fs.readFileSync('dist/heythere.k8s.yaml', 'utf-8')).toMatchSnapshot();
  });
});

function shell(command: string) {
  execSync(command, { stdio: 'inherit', env: { ...process.env, CLI_TEST: '1' }});
}

function withTempDir(dirname: string, closure: () => void) {
  const prevdir = process.cwd();
  const parent = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s-init-test.'));
  const workdir = path.join(parent, dirname);
  fs.mkdirSync(workdir);
  try {
    process.chdir(workdir);
    closure();
  } finally {
    process.chdir(prevdir);
    fs.rmdirSync(parent, { recursive: true });
  }
}