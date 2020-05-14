package jenkins;

/**
 * Jenkins is the Schema for the jenkins API.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.586Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsOptions")
@software.amazon.jsii.Jsii.Proxy(JenkinsOptions.Jsii$Proxy.class)
public interface JenkinsOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMetadata() {
        return null;
    }

    /**
     * Spec defines the desired state of the Jenkins.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsOptions}
     */
    public static final class Builder {
        private java.lang.Object metadata;
        private jenkins.JenkinsSpec spec;

        /**
         * Sets the value of {@link JenkinsOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsOptions#getSpec}
         * @param spec Spec defines the desired state of the Jenkins.
         * @return {@code this}
         */
        public Builder spec(jenkins.JenkinsSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link JenkinsOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsOptions {
        private final java.lang.Object metadata;
        private final jenkins.JenkinsSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", java.lang.Object.class);
            this.spec = this.jsiiGet("spec", jenkins.JenkinsSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Object metadata, final jenkins.JenkinsSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public java.lang.Object getMetadata() {
            return this.metadata;
        }

        @Override
        public jenkins.JenkinsSpec getSpec() {
            return this.spec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsOptions.Jsii$Proxy that = (JenkinsOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
