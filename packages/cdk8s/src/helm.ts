import * as cp from 'child_process';
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';
import { Construct, Node } from 'constructs';
import * as yaml from 'yaml';
import { Include } from './include';
import { Names } from './names';

/**
 * Options for `Helm`.
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
   * @see https://helm.sh/docs/intro/using_helm/#three-big-concepts
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

  /**
   * Additional flags to add to the `helm` execution.
   *
   * @default []
   */
  readonly helmFlags?: string[];
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

    // values
    if (opts.values && Object.keys(opts.values).length > 0) {
      const valuesPath = path.join(workdir, 'overrides.yaml');
      fs.writeFileSync(valuesPath, yaml.stringify(opts.values));
      args.push('-f', valuesPath);
    }

    // custom flags
    if (opts.helmFlags) {
      args.push(...opts.helmFlags);
    }

    // release name
    const cpath = [Node.of(scope).path, id].join(Node.PATH_SEP);
    const releaseName = opts.releaseName ?? Names.toDnsLabel(cpath, 53); // constraints: https://github.com/helm/helm/issues/6006
    args.push(releaseName);

    // chart
    args.push(opts.chart);

    const prog = opts.helmExecutable ?? 'helm';
    const outputFile = renderTemplate(workdir, prog, args);

    super(scope, id, { url: outputFile });

    this.releaseName = releaseName;
  }
}

function renderTemplate(workdir: string, prog: string, args: string[]) {
  const helm = cp.spawnSync(prog, args);
  if (helm.error) {
    const err = helm.error.message;
    if (err.includes('ENOENT')) {
      throw new Error(`unable to execute '${prog}' to render Helm chart. Is it installed on your system?`);
    }

    throw new Error(`error while rendering a helm chart: ${err}`);
  }

  if (helm.status !== 0) {
    throw new Error(helm.stderr.toString());
  }

  const outputFile = path.join(workdir, 'chart.yaml');
  const stdout = helm.stdout;
  fs.writeFileSync(outputFile, stdout);
  return outputFile;
}
