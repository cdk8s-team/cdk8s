package clusterinstallation;

/**
 * Canary defines the configuration of Canary deployment for a ClusterInstallation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.359Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecCanary")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecCanary.Jsii$Proxy.class)
public interface ClusterInstallationSpecCanary extends software.amazon.jsii.JsiiSerializable {

    /**
     * Deployment defines the canary deployment.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecCanaryDeployment getDeployment() {
        return null;
    }

    /**
     * Enable defines if a canary build will be deployed.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecCanary}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecCanary}
     */
    public static final class Builder {
        private clusterinstallation.ClusterInstallationSpecCanaryDeployment deployment;
        private java.lang.Boolean enable;

        /**
         * Sets the value of {@link ClusterInstallationSpecCanary#getDeployment}
         * @param deployment Deployment defines the canary deployment.
         * @return {@code this}
         */
        public Builder deployment(clusterinstallation.ClusterInstallationSpecCanaryDeployment deployment) {
            this.deployment = deployment;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecCanary#getEnable}
         * @param enable Enable defines if a canary build will be deployed.
         * @return {@code this}
         */
        public Builder enable(java.lang.Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecCanary}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecCanary build() {
            return new Jsii$Proxy(deployment, enable);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecCanary}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecCanary {
        private final clusterinstallation.ClusterInstallationSpecCanaryDeployment deployment;
        private final java.lang.Boolean enable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deployment = this.jsiiGet("deployment", clusterinstallation.ClusterInstallationSpecCanaryDeployment.class);
            this.enable = this.jsiiGet("enable", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final clusterinstallation.ClusterInstallationSpecCanaryDeployment deployment, final java.lang.Boolean enable) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deployment = deployment;
            this.enable = enable;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecCanaryDeployment getDeployment() {
            return this.deployment;
        }

        @Override
        public java.lang.Boolean getEnable() {
            return this.enable;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeployment() != null) {
                data.set("deployment", om.valueToTree(this.getDeployment()));
            }
            if (this.getEnable() != null) {
                data.set("enable", om.valueToTree(this.getEnable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecCanary"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecCanary.Jsii$Proxy that = (ClusterInstallationSpecCanary.Jsii$Proxy) o;

            if (this.deployment != null ? !this.deployment.equals(that.deployment) : that.deployment != null) return false;
            return this.enable != null ? this.enable.equals(that.enable) : that.enable == null;
        }

        @Override
        public int hashCode() {
            int result = this.deployment != null ? this.deployment.hashCode() : 0;
            result = 31 * result + (this.enable != null ? this.enable.hashCode() : 0);
            return result;
        }
    }
}
