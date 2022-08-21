package org.example.franc;

import org.example.Money;

public class Franc extends Money {

    public Franc(
            int amount,
            String currency
    ) {
        super(amount, currency);
    }

    public final Money times(int multiplier) {
        return new Franc(this.amount * multiplier, null);
    }


}
