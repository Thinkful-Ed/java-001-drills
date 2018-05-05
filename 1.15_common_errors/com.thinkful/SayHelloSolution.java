package com.thinkful;

import java.util.Scanner;

public class SayHelloSolution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = scanner.next();
    System.out.printf("Hello %s, very nice to meet you!", name);
  }
}

    /*
        1. Change the word “String” on line 4 to “string”.

          - compile time - invalid syntax

        2. Change the word “public” on line 3 to “Public”.

          - compile time - invalid syntax

        3. Change the word “Hello” on line 8 to “hello”.

          - no error - though it is a typo

        4. Change the ‘%s’ on line 8 to ‘%d’.

          - run time - alters what argument type is taken from string to decimal integer at time of printing

        5. Move the open curly brace at the end of line 4 to the beginning of line 5.

          - no error - alternative syntax

        6. Change the word “println” on line 6 to “print”.

          - no error - may have unintended consequences since this calls the underlying PrintStream

        7. Remove the square brackets on line 4.

          - run time error - args must be an array

     */