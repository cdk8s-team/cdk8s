import * as fs from 'fs-extra';
import * as path from 'path';
import { CodeMaker } from 'codemaker';
import { withTempDir, shell } from '../util';
import { jsiiCompile } from './jsii';

export enum Language {
  TYPESCRIPT = 'typescript',
  PYTHON = 'python',
  DOTNET = 'dotnet',
  JAVA = 'java',
}

export const LANGUAGES = [ Language.TYPESCRIPT, Language.PYTHON ];

export interface ImportOptions {
  readonly targetLanguage: Language;
  readonly outdir: string;
}

export abstract class ImportBase {
  public abstract get moduleName(): string;
  protected abstract async generateTypeScript(code: CodeMaker): Promise<void>;

  public async import(options: ImportOptions) {
    const code = new CodeMaker();
    const fileName = `${this.moduleName}.ts`;
    code.openFile(fileName);
    code.indentation = 2;
    await this.generateTypeScript(code);
    code.closeFile(fileName);

    const outdir = path.resolve(options.outdir);
    await fs.mkdirp(outdir);

    if (options.targetLanguage === Language.TYPESCRIPT) {
      await code.save(outdir);
      return;
    } 

    // this is not typescript, so we generate in a staging directory and harvest the code
    await withTempDir('importer', async () => {
      await code.save('.');
      await jsiiCompile('.', {
        main: this.moduleName,
        name: this.moduleName,
      });

      const pacmak = require.resolve('jsii-pacmak/bin/jsii-pacmak');
      await shell(pacmak, [ '--target', options.targetLanguage, '--code-only' ]);
      await this.harvestCode(options, outdir);
    });
  }

  private async harvestCode(options: ImportOptions, targetdir: string) {
    switch (options.targetLanguage) {
      case Language.TYPESCRIPT:
        throw new Error('no op for typescript');
  
      case Language.PYTHON:
        await this.harvestPython(targetdir);
        break;
  
      default:
        throw new Error(`unsupported language ${options.targetLanguage} (yet)`);
    }
  
  }

  private async harvestPython(targetdir: string) {
    const target = path.join(targetdir, this.moduleName);
    await fs.move(`dist/python/src/${this.moduleName}`, target, { overwrite: true });
  }
}

