package k8s;

/**
 * Spec to control the desired behavior of rolling update.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.396Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.RollingUpdateDeployment")
@software.amazon.jsii.Jsii.Proxy(RollingUpdateDeployment.Jsii$Proxy.class)
public interface RollingUpdateDeployment extends software.amazon.jsii.JsiiSerializable {

    /**
     * The maximum number of pods that can be scheduled above the desired number of pods.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     * <p>
     * Default: 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
     */
    default @org.jetbrains.annotations.Nullable k8s.IntOrString getMaxSurge() {
        return null;
    }

    /**
     * The maximum number of pods that can be unavailable during the update.
     * <p>
     * Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     * <p>
     * Default: 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
     */
    default @org.jetbrains.annotations.Nullable k8s.IntOrString getMaxUnavailable() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RollingUpdateDeployment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RollingUpdateDeployment}
     */
    public static final class Builder {
        private k8s.IntOrString maxSurge;
        private k8s.IntOrString maxUnavailable;

        /**
         * Sets the value of {@link RollingUpdateDeployment#getMaxSurge}
         * @param maxSurge The maximum number of pods that can be scheduled above the desired number of pods.
         *                 Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. Defaults to 25%. Example: when this is set to 30%, the new ReplicaSet can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new ReplicaSet can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
         * @return {@code this}
         */
        public Builder maxSurge(k8s.IntOrString maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        /**
         * Sets the value of {@link RollingUpdateDeployment#getMaxUnavailable}
         * @param maxUnavailable The maximum number of pods that can be unavailable during the update.
         *                       Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when this is set to 30%, the old ReplicaSet can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old ReplicaSet can be scaled down further, followed by scaling up the new ReplicaSet, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
         * @return {@code this}
         */
        public Builder maxUnavailable(k8s.IntOrString maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RollingUpdateDeployment}
         * @throws NullPointerException if any required attribute was not provided
         */
        public RollingUpdateDeployment build() {
            return new Jsii$Proxy(maxSurge, maxUnavailable);
        }
    }

    /**
     * An implementation for {@link RollingUpdateDeployment}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RollingUpdateDeployment {
        private final k8s.IntOrString maxSurge;
        private final k8s.IntOrString maxUnavailable;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSurge = this.jsiiGet("maxSurge", k8s.IntOrString.class);
            this.maxUnavailable = this.jsiiGet("maxUnavailable", k8s.IntOrString.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.IntOrString maxSurge, final k8s.IntOrString maxUnavailable) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSurge = maxSurge;
            this.maxUnavailable = maxUnavailable;
        }

        @Override
        public k8s.IntOrString getMaxSurge() {
            return this.maxSurge;
        }

        @Override
        public k8s.IntOrString getMaxUnavailable() {
            return this.maxUnavailable;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMaxSurge() != null) {
                data.set("maxSurge", om.valueToTree(this.getMaxSurge()));
            }
            if (this.getMaxUnavailable() != null) {
                data.set("maxUnavailable", om.valueToTree(this.getMaxUnavailable()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RollingUpdateDeployment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RollingUpdateDeployment.Jsii$Proxy that = (RollingUpdateDeployment.Jsii$Proxy) o;

            if (this.maxSurge != null ? !this.maxSurge.equals(that.maxSurge) : that.maxSurge != null) return false;
            return this.maxUnavailable != null ? this.maxUnavailable.equals(that.maxUnavailable) : that.maxUnavailable == null;
        }

        @Override
        public int hashCode() {
            int result = this.maxSurge != null ? this.maxSurge.hashCode() : 0;
            result = 31 * result + (this.maxUnavailable != null ? this.maxUnavailable.hashCode() : 0);
            return result;
        }
    }
}
