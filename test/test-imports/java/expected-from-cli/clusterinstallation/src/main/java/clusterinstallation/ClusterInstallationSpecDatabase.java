package clusterinstallation;

/**
 * Database defines the database configuration for a ClusterInstallation.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.360Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecDatabase")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecDatabase.Jsii$Proxy.class)
public interface ClusterInstallationSpecDatabase extends software.amazon.jsii.JsiiSerializable {

    /**
     * Defines the backup retention policy.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBackupRemoteDeletePolicy() {
        return null;
    }

    /**
     * Defines the secret to be used when performing a database restore.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBackupRestoreSecretName() {
        return null;
    }

    /**
     * Defines the interval for backups in cron expression format.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBackupSchedule() {
        return null;
    }

    /**
     * Defines the secret to be used for uploading/restoring backup.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBackupSecretName() {
        return null;
    }

    /**
     * Defines the object storage url for uploading backups.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBackupUrl() {
        return null;
    }

    /**
     * Defines the AWS S3 bucket where the Database Backup is stored.
     * <p>
     * The operator will download the file to restore the data.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInitBucketUrl() {
        return null;
    }

    /**
     * Defines the number of database replicas.
     * <p>
     * For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * Defines the resource requests and limits for the database pods.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecDatabaseResources getResources() {
        return null;
    }

    /**
     * Optionally enter the name of an already-existing Secret for connecting to the database.
     * <p>
     * This secret should be configured as follows:
     * User-Managed Database   - Key: DB_CONNECTION_STRING | Value: &lt;FULL_DATABASE_CONNECTION_STRING&gt; Operator-Managed Database   - Key: ROOT_PASSWORD | Value: &lt;ROOT_DATABASE_PASSWORD&gt;   - Key: USER | Value: &lt;USER_NAME&gt;   - Key: PASSWORD | Value: &lt;USER_PASSWORD&gt;   - Key: DATABASE Value: &lt;DATABASE_NAME&gt;
     * Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecret() {
        return null;
    }

    /**
     * Defines the storage size for the database.
     * <p>
     * ie 50Gi
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStorageSize() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecDatabase}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecDatabase}
     */
    public static final class Builder {
        private java.lang.String backupRemoteDeletePolicy;
        private java.lang.String backupRestoreSecretName;
        private java.lang.String backupSchedule;
        private java.lang.String backupSecretName;
        private java.lang.String backupUrl;
        private java.lang.String initBucketUrl;
        private java.lang.Number replicas;
        private clusterinstallation.ClusterInstallationSpecDatabaseResources resources;
        private java.lang.String secret;
        private java.lang.String storageSize;
        private java.lang.String type;

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getBackupRemoteDeletePolicy}
         * @param backupRemoteDeletePolicy Defines the backup retention policy.
         * @return {@code this}
         */
        public Builder backupRemoteDeletePolicy(java.lang.String backupRemoteDeletePolicy) {
            this.backupRemoteDeletePolicy = backupRemoteDeletePolicy;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getBackupRestoreSecretName}
         * @param backupRestoreSecretName Defines the secret to be used when performing a database restore.
         * @return {@code this}
         */
        public Builder backupRestoreSecretName(java.lang.String backupRestoreSecretName) {
            this.backupRestoreSecretName = backupRestoreSecretName;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getBackupSchedule}
         * @param backupSchedule Defines the interval for backups in cron expression format.
         * @return {@code this}
         */
        public Builder backupSchedule(java.lang.String backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getBackupSecretName}
         * @param backupSecretName Defines the secret to be used for uploading/restoring backup.
         * @return {@code this}
         */
        public Builder backupSecretName(java.lang.String backupSecretName) {
            this.backupSecretName = backupSecretName;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getBackupUrl}
         * @param backupUrl Defines the object storage url for uploading backups.
         * @return {@code this}
         */
        public Builder backupUrl(java.lang.String backupUrl) {
            this.backupUrl = backupUrl;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getInitBucketUrl}
         * @param initBucketUrl Defines the AWS S3 bucket where the Database Backup is stored.
         *                      The operator will download the file to restore the data.
         * @return {@code this}
         */
        public Builder initBucketUrl(java.lang.String initBucketUrl) {
            this.initBucketUrl = initBucketUrl;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getReplicas}
         * @param replicas Defines the number of database replicas.
         *                 For redundancy use at least 2 replicas. Setting this will override the number of replicas set by 'Size'.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getResources}
         * @param resources Defines the resource requests and limits for the database pods.
         * @return {@code this}
         */
        public Builder resources(clusterinstallation.ClusterInstallationSpecDatabaseResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getSecret}
         * @param secret Optionally enter the name of an already-existing Secret for connecting to the database.
         *               This secret should be configured as follows:
         *               User-Managed Database   - Key: DB_CONNECTION_STRING | Value: &lt;FULL_DATABASE_CONNECTION_STRING&gt; Operator-Managed Database   - Key: ROOT_PASSWORD | Value: &lt;ROOT_DATABASE_PASSWORD&gt;   - Key: USER | Value: &lt;USER_NAME&gt;   - Key: PASSWORD | Value: &lt;USER_PASSWORD&gt;   - Key: DATABASE Value: &lt;DATABASE_NAME&gt;
         *               Notes:   If you define all secret values for both User-Managed and   Operator-Managed database types, the User-Managed connection string will   take precedence and the Operator-Managed values will be ignored. If the   secret is left blank, the default behavior is to use an Operator-Managed   database with strong randomly-generated database credentials.
         * @return {@code this}
         */
        public Builder secret(java.lang.String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getStorageSize}
         * @param storageSize Defines the storage size for the database.
         *                    ie 50Gi
         * @return {@code this}
         */
        public Builder storageSize(java.lang.String storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecDatabase#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecDatabase}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecDatabase build() {
            return new Jsii$Proxy(backupRemoteDeletePolicy, backupRestoreSecretName, backupSchedule, backupSecretName, backupUrl, initBucketUrl, replicas, resources, secret, storageSize, type);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecDatabase}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecDatabase {
        private final java.lang.String backupRemoteDeletePolicy;
        private final java.lang.String backupRestoreSecretName;
        private final java.lang.String backupSchedule;
        private final java.lang.String backupSecretName;
        private final java.lang.String backupUrl;
        private final java.lang.String initBucketUrl;
        private final java.lang.Number replicas;
        private final clusterinstallation.ClusterInstallationSpecDatabaseResources resources;
        private final java.lang.String secret;
        private final java.lang.String storageSize;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backupRemoteDeletePolicy = this.jsiiGet("backupRemoteDeletePolicy", java.lang.String.class);
            this.backupRestoreSecretName = this.jsiiGet("backupRestoreSecretName", java.lang.String.class);
            this.backupSchedule = this.jsiiGet("backupSchedule", java.lang.String.class);
            this.backupSecretName = this.jsiiGet("backupSecretName", java.lang.String.class);
            this.backupUrl = this.jsiiGet("backupURL", java.lang.String.class);
            this.initBucketUrl = this.jsiiGet("initBucketURL", java.lang.String.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.resources = this.jsiiGet("resources", clusterinstallation.ClusterInstallationSpecDatabaseResources.class);
            this.secret = this.jsiiGet("secret", java.lang.String.class);
            this.storageSize = this.jsiiGet("storageSize", java.lang.String.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String backupRemoteDeletePolicy, final java.lang.String backupRestoreSecretName, final java.lang.String backupSchedule, final java.lang.String backupSecretName, final java.lang.String backupUrl, final java.lang.String initBucketUrl, final java.lang.Number replicas, final clusterinstallation.ClusterInstallationSpecDatabaseResources resources, final java.lang.String secret, final java.lang.String storageSize, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backupRemoteDeletePolicy = backupRemoteDeletePolicy;
            this.backupRestoreSecretName = backupRestoreSecretName;
            this.backupSchedule = backupSchedule;
            this.backupSecretName = backupSecretName;
            this.backupUrl = backupUrl;
            this.initBucketUrl = initBucketUrl;
            this.replicas = replicas;
            this.resources = resources;
            this.secret = secret;
            this.storageSize = storageSize;
            this.type = type;
        }

        @Override
        public java.lang.String getBackupRemoteDeletePolicy() {
            return this.backupRemoteDeletePolicy;
        }

        @Override
        public java.lang.String getBackupRestoreSecretName() {
            return this.backupRestoreSecretName;
        }

        @Override
        public java.lang.String getBackupSchedule() {
            return this.backupSchedule;
        }

        @Override
        public java.lang.String getBackupSecretName() {
            return this.backupSecretName;
        }

        @Override
        public java.lang.String getBackupUrl() {
            return this.backupUrl;
        }

        @Override
        public java.lang.String getInitBucketUrl() {
            return this.initBucketUrl;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecDatabaseResources getResources() {
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
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBackupRemoteDeletePolicy() != null) {
                data.set("backupRemoteDeletePolicy", om.valueToTree(this.getBackupRemoteDeletePolicy()));
            }
            if (this.getBackupRestoreSecretName() != null) {
                data.set("backupRestoreSecretName", om.valueToTree(this.getBackupRestoreSecretName()));
            }
            if (this.getBackupSchedule() != null) {
                data.set("backupSchedule", om.valueToTree(this.getBackupSchedule()));
            }
            if (this.getBackupSecretName() != null) {
                data.set("backupSecretName", om.valueToTree(this.getBackupSecretName()));
            }
            if (this.getBackupUrl() != null) {
                data.set("backupURL", om.valueToTree(this.getBackupUrl()));
            }
            if (this.getInitBucketUrl() != null) {
                data.set("initBucketURL", om.valueToTree(this.getInitBucketUrl()));
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
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecDatabase"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecDatabase.Jsii$Proxy that = (ClusterInstallationSpecDatabase.Jsii$Proxy) o;

            if (this.backupRemoteDeletePolicy != null ? !this.backupRemoteDeletePolicy.equals(that.backupRemoteDeletePolicy) : that.backupRemoteDeletePolicy != null) return false;
            if (this.backupRestoreSecretName != null ? !this.backupRestoreSecretName.equals(that.backupRestoreSecretName) : that.backupRestoreSecretName != null) return false;
            if (this.backupSchedule != null ? !this.backupSchedule.equals(that.backupSchedule) : that.backupSchedule != null) return false;
            if (this.backupSecretName != null ? !this.backupSecretName.equals(that.backupSecretName) : that.backupSecretName != null) return false;
            if (this.backupUrl != null ? !this.backupUrl.equals(that.backupUrl) : that.backupUrl != null) return false;
            if (this.initBucketUrl != null ? !this.initBucketUrl.equals(that.initBucketUrl) : that.initBucketUrl != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.secret != null ? !this.secret.equals(that.secret) : that.secret != null) return false;
            if (this.storageSize != null ? !this.storageSize.equals(that.storageSize) : that.storageSize != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.backupRemoteDeletePolicy != null ? this.backupRemoteDeletePolicy.hashCode() : 0;
            result = 31 * result + (this.backupRestoreSecretName != null ? this.backupRestoreSecretName.hashCode() : 0);
            result = 31 * result + (this.backupSchedule != null ? this.backupSchedule.hashCode() : 0);
            result = 31 * result + (this.backupSecretName != null ? this.backupSecretName.hashCode() : 0);
            result = 31 * result + (this.backupUrl != null ? this.backupUrl.hashCode() : 0);
            result = 31 * result + (this.initBucketUrl != null ? this.initBucketUrl.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.secret != null ? this.secret.hashCode() : 0);
            result = 31 * result + (this.storageSize != null ? this.storageSize.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
