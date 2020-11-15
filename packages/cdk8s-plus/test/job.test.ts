import { Testing } from 'cdk8s';
import * as kplus from '../src';

test('Applies default restart policy to pod spec', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    containers: [{ image: 'image' }],
    ttlAfterFinished: kplus.Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Never');

  // assert the job object has it.
  expect(job.restartPolicy).toEqual(kplus.RestartPolicy.NEVER);

});

test('Does not modify existing restart policy of pod spec', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    containers: [{ image: 'image' }],
    restartPolicy: kplus.RestartPolicy.ALWAYS,
    ttlAfterFinished: kplus.Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Always');

  // assert the job object has it.
  expect(job.restartPolicy).toEqual(kplus.RestartPolicy.ALWAYS);

});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job');

  job.addContainer(
    {
      image: 'image',
    },
  );

  const container = Testing.synth(chart)[0].spec.template.spec.containers[0];
  expect(container.image).toEqual('image');

});
