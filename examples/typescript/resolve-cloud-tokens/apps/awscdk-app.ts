import * as awscdk from 'aws-cdk-lib';
import { AWSCDKStack } from '../constructs/awscdk-stack';

const awscdkApp = new awscdk.App({ outdir: 'cdk.out' });
new AWSCDKStack(awscdkApp, 'aws');

awscdkApp.synth();
