package org.example;

import java.util.Objects;

public class Money implements Expression {
    private final String currency;
    private final int amount; // Use Double Or Else

    public Money(
            int amount, String currency
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
        if (this == obj)
            return true;
        if (null == obj)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        if (!this.currency().equals(money.currency()))
            return false;
        return this.amount == money.getAmount();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.amount);
    }

    public final int getAmount() {
        return this.amount;
    }

    protected final Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public final String currency() {
        return this.currency;
    }

    public final Expression plus(Money addend) {
        return new Sum(this, addend);
    }
}
