export function removeEmpty(obj: any): any {
  if (obj == null) {
    return undefined;
  }

  if (typeof(obj) !== 'object') {
    return obj;
  }

  if (Array.isArray(obj)) {
    return obj.map(x => removeEmpty(x));
  }

  if (obj.constructor.name !== 'Object') {
    throw new Error(`can't render non-simple object of type '${obj.constructor.name}'`);
  }

  const newObj: { [key: string]: any } = { };

  for (const [key, value] of Object.entries(obj)) {
    const newValue = removeEmpty(value);
    if (newValue != null) {
      newObj[key] = newValue;
    }
  }

  return newObj;
}