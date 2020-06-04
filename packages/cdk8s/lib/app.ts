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
    fs.mkdirSync(this.outdir, { recursive: true });

    // create explicit chart dependencies
    // from implicit construct dependencies
    for (const dep of Node.of(this).dependencies) {

      const sourceChart = Chart.of(dep.source);
      const targetChart = Chart.of(dep.target);

      if (sourceChart !== targetChart) {
        Node.of(sourceChart).addDependency(targetChart);
      }
    }

    // this will validate ALL nodes of the application
    const errors = Node.of(this).validate();
    if (errors.length > 0) {
      const errorList = errors.map(e => `[${Node.of(e.source).path}] ${e.message}`).join('\n  ');
      throw new Error(`Validation failed with the following errors:\n  ${errorList}`);
    }

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    const simpleManifestNamer = (chart: Chart) => `${Node.of(chart).uniqueId}.k8s.yaml`;

    const manifestNamer = this.hasDependantCharts() ? (chart: Chart) => `${index.toString().padStart(4, '0')}-${simpleManifestNamer(chart)}` : simpleManifestNamer;

    let index = 0;
    for (const node of charts) {
      const chart: Chart = Chart.of(node);
      Yaml.save(path.join(this.outdir, manifestNamer(chart)), chart.toJson());
      index++;
    }

  }

  private hasDependantCharts() {
    // this is kind of sucky, eventually I would like the DependencyGraph
    // to be able to answer this question.
    return Node.of(this).dependencies.filter(d => d.source instanceof Chart && d.target instanceof Chart).length !== 0;
  }

}
