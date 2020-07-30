exports.versions = {
  constructs: '3.0.4',
  tokens: '0.0.4',
  jsii: '1.9.0',
};

exports.options = {
  repository: 'https://github.com/awslabs/cdk8s.git',
  authorName: 'Amazon Web Services',
  authorUrl: 'https://aws.amazon.com',
  authorOrganization: true,
  buildWorkflow: false,
  releaseWorkflow: false,
  mergify: false,
  compat: false,
  keywords: [
    "cdk",
    "kubernetes",
    "k8s",
    "constructs"
  ]
};

// some common fixups for projects
exports.fixup = project => {
  // override the default "build" from projen because currently in this
  // repo it means "compile"
  project.addScripts({ build: 'yarn compile' });

  // // add "compile" after test because the test command deletes lib/ and we run tests *after* build in this repo.
  project.addTestCommand('yarn compile');

  // jsii-release is declared at the root level, we don't need it here.
  delete project.devDependencies['jsii-release']

  delete project.manifest.scripts.bump;
  delete project.manifest.scripts.release;
};
