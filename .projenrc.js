const { Project, github } = require('projen');

const project = new Project({});

project.gitignore.exclude('**/dist');
project.gitignore.exclude('**/.vscode');
project.gitignore.exclude('**/coverage');
project.gitignore.exclude('**/node_modules');

const gh = new github.GitHub(project);
const dependencies = gh.addWorkflow('dependencies');

const job = {
  "runs-on": "ubuntu-latest",
  "steps": [
    {
      "name": "Checkout",
      "uses": "actions/checkout@v2"
    },
    {
      "name": "Setup Node",
      "uses": "actions/setup-node@v1",
      "with": {
        "node-version": "10.17.0"
      }
    },
    {
      "name": "Upgrade lock file",
      "run": "yarn upgrade",
    },
    {
      "name": "Update CLI package.json",
      "run": "cd packages/cdk8s-cli && npx npm-check-updates -u --target=minor",
    },
    {
      "name": "Create Pull Request",
      "uses": "peter-evans/create-pull-request@v3",
      "with": {
        "token": "${{ secrets.GITHUB_TOKEN }}",
        "commit-message": "Upgrade yarn.lock",
        "branch": "github-actions/dependencies",
        "title": "chore(deps): Upgrade dependencies",
        "body": "This PR upgrades yarn dependencies to the latest versions.\n\n------\n\n*Automatically created via GitHubActions*\n",
        "labels": "auto-merge"
      }
    },
  ]
}

dependencies.on({ push: { branches: ['epolon/master'] } });
dependencies.addJobs({ upgrade: job });

project.synth();