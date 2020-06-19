import fs = require('fs');
import path = require('path');
import os = require('os');
import { App, Chart } from '../lib';

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
   * @returns a Chart that can be used for tests
   */
  public static chart() {
    return new Chart(this.app(), 'test');
  }

  /**
   * Returns the Kubernetes manifest synthesized from this chart.
   */
  public static synth(chart: Chart): any[] {
    return chart.toJson();
  }

  /* istanbul ignore next */
  private constructor() {
    return;
  }
}
