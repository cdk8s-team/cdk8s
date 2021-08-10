package main

import (
	"github.com/aws/constructs-go/constructs/v3"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

type HelloHelmProps struct {
	cdk8s.ChartProps
}

func NewHelloHelm(scope constructs.Construct, id string, props *HelloHelmProps) cdk8s.Chart {
	var cprops cdk8s.ChartProps
	if props != nil {
		cprops = props.ChartProps
	}
	chart := cdk8s.NewChart(scope, jsii.String(id), &cprops)

	cdk8s.NewHelm(chart, jsii.String("redis"), &cdk8s.HelmProps{
		Chart: jsii.String("bitnami/redis"),
		Values: &map[string]interface{}{
			"sentinel": &map[string]interface{}{
				"enabled": true, // not jsii.Bool(true)
			},
		},
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewHelloHelm(app, "hello-helm", nil)
	app.Synth()
}
