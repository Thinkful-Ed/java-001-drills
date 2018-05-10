package com.thinkful.drill;

import java.util.Scanner;

public class NumberPrinterSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a five digit number: ");
    Integer number = scanner.nextInt();
    Integer numberCopy = number;

    if (number.toString().length() != 5) {
      System.out.println("Exception: please enter a five digit number!");
    } else {

      /**
       * Non-loop way.
       */
      int remainder = number % 10;
      number = number / 10;
      System.out.println(remainder);
      remainder = number % 10;
      number = number / 10;
      System.out.println(remainder);
      remainder = number % 10;
      number = number / 10;
      System.out.println(remainder);
      remainder = number % 10;
      number = number / 10;
      System.out.println(remainder);
      remainder = number % 10;
      System.out.println(remainder);

      /**
       * While loop way.
       */

      while (numberCopy > 0) {
        int rem = numberCopy % 10;
        numberCopy = numberCopy / 10;
        System.out.println(rem);
      }

    }
  }
}