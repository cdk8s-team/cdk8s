package k8s;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.346Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PodDisruptionBudgetSpec")
@software.amazon.jsii.Jsii.Proxy(PodDisruptionBudgetSpec.Jsii$Proxy.class)
public interface PodDisruptionBudgetSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
     */
    default @org.jetbrains.annotations.Nullable k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
     */
    default @org.jetbrains.annotations.Nullable k8s.IntOrString getMinAvailable() {
        return null;
    }

    /**
     * Label query over pods whose evictions are managed by the disruption budget.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodDisruptionBudgetSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodDisruptionBudgetSpec}
     */
    public static final class Builder {
        private k8s.IntOrString maxUnavailable;
        private k8s.IntOrString minAvailable;
        private k8s.LabelSelector selector;

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getMaxUnavailable}
         * @param maxUnavailable An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting with "minAvailable".
         * @return {@code this}
         */
        public Builder maxUnavailable(k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getMinAvailable}
         * @param minAvailable An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be available after the eviction, i.e. even in the absence of the evicted pod.  So for example you can prevent all voluntary evictions by specifying "100%".
         * @return {@code this}
         */
        public Builder minAvailable(k8s.IntOrString minAvailable) {
            this.minAvailable = minAvailable;
            return this;
        }

        /**
         * Sets the value of {@link PodDisruptionBudgetSpec#getSelector}
         * @param selector Label query over pods whose evictions are managed by the disruption budget.
         * @return {@code this}
         */
        public Builder selector(k8s.LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodDisruptionBudgetSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PodDisruptionBudgetSpec build() {
            return new Jsii$Proxy(maxUnavailable, minAvailable, selector);
        }
    }

    /**
     * An implementation for {@link PodDisruptionBudgetSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodDisruptionBudgetSpec {
        private final k8s.IntOrString maxUnavailable;
        private final k8s.IntOrString minAvailable;
        private final k8s.LabelSelector selector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = this.jsiiGet("maxUnavailable", k8s.IntOrString.class);
            this.minAvailable = this.jsiiGet("minAvailable", k8s.IntOrString.class);
            this.selector = this.jsiiGet("selector", k8s.LabelSelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.IntOrString maxUnavailable, final k8s.IntOrString minAvailable, final k8s.LabelSelector selector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = maxUnavailable;
            this.minAvailable = minAvailable;
            this.selector = selector;
        }

        @Override
        public k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public k8s.IntOrString getMinAvailable() {
            return this.minAvailable;
        }

        @Override
        public k8s.LabelSelector getSelector() {
            return this.selector;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }
            if (this.getMinAvailable() != null) {
                data.set("minAvailable", om.valueToTree(this.getMinAvailable()));
            }
            if (this.getSelector() != null) {
                data.set("selector", om.valueToTree(this.getSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodDisruptionBudgetSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodDisruptionBudgetSpec.Jsii$Proxy that = (PodDisruptionBudgetSpec.Jsii$Proxy) o;

            if (this.maxUnavailable != null ? !this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable != null) return false;
            if (this.minAvailable != null ? !this.minAvailable.equals(that.minAvailable) : that.minAvailable != null) return false;
            return this.selector != null ? this.selector.equals(that.selector) : that.selector == null;
        }

        @Override
        public int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            result = 31 * result + (this.minAvailable != null ? this.minAvailable.hashCode() : 0);
            result = 31 * result + (this.selector != null ? this.selector.hashCode() : 0);
            return result;
        }
    }
}
