package k8s;

/**
 * NodeSpec describes the attributes that a node is created with.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.315Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NodeSpec")
@software.amazon.jsii.Jsii.Proxy(NodeSpec.Jsii$Proxy.class)
public interface NodeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field.
     */
    default @org.jetbrains.annotations.Nullable k8s.NodeConfigSource getConfigSource() {
        return null;
    }

    /**
     * Deprecated.
     * <p>
     * Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExternalId() {
        return null;
    }

    /**
     * PodCIDR represents the pod IP range assigned to the node.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPodCidr() {
        return null;
    }

    /**
     * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node.
     * <p>
     * If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPodCidRs() {
        return null;
    }

    /**
     * ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProviderId() {
        return null;
    }

    /**
     * If specified, the node's taints.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.Taint> getTaints() {
        return null;
    }

    /**
     * Unschedulable controls node schedulability of new pods.
     * <p>
     * By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUnschedulable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NodeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NodeSpec}
     */
    public static final class Builder {
        private k8s.NodeConfigSource configSource;
        private java.lang.String externalId;
        private java.lang.String podCidr;
        private java.util.List<java.lang.String> podCidRs;
        private java.lang.String providerId;
        private java.util.List<k8s.Taint> taints;
        private java.lang.Boolean unschedulable;

        /**
         * Sets the value of {@link NodeSpec#getConfigSource}
         * @param configSource If specified, the source to get node configuration from The DynamicKubeletConfig feature gate must be enabled for the Kubelet to use this field.
         * @return {@code this}
         */
        public Builder configSource(k8s.NodeConfigSource configSource) {
            this.configSource = configSource;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getExternalId}
         * @param externalId Deprecated.
         *                   Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getPodCidr}
         * @param podCidr PodCIDR represents the pod IP range assigned to the node.
         * @return {@code this}
         */
        public Builder podCidr(java.lang.String podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getPodCidRs}
         * @param podCidRs podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node.
         *                 If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
         * @return {@code this}
         */
        public Builder podCidRs(java.util.List<java.lang.String> podCidRs) {
            this.podCidRs = podCidRs;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getProviderId}
         * @param providerId ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>.
         * @return {@code this}
         */
        public Builder providerId(java.lang.String providerId) {
            this.providerId = providerId;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getTaints}
         * @param taints If specified, the node's taints.
         * @return {@code this}
         */
        public Builder taints(java.util.List<k8s.Taint> taints) {
            this.taints = taints;
            return this;
        }

        /**
         * Sets the value of {@link NodeSpec#getUnschedulable}
         * @param unschedulable Unschedulable controls node schedulability of new pods.
         *                      By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
         * @return {@code this}
         */
        public Builder unschedulable(java.lang.Boolean unschedulable) {
            this.unschedulable = unschedulable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NodeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NodeSpec build() {
            return new Jsii$Proxy(configSource, externalId, podCidr, podCidRs, providerId, taints, unschedulable);
        }
    }

    /**
     * An implementation for {@link NodeSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NodeSpec {
        private final k8s.NodeConfigSource configSource;
        private final java.lang.String externalId;
        private final java.lang.String podCidr;
        private final java.util.List<java.lang.String> podCidRs;
        private final java.lang.String providerId;
        private final java.util.List<k8s.Taint> taints;
        private final java.lang.Boolean unschedulable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.configSource = this.jsiiGet("configSource", k8s.NodeConfigSource.class);
            this.externalId = this.jsiiGet("externalID", java.lang.String.class);
            this.podCidr = this.jsiiGet("podCIDR", java.lang.String.class);
            this.podCidRs = this.jsiiGet("podCIDRs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.providerId = this.jsiiGet("providerID", java.lang.String.class);
            this.taints = this.jsiiGet("taints", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.Taint.class)));
            this.unschedulable = this.jsiiGet("unschedulable", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.NodeConfigSource configSource, final java.lang.String externalId, final java.lang.String podCidr, final java.util.List<java.lang.String> podCidRs, final java.lang.String providerId, final java.util.List<k8s.Taint> taints, final java.lang.Boolean unschedulable) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.configSource = configSource;
            this.externalId = externalId;
            this.podCidr = podCidr;
            this.podCidRs = podCidRs;
            this.providerId = providerId;
            this.taints = taints;
            this.unschedulable = unschedulable;
        }

        @Override
        public k8s.NodeConfigSource getConfigSource() {
            return this.configSource;
        }

        @Override
        public java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public java.lang.String getPodCidr() {
            return this.podCidr;
        }

        @Override
        public java.util.List<java.lang.String> getPodCidRs() {
            return this.podCidRs;
        }

        @Override
        public java.lang.String getProviderId() {
            return this.providerId;
        }

        @Override
        public java.util.List<k8s.Taint> getTaints() {
            return this.taints;
        }

        @Override
        public java.lang.Boolean getUnschedulable() {
            return this.unschedulable;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConfigSource() != null) {
                data.set("configSource", om.valueToTree(this.getConfigSource()));
            }
            if (this.getExternalId() != null) {
                data.set("externalID", om.valueToTree(this.getExternalId()));
            }
            if (this.getPodCidr() != null) {
                data.set("podCIDR", om.valueToTree(this.getPodCidr()));
            }
            if (this.getPodCidRs() != null) {
                data.set("podCIDRs", om.valueToTree(this.getPodCidRs()));
            }
            if (this.getProviderId() != null) {
                data.set("providerID", om.valueToTree(this.getProviderId()));
            }
            if (this.getTaints() != null) {
                data.set("taints", om.valueToTree(this.getTaints()));
            }
            if (this.getUnschedulable() != null) {
                data.set("unschedulable", om.valueToTree(this.getUnschedulable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NodeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NodeSpec.Jsii$Proxy that = (NodeSpec.Jsii$Proxy) o;

            if (this.configSource != null ? !this.configSource.equals(that.configSource) : that.configSource != null) return false;
            if (this.externalId != null ? !this.externalId.equals(that.externalId) : that.externalId != null) return false;
            if (this.podCidr != null ? !this.podCidr.equals(that.podCidr) : that.podCidr != null) return false;
            if (this.podCidRs != null ? !this.podCidRs.equals(that.podCidRs) : that.podCidRs != null) return false;
            if (this.providerId != null ? !this.providerId.equals(that.providerId) : that.providerId != null) return false;
            if (this.taints != null ? !this.taints.equals(that.taints) : that.taints != null) return false;
            return this.unschedulable != null ? this.unschedulable.equals(that.unschedulable) : that.unschedulable == null;
        }

        @Override
        public int hashCode() {
            int result = this.configSource != null ? this.configSource.hashCode() : 0;
            result = 31 * result + (this.externalId != null ? this.externalId.hashCode() : 0);
            result = 31 * result + (this.podCidr != null ? this.podCidr.hashCode() : 0);
            result = 31 * result + (this.podCidRs != null ? this.podCidRs.hashCode() : 0);
            result = 31 * result + (this.providerId != null ? this.providerId.hashCode() : 0);
            result = 31 * result + (this.taints != null ? this.taints.hashCode() : 0);
            result = 31 * result + (this.unschedulable != null ? this.unschedulable.hashCode() : 0);
            return result;
        }
    }
}
