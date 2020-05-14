package clusterinstallation;

/**
 * A node selector term, associated with the corresponding weight.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.311Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference")
@software.amazon.jsii.Jsii.Proxy(ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy.class)
public interface ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference extends software.amazon.jsii.JsiiSerializable {

    /**
     * A list of node selector requirements by node's labels.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> getMatchExpressions() {
        return null;
    }

    /**
     * A list of node selector requirements by node's fields.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> getMatchFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    public static final class Builder {
        private java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions;
        private java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields;

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#getMatchExpressions}
         * @param matchExpressions A list of node selector requirements by node's labels.
         * @return {@code this}
         */
        public Builder matchExpressions(java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Sets the value of {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference#getMatchFields}
         * @param matchFields A list of node selector requirements by node's fields.
         * @return {@code this}
         */
        public Builder matchFields(java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields) {
            this.matchFields = matchFields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference build() {
            return new Jsii$Proxy(matchExpressions, matchFields);
        }
    }

    /**
     * An implementation for {@link ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference {
        private final java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions;
        private final java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.matchExpressions = this.jsiiGet("matchExpressions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions.class)));
            this.matchFields = this.jsiiGet("matchFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> matchExpressions, final java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> matchFields) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.matchExpressions = matchExpressions;
            this.matchFields = matchFields;
        }

        @Override
        public java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchExpressions> getMatchExpressions() {
            return this.matchExpressions;
        }

        @Override
        public java.util.List<clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreferenceMatchFields> getMatchFields() {
            return this.matchFields;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMatchExpressions() != null) {
                data.set("matchExpressions", om.valueToTree(this.getMatchExpressions()));
            }
            if (this.getMatchFields() != null) {
                data.set("matchFields", om.valueToTree(this.getMatchFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("clusterinstallation.ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy that = (ClusterInstallationSpecAffinityNodeAffinityPreferredDuringSchedulingIgnoredDuringExecutionPreference.Jsii$Proxy) o;

            if (this.matchExpressions != null ? !this.matchExpressions.equals(that.matchExpressions) : that.matchExpressions != null) return false;
            return this.matchFields != null ? this.matchFields.equals(that.matchFields) : that.matchFields == null;
        }

        @Override
        public int hashCode() {
            int result = this.matchExpressions != null ? this.matchExpressions.hashCode() : 0;
            result = 31 * result + (this.matchFields != null ? this.matchFields.hashCode() : 0);
            return result;
        }
    }
}
