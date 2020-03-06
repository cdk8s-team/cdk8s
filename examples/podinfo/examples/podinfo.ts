import { Deployment, ImagePullPolicy, IContainer } from "../lib";
import { Container } from '../imports/k8s'

export interface PodinfoOptions {
  /**
   * Container name.
   * 
   * @default "podinfo"
   */
  readonly name?: string;
  /**
   * Image repository
   *
   * @default stefanprodan/podinfo
   */
  readonly imageRepository?: string;

  /**
   * Image pull policy
   *
   * @default ImagePullPolicy.IF_NOT_PRESENT
   */
  readonly imagePullPolicy?: ImagePullPolicy;

  /**
   * @default <VERSION>
   */
  readonly imageTag?: string;

  /**
   * @default info
   */
  readonly logLevel?: string;

  /**
   * echo backend URL
   */
  readonly backend?: string;

  /**
   * UI greetings message
   */
  readonly message?: string;

  /**
   * random HTTP response delays between 0 and 5 seconds
   *
   * @default false
   */
  readonly faultDelay?: boolean;

  /**
   * 1/3 chances of a random HTTP response error
   */
  readonly faultError?: boolean;

  /**
   * container HTTP port
   * @default 9898
   */
  readonly httpPort?: number;
  readonly metricsPort?: number;
  readonly grpcPort?: number;
  readonly grpcServiceName?: string;
}

export class PodinfoContainer implements IContainer {
  public constructor(private readonly options: PodinfoOptions) {

  }

  public get spec(): Container {
    const options = this.options;
    const imageRepository = options.imageRepository || 'stefanprodan/podinfo';
    const imageTag = options.imageTag || '3.0.0';
    const httpPort = options.httpPort || 9898;
    const imagePullPolicy = options.imagePullPolicy || ImagePullPolicy.IF_NOT_PRESENT;

    return {
      name: options.name || 'podinfo',
      image: `${imageRepository}:${imageTag}`,
      imagePullPolicy: imagePullPolicy,
      command: this.renderCommand(httpPort),
      env: [
        ...!options.message ? [] : [ { name: 'PODINFO_UI_MESSAGE', value: options.message } ],
        ...!options.backend ? [] : [ { name: 'PODINFO_BACKEND_URL', value: options.backend } ]
      ],
      ports: [
        { name: 'http', containerPort: httpPort },
        ...!options.metricsPort ? [] : [ { name: 'http-metrics', containerPort: options.metricsPort, protocol: 'TCP' } ],
        ...!options.grpcPort ? [] : [ { name: 'grpc', containerPort: options.grpcPort, protocol: 'TCP' } ]
      ],
      livenessProbe: {
        exec: {
          command: ['podcli', 'check', 'http', `localhost:${httpPort}/healthz`]
        },
        initialDelaySeconds: 1,
        timeoutSeconds: 5,
      },
      readinessProbe: {
        exec: {
          command: ['podcli', 'check', 'http', `localhost:${httpPort}/readyz`]
        },
        initialDelaySeconds: 1,
        timeoutSeconds: 5
      },
      volumeMounts: [
        { name: 'data', mountPath: '/data' }
      ],
    };
  }

  public bind(deployment: Deployment) {
    deployment.addAnnotation('prometheus.io/scrape', 'true');
    deployment.addAnnotation('prometheus.io/port', this.options.httpPort);
  }

  private renderCommand(httpPort: number) {
    const options = this.options;
    const command = new Array<string>();
    command.push('./podinfo');
    command.push(`--port=${httpPort}`);

    if (options.metricsPort) {
      command.push(`--port-metrics=${options.metricsPort}`);
    }

    if (options.grpcPort) {
      command.push(`--grpc-port=${options.grpcPort}`);
    }

    if (options.grpcServiceName) {
      command.push(`--grpc-service-name=${options.grpcServiceName}`);
    }

    command.push(`--level=${options.logLevel || 'info'}`);

    if (options.faultDelay) {
      command.push(`--random-delay=${options.faultDelay}`);
    }

    if (options.faultError) {
      command.push(`--random-error=${options.faultError}`);
    }

    return command;
  }  
}