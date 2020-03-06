import * as fs from 'fs-extra';
import * as path from 'path';
import { shell } from './util';

/**
 * Compiles the source files in `workdir` with jsii.
 */
export async function jsiiCompile(workdir: string, stdout = false) {
  const compiler = require.resolve('jsii/bin/jsii');
  const args = [ '--silence-warnings', 'reserved-word' ];

  const modules = [ 
    '@aws-cdk/core', 
    '@aws-cdk/cx-api', 
    'cdk8s',
    '@types/node',
  ];

  const pkg = {
    name: 'dummy',
    version: '0.0.0',
    author: "dummy@dummy.com",
    main: "k8s.js",
    types: "k8s.d.ts",
    license: 'Apache-2.0',
    repository: { url: 'http://repo', type: 'git' },
    jsii: {
      outdir: "dist",
      targets: {
        python: {
          distName: "k8s",
          module: "k8s"
        }
      }
    },    
    dependencies: {
      "@aws-cdk/core": "*",
      "cdk8s": "*",
    },
    peerDependencies: {
      "@aws-cdk/core": "*",
      "cdk8s": "*",
    }
  };

  for (const mod of modules) {
    const sourcedir = path.dirname(require.resolve(`${mod}/package.json`));
    await fs.mkdirp(path.join(workdir, path.join('node_modules', path.dirname(mod))));
    await fs.symlink(sourcedir, path.join(workdir, 'node_modules', mod));
  }

  await fs.writeFile(path.join(workdir, 'package.json'), JSON.stringify(pkg, undefined, 2));

  await shell(compiler, args, { 
    cwd: workdir,
    stdio: [ 'inherit', stdout ? 'inherit' : 'ignore', 'inherit' ]
  });
}