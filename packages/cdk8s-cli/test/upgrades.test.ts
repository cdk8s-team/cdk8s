import * as fs from 'fs-extra';
import { tmpdir } from 'os';
import { join } from 'path';
import { Yaml } from 'cdk8s';
import { getLatestVersion } from '../src/upgrades';

describe('getLatestVersion', () => {
  const yamlLoad = jest.spyOn(Yaml, 'load');
  let cacheFile: string;

  beforeEach(() => {
    const workdir = fs.mkdtempSync(join(tmpdir(), 'test'));
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
    expect(fs.readFileSync(cacheFile, 'utf-8')).toStrictEqual('1.2.3');
  });

  test('local cache exists and valid', () => {
    // GIVEN
    fs.writeFileSync(cacheFile, '7.7.7');

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
    expect(fs.readFileSync(cacheFile, 'utf-8')).toStrictEqual('7.7.7');
  });

  test('local cache exists and invalid', () => {
    // GIVEN
    yamlLoad.mockReturnValue([{ version: '43.12.13' }]);
    fs.writeFileSync(cacheFile, '88.88.88');

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
    expect(fs.readFileSync(cacheFile, 'utf-8')).toStrictEqual('43.12.13');
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
    expect(fs.existsSync(cacheFile)).toBeFalsy();
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
    expect(result).toBeUndefined();
    expect(yamlLoad).toBeCalledWith('http://registry.npmjs.org/dummy-module/latest');
    expect(fs.existsSync(cacheFile)).toBeFalsy();
  });

  test('fail to write to local cache', () => {
      // GIVEN
      yamlLoad.mockReturnValue([{ version: '43.12.13' }]);
      jest.spyOn(fs, 'writeFileSync').mockImplementation(() => {
        throw new Error('unable to write file');
      });

      // WHEN
      const result = getLatestVersion('dummy-module', {
        cacheFile, cacheTtlSec: 30
      });

      // THEN
      expect(fs.existsSync(cacheFile)).toBeFalsy();
      expect(result).toBe('43.12.13');
  });

  test('fails to download & to write to local cache', () => {
      // GIVEN
      yamlLoad.mockImplementation(() => {
        throw new Error('unable to download');
      });
      
      jest.spyOn(fs, 'writeFileSync').mockImplementation(() => {
        throw new Error('unable to write file');
      });

      // WHEN
      const result = getLatestVersion('dummy-module', {
        cacheFile, cacheTtlSec: 30
      });

      // THEN
      expect(fs.existsSync(cacheFile)).toBeFalsy();
      expect(result).toBeUndefined();
  })
});

