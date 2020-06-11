package com.mycompany.app;

import software.constructs.Construct;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

import k8s.IntOrString;
import k8s.LabelSelector;
import k8s.ObjectMeta;
import k8s.PodTemplateSpec;
import k8s.Service;
import k8s.ServiceOptions;
import k8s.ServicePort;
import k8s.ServiceSpec;
import k8s.DeploymentSpec;
import k8s.PodSpec;
import k8s.Container;
import k8s.ContainerPort;
import k8s.Deployment;
import k8s.DeploymentOptions;

/**
 * Hello world!
 */
public class WebService extends Construct 
{

    public WebService(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public WebService(final Construct scope, final String id, final WebServiceOptions options) {
        super(scope, id);

        final int portNumber = Optional.of(options.getPort()).orElse(80);
        final int containerPortNumber = Optional.of(options.getContainerPort()).orElse(8080);
        final int replicas = Optional.of(options.getReplicas()).orElse(1);
        final String image = options.getImage();

        // Defining a LoadBalancer Service
        final String serviceType = "LoadBalancer";
        final Map<String, String> selector = new HashMap<>();
        selector.put("app", "hello-k8s");
        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
            .port(portNumber)
            .targetPort(IntOrString.fromNumber(containerPortNumber))
            .build();
        servicePorts.add(servicePort);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
            .type(serviceType)
            .selector(selector)
            .ports(servicePorts)
            .build();
        final ServiceOptions serviceOptions = new ServiceOptions.Builder()
            .spec(serviceSpec)
            .build();

        new Service(this, "service", serviceOptions);

        // Defining a Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta objectMeta = new ObjectMeta.Builder().labels(selector).build();
        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder()
            .containerPort(containerPortNumber)
            .build();
        containerPorts.add(containerPort);
        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
            .name("web")
            .image(image)
            .ports(containerPorts)
            .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
            .containers(containers)
            .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
            .metadata(objectMeta)
            .spec(podSpec)
            .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
            .replicas(1)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final DeploymentOptions deploymentOptions = new DeploymentOptions.Builder()
            .spec(deploymentSpec)
            .build();

        new Deployment(this, "deployment", deploymentOptions);

    }
}