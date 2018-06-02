package com.thinkful.drill;

import com.thinkful.drill.shape.Shape;

public class Brush {

  private double brushSize;
  private Shape currentShape;

  public double getBrushSize() {
    return brushSize;
  }

  public void setBrushSize(double brushSize) {
    this.brushSize = brushSize;
  }

  public Shape getCurrentShape() {
    return currentShape;
  }

  public void setCurrentShape(Shape currentShape) {
    this.currentShape = currentShape;
  }

}
