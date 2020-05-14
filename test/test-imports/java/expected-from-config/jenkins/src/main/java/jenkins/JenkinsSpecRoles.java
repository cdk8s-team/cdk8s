package jenkins;

/**
 * RoleRef contains information that points to the role being used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.702Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecRoles")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecRoles.Jsii$Proxy.class)
public interface JenkinsSpecRoles extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIGroup is the group for the resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiGroup();

    /**
     * Kind is the type of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name is the name of resource being referenced.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * @return a {@link Builder} of {@link JenkinsSpecRoles}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecRoles}
     */
    public static final class Builder {
        private java.lang.String apiGroup;
        private java.lang.String kind;
        private java.lang.String name;

        /**
         * Sets the value of {@link JenkinsSpecRoles#getApiGroup}
         * @param apiGroup APIGroup is the group for the resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder apiGroup(java.lang.String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecRoles#getKind}
         * @param kind Kind is the type of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecRoles#getName}
         * @param name Name is the name of resource being referenced. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecRoles}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecRoles build() {
            return new Jsii$Proxy(apiGroup, kind, name);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecRoles}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecRoles {
        private final java.lang.String apiGroup;
        private final java.lang.String kind;
        private final java.lang.String name;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroup = this.jsiiGet("apiGroup", java.lang.String.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String apiGroup, final java.lang.String kind, final java.lang.String name) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroup = java.util.Objects.requireNonNull(apiGroup, "apiGroup is required");
            this.kind = java.util.Objects.requireNonNull(kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
        }

        @Override
        public java.lang.String getApiGroup() {
            return this.apiGroup;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiGroup", om.valueToTree(this.getApiGroup()));
            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecRoles"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecRoles.Jsii$Proxy that = (JenkinsSpecRoles.Jsii$Proxy) o;

            if (!apiGroup.equals(that.apiGroup)) return false;
            if (!kind.equals(that.kind)) return false;
            return this.name.equals(that.name);
        }

        @Override
        public int hashCode() {
            int result = this.apiGroup.hashCode();
            result = 31 * result + (this.kind.hashCode());
            result = 31 * result + (this.name.hashCode());
            return result;
        }
    }
}
