package k8s;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.475Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.WeightedPodAffinityTerm")
@software.amazon.jsii.Jsii.Proxy(WeightedPodAffinityTerm.Jsii$Proxy.class)
public interface WeightedPodAffinityTerm extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required.
     * <p>
     * A pod affinity term, associated with the corresponding weight.
     */
    @org.jetbrains.annotations.NotNull k8s.PodAffinityTerm getPodAffinityTerm();

    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getWeight();

    /**
     * @return a {@link Builder} of {@link WeightedPodAffinityTerm}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WeightedPodAffinityTerm}
     */
    public static final class Builder {
        private k8s.PodAffinityTerm podAffinityTerm;
        private java.lang.Number weight;

        /**
         * Sets the value of {@link WeightedPodAffinityTerm#getPodAffinityTerm}
         * @param podAffinityTerm Required. This parameter is required.
         *                        A pod affinity term, associated with the corresponding weight.
         * @return {@code this}
         */
        public Builder podAffinityTerm(k8s.PodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }

        /**
         * Sets the value of {@link WeightedPodAffinityTerm#getWeight}
         * @param weight weight associated with matching the corresponding podAffinityTerm, in the range 1-100. This parameter is required.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WeightedPodAffinityTerm}
         * @throws NullPointerException if any required attribute was not provided
         */
        public WeightedPodAffinityTerm build() {
            return new Jsii$Proxy(podAffinityTerm, weight);
        }
    }

    /**
     * An implementation for {@link WeightedPodAffinityTerm}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WeightedPodAffinityTerm {
        private final k8s.PodAffinityTerm podAffinityTerm;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podAffinityTerm = this.jsiiGet("podAffinityTerm", k8s.PodAffinityTerm.class);
            this.weight = this.jsiiGet("weight", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.PodAffinityTerm podAffinityTerm, final java.lang.Number weight) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podAffinityTerm = java.util.Objects.requireNonNull(podAffinityTerm, "podAffinityTerm is required");
            this.weight = java.util.Objects.requireNonNull(weight, "weight is required");
        }

        @Override
        public k8s.PodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

        @Override
        public java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("podAffinityTerm", om.valueToTree(this.getPodAffinityTerm()));
            data.set("weight", om.valueToTree(this.getWeight()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WeightedPodAffinityTerm"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WeightedPodAffinityTerm.Jsii$Proxy that = (WeightedPodAffinityTerm.Jsii$Proxy) o;

            if (!podAffinityTerm.equals(that.podAffinityTerm)) return false;
            return this.weight.equals(that.weight);
        }

        @Override
        public int hashCode() {
            int result = this.podAffinityTerm.hashCode();
            result = 31 * result + (this.weight.hashCode());
            return result;
        }
    }
}
