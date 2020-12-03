import { Cdk8s } from './cdk8s';
import { Cdk8sPlus17 } from './cdk8s-plus-17';
import { Cdk8sCli } from './cdk8s-cli';
import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';

const COMMON_OPTIONS: Omit<pj.NodeProjectOptions, 'name'> = {
  repository: 'https://github.com/awslabs/cdk8s.git',
  authorName: 'Amazon Web Services',
  authorUrl: 'https://aws.amazon.com',
  authorOrganization: true,
  stability: 'experimental',
  buildWorkflow: false,
  releaseWorkflow: false,
  mergify: false,
  dependabot: false,
  pullRequestTemplate: false,
  keywords: [
    "cdk",
    "kubernetes",
    "k8s",
    "constructs"
  ]
}

const project = new pjcontrib.YarnMonoRepoProject({
  outdir: '../test-mono-repo',
  workspaces: {
    packages: [
      "packages/*",
      "examples/**/*"
    ],
    noHoist: [
      "cdk8s/yaml",
      "cdk8s/yaml/**",
      "cdk8s/json-stable-stringify",
      "cdk8s/json-stable-stringify/**",
      "cdk8s/fast-json-patch",
      "cdk8s/fast-json-patch/**",
      "cdk8s/follow-redirects",
      "cdk8s/follow-redirects/**",
      "cdk8s-plus-17/minimatch",
      "cdk8s-plus-17/minimatch/**"
    ]
  },
  devDependencies: {
    "changelog-parser": "^2.8.0",
    "jsii-release": "^0.2.3",
    "lerna": "^3.22.1",
    "semver": "7.3.2",
    "standard-version": "^9.0.0"
  },
  dependenciesUpgrade: {
    schedule: '0 8 * * *',
    autoApprove: true,
  },
});

new Cdk8s(project, COMMON_OPTIONS);
new Cdk8sPlus17(project, COMMON_OPTIONS);
new Cdk8sCli(project, COMMON_OPTIONS);

project.gitignore.exclude('**/dist');
project.gitignore.exclude('**/.vscode');
project.gitignore.exclude('**/*.d.ts');
project.gitignore.exclude('**/*.js');
project.gitignore.exclude('**/coverage');
project.gitignore.exclude('**/node_modules');

function fixup(project: pj.NodeProject) {
  // override the default "build" from projen because currently in this
  // repo it means "compile"
  project.removeScript('build');
  project.addTask('build', { exec: 'yarn compile' })

  // // add "compile" after test because the test command deletes lib/ and we run tests *after* build in this repo.
  project.testTask.exec('yarn compile');

  // jsii-release is declared at the root level, we don't need it here.
  delete (project as any).devDependencies['jsii-release']

  delete project.manifest.scripts.bump;
  delete project.manifest.scripts.release;
};

for (const p of project.packages) {
  fixup(p);
}


project.synth();