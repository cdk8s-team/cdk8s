package k8s;

/**
 * OwnerReference contains enough information to let you identify an owning object.
 * <p>
 * An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.330Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.OwnerReference")
@software.amazon.jsii.Jsii.Proxy(OwnerReference.Jsii$Proxy.class)
public interface OwnerReference extends software.amazon.jsii.JsiiSerializable {

    /**
     * API version of the referent.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getApiVersion();

    /**
     * Kind of the referent.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * Name of the referent.
     * <p>
     * More info: http://kubernetes.io/docs/user-guide/identifiers#names
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * UID of the referent.
     * <p>
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUid();

    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed.
     * <p>
     * Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * <p>
     * Default: false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getBlockOwnerDeletion() {
        return null;
    }

    /**
     * If true, this reference points to the managing controller.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getController() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OwnerReference}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OwnerReference}
     */
    public static final class Builder {
        private java.lang.String apiVersion;
        private java.lang.String kind;
        private java.lang.String name;
        private java.lang.String uid;
        private java.lang.Boolean blockOwnerDeletion;
        private java.lang.Boolean controller;

        /**
         * Sets the value of {@link OwnerReference#getApiVersion}
         * @param apiVersion API version of the referent. This parameter is required.
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link OwnerReference#getKind}
         * @param kind Kind of the referent. This parameter is required.
         *             More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link OwnerReference#getName}
         * @param name Name of the referent. This parameter is required.
         *             More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link OwnerReference#getUid}
         * @param uid UID of the referent. This parameter is required.
         *            More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Sets the value of {@link OwnerReference#getBlockOwnerDeletion}
         * @param blockOwnerDeletion If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed.
         *                           Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
         * @return {@code this}
         */
        public Builder blockOwnerDeletion(java.lang.Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        /**
         * Sets the value of {@link OwnerReference#getController}
         * @param controller If true, this reference points to the managing controller.
         * @return {@code this}
         */
        public Builder controller(java.lang.Boolean controller) {
            this.controller = controller;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OwnerReference}
         * @throws NullPointerException if any required attribute was not provided
         */
        public OwnerReference build() {
            return new Jsii$Proxy(apiVersion, kind, name, uid, blockOwnerDeletion, controller);
        }
    }

    /**
     * An implementation for {@link OwnerReference}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OwnerReference {
        private final java.lang.String apiVersion;
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.String uid;
        private final java.lang.Boolean blockOwnerDeletion;
        private final java.lang.Boolean controller;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = this.jsiiGet("apiVersion", java.lang.String.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.uid = this.jsiiGet("uid", java.lang.String.class);
            this.blockOwnerDeletion = this.jsiiGet("blockOwnerDeletion", java.lang.Boolean.class);
            this.controller = this.jsiiGet("controller", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String apiVersion, final java.lang.String kind, final java.lang.String name, final java.lang.String uid, final java.lang.Boolean blockOwnerDeletion, final java.lang.Boolean controller) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = java.util.Objects.requireNonNull(apiVersion, "apiVersion is required");
            this.kind = java.util.Objects.requireNonNull(kind, "kind is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.uid = java.util.Objects.requireNonNull(uid, "uid is required");
            this.blockOwnerDeletion = blockOwnerDeletion;
            this.controller = controller;
        }

        @Override
        public java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public java.lang.Boolean getBlockOwnerDeletion() {
            return this.blockOwnerDeletion;
        }

        @Override
        public java.lang.Boolean getController() {
            return this.controller;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            data.set("kind", om.valueToTree(this.getKind()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("uid", om.valueToTree(this.getUid()));
            if (this.getBlockOwnerDeletion() != null) {
                data.set("blockOwnerDeletion", om.valueToTree(this.getBlockOwnerDeletion()));
            }
            if (this.getController() != null) {
                data.set("controller", om.valueToTree(this.getController()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.OwnerReference"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OwnerReference.Jsii$Proxy that = (OwnerReference.Jsii$Proxy) o;

            if (!apiVersion.equals(that.apiVersion)) return false;
            if (!kind.equals(that.kind)) return false;
            if (!name.equals(that.name)) return false;
            if (!uid.equals(that.uid)) return false;
            if (this.blockOwnerDeletion != null ? !this.blockOwnerDeletion.equals(that.blockOwnerDeletion) : that.blockOwnerDeletion != null) return false;
            return this.controller != null ? this.controller.equals(that.controller) : that.controller == null;
        }

        @Override
        public int hashCode() {
            int result = this.apiVersion.hashCode();
            result = 31 * result + (this.kind.hashCode());
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.uid.hashCode());
            result = 31 * result + (this.blockOwnerDeletion != null ? this.blockOwnerDeletion.hashCode() : 0);
            result = 31 * result + (this.controller != null ? this.controller.hashCode() : 0);
            return result;
        }
    }
}
