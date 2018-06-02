package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesSolution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter $ amount: ");
    Double amount = scanner.nextDouble() * 100;
    Integer amountInt = amount.intValue();

    int hundreds = 0;
    int fifties = 0;
    int twenties = 0;
    int tens = 0;
    int fives = 0;
    int ones = 0;
    int quarters = 0;
    int dimes = 0;
    int nickles = 0;
    int pennies = 0;

    if (amountInt > 10000) {
      int rem = amountInt % 10000;
      hundreds = (amountInt - rem) / 10000;
      amountInt = rem;
    }

    if (amountInt > 5000) {
      int rem = amountInt % 5000;
      fifties = (amountInt - rem) / 5000;
      amountInt = rem;
    }

    if (amountInt > 2000) {
      int rem = amountInt % 2000;
      twenties = (amountInt - rem) / 2000;
      amountInt = rem;
    }

    if (amountInt > 1000) {
      int rem = amountInt % 1000;
      tens = (amountInt - rem) / 1000;
      amountInt = rem;
    }

    if (amountInt > 500) {
      int rem = amountInt % 500;
      fives = (amountInt - rem) / 500;
      amountInt = rem;
    }

    if (amountInt > 100) {
      int rem = amountInt % 100;
      ones = (amountInt - rem) / 100;
      amountInt = rem;
    }

    if (amountInt > 25) {
      int rem = amountInt % 25;
      quarters = (amountInt - rem) / 25;
      amountInt = rem;
    }

    if (amountInt > 10) {
      int rem = amountInt % 10;
      dimes = (amountInt - rem) / 10;
      amountInt = rem;
    }

    if (amountInt > 5) {
      int rem = amountInt % 5;
      nickles = amountInt - rem / 5;
      amountInt = rem;
    }

    pennies = amountInt;

    System.out.printf(
        "You will receive %d $100 Bills, %d $50 Bills, %d $20 Bills, %d $10 Bills, %d $5 Bills, %d $1 Bills, %d Quarters, %d Dimes, %d Nickles, %d Pennies",
        hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickles, pennies);
  }
}