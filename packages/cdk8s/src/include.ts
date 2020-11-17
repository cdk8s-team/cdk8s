import { Construct, Node } from 'constructs';
import { ApiObject } from './api-object';
import { Yaml } from './yaml';

export interface IncludeProps {
  /**
   * Local file path or URL which includes a Kubernetes YAML manifest.
   *
   * @example mymanifest.yaml
   */
  readonly url: string;
}

/**
 * Reads a YAML manifest from a file or a URL and defines all resources as API
 * objects within the defined scope.
 *
 * The names (`metadata.name`) of imported resources will be preserved as-is
 * from the manifest.
 */
export class Include extends Construct {
  constructor(scope: Construct, id: string, props: IncludeProps) {
    super(scope, id);

    const objects = Yaml.load(props.url);

    let order = 0;
    for (const obj of objects) {
      const objname = obj.metadata?.name ?? `object${order++}`;

      // render an id: name[-kind][-namespace]
      const objid = [objname, obj.kind?.toLowerCase(), obj.metadata?.namespace].filter(x => x).join('-');
      new ApiObject(this, objid, obj);
    }
  }

  /**
   * Returns all the included API objects.
   */
  public get apiObjects(): ApiObject[] {
    return Node.of(this).children.filter(o => o instanceof ApiObject) as ApiObject[];
  }
}
