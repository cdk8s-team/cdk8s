import { Construct, Node, IConstruct } from 'constructs';
import { ApiObject } from './api-object';
import { App } from './app';
import { Names } from './names';

export interface ChartProps {
  /**
   * The default namespace for all objects defined in this chart (directly or
   * indirectly). This namespace will only apply to objects that don't have a
   * `namespace` explicitly defined for them.
   *
   * @default - no namespace is synthesized (usually this implies "default")
   */
  readonly namespace?: string;

  /**
   * Labels to apply to all resources in this chart.
   *
   * @default - no common labels
   */
  readonly labels?: { [name: string]: string };
}

export class Chart extends Construct {

  /**
   * Finds the chart in which a node is defined.
   * @param c a construct node
   */
  public static of(c: IConstruct): Chart {
    if (c instanceof Chart) {
      return c;
    }

    const parent = Node.of(c).scope as Construct;
    if (!parent) {
      throw new Error('cannot find a parent chart (directly or indirectly)');
    }

    return Chart.of(parent);
  }

  /**
   * The default namespace for all objects in this chart.
   */
  public readonly namespace?: string;

  /**
   * Chart-level labels.
   */
  private readonly _labels?: { [name: string]: string };

  constructor(scope: Construct, id: string, props: ChartProps = { }) {
    super(scope, id);
    this.namespace = props.namespace;
    this._labels = props.labels ?? {};
  }

  /**
   * Labels applied to all resources in this chart.
   *
   * This is an immutable copy.
   */
  public get labels(): { [name: string]: string } {
    return { ...this._labels };
  }

  /**
   * Generates a app-unique name for an object given it's construct node path.
   *
   * Different resource types may have different constraints on names
   * (`metadata.name`). The previous version of the name generator was
   * compatible with DNS_SUBDOMAIN but not with DNS_LABEL.
   *
   * For example, `Deployment` names must comply with DNS_SUBDOMAIN while
   * `Service` names must comply with DNS_LABEL.
   *
   * Since there is no formal specification for this, the default name
   * generation scheme for kubernetes objects in cdk8s was changed to DNS_LABEL,
   * since it’s the common denominator for all kubernetes resources
   * (supposedly).
   *
   * You can override this method if you wish to customize object names at the
   * chart level.
   *
   * @param apiObject The API object to generate a name for.
   */
  public generateObjectName(apiObject: ApiObject) {
    return Names.toDnsLabel(apiObject);
  }

  /**
   * Create a dependency between this Chart and other constructs.
   * These can be other ApiObjects, Charts, or custom.
   *
   * @param dependencies the dependencies to add.
   */
  public addDependency(...dependencies: IConstruct[]) {
    Node.of(this).addDependency(...dependencies);
  }

  /**
   * Renders this chart to a set of Kubernetes JSON resources.
   * @returns array of resource manifests
   */
  public toJson(): any[] {
    return App._synthChart(this);
  }
}

