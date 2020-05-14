package jenkins;

/**
 * SecurityContext that applies to all the containers of the Jenkins Master.
 * <p>
 * As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
 * <p>
 * Default: runAsUser: 1000 fsGroup: 1000
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.638Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterSecurityContext")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterSecurityContext.Jsii$Proxy.class)
public interface JenkinsSpecMasterSecurityContext extends software.amazon.jsii.JsiiSerializable {

    /**
     * A special supplemental group that applies to all containers in a pod.
     * <p>
     * Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
     * <p>
     * <ol>
     * <li>The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
     * If unset, the Kubelet will not modify the ownership and permissions of any volume.</li>
     * </ol>
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFsGroup() {
        return null;
    }

    /**
     * The GID to run the entrypoint of the container process.
     * <p>
     * Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsGroup() {
        return null;
    }

    /**
     * Indicates that the container must run as a non-root user.
     * <p>
     * If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getRunAsNonRoot() {
        return null;
    }

    /**
     * The UID to run the entrypoint of the container process.
     * <p>
     * Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     * <p>
     * Default: user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRunAsUser() {
        return null;
    }

    /**
     * The SELinux context to be applied to all containers.
     * <p>
     * If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions getSeLinuxOptions() {
        return null;
    }

    /**
     * A list of groups applied to the first process run in each container, in addition to the container's primary GID.
     * <p>
     * If unspecified, no groups will be added to any container.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getSupplementalGroups() {
        return null;
    }

    /**
     * Sysctls hold a list of namespaced sysctls used for the pod.
     * <p>
     * Pods with unsupported sysctls (by the container runtime) might fail to launch.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> getSysctls() {
        return null;
    }

    /**
     * The Windows specific settings applied to all containers.
     * <p>
     * If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterSecurityContextWindowsOptions getWindowsOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterSecurityContext}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterSecurityContext}
     */
    public static final class Builder {
        private java.lang.Number fsGroup;
        private java.lang.Number runAsGroup;
        private java.lang.Boolean runAsNonRoot;
        private java.lang.Number runAsUser;
        private jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions seLinuxOptions;
        private java.util.List<java.lang.Number> supplementalGroups;
        private java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> sysctls;
        private jenkins.JenkinsSpecMasterSecurityContextWindowsOptions windowsOptions;

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getFsGroup}
         * @param fsGroup A special supplemental group that applies to all containers in a pod.
         *                Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:
         *                <p>
         *                <ol>
         *                <li>The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----
         *                If unset, the Kubelet will not modify the ownership and permissions of any volume.</li>
         *                </ol>
         * @return {@code this}
         */
        public Builder fsGroup(java.lang.Number fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getRunAsGroup}
         * @param runAsGroup The GID to run the entrypoint of the container process.
         *                   Uses runtime default if unset. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
         * @return {@code this}
         */
        public Builder runAsGroup(java.lang.Number runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getRunAsNonRoot}
         * @param runAsNonRoot Indicates that the container must run as a non-root user.
         *                     If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder runAsNonRoot(java.lang.Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getRunAsUser}
         * @param runAsUser The UID to run the entrypoint of the container process.
         *                  Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
         * @return {@code this}
         */
        public Builder runAsUser(java.lang.Number runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getSeLinuxOptions}
         * @param seLinuxOptions The SELinux context to be applied to all containers.
         *                       If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
         * @return {@code this}
         */
        public Builder seLinuxOptions(jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getSupplementalGroups}
         * @param supplementalGroups A list of groups applied to the first process run in each container, in addition to the container's primary GID.
         *                           If unspecified, no groups will be added to any container.
         * @return {@code this}
         */
        public Builder supplementalGroups(java.util.List<java.lang.Number> supplementalGroups) {
            this.supplementalGroups = supplementalGroups;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getSysctls}
         * @param sysctls Sysctls hold a list of namespaced sysctls used for the pod.
         *                Pods with unsupported sysctls (by the container runtime) might fail to launch.
         * @return {@code this}
         */
        public Builder sysctls(java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContext#getWindowsOptions}
         * @param windowsOptions The Windows specific settings applied to all containers.
         *                       If unspecified, the options within a container's SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
         * @return {@code this}
         */
        public Builder windowsOptions(jenkins.JenkinsSpecMasterSecurityContextWindowsOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterSecurityContext}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterSecurityContext build() {
            return new Jsii$Proxy(fsGroup, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, supplementalGroups, sysctls, windowsOptions);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterSecurityContext}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterSecurityContext {
        private final java.lang.Number fsGroup;
        private final java.lang.Number runAsGroup;
        private final java.lang.Boolean runAsNonRoot;
        private final java.lang.Number runAsUser;
        private final jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions seLinuxOptions;
        private final java.util.List<java.lang.Number> supplementalGroups;
        private final java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> sysctls;
        private final jenkins.JenkinsSpecMasterSecurityContextWindowsOptions windowsOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fsGroup = this.jsiiGet("fsGroup", java.lang.Number.class);
            this.runAsGroup = this.jsiiGet("runAsGroup", java.lang.Number.class);
            this.runAsNonRoot = this.jsiiGet("runAsNonRoot", java.lang.Boolean.class);
            this.runAsUser = this.jsiiGet("runAsUser", java.lang.Number.class);
            this.seLinuxOptions = this.jsiiGet("seLinuxOptions", jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions.class);
            this.supplementalGroups = this.jsiiGet("supplementalGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class)));
            this.sysctls = this.jsiiGet("sysctls", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterSecurityContextSysctls.class)));
            this.windowsOptions = this.jsiiGet("windowsOptions", jenkins.JenkinsSpecMasterSecurityContextWindowsOptions.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number fsGroup, final java.lang.Number runAsGroup, final java.lang.Boolean runAsNonRoot, final java.lang.Number runAsUser, final jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions seLinuxOptions, final java.util.List<java.lang.Number> supplementalGroups, final java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> sysctls, final jenkins.JenkinsSpecMasterSecurityContextWindowsOptions windowsOptions) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fsGroup = fsGroup;
            this.runAsGroup = runAsGroup;
            this.runAsNonRoot = runAsNonRoot;
            this.runAsUser = runAsUser;
            this.seLinuxOptions = seLinuxOptions;
            this.supplementalGroups = supplementalGroups;
            this.sysctls = sysctls;
            this.windowsOptions = windowsOptions;
        }

        @Override
        public java.lang.Number getFsGroup() {
            return this.fsGroup;
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
        public jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions getSeLinuxOptions() {
            return this.seLinuxOptions;
        }

        @Override
        public java.util.List<java.lang.Number> getSupplementalGroups() {
            return this.supplementalGroups;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterSecurityContextSysctls> getSysctls() {
            return this.sysctls;
        }

        @Override
        public jenkins.JenkinsSpecMasterSecurityContextWindowsOptions getWindowsOptions() {
            return this.windowsOptions;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFsGroup() != null) {
                data.set("fsGroup", om.valueToTree(this.getFsGroup()));
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
            if (this.getSupplementalGroups() != null) {
                data.set("supplementalGroups", om.valueToTree(this.getSupplementalGroups()));
            }
            if (this.getSysctls() != null) {
                data.set("sysctls", om.valueToTree(this.getSysctls()));
            }
            if (this.getWindowsOptions() != null) {
                data.set("windowsOptions", om.valueToTree(this.getWindowsOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterSecurityContext"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterSecurityContext.Jsii$Proxy that = (JenkinsSpecMasterSecurityContext.Jsii$Proxy) o;

            if (this.fsGroup != null ? !this.fsGroup.equals(that.fsGroup) : that.fsGroup != null) return false;
            if (this.runAsGroup != null ? !this.runAsGroup.equals(that.runAsGroup) : that.runAsGroup != null) return false;
            if (this.runAsNonRoot != null ? !this.runAsNonRoot.equals(that.runAsNonRoot) : that.runAsNonRoot != null) return false;
            if (this.runAsUser != null ? !this.runAsUser.equals(that.runAsUser) : that.runAsUser != null) return false;
            if (this.seLinuxOptions != null ? !this.seLinuxOptions.equals(that.seLinuxOptions) : that.seLinuxOptions != null) return false;
            if (this.supplementalGroups != null ? !this.supplementalGroups.equals(that.supplementalGroups) : that.supplementalGroups != null) return false;
            if (this.sysctls != null ? !this.sysctls.equals(that.sysctls) : that.sysctls != null) return false;
            return this.windowsOptions != null ? this.windowsOptions.equals(that.windowsOptions) : that.windowsOptions == null;
        }

        @Override
        public int hashCode() {
            int result = this.fsGroup != null ? this.fsGroup.hashCode() : 0;
            result = 31 * result + (this.runAsGroup != null ? this.runAsGroup.hashCode() : 0);
            result = 31 * result + (this.runAsNonRoot != null ? this.runAsNonRoot.hashCode() : 0);
            result = 31 * result + (this.runAsUser != null ? this.runAsUser.hashCode() : 0);
            result = 31 * result + (this.seLinuxOptions != null ? this.seLinuxOptions.hashCode() : 0);
            result = 31 * result + (this.supplementalGroups != null ? this.supplementalGroups.hashCode() : 0);
            result = 31 * result + (this.sysctls != null ? this.sysctls.hashCode() : 0);
            result = 31 * result + (this.windowsOptions != null ? this.windowsOptions.hashCode() : 0);
            return result;
        }
    }
}
