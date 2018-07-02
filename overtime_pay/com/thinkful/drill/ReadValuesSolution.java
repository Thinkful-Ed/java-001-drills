package com.thinkful.drill;

import java.util.Scanner;

public class ReadValuesSolution {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your hourly rate: ");
    Double rate = scanner.nextDouble();

    System.out.printf("Please enter your weekly hours: ");
    Double hours = scanner.nextDouble();
    Double overtime = 0.00;

    if (hours > 40.00) {
      overtime = hours - 40.00;
      hours = 40.00;
    }

    System.out.printf("Holy Moly! You'll be making %f dollars per week!", rate * hours + 1.5 * rate * overtime);
  }
}