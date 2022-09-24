package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bank {

  private final Map<Pair, Integer> rates = new HashMap<>();

  public Money reduce(Expression expression, String currency) {
    return expression.reduce(this, currency);
  }

  public int rate(String from, String to) {
    if (from.equals(to)) {
      return 1;
    }
    return this.rates.get(new Pair(from, to)).intValue();
  }

  public void addRate(String from, String to, Integer rate) {
    this.rates.put(new Pair(from, to), rate);
  }
}
