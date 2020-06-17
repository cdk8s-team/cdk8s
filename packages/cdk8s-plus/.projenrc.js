const { JsiiProject, Semver } = require('projen');

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
  },
  bundledDependencies: [ 'minimatch' ],
  devDependencies: {
    'cdk8s-cli': Semver.caret('0.0.0'),
    '@types/minimatch': Semver.caret('3.0.3')
  },
  stability: 'experimental',
});

project.synth();
