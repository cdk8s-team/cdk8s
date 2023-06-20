package k8s


// LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits.
//
// It addresses two issues:
// * How are requests for this priority level limited?
// * What should be done with requests that exceed the limit?
type LimitedPriorityLevelConfigurationV1Alpha1 struct {
	// `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.
	//
	// ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
	//
	// ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
	//
	// bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
	AssuredConcurrencyShares *float64 `field:"optional" json:"assuredConcurrencyShares" yaml:"assuredConcurrencyShares"`
	// `limitResponse` indicates what to do with requests that can not be executed right now.
	LimitResponse *LimitResponseV1Alpha1 `field:"optional" json:"limitResponse" yaml:"limitResponse"`
}

