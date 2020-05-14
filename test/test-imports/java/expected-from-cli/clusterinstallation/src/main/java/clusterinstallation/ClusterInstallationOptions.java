package clusterinstallation;

/**
 * ClusterInstallation is the Schema for the clusterinstallations API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.300Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationOptions")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationOptions.Jsii$Proxy.class)
public interface ClusterInstallationOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specification of the desired behavior of the Mattermost cluster.
     * <p>
     * More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
     */
    @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationSpec getSpec();

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationOptions}
     */
    public static final class Builder {
        private clusterinstallation.ClusterInstallationSpec spec;
        private java.lang.Object metadata;

        /**
         * Sets the value of {@link ClusterInstallationOptions#getSpec}
         * @param spec Specification of the desired behavior of the Mattermost cluster. This parameter is required.
         *             More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
         * @return {@code this}
         */
        public Builder spec(clusterinstallation.ClusterInstallationSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationOptions {
        private final clusterinstallation.ClusterInstallationSpec spec;
        private final java.lang.Object metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = this.jsiiGet("spec", clusterinstallation.ClusterInstallationSpec.class);
            this.metadata = this.jsiiGet("metadata", java.lang.Object.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final clusterinstallation.ClusterInstallationSpec spec, final java.lang.Object metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpec getSpec() {
            return this.spec;
        }

        @Override
        public java.lang.Object getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationOptions.Jsii$Proxy that = (ClusterInstallationOptions.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
