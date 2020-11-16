import { toPascalCase } from 'codemaker';
// we just need the types from json-schema
// eslint-disable-next-line import/no-extraneous-dependencies
import { JSONSchema4 } from 'json-schema';
import { TypeGenerator } from 'json2jsii';

export interface GeneratedConstruct {
  readonly fqn: string;
  readonly group: string;
  readonly version: string;
  readonly kind: string;
  readonly schema: JSONSchema4;

  /**
   * Is this is a custom resource (imported from a CRD) or a core API object?
   */
  readonly custom: boolean;
}

export function generateConstruct(typegen: TypeGenerator, def: GeneratedConstruct) {
  // add an API version postfix only if this is core API (`import k8s`).
  const postfix = (def.custom || def.version === 'v1') ? '' : toPascalCase(def.version);
  const constructName = TypeGenerator.normalizeTypeName(`${def.kind}${postfix}`);

  typegen.addCode(constructName, code => {
    const schema = def.schema;

    // this will return `any` in case the schema can't be parsed
    const optionsSchema = createOptionsStructSchema();
    const optionsStructName = typegen.addType(TypeGenerator.normalizeTypeName(`${constructName}Options`), optionsSchema, def.fqn);

    emitConstruct();

    function createOptionsStructSchema() {
      const copy: JSONSchema4 = { ...def.schema || {} };
      const props = copy.properties = copy.properties || {};
      delete props.apiVersion;
      delete props.kind;
      delete props.status;
      delete copy['x-kubernetes-group-version-kind'];

      copy.required = copy.required || [];
      copy.required = copy.required.filter(x => x !== 'apiVersion' && x !== 'kind' && x !== 'status');

      return copy;
    }

    function emitConstruct() {
      code.line('/**');
      code.line(` * ${def.schema?.description ?? ''}`);
      code.line(' *');
      code.line(` * @schema ${def.fqn}`);
      code.line(' */');
      code.openBlock(`export class ${constructName} extends ApiObject`);

      emitInitializer();

      code.closeBlock();
    }

    function emitInitializer() {

      code.line('/**');
      code.line(` * Defines a "${def.fqn}" API object`);
      code.line(' * @param scope the scope in which to define this object');
      code.line(' * @param name a scope-local name for the object');
      code.line(' * @param options configuration options');
      code.line(' */');

      const hasRequired = schema?.required && Array.isArray(schema.required) && schema.required.length > 0;
      const defaultOptions = hasRequired ? '' : ' = {}';
      code.openBlock(`public constructor(scope: Construct, name: string, options: ${optionsStructName}${defaultOptions})`);
      emitInitializerSuper();

      code.closeBlock();
    }

    function emitInitializerSuper() {
      const groupPrefix = def.group ? `${def.group}/` : '';
      code.open('super(scope, name, {');
      code.line('...options,');
      code.line(`kind: '${def.kind}',`);
      code.line(`apiVersion: '${groupPrefix}${def.version}',`);
      code.close('});');
    }
  });
}
