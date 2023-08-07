const child = require('child_process');
const path = require('path');

const address = process.argv[2];
const attribute = process.argv[3];
const stackName = process.argv[4];

function debug(message) {
  if (process.env.RESOLVE_CLOUD_TOKENS_POC_DEBUG == '1') {
    console.error(`cdk8s.resolve.cdktf | ${message}`)
  }
}

async function fetch() {

  debug(`Invoking | terraform show -json`)

  // https://developer.hashicorp.com/terraform/cli/commands/state/show#usage
  // TODO this command is fairly slow, this about some sort of cross process cache
  const stateJson = JSON.parse(child.execSync('terraform show -json', {
    cwd: path.join(process.cwd(), 'cdktf.out', 'stacks', stackName),
  }).toString());

  // https://developer.hashicorp.com/terraform/internals/json-format
  const resources = stateJson['values']['root_module']['resources']

  // TODO ensure one
  const resource = resources.filter(r => r.address === address)[0]
  
  const values = resource['values']

  debug(`Found | [Address=${address}, Values=${JSON.stringify(values, null, 2)}] `)  

  const value = values[attribute]

  debug(`Found | ${stackName}/${address}/${attribute} => ${value}`)

  return value;

}

debug(`Request | [address=${address}, attribute=${attribute}, stackName=${stackName}]`)

fetch()
  .then((data) => {
    console.log(data);
  })
  .catch((error) => {
    if (process.env.RESOLVE_CLOUD_TOKENS_POC_DEBUG == '1') {
      console.error(`cdk8s.resolve | Failed fetching CDKTF token value for ${address}.${attribute} (stack: ${stackName}): ${error}`)
    }
    process.exit(1)
  });