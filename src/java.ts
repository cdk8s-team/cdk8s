import { CodeMaker } from 'codemaker';
import { kebabToPascal, toCamelCase } from './util';

export interface JavaGeneratorOptions {
  readonly package: string;
  readonly className: string;
}

export class JavaGenerator {
  private readonly code = new CodeMaker();
  private readonly pkg: string;
  private readonly className: string;

  constructor(options: JavaGeneratorOptions) {
    this.pkg = options.package;
    this.className = options.className;
  }

  public async generate(outputDir: string) {
    this.code.openFile(`${this.className}.java`);
    this.emitFile();
    await this.code.save(outputDir);
  }

  private emitFile() {
    this.code.line(`package ${this.pkg};`);
    this.code.line();
    this.code.line('/**
 * This is a generated class.
 */');
    this.code.openBlock(`public class ${this.className}`);
    this.code.closeBlock();
  }

  private escapeHtml(text: string): string {
    return text.replace(/</g, '&lt;').replace(/>/g, '&gt;');
  }
}
