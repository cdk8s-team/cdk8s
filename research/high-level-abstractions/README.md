# High-Level Abstractions

One of the major benefits of *cdk8s*, is the ability to create high level abstractions ontop of the basic Kubernetes building blocks. 
These abstractions, which we refer to as `L2` (Layer 2) constructs, are meant to simplify the interaction with kubernetes resources, and more accurately represent the mental model of the developer (author).

Among others, their capabitilities should include:

- Provide sane defaults.
- Auto create and wire dependent resources.
- Expose type-safe semantic API's the convey *intent*, rather than data.

The process of hand-crafting these abstractions requires thourough research of use-cases and common patterns that emerge when authoring kubernetes applications.

At a certain point, when we've collected enough such use-cases, we will start consolidating it and build 
the first versions of these `L2` constructs.

## Curation

We structure and curate the research by focusing on **use-cases**:

- Every sub-directory represents a different use-case.
- Every use-case should, **at least**, include a `REAMDE` file that describes 
  the motivation behind the suggestion.

  > If the use-case was inspired by external material (i.e docs, blog post, examples), the README should include a reference to that material.
- Aside from the `README`, the structure of the use-case directory is free form. It can range from proposing theoretical API's without any implementation, to a full blown *cdk8s* application that can synthesized and deployed.

For example: [ConfigMap as Pod volumes](./config-map-volume-in-pod)

## Contribution

Kubernetes has such a rich domain, and so many different configuration options, that come along with a lot of complexity for manifest authors. We feel that the best way to create these abstractions, is to engage with the community so that we understand the needs and the pain points. 

*Simply put, we need you!*

Here are some general guidelines:

- Try focusing on specific use-cases, rather than a general design for the construct.

- Put yourself in the shoes of manifest authors, how can we make their lifes easier?

- While it makes since to draw inspiration from API's suggested in existing use-cases, its important you have full creative freedom, so don't feel you have to be aligned with them.

Contributing to `L2` research essentially means one of:

### 1) Propose new use-cases

If you have a new use-case in mind, create a new directory and give it a concise name that describes the use-case. Make sure to include a `README` file as mentioned earlier.

### 3) Suggest an alternate

Sometimes you may have a different suggestion for an existing API. In such a case, **append** your suggestion to the existing one, don't replace it. Remember that this is research, so we are still not in the decision making phase, we just want all possible alternatives in front of us.

> Its possible that as part of the review process, we will decide to actually replace, but lets leave that for a discussion, as we assume that more often than not, we will choose to append.

### 2) Extend existing use-cases

You might also have a suggestion to extend the API of an existing use-case, feel free do so, but remember to try and focus on the use-case in question.