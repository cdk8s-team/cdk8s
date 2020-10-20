export class Lazy {

  public static any(producer: IAnyProducer): any {
    return new Lazy(producer) as unknown as any;
  }

  public produce(): any {
    return this.producer.produce();
  }

  private constructor(private readonly producer: IAnyProducer) {}

}

export interface IAnyProducer {
  produce(): any;
}


