package com.thinkful.drill;

import static org.junit.Assert.assertEquals;

import com.thinkful.drill.gridspot.EmptyBlock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BrickBreakerTest {

  @Before
  public void preTest() {
  }

  @Test
  public void brickBreakerTest() {

    Ball ball = new Ball();
    ball.updateBall(1, 1);
    assertEquals(ball.getNextCol(), 1);
    assertEquals(ball.getNextRow(), 1);

    Paddle paddle = new Paddle();
    paddle.onUserInput(2);
    assertEquals(paddle.getNextCol(), 2);

    Grid grid = new Grid(5, 5);
    grid.updateGrid(3,1);
    assertEquals(grid.getSpot(2,2) instanceof EmptyBlock, true);

  }

  @After
  public void postTest() {
  }

}
