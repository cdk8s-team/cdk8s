const { execSync } = require('child_process');
const { chmodSync } = require('fs');
const { readFileSync } = require('fs');
const { platform } = require('os');

const cli = require.resolve('../../bin/cdk8s');

exports.pre = () => {
  try {
    execSync(`${platform() === 'win32' ? 'where' : 'which'} pipenv`);
  } catch {
    console.error(`Unable to find "pipenv". Install from https://pipenv.kennethreitz.org`);
    process.exit(1);
  }
  try {
    execSync(`${platform() === 'win32' ? 'where' : 'which'} pip3`);
  } catch {
    console.error(`Unable to find "pip3". Install from https://pip.pypa.io`);
    process.exit(1);
  }
};

exports.post = options => {
  const { pypi_cdk8s, pypi_cdk8s_plus } = options;
  if (!pypi_cdk8s) {
    throw new Error(`missing context "pypi_cdk8s"`);
  }
  if (!pypi_cdk8s_plus) {
    throw new Error(`missing context "pypi_cdk8s_plus"`);
  }

  const flags = [];

  if (options.dist) {
    // https://github.com/awslabs/cdk8s/pull/399
    flags.push('--skip-lock');
  }

  if (options.pre) {
    flags.push('--pre');
  }

  const args = flags.join(' ');

  execSync('pipenv lock --clear')

  // this installs the libraries in the Pipfile we provide
  execSync('pipenv install', { stdio: 'inherit' });

  // these are more akward to put in the Pipfile since they can be local wheel files
  execSync(`pipenv install ${args} ${pypi_cdk8s}`, { stdio: 'inherit' });
  execSync(`pipenv install ${args} ${pypi_cdk8s_plus}`, { stdio: 'inherit' });

  chmodSync('main.py', '700');

  execSync(`${cli} import k8s -l python`);
  execSync(`pipenv run ./main.py`);

  console.log(readFileSync('./help', 'utf-8'));
};

