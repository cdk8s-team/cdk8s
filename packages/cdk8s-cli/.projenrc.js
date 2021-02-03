const { TypeScriptProject } = require('projen');

const common = require('../projen-common');

const project = new TypeScriptProject({
  name: 'cdk8s-cli',
  description: 'CDK for Kubernetes CLI',
  bin: {
    cdk8s: 'bin/cdk8s',
  },
  deps: [
    'cdk8s@^0.0.0',
    'codemaker',
    'constructs',
    'fs-extra',
    'jsii-srcmak',
    'jsii-pacmak',
    'sscaff',
    'yaml',
    'yargs',
    'json2jsii',
    'colors',

    // add @types/node as a regular dependency since it's needed to during "import"
    // to compile the generated jsii code.
    '@types/node',
  ],
  devDeps: [
    '@types/fs-extra',
    '@types/json-schema',
  ],
  ...common.options,
});

project.eslint.addIgnorePattern('/templates/');
project.jest.addIgnorePattern('/templates/');

common.fixup(project);

project.synth();
