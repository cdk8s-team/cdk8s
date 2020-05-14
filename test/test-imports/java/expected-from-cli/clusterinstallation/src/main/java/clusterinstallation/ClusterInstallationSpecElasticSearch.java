package clusterinstallation;

/**
 * ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.378Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecElasticSearch")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecElasticSearch.Jsii$Proxy.class)
public interface ClusterInstallationSpecElasticSearch extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPassword() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUsername() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecElasticSearch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecElasticSearch}
     */
    public static final class Builder {
        private java.lang.String host;
        private java.lang.String password;
        private java.lang.String username;

        /**
         * Sets the value of {@link ClusterInstallationSpecElasticSearch#getHost}
         * @param host the value to be set.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecElasticSearch#getPassword}
         * @param password the value to be set.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecElasticSearch#getUsername}
         * @param username the value to be set.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecElasticSearch}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecElasticSearch build() {
            return new Jsii$Proxy(host, password, username);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecElasticSearch}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecElasticSearch {
        private final java.lang.String host;
        private final java.lang.String password;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.host = this.jsiiGet("host", java.lang.String.class);
            this.password = this.jsiiGet("password", java.lang.String.class);
            this.username = this.jsiiGet("username", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String host, final java.lang.String password, final java.lang.String username) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.host = host;
            this.password = password;
            this.username = username;
        }

        @Override
        public java.lang.String getHost() {
            return this.host;
        }

        @Override
        public java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public java.lang.String getUsername() {
            return this.username;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getPassword() != null) {
                data.set("password", om.valueToTree(this.getPassword()));
            }
            if (this.getUsername() != null) {
                data.set("username", om.valueToTree(this.getUsername()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecElasticSearch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecElasticSearch.Jsii$Proxy that = (ClusterInstallationSpecElasticSearch.Jsii$Proxy) o;

            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            if (this.password != null ? !this.password.equals(that.password) : that.password != null) return false;
            return this.username != null ? this.username.equals(that.username) : that.username == null;
        }

        @Override
        public int hashCode() {
            int result = this.host != null ? this.host.hashCode() : 0;
            result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
            result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
            return result;
        }
    }
}
