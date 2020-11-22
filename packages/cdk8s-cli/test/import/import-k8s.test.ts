import { ImportKubernetesApi } from '../../src/import/k8s';
import { testImportMatchSnapshot } from './util';

const k8s = (v: string) =>
  testImportMatchSnapshot(`k8s@${v}`, () => new ImportKubernetesApi({ apiVersion: v }));

k8s('1.14.0');
k8s('1.15.0');
k8s('1.16.0');
k8s('1.17.0');
