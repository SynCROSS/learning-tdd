package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest {
    @Test
    final void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2), "dollar.amount should be 10");
        assertEquals(Money.dollar(15), five.times(3), "dollar.amount should be 15");
    }

    @Test
    final void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5), "Money.dollar(5) is equal to Money.dollar(5)");
        assertNotEquals(Money.dollar(5), Money.dollar(6), "Money.dollar(5) is not equal to Money.dollar(6)");
        assertNotEquals(Money.franc(5), Money.dollar(5), "Franc is not Dollar");
    }

    @Test
    final void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency(), "Dollar's Currency is USD");
        assertEquals("CHF", Money.franc(1).currency(), "Franc's Currency is CHF");
    }

    @Test
    final void testSimpleAddition() {
        Money ten = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), ten, "Five Dollars Plus Five Dollars Must Be Ten Dollars");
    }
}
