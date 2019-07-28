import { Construct, ISynthesisSession } from '@aws-cdk/core';
import fs = require('fs');
import path = require('path');
import { KubResource } from './resource';
const YAML = require('yaml');

export class Stack extends Construct {

  /**
   * The name of the stack's YAML file as emitted into the cloud assembly
   * directory during synthesis.
   */
  public readonly assemblyFileName: string;

  constructor(scope: Construct, id: string) {
    super(scope, id);

    this.assemblyFileName = `${this.node.uniqueId}.k8s.yaml`;
  }

  protected synthesize(session: ISynthesisSession) {
    const resources = new Array<any>();

    for (const resource of this.node.findAll().filter(x => x instanceof KubResource)) {
      resources.push((resource as KubResource).render());
    }

    const doc = resources.map(r => YAML.stringify(r)).join('---\n');
    fs.writeFileSync(path.join(session.assembly.outdir, this.assemblyFileName), doc);
  }
}
