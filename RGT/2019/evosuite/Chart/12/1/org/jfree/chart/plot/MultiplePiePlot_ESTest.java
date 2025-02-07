/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 01 21:39:47 GMT 2019
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
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
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getDataExtractOrder();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      Color color0 = (Color)multiplePiePlot0.getAggregatedItemsPaint();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertEquals((-4144960), color0.getRGB());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      multiplePiePlot0.setDataset(taskSeriesCollection0);
      multiplePiePlot0.setDataset(taskSeriesCollection0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      multiplePiePlot0.setPieChart(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
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
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultBoxAndWhiskerCategoryDataset0);
      Font font0 = LegendTitle.DEFAULT_ITEM_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("Null 'series' not permitted.", font0, multiplePiePlot0, true);
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
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      multiplePiePlot0.setDataset(taskSeriesCollection0);
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = new BufferedImage(10, 10, 10);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle rectangle0 = new Rectangle();
      Point2D.Float point2D_Float0 = new Point2D.Float();
      PlotState plotState0 = new PlotState();
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 10, (-2191), (-802), 0, 1607, 0, true, true, true, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      multiplePiePlot0.draw(graphics2D0, rectangle0, point2D_Float0, plotState0, plotRenderingInfo0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      Font font0 = MeterPlot.DEFAULT_LABEL_FONT;
      JFreeChart jFreeChart0 = new JFreeChart("RenderingHints given are null", font0, multiplePiePlot0, true);
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      jFreeChart0.createBufferedImage(2268, 2268, chartRenderingInfo0);
      assertEquals(4, standardEntityCollection0.getEntityCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1720, 1720);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point(10, 10);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = multiplePiePlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, true);
      PlotState plotState0 = new PlotState();
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point0, plotState0, (PlotRenderingInfo) null);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1720, 3675);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point(3675, 3675);
      Rectangle rectangle0 = new Rectangle(point0);
      Rectangle2D rectangle2D0 = multiplePiePlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, true);
      PlotState plotState0 = new PlotState();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point0, plotState0, plotRenderingInfo0);
      assertEquals(3, plotRenderingInfo0.getSubplotCount());
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(1731, 3675);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point(3675, 3675);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = multiplePiePlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, true);
      PlotState plotState0 = new PlotState();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point0, plotState0, plotRenderingInfo0);
      assertEquals(2, plotRenderingInfo0.getSubplotCount());
      
      LegendItemCollection legendItemCollection0 = multiplePiePlot0.getLegendItems();
      assertEquals(1, legendItemCollection0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      multiplePiePlot0.getLegendItems();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      
      multiplePiePlot0.setLimit(1.0F);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      multiplePiePlot0.setDataset(taskSeriesCollection0);
      multiplePiePlot0.getLegendItems();
      assertEquals(1.0, multiplePiePlot0.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      boolean boolean0 = multiplePiePlot0.equals(jFreeChart0);
      assertEquals(0.0, multiplePiePlot0.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      multiplePiePlot0.setDataExtractOrder(tableOrder0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      multiplePiePlot1.setLimit(10);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertEquals(10.0, multiplePiePlot1.getLimit(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setAggregatedItemsKey(1.0F);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer((-1374.18));
      Paint paint0 = candlestickRenderer0.getBasePaint();
      multiplePiePlot0.setAggregatedItemsPaint(paint0);
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertFalse(multiplePiePlot1.equals((Object)multiplePiePlot0));
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot(defaultIntervalCategoryDataset0);
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 3675);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Point point0 = new Point(3675, 3675);
      Dimension dimension0 = new Dimension();
      Rectangle rectangle0 = new Rectangle(point0, dimension0);
      Rectangle2D rectangle2D0 = multiplePiePlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle0, true, true);
      PlotState plotState0 = new PlotState();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo(standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      multiplePiePlot0.draw(graphics2D0, rectangle2D0, point0, plotState0, plotRenderingInfo0);
      assertEquals(2, plotRenderingInfo0.getSubplotCount());
      
      MultiplePiePlot multiplePiePlot1 = new MultiplePiePlot();
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      MultiplePiePlot multiplePiePlot1 = (MultiplePiePlot)multiplePiePlot0.clone();
      assertTrue(multiplePiePlot1.equals((Object)multiplePiePlot0));
      
      multiplePiePlot1.setDrawingSupplier((DrawingSupplier) null);
      boolean boolean0 = multiplePiePlot0.equals(multiplePiePlot1);
      assertFalse(boolean0);
      assertEquals(0.0, multiplePiePlot1.getLimit(), 0.01);
  }
}
