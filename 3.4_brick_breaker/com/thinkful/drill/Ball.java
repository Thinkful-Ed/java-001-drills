package com.thinkful.drill;

public class Ball {

  private int currentRow;
  private int currentCol;
  private int nextRow;
  private int nextCol;

  public Ball () {
    this.currentCol = 0;
    this.currentRow = 0;
    this.nextRow = 1;
    this.nextCol = 1;
  }

  public void updateBall(int adjustRow, int adjustCol) {
    this.nextRow = this.currentRow + adjustRow;
    this.nextCol = this.currentCol + adjustCol;
  }

  public int getCurrentRow() {
    return currentRow;
  }

  public void setCurrentRow(int currentRow) {
    this.currentRow = currentRow;
  }

  public int getCurrentCol() {
    return currentCol;
  }

  public void setCurrentCol(int currentCol) {
    this.currentCol = currentCol;
  }

  public int getNextRow() {
    return nextRow;
  }

  public void setNextRow(int nextRow) {
    this.nextRow = nextRow;
  }

  public int getNextCol() {
    return nextCol;
  }

  public void setNextCol(int nextCol) {
    this.nextCol = nextCol;
  }

}
