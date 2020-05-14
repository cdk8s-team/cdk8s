package k8s;

/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits.
 * <p>
 * It addresses two issues:
 * How are requests for this priority level limited?
 * What should be done with requests that exceed the limit?
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.283Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.LimitedPriorityLevelConfiguration")
@software.amazon.jsii.Jsii.Proxy(LimitedPriorityLevelConfiguration.Jsii$Proxy.class)
public interface LimitedPriorityLevelConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.
     * <p>
     * ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
     * <p>
     * <blockquote><pre>
     *     ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
     * </pre></blockquote>
     * <p>
     * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAssuredConcurrencyShares() {
        return null;
    }

    /**
     * `limitResponse` indicates what to do with requests that can not be executed right now.
     */
    default @org.jetbrains.annotations.Nullable k8s.LimitResponse getLimitResponse() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LimitedPriorityLevelConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitedPriorityLevelConfiguration}
     */
    public static final class Builder {
        private java.lang.Number assuredConcurrencyShares;
        private k8s.LimitResponse limitResponse;

        /**
         * Sets the value of {@link LimitedPriorityLevelConfiguration#getAssuredConcurrencyShares}
         * @param assuredConcurrencyShares `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.
         *                                 ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
         *                                 <p>
         *                                 <blockquote><pre>
         *                                     ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
         *                                 </pre></blockquote>
         *                                 <p>
         *                                 bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
         * @return {@code this}
         */
        public Builder assuredConcurrencyShares(java.lang.Number assuredConcurrencyShares) {
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            return this;
        }

        /**
         * Sets the value of {@link LimitedPriorityLevelConfiguration#getLimitResponse}
         * @param limitResponse `limitResponse` indicates what to do with requests that can not be executed right now.
         * @return {@code this}
         */
        public Builder limitResponse(k8s.LimitResponse limitResponse) {
            this.limitResponse = limitResponse;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitedPriorityLevelConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        public LimitedPriorityLevelConfiguration build() {
            return new Jsii$Proxy(assuredConcurrencyShares, limitResponse);
        }
    }

    /**
     * An implementation for {@link LimitedPriorityLevelConfiguration}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitedPriorityLevelConfiguration {
        private final java.lang.Number assuredConcurrencyShares;
        private final k8s.LimitResponse limitResponse;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.assuredConcurrencyShares = this.jsiiGet("assuredConcurrencyShares", java.lang.Number.class);
            this.limitResponse = this.jsiiGet("limitResponse", k8s.LimitResponse.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number assuredConcurrencyShares, final k8s.LimitResponse limitResponse) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.assuredConcurrencyShares = assuredConcurrencyShares;
            this.limitResponse = limitResponse;
        }

        @Override
        public java.lang.Number getAssuredConcurrencyShares() {
            return this.assuredConcurrencyShares;
        }

        @Override
        public k8s.LimitResponse getLimitResponse() {
            return this.limitResponse;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAssuredConcurrencyShares() != null) {
                data.set("assuredConcurrencyShares", om.valueToTree(this.getAssuredConcurrencyShares()));
            }
            if (this.getLimitResponse() != null) {
                data.set("limitResponse", om.valueToTree(this.getLimitResponse()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LimitedPriorityLevelConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitedPriorityLevelConfiguration.Jsii$Proxy that = (LimitedPriorityLevelConfiguration.Jsii$Proxy) o;

            if (this.assuredConcurrencyShares != null ? !this.assuredConcurrencyShares.equals(that.assuredConcurrencyShares) : that.assuredConcurrencyShares != null) return false;
            return this.limitResponse != null ? this.limitResponse.equals(that.limitResponse) : that.limitResponse == null;
        }

        @Override
        public int hashCode() {
            int result = this.assuredConcurrencyShares != null ? this.assuredConcurrencyShares.hashCode() : 0;
            result = 31 * result + (this.limitResponse != null ? this.limitResponse.hashCode() : 0);
            return result;
        }
    }
}
