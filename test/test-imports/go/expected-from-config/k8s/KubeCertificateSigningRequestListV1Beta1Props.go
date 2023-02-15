// k8s
package k8s


type KubeCertificateSigningRequestListV1Beta1Props struct {
	Items *[]*KubeCertificateSigningRequestV1Beta1Props `field:"required" json:"items" yaml:"items"`
	Metadata *ListMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

