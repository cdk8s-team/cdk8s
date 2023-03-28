# Resolve Cloud Tokens (PoC)

PoC for the discussion and upcoming RFC regarding [resolving cloud tokens](https://github.com/cdk8s-team/cdk8s/discussions/1198).

## What

### `poc.ts`

The expected code a user could write after this feature is implemented. It contains:

- AWS CDK stack that defines: `Bucket`, `Queue`, `Topic`, `Role`
- CDKTF stack that defines: `Bucket`, `Queue`, `Topic`, `Role`
- CDK8s chart that defines a `Deployment` with the names of the AWS CDK resources as environment variables. (note the names are only known *after* deployment)
- CDK8s chart that defines a `Deployment` with the names of the CDKTF resources as environment variables. (note the names are only known *after* deployment)

### `cdk8s.v0.0.0.jsii.tgz`

Patched version of [cdk8s-core](https://github.com/cdk8s-team/cdk8s-core) with added support for this feature.

### `package.json`

Contains some useful tasks to interact with the poc.

## How

To see it in action:

1. Clone this repo
2. `cd cdk8s`
3. `git checkout epolon/rfc-resolve-cloud-tokens`
4. `cd examples/typescript/resolve-cloud-tokens`
5. `yarn install`
6. Install [terraform](https://developer.hashicorp.com/terraform/tutorials/aws-get-started/install-cli) (dont worry, its easy) and put it in your PATH.
7. Setup AWS credentials however you like.

First, run `yarn synth`. This will synthesize all the stacks and charts in the `poc.ts` file. When its done, you'll see:

#### `cdk.out`

AWS CDK output directory, contains CloudFormation templates and assets.

#### `cdktf.out` 

CDKTF output directory, contains a terraform module as well as any plugins required by it. 

#### `dist`

CDK8s output directory, contains the Kubernetes manifests. Here, you'll see two files:

- `k8s-with-awscdk.k8s.yaml`
- `k8s-with-cdktf.k8s.yaml`

You'll note that these manifests are not valid, they contains references to unresolved tokens. For example, for the AWS CDK one we will have:

```yaml
containers:
  - env:
    - name: BUCKET_NAME
      value:
        Ref: Bucket83908E77
    - name: ROLE_NAME
      value:
        Ref: Role1ABCC5F0
    - name: QUEUE_NAME
      value:
        Fn::GetAtt:
          - Queue4A7E3555
          - QueueName
    - name: TOPIC_NAME
      value:
        Fn::GetAtt:
          - TopicBFC7AF6E
          - TopicName
```

And for the CDKTF one we will have:

```yaml
containers:
  - env:
    - name: BUCKET_NAME
      value: ${aws_s3_bucket.aws_Bucket_B01EE042.bucket}
    - name: ROLE_NAME
      value: ${aws_iam_role.aws_Role_4E9688D1.name}
    - name: QUEUE_NAME
      value: ${aws_sqs_queue.aws_Queue_39CF91C6.name}
    - name: TOPIC_NAME
      value: ${aws_sns_topic.aws_Topic_3AD3D5D0.name}
```

This is because the deployment of the AWS resources hasn't happened yet, so there is no way of knowing the values of those tokens. In this case, cdk8s will fallback to their original representation.

Now, run `yarn deploy`. This will deploy the resources and call CDK8s synthesis once again. When its done, look at the manifests again, they will now contain the deploy time values of the tokens.

For example, for the AWS CDK one we will have:

```yaml
containers:
  - env:
    - name: BUCKET_NAME
      value: aws-bucket83908e77-1cjg66vi74s3t
    - name: ROLE_NAME
      value: aws-Role1ABCC5F0-A55YPBAPT1S9
    - name: QUEUE_NAME
      value: aws-Queue4A7E3555-baPEuy7n60no
    - name: TOPIC_NAME
      value: aws-TopicBFC7AF6E-rCQrOMb6OEoN
```

And for the CDKTF one we will have:

```yaml
containers:
  - env:
    - name: BUCKET_NAME
      value: terraform-20230328104757441600000006
    - name: ROLE_NAME
      value: terraform-20230328104757432100000004
    - name: QUEUE_NAME
      value: terraform-20230328104757432200000005
    - name: TOPIC_NAME
      value: terraform-20230328104757432000000003
```

> If you want to see some more debug information during execution, run the commands with `RESOLVE_CLOUD_TOKENS_POC_DEBUG=1`
