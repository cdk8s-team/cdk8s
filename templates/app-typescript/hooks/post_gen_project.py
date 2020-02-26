import os

# this will ensure we always install the latest versions
os.system('yarn add @aws-cdk/core @aws-cdk/cx-api @awslabs/cdk8s')
os.system('yarn add -D @awslabs/cdk8s-cli @types/node')

# build to make sure all is good
os.system('yarn build')

print()
print("==================================================================================")
print(" Your cdk8s TypeScript project was created successfully in '{{ cookiecutter.name }}'.")
print()
print(" - yarn build: generates Kubernetes objects in '.gen' and compiles your project")
print(" - yarn watch: watch and compile changes")
print(" - yarn synth: synthesizes a k8s manifest in 'dist/' (ready for 'kubectl apply -f')")
