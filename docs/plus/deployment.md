# Deployment

Create a deployment to govern the lifecycle and orchestration of a set of identical pods.

> API Reference: [Deployment](./API.md#cdk8s-plus-deployment)

## Automatic pod selection

When you specify pods in a deployment, you normally have to configure the appropriate labels and selectors to
make the deployment control the relevant pods. This construct does this automatically.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

new kplus.Deployment(chart, 'FrontEnds', {
  containers: [ new kplus.Container({ image: 'node' }) ],
});
```

Note the resulting manifest contains a special `cdk8s.deployment` label that is applied to the pods, and is used as
the selector for the deployment.

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-pod-a48e7f2e
spec:
  replicas: 1
  selector:
    matchLabels:
      cdk8s.deployment: ChartFrontEndsDD8A97CE
  template:
    metadata:
      annotations: {}
      labels:
        cdk8s.deployment: ChartFrontEndsDD8A97CE
```

## Exposing via a service

Following up on pod selection, you can also easily create a service that will select the pods relevant to the deployment.

```typescript

// store the deployment to created in a constant
const frontends = new kplus.Deployment(chart, 'FrontEnds');

// create a ClusterIP service that listens on port 9000 and redirects to port 9000 on the containers.
frontends.expose(9000)
```

Notice the resulting manifest, will have the same `cdk8s.deployment` magic label as the selector.
This will cause the service to attach to the pods that were configured as part of the said deployment.

```yaml
apiVersion: v1
kind: Service
metadata:
  annotations: {}
  labels: {}
  name: chart-frontends-service-pod-1f70150b
spec:
  externalIPs: []
  ports:
    - port: 9000
  selector:
    cdk8s.deployment: ChartFrontEndsDD8A97CE
  type: ClusterIP
```
