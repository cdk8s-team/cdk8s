import { Construct } from '@aws-cdk/core';
import { renderObjectName } from './names';

export interface ApiObjectMetadata {
  readonly name?: string;
  readonly [key: string]: any;
}


export interface ApiObjectOptions {
  /**
   * Data associated with the resource.
   */
  readonly data?: any;

  /**
   * Object metadata.
   *
   * If `name` is not specified, an app-unique name will be allocated by the
   * framework based on the path of the construct within thes construct tree.
   */
  readonly metadata?: ApiObjectMetadata;  

  /**
   * API version.
   */
  readonly apiVersion: string;

  /**
   * Resource kind.
   */
  readonly kind: string;

  /**
   * Additional attributes for this API object.
   */
  readonly [key: string]: any;
}

export class ApiObject extends Construct {

  /**
   * The app-unique name of the object.
   *
   * The name is allocated based on the path of the object construct within the
   * construct tree.
   */
  public readonly name: string;

  /**
   * The object's API version.
   */
  public readonly apiVersion: string;

  /**
   * The object kind.
   */
  public readonly kind: string;

  constructor(scope: Construct, ns: string, private readonly options: ApiObjectOptions) {
    super(scope, ns);
    this.kind = options.kind;
    this.apiVersion = options.apiVersion;
    this.name = options.metadata?.name ?? this.generateName();
  }

  /**
   * Generates a name for this object based on the construct path. 
   *
   * Kubernetes resources can have names up to 253 characters long. The
   * characters allowed in names are: digits (0-9), lower case letters (a-z), -,
   * and ..
   */
  protected generateName() {
    return renderObjectName(this.node.path);
  }

  /**
   * Renders the object to Kubernetes config.
   * @internal
   */
  public _render(): any {
    return {
      ...this.options,
      metadata: {
        ...this.options.metadata,
        name: this.name
      }
    };
  }
}

