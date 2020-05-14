package k8s;

/**
 * CSINodeDriver holds information about the specification of one CSI driver installed on a node.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.101Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CSINodeDriver")
@software.amazon.jsii.Jsii.Proxy(CSINodeDriver.Jsii$Proxy.class)
public interface CSINodeDriver extends software.amazon.jsii.JsiiSerializable {

    /**
     * This is the name of the CSI driver that this object refers to.
     * <p>
     * This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * nodeID of the node from the driver point of view.
     * <p>
     * This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getNodeId();

    /**
     * allocatable represents the volume resources of a node that are available for scheduling.
     * <p>
     * This field is beta.
     */
    default @org.jetbrains.annotations.Nullable k8s.VolumeNodeResources getAllocatable() {
        return null;
    }

    /**
     * topologyKeys is the list of keys supported by the driver.
     * <p>
     * When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTopologyKeys() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CSINodeDriver}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CSINodeDriver}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.String nodeId;
        private k8s.VolumeNodeResources allocatable;
        private java.util.List<java.lang.String> topologyKeys;

        /**
         * Sets the value of {@link CSINodeDriver#getName}
         * @param name This is the name of the CSI driver that this object refers to. This parameter is required.
         *             This MUST be the same name returned by the CSI GetPluginName() call for that driver.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CSINodeDriver#getNodeId}
         * @param nodeId nodeID of the node from the driver point of view. This parameter is required.
         *               This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
         * @return {@code this}
         */
        public Builder nodeId(java.lang.String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Sets the value of {@link CSINodeDriver#getAllocatable}
         * @param allocatable allocatable represents the volume resources of a node that are available for scheduling.
         *                    This field is beta.
         * @return {@code this}
         */
        public Builder allocatable(k8s.VolumeNodeResources allocatable) {
            this.allocatable = allocatable;
            return this;
        }

        /**
         * Sets the value of {@link CSINodeDriver#getTopologyKeys}
         * @param topologyKeys topologyKeys is the list of keys supported by the driver.
         *                     When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
         * @return {@code this}
         */
        public Builder topologyKeys(java.util.List<java.lang.String> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CSINodeDriver}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CSINodeDriver build() {
            return new Jsii$Proxy(name, nodeId, allocatable, topologyKeys);
        }
    }

    /**
     * An implementation for {@link CSINodeDriver}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CSINodeDriver {
        private final java.lang.String name;
        private final java.lang.String nodeId;
        private final k8s.VolumeNodeResources allocatable;
        private final java.util.List<java.lang.String> topologyKeys;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.nodeId = this.jsiiGet("nodeID", java.lang.String.class);
            this.allocatable = this.jsiiGet("allocatable", k8s.VolumeNodeResources.class);
            this.topologyKeys = this.jsiiGet("topologyKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.String nodeId, final k8s.VolumeNodeResources allocatable, final java.util.List<java.lang.String> topologyKeys) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.nodeId = java.util.Objects.requireNonNull(nodeId, "nodeId is required");
            this.allocatable = allocatable;
            this.topologyKeys = topologyKeys;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getNodeId() {
            return this.nodeId;
        }

        @Override
        public k8s.VolumeNodeResources getAllocatable() {
            return this.allocatable;
        }

        @Override
        public java.util.List<java.lang.String> getTopologyKeys() {
            return this.topologyKeys;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("nodeID", om.valueToTree(this.getNodeId()));
            if (this.getAllocatable() != null) {
                data.set("allocatable", om.valueToTree(this.getAllocatable()));
            }
            if (this.getTopologyKeys() != null) {
                data.set("topologyKeys", om.valueToTree(this.getTopologyKeys()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CSINodeDriver"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CSINodeDriver.Jsii$Proxy that = (CSINodeDriver.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!nodeId.equals(that.nodeId)) return false;
            if (this.allocatable != null ? !this.allocatable.equals(that.allocatable) : that.allocatable != null) return false;
            return this.topologyKeys != null ? this.topologyKeys.equals(that.topologyKeys) : that.topologyKeys == null;
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.nodeId.hashCode());
            result = 31 * result + (this.allocatable != null ? this.allocatable.hashCode() : 0);
            result = 31 * result + (this.topologyKeys != null ? this.topologyKeys.hashCode() : 0);
            return result;
        }
    }
}
