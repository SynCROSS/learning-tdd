package org.example.dollar;

public class Dollar {
    public int amount; // Use Double Or Else

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
