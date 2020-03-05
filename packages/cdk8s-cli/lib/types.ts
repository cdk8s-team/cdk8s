import { JSONSchema4 } from 'json-schema';

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

export interface ApiObjectVersion {
  level: ApiLevel;
  version: number;
  subversion: number;
}

export interface ApiObjectDefinition extends ApiObjectName {
  schema: JSONSchema4;
}

export enum ApiLevel {
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
    subversion
  };
}

export function isApiObject(def: JSONSchema4): boolean {
  return !!tryGetObjectName(def);
}

export function tryGetObjectName(def: JSONSchema4): GroupVersionKind | undefined {
  const objectNames = def[X_GROUP_VERSION_KIND] as GroupVersionKind[];
  if (!objectNames) {
    return undefined;
  }

  const objectName = objectNames[0];
  if (!objectName) {
    return undefined;
  }

  // skip definitions without "metadata". they are not API objects that can be defined
  // in manifests (example: io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions)
  // they will be treated as data types
  if (!def.properties?.metadata) {
    return undefined;
  }
  
  return objectName;
}

export function getObjectName(apiDefinition: ApiObjectDefinition): GroupVersionKind {
  const objectName = tryGetObjectName(apiDefinition.schema);
  if (!objectName) {
    throw new Error(`cannot determine API object name for ${apiDefinition.fullname}. schema must include a ${X_GROUP_VERSION_KIND} key`);
  }

  return objectName;
}


export interface GroupVersionKind {
  readonly group: string;
  readonly kind: string;
  readonly version: string;
}

export const X_GROUP_VERSION_KIND = 'x-kubernetes-group-version-kind';
