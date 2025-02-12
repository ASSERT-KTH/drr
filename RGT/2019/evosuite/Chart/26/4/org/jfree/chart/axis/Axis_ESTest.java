/*
 * This file was automatically generated by EvoSuite
 * Sat Jun 01 23:07:31 GMT 2019
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JInternalFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.time.Hour;
import org.junit.runner.RunWith;


public class Axis_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      dateAxis0.setFixedDimension(2.0);
      assertEquals(2.0, dateAxis0.getFixedDimension(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(40.0);
      cyclicNumberAxis0.setLabelURL("rJ5UJSQWxDX4=2~");
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      extendedCategoryAxis1.setLabel("k1R:fM~g");
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertEquals("k1R:fM~g", extendedCategoryAxis1.getLabel());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-409.02947625), "E<,8$0sB*NFx]N:ZQB");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      jFreeChart0.createBufferedImage((int) (short)1, 961, 5.0E-4, 703.368871247, chartRenderingInfo0);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0, cyclicNumberAxis0.getFixedDimension(), 0.01);
      assertTrue(cyclicNumberAxis0.isVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabelAngle(0.0);
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isVisible());
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertFalse(categoryAxis3D0.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis("lqxyrgL");
      categoryAxis0.setLabelToolTip("");
      assertEquals(2.0F, categoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis0.isAxisLineVisible());
      assertEquals(0.0F, categoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(categoryAxis0.isTickLabelsVisible());
      assertFalse(categoryAxis0.isTickMarksVisible());
      assertTrue(categoryAxis0.isVisible());
      assertEquals(0.0, categoryAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SymbolAxis symbolAxis0 = new SymbolAxis("h", stringArray0);
      symbolAxis0.getLabelURL();
      assertTrue(symbolAxis0.isTickMarksVisible());
      assertEquals(0.0F, symbolAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, symbolAxis0.getLabelAngle(), 0.01);
      assertTrue(symbolAxis0.isAxisLineVisible());
      assertTrue(symbolAxis0.isVisible());
      assertTrue(symbolAxis0.isTickLabelsVisible());
      assertEquals(2.0F, symbolAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(270.0, "#,###,###,##0");
      cyclicNumberAxis0.getLabelToolTip();
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isVisible());
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      assertTrue(extendedCategoryAxis0.isVisible());
      
      extendedCategoryAxis0.setVisible(true);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      assertTrue(categoryAxis3D0.isVisible());
      
      categoryAxis3D0.setVisible(false);
      assertFalse(categoryAxis3D0.isVisible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
      categoryAxis3D0.setLabel("");
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertTrue(categoryAxis3D0.isVisible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setLabel("k1R:fM~g");
      assertEquals("k1R:fM~g", extendedCategoryAxis0.getLabel());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("rJ5UJSQWxDX4=2~");
      categoryAxis3D0.setLabel("rJ5UJSQWxDX4=2~");
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertTrue(categoryAxis3D0.isVisible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D((String) null);
      categoryAxis3D0.setLabel((String) null);
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertTrue(categoryAxis3D0.isVisible());
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      extendedCategoryAxis0.setLabelFont(extendedCategoryAxis0.DEFAULT_TICK_LABEL_FONT);
      ExtendedCategoryAxis extendedCategoryAxis1 = new ExtendedCategoryAxis("");
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertEquals(0.0, extendedCategoryAxis1.getLabelAngle(), 0.01);
      assertFalse(boolean0);
      assertTrue(extendedCategoryAxis1.isVisible());
      assertFalse(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
      assertTrue(extendedCategoryAxis1.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis1.isTickMarksVisible());
      assertEquals(0.0F, extendedCategoryAxis1.getTickMarkInsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis1.isAxisLineVisible());
      assertEquals(2.0F, extendedCategoryAxis1.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setLabelFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CategoryAxis categoryAxis0 = new CategoryAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(periodAxis0);
      categoryAxis0.setLabelPaint(combinedDomainXYPlot0.DEFAULT_OUTLINE_PAINT);
      assertTrue(periodAxis0.isTickMarksVisible());
      assertEquals(2.0F, categoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis0.isTickLabelsVisible());
      assertTrue(categoryAxis0.isVisible());
      assertEquals(0.0, categoryAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, categoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertFalse(categoryAxis0.isTickMarksVisible());
      assertTrue(categoryAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("z;x#1cCDcxzQ");
      // Undeclared exception!
      try { 
        logarithmicAxis0.setLabelPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("E<,8$0sB*NFx]N:ZQB");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-409.02947625), "E<,8$0sB*NFx]N:ZQB");
      cyclicNumberAxis0.setLabelInsets(numberAxis0.DEFAULT_AXIS_LABEL_INSETS);
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis((String) null);
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setLabelInsets((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-247.59672003), (-247.59672003));
      cyclicNumberAxis0.setAxisLinePaint(numberAxis0.DEFAULT_TICK_LABEL_PAINT);
      assertTrue(cyclicNumberAxis0.isVisible());
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("B/XN?@~)Cag");
      // Undeclared exception!
      try { 
        extendedCategoryAxis0.setAxisLinePaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis("");
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      dateAxis0.setAxisLineStroke(extendedCategoryAxis0.DEFAULT_TICK_MARK_STROKE);
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertTrue(dateAxis0.isTickMarksVisible());
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertTrue(extendedCategoryAxis0.isVisible());
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      // Undeclared exception!
      try { 
        dateAxis0.setAxisLineStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      assertTrue(logarithmicAxis0.isTickLabelsVisible());
      
      logarithmicAxis0.setTickLabelsVisible(true);
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, logarithmicAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(logarithmicAxis0.isAxisLineVisible());
      assertTrue(logarithmicAxis0.isVisible());
      assertEquals(0.0, logarithmicAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      assertTrue(numberAxis0.isTickLabelsVisible());
      
      numberAxis0.setTickLabelsVisible(false);
      assertFalse(numberAxis0.isTickLabelsVisible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      PeriodAxis periodAxis0 = new PeriodAxis("rJ5UJSQWxDX4=2~", hour0, hour0);
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.05, true, standardXYToolTipGenerator0);
      periodAxis0.setTickLabelFont(candlestickRenderer0.DEFAULT_VALUE_LABEL_FONT);
      assertTrue(periodAxis0.isVisible());
      assertTrue(periodAxis0.isTickLabelsVisible());
      assertTrue(periodAxis0.isTickMarksVisible());
      assertEquals(0.0F, periodAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, periodAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0, periodAxis0.getLabelAngle(), 0.01);
      assertTrue(periodAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("vBh<.R)lrqL");
      // Undeclared exception!
      try { 
        numberAxis0.setTickLabelFont((Font) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'font' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(40.0);
      Hour hour0 = new Hour();
      PeriodAxis periodAxis0 = new PeriodAxis("rJ5UJSQWxDX4=2~", hour0, hour0);
      ModuloAxis moduloAxis0 = new ModuloAxis("rJ5UJSQWxDX4=2~", cyclicNumberAxis0.DEFAULT_RANGE);
      periodAxis0.setTickLabelFont(moduloAxis0.DEFAULT_AXIS_LABEL_FONT);
      assertEquals(2.0F, moduloAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(moduloAxis0.isAxisLineVisible());
      assertTrue(moduloAxis0.isVisible());
      assertEquals(0.0, moduloAxis0.getLabelAngle(), 0.01);
      assertTrue(moduloAxis0.isTickMarksVisible());
      assertEquals(0.0F, moduloAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(moduloAxis0.isTickLabelsVisible());
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis("");
      CategoryAxis categoryAxis0 = new CategoryAxis();
      categoryAxis0.setTickLabelPaint(periodAxis0.DEFAULT_TICK_LABEL_PAINT);
      assertFalse(categoryAxis0.isTickMarksVisible());
      assertTrue(categoryAxis0.isAxisLineVisible());
      assertTrue(categoryAxis0.isVisible());
      assertEquals(0.0, categoryAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, categoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, categoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(categoryAxis0.isTickLabelsVisible());
      assertTrue(periodAxis0.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      // Undeclared exception!
      try { 
        categoryAxis0.setTickLabelPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      // Undeclared exception!
      try { 
        numberAxis3D0.setTickLabelInsets((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'insets' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1005.86), (-1005.86));
      cyclicNumberAxis0.setTickLabelInsets(cyclicNumberAxis0.DEFAULT_TICK_LABEL_INSETS);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("^y");
      assertTrue(logarithmicAxis0.isTickMarksVisible());
      
      logarithmicAxis0.setTickMarksVisible(true);
      assertEquals(0.0F, logarithmicAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, logarithmicAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(logarithmicAxis0.isTickLabelsVisible());
      assertTrue(logarithmicAxis0.isVisible());
      assertTrue(logarithmicAxis0.isAxisLineVisible());
      assertEquals(0.0, logarithmicAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("rJ5UJSQWxDX4=2~");
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.05, true, standardXYToolTipGenerator0);
      Stroke stroke0 = candlestickRenderer0.getBaseOutlineStroke();
      categoryAxis3D0.setTickMarkStroke(stroke0);
      assertEquals(0.0, categoryAxis3D0.getLabelAngle(), 0.01);
      assertEquals(0.0F, categoryAxis3D0.getTickMarkInsideLength(), 0.01F);
      assertTrue(categoryAxis3D0.isAxisLineVisible());
      assertTrue(categoryAxis3D0.isTickLabelsVisible());
      assertTrue(categoryAxis3D0.isVisible());
      assertFalse(categoryAxis3D0.isTickMarksVisible());
      assertEquals(2.0F, categoryAxis3D0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(351.57, (String) null);
      // Undeclared exception!
      try { 
        cyclicNumberAxis0.setTickMarkStroke((Stroke) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'stroke' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      extendedCategoryAxis0.setTickMarkStroke(combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertTrue(extendedCategoryAxis0.isVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hour hour0 = new Hour();
      PeriodAxis periodAxis0 = new PeriodAxis("rJ5UJSQWxDX4=2~", hour0, hour0);
      // Undeclared exception!
      try { 
        periodAxis0.setTickMarkPaint((Paint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.axis.Axis", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      assertEquals(10, Plot.MINIMUM_WIDTH_TO_DRAW);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.5707963267948966, 2.0E7);
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("#hHRZI,=!bZ /ieS*");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(subCategoryAxis0);
      assertFalse(subCategoryAxis0.isTickMarksVisible());
      
      cyclicNumberAxis0.removeChangeListener((AxisChangeListener) null);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      CompassPlot compassPlot0 = new CompassPlot((ValueDataset) null);
      numberAxis0.removeChangeListener(compassPlot0);
      assertTrue(numberAxis0.isAxisLineVisible());
      assertTrue(numberAxis0.isTickLabelsVisible());
      assertEquals(2.0F, numberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(0.0, numberAxis0.getLabelAngle(), 0.01);
      assertTrue(numberAxis0.isTickMarksVisible());
      assertEquals(0.0F, numberAxis0.getTickMarkInsideLength(), 0.01F);
      assertTrue(numberAxis0.isVisible());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      JFreeChart jFreeChart0 = new JFreeChart((String) null, extendedCategoryAxis0.DEFAULT_AXIS_LABEL_FONT, thermometerPlot0, true);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 0, 2, 0, (-2013265917), 10, 1, true, true, false, true, false, true);
      boolean boolean0 = extendedCategoryAxis0.hasListener(chartPanel0);
      assertEquals(0.0, extendedCategoryAxis0.getLabelAngle(), 0.01);
      assertEquals(0.0F, extendedCategoryAxis0.getTickMarkInsideLength(), 0.01F);
      assertFalse(boolean0);
      assertTrue(extendedCategoryAxis0.isAxisLineVisible());
      assertTrue(extendedCategoryAxis0.isVisible());
      assertTrue(extendedCategoryAxis0.isTickLabelsVisible());
      assertFalse(extendedCategoryAxis0.isTickMarksVisible());
      assertEquals(2.0F, extendedCategoryAxis0.getTickMarkOutsideLength(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-409.02947625), "");
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      JFreeChart jFreeChart0 = new JFreeChart(combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      jFreeChart0.createBufferedImage((int) (short)1, 961, 5.0E-4, 703.368871247, chartRenderingInfo0);
      assertEquals(0.0, cyclicNumberAxis0.getFixedDimension(), 0.01);
      assertTrue(cyclicNumberAxis0.isAxisLineVisible());
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertTrue(cyclicNumberAxis0.isTickLabelsVisible());
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
      assertTrue(cyclicNumberAxis0.isVisible());
      assertEquals(0.0, cyclicNumberAxis0.getLabelAngle(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Darren Jung";
      stringArray0[1] = "Darren Jung";
      stringArray0[2] = "Darren Jung";
      stringArray0[3] = "o`";
      stringArray0[4] = "Darren Jung";
      SymbolAxis symbolAxis0 = new SymbolAxis("Darren Jung", stringArray0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(symbolAxis0);
      JFreeChart jFreeChart0 = new JFreeChart("ni?[3['[?J_vH;qV!T", combinedDomainXYPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 500);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(5.0E10, 0, ">rLNaGf>*[V;D");
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      AxisSpace axisSpace0 = cyclicNumberAxis0.reserveSpace(graphics2D0, combinedDomainXYPlot0, rectangle2D_Double0, rectangleEdge0, (AxisSpace) null);
      assertEquals(0.0F, cyclicNumberAxis0.getTickMarkInsideLength(), 0.01F);
      assertEquals(2.0F, cyclicNumberAxis0.getTickMarkOutsideLength(), 0.01F);
      assertEquals(34.1328125, axisSpace0.getRight(), 0.01);
      assertTrue(cyclicNumberAxis0.isTickMarksVisible());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.jfree.chart.text.TextFragment";
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.text.TextFragment", stringArray0);
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 500);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.text.TextFragment", meterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 11, 500, 641, 1571, 15, 10, false, true, false, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 270, (-1206.1952939), 14.0, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1.0), (-1.0), 3.0, 1.0F);
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        symbolAxis0.draw(graphics2D0, 1.0F, rectangle2D_Double0, rectangle2D_Double0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SymbolAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.jfree.chart.text.TextFragment";
      SymbolAxis symbolAxis0 = new SymbolAxis("org.jfree.chart.text.TextFragment", stringArray0);
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset((Number) 500);
      MeterPlot meterPlot0 = new MeterPlot(defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.text.TextFragment", meterPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 500, 500, 500, 10, 15, 10, true, true, false, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 270, (-1206.1952939), (double) 270, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(2.0F, (-1.0), 3.0, 1.0F);
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo((ChartRenderingInfo) null);
      // Undeclared exception!
      try { 
        symbolAxis0.draw(graphics2D0, 1.0F, rectangle2D_Double0, rectangle2D_Double0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SymbolAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      JFreeChart jFreeChart0 = new JFreeChart("V8", combinedDomainCategoryPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true, false, true, true, true);
      ChartRenderingInfo chartRenderingInfo0 = chartPanel0.getChartRenderingInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("PRINT");
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(3751, 500, chartRenderingInfo0);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      JInternalFrame jInternalFrame0 = new JInternalFrame("ZOOM_IN_DOMAIN", false, true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      Rectangle2D rectangle2D0 = rectangle2D_Float0.createUnion(rectangle0);
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        subCategoryAxis0.draw(graphics2D0, 3322.2913, rectangle2D0, rectangle2D0, rectangleEdge0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.axis.SubCategoryAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertFalse(extendedCategoryAxis1.isTickMarksVisible());
      assertTrue(extendedCategoryAxis1.isVisible());
      assertTrue(extendedCategoryAxis1.isTickLabelsVisible());
      assertNotSame(extendedCategoryAxis1, extendedCategoryAxis0);
      assertEquals(2.0F, extendedCategoryAxis1.getTickMarkOutsideLength(), 0.01F);
      assertTrue(extendedCategoryAxis1.isAxisLineVisible());
      assertEquals(0.0F, extendedCategoryAxis1.getTickMarkInsideLength(), 0.01F);
      assertEquals(0.0, extendedCategoryAxis1.getLabelAngle(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("Range_Axis");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      assertTrue(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
      
      extendedCategoryAxis1.setLabelInsets(extendedCategoryAxis0.DEFAULT_TICK_LABEL_INSETS);
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertFalse(boolean0);
      assertFalse(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      assertTrue(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
      
      extendedCategoryAxis1.setTickLabelInsets(extendedCategoryAxis0.DEFAULT_AXIS_LABEL_INSETS);
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      extendedCategoryAxis1.setTickMarkInsideLength(206.88F);
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertEquals(206.88F, extendedCategoryAxis1.getTickMarkInsideLength(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      extendedCategoryAxis1.setTickMarkOutsideLength((-3322.45F));
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertEquals((-3322.45F), extendedCategoryAxis1.getTickMarkOutsideLength(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      ExtendedCategoryAxis extendedCategoryAxis1 = (ExtendedCategoryAxis)extendedCategoryAxis0.clone();
      assertTrue(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
      
      extendedCategoryAxis1.setTickMarkPaint(extendedCategoryAxis0.DEFAULT_TICK_LABEL_PAINT);
      boolean boolean0 = extendedCategoryAxis0.equals(extendedCategoryAxis1);
      assertFalse(extendedCategoryAxis1.equals((Object)extendedCategoryAxis0));
      assertFalse(boolean0);
  }
}
