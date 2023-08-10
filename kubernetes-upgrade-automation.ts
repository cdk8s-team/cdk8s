import { Component, typescript } from 'projen';
import * as fs from 'fs';
import { GithubCredentials, GithubWorkflow, WorkflowActions, workflows } from 'projen/lib/github';
import path from 'path';

export class K8sVersionUpgrade extends Component {

    constructor(project: typescript.TypeScriptAppProject, latestVersion: string) {
        super(project);

        const workflow: GithubWorkflow = project.github!.addWorkflow('k8s-upgrade-automation-step1');

        // Running weekly on Sunday at 18:00 UTC
        // https://docs.github.com/en/actions/using-workflows/events-that-trigger-workflows#schedule
        // Reason for adding a buffer here is because Github does not guarantee running action on
        // scheduled time
        // const schedule = '0 18 * * 0';
        const trigger: workflows.Triggers = {
            // schedule: [{
            // cron: schedule,
            // }],
            workflowDispatch: {},
        };

        const latestK8sVersion = latestVersion;
        const latestVersionNumber = Number(latestK8sVersion.split('.')[1]);
1
        const runsOn = ['ubuntu-latest'];

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
                        'labels' : `backport-to-k8s-${latestVersionNumber - 1}/main`,
                        'repo' : 'cdk8s-team/cdk8s-plus',
                        // don't think I'm able to specify the label color with this though ...
                    }
                    // run: `git checkout -b k8s.${latestVersionNumber}`,
                    // env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
                    // continueOnError: false,
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

        workflow.addJob('create-new-plus-branch', createNewPlusBranch);
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