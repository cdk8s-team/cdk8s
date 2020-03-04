import { JSONSchema4 } from "json-schema";
import { CodeMaker } from "codemaker";
import { isApiObject } from "./types";

const PRIMITIVE_TYPES = [ 'string', 'number', 'integer', 'boolean' ];

export class TypeGenerator {
  private readonly emitLater: { [name: string]: (code: CodeMaker) => void } = { };
  private readonly emitted = new Set<string>();

  constructor(private readonly schema: JSONSchema4 = { }) {
  
  }

  public addDataType(typeName: string, def: JSONSchema4, fqn: string) {
    if (this.emitted.has(typeName)) {
      return;
    }

    // skip api objects (they are emitted as constructs and not as data types)
    if (isApiObject(def)) {
      return;
    }

    this.emitLater[typeName] = code => {
      this.emitDescription(code, fqn, def.description);
  
      if (isUnion(def)) {
        this.emitUnion(code, typeName, def, fqn);
        return;
      }
    
      if (isStruct(def)) {
        this.emitStruct(code, typeName, def, fqn);
        return;
      }
    
      code.line(`export type ${typeName} = ${this.typeForProperty(def)};`);  
    };
  }

  public generate(code: CodeMaker) {
    while (Object.keys(this.emitLater).length) {
      const name = Object.keys(this.emitLater)[0];
      const later = this.emitLater[name];
      later(code);
      code.line();
      delete this.emitLater[name];
      this.emitted.add(name);
    }    
  }

  private emitUnion(code: CodeMaker, typeName: string, def: JSONSchema4, fqn: string) {
    this.emitDescription(code, fqn);

    code.openBlock(`export class ${typeName}`);

    for (const option of def.oneOf || []) {
      if (typeof(option.type) !== 'string' || !PRIMITIVE_TYPES.includes(option.type)) {
        throw new Error(`unexpected union type ${JSON.stringify(option.type)}`);
      }

      const type = option.type === 'integer' ? 'number' : option.type;
      const methodName = 'from' + type[0].toUpperCase() + type.substr(1);
      code.openBlock(`public static ${methodName}(value: ${type}): ${typeName}`);
      code.line(`return new ${typeName}(value);`);
      code.closeBlock();
    }

    code.openBlock(`private constructor(value: any)`);
    code.line(`Object.defineProperty(this, 'resolve', { value: () => value });`);
    code.closeBlock();

    code.closeBlock();
  }

  private emitStruct(code: CodeMaker, typeName: string, structDef: JSONSchema4, fqn: string) {
    code.openBlock(`export interface ${typeName}`);

    for (const [ propName, propSpec ] of Object.entries(structDef.properties || {})) {
      this.emitProperty(code, propName, propSpec, fqn, structDef);
    }
  
    code.closeBlock();
  }

  private emitProperty(code: CodeMaker, name: string, propDef: JSONSchema4, fqn: string, structDef: JSONSchema4) {
    this.emitDescription(code, `${fqn}#${name}`, propDef.description);
    const propertyType = this.typeForProperty(propDef);
    const required = this.isPropertyRequired(name, structDef, propDef);
    const optional = required ? '' : '?';

    code.line(`readonly ${name}${optional}: ${propertyType};`);
    code.line();
  }

  private emitDescription(code: CodeMaker, fqn: string, description?: string) {
    code.line('/**');

    if (description) {
      description = description.replace(/\*\//g, '_/');

      const extractDefault = /Defaults?\W+(to|is)\W+(.+)/g.exec(description);
      const def = extractDefault && extractDefault[2];
    
      code.line(` * ${description}`);
      if (def) {
        code.line(` * @default ${def}`)    
      }
    }

    code.line(` *`);
    code.line(` * @type ${fqn}`);
    code.line(' */')
  }

  private typeForProperty(def: JSONSchema4): string {
    if (def.oneOf) {
      throw new Error(`oneOf`);
    }

    if (def.anyOf) {
      throw new Error(`anyOf`);
    }

    if (def.properties) {
      throw new Error(`unexpected definition ${JSON.stringify(def)}`);
    }

    if (def.$ref) {
      return this.typeForRef(def);
    }

    if (def.type === 'string' && def.format === 'date-time') {
      return `Date`;
    }
  
    switch (def.type) {
      case undefined: return 'string';
      case 'string': return 'string';
      case 'number': return 'number';
      case 'integer': return 'number';
      case 'boolean': return 'boolean';
      case 'array': return `${this.typeForArray(def)}[]`;
      case 'object': return this.typeForObject(def);
        
      default: 
        throw new Error(`unsupported type ${def.type}`);
    }
  }

  private typeForObject(def: JSONSchema4): string {
    if (def.type !== 'object') {
      throw new Error(`unexpected`);
    }

    if (!def.properties && def.additionalProperties && typeof(def.additionalProperties) === 'object') {
      return `{ [key: string]: ${this.typeForProperty(def.additionalProperties)} }`;
    }

    return `"unknown ${def}"`;
  }

  private typeForRef(def: JSONSchema4): string {
    const prefix = '#/definitions/';
    if (!def.$ref || !def.$ref.startsWith(prefix)) {
      throw new Error(`invalid $ref`);
    }

    const comps = def.$ref.substring(prefix.length).split('.');
    const typeName = comps[comps.length - 1];
    const schema = this.resolveReference(def);
    this.addDataType(typeName, schema, def.$ref);
    return typeName;
  }

  private typeForArray(def: JSONSchema4): string {
    if (!def.items || typeof(def.items) !== 'object') {
      throw new Error(`unsupported array type ${def.items}`);
    }

    return this.typeForProperty(def.items);
  }  

  private resolveReference(def: JSONSchema4): JSONSchema4 {
    const ref = def.$ref;
    const localPrefix = '#/definitions/';
    if (!ref || !ref.startsWith(localPrefix)) {
      throw new Error(`expecting a local reference`);
    }

    if (!this.schema.definitions) {
      throw new Error(`schema does not have "definitions"`);
    }

    const lookup = ref.substr(localPrefix.length);
    const found = this.schema.definitions[lookup];
    if (!found) {
      throw new Error(`cannot resolve local reference ${ref}`);
    }

    return found;
  }

  // private readonly hasRequired: { [fqn: string]: boolean } = { };

  private isPropertyRequired(property: string, structDef: JSONSchema4, propDef: JSONSchema4) {
    // if the property name explicitly appears in "required", then it's required.
    if (Array.isArray(structDef.required) && structDef.required.includes(property)) {
      return true;
    }

    propDef;

    return false;

    // // if the property is not a reference, then we are done: it's not required and that is it.
    // if (!propDef.$ref) {
    //   return false;
    // }

    // return this.structHasRequiredProperties(propDef.$ref);
  }

  // private structHasRequiredProperties(fqn: string): boolean {
  //   // check cache to avoid cycles
  //   if (fqn in this.hasRequired) {
  //     return this.hasRequired[fqn];
  //   }

  //   // ok, property is a ref to another type, let's find the schema for it.
  //   const structDefinition = this.resolveReference({ $ref: fqn });

  //   this.hasRequired[fqn] = false;

  //   // if it's not a struct, we are done.
  //   if (isStruct(structDefinition)) {
  //     for (const [ name, def ] of Object.entries(structDefinition.properties || {})) {
  //       if (this.isPropertyRequired(name, structDefinition, def)) {
  //         this.hasRequired[fqn] = true;
  //         break; // no need to continue
  //       }
  //     }
  //   }

  //   // store in cache
  //   return this.hasRequired[fqn];
  // }
}

function isStruct(def: JSONSchema4): boolean {
  return !!def.properties;
}

function isUnion(def: JSONSchema4): boolean {
  return !!def.oneOf;
}