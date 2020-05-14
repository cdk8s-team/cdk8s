package jenkins;

/**
 * Plugin defines Jenkins plugin.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.638Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterPlugins")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterPlugins.Jsii$Proxy.class)
public interface JenkinsSpecMasterPlugins extends software.amazon.jsii.JsiiSerializable {

    /**
     * Name is the name of Jenkins plugin.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Version is the version of Jenkins plugin.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVersion();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterPlugins}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterPlugins}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.String version;

        /**
         * Sets the value of {@link JenkinsSpecMasterPlugins#getName}
         * @param name Name is the name of Jenkins plugin. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterPlugins#getVersion}
         * @param version Version is the version of Jenkins plugin. This parameter is required.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterPlugins}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterPlugins build() {
            return new Jsii$Proxy(name, version);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterPlugins}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterPlugins {
        private final java.lang.String name;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.version = this.jsiiGet("version", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.String version) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.version = java.util.Objects.requireNonNull(version, "version is required");
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("version", om.valueToTree(this.getVersion()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterPlugins"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterPlugins.Jsii$Proxy that = (JenkinsSpecMasterPlugins.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.version.equals(that.version);
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.version.hashCode());
            return result;
        }
    }
}
