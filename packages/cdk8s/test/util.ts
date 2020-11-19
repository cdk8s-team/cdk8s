import { Construct } from 'constructs';

export function createTree(path: string) {
  const queue = path.split('/');
  let curr = new Construct(undefined as any, undefined as any);

  while (queue.length) {
    const id = queue.shift() as string;
    curr = new Construct(curr, id!);
  }

  return curr;
}
