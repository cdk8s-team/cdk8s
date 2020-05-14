package jenkins;

/**
 * Projection that may be projected along with other supported volume types.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.685Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMasterVolumesProjectedSources")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMasterVolumesProjectedSources.Jsii$Proxy.class)
public interface JenkinsSpecMasterVolumesProjectedSources extends software.amazon.jsii.JsiiSerializable {

    /**
     * information about the configMap data to project.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap getConfigMap() {
        return null;
    }

    /**
     * information about the downwardAPI data to project.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi getDownwardApi() {
        return null;
    }

    /**
     * information about the secret data to project.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret getSecret() {
        return null;
    }

    /**
     * information about the serviceAccountToken data to project.
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMasterVolumesProjectedSources}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMasterVolumesProjectedSources}
     */
    public static final class Builder {
        private jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap configMap;
        private jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi downwardApi;
        private jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret secret;
        private jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjectedSources#getConfigMap}
         * @param configMap information about the configMap data to project.
         * @return {@code this}
         */
        public Builder configMap(jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap configMap) {
            this.configMap = configMap;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjectedSources#getDownwardApi}
         * @param downwardApi information about the downwardAPI data to project.
         * @return {@code this}
         */
        public Builder downwardApi(jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi downwardApi) {
            this.downwardApi = downwardApi;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjectedSources#getSecret}
         * @param secret information about the secret data to project.
         * @return {@code this}
         */
        public Builder secret(jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMasterVolumesProjectedSources#getServiceAccountToken}
         * @param serviceAccountToken information about the serviceAccountToken data to project.
         * @return {@code this}
         */
        public Builder serviceAccountToken(jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMasterVolumesProjectedSources}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMasterVolumesProjectedSources build() {
            return new Jsii$Proxy(configMap, downwardApi, secret, serviceAccountToken);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMasterVolumesProjectedSources}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMasterVolumesProjectedSources {
        private final jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap configMap;
        private final jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi downwardApi;
        private final jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret secret;
        private final jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configMap = this.jsiiGet("configMap", jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap.class);
            this.downwardApi = this.jsiiGet("downwardAPI", jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi.class);
            this.secret = this.jsiiGet("secret", jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret.class);
            this.serviceAccountToken = this.jsiiGet("serviceAccountToken", jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap configMap, final jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi downwardApi, final jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret secret, final jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configMap = configMap;
            this.downwardApi = downwardApi;
            this.secret = secret;
            this.serviceAccountToken = serviceAccountToken;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesProjectedSourcesConfigMap getConfigMap() {
            return this.configMap;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesProjectedSourcesDownwardApi getDownwardApi() {
            return this.downwardApi;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesProjectedSourcesSecret getSecret() {
            return this.secret;
        }

        @Override
        public jenkins.JenkinsSpecMasterVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
            return this.serviceAccountToken;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigMap() != null) {
                data.set("configMap", om.valueToTree(this.getConfigMap()));
            }
            if (this.getDownwardApi() != null) {
                data.set("downwardAPI", om.valueToTree(this.getDownwardApi()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getServiceAccountToken() != null) {
                data.set("serviceAccountToken", om.valueToTree(this.getServiceAccountToken()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMasterVolumesProjectedSources"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMasterVolumesProjectedSources.Jsii$Proxy that = (JenkinsSpecMasterVolumesProjectedSources.Jsii$Proxy) o;

            if (this.configMap != null ? !this.configMap.equals(that.configMap) : that.configMap != null) return false;
            if (this.downwardApi != null ? !this.downwardApi.equals(that.downwardApi) : that.downwardApi != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            return this.serviceAccountToken != null ? this.serviceAccountToken.equals(that.serviceAccountToken) : that.serviceAccountToken == null;
        }

        @Override
        public int hashCode() {
            int result = this.configMap != null ? this.configMap.hashCode() : 0;
            result = 31 * result + (this.downwardApi != null ? this.downwardApi.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.serviceAccountToken != null ? this.serviceAccountToken.hashCode() : 0);
            return result;
        }
    }
}
