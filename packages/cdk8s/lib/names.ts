import * as crypto from 'crypto';

const MAX_LEN = 253;
const VALIDATE = /^[0-9a-z\-.]+$/;
const HASH_LEN = 8;

/**
 * Generates a name from a construct path.
 *
 * Kubernetes resources can have names up to 253 characters long. The characters
 * allowed in names are: digits (0-9), lower case letters (a-z), -, and .
 *
 * Names in cdk8s are always in the follow form:
 *
 *  <comp0>.<comp1>....<compN>.<short-hash>
 *
 * Where <comp> are construct node path components.
 *
 * Note that if the total length is longer than 253 characters, we will trim the
 * first components first since the last components usually are more inline with
 * the essence of the resource.
 *
 * @param path the construct path (components separated by "/")
 * @param maxLen maximum allowed length for name
 * @throws if any of the components do not adhere to naming constraints or length.
 */
export function renderObjectName(path: string, maxLen = MAX_LEN) {
  if (maxLen < HASH_LEN) {
    throw new Error(`minimum max length for object names is ${HASH_LEN} (required for hash)`);
  }

  const components = path.split('/');

  // verify components only use allowed chars.
  for (const comp of components) {
    if (!VALIDATE.test(comp)) {
      throw new Error(`"${comp}" is not a valid object name. The characters allowed in names are: digits (0-9), lower case letters (a-z), -, and .`);
    }

    if (comp.length > maxLen) {
      throw new Error(`Object name "${comp}" is too long. Maximum allowed length is ${maxLen}`);
    }
  }

  // special case: if we only have one component in our path, we don't decorate it
  if (components.length === 1) {
    return components[0];
  }

  components.push(calcHash(path, HASH_LEN));

  return components
    .reverse()
    .join('/')
    .slice(0, maxLen)
    .split('/')
    .reverse()
    .join('.');
}

function calcHash(path: string, maxLen: number) {
  const hash = crypto.createHash('sha256');
  hash.update(path);
  return hash.digest('hex').slice(0, maxLen);
}