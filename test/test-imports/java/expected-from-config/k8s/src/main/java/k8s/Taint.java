package k8s;

/**
 * The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.449Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Taint")
@software.amazon.jsii.Jsii.Proxy(Taint.Jsii$Proxy.class)
public interface Taint extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required.
     * <p>
     * The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEffect();

    /**
     * Required.
     * <p>
     * The taint key to be applied to a node.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * TimeAdded represents the time at which the taint was added.
     * <p>
     * It is only written for NoExecute taints.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getTimeAdded() {
        return null;
    }

    /**
     * Required.
     * <p>
     * The taint value corresponding to the taint key.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Taint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Taint}
     */
    public static final class Builder {
        private java.lang.String effect;
        private java.lang.String key;
        private java.time.Instant timeAdded;
        private java.lang.String value;

        /**
         * Sets the value of {@link Taint#getEffect}
         * @param effect Required. This parameter is required.
         *               The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link Taint#getKey}
         * @param key Required. This parameter is required.
         *            The taint key to be applied to a node.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link Taint#getTimeAdded}
         * @param timeAdded TimeAdded represents the time at which the taint was added.
         *                  It is only written for NoExecute taints.
         * @return {@code this}
         */
        public Builder timeAdded(java.time.Instant timeAdded) {
            this.timeAdded = timeAdded;
            return this;
        }

        /**
         * Sets the value of {@link Taint#getValue}
         * @param value Required.
         *              The taint value corresponding to the taint key.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Taint}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Taint build() {
            return new Jsii$Proxy(effect, key, timeAdded, value);
        }
    }

    /**
     * An implementation for {@link Taint}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Taint {
        private final java.lang.String effect;
        private final java.lang.String key;
        private final java.time.Instant timeAdded;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.effect = this.jsiiGet("effect", java.lang.String.class);
            this.key = this.jsiiGet("key", java.lang.String.class);
            this.timeAdded = this.jsiiGet("timeAdded", java.time.Instant.class);
            this.value = this.jsiiGet("value", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String effect, final java.lang.String key, final java.time.Instant timeAdded, final java.lang.String value) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.effect = java.util.Objects.requireNonNull(effect, "effect is required");
            this.key = java.util.Objects.requireNonNull(key, "key is required");
            this.timeAdded = timeAdded;
            this.value = value;
        }

        @Override
        public java.lang.String getEffect() {
            return this.effect;
        }

        @Override
        public java.lang.String getKey() {
            return this.key;
        }

        @Override
        public java.time.Instant getTimeAdded() {
            return this.timeAdded;
        }

        @Override
        public java.lang.String getValue() {
            return this.value;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("effect", om.valueToTree(this.getEffect()));
            data.set("key", om.valueToTree(this.getKey()));
            if (this.getTimeAdded() != null) {
                data.set("timeAdded", om.valueToTree(this.getTimeAdded()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Taint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Taint.Jsii$Proxy that = (Taint.Jsii$Proxy) o;

            if (!effect.equals(that.effect)) return false;
            if (!key.equals(that.key)) return false;
            if (this.timeAdded != null ? !this.timeAdded.equals(that.timeAdded) : that.timeAdded != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public int hashCode() {
            int result = this.effect.hashCode();
            result = 31 * result + (this.key.hashCode());
            result = 31 * result + (this.timeAdded != null ? this.timeAdded.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
