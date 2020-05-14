package k8s;

/**
 * Information about the condition of a component.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.131Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ComponentCondition")
@software.amazon.jsii.Jsii.Proxy(ComponentCondition.Jsii$Proxy.class)
public interface ComponentCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Status of the condition for a component.
     * <p>
     * Valid values for "Healthy": "True", "False", or "Unknown".
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStatus();

    /**
     * Type of condition for a component.
     * <p>
     * Valid value: "Healthy"
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Condition error code for a component.
     * <p>
     * For example, a health check error code.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getError() {
        return null;
    }

    /**
     * Message about the condition for a component.
     * <p>
     * For example, information about a health check.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ComponentCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ComponentCondition}
     */
    public static final class Builder {
        private java.lang.String status;
        private java.lang.String type;
        private java.lang.String error;
        private java.lang.String message;

        /**
         * Sets the value of {@link ComponentCondition#getStatus}
         * @param status Status of the condition for a component. This parameter is required.
         *               Valid values for "Healthy": "True", "False", or "Unknown".
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Sets the value of {@link ComponentCondition#getType}
         * @param type Type of condition for a component. This parameter is required.
         *             Valid value: "Healthy"
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link ComponentCondition#getError}
         * @param error Condition error code for a component.
         *              For example, a health check error code.
         * @return {@code this}
         */
        public Builder error(java.lang.String error) {
            this.error = error;
            return this;
        }

        /**
         * Sets the value of {@link ComponentCondition#getMessage}
         * @param message Message about the condition for a component.
         *                For example, information about a health check.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ComponentCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ComponentCondition build() {
            return new Jsii$Proxy(status, type, error, message);
        }
    }

    /**
     * An implementation for {@link ComponentCondition}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ComponentCondition {
        private final java.lang.String status;
        private final java.lang.String type;
        private final java.lang.String error;
        private final java.lang.String message;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = this.jsiiGet("status", java.lang.String.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
            this.error = this.jsiiGet("error", java.lang.String.class);
            this.message = this.jsiiGet("message", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String status, final java.lang.String type, final java.lang.String error, final java.lang.String message) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = java.util.Objects.requireNonNull(status, "status is required");
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.error = error;
            this.message = message;
        }

        @Override
        public java.lang.String getStatus() {
            return this.status;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public java.lang.String getError() {
            return this.error;
        }

        @Override
        public java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("status", om.valueToTree(this.getStatus()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getError() != null) {
                data.set("error", om.valueToTree(this.getError()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ComponentCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ComponentCondition.Jsii$Proxy that = (ComponentCondition.Jsii$Proxy) o;

            if (!status.equals(that.status)) return false;
            if (!type.equals(that.type)) return false;
            if (this.error != null ? !this.error.equals(that.error) : that.error != null) return false;
            return this.message != null ? this.message.equals(that.message) : that.message == null;
        }

        @Override
        public int hashCode() {
            int result = this.status.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.error != null ? this.error.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            return result;
        }
    }
}
