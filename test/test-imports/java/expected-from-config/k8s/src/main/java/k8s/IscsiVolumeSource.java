package k8s;

/**
 * Represents an ISCSI disk.
 * <p>
 * ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.249Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.IscsiVolumeSource")
@software.amazon.jsii.Jsii.Proxy(IscsiVolumeSource.Jsii$Proxy.class)
public interface IscsiVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Target iSCSI Qualified Name.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIqn();

    /**
     * iSCSI Target Lun number.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getLun();

    /**
     * iSCSI Target Portal.
     * <p>
     * The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTargetPortal();

    /**
     * whether support iSCSI Discovery CHAP authentication.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getChapAuthDiscovery() {
        return null;
    }

    /**
     * whether support iSCSI Session CHAP authentication.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getChapAuthSession() {
        return null;
    }

    /**
     * Filesystem type of the volume that you want to mount.
     * <p>
     * Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Custom iSCSI Initiator Name.
     * <p>
     * If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInitiatorName() {
        return null;
    }

    /**
     * iSCSI Interface Name that uses an iSCSI transport.
     * <p>
     * Defaults to 'default' (tcp).
     * <p>
     * Default: default' (tcp).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIscsiInterface() {
        return null;
    }

    /**
     * iSCSI Target Portal List.
     * <p>
     * The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPortals() {
        return null;
    }

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Defaults to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * CHAP Secret for iSCSI target and initiator authentication.
     */
    default @org.jetbrains.annotations.Nullable k8s.LocalObjectReference getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IscsiVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IscsiVolumeSource}
     */
    public static final class Builder {
        private java.lang.String iqn;
        private java.lang.Number lun;
        private java.lang.String targetPortal;
        private java.lang.Boolean chapAuthDiscovery;
        private java.lang.Boolean chapAuthSession;
        private java.lang.String fsType;
        private java.lang.String initiatorName;
        private java.lang.String iscsiInterface;
        private java.util.List<java.lang.String> portals;
        private java.lang.Boolean readOnly;
        private k8s.LocalObjectReference secretRef;

        /**
         * Sets the value of {@link IscsiVolumeSource#getIqn}
         * @param iqn Target iSCSI Qualified Name. This parameter is required.
         * @return {@code this}
         */
        public Builder iqn(java.lang.String iqn) {
            this.iqn = iqn;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getLun}
         * @param lun iSCSI Target Lun number. This parameter is required.
         * @return {@code this}
         */
        public Builder lun(java.lang.Number lun) {
            this.lun = lun;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getTargetPortal}
         * @param targetPortal iSCSI Target Portal. This parameter is required.
         *                     The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * @return {@code this}
         */
        public Builder targetPortal(java.lang.String targetPortal) {
            this.targetPortal = targetPortal;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getChapAuthDiscovery}
         * @param chapAuthDiscovery whether support iSCSI Discovery CHAP authentication.
         * @return {@code this}
         */
        public Builder chapAuthDiscovery(java.lang.Boolean chapAuthDiscovery) {
            this.chapAuthDiscovery = chapAuthDiscovery;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getChapAuthSession}
         * @param chapAuthSession whether support iSCSI Session CHAP authentication.
         * @return {@code this}
         */
        public Builder chapAuthSession(java.lang.Boolean chapAuthSession) {
            this.chapAuthSession = chapAuthSession;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getFsType}
         * @param fsType Filesystem type of the volume that you want to mount.
         *               Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getInitiatorName}
         * @param initiatorName Custom iSCSI Initiator Name.
         *                      If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.
         * @return {@code this}
         */
        public Builder initiatorName(java.lang.String initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getIscsiInterface}
         * @param iscsiInterface iSCSI Interface Name that uses an iSCSI transport.
         *                       Defaults to 'default' (tcp).
         * @return {@code this}
         */
        public Builder iscsiInterface(java.lang.String iscsiInterface) {
            this.iscsiInterface = iscsiInterface;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getPortals}
         * @param portals iSCSI Target Portal List.
         *                The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
         * @return {@code this}
         */
        public Builder portals(java.util.List<java.lang.String> portals) {
            this.portals = portals;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getReadOnly}
         * @param readOnly ReadOnly here will force the ReadOnly setting in VolumeMounts.
         *                 Defaults to false.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link IscsiVolumeSource#getSecretRef}
         * @param secretRef CHAP Secret for iSCSI target and initiator authentication.
         * @return {@code this}
         */
        public Builder secretRef(k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IscsiVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        public IscsiVolumeSource build() {
            return new Jsii$Proxy(iqn, lun, targetPortal, chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iscsiInterface, portals, readOnly, secretRef);
        }
    }

    /**
     * An implementation for {@link IscsiVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IscsiVolumeSource {
        private final java.lang.String iqn;
        private final java.lang.Number lun;
        private final java.lang.String targetPortal;
        private final java.lang.Boolean chapAuthDiscovery;
        private final java.lang.Boolean chapAuthSession;
        private final java.lang.String fsType;
        private final java.lang.String initiatorName;
        private final java.lang.String iscsiInterface;
        private final java.util.List<java.lang.String> portals;
        private final java.lang.Boolean readOnly;
        private final k8s.LocalObjectReference secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.iqn = this.jsiiGet("iqn", java.lang.String.class);
            this.lun = this.jsiiGet("lun", java.lang.Number.class);
            this.targetPortal = this.jsiiGet("targetPortal", java.lang.String.class);
            this.chapAuthDiscovery = this.jsiiGet("chapAuthDiscovery", java.lang.Boolean.class);
            this.chapAuthSession = this.jsiiGet("chapAuthSession", java.lang.Boolean.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.initiatorName = this.jsiiGet("initiatorName", java.lang.String.class);
            this.iscsiInterface = this.jsiiGet("iscsiInterface", java.lang.String.class);
            this.portals = this.jsiiGet("portals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretRef = this.jsiiGet("secretRef", k8s.LocalObjectReference.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String iqn, final java.lang.Number lun, final java.lang.String targetPortal, final java.lang.Boolean chapAuthDiscovery, final java.lang.Boolean chapAuthSession, final java.lang.String fsType, final java.lang.String initiatorName, final java.lang.String iscsiInterface, final java.util.List<java.lang.String> portals, final java.lang.Boolean readOnly, final k8s.LocalObjectReference secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.iqn = java.util.Objects.requireNonNull(iqn, "iqn is required");
            this.lun = java.util.Objects.requireNonNull(lun, "lun is required");
            this.targetPortal = java.util.Objects.requireNonNull(targetPortal, "targetPortal is required");
            this.chapAuthDiscovery = chapAuthDiscovery;
            this.chapAuthSession = chapAuthSession;
            this.fsType = fsType;
            this.initiatorName = initiatorName;
            this.iscsiInterface = iscsiInterface;
            this.portals = portals;
            this.readOnly = readOnly;
            this.secretRef = secretRef;
        }

        @Override
        public java.lang.String getIqn() {
            return this.iqn;
        }

        @Override
        public java.lang.Number getLun() {
            return this.lun;
        }

        @Override
        public java.lang.String getTargetPortal() {
            return this.targetPortal;
        }

        @Override
        public java.lang.Boolean getChapAuthDiscovery() {
            return this.chapAuthDiscovery;
        }

        @Override
        public java.lang.Boolean getChapAuthSession() {
            return this.chapAuthSession;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.String getInitiatorName() {
            return this.initiatorName;
        }

        @Override
        public java.lang.String getIscsiInterface() {
            return this.iscsiInterface;
        }

        @Override
        public java.util.List<java.lang.String> getPortals() {
            return this.portals;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("iqn", om.valueToTree(this.getIqn()));
            data.set("lun", om.valueToTree(this.getLun()));
            data.set("targetPortal", om.valueToTree(this.getTargetPortal()));
            if (this.getChapAuthDiscovery() != null) {
                data.set("chapAuthDiscovery", om.valueToTree(this.getChapAuthDiscovery()));
            }
            if (this.getChapAuthSession() != null) {
                data.set("chapAuthSession", om.valueToTree(this.getChapAuthSession()));
            }
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getInitiatorName() != null) {
                data.set("initiatorName", om.valueToTree(this.getInitiatorName()));
            }
            if (this.getIscsiInterface() != null) {
                data.set("iscsiInterface", om.valueToTree(this.getIscsiInterface()));
            }
            if (this.getPortals() != null) {
                data.set("portals", om.valueToTree(this.getPortals()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IscsiVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IscsiVolumeSource.Jsii$Proxy that = (IscsiVolumeSource.Jsii$Proxy) o;

            if (!iqn.equals(that.iqn)) return false;
            if (!lun.equals(that.lun)) return false;
            if (!targetPortal.equals(that.targetPortal)) return false;
            if (this.chapAuthDiscovery != null ? !this.chapAuthDiscovery.equals(that.chapAuthDiscovery) : that.chapAuthDiscovery != null) return false;
            if (this.chapAuthSession != null ? !this.chapAuthSession.equals(that.chapAuthSession) : that.chapAuthSession != null) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.initiatorName != null ? !this.initiatorName.equals(that.initiatorName) : that.initiatorName != null) return false;
            if (this.iscsiInterface != null ? !this.iscsiInterface.equals(that.iscsiInterface) : that.iscsiInterface != null) return false;
            if (this.portals != null ? !this.portals.equals(that.portals) : that.portals != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public int hashCode() {
            int result = this.iqn.hashCode();
            result = 31 * result + (this.lun.hashCode());
            result = 31 * result + (this.targetPortal.hashCode());
            result = 31 * result + (this.chapAuthDiscovery != null ? this.chapAuthDiscovery.hashCode() : 0);
            result = 31 * result + (this.chapAuthSession != null ? this.chapAuthSession.hashCode() : 0);
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.initiatorName != null ? this.initiatorName.hashCode() : 0);
            result = 31 * result + (this.iscsiInterface != null ? this.iscsiInterface.hashCode() : 0);
            result = 31 * result + (this.portals != null ? this.portals.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
