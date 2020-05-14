package k8s;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.453Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.TopologySpreadConstraint")
@software.amazon.jsii.Jsii.Proxy(TopologySpreadConstraint.Jsii$Proxy.class)
public interface TopologySpreadConstraint extends software.amazon.jsii.JsiiSerializable {

    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * <p>
     * It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxSkew();

    /**
     * TopologyKey is the key of node labels.
     * <p>
     * Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey();

    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint.
     * <p>
     * <ul>
     * <li>DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as "Unsatisfiable" if and only if placing incoming pod on any topology violates "MaxSkew". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWhenUnsatisfiable();

    /**
     * LabelSelector is used to find matching pods.
     * <p>
     * Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
     */
    default @org.jetbrains.annotations.Nullable k8s.LabelSelector getLabelSelector() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TopologySpreadConstraint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TopologySpreadConstraint}
     */
    public static final class Builder {
        private java.lang.Number maxSkew;
        private java.lang.String topologyKey;
        private java.lang.String whenUnsatisfiable;
        private k8s.LabelSelector labelSelector;

        /**
         * Sets the value of {@link TopologySpreadConstraint#getMaxSkew}
         * @param maxSkew MaxSkew describes the degree to which pods may be unevenly distributed. This parameter is required.
         *                It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.
         * @return {@code this}
         */
        public Builder maxSkew(java.lang.Number maxSkew) {
            this.maxSkew = maxSkew;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getTopologyKey}
         * @param topologyKey TopologyKey is the key of node labels. This parameter is required.
         *                    Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getWhenUnsatisfiable}
         * @param whenUnsatisfiable WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. This parameter is required.
         *                          <ul>
         *                          <li>DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as "Unsatisfiable" if and only if placing incoming pod on any topology violates "MaxSkew". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
         *                          </ul>
         * @return {@code this}
         */
        public Builder whenUnsatisfiable(java.lang.String whenUnsatisfiable) {
            this.whenUnsatisfiable = whenUnsatisfiable;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getLabelSelector}
         * @param labelSelector LabelSelector is used to find matching pods.
         *                      Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
         * @return {@code this}
         */
        public Builder labelSelector(k8s.LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TopologySpreadConstraint}
         * @throws NullPointerException if any required attribute was not provided
         */
        public TopologySpreadConstraint build() {
            return new Jsii$Proxy(maxSkew, topologyKey, whenUnsatisfiable, labelSelector);
        }
    }

    /**
     * An implementation for {@link TopologySpreadConstraint}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TopologySpreadConstraint {
        private final java.lang.Number maxSkew;
        private final java.lang.String topologyKey;
        private final java.lang.String whenUnsatisfiable;
        private final k8s.LabelSelector labelSelector;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSkew = this.jsiiGet("maxSkew", java.lang.Number.class);
            this.topologyKey = this.jsiiGet("topologyKey", java.lang.String.class);
            this.whenUnsatisfiable = this.jsiiGet("whenUnsatisfiable", java.lang.String.class);
            this.labelSelector = this.jsiiGet("labelSelector", k8s.LabelSelector.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number maxSkew, final java.lang.String topologyKey, final java.lang.String whenUnsatisfiable, final k8s.LabelSelector labelSelector) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSkew = java.util.Objects.requireNonNull(maxSkew, "maxSkew is required");
            this.topologyKey = java.util.Objects.requireNonNull(topologyKey, "topologyKey is required");
            this.whenUnsatisfiable = java.util.Objects.requireNonNull(whenUnsatisfiable, "whenUnsatisfiable is required");
            this.labelSelector = labelSelector;
        }

        @Override
        public java.lang.Number getMaxSkew() {
            return this.maxSkew;
        }

        @Override
        public java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public java.lang.String getWhenUnsatisfiable() {
            return this.whenUnsatisfiable;
        }

        @Override
        public k8s.LabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxSkew", om.valueToTree(this.getMaxSkew()));
            data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            data.set("whenUnsatisfiable", om.valueToTree(this.getWhenUnsatisfiable()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TopologySpreadConstraint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TopologySpreadConstraint.Jsii$Proxy that = (TopologySpreadConstraint.Jsii$Proxy) o;

            if (!maxSkew.equals(that.maxSkew)) return false;
            if (!topologyKey.equals(that.topologyKey)) return false;
            if (!whenUnsatisfiable.equals(that.whenUnsatisfiable)) return false;
            return this.labelSelector != null ? this.labelSelector.equals(that.labelSelector) : that.labelSelector == null;
        }

        @Override
        public int hashCode() {
            int result = this.maxSkew.hashCode();
            result = 31 * result + (this.topologyKey.hashCode());
            result = 31 * result + (this.whenUnsatisfiable.hashCode());
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            return result;
        }
    }
}
