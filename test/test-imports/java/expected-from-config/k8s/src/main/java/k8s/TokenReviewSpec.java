package k8s;

/**
 * TokenReviewSpec is a description of the token authentication request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.452Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.TokenReviewSpec")
@software.amazon.jsii.Jsii.Proxy(TokenReviewSpec.Jsii$Proxy.class)
public interface TokenReviewSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Audiences is a list of the identifiers that the resource server presented with the token identifies as.
     * <p>
     * Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAudiences() {
        return null;
    }

    /**
     * Token is the opaque bearer token.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TokenReviewSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TokenReviewSpec}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> audiences;
        private java.lang.String token;

        /**
         * Sets the value of {@link TokenReviewSpec#getAudiences}
         * @param audiences Audiences is a list of the identifiers that the resource server presented with the token identifies as.
         *                  Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
         * @return {@code this}
         */
        public Builder audiences(java.util.List<java.lang.String> audiences) {
            this.audiences = audiences;
            return this;
        }

        /**
         * Sets the value of {@link TokenReviewSpec#getToken}
         * @param token Token is the opaque bearer token.
         * @return {@code this}
         */
        public Builder token(java.lang.String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TokenReviewSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public TokenReviewSpec build() {
            return new Jsii$Proxy(audiences, token);
        }
    }

    /**
     * An implementation for {@link TokenReviewSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TokenReviewSpec {
        private final java.util.List<java.lang.String> audiences;
        private final java.lang.String token;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.audiences = this.jsiiGet("audiences", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.token = this.jsiiGet("token", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> audiences, final java.lang.String token) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.audiences = audiences;
            this.token = token;
        }

        @Override
        public java.util.List<java.lang.String> getAudiences() {
            return this.audiences;
        }

        @Override
        public java.lang.String getToken() {
            return this.token;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAudiences() != null) {
                data.set("audiences", om.valueToTree(this.getAudiences()));
            }
            if (this.getToken() != null) {
                data.set("token", om.valueToTree(this.getToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TokenReviewSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TokenReviewSpec.Jsii$Proxy that = (TokenReviewSpec.Jsii$Proxy) o;

            if (this.audiences != null ? !this.audiences.equals(that.audiences) : that.audiences != null) return false;
            return this.token != null ? this.token.equals(that.token) : that.token == null;
        }

        @Override
        public int hashCode() {
            int result = this.audiences != null ? this.audiences.hashCode() : 0;
            result = 31 * result + (this.token != null ? this.token.hashCode() : 0);
            return result;
        }
    }
}
