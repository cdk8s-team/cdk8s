// k8s
package k8s


// Describes a certificate signing request.
type KubeCertificateSigningRequestV1Beta1Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// The certificate request itself and any additional information.
	Spec *CertificateSigningRequestSpecV1Beta1 `field:"optional" json:"spec" yaml:"spec"`
}

