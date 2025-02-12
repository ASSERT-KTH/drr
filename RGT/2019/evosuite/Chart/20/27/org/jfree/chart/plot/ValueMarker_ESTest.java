/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 15:00:30 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.junit.runner.RunWith;


public class ValueMarker_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-849.5897989));
      Object object0 = new Object();
      boolean boolean0 = valueMarker0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-849.5897989), valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(3782.4754791465098);
      double double0 = valueMarker0.getValue();
      assertEquals(3782.4754791465098, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      valueMarker0.setValue(0.0);
      assertEquals(0.0, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Color color0 = Color.darkGray;
      BasicStroke basicStroke0 = (BasicStroke)XYPlot.DEFAULT_GRIDLINE_STROKE;
      ValueMarker valueMarker0 = new ValueMarker(0.0, color0, basicStroke0);
      assertEquals(0.0, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.18);
      ValueMarker valueMarker1 = new ValueMarker(0.18);
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertEquals(0.18, valueMarker1.getValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.18);
      ValueMarker valueMarker1 = new ValueMarker(1699.663748);
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertEquals(1699.663748, valueMarker1.getValue(), 0.01);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertFalse(boolean0);
  }
}
