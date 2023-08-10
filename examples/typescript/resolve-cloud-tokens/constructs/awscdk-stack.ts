import { Construct } from 'constructs';

import * as awscdk from 'aws-cdk-lib';

export class AWSCDKStack extends awscdk.Stack {

  public readonly queueName: string;

  constructor(scope: Construct, name: string) {
    super(scope, name);

    const queue = new awscdk.aws_sqs.Queue(this, 'Queue');

    this.queueName = queue.queueName;

    new awscdk.CfnOutput(this, 'QueueName', {
      value: this.queueName,
    });


  }
}
