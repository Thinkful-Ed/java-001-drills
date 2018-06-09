package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
    assertEquals(1.0, knife.getSharpness(), 0.01);
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
    assertEquals(1.0, knife.getSharpness(), 0.01);
  }

  @Test public void testCreateWithNameAndDamage() {
    String name = "Ragnarok";
    int damage = 20;
    Knife knife = new Knife(name, damage);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertNotEquals(1, knife.getDamage());
    assertEquals(damage, knife.getDamage());
    assertEquals(1, knife.getStrength());
    assertEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(1.0, knife.getCost(), 0.01);
    assertEquals(1.0, knife.getSharpness(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrength() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    Knife knife = new Knife(name, damage, strength);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertNotEquals(1, knife.getDamage());
    assertEquals(damage, knife.getDamage());
    assertNotEquals(1, knife.getStrength());
    assertEquals(strength, knife.getStrength());
    assertEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(1.0, knife.getCost(), 0.01);
    assertEquals(1.0, knife.getSharpness(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeight() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    Knife knife = new Knife(name, damage, strength, weight);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertNotEquals(1, knife.getDamage());
    assertEquals(damage, knife.getDamage());
    assertNotEquals(1, knife.getStrength());
    assertEquals(strength, knife.getStrength());
    assertNotEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(weight, knife.getWeight(), 0.01);
    assertEquals(1.0, knife.getCost(), 0.01);
    assertEquals(1.0, knife.getSharpness(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeightAndCost() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    Knife knife = new Knife(name, damage, strength, weight, cost);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertNotEquals(1, knife.getDamage());
    assertEquals(damage, knife.getDamage());
    assertNotEquals(1, knife.getStrength());
    assertEquals(strength, knife.getStrength());
    assertNotEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(weight, knife.getWeight(), 0.01);
    assertNotEquals(1.0, knife.getCost(), 0.01);
    assertEquals(cost, knife.getCost(), 0.01);
    assertEquals(1.0, knife.getSharpness(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeightAndCostAndSharpness() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    double sharpness = 0.5;
    Knife knife = new Knife(name, damage, strength, weight, cost, sharpness);
    assertNotNull(knife.getName());  
    assertEquals(name, knife.getName());
    assertNotEquals(1, knife.getDamage());
    assertEquals(damage, knife.getDamage());
    assertNotEquals(1, knife.getStrength());
    assertEquals(strength, knife.getStrength());
    assertNotEquals(1.0, knife.getWeight(), 0.01);
    assertEquals(weight, knife.getWeight(), 0.01);
    assertNotEquals(1.0, knife.getCost(), 0.01);
    assertEquals(cost, knife.getCost(), 0.01);
    assertNotEquals(1.0, knife.getSharpness(), 0.01);
    assertEquals(sharpness, knife.getSharpness(), 0.01);
  }

  @Test public void testAttack() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    double sharpness = 0.5;
    Knife knife = new Knife(name, damage, strength, weight, cost, sharpness);

    Wizard wizard = new Wizard();
    int expectedHealth = 80;

    knife.attack(wizard);

    assertEquals(expectedHealth, wizard.getHealth());


  }

}