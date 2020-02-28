import { Testing, Chart, App } from '../lib';
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';

test('empty app emits no files', () => {
  // GIVEN
  const app = Testing.app();

  // WHEN
  app.synth();

  // THEN
  expect(fs.readdirSync(app.outdir)).toHaveLength(0);
});

test('app with two charts', () => {
  // GIVEN
  const app = Testing.app();

  // WHEN
  new Chart(app, 'chart1');
  new Chart(app, 'chart2');
  app.synth();

  // THEN
  expect(fs.readdirSync(app.outdir)).toEqual([
    'chart1.k8s.yaml',
    'chart2.k8s.yaml'
  ]);
});

test('default output directory is "dist"', () => {
  // GIVEN
  const prev = process.cwd();
  const workdir = fs.mkdtempSync(path.join(os.tmpdir()));

  try {
    console.log(workdir);
    process.chdir(workdir);

    // WHEN
    const app = new App();
    new Chart(app, 'chart1');
    app.synth();

    // THEN
    expect(app.outdir).toEqual('dist');
    expect(fs.existsSync('./dist')).toBeTruthy();
    expect(fs.statSync('./dist').isDirectory());
    expect(fs.existsSync('./dist/chart1.k8s.yaml')).toBeTruthy();
  } finally {
    process.chdir(prev);
    // fs.rmdirSync(workdir, { recursive: true });
  }
});
