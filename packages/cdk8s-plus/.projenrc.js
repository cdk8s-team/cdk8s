const { JsiiProject, Semver, JsonFile } = require('projen');
const { Construct } = require('constructs');

const constructsDependency = Semver.caret('2.0.1')
const cdk8sDependency = Semver.caret('0.0.0')

const project = new JsiiProject({
  name: 'cdk8s-plus',
  buildWorkflow: false,
  releaseWorkflow: false,
  mergify: false,
  commitPackageJson: true,
  jsiiVersion: Semver.caret('1.6.0'),
  description: 'High level abstractions on top of cdk8s',
  repository: 'https://github.com/awslabs/cdk8s.git',
  authorName: 'Amazon Web Services',
  authorUrl: 'https://aws.amazon.com',
  peerDependencies: {
    constructs: constructsDependency,
    cdk8s: cdk8sDependency,
  },
  dependencies: {
    minimatch: Semver.caret('3.0.4'),
    cdk8s: cdk8sDependency
  },
  bundledDependencies: [ 'minimatch' ],
  devDependencies: {
    '@types/minimatch': Semver.caret('3.0.3')
  },
  stability: 'experimental',
  java: {
    javaPackage: 'org.cdk8s.plus',
    mavenGroupId: 'org.cdk8s',
    mavenArtifactId: 'cdk8s-plus'
  },
  python: {
    distName: 'cdk8s-plus',
    module: 'cdk8s_plus'
  },
  dotnet: {
    dotNetNamespace: 'Org.Cdk8s.Plus',
    packageId: 'Org.Cdk8s.Plus'
  }
});

// override the default "build" from projen because currently in this
// repo it means "compile"
project.addScripts({
  build: 'jsii && yarn docgen'
});

project.synth();
