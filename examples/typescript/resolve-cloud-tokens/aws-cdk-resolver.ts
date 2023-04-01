import { execFileSync } from 'child_process';
import * as path from 'path';
import { ITokenResolver } from 'cdk8s';
import { Token, Stack } from 'aws-cdk-lib';
import { Construct } from 'constructs';

export interface Reference {
  readonly logicalId: string;
  readonly attribute: string;
}

export class AwsCdkTokenResolver implements ITokenResolver {

  private readonly stack: Stack;

  constructor(scope: Construct) {
    this.stack = Stack.of(scope);
  }

  public resolve(value: any): any {

    if (!Token.isUnresolved(value)) {
      return value;
    }

    const resolved = this.stack.resolve(value);
    const token = this.parse(resolved);

    try {
      return this.fetch(token);
    } catch (error) {
      // deployment hasn't happened yet
      return resolved;
    }

  }

  private parse(resolved: any): Reference {
    const keys = Object.keys(resolved);
    if (keys.length > 1) {
      throw Error(`Token must only have 1 key: ${JSON.stringify(resolved)}`);
    }
    const key = keys[0];
    if (key === 'Ref') {
      return {
        attribute: key,
        logicalId: resolved[key],
      };
    }
    if (key === 'Fn::GetAtt') {
      const value = resolved[keys[0]];
      // TODO validate this is indeed an array of size 2
      return {
        attribute: value[1],
        logicalId: value[0],
      };
    }
    // TODO handle `Fn` and other intrinsic functions.
    throw new Error(`Unexpected token: ${JSON.stringify(resolved)}`);
  }

  private fetch(token: Reference): string {

    const script = path.join(__dirname, '_fetch-aws-cdk-token-value.js');
    return execFileSync(process.execPath, [
      script,
      token.logicalId,
      token.attribute,
      this.stack.stackName,
    ], { encoding: 'utf-8' }).toString().trim();
  }

}
