package com.thinkful.drill;

import com.thinkful.drill.gridspot.Brick;
import com.thinkful.drill.gridspot.EmptyBlock;
import com.thinkful.drill.gridspot.GridSpot;
import java.util.Arrays;

public class Grid {

  private GridSpot[][] grid;

  private GridSpot[] emptyRow(int cols) {
    GridSpot[] emptyRow = new GridSpot[cols];
    for( int i = 0; i < cols; i++) {
      emptyRow[i] = new EmptyBlock();
    }
    return emptyRow;
  }

  private GridSpot[] fullRow(int cols) {
    GridSpot[] fullRow = new GridSpot[cols];
    for( int i = 0; i < cols; i++) {
      fullRow[i] = new Brick();
    }
    return fullRow;
  }

  private void printGrid() {
    for (int i = 0; i < this.grid.length; i++) {
      System.out.println(Arrays.toString(this.grid[i]));
    }
  }

  public Grid(int rows, int cols) {
    GridSpot[][] newGrid = new GridSpot[rows][cols];
    for (int i = 0; i < rows; i++) {
      if (i > rows / 2)  newGrid[i] = fullRow(cols);
      else newGrid[i] = emptyRow(cols);
    }
    this.grid = newGrid;
    printGrid();
  }

  public GridSpot getSpot(int row, int col) {
    return this.grid[row][col];
  }

  public void updateGrid(int brickRow, int brickCol) {
      EmptyBlock emptyBlock = new EmptyBlock();
      this.grid[brickRow][brickCol] = emptyBlock;
      printGrid();
  }

  public GridSpot[][] getGrid() {
    return grid;
  }

  public void setGrid(GridSpot[][] grid) {
    this.grid = grid;
  }

}
