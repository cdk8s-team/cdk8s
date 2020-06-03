import { Construct, Node, IConstruct } from 'constructs';
import fs = require('fs');
import { Chart } from './chart';
import * as path from 'path';
import { Yaml } from './yaml';
import { DependencyGraph } from './dependency';

export interface AppOptions {
  /**
   * The directory to output Kubernetes manifests.
   *
   * @default - CDK8S_OUTDIR if defined, otherwise "dist"
   */
  readonly outdir?: string;
}

/**
 * Represents a cdk8s application.
 */
export class App extends Construct {
  /**
   * The output directory into which manifests will be synthesized.
   */
  public readonly outdir: string;

  /**
   * Defines an app
   * @param options configuration options
   */
  constructor(options: AppOptions = { }) {
    super(undefined as any, '');
    this.outdir = options.outdir ?? process.env.CDK8S_OUTDIR ?? 'dist';
  }

  /**
   * Synthesizes all manifests to the output directory
   */
  public synth(): void {
    if (!fs.existsSync(this.outdir)) {
      fs.mkdirSync(this.outdir);
    }

    // create explicit chart dependencies
    // from implicit construct dependencies
    for (const dep of Node.of(this).dependencies) {

      const sourceChart = Chart.of(dep.source);
      const targetChart = Chart.of(dep.target);

      if (sourceChart !== targetChart) {
        Node.of(sourceChart).addDependency(targetChart);
      }
    }

    // TODO add validate call here

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    for (const index in charts) {

      const node: IConstruct = charts[index];
      const chart: Chart = Chart.of(node);
      const manifestFile = `${Node.of(chart).uniqueId}.k8s.yaml`;

      const paddedIndex = index.toString().padStart(4, '0');

      Yaml.save(path.join(this.outdir, `${paddedIndex}-${manifestFile}`), chart.toJson());
    }

  }
}
