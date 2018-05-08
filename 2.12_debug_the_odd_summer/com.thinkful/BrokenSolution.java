package com.thinkful;

public class BrokenSolution {

  public static void main(String[] args) {

    int[] keys = {34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24};
    int sum = 0;

    /**
     * Previously, the loop would only progress if there was an even number
     *
     * In this example, we've switched out the while-loop for a for-loop since we
     * want to iterate through each key.
     *
     * This time, we only sum the values if they have no remainder on mod 2
     */

    for (int count = 0; count < keys.length; count++) {
      if (keys[count] % 2 != 0) {
        sum += keys[count];
      }
    }

    System.out.printf("The sum of odd numbers is %d", sum);
  }

}