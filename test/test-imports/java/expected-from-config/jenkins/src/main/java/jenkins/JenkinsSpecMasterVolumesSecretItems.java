package jenkins;

/**
 * Maps a string key to a path within a volume.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.694Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesSecretItems")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesSecretItems.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesSecretItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * The key to project.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * The relative path of the file to map the key to.
     * <p>
     * May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Optional: mode bits to use on this file, must be a value between 0 and 0777.
     * <p>
     * If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMode() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesSecretItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesSecretItems}
     */
    public static final class Builder {
        private java.lang.String key;
        private java.lang.String path;
        private java.lang.Number mode;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesSecretItems#getKey}
         * @param key The key to project. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesSecretItems#getPath}
         * @param path The relative path of the file to map the key to. This parameter is required.
         *             May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesSecretItems#getMode}
         * @param mode Optional: mode bits to use on this file, must be a value between 0 and 0777.
         *             If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder mode(java.lang.Number mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesSecretItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesSecretItems build() {
            return new Jsii$Proxy(key, path, mode);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesSecretItems}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesSecretItems {
        private final java.lang.String key;
        private final java.lang.String path;
        private final java.lang.Number mode;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = this.jsiiGet("key", java.lang.String.class);
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.mode = this.jsiiGet("mode", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String key, final java.lang.String path, final java.lang.Number mode) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.mode = mode;
        }

        @Override
        public java.lang.String getKey() {
            return this.key;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.Number getMode() {
            return this.mode;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("path", om.valueToTree(this.getPath()));
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesSecretItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesSecretItems.Jsii$Proxy that = (JenkinsSpecMasterVolumesSecretItems.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (!path.equals(that.path)) return false;
            return this.mode != null ? this.mode.equals(that.mode) : that.mode == null;
        }

        @Override
        public int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.path.hashCode());
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            return result;
        }
    }
}
