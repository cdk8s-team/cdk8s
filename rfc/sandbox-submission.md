This is a working document to outline responses to request for CNCF sandbox submission.

### links
* [issue](/issues/#280)
* [process](https://github.com/cncf/toc/blob/master/process/project_proposals.adoc#sandbox-process)
* [form](https://docs.google.com/forms/d/1bJhG1MuM981uQXcnBMv4Mj9yfV5_q5Kwk3qhBCLa_5A/viewform?edit_requested=true)

### responses
1. **Email address**

...

2. **Project Name**
Cloud Development Kit for Kubernetes (cdk8s)

3. **Project Description**
The Cloud Development Kit for Kubernetes (cdk8s) is a software development framework for defining Kubernetes applications and reusable abstractions using familiar programming languages and rich object-oriented APIs. cdk8s generates pure Kubernetes YAML - you can use cdk8s to define applications for any Kubernetes cluster running anywhere.

4. **Code repository (URL)**
https://github.com/awslabs/cdk8s

5. **website (URL)**
cdk8s.io

6. **project roadmap**
https://github.com/awslabs/cdk8s/projects/1

7. **code of conduct**
https://github.com/awslabs/cdk8s/blob/master/CODE_OF_CONDUCT.md

...

10. **Please explain how your project is aligned with the cloud native computing ecosystem**
Traditionally, Kubernetes applications are defined with human-readable, static YAML data files which developers write and maintain. Building new applications requires writing a good amount of boilerplate config, copying code from other projects, and applying manual tweaks and customizations. As applications evolve and teams grow, these YAML files become harder to manage. Sharing best practices or making updates involves manual changes and complex migrations.

YAML is an excellent format for describing the desired state of your cluster, but it is does not have primitives for expressing logic and reusable abstractions.

We realized this was exactly the same problem our customers had faced when defining their applications through CloudFormation templates, a problem solved by the AWS Cloud Development Kit (AWS CDK), and that we could apply the same design concepts from the AWS CDK to help all Kubernetes users.

cdk8s lets you import both core Kubernetes API objects and Custom Resources (CRDs) as strongly typed classes called “constructs“. This includes using any Kubernetes API version.

Using cdk8s you can publish common Kubernetes patterns as code libraries, then reference these libraries in any application. This simplifies defining and maintaining applications for all Kubernetes users and builds on top of the Kubernetes declarative API approach while fundamentally respecting its capabilities and flexibility. It also means that you can author Kubernetes applications using the languages, IDEs, tools, and techniques you are familiar with.

cdk8s is environment agnostic and works for with Kubernetes cluster running anywhere, including on-premises and the cloud. We built cdk8s for the entire Kubernetes community, not just AWS customers. This forms the core of our motivation to move cdk8s into the CNCF sanbox.

11. **Please list similar projects in the CNCF or elsewhere**
There are similar projects in the Kubernetes ecosystem (kustomize, jsonnet, jkcfg, kubecfg, kubegen, Pulumi, etc.) which attempt to address these gaps in various ways. Pulumi is the most similar project, but has a different focus and implementation to cdk8s.

12. **Guidelines/help for project contributors (URL)**
https://github.com/awslabs/cdk8s/blob/master/CONTRIBUTING.md

13. **Explanation of alignment/overlap with existing CNCF projects (optional)**
Existing CNCF projects (kustomize, jsonnet, jkcfg, etc) are focused on object generation from a set language. They enable a similar workflow to cdk8s, but are not built with the idea of supporting multiple languages as well as being able to support multiple standard APIs and custom APIs (through CRDs). They also do not have the standard assumption of building and vending higher order libraries. cdk8s+ (https://github.com/awslabs/cdk8s/tree/master/packages/cdk8s-plus) is our development effort to provide an out of the box higher order library for K8s objects.

14. **Existing project overview presentation (optional)**
https://www.cncf.io/webinars/end-yaml-engineering-with-cdk8s/
