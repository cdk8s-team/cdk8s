import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import { App, AppProps } from './app';
import { Chart } from './chart';

/**
 * Testing utilities for cdk8s applications.
 */
export class Testing {
  /**
   * Returns an app for testing with the following properties:
   * - Output directory is a temp dir.
   */
  public static app(props?: AppProps) {
    let outdir: string;
    if (props) {
      outdir = props.outdir ? props.outdir : fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s.outdir.'));
    } else {
      outdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s.outdir.'));
    }
    return new App({ outdir, ...props });
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
