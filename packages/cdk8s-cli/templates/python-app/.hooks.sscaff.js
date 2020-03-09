const { execSync } = require('child_process');
const { chmodSync } = require('fs');
const { readFileSync } = require('fs');

const cli = require.resolve('../../bin/cdk8s');

exports.pre = () => {
  try {
    execSync('which pipenv')
  } catch {
    console.error(`Unable to find "pipenv". Install from https://pipenv.kennethreitz.org`)
    process.exit(1);
  }
};

exports.post = options => {
  const pypi_cdk8s = options.pypi_cdk8s;
  if (!pypi_cdk8s) {
    throw new Error(`missing context "pypi_cdk8s"`);
  }

  execSync('pipenv install', { stdio: 'inherit' });
  execSync(`pipenv install ${pypi_cdk8s}`, { stdio: 'inherit' });
  chmodSync('main.py', '700');

  execSync(`${cli} import k8s -l python`);
  execSync(`pipenv run ./main.py`);

  console.log(readFileSync('./help', 'utf-8'));
};

