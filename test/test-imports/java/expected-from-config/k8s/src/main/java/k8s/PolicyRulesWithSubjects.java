package k8s;

/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver.
 * <p>
 * The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.376Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PolicyRulesWithSubjects")
@software.amazon.jsii.Jsii.Proxy(PolicyRulesWithSubjects.Jsii$Proxy.class)
public interface PolicyRulesWithSubjects extends software.amazon.jsii.JsiiSerializable {

    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about.
     * <p>
     * There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<k8s.Subject> getSubjects();

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.NonResourcePolicyRule> getNonResourceRules() {
        return null;
    }

    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource.
     * <p>
     * At least one of <code>resourceRules</code> and <code>nonResourceRules</code> has to be non-empty.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.ResourcePolicyRule> getResourceRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PolicyRulesWithSubjects}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PolicyRulesWithSubjects}
     */
    public static final class Builder {
        private java.util.List<k8s.Subject> subjects;
        private java.util.List<k8s.NonResourcePolicyRule> nonResourceRules;
        private java.util.List<k8s.ResourcePolicyRule> resourceRules;

        /**
         * Sets the value of {@link PolicyRulesWithSubjects#getSubjects}
         * @param subjects subjects is the list of normal user, serviceaccount, or group that this rule cares about. This parameter is required.
         *                 There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
         * @return {@code this}
         */
        public Builder subjects(java.util.List<k8s.Subject> subjects) {
            this.subjects = subjects;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRulesWithSubjects#getNonResourceRules}
         * @param nonResourceRules `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
         * @return {@code this}
         */
        public Builder nonResourceRules(java.util.List<k8s.NonResourcePolicyRule> nonResourceRules) {
            this.nonResourceRules = nonResourceRules;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRulesWithSubjects#getResourceRules}
         * @param resourceRules `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource.
         *                      At least one of <code>resourceRules</code> and <code>nonResourceRules</code> has to be non-empty.
         * @return {@code this}
         */
        public Builder resourceRules(java.util.List<k8s.ResourcePolicyRule> resourceRules) {
            this.resourceRules = resourceRules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PolicyRulesWithSubjects}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PolicyRulesWithSubjects build() {
            return new Jsii$Proxy(subjects, nonResourceRules, resourceRules);
        }
    }

    /**
     * An implementation for {@link PolicyRulesWithSubjects}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PolicyRulesWithSubjects {
        private final java.util.List<k8s.Subject> subjects;
        private final java.util.List<k8s.NonResourcePolicyRule> nonResourceRules;
        private final java.util.List<k8s.ResourcePolicyRule> resourceRules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.subjects = this.jsiiGet("subjects", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.Subject.class)));
            this.nonResourceRules = this.jsiiGet("nonResourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.NonResourcePolicyRule.class)));
            this.resourceRules = this.jsiiGet("resourceRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.ResourcePolicyRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.Subject> subjects, final java.util.List<k8s.NonResourcePolicyRule> nonResourceRules, final java.util.List<k8s.ResourcePolicyRule> resourceRules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.subjects = java.util.Objects.requireNonNull(subjects, "subjects is required");
            this.nonResourceRules = nonResourceRules;
            this.resourceRules = resourceRules;
        }

        @Override
        public java.util.List<k8s.Subject> getSubjects() {
            return this.subjects;
        }

        @Override
        public java.util.List<k8s.NonResourcePolicyRule> getNonResourceRules() {
            return this.nonResourceRules;
        }

        @Override
        public java.util.List<k8s.ResourcePolicyRule> getResourceRules() {
            return this.resourceRules;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("subjects", om.valueToTree(this.getSubjects()));
            if (this.getNonResourceRules() != null) {
                data.set("nonResourceRules", om.valueToTree(this.getNonResourceRules()));
            }
            if (this.getResourceRules() != null) {
                data.set("resourceRules", om.valueToTree(this.getResourceRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PolicyRulesWithSubjects"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PolicyRulesWithSubjects.Jsii$Proxy that = (PolicyRulesWithSubjects.Jsii$Proxy) o;

            if (!subjects.equals(that.subjects)) return false;
            if (this.nonResourceRules != null ? !this.nonResourceRules.equals(that.nonResourceRules) : that.nonResourceRules != null) return false;
            return this.resourceRules != null ? this.resourceRules.equals(that.resourceRules) : that.resourceRules == null;
        }

        @Override
        public int hashCode() {
            int result = this.subjects.hashCode();
            result = 31 * result + (this.nonResourceRules != null ? this.nonResourceRules.hashCode() : 0);
            result = 31 * result + (this.resourceRules != null ? this.resourceRules.hashCode() : 0);
            return result;
        }
    }
}
