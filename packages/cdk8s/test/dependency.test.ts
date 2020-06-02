import { Chart, ApiObject, Testing } from '../lib';
import { Node, IConstruct } from 'constructs';
import { DependencyGraph } from '../lib/dependency';

test('topology returns correct order', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
  const obj3 = new ApiObject(chart1, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

  Node.of(obj1).addDependency(obj2);
  Node.of(obj2).addDependency(obj3);

  const graph = new DependencyGraph(Node.of(chart1))

  expect(graph.topology()).toEqual([chart1, obj3, obj2, obj1]);

});

test('cycle detection', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
  const obj3 = new ApiObject(chart1, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

  Node.of(obj1).addDependency(obj2);
  Node.of(obj2).addDependency(obj3);
  Node.of(obj3).addDependency(obj1);

  expect(() => {
    new DependencyGraph(Node.of(chart1))
  }).toThrowError(`Dependency cycle detected: ${Node.of(obj1).uniqueId} => ${Node.of(obj2).uniqueId} => ${Node.of(obj3).uniqueId} => ${Node.of(obj1).uniqueId}`);

});

test('value of root is null', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
  const obj3 = new ApiObject(chart1, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

  Node.of(obj1).addDependency(obj2);
  Node.of(obj2).addDependency(obj3);

  expect(new DependencyGraph(Node.of(chart1)).root.value).toBeNull();

});

test('children of root contains all orphans', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });

  Node.of(obj1).addDependency(obj2);

  const expected = new Set<IConstruct>();

  new DependencyGraph(Node.of(chart1)).root.children.forEach(c => expected.add(c.value!))

  // chart1 and obj1 are orphans because no one depends on them (no parents)
  // they should be dependency roots, i.e chidren of the dummy root.
  expect(expected).toEqual(new Set<IConstruct>([chart1, obj1]));

});

test('ignores cross-scope nodes', () => {

  const app = Testing.app();
  const chart1 = new Chart(app, 'chart1');
  const chart2 = new Chart(app, 'chart2');

  const obj1 = new ApiObject(chart1, 'obj1', { apiVersion: 'v1', kind: 'Kind1' });
  const obj2 = new ApiObject(chart1, 'obj2', { apiVersion: 'v1', kind: 'Kind2' });
  const obj3 = new ApiObject(chart2, 'obj3', { apiVersion: 'v1', kind: 'Kind3' });

  Node.of(obj1).addDependency(obj2);

  // this is a cross-scope dependency since 'obj2' is
  // not inside the scope of 'chart1'
  Node.of(obj2).addDependency(obj3);

  // we expect obj3 to not be part of the graph
  const graph = new DependencyGraph(Node.of(chart1))

  expect(graph.topology()).toEqual([chart1, obj2, obj1])

});
