import * as path from 'path';
import * as yaml from 'yaml';
import * as fs from 'fs';
import { ImportCustomResourceDefinition } from '../../lib/import/crd';
import { expectImportMatchSnapshot } from './util';

jest.setTimeout(60_000);

expectImportMatchSnapshotCustomResource('jenkins_crd.yaml');
expectImportMatchSnapshotCustomResource('multi_object_crd.yaml');
expectImportMatchSnapshotCustomResource('mixed_crd.yaml');
expectImportMatchSnapshotCustomResource('prometheus.yaml');

test('fails if CRDs api version is not supported', () => {
  expect(() => new ImportCustomResourceDefinition([{ 
    apiVersion: 'voo' ,
    kind: 'CustomResourceDefinition'
  }])).toThrow('invalid CustomResourceDefinition manifest: "apiVersion" is "voo" but it should be one of: "apiextensions.k8s.io/v1beta1", "apiextensions.k8s.io/v1"');
});

test('fails if manifest does not have a "spec" field', () => {
  expect(() => new ImportCustomResourceDefinition([{
    apiVersion: 'apiextensions.k8s.io/v1beta1',
    kind: 'CustomResourceDefinition',
  }])).toThrow('manifest does not have a "spec" attribute');
});

test('fails if one apiObject in multiObject CRD is not a valid CRD', async () => {
  expect(() => new ImportCustomResourceDefinition([
    { 
      apiVersion: 'apiextensions.k8s.io/v1beta1',
      kind: 'CustomResourceDefinition',
      metadata: {
        name: 'testMetadata'
      },
      spec: {
        group: 'testGroup',
        names: {
          kind: 'testNameKind'
        },
        versions: [{
          name: 'testVersionName',
          schema: {
            openAPIV3Schema: {
              type: 'testObject'
            }
          }
        }]
      }
    },
    {
      apiVersion: 'apiextensions.k8s.io/v1beta1',
      kind: 'CustomResourceDefinition'
    }
  ])).toThrow('manifest does not have a "spec" attribute');
});

function loadFixture(fileName: string) {
  const filePath = path.join(__dirname, 'fixtures', fileName);
  return yaml
    .parseAllDocuments(fs.readFileSync(filePath, 'utf-8'))
    .map((doc: yaml.ast.Document) => doc.toJSON());
}

function expectImportMatchSnapshotCustomResource(fixtureFile: string) {
  const crd = loadFixture(fixtureFile);
  expectImportMatchSnapshot(fixtureFile, () => new ImportCustomResourceDefinition(crd));
}
