package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesSolution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter $ amount: ");

    // read the input from the user in dollars and cents
    //and multiply by 100 to convert to cents
    double amount = scanner.nextDouble();
    int amountInt = (int)Math.floor(amount * 100);

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

    // calculate number of $100 bills
    hundreds = amountInt / 10000;
    amountInt = amountInt % 100000;

    // calculate number of $50 bills
    fifties = amountInt / 5000;
    amountInt = amountInt % 5000;

    // calculate number of $20 bills
    twenties = amountInt / 2000;
    amountInt = amountInt % 2000;

    // calculate number of $10 bills
    tens = amountInt / 1000;
    amountInt = amountInt % 1000;

    // calculate number of $5 bills
    fives = amountInt / 500;
    amountInt = amountInt % 500;

    // calculate the number of $1 bills
    ones = amountInt / 100;
    amountInt = amountInt % 100;

    // calculate the number of quarters
    quarters = amountInt / 25;
    amountInt = amountInt % 25;

    // calculate the number of dimes
    dimes = amountInt / 10;
    amountInt = amountInt % 10;

    // calculate the number of nickles and pennies
    nickles = amountInt / 5;
    pennies = amountInt % 5;


    System.out.printf(
        "To make $%.2f, you will receive\n"
        + "%d $100 Bills\n"
        + "%d $50 Bills\n"
        + "%d $20 Bills\n"
        + "%d $10 Bills\n"
        + "%d $5 Bills\n"
        + "%d $1 Bills\n"
        + "%d Quarters\n"
        + "%d Dimes\n"
        + "%d Nickles\n"
        + "%d Pennies\n",
        amount, hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickles, pennies);
  }
}