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
        "Your weight is on the Moon: " + Double.parseDouble(weightInPounds) / 9.81 * 1.622 + "lbs");

    System.out.println(
        "Your weight is .165 of that on Earth's: " + Double.parseDouble(weightInPounds) * .165
            + "lbs");

    /**
     * The Hard Way
     */

    //0.453592 kg = 1 lbs or 2.2046226218 lbs = 1 kg
    Double weightInKg = Integer.parseInt(weightInPounds) / 2.2046226218;

    final String moonMassKg = new BigDecimal("7.35e22").toPlainString();
    final String earthMassKg = new BigDecimal("5.972e24").toPlainString();
    final double massRatio = Double.valueOf(moonMassKg) / Double.valueOf(earthMassKg);

    final double moonRadiusKm = 1735.5;
    final double earthRadiusKm = 6371;
    final double radiusRatio = moonRadiusKm / earthRadiusKm;

    System.out.println(weightInKg * massRatio / (radiusRatio * radiusRatio) + "kg");

  }

}