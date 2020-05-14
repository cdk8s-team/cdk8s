package k8s;

/**
 * Adds and removes POSIX capabilities from running containers.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.112Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Capabilities")
@software.amazon.jsii.Jsii.Proxy(Capabilities.Jsii$Proxy.class)
public interface Capabilities extends software.amazon.jsii.JsiiSerializable {

    /**
     * Added capabilities.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdd() {
        return null;
    }

    /**
     * Removed capabilities.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDrop() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Capabilities}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Capabilities}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> add;
        private java.util.List<java.lang.String> drop;

        /**
         * Sets the value of {@link Capabilities#getAdd}
         * @param add Added capabilities.
         * @return {@code this}
         */
        public Builder add(java.util.List<java.lang.String> add) {
            this.add = add;
            return this;
        }

        /**
         * Sets the value of {@link Capabilities#getDrop}
         * @param drop Removed capabilities.
         * @return {@code this}
         */
        public Builder drop(java.util.List<java.lang.String> drop) {
            this.drop = drop;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Capabilities}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Capabilities build() {
            return new Jsii$Proxy(add, drop);
        }
    }

    /**
     * An implementation for {@link Capabilities}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Capabilities {
        private final java.util.List<java.lang.String> add;
        private final java.util.List<java.lang.String> drop;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.add = this.jsiiGet("add", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.drop = this.jsiiGet("drop", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> add, final java.util.List<java.lang.String> drop) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.add = add;
            this.drop = drop;
        }

        @Override
        public java.util.List<java.lang.String> getAdd() {
            return this.add;
        }

        @Override
        public java.util.List<java.lang.String> getDrop() {
            return this.drop;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAdd() != null) {
                data.set("add", om.valueToTree(this.getAdd()));
            }
            if (this.getDrop() != null) {
                data.set("drop", om.valueToTree(this.getDrop()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Capabilities"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Capabilities.Jsii$Proxy that = (Capabilities.Jsii$Proxy) o;

            if (this.add != null ? !this.add.equals(that.add) : that.add != null) return false;
            return this.drop != null ? this.drop.equals(that.drop) : that.drop == null;
        }

        @Override
        public int hashCode() {
            int result = this.add != null ? this.add.hashCode() : 0;
            result = 31 * result + (this.drop != null ? this.drop.hashCode() : 0);
            return result;
        }
    }
}
