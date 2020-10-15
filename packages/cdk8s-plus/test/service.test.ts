import * as kplus from '../src';
import * as k from '../src/imports/k8s';
import { Testing } from 'cdk8s';

describe('ServiceSpecDefinition', () => {
  test('Instantiation properties are all accepted', () => {
    const ports = [{ port: 9000, targetPort: 80, nodePort: 30080 }];
    const externalIPs = ['ExternalIP'];
    const spec = new kplus.ServiceSpecDefinition({
      clusterIP: 'IP',
      externalIPs: externalIPs,
      ports: ports,
      type: kplus.ServiceType.LOAD_BALANCER,
    });

    const actual: k.ServiceSpec = spec._toKube();

    expect(actual.clusterIP).toEqual('IP');
    expect(actual.externalIPs).toEqual(externalIPs);
    expect(actual.ports).toEqual(ports);
    expect(actual.type).toEqual('LoadBalancer');
  });

  test('Must be configured with at least one port', () => {
    const spec = new kplus.ServiceSpecDefinition();

    expect(() => spec._toKube()).toThrowError(
      'A service must be configured with a port',
    );
  });

  test('Can select by label', () => {
    const spec = new kplus.ServiceSpecDefinition({
      ports: [{ port: 9000, targetPort: 80, nodePort: 30080 }],
    });

    spec.addSelector('key', 'value');

    const actual: k.ServiceSpec = spec._toKube();

    expect(actual.selector).toEqual({ key: 'value' });
  });

  test('Can serve by port', () => {
    const spec = new kplus.ServiceSpecDefinition();

    spec.serve(9000, { targetPort: 80, nodePort: 30080 });

    const actual: k.ServiceSpec = spec._toKube();

    expect(actual.ports).toEqual([ { port: 9000, targetPort: 80, nodePort: 30080 } ]);
  });

  test('AddDeployment() fails if the deployment does not have any containers', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'service');
    const dep = new kplus.Deployment(chart, 'dep');

    // THEN
    expect(() => service.addDeployment(dep, 1122)).toThrow(/Cannot expose a deployment without containers/);
  });

});

describe('Service', () => {
  test('Can accept an existing spec', () => {
    const chart = Testing.chart();
    const spec: kplus.ServiceSpec = {
      clusterIP: 'cluster-ip',
    }
    const service = new kplus.Service(chart, 'Service', {
      spec: spec,
    });

    expect(service.spec.clusterIP).toEqual('cluster-ip');
  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'Service');

    service.spec.addSelector('key', 'value');
    service.spec.serve(9000);

    expect(Testing.synth(chart)).toMatchInlineSnapshot(`
      Array [
        Object {
          "apiVersion": "v1",
          "kind": "Service",
          "metadata": Object {
            "name": "test-service-pod-9164a1e2",
          },
          "spec": Object {
            "externalIPs": Array [],
            "ports": Array [
              Object {
                "port": 9000,
              },
            ],
            "selector": Object {
              "key": "value",
            },
            "type": "ClusterIP",
          },
        },
      ]
    `);
  });

  test('AddDeployment() can be used to associate a deployment with a service', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'service');
    const dep = new kplus.Deployment(chart, 'dep');
    dep.spec.podSpecTemplate.addContainer(new kplus.Container({ image: 'foo', port: 7777 }));

    // WHEN
    service.addDeployment(dep, 1122);

    // THEN
    const expectedSelector = {'cdk8s.deployment': 'test-dep-b18049c6'};
    expect(dep.spec._toKube().selector.matchLabels).toEqual(expectedSelector);
    expect(dep.spec._toKube().template.metadata?.labels).toEqual(expectedSelector);
    expect(service.spec._toKube()).toEqual({
      clusterIP: undefined, 
      externalIPs: [], 
      ports: [{
        nodePort: undefined, 
        port: 1122, 
        targetPort: 7777,
      }], 
      selector: expectedSelector, 
      type: 'ClusterIP',
    });
  });
  
  test('addDeployment() fails if the deployment dose not have a label selector', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'service');
    const dep = new kplus.Deployment(chart, 'dep', { 
      defaultSelector: false,
      spec: {
        podSpecTemplate: {
          containers: [ new kplus.Container({ image: 'foo' }) ],
        },
      },
    });

    // THEN
    expect(() => service.addDeployment(dep, 1122)).toThrow(/deployment does not have a label selector/);
  });

  test('addDeployment() fails if a selector is already defined for this service', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'service');
    const dep1 = new kplus.Deployment(chart, 'dep1', {
      spec: {
        podSpecTemplate: {
          containers: [ new kplus.Container({ image: 'foo' }) ],
        },
      },
    });
    service.spec.addSelector('random', 'selector');

    // THEN
    expect(() => service.addDeployment(dep1, 1010)).toThrow(/a selector is already defined for this service. cannot add a deployment/);
  });
});
