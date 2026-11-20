import { CodeMaker } from 'codemaker';
import { TypeGenerator } from './type-generator';
import { kebabToCamelCase, kebabToPascalCase } from './util';

export interface TransformOptions {
  readonly code: CodeMaker;
  readonly typeGenerator: TypeGenerator;
}

export interface Transform {
  (options: TransformOptions): void;
}

export function escapeHtml(text: string): string {
  return text
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;')
    .replace(/'/g, '&#039;');
}

export function escapeDocumentation(text: string | undefined): string | undefined {
  if (text === undefined) {
    return undefined;
  }
  return escapeHtml(text);
}
