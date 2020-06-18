import * as kplus from '../lib';
import * as k8s from '../imports/k8s';
import { RestartPolicy } from '../lib';
import { Testing } from 'cdk8s';

describe('PodSpec', () => {

  test('Can add container post instantiation', () => {

    const spec = new kplus.PodSpec();

    const container = new kplus.Container({
      image: 'image',
    });

    spec.addContainer(container);

    const actual: k8s.Container[] = spec._toKube().containers;

    expect(actual[0].image).toEqual('image')

  });

  test('Must have at least one container', () => {

    const spec = new kplus.PodSpec();

    expect(() => spec._toKube()).toThrow('PodSpec must have at least 1 container');

  });

  test('Can add volume post instantiation', () => {

    const spec = new kplus.PodSpec();

    const volume = kplus.Volume.fromEmptyDir('volume');

    // spec must have at least container
    spec.addContainer(new kplus.Container({
      image: 'image',
    }));

    spec.addVolume(volume);

    const actual: k8s.Volume[] = spec._toKube().volumes!;

    expect(actual[0].name).toEqual('volume')
    expect(actual[0].emptyDir).toBeTruthy();

  });

  test('Instantiation properties are all respected', () => {

    const spec = new kplus.PodSpec({
      containers: [new kplus.Container({
        image: 'image',
        name: 'container',
      })],
      volumes: [kplus.Volume.fromEmptyDir('volume')],
      restartPolicy: RestartPolicy.ALWAYS,
      serviceAccout: kplus.ServiceAccount.fromServiceAccountName('serviceAccount'),
    })

    const actual: k8s.PodSpec = spec._toKube();

    const expected: k8s.PodSpec = {
      containers: [{
        name: 'container',
        image: 'image',
        env: [],
        command: undefined,
        ports: [],
        volumeMounts: [],
        workingDir: undefined,
      }],
      volumes: [{
        name: 'volume',
        emptyDir: {
          medium: undefined,
          sizeLimit: undefined,
        },
      }],
      restartPolicy: 'Always',
      serviceAccountName: 'serviceAccount',
    }

    expect(actual).toEqual(expected);

  });

  test('Automatically adds volumes from container mounts', () => {

    const spec = new kplus.PodSpec();

    const volume = kplus.Volume.fromEmptyDir('volume');

    const container = new kplus.Container({
      image: 'image',
    });

    container.mount('/path/to/mount', volume);

    spec.addContainer(container);

    // make sure the volume configured in the mount exist on the pod spec.
    const actual: k8s.Volume[] = spec._toKube().volumes!;

    expect(actual[0].name).toEqual('volume')
    expect(actual[0].emptyDir).toBeTruthy();


  });

});

describe('Pod', () => {

  test('Can instantiate without props', () => {

    const chart = Testing.chart();

    const pod = new kplus.Pod(chart, 'Pod');

    expect(pod.spec).toBeDefined();
    expect(pod.name).toBeDefined();
    expect(pod.apiObject).toBeDefined();

  });

  test('Can instantiate with properties', () => {

    const spec = new kplus.PodSpec({
      containers: [new kplus.Container({
        image: 'image',
      })],
    });

    const metadata = new kplus.ObjectMeta({
      name: 'name',
    })

    const chart = Testing.chart();

    const pod = new kplus.Pod(chart, 'Pod', {
      metadata: metadata,
      spec: spec,
    });

    expect(pod.spec).toBeDefined();
    expect(pod.name).toEqual('name');
    expect(pod.apiObject).toBeDefined();

  });

});
