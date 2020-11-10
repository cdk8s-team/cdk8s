# Service

Use services when you want to expose a set of pods using a stable network
identity. They can also be used for externalizing endpoints to clients outside
of the kubernetes cluster.

!!! tip ""
    [API Reference](../reference/cdk8s-plus.API.md#cdk8s-plus-service)

## Selectors

Services must be configured with selectors that tell it which pods should it serve.
The most common selector method is using labels.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');
const frontends = new kplus.Service(chart, 'FrontEnds');

// this will cause the service to select all pods with the 'run: frontend' label.
frontends.selectByLabel('run', 'frontend')
```

## Ports

Ports that the service will listen and redirect to can be configured like so:

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');
const frontends = new kplus.Service(chart, 'FrontEnds');

// make the service bind to port 9000 and redirect to port 80 on the associated containers.
frontends.serve({port: 9000, targetPort: 80)
```