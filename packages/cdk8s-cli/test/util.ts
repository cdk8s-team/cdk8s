import { promises as fs } from 'fs';
import { spawn } from 'child_process';
import * as path from 'path';
import * as os from 'os';

/**
 * Compiles the source files in `workdir` with jsii.
 */
export async function jsiiCompile(workdir: string) {
  console.log(`compiling ${workdir}`);
  
  const compiler = require.resolve('jsii/bin/jsii');
  const args = [ '--silence-warnings', 'reserved-word' ];

  const modules = [ 
    '@aws-cdk/core', 
    '@aws-cdk/cx-api', 
    'cdk8s',
    '@types/node'
  ];

  const pkg = {
    name: 'dummy',
    version: '0.0.0.0',
    author: "dummy@dummy.com",
    main: "index.js",
    types: "index.d.ts",
    license: 'Apache-2.0',
    repository: {
      url: 'http://repo',
      type: 'git'
    },
    dependencies: {
      "@aws-cdk/core": "*",
      "cdk8s": "*",
    },
    peerDependencies: {
      "@aws-cdk/core": "*",
      "cdk8s": "*",
    },
    jsii: {
      outdir: 'dist'
    }
  };

  for (const mod of modules) {
    const sourcedir = path.dirname(require.resolve(`${mod}/package.json`));
    await fs.mkdir(path.join(workdir, path.join('node_modules', path.dirname(mod))), { recursive: true });
    await fs.symlink(sourcedir, path.join(workdir, 'node_modules', mod));
  }

  await fs.writeFile(path.join(workdir, 'package.json'), JSON.stringify(pkg, undefined, 2));

  return new Promise((ok, ko) => {
    const child = spawn(compiler, args, { cwd: workdir, stdio: 'inherit' });
    child.once('error', ko);
    child.once('exit', code => {
      if (code === 0) { return ok(); }
      else return ko(new Error(`non-zero exit code ${code}`));
    });
  });
}

export async function createWorkdir() {
  return await fs.mkdtemp(path.join(os.tmpdir(), 'generator.tests'));  
}