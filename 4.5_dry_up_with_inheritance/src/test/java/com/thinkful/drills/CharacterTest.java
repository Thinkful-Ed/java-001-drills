package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CharacterTest {

  @Test public void testCreateNoArgs() {
    Character character = new Character();
    assertEquals("", character.getName());
    assertEquals("", character.getDescription());
    assertEquals(Character.INITIAL_HEALTH, character.getHealth());
    assertEquals(Character.INITIAL_STRENGTH, character.getStrength(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Gandalf";
    Character character = new Character(name);
    assertEquals(name, character.getName());
    assertNotEquals("", character.getName());
    assertEquals("", character.getDescription());
    assertEquals(Character.INITIAL_HEALTH, character.getHealth());
    assertEquals(Character.INITIAL_STRENGTH, character.getStrength(), 0.01);
  }

  @Test public void testCreateWithNameAndDescription() {
    String name = "Gandalf";
    String description = "Greyhelm";
    Character character = new Character(name, description);
    assertEquals(name, character.getName());
    assertNotEquals("", character.getName());
    assertEquals(description, character.getDescription());
    assertNotEquals("", character.getDescription());
    assertEquals(Character.INITIAL_HEALTH, character.getHealth());
    assertEquals(Character.INITIAL_STRENGTH, character.getStrength(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealth() {
    String name = "Gandalf";
    String description = "Greyhelm";
    int health = 60;
    Character character = new Character(name, description, health);
    assertEquals(name, character.getName());
    assertNotEquals("", character.getName());
    assertEquals(description, character.getDescription());
    assertNotEquals("", character.getDescription());
    assertEquals(health, character.getHealth());
    assertNotEquals(Character.INITIAL_HEALTH, character.getHealth());
    assertEquals(Character.INITIAL_STRENGTH, character.getStrength(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealthAndStrength() {
    String name = "Gandalf";
    String description = "Greyhelm";
    int health = 60;
    double strength = 200.0;
    Character character = new Character(name, description, health, strength);
    assertEquals(name, character.getName());
    assertNotEquals("", character.getName());
    assertEquals(description, character.getDescription());
    assertNotEquals("", character.getDescription());
    assertEquals(health, character.getHealth());
    assertNotEquals(Character.INITIAL_HEALTH, character.getHealth());
    assertEquals(strength, character.getStrength(), 0.01);
    assertNotEquals(Character.INITIAL_STRENGTH, character.getStrength(), 0.01);
  }

  @Test public void testHit() {
    Character character = new Character();
    int hit = 50;
    character.hit(hit);
    assertEquals(50, character.getHealth());
  }

  @Test public void testHitGreaterThanHealth() {
    Character character = new Character();
    int hit = 500;
    character.hit(hit);
    assertEquals(0, character.getHealth());
  }

}