package k8s;

/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.182Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DownwardAPIVolumeFile")
@software.amazon.jsii.Jsii.Proxy(DownwardAPIVolumeFile.Jsii$Proxy.class)
public interface DownwardAPIVolumeFile extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: Path is  the relative path name of the file to be created.
     * <p>
     * Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectFieldSelector getFieldRef() {
        return null;
    }

    /**
     * Optional: mode bits to use on this file, must be a value between 0 and 0777.
     * <p>
     * If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMode() {
        return null;
    }

    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     */
    default @org.jetbrains.annotations.Nullable k8s.ResourceFieldSelector getResourceFieldRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DownwardAPIVolumeFile}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DownwardAPIVolumeFile}
     */
    public static final class Builder {
        private java.lang.String path;
        private k8s.ObjectFieldSelector fieldRef;
        private java.lang.Number mode;
        private k8s.ResourceFieldSelector resourceFieldRef;

        /**
         * Sets the value of {@link DownwardAPIVolumeFile#getPath}
         * @param path Required: Path is  the relative path name of the file to be created. This parameter is required.
         *             Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link DownwardAPIVolumeFile#getFieldRef}
         * @param fieldRef Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
         * @return {@code this}
         */
        public Builder fieldRef(k8s.ObjectFieldSelector fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        /**
         * Sets the value of {@link DownwardAPIVolumeFile#getMode}
         * @param mode Optional: mode bits to use on this file, must be a value between 0 and 0777.
         *             If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * @return {@code this}
         */
        public Builder mode(java.lang.Number mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link DownwardAPIVolumeFile#getResourceFieldRef}
         * @param resourceFieldRef Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
         * @return {@code this}
         */
        public Builder resourceFieldRef(k8s.ResourceFieldSelector resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DownwardAPIVolumeFile}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DownwardAPIVolumeFile build() {
            return new Jsii$Proxy(path, fieldRef, mode, resourceFieldRef);
        }
    }

    /**
     * An implementation for {@link DownwardAPIVolumeFile}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DownwardAPIVolumeFile {
        private final java.lang.String path;
        private final k8s.ObjectFieldSelector fieldRef;
        private final java.lang.Number mode;
        private final k8s.ResourceFieldSelector resourceFieldRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.fieldRef = this.jsiiGet("fieldRef", k8s.ObjectFieldSelector.class);
            this.mode = this.jsiiGet("mode", java.lang.Number.class);
            this.resourceFieldRef = this.jsiiGet("resourceFieldRef", k8s.ResourceFieldSelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String path, final k8s.ObjectFieldSelector fieldRef, final java.lang.Number mode, final k8s.ResourceFieldSelector resourceFieldRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.fieldRef = fieldRef;
            this.mode = mode;
            this.resourceFieldRef = resourceFieldRef;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public k8s.ObjectFieldSelector getFieldRef() {
            return this.fieldRef;
        }

        @Override
        public java.lang.Number getMode() {
            return this.mode;
        }

        @Override
        public k8s.ResourceFieldSelector getResourceFieldRef() {
            return this.resourceFieldRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("path", om.valueToTree(this.getPath()));
            if (this.getFieldRef() != null) {
                data.set("fieldRef", om.valueToTree(this.getFieldRef()));
            }
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getResourceFieldRef() != null) {
                data.set("resourceFieldRef", om.valueToTree(this.getResourceFieldRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DownwardAPIVolumeFile"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DownwardAPIVolumeFile.Jsii$Proxy that = (DownwardAPIVolumeFile.Jsii$Proxy) o;

            if (!path.equals(that.path)) return false;
            if (this.fieldRef != null ? !this.fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.resourceFieldRef != null ? this.resourceFieldRef.equals(that.resourceFieldRef) : that.resourceFieldRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.path.hashCode();
            result = 31 * result + (this.fieldRef != null ? this.fieldRef.hashCode() : 0);
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.resourceFieldRef != null ? this.resourceFieldRef.hashCode() : 0);
            return result;
        }
    }
}
