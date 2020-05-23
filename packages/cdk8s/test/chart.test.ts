import { Chart, ApiObject, Testing, DependencyGraph } from '../lib';
import { Construct, Lazy, Node } from 'constructs';

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
      implicitToken: createImplictToken({ foo: 'bar' })
    }
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

describe('toJson', () => {

  test('returns on ordered list', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
  
    const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
    
    Node.of(obj1).addDependency(obj2);  
  
    const charObjects = chart1.toJson();
  
    expect(charObjects[0].kind).toEqual('Kind2');
    expect(charObjects[1].kind).toEqual('Kind1');
  
  });
  
  test('returns objects not in dependency list', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
  
    new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
      
    const charObjects = chart1.toJson();
  
    expect(charObjects[0].kind).toEqual('Kind1');
    expect(charObjects[1].kind).toEqual('Kind2');
  
  });

  test('ignores objects belonging to a different chart', () => {

    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
    const chart2 = new Chart(app, 'chart2');
  
    const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
    const obj2 = new ApiObject(chart2, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
    
    Node.of(obj1).addDependency(obj2);  

    const charObjects = chart1.toJson();

    expect(charObjects.length).toEqual(1);
    expect(charObjects[0].kind).toEqual('Kind1');
  
  });

  test('fails on dependency cycles', () => {
  
    const app = Testing.app();
    const chart1 = new Chart(app, 'chart1');
  
    function createObject(index: number) {
      return new ApiObject(chart1, `obj${index}`, { apiVersion: 'v1', kind: `Kind${index}` });
    }
  
    const obj1 = createObject(1);
    const obj2 = createObject(2);
    const obj3 = createObject(3);
    const obj4 = createObject(4);
    const obj5 = createObject(5);
  
    Node.of(obj1).addDependency(obj2);  
    Node.of(obj2).addDependency(obj3);  
    Node.of(obj3).addDependency(obj4);
    Node.of(obj4).addDependency(obj5);
  
    // this creates a cycle
    Node.of(obj5).addDependency(obj2);
  
    expect(() => {
      chart1.toJson()
    }).toThrowError(`Cycle detected: ${Node.of(obj2).uniqueId} => ${Node.of(obj3).uniqueId} => ${Node.of(obj4).uniqueId} => ${Node.of(obj5).uniqueId} => ${Node.of(obj2).uniqueId}`);
  
  });
  
})

function createImplictToken(value: any) {
  const implicit = {};
  Object.defineProperty(implicit, 'resolve', { value: () => value });
  return implicit;
}