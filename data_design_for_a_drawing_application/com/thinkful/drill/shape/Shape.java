package com.thinkful.drill.shape;

public class Shape {

  double centerX;
  double centerY;

  public void move(int adjustX, int adjustY) {
    this.centerX += this.centerX + adjustX;
    this.centerY += this.centerY + adjustY;
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

}
