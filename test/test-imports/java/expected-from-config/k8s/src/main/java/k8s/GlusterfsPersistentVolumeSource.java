package k8s;

/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod.
 * <p>
 * Glusterfs volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.232Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.GlusterfsPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(GlusterfsPersistentVolumeSource.Jsii$Proxy.class)
public interface GlusterfsPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * EndpointsName is the endpoint name that details Glusterfs topology.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEndpoints();

    /**
     * Path is the Glusterfs volume path.
     * <p>
     * More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPath();

    /**
     * EndpointsNamespace is the namespace that contains Glusterfs endpoint.
     * <p>
     * If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointsNamespace() {
        return null;
    }

    /**
     * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
     * <p>
     * Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * <p>
     * Default: false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlusterfsPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlusterfsPersistentVolumeSource}
     */
    public static final class Builder {
        private java.lang.String endpoints;
        private java.lang.String path;
        private java.lang.String endpointsNamespace;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getEndpoints}
         * @param endpoints EndpointsName is the endpoint name that details Glusterfs topology. This parameter is required.
         *                  More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder endpoints(java.lang.String endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getPath}
         * @param path Path is the Glusterfs volume path. This parameter is required.
         *             More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getEndpointsNamespace}
         * @param endpointsNamespace EndpointsNamespace is the namespace that contains Glusterfs endpoint.
         *                           If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder endpointsNamespace(java.lang.String endpointsNamespace) {
            this.endpointsNamespace = endpointsNamespace;
            return this;
        }

        /**
         * Sets the value of {@link GlusterfsPersistentVolumeSource#getReadOnly}
         * @param readOnly ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
         *                 Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlusterfsPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public GlusterfsPersistentVolumeSource build() {
            return new Jsii$Proxy(endpoints, path, endpointsNamespace, readOnly);
        }
    }

    /**
     * An implementation for {@link GlusterfsPersistentVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlusterfsPersistentVolumeSource {
        private final java.lang.String endpoints;
        private final java.lang.String path;
        private final java.lang.String endpointsNamespace;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpoints = this.jsiiGet("endpoints", java.lang.String.class);
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.endpointsNamespace = this.jsiiGet("endpointsNamespace", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String endpoints, final java.lang.String path, final java.lang.String endpointsNamespace, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpoints = java.util.Objects.requireNonNull(endpoints, "endpoints is required");
            this.path = java.util.Objects.requireNonNull(path, "path is required");
            this.endpointsNamespace = endpointsNamespace;
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getEndpoints() {
            return this.endpoints;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.String getEndpointsNamespace() {
            return this.endpointsNamespace;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpoints", om.valueToTree(this.getEndpoints()));
            data.set("path", om.valueToTree(this.getPath()));
            if (this.getEndpointsNamespace() != null) {
                data.set("endpointsNamespace", om.valueToTree(this.getEndpointsNamespace()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.GlusterfsPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlusterfsPersistentVolumeSource.Jsii$Proxy that = (GlusterfsPersistentVolumeSource.Jsii$Proxy) o;

            if (!endpoints.equals(that.endpoints)) return false;
            if (!path.equals(that.path)) return false;
            if (this.endpointsNamespace != null ? !this.endpointsNamespace.equals(that.endpointsNamespace) : that.endpointsNamespace != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.endpoints.hashCode();
            result = 31 * result + (this.path.hashCode());
            result = 31 * result + (this.endpointsNamespace != null ? this.endpointsNamespace.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
