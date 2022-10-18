const { javascript } = require('projen');
const { JobPermission } = require('projen/lib/github/workflows-model');

const mainBranch = 'master';

const project = new javascript.NodeProject({
  name: 'root',
  defaultReleaseBranch: mainBranch,
  pullRequestTemplate: false,
  projenUpgradeSecret: 'PROJEN_GITHUB_TOKEN',
  releaseWorkflow: false,
  workflowBootstrapSteps: [
    {
      name: 'installing dependencies',
      run: 'tools/install-workflow-deps.sh'
    },
    {
      name: 'Setup Go',
      uses: 'actions/setup-go@v2',
      with: {
        'go-version': '1.16',
      },
    },
  ],
  devDeps: [
    '@types/jest',
    '@types/node',
    'cdk8s',
    'cdk8s-cli',
    'cdk8s-plus-22',
    'cdk8s-plus-23',
    'cdk8s-plus-24',
    'cdk8s-plus-25',
    'constructs',
    'lerna@^4',
    'semver',
    'ts-jest',
    'typescript',
    'projen',
  ],
  autoApproveOptions: {
    allowedUsernames: ['cdk8s-automation'],
    secret: 'GITHUB_TOKEN'
  },
  autoApproveUpgrades: true,
});

project.gitignore.exclude('.vscode/');
project.gitignore.addPatterns('*.js');
project.gitignore.addPatterns('*.d.ts');
project.gitignore.addPatterns('dist/');

// enable mono-repo
project.package.addField('private', true);
project.package.addField('workspaces', {
  packages: ['examples/**/*']
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
  "@types/responselike@1.0.0",
  "got@12.3.1"
);

// integ tests
const integTask = project.addTask('integ', {
  exec: 'bash test/test-all.sh',
});
const integUpdate = project.addTask('integ:update', {
  exec: 'bash test/test-all.sh',
  env: { UPDATE_SNAPSHOTS: '1' }
});

// construct the build task
project.compileTask.exec('lerna run build');
project.testTask.spawn(integUpdate);

// deploy website
const workflow = project.github.addWorkflow('website');
workflow.on({ push: { branches: [ mainBranch ] } });
workflow.addJobs({
  deploy: {
    permissions: {
      contents: JobPermission.WRITE,
    },
    runsOn: 'ubuntu-18.04',
    steps: [
      {
        name: 'Checkout sources',
        uses: 'actions/checkout@v2'
      },
      {
        name: 'Setup Node.js',
        uses: 'actions/setup-node@v2',
        with: {
          'node-version': '14',
        },
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
          './build.sh'
        ].join('\n')
      },
      {
        name: 'Build Docs Site',
        run: './docs/build.sh website/public/docs'
      },
      {
        name: 'Deploy',
        uses: 'peaceiris/actions-gh-pages@v3',
        with: {
          github_token: '${{ secrets.GITHUB_TOKEN }}',
          publish_dir: './website/public'
        }
      }
    ]
  }
});

// The API reference is generated when the website is built and released
// on the main branch, so the files should not be committed to the repo.
// See docs/build.sh.
const packages = [
  'cdk8s',
  'cdk8s-plus-22',
  'cdk8s-plus-23',
  'cdk8s-plus-24',
  'cdk8s-plus-25',
];
for (const pkg of packages) {
  for (const language of ['java', 'typescript', 'python']) {
    project.gitignore.exclude(`/docs/reference/${pkg}/${language}.md`);
  }
}

const integJob = 'integ';
const oses = ['windows-latest', 'macos-latest', 'ubuntu-latest'];
const integWorkflow = project.github.addWorkflow(integJob);
integWorkflow.on({
  pull_request: {},
  workflow_dispatch: {},
});
integWorkflow.addJob(integJob, {
  runsOn: '${{ matrix.os }}',
  strategy: {
    failFast: false,
    matrix: {
      domain: {
        os: ['windows-latest', 'macos-latest', 'ubuntu-latest']
      }
    }
  },
  permissions: {
    contents: JobPermission.READ,
  },
  steps: [
    { uses: 'actions/checkout@v2' },
    {
      name: 'Set up Node.js',
      uses: 'actions/setup-node@v2',
      with: {
        'node-version': '14',
      },
    },
    {
      name: 'Set up Python 3.x',
      uses: 'actions/setup-python@v2',
      with: {
        'python-version': '3.x',
      },
    },
    {
      name: 'Install pipenv',
      run: 'pip install pipenv',
    },
    {
      name: 'Set up Go',
      uses: 'actions/setup-go@v2',
      with: {
        'go-version': '1.16',
      },
    },
    {
      name: 'Install dependencies',
      run: 'yarn install --frozen-lockfile',
    },
    {
      name: 'Run integration tests',
      run: `yarn run ${integTask.name}`,
    },
  ],
});

for (const os of oses) {
  project.autoMerge.addConditions(`status-success=${integJob} (${os})`);
}

project.synth();