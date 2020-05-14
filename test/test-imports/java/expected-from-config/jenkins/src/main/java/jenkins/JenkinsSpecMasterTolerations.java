package jenkins;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.641Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterTolerations")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterTolerations.Jsii$Proxy.class)
public interface JenkinsSpecMasterTolerations extends software.amazon.jsii.JsiiSerializable {

    /**
     * Effect indicates the taint effect to match.
     * <p>
     * Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEffect() {
        return null;
    }

    /**
     * Key is the taint key that the toleration applies to.
     * <p>
     * Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKey() {
        return null;
    }

    /**
     * Operator represents a key's relationship to the value.
     * <p>
     * Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * <p>
     * Default: Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOperator() {
        return null;
    }

    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
     * <p>
     * By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTolerationSeconds() {
        return null;
    }

    /**
     * Value is the taint value the toleration matches to.
     * <p>
     * If the operator is Exists, the value should be empty, otherwise just a regular string.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterTolerations}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterTolerations}
     */
    public static final class Builder {
        private java.lang.String effect;
        private java.lang.String key;
        private java.lang.String operator;
        private java.lang.Number tolerationSeconds;
        private java.lang.String value;

        /**
         * Sets the value of {@link JenkinsSpecMasterTolerations#getEffect}
         * @param effect Effect indicates the taint effect to match.
         *               Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
         * @return {@code this}
         */
        public Builder effect(java.lang.String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterTolerations#getKey}
         * @param key Key is the taint key that the toleration applies to.
         *            Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterTolerations#getOperator}
         * @param operator Operator represents a key's relationship to the value.
         *                 Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterTolerations#getTolerationSeconds}
         * @param tolerationSeconds TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
         *                          By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
         * @return {@code this}
         */
        public Builder tolerationSeconds(java.lang.Number tolerationSeconds) {
            this.tolerationSeconds = tolerationSeconds;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterTolerations#getValue}
         * @param value Value is the taint value the toleration matches to.
         *              If the operator is Exists, the value should be empty, otherwise just a regular string.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterTolerations}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterTolerations build() {
            return new Jsii$Proxy(effect, key, operator, tolerationSeconds, value);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterTolerations}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterTolerations {
        private final java.lang.String effect;
        private final java.lang.String key;
        private final java.lang.String operator;
        private final java.lang.Number tolerationSeconds;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.effect = this.jsiiGet("effect", java.lang.String.class);
            this.key = this.jsiiGet("key", java.lang.String.class);
            this.operator = this.jsiiGet("operator", java.lang.String.class);
            this.tolerationSeconds = this.jsiiGet("tolerationSeconds", java.lang.Number.class);
            this.value = this.jsiiGet("value", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String effect, final java.lang.String key, final java.lang.String operator, final java.lang.Number tolerationSeconds, final java.lang.String value) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.effect = effect;
            this.key = key;
            this.operator = operator;
            this.tolerationSeconds = tolerationSeconds;
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
        public java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public java.lang.Number getTolerationSeconds() {
            return this.tolerationSeconds;
        }

        @Override
        public java.lang.String getValue() {
            return this.value;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEffect() != null) {
                data.set("effect", om.valueToTree(this.getEffect()));
            }
            if (this.getKey() != null) {
                data.set("key", om.valueToTree(this.getKey()));
            }
            if (this.getOperator() != null) {
                data.set("operator", om.valueToTree(this.getOperator()));
            }
            if (this.getTolerationSeconds() != null) {
                data.set("tolerationSeconds", om.valueToTree(this.getTolerationSeconds()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterTolerations"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterTolerations.Jsii$Proxy that = (JenkinsSpecMasterTolerations.Jsii$Proxy) o;

            if (this.effect != null ? !this.effect.equals(that.effect) : that.effect != null) return false;
            if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;
            if (this.operator != null ? !this.operator.equals(that.operator) : that.operator != null) return false;
            if (this.tolerationSeconds != null ? !this.tolerationSeconds.equals(that.tolerationSeconds) : that.tolerationSeconds != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public int hashCode() {
            int result = this.effect != null ? this.effect.hashCode() : 0;
            result = 31 * result + (this.key != null ? this.key.hashCode() : 0);
            result = 31 * result + (this.operator != null ? this.operator.hashCode() : 0);
            result = 31 * result + (this.tolerationSeconds != null ? this.tolerationSeconds.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
