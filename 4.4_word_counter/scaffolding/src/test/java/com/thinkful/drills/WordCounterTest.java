package com.thinkful.drills;

import org.junit.Test;

public class WordCounterTest {

  @Test
  public void testCountWords() {
    String filename = "PATH_TO\\words.txt";
    WordCounter counter = new WordCounter();
    counter.go(filename);
    assertEquals( counter.go(filename), 26);
  }
}