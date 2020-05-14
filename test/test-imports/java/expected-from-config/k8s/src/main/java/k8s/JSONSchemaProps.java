package k8s;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.250Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.JSONSchemaProps")
@software.amazon.jsii.Jsii.Proxy(JSONSchemaProps.Jsii$Proxy.class)
public interface JSONSchemaProps extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAdditionalProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.JSONSchemaProps> getAllOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.JSONSchemaProps> getAnyOf() {
        return null;
    }

    /**
     * default is a default value for undefined object fields.
     * <p>
     * Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultValue() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.JSONSchemaProps> getDefinitions() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getDependencies() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDescription() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEnumValue() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExample() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExclusiveMaximum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getExclusiveMinimum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable k8s.ExternalDocumentation getExternalDocs() {
        return null;
    }

    /**
     * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:.
     * <p>
     * <ul>
     * <li>bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.</li>
     * </ul>
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxLength() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinimum() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinItems() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinLength() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMultipleOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable k8s.JSONSchemaProps getNot() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getNullable() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<k8s.JSONSchemaProps> getOneOf() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPattern() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.JSONSchemaProps> getPatternProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, k8s.JSONSchemaProps> getProperties() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRef() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRequired() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchema() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTitle() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getUniqueItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link JSONSchemaProps}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link JSONSchemaProps}
     */
    public static final class Builder {
        private java.lang.String additionalItems;
        private java.lang.String additionalProperties;
        private java.util.List<k8s.JSONSchemaProps> allOf;
        private java.util.List<k8s.JSONSchemaProps> anyOf;
        private java.lang.String defaultValue;
        private java.util.Map<java.lang.String, k8s.JSONSchemaProps> definitions;
        private java.util.Map<java.lang.String, java.lang.String> dependencies;
        private java.lang.String description;
        private java.util.List<java.lang.String> enumValue;
        private java.lang.String example;
        private java.lang.Boolean exclusiveMaximum;
        private java.lang.Boolean exclusiveMinimum;
        private k8s.ExternalDocumentation externalDocs;
        private java.lang.String format;
        private java.lang.String id;
        private java.lang.String items;
        private java.lang.Number maximum;
        private java.lang.Number maxItems;
        private java.lang.Number maxLength;
        private java.lang.Number maxProperties;
        private java.lang.Number minimum;
        private java.lang.Number minItems;
        private java.lang.Number minLength;
        private java.lang.Number minProperties;
        private java.lang.Number multipleOf;
        private k8s.JSONSchemaProps not;
        private java.lang.Boolean nullable;
        private java.util.List<k8s.JSONSchemaProps> oneOf;
        private java.lang.String pattern;
        private java.util.Map<java.lang.String, k8s.JSONSchemaProps> patternProperties;
        private java.util.Map<java.lang.String, k8s.JSONSchemaProps> properties;
        private java.lang.String ref;
        private java.util.List<java.lang.String> required;
        private java.lang.String schema;
        private java.lang.String title;
        private java.lang.String type;
        private java.lang.Boolean uniqueItems;

        /**
         * Sets the value of {@link JSONSchemaProps#getAdditionalItems}
         * @param additionalItems the value to be set.
         * @return {@code this}
         */
        public Builder additionalItems(java.lang.String additionalItems) {
            this.additionalItems = additionalItems;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getAdditionalProperties}
         * @param additionalProperties the value to be set.
         * @return {@code this}
         */
        public Builder additionalProperties(java.lang.String additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getAllOf}
         * @param allOf the value to be set.
         * @return {@code this}
         */
        public Builder allOf(java.util.List<k8s.JSONSchemaProps> allOf) {
            this.allOf = allOf;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getAnyOf}
         * @param anyOf the value to be set.
         * @return {@code this}
         */
        public Builder anyOf(java.util.List<k8s.JSONSchemaProps> anyOf) {
            this.anyOf = anyOf;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getDefaultValue}
         * @param defaultValue default is a default value for undefined object fields.
         *                     Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getDefinitions}
         * @param definitions the value to be set.
         * @return {@code this}
         */
        public Builder definitions(java.util.Map<java.lang.String, k8s.JSONSchemaProps> definitions) {
            this.definitions = definitions;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getDependencies}
         * @param dependencies the value to be set.
         * @return {@code this}
         */
        public Builder dependencies(java.util.Map<java.lang.String, java.lang.String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getDescription}
         * @param description the value to be set.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getEnumValue}
         * @param enumValue the value to be set.
         * @return {@code this}
         */
        public Builder enumValue(java.util.List<java.lang.String> enumValue) {
            this.enumValue = enumValue;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getExample}
         * @param example the value to be set.
         * @return {@code this}
         */
        public Builder example(java.lang.String example) {
            this.example = example;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getExclusiveMaximum}
         * @param exclusiveMaximum the value to be set.
         * @return {@code this}
         */
        public Builder exclusiveMaximum(java.lang.Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getExclusiveMinimum}
         * @param exclusiveMinimum the value to be set.
         * @return {@code this}
         */
        public Builder exclusiveMinimum(java.lang.Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getExternalDocs}
         * @param externalDocs the value to be set.
         * @return {@code this}
         */
        public Builder externalDocs(k8s.ExternalDocumentation externalDocs) {
            this.externalDocs = externalDocs;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getFormat}
         * @param format format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:.
         *               <ul>
         *               <li>bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.</li>
         *               </ul>
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getId}
         * @param id the value to be set.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getItems}
         * @param items the value to be set.
         * @return {@code this}
         */
        public Builder items(java.lang.String items) {
            this.items = items;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMaximum}
         * @param maximum the value to be set.
         * @return {@code this}
         */
        public Builder maximum(java.lang.Number maximum) {
            this.maximum = maximum;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMaxItems}
         * @param maxItems the value to be set.
         * @return {@code this}
         */
        public Builder maxItems(java.lang.Number maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMaxLength}
         * @param maxLength the value to be set.
         * @return {@code this}
         */
        public Builder maxLength(java.lang.Number maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMaxProperties}
         * @param maxProperties the value to be set.
         * @return {@code this}
         */
        public Builder maxProperties(java.lang.Number maxProperties) {
            this.maxProperties = maxProperties;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMinimum}
         * @param minimum the value to be set.
         * @return {@code this}
         */
        public Builder minimum(java.lang.Number minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMinItems}
         * @param minItems the value to be set.
         * @return {@code this}
         */
        public Builder minItems(java.lang.Number minItems) {
            this.minItems = minItems;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMinLength}
         * @param minLength the value to be set.
         * @return {@code this}
         */
        public Builder minLength(java.lang.Number minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMinProperties}
         * @param minProperties the value to be set.
         * @return {@code this}
         */
        public Builder minProperties(java.lang.Number minProperties) {
            this.minProperties = minProperties;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getMultipleOf}
         * @param multipleOf the value to be set.
         * @return {@code this}
         */
        public Builder multipleOf(java.lang.Number multipleOf) {
            this.multipleOf = multipleOf;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getNot}
         * @param not the value to be set.
         * @return {@code this}
         */
        public Builder not(k8s.JSONSchemaProps not) {
            this.not = not;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getNullable}
         * @param nullable the value to be set.
         * @return {@code this}
         */
        public Builder nullable(java.lang.Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getOneOf}
         * @param oneOf the value to be set.
         * @return {@code this}
         */
        public Builder oneOf(java.util.List<k8s.JSONSchemaProps> oneOf) {
            this.oneOf = oneOf;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getPattern}
         * @param pattern the value to be set.
         * @return {@code this}
         */
        public Builder pattern(java.lang.String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getPatternProperties}
         * @param patternProperties the value to be set.
         * @return {@code this}
         */
        public Builder patternProperties(java.util.Map<java.lang.String, k8s.JSONSchemaProps> patternProperties) {
            this.patternProperties = patternProperties;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getProperties}
         * @param properties the value to be set.
         * @return {@code this}
         */
        public Builder properties(java.util.Map<java.lang.String, k8s.JSONSchemaProps> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getRef}
         * @param ref the value to be set.
         * @return {@code this}
         */
        public Builder ref(java.lang.String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getRequired}
         * @param required the value to be set.
         * @return {@code this}
         */
        public Builder required(java.util.List<java.lang.String> required) {
            this.required = required;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getSchema}
         * @param schema the value to be set.
         * @return {@code this}
         */
        public Builder schema(java.lang.String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getTitle}
         * @param title the value to be set.
         * @return {@code this}
         */
        public Builder title(java.lang.String title) {
            this.title = title;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getType}
         * @param type the value to be set.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link JSONSchemaProps#getUniqueItems}
         * @param uniqueItems the value to be set.
         * @return {@code this}
         */
        public Builder uniqueItems(java.lang.Boolean uniqueItems) {
            this.uniqueItems = uniqueItems;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link JSONSchemaProps}
         * @throws NullPointerException if any required attribute was not provided
         */
        public JSONSchemaProps build() {
            return new Jsii$Proxy(additionalItems, additionalProperties, allOf, anyOf, defaultValue, definitions, dependencies, description, enumValue, example, exclusiveMaximum, exclusiveMinimum, externalDocs, format, id, items, maximum, maxItems, maxLength, maxProperties, minimum, minItems, minLength, minProperties, multipleOf, not, nullable, oneOf, pattern, patternProperties, properties, ref, required, schema, title, type, uniqueItems);
        }
    }

    /**
     * An implementation for {@link JSONSchemaProps}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements JSONSchemaProps {
        private final java.lang.String additionalItems;
        private final java.lang.String additionalProperties;
        private final java.util.List<k8s.JSONSchemaProps> allOf;
        private final java.util.List<k8s.JSONSchemaProps> anyOf;
        private final java.lang.String defaultValue;
        private final java.util.Map<java.lang.String, k8s.JSONSchemaProps> definitions;
        private final java.util.Map<java.lang.String, java.lang.String> dependencies;
        private final java.lang.String description;
        private final java.util.List<java.lang.String> enumValue;
        private final java.lang.String example;
        private final java.lang.Boolean exclusiveMaximum;
        private final java.lang.Boolean exclusiveMinimum;
        private final k8s.ExternalDocumentation externalDocs;
        private final java.lang.String format;
        private final java.lang.String id;
        private final java.lang.String items;
        private final java.lang.Number maximum;
        private final java.lang.Number maxItems;
        private final java.lang.Number maxLength;
        private final java.lang.Number maxProperties;
        private final java.lang.Number minimum;
        private final java.lang.Number minItems;
        private final java.lang.Number minLength;
        private final java.lang.Number minProperties;
        private final java.lang.Number multipleOf;
        private final k8s.JSONSchemaProps not;
        private final java.lang.Boolean nullable;
        private final java.util.List<k8s.JSONSchemaProps> oneOf;
        private final java.lang.String pattern;
        private final java.util.Map<java.lang.String, k8s.JSONSchemaProps> patternProperties;
        private final java.util.Map<java.lang.String, k8s.JSONSchemaProps> properties;
        private final java.lang.String ref;
        private final java.util.List<java.lang.String> required;
        private final java.lang.String schema;
        private final java.lang.String title;
        private final java.lang.String type;
        private final java.lang.Boolean uniqueItems;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.additionalItems = this.jsiiGet("additionalItems", java.lang.String.class);
            this.additionalProperties = this.jsiiGet("additionalProperties", java.lang.String.class);
            this.allOf = this.jsiiGet("allOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.anyOf = this.jsiiGet("anyOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.defaultValue = this.jsiiGet("default", java.lang.String.class);
            this.definitions = this.jsiiGet("definitions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.dependencies = this.jsiiGet("dependencies", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.description = this.jsiiGet("description", java.lang.String.class);
            this.enumValue = this.jsiiGet("enum", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.example = this.jsiiGet("example", java.lang.String.class);
            this.exclusiveMaximum = this.jsiiGet("exclusiveMaximum", java.lang.Boolean.class);
            this.exclusiveMinimum = this.jsiiGet("exclusiveMinimum", java.lang.Boolean.class);
            this.externalDocs = this.jsiiGet("externalDocs", k8s.ExternalDocumentation.class);
            this.format = this.jsiiGet("format", java.lang.String.class);
            this.id = this.jsiiGet("id", java.lang.String.class);
            this.items = this.jsiiGet("items", java.lang.String.class);
            this.maximum = this.jsiiGet("maximum", java.lang.Number.class);
            this.maxItems = this.jsiiGet("maxItems", java.lang.Number.class);
            this.maxLength = this.jsiiGet("maxLength", java.lang.Number.class);
            this.maxProperties = this.jsiiGet("maxProperties", java.lang.Number.class);
            this.minimum = this.jsiiGet("minimum", java.lang.Number.class);
            this.minItems = this.jsiiGet("minItems", java.lang.Number.class);
            this.minLength = this.jsiiGet("minLength", java.lang.Number.class);
            this.minProperties = this.jsiiGet("minProperties", java.lang.Number.class);
            this.multipleOf = this.jsiiGet("multipleOf", java.lang.Number.class);
            this.not = this.jsiiGet("not", k8s.JSONSchemaProps.class);
            this.nullable = this.jsiiGet("nullable", java.lang.Boolean.class);
            this.oneOf = this.jsiiGet("oneOf", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.pattern = this.jsiiGet("pattern", java.lang.String.class);
            this.patternProperties = this.jsiiGet("patternProperties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.properties = this.jsiiGet("properties", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(k8s.JSONSchemaProps.class)));
            this.ref = this.jsiiGet("ref", java.lang.String.class);
            this.required = this.jsiiGet("required", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.schema = this.jsiiGet("schema", java.lang.String.class);
            this.title = this.jsiiGet("title", java.lang.String.class);
            this.type = this.jsiiGet("type", java.lang.String.class);
            this.uniqueItems = this.jsiiGet("uniqueItems", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String additionalItems, final java.lang.String additionalProperties, final java.util.List<k8s.JSONSchemaProps> allOf, final java.util.List<k8s.JSONSchemaProps> anyOf, final java.lang.String defaultValue, final java.util.Map<java.lang.String, k8s.JSONSchemaProps> definitions, final java.util.Map<java.lang.String, java.lang.String> dependencies, final java.lang.String description, final java.util.List<java.lang.String> enumValue, final java.lang.String example, final java.lang.Boolean exclusiveMaximum, final java.lang.Boolean exclusiveMinimum, final k8s.ExternalDocumentation externalDocs, final java.lang.String format, final java.lang.String id, final java.lang.String items, final java.lang.Number maximum, final java.lang.Number maxItems, final java.lang.Number maxLength, final java.lang.Number maxProperties, final java.lang.Number minimum, final java.lang.Number minItems, final java.lang.Number minLength, final java.lang.Number minProperties, final java.lang.Number multipleOf, final k8s.JSONSchemaProps not, final java.lang.Boolean nullable, final java.util.List<k8s.JSONSchemaProps> oneOf, final java.lang.String pattern, final java.util.Map<java.lang.String, k8s.JSONSchemaProps> patternProperties, final java.util.Map<java.lang.String, k8s.JSONSchemaProps> properties, final java.lang.String ref, final java.util.List<java.lang.String> required, final java.lang.String schema, final java.lang.String title, final java.lang.String type, final java.lang.Boolean uniqueItems) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.additionalItems = additionalItems;
            this.additionalProperties = additionalProperties;
            this.allOf = allOf;
            this.anyOf = anyOf;
            this.defaultValue = defaultValue;
            this.definitions = definitions;
            this.dependencies = dependencies;
            this.description = description;
            this.enumValue = enumValue;
            this.example = example;
            this.exclusiveMaximum = exclusiveMaximum;
            this.exclusiveMinimum = exclusiveMinimum;
            this.externalDocs = externalDocs;
            this.format = format;
            this.id = id;
            this.items = items;
            this.maximum = maximum;
            this.maxItems = maxItems;
            this.maxLength = maxLength;
            this.maxProperties = maxProperties;
            this.minimum = minimum;
            this.minItems = minItems;
            this.minLength = minLength;
            this.minProperties = minProperties;
            this.multipleOf = multipleOf;
            this.not = not;
            this.nullable = nullable;
            this.oneOf = oneOf;
            this.pattern = pattern;
            this.patternProperties = patternProperties;
            this.properties = properties;
            this.ref = ref;
            this.required = required;
            this.schema = schema;
            this.title = title;
            this.type = type;
            this.uniqueItems = uniqueItems;
        }

        @Override
        public java.lang.String getAdditionalItems() {
            return this.additionalItems;
        }

        @Override
        public java.lang.String getAdditionalProperties() {
            return this.additionalProperties;
        }

        @Override
        public java.util.List<k8s.JSONSchemaProps> getAllOf() {
            return this.allOf;
        }

        @Override
        public java.util.List<k8s.JSONSchemaProps> getAnyOf() {
            return this.anyOf;
        }

        @Override
        public java.lang.String getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.JSONSchemaProps> getDefinitions() {
            return this.definitions;
        }

        @Override
        public java.util.Map<java.lang.String, java.lang.String> getDependencies() {
            return this.dependencies;
        }

        @Override
        public java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public java.util.List<java.lang.String> getEnumValue() {
            return this.enumValue;
        }

        @Override
        public java.lang.String getExample() {
            return this.example;
        }

        @Override
        public java.lang.Boolean getExclusiveMaximum() {
            return this.exclusiveMaximum;
        }

        @Override
        public java.lang.Boolean getExclusiveMinimum() {
            return this.exclusiveMinimum;
        }

        @Override
        public k8s.ExternalDocumentation getExternalDocs() {
            return this.externalDocs;
        }

        @Override
        public java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public java.lang.String getId() {
            return this.id;
        }

        @Override
        public java.lang.String getItems() {
            return this.items;
        }

        @Override
        public java.lang.Number getMaximum() {
            return this.maximum;
        }

        @Override
        public java.lang.Number getMaxItems() {
            return this.maxItems;
        }

        @Override
        public java.lang.Number getMaxLength() {
            return this.maxLength;
        }

        @Override
        public java.lang.Number getMaxProperties() {
            return this.maxProperties;
        }

        @Override
        public java.lang.Number getMinimum() {
            return this.minimum;
        }

        @Override
        public java.lang.Number getMinItems() {
            return this.minItems;
        }

        @Override
        public java.lang.Number getMinLength() {
            return this.minLength;
        }

        @Override
        public java.lang.Number getMinProperties() {
            return this.minProperties;
        }

        @Override
        public java.lang.Number getMultipleOf() {
            return this.multipleOf;
        }

        @Override
        public k8s.JSONSchemaProps getNot() {
            return this.not;
        }

        @Override
        public java.lang.Boolean getNullable() {
            return this.nullable;
        }

        @Override
        public java.util.List<k8s.JSONSchemaProps> getOneOf() {
            return this.oneOf;
        }

        @Override
        public java.lang.String getPattern() {
            return this.pattern;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.JSONSchemaProps> getPatternProperties() {
            return this.patternProperties;
        }

        @Override
        public java.util.Map<java.lang.String, k8s.JSONSchemaProps> getProperties() {
            return this.properties;
        }

        @Override
        public java.lang.String getRef() {
            return this.ref;
        }

        @Override
        public java.util.List<java.lang.String> getRequired() {
            return this.required;
        }

        @Override
        public java.lang.String getSchema() {
            return this.schema;
        }

        @Override
        public java.lang.String getTitle() {
            return this.title;
        }

        @Override
        public java.lang.String getType() {
            return this.type;
        }

        @Override
        public java.lang.Boolean getUniqueItems() {
            return this.uniqueItems;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAdditionalItems() != null) {
                data.set("additionalItems", om.valueToTree(this.getAdditionalItems()));
            }
            if (this.getAdditionalProperties() != null) {
                data.set("additionalProperties", om.valueToTree(this.getAdditionalProperties()));
            }
            if (this.getAllOf() != null) {
                data.set("allOf", om.valueToTree(this.getAllOf()));
            }
            if (this.getAnyOf() != null) {
                data.set("anyOf", om.valueToTree(this.getAnyOf()));
            }
            if (this.getDefaultValue() != null) {
                data.set("default", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getDefinitions() != null) {
                data.set("definitions", om.valueToTree(this.getDefinitions()));
            }
            if (this.getDependencies() != null) {
                data.set("dependencies", om.valueToTree(this.getDependencies()));
            }
            if (this.getDescription() != null) {
                data.set("description", om.valueToTree(this.getDescription()));
            }
            if (this.getEnumValue() != null) {
                data.set("enum", om.valueToTree(this.getEnumValue()));
            }
            if (this.getExample() != null) {
                data.set("example", om.valueToTree(this.getExample()));
            }
            if (this.getExclusiveMaximum() != null) {
                data.set("exclusiveMaximum", om.valueToTree(this.getExclusiveMaximum()));
            }
            if (this.getExclusiveMinimum() != null) {
                data.set("exclusiveMinimum", om.valueToTree(this.getExclusiveMinimum()));
            }
            if (this.getExternalDocs() != null) {
                data.set("externalDocs", om.valueToTree(this.getExternalDocs()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }
            if (this.getMaximum() != null) {
                data.set("maximum", om.valueToTree(this.getMaximum()));
            }
            if (this.getMaxItems() != null) {
                data.set("maxItems", om.valueToTree(this.getMaxItems()));
            }
            if (this.getMaxLength() != null) {
                data.set("maxLength", om.valueToTree(this.getMaxLength()));
            }
            if (this.getMaxProperties() != null) {
                data.set("maxProperties", om.valueToTree(this.getMaxProperties()));
            }
            if (this.getMinimum() != null) {
                data.set("minimum", om.valueToTree(this.getMinimum()));
            }
            if (this.getMinItems() != null) {
                data.set("minItems", om.valueToTree(this.getMinItems()));
            }
            if (this.getMinLength() != null) {
                data.set("minLength", om.valueToTree(this.getMinLength()));
            }
            if (this.getMinProperties() != null) {
                data.set("minProperties", om.valueToTree(this.getMinProperties()));
            }
            if (this.getMultipleOf() != null) {
                data.set("multipleOf", om.valueToTree(this.getMultipleOf()));
            }
            if (this.getNot() != null) {
                data.set("not", om.valueToTree(this.getNot()));
            }
            if (this.getNullable() != null) {
                data.set("nullable", om.valueToTree(this.getNullable()));
            }
            if (this.getOneOf() != null) {
                data.set("oneOf", om.valueToTree(this.getOneOf()));
            }
            if (this.getPattern() != null) {
                data.set("pattern", om.valueToTree(this.getPattern()));
            }
            if (this.getPatternProperties() != null) {
                data.set("patternProperties", om.valueToTree(this.getPatternProperties()));
            }
            if (this.getProperties() != null) {
                data.set("properties", om.valueToTree(this.getProperties()));
            }
            if (this.getRef() != null) {
                data.set("ref", om.valueToTree(this.getRef()));
            }
            if (this.getRequired() != null) {
                data.set("required", om.valueToTree(this.getRequired()));
            }
            if (this.getSchema() != null) {
                data.set("schema", om.valueToTree(this.getSchema()));
            }
            if (this.getTitle() != null) {
                data.set("title", om.valueToTree(this.getTitle()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }
            if (this.getUniqueItems() != null) {
                data.set("uniqueItems", om.valueToTree(this.getUniqueItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.JSONSchemaProps"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JSONSchemaProps.Jsii$Proxy that = (JSONSchemaProps.Jsii$Proxy) o;

            if (this.additionalItems != null ? !this.additionalItems.equals(that.additionalItems) : that.additionalItems != null) return false;
            if (this.additionalProperties != null ? !this.additionalProperties.equals(that.additionalProperties) : that.additionalProperties != null) return false;
            if (this.allOf != null ? !this.allOf.equals(that.allOf) : that.allOf != null) return false;
            if (this.anyOf != null ? !this.anyOf.equals(that.anyOf) : that.anyOf != null) return false;
            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.definitions != null ? !this.definitions.equals(that.definitions) : that.definitions != null) return false;
            if (this.dependencies != null ? !this.dependencies.equals(that.dependencies) : that.dependencies != null) return false;
            if (this.description != null ? !this.description.equals(that.description) : that.description != null) return false;
            if (this.enumValue != null ? !this.enumValue.equals(that.enumValue) : that.enumValue != null) return false;
            if (this.example != null ? !this.example.equals(that.example) : that.example != null) return false;
            if (this.exclusiveMaximum != null ? !this.exclusiveMaximum.equals(that.exclusiveMaximum) : that.exclusiveMaximum != null) return false;
            if (this.exclusiveMinimum != null ? !this.exclusiveMinimum.equals(that.exclusiveMinimum) : that.exclusiveMinimum != null) return false;
            if (this.externalDocs != null ? !this.externalDocs.equals(that.externalDocs) : that.externalDocs != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.items != null ? !this.items.equals(that.items) : that.items != null) return false;
            if (this.maximum != null ? !this.maximum.equals(that.maximum) : that.maximum != null) return false;
            if (this.maxItems != null ? !this.maxItems.equals(that.maxItems) : that.maxItems != null) return false;
            if (this.maxLength != null ? !this.maxLength.equals(that.maxLength) : that.maxLength != null) return false;
            if (this.maxProperties != null ? !this.maxProperties.equals(that.maxProperties) : that.maxProperties != null) return false;
            if (this.minimum != null ? !this.minimum.equals(that.minimum) : that.minimum != null) return false;
            if (this.minItems != null ? !this.minItems.equals(that.minItems) : that.minItems != null) return false;
            if (this.minLength != null ? !this.minLength.equals(that.minLength) : that.minLength != null) return false;
            if (this.minProperties != null ? !this.minProperties.equals(that.minProperties) : that.minProperties != null) return false;
            if (this.multipleOf != null ? !this.multipleOf.equals(that.multipleOf) : that.multipleOf != null) return false;
            if (this.not != null ? !this.not.equals(that.not) : that.not != null) return false;
            if (this.nullable != null ? !this.nullable.equals(that.nullable) : that.nullable != null) return false;
            if (this.oneOf != null ? !this.oneOf.equals(that.oneOf) : that.oneOf != null) return false;
            if (this.pattern != null ? !this.pattern.equals(that.pattern) : that.pattern != null) return false;
            if (this.patternProperties != null ? !this.patternProperties.equals(that.patternProperties) : that.patternProperties != null) return false;
            if (this.properties != null ? !this.properties.equals(that.properties) : that.properties != null) return false;
            if (this.ref != null ? !this.ref.equals(that.ref) : that.ref != null) return false;
            if (this.required != null ? !this.required.equals(that.required) : that.required != null) return false;
            if (this.schema != null ? !this.schema.equals(that.schema) : that.schema != null) return false;
            if (this.title != null ? !this.title.equals(that.title) : that.title != null) return false;
            if (this.type != null ? !this.type.equals(that.type) : that.type != null) return false;
            return this.uniqueItems != null ? this.uniqueItems.equals(that.uniqueItems) : that.uniqueItems == null;
        }

        @Override
        public int hashCode() {
            int result = this.additionalItems != null ? this.additionalItems.hashCode() : 0;
            result = 31 * result + (this.additionalProperties != null ? this.additionalProperties.hashCode() : 0);
            result = 31 * result + (this.allOf != null ? this.allOf.hashCode() : 0);
            result = 31 * result + (this.anyOf != null ? this.anyOf.hashCode() : 0);
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            result = 31 * result + (this.definitions != null ? this.definitions.hashCode() : 0);
            result = 31 * result + (this.dependencies != null ? this.dependencies.hashCode() : 0);
            result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
            result = 31 * result + (this.enumValue != null ? this.enumValue.hashCode() : 0);
            result = 31 * result + (this.example != null ? this.example.hashCode() : 0);
            result = 31 * result + (this.exclusiveMaximum != null ? this.exclusiveMaximum.hashCode() : 0);
            result = 31 * result + (this.exclusiveMinimum != null ? this.exclusiveMinimum.hashCode() : 0);
            result = 31 * result + (this.externalDocs != null ? this.externalDocs.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.items != null ? this.items.hashCode() : 0);
            result = 31 * result + (this.maximum != null ? this.maximum.hashCode() : 0);
            result = 31 * result + (this.maxItems != null ? this.maxItems.hashCode() : 0);
            result = 31 * result + (this.maxLength != null ? this.maxLength.hashCode() : 0);
            result = 31 * result + (this.maxProperties != null ? this.maxProperties.hashCode() : 0);
            result = 31 * result + (this.minimum != null ? this.minimum.hashCode() : 0);
            result = 31 * result + (this.minItems != null ? this.minItems.hashCode() : 0);
            result = 31 * result + (this.minLength != null ? this.minLength.hashCode() : 0);
            result = 31 * result + (this.minProperties != null ? this.minProperties.hashCode() : 0);
            result = 31 * result + (this.multipleOf != null ? this.multipleOf.hashCode() : 0);
            result = 31 * result + (this.not != null ? this.not.hashCode() : 0);
            result = 31 * result + (this.nullable != null ? this.nullable.hashCode() : 0);
            result = 31 * result + (this.oneOf != null ? this.oneOf.hashCode() : 0);
            result = 31 * result + (this.pattern != null ? this.pattern.hashCode() : 0);
            result = 31 * result + (this.patternProperties != null ? this.patternProperties.hashCode() : 0);
            result = 31 * result + (this.properties != null ? this.properties.hashCode() : 0);
            result = 31 * result + (this.ref != null ? this.ref.hashCode() : 0);
            result = 31 * result + (this.required != null ? this.required.hashCode() : 0);
            result = 31 * result + (this.schema != null ? this.schema.hashCode() : 0);
            result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            result = 31 * result + (this.uniqueItems != null ? this.uniqueItems.hashCode() : 0);
            return result;
        }
    }
}
