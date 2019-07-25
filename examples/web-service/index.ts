import { App, Construct } from '@aws-cdk/core';
import { Stack } from '../../lib';
import { WebService } from './web-service';

class MyStack extends Stack {
  constructor(scope: Construct, ns: string) {
    super(scope, ns);

    new WebService(this, 'hello', {
      image: 'paulbouwer/hello-kubernetes:1.5',
      replicas: 2
    });

    new WebService(this, 'ghost', {
      image: 'ghost',
      containerPort: 2368,
    });
  }
}

const app = new App({ outdir: 'cdk.out' });
new MyStack(app, 'web-service-example');
app.synth();