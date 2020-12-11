import { Protocol } from './common';
import * as k8s from './imports/k8s';

export interface ContainerPortOptions {
  /**
   * What host IP to bind the external port to.
   */
  readonly hostIP?: string;

  /**
   * Number of port to expose on the host. This must be a valid port number, 0 < x < 65536.
   */
  readonly hostPort?: number;

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name.
   */
  readonly name?: string;

  /**
   * Protocol for port. Must be UDP, TCP, or SCTP.
   */
  readonly protocol?: Protocol;
}

export interface ContainerPortProps extends ContainerPortOptions {
  /**
   * Number of port to expose on the pod's IP address.
   */
  readonly port: number;
}

export class ContainerPort {
  /**
   * Number of port to expose on the pod's IP address.
   */
  public readonly port: number;

  /**
   * What host IP to bind the external port to.
   */
  public readonly hostIP?: string;

  /**
   * Number of port to expose on the host. This must be a valid port number, 0 < x < 65536.
   */
  public readonly hostPort?: number;

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name.
   */
  public readonly name?: string;

  /**
   * Protocol for port. Must be UDP, TCP, or SCTP.
   */
  public readonly protocol?: Protocol;

  public constructor(props: ContainerPortProps) {
    if (props.port <= 0 || props.port >= 65536) {
      throw new Error(`containerPort should be 0 < x < 65536. Received: ${props.port}`);
    }
    if (props.hostPort) {
      if (props.hostPort <= 0 || props.hostPort >= 65536) {
        throw new Error(`hostPort should be 0 < x < 65536. Received: ${props.hostPort}`);
      }
    }

    this.port = props.port;
    this.hostIP = props.hostIP;
    this.hostPort = props.hostPort;
    this.name = props.name;
    this.protocol = props.protocol;
  }

  /**
   * Get name or containerPort
   */
  public nameOrPort(): string | number {
    return this.name ?? this.port;
  }

  /**
   * @internal
   */
  _toKube(): k8s.ContainerPort {
    return {
      containerPort: this.port,
      name: this.name,
      hostIP: this.hostIP,
      hostPort: this.hostPort,
      protocol: this.protocol,
    };
  }
}