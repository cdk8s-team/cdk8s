# ServiceAccount

Use service accounts to provide an identity for pods.

!!! tip ""
    [API Reference](../reference/cdk8s-plus.md#cdk8s-plus-serviceaccount)

## Use an existing `ServiceAccount`

To reference a service account created outside of your deployment definition, use the following. Note that this does not create a new object,
and will therefore not be included in the resulting manifest.

```typescript
import * as kplus from 'cdk8s-plus';

const serviceAccount = kplus.ServiceAccount.fromServiceAccountName('aws-service');
```

## Allowing access to secrets

To create a new service account, and give it access to some secrets, use the following:

```typescript
import * as kplus from 'cdk8s-plus';
import * as k from 'cdk8s';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

const awsCreds = kplus.Secret.fromSecretName('aws-creds');
const awsService = new kplus.ServiceAccount(chart, 'AWS');

// give access to the aws creds secret.
awsService.addSecret(awsCreds);
```
