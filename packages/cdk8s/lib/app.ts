import { Construct, Node, IConstruct } from 'constructs';
import fs = require('fs');
import { Chart } from './chart';
import * as path from 'path';
import { Yaml } from './yaml';
import { DependencyGraph } from './dependency';
import { ApiObject } from './api-object';

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

    const hasChartDependencies = this.inferChartDependencies();

    // Since we plan on removing the distributed synth mechanism, we no longer call `Node.synthesize`, but rather simply implement
    // the necessary operations. We do however want to preserve the distributed validation.
    // Note this is a copy-paste of https://github.com/aws/constructs/blob/master/lib/construct.ts#L438.
    const errors = Node.of(this).validate();
    if (errors.length > 0) {
      const errorList = errors.map(e => `[${Node.of(e.source).path}] ${e.message}`).join('\n  ');
      throw new Error(`Validation failed with the following errors:\n  ${errorList}`);
    }

    this.produceManifests(hasChartDependencies);

  }

  private inferChartDependencies(): boolean {

    // this is kind of sucky, eventually I would like the DependencyGraph
    // to be able to answer this question.
    let hasChartDependencies = false;

    // create explicit chart dependencies
    // from implicit api object dependencies
    for (const dep of Node.of(this).dependencies) {

      const sourceChart = Chart.of(dep.source);
      const targetChart = Chart.of(dep.target);

      if (sourceChart !== targetChart) {
        Node.of(sourceChart).addDependency(targetChart);
        hasChartDependencies = true;
      }

    }

    return hasChartDependencies;
  }

  private produceManifests(hasChartDependencies: boolean) {

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    const simpleManifestNamer = (chart: Chart) => `${Node.of(chart).uniqueId}.k8s.yaml`;

    const manifestNamer = hasChartDependencies ? (chart: Chart) => `${index.toString().padStart(4, '0')}-${simpleManifestNamer(chart)}` : simpleManifestNamer;

    let index = 0;
    for (const node of charts) {
      const chart: Chart = Chart.of(node);
      Yaml.save(path.join(this.outdir, manifestNamer(chart)), chart.toJson());
      index++;
    }

  }

}
