package com.mycompany.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        // define resources here
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "{{ $base }}");
        app.synth();
    }
}
