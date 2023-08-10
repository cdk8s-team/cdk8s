import { execFileSync, execSync } from 'child_process';
import * as path from 'path';
import { IValueResolver, ResolutionContext } from "cdk8s";
import { DefaultTokenResolver, StringConcat, TerraformStack, Token, Tokenization, App } from "cdktf";
import { Construct } from "constructs";

export interface ResourceAttribute {
  readonly resourceType: string;
  readonly resourceName: string;
  readonly attributeName: string;
}

export class CdkTfResolver implements IValueResolver {

  private readonly stack: TerraformStack;
  private readonly stackPath: string;

  constructor(scope: Construct) {
    this.stack = TerraformStack.of(scope);

    // need to initialize terraform so that we can pull state.
    const app = App.of(this.stack);
    app.synth();

    // TODO is this always the directory of the stack?
    this.stackPath = path.join(app.outdir, 'stacks', this.stack.node.id);

    execSync('terraform init', { cwd: this.stackPath })

  }

  public resolve(context: ResolutionContext): any {

    if (!Token.isUnresolved(context.value)) {
      return;
    }

    const resolver = new DefaultTokenResolver(new StringConcat());
    const resolved = Tokenization.resolve(context.value, { resolver, scope: this.stack });
    const resourceAttribute = this.parse(resolved);

    const value = this.fetchResourceAttributeValue(resourceAttribute);
    context.replaceValue(value);

  }

  private parse(resolved: string): ResourceAttribute {
    // cdktf tokens are surrounded with ${}
    // TODO add more protections
    const parts = resolved.substring(2, resolved.length - 1).split('.');
    return {
      resourceType: parts[0],
      resourceName: parts[1],
      attributeName: parts[2],
    };
  }

  private fetchResourceAttributeValue(attr: ResourceAttribute): string {

    const script = path.join(__dirname, '_fetch-cdktf-attribute-value.js');
    return execFileSync(process.execPath, [
      script,
      attr.resourceName,
      attr.attributeName,
      this.stackPath,
    ], { encoding: 'utf-8' }).toString().trim();
  }

}
