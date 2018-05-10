package com.thinkful.drill;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGeneratorSolution {

  private static boolean matches(String regex, String string) {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(string);
    return m.find();
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a password: ");
    String password = scanner.next();
    String valid = "INVALID";

    boolean validLength = password.length() > 5 && password.length() < 21;

    final String lowerCase = "([abcdefghijklmnopqrstuvwxyz])+";
    final String upperCase = "([ABCDEFGHIJKLMNOPQRSTUVWXYZ])+";
    final String digits = "([1234567890])+";
    final String punc = "([!`~@#$%*+_\\-^&\\{\\[\\}\\]=|\\(\\.?:;\"'\\)\\\\])+";

    boolean hasLowerCase = matches(lowerCase, password);
    boolean hasUpperCase = matches(upperCase, password);
    boolean hasDigit = matches(digits, password);
    boolean hasPunc = matches(punc, password);

    if (validLength && hasLowerCase && hasUpperCase && hasDigit && hasPunc) {
      valid = "VALID";
    }

    System.out.printf("Your password is %s", valid);
  }

}
