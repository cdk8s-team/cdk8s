import { Volume } from './volume'

export interface VolumeMountProps {

  readonly volume: Volume;

  readonly path: string;

}

export class VolumeMount {

  public readonly volume: Volume;
  public readonly path: string;

  constructor(props: VolumeMountProps) {
    this.volume = props.volume;
    this.path = props.path;
  }

}
