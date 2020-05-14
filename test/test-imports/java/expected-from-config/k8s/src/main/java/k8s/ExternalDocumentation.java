package k8s;

/**
 * ExternalDocumentation allows referencing an external resource for extended documentation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.220Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ExternalDocumentation")
@software.amazon.jsii.Jsii.Proxy(ExternalDocumentation.Jsii$Proxy.class)
public interface ExternalDocumentation extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUrl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ExternalDocumentation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ExternalDocumentation}
     */
    public static final class Builder {
        private java.lang.String description;
        private java.lang.String url;

        /**
         * Sets the value of {@link ExternalDocumentation#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link ExternalDocumentation#getUrl}
         * @param url the value to be set.
         * @return {@code this}
         */
        public Builder url(java.lang.String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ExternalDocumentation}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ExternalDocumentation build() {
            return new Jsii$Proxy(description, url);
        }
    }

    /**
     * An implementation for {@link ExternalDocumentation}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ExternalDocumentation {
        private final java.lang.String description;
        private final java.lang.String url;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.description = this.jsiiGet("description", java.lang.String.class);
            this.url = this.jsiiGet("url", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String description, final java.lang.String url) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = description;
            this.url = url;
        }

        @Override
        public java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public java.lang.String getUrl() {
            return this.url;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getUrl() != null) {
                data.set("url", om.valueToTree(this.getUrl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ExternalDocumentation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ExternalDocumentation.Jsii$Proxy that = (ExternalDocumentation.Jsii$Proxy) o;

            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            return this.url != null ? this.url.equals(that.url) : that.url == null;
        }

        @Override
        public int hashCode() {
            int result = this.description != null ? this.description.hashCode() : 0;
            result = 31 * result + (this.url != null ? this.url.hashCode() : 0);
            return result;
        }
    }
}
