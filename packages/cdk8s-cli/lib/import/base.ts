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
  public abstract get moduleName(): string[];
  protected abstract async generateTypeScript(code: CodeMaker, moduleName?: string): Promise<void>;

  public async import(options: ImportOptions) {
    const code = new CodeMaker();

    const outdir = path.resolve(options.outdir);
    await fs.mkdirp(outdir);
    const isTypescript = options.targetLanguage === Language.TYPESCRIPT

    for (const name of this.moduleName) {
      const fileName = `${name}.ts`;
      code.openFile(fileName);
      code.indentation = 2;
      await this.generateTypeScript(code, name);
      code.closeFile(fileName);
    
      if (isTypescript) {
        await code.save(outdir);
      } 
    }

    if (isTypescript) return

    // this is not typescript, so we generate in a staging directory and harvest the code
    await withTempDir('importer', async () => {
      await code.save('.');

      await this.moduleName.forEach(name => jsiiCompile('.', {
        main: name,
        name,
      }))
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
    this.moduleName.forEach(name => async () => {
      const target = path.join(targetdir, name);
      await fs.move(`dist/python/src/${name}`, target, { overwrite: true });
    });
  }
}

