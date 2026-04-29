import * as sanitize from 'sanitize-filename';

const SEPARATOR = /[._/-]/;

export function toPascalCase(s: string): string {
  return s.split(SEPARATOR)
    .filter(x => x.length > 0)
    .map(x => x.charAt(0).toUpperCase() + x.slice(1).toLowerCase())
    .join('');
}

export function toCamelCase(s: string): string {
  const parts = s.split(SEPARATOR).filter(x => x.length > 0);
  if (parts.length === 0) {
    return '';
  }
  return parts[0].toLowerCase() + parts.slice(1)
    .map(x => x.charAt(0).toUpperCase() + x.slice(1).toLowerCase())
    .join('');
}

export function toSnakeCase(s: string): string {
  return s.split(SEPARATOR)
    .filter(x => x.length > 0)
    .map(x => x.toLowerCase())
    .join('_');
}

export function toKebabCase(s: string): string {
  return s.split(SEPARATOR)
    .filter(x => x.length > 0)
    .map(x => x.toLowerCase())
    .join('-');
}

export function sanitizeFilename(name: string): string {
  return sanitize(name);
}
