/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 01 22:53:57 GMT 2019
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;


public class GrayPaintScale_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      Color color0 = (Color)grayPaintScale0.getPaint((-1.0));
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(0, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 1688.1562747046);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1688.1562747046, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale((-1.0), (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 3198.1);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(boolean0);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(3198.1, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals((Object) null);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(0.0, grayPaintScale0.getLowerBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(1.0, 1504.4539);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale(0.0, 1159.1218357);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(1159.1218357, grayPaintScale1.getUpperBound(), 0.01);
  }
}
