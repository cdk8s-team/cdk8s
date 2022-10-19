// jenkinsio
package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersReadinessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersReadinessProbeHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersReadinessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersReadinessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersReadinessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersReadinessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersReadinessProbeHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersReadinessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersReadinessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

