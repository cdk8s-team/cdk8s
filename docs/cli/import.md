# import

The `import` command generates low-level (L1) constructs for Kubernetes API
objects and Custom Resources (CRDs).

## General Options

### Target programming language (`--language`)

You can specify your desired language with the `--language` flag. For example:

CLI:

```shell
cdk8s import --language typescript
```

`cdk8s.yaml`:

```yaml
language: typescript
```

### Output directory (`--output`)

The `--output` (or `-o`) option can be used to specify the output directory for
your imports.

### Class name prefix (`--class-prefix`)

For `k8s` imports, all imported classes will have a `Kube` prefix to denote that
those are core Kubernetes APIs. For CRD imports, the class name will match the
resource kind.

You can use the `--class-prefix` option to specify an alternative prefix or
`--no-class-prefix` to disable this behavior for `k8s` imports.

### Module name

You can also override the default behavior for `cdk8s` importing. This will be
helpful to you if you would like to name your CRD imports differently from their
kind. Here is how you do it:

CLI:

```shell
cdk8s import example:=my_crd.yaml
```

`cdk8s.yaml`:

```yaml
imports:
  - example:=my_crd.yaml
```

If your CRD contained two kinds, `Cluster` and `Autoscaler`, you would have two
imports. You could use them in this fashion:

=== "Typescript"
    ```javascript
    import { Cluster } from './imports/example-cluster';
    import { Autoscaler } from './imports/example-autoscaler';

```

=== "Python"
    ```python
    not yet supported
```

## Import Types

The `import` command supports two types of imports:

1. `k8s`: generates constructs from the core Kubernetes API
2. CRDs: generates constructs from custom resource definitions

This section describes specific behavior related to each type of import.

### Kubernetes APIs

To generate constructs for all Kubernetes API objects of a certain version, use:

```shell
cdk8s import k8s
```

The `import` command will generate files under an "imports" directory inside
your project with constructs for each API object in the Kubernetes spec.

!!! note
    It is recommended to _commit_ these generated files into your source
    control.

By default, generated class names will be named `KubeXyz` where `Xyz` is the API
object kind (e.g. `KubeDeployment`).

#### Kubernetes Versions

Use the `@version` notation to import a specific Kubernetes version:

```shell
cdk8s import k8s@1.16.0
```

Alternatively, you can specify your `k8s` import in the `cdk8s.yaml` config file:

```yaml
imports:
  - k8s@1.17.0
```

#### API Object Versions

When importing the core Kubernetes API objects, `cdk8s import` will generate constructs
both for stable APIs (e.g. `v1`) and pre-stable APIs (`v1beta1`). To ensure compatibility
across Kubernetes versions, construct classes generated for non-stable resources will
include a postfix with the API level.

For example, the import for `k8s@1.18` includes `KubeIngressV1Beta1` as the only `Ingress`
resource. This is because `Ingress` has not been stabilized yet. The import for `k8s@1.19`
will also include an `Ingress` construct which represents the `v1` resource.

### CRDs

You can import CRDs from local files or URLs:

```shell
cdk8s import my_crd.yaml
```

Or from `cdk8s.yaml`:

```yaml
imports:
  - my_crd.yaml
```

A CRD with group `mygroup.io` and kind `Foo` will be imported to the following
locations:

- TypeScript: `imports/mygroup.io.ts`
- Python: `imports/mygroup/io`

#### Importing CRDs from a cluster

If the imported YAML is a `List` of CRDs, all these CRDs will be imported. This
is useful, for example, to import all the CRDs from a running cluster:

```shell
kubectl get crds -o json | cdk8s import /dev/stdin
```

> Yes, this works!
