const { execSync } = require('child_process');
const { readFileSync, symlinkSync, mkdirSync } = require('fs');
const path = require('path');

exports.pre = () => {
  if (process.env.CDK8S_CLI_TEST) {
    console.error(`CDK8S_CLI_TEST=1`);
  }
};

exports.post = ctx => {
  // ctx.version includes the version requirement passed in from the CLI. it
  // will be a pinned version for pre-release (e.g. "0.12.0-pre.e6834d3") or a
  // caret version for a production release (e.g. "^0.12.0").
  const req = ctx.version;

  installDeps([ '@aws-cdk/core', '@aws-cdk/cx-api', `cdk8s@${ctx.version}` ]);
  installDeps([ `cdk8s-cli@${ctx.version}`, '@types/node', 'typescript' ], true);

  // import k8s objects
  execSync('yarn run import', { stdio: 'inherit' });
  execSync('yarn build', { stdio: 'inherit' });

  console.log(readFileSync('./help', 'utf-8'));
};

function installDeps(deps, isDev) {
  // if we are in a CLI test, install the dependency from the local repo instead
  // of from the public registry.
  if (process.env.CDK8S_CLI_TEST) {
    for (const dep of deps) {
      installLocalDep(dep);
    }
    return;
  }

  const devDep = isDev ? '-D' : '';
  execSync(`yarn add ${devDep} ${deps.join(' ')}`, { stdio: 'inherit' });
}

function installLocalDep(req) {
  const extractModuleName = /^(@?[a-zA-Z0-9/-]+)(@[^@]*)?$/;
  const match = extractModuleName.exec(req);
  if (!match) {
    throw new Error(`unable to extract module name from version requirement "${req}`);
  }

  const moduleName = match[1];

  const pkgfile = require.resolve(`${moduleName}/package.json`);
  const target = path.dirname(pkgfile);
  const source = path.join('node_modules', moduleName);
  mkdirSync(path.dirname(source), { recursive: true });

  console.error(`symlinking: ${source} => ${target}`);
  symlinkSync(target, source);

  const pkg = JSON.parse(readFileSync(pkgfile, 'utf-8'));
  for (const [ program, relpath ] of Object.entries(pkg.bin || {})) {
    const localbin = path.join(`node_modules`, '.bin');
    mkdirSync(localbin, { recursive : true });

    const binsource = path.join(localbin, program);
    const bintarget = path.join(target, relpath);

    console.error(`symlinking: ${binsource} => ${binsource}`);
    symlinkSync(bintarget, binsource);
  }
}