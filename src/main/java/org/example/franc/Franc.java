package org.example.franc;

import org.example.Money;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
    }

    public final Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

}
