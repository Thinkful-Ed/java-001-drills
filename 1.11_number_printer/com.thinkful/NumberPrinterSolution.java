package com.thinkful;

import java.util.Scanner;

public class NumberPrinterSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a five digit number: ");
    String number = scanner.next();

    if (number.length() != 5) {
      System.out.println("Exception: please enter a five digit number!");
    } else {
      System.out.println(number.charAt(0));
      System.out.println(number.charAt(1));
      System.out.println(number.charAt(2));
      System.out.println(number.charAt(3));
      System.out.println(number.charAt(4));
    }
  }
}