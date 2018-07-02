package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.thinkful.drills.StringHelper;

import org.junit.Test;

public class StringHelperTest {
  @Test
  public void isNumericTest() {
    StringHelper helper = new StringHelper("20");
    assertTrue("Integer - 20 should be numeric", helper.isNumeric());
    
    helper.setValue("abc");
    assertFalse("abc should not be numeric", helper.isNumeric());

    helper.setValue("3.14");
    assertTrue("Real - 3.14 should be numeric", helper.isNumeric());

    helper.setValue("-1");
    assertTrue("Negative - -1 should be numeric", helper.isNumeric());
  }

  @Test
  public void containsTest() {
    StringHelper helper = new StringHelper("Here is a test String");
    assertTrue("should contain \"test\"", helper.contains("test"));
    assertTrue("should contain \"Here\"", helper.contains("Here"));
    assertTrue("should contain \"String\"", helper.contains("String"));
    assertTrue("should contain \"re a\"", helper.contains("re a"));
    assertTrue("should contain blank", helper.contains(""));
    assertFalse("should not contain \"there\"", helper.contains("there"));
    assertFalse("should not contain \"Hereis\"", helper.contains("Hereis"));
  }

  @Test
  public void toTitleCaseTest() {
    StringHelper helper = new StringHelper("abc");
    assertEquals("abc should be Abc", "Abc", helper.toTitleCase());

    helper.setValue("ABC");
    assertEquals("ABC should be Abc", "Abc", helper.toTitleCase());

    helper.setValue("the wind in the willows");
    assertEquals("\"the wind in the willows\" should be \"The Wind In The Willows\"", 
          "The Wind In The Willows", helper.toTitleCase());

    helper.setValue("aBc");
    assertEquals("aBc should be Abc", "Abc", helper.toTitleCase());
    
    helper.setValue("");
    assertEquals("\"\" should be \"\"", "", helper.toTitleCase());

    helper.setValue("123");
    assertEquals("\"123\" should be \"123\"", "123", helper.toTitleCase());
  }

  @Test
  public void padTest() {
    StringHelper helper = new StringHelper("inferno");
    assertEquals("pad a single character to beginning of String", "ainferno", helper.pad(1, 'a'));
    assertEquals("pad a single character to end of String", "infernoa", helper.pad(-1, 'a'));
    assertEquals("pad 5 characters to beginning of String", "aaaaainferno", helper.pad(5, 'a'));
    assertEquals("pad 5 characters to end of String", "infernoaaaaa", helper.pad(-5, 'a'));
    assertEquals("pad no characters to String", "inferno", helper.pad(0, 'a'));

    helper.setValue("");
    assertEquals("pad a single character to an empty String", "a", helper.pad(1, 'a'));
  }
}