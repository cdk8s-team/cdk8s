import { Construct } from 'constructs';

import * as cdktf from 'cdktf';
import * as awstf from "@cdktf/provider-aws";

export class CDKTFStack extends cdktf.TerraformStack {

  public readonly bucket: awstf.s3Bucket.S3Bucket;
  public readonly role: awstf.iamRole.IamRole;
  public readonly queue: awstf.sqsQueue.SqsQueue;
  public readonly topic: awstf.snsTopic.SnsTopic;
  public readonly batchSchedulingPolicy: awstf.batchSchedulingPolicy.BatchSchedulingPolicy;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    const provider = new awstf.provider.AwsProvider(this, "AWS", {
      region: "us-east-1",
    });

    this.bucket = new awstf.s3Bucket.S3Bucket(this, 'Bucket');
    this.role = new awstf.iamRole.IamRole(this, 'Role', {
      assumeRolePolicy: JSON.stringify({
        Version: "2012-10-17",
        Statement: [
          {
            Action: "sts:AssumeRole",
            Principal: {
              Service: 'ec2.amazonaws.com',
            },
            Effect: "Allow",
          },
        ],
      })
    });
    this.queue = new awstf.sqsQueue.SqsQueue(this, 'Queue');
    this.topic = new awstf.snsTopic.SnsTopic(this, 'Topic');
    this.batchSchedulingPolicy = new awstf.batchSchedulingPolicy.BatchSchedulingPolicy(this, 'BatchSchedulingPolicy', {
      name: 'why-is-this-required'
    });

    new cdktf.S3Backend(this, {
      bucket: 'epolon-us-east-1-terraform',
      key: 'tf.state',
      region: provider.region,
    });
  }
}
