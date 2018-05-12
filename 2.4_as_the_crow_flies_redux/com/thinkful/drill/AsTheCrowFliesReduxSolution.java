package com.thinkful.drill;

import java.util.Scanner;

public class AsTheCrowFliesReduxSolution {

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

      double deltaY = Math.toRadians(yTwo - yOne);
      xOne = Math.toRadians(xOne);
      xTwo = Math.toRadians(xTwo);
      double a = Math.pow(Math.sin((xTwo - xOne) / 2), 2) + Math.cos(xOne) * Math.cos(xTwo) * Math
          .pow(Math.sin(deltaY / 2), 2);
      double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
      double d = 6371 * c;

      System.out.printf("The calculated distance is %f km \n", d);

      String result = "Whoa! Too far! \n";

      if (d < 1.00) {
        result = "Dude! We are practically in the same place! \n";
      } else if (d < 5.00) {
        result = "Hey! That’s close enough, let’s hang out! \n";
      }

      System.out.print(result);

      System.out.println("Continue (y/n)?: ");
      oneMoreTime = scanner.next();

    } while (oneMoreTime.equals("y") || oneMoreTime.equals("yes"));

  }
}