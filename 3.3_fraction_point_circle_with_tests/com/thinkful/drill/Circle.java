package com.thinkful.drill;

public class Circle {

  private double centerX;
  private double centerY;
  private double radius;

  public Circle(double centerX, double centerY, double radius) {
    this.centerX = centerX;
    this.centerY = centerY;
    this.radius = radius;
  }

  public void translate(double dx, double dy) {
    this.centerX += dx;
    this.centerY += dy;
  }

  public double area() {
    return Math.PI * (this.radius * this.radius);
  }

  public double circumference() {
    return 2 * Math.PI * this.radius;
  }

  public double getCenterX() {
    return centerX;
  }

  public void setCenterX(double centerX) {
    this.centerX = centerX;
  }

  public double getCenterY() {
    return centerY;
  }

  public void setCenterY(double centerY) {
    this.centerY = centerY;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

}