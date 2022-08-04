package org.example.dollar;

import java.util.Objects;

public class Dollar {
    public int amount; // Use Double Or Else

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (null == obj || this.getClass() != obj.getClass())
            return false;
        Dollar dollar = (Dollar) obj;
        return this.amount == dollar.amount;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.amount);
    }
}
