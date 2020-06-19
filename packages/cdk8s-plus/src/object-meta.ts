import * as k8s from './imports/k8s';

/**
 * Properties to create an ObjectMeta.
 */
export interface ObjectMetaProps {

  /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be
   * preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
   *
   * @default - No annotations.
   */
  readonly annotations?: { [key: string]: string };

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects.
   * May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
   *
   * @default - No labels.
   */
  readonly labels?: { [key: string]: string };

  /**
   * The name to assign to the resource that is bound to this metadata object.
   * If this is not set, cdk8s will generate an name for the resource that is based on the construct tree path.
   *
   * @default undefined
   */
  readonly name?: string;

  /**
   * Namespace defines the space within each name must be unique. An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation.
   * Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty. Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
   *
   * @default undefined (will be assigned to the 'default' namespace)
   */
  readonly namespace?: string;

}

export class ObjectMeta {

  /**
   * The name configured for this metadata object.
   */
  public readonly name?: string;

  private readonly namespace?: string;
  private readonly labels: { [key: string]: string };
  private readonly annotations: { [key: string]: string };

  constructor(props: ObjectMetaProps = {}) {
    this.annotations = props.annotations ?? {};
    this.labels = props.labels ?? {};
    this.name = props.name;
    this.namespace = props.namespace;
  }

  /**
   * Add a label.
   *
   * @param key - The key.
   * @param value - The value.
   */
  public addLabel(key: string, value: string) {
    this.labels[key] = value;
  }

  /**
   * Add an annotation.
   *
   * @param key - The key.
   * @param value - The value.
   */
  public addAnnotation(key: string, value: string) {
    this.annotations[key] = value;
  }

  /**
   * @internal
   */
  public _toKube(): k8s.ObjectMeta {
    return {
      annotations: this.annotations,
      labels: this.labels,
      name: this.name,
      namespace: this.namespace,
    };
  }

}