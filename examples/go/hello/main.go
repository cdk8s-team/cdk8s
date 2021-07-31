package main

import (
	"example.com/hello-k8s/imports/k8s"
	"github.com/aws/constructs-go/constructs/v3"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

type MyChartProps struct {
	cdk8s.ChartProps
}

func NewMyChart(scope constructs.Construct, id string, props *MyChartProps) cdk8s.Chart {
	var sprops cdk8s.ChartProps
	if props != nil {
		sprops = props.ChartProps
	}
	chart := cdk8s.NewChart(scope, &id, &sprops)

	label := map[string]*string{"app": jsii.String("hello-k8s")}

	k8s.NewKubeService(chart, jsii.String("service"), &k8s.KubeServiceProps{
		Spec: &k8s.ServiceSpec{
			Type: jsii.String("LoadBalancer"),
			Ports: &[]*k8s.ServicePort{{
				Port:       jsii.Number(80),
				TargetPort: k8s.IntOrString_FromNumber(jsii.Number(8000)),
			}},
			Selector: &label,
		},
	})

	k8s.NewKubeDeployment(chart, jsii.String("deployment"), &k8s.KubeDeploymentProps{
		Spec: &k8s.DeploymentSpec{
			Replicas: jsii.Number(2),
			Selector: &k8s.LabelSelector{
				MatchLabels: &label,
			},
			Template: &k8s.PodTemplateSpec{
				Metadata: &k8s.ObjectMeta{
					Labels: &label,
				},
				Spec: &k8s.PodSpec{
					Containers: &[]*k8s.Container{{
						Name:  jsii.String("hello-kubernetes"),
						Image: jsii.String("paulbouwer/hello-kubernetes:1.7"),
						Ports: &[]*k8s.ContainerPort{{ContainerPort: jsii.Number(8080)}},
					}},
				},
			},
		},
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewMyChart(app, "hello-go", nil)
	app.Synth()
}
