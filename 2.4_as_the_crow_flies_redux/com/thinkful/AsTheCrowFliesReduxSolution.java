package com.thinkful;

import java.util.Scanner;

public class AsTheCrowFliesReduxSolution {

  /**
   * Radians converter - there are 0.01745329252 Radians for every Degree.
   */

  private static double toRadians(double degreeValue) {
    return degreeValue * 0.01745329252;
  }

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

  private static double distance(double xOne, double xTwo, double yOne, double yTwo) {
    double deltaY = toRadians(yTwo - yOne);
    return d(c(a(toRadians(xOne), toRadians(xTwo), deltaY)));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String oneMoreTime = "y";

    do {

      System.out.println("Please enter first x coordinate in degrees: ");
      double xOne = scanner.nextDouble();

      System.out.println("Please enter first y coordinate in degrees: ");
      double yOne = scanner.nextDouble();

      System.out.println("Please enter second x coordinate in degrees: ");
      double xTwo = scanner.nextDouble();

      System.out.println("Please enter second y coordinate in degrees: ");
      double yTwo = scanner.nextDouble();

      double distance = distance(xOne, xTwo, yOne, yTwo);

      String result = "Whoa! Too far!";

      if (distance < 1.00) {
        result = "Dude! We are practically in the same place! \n";
      } else if (distance < 5.00) {
        result = "Hey! That’s close enough, let’s hang out! \n";
      }

      System.out.print(result);

      System.out.println("Continue (y/n)?: ");
      oneMoreTime = scanner.next();

    } while (oneMoreTime.equals("y") || oneMoreTime.equals("yes"));

  }
}