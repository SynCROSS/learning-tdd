package org.example.dollar;

import org.example.Money;

public class Dollar extends Money {
    public Dollar(
            int amount,
            String currency
    ) {
        this.amount = amount;
        this.currency = currency;
    }

    public final Money times(int multiplier) {
        return new Dollar(
                this.getAmount() * multiplier,
                null
        );
    }

}
