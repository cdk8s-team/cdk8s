package k8s;

/**
 * CustomResourceDefinitionVersion describes a version for CRD.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.171Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionVersion")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionVersion.Jsii$Proxy.class)
public interface CustomResourceDefinitionVersion extends software.amazon.jsii.JsiiSerializable {

    /**
     * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * served is a flag enabling/disabling this version from being served via REST APIs.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getServed();

    /**
     * storage indicates this version should be used when persisting custom resources to storage.
     * <p>
     * There must be exactly one version with storage=true.
     */
    @org.jetbrains.annotations.NotNull java.lang.Boolean getStorage();

    /**
     * additionalPrinterColumns specifies additional columns returned in Table output.
     * <p>
     * See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
        return null;
    }

    /**
     * schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource.
     */
    default @org.jetbrains.annotations.Nullable k8s.CustomResourceValidation getSchema() {
        return null;
    }

    /**
     * subresources specify what subresources this version of the defined custom resource have.
     */
    default @org.jetbrains.annotations.Nullable k8s.CustomResourceSubresources getSubresources() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionVersion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionVersion}
     */
    public static final class Builder {
        private java.lang.String name;
        private java.lang.Boolean served;
        private java.lang.Boolean storage;
        private java.util.List<k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private k8s.CustomResourceValidation schema;
        private k8s.CustomResourceSubresources subresources;

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getName}
         * @param name name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getServed}
         * @param served served is a flag enabling/disabling this version from being served via REST APIs. This parameter is required.
         * @return {@code this}
         */
        public Builder served(java.lang.Boolean served) {
            this.served = served;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getStorage}
         * @param storage storage indicates this version should be used when persisting custom resources to storage. This parameter is required.
         *                There must be exactly one version with storage=true.
         * @return {@code this}
         */
        public Builder storage(java.lang.Boolean storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getAdditionalPrinterColumns}
         * @param additionalPrinterColumns additionalPrinterColumns specifies additional columns returned in Table output.
         *                                 See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
         * @return {@code this}
         */
        public Builder additionalPrinterColumns(java.util.List<k8s.CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getSchema}
         * @param schema schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource.
         * @return {@code this}
         */
        public Builder schema(k8s.CustomResourceValidation schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionVersion#getSubresources}
         * @param subresources subresources specify what subresources this version of the defined custom resource have.
         * @return {@code this}
         */
        public Builder subresources(k8s.CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionVersion}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CustomResourceDefinitionVersion build() {
            return new Jsii$Proxy(name, served, storage, additionalPrinterColumns, schema, subresources);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionVersion}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionVersion {
        private final java.lang.String name;
        private final java.lang.Boolean served;
        private final java.lang.Boolean storage;
        private final java.util.List<k8s.CustomResourceColumnDefinition> additionalPrinterColumns;
        private final k8s.CustomResourceValidation schema;
        private final k8s.CustomResourceSubresources subresources;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.served = this.jsiiGet("served", java.lang.Boolean.class);
            this.storage = this.jsiiGet("storage", java.lang.Boolean.class);
            this.additionalPrinterColumns = this.jsiiGet("additionalPrinterColumns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.CustomResourceColumnDefinition.class)));
            this.schema = this.jsiiGet("schema", k8s.CustomResourceValidation.class);
            this.subresources = this.jsiiGet("subresources", k8s.CustomResourceSubresources.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String name, final java.lang.Boolean served, final java.lang.Boolean storage, final java.util.List<k8s.CustomResourceColumnDefinition> additionalPrinterColumns, final k8s.CustomResourceValidation schema, final k8s.CustomResourceSubresources subresources) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.served = java.util.Objects.requireNonNull(served, "served is required");
            this.storage = java.util.Objects.requireNonNull(storage, "storage is required");
            this.additionalPrinterColumns = additionalPrinterColumns;
            this.schema = schema;
            this.subresources = subresources;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.Boolean getServed() {
            return this.served;
        }

        @Override
        public java.lang.Boolean getStorage() {
            return this.storage;
        }

        @Override
        public java.util.List<k8s.CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
            return this.additionalPrinterColumns;
        }

        @Override
        public k8s.CustomResourceValidation getSchema() {
            return this.schema;
        }

        @Override
        public k8s.CustomResourceSubresources getSubresources() {
            return this.subresources;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("served", om.valueToTree(this.getServed()));
            data.set("storage", om.valueToTree(this.getStorage()));
            if (this.getAdditionalPrinterColumns() != null) {
                data.set("additionalPrinterColumns", om.valueToTree(this.getAdditionalPrinterColumns()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getSubresources() != null) {
                data.set("subresources", om.valueToTree(this.getSubresources()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionVersion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionVersion.Jsii$Proxy that = (CustomResourceDefinitionVersion.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!served.equals(that.served)) return false;
            if (!storage.equals(that.storage)) return false;
            if (this.additionalPrinterColumns != null ? !this.additionalPrinterColumns.equals(that.additionalPrinterColumns) : that.additionalPrinterColumns != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            return this.subresources != null ? this.subresources.equals(that.subresources) : that.subresources == null;
        }

        @Override
        public int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.served.hashCode());
            result = 31 * result + (this.storage.hashCode());
            result = 31 * result + (this.additionalPrinterColumns != null ? this.additionalPrinterColumns.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.subresources != null ? this.subresources.hashCode() : 0);
            return result;
        }
    }
}
