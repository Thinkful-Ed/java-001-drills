package com.thinkful.drills;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class WeaponTest {
  @Test public void testCreateNoArgs() {
    Weapon weapon = new Weapon();
    assertNull(weapon.getName());  
    assertEquals(1, weapon.getDamage());
    assertEquals(1, weapon.getStrength());
    assertEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(1.0, weapon.getCost(), 0.01);
  }

  @Test public void testCreateWithName() {
    String name = "Ragnarok";
    Weapon weapon = new Weapon(name);
    assertNotNull(weapon.getName());  
    assertEquals(name, weapon.getName());
    assertEquals(1, weapon.getDamage());
    assertEquals(1, weapon.getStrength());
    assertEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(1.0, weapon.getCost(), 0.01);
  }

  @Test public void testCreateWithNameAndDamage() {
    String name = "Ragnarok";
    int damage = 20;
    Weapon weapon = new Weapon(name, damage);
    assertNotNull(weapon.getName());  
    assertEquals(name, weapon.getName());
    assertNotEquals(1, weapon.getDamage());
    assertEquals(damage, weapon.getDamage());
    assertEquals(1, weapon.getStrength());
    assertEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(1.0, weapon.getCost(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrength() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    Weapon weapon = new Weapon(name, damage, strength);
    assertNotNull(weapon.getName());  
    assertEquals(name, weapon.getName());
    assertNotEquals(1, weapon.getDamage());
    assertEquals(damage, weapon.getDamage());
    assertNotEquals(1, weapon.getStrength());
    assertEquals(strength, weapon.getStrength());
    assertEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(1.0, weapon.getCost(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeight() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    Weapon weapon = new Weapon(name, damage, strength, weight);
    assertNotNull(weapon.getName());  
    assertEquals(name, weapon.getName());
    assertNotEquals(1, weapon.getDamage());
    assertEquals(damage, weapon.getDamage());
    assertNotEquals(1, weapon.getStrength());
    assertEquals(strength, weapon.getStrength());
    assertNotEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(weight, weapon.getWeight(), 0.01);
    assertEquals(1.0, weapon.getCost(), 0.01);
  }

  @Test public void testCreateWithNameAndDamageAndStrengthAndWeightAndCost() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    Weapon weapon = new Weapon(name, damage, strength, weight, cost);
    assertNotNull(weapon.getName());  
    assertEquals(name, weapon.getName());
    assertNotEquals(1, weapon.getDamage());
    assertEquals(damage, weapon.getDamage());
    assertNotEquals(1, weapon.getStrength());
    assertEquals(strength, weapon.getStrength());
    assertNotEquals(1.0, weapon.getWeight(), 0.01);
    assertEquals(weight, weapon.getWeight(), 0.01);
    assertNotEquals(1.0, weapon.getCost(), 0.01);
    assertEquals(cost, weapon.getCost(), 0.01);
  }

  @Test public void testAttack() {
    String name = "Ragnarok";
    int damage = 20;
    int strength = 20;
    double weight = 20.0;
    double cost = 20.0;
    Weapon weapon = new Weapon(name, damage, strength, weight, cost);

    Wizard wizard = new Wizard();
    int expectedHealth = 80;

    weapon.attack(wizard);

    assertEquals(expectedHealth, wizard.getHealth());
  }

}