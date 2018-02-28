package org.gradle.sample;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Franco Aldunate on 2/22/2018.
 */
public class GreeterTest {
  Greeter greeter;

  @Before
  public void setUp() {
    greeter = new Greeter();
  }

  @Test
  public void testGetGreetingReturnsTrue() {
    boolean actualResult = true;
    assertTrue(actualResult);
  }

  @Test
  public void testGetGreetingReturnsFalse() {
    boolean actualResult = false;
    assertFalse(actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestOne() {
    int expectedResult = 1;
    int actualResult = 1;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestTwo() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestThree() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestFour() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestFive() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestSix() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestSeven() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetGreetingEqualsTestEight() {
    int expectedResult = 10;
    int actualResult = 10;
    assertEquals(expectedResult, actualResult);
  }
}
