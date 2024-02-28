import * as fs from 'fs';
import { Cdk8sTeamTypeScriptProject } from '@cdk8s/projen-common';
import { JobPermission } from 'projen/lib/github/workflows-model';
import { K8sVersionUpgradeAutomation } from './src/k8s-automation';

const SPEC_VERSION = fs.readFileSync('src/latest-k8s-version.txt', 'utf-8');

// the latest version of k8s we support
const LATEST_SUPPORTED_K8S_VERSION = Number(SPEC_VERSION);

const mainBranch = 'master';

const project = new Cdk8sTeamTypeScriptProject({
  name: 'root',
  repoName: 'cdk8s',
  sampleCode: false,
  defaultReleaseBranch: mainBranch,
  pullRequestTemplate: false,
  release: false,
  devDeps: [
    '@cdk8s/projen-common',
    '@types/jest',
    '@types/node',
    'cdk8s',
    'cdk8s-cli',
    'constructs',
    'lerna',
    'semver',
    'ts-jest',
    'typescript',
    'projen',
  ],
  projenrcTs: true,
});

for (let i = 0; i < 3; i++) {
  project.addDevDeps(`cdk8s-plus-${LATEST_SUPPORTED_K8S_VERSION - i}`);
}

project.gitignore.exclude('.vscode/');
project.gitignore.addPatterns('*.js');
project.gitignore.addPatterns('*.d.ts');
project.gitignore.addPatterns('dist/');

// enable mono-repo
project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: [],
});

// override the default test task to run test across the repo
project.testTask.reset('lerna run test -- -u');
project.tasks.removeTask('test:watch');
project.tasks.removeTask('test:update');
project.tasks.removeTask('test:compile');

// no package task is needed
project.packageTask.reset();

project.package.addPackageResolutions(
  // Pin version of @types/responselike and got, see: https://github.com/sindresorhus/got/issues/2129
  '@types/responselike@1.0.0',
  'got@12.3.1',
);


// construct the build task
project.compileTask.exec('lerna run build');

// deploy website
const workflow = project.github!.addWorkflow('website');
workflow.on({ push: { branches: [mainBranch] } });
workflow.addJobs({
  deploy: {
    permissions: {
      contents: JobPermission.WRITE,
    },
    runsOn: ['ubuntu-latest'],
    steps: [
      {
        name: 'Checkout sources',
        uses: 'actions/checkout@v2',
      },
      {
        name: 'Setup Node.js',
        uses: 'actions/setup-node@v2',
      },
      {
        name: 'Setup Hugo',
        uses: 'peaceiris/actions-hugo@v2',
        with: {
          'hugo-version': '0.68.3',
          'extended': true,
        },
      },
      {
        name: 'Setup Python',
        uses: 'actions/setup-python@v2',
        with: {
          'python-version': '3.x',
          'architecture': 'x64',
        },
      },
      {
        name: 'Install dependencies',
        run: 'yarn install --frozen-lockfile',
      },
      {
        name: 'Build Website',
        run: [
          'cd website',
          './build.sh',
        ].join('\n'),
      },
      {
        name: 'Build Docs Site',
        run: './docs/build.sh website/public/docs',
      },
      {
        name: 'Deploy',
        uses: 'peaceiris/actions-gh-pages@v3',
        with: {
          github_token: '${{ secrets.GITHUB_TOKEN }}',
          publish_dir: './website/public',
        },
      },
    ],
  },
});

// The API reference is generated when the website is built and released
// on the main branch, so the files should not be committed to the repo.
// See docs/build.sh.
let packages = ['cdk8s'];
for (let i = 0; i < 3; i++) {
  packages.push(`cdk8s-plus-${LATEST_SUPPORTED_K8S_VERSION - i}`);
}
for (const pkg of packages) {
  for (const language of ['java', 'typescript', 'python']) {
    project.gitignore.exclude(`/docs/reference/${pkg}/${language}.md`);
  }
}

// Projen task to update references to old versions of cdk8s-plus
const versionTaskObject = project.addTask('replace-version-references');
versionTaskObject.exec('ts-node src/replace-version-references.ts ' + SPEC_VERSION);

// Add Kubernetes upgrade automation workflow
new K8sVersionUpgradeAutomation(project);

project.synth();