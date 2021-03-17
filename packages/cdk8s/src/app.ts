import * as fs from 'fs';
import * as path from 'path';
import { Construct, Node, IConstruct } from 'constructs';
import { ApiObject } from './api-object';
import { Chart } from './chart';
import { DependencyGraph } from './dependency';
import { Names } from './names';
import { Yaml } from './yaml';

/** The way to divide YAML output into files */
export enum YamlOutputType {
  FILE_PER_APP,
  FILE_PER_CHART,
  FILE_PER_RESOURCE,
}

export interface AppProps {
  /**
   * The directory to output Kubernetes manifests.
   *
   * @default - CDK8S_OUTDIR if defined, otherwise "dist"
   */
  readonly outdir?: string;
  /** How to divide the YAML output into files
   *
   * @default YamlOutputType.FILE_PER_CHART
   */
  readonly yamlOutputType?: YamlOutputType;
}

/**
 * Represents a cdk8s application.
 */
export class App extends Construct {
  /**
   * Synthesize a single chart.
   *
   * Each element returned in the resulting array represents a different ApiObject
   * in the scope of the chart.
   *
   * Note that the returned array order is important. It is determined by the various dependencies between
   * the constructs in the chart, where the first element is the one without dependencies, and so on...
   *
   * @returns An array of JSON objects.
   * @param chart the chart to synthesize.
   * @internal
   */
  public static _synthChart(chart: Chart): any[] {

    const app: App = App.of(chart);

    // we must prepare the entire app before synthesizing the chart
    // because the dependency inference happens on the app level.
    resolveDependencies(app);

    // validate the app since we want to call onValidate of the relevant constructs.
    // note this will also call onValidate on constructs from possibly different charts,
    // but thats ok too since we no longer treat constructs as a self-contained synthesis unit.
    validate(app);

    return chartToKube(chart).map(apiObject => apiObject.toJson());
  }

  private static of(c: IConstruct): App {

    const scope = Node.of(c).scope;

    if (!scope) {
      // the app is the only construct without a scope.
      return c as App;
    }

    return App.of(scope);
  }

  /**
   * The output directory into which manifests will be synthesized.
   */
  public readonly outdir: string;

  /** How to divide the YAML output into files
   *
   * @default YamlOutputType.FILE_PER_CHART
   */
  public readonly yamlOutputType: YamlOutputType;

  /**
   * Defines an app
   * @param props configuration options
   */
  constructor(props: AppProps = { }) {
    super(undefined as any, '');
    this.outdir = props.outdir ?? process.env.CDK8S_OUTDIR ?? 'dist';
    this.yamlOutputType = props.yamlOutputType ?? YamlOutputType.FILE_PER_CHART;
  }

  /**
   * Synthesizes all manifests to the output directory
   */
  public synth(): void {

    fs.mkdirSync(this.outdir, { recursive: true });

    // this is kind of sucky, eventually I would like the DependencyGraph
    // to be able to answer this question.
    const hasDependantCharts = resolveDependencies(this);

    // Since we plan on removing the distributed synth mechanism, we no longer call `Node.synthesize`, but rather simply implement
    // the necessary operations. We do however want to preserve the distributed validation.
    validate(this);

    const simpleManifestNamer = (construct: Construct) => `${Names.toDnsLabel(construct)}.k8s.yaml`;

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    switch (this.yamlOutputType) {
      // TODO: Tests for non-default cases
      case YamlOutputType.FILE_PER_APP:
        let apiObjectList:ApiObject[] = [];

        for (const node of charts) {
          const chart: Chart = Chart.of(node);
          apiObjectList = apiObjectList.concat(chartToKube(chart));
        }

        if (apiObjectList.length > 0) {
          Yaml.save(
            path.join(this.outdir, 'app.k8s.yaml'), // There is no "app name", so we just hardcode the file name
            apiObjectList.map((apiObject) => apiObject.toJson()),
          );
        }
        break;

      case YamlOutputType.FILE_PER_CHART:
        const chartManifestNamer = hasDependantCharts ? (chart: Chart) =>
          `${index.toString().padStart(4, '0')}-${simpleManifestNamer(chart)}` : simpleManifestNamer;

        let index = 0;
        for (const node of charts) {
          const chart: Chart = Chart.of(node);
          const apiObjects = chartToKube(chart);

          Yaml.save(
            path.join(this.outdir, chartManifestNamer(chart)),
            apiObjects.map((apiObject) => apiObject.toJson()),
          );

          index++;
        }
        break;

      case YamlOutputType.FILE_PER_RESOURCE:
        for (const node of charts) {
          const chart: Chart = Chart.of(node);
          const apiObjects = chartToKube(chart);

          apiObjects.forEach((apiObject) => {
            if (!(apiObject === undefined)) {
              const fileName = `${`${apiObject.apiVersion.replace(/\//g, '-')}.${apiObject.kind}.${apiObject.metadata.name}`
                .replace(/[^0-9a-zA-Z-_.]/g, '')}.k8s.yaml`;
              Yaml.save(path.join(this.outdir, fileName), [apiObject.toJson()]);
            }
          });
        }
        break;

      default:
        break;
    }
  }
}

function validate(app: App) {

  // Note this is a copy-paste of https://github.com/aws/constructs/blob/master/lib/construct.ts#L438.
  const errors = Node.of(app).validate();
  if (errors.length > 0) {
    const errorList = errors.map(e => `[${Node.of(e.source).path}] ${e.message}`).join('\n  ');
    throw new Error(`Validation failed with the following errors:\n  ${errorList}`);
  }

}

function resolveDependencies(app: App) {

  let hasDependantCharts = false;

  for (const dep of Node.of(app).dependencies) {

    // create explicit api object dependencies from implicit construct dependencies
    const targetApiObjects = Node.of(dep.target).findAll().filter(c => c instanceof ApiObject);
    const sourceApiObjects = Node.of(dep.source).findAll().filter(c => c instanceof ApiObject);

    for (const target of targetApiObjects) {
      for (const source of sourceApiObjects) {
        Node.of(source).addDependency(target);
      }
    }

    // create an explicit chart dependency from implicit construct dependencies
    const sourceChart = Chart.of(dep.source);
    const targetChart = Chart.of(dep.target);

    if (sourceChart !== targetChart) {
      Node.of(sourceChart).addDependency(targetChart);
      hasDependantCharts = true;
    }

  }

  return hasDependantCharts;

}

function chartToKube(chart: Chart): ApiObject[] {
  return new DependencyGraph(Node.of(chart)).topology()
    .filter(x => x instanceof ApiObject)
    .map(x => (x as ApiObject));
}
