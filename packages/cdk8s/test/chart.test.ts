import { Chart, ApiObject, Testing } from '../src';
import { Construct, Lazy, Node, Dependency } from 'constructs';

test('empty stack', () => {
  // GIVEN
  const app = Testing.app();

  // WHEN
  const chart = new Chart(app, 'empty');

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});

test('output includes all synthesized resources', () => {
  // GIVEN
  const app = Testing.app();
  const chart = new Chart(app, 'test');

  // WHEN
  new ApiObject(chart, 'resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(chart, 'resource2', { kind: 'Resource2', apiVersion: 'v1' });
  new ApiObject(chart, 'resource3', { kind: 'Resource3', apiVersion: 'v1' });

  // also, subscopes
  const scope = new Construct(chart, 'scope');
  new ApiObject(scope, 'resource1', { kind: 'Resource1', apiVersion: 'v1' });
  new ApiObject(scope, 'resource2', { kind: 'Resource2', apiVersion: 'v1' });

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});


test('tokens are resolved during synth', () => {
  // GIVEN
  const app = Testing.app();
  const chart = new Chart(app, 'test');

  // WHEN
  new ApiObject(chart, 'resource1', {
    kind: 'Resource1',
    apiVersion: 'v1',
    spec: {
      foo: Lazy.numberValue({ produce: () => 123 }),
      implicitToken: createImplictToken({ foo: 'bar' }),
    },
  });

  // THEN
  expect(Testing.synth(chart)).toMatchSnapshot();
});

test('Chart.of(node) returns the first chart in which a node is defined', () => {
  // GIVEN
  const app = Testing.app();

  // WHEN
  const chart = new Chart(app, 'MyFirst');
  const direct = new Construct(chart, 'Direct');
  const indirect = new Construct(direct, 'Indirect');

  const childChart = new Chart(indirect, 'ChildChart');
  const childChild = new Construct(childChart, 'ChildChild');

  expect(Chart.of(chart)).toEqual(chart);
  expect(Chart.of(direct)).toEqual(chart);
  expect(Chart.of(indirect)).toEqual(chart);
  expect(Chart.of(childChart)).toEqual(childChart);
  expect(Chart.of(childChild)).toEqual(childChart);
});

test('Chart.of(node) fails when there is no chart in the tree', () => {
  // GIVEN
  const app = Testing.app();
  const child = new Construct(app, 'MyConstruct');

  // WHEN
  expect(() => Chart.of(child)).toThrow(/cannot find a parent chart \(directly or indirectly\)/);
});

test('synthesizeManifest() can be used to synthesize a specific chart', () => {
  // GIVEN
  const app = Testing.app();
  const chart = new Chart(app, 'chart');
  new ApiObject(chart, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  new ApiObject(chart, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

  // WHEN
  const manifest = chart.toJson();

  // THEN
  expect(manifest).toMatchSnapshot();
});

test('addDependency', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');
  const chart2 = new Chart(app, 'chart2');
  const chart3 = new Chart(app, 'chart3');

  chart1.addDependency(chart2, chart3);

  const dependencies: Set<Dependency> = new Set<Dependency>(Node.of(chart1).dependencies);

  expect(dependencies).toEqual(new Set<Dependency>([
    {
      source: chart1,
      target: chart2,
    },
    {
      source: chart1,
      target: chart3,
    },
  ]))

});

describe('toJson', () => {

  test('validates the chart', () => {
    class ValidatingConstruct extends Construct {

      public validateInvoked = false;

      constructor(scope: Construct, id: string) {
        super(scope, id);
      }

      protected onValidate(): string[] {
        this.validateInvoked = true;
        return []
      }
    }

    const app = Testing.app();
    const chart = new Chart(app, 'chart');

    const construct = new ValidatingConstruct(chart, 'ValidatingConstruct');

    chart.toJson();

    expect(construct.validateInvoked).toBeTruthy();

  });

  test('returns an ordered list', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');

    const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
    const obj3 = new ApiObject(chart1, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

    obj1.addDependency(obj2);
    obj2.addDependency(obj3);

    expect(chart1.toJson()).toEqual([
      obj3.toJson(),
      obj2.toJson(),
      obj1.toJson(),
    ]);

  });

  test('ignores objects belonging to a different chart', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');

    const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    const obj2 = new ApiObject(chart2, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

    obj1.addDependency(obj2);

    expect(chart1.toJson()).toEqual([
      obj1.toJson(),
    ]);

  });

  test('ignores chart objects', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');

    const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    const obj2 = new ApiObject(chart2, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

    obj1.addDependency(obj2);
    chart1.addDependency(chart2);

    expect(chart1.toJson()).toEqual([
      obj1.toJson(),
    ]);

  });

  test('orders custom constructs', () => {

    const app = Testing.app();
    const chart = new Chart(app, 'chart');

    const microService = new CustomConstruct(chart, 'MicroService');
    const dataBase = new CustomConstruct(chart, 'Database');

    Node.of(microService).addDependency(dataBase);

    expect(chart.toJson()).toEqual([
      dataBase.obj.toJson(),
      microService.obj.toJson(),
    ])

  });

  test('orders transitive custom constructs', () => {

    const app = Testing.app();
    const chart = new Chart(app, 'chart');

    const microService = new CustomConstruct(chart, 'MicroService');
    const dataBase = new CustomNestedConstruct(chart, 'Database');

    Node.of(microService).addDependency(dataBase);

    expect(chart.toJson()).toEqual([
      dataBase.obj.obj.toJson(),
      microService.obj.toJson(),
    ])

  });

  test('api object depends on custom construct', () => {

    const app = Testing.app();
    const chart = new Chart(app, 'chart');

    const microService = new ApiObject(chart, 'MicroService', { apiVersion: 'v1', kind: 'MicroService' });
    const dataBase = new CustomConstruct(chart, 'Database');

    microService.addDependency(dataBase);

    expect(chart.toJson()).toEqual([
      dataBase.obj.toJson(),
      microService.toJson(),
    ])

  });

  test('construct depends on api object', () => {

    const app = Testing.app();
    const chart = new Chart(app, 'chart');

    const database = new ApiObject(chart, 'MicroService', { apiVersion: 'v1', kind: 'MicroService' });
    const microService = new CustomConstruct(chart, 'Database');

    Node.of(microService).addDependency(database);

    expect(chart.toJson()).toEqual([
      database.toJson(),
      microService.obj.toJson(),
    ])

  });

});

function createImplictToken(value: any) {
  const implicit = {};
  Object.defineProperty(implicit, 'resolve', { value: () => value });
  return implicit;
}

class CustomConstruct extends Construct {

  public obj: ApiObject;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    this.obj = new ApiObject(this, `${id}obj`, { apiVersion: 'v1', kind: 'CustomConstruct' });
  }
}

class CustomNestedConstruct extends Construct {

  public obj: CustomConstruct;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    this.obj = new CustomConstruct(this, 'nested');
  }
}
