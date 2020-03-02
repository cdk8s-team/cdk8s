---
name: RFC
about: Proposes and details a change or addition to cdk8s
title: "[RFC] describe your RFC"
labels: enhancement
assignees: ''

---

### Instructions:
Full info on the RFC process can be found in the [contribution guide](https://github.com/awslabs/cdk8s/blob/master/CONTRIBUTING.md).

1. This is the tracking issue for your RFC.
   - Title should represent the title of the RFC.
   - Description should provide the motivation for the RFC.
2. Create a markdown file based off of
   [rfc/0000-template.md](rfc/0000-template.md) under the
   `rfc/<nnnn>-<title-of-rfc>` where `<nnnn>` is the tracking issue number and
   `<title-of-rfc>` is a symbolic name for the title. For example:
   `rfc/0030-construct-operators.md`.
3. File a pull request with this markdown file. The title of the PR should
   indicate `rfc: <nnnn> <same as issue title>`.
4. The RFC will be reviewed as a pull request and once merged it means it is
   ready for implementation.

### Description
_RFC description here_

### Links
* link one
* link two
