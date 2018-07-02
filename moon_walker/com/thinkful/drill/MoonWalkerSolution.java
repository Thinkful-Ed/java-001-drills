package com.thinkful.drill;

import java.util.Scanner;

public class MoonWalkerSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter weight in lbs: ");
    double yourEarthWeightInPounds = scanner.nextDouble();

    double yourEarthWeightInKg = yourEarthWeightInPounds / 2.2046226218;
    final double gravitationalConstant = 6.67E-11;
    final double moonMassKg = 7.35E22;
    final double moonRadiusM = 1.7355E6;
    final double earthForceOfGravity = 9.81;
    final double yourMass = yourEarthWeightInKg / earthForceOfGravity;
    final double moonForceOfGravity = gravitationalConstant * moonMassKg / (moonRadiusM * moonRadiusM);
    final double resultingMoonLbs = moonForceOfGravity * yourMass * 2.2046226218;

    System.out.printf("Your weight on the moon is roughly %f lbs \n", resultingMoonLbs);

    /**
     * Another way!
     */

    final double moonRadiusKm = moonRadiusM / 1000;
    final double earthMassKg = 5.972E24;
    final double massRatio = moonMassKg / earthMassKg;
    final double earthRadiusKm = 6371;
    final double radiusRatio = moonRadiusKm / earthRadiusKm;
    yourEarthWeightInKg = yourEarthWeightInKg * massRatio / (radiusRatio * radiusRatio);
    final double yourNewWeightInPounds = yourEarthWeightInKg * 2.2046226218;
    System.out.printf("Your weight on the moon is roughly %f lbs (solved another way)! \n",
        yourNewWeightInPounds);

    /**
     * An Easier Way :)
     */

    //Your moon weight = Your weight on earth /9.81 x 1.622
    System.out.println(
        "Your weight on the Moon is: " + yourEarthWeightInPounds / 9.81 * 1.622 + "lbs");

    System.out.println(
        "Your weight is .165 of that on Earth's or about: " + yourEarthWeightInPounds * .165
            + "lbs");

  }

}