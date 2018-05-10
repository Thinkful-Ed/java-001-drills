package com.thinkful;

import java.util.Scanner;

public class ReadValuesAdvancedSolution {

  private static Integer[] coins = new Integer[]{10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1};
  private static Integer[] change = new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter $ amount: ");
    Double amount = scanner.nextDouble() * 100;
    Integer amountInt = amount.intValue();

    int counter = 0;
    for (int coin : coins) {
      if (amountInt > coin) {
        int rem = amountInt % coin;
        int temp = amountInt - rem;
        change[counter] = temp / coin;
        amountInt = rem;
      } else if (amountInt % coin == 0) {
        change[counter] = amountInt / coin;
        break;
      }
      counter++;
    }

    System.out.printf(
        "You will receive %d $100 Bills, %d $50 Bills, %d $20 Bills, %d $10 Bills, %d $5 Bills, %d $1 Bills, %d Quarters, %d Dimes, %d Nickles, %d Pennies",
        change[0], change[1], change[2], change[3], change[4], change[5], change[6], change[7],
        change[8], change[9]);
  }
}