package com.thinkful.drills;

public class Dwarf extends Character {
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
    super(name, description, health, strength);
    this.setJumpHeight(jumpHeight);
  }

  public void setJumpHeight(double jumpHeight) {
    this.jumpHeight = jumpHeight;
  }

  public double getJumpHeight() {
    return this.jumpHeight;
  }

}