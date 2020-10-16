import * as kplus from '../src';
import * as k from '../src/imports/k8s';
import { Testing } from 'cdk8s';

describe('JobSpecDefinition', () => {
  test('Instantiation properties are all respected', () => {
    const spec = new kplus.JobSpecDefinition({
      podSpec: {
        containers: [
          new kplus.Container({
            image: 'image',
          }),
        ],
      },
      ttlAfterFinished: kplus.Duration.seconds(1),
    });

    const actual: k.JobSpec = spec._toKube();

    expect(actual.ttlSecondsAfterFinished).toEqual(1);
    expect(actual.template.spec?.containers[0].image).toEqual('image');
  });

  test('Does not modify existing restart policy of pod spec', () => {
    const spec = new kplus.JobSpecDefinition({
      podSpec: {
        containers: [ new kplus.Container({ image: 'image' }) ],
        restartPolicy: kplus.RestartPolicy.ALWAYS,
      },
      ttlAfterFinished: kplus.Duration.seconds(1),
    });

    const actual: k.JobSpec = spec._toKube();

    expect(actual.template.spec?.restartPolicy).toEqual('Always');
  });

  test('Applies default restart policy to pod spec', () => {
    const spec = new kplus.JobSpecDefinition({
      podSpec: {
        containers: [ new kplus.Container({ image: 'image' }) ],
      },
      ttlAfterFinished: kplus.Duration.seconds(1),
    });

    const actual: k.JobSpec = spec._toKube();

    expect(actual.template.spec?.restartPolicy).toEqual('Never');
  });
});

describe('Job', () => {
  test('Can provide existing spec', () => {
    const chart = Testing.chart();

    const job = new kplus.Job(chart, 'Job', {
      ttlAfterFinished: kplus.Duration.seconds(5),
    });

    expect(job.spec.ttlAfterFinished?.toSeconds()).toEqual(5);
  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const job = new kplus.Job(chart, 'Job');

    job.spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
      }),
    );

    expect(Testing.synth(chart)).toMatchInlineSnapshot(`
      Array [
        Object {
          "apiVersion": "batch/v1",
          "kind": "Job",
          "metadata": Object {
            "name": "test-job-default-e0180087",
          },
          "spec": Object {
            "template": Object {
              "spec": Object {
                "containers": Array [
                  Object {
                    "env": Array [],
                    "image": "image",
                    "imagePullPolicy": "Always",
                    "name": "main",
                    "ports": Array [],
                    "volumeMounts": Array [],
                  },
                ],
                "restartPolicy": "Never",
                "volumes": Array [],
              },
            },
          },
        },
      ]
    `);
  });
});
