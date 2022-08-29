// k8s
package k8s


// CSINode holds information about all CSI drivers installed on a node.
//
// CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
type KubeCsiNodeProps struct {
	// spec is the specification of CSINode.
	Spec *CsiNodeSpec `field:"required" json:"spec" yaml:"spec"`
	// metadata.name must be the Kubernetes node name.
	Metadata *ObjectMeta `field:"optional" json:"metadata" yaml:"metadata"`
}

