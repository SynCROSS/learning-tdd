package org.example;

import org.example.dollar.Dollar;
import org.example.franc.Franc;

import java.util.Objects;

public class Money {
    private final String currency;
    private final int amount; // Use Double Or Else

    public Money(
            int amount,
            String currency
    ) {
        this.amount   = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public final boolean equals(Object obj) {
        Money money = (Money) obj;
        if (this == money)
            return true;
        if (null == money || !this.currency().equals(money.currency()))
            return false;
        return this.getAmount() == money.getAmount();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.getAmount());
    }

    private final int getAmount() {
        return this.amount;
    }

    protected Money times(int multiplier) {
        return new Money(this.getAmount() * multiplier, this.currency);
    }

    public final String currency() {
        return this.currency;
    }
}
