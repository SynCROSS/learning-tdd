package org.example;

public class Pair {

  private final String from;
  private final String to;

  public Pair(String from, String to) {
    this.from = from;
    this.to = to;
  }

  public String getFrom() {
    return this.from;
  }

  public String getTo() {
    return this.to;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (null == o || this.getClass() != o.getClass()) {
      return false;
    }

    Pair pair = (Pair) o;

    if (null != this.getFrom() ? !this.getFrom().equals(pair.getFrom()) : null != pair.getFrom()) {
      return false;
    }
    return null != this.getTo() ? this.getTo().equals(pair.getTo()) : null == pair.getTo();
  }

  @Override
  public int hashCode() {
    int result = null != this.getFrom() ? this.getFrom().hashCode() : 0;
    result = 31 * result + (null != this.getTo() ? this.getTo().hashCode() : 0);
    return result;
  }
}
