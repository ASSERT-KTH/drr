
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Shape var0 = null;
    org.jfree.data.xy.XYDataset var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.XYItemEntity var6 = new org.jfree.chart.entity.XYItemEntity(var0, var1, (-1), 0, "", "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Paint var0 = null;
    java.io.ObjectOutputStream var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writePaint(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     org.jfree.data.time.Year var2 = new org.jfree.data.time.Year(var0, var1);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    org.jfree.data.general.PieDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Paint var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.block.BlockBorder var1 = new org.jfree.chart.block.BlockBorder(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.util.TimeZone var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.DateAxis var2 = new org.jfree.chart.axis.DateAxis("", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.chart.plot.Plot var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.PlotChangeEvent var1 = new org.jfree.chart.event.PlotChangeEvent(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.jfree.data.Range var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var3 = org.jfree.data.Range.expand(var0, 100.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     org.jfree.data.time.RegularTimePeriod var1 = null;
//     org.jfree.data.time.RegularTimePeriod var2 = null;
//     org.jfree.chart.axis.PeriodAxis var3 = new org.jfree.chart.axis.PeriodAxis("", var1, var2);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    boolean var0 = org.jfree.chart.util.ObjectUtilities.isJDK14();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     java.awt.Shape var7 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("hi!", var1, (-1.0f), 100.0f, 0.0d, 0.0f, 100.0f);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.jfree.data.time.RegularTimePeriod var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.TimeSeriesDataItem var2 = new org.jfree.data.time.TimeSeriesDataItem(var0, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    org.jfree.chart.util.RectangleInsets var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInsets(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.jfree.chart.util.UnitType var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleInsets var5 = new org.jfree.chart.util.RectangleInsets(var0, 0.0d, (-1.0d), 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    int var1 = org.jfree.data.time.SerialDate.stringToMonthCode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.LineUtilities.clipLine(var0, var1);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     org.jfree.chart.axis.DateTickUnitType var0 = null;
//     org.jfree.chart.axis.DateTickUnit var2 = new org.jfree.chart.axis.DateTickUnit(var0, 100);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.Class var1 = null;
    java.lang.Class var2 = null;
    java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.loadAndInstantiate("hi!", var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.data.general.PieDataset var0 = null;
    boolean var1 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     java.util.Locale var1 = null;
//     org.jfree.chart.labels.StandardPieToolTipGenerator var2 = new org.jfree.chart.labels.StandardPieToolTipGenerator("", var1);
// 
//   }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.clipLine(var0, var1);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var3 = var2.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var4 = new org.jfree.chart.plot.PolarPlot();
//     var4.setBackgroundAlpha(1.0f);
//     java.awt.Paint var7 = var4.getBackgroundPaint();
//     var2.setPaint(var7);
//     org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var12 = var11.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var13 = new org.jfree.chart.plot.PolarPlot();
//     var13.setBackgroundAlpha(1.0f);
//     java.awt.Paint var16 = var13.getBackgroundPaint();
//     var11.setPaint(var16);
//     var2.setLabelPaint(var16);
//     
//     // Checks the contract:  equals-hashcode on var4 and var13
//     assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var4
//     assertTrue("Contract failed: equals-hashcode on var13 and var4", var13.equals(var4) ? var13.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(var0, (java.lang.Comparable)100);
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = org.jfree.chart.renderer.RendererUtilities.findLiveItems((org.jfree.data.xy.XYDataset)var0, 100, 0.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.jfree.chart.axis.Axis var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.AxisChangeEvent var1 = new org.jfree.chart.event.AxisChangeEvent(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Stroke var3 = var2.getOutlineStroke();
    java.io.ObjectOutputStream var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeStroke(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 100.0f);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    var0.setBackgroundAlpha(1.0f);
    java.awt.Paint var3 = var0.getBackgroundPaint();
    java.io.ObjectOutputStream var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writePaint(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var1 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(var0, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     boolean var5 = var1.hasListener((java.util.EventListener)var2);
//     java.awt.Shape var6 = var1.getLeftArrow();
//     org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
//     org.jfree.chart.entity.PlotEntity var8 = new org.jfree.chart.entity.PlotEntity(var6, (org.jfree.chart.plot.Plot)var7);
//     
//     // Checks the contract:  equals-hashcode on var2 and var7
//     assertTrue("Contract failed: equals-hashcode on var2 and var7", var2.equals(var7) ? var2.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var2
//     assertTrue("Contract failed: equals-hashcode on var7 and var2", var7.equals(var2) ? var7.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(var0);
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
    var2.setBackgroundAlpha(1.0f);
    boolean var5 = var1.hasListener((java.util.EventListener)var2);
    java.awt.Shape var6 = var1.getLeftArrow();
    org.jfree.chart.JFreeChart var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.JFreeChartEntity var10 = new org.jfree.chart.entity.JFreeChartEntity(var6, var7, "", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
//     var3.setBackgroundAlpha(1.0f);
//     boolean var6 = var2.hasListener((java.util.EventListener)var3);
//     java.awt.Shape var7 = var2.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
//     org.jfree.data.xy.DefaultXYDataset var11 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var12 = new org.jfree.chart.plot.PolarPlot();
//     var12.setBackgroundAlpha(1.0f);
//     var11.addChangeListener((org.jfree.data.general.DatasetChangeListener)var12);
//     org.jfree.chart.entity.PlotEntity var17 = new org.jfree.chart.entity.PlotEntity(var7, (org.jfree.chart.plot.Plot)var12, "hi!");
//     
//     // Checks the contract:  equals-hashcode on var3 and var12
//     assertTrue("Contract failed: equals-hashcode on var3 and var12", var3.equals(var12) ? var3.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var3
//     assertTrue("Contract failed: equals-hashcode on var12 and var3", var12.equals(var3) ? var12.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
    var3.setBackgroundAlpha(1.0f);
    boolean var6 = var2.hasListener((java.util.EventListener)var3);
    java.awt.Shape var7 = var2.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
    org.jfree.chart.title.Title var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.TitleEntity var12 = new org.jfree.chart.entity.TitleEntity(var7, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.labels.StandardPieToolTipGenerator var1 = new org.jfree.chart.labels.StandardPieToolTipGenerator(var0);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     java.util.Locale var0 = null;
//     java.text.NumberFormat var1 = java.text.NumberFormat.getPercentInstance(var0);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelativeAsStream("", var1);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.chart.util.LineUtilities var0 = new org.jfree.chart.util.LineUtilities();

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    java.text.DateFormat var1 = null;
    java.text.NumberFormat var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.StandardXYToolTipGenerator var3 = new org.jfree.chart.labels.StandardXYToolTipGenerator("hi!", var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    java.io.ObjectInputStream var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Paint var1 = org.jfree.chart.util.SerialUtilities.readPaint(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     boolean var5 = var1.hasListener((java.util.EventListener)var2);
//     java.awt.Shape var6 = var1.getLeftArrow();
//     org.jfree.data.xy.DefaultXYDataset var7 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
//     var8.setBackgroundAlpha(1.0f);
//     var7.addChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
//     org.jfree.chart.entity.PlotEntity var12 = new org.jfree.chart.entity.PlotEntity(var6, (org.jfree.chart.plot.Plot)var8);
//     
//     // Checks the contract:  equals-hashcode on var2 and var8
//     assertTrue("Contract failed: equals-hashcode on var2 and var8", var2.equals(var8) ? var2.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var2
//     assertTrue("Contract failed: equals-hashcode on var8 and var2", var8.equals(var2) ? var8.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     boolean var5 = var1.hasListener((java.util.EventListener)var2);
//     java.awt.Paint var6 = var2.getAngleLabelPaint();
//     java.awt.Paint[] var7 = new java.awt.Paint[] { var6};
//     org.jfree.chart.ChartColor var11 = new org.jfree.chart.ChartColor(10, 100, 1);
//     java.awt.Paint[] var12 = new java.awt.Paint[] { var11};
//     java.awt.Color var16 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var20 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var21 = var16.getColorComponents(var20);
//     java.awt.color.ColorSpace var22 = var16.getColorSpace();
//     java.awt.Paint[] var23 = new java.awt.Paint[] { var16};
//     org.jfree.chart.axis.NumberAxis3D var25 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var26 = var25.getAxisLineStroke();
//     java.awt.Stroke[] var27 = new java.awt.Stroke[] { var26};
//     org.jfree.chart.plot.IntervalMarker var30 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var31 = var30.getOutlineStroke();
//     java.awt.Stroke[] var32 = new java.awt.Stroke[] { var31};
//     org.jfree.chart.axis.NumberAxis3D var34 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var35 = new org.jfree.chart.plot.PolarPlot();
//     var35.setBackgroundAlpha(1.0f);
//     boolean var38 = var34.hasListener((java.util.EventListener)var35);
//     java.awt.Shape var39 = var34.getLeftArrow();
//     java.awt.Shape[] var40 = new java.awt.Shape[] { var39};
//     org.jfree.chart.plot.DefaultDrawingSupplier var41 = new org.jfree.chart.plot.DefaultDrawingSupplier(var7, var12, var23, var27, var32, var40);
//     
//     // Checks the contract:  equals-hashcode on var2 and var35
//     assertTrue("Contract failed: equals-hashcode on var2 and var35", var2.equals(var35) ? var2.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var2
//     assertTrue("Contract failed: equals-hashcode on var35 and var2", var35.equals(var2) ? var35.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    java.awt.Shape[] var0 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 1.0d, 10.0d, var3);
// 
//   }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.jfree.chart.axis.TickType var0 = null;
    org.jfree.chart.text.TextAnchor var3 = null;
    org.jfree.chart.text.TextAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTick var6 = new org.jfree.chart.axis.NumberTick(var0, 1.0d, "", var3, var4, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.data.time.Year var1 = new org.jfree.data.time.Year(var0);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     org.jfree.data.xy.TableXYDataset var0 = null;
//     double var2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(var0, (-1));
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.jfree.chart.axis.AxisLocation var0 = null;
    org.jfree.chart.plot.PlotOrientation var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleEdge var2 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.0d, (-1.0d), var3);
// 
//   }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var1 = org.jfree.data.time.SerialDate.createInstance(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(var0, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 0.0d, var2);
// 
//   }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(var0, (java.lang.Comparable)(-1L));
// 
//   }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(var0);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    int var1 = org.jfree.data.time.SerialDate.leapYearCount(255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-398));

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.jfree.data.xy.XYDataset var0 = null;
//     org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(var0);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.jfree.chart.labels.StandardXYToolTipGenerator var0 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
    org.jfree.data.xy.DefaultXYDataset var1 = new org.jfree.data.xy.DefaultXYDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var0.generateLabelString((org.jfree.data.xy.XYDataset)var1, 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    int var1 = org.jfree.data.time.SerialDate.stringToMonthCode("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.chart.axis.TickType var0 = null;
    org.jfree.chart.text.TextAnchor var3 = null;
    org.jfree.chart.text.TextAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTick var6 = new org.jfree.chart.axis.NumberTick(var0, 1.0d, "hi!", var3, var4, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.jfree.chart.ui.Library var4 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var5 = var4.getLicenceName();
    java.lang.String var6 = var4.getLicenceName();
    java.lang.String var7 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    int var6 = var0.indexOf((java.lang.Comparable)'a');
    java.lang.Number var7 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var0);
    org.jfree.data.general.DatasetGroup var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setGroup(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    java.util.List var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var3 = org.jfree.data.general.DatasetUtilities.findRangeBounds(var0, var1, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    java.util.Collection var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Collection var1 = org.jfree.chart.util.ObjectUtilities.deepClone(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     boolean var5 = var1.hasListener((java.util.EventListener)var2);
//     java.awt.geom.Rectangle2D var8 = null;
//     java.awt.Point var9 = var2.translateValueThetaRadiusToJava2D(0.0d, Double.NaN, var8);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    java.awt.Font var1 = var0.getTickLabelFont();
    var0.setAxisLineVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var0, true);
    org.jfree.data.xy.IntervalXYDelegate var3 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setIntervalPositionFactor(100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var3 = var0.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var3 = var2.getAxisLineStroke();
//     java.awt.Font var4 = var2.getLabelFont();
//     org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var7 = var6.getTickLabelPaint();
//     org.jfree.chart.text.TextMeasurer var10 = null;
//     org.jfree.chart.text.TextBlock var11 = org.jfree.chart.text.TextUtilities.createTextBlock("Combined_Domain_XYPlot", var4, var7, (-1.0f), 0, var10);
// 
//   }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.jfree.data.function.Function2D var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYSeries var5 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(var0, 100.0d, 100.0d, 255, (java.lang.Comparable)(-398));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     org.jfree.chart.axis.TickUnit var5 = var1.getAngleTickUnit();
//     org.jfree.chart.plot.PlotRenderingInfo var7 = null;
//     java.awt.geom.Point2D var8 = null;
//     var1.zoomRangeAxes(0.0d, var7, var8);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     boolean var0 = org.jfree.chart.text.TextUtilities.getUseFontMetricsGetStringBounds();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == true);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.text.NumberFormat var0 = java.text.NumberFormat.getCurrencyInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.jfree.chart.ChartTheme var0 = org.jfree.chart.StandardChartTheme.createDarknessTheme();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    org.jfree.chart.renderer.xy.XYBarRenderer.setDefaultShadowsVisible(false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setBackgroundImageAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var3 = org.jfree.data.time.SerialDate.createInstance(255, (-1), 255);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.jfree.chart.axis.CategoryAxis3D var0 = new org.jfree.chart.axis.CategoryAxis3D();
    java.lang.Comparable var1 = null;
    org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var4 = var3.getAxisLineStroke();
    java.awt.Font var5 = var3.getLabelFont();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTickLabelFont(var1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
    var0.clearRangeMarkers(1);
    org.jfree.chart.axis.AxisLocation var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation((-1), var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     org.jfree.data.Range var2 = new org.jfree.data.Range(Double.NaN, 10.0d);
//     
//     // Checks the contract:  var2.equals(var2)
//     assertTrue("Contract failed: var2.equals(var2)", var2.equals(var2));
// 
//   }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(var0, (java.lang.Comparable)(short)100);
// 
//   }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Paint var3 = var2.getLabelPaint();
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var2.notifyListeners(var4);
//     java.awt.Stroke var6 = var2.getStroke();
//     java.lang.Class var7 = null;
//     java.util.EventListener[] var8 = var2.getListeners(var7);
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.ChartEntity var2 = new org.jfree.chart.entity.ChartEntity(var0, "0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.util.RectangleEdge var3 = null;
    double var4 = var0.valueToJava2D(1.0d, var2, var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRange(100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.jfree.chart.labels.ItemLabelAnchor var0 = null;
    org.jfree.chart.text.TextAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.ItemLabelPosition var2 = new org.jfree.chart.labels.ItemLabelPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
    var3.setBackgroundAlpha(1.0f);
    java.awt.Paint var6 = var3.getBackgroundPaint();
    var2.setLabelPaint(var6);
    org.jfree.chart.text.TextAnchor var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     org.jfree.data.time.RegularTimePeriod var1 = null;
//     org.jfree.data.time.RegularTimePeriod var2 = null;
//     org.jfree.chart.axis.PeriodAxis var3 = new org.jfree.chart.axis.PeriodAxis("Combined_Domain_XYPlot", var1, var2);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.jfree.chart.util.LogFormat var4 = new org.jfree.chart.util.LogFormat(0.0d, "", "", false);
    java.lang.Object var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var4.format(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    java.awt.Graphics2D var1 = null;
    org.jfree.chart.text.TextAnchor var4 = null;
    org.jfree.chart.text.TextAnchor var6 = null;
    java.awt.Shape var7 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("", var1, 100.0f, 10.0f, var4, 0.0d, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    java.awt.Paint var5 = var1.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var8 = null;
    var1.handleClick((-398), 0, var8);
    org.jfree.chart.title.LegendTitle var10 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var1);
    org.jfree.chart.util.RectangleInsets var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setItemLabelPadding(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     java.awt.Paint var5 = var1.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     var1.handleClick((-398), 0, var8);
//     org.jfree.chart.title.LegendTitle var10 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var1);
//     org.jfree.chart.plot.PlotOrientation var11 = var1.getOrientation();
//     org.jfree.data.xy.DefaultXYDataset var12 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var13 = new org.jfree.chart.plot.PolarPlot();
//     var13.setBackgroundAlpha(1.0f);
//     var12.addChangeListener((org.jfree.data.general.DatasetChangeListener)var13);
//     org.jfree.chart.axis.TickUnit var17 = var13.getAngleTickUnit();
//     org.jfree.chart.axis.NumberAxis3D var19 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var20 = var19.getAxisLineStroke();
//     var13.setRadiusGridlineStroke(var20);
//     var1.setRadiusGridlineStroke(var20);
//     
//     // Checks the contract:  equals-hashcode on var1 and var13
//     assertTrue("Contract failed: equals-hashcode on var1 and var13", var1.equals(var13) ? var1.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var1
//     assertTrue("Contract failed: equals-hashcode on var13 and var1", var13.equals(var1) ? var13.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var6 = var4.remove((java.lang.Number)10L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var1 = org.jfree.data.time.Year.parseYear("");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var1 = org.jfree.data.time.Year.parseYear("hi!");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.jfree.data.time.Year var1 = null;
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(1, var1);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.jfree.chart.util.GradientPaintTransformType var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.StandardGradientPaintTransformer var1 = new org.jfree.chart.util.StandardGradientPaintTransformer(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var7 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var8 = var3.getColorComponents(var7);
    java.awt.Color var12 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var16 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var17 = var12.getColorComponents(var16);
    java.awt.color.ColorSpace var18 = var12.getColorSpace();
    java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var26 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var27 = var22.getColorComponents(var26);
    float[] var28 = var12.getRGBColorComponents(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var29 = var3.getRGBComponents(var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.jfree.chart.axis.CategoryAxis3D var0 = new org.jfree.chart.axis.CategoryAxis3D();
    var0.configure();
    var0.configure();
    org.jfree.chart.axis.CategoryLabelPositions var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCategoryLabelPositions(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    var0.setBackgroundAlpha(1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundImageAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
    var2.setBackgroundAlpha(1.0f);
    boolean var5 = var1.hasListener((java.util.EventListener)var2);
    java.awt.Shape var6 = var1.getLeftArrow();
    double var7 = var1.getLowerBound();
    java.awt.Paint var8 = var1.getTickLabelPaint();
    java.awt.Stroke var9 = null;
    org.jfree.chart.util.RectangleInsets var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.block.LineBorder var11 = new org.jfree.chart.block.LineBorder(var8, var9, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.lang.String var1 = var0.getPlotType();
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     var0.handleClick((-398), (-398), var4);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.jfree.data.general.PieDataset var0 = null;
    java.lang.Comparable var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.general.PieDataset var4 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(var0, var1, (-1.0d), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    java.lang.ClassLoader var0 = org.jfree.chart.util.ObjectUtilities.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    boolean var1 = org.jfree.data.time.SerialDate.isLeapYear(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     org.jfree.chart.util.StrokeMap var0 = new org.jfree.chart.util.StrokeMap();
//     java.lang.Comparable var1 = null;
//     boolean var2 = var0.containsKey(var1);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    org.jfree.chart.labels.ItemLabelAnchor var0 = null;
    org.jfree.chart.text.TextAnchor var1 = null;
    org.jfree.chart.text.TextAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.ItemLabelPosition var4 = new org.jfree.chart.labels.ItemLabelPosition(var0, var1, var2, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
//     org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
//     org.jfree.chart.axis.AxisSpace var6 = null;
//     var0.setFixedRangeAxisSpace(var6);
//     java.awt.Graphics2D var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     java.awt.geom.Point2D var10 = null;
//     org.jfree.chart.plot.PlotState var11 = new org.jfree.chart.plot.PlotState();
//     org.jfree.chart.plot.PlotRenderingInfo var12 = null;
//     var0.draw(var8, var9, var10, var11, var12);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     var0.drawBackground(var1, var2);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.jfree.chart.util.LogFormat var4 = new org.jfree.chart.util.LogFormat(0.0d, "", "", false);
    java.lang.StringBuffer var6 = null;
    java.text.FieldPosition var7 = null;
    java.lang.StringBuffer var8 = var4.format((-1.0d), var6, var7);
    java.text.NumberFormat var9 = var4.getExponentFormat();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Currency var10 = var4.getCurrency();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    java.awt.Polygon var0 = null;
    java.awt.Polygon var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     org.jfree.chart.renderer.xy.GradientXYBarPainter var0 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.renderer.xy.XYBarRenderer var2 = null;
//     java.awt.geom.RectangularShape var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     var0.paintBarShadow(var1, var2, 255, 100, true, var6, var7, false);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.jfree.chart.labels.StandardPieToolTipGenerator var0 = new org.jfree.chart.labels.StandardPieToolTipGenerator();
    java.text.NumberFormat var1 = var0.getNumberFormat();
    org.jfree.chart.renderer.xy.GradientXYBarPainter var2 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedCharacterIterator var3 = var1.formatToCharacterIterator((java.lang.Object)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    var5.setNotify(false);
    org.jfree.chart.ChartRenderingInfo var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.image.BufferedImage var11 = var5.createBufferedImage((-1), 100, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     java.awt.Graphics2D var3 = null;
//     org.jfree.chart.plot.CategoryPlot var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     var2.drawDomainGridline(var3, var4, var5, 100.0d);
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 0.0f);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.jfree.chart.resources.JFreeChartResources var0 = new org.jfree.chart.resources.JFreeChartResources();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var2 = var0.getStringArray("PlotOrientation.HORIZONTAL");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.ResourceBundle var2 = java.util.ResourceBundle.getBundle("hi!", var1);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    java.io.ObjectInputStream var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var1 = org.jfree.chart.util.SerialUtilities.readShape(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.PiePlot3D var1 = new org.jfree.chart.plot.PiePlot3D(var0);
    java.awt.Stroke var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelLinkStroke(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
//     org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
//     var5.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var7 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
//     var8.setBackgroundAlpha(1.0f);
//     var7.addChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
//     java.awt.Paint var12 = var8.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var15 = null;
//     var8.handleClick((-398), 0, var15);
//     org.jfree.chart.title.LegendTitle var17 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8);
//     var5.addLegend(var17);
//     java.awt.Graphics2D var19 = null;
//     java.awt.geom.Rectangle2D var20 = null;
//     var17.draw(var19, var20);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("PlotOrientation.HORIZONTAL");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var1 = org.jfree.data.time.SerialDate.createInstance(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.labels.StandardPieSectionLabelGenerator var1 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator(var0);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     org.jfree.chart.axis.DateTickUnitType var0 = null;
//     org.jfree.chart.axis.DateTickUnitType var2 = null;
//     java.text.DateFormat var4 = null;
//     org.jfree.chart.axis.DateTickUnit var5 = new org.jfree.chart.axis.DateTickUnit(var0, 2147483647, var2, (-1), var4);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.jfree.chart.text.TextUtilities.setUseDrawRotatedStringWorkaround(false);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     boolean var1 = var0.isVerticalTickLabels();
//     java.awt.Graphics2D var2 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     org.jfree.chart.util.RectangleEdge var6 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var7 = null;
//     org.jfree.chart.axis.AxisState var8 = var0.draw(var2, 0.0d, var4, var5, var6, var7);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var2 = var0.getCeilingTickUnit(1.0E-5d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    var5.setNotify(false);
    var5.setNotify(false);
    java.lang.Object var10 = var5.getTextAntiAlias();
    org.jfree.chart.ChartRenderingInfo var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.image.BufferedImage var14 = var5.createBufferedImage((-1), 0, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var6 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
//     var7.setBackgroundAlpha(1.0f);
//     java.awt.Paint var10 = var7.getBackgroundPaint();
//     var6.setLabelPaint(var10);
//     org.jfree.chart.block.BlockBorder var12 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var10);
//     java.awt.Graphics2D var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     var12.draw(var13, var14);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.jfree.chart.labels.StandardPieSectionLabelGenerator var0 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
//     org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
//     var8.setBackgroundAlpha(1.0f);
//     java.awt.Paint var11 = var8.getBackgroundPaint();
//     var7.setLabelPaint(var11);
//     org.jfree.chart.block.BlockBorder var13 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var11);
//     boolean var14 = var0.equals((java.lang.Object)100.0d);
//     org.jfree.data.general.PieDataset var15 = null;
//     java.text.AttributedString var17 = var0.generateAttributedSectionLabel(var15, (java.lang.Comparable)1.0f);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var1 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     boolean var1 = var0.isVerticalTickLabels();
//     java.lang.Object var2 = var0.clone();
//     java.util.Date var3 = null;
//     java.util.Date var4 = null;
//     var0.setRange(var3, var4);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     org.jfree.chart.LegendItem var1 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var2 = var1.clone();
//     org.jfree.data.xy.DefaultXYDataset var3 = new org.jfree.data.xy.DefaultXYDataset();
//     var1.setDataset((org.jfree.data.general.Dataset)var3);
//     org.jfree.data.general.Dataset var5 = var1.getDataset();
//     java.awt.Color var9 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var10 = var9.brighter();
//     var1.setFillPaint((java.awt.Paint)var10);
//     java.awt.Paint[] var12 = new java.awt.Paint[] { var10};
//     org.jfree.chart.LegendItem var14 = new org.jfree.chart.LegendItem("");
//     java.awt.Paint var15 = var14.getLinePaint();
//     java.awt.Paint[] var16 = new java.awt.Paint[] { var15};
//     org.jfree.chart.LegendItem var18 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var19 = var18.clone();
//     org.jfree.data.xy.DefaultXYDataset var20 = new org.jfree.data.xy.DefaultXYDataset();
//     var18.setDataset((org.jfree.data.general.Dataset)var20);
//     org.jfree.data.general.Dataset var22 = var18.getDataset();
//     java.awt.Color var26 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var27 = var26.brighter();
//     var18.setFillPaint((java.awt.Paint)var27);
//     java.awt.Paint[] var29 = new java.awt.Paint[] { var27};
//     org.jfree.chart.plot.IntervalMarker var32 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var33 = var32.getOutlineStroke();
//     java.awt.Stroke var34 = var32.getOutlineStroke();
//     java.awt.Stroke[] var35 = new java.awt.Stroke[] { var34};
//     java.awt.Stroke[] var36 = null;
//     org.jfree.chart.axis.NumberAxis3D var38 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var39 = var38.getAxisLineStroke();
//     boolean var40 = var38.isAutoRange();
//     java.awt.Shape var41 = var38.getRightArrow();
//     java.awt.Shape[] var42 = new java.awt.Shape[] { var41};
//     org.jfree.chart.plot.DefaultDrawingSupplier var43 = new org.jfree.chart.plot.DefaultDrawingSupplier(var12, var16, var29, var35, var36, var42);
//     
//     // Checks the contract:  equals-hashcode on var1 and var18
//     assertTrue("Contract failed: equals-hashcode on var1 and var18", var1.equals(var18) ? var1.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var1
//     assertTrue("Contract failed: equals-hashcode on var18 and var1", var18.equals(var1) ? var18.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var19
//     assertTrue("Contract failed: equals-hashcode on var2 and var19", var2.equals(var19) ? var2.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var2
//     assertTrue("Contract failed: equals-hashcode on var19 and var2", var19.equals(var2) ? var19.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    org.jfree.data.time.SerialDate var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getNearestDayOfWeek(0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
//     org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
//     double var5 = var4.getMinX();
//     org.jfree.data.xy.XYDataItem var8 = var4.addOrUpdate((java.lang.Number)(byte)10, (java.lang.Number)2.0f);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.xy.XYDataItem var10 = var4.remove((java.lang.Number)0.5d);
//       fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
//     } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var8);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    boolean var6 = var0.equals((java.lang.Object)true);
    java.text.NumberFormat var8 = java.text.NumberFormat.getNumberInstance();
    org.jfree.chart.axis.NumberTickUnit var10 = new org.jfree.chart.axis.NumberTickUnit(Double.NaN, var8, 2147483647);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var11 = var0.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.ClassLoader var2 = null;
//     java.util.ResourceBundle var3 = java.util.ResourceBundle.getBundle("AxisLabelEntity: label = null", var1, var2);
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     java.util.ResourceBundle.Control var1 = null;
//     java.util.ResourceBundle var2 = java.util.ResourceBundle.getBundle("PlotOrientation.HORIZONTAL", var1);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     java.util.Locale var2 = null;
//     org.jfree.data.time.Year var3 = new org.jfree.data.time.Year(var0, var1, var2);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
//     var3.setBackgroundAlpha(1.0f);
//     boolean var6 = var2.hasListener((java.util.EventListener)var3);
//     java.awt.Shape var7 = var2.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
//     java.awt.Color var14 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var15 = var14.brighter();
//     org.jfree.chart.title.LegendGraphic var16 = new org.jfree.chart.title.LegendGraphic(var7, (java.awt.Paint)var14);
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.axis.DateAxis var19 = new org.jfree.chart.axis.DateAxis();
//     boolean var20 = var19.isVerticalTickLabels();
//     java.lang.Object var21 = var16.draw(var17, var18, (java.lang.Object)var19);
// 
//   }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
//     org.jfree.chart.axis.ValueAxis[] var2 = null;
//     var0.setDomainAxes(var2);
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var3 = org.jfree.data.time.SerialDate.createInstance(255, 10, (-398));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.ClassLoader var2 = null;
//     java.util.ResourceBundle var3 = java.util.ResourceBundle.getBundle("Combined_Domain_XYPlot", var1, var2);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     org.jfree.data.time.RegularTimePeriod var1 = null;
//     org.jfree.data.time.RegularTimePeriod var2 = null;
//     org.jfree.chart.axis.PeriodAxis var3 = new org.jfree.chart.axis.PeriodAxis("hi!", var1, var2);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
    org.jfree.chart.urls.XYURLGenerator var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesURLGenerator((-398), var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    var2.setShadowYOffset(1.0E-5d);
    org.jfree.chart.labels.ItemLabelPosition var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setBaseNegativeItemLabelPosition(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(var0, 2147483647);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    org.jfree.chart.block.BlockBorder var4 = new org.jfree.chart.block.BlockBorder(0.0d, 0.2d, (-1.0d), (-1.0d));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.lang.String var0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "ThreadContext"+ "'", var0.equals("ThreadContext"));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    org.jfree.chart.plot.RingPlot var0 = new org.jfree.chart.plot.RingPlot();
    org.jfree.chart.labels.StandardPieSectionLabelGenerator var1 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
    var0.setLegendLabelGenerator((org.jfree.chart.labels.PieSectionLabelGenerator)var1);
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var5 = var4.getAxisLineStroke();
    var4.resizeRange2(0.0d, 10.0d);
    java.awt.Font var9 = var4.getTickLabelFont();
    var0.setNoDataMessageFont(var9);
    double var11 = var0.getMinimumArcAngleToDraw();
    java.awt.Font var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLabelFont(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0E-5d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SpreadsheetDate var3 = new org.jfree.data.time.SpreadsheetDate(100, 1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    var5.setNotify(false);
    var5.setNotify(false);
    java.lang.Object var10 = var5.getTextAntiAlias();
    var5.fireChartChanged();
    org.jfree.chart.ChartRenderingInfo var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.image.BufferedImage var15 = var5.createBufferedImage(255, (-398), var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    java.text.DateFormat var1 = null;
    java.text.NumberFormat var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.StandardXYToolTipGenerator var3 = new org.jfree.chart.labels.StandardXYToolTipGenerator("[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
//     org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
//     org.jfree.chart.event.TitleChangeEvent var6 = null;
//     var5.titleChanged(var6);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    org.jfree.chart.title.Title var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.addSubtitle(100, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var3 = var2.getAutoPopulateSeriesFillPaint();
//     java.awt.Graphics2D var4 = null;
//     org.jfree.chart.plot.CategoryPlot var5 = null;
//     org.jfree.chart.axis.DateAxis var6 = new org.jfree.chart.axis.DateAxis();
//     boolean var7 = var6.isVerticalTickLabels();
//     java.lang.Object var8 = var6.clone();
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     org.jfree.chart.plot.PolarPlot var18 = new org.jfree.chart.plot.PolarPlot();
//     var18.setBackgroundAlpha(1.0f);
//     java.awt.Paint var21 = var18.getBackgroundPaint();
//     var17.setLabelPaint(var21);
//     org.jfree.chart.block.BlockBorder var23 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var21);
//     org.jfree.chart.axis.NumberAxis3D var25 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var26 = var25.getAxisLineStroke();
//     boolean var27 = var25.isAutoRange();
//     org.jfree.chart.plot.IntervalMarker var30 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var31 = var30.getOutlineStroke();
//     var25.setTickMarkStroke(var31);
//     var2.drawRangeLine(var4, var5, (org.jfree.chart.axis.ValueAxis)var6, var9, 0.05d, var21, var31);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    java.awt.Graphics2D var1 = null;
    org.jfree.chart.text.TextAnchor var4 = null;
    org.jfree.chart.text.TextAnchor var6 = null;
    java.awt.Shape var7 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("", var1, 1.0f, (-1.0f), var4, 100.0d, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
    var3.setBackgroundAlpha(1.0f);
    boolean var6 = var2.hasListener((java.util.EventListener)var3);
    java.awt.Shape var7 = var2.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
    org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var13 = var12.getAxisLineStroke();
    var12.resizeRange2(0.0d, 10.0d);
    org.jfree.chart.entity.AxisEntity var18 = new org.jfree.chart.entity.AxisEntity(var7, (org.jfree.chart.axis.Axis)var12, "hi!");
    java.lang.String var19 = var18.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(var0, 0);
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.jfree.data.function.Function2D var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataset var5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(var0, 0.2d, 1.0d, (-1), (java.lang.Comparable)10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    int var6 = var0.indexOf((java.lang.Comparable)'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.getYValue(100, 13);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelativeAsStream("AxisLabelEntity: label = null", var1);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.updateByIndex((-398), (java.lang.Number)2147483647);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var3 = var2.getAutoPopulateSeriesFillPaint();
//     double var4 = var2.getLowerClip();
//     var2.setShadowYOffset(1.0E-5d);
//     double var7 = var2.getYOffset();
//     java.awt.Graphics2D var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.axis.CategoryAxis3D var10 = new org.jfree.chart.axis.CategoryAxis3D();
//     var10.configure();
//     var10.configure();
//     org.jfree.chart.axis.NumberAxis3D var13 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var15 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var16 = new org.jfree.chart.plot.PolarPlot();
//     var16.setBackgroundAlpha(1.0f);
//     boolean var19 = var15.hasListener((java.util.EventListener)var16);
//     java.awt.Shape var20 = var15.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var23 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var13, var20, "hi!", "hi!");
//     double var24 = var13.getUpperMargin();
//     double var25 = var13.getAutoRangeMinimumSize();
//     org.jfree.chart.util.Layer var26 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var27 = null;
//     var2.drawAnnotations(var8, var9, (org.jfree.chart.axis.CategoryAxis)var10, (org.jfree.chart.axis.ValueAxis)var13, var26, var27);
// 
//   }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    int var1 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var3 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
//     java.util.Date var1 = null;
//     long var2 = var0.getTime(var1);
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker((-1.0d), 0.2d);
    org.jfree.chart.text.TextAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addMonths(0, var1);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var0, true);
    org.jfree.data.xy.IntervalXYDelegate var3 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var0);
    java.lang.Object var4 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getXValue(255, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    java.awt.Paint var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setBaseOutlinePaint(var5, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.jfree.chart.axis.TickUnitSource var0 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.jfree.data.xy.TableXYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    java.awt.Font var1 = var0.getTickLabelFont();
    org.jfree.chart.util.RectangleInsets var2 = var0.getTickLabelInsets();
    double var4 = var2.trimHeight(1.0E-5d);
    java.awt.geom.Rectangle2D var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var6 = var2.createInsetRectangle(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-3.99999d));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.LegendItemCollection var4 = var0.getLegendItems();
    java.awt.Stroke var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeZeroBaselineStroke(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.axis.CategoryAxis3D var0 = new org.jfree.chart.axis.CategoryAxis3D();
    var0.removeCategoryLabelToolTip((java.lang.Comparable)2147483647);
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.util.RectangleEdge var9 = null;
    double var10 = var0.getCategorySeriesMiddle((-1), (-398), 0, 13, 0.0d, var8, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    var5.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var7 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
    var8.setBackgroundAlpha(1.0f);
    var7.addChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
    java.awt.Paint var12 = var8.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var15 = null;
    var8.handleClick((-398), 0, var15);
    org.jfree.chart.title.LegendTitle var17 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8);
    var5.addLegend(var17);
    java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var23 = var22.brighter();
    var17.setBackgroundPaint((java.awt.Paint)var22);
    org.jfree.chart.util.RectangleEdge var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.setLegendItemGraphicEdge(var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
    org.jfree.chart.labels.XYItemLabelGenerator var2 = var0.getSeriesItemLabelGenerator((-398));
    org.jfree.chart.annotations.XYAnnotation var3 = null;
    org.jfree.chart.util.Layer var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    java.awt.Font var1 = var0.getTickLabelFont();
    org.jfree.chart.util.RectangleInsets var2 = var0.getTickLabelInsets();
    double var3 = var2.getLeft();
    java.awt.geom.Rectangle2D var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var7 = var2.createInsetRectangle(var4, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 4.0d);

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     boolean var5 = var1.hasListener((java.util.EventListener)var2);
//     java.awt.Paint var6 = var2.getAngleLabelPaint();
//     java.awt.Stroke var7 = var2.getAngleGridlineStroke();
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var10 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var11 = new org.jfree.chart.plot.PolarPlot();
//     var11.setBackgroundAlpha(1.0f);
//     boolean var14 = var10.hasListener((java.util.EventListener)var11);
//     java.awt.Shape var15 = var10.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var18 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var8, var15, "hi!", "hi!");
//     java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var23 = var22.brighter();
//     org.jfree.chart.title.LegendGraphic var24 = new org.jfree.chart.title.LegendGraphic(var15, (java.awt.Paint)var22);
//     boolean var25 = var2.equals((java.lang.Object)var24);
//     
//     // Checks the contract:  equals-hashcode on var2 and var11
//     assertTrue("Contract failed: equals-hashcode on var2 and var11", var2.equals(var11) ? var2.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var2
//     assertTrue("Contract failed: equals-hashcode on var11 and var2", var11.equals(var2) ? var11.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }
// 
// 
//     org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
//     var0.addException(1L);
//     var0.addBaseTimelineExclusions(0L, (-1L));
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    java.lang.String[] var0 = org.jfree.data.time.SerialDate.getMonths();
    org.jfree.data.general.Dataset var1 = null;
    org.jfree.data.general.DatasetChangeEvent var2 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var0, var1);
    java.lang.Comparable[] var4 = new java.lang.Comparable[] { "null"};
    double[] var5 = null;
    double[][] var6 = new double[][] { var5};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.CategoryDataset var7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable[])var0, var4, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.jfree.chart.plot.PolarPlot var0 = new org.jfree.chart.plot.PolarPlot();
    org.jfree.chart.LegendItemCollection var1 = var0.getLegendItems();
    int var2 = var1.getItemCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     org.jfree.chart.axis.TickUnit var5 = var1.getAngleTickUnit();
//     org.jfree.chart.ChartRenderingInfo var7 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var8 = new org.jfree.chart.plot.PlotRenderingInfo(var7);
//     org.jfree.chart.plot.CombinedDomainXYPlot var9 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var9.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var13 = var9.getOrientation();
//     boolean var14 = var9.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var15 = var9.getQuadrantOrigin();
//     var1.zoomRangeAxes(1.0E-8d, var8, var15, true);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.jfree.chart.util.LogFormat var5 = new org.jfree.chart.util.LogFormat(0.0d, "", "", false);
    java.lang.StringBuffer var7 = null;
    java.text.FieldPosition var8 = null;
    java.lang.StringBuffer var9 = var5.format((-1.0d), var7, var8);
    java.text.NumberFormat var10 = var5.getExponentFormat();
    java.text.NumberFormat var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.StandardPieSectionLabelGenerator var12 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator("org.jfree.chart.ChartColor[r=10,g=100,b=1]", (java.text.NumberFormat)var5, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
//     var3.setBackgroundAlpha(1.0f);
//     boolean var6 = var2.hasListener((java.util.EventListener)var3);
//     java.awt.Shape var7 = var2.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
//     boolean var11 = var0.isVisible();
//     org.jfree.chart.text.TextBlock var12 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.axis.NumberAxis3D var14 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var16 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var17 = new org.jfree.chart.plot.PolarPlot();
//     var17.setBackgroundAlpha(1.0f);
//     boolean var20 = var16.hasListener((java.util.EventListener)var17);
//     java.awt.Shape var21 = var16.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var24 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var14, var21, "hi!", "hi!");
//     double var25 = var14.getUpperMargin();
//     java.awt.Font var26 = var14.getLabelFont();
//     java.awt.Color var30 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var31 = var30.brighter();
//     var12.addLine("", var26, (java.awt.Paint)var31);
//     var0.setLabelFont(var26);
//     
//     // Checks the contract:  equals-hashcode on var3 and var17
//     assertTrue("Contract failed: equals-hashcode on var3 and var17", var3.equals(var17) ? var3.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var3
//     assertTrue("Contract failed: equals-hashcode on var17 and var3", var17.equals(var3) ? var17.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    java.text.NumberFormat var0 = java.text.NumberFormat.getNumberInstance();
    boolean var1 = var0.isParseIntegerOnly();
    var0.setMinimumIntegerDigits(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.parseObject("org.jfree.chart.ChartColor[r=10,g=100,b=1]");
      fail("Expected exception of type java.text.ParseException");
    } catch (java.text.ParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    var2.setShadowYOffset(1.0E-5d);
    double var7 = var2.getYOffset();
    org.jfree.chart.labels.ItemLabelPosition var9 = null;
    var2.setSeriesNegativeItemLabelPosition(1, var9);
    org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var13 = var12.getAxisLineStroke();
    java.awt.Font var14 = var12.getLabelFont();
    var2.setBaseItemLabelFont(var14);
    org.jfree.chart.util.GradientPaintTransformer var16 = var2.getGradientPaintTransformer();
    var2.clearSeriesStrokes(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    var1.setRangeWithMargins(0.2d, 10.0d);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.plot.CombinedDomainXYPlot var2 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var2.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var6 = var2.getOrientation();
//     boolean var7 = var2.isDomainMinorGridlinesVisible();
//     org.jfree.chart.axis.DateAxis var8 = new org.jfree.chart.axis.DateAxis();
//     boolean var9 = var8.isVerticalTickLabels();
//     java.lang.Object var10 = var8.clone();
//     org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var14 = var13.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var15 = new org.jfree.chart.plot.PolarPlot();
//     var15.setBackgroundAlpha(1.0f);
//     java.awt.Paint var18 = var15.getBackgroundPaint();
//     var13.setPaint(var18);
//     org.jfree.chart.text.TextBlock var20 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var21 = var20.getLineAlignment();
//     org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var24 = var23.clone();
//     var23.setDescription("");
//     boolean var27 = var20.equals((java.lang.Object)"");
//     java.awt.Graphics2D var28 = null;
//     org.jfree.chart.util.Size2D var29 = var20.calculateDimensions(var28);
//     org.jfree.chart.plot.CombinedDomainXYPlot var32 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var32.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var36 = var32.getOrientation();
//     org.jfree.chart.JFreeChart var37 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var32);
//     var37.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var39 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var40 = new org.jfree.chart.plot.PolarPlot();
//     var40.setBackgroundAlpha(1.0f);
//     var39.addChangeListener((org.jfree.data.general.DatasetChangeListener)var40);
//     java.awt.Paint var44 = var40.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var47 = null;
//     var40.handleClick((-398), 0, var47);
//     org.jfree.chart.title.LegendTitle var49 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var40);
//     var37.addLegend(var49);
//     java.awt.Color var54 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var55 = var54.brighter();
//     var49.setBackgroundPaint((java.awt.Paint)var54);
//     org.jfree.chart.util.RectangleAnchor var57 = var49.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var62 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var63 = var62.getLicenceName();
//     java.lang.String var64 = var62.getLicenceName();
//     boolean var65 = var57.equals((java.lang.Object)var64);
//     java.awt.geom.Rectangle2D var66 = org.jfree.chart.util.RectangleAnchor.createRectangle(var29, (-3.99999d), 5.0d, var57);
//     var0.drawDomainMarker(var1, (org.jfree.chart.plot.XYPlot)var2, (org.jfree.chart.axis.ValueAxis)var8, (org.jfree.chart.plot.Marker)var13, var66);
// 
//   }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     java.util.Locale var2 = null;
//     org.jfree.data.time.Month var3 = new org.jfree.data.time.Month(var0, var1, var2);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.text.AttributedString var0 = null;
    java.io.ObjectOutputStream var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeAttributedString(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var1 = org.jfree.data.time.Month.parseMonth("org.jfree.chart.event.ChartProgressEvent[source=org.jfree.chart.event.RendererChangeEvent[source=1]]");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var2 = var1.getAxisLineStroke();
    java.awt.Paint var3 = var1.getLabelPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     java.awt.Color var3 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.image.ColorModel var4 = null;
//     java.awt.Rectangle var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     java.awt.geom.AffineTransform var7 = null;
//     java.awt.RenderingHints var8 = null;
//     java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
//     java.awt.Paint[] var10 = new java.awt.Paint[] { var3};
//     org.jfree.chart.title.TextTitle var12 = new org.jfree.chart.title.TextTitle("");
//     java.awt.Paint var13 = var12.getBackgroundPaint();
//     org.jfree.chart.title.TextTitle var15 = new org.jfree.chart.title.TextTitle("");
//     java.awt.Paint var16 = var15.getBackgroundPaint();
//     org.jfree.chart.axis.NumberAxis3D var18 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var19 = var18.getAxisLineStroke();
//     var18.resizeRange2(0.0d, 10.0d);
//     java.awt.Font var23 = var18.getTickLabelFont();
//     org.jfree.data.Range var24 = var18.getDefaultAutoRange();
//     boolean var25 = var18.isAutoTickUnitSelection();
//     java.awt.Paint var26 = var18.getTickLabelPaint();
//     var15.setBackgroundPaint(var26);
//     boolean var28 = var12.equals((java.lang.Object)var26);
//     java.awt.Paint[] var29 = new java.awt.Paint[] { var26};
//     org.jfree.chart.plot.CombinedDomainXYPlot var30 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var30.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var34 = var30.getOrientation();
//     org.jfree.chart.plot.IntervalMarker var37 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var38 = var37.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var39 = new org.jfree.chart.plot.PolarPlot();
//     var39.setBackgroundAlpha(1.0f);
//     java.awt.Paint var42 = var39.getBackgroundPaint();
//     var37.setPaint(var42);
//     var30.setRangeMinorGridlinePaint(var42);
//     org.jfree.chart.axis.AxisSpace var45 = null;
//     var30.setFixedDomainAxisSpace(var45);
//     java.awt.Stroke var47 = var30.getRangeZeroBaselineStroke();
//     java.awt.Stroke[] var48 = new java.awt.Stroke[] { var47};
//     org.jfree.data.xy.DefaultXYDataset var49 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var50 = new org.jfree.chart.plot.PolarPlot();
//     var50.setBackgroundAlpha(1.0f);
//     var49.addChangeListener((org.jfree.data.general.DatasetChangeListener)var50);
//     org.jfree.chart.axis.TickUnit var54 = var50.getAngleTickUnit();
//     org.jfree.chart.axis.NumberAxis3D var56 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var57 = var56.getAxisLineStroke();
//     var50.setRadiusGridlineStroke(var57);
//     java.awt.Stroke[] var59 = new java.awt.Stroke[] { var57};
//     org.jfree.chart.axis.NumberAxis3D var60 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var62 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var63 = new org.jfree.chart.plot.PolarPlot();
//     var63.setBackgroundAlpha(1.0f);
//     boolean var66 = var62.hasListener((java.util.EventListener)var63);
//     java.awt.Shape var67 = var62.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var70 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var60, var67, "hi!", "hi!");
//     java.awt.Shape[] var71 = new java.awt.Shape[] { var67};
//     org.jfree.chart.plot.DefaultDrawingSupplier var72 = new org.jfree.chart.plot.DefaultDrawingSupplier(var10, var29, var48, var59, var71);
//     
//     // Checks the contract:  equals-hashcode on var39 and var63
//     assertTrue("Contract failed: equals-hashcode on var39 and var63", var39.equals(var63) ? var39.hashCode() == var63.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var63 and var39
//     assertTrue("Contract failed: equals-hashcode on var63 and var39", var63.equals(var39) ? var63.hashCode() == var39.hashCode() : true);
// 
//   }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     org.jfree.chart.renderer.xy.GradientXYBarPainter var0 = new org.jfree.chart.renderer.xy.GradientXYBarPainter();
//     org.jfree.chart.renderer.xy.XYBarRenderer.setDefaultBarPainter((org.jfree.chart.renderer.xy.XYBarPainter)var0);
//     org.jfree.chart.util.StrokeMap var2 = new org.jfree.chart.util.StrokeMap();
//     java.lang.Object var3 = var2.clone();
//     boolean var4 = var0.equals(var3);
//     java.awt.Graphics2D var5 = null;
//     org.jfree.chart.renderer.xy.XYBarRenderer var6 = null;
//     org.jfree.chart.text.TextBlock var10 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var11 = var10.getLineAlignment();
//     org.jfree.chart.LegendItem var13 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var14 = var13.clone();
//     var13.setDescription("");
//     boolean var17 = var10.equals((java.lang.Object)"");
//     java.awt.Graphics2D var18 = null;
//     org.jfree.chart.util.Size2D var19 = var10.calculateDimensions(var18);
//     org.jfree.chart.plot.CombinedDomainXYPlot var22 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var22.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var26 = var22.getOrientation();
//     org.jfree.chart.JFreeChart var27 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var22);
//     var27.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var29 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var30 = new org.jfree.chart.plot.PolarPlot();
//     var30.setBackgroundAlpha(1.0f);
//     var29.addChangeListener((org.jfree.data.general.DatasetChangeListener)var30);
//     java.awt.Paint var34 = var30.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var37 = null;
//     var30.handleClick((-398), 0, var37);
//     org.jfree.chart.title.LegendTitle var39 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var30);
//     var27.addLegend(var39);
//     java.awt.Color var44 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var45 = var44.brighter();
//     var39.setBackgroundPaint((java.awt.Paint)var44);
//     org.jfree.chart.util.RectangleAnchor var47 = var39.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var52 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var53 = var52.getLicenceName();
//     java.lang.String var54 = var52.getLicenceName();
//     boolean var55 = var47.equals((java.lang.Object)var54);
//     java.awt.geom.Rectangle2D var56 = org.jfree.chart.util.RectangleAnchor.createRectangle(var19, (-3.99999d), 5.0d, var47);
//     org.jfree.chart.util.RectangleEdge var57 = null;
//     var0.paintBar(var5, var6, 2147483647, (-1), false, (java.awt.geom.RectangularShape)var56, var57);
// 
//   }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    var2.setShadowYOffset(1.0E-5d);
    double var7 = var2.getYOffset();
    org.jfree.data.xy.DefaultXYDataset var9 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var10 = new org.jfree.chart.plot.PolarPlot();
    var10.setBackgroundAlpha(1.0f);
    var9.addChangeListener((org.jfree.data.general.DatasetChangeListener)var10);
    java.awt.Paint var14 = var10.getAngleGridlinePaint();
    var2.setLegendTextPaint(0, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
    var7.setBackgroundAlpha(1.0f);
    boolean var10 = var6.hasListener((java.util.EventListener)var7);
    java.awt.Shape var11 = var6.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var14 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var4, var11, "hi!", "hi!");
    org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Paint var18 = var17.getLabelPaint();
    org.jfree.data.xy.DefaultXYDataset var19 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var20 = new org.jfree.chart.plot.PolarPlot();
    var20.setBackgroundAlpha(1.0f);
    var19.addChangeListener((org.jfree.data.general.DatasetChangeListener)var20);
    org.jfree.chart.axis.TickUnit var24 = var20.getAngleTickUnit();
    org.jfree.chart.axis.NumberAxis3D var26 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var27 = var26.getAxisLineStroke();
    var20.setRadiusGridlineStroke(var27);
    java.awt.Paint var29 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var30 = new org.jfree.chart.LegendItem(var0, "[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]", "null", "AxisLabelEntity: label = null", var11, var18, var27, var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.jfree.chart.block.BlockContainer var0 = new org.jfree.chart.block.BlockContainer();
    org.jfree.chart.title.TextTitle var2 = new org.jfree.chart.title.TextTitle("");
    int var3 = var2.getMaximumLinesToDisplay();
    org.jfree.chart.plot.PolarPlot var4 = new org.jfree.chart.plot.PolarPlot();
    var4.setBackgroundAlpha(1.0f);
    java.awt.Paint var7 = var4.getBackgroundPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((org.jfree.chart.block.Block)var2, (java.lang.Object)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2147483647);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var3 = var2.getAutoPopulateSeriesFillPaint();
//     double var4 = var2.getLowerClip();
//     var2.setShadowYOffset(1.0E-5d);
//     double var7 = var2.getYOffset();
//     java.awt.Graphics2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = null;
//     org.jfree.chart.axis.NumberAxis3D var10 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var13 = new org.jfree.chart.plot.PolarPlot();
//     var13.setBackgroundAlpha(1.0f);
//     boolean var16 = var12.hasListener((java.util.EventListener)var13);
//     java.awt.Shape var17 = var12.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var20 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var10, var17, "hi!", "hi!");
//     org.jfree.chart.axis.NumberAxis3D var22 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var23 = var22.getAxisLineStroke();
//     var22.resizeRange2(0.0d, 10.0d);
//     org.jfree.chart.entity.AxisEntity var28 = new org.jfree.chart.entity.AxisEntity(var17, (org.jfree.chart.axis.Axis)var22, "hi!");
//     var22.setAutoRangeIncludesZero(false);
//     float var31 = var22.getTickMarkOutsideLength();
//     org.jfree.chart.text.TextBlock var32 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var33 = var32.getLineAlignment();
//     org.jfree.chart.LegendItem var35 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var36 = var35.clone();
//     var35.setDescription("");
//     boolean var39 = var32.equals((java.lang.Object)"");
//     java.awt.Graphics2D var40 = null;
//     org.jfree.chart.util.Size2D var41 = var32.calculateDimensions(var40);
//     org.jfree.chart.plot.CombinedDomainXYPlot var44 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var44.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var48 = var44.getOrientation();
//     org.jfree.chart.JFreeChart var49 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var44);
//     var49.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var51 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var52 = new org.jfree.chart.plot.PolarPlot();
//     var52.setBackgroundAlpha(1.0f);
//     var51.addChangeListener((org.jfree.data.general.DatasetChangeListener)var52);
//     java.awt.Paint var56 = var52.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var59 = null;
//     var52.handleClick((-398), 0, var59);
//     org.jfree.chart.title.LegendTitle var61 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var52);
//     var49.addLegend(var61);
//     java.awt.Color var66 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var67 = var66.brighter();
//     var61.setBackgroundPaint((java.awt.Paint)var66);
//     org.jfree.chart.util.RectangleAnchor var69 = var61.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var74 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var75 = var74.getLicenceName();
//     java.lang.String var76 = var74.getLicenceName();
//     boolean var77 = var69.equals((java.lang.Object)var76);
//     java.awt.geom.Rectangle2D var78 = org.jfree.chart.util.RectangleAnchor.createRectangle(var41, (-3.99999d), 5.0d, var69);
//     org.jfree.chart.axis.NumberAxis3D var80 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var82 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var83 = new org.jfree.chart.plot.PolarPlot();
//     var83.setBackgroundAlpha(1.0f);
//     boolean var86 = var82.hasListener((java.util.EventListener)var83);
//     java.awt.Shape var87 = var82.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var90 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var80, var87, "hi!", "hi!");
//     java.awt.Color var94 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var95 = var94.brighter();
//     org.jfree.chart.title.LegendGraphic var96 = new org.jfree.chart.title.LegendGraphic(var87, (java.awt.Paint)var94);
//     java.awt.Stroke var97 = null;
//     var2.drawRangeLine(var8, var9, (org.jfree.chart.axis.ValueAxis)var22, var78, 10.0d, (java.awt.Paint)var94, var97);
//     
//     // Checks the contract:  equals-hashcode on var13 and var52
//     assertTrue("Contract failed: equals-hashcode on var13 and var52", var13.equals(var52) ? var13.hashCode() == var52.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var83
//     assertTrue("Contract failed: equals-hashcode on var13 and var83", var13.equals(var83) ? var13.hashCode() == var83.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var13
//     assertTrue("Contract failed: equals-hashcode on var52 and var13", var52.equals(var13) ? var52.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var83
//     assertTrue("Contract failed: equals-hashcode on var52 and var83", var52.equals(var83) ? var52.hashCode() == var83.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var83 and var13
//     assertTrue("Contract failed: equals-hashcode on var83 and var13", var83.equals(var13) ? var83.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var83 and var52
//     assertTrue("Contract failed: equals-hashcode on var83 and var52", var83.equals(var52) ? var83.hashCode() == var52.hashCode() : true);
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    int var1 = var0.size();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var4 = var0.get((-398));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     java.awt.Paint var5 = var1.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     var1.handleClick((-398), 0, var8);
//     org.jfree.chart.plot.PlotRenderingInfo var12 = null;
//     java.awt.geom.Point2D var13 = null;
//     var1.zoomDomainAxes(Double.NaN, 0.05d, var12, var13);
//     org.jfree.chart.plot.PlotOrientation var15 = var1.getOrientation();
//     org.jfree.chart.plot.CombinedDomainXYPlot var17 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var18 = var17.getRangeMinorGridlinePaint();
//     var17.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var23 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var24 = new org.jfree.chart.plot.PlotRenderingInfo(var23);
//     var17.handleClick(10, 0, var24);
//     org.jfree.chart.plot.CombinedDomainXYPlot var26 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var26.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var30 = var26.getOrientation();
//     boolean var31 = var26.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var32 = var26.getQuadrantOrigin();
//     var1.zoomRangeAxes(1.0E-8d, var24, var32, true);
// 
//   }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.chart.labels.StandardXYToolTipGenerator var0 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
    java.lang.String var1 = var0.getNullYString();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null"+ "'", var1.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    org.jfree.data.xy.XYDataItem var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var6 = var4.addOrUpdate(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     org.jfree.chart.axis.AxisSpace var0 = new org.jfree.chart.axis.AxisSpace();
//     org.jfree.chart.text.TextBlock var1 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var2 = var1.getLineAlignment();
//     org.jfree.chart.LegendItem var4 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var5 = var4.clone();
//     var4.setDescription("");
//     boolean var8 = var1.equals((java.lang.Object)"");
//     java.awt.Graphics2D var9 = null;
//     org.jfree.chart.util.Size2D var10 = var1.calculateDimensions(var9);
//     org.jfree.chart.plot.CombinedDomainXYPlot var13 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var13.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var17 = var13.getOrientation();
//     org.jfree.chart.JFreeChart var18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var13);
//     var18.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var20 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var21 = new org.jfree.chart.plot.PolarPlot();
//     var21.setBackgroundAlpha(1.0f);
//     var20.addChangeListener((org.jfree.data.general.DatasetChangeListener)var21);
//     java.awt.Paint var25 = var21.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var28 = null;
//     var21.handleClick((-398), 0, var28);
//     org.jfree.chart.title.LegendTitle var30 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var21);
//     var18.addLegend(var30);
//     java.awt.Color var35 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var36 = var35.brighter();
//     var30.setBackgroundPaint((java.awt.Paint)var35);
//     org.jfree.chart.util.RectangleAnchor var38 = var30.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var43 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var44 = var43.getLicenceName();
//     java.lang.String var45 = var43.getLicenceName();
//     boolean var46 = var38.equals((java.lang.Object)var45);
//     java.awt.geom.Rectangle2D var47 = org.jfree.chart.util.RectangleAnchor.createRectangle(var10, (-3.99999d), 5.0d, var38);
//     org.jfree.chart.text.TextBlock var48 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var49 = var48.getLineAlignment();
//     org.jfree.chart.LegendItem var51 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var52 = var51.clone();
//     var51.setDescription("");
//     boolean var55 = var48.equals((java.lang.Object)"");
//     java.awt.Graphics2D var56 = null;
//     org.jfree.chart.util.Size2D var57 = var48.calculateDimensions(var56);
//     org.jfree.chart.plot.CombinedDomainXYPlot var60 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var60.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var64 = var60.getOrientation();
//     org.jfree.chart.JFreeChart var65 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var60);
//     var65.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var67 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var68 = new org.jfree.chart.plot.PolarPlot();
//     var68.setBackgroundAlpha(1.0f);
//     var67.addChangeListener((org.jfree.data.general.DatasetChangeListener)var68);
//     java.awt.Paint var72 = var68.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var75 = null;
//     var68.handleClick((-398), 0, var75);
//     org.jfree.chart.title.LegendTitle var77 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var68);
//     var65.addLegend(var77);
//     java.awt.Color var82 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var83 = var82.brighter();
//     var77.setBackgroundPaint((java.awt.Paint)var82);
//     org.jfree.chart.util.RectangleAnchor var85 = var77.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var90 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var91 = var90.getLicenceName();
//     java.lang.String var92 = var90.getLicenceName();
//     boolean var93 = var85.equals((java.lang.Object)var92);
//     java.awt.geom.Rectangle2D var94 = org.jfree.chart.util.RectangleAnchor.createRectangle(var57, (-3.99999d), 5.0d, var85);
//     java.awt.geom.Rectangle2D var95 = var0.shrink(var47, var94);
//     
//     // Checks the contract:  equals-hashcode on var4 and var51
//     assertTrue("Contract failed: equals-hashcode on var4 and var51", var4.equals(var51) ? var4.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var4
//     assertTrue("Contract failed: equals-hashcode on var51 and var4", var51.equals(var4) ? var51.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var52
//     assertTrue("Contract failed: equals-hashcode on var5 and var52", var5.equals(var52) ? var5.hashCode() == var52.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var5
//     assertTrue("Contract failed: equals-hashcode on var52 and var5", var52.equals(var5) ? var52.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var57
//     assertTrue("Contract failed: equals-hashcode on var10 and var57", var10.equals(var57) ? var10.hashCode() == var57.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var57 and var10
//     assertTrue("Contract failed: equals-hashcode on var57 and var10", var57.equals(var10) ? var57.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var60
//     assertTrue("Contract failed: equals-hashcode on var13 and var60", var13.equals(var60) ? var13.hashCode() == var60.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var60 and var13
//     assertTrue("Contract failed: equals-hashcode on var60 and var13", var60.equals(var13) ? var60.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var65
//     assertTrue("Contract failed: equals-hashcode on var18 and var65", var18.equals(var65) ? var18.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var18
//     assertTrue("Contract failed: equals-hashcode on var65 and var18", var65.equals(var18) ? var65.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var68
//     assertTrue("Contract failed: equals-hashcode on var21 and var68", var21.equals(var68) ? var21.hashCode() == var68.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var68 and var21
//     assertTrue("Contract failed: equals-hashcode on var68 and var21", var68.equals(var21) ? var68.hashCode() == var21.hashCode() : true);
// 
//   }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var3 = var2.getAutoPopulateSeriesFillPaint();
//     double var4 = var2.getLowerClip();
//     var2.setShadowYOffset(1.0E-5d);
//     double var7 = var2.getYOffset();
//     org.jfree.chart.labels.ItemLabelPosition var9 = null;
//     var2.setSeriesNegativeItemLabelPosition(1, var9);
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var13 = var12.getAxisLineStroke();
//     java.awt.Font var14 = var12.getLabelFont();
//     var2.setBaseItemLabelFont(var14);
//     java.awt.Paint var16 = var2.getBaseItemLabelPaint();
//     java.awt.Graphics2D var17 = null;
//     org.jfree.chart.plot.CategoryPlot var18 = null;
//     org.jfree.chart.text.TextBlock var19 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var20 = var19.getLineAlignment();
//     org.jfree.chart.LegendItem var22 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var23 = var22.clone();
//     var22.setDescription("");
//     boolean var26 = var19.equals((java.lang.Object)"");
//     java.awt.Graphics2D var27 = null;
//     org.jfree.chart.util.Size2D var28 = var19.calculateDimensions(var27);
//     org.jfree.chart.plot.CombinedDomainXYPlot var31 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var31.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var35 = var31.getOrientation();
//     org.jfree.chart.JFreeChart var36 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var31);
//     var36.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var38 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var39 = new org.jfree.chart.plot.PolarPlot();
//     var39.setBackgroundAlpha(1.0f);
//     var38.addChangeListener((org.jfree.data.general.DatasetChangeListener)var39);
//     java.awt.Paint var43 = var39.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var46 = null;
//     var39.handleClick((-398), 0, var46);
//     org.jfree.chart.title.LegendTitle var48 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var39);
//     var36.addLegend(var48);
//     java.awt.Color var53 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var54 = var53.brighter();
//     var48.setBackgroundPaint((java.awt.Paint)var53);
//     org.jfree.chart.util.RectangleAnchor var56 = var48.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var61 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var62 = var61.getLicenceName();
//     java.lang.String var63 = var61.getLicenceName();
//     boolean var64 = var56.equals((java.lang.Object)var63);
//     java.awt.geom.Rectangle2D var65 = org.jfree.chart.util.RectangleAnchor.createRectangle(var28, (-3.99999d), 5.0d, var56);
//     org.jfree.chart.title.TextTitle var68 = new org.jfree.chart.title.TextTitle("");
//     java.awt.Paint var69 = var68.getBackgroundPaint();
//     org.jfree.chart.axis.NumberAxis3D var71 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var72 = var71.getAxisLineStroke();
//     var71.resizeRange2(0.0d, 10.0d);
//     java.awt.Font var76 = var71.getTickLabelFont();
//     org.jfree.data.Range var77 = var71.getDefaultAutoRange();
//     boolean var78 = var71.isAutoTickUnitSelection();
//     java.awt.Paint var79 = var71.getTickLabelPaint();
//     var68.setBackgroundPaint(var79);
//     org.jfree.chart.axis.NumberAxis3D var82 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var83 = var82.getAxisLineStroke();
//     boolean var84 = var82.isAutoRange();
//     org.jfree.chart.plot.IntervalMarker var87 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var88 = var87.getOutlineStroke();
//     var82.setTickMarkStroke(var88);
//     var2.drawDomainLine(var17, var18, var65, 0.0d, var79, var88);
// 
//   }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.LegendItemCollection var4 = var0.getLegendItems();
//     org.jfree.chart.plot.CombinedDomainXYPlot var5 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var5.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.LegendItemCollection var9 = var5.getLegendItems();
//     var4.addAll(var9);
//     
//     // Checks the contract:  equals-hashcode on var0 and var5
//     assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var0
//     assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var9
//     assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var4
//     assertTrue("Contract failed: equals-hashcode on var9 and var4", var9.equals(var4) ? var9.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var1 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
//     var2.setBackgroundAlpha(1.0f);
//     var1.addChangeListener((org.jfree.data.general.DatasetChangeListener)var2);
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     java.awt.geom.Point2D var9 = null;
//     var2.zoomDomainAxes(1.0d, 0.0d, var8, var9);
//     org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var14 = var13.getAutoPopulateSeriesFillPaint();
//     double var15 = var13.getLowerClip();
//     org.jfree.chart.ChartColor var19 = new org.jfree.chart.ChartColor(10, 100, 1);
//     var13.setBasePaint((java.awt.Paint)var19);
//     java.awt.Font var21 = var13.getBaseItemLabelFont();
//     var2.setAngleLabelFont(var21);
//     org.jfree.chart.plot.IntervalMarker var29 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     org.jfree.chart.plot.PolarPlot var30 = new org.jfree.chart.plot.PolarPlot();
//     var30.setBackgroundAlpha(1.0f);
//     java.awt.Paint var33 = var30.getBackgroundPaint();
//     var29.setLabelPaint(var33);
//     org.jfree.chart.block.BlockBorder var35 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var33);
//     org.jfree.chart.text.TextMeasurer var37 = null;
//     org.jfree.chart.text.TextBlock var38 = org.jfree.chart.text.TextUtilities.createTextBlock("PlotOrientation.HORIZONTAL", var21, var33, 10.0f, var37);
// 
//   }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     org.jfree.chart.labels.StandardPieSectionLabelGenerator var0 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
//     org.jfree.data.general.PieDataset var1 = null;
//     java.text.AttributedString var3 = var0.generateAttributedSectionLabel(var1, (java.lang.Comparable)"Combined_Domain_XYPlot");
// 
//   }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    org.jfree.data.time.SerialDate var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Day var1 = new org.jfree.data.time.Day(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var2 = var1.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var3 = var1.getTickLabelInsets();
//     double var5 = var3.trimHeight(1.0E-5d);
//     double var7 = var3.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var8 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var9 = var8.getLineAlignment();
//     org.jfree.chart.LegendItem var11 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var12 = var11.clone();
//     var11.setDescription("");
//     boolean var15 = var8.equals((java.lang.Object)"");
//     java.awt.Graphics2D var16 = null;
//     org.jfree.chart.util.Size2D var17 = var8.calculateDimensions(var16);
//     org.jfree.chart.plot.CombinedDomainXYPlot var20 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var20.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var24 = var20.getOrientation();
//     org.jfree.chart.JFreeChart var25 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var20);
//     var25.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var27 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var28 = new org.jfree.chart.plot.PolarPlot();
//     var28.setBackgroundAlpha(1.0f);
//     var27.addChangeListener((org.jfree.data.general.DatasetChangeListener)var28);
//     java.awt.Paint var32 = var28.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var35 = null;
//     var28.handleClick((-398), 0, var35);
//     org.jfree.chart.title.LegendTitle var37 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var28);
//     var25.addLegend(var37);
//     java.awt.Color var42 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var43 = var42.brighter();
//     var37.setBackgroundPaint((java.awt.Paint)var42);
//     org.jfree.chart.util.RectangleAnchor var45 = var37.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var50 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var51 = var50.getLicenceName();
//     java.lang.String var52 = var50.getLicenceName();
//     boolean var53 = var45.equals((java.lang.Object)var52);
//     java.awt.geom.Rectangle2D var54 = org.jfree.chart.util.RectangleAnchor.createRectangle(var17, (-3.99999d), 5.0d, var45);
//     var3.trim(var54);
//     boolean var56 = org.jfree.chart.util.LineUtilities.clipLine(var0, var54);
// 
//   }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     java.lang.Number[] var2 = null;
//     java.lang.Number[][] var3 = new java.lang.Number[][] { var2};
//     org.jfree.data.category.CategoryDataset var4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("{0}: ({1}, {2})", "", var3);
// 
//   }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var1 = var0.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var2 = var0.getTickLabelInsets();
//     double var4 = var2.trimHeight(1.0E-5d);
//     double var6 = var2.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var7 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var8 = var7.getLineAlignment();
//     org.jfree.chart.LegendItem var10 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var11 = var10.clone();
//     var10.setDescription("");
//     boolean var14 = var7.equals((java.lang.Object)"");
//     java.awt.Graphics2D var15 = null;
//     org.jfree.chart.util.Size2D var16 = var7.calculateDimensions(var15);
//     org.jfree.chart.plot.CombinedDomainXYPlot var19 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var19.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var23 = var19.getOrientation();
//     org.jfree.chart.JFreeChart var24 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var19);
//     var24.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var26 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var27 = new org.jfree.chart.plot.PolarPlot();
//     var27.setBackgroundAlpha(1.0f);
//     var26.addChangeListener((org.jfree.data.general.DatasetChangeListener)var27);
//     java.awt.Paint var31 = var27.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var34 = null;
//     var27.handleClick((-398), 0, var34);
//     org.jfree.chart.title.LegendTitle var36 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var27);
//     var24.addLegend(var36);
//     java.awt.Color var41 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var42 = var41.brighter();
//     var36.setBackgroundPaint((java.awt.Paint)var41);
//     org.jfree.chart.util.RectangleAnchor var44 = var36.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var49 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var50 = var49.getLicenceName();
//     java.lang.String var51 = var49.getLicenceName();
//     boolean var52 = var44.equals((java.lang.Object)var51);
//     java.awt.geom.Rectangle2D var53 = org.jfree.chart.util.RectangleAnchor.createRectangle(var16, (-3.99999d), 5.0d, var44);
//     var2.trim(var53);
//     org.jfree.chart.plot.CombinedDomainXYPlot var55 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var55.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var59 = var55.getOrientation();
//     org.jfree.chart.JFreeChart var60 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var55);
//     var60.setNotify(false);
//     var60.setNotify(false);
//     java.lang.Object var65 = var60.getTextAntiAlias();
//     org.jfree.chart.entity.JFreeChartEntity var67 = new org.jfree.chart.entity.JFreeChartEntity((java.awt.Shape)var53, var60, "ThreadContext");
//     
//     // Checks the contract:  equals-hashcode on var19 and var55
//     assertTrue("Contract failed: equals-hashcode on var19 and var55", var19.equals(var55) ? var19.hashCode() == var55.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var55 and var19
//     assertTrue("Contract failed: equals-hashcode on var55 and var19", var55.equals(var19) ? var55.hashCode() == var19.hashCode() : true);
// 
//   }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = org.jfree.data.time.SerialDate.monthCodeToString(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
    var3.setBackgroundAlpha(1.0f);
    boolean var6 = var2.hasListener((java.util.EventListener)var3);
    java.awt.Shape var7 = var2.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
    java.awt.Color var14 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var15 = var14.brighter();
    org.jfree.chart.title.LegendGraphic var16 = new org.jfree.chart.title.LegendGraphic(var7, (java.awt.Paint)var14);
    java.awt.Graphics2D var17 = null;
    org.jfree.chart.block.RectangleConstraint var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.Size2D var19 = var16.arrange(var17, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var1 = org.jfree.data.time.Year.parseYear("null");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.setMinorTickMarkOutsideLength(0.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.AxisEntity var7 = new org.jfree.chart.entity.AxisEntity(var0, (org.jfree.chart.axis.Axis)var2, "hi!", "org.jfree.chart.ChartColor[r=10,g=100,b=1]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }
// 
// 
//     org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
//     var0.addException(1L);
//     java.util.Date var3 = null;
//     var0.addBaseTimelineException(var3);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    org.jfree.chart.renderer.xy.XYBarPainter var0 = org.jfree.chart.renderer.xy.XYBarRenderer.getDefaultBarPainter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
    org.jfree.chart.plot.CombinedDomainXYPlot var4 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var4.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var8 = var4.getOrientation();
    var3.add((org.jfree.chart.plot.XYPlot)var4);
    org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var13 = new org.jfree.chart.plot.PolarPlot();
    var13.setBackgroundAlpha(1.0f);
    boolean var16 = var12.hasListener((java.util.EventListener)var13);
    java.awt.Shape var17 = var12.getLeftArrow();
    double var18 = var12.getLowerBound();
    java.awt.Paint var19 = var12.getTickLabelPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setQuadrantPaint(255, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
    boolean var2 = var0.isRangeMinorGridlinesVisible();
    var0.setBackgroundImageAlignment(2147483647);
    org.jfree.chart.axis.NumberTickUnit var7 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    java.util.List var11 = var10.getItems();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToDomainAxes(10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    org.jfree.data.general.SeriesException var1 = new org.jfree.data.general.SeriesException("[Dec 31, 1969 4:00:00 PM --> Dec 31, 1969 4:00:00 PM]");

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.axis.AxisSpace var5 = null;
    var0.setFixedDomainAxisSpace(var5);
    org.jfree.chart.axis.AxisSpace var7 = new org.jfree.chart.axis.AxisSpace();
    var0.setFixedRangeAxisSpace(var7);
    org.jfree.chart.util.RectangleEdge var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.ensureAtLeast(10.0d, var10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    org.jfree.chart.labels.StandardPieSectionLabelGenerator var0 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
    var8.setBackgroundAlpha(1.0f);
    java.awt.Paint var11 = var8.getBackgroundPaint();
    var7.setLabelPaint(var11);
    org.jfree.chart.block.BlockBorder var13 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var11);
    boolean var14 = var0.equals((java.lang.Object)100.0d);
    java.text.AttributedString var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setAttributedLabel((-398), var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
    long var1 = var0.getSegmentsGroupSize();
    org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    java.util.List var7 = var6.getItems();
    var0.addExceptions(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 86400000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.plot.XYPlot var2 = null;
//     org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D();
//     var3.setVerticalTickLabels(false);
//     org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var7 = var6.getRangeMinorGridlinePaint();
//     var6.clearRangeMarkers(1);
//     org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var14 = var13.getOutlineStroke();
//     java.awt.Stroke var15 = var13.getOutlineStroke();
//     org.jfree.chart.util.Layer var16 = null;
//     var6.addRangeMarker(10, (org.jfree.chart.plot.Marker)var13, var16, true);
//     org.jfree.chart.plot.IntervalMarker var22 = new org.jfree.chart.plot.IntervalMarker(1.0E-8d, 1.0d);
//     org.jfree.chart.util.Layer var23 = null;
//     boolean var25 = var6.removeDomainMarker(13, (org.jfree.chart.plot.Marker)var22, var23, true);
//     java.awt.Graphics2D var26 = null;
//     org.jfree.chart.axis.NumberAxis3D var27 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var28 = var27.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var29 = var27.getTickLabelInsets();
//     double var31 = var29.trimHeight(1.0E-5d);
//     double var33 = var29.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var34 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var35 = var34.getLineAlignment();
//     org.jfree.chart.LegendItem var37 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var38 = var37.clone();
//     var37.setDescription("");
//     boolean var41 = var34.equals((java.lang.Object)"");
//     java.awt.Graphics2D var42 = null;
//     org.jfree.chart.util.Size2D var43 = var34.calculateDimensions(var42);
//     org.jfree.chart.plot.CombinedDomainXYPlot var46 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var46.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var50 = var46.getOrientation();
//     org.jfree.chart.JFreeChart var51 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var46);
//     var51.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var53 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var54 = new org.jfree.chart.plot.PolarPlot();
//     var54.setBackgroundAlpha(1.0f);
//     var53.addChangeListener((org.jfree.data.general.DatasetChangeListener)var54);
//     java.awt.Paint var58 = var54.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var61 = null;
//     var54.handleClick((-398), 0, var61);
//     org.jfree.chart.title.LegendTitle var63 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var54);
//     var51.addLegend(var63);
//     java.awt.Color var68 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var69 = var68.brighter();
//     var63.setBackgroundPaint((java.awt.Paint)var68);
//     org.jfree.chart.util.RectangleAnchor var71 = var63.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var76 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var77 = var76.getLicenceName();
//     java.lang.String var78 = var76.getLicenceName();
//     boolean var79 = var71.equals((java.lang.Object)var78);
//     java.awt.geom.Rectangle2D var80 = org.jfree.chart.util.RectangleAnchor.createRectangle(var43, (-3.99999d), 5.0d, var71);
//     var29.trim(var80);
//     org.jfree.chart.axis.NumberTickUnit var83 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
//     org.jfree.data.xy.XYSeries var86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
//     java.util.List var87 = var86.getItems();
//     var6.drawRangeTickBands(var26, var80, var87);
//     org.jfree.chart.axis.NumberAxis3D var91 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var92 = var91.getTickLabelPaint();
//     org.jfree.chart.plot.IntervalMarker var95 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var96 = var95.getOutlineStroke();
//     var0.drawRangeLine(var1, var2, (org.jfree.chart.axis.ValueAxis)var3, var80, 10.0d, var92, var96);
//     
//     // Checks the contract:  equals-hashcode on var13 and var95
//     assertTrue("Contract failed: equals-hashcode on var13 and var95", var13.equals(var95) ? var13.hashCode() == var95.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var95 and var13
//     assertTrue("Contract failed: equals-hashcode on var95 and var13", var95.equals(var13) ? var95.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.jfree.chart.text.TextUtilities.setUseDrawRotatedStringWorkaround(true);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    int var1 = var0.size();
    int var2 = var0.size();
    org.jfree.chart.axis.TickUnit var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var4 = var0.getCeilingTickUnit(var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
//     org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
//     var5.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var7 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var8 = new org.jfree.chart.plot.PolarPlot();
//     var8.setBackgroundAlpha(1.0f);
//     var7.addChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
//     java.awt.Paint var12 = var8.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var15 = null;
//     var8.handleClick((-398), 0, var15);
//     org.jfree.chart.title.LegendTitle var17 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8);
//     var5.addLegend(var17);
//     java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var23 = var22.brighter();
//     var17.setBackgroundPaint((java.awt.Paint)var22);
//     org.jfree.chart.util.RectangleAnchor var25 = var17.getLegendItemGraphicLocation();
//     org.jfree.chart.block.BlockContainer var26 = new org.jfree.chart.block.BlockContainer();
//     var17.setWrapper(var26);
//     java.awt.Graphics2D var28 = null;
//     org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.util.RectangleInsets var30 = var29.getSimpleLabelOffset();
//     org.jfree.chart.axis.NumberAxis3D var31 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var32 = var31.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var33 = var31.getTickLabelInsets();
//     double var35 = var33.trimHeight(1.0E-5d);
//     double var37 = var33.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var38 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var39 = var38.getLineAlignment();
//     org.jfree.chart.LegendItem var41 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var42 = var41.clone();
//     var41.setDescription("");
//     boolean var45 = var38.equals((java.lang.Object)"");
//     java.awt.Graphics2D var46 = null;
//     org.jfree.chart.util.Size2D var47 = var38.calculateDimensions(var46);
//     org.jfree.chart.plot.CombinedDomainXYPlot var50 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var50.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var54 = var50.getOrientation();
//     org.jfree.chart.JFreeChart var55 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var50);
//     var55.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var57 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var58 = new org.jfree.chart.plot.PolarPlot();
//     var58.setBackgroundAlpha(1.0f);
//     var57.addChangeListener((org.jfree.data.general.DatasetChangeListener)var58);
//     java.awt.Paint var62 = var58.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var65 = null;
//     var58.handleClick((-398), 0, var65);
//     org.jfree.chart.title.LegendTitle var67 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var58);
//     var55.addLegend(var67);
//     java.awt.Color var72 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var73 = var72.brighter();
//     var67.setBackgroundPaint((java.awt.Paint)var72);
//     org.jfree.chart.util.RectangleAnchor var75 = var67.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var80 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var81 = var80.getLicenceName();
//     java.lang.String var82 = var80.getLicenceName();
//     boolean var83 = var75.equals((java.lang.Object)var82);
//     java.awt.geom.Rectangle2D var84 = org.jfree.chart.util.RectangleAnchor.createRectangle(var47, (-3.99999d), 5.0d, var75);
//     var33.trim(var84);
//     java.awt.geom.Rectangle2D var88 = var30.createInsetRectangle(var84, true, true);
//     var26.draw(var28, var88);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    var4.add(10.0d, (-1.0d), true);
    double var9 = var4.getMinX();
    org.jfree.data.xy.XYDataItem var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.add(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10.0d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    org.jfree.chart.plot.RingPlot var0 = new org.jfree.chart.plot.RingPlot();
    org.jfree.chart.labels.PieSectionLabelGenerator var1 = var0.getLegendLabelGenerator();
    java.awt.Stroke var2 = var0.getSeparatorStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     org.jfree.chart.axis.DateTickUnitType var0 = null;
//     org.jfree.chart.axis.DateTickUnitType var2 = null;
//     java.text.DateFormat var4 = null;
//     org.jfree.chart.axis.DateTickUnit var5 = new org.jfree.chart.axis.DateTickUnit(var0, 10, var2, 13, var4);
// 
//   }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     org.jfree.data.xy.TableXYDataset var0 = null;
//     double var2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(var0, 100);
// 
//   }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.jfree.chart.LegendItem var1 = new org.jfree.chart.LegendItem("");
    java.lang.Object var2 = var1.clone();
    org.jfree.data.xy.DefaultXYDataset var3 = new org.jfree.data.xy.DefaultXYDataset();
    var1.setDataset((org.jfree.data.general.Dataset)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = org.jfree.chart.renderer.RendererUtilities.findLiveItemsLowerBound((org.jfree.data.xy.XYDataset)var3, 0, 1.0d, 1.0E-5d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
    var9.setBackgroundAlpha(1.0f);
    java.awt.Paint var12 = var9.getBackgroundPaint();
    var7.setPaint(var12);
    var0.setRangeMinorGridlinePaint(var12);
    int var15 = var0.getWeight();
    org.jfree.chart.annotations.XYAnnotation var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var0.removeAnnotation(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     java.util.Locale var0 = null;
//     java.text.NumberFormat var1 = java.text.NumberFormat.getNumberInstance(var0);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Paint var3 = var2.getLabelPaint();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    java.awt.Stroke var6 = var2.getStroke();
    org.jfree.chart.plot.CombinedDomainXYPlot var7 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var7.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var11 = var7.getOrientation();
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var7);
    var12.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var14 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var15 = new org.jfree.chart.plot.PolarPlot();
    var15.setBackgroundAlpha(1.0f);
    var14.addChangeListener((org.jfree.data.general.DatasetChangeListener)var15);
    java.awt.Paint var19 = var15.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var22 = null;
    var15.handleClick((-398), 0, var22);
    org.jfree.chart.title.LegendTitle var24 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var15);
    var12.addLegend(var24);
    java.awt.Color var29 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var30 = var29.brighter();
    var24.setBackgroundPaint((java.awt.Paint)var29);
    org.jfree.chart.util.RectangleAnchor var32 = var24.getLegendItemGraphicLocation();
    org.jfree.chart.ui.Library var37 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var38 = var37.getLicenceName();
    java.lang.String var39 = var37.getLicenceName();
    boolean var40 = var32.equals((java.lang.Object)var39);
    var2.setLabelAnchor(var32);
    org.jfree.chart.util.LengthAdjustmentType var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelOffsetType(var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var6 = var5.getAxisLineStroke();
    boolean var7 = var5.isAutoRange();
    org.jfree.data.Range var10 = new org.jfree.data.Range(0.0d, 0.0d);
    double var11 = var10.getLowerBound();
    var5.setRangeWithMargins(var10, false, false);
    float var15 = var5.getMinorTickMarkInsideLength();
    org.jfree.data.Range var16 = var3.getDataRange((org.jfree.chart.axis.ValueAxis)var5);
    java.awt.Paint var17 = var3.getRangeCrosshairPaint();
    boolean var18 = var3.isRangeCrosshairLockedOnData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    org.jfree.chart.axis.AxisSpace var6 = null;
    var0.setFixedRangeAxisSpace(var6);
    java.awt.Stroke var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeMinorGridlineStroke(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     org.jfree.data.time.Year var0 = new org.jfree.data.time.Year();
//     long var1 = var0.getMiddleMillisecond();
//     java.util.Calendar var2 = null;
//     var0.peg(var2);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     double[] var2 = null;
//     double[][] var3 = new double[][] { var2};
//     org.jfree.data.category.CategoryDataset var4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("AxisLabelEntity: label = null", "null", var3);
// 
//   }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 0, var4, var5);
//     var0.setGap(1.0E-8d);
//     java.awt.Graphics2D var9 = null;
//     org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.util.RectangleInsets var11 = var10.getSimpleLabelOffset();
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var13 = var12.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var14 = var12.getTickLabelInsets();
//     double var16 = var14.trimHeight(1.0E-5d);
//     double var18 = var14.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var19 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var20 = var19.getLineAlignment();
//     org.jfree.chart.LegendItem var22 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var23 = var22.clone();
//     var22.setDescription("");
//     boolean var26 = var19.equals((java.lang.Object)"");
//     java.awt.Graphics2D var27 = null;
//     org.jfree.chart.util.Size2D var28 = var19.calculateDimensions(var27);
//     org.jfree.chart.plot.CombinedDomainXYPlot var31 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var31.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var35 = var31.getOrientation();
//     org.jfree.chart.JFreeChart var36 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var31);
//     var36.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var38 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var39 = new org.jfree.chart.plot.PolarPlot();
//     var39.setBackgroundAlpha(1.0f);
//     var38.addChangeListener((org.jfree.data.general.DatasetChangeListener)var39);
//     java.awt.Paint var43 = var39.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var46 = null;
//     var39.handleClick((-398), 0, var46);
//     org.jfree.chart.title.LegendTitle var48 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var39);
//     var36.addLegend(var48);
//     java.awt.Color var53 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var54 = var53.brighter();
//     var48.setBackgroundPaint((java.awt.Paint)var53);
//     org.jfree.chart.util.RectangleAnchor var56 = var48.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var61 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var62 = var61.getLicenceName();
//     java.lang.String var63 = var61.getLicenceName();
//     boolean var64 = var56.equals((java.lang.Object)var63);
//     java.awt.geom.Rectangle2D var65 = org.jfree.chart.util.RectangleAnchor.createRectangle(var28, (-3.99999d), 5.0d, var56);
//     var14.trim(var65);
//     java.awt.geom.Rectangle2D var69 = var11.createInsetRectangle(var65, true, true);
//     org.jfree.chart.plot.CombinedDomainXYPlot var70 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var70.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var74 = var70.getOrientation();
//     boolean var75 = var70.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var76 = var70.getQuadrantOrigin();
//     org.jfree.chart.plot.PlotState var77 = new org.jfree.chart.plot.PlotState();
//     org.jfree.chart.plot.PlotRenderingInfo var78 = null;
//     var0.draw(var9, var65, var76, var77, var78);
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    java.awt.Color var4 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var8 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var9 = var4.getColorComponents(var8);
    java.awt.Color var10 = java.awt.Color.getColor("TitleEntity: tooltip = AxisLabelEntity: label = null", var4);
    java.awt.Color var14 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var18 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var19 = var14.getColorComponents(var18);
    java.awt.color.ColorSpace var20 = var14.getColorSpace();
    java.awt.Color var24 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    float[] var28 = new float[] { 10.0f, (-1.0f), 100.0f};
    float[] var29 = var24.getColorComponents(var28);
    float[] var30 = var14.getRGBColorComponents(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var31 = var4.getComponents(var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.jfree.chart.labels.StandardXYSeriesLabelGenerator var0 = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator();
    org.jfree.data.xy.DefaultXYDataset var1 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var2 = new org.jfree.chart.plot.PolarPlot();
    var2.setBackgroundAlpha(1.0f);
    var1.addChangeListener((org.jfree.data.general.DatasetChangeListener)var2);
    int var7 = var1.indexOf((java.lang.Comparable)'a');
    java.lang.Number var8 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var1);
    var1.validateObject();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var0.generateLabel((org.jfree.data.xy.XYDataset)var1, 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }
// 
// 
//     java.text.NumberFormat var1 = java.text.NumberFormat.getNumberInstance();
//     org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(Double.NaN, var1, 2147483647);
//     int var4 = var1.getMaximumFractionDigits();
//     java.text.ParsePosition var6 = null;
//     java.lang.Object var7 = var1.parseObject("org.jfree.chart.event.ChartProgressEvent[source=org.jfree.chart.event.RendererChangeEvent[source=1]]", var6);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
    var7.setBackgroundAlpha(1.0f);
    boolean var10 = var6.hasListener((java.util.EventListener)var7);
    java.awt.Shape var11 = var6.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var14 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var4, var11, "hi!", "hi!");
    java.awt.Color var18 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var19 = var18.brighter();
    org.jfree.chart.title.LegendGraphic var20 = new org.jfree.chart.title.LegendGraphic(var11, (java.awt.Paint)var18);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, Double.NaN, 0.2d);
    org.jfree.chart.ChartColor var27 = new org.jfree.chart.ChartColor(10, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var28 = new org.jfree.chart.LegendItem(var0, "PlotOrientation.HORIZONTAL", "AxisLabelEntity: label = null", "org.jfree.chart.event.ChartProgressEvent[source=org.jfree.chart.event.RendererChangeEvent[source=1]]", var23, (java.awt.Paint)var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var6 = new org.jfree.chart.plot.PolarPlot();
    var6.setBackgroundAlpha(1.0f);
    boolean var9 = var5.hasListener((java.util.EventListener)var6);
    java.awt.Shape var10 = var5.getLeftArrow();
    org.jfree.chart.renderer.category.BarRenderer3D var13 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var14 = var13.getAutoPopulateSeriesFillPaint();
    double var15 = var13.getLowerClip();
    var13.setShadowYOffset(1.0E-5d);
    double var18 = var13.getYOffset();
    org.jfree.chart.labels.ItemLabelPosition var20 = null;
    var13.setSeriesNegativeItemLabelPosition(1, var20);
    org.jfree.chart.axis.NumberAxis3D var23 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var24 = var23.getAxisLineStroke();
    java.awt.Font var25 = var23.getLabelFont();
    var13.setBaseItemLabelFont(var25);
    java.awt.Paint var27 = var13.getBaseItemLabelPaint();
    org.jfree.chart.labels.ItemLabelPosition var29 = null;
    var13.setSeriesNegativeItemLabelPosition(15, var29);
    java.awt.Paint var31 = var13.getBaseItemLabelPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var32 = new org.jfree.chart.LegendItem(var0, "org.jfree.chart.event.ChartProgressEvent[source=org.jfree.chart.event.RendererChangeEvent[source=1]]", "org.jfree.chart.event.ChartProgressEvent[source=org.jfree.chart.event.RendererChangeEvent[source=1]]", "hi!", var10, var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var2 = var1.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
//     var3.setGap(4.0d);
//     org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var6.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var10 = var6.getOrientation();
//     org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var6);
//     var11.setNotify(false);
//     var3.addChangeListener((org.jfree.chart.event.PlotChangeListener)var11);
//     org.jfree.chart.plot.CombinedDomainXYPlot var15 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var15.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var19 = var15.getOrientation();
//     org.jfree.chart.JFreeChart var20 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var15);
//     var20.setNotify(false);
//     var20.setNotify(false);
//     java.lang.Object var25 = var20.getTextAntiAlias();
//     var20.setTextAntiAlias(true);
//     org.jfree.chart.axis.NumberAxis3D var28 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var29 = var28.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var30 = var28.getTickLabelInsets();
//     double var31 = var30.getLeft();
//     var20.setPadding(var30);
//     var3.setInsets(var30);
//     
//     // Checks the contract:  equals-hashcode on var6 and var15
//     assertTrue("Contract failed: equals-hashcode on var6 and var15", var6.equals(var15) ? var6.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var6
//     assertTrue("Contract failed: equals-hashcode on var15 and var6", var15.equals(var6) ? var15.hashCode() == var6.hashCode() : true);
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.JFreeChart var5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var0);
    var5.setNotify(false);
    var5.setNotify(false);
    java.lang.Object var10 = var5.getTextAntiAlias();
    var5.setTextAntiAlias(true);
    org.jfree.chart.ChartRenderingInfo var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.image.BufferedImage var17 = var5.createBufferedImage(10, (-398), (-1), var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    int var6 = var0.indexOf((java.lang.Comparable)'a');
    org.jfree.data.xy.IntervalXYDelegate var7 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var0);
    org.jfree.data.Range var9 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.getXValue((-398), 255);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var0.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
//     org.jfree.chart.axis.AxisSpace var5 = null;
//     var0.setFixedDomainAxisSpace(var5);
//     org.jfree.chart.axis.AxisSpace var7 = new org.jfree.chart.axis.AxisSpace();
//     var0.setFixedRangeAxisSpace(var7);
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var13 = var12.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var14 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var12);
//     org.jfree.chart.axis.NumberAxis3D var16 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var17 = var16.getAxisLineStroke();
//     boolean var18 = var16.isAutoRange();
//     org.jfree.data.Range var21 = new org.jfree.data.Range(0.0d, 0.0d);
//     double var22 = var21.getLowerBound();
//     var16.setRangeWithMargins(var21, false, false);
//     float var26 = var16.getMinorTickMarkInsideLength();
//     org.jfree.data.Range var27 = var14.getDataRange((org.jfree.chart.axis.ValueAxis)var16);
//     java.util.List var28 = var14.getSubplots();
//     org.jfree.chart.plot.CombinedDomainXYPlot var29 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var30 = var29.getRangeMinorGridlinePaint();
//     var29.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var35 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var36 = new org.jfree.chart.plot.PlotRenderingInfo(var35);
//     var29.handleClick(10, 0, var36);
//     java.awt.geom.Rectangle2D var38 = var36.getDataArea();
//     org.jfree.chart.plot.CombinedDomainXYPlot var39 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var39.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var43 = var39.getOrientation();
//     boolean var44 = var39.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var45 = var39.getQuadrantOrigin();
//     org.jfree.chart.plot.XYPlot var46 = var14.findSubplot(var36, var45);
//     org.jfree.chart.axis.NumberAxis3D var48 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var49 = var48.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var50 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var48);
//     org.jfree.chart.axis.NumberAxis3D var52 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var53 = var52.getAxisLineStroke();
//     boolean var54 = var52.isAutoRange();
//     org.jfree.data.Range var57 = new org.jfree.data.Range(0.0d, 0.0d);
//     double var58 = var57.getLowerBound();
//     var52.setRangeWithMargins(var57, false, false);
//     float var62 = var52.getMinorTickMarkInsideLength();
//     org.jfree.data.Range var63 = var50.getDataRange((org.jfree.chart.axis.ValueAxis)var52);
//     java.util.List var64 = var50.getSubplots();
//     org.jfree.chart.plot.CombinedDomainXYPlot var65 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var66 = var65.getRangeMinorGridlinePaint();
//     var65.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var71 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var72 = new org.jfree.chart.plot.PlotRenderingInfo(var71);
//     var65.handleClick(10, 0, var72);
//     java.awt.geom.Rectangle2D var74 = var72.getDataArea();
//     org.jfree.chart.plot.CombinedDomainXYPlot var75 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var75.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var79 = var75.getOrientation();
//     boolean var80 = var75.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var81 = var75.getQuadrantOrigin();
//     org.jfree.chart.plot.XYPlot var82 = var50.findSubplot(var72, var81);
//     var0.zoomRangeAxes(100.0d, 0.5d, var36, var81);
//     
//     // Checks the contract:  equals-hashcode on var0 and var39
//     assertTrue("Contract failed: equals-hashcode on var0 and var39", var0.equals(var39) ? var0.hashCode() == var39.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var0 and var75
//     assertTrue("Contract failed: equals-hashcode on var0 and var75", var0.equals(var75) ? var0.hashCode() == var75.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var65
//     assertTrue("Contract failed: equals-hashcode on var29 and var65", var29.equals(var65) ? var29.hashCode() == var65.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var39 and var0
//     assertTrue("Contract failed: equals-hashcode on var39 and var0", var39.equals(var0) ? var39.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var39 and var75
//     assertTrue("Contract failed: equals-hashcode on var39 and var75", var39.equals(var75) ? var39.hashCode() == var75.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var65 and var29
//     assertTrue("Contract failed: equals-hashcode on var65 and var29", var65.equals(var29) ? var65.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var75 and var0
//     assertTrue("Contract failed: equals-hashcode on var75 and var0", var75.equals(var0) ? var75.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var75 and var39
//     assertTrue("Contract failed: equals-hashcode on var75 and var39", var75.equals(var39) ? var75.hashCode() == var39.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var50
//     assertTrue("Contract failed: equals-hashcode on var14 and var50", var14.equals(var50) ? var14.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var14
//     assertTrue("Contract failed: equals-hashcode on var50 and var14", var50.equals(var14) ? var50.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var72
//     assertTrue("Contract failed: equals-hashcode on var36 and var72", var36.equals(var72) ? var36.hashCode() == var72.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var72 and var36
//     assertTrue("Contract failed: equals-hashcode on var72 and var36", var72.equals(var36) ? var72.hashCode() == var36.hashCode() : true);
// 
//   }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
    var0.clearRangeMarkers(1);
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    java.awt.Stroke var9 = var7.getOutlineStroke();
    org.jfree.chart.util.Layer var10 = null;
    var0.addRangeMarker(10, (org.jfree.chart.plot.Marker)var7, var10, true);
    org.jfree.chart.plot.IntervalMarker var16 = new org.jfree.chart.plot.IntervalMarker(1.0E-8d, 1.0d);
    org.jfree.chart.util.Layer var17 = null;
    boolean var19 = var0.removeDomainMarker(13, (org.jfree.chart.plot.Marker)var16, var17, true);
    java.awt.Graphics2D var20 = null;
    org.jfree.chart.axis.NumberAxis3D var21 = new org.jfree.chart.axis.NumberAxis3D();
    java.awt.Font var22 = var21.getTickLabelFont();
    org.jfree.chart.util.RectangleInsets var23 = var21.getTickLabelInsets();
    double var25 = var23.trimHeight(1.0E-5d);
    double var27 = var23.calculateBottomInset(1.0E-8d);
    org.jfree.chart.text.TextBlock var28 = new org.jfree.chart.text.TextBlock();
    org.jfree.chart.util.HorizontalAlignment var29 = var28.getLineAlignment();
    org.jfree.chart.LegendItem var31 = new org.jfree.chart.LegendItem("");
    java.lang.Object var32 = var31.clone();
    var31.setDescription("");
    boolean var35 = var28.equals((java.lang.Object)"");
    java.awt.Graphics2D var36 = null;
    org.jfree.chart.util.Size2D var37 = var28.calculateDimensions(var36);
    org.jfree.chart.plot.CombinedDomainXYPlot var40 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var40.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var44 = var40.getOrientation();
    org.jfree.chart.JFreeChart var45 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var40);
    var45.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var47 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var48 = new org.jfree.chart.plot.PolarPlot();
    var48.setBackgroundAlpha(1.0f);
    var47.addChangeListener((org.jfree.data.general.DatasetChangeListener)var48);
    java.awt.Paint var52 = var48.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var55 = null;
    var48.handleClick((-398), 0, var55);
    org.jfree.chart.title.LegendTitle var57 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var48);
    var45.addLegend(var57);
    java.awt.Color var62 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var63 = var62.brighter();
    var57.setBackgroundPaint((java.awt.Paint)var62);
    org.jfree.chart.util.RectangleAnchor var65 = var57.getLegendItemGraphicLocation();
    org.jfree.chart.ui.Library var70 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var71 = var70.getLicenceName();
    java.lang.String var72 = var70.getLicenceName();
    boolean var73 = var65.equals((java.lang.Object)var72);
    java.awt.geom.Rectangle2D var74 = org.jfree.chart.util.RectangleAnchor.createRectangle(var37, (-3.99999d), 5.0d, var65);
    var23.trim(var74);
    org.jfree.chart.axis.NumberTickUnit var77 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    java.util.List var81 = var80.getItems();
    var0.drawRangeTickBands(var20, var74, var81);
    org.jfree.data.category.CategoryDataset var85 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.CategoryItemEntity var88 = new org.jfree.chart.entity.CategoryItemEntity((java.awt.Shape)var74, "PlotOrientation.HORIZONTAL", "Combined_Domain_XYPlot", var85, (java.lang.Comparable)"null", (java.lang.Comparable)"{0}: ({1}, {2})");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-3.99999d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    int var1 = org.jfree.data.time.SerialDate.stringToMonthCode("10");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     java.awt.Paint var5 = var1.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     var1.handleClick((-398), 0, var8);
//     org.jfree.chart.plot.PlotRenderingInfo var12 = null;
//     java.awt.geom.Point2D var13 = null;
//     var1.zoomDomainAxes(Double.NaN, 0.05d, var12, var13);
//     org.jfree.chart.plot.PlotOrientation var15 = var1.getOrientation();
//     org.jfree.chart.plot.CombinedDomainXYPlot var17 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var18 = var17.getRangeMinorGridlinePaint();
//     var17.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var23 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var24 = new org.jfree.chart.plot.PlotRenderingInfo(var23);
//     var17.handleClick(10, 0, var24);
//     java.awt.geom.Rectangle2D var26 = var24.getDataArea();
//     org.jfree.chart.axis.NumberAxis3D var28 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var29 = var28.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var30 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var28);
//     org.jfree.chart.axis.NumberAxis3D var32 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var33 = var32.getAxisLineStroke();
//     boolean var34 = var32.isAutoRange();
//     org.jfree.data.Range var37 = new org.jfree.data.Range(0.0d, 0.0d);
//     double var38 = var37.getLowerBound();
//     var32.setRangeWithMargins(var37, false, false);
//     float var42 = var32.getMinorTickMarkInsideLength();
//     org.jfree.data.Range var43 = var30.getDataRange((org.jfree.chart.axis.ValueAxis)var32);
//     java.util.List var44 = var30.getSubplots();
//     org.jfree.chart.plot.CombinedDomainXYPlot var45 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var46 = var45.getRangeMinorGridlinePaint();
//     var45.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var51 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var52 = new org.jfree.chart.plot.PlotRenderingInfo(var51);
//     var45.handleClick(10, 0, var52);
//     java.awt.geom.Rectangle2D var54 = var52.getDataArea();
//     org.jfree.chart.plot.CombinedDomainXYPlot var55 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var55.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var59 = var55.getOrientation();
//     boolean var60 = var55.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var61 = var55.getQuadrantOrigin();
//     org.jfree.chart.plot.XYPlot var62 = var30.findSubplot(var52, var61);
//     var1.zoomRangeAxes((-3.99999d), var24, var61, true);
// 
//   }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var7 = var6.getTickLabelPaint();
    int var8 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var6);
    var6.setNegativeArrowVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    org.jfree.chart.renderer.xy.XYStepAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer();
    boolean var1 = var0.getShapesVisible();
    java.awt.Graphics2D var2 = null;
    org.jfree.chart.renderer.xy.XYItemRendererState var3 = null;
    org.jfree.chart.text.TextBlock var4 = new org.jfree.chart.text.TextBlock();
    org.jfree.chart.util.HorizontalAlignment var5 = var4.getLineAlignment();
    org.jfree.chart.LegendItem var7 = new org.jfree.chart.LegendItem("");
    java.lang.Object var8 = var7.clone();
    var7.setDescription("");
    boolean var11 = var4.equals((java.lang.Object)"");
    java.awt.Graphics2D var12 = null;
    org.jfree.chart.util.Size2D var13 = var4.calculateDimensions(var12);
    org.jfree.chart.plot.CombinedDomainXYPlot var16 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var16.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var20 = var16.getOrientation();
    org.jfree.chart.JFreeChart var21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var16);
    var21.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var23 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var24 = new org.jfree.chart.plot.PolarPlot();
    var24.setBackgroundAlpha(1.0f);
    var23.addChangeListener((org.jfree.data.general.DatasetChangeListener)var24);
    java.awt.Paint var28 = var24.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var31 = null;
    var24.handleClick((-398), 0, var31);
    org.jfree.chart.title.LegendTitle var33 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var24);
    var21.addLegend(var33);
    java.awt.Color var38 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var39 = var38.brighter();
    var33.setBackgroundPaint((java.awt.Paint)var38);
    org.jfree.chart.util.RectangleAnchor var41 = var33.getLegendItemGraphicLocation();
    org.jfree.chart.ui.Library var46 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var47 = var46.getLicenceName();
    java.lang.String var48 = var46.getLicenceName();
    boolean var49 = var41.equals((java.lang.Object)var48);
    java.awt.geom.Rectangle2D var50 = org.jfree.chart.util.RectangleAnchor.createRectangle(var13, (-3.99999d), 5.0d, var41);
    org.jfree.chart.axis.NumberAxis3D var52 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var53 = var52.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var54 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var52);
    org.jfree.chart.plot.CombinedDomainXYPlot var55 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var56 = var55.getRangeMinorGridlinePaint();
    boolean var57 = var55.isRangeMinorGridlinesVisible();
    var55.setDomainCrosshairVisible(false);
    org.jfree.chart.plot.PlotOrientation var60 = var55.getOrientation();
    var54.setOrientation(var60);
    org.jfree.chart.axis.ValueAxis var62 = null;
    org.jfree.chart.axis.NumberAxis3D var64 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var65 = var64.getAxisLineStroke();
    var64.resizeRange2(0.0d, 10.0d);
    java.awt.Font var69 = var64.getTickLabelFont();
    org.jfree.data.Range var70 = var64.getDefaultAutoRange();
    boolean var71 = var64.isAutoTickUnitSelection();
    java.awt.Stroke var72 = var64.getTickMarkStroke();
    org.jfree.chart.LegendItem var74 = new org.jfree.chart.LegendItem("");
    java.lang.Object var75 = var74.clone();
    org.jfree.data.xy.DefaultXYDataset var76 = new org.jfree.data.xy.DefaultXYDataset();
    var74.setDataset((org.jfree.data.general.Dataset)var76);
    org.jfree.data.xy.IntervalXYDelegate var78 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.drawItem(var2, var3, var50, (org.jfree.chart.plot.XYPlot)var54, var62, (org.jfree.chart.axis.ValueAxis)var64, (org.jfree.data.xy.XYDataset)var76, 3, 13, true, (-398));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
    boolean var2 = var0.isRangeMinorGridlinesVisible();
    org.jfree.chart.axis.AxisSpace var3 = null;
    var0.setFixedRangeAxisSpace(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.ValueAxis var6 = var0.getDomainAxisForDataset(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var7 = var6.getTickLabelPaint();
    int var8 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var6);
    org.jfree.chart.plot.DatasetRenderingOrder var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDatasetRenderingOrder(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
    var1.setBackgroundAlpha(1.0f);
    var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
    int var6 = var0.indexOf((java.lang.Comparable)'a');
    java.lang.Number var7 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var0);
    org.jfree.chart.axis.NumberTickUnit var9 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    java.util.List var13 = var12.getItems();
    org.jfree.chart.axis.NumberAxis3D var15 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var16 = var15.getAxisLineStroke();
    var15.resizeRange2(0.0d, 10.0d);
    java.awt.Font var20 = var15.getTickLabelFont();
    org.jfree.data.Range var21 = var15.getDefaultAutoRange();
    org.jfree.chart.ui.Library var26 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var27 = var26.getLicenceName();
    boolean var28 = var21.equals((java.lang.Object)var26);
    org.jfree.data.Range var30 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.xy.XYDataset)var0, var13, var21, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var33 = var0.getYValue(10, 13);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
//     boolean var2 = var0.isRangeMinorGridlinesVisible();
//     var0.setDomainCrosshairVisible(false);
//     org.jfree.chart.LegendItemCollection var5 = var0.getLegendItems();
//     org.jfree.chart.LegendItem var7 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var8 = var7.clone();
//     org.jfree.data.xy.DefaultXYDataset var9 = new org.jfree.data.xy.DefaultXYDataset();
//     var7.setDataset((org.jfree.data.general.Dataset)var9);
//     var5.add(var7);
//     org.jfree.chart.plot.CombinedDomainXYPlot var12 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var13 = var12.getRangeMinorGridlinePaint();
//     boolean var14 = var12.isRangeMinorGridlinesVisible();
//     var12.setDomainCrosshairVisible(false);
//     org.jfree.chart.LegendItemCollection var17 = var12.getLegendItems();
//     int var18 = var17.getItemCount();
//     int var19 = var17.getItemCount();
//     var5.addAll(var17);
//     
//     // Checks the contract:  equals-hashcode on var0 and var12
//     assertTrue("Contract failed: equals-hashcode on var0 and var12", var0.equals(var12) ? var0.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var0
//     assertTrue("Contract failed: equals-hashcode on var12 and var0", var12.equals(var0) ? var12.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(1.0E-8d, 1.0d);
    org.jfree.chart.text.TextAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    var4.add(10.0d, (-1.0d), true);
    var4.setKey((java.lang.Comparable)(byte)(-1));
    boolean var11 = var4.getAllowDuplicateXValues();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.delete(0, 3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.ResourceBundle var2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("4", var1);
// 
//   }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 0, var4, var5);
//     java.awt.Graphics2D var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.util.RectangleInsets var9 = var8.getSimpleLabelOffset();
//     org.jfree.chart.axis.NumberAxis3D var10 = new org.jfree.chart.axis.NumberAxis3D();
//     java.awt.Font var11 = var10.getTickLabelFont();
//     org.jfree.chart.util.RectangleInsets var12 = var10.getTickLabelInsets();
//     double var14 = var12.trimHeight(1.0E-5d);
//     double var16 = var12.calculateBottomInset(1.0E-8d);
//     org.jfree.chart.text.TextBlock var17 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var18 = var17.getLineAlignment();
//     org.jfree.chart.LegendItem var20 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var21 = var20.clone();
//     var20.setDescription("");
//     boolean var24 = var17.equals((java.lang.Object)"");
//     java.awt.Graphics2D var25 = null;
//     org.jfree.chart.util.Size2D var26 = var17.calculateDimensions(var25);
//     org.jfree.chart.plot.CombinedDomainXYPlot var29 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var29.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var33 = var29.getOrientation();
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var29);
//     var34.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var36 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var37 = new org.jfree.chart.plot.PolarPlot();
//     var37.setBackgroundAlpha(1.0f);
//     var36.addChangeListener((org.jfree.data.general.DatasetChangeListener)var37);
//     java.awt.Paint var41 = var37.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var44 = null;
//     var37.handleClick((-398), 0, var44);
//     org.jfree.chart.title.LegendTitle var46 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var37);
//     var34.addLegend(var46);
//     java.awt.Color var51 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var52 = var51.brighter();
//     var46.setBackgroundPaint((java.awt.Paint)var51);
//     org.jfree.chart.util.RectangleAnchor var54 = var46.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var59 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var60 = var59.getLicenceName();
//     java.lang.String var61 = var59.getLicenceName();
//     boolean var62 = var54.equals((java.lang.Object)var61);
//     java.awt.geom.Rectangle2D var63 = org.jfree.chart.util.RectangleAnchor.createRectangle(var26, (-3.99999d), 5.0d, var54);
//     var12.trim(var63);
//     java.awt.geom.Rectangle2D var67 = var9.createInsetRectangle(var63, true, true);
//     var0.drawBackground(var7, var63);
// 
//   }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekdayCode(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    java.awt.Image var3 = null;
    org.jfree.chart.ui.ProjectInfo var7 = new org.jfree.chart.ui.ProjectInfo("", "", "hi!", var3, "", "", "");
    org.jfree.chart.axis.NumberTickUnit var9 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    java.util.List var13 = var12.getItems();
    var7.setContributors(var13);
    var7.setLicenceName("org.jfree.chart.ChartColor[r=10,g=100,b=1]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    java.util.TimeZone var0 = null;
    org.jfree.data.time.TimeSeriesCollection var1 = new org.jfree.data.time.TimeSeriesCollection(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var1.isSelected(0, (-398));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 100.0d);
    java.awt.Paint var3 = var2.getOutlinePaint();
    org.jfree.chart.util.LengthAdjustmentType var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelOffsetType(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var6 = var5.getAxisLineStroke();
    boolean var7 = var5.isAutoRange();
    org.jfree.data.Range var10 = new org.jfree.data.Range(0.0d, 0.0d);
    double var11 = var10.getLowerBound();
    var5.setRangeWithMargins(var10, false, false);
    float var15 = var5.getMinorTickMarkInsideLength();
    org.jfree.data.Range var16 = var3.getDataRange((org.jfree.chart.axis.ValueAxis)var5);
    java.awt.Paint var17 = var3.getRangeCrosshairPaint();
    org.jfree.chart.annotations.XYAnnotation var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addAnnotation(var18, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var7 = var4.equals((java.lang.Object)"");
    var4.add((java.lang.Number)100.0d, (java.lang.Number)13, false);
    org.jfree.data.xy.XYDataItem var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.add(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.jfree.chart.LegendItem var1 = new org.jfree.chart.LegendItem("");
    java.awt.Paint var2 = var1.getLinePaint();
    boolean var3 = var1.isShapeOutlineVisible();
    java.lang.String var4 = var1.getDescription();
    org.jfree.chart.util.GradientPaintTransformer var5 = var1.getFillPaintTransformer();
    org.jfree.chart.util.GradientPaintTransformer var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setFillPaintTransformer(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var3 = var2.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var2);
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
    var9.setBackgroundAlpha(1.0f);
    boolean var12 = var8.hasListener((java.util.EventListener)var9);
    java.awt.Paint var13 = var9.getAngleLabelPaint();
    var6.setLabelPaint(var13);
    org.jfree.chart.axis.NumberTickUnit var16 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    java.lang.String var18 = var16.valueToString(0.0d);
    var6.setTickUnit(var16);
    var2.setTickUnit(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.general.PieDataset var23 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(var0, (java.lang.Comparable)var16, 0.08d, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "0"+ "'", var18.equals("0"));

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var2 = var1.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
//     var3.setGap(4.0d);
//     org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var6.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var10 = var6.getOrientation();
//     org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var6);
//     var11.setNotify(false);
//     var3.addChangeListener((org.jfree.chart.event.PlotChangeListener)var11);
//     org.jfree.chart.plot.CombinedDomainXYPlot var16 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var17 = var16.getRangeMinorGridlinePaint();
//     var16.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var22 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var23 = new org.jfree.chart.plot.PlotRenderingInfo(var22);
//     var16.handleClick(10, 0, var23);
//     java.awt.geom.Rectangle2D var25 = var23.getDataArea();
//     org.jfree.chart.axis.NumberAxis3D var27 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var28 = var27.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var29 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var27);
//     org.jfree.chart.axis.NumberAxis3D var31 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var32 = var31.getAxisLineStroke();
//     boolean var33 = var31.isAutoRange();
//     org.jfree.data.Range var36 = new org.jfree.data.Range(0.0d, 0.0d);
//     double var37 = var36.getLowerBound();
//     var31.setRangeWithMargins(var36, false, false);
//     float var41 = var31.getMinorTickMarkInsideLength();
//     org.jfree.data.Range var42 = var29.getDataRange((org.jfree.chart.axis.ValueAxis)var31);
//     java.util.List var43 = var29.getSubplots();
//     org.jfree.chart.plot.CombinedDomainXYPlot var44 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var45 = var44.getRangeMinorGridlinePaint();
//     var44.clearRangeMarkers(1);
//     org.jfree.chart.ChartRenderingInfo var50 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var51 = new org.jfree.chart.plot.PlotRenderingInfo(var50);
//     var44.handleClick(10, 0, var51);
//     java.awt.geom.Rectangle2D var53 = var51.getDataArea();
//     org.jfree.chart.plot.CombinedDomainXYPlot var54 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var54.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var58 = var54.getOrientation();
//     boolean var59 = var54.isDomainMinorGridlinesVisible();
//     java.awt.geom.Point2D var60 = var54.getQuadrantOrigin();
//     org.jfree.chart.plot.XYPlot var61 = var29.findSubplot(var51, var60);
//     var3.panDomainAxes(100.0d, var23, var60);
//     
//     // Checks the contract:  equals-hashcode on var6 and var54
//     assertTrue("Contract failed: equals-hashcode on var6 and var54", var6.equals(var54) ? var6.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var16 and var44
//     assertTrue("Contract failed: equals-hashcode on var16 and var44", var16.equals(var44) ? var16.hashCode() == var44.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var16
//     assertTrue("Contract failed: equals-hashcode on var44 and var16", var44.equals(var16) ? var44.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var54 and var6
//     assertTrue("Contract failed: equals-hashcode on var54 and var6", var54.equals(var6) ? var54.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var51
//     assertTrue("Contract failed: equals-hashcode on var23 and var51", var23.equals(var51) ? var23.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var23
//     assertTrue("Contract failed: equals-hashcode on var51 and var23", var51.equals(var23) ? var51.hashCode() == var23.hashCode() : true);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    java.awt.Font var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.text.TextFragment var2 = new org.jfree.chart.text.TextFragment("", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     java.awt.FontMetrics var2 = null;
//     java.awt.geom.Rectangle2D var3 = org.jfree.chart.text.TextUtilities.getTextBounds("10", var1, var2);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    java.awt.Paint var4 = var2.lookupSeriesPaint(10);
    java.lang.Boolean var6 = var2.getSeriesVisible(100);
    java.awt.Paint var8 = var2.lookupSeriesOutlinePaint(255);
    var2.setBaseItemLabelsVisible(false, false);
    org.jfree.chart.annotations.CategoryAnnotation var12 = null;
    org.jfree.chart.util.Layer var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addAnnotation(var12, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
    var0.setUseOutlinePaint(true);
    boolean var3 = var0.getDrawSeriesLineAsPath();
    var0.setUseOutlinePaint(false);
    java.awt.Shape var7 = var0.getLegendShape(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShapesFilled((-398), false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    boolean var0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }
// 
// 
//     java.net.URL var0 = null;
//     java.net.URLClassLoader var1 = null;
//     org.jfree.chart.util.ResourceBundleWrapper.removeCodeBase(var0, var1);
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    boolean var1 = var0.isVerticalTickLabels();
    java.util.TimeZone var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTimeZone(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    org.jfree.chart.labels.StandardPieToolTipGenerator var0 = new org.jfree.chart.labels.StandardPieToolTipGenerator();
    java.lang.String var1 = var0.getLabelFormat();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{0}: ({1}, {2})"+ "'", var1.equals("{0}: ({1}, {2})"));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var0, true);
    org.jfree.data.xy.IntervalXYDelegate var3 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var0);
    boolean var4 = var3.isAutoWidth();
    double var5 = var3.getFixedIntervalWidth();
    var3.setFixedIntervalWidth(1.0E-5d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var3.getEndXValue((-398), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    java.text.NumberFormat var1 = java.text.NumberFormat.getNumberInstance();
    org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(Double.NaN, var1, 2147483647);
    org.jfree.chart.plot.CombinedDomainXYPlot var4 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var4.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var8 = var4.getOrientation();
    org.jfree.chart.JFreeChart var9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var4);
    org.jfree.chart.util.LogFormat var14 = new org.jfree.chart.util.LogFormat(0.0d, "", "", false);
    java.lang.StringBuffer var16 = null;
    java.text.FieldPosition var17 = null;
    java.lang.StringBuffer var18 = var14.format((-1.0d), var16, var17);
    java.text.FieldPosition var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.StringBuffer var20 = var1.format((java.lang.Object)var4, var18, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test286() {}
//   public void test286() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }
// 
// 
//     org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
//     org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
//     double var5 = var4.getMinX();
//     var4.setDescription("");
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.xy.XYDataItem var9 = var4.getDataItem(0);
//       fail("Expected exception of type java.lang.IndexOutOfBoundsException");
//     } catch (java.lang.IndexOutOfBoundsException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == Double.NaN);
// 
//   }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var3 = var2.getAxisLineStroke();
//     java.awt.Font var4 = var2.getLabelFont();
//     org.jfree.data.time.DateRange var5 = new org.jfree.data.time.DateRange();
//     var2.setRangeWithMargins((org.jfree.data.Range)var5, false, true);
//     java.util.Date var9 = var5.getLowerDate();
//     org.jfree.data.time.DateRange var10 = new org.jfree.data.time.DateRange(var0, var9);
// 
//   }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var1 = var0.getRangeMinorGridlinePaint();
//     org.jfree.chart.LegendItemCollection var2 = var0.getFixedLegendItems();
//     int var3 = var0.getRangeAxisCount();
//     org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var7 = new org.jfree.chart.plot.PolarPlot();
//     var7.setBackgroundAlpha(1.0f);
//     boolean var10 = var6.hasListener((java.util.EventListener)var7);
//     java.awt.Shape var11 = var6.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var14 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var4, var11, "hi!", "hi!");
//     org.jfree.chart.title.TextTitle var16 = new org.jfree.chart.title.TextTitle("");
//     java.awt.Paint var17 = var16.getBackgroundPaint();
//     org.jfree.chart.title.TextTitle var19 = new org.jfree.chart.title.TextTitle("");
//     java.awt.Paint var20 = var19.getBackgroundPaint();
//     org.jfree.chart.axis.NumberAxis3D var22 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var23 = var22.getAxisLineStroke();
//     var22.resizeRange2(0.0d, 10.0d);
//     java.awt.Font var27 = var22.getTickLabelFont();
//     org.jfree.data.Range var28 = var22.getDefaultAutoRange();
//     boolean var29 = var22.isAutoTickUnitSelection();
//     java.awt.Paint var30 = var22.getTickLabelPaint();
//     var19.setBackgroundPaint(var30);
//     boolean var32 = var16.equals((java.lang.Object)var30);
//     org.jfree.chart.entity.TitleEntity var34 = new org.jfree.chart.entity.TitleEntity(var11, (org.jfree.chart.title.Title)var16, "AxisLabelEntity: label = null");
//     org.jfree.data.xy.DefaultXYDataset var35 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.data.Range var37 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var35, true);
//     org.jfree.data.xy.IntervalXYDelegate var38 = new org.jfree.data.xy.IntervalXYDelegate((org.jfree.data.xy.XYDataset)var35);
//     java.lang.Object var39 = var35.clone();
//     org.jfree.chart.entity.XYItemEntity var44 = new org.jfree.chart.entity.XYItemEntity(var11, (org.jfree.data.xy.XYDataset)var35, (-1), 15, "null", "");
//     var0.setDataset((org.jfree.data.xy.XYDataset)var35);
//     org.jfree.chart.plot.CombinedDomainXYPlot var46 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var46.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var50 = var46.getOrientation();
//     org.jfree.chart.plot.IntervalMarker var53 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var54 = var53.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var55 = new org.jfree.chart.plot.PolarPlot();
//     var55.setBackgroundAlpha(1.0f);
//     java.awt.Paint var58 = var55.getBackgroundPaint();
//     var53.setPaint(var58);
//     var46.setRangeMinorGridlinePaint(var58);
//     org.jfree.chart.axis.AxisSpace var61 = null;
//     var46.setFixedDomainAxisSpace(var61);
//     java.awt.Stroke var63 = var46.getRangeZeroBaselineStroke();
//     var0.setDomainZeroBaselineStroke(var63);
//     
//     // Checks the contract:  equals-hashcode on var7 and var55
//     assertTrue("Contract failed: equals-hashcode on var7 and var55", var7.equals(var55) ? var7.hashCode() == var55.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var55 and var7
//     assertTrue("Contract failed: equals-hashcode on var55 and var7", var55.equals(var7) ? var55.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var2 = var1.getTickLabelPaint();
//     org.jfree.chart.plot.CombinedRangeXYPlot var3 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var1);
//     var3.setGap(4.0d);
//     org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var6.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var10 = var6.getOrientation();
//     org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var6);
//     var11.setNotify(false);
//     var3.addChangeListener((org.jfree.chart.event.PlotChangeListener)var11);
//     org.jfree.chart.plot.CombinedDomainXYPlot var15 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var15.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var19 = var15.getOrientation();
//     org.jfree.chart.JFreeChart var20 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var15);
//     var20.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var22 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var23 = new org.jfree.chart.plot.PolarPlot();
//     var23.setBackgroundAlpha(1.0f);
//     var22.addChangeListener((org.jfree.data.general.DatasetChangeListener)var23);
//     java.awt.Paint var27 = var23.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var30 = null;
//     var23.handleClick((-398), 0, var30);
//     org.jfree.chart.title.LegendTitle var32 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var23);
//     var20.addLegend(var32);
//     java.awt.Color var37 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var38 = var37.brighter();
//     var32.setBackgroundPaint((java.awt.Paint)var37);
//     java.awt.Font var40 = var32.getItemFont();
//     var11.addSubtitle((org.jfree.chart.title.Title)var32);
//     
//     // Checks the contract:  equals-hashcode on var6 and var15
//     assertTrue("Contract failed: equals-hashcode on var6 and var15", var6.equals(var15) ? var6.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var6
//     assertTrue("Contract failed: equals-hashcode on var15 and var6", var15.equals(var6) ? var15.hashCode() == var6.hashCode() : true);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.jfree.chart.plot.RingPlot var0 = new org.jfree.chart.plot.RingPlot();
    org.jfree.chart.util.RectangleInsets var1 = var0.getSimpleLabelOffset();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D();
    java.awt.Font var3 = var2.getTickLabelFont();
    org.jfree.chart.util.RectangleInsets var4 = var2.getTickLabelInsets();
    double var6 = var4.trimHeight(1.0E-5d);
    double var8 = var4.calculateBottomInset(1.0E-8d);
    org.jfree.chart.text.TextBlock var9 = new org.jfree.chart.text.TextBlock();
    org.jfree.chart.util.HorizontalAlignment var10 = var9.getLineAlignment();
    org.jfree.chart.LegendItem var12 = new org.jfree.chart.LegendItem("");
    java.lang.Object var13 = var12.clone();
    var12.setDescription("");
    boolean var16 = var9.equals((java.lang.Object)"");
    java.awt.Graphics2D var17 = null;
    org.jfree.chart.util.Size2D var18 = var9.calculateDimensions(var17);
    org.jfree.chart.plot.CombinedDomainXYPlot var21 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var21.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var25 = var21.getOrientation();
    org.jfree.chart.JFreeChart var26 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var21);
    var26.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var28 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var29 = new org.jfree.chart.plot.PolarPlot();
    var29.setBackgroundAlpha(1.0f);
    var28.addChangeListener((org.jfree.data.general.DatasetChangeListener)var29);
    java.awt.Paint var33 = var29.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var36 = null;
    var29.handleClick((-398), 0, var36);
    org.jfree.chart.title.LegendTitle var38 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var29);
    var26.addLegend(var38);
    java.awt.Color var43 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var44 = var43.brighter();
    var38.setBackgroundPaint((java.awt.Paint)var43);
    org.jfree.chart.util.RectangleAnchor var46 = var38.getLegendItemGraphicLocation();
    org.jfree.chart.ui.Library var51 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
    java.lang.String var52 = var51.getLicenceName();
    java.lang.String var53 = var51.getLicenceName();
    boolean var54 = var46.equals((java.lang.Object)var53);
    java.awt.geom.Rectangle2D var55 = org.jfree.chart.util.RectangleAnchor.createRectangle(var18, (-3.99999d), 5.0d, var46);
    var4.trim(var55);
    java.awt.geom.Rectangle2D var59 = var1.createInsetRectangle(var55, true, true);
    double var61 = var1.trimHeight(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-3.99999d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.jfree.chart.LegendItem var1 = new org.jfree.chart.LegendItem("");
    java.lang.Object var2 = var1.clone();
    var1.setDescription("");
    java.awt.Paint var5 = var1.getLinePaint();
    var1.setToolTipText("PlotOrientation.HORIZONTAL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis3D var0 = new org.jfree.chart.axis.CategoryAxis3D();
//     var0.removeCategoryLabelToolTip((java.lang.Comparable)2147483647);
//     java.lang.Object var3 = var0.clone();
//     java.awt.Graphics2D var4 = null;
//     org.jfree.data.xy.DefaultXYDataset var5 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var6 = new org.jfree.chart.plot.PolarPlot();
//     var6.setBackgroundAlpha(1.0f);
//     var5.addChangeListener((org.jfree.data.general.DatasetChangeListener)var6);
//     java.awt.Paint var10 = var6.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var13 = null;
//     var6.handleClick((-398), 0, var13);
//     org.jfree.chart.title.LegendTitle var15 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var6);
//     org.jfree.chart.text.TextBlock var16 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var17 = var16.getLineAlignment();
//     org.jfree.chart.LegendItem var19 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var20 = var19.clone();
//     var19.setDescription("");
//     boolean var23 = var16.equals((java.lang.Object)"");
//     java.awt.Graphics2D var24 = null;
//     org.jfree.chart.util.Size2D var25 = var16.calculateDimensions(var24);
//     org.jfree.chart.plot.CombinedDomainXYPlot var28 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var28.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var32 = var28.getOrientation();
//     org.jfree.chart.JFreeChart var33 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var28);
//     var33.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var35 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var36 = new org.jfree.chart.plot.PolarPlot();
//     var36.setBackgroundAlpha(1.0f);
//     var35.addChangeListener((org.jfree.data.general.DatasetChangeListener)var36);
//     java.awt.Paint var40 = var36.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var43 = null;
//     var36.handleClick((-398), 0, var43);
//     org.jfree.chart.title.LegendTitle var45 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var36);
//     var33.addLegend(var45);
//     java.awt.Color var50 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var51 = var50.brighter();
//     var45.setBackgroundPaint((java.awt.Paint)var50);
//     org.jfree.chart.util.RectangleAnchor var53 = var45.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var58 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var59 = var58.getLicenceName();
//     java.lang.String var60 = var58.getLicenceName();
//     boolean var61 = var53.equals((java.lang.Object)var60);
//     java.awt.geom.Rectangle2D var62 = org.jfree.chart.util.RectangleAnchor.createRectangle(var25, (-3.99999d), 5.0d, var53);
//     org.jfree.chart.plot.CombinedDomainXYPlot var63 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var63.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var67 = var63.getOrientation();
//     org.jfree.chart.plot.IntervalMarker var70 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
//     java.awt.Stroke var71 = var70.getOutlineStroke();
//     org.jfree.chart.plot.PolarPlot var72 = new org.jfree.chart.plot.PolarPlot();
//     var72.setBackgroundAlpha(1.0f);
//     java.awt.Paint var75 = var72.getBackgroundPaint();
//     var70.setPaint(var75);
//     var63.setRangeMinorGridlinePaint(var75);
//     int var78 = var63.getWeight();
//     org.jfree.chart.axis.NumberAxis3D var80 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var81 = var80.getAxisLineStroke();
//     boolean var82 = var80.isAutoRange();
//     java.awt.Shape var83 = var80.getLeftArrow();
//     int var84 = var63.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var80);
//     org.jfree.chart.util.RectangleEdge var85 = var63.getRangeAxisEdge();
//     org.jfree.chart.plot.CombinedDomainXYPlot var86 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var86.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var90 = var86.getOrientation();
//     org.jfree.chart.axis.AxisSpace var91 = null;
//     var86.setFixedDomainAxisSpace(var91);
//     org.jfree.chart.axis.AxisSpace var93 = new org.jfree.chart.axis.AxisSpace();
//     var86.setFixedRangeAxisSpace(var93);
//     org.jfree.chart.axis.AxisSpace var95 = var0.reserveSpace(var4, (org.jfree.chart.plot.Plot)var6, var62, var85, var93);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var7 = var6.getTickLabelPaint();
    int var8 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var6);
    org.jfree.chart.util.Layer var9 = null;
    java.util.Collection var10 = var0.getRangeMarkers(var9);
    org.jfree.chart.annotations.XYAnnotation var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.removeAnnotation(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    as