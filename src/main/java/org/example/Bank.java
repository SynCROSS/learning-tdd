package org.example;

public class Bank {

  public Money reduce(Expression expression, String currency) {
    /*
    	! 1. There is a type casting, this means that Sum must be compatible with Expression.
    	! 2. This code violates the Law Of Demeter,
        * Sum sum = (Sum) expression;
        * int amount = sum.getAugend().getAmount() + sum.getAddend().getAmount();
        * return new Money(amount, currency);
        */
    if (expression instanceof Money) {
      return (Money) expression;
    }
    Sum sum = (Sum) expression;
    return sum.reduce(currency);
  }
}
