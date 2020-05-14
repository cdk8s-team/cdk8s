package jenkins;

/**
 * Master represents Jenkins master pod properties and Jenkins plugins.
 * <p>
 * Every single change here requires a pod restart.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.594Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecMaster")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecMaster.Jsii$Proxy.class)
public interface JenkinsSpecMaster extends software.amazon.jsii.JsiiSerializable {

    /**
     * DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getDisableCsrfProtection();

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
     * <p>
     * They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1.
     * <p>
     * Default: name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterBasePlugins> getBasePlugins() {
        return null;
    }

    /**
     * List of containers belonging to the pod.
     * <p>
     * Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi
     * <p>
     * Default: image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterContainers> getContainers() {
        return null;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
     * <p>
     * If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> getImagePullSecrets() {
        return null;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) objects.
     * <p>
     * May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
     * <p>
     * They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getMasterAnnotations() {
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
     * Plugins contains plugins required by user.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterPlugins> getPlugins() {
        return null;
    }

    /**
     * SecurityContext that applies to all the containers of the Jenkins Master.
     * <p>
     * As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
     * <p>
     * Default: runAsUser: 1000 fsGroup: 1000
     */
    default @org.jetbrains.annotations.Nullable jenkins.JenkinsSpecMasterSecurityContext getSecurityContext() {
        return null;
    }

    /**
     * If specified, the pod's tolerations.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterTolerations> getTolerations() {
        return null;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes
     */
    default @org.jetbrains.annotations.Nullable java.util.List<jenkins.JenkinsSpecMasterVolumes> getVolumes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecMaster}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecMaster}
     */
    public static final class Builder {
        private java.lang.Boolean disableCsrfProtection;
        private java.util.Map<java.lang.String, java.lang.String> annotations;
        private java.util.List<jenkins.JenkinsSpecMasterBasePlugins> basePlugins;
        private java.util.List<jenkins.JenkinsSpecMasterContainers> containers;
        private java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> imagePullSecrets;
        private java.util.Map<java.lang.String, java.lang.String> labels;
        private java.util.Map<java.lang.String, java.lang.String> masterAnnotations;
        private java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private java.util.List<jenkins.JenkinsSpecMasterPlugins> plugins;
        private jenkins.JenkinsSpecMasterSecurityContext securityContext;
        private java.util.List<jenkins.JenkinsSpecMasterTolerations> tolerations;
        private java.util.List<jenkins.JenkinsSpecMasterVolumes> volumes;

        /**
         * Sets the value of {@link JenkinsSpecMaster#getDisableCsrfProtection}
         * @param disableCsrfProtection DisableCSRFProtection allows you to toggle CSRF Protection on Jenkins. This parameter is required.
         * @return {@code this}
         */
        public Builder disableCsrfProtection(java.lang.Boolean disableCsrfProtection) {
            this.disableCsrfProtection = disableCsrfProtection;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getAnnotations}
         * @param annotations Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
         *                    They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getBasePlugins}
         * @param basePlugins BasePlugins contains plugins required by operator Defaults to : - name: kubernetes version: 1.15.7 - name: workflow-job version: "2.32" - name: workflow-aggregator version: "2.6" - name: git version: 3.10.0 - name: job-dsl version: "1.74" - name: configuration-as-code version: "1.19" - name: configuration-as-code-support version: "1.19" - name: kubernetes-credentials-provider version: 0.12.1.
         * @return {@code this}
         */
        public Builder basePlugins(java.util.List<jenkins.JenkinsSpecMasterBasePlugins> basePlugins) {
            this.basePlugins = basePlugins;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getContainers}
         * @param containers List of containers belonging to the pod.
         *                   Containers cannot currently be added or removed. There must be at least one container in a Pod. Defaults to: - image: jenkins/jenkins:lts   imagePullPolicy: Always   livenessProbe:     failureThreshold: 12     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 80     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 5   name: jenkins-master   readinessProbe:     failureThreshold: 3     httpGet:       path: /login       port: http       scheme: HTTP     initialDelaySeconds: 30     periodSeconds: 10     successThreshold: 1     timeoutSeconds: 1   resources:     limits:       cpu: 1500m       memory: 3Gi     requests:       cpu: "1"       memory: 600Mi
         * @return {@code this}
         */
        public Builder containers(java.util.List<jenkins.JenkinsSpecMasterContainers> containers) {
            this.containers = containers;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getImagePullSecrets}
         * @param imagePullSecrets ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
         *                         If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
         * @return {@code this}
         */
        public Builder imagePullSecrets(java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getLabels}
         * @param labels Map of string keys and values that can be used to organize and categorize (scope and select) objects.
         *               May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getMasterAnnotations}
         * @param masterAnnotations Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
         *                          They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations Deprecated: will be removed in the future, please use Annotations(annotations)
         * @return {@code this}
         */
        public Builder masterAnnotations(java.util.Map<java.lang.String, java.lang.String> masterAnnotations) {
            this.masterAnnotations = masterAnnotations;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getNodeSelector}
         * @param nodeSelector NodeSelector is a selector which must be true for the pod to fit on a node.
         *                     Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * @return {@code this}
         */
        public Builder nodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getPlugins}
         * @param plugins Plugins contains plugins required by user.
         * @return {@code this}
         */
        public Builder plugins(java.util.List<jenkins.JenkinsSpecMasterPlugins> plugins) {
            this.plugins = plugins;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getSecurityContext}
         * @param securityContext SecurityContext that applies to all the containers of the Jenkins Master.
         *                        As per kubernetes specification, it can be overridden for each container individually. Defaults to: runAsUser: 1000 fsGroup: 1000
         * @return {@code this}
         */
        public Builder securityContext(jenkins.JenkinsSpecMasterSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getTolerations}
         * @param tolerations If specified, the pod's tolerations.
         * @return {@code this}
         */
        public Builder tolerations(java.util.List<jenkins.JenkinsSpecMasterTolerations> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecMaster#getVolumes}
         * @param volumes List of volumes that can be mounted by containers belonging to the pod.
         *                More info: https://kubernetes.io/docs/concepts/storage/volumes
         * @return {@code this}
         */
        public Builder volumes(java.util.List<jenkins.JenkinsSpecMasterVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecMaster}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecMaster build() {
            return new Jsii$Proxy(disableCsrfProtection, annotations, basePlugins, containers, imagePullSecrets, labels, masterAnnotations, nodeSelector, plugins, securityContext, tolerations, volumes);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecMaster}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecMaster {
        private final java.lang.Boolean disableCsrfProtection;
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.util.List<jenkins.JenkinsSpecMasterBasePlugins> basePlugins;
        private final java.util.List<jenkins.JenkinsSpecMasterContainers> containers;
        private final java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> imagePullSecrets;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.util.Map<java.lang.String, java.lang.String> masterAnnotations;
        private final java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private final java.util.List<jenkins.JenkinsSpecMasterPlugins> plugins;
        private final jenkins.JenkinsSpecMasterSecurityContext securityContext;
        private final java.util.List<jenkins.JenkinsSpecMasterTolerations> tolerations;
        private final java.util.List<jenkins.JenkinsSpecMasterVolumes> volumes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.disableCsrfProtection = this.jsiiGet("disableCSRFProtection", java.lang.Boolean.class);
            this.annotations = this.jsiiGet("annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.basePlugins = this.jsiiGet("basePlugins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterBasePlugins.class)));
            this.containers = this.jsiiGet("containers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterContainers.class)));
            this.imagePullSecrets = this.jsiiGet("imagePullSecrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterImagePullSecrets.class)));
            this.labels = this.jsiiGet("labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.masterAnnotations = this.jsiiGet("masterAnnotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nodeSelector = this.jsiiGet("nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.plugins = this.jsiiGet("plugins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterPlugins.class)));
            this.securityContext = this.jsiiGet("securityContext", jenkins.JenkinsSpecMasterSecurityContext.class);
            this.tolerations = this.jsiiGet("tolerations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterTolerations.class)));
            this.volumes = this.jsiiGet("volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(jenkins.JenkinsSpecMasterVolumes.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Boolean disableCsrfProtection, final java.util.Map<java.lang.String, java.lang.String> annotations, final java.util.List<jenkins.JenkinsSpecMasterBasePlugins> basePlugins, final java.util.List<jenkins.JenkinsSpecMasterContainers> containers, final java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> imagePullSecrets, final java.util.Map<java.lang.String, java.lang.String> labels, final java.util.Map<java.lang.String, java.lang.String> masterAnnotations, final java.util.Map<java.lang.String, java.lang.String> nodeSelector, final java.util.List<jenkins.JenkinsSpecMasterPlugins> plugins, final jenkins.JenkinsSpecMasterSecurityContext securityContext, final java.util.List<jenkins.JenkinsSpecMasterTolerations> tolerations, final java.util.List<jenkins.JenkinsSpecMasterVolumes> volumes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.disableCsrfProtection = java.util.Objects.requireNonNull(disableCsrfProtection, "disableCsrfProtection is required");
            this.annotations = annotations;
            this.basePlugins = basePlugins;
            this.containers = containers;
            this.imagePullSecrets = imagePullSecrets;
            this.labels = labels;
            this.masterAnnotations = masterAnnotations;
            this.nodeSelector = nodeSelector;
            this.plugins = plugins;
            this.securityContext = securityContext;
            this.tolerations = tolerations;
            this.volumes = volumes;
        }

        @Override
        public java.lang.Boolean getDisableCsrfProtection() {
            return this.disableCsrfProtection;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterBasePlugins> getBasePlugins() {
            return this.basePlugins;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterContainers> getContainers() {
            return this.containers;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterImagePullSecrets> getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getMasterAnnotations() {
            return this.masterAnnotations;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterPlugins> getPlugins() {
            return this.plugins;
        }

        @Override
        public jenkins.JenkinsSpecMasterSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterTolerations> getTolerations() {
            return this.tolerations;
        }

        @Override
        public java.util.List<jenkins.JenkinsSpecMasterVolumes> getVolumes() {
            return this.volumes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("disableCSRFProtection", om.valueToTree(this.getDisableCsrfProtection()));
            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }
            if (this.getBasePlugins() != null) {
                data.set("basePlugins", om.valueToTree(this.getBasePlugins()));
            }
            if (this.getContainers() != null) {
                data.set("containers", om.valueToTree(this.getContainers()));
            }
            if (this.getImagePullSecrets() != null) {
                data.set("imagePullSecrets", om.valueToTree(this.getImagePullSecrets()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getMasterAnnotations() != null) {
                data.set("masterAnnotations", om.valueToTree(this.getMasterAnnotations()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }
            if (this.getPlugins() != null) {
                data.set("plugins", om.valueToTree(this.getPlugins()));
            }
            if (this.getSecurityContext() != null) {
                data.set("securityContext", om.valueToTree(this.getSecurityContext()));
            }
            if (this.getTolerations() != null) {
                data.set("tolerations", om.valueToTree(this.getTolerations()));
            }
            if (this.getVolumes() != null) {
                data.set("volumes", om.valueToTree(this.getVolumes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecMaster"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecMaster.Jsii$Proxy that = (JenkinsSpecMaster.Jsii$Proxy) o;

            if (!disableCsrfProtection.equals(that.disableCsrfProtection)) return false;
            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            if (this.basePlugins != null ? !this.basePlugins.equals(that.basePlugins) : that.basePlugins != null) return false;
            if (this.containers != null ? !this.containers.equals(that.containers) : that.containers != null) return false;
            if (this.imagePullSecrets != null ? !this.imagePullSecrets.equals(that.imagePullSecrets) : that.imagePullSecrets != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            if (this.masterAnnotations != null ? !this.masterAnnotations.equals(that.masterAnnotations) : that.masterAnnotations != null) return false;
            if (this.nodeSelector != null ? !this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null) return false;
            if (this.plugins != null ? !this.plugins.equals(that.plugins) : that.plugins != null) return false;
            if (this.securityContext != null ? !this.securityContext.equals(that.securityContext) : that.securityContext != null) return false;
            if (this.tolerations != null ? !this.tolerations.equals(that.tolerations) : that.tolerations != null) return false;
            return this.volumes != null ? this.volumes.equals(that.volumes) : that.volumes == null;
        }

        @Override
        public int hashCode() {
            int result = this.disableCsrfProtection.hashCode();
            result = 31 * result + (this.annotations != null ? this.annotations.hashCode() : 0);
            result = 31 * result + (this.basePlugins != null ? this.basePlugins.hashCode() : 0);
            result = 31 * result + (this.containers != null ? this.containers.hashCode() : 0);
            result = 31 * result + (this.imagePullSecrets != null ? this.imagePullSecrets.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.masterAnnotations != null ? this.masterAnnotations.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            result = 31 * result + (this.plugins != null ? this.plugins.hashCode() : 0);
            result = 31 * result + (this.securityContext != null ? this.securityContext.hashCode() : 0);
            result = 31 * result + (this.tolerations != null ? this.tolerations.hashCode() : 0);
            result = 31 * result + (this.volumes != null ? this.volumes.hashCode() : 0);
            return result;
        }
    }
}
