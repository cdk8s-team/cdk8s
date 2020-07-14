import { expectImportMatchSnapshot } from './util';
import { ImportKubernetesApi } from '../../src/import/k8s';

const k8s = (v: string) => 
  expectImportMatchSnapshot(`k8s@${v}`, () => new ImportKubernetesApi({ apiVersion: v }));

k8s('1.14.0');
k8s('1.15.0');
k8s('1.16.0');
k8s('1.17.0');
