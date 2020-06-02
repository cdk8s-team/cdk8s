import { Node, IConstruct } from "constructs";

/**
 * Represents the dependency graph for a given Node.
 *
 * This graph includes the dependency relationships between all nodes in the
 * node (construct) sub-tree who's root is this Node.
 *
 * Note that this means that lonely nodes (no dependencies and no dependants) are also included in this graph as
 * childless children of the root node of the graph.
 *
 * The graph does not include cross-scope dependencies. That is, if a child on the current scope depends on a node
 * from a different scope, that relationship is not represented in this graph.
 *
 */
export class DependencyGraph {

  private readonly _fosterParent: DependencyVertex;

  constructor(node: Node) {

    this._fosterParent = new DependencyVertex(null);

    const nodes: Record<string, DependencyVertex> = {};

    function putVertexIfAbsent(construct: IConstruct) {
      const id = Node.of(construct).uniqueId;
      if (!nodes[id]) {
        nodes[id] = new DependencyVertex(construct);
      }
      return nodes[id];
    }

    // add all the tree nodes as verices.
    for (const n of node.findAll()) {
      putVertexIfAbsent(n);
    }

    // create all the edges of the graph.
    for (const dep of node.dependencies) {

      if (!node.tryFindChild(Node.of(dep.target).id)) {
        // dont cross scope boundaries.
        // since charts only renders its own children, this is ok and
        // has the benefit of simplifying the graph. we should reconsider this behavior when moving
        // to a more general purpose use-case.
        continue;
      }

      const sourceDepNode = putVertexIfAbsent(dep.source);
      const targetDepNode = putVertexIfAbsent(dep.target);

      sourceDepNode.addChild(targetDepNode!);

    }

    // create the root.
    for (const n of Object.values(nodes)) {
      if (n.parents.size === 0) {
        // orphans are dependency roots. lets adopt them!
        this._fosterParent.addChild(n);
      }
    }

  }

  /**
   * Returns the root of the graph.
   *
   * Note that this vertex will always have `null` as its `.value` since it is an artifical root
   * that binds all the connected spaces of the graph.
   */
  public get root(): DependencyVertex {
    return this._fosterParent;
  }

  /**
   * @see Vertex.topology()
   */
  public topology(): IConstruct[] {
    return this._fosterParent.topology();
  }
}

/**
 * Represents a vertex in the graph.
 *
 * The value of each vertex is an `IConstruct` that is accessible via the `.value` getter.
 */
export class DependencyVertex {

  private readonly _value: IConstruct | null;
  private readonly _children: Set<DependencyVertex> = new Set<DependencyVertex>();
  private readonly _parents: Set<DependencyVertex> = new Set<DependencyVertex>();

  constructor(value: IConstruct | null) {
    this._value = value;
  }

  /**
   * Returns the IConstruct this graph vertex represents.
   *
   * `null` in case this is the root of the graph.
   */
  public get value(): IConstruct | null {
    return this._value;
  }

  /**
   * Returns the children of the vertex (i.e dependencies)
   */
  public get children(): Set<DependencyVertex> {
    return this._children;
  }

  /**
   * Returns the parents of the vertex (i.e dependants)
   */
  public get parents(): Set<DependencyVertex> {
    return this._parents;
  }

  /**
   * Returns a topologically sorted array of the constructs in the sub-graph.
   */
  public topology(): IConstruct[] {

    const found = new Set<DependencyVertex>();
    const topology: DependencyVertex[] = [];

    function visit(n: DependencyVertex) {
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

  /**
   * Adds a vertex as a dependency of the current node.
   * Also updates the parents of `dep`, so that it contains this node as a parent.
   *
   * This operation will fail in case it creates a cycle in the graph.
   *
   * @param dep The dependency
   */
  public addChild(dep: DependencyVertex) {

    const cycle: DependencyVertex[] = dep.findRoute(this);
    if (cycle.length !== 0) {
      cycle.push(dep);
      throw new Error(`Dependency cycle detected: ${cycle.map(d => Node.of(d.value!).uniqueId).join(' => ')}`);
    }

    this._children.add(dep);
    dep.addParent(this);
  }

  private addParent(dep: DependencyVertex) {
    this.parents.add(dep);
  }

  private findRoute(dst: DependencyVertex): DependencyVertex[] {

    const route: DependencyVertex[] = [];
    visit(this);
    return route;

    function visit(n: DependencyVertex): boolean {
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
