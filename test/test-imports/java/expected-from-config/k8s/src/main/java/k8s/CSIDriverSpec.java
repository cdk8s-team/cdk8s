package k8s;

/**
 * CSIDriverSpec is the specification of a CSIDriver.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.100Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.CSIDriverSpec")
@software.amazon.jsii.Jsii.Proxy(CSIDriverSpec.Jsii$Proxy.class)
public interface CSIDriverSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
     * <p>
     * The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAttachRequired() {
        return null;
    }

    /**
     * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume                             defined by a CSIVolumeSource, otherwise "false".
     * <p>
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * <p>
     * Default: false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getPodInfoOnMount() {
        return null;
    }

    /**
     * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * <p>
     * The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getVolumeLifecycleModes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CSIDriverSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CSIDriverSpec}
     */
    public static final class Builder {
        private java.lang.Boolean attachRequired;
        private java.lang.Boolean podInfoOnMount;
        private java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Sets the value of {@link CSIDriverSpec#getAttachRequired}
         * @param attachRequired attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting.
         *                       The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
         * @return {@code this}
         */
        public Builder attachRequired(java.lang.Boolean attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        /**
         * Sets the value of {@link CSIDriverSpec#getPodInfoOnMount}
         * @param podInfoOnMount If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume                             defined by a CSIVolumeSource, otherwise "false".
         *                       "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
         * @return {@code this}
         */
        public Builder podInfoOnMount(java.lang.Boolean podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        /**
         * Sets the value of {@link CSIDriverSpec#getVolumeLifecycleModes}
         * @param volumeLifecycleModes VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
         *                             The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
         * @return {@code this}
         */
        public Builder volumeLifecycleModes(java.util.List<java.lang.String> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CSIDriverSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        public CSIDriverSpec build() {
            return new Jsii$Proxy(attachRequired, podInfoOnMount, volumeLifecycleModes);
        }
    }

    /**
     * An implementation for {@link CSIDriverSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CSIDriverSpec {
        private final java.lang.Boolean attachRequired;
        private final java.lang.Boolean podInfoOnMount;
        private final java.util.List<java.lang.String> volumeLifecycleModes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attachRequired = this.jsiiGet("attachRequired", java.lang.Boolean.class);
            this.podInfoOnMount = this.jsiiGet("podInfoOnMount", java.lang.Boolean.class);
            this.volumeLifecycleModes = this.jsiiGet("volumeLifecycleModes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Boolean attachRequired, final java.lang.Boolean podInfoOnMount, final java.util.List<java.lang.String> volumeLifecycleModes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attachRequired = attachRequired;
            this.podInfoOnMount = podInfoOnMount;
            this.volumeLifecycleModes = volumeLifecycleModes;
        }

        @Override
        public java.lang.Boolean getAttachRequired() {
            return this.attachRequired;
        }

        @Override
        public java.lang.Boolean getPodInfoOnMount() {
            return this.podInfoOnMount;
        }

        @Override
        public java.util.List<java.lang.String> getVolumeLifecycleModes() {
            return this.volumeLifecycleModes;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttachRequired() != null) {
                data.set("attachRequired", om.valueToTree(this.getAttachRequired()));
            }
            if (this.getPodInfoOnMount() != null) {
                data.set("podInfoOnMount", om.valueToTree(this.getPodInfoOnMount()));
            }
            if (this.getVolumeLifecycleModes() != null) {
                data.set("volumeLifecycleModes", om.valueToTree(this.getVolumeLifecycleModes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CSIDriverSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CSIDriverSpec.Jsii$Proxy that = (CSIDriverSpec.Jsii$Proxy) o;

            if (this.attachRequired != null ? !this.attachRequired.equals(that.attachRequired) : that.attachRequired != null) return false;
            if (this.podInfoOnMount != null ? !this.podInfoOnMount.equals(that.podInfoOnMount) : that.podInfoOnMount != null) return false;
            return this.volumeLifecycleModes != null ? this.volumeLifecycleModes.equals(that.volumeLifecycleModes) : that.volumeLifecycleModes == null;
        }

        @Override
        public int hashCode() {
            int result = this.attachRequired != null ? this.attachRequired.hashCode() : 0;
            result = 31 * result + (this.podInfoOnMount != null ? this.podInfoOnMount.hashCode() : 0);
            result = 31 * result + (this.volumeLifecycleModes != null ? this.volumeLifecycleModes.hashCode() : 0);
            return result;
        }
    }
}
