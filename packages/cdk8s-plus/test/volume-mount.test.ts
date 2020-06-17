import * as kplus from '../lib';

test('Instantiation properties are all respected', () => {

  const volume = kplus.Volume.fromConfigMap(kplus.ConfigMap.fromConfigMapName('ConfigMap'));

  const mount = new kplus.VolumeMount({
    path: '/path/to/mount',
    volume: volume,
  })

  expect(mount.path).toEqual('/path/to/mount');
  expect(mount.volume).toEqual(volume);

});
