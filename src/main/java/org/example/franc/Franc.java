package org.example.franc;

import org.example.Money;

public class Franc extends Money {
    private String currency;

    public Franc(int amount) {
        super(amount);
        this.currency = "CHF";
    }

    public final Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public final String currency() {
        return this.currency;
    }
}
