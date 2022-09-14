package org.example;

import java.util.Objects;

public class Money {
    private final String currency;
    private final int amount; // Use Double Or Else

    private Money(
            int amount,
            String currency
    ) {
        this.amount   = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public final boolean equals(Object obj) {
        Money money = (Money) obj;
        if (this == money)
            return true;
        if (null == money || !this.currency().equals(money.currency()))
            return false;
        return this.amount == money.amount;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.amount);
    }

    private final int getAmount() {
        return this.amount;
    }

    protected Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public final String currency() {
        return this.currency;
    }

    public final Money plus(Money addend) {
        return new Money(this.amount + addend.getAmount(), this.currency);
    }
}
