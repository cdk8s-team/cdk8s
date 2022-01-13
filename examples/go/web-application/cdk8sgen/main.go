package main

import (
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

// Generate redis as a side car or as independent deployment
const redisSidecar = false

// Convenience functions

func js(aString string) *string {
	return jsii.String(aString)
}

func jn(aNumber float64) *float64 {
	return jsii.Number(aNumber)
}

// Main execution

func main() {

	app := cdk8s.NewApp(&cdk8s.AppProps{
		YamlOutputType: cdk8s.YamlOutputType_FILE_PER_RESOURCE,
	})

	nodeappDeployment := nodeappDefinition(&app)
	mariadbDefinition(&app)
	redisDefinition(&app, redisSidecar, *nodeappDeployment)
	prometheusDefinition(&app)
	app.Synth()
}
