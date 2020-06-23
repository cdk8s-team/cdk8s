const { execSync } = require('child_process');
const { readFileSync } = require('fs');

const cli = require.resolve('../../bin/cdk8s');

exports.pre = () => {
  try {
    execSync('which mvn')
  } catch {
    console.error(`Unable to find "mvn". Install from https://maven.apache.org/install.html`)
    process.exit(1);
  }
};

exports.post = options => {
  const mvn_cdk8s = options.mvn_cdk8s;
  if (!mvn_cdk8s) {
    throw new Error(`missing context "mvn_cdk8s"`);
  }

  if (mvn_cdk8s.endsWith('.jar')) {
    const localVersion = mvn_cdk8s.split('-')[1].split('.jar')[0]
    execSync(`mvn install:install-file -Dfile=${mvn_cdk8s} -DgroupId=org.cdk8s -DartifactId=cdk8s -Dversion=${localVersion} -Dpackaging=jar`)
  } else {
    execSync(`mvn versions:use-dep-version -Dincludes=org.cdk8s:cdk8s -DdepVersion=${mvn_cdk8s} -DforceVersion=true`)
    execSync('rm pom.xml.versionsBackup')
  }

  execSync(`${cli} import k8s -l java`);
  execSync(`mvn compile`);
  execSync(`mvn exec:java -Dexec.mainClass="com.mycompany.app.Main"`);

  console.log(readFileSync('./help', 'utf-8'));
};

