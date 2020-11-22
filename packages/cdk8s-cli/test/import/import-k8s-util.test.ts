import { parseApiTypeName } from '../../src/import/k8s-util';

test('parseApiTypeName', () => {
  expect(parseApiTypeName('io.k8s.api.extensions.v1.Deployment')).toStrictEqual({ basename: 'Deployment', fullname: 'io.k8s.api.extensions.v1.Deployment', level: 'stable', namespace: 'io.k8s.api.extensions', subversion: 0, version: 1 });
  expect(parseApiTypeName('io.k8s.api.extensions.v1beta1.Deployment')).toStrictEqual({ basename: 'Deployment', fullname: 'io.k8s.api.extensions.v1beta1.Deployment', level: 'beta', namespace: 'io.k8s.api.extensions', subversion: 1, version: 1 });
  expect(parseApiTypeName('io.k8s.api.extensions.v2.Deployment')).toStrictEqual({ basename: 'Deployment', fullname: 'io.k8s.api.extensions.v2.Deployment', level: 'stable', namespace: 'io.k8s.api.extensions', subversion: 0, version: 2 });
  expect(parseApiTypeName('io.v2alpha2.Deployment')).toStrictEqual({ basename: 'Deployment', fullname: 'io.v2alpha2.Deployment', level: 'alpha', namespace: 'io', subversion: 2, version: 2 });
});