package com.thinkful;

public class DeclareAndPrintSolution {

  public static void main(String[] args) {

    Integer temperature = 79;
    String highestTemp = "highest temperature in June in New York is %d °F \n";
    System.out.printf(highestTemp, temperature);

    String courseName = "the name of this course is \"Java/Spring programming\"";
    System.out.println(courseName);

    String phoneNumber = "the phone number of the bus service is 555-5555";
    System.out.println(phoneNumber);

    Double price = 39.98;
    String shoeCost = "the price of the shoe is $%f \n";
    System.out.printf(shoeCost, price);

    /**
     * Sometimes it makes sense to use a String to represent a numeric values.
     */
    String mass =  "1.89813 × 10²⁷";
    String stringMass = "the mass of the planet Jupiter is %s kilograms \n";
    System.out.printf(stringMass, mass);

    /**
     * But, instead, we can use scientific notation directly when initializing or setting Doubles!
     */
    Double altMass = 1.89813E27;
    String numericMass = "the mass of the planet Jupiter is %f kilograms \n";
    System.out.printf(numericMass, altMass);


  }

}