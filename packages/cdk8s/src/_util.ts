export interface SanitizeOptions {
  /**
   * Do not include empty objects (no keys).
   */
  readonly filterEmptyObjects?: boolean;

  /**
   * Do not include arrays with no items.
   */
  readonly filterEmptyArrays?: boolean;
}

export function sanitizeValue(obj: any, options: SanitizeOptions = { }): any {
  if (obj == null) {
    return undefined;
  }

  if (typeof(obj) !== 'object') {
    return obj;
  }

  if (Array.isArray(obj)) {

    if (options.filterEmptyArrays && obj.length === 0) {
      return undefined;
    }

    return obj.map(x => sanitizeValue(x, options));
  }

  if (obj.constructor.name !== 'Object') {
    throw new Error(`can't render non-simple object of type '${obj.constructor.name}'`);
  }

  const newObj: { [key: string]: any } = { };

  for (const [key, value] of Object.entries(obj)) {
    const newValue = sanitizeValue(value, options);
    if (newValue != null) {
      newObj[key] = newValue;
    }
  }

  if (options.filterEmptyObjects && Object.keys(newObj).length === 0) {
    return undefined;
  }

  return newObj;
}
