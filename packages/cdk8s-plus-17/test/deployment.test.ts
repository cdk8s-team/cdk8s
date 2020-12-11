import { Testing, ApiObject } from 'cdk8s';
import { Node } from 'constructs';
import * as kplus from '../src';

test('defaultChild', () => {

  const chart = Testing.chart();

  const defaultChild = Node.of(new kplus.Deployment(chart, 'Deployment')).defaultChild as ApiObject;

  expect(defaultChild.kind).toEqual('Deployment');

});

test('A label selector is automatically allocated', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');
  deployment.addContainer({ image: 'foobar' });

  const expectedValue = 'test-Deployment-c83f5e59';
  const expectedSelector = { 'cdk8s.deployment': expectedValue };

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);
  expect(spec.template.metadata?.labels).toEqual(expectedSelector);

  // assert the deployment object has it.
  expect(deployment.labelSelector).toEqual(expectedSelector);

});

test('No selector is generated if "defaultSelector" is false', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    defaultSelector: false,
    containers: [{ image: 'foobar' }],
  });

  // assert the k8s spec doesnt have it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual({});
  expect(spec.template.metadata?.labels).toEqual(undefined);

  // assert the deployment object doesnt have it.
  expect(deployment.labelSelector).toEqual({});

});

test('Can select by label', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
      },
    ],
    defaultSelector: false,
  });

  const expectedSelector = { foo: 'bar' };

  deployment.selectByLabel('foo', expectedSelector.foo);

  // assert the k8s spec has it.
  const spec = Testing.synth(chart)[0].spec;
  expect(spec.selector.matchLabels).toEqual(expectedSelector);

  // assert the deployment object has it.
  expect(deployment.labelSelector).toEqual(expectedSelector);

});

test('Can be exposed as via service', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        port: 9300,
      },
    ],
  });

  deployment.expose(9200, { serviceType: kplus.ServiceType.LOAD_BALANCER });

  const spec = Testing.synth(chart)[1].spec;
  expect(spec.type).toEqual('LoadBalancer');
  expect(spec.selector).toEqual({ 'cdk8s.deployment': 'test-Deployment-c83f5e59' });
  expect(spec.ports![0].port).toEqual(9200);
  expect(spec.ports![0].targetPort).toEqual(9300);

});

test('Expose uses the correct default values', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        port: 9300,
      },
    ],
  });

  deployment.expose(9200);

  const spec = Testing.synth(chart)[1].spec;
  expect(spec.type).toEqual('ClusterIP');
  expect(spec.ports![0].targetPort).toEqual(9300);

});

test('Expose can set service and port details', () => {
  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        port: 9300,
      },
    ],
  });

  deployment.expose(
    9200,
    {
      name: 'test-srv',
      serviceType: kplus.ServiceType.CLUSTER_IP,
      protocol: kplus.Protocol.UDP,
      targetPort: 9300,
    },
  );

  const srv = Testing.synth(chart)[1];
  const spec = srv.spec;

  expect(srv.metadata.name).toEqual('test-srv');
  expect(spec.type).toEqual('ClusterIP');
  expect(spec.selector).toEqual({
    'cdk8s.deployment': 'test-Deployment-c83f5e59',
  });
  expect(spec.ports![0].port).toEqual(9200);
  expect(spec.ports![0].targetPort).toEqual(9300);
  expect(spec.ports![0].protocol).toEqual('UDP');
});

test('Expose can set service by port name', () => {
  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        ports: [{
          port: 9300,
          name: 'port',
        }],
      },
    ],
  });

  deployment.expose(
    9200,
    {
      targetPort: 'port',
    },
  );

  const srv = Testing.synth(chart)[1];
  const spec = srv.spec;

  expect(spec.ports![0].targetPort).toEqual('port');
});

test('Cannot be exposed if there are no such port in spec', () => {
  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        port: 9300,
      },
    ],
  });

  expect(() => deployment.expose(9000, { targetPort: 9000 })).toThrow();
});

test('Cannot be exposed if there are no containers in spec', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');

  expect(() => deployment.expose(9000)).toThrowError(
    'Cannot expose a deployment without containers',
  );
});

test('Synthesizes spec lazily', () => {

  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');
  deployment.addContainer(
    {
      image: 'image',
      port: 9300,
    },
  );

  const container = Testing.synth(chart)[0].spec.template.spec.containers[0];

  expect(container.image).toEqual('image');
  expect(container.ports[0].containerPort).toEqual(9300);

});

test('Ports must be unique in a deployment', () => {
  const chart = Testing.chart();

  expect(() => new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        port: 9300,
      },
      {
        image: 'image2',
        port: 9300,
      },
    ],
  })).toThrow();
});

test('Port names must be unique in a deployment', () => {
  const chart = Testing.chart();

  expect(() => new kplus.Deployment(chart, 'Deployment', {
    containers: [
      {
        image: 'image',
        ports: [{
          port: 80,
          name: 'web',
        }],
      },
      {
        image: 'image2',
        ports: [{
          port: 8080,
          name: 'web',
        }],
      },
    ],
  })).toThrow();
});

test('lookupPort should preserve reference', () => {
  const chart = Testing.chart();

  const deployment = new kplus.Deployment(chart, 'Deployment');
  const container = deployment.addContainer({
    image: 'image',
  });
  const port = container.expose(80);

  expect(container.lookupPort(80)).toBe(port);
});

test('lookupPort should aware of the port object ownership', () => {
  const chart = Testing.chart();

  const deployment1 = new kplus.Deployment(chart, 'Deployment1');
  const container1 = deployment1.addContainer({
    image: 'image',
  });
  const port1 = container1.expose(80);

  const deployment2 = new kplus.Deployment(chart, 'Deployment2');
  const container2 = deployment1.addContainer({
    image: 'image',
  });
  container2.expose(80);

  expect(deployment2.lookupPort(port1)).toBeUndefined();
});