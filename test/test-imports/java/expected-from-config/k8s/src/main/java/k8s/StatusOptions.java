package k8s;

/**
 * Status is a return value for calls that don't return other objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.440Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.StatusOptions")
@software.amazon.jsii.Jsii.Proxy(StatusOptions.Jsii$Proxy.class)
public interface StatusOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Suggested HTTP return code for this status, 0 if not set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCode() {
        return null;
    }

    /**
     * Extended data associated with the reason.
     * <p>
     * Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
     */
    default @org.jetbrains.annotations.Nullable k8s.StatusDetails getDetails() {
        return null;
    }

    /**
     * A human-readable description of the status of this operation.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * Standard list metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * A machine-readable description of why this operation is in the "Failure" status.
     * <p>
     * If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatusOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatusOptions}
     */
    public static final class Builder {
        private java.lang.Number code;
        private k8s.StatusDetails details;
        private java.lang.String message;
        private k8s.ListMeta metadata;
        private java.lang.String reason;

        /**
         * Sets the value of {@link StatusOptions#getCode}
         * @param code Suggested HTTP return code for this status, 0 if not set.
         * @return {@code this}
         */
        public Builder code(java.lang.Number code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the value of {@link StatusOptions#getDetails}
         * @param details Extended data associated with the reason.
         *                Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
         * @return {@code this}
         */
        public Builder details(k8s.StatusDetails details) {
            this.details = details;
            return this;
        }

        /**
         * Sets the value of {@link StatusOptions#getMessage}
         * @param message A human-readable description of the status of this operation.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Sets the value of {@link StatusOptions#getMetadata}
         * @param metadata Standard list metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder metadata(k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link StatusOptions#getReason}
         * @param reason A machine-readable description of why this operation is in the "Failure" status.
         *               If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatusOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public StatusOptions build() {
            return new Jsii$Proxy(code, details, message, metadata, reason);
        }
    }

    /**
     * An implementation for {@link StatusOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatusOptions {
        private final java.lang.Number code;
        private final k8s.StatusDetails details;
        private final java.lang.String message;
        private final k8s.ListMeta metadata;
        private final java.lang.String reason;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.code = this.jsiiGet("code", java.lang.Number.class);
            this.details = this.jsiiGet("details", k8s.StatusDetails.class);
            this.message = this.jsiiGet("message", java.lang.String.class);
            this.metadata = this.jsiiGet("metadata", k8s.ListMeta.class);
            this.reason = this.jsiiGet("reason", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number code, final k8s.StatusDetails details, final java.lang.String message, final k8s.ListMeta metadata, final java.lang.String reason) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.code = code;
            this.details = details;
            this.message = message;
            this.metadata = metadata;
            this.reason = reason;
        }

        @Override
        public java.lang.Number getCode() {
            return this.code;
        }

        @Override
        public k8s.StatusDetails getDetails() {
            return this.details;
        }

        @Override
        public java.lang.String getMessage() {
            return this.message;
        }

        @Override
        public k8s.ListMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.lang.String getReason() {
            return this.reason;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCode() != null) {
                data.set("code", om.valueToTree(this.getCode()));
            }
            if (this.getDetails() != null) {
                data.set("details", om.valueToTree(this.getDetails()));
            }
            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatusOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatusOptions.Jsii$Proxy that = (StatusOptions.Jsii$Proxy) o;

            if (this.code != null ? !this.code.equals(that.code) : that.code != null) return false;
            if (this.details != null ? !this.details.equals(that.details) : that.details != null) return false;
            if (this.message != null ? !this.message.equals(that.message) : that.message != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.reason != null ? this.reason.equals(that.reason) : that.reason == null;
        }

        @Override
        public int hashCode() {
            int result = this.code != null ? this.code.hashCode() : 0;
            result = 31 * result + (this.details != null ? this.details.hashCode() : 0);
            result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            return result;
        }
    }
}
