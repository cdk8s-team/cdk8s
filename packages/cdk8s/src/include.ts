import { Construct } from 'constructs';
import { ApiObject } from './api-object';
import { Yaml } from './yaml';

export interface IncludeOptions {
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
  constructor(scope: Construct, name: string, options: IncludeOptions) {
    super(scope, name);

    const objects = Yaml.load(options.url);

    let order = 0;
    for (const obj of objects) {
      const name = obj.metadata?.name ?? `object${order++}`;

      // render an id: name[-kind][-namespace]
      const id = [ name, obj.kind?.toLowerCase(), obj.metadata?.namespace ].filter(x => x).join('-');
      new ApiObject(this, id, obj);
    }
  }
}
