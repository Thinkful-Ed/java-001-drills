package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HammerTest {
  @Test public void testCreateNoArgs() {
    Hammer hammer = new Hammer();
    assertNull(hammer.getName());  
    assertEquals(1, hammer.getDamage());
    assertEquals(1, hammer.getStrength());
    assertEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Ragnarok";
    Hammer hammer = new Hammer(name);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertEquals(1, hammer.getDamage());
    assertEquals(1, hammer.getStrength());
    assertEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithNameAndDamage() {
    String name = "Ragnarok";
    int damage = 20;
    Hammer hammer = new Hammer(name, damage);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertNotEquals(1, hammer.getDamage());
    assertEquals(damage, hammer.getDamage());
    assertEquals(1, hammer.getStrength());
    assertEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrength() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    Hammer hammer = new Hammer(name, damage, strength);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertNotEquals(1, hammer.getDamage());
    assertEquals(damage, hammer.getDamage());
    assertNotEquals(1, hammer.getStrength());
    assertEquals(strength, hammer.getStrength());
    assertEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeight() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    Hammer hammer = new Hammer(name, damage, strength, weight);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertNotEquals(1, hammer.getDamage());
    assertEquals(damage, hammer.getDamage());
    assertNotEquals(1, hammer.getStrength());
    assertEquals(strength, hammer.getStrength());
    assertNotEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(weight, hammer.getWeight(), 0.01);
    assertEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeightAndCost() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    Hammer hammer = new Hammer(name, damage, strength, weight, cost);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertNotEquals(1, hammer.getDamage());
    assertEquals(damage, hammer.getDamage());
    assertNotEquals(1, hammer.getStrength());
    assertEquals(strength, hammer.getStrength());
    assertNotEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(weight, hammer.getWeight(), 0.01);
    assertNotEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(cost, hammer.getCost(), 0.01);
    assertEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeightAndCostAndThrowingDistance() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    double throwingDistance = 0.5;
    Hammer hammer = new Hammer(name, damage, strength, weight, cost, throwingDistance);
    assertNotNull(hammer.getName());  
    assertEquals(name, hammer.getName());
    assertNotEquals(1, hammer.getDamage());
    assertEquals(damage, hammer.getDamage());
    assertNotEquals(1, hammer.getStrength());
    assertEquals(strength, hammer.getStrength());
    assertNotEquals(1.0, hammer.getWeight(), 0.01);
    assertEquals(weight, hammer.getWeight(), 0.01);
    assertNotEquals(1.0, hammer.getCost(), 0.01);
    assertEquals(cost, hammer.getCost(), 0.01);
    assertNotEquals(Hammer.DEFAULT_THROWING_DISTANCE, hammer.getThrowingDistance(), 0.01);
    assertEquals(throwingDistance, hammer.getThrowingDistance(), 0.01);
  }

  @Test public void testAttack() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    double throwingDistance = 0.5;
    Hammer hammer = new Hammer(name, damage, strength, weight, cost, throwingDistance);

    Wizard wizard = new Wizard();
    int expectedHealth = 80;

    hammer.attack(wizard);

    assertEquals(expectedHealth, wizard.getHealth());


  }

}