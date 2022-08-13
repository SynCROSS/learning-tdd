package org.example;

import org.example.dollar.Dollar;
import org.example.franc.Franc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoneyTest {
    @Test
    final void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(
                Money.dollar(10),
                five.times(2),
                "dollar.amount should be 10"
        );
        assertEquals(
                Money.dollar(15),
                five.times(3),
                "dollar.amount should be 15"
        );
    }

    @Test
    final void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(
                Money.franc(10),
                five.times(2),
                "franc.amount should be 10"
        );
        assertEquals(
                Money.franc(15),
                five.times(3),
                "franc.amount should be 15"
        );
    }

    @Test
    final void testEquality() {
        assertTrue(
                Money.dollar(5).equals(Money.dollar(5)),
                "Money.dollar(5) is equal to Money.dollar(5)"
        );
        assertFalse(
                Money.dollar(5).equals(Money.dollar(6)),
                "Money.dollar(5) is not equal to Money.dollar(6)"
        );
        assertTrue(
                Money.franc(5).equals(Money.franc(5)),
                "Money.franc(5) is equal to Money.franc(5)"
        );
        assertFalse(
                Money.franc(5).equals(Money.franc(6)),
                "Money.franc(5) is not equal to Money.franc(6)"
        );
        assertFalse(
                Money.franc(5).equals(Money.dollar(5)),
                "Franc is not Dollar"
        );
    }
}
