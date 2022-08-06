package org.example;

import java.util.Objects;

public class Money {
    protected final int amount; // Use Double Or Else

    public Money(int amount) {
        this.amount = amount;
    }

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
        return amount;
    }
}
