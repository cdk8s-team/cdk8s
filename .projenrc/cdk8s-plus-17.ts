import { YarnMonoRepoProject } from '../projen-contrib/yarn-mono-repo';
import * as pj from 'projen';
import * as path from 'path';

const CONSTRCUTS_VERSION = '3.2.34';
const K8S_17 = '17';
const K8S_17_VERSION = '1.17.0';

export class Cdk8sPlus17 {

  constructor(repo: YarnMonoRepoProject, common: Omit<pj.NodeProjectOptions, 'name'>) {

    const cdk8sPlus17 = repo.addJsiiPackage(`packages/cdk8s-plus-${K8S_17}`, {
      ...common,

      // bahhh
      repository: common.repository!,
      authorName: common.authorName!,
      authorAddress: common.authorEmail!,

      compat: common.stability === 'stable',
      name: `cdk8s-plus-${K8S_17}`,
      description: 'High level abstractions on top of cdk8s',
      peerDeps: [
        "cdk8s@^0.0.0",
        `constructs@^${CONSTRCUTS_VERSION}`,
      ],
      bundledDeps: [
        'minimatch@^3.0.4',
      ],
      devDeps: [
        '@types/minimatch@^3.0.3',
        "cdk8s@^0.0.0",
        `constructs@^${CONSTRCUTS_VERSION}`,
      ],
      java: {
        javaPackage: `org.cdk8s.plus${K8S_17}`,
        mavenGroupId: 'org.cdk8s',
        mavenArtifactId: `cdk8s-plus-${K8S_17}`
      },
      python: {
        distName: `cdk8s-plus-${K8S_17}`,
        module: `cdk8s_plus_${K8S_17}`
      },
      dotnet: {
        dotNetNamespace: `Org.Cdk8s.Plus${K8S_17}`,
        packageId: `Org.Cdk8s.Plus${K8S_17}`
      }
    });

    const importdir = path.join('src', 'imports');

    cdk8sPlus17.addTask('import', { exec: `../cdk8s-cli/bin/cdk8s -l typescript -o ${importdir} import k8s@${K8S_17_VERSION}` });

  }

}