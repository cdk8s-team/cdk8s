package com.mycompany.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

/**
 * Hello world!
 */
public class HelloKube extends Chart 
{

    public HelloKube(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public HelloKube(final Construct scope, final String id, final ChartProps props) {
        super(scope, id, props);

        final WebServiceOptions helloOptions = new WebServiceOptions.Builder()
            .image("paulbouwer/hello-kubernetes:1.7")
            .replicas(2)
            .build();

        new WebService(this, "hello", helloOptions);

        final WebServiceOptions ghostOptions = new WebServiceOptions.Builder()
            .image("ghost")
            .containerPort(2368)
            .build();

        new WebService(this, "ghost", ghostOptions);
    }

    public static void main(String[] args) {
        final App app = new App();
        new HelloKube(app, "web-service-java");
        app.synth();
    }
}