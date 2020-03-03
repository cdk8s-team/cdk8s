const { execSync } = require('child_process');
const { chmodSync } = require('fs');

exports.pre = () => {
  try {
    execSync('which pipenv')
  } catch {
    console.error(`Unable to find "pipenv". Please install https://pipenv.kennethreitz.org/`)
    process.exit(1);
  }
};

exports.post = () => {
  execSync('pipenv install', { stdio: 'inherit' });
  chmodSync('synth.sh', '700');

  console.log();
  console.log("==================================================================================")
  console.log(" Your cdk8s Python project was created successfully.")
  console.log()
  console.log(" Useful commands:")
  console.log(" - ./synth.sh: synthesizes a k8s manifest in 'dist/' (ready for 'kubectl apply -f')")
};