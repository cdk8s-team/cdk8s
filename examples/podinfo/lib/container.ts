import { Deployment } from "./deployment";

export abstract class Container {
  public abstract bind(deployment: Deployment): ContainerSpec;
}

export interface ContainerSpec {
  /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  args?: (string | null)[];
  /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   */
  command?: (string | null)[];
  /**
   * List of environment variables to set in the container. Cannot be updated.
   */
  env?: {
    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     */
    name: string;
    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     */
    value?: string | null;
    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     */
    valueFrom?: {
      /**
       * Selects a key from a ConfigMap.
       */
      configMapKeyRef?: {
        /**
         * The key to select.
         */
        key: string;
        /**
         * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         */
        name?: string | null;
        /**
         * Specify whether the ConfigMap or it's key must be defined
         */
        optional?: boolean | null;
        [k: string]: any;
      };
      /**
       * ObjectFieldSelector selects an APIVersioned field of an object.
       */
      fieldRef?: {
        /**
         * Version of the schema the FieldPath is written in terms of, defaults to "v1".
         */
        apiVersion?: string | null;
        /**
         * Path of the field to select in the specified API version.
         */
        fieldPath: string;
        [k: string]: any;
      };
      /**
       * ResourceFieldSelector represents container resources (cpu, memory) and their output format
       */
      resourceFieldRef?: {
        /**
         * Container name: required for volumes, optional for env vars
         */
        containerName?: string | null;
        divisor?: (string | null) | (number | null);
        /**
         * Required: resource to select
         */
        resource: string;
        [k: string]: any;
      };
      /**
       * SecretKeySelector selects a key of a Secret.
       */
      secretKeyRef?: {
        /**
         * The key of the secret to select from.  Must be a valid secret key.
         */
        key: string;
        /**
         * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
         */
        name?: string | null;
        /**
         * Specify whether the Secret or it's key must be defined
         */
        optional?: boolean | null;
        [k: string]: any;
      };
      [k: string]: any;
    };
    [k: string]: any;
  }[];
  /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   */
  envFrom?: {
    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     *
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     */
    configMapRef?: {
      /**
       * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
       */
      name?: string | null;
      /**
       * Specify whether the ConfigMap must be defined
       */
      optional?: boolean | null;
      [k: string]: any;
    };
    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     */
    prefix?: string | null;
    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     *
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     */
    secretRef?: {
      /**
       * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
       */
      name?: string | null;
      /**
       * Specify whether the Secret must be defined
       */
      optional?: boolean | null;
      [k: string]: any;
    };
    [k: string]: any;
  }[];
  /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   */
  image?: string | null;
  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   */
  imagePullPolicy?: string | null;
  /**
   * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
   */
  lifecycle?: {
    /**
     * Handler defines a specific action that should be taken
     */
    postStart?: {
      /**
       * ExecAction describes a "run in container" action.
       */
      exec?: {
        /**
         * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
         */
        command?: (string | null)[];
        [k: string]: any;
      };
      /**
       * HTTPGetAction describes an action based on HTTP Get requests.
       */
      httpGet?: {
        /**
         * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
         */
        host?: string | null;
        /**
         * Custom headers to set in the request. HTTP allows repeated headers.
         */
        httpHeaders?: {
          /**
           * The header field name
           */
          name: string;
          /**
           * The header field value
           */
          value: string;
          [k: string]: any;
        }[];
        /**
         * Path to access on the HTTP server.
         */
        path?: string | null;
        port: (string | null) | (number | null);
        /**
         * Scheme to use for connecting to the host. Defaults to HTTP.
         */
        scheme?: string | null;
        [k: string]: any;
      };
      /**
       * TCPSocketAction describes an action based on opening a socket
       */
      tcpSocket?: {
        /**
         * Optional: Host name to connect to, defaults to the pod IP.
         */
        host?: string | null;
        port: (string | null) | (number | null);
        [k: string]: any;
      };
      [k: string]: any;
    };
    /**
     * Handler defines a specific action that should be taken
     */
    preStop?: {
      /**
       * ExecAction describes a "run in container" action.
       */
      exec?: {
        /**
         * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
         */
        command?: (string | null)[];
        [k: string]: any;
      };
      /**
       * HTTPGetAction describes an action based on HTTP Get requests.
       */
      httpGet?: {
        /**
         * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
         */
        host?: string | null;
        /**
         * Custom headers to set in the request. HTTP allows repeated headers.
         */
        httpHeaders?: {
          /**
           * The header field name
           */
          name: string;
          /**
           * The header field value
           */
          value: string;
          [k: string]: any;
        }[];
        /**
         * Path to access on the HTTP server.
         */
        path?: string | null;
        port: (string | null) | (number | null);
        /**
         * Scheme to use for connecting to the host. Defaults to HTTP.
         */
        scheme?: string | null;
        [k: string]: any;
      };
      /**
       * TCPSocketAction describes an action based on opening a socket
       */
      tcpSocket?: {
        /**
         * Optional: Host name to connect to, defaults to the pod IP.
         */
        host?: string | null;
        port: (string | null) | (number | null);
        [k: string]: any;
      };
      [k: string]: any;
    };
    [k: string]: any;
  };
  /**
   * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
   */
  livenessProbe?: {
    /**
     * ExecAction describes a "run in container" action.
     */
    exec?: {
      /**
       * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
       */
      command?: (string | null)[];
      [k: string]: any;
    };
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     */
    failureThreshold?: number | null;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     */
    httpGet?: {
      /**
       * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
       */
      host?: string | null;
      /**
       * Custom headers to set in the request. HTTP allows repeated headers.
       */
      httpHeaders?: {
        /**
         * The header field name
         */
        name: string;
        /**
         * The header field value
         */
        value: string;
        [k: string]: any;
      }[];
      /**
       * Path to access on the HTTP server.
       */
      path?: string | null;
      port: (string | null) | (number | null);
      /**
       * Scheme to use for connecting to the host. Defaults to HTTP.
       */
      scheme?: string | null;
      [k: string]: any;
    };
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    initialDelaySeconds?: number | null;
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     */
    periodSeconds?: number | null;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     */
    successThreshold?: number | null;
    /**
     * TCPSocketAction describes an action based on opening a socket
     */
    tcpSocket?: {
      /**
       * Optional: Host name to connect to, defaults to the pod IP.
       */
      host?: string | null;
      port: (string | null) | (number | null);
      [k: string]: any;
    };
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    timeoutSeconds?: number | null;
    [k: string]: any;
  };
  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   */
  name: string;
  /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network. Cannot be updated.
   */
  ports?: {
    /**
     * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
     */
    containerPort: number;
    /**
     * What host IP to bind the external port to.
     */
    hostIP?: string | null;
    /**
     * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     */
    hostPort?: number | null;
    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     */
    name?: string | null;
    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
     */
    protocol?: string | null;
    [k: string]: any;
  }[];
  /**
   * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
   */
  readinessProbe?: {
    /**
     * ExecAction describes a "run in container" action.
     */
    exec?: {
      /**
       * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
       */
      command?: (string | null)[];
      [k: string]: any;
    };
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     */
    failureThreshold?: number | null;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     */
    httpGet?: {
      /**
       * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
       */
      host?: string | null;
      /**
       * Custom headers to set in the request. HTTP allows repeated headers.
       */
      httpHeaders?: {
        /**
         * The header field name
         */
        name: string;
        /**
         * The header field value
         */
        value: string;
        [k: string]: any;
      }[];
      /**
       * Path to access on the HTTP server.
       */
      path?: string | null;
      port: (string | null) | (number | null);
      /**
       * Scheme to use for connecting to the host. Defaults to HTTP.
       */
      scheme?: string | null;
      [k: string]: any;
    };
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    initialDelaySeconds?: number | null;
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     */
    periodSeconds?: number | null;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     */
    successThreshold?: number | null;
    /**
     * TCPSocketAction describes an action based on opening a socket
     */
    tcpSocket?: {
      /**
       * Optional: Host name to connect to, defaults to the pod IP.
       */
      host?: string | null;
      port: (string | null) | (number | null);
      [k: string]: any;
    };
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    timeoutSeconds?: number | null;
    [k: string]: any;
  };
  /**
   * ResourceRequirements describes the compute resource requirements.
   */
  resources?: {
    /**
     * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    limits?: {
      [k: string]: any;
    } | null;
    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    requests?: {
      [k: string]: any;
    } | null;
    [k: string]: any;
  };
  /**
   * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
   */
  securityContext?: {
    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
     */
    allowPrivilegeEscalation?: boolean | null;
    /**
     * Adds and removes POSIX capabilities from running containers.
     */
    capabilities?: {
      /**
       * Added capabilities
       */
      add?: (string | null)[];
      /**
       * Removed capabilities
       */
      drop?: (string | null)[];
      [k: string]: any;
    };
    /**
     * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
     */
    privileged?: boolean | null;
    /**
     * procMount denotes the type of proc mount to use for the containers. The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
     */
    procMount?: string | null;
    /**
     * Whether this container has a read-only root filesystem. Default is false.
     */
    readOnlyRootFilesystem?: boolean | null;
    /**
     * The GID to run the entrypoint of the container process. Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    runAsGroup?: number | null;
    /**
     * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    runAsNonRoot?: boolean | null;
    /**
     * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    runAsUser?: number | null;
    /**
     * SELinuxOptions are the labels to be applied to the container
     */
    seLinuxOptions?: {
      /**
       * Level is SELinux level label that applies to the container.
       */
      level?: string | null;
      /**
       * Role is a SELinux role label that applies to the container.
       */
      role?: string | null;
      /**
       * Type is a SELinux type label that applies to the container.
       */
      type?: string | null;
      /**
       * User is a SELinux user label that applies to the container.
       */
      user?: string | null;
      [k: string]: any;
    };
    [k: string]: any;
  };
  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   */
  stdin?: boolean | null;
  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   */
  stdinOnce?: boolean | null;
  /**
   * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   */
  terminationMessagePath?: string | null;
  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   */
  terminationMessagePolicy?: string | null;
  /**
   * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
   */
  tty?: boolean | null;
  /**
   * volumeDevices is the list of block devices to be used by the container. This is a beta feature.
   */
  volumeDevices?: {
    /**
     * devicePath is the path inside of the container that the device will be mapped to.
     */
    devicePath: string;
    /**
     * name must match the name of a persistentVolumeClaim in the pod
     */
    name: string;
    [k: string]: any;
  }[];
  /**
   * Pod volumes to mount into the container's filesystem. Cannot be updated.
   */
  volumeMounts?: {
    /**
     * Path within the container at which the volume should be mounted.  Must not contain ':'.
     */
    mountPath: string;
    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
     */
    mountPropagation?: string | null;
    /**
     * This must match the Name of a Volume.
     */
    name: string;
    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     */
    readOnly?: boolean | null;
    /**
     * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     */
    subPath?: string | null;
    [k: string]: any;
  }[];
  
  /**
   * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
   */
  workingDir?: string | null;
}