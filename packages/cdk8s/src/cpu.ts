/**
 * Represents the amount of cpu.
 */
export class Cpu {
  /**
   * Creates a Cpu representing an amount of cpus.
   * @param amount the amount of cpus the Cpu will represents.
   * @returns a new `Cpu` representing `amount` cpus.
   */
  public static units(amount: number): Cpu {
    if (amount < 0.001) {
      throw new Error(`CPU units cannot be less than 0.001 (1 millicpu). Received: ${amount}`);
    }
    return new Cpu(amount * 1000);
  }

  /**
   * Creates a Cpu representing an amount of milllicpus.
   * @param amount the amount of millicpus the Cpu will represents.
   * @returns a new `Cpu` representing `amount` millicpus.
   */
  public static millis(amount: number): Cpu {
    if (amount < 1) {
      throw new Error(`cpu units cannot be less than 1 millicpu. Received: ${amount}`);
    }
    return new Cpu(amount);
  }

  private constructor(private readonly _millis: number) {}

  toString(): string {
    return `${this._millis}m`;
  }
}