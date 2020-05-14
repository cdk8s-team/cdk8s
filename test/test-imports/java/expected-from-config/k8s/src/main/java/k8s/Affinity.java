package k8s;

/**
 * Affinity is a group of affinity scheduling rules.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.088Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Affinity")
@software.amazon.jsii.Jsii.Proxy(Affinity.Jsii$Proxy.class)
public interface Affinity extends software.amazon.jsii.JsiiSerializable {

    /**
     * Describes node affinity scheduling rules for the pod.
     */
    default @org.jetbrains.annotations.Nullable k8s.NodeAffinity getNodeAffinity() {
        return null;
    }

    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable k8s.PodAffinity getPodAffinity() {
        return null;
    }

    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     */
    default @org.jetbrains.annotations.Nullable k8s.PodAntiAffinity getPodAntiAffinity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Affinity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Affinity}
     */
    public static final class Builder {
        private k8s.NodeAffinity nodeAffinity;
        private k8s.PodAffinity podAffinity;
        private k8s.PodAntiAffinity podAntiAffinity;

        /**
         * Sets the value of {@link Affinity#getNodeAffinity}
         * @param nodeAffinity Describes node affinity scheduling rules for the pod.
         * @return {@code this}
         */
        public Builder nodeAffinity(k8s.NodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        /**
         * Sets the value of {@link Affinity#getPodAffinity}
         * @param podAffinity Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAffinity(k8s.PodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }

        /**
         * Sets the value of {@link Affinity#getPodAntiAffinity}
         * @param podAntiAffinity Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
         * @return {@code this}
         */
        public Builder podAntiAffinity(k8s.PodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Affinity}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Affinity build() {
            return new Jsii$Proxy(nodeAffinity, podAffinity, podAntiAffinity);
        }
    }

    /**
     * An implementation for {@link Affinity}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Affinity {
        private final k8s.NodeAffinity nodeAffinity;
        private final k8s.PodAffinity podAffinity;
        private final k8s.PodAntiAffinity podAntiAffinity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeAffinity = this.jsiiGet("nodeAffinity", k8s.NodeAffinity.class);
            this.podAffinity = this.jsiiGet("podAffinity", k8s.PodAffinity.class);
            this.podAntiAffinity = this.jsiiGet("podAntiAffinity", k8s.PodAntiAffinity.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.NodeAffinity nodeAffinity, final k8s.PodAffinity podAffinity, final k8s.PodAntiAffinity podAntiAffinity) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeAffinity = nodeAffinity;
            this.podAffinity = podAffinity;
            this.podAntiAffinity = podAntiAffinity;
        }

        @Override
        public k8s.NodeAffinity getNodeAffinity() {
            return this.nodeAffinity;
        }

        @Override
        public k8s.PodAffinity getPodAffinity() {
            return this.podAffinity;
        }

        @Override
        public k8s.PodAntiAffinity getPodAntiAffinity() {
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
            struct.set("fqn", om.valueToTree("k8s.Affinity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Affinity.Jsii$Proxy that = (Affinity.Jsii$Proxy) o;

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
