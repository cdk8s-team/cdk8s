package jenkins;

/**
 * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.659Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesCephfs")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesCephfs.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesCephfs extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretFile() {
        return null;
    }

    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty.
     * <p>
     * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesCephfsSecretRef getSecretRef() {
        return null;
    }

    /**
     * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesCephfs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesCephfs}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> monitors;
        private java.lang.String path;
        private java.lang.Boolean readOnly;
        private java.lang.String secretFile;
        private jenkins.JenkinsSpecMasterVolumesCephfsSecretRef secretRef;
        private java.lang.String user;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getMonitors}
         * @param monitors Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it. This parameter is required.
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getPath}
         * @param path Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getSecretFile}
         * @param secretFile Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder secretFile(java.lang.String secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getSecretRef}
         * @param secretRef Optional: SecretRef is reference to the authentication secret for User, default is empty.
         *                  More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder secretRef(jenkins.JenkinsSpecMasterVolumesCephfsSecretRef secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesCephfs#getUser}
         * @param user Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesCephfs}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesCephfs build() {
            return new Jsii$Proxy(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesCephfs}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesCephfs {
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String path;
        private final java.lang.Boolean readOnly;
        private final java.lang.String secretFile;
        private final jenkins.JenkinsSpecMasterVolumesCephfsSecretRef secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitors = this.jsiiGet("monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretFile = this.jsiiGet("secretFile", java.lang.String.class);
            this.secretRef = this.jsiiGet("secretRef", jenkins.JenkinsSpecMasterVolumesCephfsSecretRef.class);
            this.user = this.jsiiGet("user", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> monitors, final java.lang.String path, final java.lang.Boolean readOnly, final java.lang.String secretFile, final jenkins.JenkinsSpecMasterVolumesCephfsSecretRef secretRef, final java.lang.String user) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitors = java.util.Objects.requireNonNull(monitors, "monitors is required");
            this.path = path;
            this.readOnly = readOnly;
            this.secretFile = secretFile;
            this.secretRef = secretRef;
            this.user = user;
        }

        @Override
        public java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.lang.String getSecretFile() {
            return this.secretFile;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesCephfsSecretRef getSecretRef() {
            return this.secretRef;
        }

        @Override
        public java.lang.String getUser() {
            return this.user;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretFile() != null) {
                data.set("secretFile", om.valueToTree(this.getSecretFile()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesCephfs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesCephfs.Jsii$Proxy that = (JenkinsSpecMasterVolumesCephfs.Jsii$Proxy) o;

            if (!monitors.equals(that.monitors)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretFile != null ? !this.secretFile.equals(that.secretFile) : that.secretFile != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public int hashCode() {
            int result = this.monitors.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretFile != null ? this.secretFile.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
