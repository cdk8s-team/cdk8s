import { Construct } from 'constructs';
import { ApiObject } from './api-object';
import * as fs from 'fs';
import * as path from 'path';
import * as cp from 'child_process';
import * as yaml from 'yaml';

export interface HelmChartProps {
  /**
   * The absolute path to the chart that is being imported.
   *
   * @example "./mysql"
   */
  readonly chart: string;

  /**
   * An optional string or object which provides all of the override values for the charts.
   *
   * If a string is provided than it must be relative to the chart path.
   * */
  readonly values?: string | { [key: string]: any };

  /**
   * A local 'helm' command to run. If not found, it will fall back to using a docker image.
   *
   * @default "helm"
   */
  readonly helmCmd?: string;
}

function stringToParams(params: string) {
  return params.split(' ').filter(x => !!x);
}

function convertYamlDocsToObjects(docs: string[]) {
  return docs.filter((x: string) => !!x).map((doc: string) => yaml.parse(doc)).filter((x: any) => !!x);
}

function getAbsolutePath(chart: string) {
  return chart.startsWith('/') ? chart : path.join(__dirname, chart);
}

/**
 * Represents a Helm chart. Use this construct to import an existing Helm chart and incorporate it into your constructs.
 */
export class HelmChart extends Construct {
  constructor(scope: Construct, id: string, props: HelmChartProps) {
    super(scope, id);

    let optionalValues = '';
    let additionalVolumes = '';
    let overrideValuesLocation: string = '';
    const canRunLocally = HelmChart.checkLocal(props.helmCmd);

    if (props.values) {
      if (typeof props.values === 'string') {
        optionalValues = `-f ${props.values}`;
      }
      if (typeof props.values === 'object') {
        const tempDir = path.join(process.cwd(), '.helm-temp');
        if (!fs.existsSync(tempDir)) {
          fs.mkdirSync(tempDir);
        }
        overrideValuesLocation = path.join(tempDir, 'overrides.yaml');
        fs.writeFileSync(overrideValuesLocation, yaml.stringify(props.values));
        additionalVolumes = `-v ${tempDir}:/props`;
        optionalValues = canRunLocally ? `-f ${overrideValuesLocation}` : '-f /props/overrides.yaml';
      }
    }

    let docs: string[];

    if (canRunLocally) {
      const helmProcess = cp.spawnSync(props.helmCmd ?? 'helm', stringToParams(`template ${optionalValues} .`), {cwd: props.chart});
      const err = helmProcess.error?.message ?? helmProcess.stderr.toString();
      if (err) {
        throw new Error('An error occurred rendering the template: ' + err);
      }
      docs = helmProcess.stdout.toString().split('---');

    } else {

      const absolutePath = getAbsolutePath(props.chart);
      const dockerProcess = cp.spawnSync('docker', stringToParams(`run -v ${absolutePath}:/app ${additionalVolumes} -w /app alpine/helm template ${optionalValues} .`));

      const err = dockerProcess.error?.message ?? dockerProcess.stderr.toString();
      if (err) {
        throw new Error('An error occurred rendering the template: ' + err);
      }
      docs = dockerProcess.stdout.toString().split('---');
    }

    const convertedObjects = convertYamlDocsToObjects(docs);

    let importCount = 0;
    for (const raw of convertedObjects) {
      new ApiObject(this, `imported-${importCount}`, raw);
      importCount++;
    }
  }

  private static checkLocal(helmCmd: string | undefined) {
    const helmProcess = cp.spawnSync(helmCmd ?? 'helm', ['version', '-c']);
    if (helmProcess.error) {
      console.warn("Could not find local Helm. Falling back to docker. If you'd rather not use Docker, ensure 'helm' has been install and is available in the path. You can also override the helm command to use by specifying the `helmCmd` prop.");
      return false;
    }
    return true;
  }
}
