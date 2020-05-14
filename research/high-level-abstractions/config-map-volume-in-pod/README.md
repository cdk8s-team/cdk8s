# ConfigMap as Pod Volume

## Motivation

A common pattern in Kubernetes is to use a ConfigMap to store the contents of some configuration and make it available to a pod via a volume (see [docs](https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/#populate-a-volume-with-data-stored-in-a-configmap)):

In short, here is what you have to do to make this happen:

1.	Use kubectl to define a ConfigMap from a directory: 

    `kubectl create configmap my-config --from-file=./config`

2.	Define the pod through this YAML:

    ```yaml
    apiVersion: v1
    kind: Pod
    metadata:
      name: dapi-test-pod
    spec:
      containers:
        - name: test-container
          image: k8s.gcr.io/busybox
          command: [ "/bin/sh", "-c", "ls /etc/config/" ]
          volumeMounts:
          - name: config-volume
            mountPath: /etc/config
      volumes:
        - name: config-volume
          configMap:
            name: my-config
      restartPolicy: Never
    ```

## API Suggestion

In contrast, suppose we had an API of this sorts:

```typescript
// define a config map with all the files in a local dir
const config = ConfigMap.fromDirectory(this, './config');

// define a pod
const pod = new Pod(this, 'dapi-test-pod');

// add the config map as a volume
const volume = pod.addConfigMapVolume(config);

// add a container to the pod and mount the files
// to /etc/config, and print them on initialization
const container = pod.addContainer('test-container');
container.image = 'k8s.gcr.io/busybox';
container.mount(volume, '/etc/config'); // <-- NICE!
container.command = "/bin/sh", "-c", "ls /etc/config/";
container.restartPolicy = PodRestartPolicy.NEVER;
```
