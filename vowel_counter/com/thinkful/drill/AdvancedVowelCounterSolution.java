package com.thinkful.drill;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvancedVowelCounterSolution {

  private static int matchCount(String regex, String string) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(string);
    int count = 0;
    while (m.find()) {
      count++;
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String input = scanner.next();

    final String vowels = "[aeiouAEIOU]";

    int vowelCount = matchCount(vowels, input);

    System.out.printf("Your string has %d vowels!", vowelCount);
  }

}