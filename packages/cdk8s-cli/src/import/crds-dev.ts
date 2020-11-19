import { ImportSpec } from '../config';
import { ImportCustomResourceDefinition, ManifestObjectDefinition } from './crd';

/**
 *
 *              github:crossplane/crossplane@0.14.0
 *              |--^- |  ^         ^         ^ ^  ^
 *                 |     |         |         | |  |
 *  - provider ----+     |         |         | |  |
 *  - account -----------+         |         | |  |
 *  - repo ------------------------+         | |  |
 *  - major ---------------------------------+ |  |
 *  - minor -----------------------------------+  |
 *  - patch --------------------------------------+
 */

/**
 * Matches a https://doc.crds.dev repo
 *
 *  - ManifestObjectDefinition[] if found
 *  - undefined if not
 *
 * @param source
 */
export async function importCrdsDevRepoMatch(importSpec: ImportSpec): Promise<undefined | ManifestObjectDefinition[]> {
  const { source } = importSpec;
  const url = crdsDevUrl(source);
  if (url) {
    const crd = await ImportCustomResourceDefinition.match({
      source: url,
    });

    return crd;
  }

  return undefined;
}

export function crdsDevUrl(source: string): (undefined | string) {
  const match = /^github:([A-Za-z0-9_.-]+)\/([A-Za-z0-9_.-]+)(?:\@([0-9]+)\.([0-9]+)(?:\.([0-9]+))?)?$/.exec(source);
  if (match) {
    const account = match[1];
    const repo = match[2];
    const major = match[3];

    //default to master if no version specified
    //TODO: get latest released version from available versions
    let url = `https://doc.crds.dev/raw/github.com/${account}/${repo}`;
    if (major) {
      const minor = match[4];
      const patch = match[5] ?? '0';

      url = `https://doc.crds.dev/raw/github.com/${account}/${repo}@v${major}.${minor}.${patch}`;
    }

    return url;
  }

  return undefined;
}
