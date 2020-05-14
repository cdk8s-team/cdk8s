package jenkins;

/**
 * Container defines Kubernetes container attributes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.597Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainers")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainers.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainers extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docker image name.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/containers/images
     */
    @org.jetbrains.annotations.NotNull java.lang.String getImage();

    /**
     * Image pull policy.
     * <p>
     * One of Always, Never, IfNotPresent. Defaults to Always.
     * <p>
     * Default: Always.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getImagePullPolicy();

    /**
     * Name of the container specified as a DNS_LABEL.
     * <p>
     * Each container in a pod must have a unique name (DNS_LABEL).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Compute Resources required by this container.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    @org.jetbrains.annotations.NotNull jenkins.JenkinsSpecMasterContainersResources getResources();

    /**
     * Arguments to the entrypoint.
     * <p>
     * The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getArgs() {
        return null;
    }

    /**
     * Entrypoint array.
     * <p>
     * Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCommand() {
        return null;
    }

    /**
     * List of environment variables to set in the container.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainersEnv> getEnv() {
        return null;
    }

    /**
     * List of sources to populate environment variables in the container.
     * <p>
     * The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> getEnvFrom() {
        return null;
    }

    /**
     * Actions that the management system should take in response to container lifecycle events.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLifecycle getLifecycle() {
        return null;
    }

    /**
     * Periodic probe of container liveness.
     * <p>
     * Container will be restarted if the probe fails.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersLivenessProbe getLivenessProbe() {
        return null;
    }

    /**
     * List of ports to expose from the container.
     * <p>
     * Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainersPorts> getPorts() {
        return null;
    }

    /**
     * Periodic probe of container service readiness.
     * <p>
     * Container will be removed from service endpoints if the probe fails.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersReadinessProbe getReadinessProbe() {
        return null;
    }

    /**
     * Security options the pod should run with.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersSecurityContext getSecurityContext() {
        return null;
    }

    /**
     * Pod volumes to mount into the container's filesystem.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> getVolumeMounts() {
        return null;
    }

    /**
     * Container's working directory.
     * <p>
     * If not specified, the container runtime's default will be used, which might be configured in the container image.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWorkingDir() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainers}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainers}
     */
    public static final class Builder {
        private java.lang.String image;
        private java.lang.String imagePullPolicy;
        private java.lang.String name;
        private jenkins.JenkinsSpecMasterContainersResources resources;
        private java.util.List<java.lang.String> args;
        private java.util.List<java.lang.String> command;
        private java.util.List<jenkins.JenkinsSpecMasterContainersEnv> env;
        private java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> envFrom;
        private jenkins.JenkinsSpecMasterContainersLifecycle lifecycle;
        private jenkins.JenkinsSpecMasterContainersLivenessProbe livenessProbe;
        private java.util.List<jenkins.JenkinsSpecMasterContainersPorts> ports;
        private jenkins.JenkinsSpecMasterContainersReadinessProbe readinessProbe;
        private jenkins.JenkinsSpecMasterContainersSecurityContext securityContext;
        private java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> volumeMounts;
        private java.lang.String workingDir;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getImage}
         * @param image Docker image name. This parameter is required.
         *              More info: https://kubernetes.io/docs/concepts/containers/images
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getImagePullPolicy}
         * @param imagePullPolicy Image pull policy. This parameter is required.
         *                        One of Always, Never, IfNotPresent. Defaults to Always.
         * @return {@code this}
         */
        public Builder imagePullPolicy(java.lang.String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getName}
         * @param name Name of the container specified as a DNS_LABEL. This parameter is required.
         *             Each container in a pod must have a unique name (DNS_LABEL).
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getResources}
         * @param resources Compute Resources required by this container. This parameter is required.
         *                  More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         * @return {@code this}
         */
        public Builder resources(jenkins.JenkinsSpecMasterContainersResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getArgs}
         * @param args Arguments to the entrypoint.
         *             The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * @return {@code this}
         */
        public Builder args(java.util.List<java.lang.String> args) {
            this.args = args;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getCommand}
         * @param command Entrypoint array.
         *                Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * @return {@code this}
         */
        public Builder command(java.util.List<java.lang.String> command) {
            this.command = command;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getEnv}
         * @param env List of environment variables to set in the container.
         * @return {@code this}
         */
        public Builder env(java.util.List<jenkins.JenkinsSpecMasterContainersEnv> env) {
            this.env = env;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getEnvFrom}
         * @param envFrom List of sources to populate environment variables in the container.
         *                The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence.
         * @return {@code this}
         */
        public Builder envFrom(java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> envFrom) {
            this.envFrom = envFrom;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getLifecycle}
         * @param lifecycle Actions that the management system should take in response to container lifecycle events.
         * @return {@code this}
         */
        public Builder lifecycle(jenkins.JenkinsSpecMasterContainersLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getLivenessProbe}
         * @param livenessProbe Periodic probe of container liveness.
         *                      Container will be restarted if the probe fails.
         * @return {@code this}
         */
        public Builder livenessProbe(jenkins.JenkinsSpecMasterContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getPorts}
         * @param ports List of ports to expose from the container.
         *              Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default "0.0.0.0" address inside a container will be accessible from the network.
         * @return {@code this}
         */
        public Builder ports(java.util.List<jenkins.JenkinsSpecMasterContainersPorts> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getReadinessProbe}
         * @param readinessProbe Periodic probe of container service readiness.
         *                       Container will be removed from service endpoints if the probe fails.
         * @return {@code this}
         */
        public Builder readinessProbe(jenkins.JenkinsSpecMasterContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getSecurityContext}
         * @param securityContext Security options the pod should run with.
         *                        More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
         * @return {@code this}
         */
        public Builder securityContext(jenkins.JenkinsSpecMasterContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getVolumeMounts}
         * @param volumeMounts Pod volumes to mount into the container's filesystem.
         * @return {@code this}
         */
        public Builder volumeMounts(java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainers#getWorkingDir}
         * @param workingDir Container's working directory.
         *                   If not specified, the container runtime's default will be used, which might be configured in the container image.
         * @return {@code this}
         */
        public Builder workingDir(java.lang.String workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainers}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainers build() {
            return new Jsii$Proxy(image, imagePullPolicy, name, resources, args, command, env, envFrom, lifecycle, livenessProbe, ports, readinessProbe, securityContext, volumeMounts, workingDir);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainers}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainers {
        private final java.lang.String image;
        private final java.lang.String imagePullPolicy;
        private final java.lang.String name;
        private final jenkins.JenkinsSpecMasterContainersResources resources;
        private final java.util.List<java.lang.String> args;
        private final java.util.List<java.lang.String> command;
        private final java.util.List<jenkins.JenkinsSpecMasterContainersEnv> env;
        private final java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> envFrom;
        private final jenkins.JenkinsSpecMasterContainersLifecycle lifecycle;
        private final jenkins.JenkinsSpecMasterContainersLivenessProbe livenessProbe;
        private final java.util.List<jenkins.JenkinsSpecMasterContainersPorts> ports;
        private final jenkins.JenkinsSpecMasterContainersReadinessProbe readinessProbe;
        private final jenkins.JenkinsSpecMasterContainersSecurityContext securityContext;
        private final java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> volumeMounts;
        private final java.lang.String workingDir;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.image = this.jsiiGet("image", java.lang.String.class);
            this.imagePullPolicy = this.jsiiGet("imagePullPolicy", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.resources = this.jsiiGet("resources", jenkins.JenkinsSpecMasterContainersResources.class);
            this.args = this.jsiiGet("args", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.command = this.jsiiGet("command", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.env = this.jsiiGet("env", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainersEnv.class)));
            this.envFrom = this.jsiiGet("envFrom", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainersEnvFrom.class)));
            this.lifecycle = this.jsiiGet("lifecycle", jenkins.JenkinsSpecMasterContainersLifecycle.class);
            this.livenessProbe = this.jsiiGet("livenessProbe", jenkins.JenkinsSpecMasterContainersLivenessProbe.class);
            this.ports = this.jsiiGet("ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainersPorts.class)));
            this.readinessProbe = this.jsiiGet("readinessProbe", jenkins.JenkinsSpecMasterContainersReadinessProbe.class);
            this.securityContext = this.jsiiGet("securityContext", jenkins.JenkinsSpecMasterContainersSecurityContext.class);
            this.volumeMounts = this.jsiiGet("volumeMounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainersVolumeMounts.class)));
            this.workingDir = this.jsiiGet("workingDir", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String image, final java.lang.String imagePullPolicy, final java.lang.String name, final jenkins.JenkinsSpecMasterContainersResources resources, final java.util.List<java.lang.String> args, final java.util.List<java.lang.String> command, final java.util.List<jenkins.JenkinsSpecMasterContainersEnv> env, final java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> envFrom, final jenkins.JenkinsSpecMasterContainersLifecycle lifecycle, final jenkins.JenkinsSpecMasterContainersLivenessProbe livenessProbe, final java.util.List<jenkins.JenkinsSpecMasterContainersPorts> ports, final jenkins.JenkinsSpecMasterContainersReadinessProbe readinessProbe, final jenkins.JenkinsSpecMasterContainersSecurityContext securityContext, final java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> volumeMounts, final java.lang.String workingDir) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.image = java.util.Objects.requireNonNull(image, "image is required");
            this.imagePullPolicy = java.util.Objects.requireNonNull(imagePullPolicy, "imagePullPolicy is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.resources = java.util.Objects.requireNonNull(resources, "resources is required");
            this.args = args;
            this.command = command;
            this.env = env;
            this.envFrom = envFrom;
            this.lifecycle = lifecycle;
            this.livenessProbe = livenessProbe;
            this.ports = ports;
            this.readinessProbe = readinessProbe;
            this.securityContext = securityContext;
            this.volumeMounts = volumeMounts;
            this.workingDir = workingDir;
        }

        @Override
        public java.lang.String getImage() {
            return this.image;
        }

        @Override
        public java.lang.String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersResources getResources() {
            return this.resources;
        }

        @Override
        public java.util.List<java.lang.String> getArgs() {
            return this.args;
        }

        @Override
        public java.util.List<java.lang.String> getCommand() {
            return this.command;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainersEnv> getEnv() {
            return this.env;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainersEnvFrom> getEnvFrom() {
            return this.envFrom;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainersPorts> getPorts() {
            return this.ports;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        @Override
        public java.lang.String getWorkingDir() {
            return this.workingDir;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("image", om.valueToTree(this.getImage()));
            data.set("imagePullPolicy", om.valueToTree(this.getImagePullPolicy()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("resources", om.valueToTree(this.getResources()));
            if (this.getArgs() != null) {
                data.set("args", om.valueToTree(this.getArgs()));
            }
            if (this.getCommand() != null) {
                data.set("command", om.valueToTree(this.getCommand()));
            }
            if (this.getEnv() != null) {
                data.set("env", om.valueToTree(this.getEnv()));
            }
            if (this.getEnvFrom() != null) {
                data.set("envFrom", om.valueToTree(this.getEnvFrom()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getLivenessProbe() != null) {
                data.set("livenessProbe", om.valueToTree(this.getLivenessProbe()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }
            if (this.getReadinessProbe() != null) {
                data.set("readinessProbe", om.valueToTree(this.getReadinessProbe()));
            }
            if (this.getSecurityContext() != null) {
                data.set("securityContext", om.valueToTree(this.getSecurityContext()));
            }
            if (this.getVolumeMounts() != null) {
                data.set("volumeMounts", om.valueToTree(this.getVolumeMounts()));
            }
            if (this.getWorkingDir() != null) {
                data.set("workingDir", om.valueToTree(this.getWorkingDir()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainers"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainers.Jsii$Proxy that = (JenkinsSpecMasterContainers.Jsii$Proxy) o;

            if (!image.equals(that.image)) return false;
            if (!imagePullPolicy.equals(that.imagePullPolicy)) return false;
            if (!name.equals(that.name)) return false;
            if (!resources.equals(that.resources)) return false;
            if (this.args != null ? !this.args.equals(that.args) : that.args != null) return false;
            if (this.command != null ? !this.command.equals(that.command) : that.command != null) return false;
            if (this.env != null ? !this.env.equals(that.env) : that.env != null) return false;
            if (this.envFrom != null ? !this.envFrom.equals(that.envFrom) : that.envFrom != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.livenessProbe != null ? !this.livenessProbe.equals(that.livenessProbe) : that.livenessProbe != null) return false;
            if (this.ports != null ? !this.ports.equals(that.ports) : that.ports != null) return false;
            if (this.readinessProbe != null ? !this.readinessProbe.equals(that.readinessProbe) : that.readinessProbe != null) return false;
            if (this.securityContext != null ? !this.securityContext.equals(that.securityContext) : that.securityContext != null) return false;
            if (this.volumeMounts != null ? !this.volumeMounts.equals(that.volumeMounts) : that.volumeMounts != null) return false;
            return this.workingDir != null ? this.workingDir.equals(that.workingDir) : that.workingDir == null;
        }

        @Override
        public int hashCode() {
            int result = this.image.hashCode();
            result = 31 * result + (this.imagePullPolicy.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.resources.hashCode());
            result = 31 * result + (this.args != null ? this.args.hashCode() : 0);
            result = 31 * result + (this.command != null ? this.command.hashCode() : 0);
            result = 31 * result + (this.env != null ? this.env.hashCode() : 0);
            result = 31 * result + (this.envFrom != null ? this.envFrom.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.livenessProbe != null ? this.livenessProbe.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            result = 31 * result + (this.readinessProbe != null ? this.readinessProbe.hashCode() : 0);
            result = 31 * result + (this.securityContext != null ? this.securityContext.hashCode() : 0);
            result = 31 * result + (this.volumeMounts != null ? this.volumeMounts.hashCode() : 0);
            result = 31 * result + (this.workingDir != null ? this.workingDir.hashCode() : 0);
            return result;
        }
    }
}
