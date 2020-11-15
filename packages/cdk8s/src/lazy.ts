export class Lazy {
  public static any(producer: IAnyProducer): any {
    return new Lazy(producer) as unknown as any;
  }

  private constructor(private readonly producer: IAnyProducer) {}

  public produce(): any {
    return this.producer.produce();
  }
}

export interface IAnyProducer {
  produce(): any;
}


