package com.thinkful.drills;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordCounterTest {

  @Test
  public void testCountWords() {
    String sentence = "one two three four";
    WordCounter counter = new WordCounter();
    assertEquals(counter.countWords(sentence), 4);
  }

  @Test
  public void testCountWordsWithEmptyString() {
    String sentence = "";
    WordCounter counter = new WordCounter();
    assertEquals(counter.countWords(sentence), 0);
  }

  @Test
  public void testCountWordsWithApostrophe() {
    String sentence = "\"Don't go!\" she cried.";
    WordCounter counter = new WordCounter();
    assertEquals(counter.countWords(sentence), 4);
  }

}