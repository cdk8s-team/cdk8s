import * as kplus from '../src';
import { Testing } from 'cdk8s';

describe('PodTemplateSpec', () => {
  test('Instantiation properties are all accepted', () => {
    const podSpec = new kplus.PodSpec();
    const metadata = new kplus.ObjectMeta();
    const spec = new kplus.PodTemplateSpec({
      podSpec: podSpec,
      metadata: metadata,
    });

    expect(spec.metadata).toBe(metadata);
    expect(spec.podSpec).toBe(podSpec);
  });
});

describe('PodTemplate', () => {

  test('Instatiation properties are all accepted', () => {

    const chart = Testing.chart();
    const spec = new kplus.PodTemplateSpec();
    const podTemplate = new kplus.PodTemplate(chart, 'PodTemplate', {
      spec: spec,
    });

    expect(podTemplate.spec).toBe(spec);

  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const podTemplate = new kplus.PodTemplate(chart, 'PodTemplate');

    podTemplate.spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
      }),
    );

    expect(Testing.synth(chart)).toMatchInlineSnapshot(`
      Array [
        Object {
          "apiVersion": "v1",
          "kind": "PodTemplate",
          "metadata": Object {
            "annotations": Object {},
            "labels": Object {},
            "name": "test-podtemplate-pod-017d4985",
          },
          "template": Object {
            "metadata": Object {
              "annotations": Object {},
              "labels": Object {},
            },
            "spec": Object {
              "containers": Array [
                Object {
                  "env": Array [],
                  "image": "image",
                  "name": "main",
                  "ports": Array [],
                  "volumeMounts": Array [],
                },
              ],
              "volumes": Array [],
            },
          },
        },
      ]
    `);
  });
});
