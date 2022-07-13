# CronJob

CronJob resource is responsible for creating recurring [Jobs](https://kubernetes.io/docs/concepts/workloads/controllers/job/). The job schedule is determined by a [cron pattern](https://en.wikipedia.org/wiki/Cron) which is similar to Unix and Linux systems.

CronJob is similar to a job but it is suitable when there is a need to run a job indefinitely following a schedule. For more information about CronJobs, please take a look at official [Kubernetes documentation](https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/).

## Creating a CronJob

You can create a cronjob using a cdk8s+ CronJob construct.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// lets define a database backup job with activeDeadline and backoffLimit
const databaseBackupJob = new k8splus.Job(this, 'BackupJob', {
  activeDeadline: Duration.minutes(5),
  backoffLimit: 5,
});

// lets add a mysql container to our job. This adds this container to all pods created for this job.
databaseBackupJob.addContainer({
  image: 'databack/mysql-backup'
});

// lets setup a cron job here which backups mysql database following a cron pattern schedule
const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
  job: databaseBackupJob,
  schedule: '* * * * *',
  timezone: 'PDT',
  concurrencyPolicy: 'Allow',
  startingDeadlineSeconds: Duration.seconds(30),
  suspend: false,
  successfulJobsHistoryLimit: '5',
  failedJobsHistoryLimit: '5',
});
```