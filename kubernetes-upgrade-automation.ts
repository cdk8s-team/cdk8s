import { Component, typescript } from 'projen';
import { GithubCredentials, GithubWorkflow, WorkflowActions, workflows } from 'projen/lib/github';


export class K8sUpgradeAutomation extends Component {
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

    const latestK8sVersion = '1.27.0';

    const runsOn = ['ubuntu-latest'];

    const summaries: workflows.Job = {
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
        // {
        //   name: 'Run Summaries Script',
        //   run: 'npx ts-node ${{ github.workspace }}/src/construct-squad/weekly-stats.ts',
        //   env: { GITHUB_TOKEN: '${{ secrets.PROJEN_GITHUB_TOKEN }}' },
        //   continueOnError: false,
        // },
        // ...WorkflowActions.createPullRequest({
        //   workflowName: 'create-pull-request',
        //   pullRequestTitle: `chore: v${latestK8sVersion} kubernetes-spec`,
        //   pullRequestDescription: `This PR is adds the v${latestK8sVersion} Kubernetes spec. This is required in order for us to add a new version to cdk8s-plus.`,
        //   branchName: `github-actions/generate-k8s-spec-${latestK8sVersion}`,
        //   labels: [
        //     'auto-approve',
        //   ],
        //   credentials: GithubCredentials.fromPersonalAccessToken(),
        // }),
      ],
    };

    workflow.on(trigger);
    workflow.addJob('generate-summaries', summaries);
  }
}