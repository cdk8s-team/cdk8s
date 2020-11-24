import * as fs from 'fs';
import * as path from 'path';
import { CodeMaker } from 'codemaker';
import * as glob from 'glob';
import * as json5 from 'json5';
import * as yaml from 'yaml';
import { ImportSpec } from '../config';
import { GenerateOptions, ImportBase } from '../import/base';
import { download } from '../util';

//const CR_KIND = 'CustomResource';

export interface ManifestObjectDefinition {
  readonly apiVersion: string;
  readonly kind: string;
  readonly metadata?: ApiObjectMetadata;
  readonly spec?: ApiObjectSpec;
  readonly [key: string]: any;
}

export interface ApiObjectMetadata {
  readonly name?: string;
  readonly annotations?: { [key: string]: string };
  readonly labels?: { [key: string]: string };
  readonly namespace?: string;
  readonly [key: string]: any;
}

export interface ApiObjectSpec{
  readonly [key: string]: any;
}

export interface ImportCrOptions {
  /**
   * Emit a module per cr or API group
   */
  readonly emitModulePer?: ModuleEmitOptions;
}

export enum ModuleEmitOptions {
  CRD = 'crd',
  API_GROUP = 'apiGroup',
}

export class CustomResource {
  private readonly _group: string;
  private readonly _version: string;
  private readonly _kind: string;
  private readonly _metadata: ApiObjectMetadata;
  private readonly _spec: ApiObjectSpec;
  private readonly _fqn: string;

  constructor(manifest: ManifestObjectDefinition) {

    const apiVersion = manifest.apiVersion;
    if (!apiVersion) {
      throw new Error('unable to determine apiVersion');
    }

    const gv = apiVersion.split('/');
    if (gv.length !== 2) {
      throw new Error('unable to determine group/version');
    }

    const group = gv[0];
    const version = gv[1];

    const kind = manifest.kind;
    if (!kind) {
      throw new Error('unable to determine kind');
    }

    const metadata = manifest.metadata;
    if (!metadata) {
      throw new Error('manifest does not have a "metadata" attribute');
    }

    const fqn = metadata.name;
    if (!fqn) {
      throw new Error('manifest does not have a "metadata.name" attribute');
    }

    const spec = manifest.spec;
    if (!spec) {
      throw new Error('manifest does not have a "spec" attribute');
    }

    this._group = group;
    this._version = version;
    this._kind = kind;
    this._metadata = metadata;
    this._spec = spec;
    this._fqn = fqn;
  }

  public get key() {
    return `${this.fqn}/${this.kind.toLocaleLowerCase()}/${this.group}`;
  }

  public get group(): string {
    return this._group;
  }

  public get version(): string {
    return this._version;
  }

  public get kind(): string {
    return this._kind;
  }

  public get metadata(): ApiObjectMetadata {
    return this._metadata;
  }

  public get spec(): ApiObjectSpec {
    return this._spec;
  }

  public get fqn(): string {
    return this._fqn;
  }
}

export class ImportCustomResource extends ImportBase {
  public static async match(importSpec: ImportSpec, argv: any): Promise<undefined | ManifestObjectDefinition[]> {
    const { source } = importSpec;
    console.log(source);

    const docs: yaml.Document[] = [];

    if (path.extname(source) === '.yaml') {
      console.log(`found yaml file: ${source}`);
      const manifest = await download(source);
      docs.push(...yaml.parseAllDocuments(manifest));
    }

    if (fs.existsSync(source) && fs.lstatSync(source).isDirectory() ) {

      const globOpts = {
        ignore: ['/**/examples/*', '/**/hack/*'],
        cwd: path.join(process.cwd(), source),
        dot: true,
        nodir: true,
        absolute: true,
      };

      if (argv.ignore) { globOpts.ignore = argv.ignore.split(',');}

      const files = glob.sync('**/*.yaml', globOpts);

      for (const file of files) {
        console.log(`found yaml file: ${file}`);

        const manifest = await download(file);
        docs.push(...yaml.parseAllDocuments(manifest));
      }
    }

    const manifests = docs
      .map((doc: yaml.Document) => doc.toJSON())
      .filter(doc => doc.apiVersion && doc.kind);

    console.log(`found ${manifests.length} valid manifests`);

    if (manifests.length > 0) {
      return manifests;
    }

    return undefined;
  }

  private readonly groups: Record<string, CustomResource[]> = { };
  private readonly groupKinds: Record<string, CustomResource[]> = { };
  private readonly options: ImportCrOptions;

  constructor(manifest: ManifestObjectDefinition[], options: ImportCrOptions = {} ) {
    super();

    const crs: Record<string, CustomResource> = { };
    const groups: Record<string, CustomResource[]> = { };
    const groupKinds: Record<string, CustomResource[]> = { };

    const defaultOptions = {
      emitModulePer: ModuleEmitOptions.CRD,
    };

    const opts = {
      ...defaultOptions,
      ...options,
    };

    const extractCRs = (objects: ManifestObjectDefinition[] = []) => {
      for (const obj of objects) {
        // filter empty docs in the manifest
        if (!obj) {
          continue;
        }

        // found a cr, yey!
        const cr = new CustomResource(obj);

        if (cr.key in crs) {
          throw new Error(`${cr.key} already exists`);
        }

        crs[cr.key] = cr;

        const g = cr.group;
        if ( !(g in groups) ) {
          groups[g] = new Array<CustomResource>();
        }
        groups[g].push(cr);

        const kind = (cr.kind === 'CompositeResourceDefinition') ? 'XRD' : cr.kind;
        const gv = `${kind.toLocaleLowerCase()}.${cr.group}`;
        if ( !(gv in groupKinds) ) {
          groupKinds[gv] = new Array<CustomResource>();
        }
        groupKinds[gv].push(cr);
      }
    };

    extractCRs(manifest);

    this.groups = groups;
    this.groupKinds = groupKinds;
    this.options = opts;
  }

  public get moduleNames() {
    if (this.options.emitModulePer === ModuleEmitOptions.API_GROUP) {
      return Object.keys(this.groups);
    }
    return Object.keys(this.groupKinds);
  }

  protected async generateTypeScript(code: CodeMaker, moduleName: string, _options: GenerateOptions) {
    function emitHeader(groupImport: string) {
      code.line('// generated by cdk8s');
      code.line('import { Chart, ApiObject } from \'cdk8s\';');
      code.line(`import * as group from '../../src/imports/${groupImport}';`);
      code.line();
    };

    let crs: CustomResource[] = [];

    switch (this.options.emitModulePer) {
      case ModuleEmitOptions.CRD:
        crs = this.groupKinds[moduleName];
        break;
      case ModuleEmitOptions.API_GROUP:
        crs = this.groups[moduleName];
        break;
      default:
        throw new Error('invalid ModuleEmitOption');
    }

    if (crs.length === 0) {
      return;
    }

    emitHeader(crs[0].group);

    for (const cr of crs) {
      const fqnCamelCase = code.toCamelCase(...cr.fqn.split('.'));
      const funcName = (this.options.emitModulePer === ModuleEmitOptions.CRD) ? fqnCamelCase : `${fqnCamelCase}${cr.kind}`;

      code.open(`export function ${funcName}(chart: Chart, name: string = '${cr.key}') : ApiObject {`);
      code.open(`return new group.${cr.kind}(chart, name,`);

      //output metadata and spec
      const out = {
        metadata: cr.metadata,
        spec: cr.spec,
      };

      const json = json5.stringify( out, null, 2);
      for ( const line of json.split('\n')) {
        code.line(line) ;
      }

      code.close(');');
      code.close('}');
      code.line();
    }
  }
}