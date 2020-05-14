package k8s;

/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource.
 * <p>
 * A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) least one member of namespaces matches the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.390Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ResourcePolicyRule")
@software.amazon.jsii.Jsii.Proxy(ResourcePolicyRule.Jsii$Proxy.class)
public interface ResourcePolicyRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * `apiGroups` is a list of matching API groups and may not be empty.
     * <p>
     * "*" matches all API groups and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getApiGroups();

    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResources();

    /**
     * `verbs` is a list of matching verbs and may not be empty.
     * <p>
     * "*" matches all verbs and, if present, must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces).
     * <p>
     * If this field is omitted or false then the <code>namespaces</code> field must contain a non-empty list.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getClusterScope() {
        return null;
    }

    /**
     * `namespaces` is a list of target namespaces that restricts matches.
     * <p>
     * A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "<em>".  Note that "</em>" matches any specified namespace but does not match a request that <em>does not specify</em> a namespace (see the <code>clusterScope</code> field for that). This list may be empty, but only if <code>clusterScope</code> is true.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNamespaces() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ResourcePolicyRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ResourcePolicyRule}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> apiGroups;
        private java.util.List<java.lang.String> resources;
        private java.util.List<java.lang.String> verbs;
        private java.lang.Boolean clusterScope;
        private java.util.List<java.lang.String> namespaces;

        /**
         * Sets the value of {@link ResourcePolicyRule#getApiGroups}
         * @param apiGroups `apiGroups` is a list of matching API groups and may not be empty. This parameter is required.
         *                  "*" matches all API groups and, if present, must be the only entry. Required.
         * @return {@code this}
         */
        public Builder apiGroups(java.util.List<java.lang.String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRule#getResources}
         * @param resources `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required. This parameter is required.
         * @return {@code this}
         */
        public Builder resources(java.util.List<java.lang.String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRule#getVerbs}
         * @param verbs `verbs` is a list of matching verbs and may not be empty. This parameter is required.
         *              "*" matches all verbs and, if present, must be the only entry. Required.
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRule#getClusterScope}
         * @param clusterScope `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces).
         *                     If this field is omitted or false then the <code>namespaces</code> field must contain a non-empty list.
         * @return {@code this}
         */
        public Builder clusterScope(java.lang.Boolean clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        /**
         * Sets the value of {@link ResourcePolicyRule#getNamespaces}
         * @param namespaces `namespaces` is a list of target namespaces that restricts matches.
         *                   A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "<em>".  Note that "</em>" matches any specified namespace but does not match a request that <em>does not specify</em> a namespace (see the <code>clusterScope</code> field for that). This list may be empty, but only if <code>clusterScope</code> is true.
         * @return {@code this}
         */
        public Builder namespaces(java.util.List<java.lang.String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ResourcePolicyRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ResourcePolicyRule build() {
            return new Jsii$Proxy(apiGroups, resources, verbs, clusterScope, namespaces);
        }
    }

    /**
     * An implementation for {@link ResourcePolicyRule}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ResourcePolicyRule {
        private final java.util.List<java.lang.String> apiGroups;
        private final java.util.List<java.lang.String> resources;
        private final java.util.List<java.lang.String> verbs;
        private final java.lang.Boolean clusterScope;
        private final java.util.List<java.lang.String> namespaces;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiGroups = this.jsiiGet("apiGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resources = this.jsiiGet("resources", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.verbs = this.jsiiGet("verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clusterScope = this.jsiiGet("clusterScope", java.lang.Boolean.class);
            this.namespaces = this.jsiiGet("namespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> apiGroups, final java.util.List<java.lang.String> resources, final java.util.List<java.lang.String> verbs, final java.lang.Boolean clusterScope, final java.util.List<java.lang.String> namespaces) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiGroups = java.util.Objects.requireNonNull(apiGroups, "apiGroups is required");
            this.resources = java.util.Objects.requireNonNull(resources, "resources is required");
            this.verbs = java.util.Objects.requireNonNull(verbs, "verbs is required");
            this.clusterScope = clusterScope;
            this.namespaces = namespaces;
        }

        @Override
        public java.util.List<java.lang.String> getApiGroups() {
            return this.apiGroups;
        }

        @Override
        public java.util.List<java.lang.String> getResources() {
            return this.resources;
        }

        @Override
        public java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        public java.lang.Boolean getClusterScope() {
            return this.clusterScope;
        }

        @Override
        public java.util.List<java.lang.String> getNamespaces() {
            return this.namespaces;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiGroups", om.valueToTree(this.getApiGroups()));
            data.set("resources", om.valueToTree(this.getResources()));
            data.set("verbs", om.valueToTree(this.getVerbs()));
            if (this.getClusterScope() != null) {
                data.set("clusterScope", om.valueToTree(this.getClusterScope()));
            }
            if (this.getNamespaces() != null) {
                data.set("namespaces", om.valueToTree(this.getNamespaces()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ResourcePolicyRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ResourcePolicyRule.Jsii$Proxy that = (ResourcePolicyRule.Jsii$Proxy) o;

            if (!apiGroups.equals(that.apiGroups)) return false;
            if (!resources.equals(that.resources)) return false;
            if (!verbs.equals(that.verbs)) return false;
            if (this.clusterScope != null ? !this.clusterScope.equals(that.clusterScope) : that.clusterScope != null) return false;
            return this.namespaces != null ? this.namespaces.equals(that.namespaces) : that.namespaces == null;
        }

        @Override
        public int hashCode() {
            int result = this.apiGroups.hashCode();
            result = 31 * result + (this.resources.hashCode());
            result = 31 * result + (this.verbs.hashCode());
            result = 31 * result + (this.clusterScope != null ? this.clusterScope.hashCode() : 0);
            result = 31 * result + (this.namespaces != null ? this.namespaces.hashCode() : 0);
            return result;
        }
    }
}
