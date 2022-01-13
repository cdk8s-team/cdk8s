package main

import (
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
	kplus "github.com/cdk8s-team/cdk8s-plus-go/cdk8splus22"
)

const NodeappImage = "YOURACCOUNT/cdk8sdemo"

// nodeappDefinition creates the resources necessary to deploy the node application
func nodeappDefinition(app *cdk8s.App) *kplus.Deployment {
	nodeappChart := cdk8s.NewChart(*app, jsii.String("nodeapp"), nil)

	nodeappMetadata := cdk8s.ApiObjectMetadata{
		Annotations: &map[string]*string{"cdk8s_plus": js("22")},
		Name:        js("nodeapp"),
	}

	// Environment variables to connect to the DBS
	nodeConfig := kplus.NewConfigMap(nodeappChart, js("nodeappConfig"),
		&kplus.ConfigMapProps{
			Metadata: &nodeappMetadata,
			Data: &map[string]*string{
				"DB_HOST":    js("mariadb"),
				"DB_NAME":    js("test"),
				"DB_PORT":    js("3306"),
				"REDIS_HOST": js("redis"),
				"REDIS_PORT": js("6379"),
			},
		})

	// secret definitions. Do not hardcode these outside of a demo project. Instead,
	// pull them from secrets manager or Vault and pass them in
	nodeappSecret := kplus.NewSecret(nodeappChart, js("nodeapp_secret"),
		&kplus.SecretProps{
			Metadata: &nodeappMetadata,
			StringData: &map[string]*string{
				"DB_USER":    js("root"),
				"DB_PWD":     js("TestDB@home2"),
				"REDIS_PASS": js("TestDB@home2"),
			},
		})

	// Deploy the nodeapp container
	nodeappDeployment := kplus.NewDeployment(nodeappChart, js("nodeappDeployment"),
		&kplus.DeploymentProps{
			Metadata:    &nodeappMetadata,
			PodMetadata: &nodeappMetadata,
			Replicas:    jn(1),
			Containers: &[]*kplus.ContainerProps{{
				Image: js(NodeappImage),
				Env: &map[string]kplus.EnvValue{
					"DB_HOST": kplus.EnvValue_FromConfigMap(nodeConfig, js("DB_HOST"), nil),
					"DB_NAME": kplus.EnvValue_FromConfigMap(nodeConfig, js("DB_NAME"), nil),
					"DB_PORT": kplus.EnvValue_FromConfigMap(nodeConfig, js("DB_PORT"), nil),
					"DB_PWD": kplus.EnvValue_FromSecretValue(&kplus.SecretValue{
						Key:    js("DB_PWD"),
						Secret: nodeappSecret,
					}, nil),
					"DB_USER": kplus.EnvValue_FromSecretValue(&kplus.SecretValue{
						Key:    js("DB_USER"),
						Secret: nodeappSecret,
					}, nil),
					"REDIS_HOST": kplus.EnvValue_FromConfigMap(nodeConfig, js("REDIS_HOST"), nil),
					"REDIS_PORT": kplus.EnvValue_FromConfigMap(nodeConfig, js("REDIS_PORT"), nil),
					"REDIS_PASS": kplus.EnvValue_FromSecretValue(&kplus.SecretValue{
						Key:    js("REDIS_PASS"),
						Secret: nodeappSecret,
					}, nil),
				},
				ImagePullPolicy: kplus.ImagePullPolicy_IF_NOT_PRESENT,
				Name:            js("nodaappcont"),
				Port:            jn(3000),
			}},
		})

	nodeappDeployment.ExposeViaService(&kplus.ExposeDeploymentViaServiceOptions{
		Name:        js("nodeapp"),
		Port:        jn(3000),
		ServiceType: kplus.ServiceType_NODE_PORT,
	})

	return &nodeappDeployment
}
