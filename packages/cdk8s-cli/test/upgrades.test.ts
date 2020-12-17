import { existsSync, mkdtempSync, writeFileSync } from 'fs';
import { tmpdir } from 'os';
import { join } from 'path';
import { Yaml } from 'cdk8s';
import { readFileSync } from 'fs-extra';
import { getLatestVersion } from '../src/upgrades';

describe('getLatestVersion', () => {
  const yamlLoad = jest.spyOn(Yaml, 'load');
  let cacheFile: string;

  beforeEach(() => {
    const workdir = mkdtempSync(join(tmpdir(), 'test'));
    cacheFile = join(workdir, 'version-cache.txt');
  });

  afterEach(() => {
    jest.clearAllMocks();
  });

  test('http get successful with no local cache', async () => {
    // GIVEN
    yamlLoad.mockReturnValue([{ version: '1.2.3' }]);

    // WHEN
    const result = getLatestVersion('dummy-module', {
      cacheFile,
      cacheTtlSec: 30,
    });

    // THEN

    // getLatestVersion returns the version from npm
    expect(result).toBe('1.2.3');

    // Yaml.load() is called with the correct URL
    expect(yamlLoad).toBeCalledWith('http://registry.npmjs.org/dummy-module/latest');

    // local cache now includes the version
    expect(readFileSync(cacheFile, 'utf-8')).toStrictEqual('1.2.3');
  });

  test('local cache exists and valid', () => {
    // GIVEN
    writeFileSync(cacheFile, '7.7.7');

    // WHEN
    const result = getLatestVersion('dummy-module', {
      cacheFile,
      cacheTtlSec: 30,
    });

    // THEN

    // getLatestVersion returns the version from npm
    expect(result).toBe('7.7.7');

    // Yaml.load() should not be called
    expect(yamlLoad).not.toBeCalled();

    // local cache now includes the version
    expect(readFileSync(cacheFile, 'utf-8')).toStrictEqual('7.7.7');
  });

  test('local cache exists and invalid', () => {
    // GIVEN
    yamlLoad.mockReturnValue([{ version: '43.12.13' }]);
    writeFileSync(cacheFile, '88.88.88');

    // WHEN
    const result = getLatestVersion('dummy-module', {
      cacheFile,
      cacheTtlSec: -1,
    });

    // THEN

    // getLatestVersion returns the version from npm
    expect(result).toBe('43.12.13');

    // Yaml.load() should be called
    expect(yamlLoad).toBeCalled();

    // local cache now includes the version
    expect(readFileSync(cacheFile, 'utf-8')).toStrictEqual('43.12.13');
  });

  test('no local cache, http get failed => undefined', () => {
    // GIVEN
    yamlLoad.mockImplementation(() => {
      throw new Error('unable to download');
    });

    // WHEN
    const result = getLatestVersion('dummy-module', {
      cacheFile,
      cacheTtlSec: 30,
    });

    // THEN

    // Yaml.load() is called with the correct URL
    expect(yamlLoad).toBeCalledWith('http://registry.npmjs.org/dummy-module/latest');

    // getLatestVersion returns the version from npm
    expect(result).toBe(undefined);

    // local cache now includes the version
    expect(existsSync(cacheFile)).toBeFalsy();
  });

  test('npm returns a malformed result', () => {
    // GIVEN
    yamlLoad.mockReturnValue([{ bboom: 123 }]);

    // WHEN
    const result = getLatestVersion('dummy-module', {
      cacheFile,
      cacheTtlSec: 30,
    });

    // THEN
    expect(result).toBe(undefined);
    expect(yamlLoad).toBeCalledWith('http://registry.npmjs.org/dummy-module/latest');
    expect(existsSync(cacheFile)).toBeFalsy();
  });
});

