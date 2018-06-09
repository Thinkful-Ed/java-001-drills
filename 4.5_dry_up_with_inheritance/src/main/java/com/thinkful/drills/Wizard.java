package com.thinkful.drills;

public class Wizard {
  private String name;
  private String description;
  private int health;
  private double strength;
  private double magicRating;
  
  public static final int INITIAL_HEALTH = 100;
  public static final double INITIAL_STRENGTH = 100.0;
  public static final double INITIAL_MAGIC_RATING = 0;

  /**
   * Create a Wizard with all default values.
   */
  public Wizard() {
    this("");
  }

  /**
   * Create a Wizard with name and default values.
   */
  public Wizard(String name) {
    this(name, "");
  }

  /**
   * Create a Wizard with name, description and default values.
   */
  public Wizard(String name, String description) {
    this(name, description, INITIAL_HEALTH);
  }

  /**
   * Create a Wizard with name, description, health and default values.
   */
  public Wizard(String name, String description, int health) {
    this(name, description, health, INITIAL_STRENGTH);
  }

  /**
   * Create a Wizard with name, description, health, strength and default values.
   */
  public Wizard(String name, String description, int health, double strength) {
    this(name, description, health, strength, INITIAL_MAGIC_RATING);
  }

  /**
   * Create a Wizard with name, description, health, strength and default values.
   */
  public Wizard(String name, String description, int health, double strength, double magicRating) {
    this.setName(name);
    this.setHealth(health);
    this.setStrength(strength);
    this.setDescription(description);
    this.setMagicRating(magicRating);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getHealth() {
    return this.health;
  }

  public void setStrength(double strength) {
    this.strength = strength;
  }

  public double getStrength() {
    return this.strength;
  }

  public void setMagicRating(double magicRating) {
    this.magicRating = magicRating;
  }

  public double getMagicRating() {
    return this.magicRating;
  }

  /**
   * Apply a hit to this character.
   * A hit subtracts powerOfHit from the total health of
   * the character. If health drops below 0 it is reset to 0.
   * 
   * @param powerOfHit int The amount of damage that is done to the character
   */
  public void hit(int powerOfHit) {
    this.setHealth(Math.max(this.getHealth() - powerOfHit, 0));
  }

}