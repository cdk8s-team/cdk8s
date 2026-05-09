import { Construct } from 'constructs';
import { Lazy } from './lazy';
import { Token } from './token';
import { IResolvable } from './resolvable';
import { ApiObjectMetadata, ApiObjectMetadataDefinition } from './metadata';
import { ApiObjectOptions } from './api-object-options';
import { Names } from './names';
import { Dependencies } from './dependencies';
import { addConstructMetadata } from './construct-metadata';

/**
 * Metadata for Kubernetes API objects.
 */
export interface ApiObjectMetadata {
  /**
   * Name of the object.
   *
   * @default - auto-generated if `generateName` is provided, otherwise undefined
   */
  readonly name?: string;

  /**
   * GenerateName is an optional prefix to use for server-side name generation.
   *
   * If specified, the server will automatically generate a unique name that starts
   * with this prefix. This is useful in scenarios where names must be unique but
   * you don't want to provide a concrete name.
   *
   * @default - no name generation prefix
   */
  readonly generateName?: string;

  /**
   * Namespace of the object.
   *
   * @default - undefined
   */
  readonly namespace?: string;

  /**
   * Labels to apply to the object.
   *
   * @default - undefined
   */
  readonly labels?: { [name: string]: string };

  /**
   * Annotations to apply to the object.
   *
   * @default - undefined
   */
  readonly annotations?: { [name: string]: string };

  /**
   * Finalizers to apply to the object.
   *
   * @default - undefined
   */
  readonly finalizers?: string[];

  /**
   * OwnerReferences to apply to the object.
   *
   * @default - undefined
   */
  readonly ownerReferences?: OwnerReference[];
}

/**
 * Owner reference information.
 */
export interface OwnerReference {
  /**
   * API version of the referent.
   */
  readonly apiVersion: string;

  /**
   * Kind of the referent.
   */
  readonly kind: string;

  /**
   * Name of the referent.
   */
  readonly name: string;

  /**
   * UID of the referent.
   */
  readonly uid: string;

  /**
   * If true, the referent is the controller.
   *
   * @default - false
   */
  readonly controller?: boolean;

  /**
   * If true, blocks deletion of the dependent object.
   *
   * @default - false
   */
  readonly blockOwnerDeletion?: boolean;
}

/**
 * Represents a Kubernetes API object.
 */
export class ApiObject extends Construct implements IApiObject {
  /**
   * The API version of this object.
   */
  public readonly apiVersion: string;

  /**
   * The kind of this object.
   */
  public readonly kind: string;

  /**
   * The metadata of this object.
   */
  public readonly metadata: ApiObjectMetadataDefinition;

  constructor(scope: Construct, id: string, props: ApiObjectProps) {
    super(scope, id);

    this.apiVersion = props.apiVersion;
    this.kind = props.kind;
    this.metadata = new ApiObjectMetadataDefinition(props.metadata);

    addConstructMetadata(this);
  }

  /**
   * Renders the object to JSON.
   */
  public toJson(): any {
    return {
      apiVersion: this.apiVersion,
      kind: this.kind,
      metadata: this.metadata.toJson(),
    };
  }
}

/**
 * Properties for `ApiObject`.
 */
export interface ApiObjectProps {
  /**
   * The API version of the object.
   */
  readonly apiVersion: string;

  /**
   * The kind of the object.
   */
  readonly kind: string;

  /**
   * Metadata for the object.
   */
  readonly metadata: ApiObjectMetadata;
}
