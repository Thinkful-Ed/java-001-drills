package com.thinkful.drill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     * Way #1: Simple Linear Array Merge Sort
     */

    List<Integer> resultOne = new ArrayList<>();
    int i = 0, j = 0,
        maxFirstIndex = firstArray.length - 1,
        maxSecondIndex = secondArray.length - 1;

    List<String> tempList = new ArrayList<String>(Arrays.asList(firstArray));
    tempList.addAll(Arrays.asList(secondArray));

    do {

      Integer a = Integer.parseInt(firstArray[i]);
      Integer b = Integer.parseInt(secondArray[j]);

      if (a > b || a.equals(b)) {
        if (tempList.indexOf(b.toString()) != -1) {
          resultOne.add(b);
          tempList.remove(b.toString());
          if (j < maxSecondIndex) j++;
        } else if (tempList.indexOf(a.toString()) != -1) {
          resultOne.add(a);
          tempList.remove(a.toString());
          if (i < maxFirstIndex) i++;
        }
      } else {
        if (tempList.indexOf(a.toString()) != -1) {
          resultOne.add(a);
          tempList.remove(a.toString());
          if (i < maxFirstIndex) i++;
        } else if (tempList.indexOf(b.toString()) != -1) {
          resultOne.add(b);
          tempList.remove(b.toString());
          if (j < maxSecondIndex) j++;
        }
      }

    } while (resultOne.size() < maxFirstIndex + maxSecondIndex + 2);
    System.out.println(resultOne.toString());

    /**
     * Way #2: A last example using comparators!
     */

    List<Integer> resultTwo = new ArrayList<>();
    for (String a : firstArray) {
      resultTwo.add(Integer.parseInt(a));
    }
    for (String b : secondArray) {
      resultTwo.add(Integer.parseInt(b));
    }
    Collections.sort(resultTwo);
    System.out.println(resultTwo.toString());

  }
}