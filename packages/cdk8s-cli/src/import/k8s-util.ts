/**
 *
 *     io.k8s.api.extensions.v1beta1.Deployment
 *     |--------- ^ -------|  ^  ^ ^ |---^----|
 *                |           |  | |     |
 *  - namespace --+           |  | |     |
 *  - version ----------------+  | |     |
 *  - level ---------------------+ |     |
 *  - subversion ------------------+     |
 *  - basename --------------------------+
 */
export interface ApiObjectName extends ApiObjectVersion {
  basename: string;
  namespace: string;
  fullname: string;
}

interface ApiObjectVersion {
  level: ApiLevel;
  version: number;
  subversion: number;
}

enum ApiLevel {
  ALPHA = 'alpha',
  BETA = 'beta',
  STABLE = 'stable',
}

/**
 * Parses a fully qualified type name such as to it's components.
 */
export function parseApiTypeName(fullname: string): ApiObjectName {
  const parts = fullname.split('.');
  const type = parts[parts.length - 1];

  const namespace = parts.slice(0, parts.length - 2).join('.');

  const v = parts[parts.length - 2];
  const match = /^v([0-9]+)(([a-z]+)([0-9]+))?$/.exec(v);
  if (!match) {
    throw new Error(`unable to parse version ${v}`);
  }
  const version = match[1];
  if (!version) {
    throw new Error(`unable to parse version ${v}. missing version number ("vN")`);
  }

  const level = match[3] as ApiLevel ?? ApiLevel.STABLE;
  const subversion = parseInt(match[4] ?? '0');
  return {
    fullname: fullname,
    namespace,
    basename: type,
    version: parseInt(version),
    level,
    subversion,
  };
}

