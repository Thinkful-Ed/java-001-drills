package com.thinkful.drills;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class WordCounter {
  
  /**
   * Load a file given by *filename* from the filesystem. 
   */
  public String loadFile(String filename) throws Exception {
    return Files.lines(Paths.get(filename)).collect(Collectors.joining(" "));
  }

  /**
   * Accepts a String text and counts the number 
   * of words in the text.
   * 
   * @param text String The String to be counted 
   */
  public int countWords(String text) {
    int count = 0;
    boolean inWord = false;
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      boolean isAlphaNum = Character.isAlphabetic(c) 
            || Character.isDigit(c)
            || c == '\'';
      if (inWord) {
        if (!isAlphaNum) {
          count++;
          inWord = false;
        }
      } else {
        inWord = isAlphaNum;
      }
    }

    //ensure you count the last word
    if (inWord) {
      count++;
    }

    return count;
  }

  /**
   * A starter method that runs this application.
   */
  public void go(String filename) {
    try {
      String text = loadFile(filename);
      int count = countWords(text);
      System.out.printf("There are %d words in the file %s", count, filename);
    } catch (Exception e) {
      System.out.println("There was a problem reading the file");
    }
  }

}