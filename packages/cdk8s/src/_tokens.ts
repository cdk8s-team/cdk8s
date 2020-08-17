import { Lazy } from './lazy';

export function resolve(value: any): any {

  if (value == null) {
    return value;
  }

  if (value instanceof Lazy) {
    // we only resolve tokens created by the Lazy class.
    const resolved = value.apply();
    return resolve(resolved);
  }

  if (typeof(value) !== 'object') {
    return value;
  }

  if (Array.isArray(value)) {
    return value.map(x => resolve(x));
  }

  const result: any = {};

  for (const [k,v] of Object.entries(value)) {
    result[k] = resolve(v);
  }

  return result;

}

