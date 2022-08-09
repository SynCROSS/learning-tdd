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
        Dollar five = new Dollar(5);
        assertEquals(
                new Dollar(10),
                five.times(2),
                "dollar.amount should be 10"
        );
        assertEquals(
                new Dollar(15),
                five.times(3),
                "dollar.amount should be 15"
        );
    }

    @Test
    final void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(
                new Franc(10),
                five.times(2),
                "franc.amount should be 10"
        );
        assertEquals(
                new Franc(15),
                five.times(3),
                "franc.amount should be 15"
        );
    }

    @Test
    final void testEquality() {
        assertTrue(
                new Dollar(5).equals(new Dollar(5)),
                "new Dollar(5) is equal to new Dollar(5)"
        );
        assertFalse(
                new Dollar(5).equals(new Dollar(6)),
                "new Dollar(5) is not equal to new Dollar(6)"
        );
        assertTrue(
                new Franc(5).equals(new Franc(5)),
                "new Franc(5) is equal to new Franc(5)"
        );
        assertFalse(
                new Franc(5).equals(new Franc(6)),
                "new Franc(5) is not equal to new Franc(6)"
        );
    }
}
