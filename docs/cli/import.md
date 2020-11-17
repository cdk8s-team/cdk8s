# import

The `import` command generates low-level (L1) constructs for Kubernetes API
objects and Custom Resources (CRDs).

## Importing Core Kubernetes API Objects

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

### Specifying Kubernetes version

Use the `@version` notation to import a specific Kubernetes version:

```shell
cdk8s import k8s@1.16.0
```

Alternatively, you can specify your `k8s` import in the `cdk8s.yaml` config file:

```yaml
imports:
  - k8s@1.17.0
```

### Selecting API versions for specific objects

By default, the command `cdk8s import k8s` will use the latest stable version of
k8s objects.

For example, when using k8s 1.17, if you want to use `DeploymentSpec`, you would
be importing it from [Deployment
v1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deploymentspec-v1-apps)
by default.

In the default `v1`, the `revisionHistoryLimit`, which is the number of old
ReplicaSets to retain, is set to 10 by default. You would have to explicitly set
this to a higher number if you want to retain more.

Let's say that you want the behavior of
[extensions/v1beta1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deploymentspec-v1beta1-extensions),
which defaults to retaining _all_ old ReplicaSets.

To do this, you could add the `--include` flag to your `cdk8s import`. Here is
how that would look:

From the CLI:

```shell
cdk8s import k8s --language typescript --include io.k8s.api.extensions.v1beta1.Deployment
```

Here we are explicitly choosing to use the [Deployment
extensions/v1beta1](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.17/#deployment-v1beta1-extensions)
version, which includes the new default behavior that we want from
`DeploymentSpec`

> This feature is not yet supported in `cdk8s.yaml` config at the moment.

## Importing Custom Resource Definitions (CRDs)

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

- TypeScript: `imports/mygroup.io/foo.ts`
- Python: `imports/mygroup/io/foo/__init__.py`

If the imported YAML is a `List` of CRDs, all these CRDs will be imported. This
is useful, for example, to import all the CRDs from a running cluster:

```shell
kubectl get crds -o json | cdk8s import /dev/stdin
```

> Yes, this works!

## Setting import module name

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

## Selecting language

You can specify your desired language with the `--language` flag. For example:

CLI:

```shell
cdk8s import --language typescript
```

`cdk8s.yaml`:

```yaml
language: typescript
```

## Output directory

The `--output` (or `-o`) option can be used to specify the output directory for
your imports.

## Class name prefix

For `k8s` imports, all imported classes will have a `Kube` prefix to denote that
those are core Kubernetes APIs. For CRD imports, the class name will match the
resource kind.

You can use the `--class-prefix` option to specify an alternative prefix or
`--no-class-prefix` to disable this behavior for `k8s` imports.
