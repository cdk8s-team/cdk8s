// mattermost_mattermostcom
package mattermost_mattermostcom

import (
	_init_ "example.com/test/imports/mattermost_mattermostcom/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type ClusterInstallationSpecLivenessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for ClusterInstallationSpecLivenessProbeTcpSocketPort
type jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_ClusterInstallationSpecLivenessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func ClusterInstallationSpecLivenessProbeTcpSocketPort_FromNumber(value *float64) ClusterInstallationSpecLivenessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecLivenessProbeTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func ClusterInstallationSpecLivenessProbeTcpSocketPort_FromString(value *string) ClusterInstallationSpecLivenessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateClusterInstallationSpecLivenessProbeTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns ClusterInstallationSpecLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"mattermost_mattermostcom.ClusterInstallationSpecLivenessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

