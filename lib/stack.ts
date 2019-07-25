import { Construct, ISynthesisSession } from '@aws-cdk/core';
import fs = require('fs');
import path = require('path');
import { KubResource } from './resource';
const YAML = require('yaml');

export class Stack extends Construct {
  constructor(scope: Construct, id: string) {
    super(scope, id);
  }

  protected synthesize(session: ISynthesisSession) {
    const resources = new Array<any>();

    for (const resource of this.node.findAll().filter(x => x instanceof KubResource)) {
      resources.push((resource as KubResource).render());
    }

    const doc = resources.map(r => YAML.stringify(r)).join('---\n');
    fs.writeFileSync(path.join(session.assembly.outdir, `${this.node.uniqueId}.k8s.yaml`), doc);
  }
}
