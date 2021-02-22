# API Reference

**Classes**

Name|Description
----|-----------
[ApiObject](#cdk8s-apiobject)|*No description*
[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)|Object metadata.
[App](#cdk8s-app)|Represents a cdk8s application.
[Chart](#cdk8s-chart)|*No description*
[DependencyGraph](#cdk8s-dependencygraph)|Represents the dependency graph for a given Node.
[DependencyVertex](#cdk8s-dependencyvertex)|Represents a vertex in the graph.
[Duration](#cdk8s-duration)|Represents a length of time.
[Helm](#cdk8s-helm)|Represents a Helm deployment.
[Include](#cdk8s-include)|Reads a YAML manifest from a file or a URL and defines all resources as API objects within the defined scope.
[JsonPatch](#cdk8s-jsonpatch)|Utility for applying RFC-6902 JSON-Patch to a document.
[Lazy](#cdk8s-lazy)|*No description*
[Names](#cdk8s-names)|Utilities for generating unique and stable names.
[Size](#cdk8s-size)|Represents the amount of digital storage.
[Testing](#cdk8s-testing)|Testing utilities for cdk8s applications.
[Yaml](#cdk8s-yaml)|YAML utilities.


**Structs**

Name|Description
----|-----------
[ApiObjectMetadata](#cdk8s-apiobjectmetadata)|Metadata associated with this object.
[ApiObjectProps](#cdk8s-apiobjectprops)|Options for defining API objects.
[AppProps](#cdk8s-appprops)|*No description*
[ChartProps](#cdk8s-chartprops)|*No description*
[GroupVersionKind](#cdk8s-groupversionkind)|*No description*
[HelmProps](#cdk8s-helmprops)|Options for `Helm`.
[IncludeProps](#cdk8s-includeprops)|*No description*
[NameOptions](#cdk8s-nameoptions)|Options for name generation.
[SizeConversionOptions](#cdk8s-sizeconversionoptions)|Options for how to convert time to a different unit.
[TimeConversionOptions](#cdk8s-timeconversionoptions)|Options for how to convert time to a different unit.


**Interfaces**

Name|Description
----|-----------
[IAnyProducer](#cdk8s-ianyproducer)|*No description*


**Enums**

Name|Description
----|-----------
[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)|Rounding behaviour when converting between units of `Size`.



## class ApiObject 🔹 <a id="cdk8s-apiobject"></a>



__Implements__: [IConstruct](#constructs-iconstruct)
__Extends__: [Construct](#constructs-construct)

### Initializer


Defines an API object.

```ts
new ApiObject(scope: Construct, id: string, props: ApiObjectProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  the construct scope.
* **id** (<code>string</code>)  namespace.
* **props** (<code>[ApiObjectProps](#cdk8s-apiobjectprops)</code>)  options.
  * **apiVersion** (<code>string</code>)  API version. 
  * **kind** (<code>string</code>)  Resource kind. 
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Object metadata. __*Optional*__



### Properties


Name | Type | Description 
-----|------|-------------
**apiGroup**🔹 | <code>string</code> | The group portion of the API version (e.g. `authorization.k8s.io`).
**apiVersion**🔹 | <code>string</code> | The object's API version (e.g. `authorization.k8s.io/v1`).
**chart**🔹 | <code>[Chart](#cdk8s-chart)</code> | The chart in which this object is defined.
**kind**🔹 | <code>string</code> | The object kind.
**metadata**🔹 | <code>[ApiObjectMetadataDefinition](#cdk8s-apiobjectmetadatadefinition)</code> | Metadata associated with this API object.
**name**🔹 | <code>string</code> | The name of the API object.

### Methods


#### addDependency(...dependencies)🔹 <a id="cdk8s-apiobject-adddependency"></a>

Create a dependency between this ApiObject and other constructs.

These can be other ApiObjects, Charts, or custom.

```ts
addDependency(...dependencies: IConstruct[]): void
```

* **dependencies** (<code>[IConstruct](#constructs-iconstruct)</code>)  the dependencies to add.




#### addJsonPatch(...ops)🔹 <a id="cdk8s-apiobject-addjsonpatch"></a>

Applies a set of RFC-6902 JSON-Patch operations to the manifest synthesized for this API object.

```ts
addJsonPatch(...ops: JsonPatch[]): void
```

* **ops** (<code>[JsonPatch](#cdk8s-jsonpatch)</code>)  The JSON-Patch operations to apply.




#### toJson()🔹 <a id="cdk8s-apiobject-tojson"></a>

Renders the object to Kubernetes JSON.

To disable sorting of dictionary keys in output object set the
`CDK8S_DISABLE_SORT` environment variable to any non-empty value.

```ts
toJson(): any
```


__Returns__:
* <code>any</code>

#### *static* of(c)🔹 <a id="cdk8s-apiobject-of"></a>

Returns the `ApiObject` named `Resource` which is a child of the given construct.

If `c` is an `ApiObject`, it is returned directly. Throws an
exception if the construct does not have a child named `Default` _or_ if
this child is not an `ApiObject`.

```ts
static of(c: IConstruct): ApiObject
```

* **c** (<code>[IConstruct](#constructs-iconstruct)</code>)  The higher-level construct.

__Returns__:
* <code>[ApiObject](#cdk8s-apiobject)</code>



## class ApiObjectMetadataDefinition 🔹 <a id="cdk8s-apiobjectmetadatadefinition"></a>

Object metadata.


### Initializer




```ts
new ApiObjectMetadataDefinition(options?: ApiObjectMetadata)
```

* **options** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  *No description*
  * **annotations** (<code>Map<string, string></code>)  Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. __*Default*__: No annotations.
  * **labels** (<code>Map<string, string></code>)  Map of string keys and values that can be used to organize and categorize (scope and select) objects. __*Default*__: No labels.
  * **name** (<code>string</code>)  The unique, namespace-global, name of this object inside the Kubernetes cluster. __*Default*__: an app-unique name generated by the chart
  * **namespace** (<code>string</code>)  Namespace defines the space within each name must be unique. __*Default*__: undefined (will be assigned to the 'default' namespace)



### Properties


Name | Type | Description 
-----|------|-------------
**name**?🔹 | <code>string</code> | The name of the API object.<br/>__*Optional*__
**namespace**?🔹 | <code>string</code> | The object's namespace.<br/>__*Optional*__

### Methods


#### add(key, value)🔹 <a id="cdk8s-apiobjectmetadatadefinition-add"></a>

Adds an arbitrary key/value to the object metadata.

```ts
add(key: string, value: any): void
```

* **key** (<code>string</code>)  Metadata key.
* **value** (<code>any</code>)  Metadata value.




#### addAnnotation(key, value)🔹 <a id="cdk8s-apiobjectmetadatadefinition-addannotation"></a>

Add an annotation.

```ts
addAnnotation(key: string, value: string): void
```

* **key** (<code>string</code>)  - The key.
* **value** (<code>string</code>)  - The value.




#### addLabel(key, value)🔹 <a id="cdk8s-apiobjectmetadatadefinition-addlabel"></a>

Add a label.

```ts
addLabel(key: string, value: string): void
```

* **key** (<code>string</code>)  - The key.
* **value** (<code>string</code>)  - The value.




#### getLabel(key)🔹 <a id="cdk8s-apiobjectmetadatadefinition-getlabel"></a>



```ts
getLabel(key: string): string
```

* **key** (<code>string</code>)  the label.

__Returns__:
* <code>string</code>

#### toJson()🔹 <a id="cdk8s-apiobjectmetadatadefinition-tojson"></a>

Synthesizes a k8s ObjectMeta for this metadata set.

```ts
toJson(): any
```


__Returns__:
* <code>any</code>



## class App 🔹 <a id="cdk8s-app"></a>

Represents a cdk8s application.

__Implements__: [IConstruct](#constructs-iconstruct)
__Extends__: [Construct](#constructs-construct)

### Initializer


Defines an app.

```ts
new App(props?: AppProps)
```

* **props** (<code>[AppProps](#cdk8s-appprops)</code>)  configuration options.
  * **outdir** (<code>string</code>)  The directory to output Kubernetes manifests. __*Default*__: CDK8S_OUTDIR if defined, otherwise "dist"



### Properties


Name | Type | Description 
-----|------|-------------
**outdir**🔹 | <code>string</code> | The output directory into which manifests will be synthesized.

### Methods


#### synth()🔹 <a id="cdk8s-app-synth"></a>

Synthesizes all manifests to the output directory.

```ts
synth(): void
```







## class Chart 🔹 <a id="cdk8s-chart"></a>



__Implements__: [IConstruct](#constructs-iconstruct)
__Extends__: [Construct](#constructs-construct)

### Initializer




```ts
new Chart(scope: Construct, id: string, props?: ChartProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[ChartProps](#cdk8s-chartprops)</code>)  *No description*
  * **labels** (<code>Map<string, string></code>)  Labels to apply to all resources in this chart. __*Default*__: no common labels
  * **namespace** (<code>string</code>)  The default namespace for all objects defined in this chart (directly or indirectly). __*Default*__: no namespace is synthesized (usually this implies "default")



### Properties


Name | Type | Description 
-----|------|-------------
**labels**🔹 | <code>Map<string, string></code> | Labels applied to all resources in this chart.
**namespace**?🔹 | <code>string</code> | The default namespace for all objects in this chart.<br/>__*Optional*__

### Methods


#### addDependency(...dependencies)🔹 <a id="cdk8s-chart-adddependency"></a>

Create a dependency between this Chart and other constructs.

These can be other ApiObjects, Charts, or custom.

```ts
addDependency(...dependencies: IConstruct[]): void
```

* **dependencies** (<code>[IConstruct](#constructs-iconstruct)</code>)  the dependencies to add.




#### generateObjectName(apiObject)🔹 <a id="cdk8s-chart-generateobjectname"></a>

Generates a app-unique name for an object given it's construct node path.

Different resource types may have different constraints on names
(`metadata.name`). The previous version of the name generator was
compatible with DNS_SUBDOMAIN but not with DNS_LABEL.

For example, `Deployment` names must comply with DNS_SUBDOMAIN while
`Service` names must comply with DNS_LABEL.

Since there is no formal specification for this, the default name
generation scheme for kubernetes objects in cdk8s was changed to DNS_LABEL,
since it’s the common denominator for all kubernetes resources
(supposedly).

You can override this method if you wish to customize object names at the
chart level.

```ts
generateObjectName(apiObject: ApiObject): string
```

* **apiObject** (<code>[ApiObject](#cdk8s-apiobject)</code>)  The API object to generate a name for.

__Returns__:
* <code>string</code>

#### toJson()🔹 <a id="cdk8s-chart-tojson"></a>

Renders this chart to a set of Kubernetes JSON resources.

```ts
toJson(): Array<any>
```


__Returns__:
* <code>Array<any></code>

#### *static* of(c)🔹 <a id="cdk8s-chart-of"></a>

Finds the chart in which a node is defined.

```ts
static of(c: IConstruct): Chart
```

* **c** (<code>[IConstruct](#constructs-iconstruct)</code>)  a construct node.

__Returns__:
* <code>[Chart](#cdk8s-chart)</code>



## class DependencyGraph 🔹 <a id="cdk8s-dependencygraph"></a>

Represents the dependency graph for a given Node.

This graph includes the dependency relationships between all nodes in the
node (construct) sub-tree who's root is this Node.

Note that this means that lonely nodes (no dependencies and no dependants) are also included in this graph as
childless children of the root node of the graph.

The graph does not include cross-scope dependencies. That is, if a child on the current scope depends on a node
from a different scope, that relationship is not represented in this graph.


### Initializer




```ts
new DependencyGraph(node: Node)
```

* **node** (<code>[Node](#constructs-node)</code>)  *No description*



### Properties


Name | Type | Description 
-----|------|-------------
**root**🔹 | <code>[DependencyVertex](#cdk8s-dependencyvertex)</code> | Returns the root of the graph.

### Methods


#### topology()🔹 <a id="cdk8s-dependencygraph-topology"></a>



```ts
topology(): Array<IConstruct>
```


__Returns__:
* <code>Array<[IConstruct](#constructs-iconstruct)></code>



## class DependencyVertex 🔹 <a id="cdk8s-dependencyvertex"></a>

Represents a vertex in the graph.

The value of each vertex is an `IConstruct` that is accessible via the `.value` getter.


### Initializer




```ts
new DependencyVertex(value?: IConstruct)
```

* **value** (<code>[IConstruct](#constructs-iconstruct)</code>)  *No description*



### Properties


Name | Type | Description 
-----|------|-------------
**inbound**🔹 | <code>Array<[DependencyVertex](#cdk8s-dependencyvertex)></code> | Returns the parents of the vertex (i.e dependants).
**outbound**🔹 | <code>Array<[DependencyVertex](#cdk8s-dependencyvertex)></code> | Returns the children of the vertex (i.e dependencies).
**value**?🔹 | <code>[IConstruct](#constructs-iconstruct)</code> | Returns the IConstruct this graph vertex represents.<br/>__*Optional*__

### Methods


#### addChild(dep)🔹 <a id="cdk8s-dependencyvertex-addchild"></a>

Adds a vertex as a dependency of the current node.

Also updates the parents of `dep`, so that it contains this node as a parent.

This operation will fail in case it creates a cycle in the graph.

```ts
addChild(dep: DependencyVertex): void
```

* **dep** (<code>[DependencyVertex](#cdk8s-dependencyvertex)</code>)  The dependency.




#### topology()🔹 <a id="cdk8s-dependencyvertex-topology"></a>

Returns a topologically sorted array of the constructs in the sub-graph.

```ts
topology(): Array<IConstruct>
```


__Returns__:
* <code>Array<[IConstruct](#constructs-iconstruct)></code>



## class Duration 🔹 <a id="cdk8s-duration"></a>

Represents a length of time.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative.


### Methods


#### toDays(opts?)🔹 <a id="cdk8s-duration-todays"></a>

Return the total number of days in this Duration.

```ts
toDays(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toHours(opts?)🔹 <a id="cdk8s-duration-tohours"></a>

Return the total number of hours in this Duration.

```ts
toHours(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toHumanString()🔹 <a id="cdk8s-duration-tohumanstring"></a>

Turn this duration into a human-readable string.

```ts
toHumanString(): string
```


__Returns__:
* <code>string</code>

#### toIsoString()🔹 <a id="cdk8s-duration-toisostring"></a>

Return an ISO 8601 representation of this period.

```ts
toIsoString(): string
```


__Returns__:
* <code>string</code>

#### toMilliseconds(opts?)🔹 <a id="cdk8s-duration-tomilliseconds"></a>

Return the total number of milliseconds in this Duration.

```ts
toMilliseconds(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toMinutes(opts?)🔹 <a id="cdk8s-duration-tominutes"></a>

Return the total number of minutes in this Duration.

```ts
toMinutes(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### toSeconds(opts?)🔹 <a id="cdk8s-duration-toseconds"></a>

Return the total number of seconds in this Duration.

```ts
toSeconds(opts?: TimeConversionOptions): number
```

* **opts** (<code>[TimeConversionOptions](#cdk8s-timeconversionoptions)</code>)  *No description*
  * **integral** (<code>boolean</code>)  If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer. __*Default*__: true

__Returns__:
* <code>number</code>

#### *static* days(amount)🔹 <a id="cdk8s-duration-days"></a>

Create a Duration representing an amount of days.

```ts
static days(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Days the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>

#### *static* hours(amount)🔹 <a id="cdk8s-duration-hours"></a>

Create a Duration representing an amount of hours.

```ts
static hours(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Hours the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>

#### *static* millis(amount)🔹 <a id="cdk8s-duration-millis"></a>

Create a Duration representing an amount of milliseconds.

```ts
static millis(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Milliseconds the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>

#### *static* minutes(amount)🔹 <a id="cdk8s-duration-minutes"></a>

Create a Duration representing an amount of minutes.

```ts
static minutes(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Minutes the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>

#### *static* parse(duration)🔹 <a id="cdk8s-duration-parse"></a>

Parse a period formatted according to the ISO 8601 standard.

```ts
static parse(duration: string): Duration
```

* **duration** (<code>string</code>)  an ISO-formtted duration to be parsed.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>

#### *static* seconds(amount)🔹 <a id="cdk8s-duration-seconds"></a>

Create a Duration representing an amount of seconds.

```ts
static seconds(amount: number): Duration
```

* **amount** (<code>number</code>)  the amount of Seconds the `Duration` will represent.

__Returns__:
* <code>[Duration](#cdk8s-duration)</code>



## class Helm 🔹 <a id="cdk8s-helm"></a>

Represents a Helm deployment.

Use this construct to import an existing Helm chart and incorporate it into your constructs.

__Implements__: [IConstruct](#constructs-iconstruct)
__Extends__: [Include](#cdk8s-include)

### Initializer




```ts
new Helm(scope: Construct, id: string, props: HelmProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[HelmProps](#cdk8s-helmprops)</code>)  *No description*
  * **chart** (<code>string</code>)  The chart name to use. It can be a chart from a helm repository or a local directory. 
  * **helmExecutable** (<code>string</code>)  The local helm executable to use in order to create the manifest the chart. __*Default*__: "helm"
  * **helmFlags** (<code>Array<string></code>)  Additional flags to add to the `helm` execution. __*Default*__: []
  * **releaseName** (<code>string</code>)  The release name. __*Default*__: if unspecified, a name will be allocated based on the construct path
  * **values** (<code>Map<string, any></code>)  Values to pass to the chart. __*Default*__: If no values are specified, chart will use the defaults.



### Properties


Name | Type | Description 
-----|------|-------------
**releaseName**🔹 | <code>string</code> | The helm release name.



## class Include 🔹 <a id="cdk8s-include"></a>

Reads a YAML manifest from a file or a URL and defines all resources as API objects within the defined scope.

The names (`metadata.name`) of imported resources will be preserved as-is
from the manifest.

__Implements__: [IConstruct](#constructs-iconstruct)
__Extends__: [Construct](#constructs-construct)

### Initializer




```ts
new Include(scope: Construct, id: string, props: IncludeProps)
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **id** (<code>string</code>)  *No description*
* **props** (<code>[IncludeProps](#cdk8s-includeprops)</code>)  *No description*
  * **url** (<code>string</code>)  Local file path or URL which includes a Kubernetes YAML manifest. 



### Properties


Name | Type | Description 
-----|------|-------------
**apiObjects**🔹 | <code>Array<[ApiObject](#cdk8s-apiobject)></code> | Returns all the included API objects.



## class JsonPatch 🔹 <a id="cdk8s-jsonpatch"></a>

Utility for applying RFC-6902 JSON-Patch to a document.

Use the the `JsonPatch.apply(doc, ...ops)` function to apply a set of
operations to a JSON document and return the result.

Operations can be created using the factory methods `JsonPatch.add()`,
`JsonPatch.remove()`, etc.


### Methods


#### *static* add(path, value)🔹 <a id="cdk8s-jsonpatch-add"></a>

Adds a value to an object or inserts it into an array.

In the case of an
array, the value is inserted before the given index. The - character can be
used instead of an index to insert at the end of an array.

```ts
static add(path: string, value: any): JsonPatch
```

* **path** (<code>string</code>)  *No description*
* **value** (<code>any</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>

#### *static* apply(document, ...ops)🔹 <a id="cdk8s-jsonpatch-apply"></a>

Applies a set of JSON-Patch (RFC-6902) operations to `document` and returns the result.

```ts
static apply(document: any, ...ops: JsonPatch[]): any
```

* **document** (<code>any</code>)  The document to patch.
* **ops** (<code>[JsonPatch](#cdk8s-jsonpatch)</code>)  The operations to apply.

__Returns__:
* <code>any</code>

#### *static* copy(from, path)🔹 <a id="cdk8s-jsonpatch-copy"></a>

Copies a value from one location to another within the JSON document.

Both
from and path are JSON Pointers.

```ts
static copy(from: string, path: string): JsonPatch
```

* **from** (<code>string</code>)  *No description*
* **path** (<code>string</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>

#### *static* move(from, path)🔹 <a id="cdk8s-jsonpatch-move"></a>

Moves a value from one location to the other.

Both from and path are JSON Pointers.

```ts
static move(from: string, path: string): JsonPatch
```

* **from** (<code>string</code>)  *No description*
* **path** (<code>string</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>

#### *static* remove(path)🔹 <a id="cdk8s-jsonpatch-remove"></a>

Removes a value from an object or array.

```ts
static remove(path: string): JsonPatch
```

* **path** (<code>string</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>

#### *static* replace(path, value)🔹 <a id="cdk8s-jsonpatch-replace"></a>

Replaces a value.

Equivalent to a “remove” followed by an “add”.

```ts
static replace(path: string, value: any): JsonPatch
```

* **path** (<code>string</code>)  *No description*
* **value** (<code>any</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>

#### *static* test(path, value)🔹 <a id="cdk8s-jsonpatch-test"></a>

Tests that the specified value is set in the document.

If the test fails,
then the patch as a whole should not apply.

```ts
static test(path: string, value: any): JsonPatch
```

* **path** (<code>string</code>)  *No description*
* **value** (<code>any</code>)  *No description*

__Returns__:
* <code>[JsonPatch](#cdk8s-jsonpatch)</code>



## class Lazy 🔹 <a id="cdk8s-lazy"></a>




### Methods


#### produce()🔹 <a id="cdk8s-lazy-produce"></a>



```ts
produce(): any
```


__Returns__:
* <code>any</code>

#### *static* any(producer)🔹 <a id="cdk8s-lazy-any"></a>



```ts
static any(producer: IAnyProducer): any
```

* **producer** (<code>[IAnyProducer](#cdk8s-ianyproducer)</code>)  *No description*

__Returns__:
* <code>any</code>



## class Names 🔹 <a id="cdk8s-names"></a>

Utilities for generating unique and stable names.


### Methods


#### *static* toDnsLabel(scope, options?)🔹 <a id="cdk8s-names-todnslabel"></a>

Generates a unique and stable name compatible DNS_LABEL from RFC-1123 from a path.

The generated name will:
  - contain at most 63 characters
  - contain only lowercase alphanumeric characters or ‘-’
  - start with an alphanumeric character
  - end with an alphanumeric character

The generated name will have the form:
  <comp0>-<comp1>-..-<compN>-<short-hash>

Where <comp> are the path components (assuming they are is separated by
"/").

Note that if the total length is longer than 63 characters, we will trim
the first components since the last components usually encode more meaning.

```ts
static toDnsLabel(scope: Construct, options?: NameOptions): string
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  The construct for which to render the DNS label.
* **options** (<code>[NameOptions](#cdk8s-nameoptions)</code>)  Name options.
  * **delimiter** (<code>string</code>)  Delimiter to use between components. __*Default*__: "-"
  * **extra** (<code>Array<string></code>)  Extra components to include in the name. __*Default*__: [] use the construct path components
  * **includeHash** (<code>boolean</code>)  Include a short hash as last part of the name. __*Default*__: true
  * **maxLen** (<code>number</code>)  Maximum allowed length for the name. __*Default*__: 63

__Returns__:
* <code>string</code>

#### *static* toLabelValue(scope, options?)🔹 <a id="cdk8s-names-tolabelvalue"></a>

Generates a unique and stable name compatible label key name segment and label value from a path.

The name segment is required and must be 63 characters or less, beginning
and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-),
underscores (_), dots (.), and alphanumerics between.

Valid label values must be 63 characters or less and must be empty or
begin and end with an alphanumeric character ([a-z0-9A-Z]) with dashes
(-), underscores (_), dots (.), and alphanumerics between.

The generated name will have the form:
  <comp0><delim><comp1><delim>..<delim><compN><delim><short-hash>

Where <comp> are the path components (assuming they are is separated by
"/").

Note that if the total length is longer than 63 characters, we will trim
the first components since the last components usually encode more meaning.

```ts
static toLabelValue(scope: Construct, options?: NameOptions): string
```

* **scope** (<code>[Construct](#constructs-construct)</code>)  The construct for which to render the DNS label.
* **options** (<code>[NameOptions](#cdk8s-nameoptions)</code>)  Name options.
  * **delimiter** (<code>string</code>)  Delimiter to use between components. __*Default*__: "-"
  * **extra** (<code>Array<string></code>)  Extra components to include in the name. __*Default*__: [] use the construct path components
  * **includeHash** (<code>boolean</code>)  Include a short hash as last part of the name. __*Default*__: true
  * **maxLen** (<code>number</code>)  Maximum allowed length for the name. __*Default*__: 63

__Returns__:
* <code>string</code>



## class Size 🔹 <a id="cdk8s-size"></a>

Represents the amount of digital storage.

The amount can be specified either as a literal value (e.g: `10`) which
cannot be negative.

When the amount is passed as a token, unit conversion is not possible.


### Methods


#### toGibibytes(opts?)🔹 <a id="cdk8s-size-togibibytes"></a>

Return this storage as a total number of gibibytes.

```ts
toGibibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toKibibytes(opts?)🔹 <a id="cdk8s-size-tokibibytes"></a>

Return this storage as a total number of kibibytes.

```ts
toKibibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toMebibytes(opts?)🔹 <a id="cdk8s-size-tomebibytes"></a>

Return this storage as a total number of mebibytes.

```ts
toMebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toPebibytes(opts?)🔹 <a id="cdk8s-size-topebibytes"></a>

Return this storage as a total number of pebibytes.

```ts
toPebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### toTebibytes(opts?)🔹 <a id="cdk8s-size-totebibytes"></a>

Return this storage as a total number of tebibytes.

```ts
toTebibytes(opts?: SizeConversionOptions): number
```

* **opts** (<code>[SizeConversionOptions](#cdk8s-sizeconversionoptions)</code>)  *No description*
  * **rounding** (<code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code>)  How conversions should behave when it encounters a non-integer result. __*Default*__: SizeRoundingBehavior.FAIL

__Returns__:
* <code>number</code>

#### *static* gibibytes(amount)🔹 <a id="cdk8s-size-gibibytes"></a>

Create a Storage representing an amount gibibytes.

1 GiB = 1024 MiB

```ts
static gibibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-size)</code>

#### *static* kibibytes(amount)🔹 <a id="cdk8s-size-kibibytes"></a>

Create a Storage representing an amount kibibytes.

1 KiB = 1024 bytes

```ts
static kibibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-size)</code>

#### *static* mebibytes(amount)🔹 <a id="cdk8s-size-mebibytes"></a>

Create a Storage representing an amount mebibytes.

1 MiB = 1024 KiB

```ts
static mebibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-size)</code>

#### *static* pebibyte(amount)🔹 <a id="cdk8s-size-pebibyte"></a>

Create a Storage representing an amount pebibytes.

1 PiB = 1024 TiB

```ts
static pebibyte(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-size)</code>

#### *static* tebibytes(amount)🔹 <a id="cdk8s-size-tebibytes"></a>

Create a Storage representing an amount tebibytes.

1 TiB = 1024 GiB

```ts
static tebibytes(amount: number): Size
```

* **amount** (<code>number</code>)  *No description*

__Returns__:
* <code>[Size](#cdk8s-size)</code>



## class Testing 🔹 <a id="cdk8s-testing"></a>

Testing utilities for cdk8s applications.


### Methods


#### *static* app()🔹 <a id="cdk8s-testing-app"></a>

Returns an app for testing with the following properties: - Output directory is a temp dir.

```ts
static app(): App
```


__Returns__:
* <code>[App](#cdk8s-app)</code>

#### *static* chart()🔹 <a id="cdk8s-testing-chart"></a>



```ts
static chart(): Chart
```


__Returns__:
* <code>[Chart](#cdk8s-chart)</code>

#### *static* synth(chart)🔹 <a id="cdk8s-testing-synth"></a>

Returns the Kubernetes manifest synthesized from this chart.

```ts
static synth(chart: Chart): Array<any>
```

* **chart** (<code>[Chart](#cdk8s-chart)</code>)  *No description*

__Returns__:
* <code>Array<any></code>



## class Yaml 🔹 <a id="cdk8s-yaml"></a>

YAML utilities.


### Methods


#### *static* load(urlOrFile)🔹 <a id="cdk8s-yaml-load"></a>

Downloads a set of YAML documents (k8s manifest for example) from a URL or a file and returns them as javascript objects.

Empty documents are filtered out.

```ts
static load(urlOrFile: string): Array<any>
```

* **urlOrFile** (<code>string</code>)  a URL of a file path to load from.

__Returns__:
* <code>Array<any></code>

#### *static* save(filePath, docs)🔹 <a id="cdk8s-yaml-save"></a>

Saves a set of objects as a multi-document YAML file.

```ts
static save(filePath: string, docs: Array<any>): void
```

* **filePath** (<code>string</code>)  The output path.
* **docs** (<code>Array<any></code>)  The set of objects.




#### *static* tmp(docs)🔹 <a id="cdk8s-yaml-tmp"></a>

Saves a set of YAML documents into a temp file (in /tmp).

```ts
static tmp(docs: Array<any>): string
```

* **docs** (<code>Array<any></code>)  the set of documents to save.

__Returns__:
* <code>string</code>



## struct ApiObjectMetadata 🔹 <a id="cdk8s-apiobjectmetadata"></a>


Metadata associated with this object.



Name | Type | Description 
-----|------|-------------
**annotations**?🔹 | <code>Map<string, string></code> | Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.<br/>__*Default*__: No annotations.
**labels**?🔹 | <code>Map<string, string></code> | Map of string keys and values that can be used to organize and categorize (scope and select) objects.<br/>__*Default*__: No labels.
**name**?🔹 | <code>string</code> | The unique, namespace-global, name of this object inside the Kubernetes cluster.<br/>__*Default*__: an app-unique name generated by the chart
**namespace**?🔹 | <code>string</code> | Namespace defines the space within each name must be unique.<br/>__*Default*__: undefined (will be assigned to the 'default' namespace)



## struct ApiObjectProps 🔹 <a id="cdk8s-apiobjectprops"></a>


Options for defining API objects.



Name | Type | Description 
-----|------|-------------
**apiVersion**🔹 | <code>string</code> | API version.
**kind**🔹 | <code>string</code> | Resource kind.
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Object metadata.<br/>__*Optional*__



## struct AppProps 🔹 <a id="cdk8s-appprops"></a>






Name | Type | Description 
-----|------|-------------
**outdir**?🔹 | <code>string</code> | The directory to output Kubernetes manifests.<br/>__*Default*__: CDK8S_OUTDIR if defined, otherwise "dist"



## struct ChartProps 🔹 <a id="cdk8s-chartprops"></a>






Name | Type | Description 
-----|------|-------------
**labels**?🔹 | <code>Map<string, string></code> | Labels to apply to all resources in this chart.<br/>__*Default*__: no common labels
**namespace**?🔹 | <code>string</code> | The default namespace for all objects defined in this chart (directly or indirectly).<br/>__*Default*__: no namespace is synthesized (usually this implies "default")



## struct GroupVersionKind 🔹 <a id="cdk8s-groupversionkind"></a>






Name | Type | Description 
-----|------|-------------
**apiVersion**🔹 | <code>string</code> | The object's API version (e.g. `authorization.k8s.io/v1`).
**kind**🔹 | <code>string</code> | The object kind.



## struct HelmProps 🔹 <a id="cdk8s-helmprops"></a>


Options for `Helm`.



Name | Type | Description 
-----|------|-------------
**chart**🔹 | <code>string</code> | The chart name to use. It can be a chart from a helm repository or a local directory.
**helmExecutable**?🔹 | <code>string</code> | The local helm executable to use in order to create the manifest the chart.<br/>__*Default*__: "helm"
**helmFlags**?🔹 | <code>Array<string></code> | Additional flags to add to the `helm` execution.<br/>__*Default*__: []
**releaseName**?🔹 | <code>string</code> | The release name.<br/>__*Default*__: if unspecified, a name will be allocated based on the construct path
**values**?🔹 | <code>Map<string, any></code> | Values to pass to the chart.<br/>__*Default*__: If no values are specified, chart will use the defaults.



## interface IAnyProducer 🔹 <a id="cdk8s-ianyproducer"></a>



### Methods


#### produce()🔹 <a id="cdk8s-ianyproducer-produce"></a>



```ts
produce(): any
```


__Returns__:
* <code>any</code>



## struct IncludeProps 🔹 <a id="cdk8s-includeprops"></a>






Name | Type | Description 
-----|------|-------------
**url**🔹 | <code>string</code> | Local file path or URL which includes a Kubernetes YAML manifest.



## struct NameOptions 🔹 <a id="cdk8s-nameoptions"></a>


Options for name generation.



Name | Type | Description 
-----|------|-------------
**delimiter**?🔹 | <code>string</code> | Delimiter to use between components.<br/>__*Default*__: "-"
**extra**?🔹 | <code>Array<string></code> | Extra components to include in the name.<br/>__*Default*__: [] use the construct path components
**includeHash**?🔹 | <code>boolean</code> | Include a short hash as last part of the name.<br/>__*Default*__: true
**maxLen**?🔹 | <code>number</code> | Maximum allowed length for the name.<br/>__*Default*__: 63



## struct SizeConversionOptions 🔹 <a id="cdk8s-sizeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**rounding**?🔹 | <code>[SizeRoundingBehavior](#cdk8s-sizeroundingbehavior)</code> | How conversions should behave when it encounters a non-integer result.<br/>__*Default*__: SizeRoundingBehavior.FAIL



## struct TimeConversionOptions 🔹 <a id="cdk8s-timeconversionoptions"></a>


Options for how to convert time to a different unit.



Name | Type | Description 
-----|------|-------------
**integral**?🔹 | <code>boolean</code> | If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the result is not an integer.<br/>__*Default*__: true



## enum SizeRoundingBehavior 🔹 <a id="cdk8s-sizeroundingbehavior"></a>

Rounding behaviour when converting between units of `Size`.

Name | Description
-----|-----
**FAIL** 🔹|Fail the conversion if the result is not an integer.
**FLOOR** 🔹|If the result is not an integer, round it to the closest integer less than the result.
**NONE** 🔹|Don't round.


