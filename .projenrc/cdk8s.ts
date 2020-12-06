import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';

export class Cdk8s extends pj.JsiiProject {

  constructor(root: pjcontrib.YarnMonoRepo, constructs: string) {

    super({
      outdir: 'packages/cdk8s',
      name: 'cdk8s',
      description: 'Cloud Development Kit for Kubernetes',
      peerDeps: [
        `constructs@^${constructs}`,
      ],
      bundledDeps: [
        'yaml@2.0.0-1',
        'json-stable-stringify',
        'follow-redirects',
        'fast-json-patch',
      ],
      devDeps: [
        `constructs@^${constructs}`,
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

      ...root.common,

      compat: root.common.stability === 'stable',

      repository: root.repository,
      authorAddress: root.authorUrl,
      authorName: root.authorName,

    });

    this.gitignore.include('/src/_loadurl.js');
    this.compileTask.exec('cp src/_loadurl.js lib/');

  }

}