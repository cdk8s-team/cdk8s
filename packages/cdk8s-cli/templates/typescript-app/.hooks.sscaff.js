const { execSync } = require('child_process');
const { readFileSync, symlinkSync, mkdirSync } = require('fs');
const path = require('path');

const version = require('../../package.json').version;

exports.pre = () => {
  if (process.env.CLI_TEST) {
    console.error(`CLI_TEST=1`);
  }
};

exports.post = () => {
  installDeps([ '@aws-cdk/core', '@aws-cdk/cx-api', `cdk8s@^${version}` ]);
  installDeps([ `cdk8s-cli@^${version}`, '@types/node' ], true);

  // build to make sure all is good
  execSync('yarn build', { stdio: 'inherit' });

  console.log(readFileSync('./help', 'utf-8'));
};

function installDeps(deps, isDev) {
  // if we are in a CLI test, install the dependency from the local repo instead
  // of from the public registry.
  if (process.env.CLI_TEST) {
    for (const dep of deps) {
      installLocalDep(dep);
    }
    return;
  }

  const devDep = isDev ? '-D' : '';
  execSync(`yarn add ${devDep} ${deps.join(' ')}`, { stdio: 'inherit' });
}

function installLocalDep(depWithVer) {
  const dep = depWithVer.split('@')[0];

  const pkgfile = require.resolve(`${dep}/package.json`);
  const target = path.dirname(pkgfile);
  const source = path.join('node_modules', dep);
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