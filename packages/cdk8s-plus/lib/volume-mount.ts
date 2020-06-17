import { Volume } from './volume'

/**
 * Properties to configure a volume mount.
 */
export interface VolumeMountProps {

  /**
   * The volume.
   */
  readonly volume: Volume;

  /**
   * The mount path.
   */
  readonly path: string;

}

/**
 * VolumeMount describes a mounting of a Volume within a container.
 *
 */
export class VolumeMount {

  /**
   * The volume.
   */
  public readonly volume: Volume;

  /**
   * The mount path.
   */
  public readonly path: string;

  constructor(props: VolumeMountProps) {
    this.volume = props.volume;
    this.path = props.path;
  }

}
