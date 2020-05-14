package k8s;

/**
 * ServiceSpec describes the attributes that a user creates on a service.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.430Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ServiceSpec")
@software.amazon.jsii.Jsii.Proxy(ServiceSpec.Jsii$Proxy.class)
public interface ServiceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * clusterIP is the IP address of the service and is usually assigned randomly by the master.
     * <p>
     * If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClusterIp() {
        return null;
    }

    /**
     * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.
     * <p>
     * These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExternalIPs() {
        return null;
    }

    /**
     * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.
     * <p>
     * No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalName() {
        return null;
    }

    /**
     * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
     * <p>
     * "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalTrafficPolicy() {
        return null;
    }

    /**
     * healthCheckNodePort specifies the healthcheck nodePort for the service.
     * <p>
     * If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckNodePort() {
        return null;
    }

    /**
     * ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIpFamily() {
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
     * The list of ports that are exposed by this service.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.ServicePort> getPorts() {
        return null;
    }

    /**
     * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.
     * <p>
     * The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPublishNotReadyAddresses() {
        return null;
    }

    /**
     * Route service traffic to pods with label keys and values matching this selector.
     * <p>
     * If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getSelector() {
        return null;
    }

    /**
     * Supports "ClientIP" and "None".
     * <p>
     * Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     * <p>
     * Default: None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSessionAffinity() {
        return null;
    }

    /**
     * sessionAffinityConfig contains the configurations of session affinity.
     */
    default @org.jetbrains.annotations.Nullable k8s.SessionAffinityConfig getSessionAffinityConfig() {
        return null;
    }

    /**
     * topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.
     * <p>
     * Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTopologyKeys() {
        return null;
    }

    /**
     * type determines how the Service is exposed.
     * <p>
     * Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
     * <p>
     * Default: ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServiceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServiceSpec}
     */
    public static final class Builder {
        private java.lang.String clusterIp;
        private java.util.List<java.lang.String> externalIPs;
        private java.lang.String externalName;
        private java.lang.String externalTrafficPolicy;
        private java.lang.Number healthCheckNodePort;
        private java.lang.String ipFamily;
        private java.lang.String loadBalancerIp;
        private java.util.List<java.lang.String> loadBalancerSourceRanges;
        private java.util.List<k8s.ServicePort> ports;
        private java.lang.Boolean publishNotReadyAddresses;
        private java.util.Map<java.lang.String, java.lang.String> selector;
        private java.lang.String sessionAffinity;
        private k8s.SessionAffinityConfig sessionAffinityConfig;
        private java.util.List<java.lang.String> topologyKeys;
        private java.lang.String type;

        /**
         * Sets the value of {@link ServiceSpec#getClusterIp}
         * @param clusterIp clusterIP is the IP address of the service and is usually assigned randomly by the master.
         *                  If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are "None", empty string (""), or a valid IP address. "None" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder clusterIp(java.lang.String clusterIp) {
            this.clusterIp = clusterIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalIPs}
         * @param externalIPs externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.
         *                    These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
         * @return {@code this}
         */
        public Builder externalIPs(java.util.List<java.lang.String> externalIPs) {
            this.externalIPs = externalIPs;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalName}
         * @param externalName externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service.
         *                     No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
         * @return {@code this}
         */
        public Builder externalName(java.lang.String externalName) {
            this.externalName = externalName;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getExternalTrafficPolicy}
         * @param externalTrafficPolicy externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints.
         *                              "Local" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. "Cluster" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
         * @return {@code this}
         */
        public Builder externalTrafficPolicy(java.lang.String externalTrafficPolicy) {
            this.externalTrafficPolicy = externalTrafficPolicy;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getHealthCheckNodePort}
         * @param healthCheckNodePort healthCheckNodePort specifies the healthcheck nodePort for the service.
         *                            If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
         * @return {@code this}
         */
        public Builder healthCheckNodePort(java.lang.Number healthCheckNodePort) {
            this.healthCheckNodePort = healthCheckNodePort;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getIpFamily}
         * @param ipFamily ipFamily specifies whether this Service has a preference for a particular IP family (e.g. IPv4 vs. IPv6).  If a specific IP family is requested, the clusterIP field will be allocated from that family, if it is available in the cluster.  If no IP family is requested, the cluster's primary IP family will be used. Other IP fields (loadBalancerIP, loadBalancerSourceRanges, externalIPs) and controllers which allocate external load-balancers should use the same IP family.  Endpoints for this Service will be of this family.  This field is immutable after creation. Assigning a ServiceIPFamily not available in the cluster (e.g. IPv6 in IPv4 only cluster) is an error condition and will fail during clusterIP assignment.
         * @return {@code this}
         */
        public Builder ipFamily(java.lang.String ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerIp}
         * @param loadBalancerIp Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field.
         *                       This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
         * @return {@code this}
         */
        public Builder loadBalancerIp(java.lang.String loadBalancerIp) {
            this.loadBalancerIp = loadBalancerIp;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getLoadBalancerSourceRanges}
         * @param loadBalancerSourceRanges If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs.
         *                                 This field will be ignored if the cloud-provider does not support the feature." More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
         * @return {@code this}
         */
        public Builder loadBalancerSourceRanges(java.util.List<java.lang.String> loadBalancerSourceRanges) {
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPorts}
         * @param ports The list of ports that are exposed by this service.
         *              More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder ports(java.util.List<k8s.ServicePort> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getPublishNotReadyAddresses}
         * @param publishNotReadyAddresses publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service.
         *                                 The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery.
         * @return {@code this}
         */
        public Builder publishNotReadyAddresses(java.lang.Boolean publishNotReadyAddresses) {
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSelector}
         * @param selector Route service traffic to pods with label keys and values matching this selector.
         *                 If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
         * @return {@code this}
         */
        public Builder selector(java.util.Map<java.lang.String, java.lang.String> selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinity}
         * @param sessionAffinity Supports "ClientIP" and "None".
         *                        Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
         * @return {@code this}
         */
        public Builder sessionAffinity(java.lang.String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getSessionAffinityConfig}
         * @param sessionAffinityConfig sessionAffinityConfig contains the configurations of session affinity.
         * @return {@code this}
         */
        public Builder sessionAffinityConfig(k8s.SessionAffinityConfig sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getTopologyKeys}
         * @param topologyKeys topologyKeys is a preference-order list of topology keys which implementations of services should use to preferentially sort endpoints when accessing this Service, it can not be used at the same time as externalTrafficPolicy=Local.
         *                     Topology keys must be valid label keys and at most 16 keys may be specified. Endpoints are chosen based on the first topology key with available backends. If this field is specified and all entries have no backends that match the topology of the client, the service has no backends for that client and connections should fail. The special value "*" may be used to mean "any topology". This catch-all value, if used, only makes sense as the last value in the list. If this is not specified or empty, no topology constraints will be applied.
         * @return {@code this}
         */
        public Builder topologyKeys(java.util.List<java.lang.String> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }

        /**
         * Sets the value of {@link ServiceSpec#getType}
         * @param type type determines how the Service is exposed.
         *             Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. "ExternalName" maps to the specified externalName. "ClusterIP" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is "None", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. "NodePort" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. "LoadBalancer" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services-service-types
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServiceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ServiceSpec build() {
            return new Jsii$Proxy(clusterIp, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, ipFamily, loadBalancerIp, loadBalancerSourceRanges, ports, publishNotReadyAddresses, selector, sessionAffinity, sessionAffinityConfig, topologyKeys, type);
        }
    }

    /**
     * An implementation for {@link ServiceSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServiceSpec {
        private final java.lang.String clusterIp;
        private final java.util.List<java.lang.String> externalIPs;
        private final java.lang.String externalName;
        private final java.lang.String externalTrafficPolicy;
        private final java.lang.Number healthCheckNodePort;
        private final java.lang.String ipFamily;
        private final java.lang.String loadBalancerIp;
        private final java.util.List<java.lang.String> loadBalancerSourceRanges;
        private final java.util.List<k8s.ServicePort> ports;
        private final java.lang.Boolean publishNotReadyAddresses;
        private final java.util.Map<java.lang.String, java.lang.String> selector;
        private final java.lang.String sessionAffinity;
        private final k8s.SessionAffinityConfig sessionAffinityConfig;
        private final java.util.List<java.lang.String> topologyKeys;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clusterIp = this.jsiiGet("clusterIP", java.lang.String.class);
            this.externalIPs = this.jsiiGet("externalIPs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.externalName = this.jsiiGet("externalName", java.lang.String.class);
            this.externalTrafficPolicy = this.jsiiGet("externalTrafficPolicy", java.lang.String.class);
            this.healthCheckNodePort = this.jsiiGet("healthCheckNodePort", java.lang.Number.class);
            this.ipFamily = this.jsiiGet("ipFamily", java.lang.String.class);
            this.loadBalancerIp = this.jsiiGet("loadBalancerIP", java.lang.String.class);
            this.loadBalancerSourceRanges = this.jsiiGet("loadBalancerSourceRanges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.ports = this.jsiiGet("ports", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.ServicePort.class)));
            this.publishNotReadyAddresses = this.jsiiGet("publishNotReadyAddresses", java.lang.Boolean.class);
            this.selector = this.jsiiGet("selector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sessionAffinity = this.jsiiGet("sessionAffinity", java.lang.String.class);
            this.sessionAffinityConfig = this.jsiiGet("sessionAffinityConfig", k8s.SessionAffinityConfig.class);
            this.topologyKeys = this.jsiiGet("topologyKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.type = this.jsiiGet("type", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String clusterIp, final java.util.List<java.lang.String> externalIPs, final java.lang.String externalName, final java.lang.String externalTrafficPolicy, final java.lang.Number healthCheckNodePort, final java.lang.String ipFamily, final java.lang.String loadBalancerIp, final java.util.List<java.lang.String> loadBalancerSourceRanges, final java.util.List<k8s.ServicePort> ports, final java.lang.Boolean publishNotReadyAddresses, final java.util.Map<java.lang.String, java.lang.String> selector, final java.lang.String sessionAffinity, final k8s.SessionAffinityConfig sessionAffinityConfig, final java.util.List<java.lang.String> topologyKeys, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clusterIp = clusterIp;
            this.externalIPs = externalIPs;
            this.externalName = externalName;
            this.externalTrafficPolicy = externalTrafficPolicy;
            this.healthCheckNodePort = healthCheckNodePort;
            this.ipFamily = ipFamily;
            this.loadBalancerIp = loadBalancerIp;
            this.loadBalancerSourceRanges = loadBalancerSourceRanges;
            this.ports = ports;
            this.publishNotReadyAddresses = publishNotReadyAddresses;
            this.selector = selector;
            this.sessionAffinity = sessionAffinity;
            this.sessionAffinityConfig = sessionAffinityConfig;
            this.topologyKeys = topologyKeys;
            this.type = type;
        }

        @Override
        public java.lang.String getClusterIp() {
            return this.clusterIp;
        }

        @Override
        public java.util.List<java.lang.String> getExternalIPs() {
            return this.externalIPs;
        }

        @Override
        public java.lang.String getExternalName() {
            return this.externalName;
        }

        @Override
        public java.lang.String getExternalTrafficPolicy() {
            return this.externalTrafficPolicy;
        }

        @Override
        public java.lang.Number getHealthCheckNodePort() {
            return this.healthCheckNodePort;
        }

        @Override
        public java.lang.String getIpFamily() {
            return this.ipFamily;
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
        public java.util.List<k8s.ServicePort> getPorts() {
            return this.ports;
        }

        @Override
        public java.lang.Boolean getPublishNotReadyAddresses() {
            return this.publishNotReadyAddresses;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getSelector() {
            return this.selector;
        }

        @Override
        public java.lang.String getSessionAffinity() {
            return this.sessionAffinity;
        }

        @Override
        public k8s.SessionAffinityConfig getSessionAffinityConfig() {
            return this.sessionAffinityConfig;
        }

        @Override
        public java.util.List<java.lang.String> getTopologyKeys() {
            return this.topologyKeys;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClusterIp() != null) {
                data.set("clusterIP", om.valueToTree(this.getClusterIp()));
            }
            if (this.getExternalIPs() != null) {
                data.set("externalIPs", om.valueToTree(this.getExternalIPs()));
            }
            if (this.getExternalName() != null) {
                data.set("externalName", om.valueToTree(this.getExternalName()));
            }
            if (this.getExternalTrafficPolicy() != null) {
                data.set("externalTrafficPolicy", om.valueToTree(this.getExternalTrafficPolicy()));
            }
            if (this.getHealthCheckNodePort() != null) {
                data.set("healthCheckNodePort", om.valueToTree(this.getHealthCheckNodePort()));
            }
            if (this.getIpFamily() != null) {
                data.set("ipFamily", om.valueToTree(this.getIpFamily()));
            }
            if (this.getLoadBalancerIp() != null) {
                data.set("loadBalancerIP", om.valueToTree(this.getLoadBalancerIp()));
            }
            if (this.getLoadBalancerSourceRanges() != null) {
                data.set("loadBalancerSourceRanges", om.valueToTree(this.getLoadBalancerSourceRanges()));
            }
            if (this.getPorts() != null) {
                data.set("ports", om.valueToTree(this.getPorts()));
            }
            if (this.getPublishNotReadyAddresses() != null) {
                data.set("publishNotReadyAddresses", om.valueToTree(this.getPublishNotReadyAddresses()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }
            if (this.getSessionAffinity() != null) {
                data.set("sessionAffinity", om.valueToTree(this.getSessionAffinity()));
            }
            if (this.getSessionAffinityConfig() != null) {
                data.set("sessionAffinityConfig", om.valueToTree(this.getSessionAffinityConfig()));
            }
            if (this.getTopologyKeys() != null) {
                data.set("topologyKeys", om.valueToTree(this.getTopologyKeys()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ServiceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServiceSpec.Jsii$Proxy that = (ServiceSpec.Jsii$Proxy) o;

            if (this.clusterIp != null ? !this.clusterIp.equals(that.clusterIp) : that.clusterIp != null) return false;
            if (this.externalIPs != null ? !this.externalIPs.equals(that.externalIPs) : that.externalIPs != null) return false;
            if (this.externalName != null ? !this.externalName.equals(that.externalName) : that.externalName != null) return false;
            if (this.externalTrafficPolicy != null ? !this.externalTrafficPolicy.equals(that.externalTrafficPolicy) : that.externalTrafficPolicy != null) return false;
            if (this.healthCheckNodePort != null ? !this.healthCheckNodePort.equals(that.healthCheckNodePort) : that.healthCheckNodePort != null) return false;
            if (this.ipFamily != null ? !this.ipFamily.equals(that.ipFamily) : that.ipFamily != null) return false;
            if (this.loadBalancerIp != null ? !this.loadBalancerIp.equals(that.loadBalancerIp) : that.loadBalancerIp != null) return false;
            if (this.loadBalancerSourceRanges != null ? !this.loadBalancerSourceRanges.equals(that.loadBalancerSourceRanges) : that.loadBalancerSourceRanges != null) return false;
            if (this.ports != null ? !this.ports.equals(that.ports) : that.ports != null) return false;
            if (this.publishNotReadyAddresses != null ? !this.publishNotReadyAddresses.equals(that.publishNotReadyAddresses) : that.publishNotReadyAddresses != null) return false;
            if (this.selector != null ? !this.selector.equals(that.selector) : that.selector != null) return false;
            if (this.sessionAffinity != null ? !this.sessionAffinity.equals(that.sessionAffinity) : that.sessionAffinity != null) return false;
            if (this.sessionAffinityConfig != null ? !this.sessionAffinityConfig.equals(that.sessionAffinityConfig) : that.sessionAffinityConfig != null) return false;
            if (this.topologyKeys != null ? !this.topologyKeys.equals(that.topologyKeys) : that.topologyKeys != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public int hashCode() {
            int result = this.clusterIp != null ? this.clusterIp.hashCode() : 0;
            result = 31 * result + (this.externalIPs != null ? this.externalIPs.hashCode() : 0);
            result = 31 * result + (this.externalName != null ? this.externalName.hashCode() : 0);
            result = 31 * result + (this.externalTrafficPolicy != null ? this.externalTrafficPolicy.hashCode() : 0);
            result = 31 * result + (this.healthCheckNodePort != null ? this.healthCheckNodePort.hashCode() : 0);
            result = 31 * result + (this.ipFamily != null ? this.ipFamily.hashCode() : 0);
            result = 31 * result + (this.loadBalancerIp != null ? this.loadBalancerIp.hashCode() : 0);
            result = 31 * result + (this.loadBalancerSourceRanges != null ? this.loadBalancerSourceRanges.hashCode() : 0);
            result = 31 * result + (this.ports != null ? this.ports.hashCode() : 0);
            result = 31 * result + (this.publishNotReadyAddresses != null ? this.publishNotReadyAddresses.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            result = 31 * result + (this.sessionAffinity != null ? this.sessionAffinity.hashCode() : 0);
            result = 31 * result + (this.sessionAffinityConfig != null ? this.sessionAffinityConfig.hashCode() : 0);
            result = 31 * result + (this.topologyKeys != null ? this.topologyKeys.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
