import * as k8s from '../imports/k8s';

export interface ObjectMetaProps {

  readonly annotations?: { [key: string]: string };

  readonly clusterName?: string;

  readonly labels?: { [key: string]: string };

  readonly name?: string;

  readonly namespace?: string;

}

export class ObjectMeta {

  public readonly clusterName?: string;
  public readonly name?: string;
  public readonly namespace?: string;
  public readonly labels: { [key: string]: string };
  public readonly annotations: { [key: string]: string };

  constructor(props: ObjectMetaProps = {}) {
    this.annotations = props.annotations ?? {};
    this.labels = props.labels ?? {};
    this.clusterName = props.clusterName;
    this.name = props.name;
    this.namespace = props.namespace;
  }

  public addLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  public addAnnotation(key: string, value: string) {
    this.annotations[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.ObjectMeta {
    return {
      annotations: this.annotations,
      clusterName: this.clusterName,
      labels: this.labels,
      name: this.name,
      namespace: this.namespace,
    };
  }

}