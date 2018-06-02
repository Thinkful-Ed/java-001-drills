package com.thinkful.drill.shape;

public class Rectangle extends Shape {

  private double height;
  private double width;

  public Rectangle(double x, double y, double height, double width) {
    this.centerX = x;
    this.centerY = y;
    this.height = height;
    this.width = width;
  }

  public void resize(double adjustHeight, double adjustWidth) {
    this.height += this.height + adjustHeight;
    this.width += this.width + adjustWidth;
  }

  public double getArea() {
    return this.height * this.width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

}
