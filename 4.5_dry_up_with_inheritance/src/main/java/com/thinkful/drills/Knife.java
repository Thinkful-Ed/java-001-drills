package com.thinkful.drills;

public class Knife extends Weapon {

  private double sharpness;

  /**
   * Create a new Knife with default values.
   */
  public Knife() {
    this(null);
  }

  /**
   * Create a new Knife with name.
   */
  public Knife(String name) {
    this(name, 1);
  }

  /**
   * Create a new knife with name and damage.
   */
  public Knife(String name, int damage) {
    this(name, damage, 1);
  }

  /**
   * Create a new Knife with name, damage and strength.
   */
  public Knife(String name, int damage, int strength) {
    this(name, damage, strength, 1.0);
  }

  /**
   * Create a new Knife with name, damage, strength and weight.
   */
  public Knife(String name, int damage, int strength, double weight) {
    this(name, damage, strength, weight, 1);
  }

  /**
   * Create a new Knife with name, damage, strength and weight and cost.
   */
  public Knife(String name, int damage, int strength, double weight, double cost) {
    this(name, damage, strength, weight, cost, 1);
  }

  /**
   * Create a new knife with name, damage, strength, weight, cost and sharpness.
   */
  public Knife(
        String name, 
        int damage, 
        int strength, 
        double weight, 
        double cost, 
        double sharpness) {
    super(name, damage, strength, weight, cost);
    this.setSharpness(sharpness);
  }


  public void setSharpness(double sharpness) {
    this.sharpness = sharpness;
  }

  public double getSharpness() {
    return this.sharpness;
  }
}