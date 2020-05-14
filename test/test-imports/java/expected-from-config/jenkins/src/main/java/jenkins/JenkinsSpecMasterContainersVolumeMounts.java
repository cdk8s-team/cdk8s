package jenkins;

/**
 * VolumeMount describes a mounting of a Volume within a container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.636Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersVolumeMounts")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersVolumeMounts.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersVolumeMounts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Path within the container at which the volume should be mounted.
     * <p>
     * Must not contain ':'.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMountPath();

    /**
     * This must match the Name of a Volume.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around.
     * <p>
     * When not set, MountPropagationNone is used. This field is beta in 1.10.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMountPropagation() {
        return null;
    }

    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified).
     * <p>
     * Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Path within the volume from which the container's volume should be mounted.
     * <p>
     * Defaults to "" (volume's root).
     * <p>
     * Default: volume's root).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubPath() {
        return null;
    }

    /**
     * Expanded path within the volume from which the container's volume should be mounted.
     * <p>
     * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.
     * <p>
     * Default: volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubPathExpr() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersVolumeMounts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersVolumeMounts}
     */
    public static final class Builder {
        private java.lang.String mountPath;
        private java.lang.String name;
        private java.lang.String mountPropagation;
        private java.lang.Boolean readOnly;
        private java.lang.String subPath;
        private java.lang.String subPathExpr;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getMountPath}
         * @param mountPath Path within the container at which the volume should be mounted. This parameter is required.
         *                  Must not contain ':'.
         * @return {@code this}
         */
        public Builder mountPath(java.lang.String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getName}
         * @param name This must match the Name of a Volume. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getMountPropagation}
         * @param mountPropagation mountPropagation determines how mounts are propagated from the host to container and the other way around.
         *                         When not set, MountPropagationNone is used. This field is beta in 1.10.
         * @return {@code this}
         */
        public Builder mountPropagation(java.lang.String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getReadOnly}
         * @param readOnly Mounted read-only if true, read-write otherwise (false or unspecified).
         *                 Defaults to false.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getSubPath}
         * @param subPath Path within the volume from which the container's volume should be mounted.
         *                Defaults to "" (volume's root).
         * @return {@code this}
         */
        public Builder subPath(java.lang.String subPath) {
            this.subPath = subPath;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersVolumeMounts#getSubPathExpr}
         * @param subPathExpr Expanded path within the volume from which the container's volume should be mounted.
         *                    Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive. This field is beta in 1.15.
         * @return {@code this}
         */
        public Builder subPathExpr(java.lang.String subPathExpr) {
            this.subPathExpr = subPathExpr;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersVolumeMounts}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersVolumeMounts build() {
            return new Jsii$Proxy(mountPath, name, mountPropagation, readOnly, subPath, subPathExpr);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersVolumeMounts}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersVolumeMounts {
        private final java.lang.String mountPath;
        private final java.lang.String name;
        private final java.lang.String mountPropagation;
        private final java.lang.Boolean readOnly;
        private final java.lang.String subPath;
        private final java.lang.String subPathExpr;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.mountPath = this.jsiiGet("mountPath", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.mountPropagation = this.jsiiGet("mountPropagation", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.subPath = this.jsiiGet("subPath", java.lang.String.class);
            this.subPathExpr = this.jsiiGet("subPathExpr", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String mountPath, final java.lang.String name, final java.lang.String mountPropagation, final java.lang.Boolean readOnly, final java.lang.String subPath, final java.lang.String subPathExpr) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.mountPath = java.util.Objects.requireNonNull(mountPath, "mountPath is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.mountPropagation = mountPropagation;
            this.readOnly = readOnly;
            this.subPath = subPath;
            this.subPathExpr = subPathExpr;
        }

        @Override
        public java.lang.String getMountPath() {
            return this.mountPath;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getMountPropagation() {
            return this.mountPropagation;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.lang.String getSubPath() {
            return this.subPath;
        }

        @Override
        public java.lang.String getSubPathExpr() {
            return this.subPathExpr;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("mountPath", om.valueToTree(this.getMountPath()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getMountPropagation() != null) {
                data.set("mountPropagation", om.valueToTree(this.getMountPropagation()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSubPath() != null) {
                data.set("subPath", om.valueToTree(this.getSubPath()));
            }
            if (this.getSubPathExpr() != null) {
                data.set("subPathExpr", om.valueToTree(this.getSubPathExpr()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersVolumeMounts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersVolumeMounts.Jsii$Proxy that = (JenkinsSpecMasterContainersVolumeMounts.Jsii$Proxy) o;

            if (!mountPath.equals(that.mountPath)) return false;
            if (!name.equals(that.name)) return false;
            if (this.mountPropagation != null ? !this.mountPropagation.equals(that.mountPropagation) : that.mountPropagation != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.subPath != null ? !this.subPath.equals(that.subPath) : that.subPath != null) return false;
            return this.subPathExpr != null ? this.subPathExpr.equals(that.subPathExpr) : that.subPathExpr == null;
        }

        @Override
        public int hashCode() {
            int result = this.mountPath.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.mountPropagation != null ? this.mountPropagation.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.subPath != null ? this.subPath.hashCode() : 0);
            result = 31 * result + (this.subPathExpr != null ? this.subPathExpr.hashCode() : 0);
            return result;
        }
    }
}
