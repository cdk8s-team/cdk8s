import { YarnMonoRepoProject } from '../projen-contrib/yarn-mono-repo';
import * as pj from 'projen';

const CONSTRCUTS_VERSION = '3.2.34';

export class Cdk8s {

  constructor(repo: YarnMonoRepoProject, common: Omit<pj.NodeProjectOptions, 'name'>) {

    const cdk8s = repo.addJsiiPackage('packages/cdk8s', {
      ...common,

      // bahhh
      repository: common.repository!,
      authorName: common.authorName!,
      authorAddress: common.authorEmail!,
      compat: common.stability === 'stable',

      name: 'cdk8s',
      description: 'Cloud Development Kit for Kubernetes',
      peerDeps: [
        `constructs@^${CONSTRCUTS_VERSION}`,
      ],
      bundledDeps: [
        'yaml@2.0.0-1',
        'json-stable-stringify',
        'follow-redirects',
        'fast-json-patch',
      ],
      devDeps: [
        '@types/follow-redirects',
        '@types/json-stable-stringify',
        '@types/yaml',
        'json-schema-to-typescript'
      ],
      java: {
        javaPackage: 'org.cdk8s',
        mavenGroupId: 'org.cdk8s',
        mavenArtifactId: 'cdk8s'
      },
      python: {
        distName: 'cdk8s',
        module: 'cdk8s'
      },
      dotnet: {
        dotNetNamespace: 'Org.Cdk8s',
        packageId: 'Org.Cdk8s'
      },
    });

    cdk8s.gitignore.include('/src/_loadurl.js');
    cdk8s.compileTask.exec('cp src/_loadurl.js lib/');

  }

}