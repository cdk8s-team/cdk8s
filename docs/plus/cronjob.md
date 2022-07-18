# CronJob

CronJob resource is responsible for creating recurring [Jobs](https://kubernetes.io/docs/concepts/workloads/controllers/job/). The job recurrence is determined by a [Schedule]() provided. You can also specify a custom schedule by passing a [cron pattern](https://en.wikipedia.org/wiki/Cron) to Schedule's cron method.

CronJob is similar to a job but it is suitable when there is a need to run a job indefinitely following a schedule. These repitive jobs can be utilized for recurring tasks like backing up a database, pinging a server for health checks, creating snapshots of system and much more.

Some of the properties that can be configured for a CronJob are,

* ### `concurrencyPolicy`
  Policy to determine how to handle concurrent executions of jobs. The valid values for this policy are, Allow, Forbid and Replace.

* ### `startingDeadline`
  Deadline for a job to run by if it misses its scheduled time. 
  
  For instance, if a job was scheduled to run every 5 minutes and you have mentioned a *startingDeadline* of 30 seconds. Then the job status would be updated as failed if the job does not start by 5 minutes and 30 seconds after the start time of previous job.

* ### `successfulJobsRetained`
  Number of successful job runs retained during CronJob execution.

* ### `failedJobsRetained`
  Number of failed job runs retained during CronJob execution.

## Creating a CronJob

You can create a cronjob using either a cdk8s+ CronJob construct or cdk8s+ Job construct's schedule method. 

The following are examples for each.

### Creating a CronJob using CronJob construct:

```typescript
import { App, Chart, Duration, Schedule } from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new App();
const chart = new Chart(app, 'Chart');

// lets define a database backup job with activeDeadline and backoffLimit
const databaseBackupJob = new k8splus.Job(this, 'BackupJob', {
  activeDeadline: Duration.minutes(5),
  backoffLimit: 5,
});

// lets add a mysql container to our job. This adds this container to all pods created for this job.
databaseBackupJob.addContainer({
  image: 'databack/mysql-backup'
});

// lets setup a cron job here which backups mysql database.
const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
  job: databaseBackupJob,
  schedule: Schedule.Daily(),
  timezone: k8splus.Timezone.PDT,
  concurrencyPolicy: k8splus.CronJobConcurrencyPolicy.ALLOW,
  startingDeadline: Duration.seconds(30),
  suspend: false,
  successfulJobsRetained: 5,
  failedJobsRetained: 5,
});
```

### Creating a CronJob using Job construct's schedule method:

```typescript
import { App, Chart, Duration, Schedule } from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new App();
const chart = new Chart(app, 'Chart');

// lets define a database backup job with activeDeadline and backoffLimit
const databaseBackupJob = new k8splus.Job(this, 'BackupJob', {
  activeDeadline: Duration.minutes(5),
  backoffLimit: 5,
});

// lets add a mysql container to our job. This adds this container to all pods created for this job.
databaseBackupJob.addContainer({
  image: 'databack/mysql-backup'
});

// lets setup a cron job here using the schedule method of Job construct.
// schedule method creates a CronJob and returns a CronJob object.
const backupCronJob = databaseBackupJob.schedule({
  schedule: Schedule.Daily(),
  timezone: k8splus.Timezone.PDT,
  concurrencyPolicy: k8splus.CronJobConcurrencyPolicy.ALLOW,
  startingDeadline: Duration.seconds(30),
  suspend: false,
  successfulJobsRetained: 5,
  failedJobsRetained: 5,
});
```