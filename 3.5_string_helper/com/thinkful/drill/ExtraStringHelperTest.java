package com.thinkful.drill;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExtraStringHelperTest {

  @Before
  public void preTest() {
  }

  @Test
  public void stringHelperTest() {
    com.thinkful.drill.StringHelper sh = new StringHelper("Hello World!");
    assertEquals(sh.getValue(), "Hello World!");

    assertEquals(sh.containsString("Hello"), true);
    assertEquals(sh.toTitleCase(), "HELLO WORLD!");

    sh.pad(2, "1".charAt(0));
    assertEquals(sh.getValue(), "11Hello World!11");
  }

  @After
  public void postTest() {
  }

}