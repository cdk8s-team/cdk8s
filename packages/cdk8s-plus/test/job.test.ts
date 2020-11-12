import { Testing } from 'cdk8s';
import { Container, Duration, Job, RestartPolicy } from '../src';

test('Applies default restart policy to pod spec', () => {

  const chart = Testing.chart();

  const job = new Job(chart, 'Job', {
    containers: [new Container({ image: 'image' })],
    ttlAfterFinished: Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Never');

  // assert the job object has it.
  expect(job.restartPolicy).toEqual(RestartPolicy.NEVER);

});

test('Does not modify existing restart policy of pod spec', () => {

  const chart = Testing.chart();

  const job = new Job(chart, 'Job', {
    containers: [new Container({ image: 'image' })],
    restartPolicy: RestartPolicy.ALWAYS,
    ttlAfterFinished: Duration.seconds(1),
  });

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.template.spec?.restartPolicy).toEqual('Always');

  // assert the job object has it.
  expect(job.restartPolicy).toEqual(RestartPolicy.ALWAYS);

});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const job = new Job(chart, 'Job');

  job.addContainer(
    new Container({
      image: 'image',
    }),
  );

  const container = Testing.synth(chart)[0].spec.template.spec.containers[0];
  expect(container.image).toEqual('image');

});
