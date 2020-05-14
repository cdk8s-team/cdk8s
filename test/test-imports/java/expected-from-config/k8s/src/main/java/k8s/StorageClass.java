package k8s;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * <p>
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.441Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.StorageClass")
public class StorageClass extends org.cdk8s.ApiObject {

    protected StorageClass(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StorageClass(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.storage.v1.StorageClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public StorageClass(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull k8s.StorageClassOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link k8s.StorageClass}.
     */
    public static final class Builder {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private final k8s.StorageClassOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new k8s.StorageClassOptions.Builder();
        }

        /**
         * Provisioner indicates the type of the provisioner.
         * <p>
         * @return {@code this}
         * @param provisioner Provisioner indicates the type of the provisioner. This parameter is required.
         */
        public Builder provisioner(final java.lang.String provisioner) {
            this.options.provisioner(provisioner);
            return this;
        }

        /**
         * Restrict the node topologies where volumes can be dynamically provisioned.
         * <p>
         * Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
         * <p>
         * @return {@code this}
         * @param allowedTopologies Restrict the node topologies where volumes can be dynamically provisioned. This parameter is required.
         */
        public Builder allowedTopologies(final java.util.List<k8s.TopologySelectorTerm> allowedTopologies) {
            this.options.allowedTopologies(allowedTopologies);
            return this;
        }

        /**
         * AllowVolumeExpansion shows whether the storage class allow volume expand.
         * <p>
         * @return {@code this}
         * @param allowVolumeExpansion AllowVolumeExpansion shows whether the storage class allow volume expand. This parameter is required.
         */
        public Builder allowVolumeExpansion(final java.lang.Boolean allowVolumeExpansion) {
            this.options.allowVolumeExpansion(allowVolumeExpansion);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final k8s.ObjectMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
         * <p>
         * @return {@code this}
         * @param mountOptions Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid. This parameter is required.
         */
        public Builder mountOptions(final java.util.List<java.lang.String> mountOptions) {
            this.options.mountOptions(mountOptions);
            return this;
        }

        /**
         * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
         * <p>
         * @return {@code this}
         * @param parameters Parameters holds the parameters for the provisioner that should create volumes of this storage class. This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.options.parameters(parameters);
            return this;
        }

        /**
         * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
         * <p>
         * Defaults to Delete.
         * <p>
         * Default: Delete.
         * <p>
         * @return {@code this}
         * @param reclaimPolicy Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. This parameter is required.
         */
        public Builder reclaimPolicy(final java.lang.String reclaimPolicy) {
            this.options.reclaimPolicy(reclaimPolicy);
            return this;
        }

        /**
         * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
         * <p>
         * When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
         * <p>
         * @return {@code this}
         * @param volumeBindingMode VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound. This parameter is required.
         */
        public Builder volumeBindingMode(final java.lang.String volumeBindingMode) {
            this.options.volumeBindingMode(volumeBindingMode);
            return this;
        }

        /**
         * @returns a newly built instance of {@link k8s.StorageClass}.
         */
        public k8s.StorageClass build() {
            return new k8s.StorageClass(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
