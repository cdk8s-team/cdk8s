const { CloudControlClient, GetResourceCommand } = require("@aws-sdk/client-cloudcontrol");
const { CloudFormationClient, DescribeStackResourceCommand } = require("@aws-sdk/client-cloudformation");

const logicalId = process.argv[2];
const attribute = process.argv[3];
const stackName = process.argv[4];

const cloudcontrol = new CloudControlClient({ region: process.env.AWS_DEFAULT_REGION });
const cloudformation = new CloudFormationClient({ region: process.env.AWS_DEFAULT_REGION });

function debug(message) {
  if (process.env.RESOLVE_CLOUD_TOKENS_POC_DEBUG == '1') {
    console.error(`cdk8s.resolve.awscdk | ${message}`)
  }
}

async function fetch() {

  debug(`Invoking | cloudformation.DescribeStackResourceCommand(StackName=${stackName}, LogicalResourceId=${logicalId})`)

  const cfnResource = await cloudformation.send(new DescribeStackResourceCommand({
    StackName: stackName,
    LogicalResourceId: logicalId,
  }));

  const identifier = cfnResource.StackResourceDetail?.PhysicalResourceId;
  const typeName = cfnResource.StackResourceDetail.ResourceType;

  debug(`Found | [LogicalResourceId=${logicalId}, PhysicalResourceId=${identifier}, ResourceType=${typeName}]`)

  if (!identifier) {
    throw new Error(`Resource with logical id '${logicalId}' in stack '${stackName}' does not have a physical resource id`);
  }

  if (attribute === 'Ref') {
    // Refs aren't mapped in Cloud Control...
    // Assuming its the idenitifier is probably wrong but we don't have
    // a choice.
    debug(`Found | ${stackName}/${logicalId}/Ref => ${identifier}`)
    return identifier
  }  

  debug(`Invoking | cloudcontrol.GetResourceCommand(TypeName=${typeName}, Identifier=${identifier})`)

  const resource = await cloudcontrol.send(new GetResourceCommand({
    TypeName: typeName,
    Identifier: identifier
  }))

  const properties = JSON.parse(resource.ResourceDescription?.Properties ?? '{}')
  debug(`Found | [LogicalResourceId=${logicalId}, PhysicalResourceId=${identifier}, ResourceType=${typeName}, Properties=${JSON.stringify(properties, null, 2)}] `)

  // is it true that cloudcontrol properties map to cloudformation attributes?
  const value = properties[attribute]
  if (!value) {
    throw new Error(`Attribute '${attribute}' not found on resource with logical id '${logicalId}' of type '${typeName}' in stack '${stackName}'`);
  }
  debug(`Found | ${stackName}/${logicalId}/${attribute} => ${value}`)
  return value;
}

debug(`Request | [logicalId=${logicalId}, attribute=${attribute}, stackName=${stackName}]`)

fetch()
  .then((data) => {
    console.log(data);
  })
  .catch((error) => {
    debug(`Failed fetching AWS CDK token value for ${logicalId}.${attribute} (stack: ${stackName}): ${error}`)
    process.exit(1)
  });