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

  public Money getAugend() {
    return this.augend;
  }

  public Money getAddend() {
    return this.addend;
  }

  public Money reduce(String currency) {
    int amount = this.augend.getAmount() + this.addend.getAmount();
    return new Money(amount, currency);
  }
}
