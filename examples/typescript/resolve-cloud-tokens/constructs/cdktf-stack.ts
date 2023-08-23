import { Construct } from 'constructs';

import * as cdktf from 'cdktf';
import * as awstf from "@cdktf/provider-aws";

export class CDKTFStack extends cdktf.TerraformStack {

  public readonly queue: awstf.sqsQueue.SqsQueue;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    const provider = new awstf.provider.AwsProvider(this, "AWS", {
      region: "us-east-1",
    });

    this.queue = new awstf.sqsQueue.SqsQueue(this, 'Queue');

    new cdktf.S3Backend(this, {
      bucket: 'epolon-us-east-1-terraform',
      key: 'tf.state',
      region: provider.region,
    });
  }
}
