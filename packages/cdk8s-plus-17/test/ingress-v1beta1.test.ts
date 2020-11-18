import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import { IngressV1Beta1Backend, Service, IngressV1Beta1 } from '../src';

test('defaultChild', () => {

  const chart = Testing.chart();

  const defaultChild = Node.of(new IngressV1Beta1(chart, 'Ingress')).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('Ingress');

});

describe('IngressBackend', () => {
  describe('fromService', () => {
    test('if the service exposes a port, it will be used by the ingress', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(8899);

      // THEN
      expect(IngressV1Beta1Backend.fromService(service)._toKube()).toEqual({
        serviceName: 'test-my-service-c8493104',
        servicePort: 8899,
      });
    });

    test('fails if the service does not expose a port', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // THEN
      expect(() => IngressV1Beta1Backend.fromService(service)).toThrow(/service does not expose any ports/);
    });


    test('fails if a port is explicitly specified, and the service is exposed through a different port', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(6011);

      // THEN
      expect(() => IngressV1Beta1Backend.fromService(service, { port: 7766 })).toThrow(/backend defines port 7766 but service exposes port 6011/);
    });

    test('service exposes a single port and its the same as the backend', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(6011);

      // THEN
      expect(IngressV1Beta1Backend.fromService(service, { port: 6011 })._toKube()).toEqual({
        serviceName: 'test-my-service-c8493104',
        servicePort: 6011,
      });
    });

    test('service exposes multiple ports and the backend uses one of them', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(6011);
      service.serve(8899);
      service.serve(1011);

      // THEN
      expect(IngressV1Beta1Backend.fromService(service, { port: 8899 })._toKube()).toEqual({
        serviceName: 'test-my-service-c8493104',
        servicePort: 8899,
      });
    });

    test('fails if backend does not specify port and service exposes multiple ports', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(6011);
      service.serve(1111);

      // THEN
      expect(() => IngressV1Beta1Backend.fromService(service)).toThrow(/unable to determine service port since service exposes multiple ports/);
    });

    test('service exposes multiple ports and backend uses a different one', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');

      // WHEN
      service.serve(6011);
      service.serve(1111);

      // THEN
      expect(() => IngressV1Beta1Backend.fromService(service, { port: 1234 })).toThrow(/service exposes ports 6011,1111 but backend is defined to use port 1234/);
    });
  });
});

describe('Ingress', () => {

  describe('default backend', () => {

    test('defaultBackend property', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service', { ports: [{ port: 80 }] } );

      // WHEN
      new IngressV1Beta1(chart, 'my-ingress', {
        defaultBackend: IngressV1Beta1Backend.fromService(service),
      });

      // THEN
      expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toStrictEqual([
        {
          apiVersion: 'networking.k8s.io/v1beta1',
          kind: 'Ingress',
          metadata: { name: 'test-my-ingress-c8135042' },
          spec: {
            backend: {
              serviceName: 'test-my-service-c8493104',
              servicePort: 80,
            },
          },
        },
      ]);
    });

    test('addDefaultBackend()', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service', { ports: [{ port: 80 }] } );

      // WHEN
      const ingress = new IngressV1Beta1(chart, 'my-ingress');;
      ingress.addDefaultBackend(IngressV1Beta1Backend.fromService(service));

      // THEN
      expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toStrictEqual([
        {
          apiVersion: 'networking.k8s.io/v1beta1',
          kind: 'Ingress',
          metadata: { name: 'test-my-ingress-c8135042' },
          spec: {
            backend: {
              serviceName: 'test-my-service-c8493104',
              servicePort: 80,
            },
          },
        },
      ]);
    });

  });

  test('addHostDefaultBackend()', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new Service(chart, 'my-service', { ports: [{ port: 80 }] } );

    // WHEN
    const ingress = new IngressV1Beta1(chart, 'my-ingress');;
    ingress.addHostDefaultBackend('my.host', IngressV1Beta1Backend.fromService(service));

    // THEN
    expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toStrictEqual([
      {
        apiVersion: 'networking.k8s.io/v1beta1',
        kind: 'Ingress',
        metadata: { name: 'test-my-ingress-c8135042' },
        spec: {
          rules: [{
            host: 'my.host',
            http: {
              paths: [
                {
                  backend: {
                    serviceName: 'test-my-service-c8493104',
                    servicePort: 80,
                  },
                },
              ],
            },
          }],
        },
      },
    ]);
  });

  test('addHostRule()', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new Service(chart, 'my-service', { ports: [{ port: 80 }] } );

    // WHEN
    const ingress = new IngressV1Beta1(chart, 'my-ingress');;
    ingress.addHostRule('my.host', '/foo', IngressV1Beta1Backend.fromService(service));
    ingress.addHostRule('my.host', '/bar', IngressV1Beta1Backend.fromService(service));
    ingress.addHostRule('your.host', '/', IngressV1Beta1Backend.fromService(service));
    ingress.addHostDefaultBackend('your.host', IngressV1Beta1Backend.fromService(service));

    // THEN
    expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toStrictEqual([
      {
        apiVersion: 'networking.k8s.io/v1beta1',
        kind: 'Ingress',
        metadata: { name: 'test-my-ingress-c8135042' },
        spec: {
          rules: [
            {
              host: 'my.host',
              http: {
                paths: [
                  {
                    path: '/bar',
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                  {
                    path: '/foo',
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                ],
              },
            },
            {
              host: 'your.host',
              http: {
                paths: [
                  {
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                  {
                    path: '/',
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                ],
              },
            },
          ],
        },
      },
    ]);
  });

  test('addRule()', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new Service(chart, 'my-service', { ports: [{ port: 80 }] } );

    // WHEN
    const ingress = new IngressV1Beta1(chart, 'my-ingress');
    ingress.addRule('/foo', IngressV1Beta1Backend.fromService(service));
    ingress.addRule('/foo/bar', IngressV1Beta1Backend.fromService(service));

    // THEN
    expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toStrictEqual([
      {
        apiVersion: 'networking.k8s.io/v1beta1',
        kind: 'Ingress',
        metadata: { name: 'test-my-ingress-c8135042' },
        spec: {
          rules: [
            {
              http: {
                paths: [
                  {
                    path: '/foo',
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                  {
                    path: '/foo/bar',
                    backend: {
                      serviceName: 'test-my-service-c8493104',
                      servicePort: 80,
                    },
                  },
                ],
              },
            },
          ],
        },
      },
    ]);
  });

  test('define rules upon initialization', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new Service(chart, 'my-service');
    service.serve(4000);

    // WHEN
    new IngressV1Beta1(chart, 'my-ingress', {
      rules: [
        { backend: IngressV1Beta1Backend.fromService(service) }, // default backend
        { host: 'foo.bar', backend: IngressV1Beta1Backend.fromService(service) },
        { path: '/just/path', backend: IngressV1Beta1Backend.fromService(service) },
        { host: 'host.and', path: '/path', backend: IngressV1Beta1Backend.fromService(service) },
        { host: 'host.and', path: '/path/2', backend: IngressV1Beta1Backend.fromService(service) },
      ],
    });

    // THEN
    const expectedBackend = { serviceName: 'test-my-service-c8493104', servicePort: 4000 };
    expect(Testing.synth(chart).filter(x => x.kind === 'Ingress')).toEqual([
      {
        apiVersion: 'networking.k8s.io/v1beta1',
        kind: 'Ingress',
        metadata: {
          name: 'test-my-ingress-c8135042',
        },
        spec: {
          backend: expectedBackend,
          rules: [
            { host: 'foo.bar', http: { paths: [{ backend: expectedBackend }] } },
            { http: { paths: [{ path: '/just/path', backend: expectedBackend }] } },
            {
              host: 'host.and',
              http: {
                paths: [
                  { path: '/path', backend: expectedBackend },
                  { path: '/path/2', backend: expectedBackend },
                ],
              },
            },
          ],
        },
      },
    ]);
  });

  describe('fails for duplicate rules', () => {

    test('using addDefaultBackend()', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');
      service.serve(4000);

      // WHEN
      const ingress = new IngressV1Beta1(chart, 'ingress', {
        defaultBackend: IngressV1Beta1Backend.fromService(service),
      });

      // THEN
      expect(() => ingress.addDefaultBackend(IngressV1Beta1Backend.fromService(service))).toThrow(/a default backend is already defined for this ingress/);

    });

    test('defaultBackend and rules', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');
      service.serve(4000);

      // THEN
      expect(() => new IngressV1Beta1(chart, 'ingress', {
        defaultBackend: IngressV1Beta1Backend.fromService(service),
        rules: [{ backend: IngressV1Beta1Backend.fromService(service) }],
      })).toThrow(/a default backend is already defined for this ingress/);
    });

    test('two rules for the same path (no host)', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');
      service.serve(4000);
      const ingress = new IngressV1Beta1(chart, 'ingress');

      // WHEN
      ingress.addRule('/foo', IngressV1Beta1Backend.fromService(service));
      expect(() => ingress.addRule('/foo', IngressV1Beta1Backend.fromService(service))).toThrow(/there is already an ingress rule for \/foo/);
    });

    test('two rules for the same path and host', () => {
      // GIVEN
      const chart = Testing.chart();
      const service = new Service(chart, 'my-service');
      service.serve(4000);
      const ingress = new IngressV1Beta1(chart, 'ingress');

      // WHEN
      ingress.addHostRule('hello.io', '/foo', IngressV1Beta1Backend.fromService(service));
      expect(() => ingress.addHostRule('hello.io', '/foo', IngressV1Beta1Backend.fromService(service))).toThrow(/there is already an ingress rule for hello.io\/foo/);
    });
  });

  test('fails if path does not begin with "/"', () => {
    // GIVEN
    const chart = Testing.chart();
    const service = new Service(chart, 'my-service');
    service.serve(4000);
    const ingress = new IngressV1Beta1(chart, 'ingress');

    // THEN
    expect(() => ingress.addRule('bad/path', IngressV1Beta1Backend.fromService(service))).toThrow(/ingress paths must begin with a "\/": bad\/path/);
  });

});
