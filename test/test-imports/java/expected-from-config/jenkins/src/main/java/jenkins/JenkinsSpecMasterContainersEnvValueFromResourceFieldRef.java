package jenkins;

/**
 * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.604Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterContainersEnvValueFromResourceFieldRef.Jsii$Proxy.class)
public interface JenkinsSpecMasterContainersEnvValueFromResourceFieldRef extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: resource to select.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getResource();

    /**
     * Container name: required for volumes, optional for env vars.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContainerName() {
        return null;
    }

    /**
     * Specifies the output format of the exposed resources, defaults to "1".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDivisor() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef}
     */
    public static final class Builder {
        private java.lang.String resource;
        private java.lang.String containerName;
        private java.lang.String divisor;

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#getResource}
         * @param resource Required: resource to select. This parameter is required.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#getContainerName}
         * @param containerName Container name: required for volumes, optional for env vars.
         * @return {@code this}
         */
        public Builder containerName(java.lang.String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef#getDivisor}
         * @param divisor Specifies the output format of the exposed resources, defaults to "1".
         * @return {@code this}
         */
        public Builder divisor(java.lang.String divisor) {
            this.divisor = divisor;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterContainersEnvValueFromResourceFieldRef build() {
            return new Jsii$Proxy(resource, containerName, divisor);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterContainersEnvValueFromResourceFieldRef}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterContainersEnvValueFromResourceFieldRef {
        private final java.lang.String resource;
        private final java.lang.String containerName;
        private final java.lang.String divisor;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resource = this.jsiiGet("resource", java.lang.String.class);
            this.containerName = this.jsiiGet("containerName", java.lang.String.class);
            this.divisor = this.jsiiGet("divisor", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String resource, final java.lang.String containerName, final java.lang.String divisor) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resource = java.util.Objects.requireNonNull(resource, "resource is required");
            this.containerName = containerName;
            this.divisor = divisor;
        }

        @Override
        public java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public java.lang.String getContainerName() {
            return this.containerName;
        }

        @Override
        public java.lang.String getDivisor() {
            return this.divisor;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("resource", om.valueToTree(this.getResource()));
            if (this.getContainerName() != null) {
                data.set("containerName", om.valueToTree(this.getContainerName()));
            }
            if (this.getDivisor() != null) {
                data.set("divisor", om.valueToTree(this.getDivisor()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterContainersEnvValueFromResourceFieldRef"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterContainersEnvValueFromResourceFieldRef.Jsii$Proxy that = (JenkinsSpecMasterContainersEnvValueFromResourceFieldRef.Jsii$Proxy) o;

            if (!resource.equals(that.resource)) return false;
            if (this.containerName != null ? !this.containerName.equals(that.containerName) : that.containerName != null) return false;
            return this.divisor != null ? this.divisor.equals(that.divisor) : that.divisor == null;
        }

        @Override
        public int hashCode() {
            int result = this.resource.hashCode();
            result = 31 * result + (this.containerName != null ? this.containerName.hashCode() : 0);
            result = 31 * result + (this.divisor != null ? this.divisor.hashCode() : 0);
            return result;
        }
    }
}
