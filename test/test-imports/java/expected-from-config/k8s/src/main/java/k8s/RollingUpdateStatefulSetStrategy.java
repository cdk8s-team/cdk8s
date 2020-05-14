package k8s;

/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.396Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RollingUpdateStatefulSetStrategy")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateStatefulSetStrategy.Jsii$Proxy.class)
public interface RollingUpdateStatefulSetStrategy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned.
     * <p>
     * Default value is 0.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPartition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateStatefulSetStrategy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateStatefulSetStrategy}
     */
    public static final class Builder {
        private java.lang.Number partition;

        /**
         * Sets the value of {@link RollingUpdateStatefulSetStrategy#getPartition}
         * @param partition Partition indicates the ordinal at which the StatefulSet should be partitioned.
         *                  Default value is 0.
         * @return {@code this}
         */
        public Builder partition(java.lang.Number partition) {
            this.partition = partition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateStatefulSetStrategy}
         * @throws NullPointerException if any required attribute was not provided
         */
        public RollingUpdateStatefulSetStrategy build() {
            return new Jsii$Proxy(partition);
        }
    }

    /**
     * An implementation for {@link RollingUpdateStatefulSetStrategy}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateStatefulSetStrategy {
        private final java.lang.Number partition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.partition = this.jsiiGet("partition", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number partition) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.partition = partition;
        }

        @Override
        public java.lang.Number getPartition() {
            return this.partition;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPartition() != null) {
                data.set("partition", om.valueToTree(this.getPartition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateStatefulSetStrategy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateStatefulSetStrategy.Jsii$Proxy that = (RollingUpdateStatefulSetStrategy.Jsii$Proxy) o;

            return this.partition != null ? this.partition.equals(that.partition) : that.partition == null;
        }

        @Override
        public int hashCode() {
            int result = this.partition != null ? this.partition.hashCode() : 0;
            return result;
        }
    }
}
