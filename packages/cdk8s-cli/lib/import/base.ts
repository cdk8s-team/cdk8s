import * as fs from 'fs-extra';
import * as path from 'path';
import { CodeMaker } from 'codemaker';
import { mkdtemp } from '../util';
import * as srcmak from 'jsii-srcmak';

export enum Language {
  TYPESCRIPT = 'typescript',
  PYTHON = 'python',
  DOTNET = 'dotnet',
  JAVA = 'java',
}

export const LANGUAGES = [ Language.TYPESCRIPT, Language.PYTHON ];

export interface ImportOptions {
  readonly moduleNamePrefix?: string;
  readonly targetLanguage: Language;
  readonly outdir: string;

  /**
   * Path to copy the output .jsii file.
   * @default - jsii file is not emitted
   */
  readonly outputJsii?: string;
}

export abstract class ImportBase {
  public abstract get moduleNames(): string[];

  protected abstract async generateTypeScript(code: CodeMaker, moduleName?: string): Promise<void>;

  public async import(options: ImportOptions) {
    const code = new CodeMaker();

    const outdir = path.resolve(options.outdir);
    await fs.mkdirp(outdir);
    const isTypescript = options.targetLanguage === Language.TYPESCRIPT
    const { moduleNamePrefix } = options;

    if (this.moduleNames.length === 0) {
      console.error(`warning: no definitions to import`);
    }

    for (const name of this.moduleNames) {
      // output the name of the imported resource
      console.error(name);

      const fileName = moduleNamePrefix ? `${moduleNamePrefix}-${name}.ts` : `${name}.ts`;
      code.openFile(fileName);
      code.indentation = 2;
      await this.generateTypeScript(code, name);
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
          const deps = [ '@types/node', 'constructs', 'cdk8s' ];

          const opts: srcmak.Options = {
            entrypoint: fileName,
            deps: deps.map(dep => path.dirname(require.resolve(`${dep}/package.json`))),
          };

          // used for testing.
          if (options.outputJsii) {
            opts.jsii = { path: options.outputJsii };
          }

          // python!
          if (options.targetLanguage === Language.PYTHON) {
            opts.python = {
              outdir: outdir,
              moduleName: moduleNamePrefix ? `${moduleNamePrefix}.${name}` : name
            };
          }

          await srcmak.srcmak(staging, opts);
        });
      }
    }
  }
}
