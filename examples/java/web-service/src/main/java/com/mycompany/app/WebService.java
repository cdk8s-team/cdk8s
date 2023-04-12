package com.mycompany.app;

import org.cdk8s.plus25.k8s.*;
import org.jetbrains.annotations.NotNull;
import software.constructs.Construct;

import java.util.*;

/**
 * Hello world!
 */
public class WebService extends Construct 
{

    public WebService(@NotNull final Construct scope,@NotNull final String id, final WebServiceOptions options) {
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
        final KubeServiceProps serviceProps = new KubeServiceProps.Builder()
            .spec(serviceSpec)
            .build();

        new KubeService(this, "service", serviceProps);

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
            .replicas(replicas)
            .selector(labelSelector)
            .template(podTemplateSpec)
            .build();
        final KubeDeploymentProps deploymentProps = new KubeDeploymentProps.Builder()
            .spec(deploymentSpec)
            .build();

        new KubeDeployment(this, "deployment", deploymentProps);

    }
}