import fs = require('fs');
import path = require('path');
import os = require('os');
import { App, Chart } from '../lib';
import * as YAML from 'yaml';

/**
 * Testing utilities for cdk8s applications.
 */
export class Testing {
  /**
   * Returns an app for testing with the following properties:
   * - Output directory is a temp dir.
   */
  public static app() {
    const outdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s.outdir.'));
    return new App({ outdir });
  }

  /**
   * Returns the Kubernetes manifest synthesized from this chart.
   */
  public static synth(chart: Chart) {
    const app = chart.node.root as App;
    app.synth();
    
    const filePath = path.join(app.outdir, chart.manifestFile);
    return YAML.parseAllDocuments(fs.readFileSync(filePath, 'utf-8')).map((doc: any) => doc.toJSON());
  }

  private constructor() {
    return;
  }
}
