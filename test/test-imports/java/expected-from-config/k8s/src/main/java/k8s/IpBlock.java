package k8s;

/**
 * IPBlock describes a particular CIDR (Ex.
 * <p>
 * "192.168.1.1/24") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.246Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IpBlock")
@software.amazon.jsii.Jsii.Proxy(IpBlock.Jsii$Proxy.class)
public interface IpBlock extends software.amazon.jsii.JsiiSerializable {

    /**
     * CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24".
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCidr();

    /**
     * Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcept() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IpBlock}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IpBlock}
     */
    public static final class Builder {
        private java.lang.String cidr;
        private java.util.List<java.lang.String> except;

        /**
         * Sets the value of {@link IpBlock#getCidr}
         * @param cidr CIDR is a string representing the IP Block Valid examples are "192.168.1.1/24". This parameter is required.
         * @return {@code this}
         */
        public Builder cidr(java.lang.String cidr) {
            this.cidr = cidr;
            return this;
        }

        /**
         * Sets the value of {@link IpBlock#getExcept}
         * @param except Except is a slice of CIDRs that should not be included within an IP Block Valid examples are "192.168.1.1/24" Except values will be rejected if they are outside the CIDR range.
         * @return {@code this}
         */
        public Builder except(java.util.List<java.lang.String> except) {
            this.except = except;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IpBlock}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IpBlock build() {
            return new Jsii$Proxy(cidr, except);
        }
    }

    /**
     * An implementation for {@link IpBlock}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IpBlock {
        private final java.lang.String cidr;
        private final java.util.List<java.lang.String> except;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cidr = this.jsiiGet("cidr", java.lang.String.class);
            this.except = this.jsiiGet("except", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String cidr, final java.util.List<java.lang.String> except) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cidr = java.util.Objects.requireNonNull(cidr, "cidr is required");
            this.except = except;
        }

        @Override
        public java.lang.String getCidr() {
            return this.cidr;
        }

        @Override
        public java.util.List<java.lang.String> getExcept() {
            return this.except;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("cidr", om.valueToTree(this.getCidr()));
            if (this.getExcept() != null) {
                data.set("except", om.valueToTree(this.getExcept()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IpBlock"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IpBlock.Jsii$Proxy that = (IpBlock.Jsii$Proxy) o;

            if (!cidr.equals(that.cidr)) return false;
            return this.except != null ? this.except.equals(that.except) : that.except == null;
        }

        @Override
        public int hashCode() {
            int result = this.cidr.hashCode();
            result = 31 * result + (this.except != null ? this.except.hashCode() : 0);
            return result;
        }
    }
}
