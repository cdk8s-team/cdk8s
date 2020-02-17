import {mkdtempSync} from 'fs';
import {join} from 'path';
import {tmpdir} from 'os';
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
    const outdir = mkdtempSync(join(tmpdir(), 'cdk8s.outdir.'));
    return new App({ outdir });
  }

  /**
   * Returns the Kubernetes manifest synthesized from this chart.
   */
  public static synth(chart: Chart) {
    return chart.toJson();
  }

  /* istanbul ignore next */
  private constructor() {
    return;
  }
}
