import { execFileSync } from 'child_process';
import * as path from 'path';
import { ITokenResolver } from "cdk8s";
import { DefaultTokenResolver, StringConcat, TerraformStack, Token, Tokenization } from "cdktf";
import { Construct } from "constructs";

export interface Reference {
  readonly address: string;
  readonly attribute: string;
}

export class CdkTfTokenResolver implements ITokenResolver {

  private readonly stack: TerraformStack;

  constructor(scope: Construct) {
    this.stack = TerraformStack.of(scope);
  }

  public resolve(value: any): any {

    if (!Token.isUnresolved(value)) {
      return;
    }

    const resolver = new DefaultTokenResolver(new StringConcat());
    const resolved = Tokenization.resolve(value, { resolver, scope: this.stack });
    const reference = this.parse(resolved);

    try {
      return this.fetch(reference);
    } catch (error) {
      // deployment hasn't happened yet
      return value;
    }

  }

  private parse(resolved: string): Reference {
    // cdktf tokens are surrounded with ${}
    // TODO add more protections
    const parts = resolved.substring(2, resolved.length - 1).split('.');
    return {
      address: parts.slice(0, parts.length - 1).join('.'),
      attribute: parts.slice(-1)[0],
    };
  }

  private fetch(ref: Reference): string {

    const script = path.join(__dirname, '_fetch-cdktf-token-value.js');
    return execFileSync(process.execPath, [
      script,
      ref.address,
      ref.attribute,
      // TODO is this always the directory of the stack?
      this.stack.node.id,
    ], { encoding: 'utf-8' }).toString().trim();
  }

}
