import { Construct, ISynthesisSession, Node } from 'constructs';
import * as fs from 'fs';
import * as path from 'path';
import { ApiObject } from './api-object';
import { Names } from './names';
import { Yaml } from './yaml';

export interface ChartOptions {
  /**
   * The default namespace for all objects defined in this chart (directly or
   * indirectly). This namespace will only apply to objects that don't have a
   * `namespace` explicitly defined for them.
   *
   * @default - no namespace is synthesized (usually this implies "default")
   */
  readonly namespace?: string;
}

export class Chart extends Construct {

  /**
   * Finds the chart in which a node is defined.
   * @param c a construct node
   */
  public static of(c: Construct): Chart {
    if (c instanceof Chart) {
      return c;
    }

    const parent = Node.of(c).scope as Construct;
    if (!parent) {
      throw new Error(`cannot find a parent chart (directly or indirectly)`);
    }

    return Chart.of(parent);
  }

  /**
   * The name of the stack's YAML file as emitted into the cloud assembly
   * directory during synthesis.
   */
  public readonly manifestFile: string;

  /**
   * The default namespace for all objects in this chart.
   */
  public readonly namespace?: string;

  constructor(scope: Construct, ns: string, options: ChartOptions = { }) {
    super(scope, ns);
    this.manifestFile = `${Node.of(this).uniqueId}.k8s.yaml`;
    this.namespace = options.namespace;
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
   * Renders this chart to a set of Kubernetes JSON resources.
   * @returns array of resource manifests
   */
  public toJson(): any[] {
    return Node.of(this)
      .findAll()
      .filter(x => x instanceof ApiObject)
      .map(x => (x as ApiObject).toJson());
  }

  /**
   * Called by the app to synthesize the chart as a YAML file in the output directory/
   */
  protected onSynthesize(session: ISynthesisSession) {
    Yaml.save(path.join(session.outdir, this.manifestFile), this.toJson());
  }
}
