package k8s;

/**
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.381Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PriorityLevelConfigurationSpec")
@software.amazon.jsii.Jsii.Proxy(PriorityLevelConfigurationSpec.Jsii$Proxy.class)
public interface PriorityLevelConfigurationSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * `type` indicates whether this priority level is subject to limitation on request execution.
     * <p>
     * A value of <code>"Exempt"</code> means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of <code>"Limited"</code> means that (a) requests of this priority level <em>are</em> subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * `limited` specifies how requests are handled for a Limited priority level.
     * <p>
     * This field must be non-empty if and only if <code>type</code> is <code>"Limited"</code>.
     */
    default @org.jetbrains.annotations.Nullable k8s.LimitedPriorityLevelConfiguration getLimited() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PriorityLevelConfigurationSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PriorityLevelConfigurationSpec}
     */
    public static final class Builder {
        private java.lang.String type;
        private k8s.LimitedPriorityLevelConfiguration limited;

        /**
         * Sets the value of {@link PriorityLevelConfigurationSpec#getType}
         * @param type `type` indicates whether this priority level is subject to limitation on request execution. This parameter is required.
         *             A value of <code>"Exempt"</code> means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of <code>"Limited"</code> means that (a) requests of this priority level <em>are</em> subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link PriorityLevelConfigurationSpec#getLimited}
         * @param limited `limited` specifies how requests are handled for a Limited priority level.
         *                This field must be non-empty if and only if <code>type</code> is <code>"Limited"</code>.
         * @return {@code this}
         */
        public Builder limited(k8s.LimitedPriorityLevelConfiguration limited) {
            this.limited = limited;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PriorityLevelConfigurationSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PriorityLevelConfigurationSpec build() {
            return new Jsii$Proxy(type, limited);
        }
    }

    /**
     * An implementation for {@link PriorityLevelConfigurationSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PriorityLevelConfigurationSpec {
        private final java.lang.String type;
        private final k8s.LimitedPriorityLevelConfiguration limited;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = this.jsiiGet("type", java.lang.String.class);
            this.limited = this.jsiiGet("limited", k8s.LimitedPriorityLevelConfiguration.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String type, final k8s.LimitedPriorityLevelConfiguration limited) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.limited = limited;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public k8s.LimitedPriorityLevelConfiguration getLimited() {
            return this.limited;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getLimited() != null) {
                data.set("limited", om.valueToTree(this.getLimited()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PriorityLevelConfigurationSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PriorityLevelConfigurationSpec.Jsii$Proxy that = (PriorityLevelConfigurationSpec.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.limited != null ? this.limited.equals(that.limited) : that.limited == null;
        }

        @Override
        public int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.limited != null ? this.limited.hashCode() : 0);
            return result;
        }
    }
}
