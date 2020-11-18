# Job

Jobs are a very useful concept in kubernetes deployments.
They can be used for add-hoc provisioning tasks, as well as long running processing jobs.

In configuration, they don't differ much from regular pods, but offer some
additional properties.

!!! tip ""
    [API Reference](../reference/cdk8s-plus-17.md#cdk8s-plus-17-job)

## Delete a Job after its finished

You can configure a TTL for the job after it finished its execution successfully.

```typescript
import * as k from 'cdk8s';
import * as kplus from 'cdk8s-plus-17';

const app = new k.App();
const chart = new k.Chart(app, 'Chart');

// let's define a job spec, and set a 1 second TTL.
const load = new kplus.Job(chart, 'LoadData', {
  ttlAfterFinished: kplus.Duration.seconds(1)
 });


// now add a container to all the pods created by this job
job.addContainer({
  image: 'loader'
});
```
