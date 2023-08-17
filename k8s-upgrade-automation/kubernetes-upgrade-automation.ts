import { Component, typescript } from 'projen';
import * as fs from 'fs';
import { GithubCredentials, GithubWorkflow, WorkflowActions, workflows } from 'projen/lib/github';
import path from 'path';

export class K8sVersionUpgradeAutomation extends Component {

    constructor(project: typescript.TypeScriptAppProject) {
        super(project);

        const workflow: GithubWorkflow = project.github!.addWorkflow('k8s-upgrade-automation');

        // Running weekly on Sunday at 18:00 UTC
        // https://docs.github.com/en/actions/using-workflows/events-that-trigger-workflows#schedule
        // Reason for adding a buffer here is because Github does not guarantee running action on
        // scheduled time
        const schedule = '0 18 * * 0';
        const trigger: workflows.Triggers = {
            schedule: [{
            cron: schedule,
            }],
            workflowDispatch: {},
        };

        // const latestK8sVersion = latestVersion;
        // let latestK8sVersion = fs.readFileSync('docs/plus/index.md', 'utf-8');
        const latestVersionNumber = 27;
        // Number(latestK8sVersion.split('.')[1]);

        const runsOn = ['ubuntu-latest'];

        // PART 0: Check Latest Kubernetes Version Online

        const checkLatestVersion: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    id: 'k8s-latest-release',
                    name: 'Get latest K8s Release',
                    uses: 'pozetroninc/github-action-get-latest-release@master',
                    with: {
                        'repository' : 'kubernetes/kubernetes',
                        'excludes' : 'prerelease, draft',
                    },
                },
            ],
        }

        workflow.addJob('check-latest-k8s-release', checkLatestVersion);

        // PART 1: Prerequisite

        const generateK8sSpecJob: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    name: 'Checkout',
                    uses: 'actions/checkout@v2',
                },
                {
                    name: 'Setup Node.js',
                    uses: 'actions/setup-node@v2',
                    with: { 'node-version': '18.12.0' },
                },
                {
                    name: 'Install dependencies',
                    run: 'yarn install --check-files',
                },
                {
                    name: 'Generate Kubernetes schema',
                    run: 'npx ts-node ${{ github.workspace }}' + `/tools/import-spec.sh ${latestK8sVersion}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                ...WorkflowActions.createPullRequest({
                    workflowName: 'create-pull-request',
                    pullRequestTitle: `chore: v${latestK8sVersion} kubernetes-spec`,
                    pullRequestDescription: `This PR is adds the v${latestK8sVersion} Kubernetes spec. This is required in order for us to add a new version to cdk8s-plus.`,
                    branchName: `github-actions/generate-k8s-spec-${latestK8sVersion}`,
                    labels: [
                    'auto-approve',
                    ],
                    credentials: GithubCredentials.fromPersonalAccessToken(),
                }),
            ],
        };

        const createGoRepoBranchJob: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    name: 'Checkout',
                    uses: 'actions/checkout@v2',
                    with: {
                        'repository' : 'cdk8s-team/cdk8s-plus-go',
                    },
                },
                {
                    name: 'Create new branch',
                    run: `git checkout -b k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                {
                    name: 'Push new branch',
                    run: `git push --set-upstream origin k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
            ],
        };

        const createNewBackportLabel: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    name: 'Checkout',
                    uses: 'actions/checkout@v2',
                    with: {
                        'repository' : 'cdk8s-team/cdk8s-plus',
                    },
                },
                {
                    name: 'Create new backport label for old version',
                    uses: 'actions-ecosystem/action-add-labels@v1',
                    with: {
                        labels : `backport-to-k8s-${latestVersionNumber - 1}/main`,
                        repo : 'cdk8s-team/cdk8s-plus',
                        // don't think I'm able to specify the label color with this though ...
                    },
                },
            ],
        };

        workflow.on(trigger);
        workflow.addJob('generate-k8s-spec', generateK8sSpecJob);
        workflow.addJob('create-go-branch', createGoRepoBranchJob);
        workflow.addJob('create-backport-label', createNewBackportLabel);

        // PART 2: Creating the new CDK8s+ Branch

        const createNewPlusBranch: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    name: 'Checkout',
                    uses: 'actions/checkout@v2',
                    with: { 'repo' : 'cdk8s-team/cdk8s-plus' },
                },
                {
                    name: 'Create new branch',
                    // action from https://github.com/peterjgrainger/action-create-branch
                    uses: 'peterjgrainger/action-create-branch@v2.2.0',
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    with: {
                        branch : `k8s-${latestVersionNumber}/main`,
                        // not sure what to do for sha here.
                        sha: '${{ github.event.pull_request.head.sha }}',
                    },
                },
                {
                    name: 'Update projen and README references to latest k8s version',
                    // figure out where I'm writing this script!
                    run: `git push --set-upstream origin k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                {
                    name: 'Setup Node.js',
                    uses: 'actions/setup-node@v2',
                    with: { 'node-version': '18.12.0' },
                },
                {
                    name: 'Install dependencies',
                    run: 'yarn install --check-files',
                },
                {
                    name: 'Import the new k8s spec from the prerequisite step',
                    run: 'yarn run import',
                },
                {
                    name: 'Start local kubernetes cluster',
                    run: 'yarn run import',
                    // FIGURE OUT how/where to run kubernetes cluster and configure kubectl to it
                },
                {
                    name: 'Generate API types from the local Kubernetes cluster',
                    run: 'yarn regenerate-api-information',
                },
                {
                    name: 'Let projen update the remaining files',
                    run: 'yarn build',
                },
                {
                    name: 'Update references in docs/plus/**',
                    // figure out where I'm writing this script again!
                    run: `git push --set-upstream origin k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                {
                    name: 'Push the branch and verify that automation builds/tags/releases the new version successfully.',
                    run: `git push --set-upstream origin k8s-${latestVersionNumber}/main`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                {
                    name: 'Set new branch as default branch for repo',
                    // this might have to be done manually - maybe create a github issue for it?
                },
            ],
        };

        workflow.addJob('create-new-plus-branch', createNewPlusBranch);

        // PART 3: Update CDK8s

        const updateCdk8s: workflows.Job = {
            runsOn: runsOn,
            permissions: {
                contents: workflows.JobPermission.READ,
                pullRequests: workflows.JobPermission.WRITE,
            },
            steps: [
                {
                    name: 'Checkout',
                    uses: 'actions/checkout@v2',
                },
                {
                    name: 'Create new branch',
                    // action from https://github.com/peterjgrainger/action-create-branch
                    uses: 'peterjgrainger/action-create-branch@v2.2.0',
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    with: {
                        branch : `cdk8s-upgrade/v${latestK8sVersion}`,
                        // not sure what to do for sha here.
                        sha: '${{ github.event.pull_request.head.sha }}',
                    },
                },
                {
                    name: 'Update references to newest k8s version in cdk8s repo',
                    // figure out where I'm writing this script!
                    run: `git push --set-upstream origin k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                {
                    name: 'Let projen update the remaining files',
                    run: 'yarn build',
                },
                {
                    name: 'Update references in docs/** with new syntax',
                    // figure out where I'm writing this script!
                    run: `git push --set-upstream origin k8s.${latestVersionNumber}`,
                    env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    continueOnError: false,
                },
                ...WorkflowActions.createPullRequest({
                    workflowName: 'create-pull-request',
                    pullRequestTitle: `chore(website): cdk8s-plus-${latestVersionNumber}`,
                    pullRequestDescription: `This PR updates the website with the latest version of cdk8s-plus.`,
                    branchName: `github-actions/website-update-${latestK8sVersion}`,
                    credentials: GithubCredentials.fromPersonalAccessToken(),
                }),
            ],
        };

        workflow.addJob('update-cdk8s-website', updateCdk8s);
    }
}

export class K8sUpgradeStep2 extends Component {

    constructor(project: typescript.TypeScriptAppProject, newK8sVersion: Number) {
        super(project);

        const cdk8sPlusDirPath = '../cdk8s-plus/';

        const prevK8sVersion = String(newK8sVersion ?? 27 - 1);
        const latestK8sVersion = String(newK8sVersion);

        // replace old version with latest version in projen file
        let projenrcFileData = fs.readFileSync('.projenrc.ts', 'utf-8');
        projenrcFileData = projenrcFileData.replace(prevK8sVersion, latestK8sVersion);
        fs.writeFileSync('.projenrc.ts', projenrcFileData);

        // update all files in cdk8s-plus/docs/plus/ with the new syntax, replacing old references of prev cdk8s-plus versions
        const plusDocsDir = path.join(cdk8sPlusDirPath, 'docs/plus');
        const files = fs.readdirSync(plusDocsDir);
        for (const fileName in files) {
            let docFileData = fs.readFileSync(path.join(plusDocsDir, fileName), 'utf-8');
            docFileData = docFileData.replace('cdk8s-plus-'+prevK8sVersion, 'cdk8s-plus-'+latestK8sVersion);
            fs.writeFileSync(path.join(plusDocsDir, fileName), docFileData);
        };
    }
  }