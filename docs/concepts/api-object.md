# ApiObject

An `ApiObject` is a construct that represents an entry in a Kubernetes manifest (level 0).
In most cases, you won't use `ApiObject` directly but rather use classes that
are imported through `cdk8s import` and which extend this base class.

By default, when you import API objects from k8s, all class names will all be
prefixed with `Kube` to differentiate them from the high-level APIs in CDK8s+.
It is possible to customize the prefix by providing a string value to the
`--class-prefix` flag, or by passing `--no-class-prefix`. (Note: if no prefix is
used for k8s resources, this may lead to conflicts - see
https://github.com/cdk8s-team/cdk8s/issues/140).
