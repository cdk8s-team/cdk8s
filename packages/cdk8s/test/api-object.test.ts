import { ApiObject, Chart, Testing, Lazy } from '../src';
import { Construct, Node, Dependency } from 'constructs';

test('can use lazy tokens', () => {

  const app = Testing.app();
  const chart = new Chart(app, 'test');

  new ApiObject(chart, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource',
    number: Lazy.numberValue(() => 42),
    string: Lazy.stringValue(() => 'hello'),
    stringList: Lazy.stringListValue(() => ['1', '2']),
    any: Lazy.anyValue(() => { return {foo: 'bar'} }),
  });

  const syntheisized = Testing.synth(chart)[0];

  expect(syntheisized.number).toEqual(42);
  expect(syntheisized.string).toEqual('hello');
  expect(syntheisized.stringList).toEqual(['1', '2']);
  expect(syntheisized.any).toEqual({foo: 'bar'});

});

test('can perform token operations', () => {

  

});

test('minimal configuration', () => {
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  new ApiObject(stack, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource',
  });

  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('printed yaml is alphabetical', () => {
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // Object keys in random order
  new ApiObject(stack, 'my-resource', {
    kind: 'MyResource',
    apiVersion: 'v1',
    spec: {
      secondProperty: {
        innerThirdProperty: '!',
        beforeThirdProperty: 'world',
      },
      firstProperty: 'hello',
    },
  });

  // Should match alphabetically-ordered snapshot
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('addDependency', () => {

  const app = Testing.app();
  const chart = new Chart(app, 'chart1');

  const obj1 = new ApiObject(chart, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
  const obj3 = new ApiObject(chart, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

  obj1.addDependency(obj2, obj3);

  const dependencies: Set<Dependency> = new Set<Dependency>(Node.of(obj1).dependencies);

  expect(dependencies).toEqual(new Set<Dependency>([
    {
      source: obj1,
      target: obj2,
    },
    {
      source: obj1,
      target: obj3,
    },
  ]))

});

test('synthesized resource name is based on path', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');
  new ApiObject(stack, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource',
  });

  // WHEN
  // now create another resource with the same namespace but within a sub-scope
  const scope = new Construct(stack, 'scope');
  new ApiObject(scope, 'my-resource', {
    apiVersion: 'v1',
    kind: 'MyResource',
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('if name is explicitly specified it will be respected', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'my-resource', {
    kind: 'MyResource',
    apiVersion: 'v1',
    metadata: {
      name: 'boom',
    },
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('"spec" is synthesized as-is', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'resource', {
    kind: 'ResourceType',
    apiVersion: 'v1',
    spec: {
      prop1: 'hello',
      prop2: {
        world: 123,
      },
    },
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('"data" can be used to specify resource data', () => {
  // GIVEN
  const app = Testing.app();
  const stack = new Chart(app, 'test');

  // WHEN
  new ApiObject(stack, 'resource', {
    kind: 'ResourceType',
    apiVersion: 'v1',
    data: {
      boom: 123,
    },
  });

  // THEN
  expect(Testing.synth(stack)).toMatchSnapshot();
});

test('object naming logic can be overridden at the chart level', () => {
  class MyChart extends Chart {
    generateObjectName() {
      return 'fixed!';
    }
  }

  // GIVEN
  const app = Testing.app();
  const chart = new MyChart(app, 'my-chart');

  // WHEN
  const object = new ApiObject(chart, 'my-object', {
    apiVersion: 'v1',
    kind: 'MyKind',
  });

  // THEN
  expect(object.name).toEqual('fixed!');
  expect(Testing.synth(chart)).toStrictEqual([{
    apiVersion: 'v1',
    kind: 'MyKind',
    metadata: { name: 'fixed!' },
  }]);
});

test('default namespace can be defined at the chart level', () => {
  // GIVEN
  const app = Testing.app();
  const chart = new Chart(app, 'chart', { namespace: 'ns1' });
  const group1 = new Construct(chart, 'group1');

  // WHEN
  new ApiObject(group1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  new ApiObject(group1, 'obj2', { apiVersion: 'v2', kind: 'Kind2', metadata: { namespace: 'foobar' } });

  // THEN
  expect(Testing.synth(chart)).toStrictEqual([{
    apiVersion: 'v1',
    kind:
    'Kind1',
    metadata: {
      name: 'chart-group1-obj1-b4b7a9d0',
      namespace: 'ns1',
    },
  }, {
    apiVersion: 'v2',
    kind: 'Kind2',
    metadata: {
      name: 'chart-group1-obj2-3cdc9d22',
      namespace: 'foobar',
    },
  }]);
});