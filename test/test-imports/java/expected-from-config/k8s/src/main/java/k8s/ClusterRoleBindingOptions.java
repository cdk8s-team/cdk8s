package k8s;

/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.
 * <p>
 * It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.129Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ClusterRoleBindingOptions")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleBindingOptions.Jsii$Proxy.class)
public interface ClusterRoleBindingOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * RoleRef can only reference a ClusterRole in the global namespace.
     * <p>
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     */
    @org.jetbrains.annotations.NotNull k8s.RoleRef getRoleRef();

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Subjects holds references to the objects the role applies to.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.Subject> getSubjects() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleBindingOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleBindingOptions}
     */
    public static final class Builder {
        private k8s.RoleRef roleRef;
        private k8s.ObjectMeta metadata;
        private java.util.List<k8s.Subject> subjects;

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getRoleRef}
         * @param roleRef RoleRef can only reference a ClusterRole in the global namespace. This parameter is required.
         *                If the RoleRef cannot be resolved, the Authorizer must return an error.
         * @return {@code this}
         */
        public Builder roleRef(k8s.RoleRef roleRef) {
            this.roleRef = roleRef;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getSubjects}
         * @param subjects Subjects holds references to the objects the role applies to.
         * @return {@code this}
         */
        public Builder subjects(java.util.List<k8s.Subject> subjects) {
            this.subjects = subjects;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleBindingOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ClusterRoleBindingOptions build() {
            return new Jsii$Proxy(roleRef, metadata, subjects);
        }
    }

    /**
     * An implementation for {@link ClusterRoleBindingOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleBindingOptions {
        private final k8s.RoleRef roleRef;
        private final k8s.ObjectMeta metadata;
        private final java.util.List<k8s.Subject> subjects;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleRef = this.jsiiGet("roleRef", k8s.RoleRef.class);
            this.metadata = this.jsiiGet("metadata", k8s.ObjectMeta.class);
            this.subjects = this.jsiiGet("subjects", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.Subject.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final k8s.RoleRef roleRef, final k8s.ObjectMeta metadata, final java.util.List<k8s.Subject> subjects) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleRef = java.util.Objects.requireNonNull(roleRef, "roleRef is required");
            this.metadata = metadata;
            this.subjects = subjects;
        }

        @Override
        public k8s.RoleRef getRoleRef() {
            return this.roleRef;
        }

        @Override
        public k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<k8s.Subject> getSubjects() {
            return this.subjects;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleRef", om.valueToTree(this.getRoleRef()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSubjects() != null) {
                data.set("subjects", om.valueToTree(this.getSubjects()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterRoleBindingOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleBindingOptions.Jsii$Proxy that = (ClusterRoleBindingOptions.Jsii$Proxy) o;

            if (!roleRef.equals(that.roleRef)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.subjects != null ? this.subjects.equals(that.subjects) : that.subjects == null;
        }

        @Override
        public int hashCode() {
            int result = this.roleRef.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.subjects != null ? this.subjects.hashCode() : 0);
            return result;
        }
    }
}
