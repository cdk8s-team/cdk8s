# CronJob

CronJob resource is responsible for creating recurring [Jobs](https://kubernetes.io/docs/concepts/workloads/controllers/job/). The job recurrence is determined by a [Schedule](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/schedule.ts).

CronJob is similar to a [job](https://cdk8s.io/docs/latest/plus/job/) but it is suitable when there is a need to run a job indefinitely following a schedule. These repetitive jobs can be utilized for recurring tasks such as backing up a database, pinging a server for health checks, creating snapshots of systems and much more.

!!! tip "" 
     [API Reference](../reference/cdk8s-plus-24/typescript.md#cronjob)

## Creating a CronJob

You can create a cronjob using a cdk8s+ CronJob construct. The library provides a set of defaults, so to provision a CronJob instance you just need to provide it with the job's properties.

### Creating a CronJob using CronJob construct:

```typescript
import { App, Chart, Duration, Schedule } from 'cdk8s';
import * as kplus from 'cdk8s-plus-24';

const app = new App();
const chart = new Chart(app, 'Chart');

// lets setup a cron job here which backups mysql database
// by default cronjob would schedule job to run every minute
const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
  jobProperties: {
    activeDeadline: Duration.minutes(5),
    backoffLimit: 5,
    },
  containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
});
```

### You can also configure the parameters of a CronJob:

* ### `schedule`
This enables you to provide the CronJob with a schedule. The job recurrence is then set based on provided schedule. If it is not provided, by default your job would run every minute.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    schedule: {
      minute: '5',
      hour: '*',
      day: '*',
      month: '*',
      year: '*',
    },
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `timezone`
This properties helps you to set timezone for your CronJob so that your scheduled job works as expected. If it is not set, the timezone is set to the timezone of the kube-controller-manager. 
  
  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    timezone: 'America/Los_Angeles',
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `concurrencyPolicy`
  This policy helps your CronJob to determine how to handle concurrent executions of jobs. The valid values for this policy are, 
  * Allow
  * Forbid
  * Replace
  If it is not set, the default value is Allow.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    concurrencyPolicy: k8splus.ConcurrencyPolicy.ALLOW,
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `startingDeadline`
  This deadline helps your CronJob know by when the next execution of job should start by. If the job is not scheduled by this time, it is considered to be failing.
  
  For instance, if a job was scheduled to run every 5 minutes and you have mentioned a *startingDeadline* of 30 seconds. Then the job status would be updated as failed if the job does not start by 5 minutes and 30 seconds after the start time of previous job.

  By default, there is no deadline.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    startingDeadline: Duration.seconds(30),
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `suspend`
  You can use this to stop the subsequent executions of the recurring job.If not set, it sets to default.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    suspend: false,
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `successfulJobsRetained`
  By specifying this, you can retain certain number of successful job run's history. This can help evaluate logs of these job runs. Be default, this is set to 3.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    successfulJobsRetained: 5,
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```

* ### `failedJobsRetained`
  By specifying this, you can retain certain number of unsuccessful job run's history. This can help evaluate logs of these job runs. Be default, this is set to 1.

  ```typescript
  const backupCronJob = new k8splus.CronJob(this, 'BackupCronJob', {
    jobProperties: {
      activeDeadline: Duration.minutes(5),
      backoffLimit: 5,
      },
    failedJobsRetained: 5,
    containers: [
      {
        image: 'databack/mysql-backup',
      }
    ]
  });
  ```