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
  try {
    execSync('which pip3')
  } catch {
    console.error(`Unable to find "pip3". Install from https://pip.pypa.io`)
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

  execSync('pipenv lock --clear')
  execSync('pipenv install --pre --skip-lock', { stdio: 'inherit' });
  execSync(`pipenv install --pre ${pypi_cdk8s}`, { stdio: 'inherit' });
  /**
   * Using --no-deps flag here to ignore subdependencies. For cdk8s_plus, that's
   * these dependencies:
   *
   * jsii (<2.0.0,>=1.7.0)
   * publication (>=0.0.3)
   * cdk8s (==0.0.0)
   * constructs (<4.0.0,>=3.0.4)
   *
   * Even when installing locally, with this command:
   *
   * pipenv install dist/python/cdk8s_plus-0.0.0-py3-none-any.whl
   *
   * this would point to these sub-dependencies in https://pypi.org/ which
   * unfortunataly does not have cdk8s-0.0.0. We've already installed that
   * locally, so this is safe to ignore.
   *
   */
  execSync(`pip3 install --no-deps ${pypi_cdk8s_plus}`, { stdio: 'inherit' });
  chmodSync('main.py', '700');

  execSync(`${cli} import k8s -l python`);
  execSync(`pipenv run ./main.py`);

  console.log(readFileSync('./help', 'utf-8'));
};

