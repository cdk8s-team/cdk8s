package main

import (
	"encoding/json"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

// prometheusDefinition creates the resources necessary to install Prometheus in the cluster
// as per its Helm chart
func prometheusDefinition(app *cdk8s.App) {
	prometheusChart := cdk8s.NewChart(*app, jsii.String("prometheus"), nil)

	cdk8s.NewHelm(prometheusChart, js("prometheus"),
		&cdk8s.HelmProps{
			Chart:  js("prometheus-community/prometheus"),
			Values: getValues(),
		},
	)
}

// getValues processes the override values to be applied to the helm chart
func getValues() *map[string]interface{} {
	var valuesMap map[string]interface{}
	valuesJson := `{"alertmanager": {"service": {"type": "NodePort"}},
			  "server": {"service": {"type": "NodePort"}}}`
	_ = json.Unmarshal([]byte(valuesJson), &valuesMap)
	return &valuesMap
}
