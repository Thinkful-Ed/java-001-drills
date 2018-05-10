package com.thinkful.drill;

import java.util.Arrays;
import java.util.Scanner;

public class PigLatinSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String plainText = scanner.next();

    final char[] vowels = "aeiou".toCharArray();
    final char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();

    String cipher = "";

    if (Arrays.binarySearch(vowels, plainText.toLowerCase().charAt(0)) > -1
        || plainText.length() == 1) {
      cipher += plainText + "ay";
    } else if (Arrays.binarySearch(consonants, plainText.toLowerCase().charAt(0)) > -1) {
      cipher += plainText.substring(1) + plainText.charAt(0) + "ay";
    }
    System.out.println(cipher);
  }

}