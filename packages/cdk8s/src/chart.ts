import { Construct, Node, IConstruct } from 'constructs';
import { ApiObject } from './api-object';
import { Names } from './names';
import { App } from './app';
import { Metadata } from './metadata';

export interface ChartOptions {
  /**
   * The default namespace for all objects defined in this chart (directly or
   * indirectly). This namespace will only apply to objects that don't have a
   * `namespace` explicitly defined for them.
   *
   * You can also define chart-scope namespace using
   * `chart.metadata.addNamespace()`.
   *
   * @default - no namespace is synthesized (usually this implies "default")
   */
  readonly namespace?: string;

  /**
   * Chart-scope labels which apply to all API objects within this chart.
   *
   * You can also add chart-scope labels using `chart.metadata.addLabels()`.
   *
   * @default - no chart-scope labels.
   */
  readonly labels?: { [name: string]: string };

  /**
   * Chart-scope annotations which apply to all API objects within this chart.
   *
   * You can also add chart-scope annotations using `chart.metadata.addAnnotations()`.
   *
   * @default - no chart-scope labels.
   */
  readonly annotations?: { [name: string]: string };
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
   * Chart-scope metadata. Metadata defined through this API is applied to all
   * API objects within the chart.
   */
  public readonly metadata: Metadata;

  constructor(scope: Construct, ns: string, options: ChartOptions = { }) {
    super(scope, ns);
    this.namespace = options.namespace;

    this.metadata = Metadata.of(this);

    // apply the namespace through Metadata object
    if (options.namespace) {
      this.metadata.addNamespace(options.namespace);
    }

    if (options.labels) {
      this.metadata.addLabels(options.labels);
    }

    if (options.annotations) {
      this.metadata.addAnnotations(options.annotations);
    }
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
    return Names.toDnsLabel(Node.of(apiObject).path);
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

