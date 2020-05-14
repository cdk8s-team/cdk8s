package jenkins;

/**
 * Security options the pod should run with.
 * <p>
 * More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.629Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersSecurityContext")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersSecurityContext.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersSecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
     * <p>
     * This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAllowPrivilegeEscalation() {
        return null;
    }

    /**
     * The capabilities to add/drop when running containers.
     * <p>
     * Defaults to the default set of capabilities granted by the container runtime.
     * <p>
     * Default: the default set of capabilities granted by the container runtime.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities getCapabilities() {
        return null;
    }

    /**
     * Run container in privileged mode.
     * <p>
     * Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPrivileged() {
        return null;
    }

    /**
     * procMount denotes the type of proc mount to use for the containers.
     * <p>
     * The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProcMount() {
        return null;
    }

    /**
     * Whether this container has a read-only root filesystem.
     * <p>
     * Default is false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnlyRootFilesystem() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * <p>
     * Default: user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsUser() {
        return null;
    }

    /**
     * The SELinux context to be applied to the container.
     * <p>
     * If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * The Windows specific settings applied to all containers.
     * <p>
     * If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions getWindowsOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersSecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersSecurityContext}
     */
    public static final class Builder {
        private java.lang.Boolean allowPrivilegeEscalation;
        private jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities capabilities;
        private java.lang.Boolean privileged;
        private java.lang.String procMount;
        private java.lang.Boolean readOnlyRootFilesystem;
        private java.lang.Number runAsGroup;
        private java.lang.Boolean runAsNonRoot;
        private java.lang.Number runAsUser;
        private jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions seLinuxOptions;
        private jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions windowsOptions;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getAllowPrivilegeEscalation}
         * @param allowPrivilegeEscalation AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process.
         *                                 This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
         * @return {@code this}
         */
        public Builder allowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getCapabilities}
         * @param capabilities The capabilities to add/drop when running containers.
         *                     Defaults to the default set of capabilities granted by the container runtime.
         * @return {@code this}
         */
        public Builder capabilities(jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getPrivileged}
         * @param privileged Run container in privileged mode.
         *                   Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
         * @return {@code this}
         */
        public Builder privileged(java.lang.Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getProcMount}
         * @param procMount procMount denotes the type of proc mount to use for the containers.
         *                  The default is DefaultProcMount which uses the container runtime defaults for readonly paths and masked paths. This requires the ProcMountType feature flag to be enabled.
         * @return {@code this}
         */
        public Builder procMount(java.lang.String procMount) {
            this.procMount = procMount;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getReadOnlyRootFilesystem}
         * @param readOnlyRootFilesystem Whether this container has a read-only root filesystem.
         *                               Default is false.
         * @return {@code this}
         */
        public Builder readOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.Number runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.Number runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions The SELinux context to be applied to the container.
         *                       If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder seLinuxOptions(jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersSecurityContext#getWindowsOptions}
         * @param windowsOptions The Windows specific settings applied to all containers.
         *                       If unspecified, the options from the PodSecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder windowsOptions(jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersSecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersSecurityContext build() {
            return new Jsii$Proxy(allowPrivilegeEscalation, capabilities, privileged, procMount, readOnlyRootFilesystem, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, windowsOptions);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersSecurityContext}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersSecurityContext {
        private final java.lang.Boolean allowPrivilegeEscalation;
        private final jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities capabilities;
        private final java.lang.Boolean privileged;
        private final java.lang.String procMount;
        private final java.lang.Boolean readOnlyRootFilesystem;
        private final java.lang.Number runAsGroup;
        private final java.lang.Boolean runAsNonRoot;
        private final java.lang.Number runAsUser;
        private final jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions seLinuxOptions;
        private final jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions windowsOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allowPrivilegeEscalation = this.jsiiGet("allowPrivilegeEscalation", java.lang.Boolean.class);
            this.capabilities = this.jsiiGet("capabilities", jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities.class);
            this.privileged = this.jsiiGet("privileged", java.lang.Boolean.class);
            this.procMount = this.jsiiGet("procMount", java.lang.String.class);
            this.readOnlyRootFilesystem = this.jsiiGet("readOnlyRootFilesystem", java.lang.Boolean.class);
            this.runAsGroup = this.jsiiGet("runAsGroup", java.lang.Number.class);
            this.runAsNonRoot = this.jsiiGet("runAsNonRoot", java.lang.Boolean.class);
            this.runAsUser = this.jsiiGet("runAsUser", java.lang.Number.class);
            this.seLinuxOptions = this.jsiiGet("seLinuxOptions", jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions.class);
            this.windowsOptions = this.jsiiGet("windowsOptions", jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Boolean allowPrivilegeEscalation, final jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities capabilities, final java.lang.Boolean privileged, final java.lang.String procMount, final java.lang.Boolean readOnlyRootFilesystem, final java.lang.Number runAsGroup, final java.lang.Boolean runAsNonRoot, final java.lang.Number runAsUser, final jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions seLinuxOptions, final jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions windowsOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            this.capabilities = capabilities;
            this.privileged = privileged;
            this.procMount = procMount;
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            this.runAsGroup = runAsGroup;
            this.runAsNonRoot = runAsNonRoot;
            this.runAsUser = runAsUser;
            this.seLinuxOptions = seLinuxOptions;
            this.windowsOptions = windowsOptions;
        }

        @Override
        public java.lang.Boolean getAllowPrivilegeEscalation() {
            return this.allowPrivilegeEscalation;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersSecurityContextCapabilities getCapabilities() {
            return this.capabilities;
        }

        @Override
        public java.lang.Boolean getPrivileged() {
            return this.privileged;
        }

        @Override
        public java.lang.String getProcMount() {
            return this.procMount;
        }

        @Override
        public java.lang.Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        @Override
        public java.lang.Number getRunAsGroup() {
            return this.runAsGroup;
        }

        @Override
        public java.lang.Boolean getRunAsNonRoot() {
            return this.runAsNonRoot;
        }

        @Override
        public java.lang.Number getRunAsUser() {
            return this.runAsUser;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersSecurityContextSeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        public jenkins.JenkinsSpecMasterContainersSecurityContextWindowsOptions getWindowsOptions() {
            return this.windowsOptions;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllowPrivilegeEscalation() != null) {
                data.set("allowPrivilegeEscalation", om.valueToTree(this.getAllowPrivilegeEscalation()));
            }
            if (this.getCapabilities() != null) {
                data.set("capabilities", om.valueToTree(this.getCapabilities()));
            }
            if (this.getPrivileged() != null) {
                data.set("privileged", om.valueToTree(this.getPrivileged()));
            }
            if (this.getProcMount() != null) {
                data.set("procMount", om.valueToTree(this.getProcMount()));
            }
            if (this.getReadOnlyRootFilesystem() != null) {
                data.set("readOnlyRootFilesystem", om.valueToTree(this.getReadOnlyRootFilesystem()));
            }
            if (this.getRunAsGroup() != null) {
                data.set("runAsGroup", om.valueToTree(this.getRunAsGroup()));
            }
            if (this.getRunAsNonRoot() != null) {
                data.set("runAsNonRoot", om.valueToTree(this.getRunAsNonRoot()));
            }
            if (this.getRunAsUser() != null) {
                data.set("runAsUser", om.valueToTree(this.getRunAsUser()));
            }
            if (this.getSeLinuxOptions() != null) {
                data.set("seLinuxOptions", om.valueToTree(this.getSeLinuxOptions()));
            }
            if (this.getWindowsOptions() != null) {
                data.set("windowsOptions", om.valueToTree(this.getWindowsOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersSecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersSecurityContext.Jsii$Proxy that = (JenkinsSpecMasterContainersSecurityContext.Jsii$Proxy) o;

            if (this.allowPrivilegeEscalation != null ? !this.allowPrivilegeEscalation.equals(that.allowPrivilegeEscalation) : that.allowPrivilegeEscalation != null) return false;
            if (this.capabilities != null ? !this.capabilities.equals(that.capabilities) : that.capabilities != null) return false;
            if (this.privileged != null ? !this.privileged.equals(that.privileged) : that.privileged != null) return false;
            if (this.procMount != null ? !this.procMount.equals(that.procMount) : that.procMount != null) return false;
            if (this.readOnlyRootFilesystem != null ? !this.readOnlyRootFilesystem.equals(that.readOnlyRootFilesystem) : that.readOnlyRootFilesystem != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seLinuxOptions != null ? !this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions != null) return false;
            return this.windowsOptions != null ? this.windowsOptions.equals(that.windowsOptions) : that.windowsOptions == null;
        }

        @Override
        public int hashCode() {
            int result = this.allowPrivilegeEscalation != null ? this.allowPrivilegeEscalation.hashCode() : 0;
            result = 31 * result + (this.capabilities != null ? this.capabilities.hashCode() : 0);
            result = 31 * result + (this.privileged != null ? this.privileged.hashCode() : 0);
            result = 31 * result + (this.procMount != null ? this.procMount.hashCode() : 0);
            result = 31 * result + (this.readOnlyRootFilesystem != null ? this.readOnlyRootFilesystem.hashCode() : 0);
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            result = 31 * result + (this.windowsOptions != null ? this.windowsOptions.hashCode() : 0);
            return result;
        }
    }
}
