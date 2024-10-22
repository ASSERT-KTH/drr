/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 22 14:35:58 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Paint;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.junit.runner.RunWith;


public class ValueMarker_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(275.49952778);
      double double0 = valueMarker0.getValue();
      assertEquals(275.49952778, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.18);
      valueMarker0.setValue(0.18);
      assertEquals(0.18, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(1304.6);
      Paint paint0 = candlestickRenderer0.getBasePaint();
      ValueMarker valueMarker0 = new ValueMarker(1304.6, paint0, candlestickRenderer0.DEFAULT_STROKE);
      assertEquals(1304.6, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(6036.62);
      ValueMarker valueMarker1 = new ValueMarker(1637.642400273);
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertFalse(boolean0);
      assertEquals(1637.642400273, valueMarker1.getValue(), 0.01);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker(0.0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      boolean boolean0 = valueMarker0.equals(integer0);
      assertFalse(boolean0);
      assertEquals(0.0, valueMarker0.getValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-175.89));
      IntervalMarker intervalMarker0 = new IntervalMarker((-1625.3239085750079), 70.0);
      boolean boolean0 = valueMarker0.equals(intervalMarker0);
      assertEquals((-175.89), valueMarker0.getValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ValueMarker valueMarker0 = new ValueMarker((-175.89));
      ValueMarker valueMarker1 = new ValueMarker((-175.89));
      boolean boolean0 = valueMarker0.equals(valueMarker1);
      assertEquals((-175.89), valueMarker1.getValue(), 0.01);
      assertTrue(boolean0);
  }
}
