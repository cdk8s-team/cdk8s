import { ApiLevel, ApiObjectVersion } from './types';

/**
 * Compares two API versions using the following strategy:
 * 
 *  - Latest stable version
 *  - If there isn't a stable version, 
 * 
 * 
 * @param lhs 
 * @param rhs 
 */
export function compareApiVersions(lhs: ApiObjectVersion, rhs: ApiObjectVersion): number {

  // stable > beta > alpha
  // this means that: v1 > v2beta1

  const lhsLevel = levelOrder(lhs.level);
  const rhsLevel = levelOrder(rhs.level);
  if (lhsLevel > rhsLevel) {
    return 1;
  } else if (lhsLevel < rhsLevel) {
    return -1;
  }

  // latest version

  if (lhs.version > rhs.version) {
    return 1;
  } else if (lhs.version < rhs.version) {
    return -1;
  }

  // sub-version withinn the same level

  if (lhs.subversion > rhs.subversion) {
    return 1;
  } else if (lhs.subversion < rhs.subversion) {
    return -1;
  }

  return 0;
}

function levelOrder(level: ApiLevel): number {
  switch (level) {
    case ApiLevel.ALPHA: return 0;
    case ApiLevel.BETA: return 1;
    case ApiLevel.STABLE: return 100;
  }
}