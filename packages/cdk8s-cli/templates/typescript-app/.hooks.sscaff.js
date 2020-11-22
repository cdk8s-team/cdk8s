const { execSync } = require('child_process');
const { readFileSync } = require('fs');

exports.post = ctx => {
  const npm_cdk8s = ctx.npm_cdk8s;
  const npm_cdk8s_plus = ctx.npm_cdk8s_plus;
  const npm_cdk8s_cli = ctx.npm_cdk8s_cli;
  const constructs_version = ctx.constructs_version;

  if (!npm_cdk8s) { throw new Error(`missing context "npm_cdk8s"`); }
  if (!npm_cdk8s_cli) { throw new Error(`missing context "npm_cdk8s_cli"`); }

  installDeps([ npm_cdk8s, npm_cdk8s_plus, `constructs@^${constructs_version}` ]);
  installDeps([
      npm_cdk8s_cli,
      '@types/node',
      '@types/jest',
      'jest',
      'ts-jest',
      'typescript'
  ], true);

  // import k8s objects
  execSync('npm run import', { stdio: 'inherit' });
  execSync('npm run compile', { stdio: 'inherit' });
  execSync('npm run test -- -u', { stdio: 'inherit' });
  execSync('npm run synth', { stdio: 'inherit' });

  console.log(readFileSync('./help', 'utf-8'));
};

function installDeps(deps, isDev) {
  const devDep = isDev ? '-D' : '';
  execSync(`npm install ${devDep} ${deps.join(' ')}`, { stdio: 'inherit' });
}

