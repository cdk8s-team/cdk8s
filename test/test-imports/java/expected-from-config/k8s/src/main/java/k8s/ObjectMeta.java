package k8s;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.318Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.ObjectMeta")
@software.amazon.jsii.Jsii.Proxy(ObjectMeta.Jsii$Proxy.class)
public interface ObjectMeta extends software.amazon.jsii.JsiiSerializable {

    /**
     * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
     * <p>
     * They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
        return null;
    }

    /**
     * The name of the cluster which the object belongs to.
     * <p>
     * This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getClusterName() {
        return null;
    }

    /**
     * CreationTimestamp is a timestamp representing the server time when this object was created.
     * <p>
     * It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
     * <p>
     * Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getCreationTimestamp() {
        return null;
    }

    /**
     * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system.
     * <p>
     * Only set when deletionTimestamp is also set. May only be shortened. Read-only.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDeletionGracePeriodSeconds() {
        return null;
    }

    /**
     * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted.
     * <p>
     * This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
     * <p>
     * Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getDeletionTimestamp() {
        return null;
    }

    /**
     * Must be empty before the object is deleted from the registry.
     * <p>
     * Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFinalizers() {
        return null;
    }

    /**
     * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided.
     * <p>
     * If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
     * <p>
     * If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
     * <p>
     * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGenerateName() {
        return null;
    }

    /**
     * A sequence number representing a specific generation of the desired state.
     * <p>
     * Populated by the system. Read-only.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getGeneration() {
        return null;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize (scope and select) objects.
     * <p>
     * May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getLabels() {
        return null;
    }

    /**
     * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow.
     * <p>
     * This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.ManagedFieldsEntry> getManagedFields() {
        return null;
    }

    /**
     * Name must be unique within a namespace.
     * <p>
     * Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Namespace defines the space within each name must be unique.
     * <p>
     * An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
     * <p>
     * Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamespace() {
        return null;
    }

    /**
     * List of objects depended by this object.
     * <p>
     * If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.OwnerReference> getOwnerReferences() {
        return null;
    }

    /**
     * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed.
     * <p>
     * May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
     * <p>
     * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResourceVersion() {
        return null;
    }

    /**
     * SelfLink is a URL representing this object. Populated by the system. Read-only.
     * <p>
     * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelfLink() {
        return null;
    }

    /**
     * UID is the unique in time and space value for this object.
     * <p>
     * It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
     * <p>
     * Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ObjectMeta}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ObjectMeta}
     */
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> annotations;
        private java.lang.String clusterName;
        private java.time.Instant creationTimestamp;
        private java.lang.Number deletionGracePeriodSeconds;
        private java.time.Instant deletionTimestamp;
        private java.util.List<java.lang.String> finalizers;
        private java.lang.String generateName;
        private java.lang.Number generation;
        private java.util.Map<java.lang.String, java.lang.String> labels;
        private java.util.List<k8s.ManagedFieldsEntry> managedFields;
        private java.lang.String name;
        private java.lang.String namespace;
        private java.util.List<k8s.OwnerReference> ownerReferences;
        private java.lang.String resourceVersion;
        private java.lang.String selfLink;
        private java.lang.String uid;

        /**
         * Sets the value of {@link ObjectMeta#getAnnotations}
         * @param annotations Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
         *                    They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
         * @return {@code this}
         */
        public Builder annotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getClusterName}
         * @param clusterName The name of the cluster which the object belongs to.
         *                    This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
         * @return {@code this}
         */
        public Builder clusterName(java.lang.String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getCreationTimestamp}
         * @param creationTimestamp CreationTimestamp is a timestamp representing the server time when this object was created.
         *                          It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.
         *                          <p>
         *                          Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder creationTimestamp(java.time.Instant creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getDeletionGracePeriodSeconds}
         * @param deletionGracePeriodSeconds Number of seconds allowed for this object to gracefully terminate before it will be removed from the system.
         *                                   Only set when deletionTimestamp is also set. May only be shortened. Read-only.
         * @return {@code this}
         */
        public Builder deletionGracePeriodSeconds(java.lang.Number deletionGracePeriodSeconds) {
            this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getDeletionTimestamp}
         * @param deletionTimestamp DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted.
         *                          This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.
         *                          <p>
         *                          Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder deletionTimestamp(java.time.Instant deletionTimestamp) {
            this.deletionTimestamp = deletionTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getFinalizers}
         * @param finalizers Must be empty before the object is deleted from the registry.
         *                   Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
         * @return {@code this}
         */
        public Builder finalizers(java.util.List<java.lang.String> finalizers) {
            this.finalizers = finalizers;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getGenerateName}
         * @param generateName GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided.
         *                     If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
         *                     <p>
         *                     If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).
         *                     <p>
         *                     Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
         * @return {@code this}
         */
        public Builder generateName(java.lang.String generateName) {
            this.generateName = generateName;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getGeneration}
         * @param generation A sequence number representing a specific generation of the desired state.
         *                   Populated by the system. Read-only.
         * @return {@code this}
         */
        public Builder generation(java.lang.Number generation) {
            this.generation = generation;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getLabels}
         * @param labels Map of string keys and values that can be used to organize and categorize (scope and select) objects.
         *               May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
         * @return {@code this}
         */
        public Builder labels(java.util.Map<java.lang.String, java.lang.String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getManagedFields}
         * @param managedFields ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow.
         *                      This is mostly for internal housekeeping, and users typically shouldn't need to set or understand this field. A workflow can be the user's name, a controller's name, or the name of a specific apply path like "ci-cd". The set of fields is always in the version that the workflow used when modifying the object.
         * @return {@code this}
         */
        public Builder managedFields(java.util.List<k8s.ManagedFieldsEntry> managedFields) {
            this.managedFields = managedFields;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getName}
         * @param name Name must be unique within a namespace.
         *             Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getNamespace}
         * @param namespace Namespace defines the space within each name must be unique.
         *                  An empty namespace is equivalent to the "default" namespace, but "default" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
         *                  <p>
         *                  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
         * @return {@code this}
         */
        public Builder namespace(java.lang.String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getOwnerReferences}
         * @param ownerReferences List of objects depended by this object.
         *                        If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
         * @return {@code this}
         */
        public Builder ownerReferences(java.util.List<k8s.OwnerReference> ownerReferences) {
            this.ownerReferences = ownerReferences;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getResourceVersion}
         * @param resourceVersion An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed.
         *                        May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
         *                        <p>
         *                        Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
         * @return {@code this}
         */
        public Builder resourceVersion(java.lang.String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getSelfLink}
         * @param selfLink SelfLink is a URL representing this object. Populated by the system. Read-only.
         *                 DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
         * @return {@code this}
         */
        public Builder selfLink(java.lang.String selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        /**
         * Sets the value of {@link ObjectMeta#getUid}
         * @param uid UID is the unique in time and space value for this object.
         *            It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
         *            <p>
         *            Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ObjectMeta}
         * @throws NullPointerException if any required attribute was not provided
         */
        public ObjectMeta build() {
            return new Jsii$Proxy(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
        }
    }

    /**
     * An implementation for {@link ObjectMeta}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ObjectMeta {
        private final java.util.Map<java.lang.String, java.lang.String> annotations;
        private final java.lang.String clusterName;
        private final java.time.Instant creationTimestamp;
        private final java.lang.Number deletionGracePeriodSeconds;
        private final java.time.Instant deletionTimestamp;
        private final java.util.List<java.lang.String> finalizers;
        private final java.lang.String generateName;
        private final java.lang.Number generation;
        private final java.util.Map<java.lang.String, java.lang.String> labels;
        private final java.util.List<k8s.ManagedFieldsEntry> managedFields;
        private final java.lang.String name;
        private final java.lang.String namespace;
        private final java.util.List<k8s.OwnerReference> ownerReferences;
        private final java.lang.String resourceVersion;
        private final java.lang.String selfLink;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.annotations = this.jsiiGet("annotations", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.clusterName = this.jsiiGet("clusterName", java.lang.String.class);
            this.creationTimestamp = this.jsiiGet("creationTimestamp", java.time.Instant.class);
            this.deletionGracePeriodSeconds = this.jsiiGet("deletionGracePeriodSeconds", java.lang.Number.class);
            this.deletionTimestamp = this.jsiiGet("deletionTimestamp", java.time.Instant.class);
            this.finalizers = this.jsiiGet("finalizers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.generateName = this.jsiiGet("generateName", java.lang.String.class);
            this.generation = this.jsiiGet("generation", java.lang.Number.class);
            this.labels = this.jsiiGet("labels", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.managedFields = this.jsiiGet("managedFields", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.ManagedFieldsEntry.class)));
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.namespace = this.jsiiGet("namespace", java.lang.String.class);
            this.ownerReferences = this.jsiiGet("ownerReferences", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.OwnerReference.class)));
            this.resourceVersion = this.jsiiGet("resourceVersion", java.lang.String.class);
            this.selfLink = this.jsiiGet("selfLink", java.lang.String.class);
            this.uid = this.jsiiGet("uid", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.Map<java.lang.String, java.lang.String> annotations, final java.lang.String clusterName, final java.time.Instant creationTimestamp, final java.lang.Number deletionGracePeriodSeconds, final java.time.Instant deletionTimestamp, final java.util.List<java.lang.String> finalizers, final java.lang.String generateName, final java.lang.Number generation, final java.util.Map<java.lang.String, java.lang.String> labels, final java.util.List<k8s.ManagedFieldsEntry> managedFields, final java.lang.String name, final java.lang.String namespace, final java.util.List<k8s.OwnerReference> ownerReferences, final java.lang.String resourceVersion, final java.lang.String selfLink, final java.lang.String uid) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.annotations = annotations;
            this.clusterName = clusterName;
            this.creationTimestamp = creationTimestamp;
            this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
            this.deletionTimestamp = deletionTimestamp;
            this.finalizers = finalizers;
            this.generateName = generateName;
            this.generation = generation;
            this.labels = labels;
            this.managedFields = managedFields;
            this.name = name;
            this.namespace = namespace;
            this.ownerReferences = ownerReferences;
            this.resourceVersion = resourceVersion;
            this.selfLink = selfLink;
            this.uid = uid;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
            return this.annotations;
        }

        @Override
        public java.lang.String getClusterName() {
            return this.clusterName;
        }

        @Override
        public java.time.Instant getCreationTimestamp() {
            return this.creationTimestamp;
        }

        @Override
        public java.lang.Number getDeletionGracePeriodSeconds() {
            return this.deletionGracePeriodSeconds;
        }

        @Override
        public java.time.Instant getDeletionTimestamp() {
            return this.deletionTimestamp;
        }

        @Override
        public java.util.List<java.lang.String> getFinalizers() {
            return this.finalizers;
        }

        @Override
        public java.lang.String getGenerateName() {
            return this.generateName;
        }

        @Override
        public java.lang.Number getGeneration() {
            return this.generation;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getLabels() {
            return this.labels;
        }

        @Override
        public java.util.List<k8s.ManagedFieldsEntry> getManagedFields() {
            return this.managedFields;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.lang.String getNamespace() {
            return this.namespace;
        }

        @Override
        public java.util.List<k8s.OwnerReference> getOwnerReferences() {
            return this.ownerReferences;
        }

        @Override
        public java.lang.String getResourceVersion() {
            return this.resourceVersion;
        }

        @Override
        public java.lang.String getSelfLink() {
            return this.selfLink;
        }

        @Override
        public java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAnnotations() != null) {
                data.set("annotations", om.valueToTree(this.getAnnotations()));
            }
            if (this.getClusterName() != null) {
                data.set("clusterName", om.valueToTree(this.getClusterName()));
            }
            if (this.getCreationTimestamp() != null) {
                data.set("creationTimestamp", om.valueToTree(this.getCreationTimestamp()));
            }
            if (this.getDeletionGracePeriodSeconds() != null) {
                data.set("deletionGracePeriodSeconds", om.valueToTree(this.getDeletionGracePeriodSeconds()));
            }
            if (this.getDeletionTimestamp() != null) {
                data.set("deletionTimestamp", om.valueToTree(this.getDeletionTimestamp()));
            }
            if (this.getFinalizers() != null) {
                data.set("finalizers", om.valueToTree(this.getFinalizers()));
            }
            if (this.getGenerateName() != null) {
                data.set("generateName", om.valueToTree(this.getGenerateName()));
            }
            if (this.getGeneration() != null) {
                data.set("generation", om.valueToTree(this.getGeneration()));
            }
            if (this.getLabels() != null) {
                data.set("labels", om.valueToTree(this.getLabels()));
            }
            if (this.getManagedFields() != null) {
                data.set("managedFields", om.valueToTree(this.getManagedFields()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamespace() != null) {
                data.set("namespace", om.valueToTree(this.getNamespace()));
            }
            if (this.getOwnerReferences() != null) {
                data.set("ownerReferences", om.valueToTree(this.getOwnerReferences()));
            }
            if (this.getResourceVersion() != null) {
                data.set("resourceVersion", om.valueToTree(this.getResourceVersion()));
            }
            if (this.getSelfLink() != null) {
                data.set("selfLink", om.valueToTree(this.getSelfLink()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ObjectMeta"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ObjectMeta.Jsii$Proxy that = (ObjectMeta.Jsii$Proxy) o;

            if (this.annotations != null ? !this.annotations.equals(that.annotations) : that.annotations != null) return false;
            if (this.clusterName != null ? !this.clusterName.equals(that.clusterName) : that.clusterName != null) return false;
            if (this.creationTimestamp != null ? !this.creationTimestamp.equals(that.creationTimestamp) : that.creationTimestamp != null) return false;
            if (this.deletionGracePeriodSeconds != null ? !this.deletionGracePeriodSeconds.equals(that.deletionGracePeriodSeconds) : that.deletionGracePeriodSeconds != null) return false;
            if (this.deletionTimestamp != null ? !this.deletionTimestamp.equals(that.deletionTimestamp) : that.deletionTimestamp != null) return false;
            if (this.finalizers != null ? !this.finalizers.equals(that.finalizers) : that.finalizers != null) return false;
            if (this.generateName != null ? !this.generateName.equals(that.generateName) : that.generateName != null) return false;
            if (this.generation != null ? !this.generation.equals(that.generation) : that.generation != null) return false;
            if (this.labels != null ? !this.labels.equals(that.labels) : that.labels != null) return false;
            if (this.managedFields != null ? !this.managedFields.equals(that.managedFields) : that.managedFields != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namespace != null ? !this.namespace.equals(that.namespace) : that.namespace != null) return false;
            if (this.ownerReferences != null ? !this.ownerReferences.equals(that.ownerReferences) : that.ownerReferences != null) return false;
            if (this.resourceVersion != null ? !this.resourceVersion.equals(that.resourceVersion) : that.resourceVersion != null) return false;
            if (this.selfLink != null ? !this.selfLink.equals(that.selfLink) : that.selfLink != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public int hashCode() {
            int result = this.annotations != null ? this.annotations.hashCode() : 0;
            result = 31 * result + (this.clusterName != null ? this.clusterName.hashCode() : 0);
            result = 31 * result + (this.creationTimestamp != null ? this.creationTimestamp.hashCode() : 0);
            result = 31 * result + (this.deletionGracePeriodSeconds != null ? this.deletionGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.deletionTimestamp != null ? this.deletionTimestamp.hashCode() : 0);
            result = 31 * result + (this.finalizers != null ? this.finalizers.hashCode() : 0);
            result = 31 * result + (this.generateName != null ? this.generateName.hashCode() : 0);
            result = 31 * result + (this.generation != null ? this.generation.hashCode() : 0);
            result = 31 * result + (this.labels != null ? this.labels.hashCode() : 0);
            result = 31 * result + (this.managedFields != null ? this.managedFields.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namespace != null ? this.namespace.hashCode() : 0);
            result = 31 * result + (this.ownerReferences != null ? this.ownerReferences.hashCode() : 0);
            result = 31 * result + (this.resourceVersion != null ? this.resourceVersion.hashCode() : 0);
            result = 31 * result + (this.selfLink != null ? this.selfLink.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
