package com.thinkful.drill;

import java.util.Arrays;

public class InsertionSolution {

  public static void main(String[] args) {

    int[] keys = {34, 12, 14, 17, 8, 3, 45, 56, 37, 27, 30, 19, 18, 53, 24};

    /**
     * In this example, we remove the unnessary sort function since we can use the native sort().
     *
     * Furthermore, if we were to use the custom sort() function in the original example, we'd have
     * to make it a static function. There's no need to create an instance of the class which removes the main issue!
     *
     * Remember, a static method belongs to the class and a non-static method belongs to an instance, or object, of the class!
     */

    Arrays.sort(keys);
    for (int i : keys) {
      System.out.println(i);
    }
  }

}