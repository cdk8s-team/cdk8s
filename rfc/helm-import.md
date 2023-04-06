# Helm Import 

* **Original Author(s):** @vinayak-kukreja
* **Tracking Issue:** https://github.com/cdk8s-team/cdk8s/issues/1271
* **API Bar Raiser:** @iliapolo

Users are now able to import helm charts into their cdk8s app with `cdk8s import` command.

## Working Backwards

### README

You can add a helm chart to your cdk8s application by running:

```
cdk8s import helm:https://airflow.apache.org/airflow@1.8.0
```

Here, `airflow` is the helm chart and `1.8.0` is the chart version.

Then you can use this chart within your application:

```typescript
import { Construct } from 'constructs';
import { App, Chart, ChartProps } from 'cdk8s';
import { Airflow } from './imports/airflow';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = { }) {
    super(scope, id, props);

    new Airflow(this, 'airflow', {
      values: {
        fullnameOverride: 'Foo',
      }
    });
  }
}

const app = new App();
new MyChart(app, 'typescript-demo');
app.synth();
```

> **Note:**
>
> * You would need `Helm` to be installed on your machine for using this feature. 
> * We assume that you are authenticated to access the helm chart being mentioned in the url.
> * If a helm chart contains a `values.schema.json` then the `values` properties within the construct properties for the chart would have specific types. For instance, in the prior example `fullnameOverride` is not of `any` type and instead is of `string` type since `airflow` chart has a `values.schema.json` file in it.

---

Ticking the box below indicates that the public API of this RFC has been
signed-off by the API bar raiser (the `api-approved` label was applied to the
RFC pull request):

```
[ ] Signed-off by API Bar Raiser @iliapolo
```

## Public FAQ

### What are we launching today?

We have added a new feature to the `cdk8s import` command which allows users to import helm charts into their cdk8s app.

### Why should I use this feature?

You should use this feature if you would like to use helm charts within your cdk8s app. This feature would allow you to add values for helm chart in a type safe manner if a `values.schema.json` file is present within the chart being used.

## Internal FAQ

### Why are we doing this?

Our current support for including helm charts to cdk8s app adds churn for the user to setup the [Helm construct](https://cdk8s.io/docs/latest/basics/helm/) and pass in values to the construct. This feature would have two advantages over the current solution:
1. It would make it easier for the user to setup a construct for helm charts. They would just need to run the `cdk8s import` command with a valid url and we would auto generate the construct for them.
2. If a `values.schema.json` file is present in the helm chart that the user is referring, then our generated construct would have type safe values properties. This is not supported in Helm construct currently.

### Why should we _not_ do this?

As mentioned above, we do currently have a [solution]((https://cdk8s.io/docs/latest/basics/helm/)) for including helm charts in cdk8s app. The proposed feature is definitely an enhancement but would take up developers time and effort to implement and maintain.

### What is the technical solution (design) of this feature?

#### Helm chart url

The following would be the format for a helm url being passed into the import command:

```
cdk8s import helm:<repo-url>/<chart-name>@<chart-version>
```

We can mention an example in [cdk8s import](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/cli/cmds/import.ts#L16-L28) of what an accepted helm url format will be for importing a helm chart into a cdk8s app.

```
.example('cdk8s import helm:https://airflow.apache.org/airflow@1.8.0', 'Imports the specified version of helm chart')
```

Here,
* `helm:`: Is how we will identify if the url being passed in supposed to be a helm chart.
* `https://airflow.apache.org/airflow@1.8.0`: Is the helm chart url.
    * `https://airflow.apache.org/`: Is the helm repo. 
    * `airflow`: Is the name of the helm chart.
    * `1.8.0`: Is the helm chart version.

#### Identifying a helm chart

For the url being passed in, we need to [check if the url](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/dispatch.ts#L24) is supposed to be a helm chart.

```typescript
async function matchImporter(importSpec: ImportSpec, argv: any): Promise<ImportBase> {

  // ----------- Existing Code -----------

  const helm = importSpec.source.split(':')[0];

  if (helm === 'helm') {
    return new ImportHelm(importSpec);
  }

  // ----------- Existing Code -----------
}
```

#### `ImportHelm` class

We would create a new class for importing helm charts called as `ImportHelm` which would extends [ImportBase class](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L39). The following are sections explaining what would be added to this class.

##### Validating and getting information from the url

If the url is valid, we can then get the information about the helm chart like, chart name, repo url and chart version from the url.

```typescript
/**
 * Validating if a helm chart url is in an expected format
 * @param url
 */
function validateHelmUrl(url: string): RegExpExecArray {
  const helmRegex = /^helm:([A-Za-z0-9_.-:]+)\/([A-Za-z0-9_.-:]+)\@([0-9]+)\.([0-9]+)\.([0-9]+)$/;
  const match = helmRegex.exec(url);

  if (match) {
    return match;
  } else {
    throw Error(`There was an error processing the helm chart url you passed in: ${url}. Make sure it matches the format of 'helm:<repo-url>/<chart-name>@<chart-version>'.`);
  }
}

/**
 * Gets information about the helm chart from the helm url
 * @param url
 * @returns chartUrl, chartName and chartVersion
 */
function getHelmChartDetails(url: string) {

  const helmChartDetails = validateHelmUrl(url);
  const chartUrl = helmChartDetails[1];
  const chartName = helmChartDetails[2];
  const major = helmChartDetails[3];
  const minor = helmChartDetails[4];
  const patch = helmChartDetails[5];

  const chartVersion = `${major}.${minor}.${patch}`;

  return [chartUrl, chartName, chartVersion];
}
```

##### Getting `values.schema.json` file

When the user would run the import command, we would need to identify if a `values.schema.json` is present in the helm chart being mentioned. To do so, we can create a temporary directory and pull in and extract the chart in that directory. 

```typescript
/**
 * Pulls the helm chart in a temporary directory
 * @param chartUrl Chart url
 * @param chartName Chart name
 * @param chartVersion Chart version
 * @returns Temporary directory path
 */
function pullHelmRepo(chartUrl: string, chartName: string, chartVersion: string): string {
  const workdir = fs.mkdtempSync(path.join(os.tmpdir(), 'cdk8s-helm-'));

  const args = new Array<string>();
  args.push('pull');
  args.push(chartName);
  args.push('--repo', chartUrl);
  args.push('--version', chartVersion);
  args.push('--untar');
  args.push('--untardir', workdir);

  const command = 'helm';

  const helm = spawnSync(command, args, {
    maxBuffer: MAX_HELM_BUFFER,
  });

  if (helm.error) {
    const err = helm.error.message;
    if (err.includes('ENOENT')) {
      throw new Error(`unable to execute '${command}' to pull the Helm chart. Is it installed on your system?`);
    }

    throw new Error(`error while pulling a helm chart: ${err}`);
  }

  if (helm.status !== 0) {
    throw new Error(helm.stderr.toString());
  }

  return workdir;
}
```

After extraction, we would look for the `values.schema.json` in the root of the helm chart.

```typescript
  if (fs.existsSync(this.tmpDir)) {
    this.chartSchemaPath = path.join(this.tmpDir, this.chartName, this.schemaFileName);
  } else {
    this.chartSchemaPath = undefined;
  }
```

> **Note:**
>
> After the typescript code generation is successful, we would cleanup the temporary directory created which had the helm chart.
>   ```typescript
>    /**
>     * Cleanup temp directory created
>     * @param tmpDir Temporary directory path
>     */
>    function cleanup(tmpDir: string) {
>       fs.rmSync(tmpDir, { recursive: true });
>    }
>   ```

#### Code Generation

ImportBase class has abstract methods [moduleNames](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L40) and [generateTypeScript](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L42). As part of the new class `ImportHelm` we also need to define these. Because, when the [import](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L44) function is [invoked]((https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/dispatch.ts#L17)), it invokes the [generateTypeScript](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L80-L82) function. 

```typescript
  public get moduleNames() {
    return [this.chartName];
  }

  protected async generateTypeScript(code: CodeMaker) {

    emitHelmHeader(code);

    let schema: JSONSchema4 | undefined;

    if (this.chartSchemaPath !== undefined) {
      JSON.parse(fs.readFileSync(this.chartSchemaPath, 'utf-8'));
    } else {
      schema = undefined;
    }

    const types = new TypeGenerator({
      definitions: schema?.definitions,
    });

    generateHelmConstruct(types, {
      schema: schema,
      chartName: this.chartName,
      chartUrl: this.chartUrl,
      chartVersion: this.chartVersion,
      fqn: this.chartName,
    });

    code.line(types.render());

    cleanup(this.tmpDir);
  }
```

For code generation, we already utilize [codemaker](https://www.npmjs.com/package/codemaker). The `emitHelmHeader(code)`   function would be responsible for adding any relevant imports for the generated construct.

```typescript
/**
 * Emit imports for generated helm construct
 * @param code CodeMaker instance
 */
export function emitHelmHeader(code: CodeMaker) {
  code.line('// generated by cdk8s');
  code.line('import { Helm } from \'cdk8s\';');
  code.line('import { Construct } from \'constructs\';');
  code.line();
}
```

If we did find `values.schema.json` in the helm chart, the definitions of the schema as passed in to the [TypeGenerator](https://github.com/cdklabs/json2jsii). TypeGenerator makes it possible to emit structs for a schema and also enables to emit custom types.

We then invoke `generateHelmConstruct` function. In this function, we are emitting: 
  * A custom type. This would be our helm construct.
    * It's constructor/initializer.
  * A `values` property `struct` if schema is defined.
  * An interface representing properties of the construct.

```typescript
export function generateHelmConstruct(typegen: TypeGenerator, def: HelmObjectDefinition) {

  const chartName = TypeGenerator.normalizeTypeName(def.chartName);
  const schema = def.schema;
  const repoUrl = def.chartUrl;
  const chartVersion = def.chartVersion;

  typegen.emitCustomType(chartName, code => {                   // <--------------- Creating custom type

    const valuesInterface = `${chartName}ValuesProps`;          // <--------------- Creating 'values' struct
    if (schema !== undefined) {
      typegen.emitType(valuesInterface, schema, def.fqn);
    }

    emitPropsInterface();                                       // <--------------- Creating construct properties

    code.line();

    emitConstruct();                                            // <--------------- Creating construct for helm chart

    function emitPropsInterface() {
      code.openBlock(`export interface ${chartName}Props`);

      code.line('readonly chart?: string;');
      code.line('readonly repo?: string;');
      code.line('readonly version?: string;');
      code.line('readonly namespace?: string;');
      code.line('readonly releaseName?: string;');
      code.line('readonly helmExecutable?: string;');
      code.line('readonly helmFlags?: string[];');

      if (schema === undefined) {
        code.line('readonly values?: { [key: string]: any };');
      } else {
        code.line(`readonly values?: ${valuesInterface};`);
      }

      code.closeBlock();
    }

    function emitConstruct() {
      code.openBlock(`export class ${chartName} extends Helm`);

      emitInitializer();

      code.closeBlock();
    }

    function emitInitializer() {
      code.openBlock(`public constructor(scope: Construct, id: string, props: ${chartName}Props = {})`);

      code.open('const finalProps = {');
      code.line(`chart: \'${def.chartName}\',`);
      code.line(`repo: \'${repoUrl}\',`);
      code.line(`version: \'${chartVersion}\',`);
      code.line('...props,');
      code.close('};');

      code.open('super(scope, id, {');
      code.line('...finalProps,');
      code.close('});');

      code.closeBlock();
    }
  });
}
```

The generated construct would just be invoking [Helm construct](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/helm.ts) constructor and that would use [helm template](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/helm.ts#L137-L159) command to generate the manifest with the values that the user has passed in. 

> **Note:**
> 
> The interface being generated here is similar to [HelmProps](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/helm.ts#L15-L77) with the difference being in `chart` and `values` properties. Unfortunately, [Omit](https://www.typescriptlang.org/docs/handbook/utility-types.html#omittype-keys) is not supported by jsii and hence the code repetition. There is a [project](https://github.com/mrgrain/jsii-struct-builder) by `mgrain` to support this use case but has not been added to jsii yet. 


#### Transpiling to other languages

After the code is successfully generated in typescript, we transpile it to other languages in our [ImportBase](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/base.ts#L90-L150) class using [jsii srcmak](https://github.com/cdklabs/jsii-srcmak). There are no changes required here for this feature.

> **Note:**
>
> The language naming conventions are followed when typescript code is transpiled. This results in casing changes for the properties of the generated construct. But, this does not impact the manifest generation since as part of transpiling the casing corelation between properties and transpiled properties is added. For instance, following is some of the properties mapping for `airflow` helm chart in python:
> ```python
> @jsii.data_type(
>    jsii_type="airflowtest.AirflowValuesProps",
>    jsii_struct_bases=[],
>    name_mapping={
>        "affinity": "affinity",
>        "airflow_config_annotations": "airflowConfigAnnotations",
>        "airflow_home": "airflowHome",
>        "airflow_local_settings": "airflowLocalSettings",
>        "airflow_pod_annotations": "airflowPodAnnotations",
>        "airflow_version": "airflowVersion",
>        "allow_pod_launching": "allowPodLaunching",
>    },
> )
> ```

#### Sub scenarios

* **cdk8s import Demo:=helm:https://airflow.apache.org/airflow@1.8.0**

  This would work as expected and will add "Demo" as the [module name prefix](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/cli/cmds/import.ts#L57-L62).

* **cdk8s import helm:https://airflow.apache.org/airflow**

  This would fail the regex since no chart version is being mentioned in the url.

* **cdk8s import helm:https://airflow.apache.org/**

  This would fail since no chart has been mentioned in the url.

* **cdk8s import helm:www.google.com/airflow@1.8.0**

  This would fail since the url would not lead to a helm chart.

### Flowchart

```mermaid
---
title: cdk8s import helm:https://airflow.apache.org/airflow@1.8.0
---
flowchart TD
    A([cdk8s import command executed])
    B{is helm chart url}
    A --> B
    B --no--> C(check for other \n import and resume import)
    B --yes--> D{is valid url}
    D --no--> E(error)
    D --yes--> F(get chart details from url)
    F --> G(create temporary directory)
    G --> H(helm pull chart \n in tmp dir)
    H --> I{is \n values.schema.json \n present}
    I --no--> J(schema path is set \n to undefined)
    I --yes--> K(schema path is set)
    L(import continues)
    J --> L
    K --> L
    L --> M(generate typescript)
    M --> N(emit 'values' struct)
    N --> O(emit construct props)
    O --> P(emit construct)
    P --> Q(render to file and save)
    Q --> R{is language typescript}
    R --yes--> S(import finishes)
    R --no--> T(transpile to target language)
    T --> S
    C --> S
```

### Is this a breaking change?

This is not a breaking change. This is adding new functionality to the cdk8s cli import command. 

### What alternative solutions did you consider?

* **Using omit utility type**

  In the proposed solution we are recreating a similar interface to [HelmProps](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/helm.ts#L15-L77). This is unideal since it adds redundancy. The reason for doing this is because:
  
    1. We already would know the `chart` value and it would not make sense to ask the user for it which is required in HelmProps.
    2. `values` could have data types associated with its properties which is not supported in HelmProps.
  
  I initially used [Omit utility type](https://www.typescriptlang.org/docs/handbook/utility-types.html#omittype-keys) and it works but just for typescript. When trying to transpile it to other languages it gives out an error due to jsii limitation. 

* **--helm as a flag**

  Instead of using `cdk8s import helm:url`, I initially thought of using a flag `--helm` where if present, it would mean that the url is supposed to be leading to a helm chart. This adds a flag to the import command and keeping it as `helm:` makes it similar to what we have for `github:`.

* **Reusing ApiObjectDefinition**

  In the proposed solution, I have added `HelmObjectDefinition` as an interface instead of reusing and adding to [ApiObjectDefinition](https://github.com/cdk8s-team/cdk8s-cli/blob/2.x/src/import/codegen.ts#L10-L37). I think the two interface represent different things and it would not make sense to combine them for this feature.

### What are the drawbacks of this solution?

* **Interface similar to HelmProps**
  
  As mentioned in the previous sections, there is an interface similar to HelmProps in the proposed solution due to a jsii limitation. We can use `mgrain's` [project](https://github.com/mrgrain/jsii-struct-builder) to reduce code but the emitted interface would still be similar to HelmProps. 

* **Multiple values.schema.json**

  We are considering only the `values.schema.json` present at the root of the chart since helm by default looks for `values.yaml` at the root of the chart. I have seen multiple values.yaml files in a chart's sub-folders and these can have schema associated with them. 

  We can combine all the schema files we find in a chart to one schema file and code generate on it. But there can be conflicts in doing this.

* **Limiting values properties**

  Building on previous point, if we just include one schema file for code generation, it can lead to missing properties that the user is able to provision for manually when using `values.yaml` file. 

  To resolve this, we can add an `additionalProperties` property to `values` which can get any additional property a user wants to add other than the auto generated properties.

### What is the high-level project plan?

* Addressing the open issues.
* Implementing the feature and adding tests for it. 
* Initially this feature can be marked as experimental for the users. In this time we can keep track of issues being created for the feature and if there are feature requests for it.
* Once stable, we can create a blog post about this feature demonstrating an end to end development workflow for the user.

### Are there any open issues that need to be addressed later?

During my research, I encountered couple of errors when processing different `values.schemas.json` for code generation. Taking an example of Airflow helm chart, some of the errors that I encountered were:

* **`unsupported array type undefined`**
  * [Error Link](https://github.com/cdklabs/json2jsii/blob/main/src/type-generator.ts#L538)
  * Impacting property in schema: [resultBackendConnection](https://github.com/apache/airflow/blob/main/chart/values.schema.json#L1038-L1095)

* **`for "properties", if "type" is specified it has to be an "object"`**
  * [Error Link](https://github.com/cdklabs/json2jsii/blob/main/src/type-generator.ts#L229)
  * Impacting properties in schema:
    * [precedingPaths](https://github.com/apache/airflow/blob/main/chart/values.schema.json#L261-L265)
    * [succeedingPaths](https://github.com/apache/airflow/blob/main/chart/values.schema.json#L266-L270)
    * [extraMappings](https://github.com/apache/airflow/blob/main/chart/values.schema.json#L4241-L4245)
    * [overrideMappings](https://github.com/apache/airflow/blob/main/chart/values.schema.json#L4246-L4250)

Before releasing the feature, we need to invest into testing the solution with different schemas and add sanitization to properties where possible and callout schema patterns that cannot be supported.