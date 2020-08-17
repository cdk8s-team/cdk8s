export class Lazy {

  public static number(producer: INumberProducer): number {
    return new Lazy(producer) as unknown as number;
  }

  public static string(producer: IStringProducer): string {
    return new Lazy(producer) as unknown as string;
  }

  public static any<T>(producer: IAnyProducer<T>): T {
    return new Lazy(producer) as unknown as T;
  }

  public static stringList(producer: IStringListProducer): string[] {
    return new Lazy(producer) as unknown as string[];
  }

  public resolve(): any {
    return this.producer.produce();
  }

  private constructor(private readonly producer: INumberProducer | IStringProducer | IStringListProducer | IAnyProducer<any>) {}

}

export interface INumberProducer {
  produce(): number;
}

export interface IStringProducer {
  produce(): string;
}

export interface IStringListProducer {
  produce(): string[];
}

export interface IAnyProducer<T> {
  produce(): T;
}

export function resolve(value: any): any {

  if (value == null) {
    return value;
  }

  if (value instanceof Lazy) {
    // we only resolve tokens created by the Lazy class.
    const resolved = value.resolve();
    return resolve(resolved);
  }

  if (typeof(value) !== 'object') {
    return value;
  }

  if (Array.isArray(value)) {
    return value.map(x => resolve(x));
  }

  const result: any = {};

  for (const [k,v] of Object.entries(value)) {
    result[k] = resolve(v);
  }

  return result;

}

