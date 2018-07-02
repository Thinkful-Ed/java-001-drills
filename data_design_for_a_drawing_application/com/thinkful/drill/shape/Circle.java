package com.thinkful.drill.shape;

public class Circle extends Shape {

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

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

}