import { Construct } from '@aws-cdk/core';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface KubResourceProps {
  readonly spec?: any;
  readonly data?: any;
  readonly kind: string;
  readonly apiVersion: string;
  readonly metadata?: ObjectmetaMetaV1;
}

export class KubResource extends Construct {
  private readonly metadata: ObjectmetaMetaV1;

  constructor(scope: Construct, id: string, private readonly props: KubResourceProps) {
    super(scope, id);

    this.metadata = {
      ...props.metadata,
      name: this.node.uniqueId.toLowerCase(),
    };
  }

  public render(): any {
    return {
      apiVersion: this.props.apiVersion,
      kind: this.props.kind,
      metadata: this.metadata,
      data: this.props.data,
      spec: this.props.spec
    };
  }
}

// function removeEmpty(obj: any) {
//   Object.entries(obj).forEach(([ key, value ]) => {
//     if (!Array.isArray(obj) && typeof value === 'object') {
//       removeEmpty(value);
//     }
//     else if (value == null) {
//       delete obj[key];
//     }
//   });
//   return obj;
// };