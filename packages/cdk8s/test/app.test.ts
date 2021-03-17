import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import { Node, Construct } from 'constructs';
import { Testing, Chart, App, ApiObject, AppProps, YamlOutputType } from '../src';


test('empty app emits no files', () => {
  const outputTypes: Array<AppProps> = [
    { yamlOutputType: YamlOutputType.FILE_PER_CHART },
    { yamlOutputType: YamlOutputType.FILE_PER_APP },
    { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
  ];
  for (const props of outputTypes) {
    // GIVEN
    const app = Testing.app(props);

    // WHEN
    app.synth();

    // THEN
    expect(fs.readdirSync(app.outdir)).toHaveLength(0);
  }
});

test('app with two charts', () => {
  const testSpecs = [
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_CHART },
      result: ['chart1.k8s.yaml', 'chart2.k8s.yaml'],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_APP },
      result: [],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
      result: [],
    },
  ];
  for (const testSpec of testSpecs) {
    // GIVEN
    const app = Testing.app(testSpec.props);

    // WHEN
    new Chart(app, 'chart1');
    new Chart(app, 'chart2');
    app.synth();

    // THEN
    expect(fs.readdirSync(app.outdir)).toEqual(testSpec.result);
  }
});

test('app with charts directly dependant', () => {
  const testSpecs = [
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_CHART },
      result: [
        '0000-chart3.k8s.yaml',
        '0001-chart2.k8s.yaml',
        '0002-chart1.k8s.yaml',
      ],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_APP },
      result: [],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
      result: [],
    },
  ];

  for (const testSpec of testSpecs) {
    // GIVEN
    const app = Testing.app(testSpec.props);

    // WHEN
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');
    const chart3 = new Chart(app, 'chart3');

    Node.of(chart1).addDependency(chart2);
    Node.of(chart2).addDependency(chart3);

    app.synth();

    // THEN
    expect(fs.readdirSync(app.outdir)).toEqual(testSpec.result);
  }
});

test('app with charts indirectly dependant', () => {
  const testSpecs = [
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_CHART },
      result: [
        '0000-chart3.k8s.yaml',
        '0001-chart2.k8s.yaml',
        '0002-chart1.k8s.yaml',
      ],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_APP },
      result: ['app.k8s.yaml'],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
      result: [
        'v1.Kind1.chart1-obj1-c818e77f.k8s.yaml',
        'v1.Kind2.chart2-obj2-c8636f20.k8s.yaml',
        'v1.Kind3.chart3-obj3-c8abbfb5.k8s.yaml',
      ],
    },
  ];

  for (const testSpec of testSpecs) {
    // GIVEN
    const app = Testing.app(testSpec.props);

    // WHEN
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');
    const chart3 = new Chart(app, 'chart3');

    const obj1 = new ApiObject(chart1, 'obj1', {
      apiVersion: 'v1',
      kind: 'Kind1',
    });
    const obj2 = new ApiObject(chart2, 'obj2', {
      apiVersion: 'v1',
      kind: 'Kind2',
    });
    const obj3 = new ApiObject(chart3, 'obj3', {
      apiVersion: 'v1',
      kind: 'Kind3',
    });

    Node.of(obj1).addDependency(obj2);
    Node.of(obj2).addDependency(obj3);

    app.synth();

    // THEN
    expect(fs.readdirSync(app.outdir)).toEqual(testSpec.result);
  }
});

test('default output directory is "dist"', () => {
  // GIVEN
  const prev = process.cwd();
  const workdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s-'));

  try {
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

test('app with dependent and independent charts', () => {

  const testSpecs = [
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_CHART },
      result: [
        '0000-chart3.k8s.yaml',
        '0001-chart1.k8s.yaml',
        '0002-chart2.k8s.yaml',
        '0003-chart4.k8s.yaml',
      ],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_APP },
      result: [],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
      result: [],
    },
  ];

  for (const testSpec of testSpecs) {
    // GIVEN
    const app = Testing.app(testSpec.props);

    // WHEN
    const chart1 = new Chart(app, 'chart1');
    new Chart(app, 'chart2');
    const chart3 = new Chart(app, 'chart3');
    new Chart(app, 'chart4');

    Node.of(chart1).addDependency(chart3);

    app.synth();

    // THEN
    expect(fs.readdirSync(app.outdir)).toEqual(testSpec.result);
  }
});

test('app with chart dependencies via custom constructs', () => {
  class CustomConstruct extends Construct {
    public obj: ApiObject;

    constructor(scope: Construct, id: string) {
      super(scope, id);

      this.obj = new ApiObject(this, `${id}obj`, {
        apiVersion: 'v1',
        kind: 'CustomConstruct',
      });
    }
  }

  const testSpecs = [
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_CHART },
      result: ['0000-chart2.k8s.yaml', '0001-chart1.k8s.yaml'],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_APP },
      result: ['app.k8s.yaml'],
    },
    {
      props: { yamlOutputType: YamlOutputType.FILE_PER_RESOURCE },
      result: [
        'v1.CustomConstruct.chart1-microservice-microserviceobj-c8e1164f.k8s.yaml',
        'v1.CustomConstruct.chart2-database-databaseobj-c8b5eba3.k8s.yaml',
      ],
    },
  ];

  for (const testSpec of testSpecs) {
    const app = Testing.app(testSpec.props);
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');

    const microService = new CustomConstruct(chart1, 'MicroService');
    const dataBase = new CustomConstruct(chart2, 'DataBase');

    Node.of(microService).addDependency(dataBase);

    app.synth();

    expect(fs.readdirSync(app.outdir)).toEqual(testSpec.result);
  }
});

test('synth calls validate', () => {

  class ValidatingConstruct extends Construct {

    public validateInvoked = false;

    constructor(scope: Construct, id: string) {
      super(scope, id);
    }

    protected onValidate(): string[] {
      this.validateInvoked = true;
      return [];
    }
  }

  const app = new App();

  const construct = new ValidatingConstruct(app, 'ValidatingConstruct');

  app.synth();

  expect(construct.validateInvoked).toBeTruthy();

});
