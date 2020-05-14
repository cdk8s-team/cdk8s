package k8s;

/**
 * VolumeNodeResources is a set of resource limits for scheduling of volumes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.473Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.VolumeNodeResources")
@software.amazon.jsii.Jsii.Proxy(VolumeNodeResources.Jsii$Proxy.class)
public interface VolumeNodeResources extends software.amazon.jsii.JsiiSerializable {

    /**
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
     * <p>
     * A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeNodeResources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeNodeResources}
     */
    public static final class Builder {
        private java.lang.Number count;

        /**
         * Sets the value of {@link VolumeNodeResources#getCount}
         * @param count Maximum number of unique volumes managed by the CSI driver that can be used on a node.
         *              A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeNodeResources}
         * @throws NullPointerException if any required attribute was not provided
         */
        public VolumeNodeResources build() {
            return new Jsii$Proxy(count);
        }
    }

    /**
     * An implementation for {@link VolumeNodeResources}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeNodeResources {
        private final java.lang.Number count;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = this.jsiiGet("count", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number count) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = count;
        }

        @Override
        public java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeNodeResources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeNodeResources.Jsii$Proxy that = (VolumeNodeResources.Jsii$Proxy) o;

            return this.count != null ? this.count.equals(that.count) : that.count == null;
        }

        @Override
        public int hashCode() {
            int result = this.count != null ? this.count.hashCode() : 0;
            return result;
        }
    }
}
