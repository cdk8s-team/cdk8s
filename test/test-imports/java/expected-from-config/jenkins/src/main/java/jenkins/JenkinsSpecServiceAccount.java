package jenkins;

/**
 * ServiceAccount defines Jenkins master service account attributes.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.705Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecServiceAccount")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecServiceAccount.Jsii$Proxy.class)
public interface JenkinsSpecServiceAccount extends software.amazon.jsii.JsiiSerializable {

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
     * <p>
     * They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecServiceAccount}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecServiceAccount}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> annotations;

        /**
         * Sets the value of {@link JenkinsSpecServiceAccount#getAnnotations}
         * @param annotations Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
         *                    They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecServiceAccount}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecServiceAccount build() {
            return new Jsii$Proxy(annotations);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecServiceAccount}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecServiceAccount {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.annotations = this.jsiiGet("annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> annotations) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.annotations = annotations;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecServiceAccount"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecServiceAccount.Jsii$Proxy that = (JenkinsSpecServiceAccount.Jsii$Proxy) o;

            return this.annotations != null ? this.annotations.equals(that.annotations) : that.annotations == null;
        }

        @Override
        public int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            return result;
        }
    }
}
