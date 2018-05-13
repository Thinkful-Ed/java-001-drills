package com.thinkful.drill;

public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void translate(double dx, double dy) {
    this.x += dx;
    this.y += dy;
  }

  public double distance(Point p) {
    return Math.abs((p.getX() - this.x) - (p.getY() - this.y));
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

}