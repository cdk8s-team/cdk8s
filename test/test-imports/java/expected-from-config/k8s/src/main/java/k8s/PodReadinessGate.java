package k8s;

/**
 * PodReadinessGate contains the reference to a pod condition.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.350Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodReadinessGate")
@software.amazon.jsii.Jsii.Proxy(PodReadinessGate.Jsii$Proxy.class)
public interface PodReadinessGate extends software.amazon.jsii.JsiiSerializable {

    /**
     * ConditionType refers to a condition in the pod's condition list with matching type.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getConditionType();

    /**
     * @return a {@link Builder} of {@link PodReadinessGate}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodReadinessGate}
     */
    public static final class Builder {
        private java.lang.String conditionType;

        /**
         * Sets the value of {@link PodReadinessGate#getConditionType}
         * @param conditionType ConditionType refers to a condition in the pod's condition list with matching type. This parameter is required.
         * @return {@code this}
         */
        public Builder conditionType(java.lang.String conditionType) {
            this.conditionType = conditionType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodReadinessGate}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodReadinessGate build() {
            return new Jsii$Proxy(conditionType);
        }
    }

    /**
     * An implementation for {@link PodReadinessGate}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodReadinessGate {
        private final java.lang.String conditionType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.conditionType = this.jsiiGet("conditionType", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String conditionType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.conditionType = java.util.Objects.requireNonNull(conditionType, "conditionType is required");
        }

        @Override
        public java.lang.String getConditionType() {
            return this.conditionType;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("conditionType", om.valueToTree(this.getConditionType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodReadinessGate"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodReadinessGate.Jsii$Proxy that = (PodReadinessGate.Jsii$Proxy) o;

            return this.conditionType.equals(that.conditionType);
        }

        @Override
        public int hashCode() {
            int result = this.conditionType.hashCode();
            return result;
        }
    }
}
