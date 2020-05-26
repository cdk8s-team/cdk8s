import { Construct, Node, IConstruct } from 'constructs';
import { ApiObject } from './api-object';
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
   * The default namespace for all objects in this chart.
   */
  public readonly namespace?: string;

  constructor(scope: Construct, ns: string, options: ChartOptions = { }) {
    super(scope, ns);
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
    return new DependencyGraph(Node.of(this)).topology()
      .filter(x => x instanceof ApiObject && Chart.of(x) === this)
      .map(x => (x as ApiObject).toJson());
  }

}



export class DependencyGraph {

  private readonly root: DepNode;

  constructor(node: Node) {

    this.root = new DepNode(null);

    const nodes: Record<string, DepNode> = {};

    function getOrCreate(construct: IConstruct) {
      const id = Node.of(construct).uniqueId;
      if (!nodes[id]) {
        nodes[id] = new DepNode(construct);
      }
      return nodes[id];
    }

    // create the graph from the edges
    for (const dep of node.dependencies) {
            
      const sourceDepNode = getOrCreate(dep.source);
      const targetDepNode = getOrCreate(dep.target);
      
      sourceDepNode.addChild(targetDepNode!);      
    }

    for (const n of Object.values(nodes)) {
      if (n.isOrphan()) {
        // orphans are dependency roots
        this.root.addChild(n);        
      }
    }
    
    for (const n of node.findAll()) {
      if (!nodes[Node.of(n).uniqueId]) {
        // lonely nodes are also dependency roots.
        this.root.addChild(new DepNode(n));
      }
    }

  }

  public topology(): IConstruct[] {
    return this.root.topology();
  }
}

export class DepNode {
  
  private readonly _value: IConstruct | null;
  private readonly _children: DepNode[] = [];
  private readonly _parents: DepNode[] = [];

  constructor(value: IConstruct | null) {
    this._value = value;
  }

  public get value(): IConstruct | null {
    return this._value;
  }

  public get children(): DepNode[] {
    return this._children;
  }

  public get parents(): DepNode[] {
    return this._parents;
  }

  public isOrphan() {
    return this.parents.length === 0;
  }

  public topology(): IConstruct[] {

    const found = new Set<DepNode>();
    const topology: DepNode[] = [];

    function visit(n: DepNode) {
      for (const c of n.children) {
        visit(c);
      }
      if (!found.has(n)) {
        topology.push(n);
        found.add(n);  
      }
    }

    visit(this);

    return topology.filter(d => d.value).map(d => d.value!);

  }

  public addChild(dep: DepNode) {
    
    const cycle: DepNode[] = dep.findRoute(this);
    if (cycle.length !== 0) {
      cycle.push(dep);
      throw new Error(`Dependency cycle detected: ${cycle.map(d => Node.of(d.value!).uniqueId).join(' => ')}`);  
    }

    this._children.push(dep);
    dep.addParent(this);
  }

  private addParent(dep: DepNode) {
    this.parents.push(dep);
  }

  private findRoute(dst: DepNode): DepNode[] {
    
    const route: DepNode[] = [];
    visit(this);
    return route;
    
    function visit(n: DepNode): boolean {
      route.push(n);
      let found = false;
      for (const c of n.children) {
        if (c === dst) {
          route.push(c);
          return true;
        }
        found = visit(c);
      }
      if (!found) {
        route.pop();
      }
      return found;

    }

  }
}

