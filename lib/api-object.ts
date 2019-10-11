import { Construct } from '@aws-cdk/core';
import { ObjectmetaMetaV1 } from './.generated/objectmeta-meta-v1';

export interface ApiObjectProps {
  /**
   * The API object spec.
   */
  readonly spec?: any;

  /**
   * Data associated with the resource.
   */
  readonly data?: any;

  /**
   * Resource kind.
   */
  readonly kind: string;

  /**
   * API version.
   */
  readonly apiVersion: string;

  /**
   * Object metadata.
   *
   * If `name` is not specified, an app-unique name will be allocated by the
   * framework based on the path of the construct within thes construct tree.
   */
  readonly metadata?: ObjectmetaMetaV1;
}

export class ApiObject extends Construct {

  /**
   * The app-unique name of the object.
   *
   * The name is allocated based on the path of the object construct within the
   * construct tree.
   */
  public readonly name: string;

  public readonly apiVersion: string;
  public readonly kind: string;

  private readonly metadata: ObjectmetaMetaV1;

  constructor(scope: Construct, id: string, private readonly props: ApiObjectProps) {
    super(scope, id);

    this.kind = props.kind;
    this.apiVersion = props.apiVersion;

    this.metadata = props.metadata || {};
    this.metadata.name = this.metadata.name || this.node.uniqueId.toLowerCase();
  }

  /**
   * Renders the object to Kubernetes config.
   */
  public render(): any {
    return removeEmpty({
      apiVersion: this.props.apiVersion,
      kind: this.props.kind,
      metadata: this.metadata,
      data: this.props.data,
      spec: this.props.spec
    });
  }
}

function removeEmpty(obj: any) {
  Object.entries(obj).forEach(([ key, value ]) => {
    if (!Array.isArray(obj) && typeof value === 'object') {
      removeEmpty(value);
    }
    else if (value == null) {
      delete obj[key];
    }
  });
  return obj;
};