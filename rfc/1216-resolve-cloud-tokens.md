# Resolve Cloud Tokens

* **Original Author(s):** @iliapolo
* **Tracking Issue**: https://github.com/cdk8s-team/cdk8s/issues/1216
* **API Bar Raiser**: @rix0rrr

Users can now author cdk8s applications that rely on cloud
resources defined with the AWS CDK or the CDK For Terraform.

## Working Backwards

### CHANGELOG

`feat(synth): custom resolvers`

### README

Custom resolvers are a mechanism to inject custom logic into the cdk8s value resolution process. It allows to 
transform any value just before being written to the Kubernetes manifest.

To define a custom resolver, fist create a class that implements the `ITokenResolver` interface:

```ts
import { ITokenResolver } from 'cdk8s';

export class MyCustomResolver implements ITokenResolver {

  public resolve(value: any): any {
    // run some custom logic
  }

}
```

Then, when you create a cdk8s `Chart`, pass the resolver instance to it via the `resolver` property:

```ts
import { App, Chart } from 'cdk8s'

const app = new App();
new Chart(app, 'Chart', { resolver: new MyCustomResolver() });
```

One common use-case for this feature is to automatically resolve deploy time 
attributes of cloud resources, and pass them to your Kubernetes workloads. To that end, 
cdk8s provides a resolver for the following CDK frameworks:

#### AWS Cloud Development Kit

In this example, we create an S3 `Bucket` with the AWS CDK, and pass its (deploy time generated) name 
as an environment variable to a Kubernetes `CronJob` resource.

```ts
import * as aws from 'aws-cdk-lib';
import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';

import { AwsCdkTokenResolver } from '@cdk8s/aws-cdk-token-resolver';

const awsApp = new aws.App();
const stack = new aws.Stack(awsApp, 'Stack');

const resolver = new AwsCdkTokenResolver(stack);

const k8sApp = new k8s.App();
const manifest = new k8s.Chart(k8sApp, 'Manifest', {
  tokenResolution: resolver,
});

const bucket = new aws.aws_s3.Bucket(stack, 'Bucket');
new kplus.CronJob(manifest, 'CronJob', {
  schedule: k8s.Cron.daily(),
  containers: [{
    image: 'job',
    envVariables: {
      // passing the bucket name via an env variable
      BUCKET_NAME: kplus.EnvValue.fromValue(bucket.bucketName),
    }
 }]
});

awsApp.synth();
k8sApp.synth();
```

Notice we create two applications: one for our cdk8s constructs, and one for our AWS CDK constructs.
Both are defined and synthesized in the same file, but can be separated as needed.
Since your Kubernetes resources now depend on AWS CDK deploy tokens, you'll first need to run `cdk deploy`, 
and only then `cdk8s synth`.

> Otherwise, the Kubernetes manifests will contain a string representation of the tokens (e.g `${Token[TOKEN.25]}`), 
> instead of the concrete values.

#### CDK For Terraform

In this example, we create an S3 `Bucket` with the CDKTF, and pass its (deploy time generated) name 
as an environment variable to a Kubernetes `CronJob` resource.

```ts
import * as tf from "cdktf";
import * as aws from "@cdktf/provider-aws";
import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';

const awsApp = new tf.App();
const stack = new tf.TerraformStack(awsApp, 'Stack');

const k8sApp = new k8s.App();
const manifest = new k8s.Chart(k8sApp, 'Manifest');

const bucket = new aws.s3Bucket.S3Bucket(stack, 'Bucket');
new kplus.CronJob(manifest, 'CronJob', {
  schedule: k8s.Cron.daily(),
  containers: [{
    image: 'job',
    envVariables: {
      // passing the bucket name via an env variable
      BUCKET_NAME: kplus.EnvValue.fromValue(bucket.bucket),
    }
 }]
});

awsApp.synth();
k8sApp.synth({ resolveCDKTFTokens: true });
```

Notice we create two applications: one for our cdk8s constructs, and one for our CDKTF constructs.
Both are defined and synthesized in the same file, but can be separated as needed.
Since your Kubernetes resources now depend on CDKTF tokens, you'll first need to run `cdk deploy`, 
and only then `cdk8s synth`.

> Otherwise, the Kubernetes manifests will contain a string representation of the tokens (e.g `${TfToken[TOKEN.0]}`), 
> instead of the concrete values.

---

Ticking the box below indicates that the public API of this RFC has been
signed-off by the API bar raiser (the `api-approved` label was applied to the
RFC pull request):

```
[ ] Signed-off by API Bar Raiser @xxxxx
```

## Public FAQ

### What are we launching today?

A new feature in the `cdk8s` core library that allows synthesizing cdk8s
applications that reference tokens from the AWS CDK or CDKTF frameworks.

### Why should I use this feature?

If your Kubernetes workloads rely on resources offered by a cloud provider,
you can use this new feature to define cloud infrastructure and Kubernetes
resources in the same application. You can leverage either the AWS CDK or
the CDK For Terraform for your cloud infrastructure, and seamlessly reference
it in your cdk8s application.

## Internal FAQ

### Why are we doing this?

To alleviate customer pain in defining Kubernetes applications that leverage
cloud infrastructure. Currently, synthesizing a cdk8s application that references
cloud resources will result in an invalid and un-deployable Kubernetes manifest.
Customers are therefore forced to eject from the cdk8s framework in order to implement
such applications. Some customers we've spoken to have expressed concerns with
with such an approach, and would love to see built-in support for this in cdk8s.

So, even though this feature doesn't necessarily unlock the use-case, it provides a
much better experience that can delight our customers.

In addition, adding this capability into the framework may attract Kubernetes users who
don't currently leverage the CDK ecosystem to define and deploy their workloads.

### Why should we _not_ do this?

The main reason not to do this is because there are several ways to
address the use-case without this feature. A few approaches are possible:

#### Pre Synth Query

In this approach, customers decouple the definition of cloud infrastructure from the
definition of Kubernetes resources. That is, instead of referencing `bucket.bucketName`
in the Kubernetes spec, they might extract it from an env variable via `process.env.BUCKET_NAME`.

The responsibility of populating the `BUCKET_NAME` env variable falls to an
external script that must be executed before calling `cdk8s synth`. The script will
use service API's to query for the required information.

Maintaining such a script can be complex because it requires constant coordination between two
decoupled parts of the application. Every time a new cloud resource is utilized, it needs to
be added in two places. This makes it clear that such decoupling is not natural,
and is only caused by technical limitations.

#### Pre Synth Provisioning

In this approach, the cloud infrastructure is split into two:

- One part contains independent<sup>*</sup> resources and is defined within
the IaC application (AWS CDK or CDKTF).
- The second part contains the resources being used by Kubernetes resources,
and are provisioned imperatively before synthesis, either as part of the
cdk8s application, or externally.

> <sup>*</sup> Independent with respect to usage in Kubernetes resource definitions.

This separation into imperative provisioning essentially re-introduces all
the complexity that IaC aims to solve.

#### Post Synth Query

In this approach, cloud infrastructure and Kubernetes resources are defined in the same
application using the standard IaC tooling. The Kubernetes resources are tightly coupled
with their required cloud resources. To overcome the problem of the un-deployable manifest,
Customers have to post-process the result of `cdk8s synth` to produce the final deployable
manifest. This post synthesis step inspects the manifest for references to
cloud resources, interprets them, and performs the necessary lookups.

From an application maintenance perspective, this approach is actually pretty robust.
The problem is that implementing and maintaining such a post synthesis step is not at all
trivial. This RFC essentially proposes baking this step into the cdk8s framework, so that
customers don't have to deal with the complexities it poses, outlined further down in
this RFC.

### What is the technical solution (design) of this feature?

> Briefly describe the high-level design approach for implementing this feature.
>
> As appropriate, you can add an appendix with a more detailed design document.
>
> This is a good place to reference a prototype or proof of concept, which is
> highly recommended for most RFCs.

### Is this a breaking change?

No

### What alternative solutions did you consider?

> Briefly describe alternative approaches that you considered. If there are
> hairy details, include them in an appendix.

#### CloudControl API

#### CfnOutput

In this solution, whenever cdk8s encounters an AWS CDK token, it will:

- If the corresponding CloudFormation output exists and is deployed, fetch its value.
- If the corresponding CloudFormation output is missing, define it.

For example, given the following definition:

```ts
new kplus.CronJob(manifest, 'CronJob', {
  schedule: k8s.Cron.daily(),
  containers: [{
    image: 'job',
    envVariables: {
      // passing the bucket name via an env variable
      BUCKET_NAME: kplus.EnvValue.fromValue(bucket.bucketName),
    }
 }]
});
```

Resolving the `bucket.bucketName` token will look something like:

```ts
// some output id generated from the token
const outputId = 'some-stable-id'

try {
  return fetchValue(stack, outputId)
} catch (error: OutputNotFound) {
  new CfnOutput(stack, outputId, { value: bucket.bucketName });
  // nothing else we can return here...
  return bucket.bucketName
}
```

##### Pros

- Outputs can be created for any CloudFormation attribute, which means all AWS CDK
attributes will be supported.

##### Cons

While it makes sense for the cdk8s application to depend on the AWS CDK application,
injecting these synthetic outputs also creates the reverse dependency. This is non intuitive and
has some surprising implications:

- Synthesizing the AWS CDK application **must happen after** synthesizing the cdk8s application.
Otherwise, the necessary CloudFormation outputs won't exist.
- Synthesizing the AWS CDK application separately from the cdk8s application will result in a different cloud assembly.
- The cdk8s application needs to be synthesized twice, once to add the CloudFormation outputs, and once to fetch their values. This means that the first synthesis will inherently produce an invalid manifest.

##### Decision

It is hard to pin-point exactly what challenges the above implications will impose, but their existence
can create an awkward and error prone experience. We therefore prefer avoiding them.

#### BucketDeployment

This solution is similar to the [CfnOutput](#cfnoutput) one, but instead of creating a `CfnOutput`,
we create a [`BucketDeployment`](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_s3_deployment.BucketDeployment.html) resource. This resource allows creating a [JSON file](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_s3_deployment.Source.html#static-jsonwbrdataobjectkey-obj) that supports deploy time values. This file can contain the token value and can be downloaded by cdk8s during synthesis.

##### Pros

- The JSON file can contain any token, which means all AWS CDK attributes will be supported.
- Only a single resource is added to the AWS CDK application, as opposed to multiple outputs.
- During cdk8s synthesis, only a single network call is needed to download the file, as opposed
to multiple ones for fetching the outputs.

##### Cons

The cons remain exactly the same as the [ones](#cons) from the `CfnOutput` solution.

##### Decision

The benefits of this solution over the outputs solution are not strong enough
to overcome the cons, so it is rejected on the same account.

### What are the drawbacks of this solution?

> Describe any problems/risks that can be introduced if we implement this RFC.

### What is the high-level project plan?

> Describe your plan on how to deliver this feature from prototyping to GA.
> Especially think about how to "bake" it in the open and get constant feedback
> from users before you stabilize the APIs.
>
> If you have a project board with your implementation plan, this is a good
> place to link to it.

### Are there any open issues that need to be addressed later?

> Describe any major open issues that this RFC did not take into account. Once
> the RFC is approved, create GitHub issues for these issues and update this RFC
> of the project board with these issue IDs.

## Appendix

Feel free to add any number of appendices as you see fit. Appendices are
expected to allow readers to dive deeper to certain sections if they like. For
example, you can include an appendix which describes the detailed design of an
algorithm and reference it from the FAQ.
