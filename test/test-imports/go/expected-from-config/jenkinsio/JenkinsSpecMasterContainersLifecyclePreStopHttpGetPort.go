package jenkinsio

import (
	_init_ "example.com/test/imports/jenkinsio/jsii"
	_jsii_ "github.com/aws/jsii-runtime-go/runtime"
)

// Name or number of the port to access on the container.
//
// Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
type JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort interface {
	Value() interface{}
}

// The jsii proxy struct for JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort
type jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort struct {
	_ byte // padding
}

func (j *jsiiProxy_JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort) Value() interface{} {
	var returns interface{}
	_jsii_.Get(
		j,
		"value",
		&returns,
	)
	return returns
}


func JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromNumber(value *float64) JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromNumberParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
		"fromNumber",
		[]interface{}{value},
		&returns,
	)

	return returns
}

func JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromString(value *string) JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort {
	_init_.Initialize()

	if err := validateJenkinsSpecMasterContainersLifecyclePreStopHttpGetPort_FromStringParameters(value); err != nil {
		panic(err)
	}
	var returns JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort

	_jsii_.StaticInvoke(
		"jenkinsio.JenkinsSpecMasterContainersLifecyclePreStopHttpGetPort",
		"fromString",
		[]interface{}{value},
		&returns,
	)

	return returns
}

