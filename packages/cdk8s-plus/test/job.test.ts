import * as kplus from '../src';
import { Testing } from 'cdk8s';
import { RestartPolicy } from '../src';

test('Applies default restart policy to pod spec', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    podSpec: {
      containers: [ new kplus.Container({ image: 'image' }) ],
    },
    ttlAfterFinished: kplus.Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Never');

  // assert the job object has it.
  expect(job.podSpec.restartPolicy).toEqual(RestartPolicy.NEVER);

});

test('Does not modify existing restart policy of pod spec', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    podSpec: {
      containers: [ new kplus.Container({ image: 'image' }) ],
      restartPolicy: RestartPolicy.ALWAYS,
    },
    ttlAfterFinished: kplus.Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Always');

  // assert the job object has it.
  expect(job.podSpec.restartPolicy).toEqual(RestartPolicy.ALWAYS);

});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job');

  job.podSpec.addContainer(
    new kplus.Container({
      image: 'image',
    }),
  );

  const container = Testing.synth(chart)[0].spec.template.spec.containers[0];
  expect(container.image).toEqual('image');

});
