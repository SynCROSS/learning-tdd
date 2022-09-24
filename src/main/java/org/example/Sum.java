package org.example;

public class Sum implements Expression {

  private final Money augend;
  private final Money addend;

  public Sum(
      Money augend, Money addend
  ) {
    this.augend = augend;
    this.addend = addend;
  }

  public final Money getAugend() {
    return this.augend;
  }

  public final Money getAddend() {
    return this.addend;
  }

  public final Money reduce(String currency) {
    int amount = this.augend.getAmount() + this.addend.getAmount();
    return new Money(amount, currency);
  }
}
