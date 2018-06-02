package com.thinkful.drill;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounterSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String input = scanner.next();

    final String vowels = "aeiouAEIOU";

    int vowelCount = 0;

    for (int i = 0; i < input.length(); i++) {
      if (vowels.indexOf(input.charAt(i)) != -1) vowelCount++;
    }

    System.out.printf("Your string has %d vowels!", vowelCount);
  }

}