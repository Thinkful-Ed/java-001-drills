package com.thinkful.drill;

import java.util.Scanner;

public class PasswordGeneratorSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a password: ");
    String password = scanner.next();
    String valid = "INVALID";

    boolean validLength = password.length() > 5 && password.length() < 21;
    boolean hasLowerCase = false;
    boolean hasUpperCase  = false;
    boolean hasDigit  = false;
    boolean hasPunc  = false;

    final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String digits = "1234567890";
    final String punc = "!`~@#$%*+_\\-^&{[}]=|(.?:;\"')/";

    for (int i = 0; i < password.length(); i++) {
      if (lowerCase.indexOf(password.charAt(i)) != -1) hasLowerCase = true;
      if (upperCase.indexOf(password.charAt(i)) != -1) hasUpperCase = true;
      if (digits.indexOf(password.charAt(i)) != -1) hasDigit = true;
      if (punc.indexOf(password.charAt(i)) != -1) hasPunc = true;
    }

    if (validLength && hasLowerCase && hasUpperCase && hasDigit && hasPunc) valid = "VALID";

    System.out.println(validLength + " " + hasLowerCase  + " " +  hasUpperCase  + " " +  hasDigit  + " " + hasPunc);
    System.out.printf("Your password is %s", valid);
  }

}
