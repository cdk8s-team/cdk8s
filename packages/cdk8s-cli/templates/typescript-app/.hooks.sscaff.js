const { execSync } = require('child_process');

exports.post = () => {
  // this will ensure we always install the latest versions
  execSync('yarn add @aws-cdk/core @aws-cdk/cx-api @awslabs/cdk8s', { stdio: 'inherit' });
  execSync('yarn add -D @awslabs/cdk8s-cli @types/node', { stdio: 'inherit' });

  // build to make sure all is good
  execSync('yarn build', { stdio: 'inherit' });

  console.log();
  console.log("==================================================================================")
  console.log(" Your cdk8s TypeScript project was created successfully in '{{ cookiecutter.name }}'.")
  console.log()
  console.log(" - yarn build: generates Kubernetes objects in '.gen' and compiles your project")
  console.log(" - yarn watch: watch and compile changes")
  console.log(" - yarn synth: synthesizes a k8s manifest in 'dist/' (ready for 'kubectl apply -f')")
};