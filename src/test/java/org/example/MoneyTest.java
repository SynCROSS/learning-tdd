package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

  @Test
  final void testMultiplication() {
    Money five = Money.dollar(5);
    assertEquals(Money.dollar(10), five.times(2), "Five Dollars Times Two Must Be Ten Dollars");
    assertEquals(Money.dollar(15), five.times(3),
        "Five Dollars Times Three Must Be Fifteen Dollars");
  }

  @Test
  final void testEquality() {
    assertEquals(Money.dollar(5), Money.dollar(5), "Money.dollar(5) is equal to Money.dollar(5)");
    assertNotEquals(Money.dollar(5), Money.dollar(6),
        "Money.dollar(5) is not equal to Money.dollar(6)");
    assertNotEquals(Money.franc(5), Money.dollar(5), "Franc is not Dollar");
  }

  @Test
  final void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency(), "Dollar's Currency is USD");
    assertEquals("CHF", Money.franc(1).currency(), "Franc's Currency is CHF");
  }

  @Test
  final void testSimpleAddition() {
    Money five = Money.dollar(5);
    Expression sum = five.plus(five);
    Money reduced = new Bank().reduce(sum, "USD");

    assertEquals(Money.dollar(10), reduced, "Five Plus Five Is Ten And Its Currency is USD");
  }

  @Test
  final void testPlusReturnsSum() {
    Money five = Money.dollar(5);
    Expression result = five.plus(five);
    Sum sum = (Sum) result;
    assertEquals(five, sum.getAugend(), "Augend Must Be Five Dollars");
    assertEquals(five, sum.getAddend(), "Addend Must Be Five Dollars");
  }

  @Test
  void testReduceMoney() {
    //        given(environment)
    Bank bank = new Bank();
    //        when(trigger)
    Money result = bank.reduce(Money.dollar(1), "USD");
    //        then(expected)
    assertEquals(Money.dollar(1), result, "One Dollar Must Be One Dollar");
  }
}
