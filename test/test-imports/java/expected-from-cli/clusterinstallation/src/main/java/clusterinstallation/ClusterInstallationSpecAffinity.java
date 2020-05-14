package clusterinstallation;

/**
 * If specified, affinity will define the pod's scheduling constraints.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.307Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecAffinity")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecAffinity.Jsii$Proxy.class)
public interface ClusterInstallationSpecAffinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecAffinityPodAffinity getPodAffinity() {
        return null;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecAffinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecAffinity}
     */
    public static final class Builder {
        private clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity nodeAffinity;
        private clusterinstallation.ClusterInstallationSpecAffinityPodAffinity podAffinity;
        private clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinity#getNodeAffinity}
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * @return {@code this}
         */
        public Builder nodeAffinity(clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinity#getPodAffinity}
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAffinity(clusterinstallation.ClusterInstallationSpecAffinityPodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinity#getPodAntiAffinity}
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAntiAffinity(clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecAffinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecAffinity build() {
            return new Jsii$Proxy(nodeAffinity, podAffinity, podAntiAffinity);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecAffinity}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecAffinity {
        private final clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity nodeAffinity;
        private final clusterinstallation.ClusterInstallationSpecAffinityPodAffinity podAffinity;
        private final clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = this.jsiiGet("nodeAffinity", clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity.class);
            this.podAffinity = this.jsiiGet("podAffinity", clusterinstallation.ClusterInstallationSpecAffinityPodAffinity.class);
            this.podAntiAffinity = this.jsiiGet("podAntiAffinity", clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity nodeAffinity, final clusterinstallation.ClusterInstallationSpecAffinityPodAffinity podAffinity, final clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity podAntiAffinity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeAffinity = nodeAffinity;
            this.podAffinity = podAffinity;
            this.podAntiAffinity = podAntiAffinity;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecAffinityNodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecAffinityPodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public clusterinstallation.ClusterInstallationSpecAffinityPodAntiAffinity getPodAntiAffinity() {
            return this.podAntiAffinity;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNodeAffinity() != null) {
                data.set("nodeAffinity", om.valueToTree(this.getNodeAffinity()));
            }
            if (this.getPodAffinity() != null) {
                data.set("podAffinity", om.valueToTree(this.getPodAffinity()));
            }
            if (this.getPodAntiAffinity() != null) {
                data.set("podAntiAffinity", om.valueToTree(this.getPodAntiAffinity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecAffinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecAffinity.Jsii$Proxy that = (ClusterInstallationSpecAffinity.Jsii$Proxy) o;

            if (this.nodeAffinity != null ? !this.nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null) return false;
            if (this.podAffinity != null ? !this.podAffinity.equals(that.podAffinity) : that.podAffinity != null) return false;
            return this.podAntiAffinity != null ? this.podAntiAffinity.equals(that.podAntiAffinity) : that.podAntiAffinity == null;
        }

        @Override
        public int hashCode() {
            int result = this.nodeAffinity != null ? this.nodeAffinity.hashCode() : 0;
            result = 31 * result + (this.podAffinity != null ? this.podAffinity.hashCode() : 0);
            result = 31 * result + (this.podAntiAffinity != null ? this.podAntiAffinity.hashCode() : 0);
            return result;
        }
    }
}
