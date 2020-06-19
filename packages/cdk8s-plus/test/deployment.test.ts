import * as kplus from '../src';
import * as k8s from '../imports/k8s';
import { Testing } from 'cdk8s';
import { Node } from 'constructs';

describe('DeploymentSpec', () => {

  test('Can select labels', () =>{

    const spec = new kplus.DeploymentSpec();
    spec.template.podSpec.addContainer(new kplus.Container({
      image: 'image',
    }))

    const chart = Testing.chart();

    spec.selectByLabel('key', 'value');

    const actual: k8s.LabelSelector = spec._toKube(Node.of(chart)).selector;

    const expected: k8s.LabelSelector = {
      matchLabels: {
        'key': 'value',
        'cdk8s.deployment': Node.of(chart).uniqueId,
      },
    }

    expect(actual).toEqual(expected);

  });

});

describe('Deployment', () => {

  test('Can be exposed as via service', () => {

    const chart = Testing.chart();

    const deployment = new kplus.Deployment(chart, 'Deployment');
    deployment.spec.template.podSpec.addContainer(new kplus.Container({
      image: 'image',
      port: 9300,
    }))

    const service = deployment.expose({port: 9200, serviceType: kplus.ServiceType.LOAD_BALANCER});

    const actual = service.spec._toKube();

    expect(actual.type).toEqual('LoadBalancer');
    expect(actual.selector).toEqual({
      'cdk8s.deployment': Node.of(deployment).uniqueId,
    })
    expect(actual.ports![0].port).toEqual(9200);
    expect(actual.ports![0].targetPort).toEqual(9300);

  });
});