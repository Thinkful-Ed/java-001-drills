package com.thinkful.drills;

public class Hammer extends Weapon {
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
    super(name, damage, strength, weight, cost);
    this.setThrowingDistance(throwingDistance);
  }

  public void setThrowingDistance(double throwingDistance) {
    this.throwingDistance = throwingDistance;
  }

  public double getThrowingDistance() {
    return this.throwingDistance;
  }
}