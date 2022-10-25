import { Construct } from 'constructs';
import { App, Chart, ChartProps } from 'cdk8s';
import * as kplus from 'cdk8s-plus-25';

export class MyChart extends Chart {
  constructor(scope: Construct, id: string, props: ChartProps = { }) {
    super(scope, id, props);

    const storageNodes = kplus.Node.labeled(kplus.NodeLabelQuery.is('optimized', 'storage'));
    const memoryNodes = kplus.Node.labeled(kplus.NodeLabelQuery.is('optimized', 'memory'));

    const db = new kplus.StatefulSet(this, 'DB', {
      containers: [{ image: 'db', portNumber: 8000 }],
      replicas: 2,
      spread: true,
      isolate: true,
    });
    db.scheduling.attract(storageNodes);

    const cache = new kplus.Deployment(this, 'Cache', {
      containers: [{
        image: 'cache',
        portNumber: 7000,
        envVariables: {
          DB_HOST: kplus.EnvValue.fromValue(db.service.name),
          DB_PORT: kplus.EnvValue.fromValue(db.service.port.toString()),
        }
      }],
      replicas: 2,
      spread: true,
      isolate: true,
    });
    cache.scheduling.attract(memoryNodes);

    const cacheService = cache.exposeViaService();

    const web = new kplus.Deployment(this, 'Web', {
      containers: [{
        image: 'web',
        portNumber: 6000,
        envVariables: {
          CACHE_HOST: kplus.EnvValue.fromValue(cacheService.name),
          CACHE_PORT: kplus.EnvValue.fromValue(cacheService.port.toString()),
        }
      }],
      replicas: 2,
      spread: true,
      isolate: true,
    });
    web.scheduling.attract(memoryNodes);

    web.scheduling.colocate(cache);

    web.connections.allowTo(cache);
    cache.connections.allowTo(db);

    const frontoffice = kplus.Group.fromName(this, 'FOGroup', 'frontoffice');

    web.permissions.grantReadWrite(frontoffice);
    db.permissions.grantReadWrite(frontoffice);
    cache.permissions.grantReadWrite(frontoffice);

    web.exposeViaService({ serviceType: kplus.ServiceType.LOAD_BALANCER });

  }
}

const app = new App();
new MyChart(app, 'aws-container-day');
app.synth();
