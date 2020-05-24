import { Construct, ISynthesisSession, Node, Dependency, IConstruct } from 'constructs';
import * as fs from 'fs';
import * as path from 'path';
import { ApiObject } from './api-object';
import * as YAML from 'yaml';
import { Names } from './names';

export interface ChartOptions {
  /**
   * The default namespace for all objects defined in this chart (directly or
   * indirectly). This namespace will only apply to objects that don't have a
   * `namespace` explicitly defined for them.
   *
   * @default - no namespace is synthesized (usually this implies "default")
   */
  readonly namespace?: string;
}

export class Chart extends Construct {

  /**
   * Finds the chart in which a node is defined.
   * @param c a construct node
   */
  public static of(c: IConstruct): Chart {
    if (c instanceof Chart) {
      return c;
    }

    const parent = Node.of(c).scope as Construct;
    if (!parent) {
      throw new Error(`cannot find a parent chart (directly or indirectly)`);
    }

    return Chart.of(parent);
  }

  /**
   * The name of the stack's YAML file as emitted into the cloud assembly
   * directory during synthesis.
   */
  public readonly manifestFile: string;

  /**
   * The default namespace for all objects in this chart.
   */
  public readonly namespace?: string;

  constructor(scope: Construct, ns: string, options: ChartOptions = { }) {
    super(scope, ns);
    this.manifestFile = `${Node.of(this).uniqueId}.k8s.yaml`;
    this.namespace = options.namespace;
  }

  /**
   * Generates a app-unique name for an object given it's construct node path.
   *
   * Different resource types may have different constraints on names
   * (`metadata.name`). The previous version of the name generator was
   * compatible with DNS_SUBDOMAIN but not with DNS_LABEL.
   *
   * For example, `Deployment` names must comply with DNS_SUBDOMAIN while
   * `Service` names must comply with DNS_LABEL.
   *
   * Since there is no formal specification for this, the default name
   * generation scheme for kubernetes objects in cdk8s was changed to DNS_LABEL,
   * since it’s the common denominator for all kubernetes resources
   * (supposedly).
   *
   * You can override this method if you wish to customize object names at the
   * chart level.
   *
   * @param apiObject The API object to generate a name for.
   */
  public generateObjectName(apiObject: ApiObject) {
    return Names.toDnsLabel(Node.of(apiObject).path);
  }

  /**
   * Renders this chart to a set of Kubernetes JSON resources.
   * @returns array of resource manifests
   */
  public toJson(): any[] {

    const chartNode = Node.of(this);

    // only fetch dependencies that are contained within this chart.
    // TODO: might make sense to actually take them into account for detecting cycles...
    const dependencies: Dependency[] = chartNode.dependencies.filter(dep => Chart.of(dep.target) === this);

    const ordered = dependencies.length !== 0 ? new DependencyGraph(dependencies).topology() : [];

    // constructs that are not part of the dependency graph
    // can go to the front of line.
    ordered.unshift(...chartNode.findAll().filter(obj => obj instanceof ApiObject && !ordered.includes(obj)))

    return ordered
      .filter(x => x instanceof ApiObject)
      .map(x => (x as ApiObject).toJson());
  }

  // /**
  //  * Called by the app to synthesize the chart as a YAML file in the output directory/
  //  */
  // protected onSynthesize(session: ISynthesisSession) {
  //   // convert each resource to yaml and separate with a '---' line
  //   const doc = this.toJson().map(r => YAML.stringify(r)).join('---\n');
  //   fs.writeFileSync(path.join(session.outdir, this.manifestFile), doc);
  // }

}



export class DependencyGraph {

  private readonly root: DepNode;

  constructor(dependencies: Dependency[]) {

    if (dependencies.length === 0) {
      throw new Error('DependencyGraph cannot be created without dependencies');
    }

    const nodes: Record<string, DepNode> = {};

    for (const dep of dependencies) {
            
      const sourceNode = Node.of(dep.source);
      const targetNode = Node.of(dep.target);

      if (!nodes[sourceNode.uniqueId]) {
        nodes[sourceNode.uniqueId] = new DepNode(dep.source);
      }

      if (!nodes[targetNode.uniqueId]) {
        nodes[targetNode.uniqueId] = new DepNode(dep.target);
      }

      const sourceDepNode = nodes[sourceNode.uniqueId];
      const targetDepNode = nodes[targetNode.uniqueId];

      sourceDepNode.addChild(targetDepNode!);
      
    }

    this.root = this.findRoot(Object.values(nodes)[0])

  }

  public topology(): IConstruct[] {

    const topology: DepNode[] = [];

    function visit(n: DepNode) {
      for (const c of n.children) {
        visit(c);
      }
      topology.push(n);
    }

    visit(this.root);

    return topology.map(d => d.value);
  }

  private findRoot(node: DepNode): DepNode {
    if (node.parents.length === 0) {
      return node;
    }
    return this.findRoot(node.parents[0]);
  }

}

export class DepNode {
  
  readonly value: IConstruct;
  readonly children: DepNode[] = [];
  readonly parents: DepNode[] = [];

  private readonly _decendants: DepNode[] = [];

  constructor(value: IConstruct) {
    this.value = value;
  }

  addChild(dep: DepNode) {
    
    if (dep._decendants.includes(this)) {
      const cycle: DepNode[] = this.findRoute(dep, this);
      cycle.push(dep);
      throw new Error(`Cycle detected: ${cycle.map(d => Node.of(d.value).uniqueId).join(' => ')}`);
    }

    this.children.push(dep);

    // keep track of all decendants to detect cycles during construction
    // TODO: is this really the best way...?
    this.addAsDecendant(this, dep);

    // keep track of parents in order to later on find the root
    // TODO: can probably avoid doing this...
    dep.parents.push(this);
  }

  private addAsDecendant(parent: DepNode, decendant: DepNode) {

    parent._decendants.push(decendant)
    for (const grandParent of parent.parents) {
      this.addAsDecendant(grandParent, decendant);
    }

  }

  private findRoute(src: DepNode, dst: DepNode): DepNode[] {
    
    const route: DepNode[] = [];
    walk(src);
    return route;
    
    function walk(n: DepNode): boolean {
      route.push(n);
      let found = false;
      for (const c of n.children) {
        if (c === dst) {
          route.push(c);
          return true;
        }
        found = walk(c);
      }
      if (!found) {
        route.pop();
      }
      return found;

    }

  }
}

