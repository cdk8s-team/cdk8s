package main

import (
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
	kplus "github.com/cdk8s-team/cdk8s-plus-go/cdk8splus22"
)

// redisDefinition creates the resources necessary to deploy redis either as standalone
// or as a sidecar to the node application
func redisDefinition(app *cdk8s.App, sidecar bool, mainDeployment kplus.Deployment) {

	redisChart := cdk8s.NewChart(*app, jsii.String("redis"), nil)

	redisMetadata := cdk8s.ApiObjectMetadata{
		Annotations: &map[string]*string{"cdk8s_plus": js("22")},
		Name:        js("redis"),
	}

	redisConfig := kplus.NewConfigMap(redisChart, js("redisConfig"),
		&kplus.ConfigMapProps{
			Metadata: &redisMetadata,
			Data:     &map[string]*string{"REDIS_PASS": js("TestDB@home2")},
		})

	redisProps := kplus.ContainerProps{
		Image: js("redis"),
		Args: &[]*string{js("sh"),
			js("-c"),
			js("redis-server"),
			js("--requirepass"),
			js("${REDIS_PASS}"),
		},
		Name:            js("rediscont"),
		Port:            jn(6379),
		ImagePullPolicy: kplus.ImagePullPolicy_IF_NOT_PRESENT,
		Env: &map[string]kplus.EnvValue{"REDIS_PASS": kplus.EnvValue_FromConfigMap(redisConfig,
			js("REDIS_PASS"), &kplus.EnvValueFromConfigMapOptions{})},
	}

	if sidecar {

		mainDeployment.AddContainer(&redisProps)

	} else {
		redisDeployment := kplus.NewDeployment(redisChart, js("redis"), &kplus.DeploymentProps{
			Metadata:    &redisMetadata,
			Containers:  &[]*kplus.ContainerProps{&redisProps},
			PodMetadata: &redisMetadata,
			Replicas:    jn(1),
		})

		redisDeployment.ExposeViaService(&kplus.ExposeDeploymentViaServiceOptions{
			Name:        js("redis"),
			Port:        jn(6379),
			ServiceType: kplus.ServiceType_CLUSTER_IP,
		})
	}

}
