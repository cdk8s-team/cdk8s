import * as kplus from '../lib';
import * as k8s from '../imports/k8s';

describe('spec', () => {

  test('addContainer', () => {

    const spec = new kplus.PodSpec();

    const container = new kplus.Container({
      image: 'image',
    });

    spec.addContainer(container);

    const expected: k8s.PodSpec = spec._toKube();

    expect(expected.containers).toEqual([
      {
        command: undefined,
        env: [],
        ports: [],
        volumeMounts: [],
        workingDir: undefined,
        name: 'main',
        image: 'image',
      } as k8s.Container,
    ])

  });

});
