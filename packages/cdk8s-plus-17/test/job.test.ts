import { Testing, Duration, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('defaultChild', () => {

  const chart = Testing.chart();

  const defaultChild = Node.of(new kplus.Job(chart, 'Job')).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('Job');

});

test('Allows setting all options', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    containers: [new kplus.Container({ image: 'image' })],
    activeDeadline: Duration.seconds(20),
    backoffLimit: 4,
    completions: 5,
    parallelism: 2,
    ttlAfterFinished: Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;

  expect(spec.activeDeadlineSeconds).toEqual(20);
  expect(spec.backoffLimit).toEqual(job.backoffLimit);
  expect(spec.completions).toEqual(job.completions);
  expect(spec.parallelism).toEqual(job.parallelism);
  expect(spec.ttlSecondsAfterFinished).toEqual(1);

  // assert the job object has it.
  expect(job.restartPolicy).toEqual(kplus.RestartPolicy.NEVER);

});

test('Applies default restart policy to pod spec', () => {

  const chart = Testing.chart();

  const job = new kplus.Job(chart, 'Job', {
    containers: [{ image: 'image' }],
    ttlAfterFinished: Duration.seconds(1),
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
    ttlAfterFinished: Duration.seconds(1),
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
