package k8s;

/**
 * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.172Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CustomResourceSubresourceScale")
@software.amazon.jsii.Jsii.Proxy(CustomResourceSubresourceScale.Jsii$Proxy.class)
public interface CustomResourceSubresourceScale extends software.amazon.jsii.JsiiSerializable {

    /**
     * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSpecReplicasPath();

    /**
     * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatusReplicasPath();

    /**
     * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLabelSelectorPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceSubresourceScale}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceSubresourceScale}
     */
    public static final class Builder {
        private java.lang.String specReplicasPath;
        private java.lang.String statusReplicasPath;
        private java.lang.String labelSelectorPath;

        /**
         * Sets the value of {@link CustomResourceSubresourceScale#getSpecReplicasPath}
         * @param specReplicasPath specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET. This parameter is required.
         * @return {@code this}
         */
        public Builder specReplicasPath(java.lang.String specReplicasPath) {
            this.specReplicasPath = specReplicasPath;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceSubresourceScale#getStatusReplicasPath}
         * @param statusReplicasPath statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0. This parameter is required.
         * @return {@code this}
         */
        public Builder statusReplicasPath(java.lang.String statusReplicasPath) {
            this.statusReplicasPath = statusReplicasPath;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceSubresourceScale#getLabelSelectorPath}
         * @param labelSelectorPath labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.
         * @return {@code this}
         */
        public Builder labelSelectorPath(java.lang.String labelSelectorPath) {
            this.labelSelectorPath = labelSelectorPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceSubresourceScale}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CustomResourceSubresourceScale build() {
            return new Jsii$Proxy(specReplicasPath, statusReplicasPath, labelSelectorPath);
        }
    }

    /**
     * An implementation for {@link CustomResourceSubresourceScale}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceSubresourceScale {
        private final java.lang.String specReplicasPath;
        private final java.lang.String statusReplicasPath;
        private final java.lang.String labelSelectorPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.specReplicasPath = this.jsiiGet("specReplicasPath", java.lang.String.class);
            this.statusReplicasPath = this.jsiiGet("statusReplicasPath", java.lang.String.class);
            this.labelSelectorPath = this.jsiiGet("labelSelectorPath", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String specReplicasPath, final java.lang.String statusReplicasPath, final java.lang.String labelSelectorPath) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.specReplicasPath = java.util.Objects.requireNonNull(specReplicasPath, "specReplicasPath is required");
            this.statusReplicasPath = java.util.Objects.requireNonNull(statusReplicasPath, "statusReplicasPath is required");
            this.labelSelectorPath = labelSelectorPath;
        }

        @Override
        public java.lang.String getSpecReplicasPath() {
            return this.specReplicasPath;
        }

        @Override
        public java.lang.String getStatusReplicasPath() {
            return this.statusReplicasPath;
        }

        @Override
        public java.lang.String getLabelSelectorPath() {
            return this.labelSelectorPath;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("specReplicasPath", om.valueToTree(this.getSpecReplicasPath()));
            data.set("statusReplicasPath", om.valueToTree(this.getStatusReplicasPath()));
            if (this.getLabelSelectorPath() != null) {
                data.set("labelSelectorPath", om.valueToTree(this.getLabelSelectorPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceSubresourceScale"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceSubresourceScale.Jsii$Proxy that = (CustomResourceSubresourceScale.Jsii$Proxy) o;

            if (!specReplicasPath.equals(that.specReplicasPath)) return false;
            if (!statusReplicasPath.equals(that.statusReplicasPath)) return false;
            return this.labelSelectorPath != null ? this.labelSelectorPath.equals(that.labelSelectorPath) : that.labelSelectorPath == null;
        }

        @Override
        public int hashCode() {
            int result = this.specReplicasPath.hashCode();
            result = 31 * result + (this.statusReplicasPath.hashCode());
            result = 31 * result + (this.labelSelectorPath != null ? this.labelSelectorPath.hashCode() : 0);
            return result;
        }
    }
}
