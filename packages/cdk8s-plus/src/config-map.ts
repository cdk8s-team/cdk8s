import * as fs from 'fs';
import * as path from 'path';
import * as cdk8s from 'cdk8s';
import { Construct } from 'constructs';
import * as minimatch from 'minimatch';
import { ResourceProps, Resource, IResource } from './base';
import * as k8s from './imports/k8s';
import { undefinedIfEmpty } from './utils';

/**
 * Properties for initialization of `ConfigMap`.
 */
export interface ConfigMapProps extends ResourceProps {
  /**
   * BinaryData contains the binary data.
   *
   * Each key must consist of alphanumeric characters, '-', '_' or '.'.
   * BinaryData can contain byte sequences that are not in the UTF-8 range. The
   * keys stored in BinaryData must not overlap with the ones in the Data field,
   * this is enforced during validation process. Using this field will require
   * 1.10+ apiserver and kubelet.
   *
   * You can also add binary data using `configMap.addBinaryData()`.
   */
  readonly binaryData?: { [key: string]: string };

  /**
   * Data contains the configuration data.
   *
   * Each key must consist of alphanumeric characters, '-', '_' or '.'. Values
   * with non-UTF-8 byte sequences must use the BinaryData field. The keys
   * stored in Data must not overlap with the keys in the BinaryData field, this
   * is enforced during validation process.
   *
   * You can also add data using `configMap.addData()`.
   */
  readonly data?: { [key: string]: string };
}

/**
 * Represents a config map.
 */
export interface IConfigMap extends IResource {

}

/**
 * ConfigMap holds configuration data for pods to consume.
 */
export class ConfigMap extends Resource implements IConfigMap {
  /**
   * Represents a ConfigMap created elsewhere.
   * @param name The name of the config map to import
   */
  public static fromConfigMapName(name: string): IConfigMap {
    return { name };
  }

  /**
   * @see base.Resource.apiObject
   */
  protected readonly apiObject: cdk8s.ApiObject;

  private readonly _binaryData: { [key: string]: string } = { };
  private readonly _data: { [key: string]: string } = { };

  public constructor(scope: Construct, id: string, props: ConfigMapProps = { }) {
    super(scope, id, { metadata: props.metadata });

    this.apiObject = new k8s.KubeConfigMap(this, 'ConfigMap', {
      metadata: props.metadata,

      // we need lazy here because we filter empty
      data: cdk8s.Lazy.any({ produce: () => this.synthesizeData() }),
      binaryData: cdk8s.Lazy.any({ produce: () => this.synthesizeBinaryData() }),
    });

    for (const [k, v] of Object.entries(props.data ?? { })) {
      this.addData(k, v);
    }

    for (const [k, v] of Object.entries(props.binaryData ?? { })) {
      this.addBinaryData(k, v);
    }
  }

  /**
   * Adds a data entry to the config map.
   * @param key The key
   * @param value The value
   *
   * @throws if there is either a `data` or `binaryData` entry with the same key
   */
  public addData(key: string, value: string) {
    this.verifyKeyAvailable(key);

    this._data[key] = value;
  }

  /**
   * The data associated with this config map.
   *
   * Returns an copy. To add data records, use `addData()` or `addBinaryData()`.
   */
  public get data(): Record<string, string> {
    return { ...this._data };
  }

  /**
   * Adds a binary data entry to the config map. BinaryData can contain byte
   * sequences that are not in the UTF-8 range.
   * @param key The key
   * @param value The value
   *
   * @throws if there is either a `data` or `binaryData` entry with the same key
   */
  public addBinaryData(key: string, value: string) {
    this.verifyKeyAvailable(key);

    this._binaryData[key] = value;
  }

  /**
   * The binary data associated with this config map.
   *
   * Returns a copy. To add data records, use `addBinaryData()` or `addData()`.
   */
  public get binaryData(): Record<string, string> {
    return { ...this._binaryData };
  }

  /**
   * Adds a file to the ConfigMap.
   * @param localFile The path to the local file
   * @param key The ConfigMap key (default to the file name).
   */
  public addFile(localFile: string, key?: string) {
    key = key ?? path.basename(localFile);
    const value = fs.readFileSync(localFile, 'utf-8');

    this.addData(key, value);
  }

  /**
   * Adds a directory to the ConfigMap.
   * @param localDir A path to a local directory
   * @param options Options
   */
  public addDirectory(localDir: string, options: AddDirectoryOptions = { }) {
    const exclude = options.exclude ?? [];
    const shouldInclude = (file: string) => {
      for (const pattern of exclude) {
        if (minimatch(file, pattern)) {
          return false;
        }
      }
      return true;
    };

    const keyPrefix = options.keyPrefix ?? '';
    for (const file of fs.readdirSync(localDir)) {

      const filePath = path.join(localDir, file);

      if (fs.statSync(filePath).isDirectory()) {
        continue;
      }

      if (!shouldInclude(file)) {
        continue;
      }

      const relativeFilePath = keyPrefix + file;
      this.addFile(filePath, relativeFilePath);
    }
  }

  private verifyKeyAvailable(key: string) {
    if (key in this._data || key in this._binaryData) {
      throw new Error(`unable to add a ConfigMap entry with key "${key}". It is already used`);
    }
  }

  private synthesizeData() {
    return undefinedIfEmpty(this._data);
  }

  private synthesizeBinaryData() {
    return undefinedIfEmpty(this._binaryData);
  }
}

/**
 * Options for `configmap.addDirectory()`
 */
export interface AddDirectoryOptions {
  /**
   * A prefix to add to all keys in the config map.
   * @default ""
   */
  readonly keyPrefix?: string;

  /**
   * Glob patterns to exclude when adding files.
   * @default - include all files
   */
  readonly exclude?: string[];
}
