package k8s;

/**
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.161Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionNames")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionNames.Jsii$Proxy.class)
public interface CustomResourceDefinitionNames extends software.amazon.jsii.JsiiSerializable {

    /**
     * kind is the serialized kind of the resource.
     * <p>
     * It is normally CamelCase and singular. Custom resource instances will use this value as the <code>kind</code> attribute in API calls.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKind();

    /**
     * plural is the plural name of the resource to serve.
     * <p>
     * The custom resources are served under <code>/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;</code>. Must match the name of the CustomResourceDefinition (in the form <code>&lt;names.plural&gt;.&lt;group&gt;</code>). Must be all lowercase.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPlural();

    /**
     * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getCategories() {
        return null;
    }

    /**
     * listKind is the serialized kind of the list for this resource.
     * <p>
     * Defaults to "<code>kind</code>List".
     * <p>
     * Default: kind`List".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getListKind() {
        return null;
    }

    /**
     * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`.
     * <p>
     * It must be all lowercase.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getShortNames() {
        return null;
    }

    /**
     * singular is the singular name of the resource.
     * <p>
     * It must be all lowercase. Defaults to lowercased <code>kind</code>.
     * <p>
     * Default: lowercased `kind`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSingular() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionNames}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionNames}
     */
    public static final class Builder {
        private java.lang.String kind;
        private java.lang.String plural;
        private java.util.List<java.lang.String> categories;
        private java.lang.String listKind;
        private java.util.List<java.lang.String> shortNames;
        private java.lang.String singular;

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getKind}
         * @param kind kind is the serialized kind of the resource. This parameter is required.
         *             It is normally CamelCase and singular. Custom resource instances will use this value as the <code>kind</code> attribute in API calls.
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getPlural}
         * @param plural plural is the plural name of the resource to serve. This parameter is required.
         *               The custom resources are served under <code>/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;</code>. Must match the name of the CustomResourceDefinition (in the form <code>&lt;names.plural&gt;.&lt;group&gt;</code>). Must be all lowercase.
         * @return {@code this}
         */
        public Builder plural(java.lang.String plural) {
            this.plural = plural;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getCategories}
         * @param categories categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
         * @return {@code this}
         */
        public Builder categories(java.util.List<java.lang.String> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getListKind}
         * @param listKind listKind is the serialized kind of the list for this resource.
         *                 Defaults to "<code>kind</code>List".
         * @return {@code this}
         */
        public Builder listKind(java.lang.String listKind) {
            this.listKind = listKind;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getShortNames}
         * @param shortNames shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`.
         *                   It must be all lowercase.
         * @return {@code this}
         */
        public Builder shortNames(java.util.List<java.lang.String> shortNames) {
            this.shortNames = shortNames;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionNames#getSingular}
         * @param singular singular is the singular name of the resource.
         *                 It must be all lowercase. Defaults to lowercased <code>kind</code>.
         * @return {@code this}
         */
        public Builder singular(java.lang.String singular) {
            this.singular = singular;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionNames}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CustomResourceDefinitionNames build() {
            return new Jsii$Proxy(kind, plural, categories, listKind, shortNames, singular);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionNames}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionNames {
        private final java.lang.String kind;
        private final java.lang.String plural;
        private final java.util.List<java.lang.String> categories;
        private final java.lang.String listKind;
        private final java.util.List<java.lang.String> shortNames;
        private final java.lang.String singular;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.plural = this.jsiiGet("plural", java.lang.String.class);
            this.categories = this.jsiiGet("categories", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.listKind = this.jsiiGet("listKind", java.lang.String.class);
            this.shortNames = this.jsiiGet("shortNames", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.singular = this.jsiiGet("singular", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String kind, final java.lang.String plural, final java.util.List<java.lang.String> categories, final java.lang.String listKind, final java.util.List<java.lang.String> shortNames, final java.lang.String singular) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.kind = java.util.Objects.requireNonNull(kind, "kind is required");
            this.plural = java.util.Objects.requireNonNull(plural, "plural is required");
            this.categories = categories;
            this.listKind = listKind;
            this.shortNames = shortNames;
            this.singular = singular;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.String getPlural() {
            return this.plural;
        }

        @Override
        public java.util.List<java.lang.String> getCategories() {
            return this.categories;
        }

        @Override
        public java.lang.String getListKind() {
            return this.listKind;
        }

        @Override
        public java.util.List<java.lang.String> getShortNames() {
            return this.shortNames;
        }

        @Override
        public java.lang.String getSingular() {
            return this.singular;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("kind", om.valueToTree(this.getKind()));
            data.set("plural", om.valueToTree(this.getPlural()));
            if (this.getCategories() != null) {
                data.set("categories", om.valueToTree(this.getCategories()));
            }
            if (this.getListKind() != null) {
                data.set("listKind", om.valueToTree(this.getListKind()));
            }
            if (this.getShortNames() != null) {
                data.set("shortNames", om.valueToTree(this.getShortNames()));
            }
            if (this.getSingular() != null) {
                data.set("singular", om.valueToTree(this.getSingular()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionNames"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionNames.Jsii$Proxy that = (CustomResourceDefinitionNames.Jsii$Proxy) o;

            if (!kind.equals(that.kind)) return false;
            if (!plural.equals(that.plural)) return false;
            if (this.categories != null ? !this.categories.equals(that.categories) : that.categories != null) return false;
            if (this.listKind != null ? !this.listKind.equals(that.listKind) : that.listKind != null) return false;
            if (this.shortNames != null ? !this.shortNames.equals(that.shortNames) : that.shortNames != null) return false;
            return this.singular != null ? this.singular.equals(that.singular) : that.singular == null;
        }

        @Override
        public int hashCode() {
            int result = this.kind.hashCode();
            result = 31 * result + (this.plural.hashCode());
            result = 31 * result + (this.categories != null ? this.categories.hashCode() : 0);
            result = 31 * result + (this.listKind != null ? this.listKind.hashCode() : 0);
            result = 31 * result + (this.shortNames != null ? this.shortNames.hashCode() : 0);
            result = 31 * result + (this.singular != null ? this.singular.hashCode() : 0);
            return result;
        }
    }
}
