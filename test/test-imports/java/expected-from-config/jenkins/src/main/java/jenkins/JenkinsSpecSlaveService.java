package jenkins;

/**
 * Service is Kubernetes service of Jenkins slave pods Defaults to : port: 50000 type: ClusterIP.
 * <p>
 * Default: port: 50000 type: ClusterIP
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:59:02.705Z")
@software.amazon.jsii.Jsii(module = jenkins.$Module.class, fqn = "jenkins.JenkinsSpecSlaveService")
@software.amazon.jsii.Jsii.Proxy(JenkinsSpecSlaveService.Jsii$Proxy.class)
public interface JenkinsSpecSlaveService extends software.amazon.jsii.JsiiSerializable {

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
     * <p>
     * They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * Route service traffic to pods with label keys and values matching this selector.
     * <p>
     * If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
     * <p>
     * This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLoadBalancerIp() {
        return null;
    }

    /**
     * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
     * <p>
     * This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
        return null;
    }

    /**
     * The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
     * <p>
     * Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * <p>
     * Default: to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNodePort() {
        return null;
    }

    /**
     * The port that are exposed by this service.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPort() {
        return null;
    }

    /**
     * Type determines how the Service is exposed.
     * <p>
     * Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
     * <p>
     * Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JenkinsSpecSlaveService}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JenkinsSpecSlaveService}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> annotations;
        private java.util.Map<java.lang.String, java.lang.String> labels;
        private java.lang.String loadBalancerIp;
        private java.util.List<java.lang.String> loadBalancerSourceRanges;
        private java.lang.Number nodePort;
        private java.lang.Number port;
        private java.lang.String type;

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getAnnotations}
         * @param annotations Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
         *                    They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getLabels}
         * @param labels Route service traffic to pods with label keys and values matching this selector.
         *               If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getLoadBalancerIp}
         * @param loadBalancerIp Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
         *                       This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
         * @return {@code this}
         */
        public Builder loadBalancerIp(java.lang.String loadBalancerIp) {
            this.loadBalancerIp = loadBalancerIp;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getLoadBalancerSourceRanges}
         * @param loadBalancerSourceRanges If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
         *                                 This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
         * @return {@code this}
         */
        public Builder loadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getNodePort}
         * @param nodePort The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
         *                 Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
         * @return {@code this}
         */
        public Builder nodePort(java.lang.Number nodePort) {
            this.nodePort = nodePort;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getPort}
         * @param port The port that are exposed by this service.
         *             More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder port(java.lang.Number port) {
            this.port = port;
            return this;
        }

        /**
         * Sets the value of {@link JenkinsSpecSlaveService#getType}
         * @param type Type determines how the Service is exposed.
         *             Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JenkinsSpecSlaveService}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JenkinsSpecSlaveService build() {
            return new Jsii$Proxy(annotations, labels, loadBalancerIp, loadBalancerSourceRanges, nodePort, port, type);
        }
    }

    /**
     * An implementation for {@link JenkinsSpecSlaveService}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JenkinsSpecSlaveService {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.lang.String loadBalancerIp;
        private final java.util.List<java.lang.String> loadBalancerSourceRanges;
        private final java.lang.Number nodePort;
        private final java.lang.Number port;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.annotations = this.jsiiGet("annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.labels = this.jsiiGet("labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.loadBalancerIp = this.jsiiGet("loadBalancerIP", java.lang.String.class);
            this.loadBalancerSourceRanges = this.jsiiGet("loadBalancerSourceRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nodePort = this.jsiiGet("nodePort", java.lang.Number.class);
            this.port = this.jsiiGet("port", java.lang.Number.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> annotations, final java.util.Map<java.lang.String, java.lang.String> labels, final java.lang.String loadBalancerIp, final java.util.List<java.lang.String> loadBalancerSourceRanges, final java.lang.Number nodePort, final java.lang.Number port, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.annotations = annotations;
            this.labels = labels;
            this.loadBalancerIp = loadBalancerIp;
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            this.nodePort = nodePort;
            this.port = port;
            this.type = type;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        public java.lang.String getLoadBalancerIp() {
            return this.loadBalancerIp;
        }

        @Override
        public java.util.List<java.lang.String> getLoadBalancerSourceRanges() {
            return this.loadBalancerSourceRanges;
        }

        @Override
        public java.lang.Number getNodePort() {
            return this.nodePort;
        }

        @Override
        public java.lang.Number getPort() {
            return this.port;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getLoadBalancerIp() != null) {
                data.set("loadBalancerIP", om.valueToTree(this.getLoadBalancerIp()));
            }
            if (this.getLoadBalancerSourceRanges() != null) {
                data.set("loadBalancerSourceRanges", om.valueToTree(this.getLoadBalancerSourceRanges()));
            }
            if (this.getNodePort() != null) {
                data.set("nodePort", om.valueToTree(this.getNodePort()));
            }
            if (this.getPort() != null) {
                data.set("port", om.valueToTree(this.getPort()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("jenkins.JenkinsSpecSlaveService"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JenkinsSpecSlaveService.Jsii$Proxy that = (JenkinsSpecSlaveService.Jsii$Proxy) o;

            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            if (this.loadBalancerIp != null ? !this.loadBalancerIp.equals(that.loadBalancerIp) : that.loadBalancerIp != null) return false;
            if (this.loadBalancerSourceRanges != null ? !this.loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) : that.loadBalancerSourceRanges != null) return false;
            if (this.nodePort != null ? !this.nodePort.equals(that.nodePort) : that.nodePort != null) return false;
            if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.loadBalancerIp != null ? this.loadBalancerIp.hashCode() : 0);
            result = 31 * result + (this.loadBalancerSourceRanges != null ? this.loadBalancerSourceRanges.hashCode() : 0);
            result = 31 * result + (this.nodePort != null ? this.nodePort.hashCode() : 0);
            result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
