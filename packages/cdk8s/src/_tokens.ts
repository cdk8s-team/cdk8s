export function resolve(value: any): any {

  if (value == null) {
    return value;
  }

  // if value is a function, call it and resolve the result.
  if (typeof(value) === 'function') {
    const resolved = value.apply(undefined);
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

