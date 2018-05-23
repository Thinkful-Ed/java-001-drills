package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class KnifeTest {
  @Test public void testCreateNoArgs() {
    Knife knife = new Knife();
    assertNull(knife.getName());  
    assertEquals(1, knife.getDamage());
    assertEquals(1, knife.getStrength());
    assertEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(1.0, knife.getCost(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Ragnarok";
    Knife knife = new Knife(name);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertEquals(1, knife.getDamage());
    assertEquals(1, knife.getStrength());
    assertEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(1.0, knife.getCost(), 0.01);
  }

  
}