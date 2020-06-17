import * as kplus from '../lib';
import * as k8s from '../imports/k8s';

test('addLabel', () => {

  const meta = new kplus.ObjectMeta();

  meta.addLabel('key', 'value');

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.labels).toEqual({
    'key': 'value',
  })

});

test('addAnnotation', () => {

  const meta = new kplus.ObjectMeta();

  meta.addAnnotation('key', 'value');

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.annotations).toEqual({
    'key': 'value',
  })

});

test('labels', () => {

  const meta = new kplus.ObjectMeta({
    labels: {
      'key': 'value',
    },
  });

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.labels).toEqual({
    'key': 'value',
  })

});

test('annotations', () => {

  const meta = new kplus.ObjectMeta({
    annotations: {
      'key': 'value',
    },
  });

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.annotations).toEqual({
    'key': 'value',
  })

});

test('name', () => {

  const meta = new kplus.ObjectMeta({
    name: 'name',
  });

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.name).toEqual('name');

});

test('namespace', () => {

  const meta = new kplus.ObjectMeta({
    namespace: 'namespace',
  });

  const expected: k8s.ObjectMeta = meta._toKube();

  expect(expected.namespace).toEqual('namespace');

});
