const { Project } = require('projen');

const root = new Project();

root.gitignore.exclude('/dist');
root.gitignore.exclude('/node_modules');

const common = {
  root,

  versions: {
    jsii: '1.14.1',
  },

  deps: {
    constructs: `constructs@^3.2.34`
  },

  options: {
    repository: 'https://github.com/awslabs/cdk8s.git',
    authorName: 'Amazon Web Services',
    authorUrl: 'https://aws.amazon.com',
    minNodeVersion: '10.17.0',
    authorOrganization: true,
    buildWorkflow: false,
    stability: 'experimental',
    releaseWorkflow: false,
    dependabot: false,
    mergify: false,
    compat: false,
    dependabot: false,
    pullRequestTemplate: false,
    keywords: [
      "cdk",
      "kubernetes",
      "k8s",
      "constructs"
    ]
  }  
};

const subprojects = [
  require('./packages/cdk8s-cli/.subprojenrc')(common),
  require('./packages/cdk8s/.subprojenrc')(common),
  require('./packages/cdk8s-plus-17/.subprojenrc')(common)
];

for (const subp of subprojects) {
    // override the default "build" from projen because currently in this
  // repo it means "compile"
  subp.addScripts({ build: 'yarn compile' });

  // // add "compile" after test because the test command deletes lib/ and we run tests *after* build in this repo.
  subp.addTestCommand('yarn compile');

  // jsii-release is declared at the root level, we don't need it here.
  delete subp.devDependencies['jsii-release']

  delete subp.manifest.scripts.bump;
  delete subp.manifest.scripts.release;
}

root.synth();
