import * as kplus from '../src';
import * as k8s from '../src/imports/k8s';
import { Testing } from 'cdk8s';
import { Node } from 'constructs';

describe('DeploymentSpecDefinition', () => {

  test('Instantiation properties are all respected', () => {
    const chart = Testing.chart();
    const deployment = new kplus.Deployment(chart, 'Deployment');
    const spec = new kplus.DeploymentSpecDefinition({
      replicas: 3,
      podSpecTemplate: {
        serviceAccount: kplus.ServiceAccount.fromServiceAccountName('my-service-account'),
        containers: [
          new kplus.Container({ image: 'my-image' }),
        ],
      },
    });

    const actual: k8s.DeploymentSpec = spec._toKube(deployment);

    expect(actual.replicas).toEqual(3);
    expect(spec.podSpecTemplate.serviceAccount?.name).toBe('my-service-account');
    expect(spec.podSpecTemplate.containers[0].image).toBe('my-image');
  });

  test('Can select labels', () => {
    const spec = new kplus.DeploymentSpecDefinition();

    spec.podSpecTemplate.addContainer(
      new kplus.Container({
        image: 'image',
      }),
    );

    const chart = Testing.chart();
    const deployment = new kplus.Deployment(chart, 'Deployment');

    spec.selectByLabel('key', 'value');

    const actual: k8s.LabelSelector = spec._toKube(deployment).selector;

    const expected: k8s.LabelSelector = {
      matchLabels: {
        'key': 'value',
        'cdk8s.deployment': Node.of(deployment).uniqueId,
      },
    };

    expect(actual).toEqual(expected);
  });
});

describe('Deployment', () => {
  test('Can be exposed as via service', () => {
    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');
    deployment.spec.podSpecTemplate.addContainer(
      new kplus.Container({
        image: 'image',
        port: 9300,
      }),
    );

    const service = deployment.expose({
      port: 9200,
      serviceType: kplus.ServiceType.LOAD_BALANCER,
    });

    const actual = service.spec._toKube();

    expect(actual.type).toEqual('LoadBalancer');
    expect(actual.selector).toEqual({
      'cdk8s.deployment': Node.of(deployment).uniqueId,
    });
    expect(actual.ports![0].port).toEqual(9200);
    expect(actual.ports![0].targetPort).toEqual(9300);
  });

  test('Expose uses the correct default values', () => {

    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');

    deployment.spec.podSpecTemplate.addContainer(
      new kplus.Container({
        image: 'image',
        port: 9300,
      }),
    );

    const service = deployment.expose({
      port: 9200,
    });

    const actual = service.spec._toKube();

    expect(actual.type).toEqual('ClusterIP');
    expect(actual.selector).toEqual({
      'cdk8s.deployment': Node.of(deployment).uniqueId,
    });
    expect(actual.ports![0].port).toEqual(9200);
    expect(actual.ports![0].targetPort).toEqual(9300);

  });

  test('Cannot be exposed if there are no containers in spec', () => {
    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');

    expect(() => deployment.expose({ port: 9000 })).toThrowError(
      'Cannot expose a deployment without containers',
    );
  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const deployment = new kplus.Deployment(chart, 'Deployment');
    deployment.spec.podSpecTemplate.addContainer(
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

    const spec = {
      podSpecTemplate: {
        containers: [new kplus.Container({
          image: 'image',
          port: 9300,
        })],
      },
    };

    const chart = Testing.chart();
    new kplus.Deployment(chart, 'Deployment', {
      spec: spec,
    });

    const actual = Testing.synth(chart)[0].spec.template.spec.containers[0];

    expect(actual.image).toEqual('image');
    expect(actual.ports[0].containerPort).toEqual(9300);

  });
});
