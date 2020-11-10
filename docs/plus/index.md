# Overview

**cdk8s+** is a library with high level abstractions for authoring Kubernetes
applications. 

Built on top of the auto-generated building blocks provided by CDK8s, this
library includes a hand crafted *construct* for each native kubernetes object,
exposing richer API's with reduced complexity.

!!! notice
    **cdk8s+** is currently built on top of version [1.17.0](https://github.com/instrumenta/kubernetes-json-schema/tree/master/v1.17.0) of the kubernetes API specifications.
    If you are deploying manifests produced by `cdk8s+` onto clusters of a lower version, you might encounter some unsupported spec properties or invalid manifests.

    > See [Supporting various k8s API specs](https://github.com/awslabs/cdk8s/issues/299) for more details and progress on this issue.

## At a glance

```typescript
import * as kplus from 'cdk8s-plus';
import * as cdk8s from 'cdk8s';
import * as path from 'path';

// our cdk app
const app = new cdk8s.App();

// our kuberentes chart
const chart = new cdk8s.Chart(app, 'my-chart');

// lets create a volume that contains our app.
// we use a trick with a config map!
const appData = new kplus.ConfigMap(chart, 'AppData');
appData.addDirectory(path.join(__dirname, 'app'));

const appVolume = kplus.Volume.fromConfigMap(appData);

// now we create a container that runs our app
const appPath = '/var/lib/app';
const port = 80;
const container = new kplus.Container({
  image: 'node:14.4.0-alpine3.12',
  command: ['node', 'index.js', `${port}`],
  port: port,
  workingDir: appPath,
})

// make the app accessible to the container
container.mount(appPath, appVolume);

// now lets create a deployment to run a few instances of this container
const deployment = new kplus.Deployment(chart, 'Deployment', {
  replicas: 3,
  containers: [ container ]
});

// finally, we expose the deployment as a load balancer service and make it run
deployment.expose(8080, {serviceType: kplus.ServiceType.LOAD_BALANCER})

// we are done, synth
app.synth();
```

??? "dist/my-chart.yaml"
    ```yaml
    apiVersion: v1
    data:
      index.js: |-
        var http = require('http');

        var port = process.argv[2];

        //create a server object:
        http.createServer(function (req, res) {
          res.write('Hello World!'); //write a response to the client
          res.end(); //end the response
        }).listen(port); //the server object listens on port 80
    kind: ConfigMap
    metadata:
      annotations: {}
      labels: {}
      name: chart-appdata-configmap-da4c63ab
    ---
    apiVersion: apps/v1
    kind: Deployment
    metadata:
      annotations: {}
      labels: {}
      name: chart-deployment-pod-d4285cc9
    spec:
      replicas: 3
      selector:
        matchLabels:
          cdk8s.deployment: ChartDeploymentCFC2E30C
      template:
        metadata:
          annotations: {}
          labels:
            cdk8s.deployment: ChartDeploymentCFC2E30C
        spec:
          containers:
            - command:
                - node
                - index.js
                - "80"
              env: []
              image: node:14.4.0-alpine3.12
              name: main
              ports:
                - containerPort: 80
              volumeMounts:
                - mountPath: /var/lib/app
                  name: configmap-chart-appdata-configmap-da4c63ab
              workingDir: /var/lib/app
          volumes:
            - configMap:
                name: chart-appdata-configmap-da4c63ab
              name: configmap-chart-appdata-configmap-da4c63ab
    ---
    apiVersion: v1
    kind: Service
    metadata:
      annotations: {}
      labels: {}
      name: chart-deployment-service-pod-42f50c26
    spec:
      externalIPs: []
      ports:
        - port: 8080
          targetPort: 80
      selector:
        cdk8s.deployment: ChartDeploymentCFC2E30C
      type: LoadBalancer
    ```

## Getting Started

=== "TypeScript/JavaScript"

    `❯ npm install cdk8s-plus cdk8s`

    ```typescript
    import * as kplus from 'cdk8s-plus';
    import * as cdk8s from 'cdk8s';

    const app = new cdk8s.App();
    const chart = new cdk8s.Chart(app, 'Chart');

    new kplus.Deployment(chart, 'Deployment', {
      replicas: 3,
      containers: [new kplus.Container({
        image: 'ubuntu',
      })],
    });
    ```

=== "Python"

    `❯ pip install cdk8s-plus cdk8s`

    ```python
    import cdk8s_plus as kplus
    import cdk8s

    app = cdk8s.App()
    chart = cdk8s.Chart(app, 'Chart')

    kplus.Deployment(chart, 'Deployment',
      replicas=1,
      containers=[kplus.Container(image='ubuntu')]
    )
    ```


