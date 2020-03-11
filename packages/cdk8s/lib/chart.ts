import { Construct, ISynthesisSession, ConstructNode } from 'constructs';
import * as fs from 'fs';
import * as path from 'path';
import { ApiObject } from './api-object';
import * as YAML from 'yaml';
import { Names } from './names';

export class Chart extends Construct {

  /**
   * Finds the chart in which a node is defined.
   * @param c a construct node
   */
  public static of(c: Construct): Chart {
    if (c instanceof Chart) {
      return c;
    }

    const parent = ConstructNode.of(c).scope as Construct;
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

  constructor(scope: Construct, ns: string) {
    super(scope, ns);
    this.manifestFile = `${ConstructNode.of(this).uniqueId}.k8s.yaml`;
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
    return Names.toDnsLabel(ConstructNode.of(apiObject).path);
  }

  /**
   * Renders this chart to a set of Kubernetes JSON resources.
   * @returns array of resource manifests
   */
  public toJson(): any[] {
    return ConstructNode.of(this)
      .findAll()
      .filter(x => x instanceof ApiObject)
      .map(x => (x as ApiObject).toJson());
  }

  /**
   * Called by the app to synthesize the chart as a YAML file in the output directory/
   */
  protected synthesizeConstruct(session: ISynthesisSession) {
    // convert each resource to yaml and separate with a '---' line
    const doc = this.toJson().map(r => YAML.stringify(r)).join('---\n');
    fs.writeFileSync(path.join(session.outdir, this.manifestFile), doc);
  }
}
