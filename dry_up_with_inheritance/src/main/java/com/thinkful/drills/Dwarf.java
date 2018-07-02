package com.thinkful.drills;

public class Dwarf {
  private String name;
  private String description;
  private int health;
  private double strength;
  private double jumpHeight;
  
  public static final int INITIAL_HEALTH = 75;
  public static final double INITIAL_STRENGTH = 50.0;
  public static final double INITIAL_JUMP = 25.0;

  /**
   * Create a new Dwarf with default values.
   */
  public Dwarf() {
    this("");
  }

  /**
   * Create a new Dwarf with name and default values.
   */
  public Dwarf(String name) {
    this(name, "");
  }

  /**
   * Create a new Dwarf with name, description and default values.
   */
  public Dwarf(String name, String description) {
    this(name, description, INITIAL_HEALTH);
  }

  /**
   * Create a new Dwarf with name, health and default values.
   */
  public Dwarf(String name, String description, int health) {
    this(name, description, health, INITIAL_STRENGTH);
  }

  /**
   * Create a new Dwarf with given values.
   */
  public Dwarf(String name, String description, int health, double strength) {
    this(name, description, health, strength, INITIAL_JUMP);
  }

  /**
   * Create a new Dwarf with given values.
   */
  public Dwarf(String name, String description, int health, double strength, double jumpHeight) {
    this.setName(name);
    this.setHealth(health);
    this.setStrength(strength);
    this.setDescription(description);
    this.setJumpHeight(jumpHeight);
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

  public void setJumpHeight(double jumpHeight) {
    this.jumpHeight = jumpHeight;
  }

  public double getJumpHeight() {
    return this.jumpHeight;
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