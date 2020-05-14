package k8s;

/**
 * DeleteOptions may be provided when deleting an API object.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.176Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.DeleteOptions")
@software.amazon.jsii.Jsii.Proxy(DeleteOptions.Jsii$Proxy.class)
public interface DeleteOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * APIVersion defines the versioned schema of this representation of an object.
     * <p>
     * Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getApiVersion() {
        return null;
    }

    /**
     * When present, indicates that modifications should not be persisted.
     * <p>
     * An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getDryRun() {
        return null;
    }

    /**
     * The duration in seconds before the object should be deleted.
     * <p>
     * Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
     * <p>
     * Default: a per object value if not specified. zero means delete immediately.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getGracePeriodSeconds() {
        return null;
    }

    /**
     * Kind is a string value representing the REST resource this object represents.
     * <p>
     * Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getOrphanDependents() {
        return null;
    }

    /**
     * Must be fulfilled before a deletion is carried out.
     * <p>
     * If not possible, a 409 Conflict status will be returned.
     */
    default @org.jetbrains.annotations.Nullable k8s.Preconditions getPreconditions() {
        return null;
    }

    /**
     * Whether and how garbage collection will be performed.
     * <p>
     * Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPropagationPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeleteOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeleteOptions}
     */
    public static final class Builder {
        private java.lang.String apiVersion;
        private java.util.List<java.lang.String> dryRun;
        private java.lang.Number gracePeriodSeconds;
        private java.lang.String kind;
        private java.lang.Boolean orphanDependents;
        private k8s.Preconditions preconditions;
        private java.lang.String propagationPolicy;

        /**
         * Sets the value of {@link DeleteOptions#getApiVersion}
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object.
         *                   Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * @return {@code this}
         */
        public Builder apiVersion(java.lang.String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getDryRun}
         * @param dryRun When present, indicates that modifications should not be persisted.
         *               An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
         * @return {@code this}
         */
        public Builder dryRun(java.util.List<java.lang.String> dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getGracePeriodSeconds}
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted.
         *                           Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
         * @return {@code this}
         */
        public Builder gracePeriodSeconds(java.lang.Number gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getKind}
         * @param kind Kind is a string value representing the REST resource this object represents.
         *             Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getOrphanDependents}
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
         * @return {@code this}
         */
        public Builder orphanDependents(java.lang.Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getPreconditions}
         * @param preconditions Must be fulfilled before a deletion is carried out.
         *                      If not possible, a 409 Conflict status will be returned.
         * @return {@code this}
         */
        public Builder preconditions(k8s.Preconditions preconditions) {
            this.preconditions = preconditions;
            return this;
        }

        /**
         * Sets the value of {@link DeleteOptions#getPropagationPolicy}
         * @param propagationPolicy Whether and how garbage collection will be performed.
         *                          Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
         * @return {@code this}
         */
        public Builder propagationPolicy(java.lang.String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeleteOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        public DeleteOptions build() {
            return new Jsii$Proxy(apiVersion, dryRun, gracePeriodSeconds, kind, orphanDependents, preconditions, propagationPolicy);
        }
    }

    /**
     * An implementation for {@link DeleteOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeleteOptions {
        private final java.lang.String apiVersion;
        private final java.util.List<java.lang.String> dryRun;
        private final java.lang.Number gracePeriodSeconds;
        private final java.lang.String kind;
        private final java.lang.Boolean orphanDependents;
        private final k8s.Preconditions preconditions;
        private final java.lang.String propagationPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.apiVersion = this.jsiiGet("apiVersion", java.lang.String.class);
            this.dryRun = this.jsiiGet("dryRun", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.gracePeriodSeconds = this.jsiiGet("gracePeriodSeconds", java.lang.Number.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.orphanDependents = this.jsiiGet("orphanDependents", java.lang.Boolean.class);
            this.preconditions = this.jsiiGet("preconditions", k8s.Preconditions.class);
            this.propagationPolicy = this.jsiiGet("propagationPolicy", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String apiVersion, final java.util.List<java.lang.String> dryRun, final java.lang.Number gracePeriodSeconds, final java.lang.String kind, final java.lang.Boolean orphanDependents, final k8s.Preconditions preconditions, final java.lang.String propagationPolicy) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.apiVersion = apiVersion;
            this.dryRun = dryRun;
            this.gracePeriodSeconds = gracePeriodSeconds;
            this.kind = kind;
            this.orphanDependents = orphanDependents;
            this.preconditions = preconditions;
            this.propagationPolicy = propagationPolicy;
        }

        @Override
        public java.lang.String getApiVersion() {
            return this.apiVersion;
        }

        @Override
        public java.util.List<java.lang.String> getDryRun() {
            return this.dryRun;
        }

        @Override
        public java.lang.Number getGracePeriodSeconds() {
            return this.gracePeriodSeconds;
        }

        @Override
        public java.lang.String getKind() {
            return this.kind;
        }

        @Override
        public java.lang.Boolean getOrphanDependents() {
            return this.orphanDependents;
        }

        @Override
        public k8s.Preconditions getPreconditions() {
            return this.preconditions;
        }

        @Override
        public java.lang.String getPropagationPolicy() {
            return this.propagationPolicy;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getApiVersion() != null) {
                data.set("apiVersion", om.valueToTree(this.getApiVersion()));
            }
            if (this.getDryRun() != null) {
                data.set("dryRun", om.valueToTree(this.getDryRun()));
            }
            if (this.getGracePeriodSeconds() != null) {
                data.set("gracePeriodSeconds", om.valueToTree(this.getGracePeriodSeconds()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getOrphanDependents() != null) {
                data.set("orphanDependents", om.valueToTree(this.getOrphanDependents()));
            }
            if (this.getPreconditions() != null) {
                data.set("preconditions", om.valueToTree(this.getPreconditions()));
            }
            if (this.getPropagationPolicy() != null) {
                data.set("propagationPolicy", om.valueToTree(this.getPropagationPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DeleteOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeleteOptions.Jsii$Proxy that = (DeleteOptions.Jsii$Proxy) o;

            if (this.apiVersion != null ? !this.apiVersion.equals(that.apiVersion) : that.apiVersion != null) return false;
            if (this.dryRun != null ? !this.dryRun.equals(that.dryRun) : that.dryRun != null) return false;
            if (this.gracePeriodSeconds != null ? !this.gracePeriodSeconds.equals(that.gracePeriodSeconds) : that.gracePeriodSeconds != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.orphanDependents != null ? !this.orphanDependents.equals(that.orphanDependents) : that.orphanDependents != null) return false;
            if (this.preconditions != null ? !this.preconditions.equals(that.preconditions) : that.preconditions != null) return false;
            return this.propagationPolicy != null ? this.propagationPolicy.equals(that.propagationPolicy) : that.propagationPolicy == null;
        }

        @Override
        public int hashCode() {
            int result = this.apiVersion != null ? this.apiVersion.hashCode() : 0;
            result = 31 * result + (this.dryRun != null ? this.dryRun.hashCode() : 0);
            result = 31 * result + (this.gracePeriodSeconds != null ? this.gracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.orphanDependents != null ? this.orphanDependents.hashCode() : 0);
            result = 31 * result + (this.preconditions != null ? this.preconditions.hashCode() : 0);
            result = 31 * result + (this.propagationPolicy != null ? this.propagationPolicy.hashCode() : 0);
            return result;
        }
    }
}
