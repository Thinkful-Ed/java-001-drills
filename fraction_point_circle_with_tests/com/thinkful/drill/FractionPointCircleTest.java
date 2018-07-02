package com.thinkful.drill;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FractionPointCircleTest {

  Point point = new Point(2.00 , 2.00);
  Fraction fraction = new Fraction(1, 3);
  Circle circle = new Circle(0, 0 , 4);

  @Before
  public void preTest() { }

  @Test
  public void fractionTest() {
    assertEquals(fraction.getNumerator(), 1);
    assertEquals(fraction.getDenomator(), 3);

    fraction.add(new Fraction (3, 1));
    assertEquals(fraction.getDenomator(), 4);
    assertEquals(fraction.getNumerator(), 4);

    fraction.subtract(new Fraction (3, 1));
    assertEquals(fraction.getNumerator(), 1);
    assertEquals(fraction.getDenomator(), 3);
  }

  @Test
  public void pointTest() {
    assertEquals(point.getX(), 2.00, 0);
    assertEquals(point.getY(), 2.00, 0 );
    assertEquals(point.distance(new Point(2, 3)), 1, 0);

    point.translate(1,1);
    assertEquals(point.getX(), 3.00, 0);
    assertEquals(point.getY(), 3.00, 0 );
  }

  @Test
  public void circleTest() {
    assertEquals(circle.getCenterX(), 0, 0);
    assertEquals(circle.getCenterY(), 0, 0 );
    assertEquals(circle.area(), Math.PI * 16, 0);
    assertEquals(circle.circumference(), 2 * Math.PI * 4, 0);

    circle.translate(1,1);
    assertEquals(circle.getCenterX(), 1, 0);
    assertEquals(circle.getCenterY(), 1, 0 );
  }

  @After
  public void postTest() {}

}