import { CodeMaker } from 'codemaker';

// we just need the types from json-schema
// eslint-disable-next-line import/no-extraneous-dependencies
import { JSONSchema4 } from 'json-schema';

import { TypeGenerator } from 'json2jsii';
import { ImportSpec } from '../config';
import { download } from '../util';
import { GenerateOptions, ImportBase } from './base';
import { ApiObjectDefinition, emitHeader, generateConstruct, getPropsTypeName } from './codegen';
import { parseApiTypeName } from './k8s-util';


const DEFAULT_API_VERSION = '1.15.0';
const DEFAULT_CLASS_NAME_PREFIX = 'Kube';

export interface ImportKubernetesApiOptions {
  /**
   * The API version to generate.
   */
  readonly apiVersion: string;

  /**
   * Do not import these types. Instead, represent them as "any".
   *
   * @default - include all types that derive from the root types.
   */
  readonly exclude?: string[];
}

export class ImportKubernetesApi extends ImportBase {

  public static async match(importSpec: ImportSpec, argv: any): Promise<ImportKubernetesApiOptions | undefined> {
    const { source } = importSpec;
    if (source !== 'k8s' && !source.startsWith('k8s@')) {
      return undefined;
    }

    return {
      apiVersion: source.split('@')[1] ?? DEFAULT_API_VERSION,
      exclude: argv.exclude,
    };
  }

  constructor(private readonly options: ImportKubernetesApiOptions) {
    super();
  }

  public get moduleNames() {
    return ['k8s'];
  }

  protected async generateTypeScript(code: CodeMaker, moduleName: string, options: GenerateOptions) {
    const schema = await downloadSchema(this.options.apiVersion);

    if (moduleName !== 'k8s') {
      throw new Error(`unexpected module name "${moduleName}" when importing k8s types (expected "k8s")`);
    }

    const prefix = options.classNamePrefix ?? DEFAULT_CLASS_NAME_PREFIX;
    const topLevelObjects = findApiObjectDefinitions(schema, prefix);

    const typeGenerator = new TypeGenerator({
      definitions: schema.definitions,
      exclude: this.options.exclude,
    });

    // rename "Props" type from their original name based on the API object kind
    // (e.g. `Deployment`) to their actual props type (`KubeDeploymentProps`) in
    // order to avoid confusion between constructs (`KubeDeployment`) and those
    // types. This is done by simply replacing their definition in the schema
    // with a $ref to the definition of the props type.
    for (const o of topLevelObjects) {
      typeGenerator.addDefinition(o.fqn, { $ref: `#/definitions/${getPropsTypeName(o)}` });
    }

    // emit construct types (recursive)
    for (const o of topLevelObjects) {
      generateConstruct(typeGenerator, o);
    }

    emitHeader(code);

    code.line(typeGenerator.render());
  }
}

/**
 * Returns a map of all API objects in the spec (objects that have the
 * 'x-kubernetes-group-version-kind' annotation).
 *
 * The key is the base name of the type (i.e. `Deployment`). Since API objects
 * may have multiple versions, each value in the map is an array of type definitions
 * along with version information.
 *
 * @see https://kubernetes.io/docs/concepts/overview/kubernetes-api/#api-versioning
 */
export function findApiObjectDefinitions(schema: JSONSchema4, prefix: string): ApiObjectDefinition[] {
  const result = new Array<ApiObjectDefinition>();

  for (const [typename, apischema] of Object.entries(schema.definitions || { })) {
    const objectName = tryGetObjectName(apischema);
    if (!objectName) {
      continue;
    }

    const type = parseApiTypeName(typename);
    result.push({
      custom: false, // not a CRD
      fqn: type.fullname,
      group: objectName.group,
      kind: objectName.kind,
      version: objectName.version,
      schema: apischema,
      prefix,
    });
  }

  return result;
}

function tryGetObjectName(def: JSONSchema4): GroupVersionKind | undefined {
  const objectNames = def[X_GROUP_VERSION_KIND] as GroupVersionKind[];
  if (!objectNames) {
    return undefined;
  }

  const objectName = objectNames[0];
  if (!objectName) {
    return undefined;
  }

  // skip definitions without "metadata". they are not API objects that can be defined
  // in manifests (example: io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions)
  // they will be treated as data types
  if (!def.properties?.metadata) {
    return undefined;
  }

  return objectName;
}

export interface GroupVersionKind {
  readonly group: string;
  readonly kind: string;
  readonly version: string;
}

const X_GROUP_VERSION_KIND = 'x-kubernetes-group-version-kind';

async function downloadSchema(apiVersion: string) {
  const url = `https://raw.githubusercontent.com/awslabs/cdk8s/master/kubernetes-schemas/v${apiVersion}/_definitions.json`;
  const output = await download(url);
  return JSON.parse(output) as JSONSchema4;
}
