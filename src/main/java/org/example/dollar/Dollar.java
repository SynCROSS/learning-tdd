package org.example.dollar;

import org.example.Money;

public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    public final Dollar times(int multiplier) {
        return new Dollar(this.getAmount() * multiplier);
    }

}
