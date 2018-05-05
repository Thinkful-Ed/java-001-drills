package com.thinkful;

import java.util.Scanner;

public class WeightConverterSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter weight in pounds: ");
    String weightInPounds = scanner.next();

    //0.453592 kg = 1 lbs or 2.2046226218 lbs = 1 kg
    System.out.println(Double.valueOf(Integer.parseInt(weightInPounds) / 2.2046226218));
  }

}