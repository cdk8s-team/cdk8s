import { Construct, Node, ISynthesisSession, IConstruct } from 'constructs';
import fs = require('fs');
import * as YAML from 'yaml';
import { Chart, DependencyGraph } from './chart';
import * as path from 'path';

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

  protected onPrepare() {
    super.onPrepare()
    
    // create explicit chart dependencies 
    // from implicit construct dependencies
    for (const dep of Node.of(this).dependencies) {
      
      const sourceChart = Chart.of(dep.source);
      const targetChart = Chart.of(dep.target);

      if (sourceChart !== targetChart) {
        Node.of(sourceChart).addDependency(targetChart);
      }
    }

  }

  protected onSynthesize(session: ISynthesisSession) {

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    for (const index in charts) {

      const node: IConstruct = charts[index];
      const chart: Chart = Chart.of(node);
      const manifestFile = `${Node.of(chart).uniqueId}.k8s.yaml`;

      // convert each resource to yaml and separate with a '---' line
      const doc = chart.toJson().map(r => YAML.stringify(r)).join('---\n');
      fs.writeFileSync(path.join(session.outdir, `${index}-${manifestFile}`), doc);
    }
  }

  /**
   * Synthesizes all manifests to the output directory
   */
  public synth(): void {
    if (!fs.existsSync(this.outdir)) {
      fs.mkdirSync(this.outdir);
    }

    Node.of(this).synthesize({
      outdir: this.outdir
    });
  }
}
