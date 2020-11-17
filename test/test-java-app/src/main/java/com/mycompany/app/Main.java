package com.mycompany.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

import imports.k8s.PodSpec;
import imports.k8s.Container;
import imports.k8s.ContainerPort;
import imports.k8s.KubePod;
import imports.k8s.KubePodOptions;

/**
 * Hello world!
 */
public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort port = new ContainerPort.Builder().containerPort(8080).build();
        containerPorts.add(port);

        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder().name("hello-kubernetes").image("paulbower/hello-kubernetes:1.7").ports(containerPorts).build();
        containers.add(container);

        final PodSpec podSpec = new PodSpec.Builder()
                                            .containers(containers)
                                            .build();

        final KubePodOptions podOptions = new KubePodOptions.Builder()
            .spec(podSpec)
            .build();

        final KubePod pod = new KubePod(this, "Pod", podOptions);

    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "test");
        app.synth();
    }
}