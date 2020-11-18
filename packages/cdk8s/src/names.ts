import * as crypto from 'crypto';

const MAX_DNS_NAME_LEN = 63;
const VALIDATE = /^[0-9a-z-]+$/;
const MAX_LABEL_VALUE_LEN = 63;
const VALIDATE_LABEL_VALUE = /^(([0-9a-zA-Z][0-9a-zA-Z-_.]*)?[0-9a-zA-Z])?$/;
const HASH_LEN = 8;

/**
 * Utilities for generating unique and stable names.
 */
export class Names {
  /**
   * Generates a unique and stable name compatible DNS_LABEL from RFC-1123 from
   * a path.
   *
   * The generated name will:
   *  - contain at most 63 characters
   *  - contain only lowercase alphanumeric characters or ‘-’
   *  - start with an alphanumeric character
   *  - end with an alphanumeric character
   *
   * The generated name will have the form:
   *  <comp0>-<comp1>-..-<compN>-<short-hash>
   *
   * Where <comp> are the path components (assuming they are is separated by
   * "/").
   *
   * Note that if the total length is longer than 63 characters, we will trim
   * the first components since the last components usually encode more meaning.
   *
   * @link https://tools.ietf.org/html/rfc1123
   *
   * @param path a path to a node (components separated by "/")
   * @param maxLen maximum allowed length for name
   * @throws if any of the components do not adhere to naming constraints or
   * length.
   */
  public static toDnsLabel(path: string, maxLen = MAX_DNS_NAME_LEN) {
    if (maxLen < HASH_LEN) {
      throw new Error(`minimum max length for object names is ${HASH_LEN} (required for hash)`);
    }

    let components = path.split('/');

    // special case: if we only have one component in our path and it adheres to DNS_NAME, we don't decorate it
    if (components.length === 1 && VALIDATE.test(components[0]) && components[0].length <= maxLen) {
      return components[0];
    }

    // okay, now we need to normalize all components to adhere to DNS_NAME and append the hash of the full path.
    components = components.map(c => normalizeToDnsName(c, maxLen));

    components.push(calcHash(path, HASH_LEN));

    return components
      .reverse()
      .filter(omitDuplicates)
      .join('/')
      .slice(0, maxLen)
      .split('/')
      .reverse()
      .filter(x => x)
      .join('-')
      .split('-')
      .filter(x => x) // remove empty components between `-`s.
      .filter(omitDefaultChild)
      .join('-');
  }

  /**
   * Generates a unique and stable name compatible label key name segment and
   * label value from a path.
   *
   * The name segment is required and must be 63 characters or less, beginning
   * and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-),
   * underscores (_), dots (.), and alphanumerics between.
   *
   * Valid label values must be 63 characters or less and must be empty or
   * begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes
   * (-), underscores (_), dots (.), and alphanumerics between.
   *
   * The generated name will have the form:
   *  <comp0><delim><comp1><delim>..<delim><compN><delim><short-hash>
   *
   * Where <comp> are the path components (assuming they are is separated by
   * "/").
   *
   * Note that if the total length is longer than 63 characters, we will trim
   * the first components since the last components usually encode more meaning.
   *
   * @link https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set
   *
   * @param path a path to a node (components separated by "/")
   * @param delim a delimiter to separates components
   * @param maxLen maximum allowed length for name
   * @throws if any of the components do not adhere to naming constraints or
   * length.
   */
  public static toLabelValue(path: string, delim: string = '-', maxLen: number = MAX_LABEL_VALUE_LEN) {
    if (maxLen < HASH_LEN) {
      throw new Error(`minimum max length for label is ${HASH_LEN} (required for hash)`);
    }

    if (/[^0-9a-zA-Z-_.]/.test(delim)) {
      throw new Error('delim should not contain "[^0-9a-zA-Z-_.]"');
    }

    let components = path.split('/');

    // special case: if we only have one component in our path and it adheres to DNS_NAME, we don't decorate it
    if (components.length === 1 && VALIDATE_LABEL_VALUE.test(components[0]) && components[0].length <= maxLen) {
      return components[0];
    }

    // okay, now we need to normalize all components to adhere to label and append the hash of the full path.
    components = components.map(c => normalizeToLabelValue(c, maxLen));

    components.push(calcHash(path, HASH_LEN));

    const result = components
      .reverse()
      .filter(omitDuplicates)
      .join('/')
      .slice(0, maxLen)
      .split('/')
      .reverse()
      .filter(x => x)
      .join(delim)
      .split(delim)
      .filter(x => x)
      .filter(omitDefaultChild)
      .join(delim);

    // slicing might let '-', '_', '.' be in the start of the result.
    return result.replace(/^[^0-9a-zA-Z]+/, '');
  }

  /* istanbul ignore next */
  private constructor() {
    return;
  }
}

function omitDuplicates(value: string, index: number, components: string[]) {
  return value !== components[index-1];
}

function omitDefaultChild(value: string, _: number, __: string[]) {
  return value.toLowerCase() !== 'resource' && value.toLowerCase() !== 'default';
}

// function toHumanForm(components: string[], delimiter: string, maxLen: number) {
//   return components
//     .reverse()
//     .filter(omitDuplicates)
//     .join(delimiter)
//     .slice(0, maxLen)
//     .split(delimiter)
//     .reverse()
//     .filter(x => x) // remove empty components between `-`s.
//     .join(delimiter)
//     .split(delimiter)
//     .filter(x => x) // remove empty components between `-`s.
//     // .filter(omitDefaultChild)
//     .join(delimiter);
// }

function normalizeToDnsName(c: string, maxLen: number) {
  return c
    .toLocaleLowerCase() // lower case
    .replace(/[^0-9a-zA-Z-_.]/g, '') // remove non-allowed characters
    .substr(0, maxLen); // trim to maxLength
}

function normalizeToLabelValue(c: string, maxLen: number) {
  return c
    .replace(/[^0-9a-zA-Z-_.]/g, '') // remove non-allowed characters
    .substr(0, maxLen); // trim to maxLength
}

function calcHash(path: string, maxLen: number) {
  const hash = crypto.createHash('sha256');
  hash.update(path);
  return hash.digest('hex').slice(0, maxLen);
}