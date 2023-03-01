# Resolve Cloud Tokens

* **Original Author(s):** @iliapolo
* **Tracking Issue**: https://github.com/cdk8s-team/cdk8s/issues/1216
* **API Bar Raiser**: @rix0rrr

Users can now author cdk8s applications that rely on cloud
resources defined with the AWS CDK or the CDK For Terraform.

## Working Backwards

### CHANGELOG

`feat(synth): fetch concrete values of AWS CDK and CDKTF tokens`

### README

It is common for Kubernetes applications to leverage cloud resources for their operation.
For example, a Kubernetes `CronJob` may need an S3 `Bucket` to store computation results,
or a Kubernetes `Deployment` might need a managed database like `DynamoDB` to
store application data. To achieve this, information such as the bucket
or table name needs to be passed into the Kubernetes resource definitions.

If you use the [AWS CDK](https://aws.amazon.com/cdk/) or
[CDKTF](https://developer.hashicorp.com/terraform/cdktf) to define
cloud resources, you can combine it with a cdk8s application to
seamlessly define such multi-layered applications.

Lets look at an example; We'll use the AWS CDK to create an S3 bucket,
and pass the bucket name to a Kubernetes `CronJob`.

```ts
import * as aws from 'aws-cdk-lib';
import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';

const k8sApp = new k8s.App();
const awsApp = new aws.App();

const stack = new aws.Stack(awsApp, 'Stack');
const manifest = new k8s.Chart(k8sApp, 'Manifest');

const bucket = new aws.aws_s3.Bucket(stack, 'Bucket');
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

k8sApp.synth();
awsApp.synth();
```

> Note that for brevity, both the AWS CDK application and the cdk8s application
> are defined in the same file, but this doesn't have to be the case.

The deployment workflow for such an application would be:

1. `cdk deploy`: Provision the S3 Bucket.
2. `cdk8s synth`: During synthesis, cdk8s will lookup the
name of the provisioned bucket to produce the manifest. (this is why this step must<sup>*</sup> happen after step 1)
3. `kubectl apply`: Apply the manifest to the cluster. Note that `kubectl`
is only shown as an example here, any Kubernetes deployment mechanism can be used.

> <sup>*</sup> In cases when information about cloud resources is known before
> provisioning (for example when explicitly specifying a `bucketName`), `cdk8s synth`
> can be executed at any time.

The same thing can also be achieved with the CDK For Terraform:

```ts
import * as cdktf from "cdktf";
import * as aws from "@cdktf/provider-aws";
import * as k8s from 'cdk8s';
import * as kplus from 'cdk8s-plus-26';

const k8sApp = new k8s.App();
const awsApp = new cdktf.App();

const stack = new cdktf.TerraformStack(awsApp, 'Stack');
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

k8sApp.synth();
awsApp.synth();
```

---

Ticking the box below indicates that the public API of this RFC has been
signed-off by the API bar raiser (the `api-approved` label was applied to the
RFC pull request):

```
[ ] Signed-off by API Bar Raiser @xxxxx
```

## Public FAQ

> This section should include answers to questions readers will likely ask about
> this release. Similar to the "working backwards", this section should be
> written in a language as if the feature is now released.
>
> The template includes a some common questions, feel free to add any questions
> that might be relevant to this feature or omit questions that you feel are not
> applicable.

### What are we launching today?

> What exactly are we launching? Is this a new feature in an existing module? A
> new module? A whole framework? A change in the CLI?

### Why should I use this feature?

> Describe use cases that are addressed by this feature.

## Internal FAQ

> The goal of this section is to help decide if this RFC should be implemented.
> It should include answers to questions that the team is likely ask. Contrary
> to the rest of the RFC, answers should be written "from the present" and
> likely discuss design approach, implementation plans, alternative considered
> and other considerations that will help decide if this RFC should be
> implemented.

### Why are we doing this?

> What is the motivation for this change?

### Why should we _not_ do this?

> Is there a way to address this use case with the current product? What are the
> downsides of implementing this feature?

### What is the technical solution (design) of this feature?

> Briefly describe the high-level design approach for implementing this feature.
>
> As appropriate, you can add an appendix with a more detailed design document.
>
> This is a good place to reference a prototype or proof of concept, which is
> highly recommended for most RFCs.

### Is this a breaking change?

> If the answer is no. Otherwise:
>
> Describe what ways did you consider to deliver this without breaking users?
>
> Make sure to include a `BREAKING CHANGE` clause under the CHANGELOG section with a description of the breaking
> changes and the migration path.

### What alternative solutions did you consider?

> Briefly describe alternative approaches that you considered. If there are
> hairy details, include them in an appendix.

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