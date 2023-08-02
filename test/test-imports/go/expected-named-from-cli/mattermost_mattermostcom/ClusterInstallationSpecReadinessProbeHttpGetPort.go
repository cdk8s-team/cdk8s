package mattermost_mattermostcom

import (
	_init_ "example.com/test/imports/mattermost_mattermostcom/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecReadinessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecReadinessProbeHttpGetPort
type jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecReadinessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecReadinessProbeHttpGetPort_FromNumber(value *float64) ClusterInstallationSpecReadinessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecReadinessProbeHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecReadinessProbeHttpGetPort_FromString(value *string) ClusterInstallationSpecReadinessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecReadinessProbeHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecReadinessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

