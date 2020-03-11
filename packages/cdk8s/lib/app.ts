import { Construct, ConstructNode } from 'constructs';
import * as fs from 'fs';
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

  /**
   * Synthesizes all manifests to the output directory
   */
  public synth(): void {
    ConstructNode.synthesizeNode(ConstructNode.of(this), {
      outdir: this.outdir
    });

    // remove manifest.json and cdk.out
    rm(path.join(this.outdir, 'manifest.json'));
    rm(path.join(this.outdir, 'cdk.out'));
  }
}

function rm(filePath: string) {
  if (fs.existsSync(filePath)) {
    fs.unlinkSync(filePath);
  }
}