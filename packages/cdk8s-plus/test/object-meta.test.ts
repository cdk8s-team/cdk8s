import * as kplus from '../src';
import * as k8s from '../src/imports/k8s';

test('Can add a label', () => {

  const meta = new kplus.ObjectMeta();

  meta.addLabel('key', 'value');

  const actual: k8s.ObjectMeta = meta._toKube();

  expect(actual.labels).toEqual({
    key: 'value',
  })

});

test('Can add an annotation', () => {

  const meta = new kplus.ObjectMeta();

  meta.addAnnotation('key', 'value');

  const actual: k8s.ObjectMeta = meta._toKube();

  expect(actual.annotations).toEqual({
    key: 'value',
  })

});

test('Instantiation properties are all respected', () => {

  const meta = new kplus.ObjectMeta({
    labels: {key: 'value'},
    annotations: {key: 'value'},
    name: 'name',
    namespace: 'namespace',
  });

  const actual: k8s.ObjectMeta = meta._toKube();

  const expected: k8s.ObjectMeta = {
    name: 'name',
    namespace: 'namespace',
    annotations: {
      key: 'value',
    },
    labels: {
      key: 'value',
    },
  }

  expect(actual).toStrictEqual(expected);

});
