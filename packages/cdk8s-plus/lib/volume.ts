import { IConfigMap } from './config-map';
import * as path from 'path';
import * as crypto from 'crypto';

export interface ConfigMapVolumeSource {

  readonly name: string;

}

export interface HostPathVolumeSource {

  /**
   * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   *
   * @schema io.k8s.api.core.v1.HostPathVolumeSource#path
   */
  readonly path: string;

  /**
   * Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   *
   * @default More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   * @schema io.k8s.api.core.v1.HostPathVolumeSource#type
   */
  readonly type?: string;

}

export class Volume {

  private constructor(public readonly name: string,
    public readonly configMap?: ConfigMapVolumeSource,
    public readonly hostPath?: HostPathVolumeSource) {}

  public static fromConfigMap(configMap: IConfigMap): Volume {
    return new Volume(`${configMap.name}-volume`, {
      name: configMap.name,
    });
  }

  public static fromDirectory(directory: string) {

    // use a hash to avoid basename collisions
    var hash = crypto.createHash('md5').update(directory).digest('hex').substr(0, 6);

    return new Volume(`${path.basename(directory)}-${hash}-volume`, undefined, {
      path: directory,
      type: 'Directory',
    })
  }

}
