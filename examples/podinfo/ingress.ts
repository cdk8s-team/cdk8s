import { Construct } from '@aws-cdk/core';
import { KubIngress } from '../../lib/ingress';

export interface IngressOptions {

}

export class Ingress extends Construct {
  constructor(scope: Construct, id: string, options: IngressOptions) {
    super(scope, id);

    new KubIngress(this, 'Default', {
      metadata: {

      },
      spec: {

      }
    });
  }
}