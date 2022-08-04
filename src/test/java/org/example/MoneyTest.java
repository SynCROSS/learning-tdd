package org.example;

import org.example.dollar.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoneyTest {
    @Test
    final void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(
                10,
                product.amount,
                "product.amount should be 10"
        );
        product = five.times(3);
        assertEquals(
                15,
                product.amount,
                "product.amount should be 15"
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
    }
}
