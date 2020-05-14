package k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T15:58:47.382Z")
@software.amazon.jsii.Jsii(module = k8s.$Module.class, fqn = "k8s.Quantity")
public class Quantity extends software.amazon.jsii.JsiiObject {

    protected Quantity(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Quantity(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull k8s.Quantity fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(k8s.Quantity.class, "fromNumber", k8s.Quantity.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull k8s.Quantity fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(k8s.Quantity.class, "fromString", k8s.Quantity.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }
}
