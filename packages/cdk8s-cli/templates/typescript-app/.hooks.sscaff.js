const { execSync } = require('child_process');
const { readFileSync, symlinkSync, mkdirSync } = require('fs');
const path = require('path');

exports.pre = () => {
  if (process.env.CLI_TEST) {
    console.error(`CLI_TEST=1`);
  }
};

exports.post = () => {
  const deps = [ '@aws-cdk/core', '@aws-cdk/cx-api', 'cdk8s' ];
  const devDeps = [ 'cdk8s-cli', '@types/node' ];

  deps.forEach(d => installDep(d));
  devDeps.forEach(d => installDep(d, true));

  // build to make sure all is good
  execSync('yarn build', { stdio: 'inherit' });

  console.log(readFileSync('./help.txt', 'utf-8'));
};

function installDep(dep, isDev) {

  // if we are in a CLI test, install the dependency from the local repo instead
  // of from the public registry.
  if (process.env.CLI_TEST) {
    installLocalDep(dep);
    return;
  }

  const devDep = isDev ? '-D' : '';
  execSync(`yarn add ${devDep} ${dep}`, { stdio: 'inherit' });
}

function installLocalDep(dep) {
  const pkgfile = require.resolve(`${dep}/package.json`);
  const target = path.dirname(pkgfile);
  const source = path.join('node_modules', dep);
  mkdirSync(path.dirname(source), { recursive: true });
  symlinkSync(target, source);

  const pkg = JSON.parse(readFileSync(pkgfile, 'utf-8'));
  for (const [ program, relpath ] of Object.entries(pkg.bin || {})) {
    const localbin = path.join(`node_modules`, '.bin');
    mkdirSync(localbin, { recursive : true });

    const binsource = path.join(localbin, program);
    const bintarget = path.join(target, relpath);

    symlinkSync(bintarget, binsource);
  }
}