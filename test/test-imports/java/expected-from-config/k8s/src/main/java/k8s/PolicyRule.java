package k8s;

/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.366Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.PolicyRule")
@software.amazon.jsii.Jsii.Proxy(PolicyRule.Jsii$Proxy.class)
public interface PolicyRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.
     * <p>
     * VerbAll represents all kinds.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * APIGroups is the name of the APIGroup that contains the resources.
     * <p>
     * If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getApiGroups() {
        return null;
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.
     * <p>
     * *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNonResourceUrLs() {
        return null;
    }

    /**
     * ResourceNames is an optional white list of names that the rule applies to.
     * <p>
     * An empty set means that everything is allowed.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceNames() {
        return null;
    }

    /**
     * Resources is a list of resources this rule applies to.
     * <p>
     * ResourceAll represents all resources.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResources() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PolicyRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PolicyRule}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> verbs;
        private java.util.List<java.lang.String> apiGroups;
        private java.util.List<java.lang.String> nonResourceUrLs;
        private java.util.List<java.lang.String> resourceNames;
        private java.util.List<java.lang.String> resources;

        /**
         * Sets the value of {@link PolicyRule#getVerbs}
         * @param verbs Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule. This parameter is required.
         *              VerbAll represents all kinds.
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRule#getApiGroups}
         * @param apiGroups APIGroups is the name of the APIGroup that contains the resources.
         *                  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
         * @return {@code this}
         */
        public Builder apiGroups(java.util.List<java.lang.String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRule#getNonResourceUrLs}
         * @param nonResourceUrLs NonResourceURLs is a set of partial urls that a user should have access to.
         *                        *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
         * @return {@code this}
         */
        public Builder nonResourceUrLs(java.util.List<java.lang.String> nonResourceUrLs) {
            this.nonResourceUrLs = nonResourceUrLs;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRule#getResourceNames}
         * @param resourceNames ResourceNames is an optional white list of names that the rule applies to.
         *                      An empty set means that everything is allowed.
         * @return {@code this}
         */
        public Builder resourceNames(java.util.List<java.lang.String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        /**
         * Sets the value of {@link PolicyRule#getResources}
         * @param resources Resources is a list of resources this rule applies to.
         *                  ResourceAll represents all resources.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PolicyRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        public PolicyRule build() {
            return new Jsii$Proxy(verbs, apiGroups, nonResourceUrLs, resourceNames, resources);
        }
    }

    /**
     * An implementation for {@link PolicyRule}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PolicyRule {
        private final java.util.List<java.lang.String> verbs;
        private final java.util.List<java.lang.String> apiGroups;
        private final java.util.List<java.lang.String> nonResourceUrLs;
        private final java.util.List<java.lang.String> resourceNames;
        private final java.util.List<java.lang.String> resources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.verbs = this.jsiiGet("verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.apiGroups = this.jsiiGet("apiGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.nonResourceUrLs = this.jsiiGet("nonResourceURLs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resourceNames = this.jsiiGet("resourceNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = this.jsiiGet("resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> verbs, final java.util.List<java.lang.String> apiGroups, final java.util.List<java.lang.String> nonResourceUrLs, final java.util.List<java.lang.String> resourceNames, final java.util.List<java.lang.String> resources) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.verbs = java.util.Objects.requireNonNull(verbs, "verbs is required");
            this.apiGroups = apiGroups;
            this.nonResourceUrLs = nonResourceUrLs;
            this.resourceNames = resourceNames;
            this.resources = resources;
        }

        @Override
        public java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        public java.util.List<java.lang.String> getApiGroups() {
            return this.apiGroups;
        }

        @Override
        public java.util.List<java.lang.String> getNonResourceUrLs() {
            return this.nonResourceUrLs;
        }

        @Override
        public java.util.List<java.lang.String> getResourceNames() {
            return this.resourceNames;
        }

        @Override
        public java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("verbs", om.valueToTree(this.getVerbs()));
            if (this.getApiGroups() != null) {
                data.set("apiGroups", om.valueToTree(this.getApiGroups()));
            }
            if (this.getNonResourceUrLs() != null) {
                data.set("nonResourceURLs", om.valueToTree(this.getNonResourceUrLs()));
            }
            if (this.getResourceNames() != null) {
                data.set("resourceNames", om.valueToTree(this.getResourceNames()));
            }
            if (this.getResources() != null) {
                data.set("resources", om.valueToTree(this.getResources()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PolicyRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PolicyRule.Jsii$Proxy that = (PolicyRule.Jsii$Proxy) o;

            if (!verbs.equals(that.verbs)) return false;
            if (this.apiGroups != null ? !this.apiGroups.equals(that.apiGroups) : that.apiGroups != null) return false;
            if (this.nonResourceUrLs != null ? !this.nonResourceUrLs.equals(that.nonResourceUrLs) : that.nonResourceUrLs != null) return false;
            if (this.resourceNames != null ? !this.resourceNames.equals(that.resourceNames) : that.resourceNames != null) return false;
            return this.resources != null ? this.resources.equals(that.resources) : that.resources == null;
        }

        @Override
        public int hashCode() {
            int result = this.verbs.hashCode();
            result = 31 * result + (this.apiGroups != null ? this.apiGroups.hashCode() : 0);
            result = 31 * result + (this.nonResourceUrLs != null ? this.nonResourceUrLs.hashCode() : 0);
            result = 31 * result + (this.resourceNames != null ? this.resourceNames.hashCode() : 0);
            result = 31 * result + (this.resources != null ? this.resources.hashCode() : 0);
            return result;
        }
    }
}
