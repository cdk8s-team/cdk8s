import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';
import * as path from 'path';

const CONSTRCUTS_VERSION = '3.2.34';
const K8S_17 = '17';
const K8S_17_VERSION = '1.17.0';

export class Cdk8sPlus17 {

  public readonly project: pj.JsiiProject;

  constructor(root: pjcontrib.YarnMonoRepoProject) {

    this.project = root.addJsiiPackage(this.packagePath, {
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
      },

      repository: root.repository,
      authorAddress: root.authorUrl,
      authorName: root.authorName,

    })

    const importdir = path.join('src', 'imports');

    this.project.addTask('import', { exec: `../cdk8s-cli/bin/cdk8s -l typescript -o ${importdir} import k8s@${K8S_17_VERSION}` });

  }

  public get packagePath(): string {
    return 'packages/cdk8s-plus-17';
  }

}