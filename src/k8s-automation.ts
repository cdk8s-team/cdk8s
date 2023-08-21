import { Component } from 'projen';
import * as typescript from 'projen/lib/typescript';
// import * as fs from 'fs';
import { GithubWorkflow, workflows } from 'projen/lib/github';
// import path from 'path';

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
      workflowDispatch: {},
      schedule: [{
        cron: schedule,
      }],
      push: {
        branches: ['sumughan/automate-k8s-release-step1'],
      },
    };

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
        // id: 'k8s-latest-release',
          name: 'Get latest K8s Release',
          uses: 'pozetroninc/github-action-get-latest-release@master',
          with: {
            repository: 'kubernetes/kubernetes',
            excludes: 'prerelease, draft',
          },
        },
      ],
    };

    workflow.addJob('check-latest-k8s-release', checkLatestVersion);
    workflow.on(trigger);
  }
}