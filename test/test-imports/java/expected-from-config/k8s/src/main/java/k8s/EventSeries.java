package k8s;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.217Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.EventSeries")
@software.amazon.jsii.Jsii.Proxy(EventSeries.Jsii$Proxy.class)
public interface EventSeries extends software.amazon.jsii.JsiiSerializable {

    /**
     * Number of occurrences in this series up to the last heartbeat time.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * Time of the last occurrence observed.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getLastObservedTime() {
        return null;
    }

    /**
     * State of this Series: Ongoing or Finished Deprecated.
     * <p>
     * Planned removal for 1.18
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getState() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EventSeries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventSeries}
     */
    public static final class Builder {
        private java.lang.Number count;
        private java.time.Instant lastObservedTime;
        private java.lang.String state;

        /**
         * Sets the value of {@link EventSeries#getCount}
         * @param count Number of occurrences in this series up to the last heartbeat time.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventSeries#getLastObservedTime}
         * @param lastObservedTime Time of the last occurrence observed.
         * @return {@code this}
         */
        public Builder lastObservedTime(java.time.Instant lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        /**
         * Sets the value of {@link EventSeries#getState}
         * @param state State of this Series: Ongoing or Finished Deprecated.
         *              Planned removal for 1.18
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventSeries}
         * @throws NullPointerException if any required attribute was not provided
         */
        public EventSeries build() {
            return new Jsii$Proxy(count, lastObservedTime, state);
        }
    }

    /**
     * An implementation for {@link EventSeries}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventSeries {
        private final java.lang.Number count;
        private final java.time.Instant lastObservedTime;
        private final java.lang.String state;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = this.jsiiGet("count", java.lang.Number.class);
            this.lastObservedTime = this.jsiiGet("lastObservedTime", java.time.Instant.class);
            this.state = this.jsiiGet("state", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.Number count, final java.time.Instant lastObservedTime, final java.lang.String state) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = count;
            this.lastObservedTime = lastObservedTime;
            this.state = state;
        }

        @Override
        public java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public java.time.Instant getLastObservedTime() {
            return this.lastObservedTime;
        }

        @Override
        public java.lang.String getState() {
            return this.state;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getLastObservedTime() != null) {
                data.set("lastObservedTime", om.valueToTree(this.getLastObservedTime()));
            }
            if (this.getState() != null) {
                data.set("state", om.valueToTree(this.getState()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventSeries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventSeries.Jsii$Proxy that = (EventSeries.Jsii$Proxy) o;

            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.lastObservedTime != null ? !this.lastObservedTime.equals(that.lastObservedTime) : that.lastObservedTime != null) return false;
            return this.state != null ? this.state.equals(that.state) : that.state == null;
        }

        @Override
        public int hashCode() {
            int result = this.count != null ? this.count.hashCode() : 0;
            result = 31 * result + (this.lastObservedTime != null ? this.lastObservedTime.hashCode() : 0);
            result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
            return result;
        }
    }
}
