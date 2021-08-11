package main

import (
	"example.com/crd-go/imports/jenkinsio"
	"example.com/crd-go/imports/mattermostcom"
	"github.com/aws/constructs-go/constructs/v3"
	"github.com/aws/jsii-runtime-go"
	"github.com/cdk8s-team/cdk8s-core-go/cdk8s"
)

type MyChartProps struct {
	cdk8s.ChartProps
}

func NewMyChart(scope constructs.Construct, id string, props *MyChartProps) cdk8s.Chart {
	var cprops cdk8s.ChartProps
	if props != nil {
		cprops = props.ChartProps
	}
	chart := cdk8s.NewChart(scope, jsii.String(id), &cprops)

	jenkinsio.NewJenkins(chart, jsii.String("jenkins"), &jenkinsio.JenkinsProps{
		Spec: &jenkinsio.JenkinsSpec{
			SeedJobs: &[]*jenkinsio.JenkinsSpecSeedJobs{{
				Description:      jsii.String("Jenkins Operator repository"),
				Id:               jsii.String("jenkins-operator"),
				RepositoryBranch: jsii.String("master"),
				RepositoryUrl:    jsii.String("https://github.com/jenkinsci/kubernetes-operator.git"),
				Targets:          jsii.String("cicd/jobs/*.jenkins"),
			}},
			JenkinsApiSettings: &jenkinsio.JenkinsSpecJenkinsApiSettings{
				AuthorizationStrategy: jsii.String("foo"),
			},
			Master: &jenkinsio.JenkinsSpecMaster{
				DisableCsrfProtection: jsii.Bool(false),
			},
		},
	})

	mattermostcom.NewClusterInstallation(chart, jsii.String("foo"), &mattermostcom.ClusterInstallationProps{
		Spec: &mattermostcom.ClusterInstallationSpec{
			IngressName: jsii.String("example.mattermost-example.dev"),
			Replicas:    jsii.Number(2),
			Minio: &mattermostcom.ClusterInstallationSpecMinio{
				StorageSize: jsii.String("10Gi"),
				Replicas:    jsii.Number(4),
			},
			Database: &mattermostcom.ClusterInstallationSpecDatabase{
				StorageSize: jsii.String("10Gi"),
				Replicas:    jsii.Number(4),
			},
			UseServiceLoadBalancer: jsii.Bool(true),
			ServiceAnnotations: &map[string]*string{
				"service.beta.kubernetes.io/aws-load-balancer-backend-protocol": jsii.String("tcp"),
				"service.beta.kubernetes.io/aws-load-balancer-ssl-cert":         jsii.String("arn:aws:acm:us-east-1:xxxx:certificate/xxxxx-xxx-xxx-xxx-xxxxx"),
				"service.beta.kubernetes.io/aws-load-balancer-ssl-ports":        jsii.String("https"),
			},
			MattermostLicenseSecret: jsii.String("mattermost-license"),
		},
	})

	return chart
}

func main() {
	app := cdk8s.NewApp(nil)
	NewMyChart(app, "crd-go", nil)
	app.Synth()
}
