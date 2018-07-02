package com.thinkful.drill;

public class Fraction {

  private int numerator;
  private int denomator;

  public Fraction(int numerator, int denomator) {
    this.numerator = numerator;
    this.denomator = denomator;
  }

  public Fraction add(Fraction fraction) {
    this.numerator += fraction.getNumerator();
    this.denomator += fraction.getDenomator();
    return this;
  }

  public Fraction subtract(Fraction fraction) {
    this.numerator -= fraction.getNumerator();
    this.denomator -= fraction.getDenomator();
    return this;
  }

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public int getDenomator() {
    return denomator;
  }

  public void setDenomator(int denomator) {
    this.denomator = denomator;
  }

}