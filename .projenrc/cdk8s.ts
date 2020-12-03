import * as pj from 'projen';
import * as pjcontrib from '../projen-contrib';

const CONSTRCUTS_VERSION = '3.2.34';

export class Cdk8s {

  public readonly project: pj.JsiiProject;

  constructor(root: pjcontrib.YarnMonoRepoProject) {

    this.project = root.addJsiiPackage(this.packagePath, {
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

      repository: root.repository,
      authorAddress: root.authorUrl,
      authorName: root.authorName,

    });

    this.project.gitignore.include('/src/_loadurl.js');
    this.project.compileTask.exec('cp src/_loadurl.js lib/');

  }

  public get packagePath(): string {
    return 'packages/cdk8s';
  }

}