package org.example;

import org.example.dollar.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {
    @Test
    final void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10,
                     product.amount,
                     "Test Failed"
        );
        product = five.times(3);
        assertEquals(15,
                     product.amount,
                     "Test Failed"
        );
    }
}
