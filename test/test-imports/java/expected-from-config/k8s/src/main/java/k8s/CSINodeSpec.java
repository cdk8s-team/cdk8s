package k8s;

/**
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.106Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CSINodeSpec")
@software.amazon.jsii.Jsii.Proxy(CSINodeSpec.Jsii$Proxy.class)
public interface CSINodeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * drivers is a list of information of all CSI Drivers existing on a node.
     * <p>
     * If all drivers in the list are uninstalled, this can become empty.
     */
    @org.jetbrains.annotations.NotNull java.util.List<k8s.CSINodeDriver> getDrivers();

    /**
     * @return a {@link Builder} of {@link CSINodeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CSINodeSpec}
     */
    public static final class Builder {
        private java.util.List<k8s.CSINodeDriver> drivers;

        /**
         * Sets the value of {@link CSINodeSpec#getDrivers}
         * @param drivers drivers is a list of information of all CSI Drivers existing on a node. This parameter is required.
         *                If all drivers in the list are uninstalled, this can become empty.
         * @return {@code this}
         */
        public Builder drivers(java.util.List<k8s.CSINodeDriver> drivers) {
            this.drivers = drivers;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CSINodeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CSINodeSpec build() {
            return new Jsii$Proxy(drivers);
        }
    }

    /**
     * An implementation for {@link CSINodeSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CSINodeSpec {
        private final java.util.List<k8s.CSINodeDriver> drivers;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.drivers = this.jsiiGet("drivers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.CSINodeDriver.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.CSINodeDriver> drivers) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.drivers = java.util.Objects.requireNonNull(drivers, "drivers is required");
        }

        @Override
        public java.util.List<k8s.CSINodeDriver> getDrivers() {
            return this.drivers;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("drivers", om.valueToTree(this.getDrivers()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CSINodeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CSINodeSpec.Jsii$Proxy that = (CSINodeSpec.Jsii$Proxy) o;

            return this.drivers.equals(that.drivers);
        }

        @Override
        public int hashCode() {
            int result = this.drivers.hashCode();
            return result;
        }
    }
}
