package k8s;

/**
 * IDRange provides a min/max of an allowed range of IDs.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.239Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IdRange")
@software.amazon.jsii.Jsii.Proxy(IdRange.Jsii$Proxy.class)
public interface IdRange extends software.amazon.jsii.JsiiSerializable {

    /**
     * max is the end of the range, inclusive.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMax();

    /**
     * min is the start of the range, inclusive.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMin();

    /**
     * @return a {@link Builder} of {@link IdRange}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IdRange}
     */
    public static final class Builder {
        private java.lang.Number max;
        private java.lang.Number min;

        /**
         * Sets the value of {@link IdRange#getMax}
         * @param max max is the end of the range, inclusive. This parameter is required.
         * @return {@code this}
         */
        public Builder max(java.lang.Number max) {
            this.max = max;
            return this;
        }

        /**
         * Sets the value of {@link IdRange#getMin}
         * @param min min is the start of the range, inclusive. This parameter is required.
         * @return {@code this}
         */
        public Builder min(java.lang.Number min) {
            this.min = min;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IdRange}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IdRange build() {
            return new Jsii$Proxy(max, min);
        }
    }

    /**
     * An implementation for {@link IdRange}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IdRange {
        private final java.lang.Number max;
        private final java.lang.Number min;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.max = this.jsiiGet("max", java.lang.Number.class);
            this.min = this.jsiiGet("min", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number max, final java.lang.Number min) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.max = java.util.Objects.requireNonNull(max, "max is required");
            this.min = java.util.Objects.requireNonNull(min, "min is required");
        }

        @Override
        public java.lang.Number getMax() {
            return this.max;
        }

        @Override
        public java.lang.Number getMin() {
            return this.min;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("max", om.valueToTree(this.getMax()));
            data.set("min", om.valueToTree(this.getMin()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IdRange"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IdRange.Jsii$Proxy that = (IdRange.Jsii$Proxy) o;

            if (!max.equals(that.max)) return false;
            return this.min.equals(that.min);
        }

        @Override
        public int hashCode() {
            int result = this.max.hashCode();
            result = 31 * result + (this.min.hashCode());
            return result;
        }
    }
}
