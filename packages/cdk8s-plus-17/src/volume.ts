import { Size } from 'cdk8s';
import { IConfigMap } from './config-map';
import * as k8s from './imports/k8s';

/**
 * Volume represents a named volume in a pod that may be accessed by any
 * container in the pod.
 *
 * Docker also has a concept of volumes, though it is somewhat looser and less
 * managed. In Docker, a volume is simply a directory on disk or in another
 * Container. Lifetimes are not managed and until very recently there were only
 * local-disk-backed volumes. Docker now provides volume drivers, but the
 * functionality is very limited for now (e.g. as of Docker 1.7 only one volume
 * driver is allowed per Container and there is no way to pass parameters to
 * volumes).
 *
 * A Kubernetes volume, on the other hand, has an explicit lifetime - the same
 * as the Pod that encloses it. Consequently, a volume outlives any Containers
 * that run within the Pod, and data is preserved across Container restarts. Of
 * course, when a Pod ceases to exist, the volume will cease to exist, too.
 * Perhaps more importantly than this, Kubernetes supports many types of
 * volumes, and a Pod can use any number of them simultaneously.
 *
 * At its core, a volume is just a directory, possibly with some data in it,
 * which is accessible to the Containers in a Pod. How that directory comes to
 * be, the medium that backs it, and the contents of it are determined by the
 * particular volume type used.
 *
 * To use a volume, a Pod specifies what volumes to provide for the Pod (the
 * .spec.volumes field) and where to mount those into Containers (the
 * .spec.containers[*].volumeMounts field).
 *
 * A process in a container sees a filesystem view composed from their Docker
 * image and volumes. The Docker image is at the root of the filesystem
 * hierarchy, and any volumes are mounted at the specified paths within the
 * image. Volumes can not mount onto other volumes
 */
export class Volume {
  /**
   * Populate the volume from a ConfigMap.
   *
   * The configMap resource provides a way to inject configuration data into
   * Pods. The data stored in a ConfigMap object can be referenced in a volume
   * of type configMap and then consumed by containerized applications running
   * in a Pod.
   *
   * When referencing a configMap object, you can simply provide its name in the
   * volume to reference it. You can also customize the path to use for a
   * specific entry in the ConfigMap.
   *
   * @param configMap The config map to use to populate the volume.
   * @param options Options
   */
  public static fromConfigMap(configMap: IConfigMap, options: ConfigMapVolumeOptions = { }): Volume {
    return new Volume(options.name ?? `configmap-${configMap.name}`, {
      configMap: {
        name: configMap.name,
        defaultMode: options.defaultMode,
        optional: options.optional,
        items: renderItems(options.items),
      },
    });

    function renderItems(items?: { [key: string]: PathMapping }) {
      if (!items) { return undefined; }
      const result = new Array<k8s.KeyToPath>();
      for (const key of Object.keys(items).sort()) {
        result.push({
          key,
          path: items[key].path,
          mode: items[key].mode,
        });
      }
      return result;
    }
  }

  /**
   * An emptyDir volume is first created when a Pod is assigned to a Node, and
   * exists as long as that Pod is running on that node. As the name says, it is
   * initially empty. Containers in the Pod can all read and write the same
   * files in the emptyDir volume, though that volume can be mounted at the same
   * or different paths in each Container. When a Pod is removed from a node for
   * any reason, the data in the emptyDir is deleted forever.
   *
   * @see http://kubernetes.io/docs/user-guide/volumes#emptydir
   *
   * @param options - Additional options.
   */
  public static fromEmptyDir(name: string, options: EmptyDirVolumeOptions = { }): Volume {
    return new Volume(name, {
      emptyDir: {
        medium: options.medium,
        sizeLimit: options.sizeLimit
          ? `${options.sizeLimit.toMebibytes()}Mi`
          : undefined,
      },
    });
  }

  protected constructor(public readonly name: string, private readonly config: any) {

  }

  /**
   * @internal
   */
  public _toKube(): k8s.Volume {
    return {
      name: this.name,
      ...this.config,
    };
  }
}

/**
 * Options for the ConfigMap-based volume.
 */
export interface ConfigMapVolumeOptions {
  /**
   * The volume name.
   *
   * @default - auto-generated
   */
  readonly name?: string;

  /**
   * Mode bits to use on created files by default. Must be a value between 0 and
   * 0777. Defaults to 0644. Directories within the path are not affected by
   * this setting. This might be in conflict with other options that affect the
   * file mode, like fsGroup, and the result can be other mode bits set.
   *
   * @default 0644. Directories within the path are not affected by this
   * setting. This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set.
   */
  readonly defaultMode?: number;

  /**
   * Specify whether the ConfigMap or its keys must be defined.
   * @default - undocumented
   */
  readonly optional?: boolean;

  /**
   * If unspecified, each key-value pair in the Data field of the referenced
   * ConfigMap will be projected into the volume as a file whose name is the key
   * and content is the value. If specified, the listed keys will be projected
   * into the specified paths, and unlisted keys will not be present. If a key
   * is specified which is not present in the ConfigMap, the volume setup will
   * error unless it is marked optional. Paths must be relative and may not
   * contain the '..' path or start with '..'.
   *
   * @default - no mapping
   */
  readonly items?: { [key: string]: PathMapping };
}

/**
 * Maps a string key to a path within a volume.
 */
export interface PathMapping {
  /**
   * The relative path of the file to map the key to. May not be an absolute
   * path. May not contain the path element '..'. May not start with the string
   * '..'.
   */
  readonly path: string;

  /**
   * Optional: mode bits to use on this file, must be a value between 0 and
   * 0777. If not specified, the volume defaultMode will be used. This might be
   * in conflict with other options that affect the file mode, like fsGroup, and
   * the result can be other mode bits set.
   */
  readonly mode?: number;
}

/**
 * Options for volumes populated with an empty directory.
 */
export interface EmptyDirVolumeOptions {
  /**
   * By default, emptyDir volumes are stored on whatever medium is backing the
   * node - that might be disk or SSD or network storage, depending on your
   * environment. However, you can set the emptyDir.medium field to
   * `EmptyDirMedium.MEMORY` to tell Kubernetes to mount a tmpfs (RAM-backed
   * filesystem) for you instead. While tmpfs is very fast, be aware that unlike
   * disks, tmpfs is cleared on node reboot and any files you write will count
   * against your Container's memory limit.
   *
   * @default EmptyDirMedium.DEFAULT
   */
  readonly medium?: EmptyDirMedium;

  /**
   * Total amount of local storage required for this EmptyDir volume. The size
   * limit is also applicable for memory medium. The maximum usage on memory
   * medium EmptyDir would be the minimum value between the SizeLimit specified
   * here and the sum of memory limits of all containers in a pod.
   *
   * @default - limit is undefined
   */
  readonly sizeLimit?: Size;
}

/**
 * The medium on which to store the volume.
 */
export enum EmptyDirMedium {
  /**
   * The default volume of the backing node.
   */
  DEFAULT = '',

  /**
   * Mount a tmpfs (RAM-backed filesystem) for you instead. While tmpfs is very
   * fast, be aware that unlike disks, tmpfs is cleared on node reboot and any
   * files you write will count against your Container's memory limit.
   */
  MEMORY = 'Memory'
}
