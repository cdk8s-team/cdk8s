package clusterinstallation;

/**
 * Name or number of the port to access on the container.
 * <p>
 * Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.1.0 (build df55f5e)", date = "2020-05-13T16:00:54.386Z")
@software.amazon.jsii.Jsii(module = clusterinstallation.$Module.class, fqn = "clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort")
public class ClusterInstallationSpecLivenessProbeHttpGetPort extends software.amazon.jsii.JsiiObject {

    protected ClusterInstallationSpecLivenessProbeHttpGetPort(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterInstallationSpecLivenessProbeHttpGetPort(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort.class, "fromNumber", clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort.class, "fromString", clusterinstallation.ClusterInstallationSpecLivenessProbeHttpGetPort.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }
}
