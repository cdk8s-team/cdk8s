package k8s;

/**
 * ResourceRequirements describes the compute resource requirements.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.392Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ResourceRequirements")
@software.amazon.jsii.Jsii.Proxy(ResourceRequirements.Jsii$Proxy.class)
public interface ResourceRequirements extends software.amazon.jsii.JsiiSerializable {

    /**
     * Limits describes the maximum amount of compute resources allowed.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.Quantity> getLimits() {
        return null;
    }

    /**
     * Requests describes the minimum amount of compute resources required.
     * <p>
     * If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.Quantity> getRequests() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourceRequirements}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourceRequirements}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, k8s.Quantity> limits;
        private java.util.Map<java.lang.String, k8s.Quantity> requests;

        /**
         * Sets the value of {@link ResourceRequirements#getLimits}
         * @param limits Limits describes the maximum amount of compute resources allowed.
         *               More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         * @return {@code this}
         */
        public Builder limits(java.util.Map<java.lang.String, k8s.Quantity> limits) {
            this.limits = limits;
            return this;
        }

        /**
         * Sets the value of {@link ResourceRequirements#getRequests}
         * @param requests Requests describes the minimum amount of compute resources required.
         *                 If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
         * @return {@code this}
         */
        public Builder requests(java.util.Map<java.lang.String, k8s.Quantity> requests) {
            this.requests = requests;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourceRequirements}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ResourceRequirements build() {
            return new Jsii$Proxy(limits, requests);
        }
    }

    /**
     * An implementation for {@link ResourceRequirements}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourceRequirements {
        private final java.util.Map<java.lang.String, k8s.Quantity> limits;
        private final java.util.Map<java.lang.String, k8s.Quantity> requests;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limits = this.jsiiGet("limits", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.Quantity.class)));
            this.requests = this.jsiiGet("requests", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, k8s.Quantity> limits, final java.util.Map<java.lang.String, k8s.Quantity> requests) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limits = limits;
            this.requests = requests;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.Quantity> getLimits() {
            return this.limits;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.Quantity> getRequests() {
            return this.requests;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLimits() != null) {
                data.set("limits", om.valueToTree(this.getLimits()));
            }
            if (this.getRequests() != null) {
                data.set("requests", om.valueToTree(this.getRequests()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourceRequirements"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourceRequirements.Jsii$Proxy that = (ResourceRequirements.Jsii$Proxy) o;

            if (this.limits != null ? !this.limits.equals(that.limits) : that.limits != null) return false;
            return this.requests != null ? this.requests.equals(that.requests) : that.requests == null;
        }

        @Override
        public int hashCode() {
            int result = this.limits != null ? this.limits.hashCode() : 0;
            result = 31 * result + (this.requests != null ? this.requests.hashCode() : 0);
            return result;
        }
    }
}
