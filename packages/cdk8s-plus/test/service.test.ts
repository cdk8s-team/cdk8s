import * as kplus from '../src';
import * as k from '../src/imports/k8s';
import { Testing } from 'cdk8s';

describe('ServiceSpec', () => {
  test('Instantiation properties are all accepted', () => {
    const ports = [{ port: 9000, targetPort: 80 }];
    const externalIPs = ['ExternalIP'];
    const spec = new kplus.ServiceSpec({
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
    const spec = new kplus.ServiceSpec();

    expect(() => spec._toKube()).toThrowError(
      'A service must be configured with a port',
    );
  });

  test('Can select by label', () => {
    const spec = new kplus.ServiceSpec({
      ports: [{ port: 9000, targetPort: 80 }],
    });

    spec.selectByLabel('key', 'value');

    const actual: k.ServiceSpec = spec._toKube();

    expect(actual.selector).toEqual({ key: 'value' });
  });

  test('Can serve by port', () => {
    const spec = new kplus.ServiceSpec();

    const port = { port: 9000, targetPort: 80 };
    spec.serve(port);

    const actual: k.ServiceSpec = spec._toKube();

    expect(actual.ports).toEqual([port]);
  });
});

describe('Service', () => {
  test('Can accept an existing spec', () => {
    const chart = Testing.chart();
    const spec = new kplus.ServiceSpec();
    const service = new kplus.Service(chart, 'Service', {
      spec: spec,
    });

    expect(service.spec).toBe(spec);
  });

  test('Generates spec lazily', () => {
    const chart = Testing.chart();
    const service = new kplus.Service(chart, 'Service');

    service.spec.selectByLabel('key', 'value');
    service.spec.serve({ port: 9000 });

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
});
