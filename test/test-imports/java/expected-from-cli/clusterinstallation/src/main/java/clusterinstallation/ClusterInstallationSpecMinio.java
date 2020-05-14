package clusterinstallation;

/**
 * Minio defines the configuration of Minio for a ClusterInstallation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.392Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecMinio")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecMinio.Jsii$Proxy.class)
public interface ClusterInstallationSpecMinio extends software.amazon.jsii.JsiiSerializable {

    /**
     * Set to the bucket name of your external MinIO or S3.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalBucket() {
        return null;
    }

    /**
     * Set to use an external MinIO deployment or S3.
     * <p>
     * Must also set 'Secret' and 'ExternalBucket'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalUrl() {
        return null;
    }

    /**
     * Defines the number of Minio replicas.
     * <p>
     * Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * Defines the resource requests and limits for the Minio pods.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMinioResources getResources() {
        return null;
    }

    /**
     * Optionally enter the name of already existing secret.
     * <p>
     * Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecret() {
        return null;
    }

    /**
     * Defines the storage size for Minio.
     * <p>
     * ie 50Gi
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageSize() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecMinio}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecMinio}
     */
    public static final class Builder {
        private java.lang.String externalBucket;
        private java.lang.String externalUrl;
        private java.lang.Number replicas;
        private clusterinstallation.ClusterInstallationSpecMinioResources resources;
        private java.lang.String secret;
        private java.lang.String storageSize;

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getExternalBucket}
         * @param externalBucket Set to the bucket name of your external MinIO or S3.
         * @return {@code this}
         */
        public Builder externalBucket(java.lang.String externalBucket) {
            this.externalBucket = externalBucket;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getExternalUrl}
         * @param externalUrl Set to use an external MinIO deployment or S3.
         *                    Must also set 'Secret' and 'ExternalBucket'.
         * @return {@code this}
         */
        public Builder externalUrl(java.lang.String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getReplicas}
         * @param replicas Defines the number of Minio replicas.
         *                 Supply 1 to run Minio in standalone mode with no redundancy. Supply 4 or more to run Minio in distributed mode. Note that it is not possible to upgrade Minio from standalone to distributed mode. Setting this will override the number of replicas set by 'Size'. More info: https://docs.min.io/docs/distributed-minio-quickstart-guide.html
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getResources}
         * @param resources Defines the resource requests and limits for the Minio pods.
         * @return {@code this}
         */
        public Builder resources(clusterinstallation.ClusterInstallationSpecMinioResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getSecret}
         * @param secret Optionally enter the name of already existing secret.
         *               Secret should have two values: "accesskey" and "secretkey". Required when "ExternalURL" is set.
         * @return {@code this}
         */
        public Builder secret(java.lang.String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecMinio#getStorageSize}
         * @param storageSize Defines the storage size for Minio.
         *                    ie 50Gi
         * @return {@code this}
         */
        public Builder storageSize(java.lang.String storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecMinio}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecMinio build() {
            return new Jsii$Proxy(externalBucket, externalUrl, replicas, resources, secret, storageSize);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecMinio}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecMinio {
        private final java.lang.String externalBucket;
        private final java.lang.String externalUrl;
        private final java.lang.Number replicas;
        private final clusterinstallation.ClusterInstallationSpecMinioResources resources;
        private final java.lang.String secret;
        private final java.lang.String storageSize;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.externalBucket = this.jsiiGet("externalBucket", java.lang.String.class);
            this.externalUrl = this.jsiiGet("externalURL", java.lang.String.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.resources = this.jsiiGet("resources", clusterinstallation.ClusterInstallationSpecMinioResources.class);
            this.secret = this.jsiiGet("secret", java.lang.String.class);
            this.storageSize = this.jsiiGet("storageSize", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String externalBucket, final java.lang.String externalUrl, final java.lang.Number replicas, final clusterinstallation.ClusterInstallationSpecMinioResources resources, final java.lang.String secret, final java.lang.String storageSize) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.externalBucket = externalBucket;
            this.externalUrl = externalUrl;
            this.replicas = replicas;
            this.resources = resources;
            this.secret = secret;
            this.storageSize = storageSize;
        }

        @Override
        public java.lang.String getExternalBucket() {
            return this.externalBucket;
        }

        @Override
        public java.lang.String getExternalUrl() {
            return this.externalUrl;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMinioResources getResources() {
            return this.resources;
        }

        @Override
        public java.lang.String getSecret() {
            return this.secret;
        }

        @Override
        public java.lang.String getStorageSize() {
            return this.storageSize;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExternalBucket() != null) {
                data.set("externalBucket", om.valueToTree(this.getExternalBucket()));
            }
            if (this.getExternalUrl() != null) {
                data.set("externalURL", om.valueToTree(this.getExternalUrl()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getSecret() != null) {
                data.set("secret", om.valueToTree(this.getSecret()));
            }
            if (this.getStorageSize() != null) {
                data.set("storageSize", om.valueToTree(this.getStorageSize()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecMinio"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecMinio.Jsii$Proxy that = (ClusterInstallationSpecMinio.Jsii$Proxy) o;

            if (this.externalBucket != null ? !this.externalBucket.equals(that.externalBucket) : that.externalBucket != null) return false;
            if (this.externalUrl != null ? !this.externalUrl.equals(that.externalUrl) : that.externalUrl != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            return this.storageSize != null ? this.storageSize.equals(that.storageSize) : that.storageSize == null;
        }

        @Override
        public int hashCode() {
            int result = this.externalBucket != null ? this.externalBucket.hashCode() : 0;
            result = 31 * result + (this.externalUrl != null ? this.externalUrl.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.storageSize != null ? this.storageSize.hashCode() : 0);
            return result;
        }
    }
}
