package k8s;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response.
 * <p>
 * The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.440Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.StatusDetails")
@software.amazon.jsii.Jsii.Proxy(StatusDetails.Jsii$Proxy.class)
public interface StatusDetails extends software.amazon.jsii.JsiiSerializable {

    /**
     * The Causes array includes more details associated with the StatusReason failure.
     * <p>
     * Not all StatusReasons may provide detailed causes.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.StatusCause> getCauses() {
        return null;
    }

    /**
     * The group attribute of the resource associated with the status StatusReason.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getGroup() {
        return null;
    }

    /**
     * The kind attribute of the resource associated with the status StatusReason.
     * <p>
     * On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getKind() {
        return null;
    }

    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * If specified, the time in seconds before the operation should be retried.
     * <p>
     * Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getRetryAfterSeconds() {
        return null;
    }

    /**
     * UID of the resource.
     * <p>
     * (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUid() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatusDetails}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatusDetails}
     */
    public static final class Builder {
        private java.util.List<k8s.StatusCause> causes;
        private java.lang.String group;
        private java.lang.String kind;
        private java.lang.String name;
        private java.lang.Number retryAfterSeconds;
        private java.lang.String uid;

        /**
         * Sets the value of {@link StatusDetails#getCauses}
         * @param causes The Causes array includes more details associated with the StatusReason failure.
         *               Not all StatusReasons may provide detailed causes.
         * @return {@code this}
         */
        public Builder causes(java.util.List<k8s.StatusCause> causes) {
            this.causes = causes;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getGroup}
         * @param group The group attribute of the resource associated with the status StatusReason.
         * @return {@code this}
         */
        public Builder group(java.lang.String group) {
            this.group = group;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getKind}
         * @param kind The kind attribute of the resource associated with the status StatusReason.
         *             On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * @return {@code this}
         */
        public Builder kind(java.lang.String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getName}
         * @param name The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getRetryAfterSeconds}
         * @param retryAfterSeconds If specified, the time in seconds before the operation should be retried.
         *                          Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
         * @return {@code this}
         */
        public Builder retryAfterSeconds(java.lang.Number retryAfterSeconds) {
            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }

        /**
         * Sets the value of {@link StatusDetails#getUid}
         * @param uid UID of the resource.
         *            (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
         * @return {@code this}
         */
        public Builder uid(java.lang.String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatusDetails}
         * @throws NullPointerException if any required attribute was not provided
         */
        public StatusDetails build() {
            return new Jsii$Proxy(causes, group, kind, name, retryAfterSeconds, uid);
        }
    }

    /**
     * An implementation for {@link StatusDetails}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatusDetails {
        private final java.util.List<k8s.StatusCause> causes;
        private final java.lang.String group;
        private final java.lang.String kind;
        private final java.lang.String name;
        private final java.lang.Number retryAfterSeconds;
        private final java.lang.String uid;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.causes = this.jsiiGet("causes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.StatusCause.class)));
            this.group = this.jsiiGet("group", java.lang.String.class);
            this.kind = this.jsiiGet("kind", java.lang.String.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.retryAfterSeconds = this.jsiiGet("retryAfterSeconds", java.lang.Number.class);
            this.uid = this.jsiiGet("uid", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<k8s.StatusCause> causes, final java.lang.String group, final java.lang.String kind, final java.lang.String name, final java.lang.Number retryAfterSeconds, final java.lang.String uid) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.causes = causes;
            this.group = group;
            this.kind = kind;
            this.name = name;
            this.retryAfterSeconds = retryAfterSeconds;
            this.uid = uid;
        }

        @Override
        public java.util.List<k8s.StatusCause> getCauses() {
            return this.causes;
        }

        @Override
        public java.lang.String getGroup() {
            return this.group;
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
        public java.lang.Number getRetryAfterSeconds() {
            return this.retryAfterSeconds;
        }

        @Override
        public java.lang.String getUid() {
            return this.uid;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCauses() != null) {
                data.set("causes", om.valueToTree(this.getCauses()));
            }
            if (this.getGroup() != null) {
                data.set("group", om.valueToTree(this.getGroup()));
            }
            if (this.getKind() != null) {
                data.set("kind", om.valueToTree(this.getKind()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getRetryAfterSeconds() != null) {
                data.set("retryAfterSeconds", om.valueToTree(this.getRetryAfterSeconds()));
            }
            if (this.getUid() != null) {
                data.set("uid", om.valueToTree(this.getUid()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.StatusDetails"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatusDetails.Jsii$Proxy that = (StatusDetails.Jsii$Proxy) o;

            if (this.causes != null ? !this.causes.equals(that.causes) : that.causes != null) return false;
            if (this.group != null ? !this.group.equals(that.group) : that.group != null) return false;
            if (this.kind != null ? !this.kind.equals(that.kind) : that.kind != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.retryAfterSeconds != null ? !this.retryAfterSeconds.equals(that.retryAfterSeconds) : that.retryAfterSeconds != null) return false;
            return this.uid != null ? this.uid.equals(that.uid) : that.uid == null;
        }

        @Override
        public int hashCode() {
            int result = this.causes != null ? this.causes.hashCode() : 0;
            result = 31 * result + (this.group != null ? this.group.hashCode() : 0);
            result = 31 * result + (this.kind != null ? this.kind.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.retryAfterSeconds != null ? this.retryAfterSeconds.hashCode() : 0);
            result = 31 * result + (this.uid != null ? this.uid.hashCode() : 0);
            return result;
        }
    }
}
