package jenkins;

/**
 * The SELinux context to be applied to all containers.
 * <p>
 * If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.640Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterSecurityContextSeLinuxOptions.Jsii$Proxy.class)
public interface JenkinsSpecMasterSecurityContextSeLinuxOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Level is SELinux level label that applies to the container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLevel() {
        return null;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRole() {
        return null;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * User is a SELinux user label that applies to the container.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterSecurityContextSeLinuxOptions}
     */
    public static final class Builder {
        private java.lang.String level;
        private java.lang.String role;
        private java.lang.String type;
        private java.lang.String user;

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions#getLevel}
         * @param level Level is SELinux level label that applies to the container.
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions#getRole}
         * @param role Role is a SELinux role label that applies to the container.
         * @return {@code this}
         */
        public Builder role(java.lang.String role) {
            this.role = role;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions#getType}
         * @param type Type is a SELinux type label that applies to the container.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions#getUser}
         * @param user User is a SELinux user label that applies to the container.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterSecurityContextSeLinuxOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterSecurityContextSeLinuxOptions build() {
            return new Jsii$Proxy(level, role, type, user);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterSecurityContextSeLinuxOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterSecurityContextSeLinuxOptions {
        private final java.lang.String level;
        private final java.lang.String role;
        private final java.lang.String type;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.level = this.jsiiGet("level", java.lang.String.class);
            this.role = this.jsiiGet("role", java.lang.String.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
            this.user = this.jsiiGet("user", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String level, final java.lang.String role, final java.lang.String type, final java.lang.String user) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.level = level;
            this.role = role;
            this.type = type;
            this.user = user;
        }

        @Override
        public java.lang.String getLevel() {
            return this.level;
        }

        @Override
        public java.lang.String getRole() {
            return this.role;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public java.lang.String getUser() {
            return this.user;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getLevel() != null) {
                data.set("level", om.valueToTree(this.getLevel()));
            }
            if (this.getRole() != null) {
                data.set("role", om.valueToTree(this.getRole()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterSecurityContextSeLinuxOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterSecurityContextSeLinuxOptions.Jsii$Proxy that = (JenkinsSpecMasterSecurityContextSeLinuxOptions.Jsii$Proxy) o;

            if (this.level != null ? !this.level.equals(that.level) : that.level != null) return false;
            if (this.role != null ? !this.role.equals(that.role) : that.role != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public int hashCode() {
            int result = this.level != null ? this.level.hashCode() : 0;
            result = 31 * result + (this.role != null ? this.role.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
