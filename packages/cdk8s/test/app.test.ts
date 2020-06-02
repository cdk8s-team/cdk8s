import { Testing, Chart, App, ApiObject } from '../lib';
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import { Node } from 'constructs';

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
    '0000-chart1.k8s.yaml',
    '0001-chart2.k8s.yaml'
  ]);
});

test('app with two charts directly dependant', () => {

  // GIVEN
  const app = Testing.app();

  // WHEN
  const chart1 = new Chart(app, 'chart1');
  const chart2 = new Chart(app, 'chart2');

  Node.of(chart1).addDependency(chart2);

  app.synth();

  // THEN
  expect(fs.readdirSync(app.outdir)).toEqual([
    '0000-chart2.k8s.yaml',
    '0001-chart1.k8s.yaml'
  ]);

});

test('app with two charts indirectly dependant', () => {

  // GIVEN
  const app = Testing.app();

  // WHEN
  const chart1 = new Chart(app, 'chart1');
  const chart2 = new Chart(app, 'chart2');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart2, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

  Node.of(obj1).addDependency(obj2);

  app.synth();

  // THEN
  expect(fs.readdirSync(app.outdir)).toEqual([
    '0000-chart2.k8s.yaml',
    '0001-chart1.k8s.yaml'
  ]);

});

test('app with two charts indirectly and directly dependant', () => {

  // GIVEN
  const app = Testing.app();

  // WHEN
  const chart1 = new Chart(app, 'chart1');
  const chart2 = new Chart(app, 'chart2');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart2, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

  Node.of(obj1).addDependency(obj2);
  Node.of(chart1).addDependency(chart2);

  app.synth();

  // THEN
  expect(fs.readdirSync(app.outdir)).toEqual([
    '0000-chart2.k8s.yaml',
    '0001-chart1.k8s.yaml'
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
    expect(fs.existsSync('./dist/0000-chart1.k8s.yaml')).toBeTruthy();
  } finally {
    process.chdir(prev);
    // fs.rmdirSync(workdir, { recursive: true });
  }
});
