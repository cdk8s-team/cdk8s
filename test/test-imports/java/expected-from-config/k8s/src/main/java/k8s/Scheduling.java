package k8s;

/**
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.404Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Scheduling")
@software.amazon.jsii.Jsii.Proxy(Scheduling.Jsii$Proxy.class)
public interface Scheduling extends software.amazon.jsii.JsiiSerializable {

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
     * <p>
     * Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
        return null;
    }

    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.Toleration> getTolerations() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Scheduling}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Scheduling}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private java.util.List<k8s.Toleration> tolerations;

        /**
         * Sets the value of {@link Scheduling#getNodeSelector}
         * @param nodeSelector nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
         *                     Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
         * @return {@code this}
         */
        public Builder nodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Sets the value of {@link Scheduling#getTolerations}
         * @param tolerations tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
         * @return {@code this}
         */
        public Builder tolerations(java.util.List<k8s.Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Scheduling}
         * @throws NullPointerException if any required attribute was not provided
         */
        public Scheduling build() {
            return new Jsii$Proxy(nodeSelector, tolerations);
        }
    }

    /**
     * An implementation for {@link Scheduling}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Scheduling {
        private final java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private final java.util.List<k8s.Toleration> tolerations;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nodeSelector = this.jsiiGet("nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tolerations = this.jsiiGet("tolerations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.Toleration.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> nodeSelector, final java.util.List<k8s.Toleration> tolerations) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nodeSelector = nodeSelector;
            this.tolerations = tolerations;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        public java.util.List<k8s.Toleration> getTolerations() {
            return this.tolerations;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }
            if (this.getTolerations() != null) {
                data.set("tolerations", om.valueToTree(this.getTolerations()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Scheduling"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Scheduling.Jsii$Proxy that = (Scheduling.Jsii$Proxy) o;

            if (this.nodeSelector != null ? !this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null) return false;
            return this.tolerations != null ? this.tolerations.equals(that.tolerations) : that.tolerations == null;
        }

        @Override
        public int hashCode() {
            int result = this.nodeSelector != null ? this.nodeSelector.hashCode() : 0;
            result = 31 * result + (this.tolerations != null ? this.tolerations.hashCode() : 0);
            return result;
        }
    }
}
