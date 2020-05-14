package clusterinstallation;

/**
 * Green defines the green deployment.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.358Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecBlueGreenGreen")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecBlueGreenGreen.Jsii$Proxy.class)
public interface ClusterInstallationSpecBlueGreenGreen extends software.amazon.jsii.JsiiSerializable {

    /**
     * Image defines the base Docker image that will be used for the deployment.
     * <p>
     * Required when BlueGreen or Canary is enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     * IngressName defines the ingress name that will be used by the deployment.
     * <p>
     * This option is not used for Canary builds.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIngressName() {
        return null;
    }

    /**
     * Name defines the name of the deployment.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Version defines the Docker image version that will be used for the deployment.
     * <p>
     * Required when BlueGreen or Canary is enabled.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecBlueGreenGreen}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecBlueGreenGreen}
     */
    public static final class Builder {
        private java.lang.String image;
        private java.lang.String ingressName;
        private java.lang.String name;
        private java.lang.String version;

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreenGreen#getImage}
         * @param image Image defines the base Docker image that will be used for the deployment.
         *              Required when BlueGreen or Canary is enabled.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreenGreen#getIngressName}
         * @param ingressName IngressName defines the ingress name that will be used by the deployment.
         *                    This option is not used for Canary builds.
         * @return {@code this}
         */
        public Builder ingressName(java.lang.String ingressName) {
            this.ingressName = ingressName;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreenGreen#getName}
         * @param name Name defines the name of the deployment.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecBlueGreenGreen#getVersion}
         * @param version Version defines the Docker image version that will be used for the deployment.
         *                Required when BlueGreen or Canary is enabled.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecBlueGreenGreen}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecBlueGreenGreen build() {
            return new Jsii$Proxy(image, ingressName, name, version);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecBlueGreenGreen}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecBlueGreenGreen {
        private final java.lang.String image;
        private final java.lang.String ingressName;
        private final java.lang.String name;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.image = this.jsiiGet("image", java.lang.String.class);
            this.ingressName = this.jsiiGet("ingressName", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.version = this.jsiiGet("version", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String image, final java.lang.String ingressName, final java.lang.String name, final java.lang.String version) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.image = image;
            this.ingressName = ingressName;
            this.name = name;
            this.version = version;
        }

        @Override
        public java.lang.String getImage() {
            return this.image;
        }

        @Override
        public java.lang.String getIngressName() {
            return this.ingressName;
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

            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getIngressName() != null) {
                data.set("ingressName", om.valueToTree(this.getIngressName()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecBlueGreenGreen"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecBlueGreenGreen.Jsii$Proxy that = (ClusterInstallationSpecBlueGreenGreen.Jsii$Proxy) o;

            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            if (this.ingressName != null ? !this.ingressName.equals(that.ingressName) : that.ingressName != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public int hashCode() {
            int result = this.image != null ? this.image.hashCode() : 0;
            result = 31 * result + (this.ingressName != null ? this.ingressName.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
