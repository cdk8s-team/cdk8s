package k8s;

/**
 * Endpoints is a collection of endpoints that implement the actual service.
 * <p>
 * Example:
 * Name: "mysvc",
 * Subsets: [
 * {
 * Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
 * Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
 * },
 * {
 * Addresses: [{"ip": "10.10.3.3"}],
 * Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
 * },
 * ]
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.200Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EndpointsOptions")
@software.amazon.jsii.Jsii.Proxy(EndpointsOptions.Jsii$Proxy.class)
public interface EndpointsOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * The set of all endpoints is the union of all subsets.
     * <p>
     * Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.EndpointSubset> getSubsets() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EndpointsOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EndpointsOptions}
     */
    public static final class Builder {
        private k8s.ObjectMeta metadata;
        private java.util.List<k8s.EndpointSubset> subsets;

        /**
         * Sets the value of {@link EndpointsOptions#getMetadata}
         * @param metadata Standard object's metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link EndpointsOptions#getSubsets}
         * @param subsets The set of all endpoints is the union of all subsets.
         *                Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
         * @return {@code this}
         */
        public Builder subsets(java.util.List<k8s.EndpointSubset> subsets) {
            this.subsets = subsets;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EndpointsOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EndpointsOptions build() {
            return new Jsii$Proxy(metadata, subsets);
        }
    }

    /**
     * An implementation for {@link EndpointsOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EndpointsOptions {
        private final k8s.ObjectMeta metadata;
        private final java.util.List<k8s.EndpointSubset> subsets;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.subsets = this.jsiiGet("subsets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.EndpointSubset.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.ObjectMeta metadata, final java.util.List<k8s.EndpointSubset> subsets) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.subsets = subsets;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<k8s.EndpointSubset> getSubsets() {
            return this.subsets;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSubsets() != null) {
                data.set("subsets", om.valueToTree(this.getSubsets()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EndpointsOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EndpointsOptions.Jsii$Proxy that = (EndpointsOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.subsets != null ? this.subsets.equals(that.subsets) : that.subsets == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.subsets != null ? this.subsets.hashCode() : 0);
            return result;
        }
    }
}
