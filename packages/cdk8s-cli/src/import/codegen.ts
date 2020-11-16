// we just need the types from json-schema
// eslint-disable-next-line import/no-extraneous-dependencies
import { JSONSchema4 } from 'json-schema';

import { TypeGenerator } from 'json2jsii';

export interface ApiObjectDefinition {
  readonly fqn: string;
  readonly group: string;
  readonly version: string;
  readonly kind: string;
  readonly schema: JSONSchema4;

  /**
   * Indicates if a prefix should be added to the construct class name. For
   * example, for native k8s api objects, we add `Kube` by default.
   *
   * @default ""
   */
  readonly prefix?: string;
}

export function getConstructTypeName(def: ApiObjectDefinition) {
  const prefix = def.prefix ?? '';
  return TypeGenerator.normalizeTypeName(`${prefix}${def.kind}`);
}

export function getPropsTypeName(def: ApiObjectDefinition) {
  const constructName = getConstructTypeName(def);
  return TypeGenerator.normalizeTypeName(`${constructName}Options`);
}

export function generateConstruct(typegen: TypeGenerator, def: ApiObjectDefinition) {
  const constructName = getConstructTypeName(def);

  typegen.emitCustomType(constructName, code => {
    const schema = def.schema;

    // `propsTypeName` could also be "any" if we can't parse the schema for some reason
    const propsTypeName = emitPropsStruct();
    emitConstruct();

    function emitPropsStruct() {
      const propsSchema = createPropsStructSchema();
      const propsStructName = getPropsTypeName(def);
      return typegen.emitType(propsStructName, propsSchema, def.fqn);
    }

    function createPropsStructSchema() {
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
      code.line(' * @param id a scope-local name for the object');
      code.line(' * @param props initialiation props');
      code.line(' */');

      const hasRequired = schema?.required && Array.isArray(schema.required) && schema.required.length > 0;
      const defaultProps = hasRequired ? '' : ' = {}';
      code.openBlock(`public constructor(scope: Construct, id: string, props: ${propsTypeName}${defaultProps})`);
      emitInitializerSuper();

      code.closeBlock();
    }

    function emitInitializerSuper() {
      const groupPrefix = def.group ? `${def.group}/` : '';
      code.open('super(scope, id, {');
      code.line('...props,');
      code.line(`kind: '${def.kind}',`);
      code.line(`apiVersion: '${groupPrefix}${def.version}',`);
      code.close('});');
    }
  });
}
