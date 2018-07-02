package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesSolution {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the amount: ");
    double amount = scanner.nextDouble();

    System.out.println("Please enter tax rate percentage: ");
    double taxRate = scanner.nextDouble();

    System.out.println("Please service rate percentage: ");
    double serviceCharge = scanner.nextDouble();

    System.out.printf("The tax amount owed is %f \n", amount * taxRate / 100);
    System.out.printf("The service amount owed is %f \n", amount * serviceCharge / 100);
    System.out.printf("Total amount owed is %f \n", amount + amount * serviceCharge / 100 + amount * taxRate / 100);

  }
}