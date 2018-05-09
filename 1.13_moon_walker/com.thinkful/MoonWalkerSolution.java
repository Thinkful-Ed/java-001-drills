package com.thinkful;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoonWalkerSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter weight in pounds: ");
    String weightInPounds = scanner.next();

    /**
     * The Easy Way
     */

    //Your moon weight = Your weight on earth /9.81 x 1.622
    System.out.println(
        "Your weight on the Moon is: " + Double.parseDouble(weightInPounds) / 9.81 * 1.622 + "lbs");

    System.out.println(
        "Your weight is .165 of that on Earth's or about: " + Double.parseDouble(weightInPounds) * .165
            + "lbs");

    /**
     * The Hard Way
     */

    //0.453592 kg = 1 lbs or 2.2046226218 lbs = 1 kg
    double weightInKg = Double.parseDouble(weightInPounds) / 2.2046226218;

    final double moonMassKg = 7.35E22;
    final double earthMassKg = 5.972E24;
    final double massRatio = moonMassKg / earthMassKg;

    final double moonRadiusKm = 1735.5;
    final double earthRadiusKm = 6371;
    final double radiusRatio = moonRadiusKm / earthRadiusKm;

    System.out.printf("Your weight on the moon is roughly %f kg's", weightInKg * massRatio / (radiusRatio * radiusRatio));

  }

}