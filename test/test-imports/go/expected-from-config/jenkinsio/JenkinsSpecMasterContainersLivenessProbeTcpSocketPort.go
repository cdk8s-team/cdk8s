package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Number or name of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLivenessProbeTcpSocketPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLivenessProbeTcpSocketPort
type jsiiProxy_JenkinsSpecMasterContainersLivenessProbeTcpSocketPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLivenessProbeTcpSocketPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromNumber(value *float64) JenkinsSpecMasterContainersLivenessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromString(value *string) JenkinsSpecMasterContainersLivenessProbeTcpSocketPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLivenessProbeTcpSocketPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLivenessProbeTcpSocketPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLivenessProbeTcpSocketPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

