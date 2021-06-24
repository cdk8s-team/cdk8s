package com.mycompany.app;

import software.constructs.Construct;

import java.util.HashMap;
import java.util.Map;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;
import org.cdk8s.Helm;
import org.cdk8s.HelmProps;

/**
 * Hello bitnami!
 */
public class HelmBitnami extends Chart 
{

    public HelmBitnami(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public HelmBitnami(final Construct scope, final String id, final ChartProps props) {
        super(scope, id, props);

        final Map<String, Boolean> enabled = new HashMap<>();
        enabled.put("enabled", true);

        final Map<String, Map<String, Boolean>> sentinel = new HashMap<>();
        sentinel.put("sentinel", enabled);

        new Helm(this, "bitnami", new HelmProps.Builder()
                                                .chart("bitnami/redis")
                                                .values(sentinel)
                                                .build()
        );
    }

    public static void main(String[] args) {
        final App app = new App();
        new HelmBitnami(app, "helm-bitnami-java");
        app.synth();
    }
}