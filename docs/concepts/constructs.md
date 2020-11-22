# Constructs

Constructs are the basic building block of **CDK8s**. They are the instrument
that enables composition and creation of higher-level abstractions through
normal object-oriented classes.

If you come from the Kubernetes world, you can think of constructs as
programmatically defined Helm Charts. The nice thing about constructs being
"programmatically defined" is that we can use them to leverage the full power of
object-oriented programming. For example:

* You can express the abstraction's API using strong-typed data types
* You can express rich interactions with methods and properties
* You can create polymorphic programming models through interfaces and base
  classes
* Share them through regular package managers
* Test them using our familiar testing tools and techniques
* Version them
* ...and do all that stuff that we've been doing with software in the past 20
  years.
