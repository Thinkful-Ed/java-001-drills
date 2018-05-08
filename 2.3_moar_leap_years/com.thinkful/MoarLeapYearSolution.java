package com.thinkful;

import java.util.Scanner;

public class MoarLeapYearSolution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String oneMoreTime = "y";

    do {

      System.out.println("Please enter the year: ");
      Integer year = scanner.nextInt();
      String isLeapYear = "is not";

      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        isLeapYear = "is";
      }

      System.out.printf("%d %s a leap year \n", year, isLeapYear);

      System.out.println("Continue (y/n)?: ");
      oneMoreTime = scanner.next();

    } while (oneMoreTime.equals("y") || oneMoreTime.equals("yes") );

  }
}