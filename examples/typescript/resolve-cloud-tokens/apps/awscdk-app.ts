import * as awscdk from 'aws-cdk-lib';
import { AWSCDKStack } from '../constructs/awscdk-stack';

const awscdkApp = new awscdk.App({ outdir: 'cdk.out' });
export const awscdkStack = new AWSCDKStack(awscdkApp, 'aws');

awscdkApp.synth();
