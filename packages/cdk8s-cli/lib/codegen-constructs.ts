import { JSONSchema4 } from "json-schema";
import { CodeMaker } from 'codemaker';
import { TypeGenerator } from "./codegen-types";
import { ApiObjectDefinition, parseApiTypeName, tryGetObjectName, getObjectName, X_GROUP_VERSION_KIND } from "./types";
import { compareApiVersions } from "./version-selection";

/**
 * Generates a construct for an API object defined by `def`.
 */
export function emitConstructForApiObject(code: CodeMaker, typeGenerator: TypeGenerator, apidef: ApiObjectDefinition) {
  const def = apidef.schema;
  const objectName = getObjectName(apidef);

  const optionsStructName = `${objectName.kind}Options`;
  const optionsStructSchema = createOptionsStructSchema();

  emitOptionsStruct();
  code.line();
  emitConstruct();
  code.line();

  function emitOptionsStruct() {
    typeGenerator.addDataType(optionsStructName, optionsStructSchema, apidef.fullname);
  }

  function createOptionsStructSchema() {
    const copy: JSONSchema4 = { ...def };
    const props = copy.properties = copy.properties || {};
    delete props.apiVersion;
    delete props.kind;
    delete props.status;
    delete copy[X_GROUP_VERSION_KIND];

    copy.required = copy.required || [];
    copy.required = copy.required.filter(x => x !== 'apiVersion' && x !== 'kind' && x !== 'status');

    return copy;
  }
  
  function emitConstruct() {
    code.line('/**');
    code.line(` * ${def?.description}`);
    code.line(` *`);
    code.line(` * @schema ${apidef.fullname}`)
    code.line(` */`);
    code.openBlock(`export class ${objectName.kind} extends ApiObject`);

    emitInitializer();
  
    code.closeBlock();
  }

  function emitInitializer() {

    code.line(`/**`);
    code.line(` * Defines a "${apidef.fullname}" API object`);
    code.line(` * @param scope the scope in which to define this object`);
    code.line(` * @param name a scope-local name for the object`);
    code.line(` * @param options configuration options`);
    code.line(` */`);

    const hasRequired = optionsStructSchema.required && Array.isArray(optionsStructSchema.required) && optionsStructSchema.required.length > 0;
    const defaultOptions = hasRequired ? '' : ' = {}';
    code.openBlock(`public constructor(scope: Construct, name: string, options: ${optionsStructName}${defaultOptions})`);
    emitInitializerSuper();

    code.closeBlock();
  }

  function emitInitializerSuper() {
    const groupPrefix = objectName.group ? `${objectName.group}/` : '';
    code.open(`super(scope, name, {`);
    code.line(`...options,`);
    code.line(`kind: '${objectName.kind}',`);
    code.line(`apiVersion: '${groupPrefix}${objectName.version}',`);
    code.close(`});`);    
  }
}

export interface SelectApiObjectsOptions {
  include?: string[];
}

export function selectApiObjects(map: ApiObjectDefinitions, options: SelectApiObjectsOptions = { }): ApiObjectDefinition[] {
  const result = new Array<ApiObjectDefinition>();
  const include = options.include ?? [];
  for (const defs of Object.values(map)) {
    defs.sort((lhs, rhs) => compareApiVersions(lhs, rhs));


    let selected = defs[defs.length - 1];

    const included = defs.find(x => include.includes(x.fullname));
    if (included) {
      selected = included; 
    }

    // select latest stable version
    result.push(selected);
  }

  return result;
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
export function findApiObjectDefinitions(schema: JSONSchema4): ApiObjectDefinitions {
  const map: ApiObjectDefinitions = { };

  for (const [ typename, def ] of Object.entries(schema.definitions || { })) {
    const kinds = tryGetObjectName(def);
    if (!kinds) {
      continue;
    }

    const type = parseApiTypeName(typename);
    const list = map[type.basename] ?? [];
    map[type.basename] = list;
    list.push({
      ...type,
      schema: def
    });
  }

  return map;
}

type ApiObjectDefinitions = { [basename: string]: ApiObjectDefinition[] };

