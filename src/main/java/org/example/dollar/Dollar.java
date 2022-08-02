package org.example.dollar;

public class Dollar {
    public int amount; // Use Double Or Else

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}