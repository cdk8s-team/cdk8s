package k8s;

/**
 * Overhead structure represents the resource overhead associated with running a pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.330Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Overhead")
@software.amazon.jsii.Jsii.Proxy(Overhead.Jsii$Proxy.class)
public interface Overhead extends software.amazon.jsii.JsiiSerializable {

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.Quantity> getPodFixed() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Overhead}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Overhead}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, k8s.Quantity> podFixed;

        /**
         * Sets the value of {@link Overhead#getPodFixed}
         * @param podFixed PodFixed represents the fixed resource overhead associated with running a pod.
         * @return {@code this}
         */
        public Builder podFixed(java.util.Map<java.lang.String, k8s.Quantity> podFixed) {
            this.podFixed = podFixed;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Overhead}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Overhead build() {
            return new Jsii$Proxy(podFixed);
        }
    }

    /**
     * An implementation for {@link Overhead}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Overhead {
        private final java.util.Map<java.lang.String, k8s.Quantity> podFixed;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podFixed = this.jsiiGet("podFixed", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.Quantity.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, k8s.Quantity> podFixed) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podFixed = podFixed;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.Quantity> getPodFixed() {
            return this.podFixed;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPodFixed() != null) {
                data.set("podFixed", om.valueToTree(this.getPodFixed()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Overhead"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Overhead.Jsii$Proxy that = (Overhead.Jsii$Proxy) o;

            return this.podFixed != null ? this.podFixed.equals(that.podFixed) : that.podFixed == null;
        }

        @Override
        public int hashCode() {
            int result = this.podFixed != null ? this.podFixed.hashCode() : 0;
            return result;
        }
    }
}
