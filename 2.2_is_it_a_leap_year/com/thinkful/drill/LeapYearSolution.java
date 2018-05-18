package com.thinkful.drill;

import java.util.Scanner;

public class LeapYearSolution {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the year: ");
    Integer year = scanner.nextInt();

    if (year > 1581 ) {

      String isLeapYear = "is not";
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) isLeapYear = "is";
      System.out.printf("%d %s a leap year", year, isLeapYear);

    } else {
      System.out.println("Please supply a date after the start of the Gregorian calendar in year 1582!");
    }

  }
}