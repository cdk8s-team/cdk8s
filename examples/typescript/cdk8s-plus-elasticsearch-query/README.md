# Elasticsearch Query service with CDK8s+

This directory contains an a small query service that hits an elasticsearch endpoint to perform a free text query. It contains the following components:

#### Elasticsearch Cluster

The Elasticsearch cluster is created using the [ElasticCloud CRD](https://download.elastic.co/downloads/eck/1.1.2/all-in-one.yaml). The code has been pre-imported and [included](./imports/elasticsearch.k8s.elastic.co/elasticsearch.ts) in this application.

> To learn mode about using CRD's with `cdk8s`, see [Custom Resource Definitions](https://github.com/awslabs/cdk8s/tree/master/packages/cdk8s-cli#custom-resource-definitions-crds) and [CRD Example](https://github.com/awslabs/cdk8s/tree/master/examples/typescript/crd)

#### Query Deployment

A kubernetes deployment is created using the `cdk8s-plus` [`Deployment`](https://github.com/awslabs/cdk8s/tree/master/packages/cdk8s-plus#deployment) construct.

#### Query Service

A kubecrnetes service that serves the deployment is created using the `cdk8s-plus` [`Service`](https://github.com/awslabs/cdk8s/tree/master/packages/cdk8s-plus#service) construct.

## Build

To build the example, run:

`npm run build`

This will compile the TypeScript code into JavaScript, run tests, and perform [synth](#Synth)

## Synth

To synthesize a Kubernetes manifest from the compiled TypeScript code, run:

`cdk8s synth`

Note that you have to recompile (`npm run compile`) everytime you make a change to the TypeScript code. Alternatively, for development, you run a backgroud watcher:

`npm run watch`

## Apply

Before you can apply the manifest, you need to install the Elasticsearch Operator and CRD to your cluster. To do that, run the command (just once):

`kubectl apply -f https://download.elastic.co/downloads/eck/1.1.2/all-in-one.yaml`

To apply the manifest to your Kubernetes cluster, run:

`kubectl apply -f dist/elasticsearch-query.k8s.yaml`

## Indexing Data

This example has a [`data.txt`](./data.txt) file that contains some mock documents that can be indexed to the Elasticsearch cluster, for quick development iterations.

`npm run index-mock-data`

