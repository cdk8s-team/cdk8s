export function removeEmpty(obj: any): any {
  if (obj == null) {
    return undefined;
  }

  if (typeof(obj) !== 'object') {
    return obj;
  }

  if (Object.keys(obj).length === 0) {
    return undefined;
  }
  
  if (Array.isArray(obj)) {
    if (obj.length === 0) {
      return undefined;
    }

    return obj.map(x => {
      // do not remove "{}" and "[]" if they are array elements.
      if (x != null && typeof(x) === 'object' && Object.keys(x).length === 0) { return x; }
      if (Array.isArray(x) && x.length === 0) { return x; }
      return removeEmpty(x)
    });
  }

  if (obj.constructor.name !== 'Object') {
    throw new Error(`can't render non-simple objects: ${obj.constructor.name}`);
  }

  const newObj: { [key: string]: any } = { };

  for (const [key, value] of Object.entries(obj)) {
    const newValue = removeEmpty(value);;
    if (newValue != null) {
      newObj[key] = newValue;
    }
  }

  return newObj;
};