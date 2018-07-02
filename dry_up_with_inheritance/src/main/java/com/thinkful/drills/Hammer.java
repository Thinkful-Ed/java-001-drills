package com.thinkful.drills;

public class Hammer {
  private int strength;
  private int damage;
  private double cost;
  private double weight;
  private String name;
  private double throwingDistance;

  public static final double DEFAULT_THROWING_DISTANCE = 25.0;

  /**
   * Create a new Hammer with default values.
   */
  public Hammer() {
    this(null);
  }

  /**
   * Create a new Hammer with name.
   */
  public Hammer(String name) {
    this(name, 1);
  }

  /**
   * Create a new Hammer with name and damage.
   */
  public Hammer(String name, int damage) {
    this(name, damage, 1);
  }

  /**
   * Create a new Hammer with name, damage and strength.
   */
  public Hammer(String name, int damage, int strength) {
    this(name, damage, strength, 1.0);
  }

  /**
   * Create a new Hammer with name, damage, strength and weight.
   */
  public Hammer(String name, int damage, int strength, double weight) {
    this(name, damage, strength, weight, 1);
  }

  /**
   * Create a new Hammer with name, damage, strength, weight and cost.
   */
  public Hammer(String name, int damage, int strength, double weight, double cost) {
    this(name, damage, strength, weight, cost, DEFAULT_THROWING_DISTANCE);
  }
  
  /**
   * Create a new Hammer with provided values and a custom Throwing distance.
   */
  public Hammer(
        String name, 
        int damage, 
        int strength, 
        double weight, 
        double cost, 
        double throwingDistance) {
    this.setName(name);
    this.setDamage(damage);
    this.setStrength(strength);
    this.setWeight(weight);
    this.setCost(cost);
    this.setThrowingDistance(throwingDistance);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getDamage() {
    return this.damage;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getStrength() {
    return this.strength;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public double getCost() {
    return this.cost;
  }

  public void setThrowingDistance(double throwingDistance) {
    this.throwingDistance = throwingDistance;
  }

  public double getThrowingDistance() {
    return this.throwingDistance;
  }

  /**
   * Performs a Hammer attack on a Wizard.
   */
  public void attack(Wizard wizard) {
    wizard.hit(this.getDamage());
  }

  /**
   *  Perform a Hammer attack on a dwarf
   */
  public void attack(Dwarf dwarf) {
    dwarf.hit(this.getDamage());
  }
}