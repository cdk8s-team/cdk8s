import { Tokenization, DefaultTokenResolver, StringConcat, Construct } from 'constructs';

const TOKEN_RESOLVER = new DefaultTokenResolver(new StringConcat());

export function resolve<T>(scope: Construct, obj: T): T {
  return Tokenization.resolve(obj, {
    scope,
    resolver: TOKEN_RESOLVER,
  });
}