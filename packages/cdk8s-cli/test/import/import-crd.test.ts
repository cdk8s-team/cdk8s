import * as path from 'path';
import * as yaml from 'yaml';
import * as fs from 'fs';
import { CustomResourceApiObject, ImportCustomResourceDefinition } from '../../lib/import/crd';
import { expectImportMatchSnapshot } from './util';

const jenkinsCrd = yaml.parseAllDocuments(fs.readFileSync(path.join(__dirname, 'fixtures', 'jenkins_crd.yaml'), 'utf-8'))
                       .map((doc: yaml.ast.Document) => doc.toJSON());

expectImportMatchSnapshot('jenkins', () => new ImportCustomResourceDefinition(jenkinsCrd));

const multiObjectCRD = yaml.parseAllDocuments(fs.readFileSync(path.join(__dirname, 'fixtures', 'multi_object_crd.yaml'), 'utf-8'))
                           .map((doc: yaml.ast.Document) => doc.toJSON());

expectImportMatchSnapshot('multiObject', () => new ImportCustomResourceDefinition(multiObjectCRD));

const mixedCRD = yaml.parseAllDocuments(fs.readFileSync(path.join(__dirname, 'fixtures', 'mixed_crd.yaml'), 'utf-8'))
                           .map((doc: yaml.ast.Document) => doc.toJSON()).filter((crd) => (crd as CustomResourceApiObject).kind === 'CustomResourceDefinition');

expectImportMatchSnapshot('mixedCRD', () => new ImportCustomResourceDefinition(mixedCRD));


test('fails if manifest is not a CRD', async () => {
  expect(() => new ImportCustomResourceDefinition([{ 
    apiVersion: 'voo' 
  }])).toThrow('invalid CustomResourceDefinition manifest: "apiVersion" must be "apiextensions.k8s.io/v1beta1"');

  expect(() => new ImportCustomResourceDefinition([{ 
    apiVersion: 'apiextensions.k8s.io/v1beta1',
    kind: 'Foo'
  }])).toThrow('invalid CustomResourceDefinition manifest: "kind" must be "CustomResourceDefinition"');

  expect(() => new ImportCustomResourceDefinition([{
    apiVersion: 'apiextensions.k8s.io/v1beta1',
    kind: 'CustomResourceDefinition',
  }])).toThrow('manifest does not have a "spec" attribute');
})

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
})