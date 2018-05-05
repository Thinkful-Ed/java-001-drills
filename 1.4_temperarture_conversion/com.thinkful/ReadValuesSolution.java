package com.thinkful;

import java.util.Scanner;

public class ReadValuesSolution {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter degrees in C: ");
    double celsius = scanner.nextDouble();

    System.out.printf("That's %f degrees F!", celsius * 9/5 + 32);
  }
}