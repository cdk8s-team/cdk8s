import * as path from 'path';
import { CodeMaker } from 'codemaker';
import * as fs from 'fs-extra';
import * as srcmak from 'jsii-srcmak';
import { mkdtemp } from '../util';

export enum Language {
  TYPESCRIPT = 'typescript',
  PYTHON = 'python',
  DOTNET = 'dotnet',
  JAVA = 'java',
}

export interface ImportOptions {
  readonly moduleNamePrefix?: string;
  readonly targetLanguage: Language;
  readonly outdir: string;

  /**
   * Path to copy the output .jsii file.
   * @default - jsii file is not emitted
   */
  readonly outputJsii?: string;

  /**
   * A prefix for all construct classes.
   *
   * @default - default is determined by the specific import type. For example
   * k8s imports will add a "Kube" prefix by default.
   */
  readonly classNamePrefix?: string;
}

export interface GenerateOptions {
  readonly classNamePrefix?: string;
}

export abstract class ImportBase {
  public abstract get moduleNames(): string[];

  protected abstract async generateTypeScript(code: CodeMaker, moduleName: string, options: GenerateOptions): Promise<void>;

  public async import(options: ImportOptions) {
    const code = new CodeMaker();

    const outdir = path.resolve(options.outdir);
    await fs.mkdirp(outdir);
    const isTypescript = options.targetLanguage === Language.TYPESCRIPT;
    const { moduleNamePrefix } = options;

    if (this.moduleNames.length === 0) {
      console.error('warning: no definitions to import');
    }

    const mapFunc = ( origName: any ) => {
      let name = origName;
      switch (options.targetLanguage) {
        case Language.PYTHON:
        case Language.JAVA:
          name = name.split('.').reverse().join('.');
          break;
      }
      return {
        origName: origName,
        name: name,
      };
    };

    // sort to ensure python writes parent packages first, so children are not deleted
    const modules = this.moduleNames.map(mapFunc).sort((a: any, b: any) => a.name.localeCompare(b.name));

    for (const module of modules) {
      // output the name of the imported resource
      console.log(module.origName);

      const fileName = moduleNamePrefix ? `${moduleNamePrefix}-${module.name}.ts` : `${module.name}.ts`;
      code.openFile(fileName);
      code.indentation = 2;
      await this.generateTypeScript(code, module.origName, {
        classNamePrefix: options.classNamePrefix,
      });

      code.closeFile(fileName);

      if (isTypescript) {
        await code.save(outdir);
      }

      if (!isTypescript || options.outputJsii) {
        await mkdtemp(async staging => {

          // this is not typescript, so we generate in a staging directory and
          // use jsii-srcmak to compile and extract the language-specific source
          // into our project.
          await code.save(staging);

          // these are the module dependencies we compile against
          const deps = ['@types/node', 'constructs', 'cdk8s'];

          const opts: srcmak.Options = {
            entrypoint: fileName,
            moduleKey: module.name,
            deps: deps.map(dep => path.dirname(require.resolve(`${dep}/package.json`))),
          };

          // used for testing.
          if (options.outputJsii) {
            opts.jsii = { path: options.outputJsii };
          }

          // python!
          if (options.targetLanguage === Language.PYTHON) {
            const moduleName = `${moduleNamePrefix ? `${moduleNamePrefix}.${module.name}` : module.name}`.replace(/-/g, '_');
            opts.python = {
              outdir: outdir,
              moduleName,
            };
          }

          // java!
          if (options.targetLanguage === Language.JAVA) {
            const javaName = module.name.replace(/\//g, '.').replace(/-/g, '_');
            opts.java = {
              outdir: '.',
              package: `imports.${moduleNamePrefix ? moduleNamePrefix + '.' + javaName : javaName}`,
            };
          }

          await srcmak.srcmak(staging, opts);
        });
      }
    }
  }
}
