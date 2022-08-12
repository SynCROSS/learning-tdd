package org.example.dollar;

import org.example.Money;

public class Dollar extends Money {
    public Dollar(int amount) {
        super(amount);
    }

    public final Money times(int multiplier) {
        return new Dollar(this.getAmount() * multiplier);
    }

}
