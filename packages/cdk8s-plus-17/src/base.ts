import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';

/**
 * Initialization properties for resources.
 */
export interface ResourceProps {
  /**
   * Metadata that all persisted resources must have, which includes all objects
   * users must create.
   */
  readonly metadata?: cdk8s.ApiObjectMetadata;
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
   * The underlying cdk8s API object.
   */
  protected abstract readonly apiObject: cdk8s.ApiObject;

  constructor(scope: Construct, id: string, _: ResourceProps) {
    super(scope, id);
  }

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