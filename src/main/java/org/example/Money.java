package org.example;

import org.example.dollar.Dollar;
import org.example.franc.Franc;

import java.util.Objects;

public abstract class Money {
    protected final int amount; // Use Double Or Else

    protected Money(int amount) {
        this.amount = amount;
    }

    static Money dollar(int amount) {return new Dollar(amount);}
    static Money franc(int amount) {return new Franc(amount);}

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null == obj || this.getClass() != obj.getClass())
            return false;
        Money money = (Money) obj;
        return this.getAmount() == money.getAmount();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.getAmount());
    }

    protected final int getAmount() {
        return this.amount;
    }

    protected abstract Money times(int multiplier);
}