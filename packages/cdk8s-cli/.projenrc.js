const { TypeScriptLibraryProject, Semver } = require('projen');

const common = require('../projen-common');

const project = new TypeScriptLibraryProject({
  name: 'cdk8s-cli',
  description: 'CDK for Kubernetes CLI',
  bin: {
    cdk8s: 'bin/cdk8s'
  },
  dependencies: {
    "cdk8s": Semver.pinned('0.0.0'),
    "codemaker": Semver.caret('0.22.0'),
    "constructs": Semver.caret('2.0.2'),
    "fs-extra": Semver.caret('8.1.0'),
    "jsii-srcmak": Semver.caret('0.1.4'),
    "sscaff": Semver.caret('1.2.0'),
    "yaml": Semver.caret('1.7.2'),
    "yargs": Semver.caret('15.1.0'),
    "json2jsii": Semver.caret('0.1.4'),
  },
  devDependencies: {
    "@types/fs-extra": Semver.caret('8.1.0'),
    "@types/json-schema": Semver.caret('7.0.5'),
  },
  ...common.options,
});

project.eslint.addIgnorePattern('/templates/');
project.jest.addIgnorePattern('/templates/');

common.fixup(project);

project.synth();
