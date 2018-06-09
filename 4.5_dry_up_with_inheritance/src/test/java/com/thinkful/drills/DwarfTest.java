package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DwarfTest {
  @Test public void testCreateNoArgs() {
    Dwarf dwarf = new Dwarf();
    assertEquals("", dwarf.getName());
    assertEquals("", dwarf.getDescription());
    assertEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Gimli";
    Dwarf dwarf = new Dwarf(name);
    assertEquals(name, dwarf.getName());
    assertNotEquals("", dwarf.getName());
    assertEquals("", dwarf.getDescription());
    assertEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testCreateWithNameAndDescription() {
    String name = "Gimli";
    String description = "Son of Gloin";
    Dwarf dwarf = new Dwarf(name, description);
    assertEquals(name, dwarf.getName());
    assertNotEquals("", dwarf.getName());
    assertEquals(description, dwarf.getDescription());
    assertNotEquals("", dwarf.getDescription());
    assertEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealth() {
    String name = "Gimli";
    String description = "Son of Gloin";
    int health = 60;
    Dwarf dwarf = new Dwarf(name, description, health);
    assertEquals(name, dwarf.getName());
    assertNotEquals("", dwarf.getName());
    assertEquals(description, dwarf.getDescription());
    assertNotEquals("", dwarf.getDescription());
    assertEquals(health, dwarf.getHealth());
    assertNotEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealthAndStrength() {
    String name = "Gimli";
    String description = "Son of Gloin";
    int health = 60;
    double strength = 200.0;
    Dwarf dwarf = new Dwarf(name, description, health, strength);
    assertEquals(name, dwarf.getName());
    assertNotEquals("", dwarf.getName());
    assertEquals(description, dwarf.getDescription());
    assertNotEquals("", dwarf.getDescription());
    assertEquals(health, dwarf.getHealth());
    assertNotEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(strength, dwarf.getStrength(), 0.01);
    assertNotEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealthAndStrengthAndMagic() {
    String name = "Gimli";
    String description = "Son of Gloin";
    int health = 60;
    double strength = 200.0;
    double magic = 100.0;
    Dwarf dwarf = new Dwarf(name, description, health, strength, magic);
    assertEquals(name, dwarf.getName());
    assertNotEquals("", dwarf.getName());
    assertEquals(description, dwarf.getDescription());
    assertNotEquals("", dwarf.getDescription());
    assertEquals(health, dwarf.getHealth());
    assertNotEquals(Dwarf.INITIAL_HEALTH, dwarf.getHealth());
    assertEquals(strength, dwarf.getStrength(), 0.01);
    assertNotEquals(Dwarf.INITIAL_STRENGTH, dwarf.getStrength(), 0.01);
    assertEquals(magic, dwarf.getJumpHeight(), 0.01);
    assertNotEquals(Dwarf.INITIAL_JUMP, dwarf.getJumpHeight(), 0.01);
  }

  @Test public void testHit() {
    Dwarf dwarf = new Dwarf();
    int hit = 50;
    dwarf.hit(hit);
    assertEquals(25, dwarf.getHealth());
  }

  @Test public void testHitGreaterThanHealth() {
    Dwarf dwarf = new Dwarf();
    int hit = 500;
    dwarf.hit(hit);
    assertEquals(0, dwarf.getHealth());
  }

}