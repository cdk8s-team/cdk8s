import { Construct, Node } from 'constructs';
import * as fs from 'fs';
import * as path from 'path';
import * as cp from 'child_process';
import * as yaml from 'yaml';
import * as os from 'os';
import { Include } from './include';
import { Names } from './names';

/**
 * Options for `HelmChart`.
 */
export interface HelmOptions {
  /**
   * The chart name to use. It can be a chart from a helm repository or a local directory.
   * 
   * This name is passed to `helm template` and has all the relevant semantics.
   *
   * @example "./mysql"
   * @example "bitnami/redis"
   */
  readonly chart: string;

  /**
   * The release name.
   * 
   * @default - if unspecified, a name will be allocated based on the construct path
   */
  readonly releaseName?: string;

  /**
   * Values to pass to the chart.
   * 
   * @default - If no values are specified, chart will use the defaults.
   */
  readonly values?: { [key: string]: any };

  /**
   * The local helm executable to use in order to create the manifest the chart.
   *
   * @default "helm"
   */
  readonly helmExecutable?: string;
}


/**
 * Represents a Helm deployment. 
 * 
 * Use this construct to import an existing Helm chart and incorporate it into your constructs.
 */
export class Helm extends Include {

  /**
   * The helm release name.
   */
  public readonly releaseName: string;

  constructor(scope: Construct, id: string, opts: HelmOptions) {
    const workdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s-helm-'));

    const args = new Array<string>();

    args.push('template');
    
    if (opts.values && Object.keys(opts.values).length > 0) {
      const valuesPath = path.join(workdir, 'overrides.yaml');
      fs.writeFileSync(valuesPath, yaml.stringify(opts.values));
      args.push('-f', valuesPath);
    }

    // release name constraints: https://github.com/helm/helm/issues/6006
    const cpath = [ Node.of(scope).path, id ].join('/');
    const releaseName = opts.releaseName ?? Names.toDnsLabel(cpath, 53);;
    args.push(releaseName);

    args.push(opts.chart);

    const prog = opts.helmExecutable ?? 'helm';
    const outputFile = renderTemplate(workdir, prog, args);

    super(scope, id, { url: outputFile });

    this.releaseName = releaseName;
  }
}


function renderTemplate(workdir: string, prog: string, args: string[]) {
  const helm = cp.spawnSync(prog, args);
  const err = helm.error?.message ?? helm.stderr.toString();
  if (err?.includes('ENOENT')) {
    throw new Error(`unable to execute '${prog}' to render Helm chart`);
  }
  if (err) {
    throw new Error(`Error occurred while rendering a helm chart: ${err}`);
  }

  const outputFile = path.join(workdir, 'chart.yaml');
  fs.writeFileSync(outputFile, helm.stdout);
  return outputFile;
}
