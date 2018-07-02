package com.thinkful.drills;

public class Character {
  private String name;
  private String description;
  private int health;
  private double strength;

  public static final int INITIAL_HEALTH = 100;
  public static final double INITIAL_STRENGTH = 100.0;

  /**
   * Create a Character with all default values.
   */
  public Character() {
    this("");
  }

  /**
   * Create a Character with name and default values.
   */
  public Character(String name) {
    this(name, "");
  }

  /**
   * Create a Character with name, description and default values.
   */
  public Character(String name, String description) {
    this(name, description, INITIAL_HEALTH);
  }

  /**
   * Create a Character with name, description, health and default values.
   */
  public Character(String name, String description, int health) {
    this(name, description, health, INITIAL_STRENGTH);
  }

  /**
   * Create a Character with name, description, health and strength.
   */
  public Character(String name, String description, int health, double strength) {
    this.setName(name);
    this.setHealth(health);
    this.setStrength(strength);
    this.setDescription(description);
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