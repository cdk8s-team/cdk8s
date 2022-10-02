# Role Based Access Control

Role Based Access Control(RBAC) helps you restrict actions that can be performed on specific Kubernetes resources. To make this possible, RBAC lets you create roles with rules which define access permissions for your specified resource.

These roles can then be binded to Kubernetes subjects, which could be User, Group or ServiceAccount. 

!!! note
    Rules or permissions are purely additive and there are no deny rules.

Now, there are two types of roles available,
* Role: These set permissions within a particular namespace i.e. is for namespaced resources, like, pods, deployments.
* ClusterRole: These set permissions for non-namespaced resources, like, nodes, urls.

and, similarly there are two types of binding available,
* RoleBinding: These grant permissions within a specific namespace.
* ClusterRoleBinding: These grant cluster wide permissions .

!!! tip "Learn more"
    * [Role API Reference](../reference/cdk8s-plus-24/typescript.md#role)
    * [RoleBinding API Reference](../reference/cdk8s-plus-24/typescript.md#role-binding)

## Role

### Create role and add rules to it

```typescript
import * as kplus from 'cdk8s-plus-24';
import { Construct } from 'constructs';
import { App, Chart, ChartProps } from 'cdk8s';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = { }) {
    super(scope, id, props);

    // Creating RBAC Role
    const role = new kplus.Role(this, 'SampleRole');

    // Adding list of rules to the Role for 'deployments' namespaced resource
    role.allow(
      ['get', 'list', 'watch', 'create', 'update', 'patch', 'delete'],
      kplus.ApiResource.custom({
        apiGroup: 'apps',
        resourceType: 'deployments',
      })
    );
  }
}

const app = new App();
new MyChart(app, 'rbac-docs');
app.synth();
```

### RoleBinding with User

```typescript
const user = kplus.User.fromName(this, 'SampleUser', 'Jane');
const binding = role.bind(user);
```

### RoleBinding with Group

```typescript
const group = kplus.Group.fromName(this, 'SampleGroup', 'sample-group');
const binding = role.bind(group);
```

### RoleBinding with ServiceAccount

```typescript
const serviceAccount = new kplus.ServiceAccount(this, 'SampleServiceAccount');
const binding = role.bind(serviceAccount);
```

## ClusterRole

### Create ClusterRole and add rules to it

```typescript
// Creating RBAC ClusterRole
const clusterRole = new kplus.ClusterRole(this, 'SampleClusterRole');

// Adding list of rules to the ClusterRole for 'Nodes' and 'URL' non-namespaced resource
clusterRole.allow(
    ['get', 'list', 'watch', 'create', 'update', 'patch', 'delete'],
    kplus.ApiResource.NODES,
    kplus.NonApiResource.of('/healthz'),
    );
```

### ClusterRoleBinding with User

```typescript
const clusterUser = kplus.User.fromName(this, 'SampleUser', 'Jane');
const binding = clusterRole.bind(clusterUser);
```

### ClusterRoleBinding with Group

```typescript
const clusterGroup = kplus.Group.fromName(this, 'SampleGroup', 'sample-group');
const binding = clusterRole.bind(clusterGroup);
```

### ClusterRoleBinding with ServiceAccount

```typescript
const clusterServiceAccount = new kplus.ServiceAccount(this, 'SampleServiceAccount');
const binding = clusterRole.bind(clusterServiceAccount);
```

## Add subjects to an already binded role

```typescript
const user = kplus.User.fromName(this, 'SampleUser', 'Jane');
const binding = role.bind(user);

const anotherUser = kplus.User.fromName(this, 'AnotherSampleUser', 'James');
binding.addSubjects(anotherUser);
```