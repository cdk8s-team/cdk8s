// import { shell } from './util';
import { homedir } from 'os';
import { join } from 'path';
import * as cdk8s from 'cdk8s';
import { readFileSync, statSync, writeFileSync } from 'fs-extra';

// eslint-disable-next-line @typescript-eslint/no-require-imports
const pkg = require('../package.json');

const CACHE = {
  cacheTtlSec: 60 * 30, // 30min
  cacheFile: join(homedir(), '.cdk8s-cli.version'),
};

export function latestVersion() {
  try {
    const latest = getLatestVersion(pkg.name, CACHE);
    if (latest !== pkg.version) {
      return { latest, current: pkg.version };
    } else {
      return undefined;
    }
  } catch (e) {
    // swollow errors
    return undefined;
  }
}

/**
 * Returns the latest version of an npm module. The version is cached for 30min
 * to ~/.cdk8s-cli.version.
 *
 * @param module The module name
 */
export function getLatestVersion(module: string, options: { cacheFile: string; cacheTtlSec: number }) {
  let latest = readCache();
  if (!latest) {
    try {
      const info = cdk8s.Yaml.load(`http://registry.npmjs.org/${module}/latest`);
      if (!info || info.length < 1) {
        return undefined;
      }
      latest = info[0].version;
    } catch (e) {
      return undefined;
    }

    // cannot determine version, return undefined.
    if (!latest) {
      return undefined;
    }

    writeCache(latest);
  }

  return latest;

  function readCache(): string | undefined {
    try {
      const lastModified = statSync(options.cacheFile).mtime;
      const diff = (new Date().getTime()) - lastModified.getTime();
      if (diff > options.cacheTtlSec * 1000) {
        return undefined;
      }

      return readFileSync(options.cacheFile, 'utf-8').trim();
    } catch (e) {
      return undefined;
    }
  }

  function writeCache(version: string) {
    writeFileSync(options.cacheFile, version);
  }
}
