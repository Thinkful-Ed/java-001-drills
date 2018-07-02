package com.thinkful.drill;

public class Paddle {

  private int currentCol;
  private int nextCol;

  public Paddle() {
    this.currentCol = 0;
    this.nextCol = 0;
  }

  public void onUserInput(int adjustCol) {
    this.nextCol = this.currentCol + adjustCol;
  }

  public int getCurrentCol() {
    return currentCol;
  }

  public void setCurrentCol(int currentCol) {
    this.currentCol = currentCol;
  }

  public int getNextCol() {
    return nextCol;
  }

}
