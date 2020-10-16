import * as kplus from '../src';
import * as k8s from '../src/imports/k8s';
import { Names, Testing } from 'cdk8s';
import { Node } from 'constructs';

describe('DeploymentSpecDefinition', () => {

  test('Instantiation properties are all respected', () => {
    const chart = Testing.chart();
    new kplus.Deployment(chart, 'Deployment');
    const spec = new kplus.DeploymentSpecDefinition({
      replicas: 3,
      podSpec: {
        serviceAccount: kplus.ServiceAccount.fromServiceAccountName('my-service-account'),
        containers: [
          new kplus.Container({ image: 'my-image' }),
        ],
      },
    });

    const actual: k8s.DeploymentSpec = spec._toKube();

    expect(actual.replicas).toEqual(3);
    expect(spec.podSpec.serviceAccount?.name).toBe('my-service-account');
    expect(spec.podSpec.containers[0].image).toBe('my-image');
  });

  test('A label selector is automatically allocated', () => {
    // GIVEN
    const chart = Testing.chart();

    const d = new kplus.Deployment(chart, 'Deployment');
    d.spec.podSpec.addContainer(new kplus.Container({ image: 'foobar' }));

    const spec = d.spec._toKube();

    const expectedSelector = { 'cdk8s.deployment': 'test-Deployment-9e0110cd' };
    expect(spec.selector.matchLabels).toEqual(expectedSelector);
    expect(spec.template.metadata?.labels).toEqual(expectedSelector);
  });

  test('No selector is generated if "defaultSelector" is false', () => {
    // GIVEN
    const chart = Testing.chart();

    // WHEN
    const d = new kplus.Deployment(chart, 'Deployment', {
      defaultSelector: false,
      podSpec: {
        containers: [ new kplus.Container({ image: 'foobar' }) ],
      },
    });

    const spec = d.spec._toKube();
    expect(spec.selector.matchLabels).toEqual({});
    expect(spec.template.metadata?.labels).toEqual(undefined);
  });

  test('Can select labels', () => {
    const spec = new kplus.DeploymentSpecDefinition();

    spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
      }),
    );

    const chart = Testing.chart();
    new kplus.Deployment(chart, 'Deployment');

    spec.selectByLabel('key', 'value');

    const actual: k8s.LabelSelector = spec._toKube().selector;

    const expected: k8s.LabelSelector = {
      matchLabels: {
        key: 'value',
      },
    };

    expect(actual).toEqual(expected);
  });
});

describe('Deployment', () => {
  test('Can be exposed as via service', () => {
    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');
    deployment.spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
        port: 9300,
      }),
    );

    const service = deployment.expose(9200, {
      serviceType: kplus.ServiceType.LOAD_BALANCER,
    });

    const actual = service.spec._toKube();

    expect(actual.type).toEqual('LoadBalancer');
    expect(actual.selector).toEqual({
      'cdk8s.deployment': Names.toLabelValue(Node.of(deployment).path),
    });
    expect(actual.ports![0].port).toEqual(9200);
    expect(actual.ports![0].targetPort).toEqual(9300);
  });

  test('Expose uses the correct default values', () => {

    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');

    deployment.spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
        port: 9300,
      }),
    );

    const service = deployment.expose(9200);

    const actual = service.spec._toKube();

    expect(actual.type).toEqual('ClusterIP');
    expect(actual.selector).toEqual({
      'cdk8s.deployment': Names.toLabelValue(Node.of(deployment).path),
    });
    expect(actual.ports![0].port).toEqual(9200);
    expect(actual.ports![0].targetPort).toEqual(9300);

  });

  test('Cannot be exposed if there are no containers in spec', () => {
    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');

    expect(() => deployment.expose(9000)).toThrowError(
      'Cannot expose a deployment without containers',
    );
  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const deployment = new kplus.Deployment(chart, 'Deployment');
    deployment.spec.podSpec.addContainer(
      new kplus.Container({
        image: 'image',
        port: 9300,
      }),
    );

    const actual = Testing.synth(chart)[0].spec.template.spec.containers[0];

    // make sure the container exists in the spec even though it was added
    // post instatiation.
    expect(actual.image).toEqual('image');
    expect(actual.ports[0].containerPort).toEqual(9300);

  });

  test('Can be instantiated with an existing spec', () => {

    const chart = Testing.chart();
    new kplus.Deployment(chart, 'Deployment', {
      podSpec: {
        containers: [new kplus.Container({
          image: 'image',
          port: 9300,
        })],
      },
    });

    const actual = Testing.synth(chart)[0].spec.template.spec.containers[0];

    expect(actual.image).toEqual('image');
    expect(actual.ports[0].containerPort).toEqual(9300);

  });
});
