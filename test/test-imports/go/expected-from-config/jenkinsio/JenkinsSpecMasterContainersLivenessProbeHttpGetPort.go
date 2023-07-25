package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLivenessProbeHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLivenessProbeHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLivenessProbeHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLivenessProbeHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLivenessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLivenessProbeHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLivenessProbeHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLivenessProbeHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

