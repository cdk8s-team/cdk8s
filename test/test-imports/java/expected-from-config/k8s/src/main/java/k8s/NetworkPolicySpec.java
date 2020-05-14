package k8s;

/**
 * NetworkPolicySpec provides the specification of a NetworkPolicy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.309Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NetworkPolicySpec")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicySpec.Jsii$Proxy.class)
public interface NetworkPolicySpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Selects the pods to which this NetworkPolicy object applies.
     * <p>
     * The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
     */
    @org.jetbrains.annotations.NotNull k8s.LabelSelector getPodSelector();

    /**
     * List of egress rules to be applied to the selected pods.
     * <p>
     * Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.NetworkPolicyEgressRule> getEgress() {
        return null;
    }

    /**
     * List of ingress rules to be applied to the selected pods.
     * <p>
     * Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.NetworkPolicyIngressRule> getIngress() {
        return null;
    }

    /**
     * List of rule types that the NetworkPolicy relates to.
     * <p>
     * Valid options are "Ingress", "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPolicyTypes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicySpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicySpec}
     */
    public static final class Builder {
        private k8s.LabelSelector podSelector;
        private java.util.List<k8s.NetworkPolicyEgressRule> egress;
        private java.util.List<k8s.NetworkPolicyIngressRule> ingress;
        private java.util.List<java.lang.String> policyTypes;

        /**
         * Sets the value of {@link NetworkPolicySpec#getPodSelector}
         * @param podSelector Selects the pods to which this NetworkPolicy object applies. This parameter is required.
         *                    The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
         * @return {@code this}
         */
        public Builder podSelector(k8s.LabelSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getEgress}
         * @param egress List of egress rules to be applied to the selected pods.
         *               Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
         * @return {@code this}
         */
        public Builder egress(java.util.List<k8s.NetworkPolicyEgressRule> egress) {
            this.egress = egress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getIngress}
         * @param ingress List of ingress rules to be applied to the selected pods.
         *                Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
         * @return {@code this}
         */
        public Builder ingress(java.util.List<k8s.NetworkPolicyIngressRule> ingress) {
            this.ingress = ingress;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicySpec#getPolicyTypes}
         * @param policyTypes List of rule types that the NetworkPolicy relates to.
         *                    Valid options are "Ingress", "Egress", or "Ingress,Egress". If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
         * @return {@code this}
         */
        public Builder policyTypes(java.util.List<java.lang.String> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicySpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NetworkPolicySpec build() {
            return new Jsii$Proxy(podSelector, egress, ingress, policyTypes);
        }
    }

    /**
     * An implementation for {@link NetworkPolicySpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicySpec {
        private final k8s.LabelSelector podSelector;
        private final java.util.List<k8s.NetworkPolicyEgressRule> egress;
        private final java.util.List<k8s.NetworkPolicyIngressRule> ingress;
        private final java.util.List<java.lang.String> policyTypes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.podSelector = this.jsiiGet("podSelector", k8s.LabelSelector.class);
            this.egress = this.jsiiGet("egress", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NetworkPolicyEgressRule.class)));
            this.ingress = this.jsiiGet("ingress", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NetworkPolicyIngressRule.class)));
            this.policyTypes = this.jsiiGet("policyTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.LabelSelector podSelector, final java.util.List<k8s.NetworkPolicyEgressRule> egress, final java.util.List<k8s.NetworkPolicyIngressRule> ingress, final java.util.List<java.lang.String> policyTypes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.podSelector = java.util.Objects.requireNonNull(podSelector, "podSelector is required");
            this.egress = egress;
            this.ingress = ingress;
            this.policyTypes = policyTypes;
        }

        @Override
        public k8s.LabelSelector getPodSelector() {
            return this.podSelector;
        }

        @Override
        public java.util.List<k8s.NetworkPolicyEgressRule> getEgress() {
            return this.egress;
        }

        @Override
        public java.util.List<k8s.NetworkPolicyIngressRule> getIngress() {
            return this.ingress;
        }

        @Override
        public java.util.List<java.lang.String> getPolicyTypes() {
            return this.policyTypes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("podSelector", om.valueToTree(this.getPodSelector()));
            if (this.getEgress() != null) {
                data.set("egress", om.valueToTree(this.getEgress()));
            }
            if (this.getIngress() != null) {
                data.set("ingress", om.valueToTree(this.getIngress()));
            }
            if (this.getPolicyTypes() != null) {
                data.set("policyTypes", om.valueToTree(this.getPolicyTypes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicySpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicySpec.Jsii$Proxy that = (NetworkPolicySpec.Jsii$Proxy) o;

            if (!podSelector.equals(that.podSelector)) return false;
            if (this.egress != null ? !this.egress.equals(that.egress) : that.egress != null) return false;
            if (this.ingress != null ? !this.ingress.equals(that.ingress) : that.ingress != null) return false;
            return this.policyTypes != null ? this.policyTypes.equals(that.policyTypes) : that.policyTypes == null;
        }

        @Override
        public int hashCode() {
            int result = this.podSelector.hashCode();
            result = 31 * result + (this.egress != null ? this.egress.hashCode() : 0);
            result = 31 * result + (this.ingress != null ? this.ingress.hashCode() : 0);
            result = 31 * result + (this.policyTypes != null ? this.policyTypes.hashCode() : 0);
            return result;
        }
    }
}
