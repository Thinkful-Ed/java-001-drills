package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesAlternativeSolution {

  /**
   *  This example refactors the code we built in ReadValuesSolution.
   *
   *  While there's more code, it has certain advantages - can you name two?
   *
   *  One answer is that it handles garbage collection of of variables used during computation better.
   *  At each completed stage of the compution, only the necessary variable resources will be allocated.
   *
   *  Another answer is that the code is resuable, abstracted, and modularized. We can reuse the code through
   *  invocation rather than explicitly copying the same code blocks.
   *
   *  Lastly, it can arguably make the code more readable by separating most of the core math away from the
   *  main method.
   */

  private static double a(double xOne, double xTwo, double deltaY) {
    return Math.pow(Math.sin((xTwo - xOne) / 2), 2) + Math.cos(xOne) * Math.cos(xTwo) * Math
        .pow(Math.sin(deltaY / 2), 2);
  }

  private static double c(double a) {
    return 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  }

  private static double d(double c) {
    return 6371 * c;
  }

  //Core distance calculation method.

  private static double distance(double xOne, double xTwo, double yOne, double yTwo) {
    double deltaY = Math.toRadians(yTwo - yOne);
    return d(c(a(Math.toRadians(xOne), Math.toRadians(xTwo), deltaY)));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter first x coordinate in degrees: ");
    double xOne = scanner.nextDouble();

    System.out.println("Please enter first y coordinate in degrees: ");
    double yOne = scanner.nextDouble();

    System.out.println("Please enter second x coordinate in degrees: ");
    double xTwo = scanner.nextDouble();

    System.out.println("Please enter second y coordinate in degrees: ");
    double yTwo = scanner.nextDouble();

    System.out.printf("The calculated distance is %f km", distance(xOne, xTwo, yOne, yTwo));

  }

}