package com.thinkful.drill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayMergerSolution {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please specify first array separated/delimited by commas: ");
    String firstArrayAsString = scanner.next();

    System.out.println("Please specify second array separated/delimited by commas: ");
    String secondArrayAsString = scanner.next();

    /**
     * Convert to Arrays then sort (if they are not sorted already)
     */

    String[] firstArray = firstArrayAsString.split(",");
    Arrays.sort(firstArray);

    String[] secondArray = secondArrayAsString.split(",");
    Arrays.sort(secondArray);

    /**
     *  Way #1: Create a String and sort the resulting combined Array
     */

    String[] stringResultArray = (firstArrayAsString + "," + secondArrayAsString).split(",");
    Arrays.sort(stringResultArray);

    System.out.println(Arrays.toString(stringResultArray));

    /**
     *  Way #2: Using Lists
     */

    List tempList = new ArrayList(Arrays.asList(firstArray));
    tempList.addAll(Arrays.asList(secondArray));
    Object[] listResultArray = tempList.toArray();
    Arrays.sort(listResultArray);
    System.out.println(Arrays.toString(listResultArray));

  }
}