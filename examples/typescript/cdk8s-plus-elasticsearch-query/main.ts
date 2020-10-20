import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';
import { Elasticsearch } from './imports/elasticsearch.k8s.elastic.co/elasticsearch';
import * as kplus from 'cdk8s-plus';

export class MyChart extends Chart {
  constructor(scope: Construct, name: string) {
    super(scope, name);

    // define resources here
    const esPort = 9200;
    const elastic = new Elasticsearch(this, 'Elasticsearch', {
      spec: {
        version: '7.7.1',
        nodeSets: [{
          count: 1,
          name: 'default',
          config: {
            'node.master': true,
            'node.data': true,
            'node.ingest': true,
            'node.store.allow_mmap': false,
            'xpack.security.enabled': true,
            'xpack.security.http.ssl.enabled': false,
          }
        }],
        http: {
          service: {
            spec: {
              ports: [{
                port: esPort
              }]
            }
          },
          tls: {
            selfSignedCertificate: {
              disabled: true
            }
          }
        }
      }
    })

    const passwordSecret = kplus.Secret.fromSecretName(`${elastic.name}-es-elastic-user`);

    const workingDir = '/root';
    const queryPort = 8000;
    const container = new kplus.Container({
      image: 'node:12.18.0-stretch',
      workingDir: workingDir,
      command: ['node', 'query.js', queryPort.toString()],
      port: queryPort,
      env: {
        ELASTIC_USERNAME: kplus.EnvValue.fromValue('elastic'),
        ELASTIC_ENDPOINT: kplus.EnvValue.fromValue(`http://${elastic.name}-es-http:${esPort}`),
        ELASTIC_PASSWORD: kplus.EnvValue.fromSecretValue({ secret: passwordSecret, key: 'elastic' })
      }
    })

    const configMap = new kplus.ConfigMap(this, 'Config');
    configMap.addFile(`${__dirname}/query.js`);

    const volume = kplus.Volume.fromConfigMap(configMap);
    container.mount(workingDir, volume);

    const deployment = new kplus.Deployment(this, 'Deployment', {
      replicas: 1,
      containers: [container]
    })

    deployment.expose(9000);

  }
}

const app = new App();
new MyChart(app, 'elasticsearch-query');
app.synth();
