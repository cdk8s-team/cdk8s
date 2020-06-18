import { Construct } from 'constructs';
import * as cdk8s from 'cdk8s';
import * as k8s from '../imports/k8s';
import { ObjectMeta } from './object-meta';

/**
 * Initialization properties for resources.
 */
export interface ResourceProps {
  /**
   * Metadata that all persisted resources must have, which includes all objects
   * users must create.
   */
  readonly metadata?: ObjectMeta
}

/**
 * Represents a resource.
 */
export interface IResource {
  /**
   * The Kubernetes name of this resource.
   */
  readonly name: string;
}

/**
 * Base class for all Kubernetes objects in stdk8s. Represents a single
 * resource.
 */
export abstract class Resource extends Construct implements IResource {

  /**
   * The metadata associated with this resource.
   */
  protected readonly metadata: ObjectMeta;

  constructor(scope: Construct, id: string, props: ResourceProps) {
    super(scope, id);

    this.metadata = props.metadata ?? new ObjectMeta();
  }

  /**
   * The underlying cdk8s API object.
   */
  public abstract readonly apiObject: cdk8s.ApiObject;

  /**
   * The name of this API object.
   */
  public get name(): string {
    return this.apiObject.name;
  }

  protected synthesizeMetadata(): k8s.ObjectMeta {
    return this.metadata._toKube();
  }
}