import * as crypto from 'crypto';

const MAX_DNS_NAME_LEN = 63;
const VALIDATE = /^[0-9a-z-]+$/;
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

    components = omitDuplicates(components);

    return components
      .join('/')
      .slice(0, maxLen)
      .split('/')
      .reverse()
      .filter(x => x)
      .join('-');
  }

  /* istanbul ignore next */
  private constructor() {
    return;
  }
}

function omitDuplicates(components: string[]) {
  return components.reverse().filter((value, index, components) => value !== components[index-1])
}

function normalizeToDnsName(c: string, maxLen: number) {
  return c
    .toLocaleLowerCase()        // lower case
    .replace(/[^0-9a-z-]/g, '') // remove non-allowed characters
    .substr(0, maxLen)          // trim to maxLength
}

function calcHash(path: string, maxLen: number) {
  const hash = crypto.createHash('sha256');
  hash.update(path);
  return hash.digest('hex').slice(0, maxLen);
}