package org.example.dollar;

import org.example.Money;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount) {
        super(amount);
        this.currency = "USD";
    }

    public final Money times(int multiplier) {
        return new Dollar(this.getAmount() * multiplier);
    }

    public final String currency() {
        return this.currency;
    }
}
