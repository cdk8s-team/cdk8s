import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';
import * as kplus from 'cdk8s-plus-22';

export class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    const ingress = new kplus.Ingress(this, 'ingress');
    ingress.addRule('/', this.echoBackend('root'));
    ingress.addRule('/foo', this.echoBackend('foo'));
    ingress.addRule('/foo/bar', this.echoBackend('foo-bar'));

    ingress.addHostDefaultBackend('my.host', this.echoBackend('my.host/hey'));
  }

  private echoBackend(text: string) {
    const deploy = new kplus.Deployment(this, text, {
      containers: [
        {
          image: 'hashicorp/http-echo',
          args: [ '-text', text ]
        }
      ]
    });

    return kplus.IngressBackend.fromService(deploy.exposeViaService({ port: 5678 }));
  }
}

const app = new App();
new MyChart(app, 'ingress-example');
app.synth();
