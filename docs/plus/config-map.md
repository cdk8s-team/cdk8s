# ConfigMap

ConfigMap are used to store configuration data. They provide a dictionary based
data structure that can be consumed in various shapes and forms.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-17/typescript.md#configmap)

## Use an existing `ConfigMap`

You can reference to an existing `ConfigMap` like so. Note that this does not create a new object,
and will therefore not be included in the resulting manifest.

```typescript
import * as kplus from 'cdk8s-plus-17';

const config: kplus.IConfigMap = kplus.ConfigMap.fromConfigMapName('config');

// the 'config' constant can later be used by API's that require an IConfigMap.
// for example when creating a volume.
const volume = kplus.Volume.fromConfigMap(config);
```

## Adding data

You can create config maps and add some data to them like so:

```typescript
import * as kplus from 'cdk8s-plus-17';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const config = new kplus.ConfigMap(chart, 'Config');
config.addData('url', 'https://my-endpoint:8080');
```

## Creating a volume from a directory

Here is a nifty little trick you can use to create a volume that contains a directory on the client machine (machine that runs `cdk8s synth`):

```typescript
import * as kplus from 'cdk8s-plus-17';
import * as k from 'cdk8s';
import * as path from 'path';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const appMap = new kplus.ConfigMap(chart, 'Config');

// add the files in the directory to the config map.
// this will create a key for each file.
// note that only top level files will be included, sub-directories are not yet supported.
appMap.addDirectory(path.join(__dirname, 'app'));

const appVolume = kplus.Volume.fromConfigMap(appMap);

const mountPath = '/var/app';
const pod = new kplus.Pod(chart, 'Pod');
const container = pod.addContainer({
  image: 'node',
  command: [ 'node', 'app.js' ],
  workingDir: mountPath,
});

// from here, just mount the volume to a container, and run your app!
container.mount(mountPath, appVolume);
```
