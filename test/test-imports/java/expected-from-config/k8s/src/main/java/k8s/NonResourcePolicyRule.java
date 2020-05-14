package k8s;

/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL.
 * <p>
 * A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.316Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.NonResourcePolicyRule")
@software.amazon.jsii.Jsii.Proxy(NonResourcePolicyRule.Jsii$Proxy.class)
public interface NonResourcePolicyRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty.
     * <p>
     * For example:
     * <p>
     * <ul>
     * <li>"/healthz" is legal</li>
     * <li>"/hea*" is illegal</li>
     * <li>"/hea" is legal but matches nothing</li>
     * <li>"/hea/*" also matches nothing</li>
     * <li>"/healthz/<em>" matches all per-component health checks.
     * "</em>" matches all non-resource urls. if it is present, it must be the only entry. Required.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getNonResourceUrLs();

    /**
     * `verbs` is a list of matching verbs and may not be empty.
     * <p>
     * "*" matches all verbs. If it is present, it must be the only entry. Required.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getVerbs();

    /**
     * @return a {@link Builder} of {@link NonResourcePolicyRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NonResourcePolicyRule}
     */
    public static final class Builder {
        private java.util.List<java.lang.String> nonResourceUrLs;
        private java.util.List<java.lang.String> verbs;

        /**
         * Sets the value of {@link NonResourcePolicyRule#getNonResourceUrLs}
         * @param nonResourceUrLs `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. This parameter is required.
         *                        For example:
         *                        <p>
         *                        <ul>
         *                        <li>"/healthz" is legal</li>
         *                        <li>"/hea*" is illegal</li>
         *                        <li>"/hea" is legal but matches nothing</li>
         *                        <li>"/hea/*" also matches nothing</li>
         *                        <li>"/healthz/<em>" matches all per-component health checks.
         *                        "</em>" matches all non-resource urls. if it is present, it must be the only entry. Required.</li>
         *                        </ul>
         * @return {@code this}
         */
        public Builder nonResourceUrLs(java.util.List<java.lang.String> nonResourceUrLs) {
            this.nonResourceUrLs = nonResourceUrLs;
            return this;
        }

        /**
         * Sets the value of {@link NonResourcePolicyRule#getVerbs}
         * @param verbs `verbs` is a list of matching verbs and may not be empty. This parameter is required.
         *              "*" matches all verbs. If it is present, it must be the only entry. Required.
         * @return {@code this}
         */
        public Builder verbs(java.util.List<java.lang.String> verbs) {
            this.verbs = verbs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NonResourcePolicyRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        public NonResourcePolicyRule build() {
            return new Jsii$Proxy(nonResourceUrLs, verbs);
        }
    }

    /**
     * An implementation for {@link NonResourcePolicyRule}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NonResourcePolicyRule {
        private final java.util.List<java.lang.String> nonResourceUrLs;
        private final java.util.List<java.lang.String> verbs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.nonResourceUrLs = this.jsiiGet("nonResourceURLs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.verbs = this.jsiiGet("verbs", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> nonResourceUrLs, final java.util.List<java.lang.String> verbs) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.nonResourceUrLs = java.util.Objects.requireNonNull(nonResourceUrLs, "nonResourceUrLs is required");
            this.verbs = java.util.Objects.requireNonNull(verbs, "verbs is required");
        }

        @Override
        public java.util.List<java.lang.String> getNonResourceUrLs() {
            return this.nonResourceUrLs;
        }

        @Override
        public java.util.List<java.lang.String> getVerbs() {
            return this.verbs;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("nonResourceURLs", om.valueToTree(this.getNonResourceUrLs()));
            data.set("verbs", om.valueToTree(this.getVerbs()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NonResourcePolicyRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NonResourcePolicyRule.Jsii$Proxy that = (NonResourcePolicyRule.Jsii$Proxy) o;

            if (!nonResourceUrLs.equals(that.nonResourceUrLs)) return false;
            return this.verbs.equals(that.verbs);
        }

        @Override
        public int hashCode() {
            int result = this.nonResourceUrLs.hashCode();
            result = 31 * result + (this.verbs.hashCode());
            return result;
        }
    }
}
