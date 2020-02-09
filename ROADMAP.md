# Roadmap

This is very preliminary work. There is a lot more to do:

Non-exhaustive, unordered, list:

- [ ] [Constructs as Operators](docs/construct-operator.md)
- [ ] Generate Jsii-compatible interfaces from api spec
- [ ] Generate L1 construct classes for entire surface
- [ ] References and dependnecies between resources and charts. Is this
  something that people need in k8s? Who will deployment work then?
- [ ] Support helm charts
- [ ] Consider if we really need L2s here
- [ ] AWS CDK interoperability: “kubectl apply” in CFN custom resource
- [ ] Real world pure example and example that uses AWS resources
- [ ] synth/deploy CLI (apply.sh)
- [ ] Resource removal
- [ ] Is `Stack` a good name?
- [ ] k8scdk or cdkk8s?
- [ ] Build in jsii
- [ ] Docker/ECR asset support with AWS CDK
- [ ] Setup CI
- [ ] Contribution Guide
- [ ] awslint-thing if we do L2
- [ ] Support resources that depend on things like Tiller, istio
