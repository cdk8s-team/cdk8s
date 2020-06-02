import * as path from 'path';
import * as yaml from 'yaml';
import * as fs from 'fs';
import { ImportCustomResourceDefinition } from '../../lib/import/crd';
import { expectImportMatchSnapshot } from './util';

expectImportMatchSnapshotCustomResource('jenkins_crd.yaml');
expectImportMatchSnapshotCustomResource('multi_object_crd.yaml');
expectImportMatchSnapshotCustomResource('mixed_crd.yaml');
expectImportMatchSnapshotCustomResource('prometheus.yaml');

test('fails if CRDs api version is not supported', () => {
  expect(() => new ImportCustomResourceDefinition([{
    apiVersion: 'voo',
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

test('can import a "List" of CRDs (kubectl get crds -o json)', () => {
  const importer = new ImportCustomResourceDefinition([
    {
      kind: 'List',
      items: [
        {
          "apiVersion": "apiextensions.k8s.io/v1beta1",
          "kind": "CustomResourceDefinition",
          "metadata": {
            "name": "crontabs.stable.example.com"
          },
          "spec": {
            "group": "stable.example.com",
            "versions": [
              {
                "name": "v1",
                "served": true,
                "storage": true
              }
            ],
            "scope": "Namespaced",
            "names": {
              "plural": "crontabs",
              "singular": "crontab",
              "kind": "OtherCronTab",
              "shortNames": [
                "ct"
              ]
            },
            "preserveUnknownFields": false,
            "validation": {
              "openAPIV3Schema": {
                "type": "object",
                "properties": {
                  "spec": {
                    "type": "object",
                    "properties": {
                      "cronSpec": {
                        "type": "string"
                      },
                      "image": {
                        "type": "string"
                      },
                      "replicas": {
                        "type": "integer"
                      }
                    }
                  }
                }
              }
            }
          }
        },
        {}, // verify that we skip empty
        {
          "kind": "List",
          "items": []
        },

        // nested lists
        {
          "kind": "List",
          "items": [
            {
              "apiVersion": "apiextensions.k8s.io/v1beta1",
              "kind": "CustomResourceDefinition",
              "spec": {
                "group": "foo.bar",
                "version": "v1",
                "names": {
                  "kind": "foo"
                }
              }
            },

            // skip non-CRD
            {
              "apiVersion": "apiextensions.k8s.io/v1beta1",
              "kind": "NonCustomResourceDefinition",
              "spec": {
                "group": "foo.bar",
                "names": { "kind": "foo" },
              }
            }
          ]
        },
        {
          "apiVersion": "apiextensions.k8s.io/v1beta1",
          "kind": "CustomResourceDefinition",
          "metadata": {
            "name": "crontabs.stable.example.com"
          },
          "spec": {
            "group": "stable.example.com",
            "versions": [
              {
                "name": "v1",
                "served": true,
                "storage": true
              }
            ],
            "scope": "Namespaced",
            "names": {
              "plural": "crontabs",
              "singular": "crontab",
              "kind": "CronTab",
              "shortNames": [
                "ct"
              ]
            },
            "preserveUnknownFields": false,
            "validation": {
              "openAPIV3Schema": {
                "type": "object",
                "properties": {
                  "spec": {
                    "type": "object",
                    "properties": {
                      "cronSpec": {
                        "type": "string"
                      },
                      "image": {
                        "type": "string"
                      },
                      "replicas": {
                        "type": "integer"
                      }
                    }
                  }
                }
              }
            }
          }
        }
      ]
    }
  ]);

  expect(importer.moduleNames).toEqual([
    'stable.example.com/othercrontab',
    'foo.bar/foo',
    'stable.example.com/crontab'
  ]);
});

function loadFixture(fileName: string) {
  const filePath = path.join(__dirname, 'fixtures', fileName);
  return yaml
    .parseAllDocuments(fs.readFileSync(filePath, 'utf-8'))
    .map((doc: yaml.Document) => doc.toJSON());
}

function expectImportMatchSnapshotCustomResource(fixtureFile: string) {
  const crd = loadFixture(fixtureFile);
  expectImportMatchSnapshot(fixtureFile, () => new ImportCustomResourceDefinition(crd));
}
