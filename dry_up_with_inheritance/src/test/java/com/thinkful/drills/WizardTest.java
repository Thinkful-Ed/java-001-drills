package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class WizardTest {
  @Test public void testCreateNoArgs() {
    Wizard wizard = new Wizard();
    assertEquals("", wizard.getName());
    assertEquals("", wizard.getDescription());
    assertEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Gandalf";
    Wizard wizard = new Wizard(name);
    assertEquals(name, wizard.getName());
    assertNotEquals("", wizard.getName());
    assertEquals("", wizard.getDescription());
    assertEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testCreateWithNameAndDescription() {
    String name = "Gandalf";
    String description = "Greyhelm";
    Wizard wizard = new Wizard(name, description);
    assertEquals(name, wizard.getName());
    assertNotEquals("", wizard.getName());
    assertEquals(description, wizard.getDescription());
    assertNotEquals("", wizard.getDescription());
    assertEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealth() {
    String name = "Gandalf";
    String description = "Greyhelm";
    int health = 60;
    Wizard wizard = new Wizard(name, description, health);
    assertEquals(name, wizard.getName());
    assertNotEquals("", wizard.getName());
    assertEquals(description, wizard.getDescription());
    assertNotEquals("", wizard.getDescription());
    assertEquals(health, wizard.getHealth());
    assertNotEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealthAndStrength() {
    String name = "Gandalf";
    String description = "Greyhelm";
    int health = 60;
    double strength = 200.0;
    Wizard wizard = new Wizard(name, description, health, strength);
    assertEquals(name, wizard.getName());
    assertNotEquals("", wizard.getName());
    assertEquals(description, wizard.getDescription());
    assertNotEquals("", wizard.getDescription());
    assertEquals(health, wizard.getHealth());
    assertNotEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(strength, wizard.getStrength(), 0.01);
    assertNotEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testCreateWithNameAndDescriptionAndHealthAndStrengthAndMagic() {
    String name = "Gandalf";
    String description = "Greyhelm";
    int health = 60;
    double strength = 200.0;
    double magic = 100.0;
    Wizard wizard = new Wizard(name, description, health, strength, magic);
    assertEquals(name, wizard.getName());
    assertNotEquals("", wizard.getName());
    assertEquals(description, wizard.getDescription());
    assertNotEquals("", wizard.getDescription());
    assertEquals(health, wizard.getHealth());
    assertNotEquals(Wizard.INITIAL_HEALTH, wizard.getHealth());
    assertEquals(strength, wizard.getStrength(), 0.01);
    assertNotEquals(Wizard.INITIAL_STRENGTH, wizard.getStrength(), 0.01);
    assertEquals(magic, wizard.getMagicRating(), 0.01);
    assertNotEquals(Wizard.INITIAL_MAGIC_RATING, wizard.getMagicRating(), 0.01);
  }

  @Test public void testHit() {
    Wizard wizard = new Wizard();
    int hit = 50;
    wizard.hit(hit);
    assertEquals(50, wizard.getHealth());
  }

  @Test public void testHitGreaterThanHealth() {
    Wizard wizard = new Wizard();
    int hit = 500;
    wizard.hit(hit);
    assertEquals(0, wizard.getHealth());
  }

}