# Secret

Secrets are used to store confidential information. Never store such information on the definition of the pod itself.

!!! tip ""
    [API Reference](../reference/cdk8s-plus.API.md#cdk8s-plus-secret)

## Use an existing `Secret`

To reference a secret created outside of your deployment definition, use the following. Note that this does not create a new object,
and will therefore not be included in the resulting manifest.

```typescript
import * as kplus from 'cdk8s-plus';

const secret = kplus.Secret.fromSecretName('aws-creds');
```

## Adding data

To create a new secret with some data, use:

```typescript
import * as kplus from 'cdk8s-plus';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const secret = new kplus.Secret(chart, 'Secret');
secret.addStringData('password', 'some-encrypted-data');
```
