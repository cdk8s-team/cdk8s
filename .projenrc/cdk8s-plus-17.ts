import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';
import * as path from 'path';

const K8S_17 = '17';
const K8S_17_VERSION = '1.17.0';

export class Cdk8sPlus17 extends pj.JsiiProject {

  constructor(root: pjcontrib.YarnMonoRepo, constructs: string) {

    super({
      outdir: 'packages/cdk8s-plus-17',
      name: `cdk8s-plus-${K8S_17}`,
      description: 'High level abstractions on top of cdk8s',
      peerDeps: [
        "cdk8s@0.0.0",
        `constructs@^${constructs}`,
      ],
      bundledDeps: [
        'minimatch',
      ],
      devDeps: [
        "cdk8s@0.0.0",
        `constructs@^${constructs}`,
        '@types/minimatch',
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

      ...root.common,

      compat: root.common.stability === 'stable',

      repository: root.repository,
      authorAddress: root.authorUrl,
      authorName: root.authorName,

    })

    const importdir = path.join('src', 'imports');

    this.addTask('import', { exec: `../cdk8s-cli/bin/cdk8s -l typescript -o ${importdir} import k8s@${K8S_17_VERSION}` });

    // build is actually compile for this project
    this.buildTask.reset();
    this.buildTask.spawn(this.compileTask);

  }

}