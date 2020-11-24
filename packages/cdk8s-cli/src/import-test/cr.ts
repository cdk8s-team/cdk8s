import * as fs from 'fs';
import * as path from 'path';
import { CodeMaker } from 'codemaker';
import * as glob from 'glob';
import * as json5 from 'json5';
import * as yaml from 'yaml';
import { ImportSpec } from '../config';
import { GenerateOptions, ImportBase } from '../import/base';
import { GroupVersionKind } from '../import/k8s';
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
  CR = 'cr',
  API_GROUP = 'apiGroup',
}

export class CustomResource {
  private readonly group: string;
  private readonly version: string;
  private readonly kind: string;
  private readonly metadata: ApiObjectMetadata;
  private readonly spec: ApiObjectSpec;
  private readonly fqn: string;

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

    this.group = group;
    this.version = version;
    this.kind = kind;
    this.metadata = metadata;
    this.spec = spec;
    this.fqn = fqn;
  }

  public get moduleName() {
    return `${this.group}/${this.kind.toLocaleLowerCase()}/${this.fqn}`;
  }

  public get gvk(): GroupVersionKind {
    return {
      group: this.group,
      version: this.version,
      kind: this.kind,
    };
  }

  public emitTypeScript(code: CodeMaker, _options: GenerateOptions) {
    const name = `${this.kind.toLocaleLowerCase()}/${this.fqn}`;

    code.open(`test('${name}', () => {`);
    code.line('const chart = Testing.chart();');
    code.line();

    code.open(`new group.${this.kind}(chart, '${this.kind.toLocaleLowerCase()}',`);

    //output metadata and spec
    const out = {
      metadata: this.metadata,
      spec: this.spec,
    };

    const json = json5.stringify( out, null, 2);
    for ( const line of json.split('\n')) {
      code.line(line) ;
    }

    code.close(');');

    code.line();
    code.line('expect(Testing.synth(chart)).toMatchSnapshot();');

    code.close('});');

    code.line();
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
        cwd: process.cwd(),
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

  private readonly defs: CustomResource[] = [];
  private readonly groups: Record<string, CustomResource[]> = { };
  private readonly options: ImportCrOptions;

  constructor(manifest: ManifestObjectDefinition[], options: ImportCrOptions = {} ) {
    super();

    const defs: Record<string, CustomResource> = { };
    const groups: Record<string, CustomResource[]> = { };

    const defaultOptions = {
      emitModulePer: ModuleEmitOptions.CR,
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
        const key = cr.moduleName;

        if (key in defs) {
          throw new Error(`${key} already exists`);
        }

        defs[key] = cr;

        if ( opts.emitModulePer === ModuleEmitOptions.API_GROUP) {
          const g = cr.gvk.group;
          if ( !(g in groups) ) {
            groups[g] = new Array<CustomResource>();
          }

          groups[g].push(cr);
        }
      }
    };

    extractCRs(manifest);

    this.defs = Object.values(defs);
    this.groups = groups;
    this.options = opts;
  }

  public get fileExt(): string {
    return '.test.ts';
  }

  public get moduleNames() {
    if (this.options.emitModulePer === ModuleEmitOptions.API_GROUP) {
      return Object.keys(this.groups);
    }
    return this.defs.map(cr => cr.moduleName);
  }

  protected async generateTypeScript(code: CodeMaker, moduleName: string, options: GenerateOptions) {
    function emitHeader() {
      code.line('// generated by cdk8s');
      code.line('import { Testing } from \'cdk8s\';');
      code.line(`import * as group from '../../src/crossplane/imports/${moduleName}';`);
      code.line();
    }

    if (this.options.emitModulePer === ModuleEmitOptions.API_GROUP) {
      const crs = this.groups[moduleName];

      emitHeader();

      for (const cr of crs) {
        await cr.emitTypeScript(code, options);
      }

      return;
    }

    for (const cr of this.defs.filter(c => moduleName === c.moduleName)) {
      emitHeader();
      await cr.emitTypeScript(code, options);
    }
  }
}