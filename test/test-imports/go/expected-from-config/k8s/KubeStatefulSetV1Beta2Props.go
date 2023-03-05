// k8s
package k8s


// DEPRECATED - This group version of StatefulSet is deprecated by apps/v1/StatefulSet.
//
// See the release notes for more information. StatefulSet represents a set of pods with consistent identities. Identities are defined as:
// - Network: A single stable DNS and hostname.
// - Storage: As many VolumeClaims as requested.
// The StatefulSet guarantees that a given network identity will always map to the same storage identity.
type KubeStatefulSetV1Beta2Props struct {
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
	// Spec defines the desired identities of pods in this set.
	Spec *StatefulSetSpecV1Beta2 `field:"optional" json:"spec" yaml:"spec"`
}

