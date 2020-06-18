import { IResource, Resource } from './base';
import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import * as k8s from '../imports/k8s';
import { onSynth } from './utils';
import { EnvValue } from './container';

export interface SecretProps {

}

export interface ISecret extends IResource {

}

export class Secret extends Resource implements ISecret {

  public readonly apiObject: cdk8s.ApiObject;

  private readonly stringData: { [key: string]: string };

  public static fromSecretName(name: string): ISecret {
    return { name };
  }

  public constructor(scope: Construct, id: string, props: SecretProps = { }) {
    super(scope, id, props);

    this.stringData = {};

    this.apiObject = new k8s.Secret(this, 'Secret', {
      metadata: this.synthesizeMetadata(),
      stringData: onSynth(() => this.stringData),
    })
  }

  public addEnvVariable(key: string) {
    const value = EnvValue.fromProcess(key, {required: true}).value!;
    this.stringData[key] = value;
  }

}


