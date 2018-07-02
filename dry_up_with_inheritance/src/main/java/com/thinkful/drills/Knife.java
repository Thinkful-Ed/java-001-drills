package com.thinkful.drills;

public class Knife {
  private int strength;
  private int damage;
  private double cost;
  private double weight;
  private String name;
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
    this.setName(name);
    this.setDamage(damage);
    this.setStrength(strength);
    this.setWeight(weight);
    this.setCost(cost);
    this.setSharpness(sharpness);
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

  public void setSharpness(double sharpness) {
    this.sharpness = sharpness;
  }

  public double getSharpness() {
    return this.sharpness;
  }

  /**
   * Performs a knife attack on a Wizard.
   */
  public void attack(Wizard wizard) {
    wizard.hit(this.getDamage());
  }

  /**
   *  Perform a Knife attack on a dwarf.
   */
  public void attack(Dwarf dwarf) {
    dwarf.hit(this.getDamage());
  }
}