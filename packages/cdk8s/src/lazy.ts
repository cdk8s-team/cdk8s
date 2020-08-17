export class Lazy {

  public static numberValue(producer: () => number): number {
    return (() => producer()) as unknown as number
  }

  public static stringValue(producer: () => string): string {
    return (() => producer()) as unknown as string
  }

  public static anyValue(producer: () => any): any {
    return (() => producer()) as unknown as any
  }

  public static stringListValue(producer: () => string[]): string[] {
    return (() => producer()) as unknown as string[]
  }

}
