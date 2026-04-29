import { App, Chart, Service, Testing } from '../../src';

describe('service', () => {
 test('allows headless service without ports', () => {
    const app = new App();
    const chart = new Chart(app, 'test');

    new Service(chart, 'Service', {
      clusterIP: 'None',
      selector: {
        app: 'foo',
      },
    });

    const manifests = Testing.synth(chart);
    const service = manifests.find((m) => m.kind === 'Service') as any;

    expect(service).toMatchObject({
      spec: {
        clusterIP: 'None',
      },
    });
    expect(service.spec.ports ?? []).toEqual([]);
 });

 test('requires a port for non-headless services', () => {
    const app = new App();
    const chart = new Chart(app, 'test');

    expect(() => {
      new Service(chart, 'Service', {
        selector: {
          app: 'foo',
        },
      });

      Testing.synth(chart);
    }).toThrow(/port/i);
 });
});
