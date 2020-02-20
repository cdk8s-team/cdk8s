import { JSONSchema4 } from "json-schema";
import { CodeMaker } from "codemaker";

export class TypeGenerator {
  private readonly emitLater: { [name: string]: (code: CodeMaker) => void } = { };
  private readonly emitted = new Set<string>();

  constructor(private readonly schema: JSONSchema4 = { }) {
  
  }

  public addType(typeName: string, def: JSONSchema4) {
    if (this.emitted.has(typeName)) {
      return;
    }

    this.emitLater[typeName] = code => {
      this.emitDescription(code, def.description);
  
      if (def.oneOf) {
        this.emitUnion(code, typeName, def);
        return;
      }
    
      if (def.properties) {
        this.emitStruct(code, typeName, def);
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

  private emitUnion(code: CodeMaker, typeName: string, def: JSONSchema4) {
    code.openBlock(`export class ${typeName}`);

    for (const option of def.oneOf || []) {
      switch (option.type) {
        case 'string':
        case 'number':
        case 'boolean':
        case 'integer':
          const type = option.type === 'integer' ? 'number' : option.type;
          const methodName = 'from' + type[0].toUpperCase() + type.substr(1);
          code.openBlock(`public static ${methodName}(value: ${type}): ${typeName}`);
          code.line(`return new ${typeName}(value);`);
          code.closeBlock();
          break;
          
        default:
          throw new Error(`unexpected union type ${option.type}`);
      }
    }

    code.openBlock(`private constructor(value: any)`);
    code.line(`Object.defineProperty(this, 'resolve', { value: () => value });`);
    code.closeBlock();

    code.closeBlock();
  }


  private emitStruct(code: CodeMaker, typeName: string, def: JSONSchema4) {
    const self = this;

    code.openBlock(`export interface ${typeName}`);

    for (const [ propName, propSpec ] of Object.entries(def.properties || {})) {
      emitProperty(propName, propSpec);
    }
  
    code.closeBlock();

    function emitProperty(name: string, def: JSONSchema4) {
      self.emitDescription(code, def.description);
      const propertyType = self.typeForProperty(def);
      const required = (Array.isArray(def.required) && def.required.includes(name));
      const optional = required ? '' : '?';
  
      code.line(`readonly ${name}${optional}: ${propertyType};`);
      code.line();
    }  
  }

  private emitDescription(code: CodeMaker, description?: string) {
    if (!description) {
      return;
    }
  
    description = description.replace(/\*\//g, '_/');

    const extractDefault = /Defaults?\W+(to|is)\W+(.+)/g.exec(description);
    const def = extractDefault && extractDefault[2];
  
    code.line('/**');
    code.line(` * ${description}`);
    if (def) {
      code.line(` * @default ${def}`)    
    }
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
    if (!def.$ref) {
      throw new Error(`invalid $ref`);
    }

    const comps = def.$ref.split('.');
    const typeName = comps[comps.length - 1];
    const schema = this.resolveReference(def);
    this.addType(typeName, schema);
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
}

