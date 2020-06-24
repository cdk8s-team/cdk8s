const { execSync } = require('child_process');
const { readFileSync } = require('fs');

const cli = require.resolve('../../bin/cdk8s');
const constructs_version = require('../../package.json').dependencies.constructs;
const jsii_runtime_version = '1.5.0'

exports.pre = (variables) => {
  try {
    execSync('which mvn');
  } catch {
    console.error(`Unable to find "mvn". Install from https://maven.apache.org/install.html`);
    process.exit(1);
  }
  let version = variables.mvn_cdk8s;
  if (variables.mvn_cdk8s.endsWith('.jar')) {
    version = variables.mvn_cdk8s.split('-')[1].split('.jar')[0]
  }
  variables.CDK8S_VERSION = version;
  variables.JSII_RUNTIME_VERSION = jsii_runtime_version;
  variables.CONSTRUCTS_VERSION = constructs_version.replace('^', '').replace('~', '');
};

exports.post = options => {
  const mvn_cdk8s = options.mvn_cdk8s;
  if (!mvn_cdk8s) {
    throw new Error(`missing context "mvn_cdk8s"`);
  }

  execSync(`mvn install`);
  execSync(`${cli} import k8s -l java`);
  execSync(`mvn compile`);
  execSync(`mvn exec:java -Dexec.mainClass="com.mycompany.app.Main"`);

  console.log(readFileSync('./help', 'utf-8'));
};
