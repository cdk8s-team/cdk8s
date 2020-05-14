package k8s;

/**
 * Spec to control the desired behavior of daemon set rolling update.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.396Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RollingUpdateDaemonSet")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateDaemonSet.Jsii$Proxy.class)
public interface RollingUpdateDaemonSet extends software.amazon.jsii.JsiiSerializable {

    /**
     * The maximum number of DaemonSet pods that can be unavailable during the update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
     */
    default @org.jetbrains.annotations.Nullable k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateDaemonSet}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateDaemonSet}
     */
    public static final class Builder {
        private k8s.IntOrString maxUnavailable;

        /**
         * Sets the value of {@link RollingUpdateDaemonSet#getMaxUnavailable}
         * @param maxUnavailable The maximum number of DaemonSet pods that can be unavailable during the update.
         *                       Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
         * @return {@code this}
         */
        public Builder maxUnavailable(k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateDaemonSet}
         * @throws NullPointerException if any required attribute was not provided
         */
        public RollingUpdateDaemonSet build() {
            return new Jsii$Proxy(maxUnavailable);
        }
    }

    /**
     * An implementation for {@link RollingUpdateDaemonSet}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateDaemonSet {
        private final k8s.IntOrString maxUnavailable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxUnavailable = this.jsiiGet("maxUnavailable", k8s.IntOrString.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.IntOrString maxUnavailable) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxUnavailable = maxUnavailable;
        }

        @Override
        public k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateDaemonSet"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateDaemonSet.Jsii$Proxy that = (RollingUpdateDaemonSet.Jsii$Proxy) o;

            return this.maxUnavailable != null ? this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable == null;
        }

        @Override
        public int hashCode() {
            int result = this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0;
            return result;
        }
    }
}
