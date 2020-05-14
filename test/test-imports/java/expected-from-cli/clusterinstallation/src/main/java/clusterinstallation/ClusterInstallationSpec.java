package clusterinstallation;

/**
 * Specification of the desired behavior of the Mattermost cluster.
 * <p>
 * More info: https://github.com/kubernetes/community/blob/master/contributors/devel/api-conventions.md#spec-and-status
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.302Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpec")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpec.Jsii$Proxy.class)
public interface ClusterInstallationSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * IngressName defines the name to be used when creating the ingress rules.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIngressName();

    /**
     * If specified, affinity will define the pod's scheduling constraints.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecAffinity getAffinity() {
        return null;
    }

    /**
     * BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecBlueGreen getBlueGreen() {
        return null;
    }

    /**
     * Canary defines the configuration of Canary deployment for a ClusterInstallation.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecCanary getCanary() {
        return null;
    }

    /**
     * Database defines the database configuration for a ClusterInstallation.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecDatabase getDatabase() {
        return null;
    }

    /**
     * ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecElasticSearch getElasticSearch() {
        return null;
    }

    /**
     * Image defines the ClusterInstallation Docker image.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getImage() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getIngressAnnotations() {
        return null;
    }

    /**
     * Defines the probe to check if the application is up and running.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecLivenessProbe getLivenessProbe() {
        return null;
    }

    /**
     * Optional environment variables to set in the Mattermost application pods.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> getMattermostEnv() {
        return null;
    }

    /**
     * Secret that contains the mattermost license.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMattermostLicenseSecret() {
        return null;
    }

    /**
     * Minio defines the configuration of Minio for a ClusterInstallation.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecMinio getMinio() {
        return null;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * <p>
     * Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
        return null;
    }

    /**
     * Defines the probe to check if the application is ready to accept traffic.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecReadinessProbe getReadinessProbe() {
        return null;
    }

    /**
     * Replicas defines the number of replicas to use for the Mattermost app servers.
     * <p>
     * Setting this will override the number of replicas set by 'Size'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getReplicas() {
        return null;
    }

    /**
     * Defines the resource requests and limits for the Mattermost app server pods.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecResources getResources() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getServiceAnnotations() {
        return null;
    }

    /**
     * Size defines the size of the ClusterInstallation.
     * <p>
     * This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
     * <p>
     * Default: 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSize() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUseServiceLoadBalancer() {
        return null;
    }

    /**
     * Version defines the ClusterInstallation Docker image version.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpec}
     */
    public static final class Builder {
        private java.lang.String ingressName;
        private clusterinstallation.ClusterInstallationSpecAffinity affinity;
        private clusterinstallation.ClusterInstallationSpecBlueGreen blueGreen;
        private clusterinstallation.ClusterInstallationSpecCanary canary;
        private clusterinstallation.ClusterInstallationSpecDatabase database;
        private clusterinstallation.ClusterInstallationSpecElasticSearch elasticSearch;
        private java.lang.String image;
        private java.util.Map<java.lang.String, java.lang.String> ingressAnnotations;
        private clusterinstallation.ClusterInstallationSpecLivenessProbe livenessProbe;
        private java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> mattermostEnv;
        private java.lang.String mattermostLicenseSecret;
        private clusterinstallation.ClusterInstallationSpecMinio minio;
        private java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private clusterinstallation.ClusterInstallationSpecReadinessProbe readinessProbe;
        private java.lang.Number replicas;
        private clusterinstallation.ClusterInstallationSpecResources resources;
        private java.util.Map<java.lang.String, java.lang.String> serviceAnnotations;
        private java.lang.String size;
        private java.lang.Boolean useServiceLoadBalancer;
        private java.lang.String version;

        /**
         * Sets the value of {@link ClusterInstallationSpec#getIngressName}
         * @param ingressName IngressName defines the name to be used when creating the ingress rules. This parameter is required.
         * @return {@code this}
         */
        public Builder ingressName(java.lang.String ingressName) {
            this.ingressName = ingressName;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getAffinity}
         * @param affinity If specified, affinity will define the pod's scheduling constraints.
         * @return {@code this}
         */
        public Builder affinity(clusterinstallation.ClusterInstallationSpecAffinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getBlueGreen}
         * @param blueGreen BlueGreen defines the configuration of BlueGreen deployment for a ClusterInstallation.
         * @return {@code this}
         */
        public Builder blueGreen(clusterinstallation.ClusterInstallationSpecBlueGreen blueGreen) {
            this.blueGreen = blueGreen;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getCanary}
         * @param canary Canary defines the configuration of Canary deployment for a ClusterInstallation.
         * @return {@code this}
         */
        public Builder canary(clusterinstallation.ClusterInstallationSpecCanary canary) {
            this.canary = canary;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getDatabase}
         * @param database Database defines the database configuration for a ClusterInstallation.
         * @return {@code this}
         */
        public Builder database(clusterinstallation.ClusterInstallationSpecDatabase database) {
            this.database = database;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getElasticSearch}
         * @param elasticSearch ElasticSearch defines the ElasticSearch configuration for a ClusterInstallation.
         * @return {@code this}
         */
        public Builder elasticSearch(clusterinstallation.ClusterInstallationSpecElasticSearch elasticSearch) {
            this.elasticSearch = elasticSearch;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getImage}
         * @param image Image defines the ClusterInstallation Docker image.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getIngressAnnotations}
         * @param ingressAnnotations the value to be set.
         * @return {@code this}
         */
        public Builder ingressAnnotations(java.util.Map<java.lang.String, java.lang.String> ingressAnnotations) {
            this.ingressAnnotations = ingressAnnotations;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getLivenessProbe}
         * @param livenessProbe Defines the probe to check if the application is up and running.
         * @return {@code this}
         */
        public Builder livenessProbe(clusterinstallation.ClusterInstallationSpecLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getMattermostEnv}
         * @param mattermostEnv Optional environment variables to set in the Mattermost application pods.
         * @return {@code this}
         */
        public Builder mattermostEnv(java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> mattermostEnv) {
            this.mattermostEnv = mattermostEnv;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getMattermostLicenseSecret}
         * @param mattermostLicenseSecret Secret that contains the mattermost license.
         * @return {@code this}
         */
        public Builder mattermostLicenseSecret(java.lang.String mattermostLicenseSecret) {
            this.mattermostLicenseSecret = mattermostLicenseSecret;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getMinio}
         * @param minio Minio defines the configuration of Minio for a ClusterInstallation.
         * @return {@code this}
         */
        public Builder minio(clusterinstallation.ClusterInstallationSpecMinio minio) {
            this.minio = minio;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getNodeSelector}
         * @param nodeSelector NodeSelector is a selector which must be true for the pod to fit on a node.
         *                     Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * @return {@code this}
         */
        public Builder nodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getReadinessProbe}
         * @param readinessProbe Defines the probe to check if the application is ready to accept traffic.
         * @return {@code this}
         */
        public Builder readinessProbe(clusterinstallation.ClusterInstallationSpecReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getReplicas}
         * @param replicas Replicas defines the number of replicas to use for the Mattermost app servers.
         *                 Setting this will override the number of replicas set by 'Size'.
         * @return {@code this}
         */
        public Builder replicas(java.lang.Number replicas) {
            this.replicas = replicas;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getResources}
         * @param resources Defines the resource requests and limits for the Mattermost app server pods.
         * @return {@code this}
         */
        public Builder resources(clusterinstallation.ClusterInstallationSpecResources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getServiceAnnotations}
         * @param serviceAnnotations the value to be set.
         * @return {@code this}
         */
        public Builder serviceAnnotations(java.util.Map<java.lang.String, java.lang.String> serviceAnnotations) {
            this.serviceAnnotations = serviceAnnotations;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getSize}
         * @param size Size defines the size of the ClusterInstallation.
         *             This is typically specified in number of users. This will set replica and resource requests/limits appropriately for the provided number of users. Accepted values are: 100users, 1000users, 5000users, 10000users, 250000users. Defaults to 5000users. Setting 'Replicas', 'Resources', 'Minio.Replicas', 'Minio.Resource', 'Database.Replicas', or 'Database.Resources' will override the values set by Size.
         * @return {@code this}
         */
        public Builder size(java.lang.String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getUseServiceLoadBalancer}
         * @param useServiceLoadBalancer the value to be set.
         * @return {@code this}
         */
        public Builder useServiceLoadBalancer(java.lang.Boolean useServiceLoadBalancer) {
            this.useServiceLoadBalancer = useServiceLoadBalancer;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpec#getVersion}
         * @param version Version defines the ClusterInstallation Docker image version.
         * @return {@code this}
         */
        public Builder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpec build() {
            return new Jsii$Proxy(ingressName, affinity, blueGreen, canary, database, elasticSearch, image, ingressAnnotations, livenessProbe, mattermostEnv, mattermostLicenseSecret, minio, nodeSelector, readinessProbe, replicas, resources, serviceAnnotations, size, useServiceLoadBalancer, version);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpec {
        private final java.lang.String ingressName;
        private final clusterinstallation.ClusterInstallationSpecAffinity affinity;
        private final clusterinstallation.ClusterInstallationSpecBlueGreen blueGreen;
        private final clusterinstallation.ClusterInstallationSpecCanary canary;
        private final clusterinstallation.ClusterInstallationSpecDatabase database;
        private final clusterinstallation.ClusterInstallationSpecElasticSearch elasticSearch;
        private final java.lang.String image;
        private final java.util.Map<java.lang.String, java.lang.String> ingressAnnotations;
        private final clusterinstallation.ClusterInstallationSpecLivenessProbe livenessProbe;
        private final java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> mattermostEnv;
        private final java.lang.String mattermostLicenseSecret;
        private final clusterinstallation.ClusterInstallationSpecMinio minio;
        private final java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private final clusterinstallation.ClusterInstallationSpecReadinessProbe readinessProbe;
        private final java.lang.Number replicas;
        private final clusterinstallation.ClusterInstallationSpecResources resources;
        private final java.util.Map<java.lang.String, java.lang.String> serviceAnnotations;
        private final java.lang.String size;
        private final java.lang.Boolean useServiceLoadBalancer;
        private final java.lang.String version;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ingressName = this.jsiiGet("ingressName", java.lang.String.class);
            this.affinity = this.jsiiGet("affinity", clusterinstallation.ClusterInstallationSpecAffinity.class);
            this.blueGreen = this.jsiiGet("blueGreen", clusterinstallation.ClusterInstallationSpecBlueGreen.class);
            this.canary = this.jsiiGet("canary", clusterinstallation.ClusterInstallationSpecCanary.class);
            this.database = this.jsiiGet("database", clusterinstallation.ClusterInstallationSpecDatabase.class);
            this.elasticSearch = this.jsiiGet("elasticSearch", clusterinstallation.ClusterInstallationSpecElasticSearch.class);
            this.image = this.jsiiGet("image", java.lang.String.class);
            this.ingressAnnotations = this.jsiiGet("ingressAnnotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.livenessProbe = this.jsiiGet("livenessProbe", clusterinstallation.ClusterInstallationSpecLivenessProbe.class);
            this.mattermostEnv = this.jsiiGet("mattermostEnv", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(clusterinstallation.ClusterInstallationSpecMattermostEnv.class)));
            this.mattermostLicenseSecret = this.jsiiGet("mattermostLicenseSecret", java.lang.String.class);
            this.minio = this.jsiiGet("minio", clusterinstallation.ClusterInstallationSpecMinio.class);
            this.nodeSelector = this.jsiiGet("nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.readinessProbe = this.jsiiGet("readinessProbe", clusterinstallation.ClusterInstallationSpecReadinessProbe.class);
            this.replicas = this.jsiiGet("replicas", java.lang.Number.class);
            this.resources = this.jsiiGet("resources", clusterinstallation.ClusterInstallationSpecResources.class);
            this.serviceAnnotations = this.jsiiGet("serviceAnnotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.size = this.jsiiGet("size", java.lang.String.class);
            this.useServiceLoadBalancer = this.jsiiGet("useServiceLoadBalancer", java.lang.Boolean.class);
            this.version = this.jsiiGet("version", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String ingressName, final clusterinstallation.ClusterInstallationSpecAffinity affinity, final clusterinstallation.ClusterInstallationSpecBlueGreen blueGreen, final clusterinstallation.ClusterInstallationSpecCanary canary, final clusterinstallation.ClusterInstallationSpecDatabase database, final clusterinstallation.ClusterInstallationSpecElasticSearch elasticSearch, final java.lang.String image, final java.util.Map<java.lang.String, java.lang.String> ingressAnnotations, final clusterinstallation.ClusterInstallationSpecLivenessProbe livenessProbe, final java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> mattermostEnv, final java.lang.String mattermostLicenseSecret, final clusterinstallation.ClusterInstallationSpecMinio minio, final java.util.Map<java.lang.String, java.lang.String> nodeSelector, final clusterinstallation.ClusterInstallationSpecReadinessProbe readinessProbe, final java.lang.Number replicas, final clusterinstallation.ClusterInstallationSpecResources resources, final java.util.Map<java.lang.String, java.lang.String> serviceAnnotations, final java.lang.String size, final java.lang.Boolean useServiceLoadBalancer, final java.lang.String version) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ingressName = java.util.Objects.requireNonNull(ingressName, "ingressName is required");
            this.affinity = affinity;
            this.blueGreen = blueGreen;
            this.canary = canary;
            this.database = database;
            this.elasticSearch = elasticSearch;
            this.image = image;
            this.ingressAnnotations = ingressAnnotations;
            this.livenessProbe = livenessProbe;
            this.mattermostEnv = mattermostEnv;
            this.mattermostLicenseSecret = mattermostLicenseSecret;
            this.minio = minio;
            this.nodeSelector = nodeSelector;
            this.readinessProbe = readinessProbe;
            this.replicas = replicas;
            this.resources = resources;
            this.serviceAnnotations = serviceAnnotations;
            this.size = size;
            this.useServiceLoadBalancer = useServiceLoadBalancer;
            this.version = version;
        }

        @Override
        public java.lang.String getIngressName() {
            return this.ingressName;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecAffinity getAffinity() {
            return this.affinity;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecBlueGreen getBlueGreen() {
            return this.blueGreen;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecCanary getCanary() {
            return this.canary;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecDatabase getDatabase() {
            return this.database;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecElasticSearch getElasticSearch() {
            return this.elasticSearch;
        }

        @Override
        public java.lang.String getImage() {
            return this.image;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getIngressAnnotations() {
            return this.ingressAnnotations;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        @Override
        public java.util.List<clusterinstallation.ClusterInstallationSpecMattermostEnv> getMattermostEnv() {
            return this.mattermostEnv;
        }

        @Override
        public java.lang.String getMattermostLicenseSecret() {
            return this.mattermostLicenseSecret;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecMinio getMinio() {
            return this.minio;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        @Override
        public java.lang.Number getReplicas() {
            return this.replicas;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecResources getResources() {
            return this.resources;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getServiceAnnotations() {
            return this.serviceAnnotations;
        }

        @Override
        public java.lang.String getSize() {
            return this.size;
        }

        @Override
        public java.lang.Boolean getUseServiceLoadBalancer() {
            return this.useServiceLoadBalancer;
        }

        @Override
        public java.lang.String getVersion() {
            return this.version;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ingressName", om.valueToTree(this.getIngressName()));
            if (this.getAffinity() != null) {
                data.set("affinity", om.valueToTree(this.getAffinity()));
            }
            if (this.getBlueGreen() != null) {
                data.set("blueGreen", om.valueToTree(this.getBlueGreen()));
            }
            if (this.getCanary() != null) {
                data.set("canary", om.valueToTree(this.getCanary()));
            }
            if (this.getDatabase() != null) {
                data.set("database", om.valueToTree(this.getDatabase()));
            }
            if (this.getElasticSearch() != null) {
                data.set("elasticSearch", om.valueToTree(this.getElasticSearch()));
            }
            if (this.getImage() != null) {
                data.set("image", om.valueToTree(this.getImage()));
            }
            if (this.getIngressAnnotations() != null) {
                data.set("ingressAnnotations", om.valueToTree(this.getIngressAnnotations()));
            }
            if (this.getLivenessProbe() != null) {
                data.set("livenessProbe", om.valueToTree(this.getLivenessProbe()));
            }
            if (this.getMattermostEnv() != null) {
                data.set("mattermostEnv", om.valueToTree(this.getMattermostEnv()));
            }
            if (this.getMattermostLicenseSecret() != null) {
                data.set("mattermostLicenseSecret", om.valueToTree(this.getMattermostLicenseSecret()));
            }
            if (this.getMinio() != null) {
                data.set("minio", om.valueToTree(this.getMinio()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }
            if (this.getReadinessProbe() != null) {
                data.set("readinessProbe", om.valueToTree(this.getReadinessProbe()));
            }
            if (this.getReplicas() != null) {
                data.set("replicas", om.valueToTree(this.getReplicas()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }
            if (this.getServiceAnnotations() != null) {
                data.set("serviceAnnotations", om.valueToTree(this.getServiceAnnotations()));
            }
            if (this.getSize() != null) {
                data.set("size", om.valueToTree(this.getSize()));
            }
            if (this.getUseServiceLoadBalancer() != null) {
                data.set("useServiceLoadBalancer", om.valueToTree(this.getUseServiceLoadBalancer()));
            }
            if (this.getVersion() != null) {
                data.set("version", om.valueToTree(this.getVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpec.Jsii$Proxy that = (ClusterInstallationSpec.Jsii$Proxy) o;

            if (!ingressName.equals(that.ingressName)) return false;
            if (this.affinity != null ? !this.affinity.equals(that.affinity) : that.affinity != null) return false;
            if (this.blueGreen != null ? !this.blueGreen.equals(that.blueGreen) : that.blueGreen != null) return false;
            if (this.canary != null ? !this.canary.equals(that.canary) : that.canary != null) return false;
            if (this.database != null ? !this.database.equals(that.database) : that.database != null) return false;
            if (this.elasticSearch != null ? !this.elasticSearch.equals(that.elasticSearch) : that.elasticSearch != null) return false;
            if (this.image != null ? !this.image.equals(that.image) : that.image != null) return false;
            if (this.ingressAnnotations != null ? !this.ingressAnnotations.equals(that.ingressAnnotations) : that.ingressAnnotations != null) return false;
            if (this.livenessProbe != null ? !this.livenessProbe.equals(that.livenessProbe) : that.livenessProbe != null) return false;
            if (this.mattermostEnv != null ? !this.mattermostEnv.equals(that.mattermostEnv) : that.mattermostEnv != null) return false;
            if (this.mattermostLicenseSecret != null ? !this.mattermostLicenseSecret.equals(that.mattermostLicenseSecret) : that.mattermostLicenseSecret != null) return false;
            if (this.minio != null ? !this.minio.equals(that.minio) : that.minio != null) return false;
            if (this.nodeSelector != null ? !this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null) return false;
            if (this.readinessProbe != null ? !this.readinessProbe.equals(that.readinessProbe) : that.readinessProbe != null) return false;
            if (this.replicas != null ? !this.replicas.equals(that.replicas) : that.replicas != null) return false;
            if (this.resources != null ? !this.resources.equals(that.resources) : that.resources != null) return false;
            if (this.serviceAnnotations != null ? !this.serviceAnnotations.equals(that.serviceAnnotations) : that.serviceAnnotations != null) return false;
            if (this.size != null ? !this.size.equals(that.size) : that.size != null) return false;
            if (this.useServiceLoadBalancer != null ? !this.useServiceLoadBalancer.equals(that.useServiceLoadBalancer) : that.useServiceLoadBalancer != null) return false;
            return this.version != null ? this.version.equals(that.version) : that.version == null;
        }

        @Override
        public int hashCode() {
            int result = this.ingressName.hashCode();
            result = 31 * result + (this.affinity != null ? this.affinity.hashCode() : 0);
            result = 31 * result + (this.blueGreen != null ? this.blueGreen.hashCode() : 0);
            result = 31 * result + (this.canary != null ? this.canary.hashCode() : 0);
            result = 31 * result + (this.database != null ? this.database.hashCode() : 0);
            result = 31 * result + (this.elasticSearch != null ? this.elasticSearch.hashCode() : 0);
            result = 31 * result + (this.image != null ? this.image.hashCode() : 0);
            result = 31 * result + (this.ingressAnnotations != null ? this.ingressAnnotations.hashCode() : 0);
            result = 31 * result + (this.livenessProbe != null ? this.livenessProbe.hashCode() : 0);
            result = 31 * result + (this.mattermostEnv != null ? this.mattermostEnv.hashCode() : 0);
            result = 31 * result + (this.mattermostLicenseSecret != null ? this.mattermostLicenseSecret.hashCode() : 0);
            result = 31 * result + (this.minio != null ? this.minio.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            result = 31 * result + (this.readinessProbe != null ? this.readinessProbe.hashCode() : 0);
            result = 31 * result + (this.replicas != null ? this.replicas.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            result = 31 * result + (this.serviceAnnotations != null ? this.serviceAnnotations.hashCode() : 0);
            result = 31 * result + (this.size != null ? this.size.hashCode() : 0);
            result = 31 * result + (this.useServiceLoadBalancer != null ? this.useServiceLoadBalancer.hashCode() : 0);
            result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
            return result;
        }
    }
}
