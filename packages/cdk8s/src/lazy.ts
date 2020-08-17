export class Lazy {

  public static number(producer: INumberProducer): number {
    return new Lazy(producer) as unknown as number;
  }

  public static string(producer: IStringProducer): string {
    return new Lazy(producer) as unknown as string;
  }

  public static any(producer: IAnyProducer): any {
    return new Lazy(producer) as unknown as any;
  }

  public static stringList(producer: IStringListProducer): string[] {
    return new Lazy(producer) as unknown as string[];
  }

  public apply(): any {
    return this.producer.produce();
  }

  private constructor(private readonly producer: INumberProducer | IStringProducer | IStringListProducer | IAnyProducer) {}

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

export interface IAnyProducer {
  produce(): any;
}
