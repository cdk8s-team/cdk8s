import os

os.system('yarn install')
os.system('yarn build')

print()
print("==================================================================================")
print(" Your cdk8s TypeScript project was created successfully in '{{ cookiecutter.name }}'.")
print()
print(" - yarn build: generates Kubernetes objects in '.gen' and compiles your project")
print(" - yarn watch: watch and compile changes")
print(" - yarn synth: synthesizes a k8s manifest in 'dist/' (ready for 'kubectl apply -f')")
