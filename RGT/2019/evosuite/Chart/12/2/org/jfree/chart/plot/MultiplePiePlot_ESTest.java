/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 01 21:42:07 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.awt.RadialGradientPaint;
import java.awt.SystemColor;
import java.io.ObjectInputStream;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;


public class MultiplePiePlot_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      String string0 = multiplePiePlot0.getPlotType();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals("Multiple Pie Plot", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Comparable comparable0 = multiplePiePlot0.getAggregatedItemsKey();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals("Other", comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double double0 = multiplePiePlot0.getLimit();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      multiplePiePlot0.getDataExtractOrder();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(192, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      multiplePiePlot0.setDataset(defaultBoxAndWhiskerCategoryDataset0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart((JFreeChart) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'pieChart' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = new JFreeChart(multiplePiePlot0);
      // Undeclared exception!
      try { 
        multiplePiePlot0.setPieChart(jFreeChart0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The 'pieChart' argument must be a chart based on a PiePlot.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setDataExtractOrder((TableOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      multiplePiePlot0.setAggregatedItemsKey(15);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsKey((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      // Undeclared exception!
      try { 
        multiplePiePlot0.setAggregatedItemsPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.MultiplePiePlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      JFreeChart jFreeChart0 = new JFreeChart("dS[Z", categoryAxis3D0.DEFAULT_TICK_LABEL_FONT, multiplePiePlot0, false);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("TimePeriodAnchor unknown.", font0, multiplePiePlot0, false);
      multiplePiePlot0.setLimit(10);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
      assertEquals(10.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultCategoryDataset defaultCategoryDataset0 = new DefaultCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultCategoryDataset0);
      defaultCategoryDataset0.setValue((Number) 1.0F, (Comparable) 10, (Comparable) 10);
      Hashtable<AttributedCharacterIterator.Attribute, ObjectInputStream> hashtable0 = new Hashtable<AttributedCharacterIterator.Attribute, ObjectInputStream>();
      Font font0 = new Font(hashtable0);
      JFreeChart jFreeChart0 = new JFreeChart(">+opeD[IB&I<`y*y#", font0, multiplePiePlot0, true);
      jFreeChart0.createBufferedImage(10, 10);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("TimePeriodAnchor unknown.", font0, multiplePiePlot0, true);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(4, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      ArrayList<RadialGradientPaint> arrayList0 = new ArrayList<RadialGradientPaint>();
      BoxAndWhiskerItem boxAndWhiskerItem0 = new BoxAndWhiskerItem((-250.9276497268394), (double) (-280), (-2666.234069315938), (double) 15, 0.0, (-2593.6), (-250.9276497268394), (-2223.6), (List) arrayList0);
      defaultBoxAndWhiskerCategoryDataset0.add(boxAndWhiskerItem0, (Comparable) 15, (Comparable) "");
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      multiplePiePlot0.getLegendItems();
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals(1, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("TimePeriodAnchor unknown.", font0, multiplePiePlot0, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(3, legendItemCollection0.getItemCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(3, legendItemCollection0.getItemCount());
      
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("TimePeriodAnchor unknown.", font0, multiplePiePlot0, false);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      boolean boolean0 = multiplePiePlot0.equals(systemColor0);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double[][] doubleArray0 = new double[7][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      multiplePiePlot0.setLimit(1540.32097);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(1540.32097, multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setAggregatedItemsPaint(multiplePiePlot0.DEFAULT_OUTLINE_PAINT);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double[][] doubleArray0 = new double[3][4];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("TimePeriodAnchor unknown.", font0, multiplePiePlot1, false);
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
      boolean boolean0 = multiplePiePlot1.equals(multiplePiePlot0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      double[][] doubleArray0 = new double[3][4];
      RectangleInsets rectangleInsets0 = RectangleInsets.ZERO_INSETS;
      multiplePiePlot0.setInsets(rectangleInsets0, false);
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }
}
