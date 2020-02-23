import { Construct, ISynthesisSession } from '@aws-cdk/core';
import fs = require('fs');
import path = require('path');
import { ApiObject } from './api-object';
import YAML = require('yaml');
import { resolve } from './_tokens';
import { removeEmpty } from './_util';

export class Chart extends Construct {

  /**
   * Finds the chart in which a node is defined.
   * @param node a construct node
   */
  public static of(node: Construct): Chart {
    if (node instanceof Chart) {
      return node;
    }

    const parent = node.node.scope as Construct;
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

    this.manifestFile = `${this.node.uniqueId}.k8s.yaml`;
  }

  protected synthesize(session: ISynthesisSession) {
    const resources = new Array<any>();

    for (const resource of this.node.findAll()) {
      if (!(resource instanceof ApiObject)) {
        continue;
      }

      const manifest = removeEmpty(resolve(this, resource._render()));
      resources.push(manifest);
    }

    // convert each resource to yaml and separate with a '---' line
    const doc = resources.map(r => toYaml(r)).join('---\n');
    fs.writeFileSync(path.join(session.assembly.outdir, this.manifestFile), doc);
  }
}

function toYaml(o: any) {
  // lose anchors which are based on reference equality
  const x = JSON.parse(JSON.stringify(o));
  return YAML.stringify(x);
}
