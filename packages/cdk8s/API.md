# API Reference

**Classes**

Name|Description
----|-----------
[ApiObject](#cdk8s-apiobject)|*No description*
[App](#cdk8s-app)|Represents a cdk8s application.
[Chart](#cdk8s-chart)|*No description*
[Include](#cdk8s-include)|Reads a YAML manifest from a file or a URL and defines all resources as API objects within the defined scope.
[Testing](#cdk8s-testing)|Testing utilities for cdk8s applications.
[Yaml](#cdk8s-yaml)|YAML utilities.


**Structs**

Name|Description
----|-----------
[ApiObjectMetadata](#cdk8s-apiobjectmetadata)|Metadata associated with this object.
[ApiObjectOptions](#cdk8s-apiobjectoptions)|Options for defining API objects.
[AppOptions](#cdk8s-appoptions)|*No description*
[ChartOptions](#cdk8s-chartoptions)|*No description*
[IncludeOptions](#cdk8s-includeoptions)|*No description*



## class ApiObject 🔹 <a id="cdk8s-apiobject"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)

### Initializer


Defines an API object.

<span style="text-decoration: underline">Usage:</span>

```ts
new ApiObject(scope: Construct, ns: string, options: ApiObjectOptions)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  the construct scope.
* **ns** (<code>string</code>)  namespace.
* **options** (<code>[ApiObjectOptions](#cdk8s-apiobjectoptions)</code>)  options.
  * **apiVersion** (<code>string</code>)  API version. 
  * **kind** (<code>string</code>)  Resource kind. 
  * **data** (<code>any</code>)  Data associated with the resource. <span style="text-decoration: underline">*Optional*</span>
  * **metadata** (<code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code>)  Object metadata. <span style="text-decoration: underline">*Optional*</span>



### Properties


Name | Type | Description 
-----|------|-------------
**apiVersion**🔹 | <code>string</code> | The object's API version.
**chart**🔹 | <code>[Chart](#cdk8s-chart)</code> | The chart in which this object is defined.
**kind**🔹 | <code>string</code> | The object kind.
**name**🔹 | <code>string</code> | The name of the API object.

### Methods


#### addDependency(...dependencies)🔹 <a id="cdk8s-apiobject-adddependency"></a>

Create a dependency between this ApiObject and other constructs.

These can be other ApiObjects, Charts, or custom.

<span style="text-decoration: underline">Usage:</span>

```ts
addDependency(...dependencies: IConstruct[]): void
```

<span style="text-decoration: underline">Parameters:</span>
* **dependencies** (<code>[IConstruct](#constructs-iconstruct)</code>)  the dependencies to add.




#### toJson()🔹 <a id="cdk8s-apiobject-tojson"></a>

Renders the object to Kubernetes JSON.

<span style="text-decoration: underline">Usage:</span>

```ts
toJson(): any
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>any</code>



## class App 🔹 <a id="cdk8s-app"></a>

Represents a cdk8s application.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)

### Initializer


Defines an app.

<span style="text-decoration: underline">Usage:</span>

```ts
new App(options?: AppOptions)
```

<span style="text-decoration: underline">Parameters:</span>
* **options** (<code>[AppOptions](#cdk8s-appoptions)</code>)  configuration options.
  * **outdir** (<code>string</code>)  The directory to output Kubernetes manifests. <span style="text-decoration: underline">*Default*</span>: CDK8S_OUTDIR if defined, otherwise "dist"



### Properties


Name | Type | Description 
-----|------|-------------
**outdir**🔹 | <code>string</code> | The output directory into which manifests will be synthesized.

### Methods


#### synth()🔹 <a id="cdk8s-app-synth"></a>

Synthesizes all manifests to the output directory.

<span style="text-decoration: underline">Usage:</span>

```ts
synth(): void
```

<span style="text-decoration: underline">Parameters:</span>






## class Chart 🔹 <a id="cdk8s-chart"></a>



<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Chart(scope: Construct, ns: string, options?: ChartOptions)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **ns** (<code>string</code>)  *No description*
* **options** (<code>[ChartOptions](#cdk8s-chartoptions)</code>)  *No description*
  * **namespace** (<code>string</code>)  The default namespace for all objects defined in this chart (directly or indirectly). <span style="text-decoration: underline">*Default*</span>: no namespace is synthesized (usually this implies "default")



### Properties


Name | Type | Description 
-----|------|-------------
**namespace**?🔹 | <code>string</code> | The default namespace for all objects in this chart.<br/><span style="text-decoration: underline">*Optional*</span>

### Methods


#### addDependency(...dependencies)🔹 <a id="cdk8s-chart-adddependency"></a>

Create a dependency between this Chart and other constructs.

These can be other ApiObjects, Charts, or custom.

<span style="text-decoration: underline">Usage:</span>

```ts
addDependency(...dependencies: IConstruct[]): void
```

<span style="text-decoration: underline">Parameters:</span>
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

<span style="text-decoration: underline">Usage:</span>

```ts
generateObjectName(apiObject: ApiObject): string
```

<span style="text-decoration: underline">Parameters:</span>
* **apiObject** (<code>[ApiObject](#cdk8s-apiobject)</code>)  The API object to generate a name for.

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>

#### toJson()🔹 <a id="cdk8s-chart-tojson"></a>

Renders this chart to a set of Kubernetes JSON resources.

<span style="text-decoration: underline">Usage:</span>

```ts
toJson(): Array<any>
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>Array<any></code>

#### *static* of(c)🔹 <a id="cdk8s-chart-of"></a>

Finds the chart in which a node is defined.

<span style="text-decoration: underline">Usage:</span>

```ts
static of(c: IConstruct): Chart
```

<span style="text-decoration: underline">Parameters:</span>
* **c** (<code>[IConstruct](#constructs-iconstruct)</code>)  a construct node.

<span style="text-decoration: underline">Returns</span>:
* <code>[Chart](#cdk8s-chart)</code>



## class Include 🔹 <a id="cdk8s-include"></a>

Reads a YAML manifest from a file or a URL and defines all resources as API objects within the defined scope.

The names (`metadata.name`) of imported resources will be preserved as-is
from the manifest.

<span style="text-decoration: underline">Implements</span>: [IConstruct](#constructs-iconstruct)
<span style="text-decoration: underline">Extends</span>: [Construct](#constructs-construct)

### Initializer




<span style="text-decoration: underline">Usage:</span>

```ts
new Include(scope: Construct, name: string, options: IncludeOptions)
```

<span style="text-decoration: underline">Parameters:</span>
* **scope** (<code>[Construct](#constructs-construct)</code>)  *No description*
* **name** (<code>string</code>)  *No description*
* **options** (<code>[IncludeOptions](#cdk8s-includeoptions)</code>)  *No description*
  * **url** (<code>string</code>)  Local file path or URL which includes a Kubernetes YAML manifest. 




## class Testing 🔹 <a id="cdk8s-testing"></a>

Testing utilities for cdk8s applications.


### Methods


#### *static* app()🔹 <a id="cdk8s-testing-app"></a>

Returns an app for testing with the following properties: - Output directory is a temp dir.

<span style="text-decoration: underline">Usage:</span>

```ts
static app(): App
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>[App](#cdk8s-app)</code>

#### *static* chart()🔹 <a id="cdk8s-testing-chart"></a>



<span style="text-decoration: underline">Usage:</span>

```ts
static chart(): Chart
```

<span style="text-decoration: underline">Parameters:</span>

<span style="text-decoration: underline">Returns</span>:
* <code>[Chart](#cdk8s-chart)</code>

#### *static* synth(chart)🔹 <a id="cdk8s-testing-synth"></a>

Returns the Kubernetes manifest synthesized from this chart.

<span style="text-decoration: underline">Usage:</span>

```ts
static synth(chart: Chart): Array<any>
```

<span style="text-decoration: underline">Parameters:</span>
* **chart** (<code>[Chart](#cdk8s-chart)</code>)  *No description*

<span style="text-decoration: underline">Returns</span>:
* <code>Array<any></code>



## class Yaml 🔹 <a id="cdk8s-yaml"></a>

YAML utilities.


### Methods


#### *static* load(urlOrFile)🔹 <a id="cdk8s-yaml-load"></a>

Downloads a set of YAML documents (k8s manifest for example) from a URL or a file and returns them as javascript objects.

Empty documents are filtered out.

<span style="text-decoration: underline">Usage:</span>

```ts
static load(urlOrFile: string): Array<any>
```

<span style="text-decoration: underline">Parameters:</span>
* **urlOrFile** (<code>string</code>)  a URL of a file path to load from.

<span style="text-decoration: underline">Returns</span>:
* <code>Array<any></code>

#### *static* save(filePath, docs)🔹 <a id="cdk8s-yaml-save"></a>

Saves a set of objects as a multi-document YAML file.

<span style="text-decoration: underline">Usage:</span>

```ts
static save(filePath: string, docs: Array<any>): void
```

<span style="text-decoration: underline">Parameters:</span>
* **filePath** (<code>string</code>)  The output path.
* **docs** (<code>Array<any></code>)  The set of objects.




#### *static* tmp(docs)🔹 <a id="cdk8s-yaml-tmp"></a>

Saves a set of YAML documents into a temp file (in /tmp).

<span style="text-decoration: underline">Usage:</span>

```ts
static tmp(docs: Array<any>): string
```

<span style="text-decoration: underline">Parameters:</span>
* **docs** (<code>Array<any></code>)  the set of documents to save.

<span style="text-decoration: underline">Returns</span>:
* <code>string</code>



## struct ApiObjectMetadata 🔹 <a id="cdk8s-apiobjectmetadata"></a>


Metadata associated with this object.



Name | Type | Description 
-----|------|-------------
**name**?🔹 | <code>string</code> | The unique, namespace-global, name of this object inside the Kubernetes cluster.<br/><span style="text-decoration: underline">*Default*</span>: an app-unique name generated by the chart



## struct ApiObjectOptions 🔹 <a id="cdk8s-apiobjectoptions"></a>


Options for defining API objects.



Name | Type | Description 
-----|------|-------------
**apiVersion**🔹 | <code>string</code> | API version.
**kind**🔹 | <code>string</code> | Resource kind.
**data**?🔹 | <code>any</code> | Data associated with the resource.<br/><span style="text-decoration: underline">*Optional*</span>
**metadata**?🔹 | <code>[ApiObjectMetadata](#cdk8s-apiobjectmetadata)</code> | Object metadata.<br/><span style="text-decoration: underline">*Optional*</span>



## struct AppOptions 🔹 <a id="cdk8s-appoptions"></a>






Name | Type | Description 
-----|------|-------------
**outdir**?🔹 | <code>string</code> | The directory to output Kubernetes manifests.<br/><span style="text-decoration: underline">*Default*</span>: CDK8S_OUTDIR if defined, otherwise "dist"



## struct ChartOptions 🔹 <a id="cdk8s-chartoptions"></a>






Name | Type | Description 
-----|------|-------------
**namespace**?🔹 | <code>string</code> | The default namespace for all objects defined in this chart (directly or indirectly).<br/><span style="text-decoration: underline">*Default*</span>: no namespace is synthesized (usually this implies "default")



## struct IncludeOptions 🔹 <a id="cdk8s-includeoptions"></a>






Name | Type | Description 
-----|------|-------------
**url**🔹 | <code>string</code> | Local file path or URL which includes a Kubernetes YAML manifest.



