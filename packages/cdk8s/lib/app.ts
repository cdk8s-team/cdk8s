import { Construct, Node, IConstruct, Dependency } from 'constructs';
import fs = require('fs');
import { Chart } from './chart';
import * as path from 'path';
import { Yaml } from './yaml';
import { DependencyGraph } from './dependency';
import { ApiObject } from './api-object';

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

    fs.mkdirSync(this.outdir, { recursive: true });

    // this is kind of sucky, eventually I would like the DependencyGraph
    // to be able to answer this question.
    const hasChartDependencies = App.prepare(this);

    // Since we plan on removing the distributed synth mechanism, we no longer call `Node.synthesize`, but rather simply implement
    // the necessary operations. We do however want to preserve the distributed validation.
    App.validate(this);

    this.produceManifests(hasChartDependencies);

  }

  /**
   * Synthesize a single chart.
   *
   * Each element returned in the resulting array represents a different ApiObject
   * that is contained in the chart.
   *
   * Note that the return value order is important. It is determined by the various dependencies between
   * the constructs in the chart, where the first element is the one without dependencies, and so on...
   *
   * @returns An array of JSON objects.
   * @param chart the chart to synthesize.
   */
  public static synthChart(chart: Chart): any[] {

    const app: App = App.of(chart);

    // we must prepare the entire app before synthesizing the chart
    // because the dependency inference happens on the app level.
    App.prepare(app);

    // validate the app since we want to call onValidate of the relevant constructs.
    // note this will also call onValidate on constructs from possibly different charts,
    // but thats ok too since we no longer treat constructs as a self-contained synthesis unit.
    App.validate(app);

    return App.chartToJson(chart);
  }

  private produceManifests(hasChartDependencies: boolean) {

    const charts: IConstruct[] = new DependencyGraph(Node.of(this)).topology().filter(x => x instanceof Chart);

    const simpleManifestNamer = (chart: Chart) => `${Node.of(chart).uniqueId}.k8s.yaml`;

    const manifestNamer = hasChartDependencies ? (chart: Chart) => `${index.toString().padStart(4, '0')}-${simpleManifestNamer(chart)}` : simpleManifestNamer;

    let index = 0;
    for (const node of charts) {
      const chart: Chart = Chart.of(node);
      Yaml.save(path.join(this.outdir, manifestNamer(chart)), App.chartToJson(chart));
      index++;
    }

  }

  private static of(c: IConstruct): App {

    const scope = Node.of(c).scope;

    if (!scope) {
      // the app the only construct without a scope.
      return c as App;
    }

    return App.of(scope);
  }

  private static prepare(app: App) {

    let hasChartDependencies = false;

    for (const dep of Node.of(app).dependencies) {

      // create explicit api object dependencies from implicit construct dependencies
      this.inferApiObjectDependencies(dep);

      // create an explicit chart dependency from implicit construct dependencies
      hasChartDependencies = this.inferChartsDependency(dep);
    }

    return hasChartDependencies;
  }

  private static validate(app: App) {

    // Note this is a copy-paste of https://github.com/aws/constructs/blob/master/lib/construct.ts#L438.
    const errors = Node.of(app).validate();
    if (errors.length > 0) {
      const errorList = errors.map(e => `[${Node.of(e.source).path}] ${e.message}`).join('\n  ');
      throw new Error(`Validation failed with the following errors:\n  ${errorList}`);
    }

  }

  private static findApiObjects(root: IConstruct): IConstruct[] {
    return Node.of(root).findAll().filter(c => c instanceof ApiObject);
  }

  private static inferChartsDependency(dep: Dependency): boolean {

    const sourceChart = Chart.of(dep.source);
    const targetChart = Chart.of(dep.target);

    if (sourceChart !== targetChart) {
      Node.of(sourceChart).addDependency(targetChart);
      return true;
    }

    return false;
  }

  private static inferApiObjectDependencies(dep: Dependency) {

    const targetApiObjects = this.findApiObjects(dep.target);
    const sourceApiObjects = this.findApiObjects(dep.source);

    for (const target of targetApiObjects) {
      for (const source of sourceApiObjects) {
        Node.of(source).addDependency(target);
      }
    }

  }

  private static chartToJson(chart: Chart): any[] {
    return new DependencyGraph(Node.of(chart)).topology()
      .filter(x => x instanceof ApiObject)
      .map(x => (x as ApiObject).toJson());
  }


}
