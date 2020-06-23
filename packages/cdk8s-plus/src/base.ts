import { Construct } from 'constructs';
import * as cdk8s from 'cdk8s';

/**
 * Initialization properties for resources.
 */
export interface ResourceProps {
  /**
   * Metadata that all persisted resources must have, which includes all objects
   * users must create.
   */
  readonly metadata?: cdk8s.ApiObjectMetadata
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

  constructor(scope: Construct, id: string, _: ResourceProps) {
    super(scope, id);
  }

  /**
   * The underlying cdk8s API object.
   */
  protected abstract readonly apiObject: cdk8s.ApiObject;

  public get metadata(): cdk8s.ApiObjectMetadataDefinition {
    return this.apiObject.metadata;
  }

  /**
   * The name of this API object.
   */
  public get name(): string {
    return this.apiObject.name;
  }
}