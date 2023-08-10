import * as path from 'path';
import { execFileSync } from 'child_process';
import { IValueResolver, ResolutionContext } from 'cdk8s';
import { Token, Stack, Tokenization, Reference, CfnOutput } from 'aws-cdk-lib';

export class AwsCdkOutputResolver implements IValueResolver {

  constructor() {}

  public resolve(context: ResolutionContext): any {

    if (!Token.isUnresolved(context.value)) {
      return context.value;
    }

    const resolvable = Tokenization.reverse(context.value);

    if (!resolvable) {
      throw new Error(`${context.value} is not resolvable`)
    }

    if (Reference.isReference(resolvable)) {
      const stack = Stack.of(resolvable.target);
      const output = stack.node.findAll().filter(c => c instanceof CfnOutput && c.value === context.value)[0] as CfnOutput;
      if (!output) {
        throw new Error(`Unable to find output defined for token: ${JSON.stringify(stack.resolve(context.value))}. Make sure you defined a CfnOutput for this value.`);
      }
      const outputValue = this.fetchOutputValue(stack.stackName, stack.resolve(output.logicalId));
      context.replaceValue(JSON.parse(outputValue));
    } else {
      throw new Error(`${context.value} is not a reference`)
    }

  }

  private fetchOutputValue(stackName: string, outputName: string): string {

    const script = path.join(__dirname, '_fetch-aws-cdk-output-value.js');
    return execFileSync(process.execPath, [
      script,
      stackName,
      outputName,
    ], { encoding: 'utf-8' }).toString().trim();
  }


}
