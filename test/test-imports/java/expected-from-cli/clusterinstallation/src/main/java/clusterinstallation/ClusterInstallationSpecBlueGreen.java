package clusterinstallation;

/**
 * BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.356Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecBlueGreen")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecBlueGreen.Jsii$Proxy.class)
public interface ClusterInstallationSpecBlueGreen extends software.amazon.jsii.JsiiSerializable {

    /**
     * Blue defines the blue deployment.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecBlueGreenBlue getBlue() {
        return null;
    }

    /**
     * Enable defines if BlueGreen deployment will be applied.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnable() {
        return null;
    }

    /**
     * Green defines the green deployment.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecBlueGreenGreen getGreen() {
        return null;
    }

    /**
     * ProductionDeployment defines if the current production is blue or green.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProductionDeployment() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecBlueGreen}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecBlueGreen}
     */
    public static final class Builder {
        private clusterinstallation.ClusterInstallationSpecBlueGreenBlue blue;
        private java.lang.Boolean enable;
        private clusterinstallation.ClusterInstallationSpecBlueGreenGreen green;
        private java.lang.String productionDeployment;

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreen#getBlue}
         * @param blue Blue defines the blue deployment.
         * @return {@code this}
         */
        public Builder blue(clusterinstallation.ClusterInstallationSpecBlueGreenBlue blue) {
            this.blue = blue;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreen#getEnable}
         * @param enable Enable defines if BlueGreen deployment will be applied.
         * @return {@code this}
         */
        public Builder enable(java.lang.Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreen#getGreen}
         * @param green Green defines the green deployment.
         * @return {@code this}
         */
        public Builder green(clusterinstallation.ClusterInstallationSpecBlueGreenGreen green) {
            this.green = green;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreen#getProductionDeployment}
         * @param productionDeployment ProductionDeployment defines if the current production is blue or green.
         * @return {@code this}
         */
        public Builder productionDeployment(java.lang.String productionDeployment) {
            this.productionDeployment = productionDeployment;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecBlueGreen}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecBlueGreen build() {
            return new Jsii$Proxy(blue, enable, green, productionDeployment);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecBlueGreen}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecBlueGreen {
        private final clusterinstallation.ClusterInstallationSpecBlueGreenBlue blue;
        private final java.lang.Boolean enable;
        private final clusterinstallation.ClusterInstallationSpecBlueGreenGreen green;
        private final java.lang.String productionDeployment;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.blue = this.jsiiGet("blue", clusterinstallation.ClusterInstallationSpecBlueGreenBlue.class);
            this.enable = this.jsiiGet("enable", java.lang.Boolean.class);
            this.green = this.jsiiGet("green", clusterinstallation.ClusterInstallationSpecBlueGreenGreen.class);
            this.productionDeployment = this.jsiiGet("productionDeployment", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final clusterinstallation.ClusterInstallationSpecBlueGreenBlue blue, final java.lang.Boolean enable, final clusterinstallation.ClusterInstallationSpecBlueGreenGreen green, final java.lang.String productionDeployment) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.blue = blue;
            this.enable = enable;
            this.green = green;
            this.productionDeployment = productionDeployment;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecBlueGreenBlue getBlue() {
            return this.blue;
        }

        @Override
        public java.lang.Boolean getEnable() {
            return this.enable;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecBlueGreenGreen getGreen() {
            return this.green;
        }

        @Override
        public java.lang.String getProductionDeployment() {
            return this.productionDeployment;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBlue() != null) {
                data.set("blue", om.valueToTree(this.getBlue()));
            }
            if (this.getEnable() != null) {
                data.set("enable", om.valueToTree(this.getEnable()));
            }
            if (this.getGreen() != null) {
                data.set("green", om.valueToTree(this.getGreen()));
            }
            if (this.getProductionDeployment() != null) {
                data.set("productionDeployment", om.valueToTree(this.getProductionDeployment()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecBlueGreen"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecBlueGreen.Jsii$Proxy that = (ClusterInstallationSpecBlueGreen.Jsii$Proxy) o;

            if (this.blue != null ? !this.blue.equals(that.blue) : that.blue != null) return false;
            if (this.enable != null ? !this.enable.equals(that.enable) : that.enable != null) return false;
            if (this.green != null ? !this.green.equals(that.green) : that.green != null) return false;
            return this.productionDeployment != null ? this.productionDeployment.equals(that.productionDeployment) : that.productionDeployment == null;
        }

        @Override
        public int hashCode() {
            int result = this.blue != null ? this.blue.hashCode() : 0;
            result = 31 * result + (this.enable != null ? this.enable.hashCode() : 0);
            result = 31 * result + (this.green != null ? this.green.hashCode() : 0);
            result = 31 * result + (this.productionDeployment != null ? this.productionDeployment.hashCode() : 0);
            return result;
        }
    }
}
