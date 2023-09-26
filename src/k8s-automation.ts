import { Component } from 'projen';
import * as typescript from 'projen/lib/typescript';
import { GithubWorkflow, workflows, WorkflowActions, GithubCredentials } from 'projen/lib/github';
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
      workflowDispatch: {
        inputs: {
          testingMode: {
            description: 'Testing Mode',
            required: true,
            default: false,
          },
        },
      },
      schedule: [{
        cron: schedule,
      }],
      // this is for testing purposes only:
      push: {
        branches: ['sumughan/automate-k8s-release-step1'],
      },
    };
    workflow.on(trigger);

    const runsOn = ['ubuntu-latest'];

    // PART 0: Check Latest Kubernetes Version Online

    const checkLatestVersion: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      outputs: {
        latestVersion: {
          stepId: 'k8s-latest-version',
          outputName: 'latestVersion',
        },
        previousVersion: {
          stepId: 'k8s-previous-version',
          outputName: 'previousVersion',
        },
        httpStatus: {
          stepId: 'get-npm-status-code',
          outputName: 'httpStatus',
        },
      },
      steps: [
        {
          id: 'get-k8s-latest-release',
          name: 'Get latest K8s Release',
          uses: 'pozetroninc/github-action-get-latest-release@master',
          with: {
            repository: 'kubernetes/kubernetes',
            excludes: 'prerelease, draft',
          },
        },
        {
          id: 'k8s-latest-version',
          name: 'Get latest K8s minor version',
          run: 'echo latestVersion="$(cut -d "." -f 2 <<< "${{ steps.get-k8s-latest-release.outputs.release }}")" >> $GITHUB_OUTPUT',
        },
        {
          id: 'k8s-previous-version',
          name: 'Get latest K8s minor version',
          run: 'echo previousVersion=$(( latestVersion - 1 )) >> $GITHUB_OUTPUT',
        },
        {
          id: 'get-npm-status-code',
          name: 'Check to see if cdk8s-plus released latest k8s version on npm by getting HTTP status code from npm url',
          // run on previous version for testing purposes only:
          run: 'echo httpStatus="$(curl -sL -w "%{http_code}\n" "https://www.npmjs.com/package/cdk8s-plus-27" -o /dev/null)" >> $GITHUB_OUTPUT',
          //run: 'echo httpStatus="$(curl -sL -w "%{http_code}\n" "https://www.npmjs.com/package/cdk8s-plus-${{steps.k8s-latest-version.outputs.latestVersion}}" -o /dev/null)" >> $GITHUB_OUTPUT',
        },
      ],
    };

    workflow.addJob('check-latest-k8s-release', checkLatestVersion);
    // PART 1: Prerequisite

    const generateK8sSpecJob: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      needs: ['check-latest-k8s-release'],
      if: 'needs.check-latest-k8s-release.outputs.httpStatus == 200',
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
          run: '${{ github.workspace }}/tools/import-spec.sh 1.${{ needs.check-latest-k8s-release.outputs.latestVersion }}.0',
          env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
          continueOnError: false,
        },
        // not auto-approve when debugging
        // ...WorkflowActions.createPullRequest({
        //   workflowName: 'create-pull-request',
        //   pullRequestTitle: 'chore: v${{ needs.check-latest-k8s-release.outputs.latestVersion }} kubernetes-spec',
        //   pullRequestDescription: 'This PR is adds the v${{ needs.check-latest-k8s-release.outputs.latestVersion }} Kubernetes spec. This is required in order for us to add a new version to cdk8s-plus.',
        //   branchName: 'github-actions/generate-k8s-spec-${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
        //   // labels: [
        //   //   'auto-approve',
        //   // ],
        //   credentials: GithubCredentials.fromPersonalAccessToken(),
        // }),
      ],
    };

    workflow.addJob('generate-new-k8s-spec', generateK8sSpecJob);


    const createGoRepoBranchJob: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      needs: ['check-latest-k8s-release'],
      if: 'needs.check-latest-k8s-release.outputs.httpStatus == 200',
      steps: [
        {
          name: 'Checkout',
          uses: 'actions/checkout@v2',
          with: {
            repository: 'cdk8s-team/cdk8s-plus-go',
          },
        },
        // might be unnecessary:
        // {
        //   name: 'Create new branch',
        //   run: 'git checkout -b k8s.${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
        //   env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
        //   continueOnError: false,
        // },
        // {
        //   name: 'Push new branch',
        //   run: 'git push --set-upstream origin k8s.${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
        //   env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
        //   continueOnError: false,
        // },
      ],
    };

    workflow.addJob('create-go-repo-branch', createGoRepoBranchJob);

    const createNewBackportLabel: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      needs: ['check-latest-k8s-release'],
      if: 'needs.check-latest-k8s-release.outputs.httpStatus == 200',
      steps: [
        {
          name: 'Checkout',
          uses: 'actions/checkout@v2',
          with: {
            repository: 'cdk8s-team/cdk8s-plus',
          },
        },
        // {
        //   name: 'Create new backport label for old version',
        //   uses: 'actions-ecosystem/action-add-labels@v1',
        //   with: {
        //     labels: 'backport-to-k8s-${{ needs.check-latest-k8s-release.outputs.previousVersion }}/main',
        //     repo: 'cdk8s-team/cdk8s-plus',
        //     // don't think I'm able to specify the label color with this though ...
        //   },
        // },
      ],
    };

    workflow.addJob('add-backport-label', createNewBackportLabel);

    // PART 2: Creating the new CDK8s+ Branch

    const createNewPlusBranch: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      needs: ['check-latest-k8s-release', 'generate-new-k8s-spec'],
      steps: [
        {
          name: 'Checkout',
          uses: 'actions/checkout@v2',
          with: {
            repository: 'cdk8s-team/cdk8s-plus',
          },
        },
        {
          name: 'Create new branch',
          run: 'git checkout -b k8s-${{ needs.check-latest-k8s-release.outputs.latestVersion}}/main${{ needs.check-latest-k8s-release.outputs.previousVersion}}',
          env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
          continueOnError: false,
        },
        {
          name: 'Update reference of latest cdk8s version in txt file',
          run: 'echo "${{ needs.check-latest-k8s-release.outputs.latestVersion }}" >> ${{ github.workspace }}/projenrc/latest-k8s-version.txt',
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
          name: 'Let projen update the remaining files',
          run: 'npx projen build',
        },
        {
          name: 'Update references of old kubernetes versions with projen task',
          // this will throw an error until the PR for adding this projentask is merged:
          run: 'npx projen update-k8s-version-references',
          env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
          continueOnError: false,
        },
        // {
        //   name: 'Push the branch and verify that automation builds/tags/releases the new version successfully.',
        //   run: 'git push --set-upstream origin k8s-${{ needs.check-latest-k8s-release.outputs.latestVersion }}/main',
        //   env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
        //   continueOnError: false,
        // },
        // {
        //   name: 'Create a p0 issue to set the new default branch of the cdk8s-plus repo',
        //   uses: 'actions-ecosystem/action-create-issue@v1',
        //   with: {
        //     github_token: '${{ secrets.PROJEN_GITHUB_TOKEN }}',
        //     title: 'chore: set default branch of cdk8s-plus repo to latest for v${{ needs.check-latest-k8s-release.outputs.latestVersion }} k8s upgrade',
        //     body: 'The default branch must be manually set to k8s-${{ needs.check-latest-k8s-release.outputs.latestVersion }}/main',
        //     labels: [
        //       'priority/p0',
        //     ],
        //   },
        // },
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
      // add the cdk8s-plus update job to needs when it's done:
      needs: ['check-latest-k8s-release', 'create-new-plus-branch'],
      if: 'needs.check-latest-k8s-release.outputs.httpStatus == 200',
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
            branch: 'cdk8s-upgrade/v${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
            // not sure what to do for sha here.
            sha: '${{ github.event.pull_request.head.sha }}',
          },
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
          name: 'Update references to newest k8s version in cdk8s repo',
          run: 'npx projen replace-old-version-references',
          env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
          continueOnError: false,
        },
        ...WorkflowActions.createPullRequest({
          workflowName: 'create-pull-request',
          pullRequestTitle: 'chore(website): cdk8s-plus-${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
          pullRequestDescription: 'This PR updates the website with the latest version of cdk8s-plus.',
          branchName: 'github-actions/website-update-${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
          credentials: GithubCredentials.fromPersonalAccessToken(),
          // labels: [
          //   'auto-approve',
          // ],
        }),
      ],
    };

    workflow.addJob('update-cdk8s-website', updateCdk8s);

    const updateCdkOps: workflows.Job = {
      runsOn: runsOn,
      permissions: {
        contents: workflows.JobPermission.READ,
        pullRequests: workflows.JobPermission.WRITE,
      },
      needs: ['check-latest-k8s-release', 'update-cdk8s-website'],
      steps: [
        {
          name: 'Checkout',
          uses: 'actions/checkout@v2',
          with: {
            repository: 'cdk8s-team/cdk-ops',
          },
        },
        {
          name: 'Update latest cdk8s-plus version in cdk-ops repo',
          // the PR must be merged in cdk-ops for this to work
          run: 'echo "${{ needs.check-latest-k8s-release.outputs.latestVersion }}" >> ${{ github.workspace }}/projenrc/latest-cdk8s-version.txt',
          env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
          continueOnError: false,
        },
        // not autoapprove for debugging as well
        // ...WorkflowActions.createPullRequest({
        //   workflowName: 'create-pull-request',
        //   pullRequestTitle: 'chore: updating latest cdk8s-plus version to v${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
        //   pullRequestDescription: 'This PR updates the reference to of the latest cdk8s-plus version',
        //   branchName: 'github-actions/cdk-ops-k8s-upgrade-${{ needs.check-latest-k8s-release.outputs.latestVersion }}',
        //   labels: [
        //     'auto-approve',
        //   ],
        //   credentials: GithubCredentials.fromPersonalAccessToken(),
        // }),
      ],
    };

    workflow.addJob('update-cdk-ops', updateCdkOps);
  }
}