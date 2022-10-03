# CronJob

CronJob resource is responsible for creating recurring [Jobs](https://kubernetes.io/docs/concepts/workloads/controllers/job/). The job recurrence is determined by a [Cron](https://github.com/cdk8s-team/cdk8s-core/blob/2.x/src/cron.ts) expression.

CronJob is similar to a [job](https://cdk8s.io/docs/latest/plus/job/) but it is suitable when there is a need to run a job indefinitely following a schedule. These repetitive jobs can be utilized for recurring tasks such as backing up a database, pinging a server for health checks, creating snapshots of systems and much more.

!!! tip "" 
     [API Reference](../reference/cdk8s-plus-24/typescript.md#cronjob)

## Creating a `CronJob`

```typescript
import * as kplus from 'cdk8s-plus-24';
import { Construct } from 'constructs';
import { App, Chart, ChartProps, Cron } from 'cdk8s';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = { }) {
    super(scope, id, props);

    new kplus.CronJob(this, 'CronJob', {
      containers: [{
        image: 'databack/mysql-backup',
      }],
      // You can pass a custom cron schedule using our Cron class
      schedule: Cron.schedule({
        minute: '*',
        hour: '*',
        day: '*',
        month: '*',
        weekDay: '*',
      }),
    });
  }
}

const app = new App();
new MyChart(app, 'cronjob-readme');
app.synth();

```

### Defaults

The above would create a cronjob resource which would schedule `databack/mysql-backup` to run every minute. With this resource, we also set some meaningful defaults. For instance, this cronjob would not run jobs concurrently by default. It will also retain 3 instance of successful job runs and 1 instance of a failed run for debugging later if needed. To customize the properties, see [API Reference](../reference/cdk8s-plus-24/typescript.md#cronjob).

### Helper Functions

As we see in the previous example, we can pass custom cron expression for scheduling our jobs. But, we have also have added helper functions that would make it easy to mention some of the commonly used schedules. These include scheduling jobs to run every minute, hour, day, week, month or year. For instance, the same example mentioned before could be written as,

```typescript
new kplus.CronJob(this, 'CronJob', {
  containers: [{
    image: 'databack/mysql-backup',
  }],
  // This would schedule jobs to be scheduled to run every minute
  schedule: Cron.everyMinute(),
});
```

### Validations

The cronjob construct also validates some of the properties so that the manifest created works as expected. 

* You cannot pass `startingDeadline` property value less that 10 seconds. This is because the Kubernetes CronJobController checks things every 10 seconds and if the value passed is less than 10 then the jobs would not be scheduled.

* `ttlAfterFinished` job property limits the lifetime of a job that has finished execution. You cannot pass the `ttlAfterFinished` property with any/both of the `successfulJobsRetained` and `failedJobsRetained` property since this would not let retention of jobs work in a expected manner.