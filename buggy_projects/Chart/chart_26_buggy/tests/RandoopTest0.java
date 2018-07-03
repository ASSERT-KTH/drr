
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Shape var0 = null;
    org.jfree.data.category.CategoryDataset var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.CategoryItemEntity var6 = new org.jfree.chart.entity.CategoryItemEntity(var0, "", "", var3, (java.lang.Comparable)0.0d, (java.lang.Comparable)1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.lang.String var0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "ThreadContext"+ "'", var0.equals("ThreadContext"));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.lang.Class var1 = null;
    java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResource("hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    org.jfree.data.time.SerialDate var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getNearestDayOfWeek(10, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.awt.Font var1 = null;
    java.awt.Paint var2 = null;
    org.jfree.chart.util.RectangleEdge var3 = null;
    org.jfree.chart.util.HorizontalAlignment var4 = null;
    org.jfree.chart.util.VerticalAlignment var5 = null;
    org.jfree.chart.util.RectangleInsets var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.title.TextTitle var7 = new org.jfree.chart.title.TextTitle("hi!", var1, var2, var3, var4, var5, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.jfree.data.general.DatasetGroup var0 = new org.jfree.data.general.DatasetGroup();

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.labels.ItemLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBasePositiveItemLabelPosition(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.data.category.CategoryDataset var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var3 = var1.findRangeBounds(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var1 = org.jfree.data.time.Month.parseMonth("");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    org.jfree.chart.util.RectangleInsets var0 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
    var1.setBaseShapesFilled(false);
    java.awt.Paint var9 = var1.getItemOutlinePaint(10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.block.BlockBorder var10 = new org.jfree.chart.block.BlockBorder(var0, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.Font var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.block.LabelBlock var2 = new org.jfree.chart.block.LabelBlock("hi!", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)true);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Graphics2D var1 = null;
    java.awt.Shape var7 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("", var1, 0.0f, 100.0f, 10.0d, 0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.contains(var0, var1);
// 
//   }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(var0);
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    org.jfree.chart.labels.ItemLabelPosition var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBasePositiveItemLabelPosition(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addYears(0, var1);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


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

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
//     var0.setBaseShapesFilled(false);
//     java.awt.Paint var7 = var0.getSeriesOutlinePaint((-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var9.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var21 = var13.getItemOutlinePaint(10, 1);
//     var9.setBaseItemLabelPaint(var21);
//     var0.setSeriesPaint(10, var21, false);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var0.", var13.equals(var0) == var0.equals(var13));
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    var0.setBaseShapesFilled(false);
    java.awt.Paint var8 = var0.getItemOutlinePaint(10, 1);
    boolean var11 = var0.getItemShapeFilled(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


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

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }
// 
// 
//     boolean var0 = org.jfree.chart.text.TextUtilities.getUseFontMetricsGetStringBounds();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == true);
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    boolean var6 = var0.equals((java.lang.Object)100.0f);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var8.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
    var12.setBaseShapesFilled(false);
    java.awt.Paint var20 = var12.getItemOutlinePaint(10, 1);
    var8.setBaseItemLabelPaint(var20);
    var0.setSeriesFillPaint(100, var20, false);
    java.awt.Paint var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesItemLabelPaint((-1), var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.awt.Shape var4 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var8 = var5.getLegendItem((-1), 100);
    var5.setBaseShapesFilled(false);
    java.awt.Paint var13 = var5.getItemOutlinePaint(10, 1);
    java.awt.Stroke var14 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var15.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var19 = var15.getBaseLinesVisible();
    boolean var21 = var15.equals((java.lang.Object)100.0f);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var23.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var30 = var27.getLegendItem((-1), 100);
    var27.setBaseShapesFilled(false);
    java.awt.Paint var35 = var27.getItemOutlinePaint(10, 1);
    var23.setBaseItemLabelPaint(var35);
    var15.setSeriesFillPaint(100, var35, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var39 = new org.jfree.chart.LegendItem("", "ThreadContext", "hi!", "", var4, var13, var14, var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Class var1 = org.jfree.data.time.RegularTimePeriod.downsize(var0);
// 
//   }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     java.lang.Comparable[] var1 = new java.lang.Comparable[] { "ThreadContext"};
//     java.lang.Comparable[] var3 = new java.lang.Comparable[] { ' '};
//     double[][] var4 = null;
//     org.jfree.data.category.CategoryDataset var5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(var1, var3, var4);
// 
//   }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 0.0f);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.awt.geom.Rectangle2D var0 = null;
    org.jfree.chart.util.RectangleEdge var1 = null;
    double var2 = org.jfree.chart.util.RectangleEdge.coordinate(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     org.jfree.chart.util.HorizontalAlignment var0 = null;
//     org.jfree.chart.util.VerticalAlignment var1 = null;
//     org.jfree.chart.block.FlowArrangement var4 = new org.jfree.chart.block.FlowArrangement(var0, var1, 100.0d, 10.0d);
//     org.jfree.chart.block.BlockContainer var5 = null;
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.block.RectangleConstraint var9 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     org.jfree.chart.util.Size2D var10 = var4.arrange(var5, var6, var9);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    org.jfree.chart.text.TextBlock var1 = null;
    org.jfree.chart.text.TextBlockAnchor var2 = null;
    org.jfree.chart.text.TextAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryTick var5 = new org.jfree.chart.axis.CategoryTick((java.lang.Comparable)1, var1, var2, var3, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Graphics2D var2 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     org.jfree.chart.util.RectangleEdge var6 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var7 = null;
//     org.jfree.chart.axis.AxisState var8 = var1.draw(var2, 50.5d, var4, var5, var6, var7);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekdayCode(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
//     java.awt.Paint var7 = var0.getBaseItemLabelPaint();
//     java.awt.Graphics2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     var0.drawDomainGridline(var8, var9, var10, 0.0d);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     java.awt.Graphics2D var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     var1.drawBackground(var4, var5);
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getOutliers(10, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     org.jfree.chart.event.PlotChangeEvent var4 = null;
//     var3.plotChanged(var4);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.DateRange var2 = new org.jfree.data.time.DateRange(100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.awt.Color var2 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var3 = null;
//     float[] var4 = var2.getRGBColorComponents(var3);
//     java.awt.color.ColorSpace var5 = null;
//     float[] var9 = new float[] { (-1.0f), 10.0f, 10.0f};
//     float[] var10 = var2.getComponents(var5, var9);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     org.jfree.data.Range var0 = null;
//     org.jfree.data.Range var2 = org.jfree.data.Range.shift(var0, 100.0d);
// 
//   }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     boolean var6 = var0.equals((java.lang.Object)100.0f);
//     java.awt.Graphics2D var7 = null;
//     org.jfree.chart.plot.CategoryPlot var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     var0.drawOutline(var7, var8, var9);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.chart.axis.AxisLocation var0 = null;
    org.jfree.chart.plot.PlotOrientation var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleEdge var2 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.data.Range var1 = null;
    org.jfree.chart.block.LengthConstraintType var2 = null;
    org.jfree.data.Range var6 = new org.jfree.data.Range(1.0d, 100.0d);
    double var7 = var6.getCentralValue();
    org.jfree.chart.block.LengthConstraintType var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.block.RectangleConstraint var9 = new org.jfree.chart.block.RectangleConstraint(10.0d, var1, var2, 50.5d, var6, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 50.5d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.labels.PieSectionLabelGenerator var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLegendLabelGenerator(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.getOutliers(100, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Graphics2D var1 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var2 = null;
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.plot.CategoryPlot var4 = null;
    org.jfree.chart.axis.CategoryAxis var5 = null;
    org.jfree.chart.axis.NumberAxis3D var7 = new org.jfree.chart.axis.NumberAxis3D("");
    var7.configure();
    java.lang.Object var9 = var7.clone();
    java.lang.Number var12 = null;
    java.util.List var18 = null;
    org.jfree.data.statistics.BoxAndWhiskerItem var19 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var12, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var18);
    boolean var20 = var7.equals((java.lang.Object)0);
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var21, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var24 = null;
    org.jfree.chart.plot.RingPlot var25 = new org.jfree.chart.plot.RingPlot(var24);
    org.jfree.chart.plot.Plot var26 = var25.getRootPlot();
    var21.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var26);
    java.lang.Number var30 = var21.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.drawItem(var1, var2, var3, var4, var5, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.data.category.CategoryDataset)var21, 10, 0, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var1.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var5 = var1.getBaseLinesVisible();
    java.lang.Boolean var7 = var1.getSeriesVisibleInLegend(10);
    java.awt.Paint var8 = var1.getBaseItemLabelPaint();
    java.awt.Color var11 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var12 = null;
    float[] var13 = var11.getRGBColorComponents(var12);
    var1.setBaseItemLabelPaint((java.awt.Paint)var11);
    java.awt.Stroke var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.CategoryMarker var16 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)0, (java.awt.Paint)var11, var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.data.general.PieDataset var2 = null;
//     org.jfree.chart.plot.RingPlot var3 = new org.jfree.chart.plot.RingPlot(var2);
//     org.jfree.chart.plot.Plot var4 = var3.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var5 = var3.getInsets();
//     var1.setParent((org.jfree.chart.plot.Plot)var3);
//     
//     // Checks the contract:  equals-hashcode on var1 and var3
//     assertTrue("Contract failed: equals-hashcode on var1 and var3", var1.equals(var3) ? var1.hashCode() == var3.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var1
//     assertTrue("Contract failed: equals-hashcode on var3 and var1", var3.equals(var1) ? var3.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Class var2 = null;
//     java.util.EventListener[] var3 = var1.getListeners(var2);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var3 = var1.getInsets();
//     org.jfree.data.general.PieDataset var4 = null;
//     org.jfree.chart.plot.RingPlot var5 = new org.jfree.chart.plot.RingPlot(var4);
//     org.jfree.chart.plot.Plot var6 = var5.getRootPlot();
//     org.jfree.chart.JFreeChart var7 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var5);
//     boolean var8 = var3.equals((java.lang.Object)var5);
//     
//     // Checks the contract:  equals-hashcode on var1 and var5
//     assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var1
//     assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var6
//     assertTrue("Contract failed: equals-hashcode on var2 and var6", var2.equals(var6) ? var2.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var2
//     assertTrue("Contract failed: equals-hashcode on var6 and var2", var6.equals(var2) ? var6.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("");
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setKey(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setKey(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     java.lang.Comparable[] var1 = new java.lang.Comparable[] { 100};
//     java.lang.Comparable[] var3 = new java.lang.Comparable[] { 100L};
//     java.lang.Number[] var4 = null;
//     java.lang.Number[][] var5 = new java.lang.Number[][] { var4};
//     java.lang.Number[] var6 = null;
//     java.lang.Number[][] var7 = new java.lang.Number[][] { var6};
//     org.jfree.data.category.DefaultIntervalCategoryDataset var8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var1, var3, var5, var7);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    org.jfree.chart.ui.Library var4 = new org.jfree.chart.ui.Library("hi!", "hi!", "hi!", "hi!");

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


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

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
    java.io.ObjectOutputStream var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("ThreadContext");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


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

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    int var1 = org.jfree.data.time.SerialDate.stringToWeekdayCode("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     java.util.Date var0 = null;
//     java.util.TimeZone var1 = null;
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(var0, var1);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    java.util.ResourceBundle.clearCache();

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits(var0);
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    org.jfree.chart.title.LegendTitle var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addLegend(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.zoomRange(50.5d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.util.RectangleInsets var3 = var1.getInsets();
    java.awt.geom.Rectangle2D var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var5 = var3.createOutsetRectangle(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var8 = var7.getLabelPaint();
    org.jfree.chart.util.RectangleEdge var9 = null;
    org.jfree.chart.util.HorizontalAlignment var10 = null;
    org.jfree.chart.util.VerticalAlignment var11 = null;
    org.jfree.data.general.PieDataset var12 = null;
    org.jfree.chart.plot.RingPlot var13 = new org.jfree.chart.plot.RingPlot(var12);
    org.jfree.chart.plot.Plot var14 = var13.getRootPlot();
    org.jfree.chart.util.RectangleInsets var15 = var13.getInsets();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.title.TextTitle var16 = new org.jfree.chart.title.TextTitle("ThreadContext", var5, var8, var9, var10, var11, var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.awt.Graphics2D var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.ChartRenderingInfo var15 = null;
//     var12.draw(var13, var14, var15);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    java.awt.Stroke var5 = var3.getBorderStroke();
    org.jfree.chart.util.RectangleInsets var6 = var3.getPadding();
    org.jfree.chart.event.ChartChangeListener var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addChangeListener(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("");
    java.beans.PropertyChangeListener var2 = null;
    var1.addPropertyChangeListener(var2);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var8 = var0.getRowKey(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var6 = var3.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot(var7);
//     org.jfree.chart.plot.Plot var9 = var8.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var10 = null;
//     var8.axisChanged(var10);
//     org.jfree.chart.JFreeChart var13 = new org.jfree.chart.JFreeChart("hi!", var6, (org.jfree.chart.plot.Plot)var8, true);
//     org.jfree.chart.plot.CategoryMarker var15 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var16 = var15.getLabelPaint();
//     org.jfree.chart.text.TextMeasurer var18 = null;
//     org.jfree.chart.text.TextBlock var19 = org.jfree.chart.text.TextUtilities.createTextBlock("ThreadContext", var6, var16, 1.0f, var18);
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.getObject(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.jfree.chart.text.TextBlock var1 = null;
    org.jfree.chart.text.TextBlockAnchor var2 = null;
    org.jfree.chart.text.TextAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryTick var5 = new org.jfree.chart.axis.CategoryTick((java.lang.Comparable)(byte)10, var1, var2, var3, 0.2d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.AxisLocation var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(var1, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    double var1 = var0.getLabelAngle();
    org.jfree.data.Range var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultAutoRange(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     java.lang.Class var0 = null;
//     boolean var1 = org.jfree.chart.util.SerialUtilities.isSerializable(var0);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.plot.DatasetRenderingOrder var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDatasetRenderingOrder(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var2 = var1.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var3 = var1.getBaseNegativeItemLabelPosition();
//     java.awt.Graphics2D var4 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.CategoryPlot var7 = null;
//     org.jfree.chart.axis.CategoryAxis var8 = null;
//     org.jfree.chart.axis.DateAxis var9 = new org.jfree.chart.axis.DateAxis();
//     double var10 = var9.getLabelAngle();
//     var9.setTickLabelsVisible(false);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var13, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var16 = null;
//     org.jfree.chart.plot.RingPlot var17 = new org.jfree.chart.plot.RingPlot(var16);
//     org.jfree.chart.plot.Plot var18 = var17.getRootPlot();
//     var13.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var18);
//     java.lang.Number var22 = var13.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
//     var1.drawItem(var4, var5, var6, var7, var8, (org.jfree.chart.axis.ValueAxis)var9, (org.jfree.data.category.CategoryDataset)var13, (-1), 1, 2);
// 
//   }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     boolean var4 = var3.getAntiAlias();
//     java.awt.Stroke var5 = var3.getBorderStroke();
//     java.awt.RenderingHints var6 = null;
//     var3.setRenderingHints(var6);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var2 = org.jfree.data.general.DatasetUtilities.findRangeBounds(var0, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     java.awt.Shape var0 = null;
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var5 = var3.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var8 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var11 = var8.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var12 = null;
//     org.jfree.chart.plot.RingPlot var13 = new org.jfree.chart.plot.RingPlot(var12);
//     org.jfree.chart.plot.Plot var14 = var13.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var15 = null;
//     var13.axisChanged(var15);
//     org.jfree.chart.JFreeChart var18 = new org.jfree.chart.JFreeChart("hi!", var11, (org.jfree.chart.plot.Plot)var13, true);
//     boolean var19 = var3.equals((java.lang.Object)var11);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.chart.entity.CategoryItemEntity var22 = new org.jfree.chart.entity.CategoryItemEntity(var0, "hi!", "Range[1.0,100.0]", (org.jfree.data.category.CategoryDataset)var3, (java.lang.Comparable)"org.jfree.chart.event.RendererChangeEvent[source=false]", (java.lang.Comparable)"ThreadContext");
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == false);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     org.jfree.data.xy.TableXYDataset var0 = null;
//     double var2 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(var0, 2);
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     org.jfree.data.general.PieDataset var9 = null;
//     org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot(var9);
//     java.awt.Paint var11 = var10.getBaseSectionPaint();
//     java.awt.Color var14 = org.jfree.chart.util.PaintUtilities.stringToColor("Range[1.0,100.0]");
//     org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var20 = var17.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var21 = null;
//     org.jfree.chart.plot.RingPlot var22 = new org.jfree.chart.plot.RingPlot(var21);
//     org.jfree.chart.plot.Plot var23 = var22.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var24 = null;
//     var22.axisChanged(var24);
//     org.jfree.chart.JFreeChart var27 = new org.jfree.chart.JFreeChart("hi!", var20, (org.jfree.chart.plot.Plot)var22, true);
//     java.lang.Object var28 = var22.clone();
//     java.awt.Stroke var29 = var22.getSeparatorStroke();
//     org.jfree.chart.axis.NumberAxis3D var32 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var33 = var32.isTickMarksVisible();
//     java.awt.Shape var34 = var32.getDownArrow();
//     org.jfree.data.general.PieDataset var35 = null;
//     org.jfree.chart.plot.RingPlot var36 = new org.jfree.chart.plot.RingPlot(var35);
//     org.jfree.chart.plot.Plot var37 = var36.getRootPlot();
//     org.jfree.chart.JFreeChart var38 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var36);
//     boolean var39 = var38.getAntiAlias();
//     java.awt.Stroke var40 = var38.getBorderStroke();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var41.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var45 = var41.getBaseLinesVisible();
//     boolean var47 = var41.equals((java.lang.Object)100.0f);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var49.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var56 = var53.getLegendItem((-1), 100);
//     var53.setBaseShapesFilled(false);
//     java.awt.Paint var61 = var53.getItemOutlinePaint(10, 1);
//     var49.setBaseItemLabelPaint(var61);
//     var41.setSeriesFillPaint(100, var61, false);
//     org.jfree.chart.LegendItem var65 = new org.jfree.chart.LegendItem("", "ThreadContext", "hi!", "", false, var7, false, var11, true, (java.awt.Paint)var14, var29, true, var34, var40, var61);
//     
//     // Checks the contract:  equals-hashcode on var10 and var22
//     assertTrue("Contract failed: equals-hashcode on var10 and var22", var10.equals(var22) ? var10.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var36
//     assertTrue("Contract failed: equals-hashcode on var10 and var36", var10.equals(var36) ? var10.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var10
//     assertTrue("Contract failed: equals-hashcode on var22 and var10", var22.equals(var10) ? var22.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var36
//     assertTrue("Contract failed: equals-hashcode on var22 and var36", var22.equals(var36) ? var22.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var10
//     assertTrue("Contract failed: equals-hashcode on var36 and var10", var36.equals(var10) ? var36.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var22
//     assertTrue("Contract failed: equals-hashcode on var36 and var22", var36.equals(var22) ? var36.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var37
//     assertTrue("Contract failed: equals-hashcode on var23 and var37", var23.equals(var37) ? var23.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var23
//     assertTrue("Contract failed: equals-hashcode on var37 and var23", var37.equals(var23) ? var37.hashCode() == var23.hashCode() : true);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.AxisLocation var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(2.0d, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var8.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var12 = var8.getBaseLinesVisible();
//     java.lang.Boolean var14 = var8.getSeriesVisibleInLegend(10);
//     java.awt.Paint var15 = var8.getBaseItemLabelPaint();
//     var0.setSeriesItemLabelPaint(0, var15, true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var8 and var0.", var8.equals(var0) == var0.equals(var8));
// 
//   }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     java.awt.Graphics2D var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     java.awt.geom.Point2D var16 = null;
//     org.jfree.chart.plot.PlotState var17 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var18 = null;
//     var7.draw(var14, var15, var16, var17, var18);
// 
//   }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     double var13 = var7.getMaximumExplodePercent();
// 
//   }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    boolean var4 = var0.getBaseCreateEntities();
    boolean var5 = var0.getAutoPopulateSeriesShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addMonths(0, var1);
// 
//   }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var20 = var18.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var23 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var26 = var23.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var27 = null;
//     org.jfree.chart.plot.RingPlot var28 = new org.jfree.chart.plot.RingPlot(var27);
//     org.jfree.chart.plot.Plot var29 = var28.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var30 = null;
//     var28.axisChanged(var30);
//     org.jfree.chart.JFreeChart var33 = new org.jfree.chart.JFreeChart("hi!", var26, (org.jfree.chart.plot.Plot)var28, true);
//     boolean var34 = var18.equals((java.lang.Object)var26);
//     var18.validateObject();
//     var17.setDataset((org.jfree.data.category.CategoryDataset)var18);
//     
//     // Checks the contract:  equals-hashcode on var12 and var18
//     assertTrue("Contract failed: equals-hashcode on var12 and var18", var12.equals(var18) ? var12.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var12
//     assertTrue("Contract failed: equals-hashcode on var18 and var12", var18.equals(var12) ? var18.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 0.25d, 0.2d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.jfree.chart.axis.TickUnitSource var0 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    int var2 = var1.getColumnCount();
    java.lang.Comparable var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var1.getValue(var3, (java.lang.Comparable)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    var1.addValue((java.lang.Number)(byte)100, (java.lang.Comparable)"", (java.lang.Comparable)10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var8 = var1.getValue(0, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.data.time.Month var1 = new org.jfree.data.time.Month(var0);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    org.jfree.chart.util.RectangleEdge var0 = null;
    boolean var1 = org.jfree.chart.util.RectangleEdge.isTopOrBottom(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var3 = org.jfree.data.time.SerialDate.createInstance(15, 0, 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var3 = var1.getColumnKey(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     boolean var4 = var3.getAntiAlias();
//     java.awt.Stroke var5 = var3.getBorderStroke();
//     org.jfree.chart.util.RectangleInsets var6 = var3.getPadding();
//     org.jfree.chart.event.TitleChangeEvent var7 = null;
//     var3.titleChanged(var7);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.getObject(15, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Color var3 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var4 = null;
    float[] var5 = var3.getRGBColorComponents(var4);
    java.awt.Color var8 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var9 = null;
    float[] var10 = var8.getRGBColorComponents(var9);
    float[] var11 = var3.getColorComponents(var9);
    var0.setBaseItemLabelPaint((java.awt.Paint)var3);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var13 = var0.getLegendItemURLGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
    java.io.ObjectOutputStream var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SimpleTimePeriod var2 = new org.jfree.data.time.SimpleTimePeriod(1L, 0L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
    java.awt.Stroke var11 = var7.getItemStroke(0, 0);
    var0.setRangeZeroBaselineStroke(var11);
    org.jfree.chart.util.Layer var13 = null;
    java.util.Collection var14 = var0.getDomainMarkers(var13);
    org.jfree.chart.axis.AxisLocation var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
//     var1.setBaseShapesFilled(false);
//     java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
//     java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
//     var0.setLabelPaint(var10);
//     double var12 = var0.getFixedAutoRange();
//     java.util.Date var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.util.RectangleEdge var15 = null;
//     double var16 = var0.dateToJava2D(var13, var14, var15);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SpreadsheetDate var1 = new org.jfree.data.time.SpreadsheetDate(0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     org.jfree.chart.util.HorizontalAlignment var0 = null;
//     org.jfree.chart.util.VerticalAlignment var1 = null;
//     org.jfree.chart.block.FlowArrangement var4 = new org.jfree.chart.block.FlowArrangement(var0, var1, 100.0d, 10.0d);
//     org.jfree.chart.block.BlockContainer var5 = null;
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.block.RectangleConstraint var9 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     org.jfree.chart.util.Size2D var10 = null;
//     org.jfree.chart.util.Size2D var11 = var9.calculateConstrainedSize(var10);
//     org.jfree.chart.util.Size2D var12 = var4.arrange(var5, var6, var9);
// 
//   }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
    java.awt.Stroke var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStroke(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.jfree.chart.util.RectangleEdge var0 = null;
    boolean var1 = org.jfree.chart.util.RectangleEdge.isLeftOrRight(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    var1.configure();
    org.jfree.chart.axis.NumberTickUnit var3 = var1.getTickUnit();
    org.jfree.data.Range var4 = var1.getRange();
    boolean var5 = var1.isTickLabelsVisible();
    var1.configure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), Double.NaN, var2);
// 
//   }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     org.jfree.data.general.PieDataset var13 = null;
//     org.jfree.chart.plot.RingPlot var14 = new org.jfree.chart.plot.RingPlot(var13);
//     org.jfree.chart.plot.Plot var15 = var14.getRootPlot();
//     org.jfree.chart.JFreeChart var16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var14);
//     boolean var17 = var16.getAntiAlias();
//     java.awt.Stroke var18 = var16.getBorderStroke();
//     org.jfree.chart.util.RectangleInsets var19 = var16.getPadding();
//     var12.setPadding(var19);
//     
//     // Checks the contract:  equals-hashcode on var7 and var14
//     assertTrue("Contract failed: equals-hashcode on var7 and var14", var7.equals(var14) ? var7.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var7
//     assertTrue("Contract failed: equals-hashcode on var14 and var7", var14.equals(var7) ? var14.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var15
//     assertTrue("Contract failed: equals-hashcode on var8 and var15", var8.equals(var15) ? var8.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var8
//     assertTrue("Contract failed: equals-hashcode on var15 and var8", var15.equals(var8) ? var15.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getNearestDayOfWeek(1, var1);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.IntervalCategoryToolTipGenerator var2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("ThreadContext", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.findRangeBounds(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    java.awt.Shape var3 = var1.getUpArrow();
    boolean var4 = var1.isAxisLineVisible();
    var1.setTickMarkOutsideLength(10.0f);
    java.awt.Paint var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAxisLinePaint(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.jfree.chart.text.TextUtilities.setUseFontMetricsGetStringBounds(true);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.ResourceBundle var2 = java.util.ResourceBundle.getBundle("ThreadContext", var1);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var3 = var1.getColumnKey(15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var2 = var1.getEndType();
//     java.awt.Stroke var5 = var1.getItemStroke(0, 0);
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = null;
//     org.jfree.chart.axis.CategoryAxis var11 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var11.setUpperMargin(0.0d);
//     org.jfree.chart.axis.DateAxis var14 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var15, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var18 = null;
//     org.jfree.chart.plot.RingPlot var19 = new org.jfree.chart.plot.RingPlot(var18);
//     org.jfree.chart.plot.Plot var20 = var19.getRootPlot();
//     var15.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var20);
//     java.lang.Number var24 = var15.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
//     org.jfree.data.general.DatasetGroup var25 = var15.getGroup();
//     var1.drawItem(var6, var7, var8, var9, var11, (org.jfree.chart.axis.ValueAxis)var14, (org.jfree.data.category.CategoryDataset)var15, 0, 15, 100);
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    java.awt.Paint var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setAggregatedItemsPaint(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.replaceRightPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    java.lang.ClassLoader var0 = org.jfree.chart.util.ObjectUtilities.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.findDomainBounds(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     double[] var2 = null;
//     double[][] var3 = new double[][] { var2};
//     org.jfree.data.category.CategoryDataset var4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset("", "Pie Plot", var3);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    double var1 = var0.getLabelAngle();
    org.jfree.chart.plot.Plot var2 = var0.getPlot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRange(4.0d, 2.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     java.lang.Object var3 = var1.clone();
//     double var4 = var1.getLabelGap();
//     org.jfree.data.general.PieDataset var5 = null;
//     org.jfree.chart.plot.RingPlot var6 = new org.jfree.chart.plot.RingPlot(var5);
//     org.jfree.chart.plot.Plot var7 = var6.getRootPlot();
//     org.jfree.chart.JFreeChart var8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var6);
//     org.jfree.chart.labels.PieSectionLabelGenerator var9 = var6.getLegendLabelGenerator();
//     var1.setLegendLabelGenerator(var9);
//     
//     // Checks the contract:  equals-hashcode on var1 and var6
//     assertTrue("Contract failed: equals-hashcode on var1 and var6", var1.equals(var6) ? var1.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var1
//     assertTrue("Contract failed: equals-hashcode on var6 and var1", var6.equals(var1) ? var6.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var7
//     assertTrue("Contract failed: equals-hashcode on var2 and var7", var2.equals(var7) ? var2.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var2
//     assertTrue("Contract failed: equals-hashcode on var7 and var2", var7.equals(var2) ? var7.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
    var1.setBaseShapesFilled(false);
    java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
    java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
    var0.setLabelPaint(var10);
    double var12 = var0.getFixedAutoRange();
    org.jfree.chart.renderer.category.StackedAreaRenderer var15 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var18 = var15.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var19 = null;
    org.jfree.chart.plot.RingPlot var20 = new org.jfree.chart.plot.RingPlot(var19);
    org.jfree.chart.plot.Plot var21 = var20.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var22 = null;
    var20.axisChanged(var22);
    org.jfree.chart.JFreeChart var25 = new org.jfree.chart.JFreeChart("hi!", var18, (org.jfree.chart.plot.Plot)var20, true);
    java.awt.Paint var26 = var20.getBackgroundPaint();
    java.awt.Paint var27 = var20.getLabelOutlinePaint();
    var0.setTickMarkPaint(var27);
    org.jfree.chart.axis.DateTickMarkPosition var29 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTickMarkPosition(var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     org.jfree.chart.renderer.category.LineRenderer3D var0 = new org.jfree.chart.renderer.category.LineRenderer3D();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.plot.CategoryPlot var2 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     var0.drawOutline(var1, var2, var3);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("");
    java.lang.Comparable var2 = var1.getKey();
    org.jfree.data.gantt.Task var3 = null;
    var1.remove(var3);
    java.lang.Object var5 = var1.clone();
    var1.setKey((java.lang.Comparable)100.0f);
    org.jfree.data.gantt.Task var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
//     var0.setAxisOffset(var4);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
//     java.awt.Stroke var11 = var7.getItemStroke(0, 0);
//     var0.setRangeZeroBaselineStroke(var11);
//     org.jfree.chart.util.Layer var13 = null;
//     java.util.Collection var14 = var0.getDomainMarkers(var13);
//     org.jfree.chart.util.RectangleInsets var15 = var0.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
//     java.awt.Stroke var21 = var17.getItemStroke(0, 0);
//     var0.setDomainZeroBaselineStroke(var21);
//     org.jfree.chart.util.RectangleEdge var24 = var0.getDomainAxisEdge(1);
//     java.awt.Graphics2D var25 = null;
//     java.awt.geom.Rectangle2D var26 = null;
//     var0.drawBackground(var25, var26);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    java.lang.String[] var0 = org.jfree.data.time.SerialDate.getMonths();
    java.lang.String[] var1 = org.jfree.data.time.SerialDate.getMonths();
    double[] var2 = null;
    double[][] var3 = new double[][] { var2};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.CategoryDataset var4 = org.jfree.data.general.DatasetUtilities.createCategoryDataset((java.lang.Comparable[])var0, (java.lang.Comparable[])var1, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
//     var1.setBaseShapesFilled(false);
//     java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
//     java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
//     var0.setLabelPaint(var10);
//     double var12 = var0.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var15 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var18 = var15.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var19 = null;
//     org.jfree.chart.plot.RingPlot var20 = new org.jfree.chart.plot.RingPlot(var19);
//     org.jfree.chart.plot.Plot var21 = var20.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var22 = null;
//     var20.axisChanged(var22);
//     org.jfree.chart.JFreeChart var25 = new org.jfree.chart.JFreeChart("hi!", var18, (org.jfree.chart.plot.Plot)var20, true);
//     java.awt.Paint var26 = var20.getBackgroundPaint();
//     java.awt.Paint var27 = var20.getLabelOutlinePaint();
//     var0.setTickMarkPaint(var27);
//     java.util.Date var29 = null;
//     java.util.Date var30 = null;
//     var0.setRange(var29, var30);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.jfree.chart.block.RectangleConstraint var2 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
    org.jfree.chart.util.Size2D var3 = null;
    org.jfree.chart.util.Size2D var4 = var2.calculateConstrainedSize(var3);
    java.lang.String var5 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Size2D[width=50.5, height=10.0]"+ "'", var5.equals("Size2D[width=50.5, height=10.0]"));

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     boolean var1 = var0.getBaseShapesFilled();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var2.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var6 = var2.getBaseLinesVisible();
//     boolean var8 = var2.equals((java.lang.Object)100.0f);
//     org.jfree.chart.event.RendererChangeEvent var9 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var8);
//     java.lang.String var10 = var9.toString();
//     var0.notifyListeners(var9);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var2.", var0.equals(var2) == var2.equals(var0));
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("");
    java.lang.Comparable var2 = var1.getKey();
    org.jfree.data.gantt.Task var3 = null;
    var1.remove(var3);
    java.lang.Object var5 = var1.clone();
    java.lang.Object var6 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow((java.lang.Comparable)0.05d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var2 = var0.getColumnKey(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.jfree.chart.axis.AxisCollection var0 = new org.jfree.chart.axis.AxisCollection();
    java.util.List var1 = var0.getAxesAtBottom();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.StandardCategoryToolTipGenerator var2 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator("Range[1.0,100.0]", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
//     var0.setBaseShapesFilled(false);
//     java.awt.Paint var7 = var0.getSeriesOutlinePaint((-1));
//     org.jfree.chart.renderer.category.StackedAreaRenderer var10 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var11 = var10.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var12 = var10.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var15 = var13.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var18 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var21 = var18.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var22 = null;
//     org.jfree.chart.plot.RingPlot var23 = new org.jfree.chart.plot.RingPlot(var22);
//     org.jfree.chart.plot.Plot var24 = var23.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var25 = null;
//     var23.axisChanged(var25);
//     org.jfree.chart.JFreeChart var28 = new org.jfree.chart.JFreeChart("hi!", var21, (org.jfree.chart.plot.Plot)var23, true);
//     boolean var29 = var13.equals((java.lang.Object)var21);
//     var13.validateObject();
//     org.jfree.data.Range var31 = var10.findRangeBounds((org.jfree.data.category.CategoryDataset)var13);
//     java.awt.Stroke var33 = var10.lookupSeriesStroke(10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSeriesOutlineStroke((-1), var33, false);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var29 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    java.awt.Stroke var5 = var3.getBorderStroke();
    org.jfree.chart.util.RectangleInsets var6 = var3.getPadding();
    double var8 = var6.calculateTopInset(4.0d);
    java.awt.geom.Rectangle2D var9 = null;
    org.jfree.chart.util.LengthAdjustmentType var10 = null;
    org.jfree.chart.util.LengthAdjustmentType var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var12 = var6.createAdjustedRectangle(var9, var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    org.jfree.chart.entity.ChartEntity var3 = new org.jfree.chart.entity.ChartEntity(var2);
    java.awt.Shape var4 = var3.getArea();
    java.lang.String var5 = var3.getShapeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "poly"+ "'", var5.equals("poly"));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeColumn((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    org.jfree.chart.resources.JFreeChartResources var0 = new org.jfree.chart.resources.JFreeChartResources();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.getObject("java.awt.Color[r=0,g=0,b=10]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var9 = null;
    var7.axisChanged(var9);
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
    var13.setBaseShapesFilled(false);
    java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
    boolean var21 = var12.equals((java.lang.Object)var13);
    var12.setTitle("ThreadContext");
    org.jfree.chart.event.ChartChangeListener var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.addChangeListener(var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


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

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.jfree.data.gantt.TaskSeries var1 = new org.jfree.data.gantt.TaskSeries("");
    java.lang.Comparable var2 = var1.getKey();
    org.jfree.data.gantt.Task var3 = null;
    var1.remove(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.gantt.Task var6 = var1.get(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addYears(15, var1);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    double var1 = var0.getLabelAngle();
    org.jfree.chart.plot.Plot var2 = var0.getPlot();
    java.util.TimeZone var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTimeZone(var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


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

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
//     var1.setBaseShapesFilled(false);
//     java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
//     java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
//     var0.setLabelPaint(var10);
//     org.jfree.chart.axis.DateTickMarkPosition var12 = var0.getTickMarkPosition();
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var20 = var17.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var21 = null;
//     org.jfree.chart.plot.RingPlot var22 = new org.jfree.chart.plot.RingPlot(var21);
//     org.jfree.chart.plot.Plot var23 = var22.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var24 = null;
//     var22.axisChanged(var24);
//     org.jfree.chart.JFreeChart var27 = new org.jfree.chart.JFreeChart("hi!", var20, (org.jfree.chart.plot.Plot)var22, true);
//     java.lang.Object var28 = var22.clone();
//     org.jfree.chart.util.HorizontalAlignment var29 = null;
//     org.jfree.chart.util.VerticalAlignment var30 = null;
//     org.jfree.chart.block.FlowArrangement var33 = new org.jfree.chart.block.FlowArrangement(var29, var30, 100.0d, 10.0d);
//     var33.clear();
//     org.jfree.chart.block.Arrangement var35 = null;
//     org.jfree.chart.title.LegendTitle var36 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var22, (org.jfree.chart.block.Arrangement)var33, var35);
//     org.jfree.chart.plot.XYPlot var37 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var39 = new org.jfree.chart.axis.NumberAxis3D("");
//     var39.configure();
//     org.jfree.chart.util.RectangleInsets var41 = var39.getLabelInsets();
//     var37.setAxisOffset(var41);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var44 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var45 = var44.getEndType();
//     java.awt.Stroke var48 = var44.getItemStroke(0, 0);
//     var37.setRangeZeroBaselineStroke(var48);
//     org.jfree.chart.util.Layer var50 = null;
//     java.util.Collection var51 = var37.getDomainMarkers(var50);
//     org.jfree.chart.util.RectangleInsets var52 = var37.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var54 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var55 = var54.getEndType();
//     java.awt.Stroke var58 = var54.getItemStroke(0, 0);
//     var37.setDomainZeroBaselineStroke(var58);
//     org.jfree.chart.util.RectangleEdge var61 = var37.getDomainAxisEdge(1);
//     var36.setLegendItemGraphicEdge(var61);
//     double var63 = var0.java2DToValue(0.0d, var14, var61);
// 
//   }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var6.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var10 = var6.getBaseLinesVisible();
//     java.lang.Boolean var12 = var6.getSeriesVisibleInLegend(10);
//     java.awt.Paint var13 = var6.getBaseItemLabelPaint();
//     org.jfree.chart.text.TextFragment var14 = new org.jfree.chart.text.TextFragment("", var5, var13);
//     java.awt.Graphics2D var15 = null;
//     org.jfree.chart.text.TextAnchor var16 = null;
//     float var17 = var14.calculateBaselineOffset(var15, var16);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    java.io.ObjectInputStream var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Point2D var1 = org.jfree.chart.util.SerialUtilities.readPoint2D(var0);
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
//     java.text.DateFormat var2 = null;
//     org.jfree.chart.axis.DateTickUnit var3 = new org.jfree.chart.axis.DateTickUnit(2, 1, var2);
//     java.util.Date var4 = null;
//     java.util.TimeZone var5 = null;
//     java.util.Date var6 = var3.addToDate(var4, var5);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    var1.addValue((java.lang.Number)(byte)100, (java.lang.Comparable)"", (java.lang.Comparable)10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var8 = var1.getValue(2, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.chart.plot.XYPlot var22 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var24 = new org.jfree.chart.axis.NumberAxis3D("");
//     var24.configure();
//     org.jfree.chart.util.RectangleInsets var26 = var24.getLabelInsets();
//     var22.setAxisOffset(var26);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var29 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var30 = var29.getEndType();
//     java.awt.Stroke var33 = var29.getItemStroke(0, 0);
//     var22.setRangeZeroBaselineStroke(var33);
//     org.jfree.chart.util.Layer var35 = null;
//     java.util.Collection var36 = var22.getDomainMarkers(var35);
//     org.jfree.chart.util.RectangleInsets var37 = var22.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var39 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var40 = var39.getEndType();
//     java.awt.Stroke var43 = var39.getItemStroke(0, 0);
//     var22.setDomainZeroBaselineStroke(var43);
//     org.jfree.chart.util.RectangleEdge var46 = var22.getDomainAxisEdge(1);
//     var21.setLegendItemGraphicEdge(var46);
//     java.awt.Graphics2D var48 = null;
//     java.awt.geom.Rectangle2D var49 = null;
//     var21.draw(var48, var49);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow((java.lang.Comparable)10L);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.LegendItemCollection var1 = new org.jfree.chart.LegendItemCollection();
    int var2 = var1.getItemCount();
    var0.setFixedLegendItems(var1);
    var0.setDomainCrosshairValue(0.25d, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var9 = null;
    var7.axisChanged(var9);
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
    java.awt.Paint var13 = var7.getBackgroundPaint();
    var7.setShadowYOffset(2.0d);
    double var16 = var7.getInnerSeparatorExtension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.2d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.lang.String var3 = var1.getCategoryLabelToolTip((java.lang.Comparable)10);
    org.jfree.chart.axis.CategoryLabelPositions var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setCategoryLabelPositions(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     org.jfree.data.xy.XYDataset var0 = null;
//     org.jfree.data.Range var1 = org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(var0);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    var0.setBaseShapesFilled(false);
    java.awt.Paint var8 = var0.getItemOutlinePaint(10, 1);
    boolean var9 = var0.getUseOutlinePaint();
    boolean var12 = var0.getItemShapeFilled(100, 10);
    var0.setSeriesShapesVisible(0, false);
    var0.setAutoPopulateSeriesStroke(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var1 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    org.jfree.chart.labels.CategoryItemLabelGenerator var4 = var0.getBaseItemLabelGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
//     var0.setAxisOffset(var4);
//     org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var8 = var7.getOutlineStroke();
//     var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
//     org.jfree.chart.renderer.xy.XYItemRenderer var10 = var0.getRenderer();
//     org.jfree.chart.axis.DateAxis var11 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
//     var12.setBaseShapesFilled(false);
//     java.awt.Paint var19 = var12.getSeriesOutlinePaint((-1));
//     java.awt.Paint var21 = var12.lookupSeriesOutlinePaint(0);
//     var11.setLabelPaint(var21);
//     boolean var23 = var11.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var25 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var26 = var25.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var25.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var30 = var28.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var33 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var36 = var33.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var37 = null;
//     org.jfree.chart.plot.RingPlot var38 = new org.jfree.chart.plot.RingPlot(var37);
//     org.jfree.chart.plot.Plot var39 = var38.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var40 = null;
//     var38.axisChanged(var40);
//     org.jfree.chart.JFreeChart var43 = new org.jfree.chart.JFreeChart("hi!", var36, (org.jfree.chart.plot.Plot)var38, true);
//     boolean var44 = var28.equals((java.lang.Object)var36);
//     var28.validateObject();
//     org.jfree.data.Range var46 = var25.findRangeBounds((org.jfree.data.category.CategoryDataset)var28);
//     org.jfree.data.general.DatasetChangeEvent var47 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var23, (org.jfree.data.general.Dataset)var28);
//     var0.datasetChanged(var47);
//     var0.setRangeCrosshairValue(90.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var44 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var46);
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    org.jfree.data.general.DatasetGroup var1 = new org.jfree.data.general.DatasetGroup("Pie Plot");

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    int var1 = org.jfree.data.time.SerialDate.monthCodeToQuarter(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4);

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     org.jfree.data.time.Month var0 = new org.jfree.data.time.Month();
//     long var1 = var0.getSerialIndex();
//     java.lang.Comparable[] var2 = new java.lang.Comparable[] { var1};
//     java.lang.Comparable[] var3 = null;
//     double[] var4 = null;
//     double[][] var5 = new double[][] { var4};
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.category.CategoryDataset var6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(var2, var3, var5);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 24180L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
// 
//   }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.intersects(var0, var1);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
//     var1.addValue((java.lang.Number)(byte)100, (java.lang.Comparable)"", (java.lang.Comparable)10.0f);
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
//     var8.configure();
//     org.jfree.chart.axis.NumberTickUnit var10 = var8.getTickUnit();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var13 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var16 = var13.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var17 = null;
//     org.jfree.chart.plot.RingPlot var18 = new org.jfree.chart.plot.RingPlot(var17);
//     org.jfree.chart.plot.Plot var19 = var18.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var20 = null;
//     var18.axisChanged(var20);
//     org.jfree.chart.JFreeChart var23 = new org.jfree.chart.JFreeChart("hi!", var16, (org.jfree.chart.plot.Plot)var18, true);
//     int var24 = var10.compareTo((java.lang.Object)var18);
//     org.jfree.data.time.Month var25 = new org.jfree.data.time.Month();
//     long var26 = var25.getSerialIndex();
//     java.util.Date var27 = var25.getEnd();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setValue((java.lang.Number)100.0f, (java.lang.Comparable)var10, (java.lang.Comparable)var25);
//       fail("Expected exception of type java.lang.ClassCastException");
//     } catch (java.lang.ClassCastException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 24180L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var2 = var1.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var3 = var1.getBaseNegativeItemLabelPosition();
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.Range var5 = var1.findRangeBounds((org.jfree.data.category.CategoryDataset)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var8 = var4.getQ1Value(4, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.jfree.data.UnknownKeyException var1 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.RendererChangeEvent[source=false]");
    org.jfree.data.UnknownKeyException var3 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.RendererChangeEvent[source=false]");
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     org.jfree.data.time.Month var0 = new org.jfree.data.time.Month();
//     long var1 = var0.getSerialIndex();
//     java.util.Date var2 = var0.getEnd();
//     java.util.TimeZone var3 = null;
//     org.jfree.data.time.Month var4 = new org.jfree.data.time.Month(var2, var3);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("java.awt.Color[r=0,g=0,b=10]");

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.block.BlockParams var0 = new org.jfree.chart.block.BlockParams();
    var0.setTranslateX(100.0d);

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, (-1.0f));
// 
//   }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var32 = var30.getInsets();
//     double var34 = var32.calculateBottomOutset(100.0d);
//     var28.setPadding(var32);
//     java.awt.geom.Rectangle2D var36 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.awt.geom.Rectangle2D var39 = var32.createInsetRectangle(var36, true, false);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == 4.0d);
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    java.lang.Object var1 = var0.clone();
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addValue(var2, (java.lang.Number)(byte)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var6 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var9 = var6.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var10 = null;
//     org.jfree.chart.plot.RingPlot var11 = new org.jfree.chart.plot.RingPlot(var10);
//     org.jfree.chart.plot.Plot var12 = var11.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var13 = null;
//     var11.axisChanged(var13);
//     org.jfree.chart.JFreeChart var16 = new org.jfree.chart.JFreeChart("hi!", var9, (org.jfree.chart.plot.Plot)var11, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var20 = var17.getLegendItem((-1), 100);
//     var17.setBaseShapesFilled(false);
//     java.awt.Paint var24 = var17.getSeriesOutlinePaint((-1));
//     boolean var25 = var16.equals((java.lang.Object)var17);
//     org.jfree.chart.title.TextTitle var26 = var16.getTitle();
//     org.jfree.chart.util.HorizontalAlignment var27 = var26.getTextAlignment();
//     var3.removeSubtitle((org.jfree.chart.title.Title)var26);
//     
//     // Checks the contract:  equals-hashcode on var1 and var11
//     assertTrue("Contract failed: equals-hashcode on var1 and var11", var1.equals(var11) ? var1.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var1
//     assertTrue("Contract failed: equals-hashcode on var11 and var1", var11.equals(var1) ? var11.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var12
//     assertTrue("Contract failed: equals-hashcode on var2 and var12", var2.equals(var12) ? var2.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var2
//     assertTrue("Contract failed: equals-hashcode on var12 and var2", var12.equals(var2) ? var12.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    int var1 = var0.getItemCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertValue((-1), (java.lang.Comparable)"org.jfree.chart.event.RendererChangeEvent[source=false]", (java.lang.Number)10L);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
//     var0.setAxisOffset(var4);
//     org.jfree.chart.plot.XYPlot var6 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
//     var8.configure();
//     org.jfree.chart.util.RectangleInsets var10 = var8.getLabelInsets();
//     var6.setAxisOffset(var10);
//     org.jfree.chart.axis.DateAxis var12 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     java.awt.Paint var22 = var13.lookupSeriesOutlinePaint(0);
//     var12.setLabelPaint(var22);
//     boolean var24 = var12.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var26 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var27 = var26.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var28 = var26.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var29 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var31 = var29.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var34 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var37 = var34.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var38 = null;
//     org.jfree.chart.plot.RingPlot var39 = new org.jfree.chart.plot.RingPlot(var38);
//     org.jfree.chart.plot.Plot var40 = var39.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var41 = null;
//     var39.axisChanged(var41);
//     org.jfree.chart.JFreeChart var44 = new org.jfree.chart.JFreeChart("hi!", var37, (org.jfree.chart.plot.Plot)var39, true);
//     boolean var45 = var29.equals((java.lang.Object)var37);
//     var29.validateObject();
//     org.jfree.data.Range var47 = var26.findRangeBounds((org.jfree.data.category.CategoryDataset)var29);
//     org.jfree.data.general.DatasetChangeEvent var48 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var24, (org.jfree.data.general.Dataset)var29);
//     var6.datasetChanged(var48);
//     var0.datasetChanged(var48);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var0
//     assertTrue("Contract failed: equals-hashcode on var6 and var0", var6.equals(var0) ? var6.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     boolean var21 = var12.equals((java.lang.Object)var13);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var24 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var27 = var24.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var28 = null;
//     org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot(var28);
//     org.jfree.chart.plot.Plot var30 = var29.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var31 = null;
//     var29.axisChanged(var31);
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("hi!", var27, (org.jfree.chart.plot.Plot)var29, true);
//     java.lang.Object var35 = var29.clone();
//     org.jfree.chart.util.HorizontalAlignment var36 = null;
//     org.jfree.chart.util.VerticalAlignment var37 = null;
//     org.jfree.chart.block.FlowArrangement var40 = new org.jfree.chart.block.FlowArrangement(var36, var37, 100.0d, 10.0d);
//     var40.clear();
//     org.jfree.chart.block.Arrangement var42 = null;
//     org.jfree.chart.title.LegendTitle var43 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var29, (org.jfree.chart.block.Arrangement)var40, var42);
//     org.jfree.data.UnknownKeyException var45 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var46 = var45.getSuppressed();
//     java.lang.Throwable[] var47 = var45.getSuppressed();
//     boolean var48 = var43.equals((java.lang.Object)var47);
//     var12.removeSubtitle((org.jfree.chart.title.Title)var43);
//     
//     // Checks the contract:  equals-hashcode on var7 and var29
//     assertTrue("Contract failed: equals-hashcode on var7 and var29", var7.equals(var29) ? var7.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var7
//     assertTrue("Contract failed: equals-hashcode on var29 and var7", var29.equals(var7) ? var29.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var30
//     assertTrue("Contract failed: equals-hashcode on var8 and var30", var8.equals(var30) ? var8.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var8
//     assertTrue("Contract failed: equals-hashcode on var30 and var8", var30.equals(var8) ? var30.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var34
//     assertTrue("Contract failed: equals-hashcode on var12 and var34", var12.equals(var34) ? var12.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var12
//     assertTrue("Contract failed: equals-hashcode on var34 and var12", var34.equals(var12) ? var34.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.text.G2TextMeasurer var1 = new org.jfree.chart.text.G2TextMeasurer(var0);
//     float var5 = var1.getStringWidth("poly", 10, 10);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    int var1 = org.jfree.data.time.SerialDate.leapYearCount(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-457));

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.chart.renderer.category.GanttRenderer var0 = new org.jfree.chart.renderer.category.GanttRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
//     var1.setBaseShapesFilled(false);
//     java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
//     org.jfree.chart.renderer.category.StackedAreaRenderer var10 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var11 = var10.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var12 = var10.getBaseNegativeItemLabelPosition();
//     var1.setBaseNegativeItemLabelPosition(var12);
//     var0.setPositiveItemLabelPositionFallback(var12);
//     java.awt.Graphics2D var15 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var16 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var17 = new org.jfree.chart.renderer.category.CategoryItemRendererState(var16);
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.plot.CategoryPlot var19 = null;
//     org.jfree.chart.axis.CategoryAxis var20 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.axis.DateAxis var21 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.data.Range var22 = var21.getDefaultAutoRange();
//     org.jfree.data.category.CategoryDataset var23 = null;
//     var0.drawItem(var15, var17, var18, var19, var20, (org.jfree.chart.axis.ValueAxis)var21, var23, (-457), 1, 1);
// 
//   }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     boolean var4 = var3.getAntiAlias();
//     org.jfree.chart.util.RectangleInsets var5 = var3.getPadding();
//     org.jfree.chart.ChartRenderingInfo var8 = null;
//     var3.handleClick(0, 2, var8);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    double var2 = var1.getInteriorGap();
    org.jfree.chart.renderer.category.StackedAreaRenderer var5 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var8 = var5.getItemLabelFont((-1), 0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var9.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var13 = var9.getBaseLinesVisible();
    java.lang.Boolean var15 = var9.getSeriesVisibleInLegend(10);
    java.awt.Paint var16 = var9.getBaseItemLabelPaint();
    org.jfree.chart.text.TextFragment var17 = new org.jfree.chart.text.TextFragment("", var8, var16);
    var1.setLabelFont(var8);
    java.awt.Graphics2D var19 = null;
    java.awt.geom.Rectangle2D var20 = null;
    org.jfree.chart.plot.PiePlot3D var21 = new org.jfree.chart.plot.PiePlot3D();
    java.lang.Integer var22 = null;
    org.jfree.chart.plot.PlotRenderingInfo var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.PiePlotState var24 = var1.initialise(var19, var20, (org.jfree.chart.plot.PiePlot)var21, var22, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    java.text.DateFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.IntervalCategoryToolTipGenerator var2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator("org.jfree.chart.event.RendererChangeEvent[source=false]", var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    java.lang.String var2 = org.jfree.data.time.SerialDate.monthCodeToString(10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Oct"+ "'", var2.equals("Oct"));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    var0.setDomainCrosshairValue(0.05d);
    java.awt.Paint var3 = var0.getDomainCrosshairPaint();
    org.jfree.data.general.PieDataset var4 = null;
    org.jfree.chart.plot.RingPlot var5 = new org.jfree.chart.plot.RingPlot(var4);
    java.awt.Paint var6 = var5.getBaseSectionPaint();
    boolean var7 = var5.isOutlineVisible();
    java.awt.Color var11 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var12 = null;
    float[] var13 = var11.getRGBColorComponents(var12);
    var5.setSectionOutlinePaint((java.lang.Comparable)"", (java.awt.Paint)var11);
    java.awt.Color var17 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var18 = null;
    float[] var19 = var17.getRGBColorComponents(var18);
    float[] var20 = var11.getRGBComponents(var18);
    var0.setOutlinePaint((java.awt.Paint)var11);
    org.jfree.chart.renderer.category.StackedAreaRenderer var24 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var27 = var24.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var28 = null;
    org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot(var28);
    org.jfree.chart.plot.Plot var30 = var29.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var31 = null;
    var29.axisChanged(var31);
    org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("hi!", var27, (org.jfree.chart.plot.Plot)var29, true);
    java.util.List var35 = var34.getSubtitles();
    java.awt.Stroke var36 = var34.getBorderStroke();
    var0.removeChangeListener((org.jfree.chart.event.PlotChangeListener)var34);
    int var38 = var0.getSeriesCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     java.awt.Paint var2 = var1.getBaseSectionPaint();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var5 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var8 = var5.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var9 = null;
//     org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot(var9);
//     org.jfree.chart.plot.Plot var11 = var10.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var12 = null;
//     var10.axisChanged(var12);
//     org.jfree.chart.JFreeChart var15 = new org.jfree.chart.JFreeChart("hi!", var8, (org.jfree.chart.plot.Plot)var10, true);
//     java.lang.Object var16 = var10.clone();
//     java.awt.Stroke var17 = var10.getSeparatorStroke();
//     org.jfree.chart.plot.XYPlot var18 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var20 = new org.jfree.chart.axis.NumberAxis3D("");
//     var20.configure();
//     org.jfree.chart.util.RectangleInsets var22 = var20.getLabelInsets();
//     var18.setAxisOffset(var22);
//     org.jfree.chart.util.RectangleInsets var24 = var18.getAxisOffset();
//     org.jfree.chart.block.LineBorder var25 = new org.jfree.chart.block.LineBorder(var2, var17, var24);
//     
//     // Checks the contract:  equals-hashcode on var1 and var10
//     assertTrue("Contract failed: equals-hashcode on var1 and var10", var1.equals(var10) ? var1.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var1
//     assertTrue("Contract failed: equals-hashcode on var10 and var1", var10.equals(var1) ? var10.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    var1.configure();
    org.jfree.chart.axis.NumberTickUnit var3 = var1.getTickUnit();
    org.jfree.data.Range var4 = var1.getRange();
    boolean var5 = var1.isTickLabelsVisible();
    var1.setTickMarksVisible(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeWithMargins(100.0d, 0.05d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    var1.configure();
    java.lang.Object var3 = var1.clone();
    org.jfree.data.RangeType var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeType(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false, false);
//     java.awt.Graphics2D var3 = null;
//     org.jfree.chart.plot.CategoryPlot var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     var2.drawDomainGridline(var3, var4, var5, (-1.0d));
// 
//   }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
    java.awt.Stroke var11 = var7.getItemStroke(0, 0);
    var0.setRangeZeroBaselineStroke(var11);
    org.jfree.chart.util.Layer var13 = null;
    java.util.Collection var14 = var0.getDomainMarkers(var13);
    org.jfree.chart.util.RectangleInsets var15 = var0.getInsets();
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
    java.awt.Stroke var21 = var17.getItemStroke(0, 0);
    var0.setDomainZeroBaselineStroke(var21);
    org.jfree.chart.util.RectangleEdge var24 = var0.getDomainAxisEdge(1);
    var0.setRangeCrosshairValue((-1.0d), false);
    org.jfree.chart.axis.AxisLocation var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(var28, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    java.lang.Comparable var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.KeyToGroupMap var1 = new org.jfree.data.KeyToGroupMap(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var6 = var5.isTickMarksVisible();
    java.awt.Shape var7 = var5.getDownArrow();
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 100.0d, 0.2d);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var11.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var15 = var11.getBaseLinesVisible();
    java.lang.Boolean var17 = var11.getSeriesVisibleInLegend(10);
    java.awt.Paint var18 = var11.getBaseItemLabelPaint();
    java.awt.Color var21 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var22 = null;
    float[] var23 = var21.getRGBColorComponents(var22);
    var11.setBaseItemLabelPaint((java.awt.Paint)var21);
    int var25 = var21.getGreen();
    java.lang.String var26 = var21.toString();
    org.jfree.chart.LegendItem var27 = new org.jfree.chart.LegendItem("hi!", "ThreadContext", "Pie Plot", "Range[1.0,100.0]", var10, (java.awt.Paint)var21);
    org.jfree.chart.util.GradientPaintTransformer var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.setFillPaintTransformer(var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "java.awt.Color[r=0,g=0,b=10]"+ "'", var26.equals("java.awt.Color[r=0,g=0,b=10]"));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    org.jfree.data.general.PieDataset var2 = null;
    org.jfree.chart.plot.RingPlot var3 = new org.jfree.chart.plot.RingPlot(var2);
    double var4 = var3.getInteriorGap();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var7 = var6.isTickMarksVisible();
    org.jfree.data.Range var10 = new org.jfree.data.Range(1.0d, 100.0d);
    var6.setRangeWithMargins(var10, false, false);
    java.text.NumberFormat var14 = var6.getNumberFormatOverride();
    org.jfree.chart.axis.NumberTickUnit var15 = var6.getTickUnit();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var19 = var16.getLegendItem(2, 0);
    double var20 = var16.getBase();
    org.jfree.chart.labels.ItemLabelPosition var23 = var16.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var27 = var24.getLegendItem((-1), 100);
    var24.setBaseShapesFilled(false);
    java.awt.Paint var32 = var24.getItemOutlinePaint(10, 1);
    var16.setErrorIndicatorPaint(var32);
    var3.setSectionPaint((java.lang.Comparable)var15, var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.removeRow((java.lang.Comparable)var15);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    java.lang.String[] var0 = org.jfree.data.time.SerialDate.getMonths();
    java.lang.Number[] var1 = null;
    java.lang.Number[][] var2 = new java.lang.Number[][] { var1};
    java.lang.Number[] var3 = null;
    java.lang.Number[][] var4 = new java.lang.Number[][] { var3};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.category.DefaultIntervalCategoryDataset var5 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var0, var2, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     java.awt.Graphics2D var29 = null;
//     java.awt.geom.Rectangle2D var30 = null;
//     var28.draw(var29, var30);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
    java.awt.Stroke var11 = var7.getItemStroke(0, 0);
    var0.setRangeZeroBaselineStroke(var11);
    org.jfree.data.general.DatasetGroup var13 = var0.getDatasetGroup();
    org.jfree.chart.plot.CategoryMarker var16 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var17 = var16.getLabelPaint();
    java.lang.Comparable var18 = var16.getKey();
    java.lang.String var19 = var16.getLabel();
    var16.setDrawAsLine(true);
    org.jfree.chart.util.Layer var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(1, (org.jfree.chart.plot.Marker)var16, var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + true+ "'", var18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    org.jfree.chart.util.RectangleInsets var5 = var3.getPadding();
    org.jfree.chart.renderer.category.StackedAreaRenderer var9 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var12 = var9.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var13 = null;
    org.jfree.chart.plot.RingPlot var14 = new org.jfree.chart.plot.RingPlot(var13);
    org.jfree.chart.plot.Plot var15 = var14.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var16 = null;
    var14.axisChanged(var16);
    org.jfree.chart.JFreeChart var19 = new org.jfree.chart.JFreeChart("hi!", var12, (org.jfree.chart.plot.Plot)var14, true);
    java.lang.Object var20 = var14.clone();
    org.jfree.chart.util.HorizontalAlignment var21 = null;
    org.jfree.chart.util.VerticalAlignment var22 = null;
    org.jfree.chart.block.FlowArrangement var25 = new org.jfree.chart.block.FlowArrangement(var21, var22, 100.0d, 10.0d);
    var25.clear();
    org.jfree.chart.block.Arrangement var27 = null;
    org.jfree.chart.title.LegendTitle var28 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var14, (org.jfree.chart.block.Arrangement)var25, var27);
    org.jfree.chart.util.RectangleInsets var29 = var28.getLegendItemGraphicPadding();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addSubtitle((-457), (org.jfree.chart.title.Title)var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     boolean var4 = var3.getAntiAlias();
//     var3.setAntiAlias(true);
//     org.jfree.chart.event.ChartProgressListener var7 = null;
//     var3.addProgressListener(var7);
//     org.jfree.chart.axis.DateAxis var9 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var13 = var10.getLegendItem((-1), 100);
//     var10.setBaseShapesFilled(false);
//     java.awt.Paint var17 = var10.getSeriesOutlinePaint((-1));
//     java.awt.Paint var19 = var10.lookupSeriesOutlinePaint(0);
//     var9.setLabelPaint(var19);
//     double var21 = var9.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var24 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var27 = var24.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var28 = null;
//     org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot(var28);
//     org.jfree.chart.plot.Plot var30 = var29.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var31 = null;
//     var29.axisChanged(var31);
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("hi!", var27, (org.jfree.chart.plot.Plot)var29, true);
//     java.awt.Paint var35 = var29.getBackgroundPaint();
//     java.awt.Paint var36 = var29.getLabelOutlinePaint();
//     var9.setTickMarkPaint(var36);
//     var3.setBorderPaint(var36);
//     
//     // Checks the contract:  equals-hashcode on var1 and var29
//     assertTrue("Contract failed: equals-hashcode on var1 and var29", var1.equals(var29) ? var1.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var1
//     assertTrue("Contract failed: equals-hashcode on var29 and var1", var29.equals(var1) ? var29.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var30
//     assertTrue("Contract failed: equals-hashcode on var2 and var30", var2.equals(var30) ? var2.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var2
//     assertTrue("Contract failed: equals-hashcode on var30 and var2", var30.equals(var2) ? var30.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.DateTickUnit var2 = new org.jfree.chart.axis.DateTickUnit((-1), 4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     java.lang.Object var3 = var1.clone();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var6 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var9 = var6.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var10 = null;
//     org.jfree.chart.plot.RingPlot var11 = new org.jfree.chart.plot.RingPlot(var10);
//     org.jfree.chart.plot.Plot var12 = var11.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var13 = null;
//     var11.axisChanged(var13);
//     org.jfree.chart.JFreeChart var16 = new org.jfree.chart.JFreeChart("hi!", var9, (org.jfree.chart.plot.Plot)var11, true);
//     java.lang.Object var17 = var11.clone();
//     org.jfree.chart.util.HorizontalAlignment var18 = null;
//     org.jfree.chart.util.VerticalAlignment var19 = null;
//     org.jfree.chart.block.FlowArrangement var22 = new org.jfree.chart.block.FlowArrangement(var18, var19, 100.0d, 10.0d);
//     var22.clear();
//     org.jfree.chart.block.Arrangement var24 = null;
//     org.jfree.chart.title.LegendTitle var25 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var11, (org.jfree.chart.block.Arrangement)var22, var24);
//     org.jfree.data.UnknownKeyException var27 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var28 = var27.getSuppressed();
//     java.lang.Throwable[] var29 = var27.getSuppressed();
//     boolean var30 = var25.equals((java.lang.Object)var29);
//     org.jfree.chart.util.RectangleInsets var31 = var25.getItemLabelPadding();
//     java.awt.Graphics2D var32 = null;
//     org.jfree.chart.block.RectangleConstraint var35 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     double var36 = var35.getWidth();
//     org.jfree.chart.util.Size2D var37 = var25.arrange(var32, var35);
//     boolean var38 = var1.equals((java.lang.Object)var25);
//     
//     // Checks the contract:  equals-hashcode on var1 and var11
//     assertTrue("Contract failed: equals-hashcode on var1 and var11", var1.equals(var11) ? var1.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var1
//     assertTrue("Contract failed: equals-hashcode on var11 and var1", var11.equals(var1) ? var11.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var12
//     assertTrue("Contract failed: equals-hashcode on var2 and var12", var2.equals(var12) ? var2.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var2
//     assertTrue("Contract failed: equals-hashcode on var12 and var2", var12.equals(var2) ? var12.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var17
//     assertTrue("Contract failed: equals-hashcode on var3 and var17", var3.equals(var17) ? var3.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var3
//     assertTrue("Contract failed: equals-hashcode on var17 and var3", var17.equals(var3) ? var17.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Color var3 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var4 = null;
//     float[] var5 = var3.getRGBColorComponents(var4);
//     java.awt.Color var8 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var9 = null;
//     float[] var10 = var8.getRGBColorComponents(var9);
//     float[] var11 = var3.getColorComponents(var9);
//     var0.setBaseItemLabelPaint((java.awt.Paint)var3);
//     java.awt.Paint[] var13 = new java.awt.Paint[] { var3};
//     org.jfree.chart.axis.CategoryAxis var14 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.axis.NumberAxis3D var21 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var22 = var21.isTickMarksVisible();
//     java.awt.Shape var23 = var21.getDownArrow();
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 100.0d, 0.2d);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var27.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var31 = var27.getBaseLinesVisible();
//     java.lang.Boolean var33 = var27.getSeriesVisibleInLegend(10);
//     java.awt.Paint var34 = var27.getBaseItemLabelPaint();
//     java.awt.Color var37 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var38 = null;
//     float[] var39 = var37.getRGBColorComponents(var38);
//     var27.setBaseItemLabelPaint((java.awt.Paint)var37);
//     int var41 = var37.getGreen();
//     java.lang.String var42 = var37.toString();
//     org.jfree.chart.LegendItem var43 = new org.jfree.chart.LegendItem("hi!", "ThreadContext", "Pie Plot", "Range[1.0,100.0]", var26, (java.awt.Paint)var37);
//     var14.setTickLabelPaint((java.lang.Comparable)10.0d, (java.awt.Paint)var37);
//     java.awt.Paint[] var45 = new java.awt.Paint[] { var37};
//     org.jfree.data.general.PieDataset var46 = null;
//     org.jfree.chart.plot.RingPlot var47 = new org.jfree.chart.plot.RingPlot(var46);
//     org.jfree.chart.plot.Plot var48 = var47.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var49 = var47.getInsets();
//     java.awt.Stroke var50 = var47.getLabelOutlineStroke();
//     java.awt.Stroke[] var51 = new java.awt.Stroke[] { var50};
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var52.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var56 = var52.getBaseLinesVisible();
//     java.lang.Boolean var58 = var52.getSeriesVisibleInLegend(10);
//     var52.setBaseSeriesVisibleInLegend(false);
//     org.jfree.data.general.PieDataset var62 = null;
//     org.jfree.chart.plot.RingPlot var63 = new org.jfree.chart.plot.RingPlot(var62);
//     org.jfree.chart.plot.Plot var64 = var63.getRootPlot();
//     org.jfree.chart.JFreeChart var65 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var63);
//     boolean var66 = var65.getAntiAlias();
//     java.awt.Stroke var67 = var65.getBorderStroke();
//     var52.setSeriesOutlineStroke(15, var67, true);
//     java.awt.Stroke[] var70 = new java.awt.Stroke[] { var67};
//     org.jfree.chart.axis.NumberAxis3D var72 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var73 = var72.isTickMarksVisible();
//     java.awt.Shape var74 = var72.getDownArrow();
//     java.awt.Shape[] var75 = new java.awt.Shape[] { var74};
//     org.jfree.chart.plot.DefaultDrawingSupplier var76 = new org.jfree.chart.plot.DefaultDrawingSupplier(var13, var45, var51, var70, var75);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var27.", var0.equals(var27) == var27.equals(var0));
//     
//     // Checks the contract:  equals-hashcode on var47 and var63
//     assertTrue("Contract failed: equals-hashcode on var47 and var63", var47.equals(var63) ? var47.hashCode() == var63.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var63 and var47
//     assertTrue("Contract failed: equals-hashcode on var63 and var47", var63.equals(var47) ? var63.hashCode() == var47.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var48 and var64
//     assertTrue("Contract failed: equals-hashcode on var48 and var64", var48.equals(var64) ? var48.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var48
//     assertTrue("Contract failed: equals-hashcode on var64 and var48", var64.equals(var48) ? var64.hashCode() == var48.hashCode() : true);
// 
//   }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    var0.configureRangeAxes();
    java.awt.Image var2 = var0.getBackgroundImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    org.jfree.data.xy.XYDataset var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var1 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     org.jfree.data.time.Year var0 = new org.jfree.data.time.Year();
//     java.util.Calendar var1 = null;
//     long var2 = var0.getLastMillisecond(var1);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekdayCode(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    java.awt.Stroke var5 = var3.getBorderStroke();
    org.jfree.chart.title.Title var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.addSubtitle(100, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var2 = var1.isTickMarksVisible();
    org.jfree.data.Range var5 = new org.jfree.data.Range(1.0d, 100.0d);
    var1.setRangeWithMargins(var5, false, false);
    java.text.NumberFormat var9 = var1.getNumberFormatOverride();
    org.jfree.chart.axis.NumberTickUnit var10 = var1.getTickUnit();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAutoRangeMinimumSize(0.0d, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     java.lang.Number[] var0 = null;
//     java.lang.Number[][] var1 = new java.lang.Number[][] { var0};
//     java.lang.Number[] var2 = null;
//     java.lang.Number[][] var3 = new java.lang.Number[][] { var2};
//     org.jfree.data.category.DefaultIntervalCategoryDataset var4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(var1, var3);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    boolean var1 = org.jfree.data.time.SerialDate.isValidWeekInMonthCode((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     org.jfree.chart.block.CenterArrangement var0 = new org.jfree.chart.block.CenterArrangement();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, Double.NaN, Double.NaN);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var15 = var13.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var18 = new org.jfree.chart.entity.CategoryItemEntity(var3, "hi!", "", (org.jfree.data.category.CategoryDataset)var13, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var22 = var19.getLegendItem((-1), 100);
//     var19.setBaseShapesFilled(false);
//     java.awt.Paint var26 = var19.getSeriesOutlinePaint((-1));
//     java.awt.Paint var28 = var19.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var29 = new org.jfree.chart.title.LegendGraphic(var3, var28);
//     org.jfree.data.Range var32 = new org.jfree.data.Range(1.0d, 100.0d);
//     var0.add((org.jfree.chart.block.Block)var29, (java.lang.Object)var32);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, Double.NaN, Double.NaN);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var36, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var46 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var48 = var46.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var51 = new org.jfree.chart.entity.CategoryItemEntity(var36, "hi!", "", (org.jfree.data.category.CategoryDataset)var46, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var55 = var52.getLegendItem((-1), 100);
//     var52.setBaseShapesFilled(false);
//     java.awt.Paint var59 = var52.getSeriesOutlinePaint((-1));
//     java.awt.Paint var61 = var52.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var62 = new org.jfree.chart.title.LegendGraphic(var36, var61);
//     org.jfree.data.general.PieDataset var63 = null;
//     org.jfree.chart.plot.RingPlot var64 = new org.jfree.chart.plot.RingPlot(var63);
//     org.jfree.chart.plot.Plot var65 = var64.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var66 = var64.getInsets();
//     double var68 = var66.calculateBottomOutset(100.0d);
//     var62.setPadding(var66);
//     org.jfree.chart.util.RectangleAnchor var70 = var62.getShapeLocation();
//     var29.setShapeLocation(var70);
//     
//     // Checks the contract:  equals-hashcode on var13 and var46
//     assertTrue("Contract failed: equals-hashcode on var13 and var46", var13.equals(var46) ? var13.hashCode() == var46.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var13
//     assertTrue("Contract failed: equals-hashcode on var46 and var13", var46.equals(var13) ? var46.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     org.jfree.data.time.Month var0 = new org.jfree.data.time.Month();
//     long var1 = var0.getSerialIndex();
//     java.util.Date var2 = var0.getEnd();
//     org.jfree.data.time.Month var3 = new org.jfree.data.time.Month();
//     long var4 = var3.getSerialIndex();
//     java.util.Date var5 = var3.getEnd();
//     org.jfree.data.time.SimpleTimePeriod var6 = new org.jfree.data.time.SimpleTimePeriod(var2, var5);
//     java.util.TimeZone var7 = null;
//     org.jfree.data.time.Month var8 = new org.jfree.data.time.Month(var5, var7);
// 
//   }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }
// 
// 
//     org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var2 = var1.getLabelPaint();
//     java.lang.Comparable var3 = var1.getKey();
//     java.lang.String var4 = var1.getLabel();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var10 = var7.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var11 = null;
//     org.jfree.chart.plot.RingPlot var12 = new org.jfree.chart.plot.RingPlot(var11);
//     org.jfree.chart.plot.Plot var13 = var12.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var14 = null;
//     var12.axisChanged(var14);
//     org.jfree.chart.JFreeChart var17 = new org.jfree.chart.JFreeChart("hi!", var10, (org.jfree.chart.plot.Plot)var12, true);
//     var1.removeChangeListener((org.jfree.chart.event.MarkerChangeListener)var12);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, Double.NaN, Double.NaN);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var31 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var33 = var31.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var36 = new org.jfree.chart.entity.CategoryItemEntity(var21, "hi!", "", (org.jfree.data.category.CategoryDataset)var31, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var40 = var37.getLegendItem((-1), 100);
//     var37.setBaseShapesFilled(false);
//     java.awt.Paint var44 = var37.getSeriesOutlinePaint((-1));
//     java.awt.Paint var46 = var37.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var47 = new org.jfree.chart.title.LegendGraphic(var21, var46);
//     org.jfree.data.general.PieDataset var48 = null;
//     org.jfree.chart.plot.RingPlot var49 = new org.jfree.chart.plot.RingPlot(var48);
//     org.jfree.chart.plot.Plot var50 = var49.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var51 = var49.getInsets();
//     double var53 = var51.calculateBottomOutset(100.0d);
//     var47.setPadding(var51);
//     var12.setInsets(var51, false);
//     
//     // Checks the contract:  equals-hashcode on var12 and var49
//     assertTrue("Contract failed: equals-hashcode on var12 and var49", var12.equals(var49) ? var12.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var12
//     assertTrue("Contract failed: equals-hashcode on var49 and var12", var49.equals(var12) ? var49.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var50
//     assertTrue("Contract failed: equals-hashcode on var13 and var50", var13.equals(var50) ? var13.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var13
//     assertTrue("Contract failed: equals-hashcode on var50 and var13", var50.equals(var13) ? var50.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.data.UnknownKeyException var23 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var24 = var23.getSuppressed();
//     java.lang.Throwable[] var25 = var23.getSuppressed();
//     boolean var26 = var21.equals((java.lang.Object)var25);
//     org.jfree.chart.util.RectangleInsets var27 = var21.getItemLabelPadding();
//     java.awt.Graphics2D var28 = null;
//     org.jfree.chart.block.RectangleConstraint var31 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     double var32 = var31.getWidth();
//     org.jfree.chart.util.Size2D var33 = var21.arrange(var28, var31);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var36 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var39 = var36.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var40 = null;
//     org.jfree.chart.plot.RingPlot var41 = new org.jfree.chart.plot.RingPlot(var40);
//     org.jfree.chart.plot.Plot var42 = var41.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var43 = null;
//     var41.axisChanged(var43);
//     org.jfree.chart.JFreeChart var46 = new org.jfree.chart.JFreeChart("hi!", var39, (org.jfree.chart.plot.Plot)var41, true);
//     java.lang.Object var47 = var41.clone();
//     org.jfree.chart.util.HorizontalAlignment var48 = null;
//     org.jfree.chart.util.VerticalAlignment var49 = null;
//     org.jfree.chart.block.FlowArrangement var52 = new org.jfree.chart.block.FlowArrangement(var48, var49, 100.0d, 10.0d);
//     var52.clear();
//     org.jfree.chart.block.Arrangement var54 = null;
//     org.jfree.chart.title.LegendTitle var55 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var41, (org.jfree.chart.block.Arrangement)var52, var54);
//     org.jfree.chart.plot.XYPlot var56 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var58 = new org.jfree.chart.axis.NumberAxis3D("");
//     var58.configure();
//     org.jfree.chart.util.RectangleInsets var60 = var58.getLabelInsets();
//     var56.setAxisOffset(var60);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var63 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var64 = var63.getEndType();
//     java.awt.Stroke var67 = var63.getItemStroke(0, 0);
//     var56.setRangeZeroBaselineStroke(var67);
//     org.jfree.chart.util.Layer var69 = null;
//     java.util.Collection var70 = var56.getDomainMarkers(var69);
//     org.jfree.chart.util.RectangleInsets var71 = var56.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var73 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var74 = var73.getEndType();
//     java.awt.Stroke var77 = var73.getItemStroke(0, 0);
//     var56.setDomainZeroBaselineStroke(var77);
//     org.jfree.chart.util.RectangleEdge var80 = var56.getDomainAxisEdge(1);
//     var55.setLegendItemGraphicEdge(var80);
//     var21.setPosition(var80);
//     
//     // Checks the contract:  equals-hashcode on var7 and var41
//     assertTrue("Contract failed: equals-hashcode on var7 and var41", var7.equals(var41) ? var7.hashCode() == var41.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var41 and var7
//     assertTrue("Contract failed: equals-hashcode on var41 and var7", var41.equals(var7) ? var41.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var42
//     assertTrue("Contract failed: equals-hashcode on var8 and var42", var8.equals(var42) ? var8.hashCode() == var42.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var8
//     assertTrue("Contract failed: equals-hashcode on var42 and var8", var42.equals(var8) ? var42.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var46
//     assertTrue("Contract failed: equals-hashcode on var12 and var46", var12.equals(var46) ? var12.hashCode() == var46.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var12
//     assertTrue("Contract failed: equals-hashcode on var46 and var12", var46.equals(var12) ? var46.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var47
//     assertTrue("Contract failed: equals-hashcode on var13 and var47", var13.equals(var47) ? var13.hashCode() == var47.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var47 and var13
//     assertTrue("Contract failed: equals-hashcode on var47 and var13", var47.equals(var13) ? var47.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var52
//     assertTrue("Contract failed: equals-hashcode on var18 and var52", var18.equals(var52) ? var18.hashCode() == var52.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var18
//     assertTrue("Contract failed: equals-hashcode on var52 and var18", var52.equals(var18) ? var52.hashCode() == var18.hashCode() : true);
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     org.jfree.chart.plot.XYPlot var5 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var7 = new org.jfree.chart.axis.NumberAxis3D("");
//     var7.configure();
//     org.jfree.chart.util.RectangleInsets var9 = var7.getLabelInsets();
//     var5.setAxisOffset(var9);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var12 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var13 = var12.getEndType();
//     java.awt.Stroke var16 = var12.getItemStroke(0, 0);
//     var5.setRangeZeroBaselineStroke(var16);
//     org.jfree.chart.util.Layer var18 = null;
//     java.util.Collection var19 = var5.getDomainMarkers(var18);
//     org.jfree.chart.util.RectangleInsets var20 = var5.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var22 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var23 = var22.getEndType();
//     java.awt.Stroke var26 = var22.getItemStroke(0, 0);
//     var5.setDomainZeroBaselineStroke(var26);
//     org.jfree.chart.util.RectangleEdge var29 = var5.getDomainAxisEdge(1);
//     org.jfree.chart.plot.PlotRenderingInfo var30 = null;
//     org.jfree.chart.axis.AxisState var31 = var0.draw(var1, 4.0d, var3, var4, var29, var30);
// 
//   }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var3 = var0.getLegendItem(2, 0);
//     double var4 = var0.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var7 = var0.getPositiveItemLabelPosition(2, (-1));
//     double var8 = var0.getMaximumBarWidth();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var12 = var9.getLegendItem(2, 0);
//     double var13 = var9.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var16 = var9.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var20 = var17.getLegendItem((-1), 100);
//     var17.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var17.getItemOutlinePaint(10, 1);
//     var9.setErrorIndicatorPaint(var25);
//     var0.setBaseOutlinePaint(var25);
//     
//     // Checks the contract:  equals-hashcode on var7 and var16
//     assertTrue("Contract failed: equals-hashcode on var7 and var16", var7.equals(var16) ? var7.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var16 and var7
//     assertTrue("Contract failed: equals-hashcode on var16 and var7", var16.equals(var7) ? var16.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.data.UnknownKeyException var23 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var24 = var23.getSuppressed();
//     java.lang.Throwable[] var25 = var23.getSuppressed();
//     boolean var26 = var21.equals((java.lang.Object)var25);
//     org.jfree.data.general.PieDataset var27 = null;
//     org.jfree.chart.plot.RingPlot var28 = new org.jfree.chart.plot.RingPlot(var27);
//     org.jfree.chart.plot.Plot var29 = var28.getRootPlot();
//     org.jfree.chart.JFreeChart var30 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var28);
//     org.jfree.chart.plot.CategoryMarker var32 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var33 = var32.getOutlineStroke();
//     var30.setBorderStroke(var33);
//     var21.addChangeListener((org.jfree.chart.event.TitleChangeListener)var30);
//     
//     // Checks the contract:  equals-hashcode on var7 and var28
//     assertTrue("Contract failed: equals-hashcode on var7 and var28", var7.equals(var28) ? var7.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var7
//     assertTrue("Contract failed: equals-hashcode on var28 and var7", var28.equals(var7) ? var28.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var29
//     assertTrue("Contract failed: equals-hashcode on var8 and var29", var8.equals(var29) ? var8.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var8
//     assertTrue("Contract failed: equals-hashcode on var29 and var8", var29.equals(var8) ? var29.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
    var0.setBaseSeriesVisibleInLegend(false);
    org.jfree.data.general.PieDataset var10 = null;
    org.jfree.chart.plot.RingPlot var11 = new org.jfree.chart.plot.RingPlot(var10);
    org.jfree.chart.plot.Plot var12 = var11.getRootPlot();
    org.jfree.chart.JFreeChart var13 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var11);
    boolean var14 = var13.getAntiAlias();
    java.awt.Stroke var15 = var13.getBorderStroke();
    var0.setSeriesOutlineStroke(15, var15, true);
    var0.setUseFillPaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var3 = null;
//     org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
//     org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
//     var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
//     org.jfree.data.KeyToGroupMap var15 = new org.jfree.data.KeyToGroupMap();
//     java.util.List var16 = var15.getGroups();
//     org.jfree.data.statistics.BoxAndWhiskerItem var17 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var16);
//     var0.add(var17, (java.lang.Comparable)0.0f, (java.lang.Comparable)"hi!");
//     int var22 = var0.getRowIndex((java.lang.Comparable)(short)10);
//     org.jfree.data.KeyToGroupMap var23 = new org.jfree.data.KeyToGroupMap();
//     java.util.List var24 = var23.getGroups();
//     java.util.List var25 = var23.getGroups();
//     org.jfree.data.Range var26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds((org.jfree.data.category.CategoryDataset)var0, var23);
//     
//     // Checks the contract:  equals-hashcode on var15 and var23
//     assertTrue("Contract failed: equals-hashcode on var15 and var23", var15.equals(var23) ? var15.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var15
//     assertTrue("Contract failed: equals-hashcode on var23 and var15", var23.equals(var15) ? var23.hashCode() == var15.hashCode() : true);
// 
//   }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    java.util.TimeZone var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    java.awt.geom.Line2D var0 = null;
    java.awt.geom.Line2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     var1.configure();
//     org.jfree.chart.axis.NumberTickUnit var3 = var1.getTickUnit();
//     java.awt.Graphics2D var4 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     java.awt.geom.Rectangle2D var7 = null;
//     org.jfree.chart.plot.XYPlot var8 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var10 = new org.jfree.chart.axis.NumberAxis3D("");
//     var10.configure();
//     org.jfree.chart.util.RectangleInsets var12 = var10.getLabelInsets();
//     var8.setAxisOffset(var12);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var15 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var16 = var15.getEndType();
//     java.awt.Stroke var19 = var15.getItemStroke(0, 0);
//     var8.setRangeZeroBaselineStroke(var19);
//     org.jfree.chart.util.Layer var21 = null;
//     java.util.Collection var22 = var8.getDomainMarkers(var21);
//     org.jfree.chart.util.RectangleInsets var23 = var8.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var25 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var26 = var25.getEndType();
//     java.awt.Stroke var29 = var25.getItemStroke(0, 0);
//     var8.setDomainZeroBaselineStroke(var29);
//     org.jfree.chart.util.RectangleEdge var32 = var8.getDomainAxisEdge(1);
//     org.jfree.chart.plot.PlotRenderingInfo var33 = null;
//     org.jfree.chart.axis.AxisState var34 = var1.draw(var4, 90.0d, var6, var7, var32, var33);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.jfree.chart.labels.ItemLabelAnchor var0 = null;
    org.jfree.chart.renderer.category.StatisticalBarRenderer var1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var2.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var6 = var2.getBaseLinesVisible();
    java.lang.Boolean var8 = var2.getSeriesVisibleInLegend(10);
    java.awt.Paint var9 = var2.getBaseItemLabelPaint();
    java.awt.Color var12 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var13 = null;
    float[] var14 = var12.getRGBColorComponents(var13);
    var2.setBaseItemLabelPaint((java.awt.Paint)var12);
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var19 = var17.getBaseNegativeItemLabelPosition();
    var2.setBasePositiveItemLabelPosition(var19, true);
    var1.setPositiveItemLabelPositionFallback(var19);
    org.jfree.chart.text.TextAnchor var23 = var19.getRotationAnchor();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var25.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var29 = var25.getBaseLinesVisible();
    java.lang.Boolean var31 = var25.getSeriesVisibleInLegend(10);
    java.awt.Paint var32 = var25.getBaseItemLabelPaint();
    java.awt.Color var35 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var36 = null;
    float[] var37 = var35.getRGBColorComponents(var36);
    var25.setBaseItemLabelPaint((java.awt.Paint)var35);
    org.jfree.chart.renderer.category.StackedAreaRenderer var40 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var41 = var40.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var42 = var40.getBaseNegativeItemLabelPosition();
    var25.setBasePositiveItemLabelPosition(var42, true);
    var24.setPositiveItemLabelPositionFallback(var42);
    org.jfree.chart.text.TextAnchor var46 = var42.getRotationAnchor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.ItemLabelPosition var48 = new org.jfree.chart.labels.ItemLabelPosition(var0, var23, var46, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 0.2d, var2);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var9 = null;
    var7.axisChanged(var9);
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
    java.lang.Object var13 = var7.clone();
    org.jfree.chart.util.HorizontalAlignment var14 = null;
    org.jfree.chart.util.VerticalAlignment var15 = null;
    org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
    var18.clear();
    org.jfree.chart.block.Arrangement var20 = null;
    org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
    java.awt.Graphics2D var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    var7.drawBackgroundImage(var22, var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setInteriorGap(4.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    java.lang.Number var9 = var0.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
    int var11 = var0.getRowIndex((java.lang.Comparable)Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var13 = var0.getRowKey(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    java.lang.Comparable var7 = null;
    java.lang.Number var9 = var0.getMeanValue(var7, (java.lang.Comparable)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var12 = var0.getQ3Value(4, (-457));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.jfree.chart.block.CenterArrangement var0 = new org.jfree.chart.block.CenterArrangement();
    org.jfree.chart.block.BlockContainer var1 = new org.jfree.chart.block.BlockContainer();
    java.awt.Graphics2D var2 = null;
    org.jfree.chart.block.RectangleConstraint var5 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
    org.jfree.chart.util.Size2D var6 = null;
    org.jfree.chart.util.Size2D var7 = var5.calculateConstrainedSize(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.Size2D var8 = var0.arrange(var1, var2, var5);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.jfree.data.KeyToGroupMap var8 = new org.jfree.data.KeyToGroupMap();
    java.util.List var9 = var8.getGroups();
    org.jfree.data.statistics.BoxAndWhiskerItem var10 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var9);
    java.lang.Number var11 = var10.getMinRegularValue();
    java.lang.Number var12 = var10.getMaxOutlier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.0f+ "'", var11.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)100+ "'", var12.equals((byte)100));

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     java.text.AttributedString var0 = null;
//     java.awt.Shape var5 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var9 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var12 = var9.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var13 = null;
//     org.jfree.chart.plot.RingPlot var14 = new org.jfree.chart.plot.RingPlot(var13);
//     org.jfree.chart.plot.Plot var15 = var14.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var16 = null;
//     var14.axisChanged(var16);
//     org.jfree.chart.JFreeChart var19 = new org.jfree.chart.JFreeChart("hi!", var12, (org.jfree.chart.plot.Plot)var14, true);
//     java.lang.Object var20 = var14.clone();
//     java.awt.Paint var21 = var14.getLabelLinkPaint();
//     java.awt.Paint var23 = null;
//     org.jfree.chart.axis.DateAxis var24 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var28 = var25.getLegendItem((-1), 100);
//     var25.setBaseShapesFilled(false);
//     java.awt.Paint var32 = var25.getSeriesOutlinePaint((-1));
//     java.awt.Paint var34 = var25.lookupSeriesOutlinePaint(0);
//     var24.setLabelPaint(var34);
//     boolean var36 = var24.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var38 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var39 = var38.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var40 = var38.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var41 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var43 = var41.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var46 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var49 = var46.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var50 = null;
//     org.jfree.chart.plot.RingPlot var51 = new org.jfree.chart.plot.RingPlot(var50);
//     org.jfree.chart.plot.Plot var52 = var51.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var53 = null;
//     var51.axisChanged(var53);
//     org.jfree.chart.JFreeChart var56 = new org.jfree.chart.JFreeChart("hi!", var49, (org.jfree.chart.plot.Plot)var51, true);
//     boolean var57 = var41.equals((java.lang.Object)var49);
//     var41.validateObject();
//     org.jfree.data.Range var59 = var38.findRangeBounds((org.jfree.data.category.CategoryDataset)var41);
//     org.jfree.data.general.DatasetChangeEvent var60 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var36, (org.jfree.data.general.Dataset)var41);
//     org.jfree.data.Range var61 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.category.CategoryDataset)var41);
//     org.jfree.chart.plot.XYPlot var62 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var64 = new org.jfree.chart.axis.NumberAxis3D("");
//     var64.configure();
//     org.jfree.chart.util.RectangleInsets var66 = var64.getLabelInsets();
//     var62.setAxisOffset(var66);
//     org.jfree.chart.plot.CategoryMarker var69 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var70 = var69.getOutlineStroke();
//     var62.addDomainMarker((org.jfree.chart.plot.Marker)var69);
//     var41.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var62);
//     java.awt.Stroke var73 = var62.getDomainGridlineStroke();
//     org.jfree.chart.axis.NumberAxis3D var76 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var77 = var76.isTickMarksVisible();
//     java.awt.Shape var78 = var76.getDownArrow();
//     java.awt.Shape var81 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var78, 100.0d, 0.2d);
//     org.jfree.chart.plot.CategoryMarker var83 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var84 = var83.getOutlineStroke();
//     org.jfree.chart.plot.CategoryMarker var86 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var87 = var86.getLabelPaint();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.chart.LegendItem var88 = new org.jfree.chart.LegendItem(var0, "hi!", "org.jfree.chart.event.RendererChangeEvent[source=false]", "java.awt.Color[r=0,g=0,b=10]", false, var5, false, var21, true, var23, var73, false, var81, var84, var87);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var36 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var43 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var49);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var57 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var66);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var70);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var77 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var78);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var81);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var84);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var87);
// 
//   }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


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

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    java.lang.Comparable var1 = null;
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getValue(var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(0, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var32 = var30.getInsets();
//     double var34 = var32.calculateBottomOutset(100.0d);
//     var28.setPadding(var32);
//     org.jfree.chart.util.RectangleAnchor var36 = var28.getShapeLocation();
//     org.jfree.chart.text.TextBlockAnchor var37 = null;
//     org.jfree.chart.plot.XYPlot var38 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var40 = new org.jfree.chart.axis.NumberAxis3D("");
//     var40.configure();
//     org.jfree.chart.util.RectangleInsets var42 = var40.getLabelInsets();
//     var38.setAxisOffset(var42);
//     org.jfree.chart.plot.CategoryMarker var45 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var46 = var45.getOutlineStroke();
//     var38.addDomainMarker((org.jfree.chart.plot.Marker)var45);
//     var45.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var51.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var55 = var51.getBaseLinesVisible();
//     java.lang.Boolean var57 = var51.getSeriesVisibleInLegend(10);
//     java.awt.Paint var58 = var51.getBaseItemLabelPaint();
//     java.awt.Color var61 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var62 = null;
//     float[] var63 = var61.getRGBColorComponents(var62);
//     var51.setBaseItemLabelPaint((java.awt.Paint)var61);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var66 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var67 = var66.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var68 = var66.getBaseNegativeItemLabelPosition();
//     var51.setBasePositiveItemLabelPosition(var68, true);
//     var50.setPositiveItemLabelPositionFallback(var68);
//     org.jfree.chart.text.TextAnchor var72 = var68.getRotationAnchor();
//     var45.setLabelTextAnchor(var72);
//     org.jfree.chart.axis.CategoryLabelWidthType var75 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.chart.axis.CategoryLabelPosition var77 = new org.jfree.chart.axis.CategoryLabelPosition(var36, var37, var72, 90.0d, var75, 1.0f);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == 4.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var55 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var63);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var67);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var68);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var72);
// 
//   }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     java.lang.Number var0 = null;
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var3.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var7 = var3.getBaseLinesVisible();
//     java.lang.Boolean var9 = var3.getSeriesVisibleInLegend(10);
//     java.awt.Paint var10 = var3.getBaseItemLabelPaint();
//     java.awt.Color var13 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var14 = null;
//     float[] var15 = var13.getRGBColorComponents(var14);
//     var3.setBaseItemLabelPaint((java.awt.Paint)var13);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var18 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var19 = var18.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var20 = var18.getBaseNegativeItemLabelPosition();
//     var3.setBasePositiveItemLabelPosition(var20, true);
//     var2.setPositiveItemLabelPositionFallback(var20);
//     org.jfree.chart.text.TextAnchor var24 = var20.getRotationAnchor();
//     org.jfree.chart.text.TextAnchor var25 = null;
//     org.jfree.chart.axis.NumberTick var27 = new org.jfree.chart.axis.NumberTick(var0, "", var24, var25, 90.0d);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     boolean var4 = var3.getAntiAlias();
//     java.awt.Stroke var5 = var3.getBorderStroke();
//     org.jfree.chart.plot.RingPlot var6 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.plot.IntervalMarker var9 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var10 = var9.getEndValue();
//     var9.setStartValue(0.2d);
//     java.awt.Stroke var13 = var9.getStroke();
//     var6.setLabelOutlineStroke(var13);
//     var3.setBorderStroke(var13);
//     
//     // Checks the contract:  equals-hashcode on var1 and var6
//     assertTrue("Contract failed: equals-hashcode on var1 and var6", var1.equals(var6) ? var1.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var1
//     assertTrue("Contract failed: equals-hashcode on var6 and var1", var6.equals(var1) ? var6.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.axis.AxisState var2 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     java.util.List var5 = var0.refreshTicks(var1, var2, var3, var4);
// 
//   }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     org.jfree.data.time.Month var0 = new org.jfree.data.time.Month();
//     long var1 = var0.getSerialIndex();
//     java.util.Date var2 = var0.getEnd();
//     java.util.Calendar var3 = null;
//     long var4 = var0.getFirstMillisecond(var3);
// 
//   }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.LegendItemCollection var1 = new org.jfree.chart.LegendItemCollection();
//     int var2 = var1.getItemCount();
//     var0.setFixedLegendItems(var1);
//     org.jfree.chart.LegendItemCollection var4 = new org.jfree.chart.LegendItemCollection();
//     int var5 = var4.getItemCount();
//     var1.addAll(var4);
//     
//     // Checks the contract:  equals-hashcode on var1 and var4
//     assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var1
//     assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.chart.plot.XYPlot var22 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var24 = new org.jfree.chart.axis.NumberAxis3D("");
//     var24.configure();
//     org.jfree.chart.util.RectangleInsets var26 = var24.getLabelInsets();
//     var22.setAxisOffset(var26);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var29 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var30 = var29.getEndType();
//     java.awt.Stroke var33 = var29.getItemStroke(0, 0);
//     var22.setRangeZeroBaselineStroke(var33);
//     org.jfree.chart.util.Layer var35 = null;
//     java.util.Collection var36 = var22.getDomainMarkers(var35);
//     org.jfree.chart.util.RectangleInsets var37 = var22.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var39 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var40 = var39.getEndType();
//     java.awt.Stroke var43 = var39.getItemStroke(0, 0);
//     var22.setDomainZeroBaselineStroke(var43);
//     org.jfree.chart.util.RectangleEdge var46 = var22.getDomainAxisEdge(1);
//     var21.setLegendItemGraphicEdge(var46);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, Double.NaN, Double.NaN);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.rotateShape(var50, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var60 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var62 = var60.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var65 = new org.jfree.chart.entity.CategoryItemEntity(var50, "hi!", "", (org.jfree.data.category.CategoryDataset)var60, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var69 = var66.getLegendItem((-1), 100);
//     var66.setBaseShapesFilled(false);
//     java.awt.Paint var73 = var66.getSeriesOutlinePaint((-1));
//     java.awt.Paint var75 = var66.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var76 = new org.jfree.chart.title.LegendGraphic(var50, var75);
//     org.jfree.data.general.PieDataset var77 = null;
//     org.jfree.chart.plot.RingPlot var78 = new org.jfree.chart.plot.RingPlot(var77);
//     org.jfree.chart.plot.Plot var79 = var78.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var80 = var78.getInsets();
//     double var82 = var80.calculateBottomOutset(100.0d);
//     var76.setPadding(var80);
//     org.jfree.chart.util.RectangleInsets var84 = var76.getMargin();
//     org.jfree.chart.util.RectangleAnchor var85 = var76.getShapeLocation();
//     var21.setLegendItemGraphicAnchor(var85);
//     
//     // Checks the contract:  equals-hashcode on var7 and var78
//     assertTrue("Contract failed: equals-hashcode on var7 and var78", var7.equals(var78) ? var7.hashCode() == var78.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var78 and var7
//     assertTrue("Contract failed: equals-hashcode on var78 and var7", var78.equals(var7) ? var78.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var79
//     assertTrue("Contract failed: equals-hashcode on var8 and var79", var8.equals(var79) ? var8.hashCode() == var79.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var79 and var8
//     assertTrue("Contract failed: equals-hashcode on var79 and var8", var79.equals(var8) ? var79.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var2.setUpperMargin(0.0d);
    int var5 = var2.getMaximumCategoryLabelLines();
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
    java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
    var7.setLabelPaint(var17);
    double var19 = var7.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
    double var24 = var20.getBase();
    org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
    var28.setBaseShapesFilled(false);
    java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
    var20.setErrorIndicatorPaint(var36);
    org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
    var38.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxis(0);
    var38.setDrawSharedDomainAxis(true);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var46.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var50 = var46.getBaseLinesVisible();
    java.lang.Boolean var52 = var46.getSeriesVisibleInLegend(10);
    java.awt.Paint var53 = var46.getBaseItemLabelPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var38.setRenderer((-1), (org.jfree.chart.renderer.category.CategoryItemRenderer)var46, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var7 = var6.isTickMarksVisible();
    org.jfree.data.Range var10 = new org.jfree.data.Range(1.0d, 100.0d);
    var6.setRangeWithMargins(var10, false, false);
    var4.setRangeWithMargins(var10);
    var1.setDefaultAutoRange(var10);
    var1.setTickLabelsVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    org.jfree.data.KeyToGroupMap var8 = new org.jfree.data.KeyToGroupMap();
    java.util.List var9 = var8.getGroups();
    org.jfree.data.statistics.BoxAndWhiskerItem var10 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var9);
    java.util.List var11 = var10.getOutliers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var41 = new org.jfree.chart.axis.AxisSpace();
//     double var42 = var41.getLeft();
//     var38.setFixedRangeAxisSpace(var41);
//     org.jfree.chart.axis.AxisSpace var44 = new org.jfree.chart.axis.AxisSpace();
//     double var45 = var44.getLeft();
//     var38.setFixedRangeAxisSpace(var44);
//     java.awt.geom.Rectangle2D var47 = null;
//     org.jfree.chart.plot.XYPlot var48 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var50 = new org.jfree.chart.axis.NumberAxis3D("");
//     var50.configure();
//     org.jfree.chart.util.RectangleInsets var52 = var50.getLabelInsets();
//     var48.setAxisOffset(var52);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var55 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var56 = var55.getEndType();
//     java.awt.Stroke var59 = var55.getItemStroke(0, 0);
//     var48.setRangeZeroBaselineStroke(var59);
//     org.jfree.chart.util.Layer var61 = null;
//     java.util.Collection var62 = var48.getDomainMarkers(var61);
//     org.jfree.chart.util.RectangleInsets var63 = var48.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var65 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var66 = var65.getEndType();
//     java.awt.Stroke var69 = var65.getItemStroke(0, 0);
//     var48.setDomainZeroBaselineStroke(var69);
//     org.jfree.chart.util.RectangleEdge var71 = var48.getDomainAxisEdge();
//     java.awt.geom.Rectangle2D var72 = var44.reserved(var47, var71);
// 
//   }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var2 = var1.getEndType();
//     java.awt.Paint var4 = var1.getSeriesFillPaint((-1));
//     int var5 = var1.getPassCount();
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.plot.CategoryPlot var7 = null;
//     org.jfree.chart.axis.NumberAxis3D var9 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var10 = var9.getTickLabelPaint();
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.axis.NumberAxis3D var14 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var15 = var14.isTickMarksVisible();
//     org.jfree.data.Range var18 = new org.jfree.data.Range(1.0d, 100.0d);
//     var14.setRangeWithMargins(var18, false, false);
//     var12.setRangeWithMargins(var18);
//     var9.setDefaultAutoRange(var18);
//     org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var27 = var26.getEndValue();
//     java.awt.geom.Rectangle2D var28 = null;
//     var1.drawRangeMarker(var6, var7, (org.jfree.chart.axis.ValueAxis)var9, (org.jfree.chart.plot.Marker)var26, var28);
//     java.lang.Class var30 = null;
//     java.util.EventListener[] var31 = var26.getListeners(var30);
// 
//   }

  public void test253() {}
//   public void test253() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }
// 
// 
//     org.jfree.data.time.Month var1 = new org.jfree.data.time.Month();
//     org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("ThreadContext", (org.jfree.data.time.TimePeriod)var1);
//     var2.setDescription("poly");
//     org.jfree.data.time.Month var5 = new org.jfree.data.time.Month();
//     long var6 = var5.getSerialIndex();
//     java.util.Date var7 = var5.getEnd();
//     var2.setDuration((org.jfree.data.time.TimePeriod)var5);
//     int var9 = var2.getSubtaskCount();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.data.gantt.Task var11 = var2.getSubtask(2);
//       fail("Expected exception of type java.lang.IndexOutOfBoundsException");
//     } catch (java.lang.IndexOutOfBoundsException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 24180L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0);
// 
//   }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    var0.setDomainCrosshairValue(0.05d);
    boolean var3 = var0.isRangeZeroBaselineVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    var0.setBaseShapesFilled(false);
    java.awt.Paint var8 = var0.getItemOutlinePaint(10, 1);
    boolean var9 = var0.getUseOutlinePaint();
    boolean var12 = var0.getItemShapeFilled(100, 10);
    org.jfree.chart.labels.CategoryToolTipGenerator var13 = null;
    var0.setBaseToolTipGenerator(var13);
    var0.setAutoPopulateSeriesShape(false);
    java.awt.Paint var19 = var0.getItemFillPaint(2, 2);
    org.jfree.chart.labels.CategoryToolTipGenerator var20 = var0.getBaseToolTipGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.text.TextUtilities.drawRotatedString("ThreadContext", var1, 10.0f, 10.0f, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }
// 
// 
//     org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var2 = var1.getLabelPaint();
//     java.lang.Comparable var3 = var1.getKey();
//     java.lang.String var4 = var1.getLabel();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var10 = var7.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var11 = null;
//     org.jfree.chart.plot.RingPlot var12 = new org.jfree.chart.plot.RingPlot(var11);
//     org.jfree.chart.plot.Plot var13 = var12.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var14 = null;
//     var12.axisChanged(var14);
//     org.jfree.chart.JFreeChart var17 = new org.jfree.chart.JFreeChart("hi!", var10, (org.jfree.chart.plot.Plot)var12, true);
//     var1.removeChangeListener((org.jfree.chart.event.MarkerChangeListener)var12);
//     java.lang.Comparable var19 = var1.getKey();
//     java.lang.Class var20 = null;
//     java.util.EventListener[] var21 = var1.getListeners(var20);
// 
//   }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var41 = new org.jfree.chart.axis.AxisSpace();
//     double var42 = var41.getLeft();
//     var38.setFixedRangeAxisSpace(var41);
//     org.jfree.chart.axis.AxisSpace var44 = new org.jfree.chart.axis.AxisSpace();
//     double var45 = var44.getLeft();
//     var38.setFixedRangeAxisSpace(var44);
//     java.awt.geom.Rectangle2D var47 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var50 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var53 = var50.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var54 = null;
//     org.jfree.chart.plot.RingPlot var55 = new org.jfree.chart.plot.RingPlot(var54);
//     org.jfree.chart.plot.Plot var56 = var55.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var57 = null;
//     var55.axisChanged(var57);
//     org.jfree.chart.JFreeChart var60 = new org.jfree.chart.JFreeChart("hi!", var53, (org.jfree.chart.plot.Plot)var55, true);
//     java.lang.Object var61 = var55.clone();
//     org.jfree.chart.util.HorizontalAlignment var62 = null;
//     org.jfree.chart.util.VerticalAlignment var63 = null;
//     org.jfree.chart.block.FlowArrangement var66 = new org.jfree.chart.block.FlowArrangement(var62, var63, 100.0d, 10.0d);
//     var66.clear();
//     org.jfree.chart.block.Arrangement var68 = null;
//     org.jfree.chart.title.LegendTitle var69 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var55, (org.jfree.chart.block.Arrangement)var66, var68);
//     org.jfree.chart.plot.XYPlot var70 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var72 = new org.jfree.chart.axis.NumberAxis3D("");
//     var72.configure();
//     org.jfree.chart.util.RectangleInsets var74 = var72.getLabelInsets();
//     var70.setAxisOffset(var74);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var77 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var78 = var77.getEndType();
//     java.awt.Stroke var81 = var77.getItemStroke(0, 0);
//     var70.setRangeZeroBaselineStroke(var81);
//     org.jfree.chart.util.Layer var83 = null;
//     java.util.Collection var84 = var70.getDomainMarkers(var83);
//     org.jfree.chart.util.RectangleInsets var85 = var70.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var87 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var88 = var87.getEndType();
//     java.awt.Stroke var91 = var87.getItemStroke(0, 0);
//     var70.setDomainZeroBaselineStroke(var91);
//     org.jfree.chart.util.RectangleEdge var94 = var70.getDomainAxisEdge(1);
//     var69.setLegendItemGraphicEdge(var94);
//     java.awt.geom.Rectangle2D var96 = var44.reserved(var47, var94);
// 
//   }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     java.util.Date var0 = null;
//     org.jfree.chart.axis.DateAxis var1 = new org.jfree.chart.axis.DateAxis();
//     double var2 = var1.getLabelAngle();
//     var1.setTickLabelsVisible(false);
//     var1.configure();
//     java.util.TimeZone var6 = var1.getTimeZone();
//     org.jfree.data.time.Month var7 = new org.jfree.data.time.Month(var0, var6);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getAxisOffset();
    java.awt.Paint var7 = var0.getDomainTickBandPaint();
    var0.setBackgroundImageAlpha(1.0f);
    org.jfree.data.xy.XYDataset var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDataset((-457), var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test261() {}
//   public void test261() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedBarRenderer3D var2 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(0.05d, 4.0d);
//     java.awt.Graphics2D var3 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     org.jfree.data.category.CategoryDataset var5 = null;
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var7.setUpperMargin(0.0d);
//     int var10 = var7.getMaximumCategoryLabelLines();
//     java.lang.Object var11 = var7.clone();
//     org.jfree.chart.axis.DateAxis var12 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     java.awt.Paint var22 = var13.lookupSeriesOutlinePaint(0);
//     var12.setLabelPaint(var22);
//     double var24 = var12.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var28 = var25.getLegendItem(2, 0);
//     double var29 = var25.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var32 = var25.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var36 = var33.getLegendItem((-1), 100);
//     var33.setBaseShapesFilled(false);
//     java.awt.Paint var41 = var33.getItemOutlinePaint(10, 1);
//     var25.setErrorIndicatorPaint(var41);
//     org.jfree.chart.plot.CategoryPlot var43 = new org.jfree.chart.plot.CategoryPlot(var5, var7, (org.jfree.chart.axis.ValueAxis)var12, (org.jfree.chart.renderer.category.CategoryItemRenderer)var25);
//     var43.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var47 = var43.getDomainAxis(0);
//     var43.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.PlotRenderingInfo var52 = null;
//     org.jfree.chart.plot.XYPlot var53 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var55 = new org.jfree.chart.axis.NumberAxis3D("");
//     var55.configure();
//     org.jfree.chart.util.RectangleInsets var57 = var55.getLabelInsets();
//     var53.setAxisOffset(var57);
//     org.jfree.chart.plot.CategoryMarker var60 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var61 = var60.getOutlineStroke();
//     var53.addDomainMarker((org.jfree.chart.plot.Marker)var60);
//     java.awt.geom.Point2D var63 = var53.getQuadrantOrigin();
//     var43.zoomRangeAxes(0.0d, 90.0d, var52, var63);
//     org.jfree.chart.plot.PlotRenderingInfo var66 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var67 = var2.initialise(var3, var4, var43, 4, var66);
// 
//   }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis3D var1 = new org.jfree.chart.axis.CategoryAxis3D("java.awt.Color[r=0,g=0,b=10]");
//     org.jfree.chart.axis.CategoryAnchor var2 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     org.jfree.chart.plot.XYPlot var6 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
//     var8.configure();
//     org.jfree.chart.util.RectangleInsets var10 = var8.getLabelInsets();
//     var6.setAxisOffset(var10);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var13 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var14 = var13.getEndType();
//     java.awt.Stroke var17 = var13.getItemStroke(0, 0);
//     var6.setRangeZeroBaselineStroke(var17);
//     org.jfree.chart.util.Layer var19 = null;
//     java.util.Collection var20 = var6.getDomainMarkers(var19);
//     org.jfree.chart.util.RectangleInsets var21 = var6.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var23 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var24 = var23.getEndType();
//     java.awt.Stroke var27 = var23.getItemStroke(0, 0);
//     var6.setDomainZeroBaselineStroke(var27);
//     org.jfree.chart.util.RectangleEdge var29 = var6.getDomainAxisEdge();
//     boolean var30 = org.jfree.chart.util.RectangleEdge.isLeftOrRight(var29);
//     double var31 = var1.getCategoryJava2DCoordinate(var2, (-16777206), 15, var5, var29);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var2 = var1.getEndType();
    java.awt.Paint var4 = var1.getSeriesFillPaint((-1));
    var1.setRenderAsPercentages(true);
    org.jfree.chart.renderer.category.StackedAreaRenderer var9 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var12 = var9.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var13 = null;
    org.jfree.chart.plot.RingPlot var14 = new org.jfree.chart.plot.RingPlot(var13);
    org.jfree.chart.plot.Plot var15 = var14.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var16 = null;
    var14.axisChanged(var16);
    org.jfree.chart.JFreeChart var19 = new org.jfree.chart.JFreeChart("hi!", var12, (org.jfree.chart.plot.Plot)var14, true);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem((-1), 100);
    var20.setBaseShapesFilled(false);
    java.awt.Paint var27 = var20.getSeriesOutlinePaint((-1));
    boolean var28 = var19.equals((java.lang.Object)var20);
    java.awt.Shape var29 = var20.getBaseShape();
    var1.setBaseShape(var29, false);
    org.jfree.chart.labels.ItemLabelPosition var33 = new org.jfree.chart.labels.ItemLabelPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSeriesNegativeItemLabelPosition((-457), var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test264() {}
//   public void test264() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     org.jfree.chart.entity.ChartEntity var3 = new org.jfree.chart.entity.ChartEntity(var2);
//     org.jfree.chart.entity.ChartEntity var4 = new org.jfree.chart.entity.ChartEntity(var2);
//     
//     // Checks the contract:  equals-hashcode on var3 and var4
//     assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var3
//     assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.getPreviousDayOfWeek(2, var1);
// 
//   }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    org.jfree.chart.text.TextUtilities.setUseFontMetricsGetStringBounds(false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var3 = var1.getRowKey(15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.jfree.chart.ui.Contributor var2 = new org.jfree.chart.ui.Contributor("org.jfree.chart.event.RendererChangeEvent[source=false]", "");
    java.lang.String var3 = var2.getEmail();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.jfree.chart.event.RendererChangeEvent[source=false]"+ "'", var4.equals("org.jfree.chart.event.RendererChangeEvent[source=false]"));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    int var1 = var0.getItemCount();
    var0.removeValue((java.lang.Comparable)"Oct");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var5 = var0.getValue((-16777206));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var45 = var42.getLegendItem((-1), 100);
//     var42.setBaseShapesFilled(false);
//     java.awt.Paint var50 = var42.getItemOutlinePaint(10, 1);
//     java.lang.Object var51 = var42.clone();
//     var42.setSeriesShapesVisible(1, false);
//     var42.setDrawOutlines(false);
//     var38.setRenderer(10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var42);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var8 and var42.", var8.equals(var42) == var42.equals(var8));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var28 and var42.", var28.equals(var42) == var42.equals(var28));
// 
//   }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var1.setUpperMargin(0.0d);
//     int var4 = var1.getMaximumCategoryLabelLines();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Graphics2D var6 = null;
//     org.jfree.data.general.PieDataset var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot(var7);
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.XYPlot var10 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var12 = new org.jfree.chart.axis.NumberAxis3D("");
//     var12.configure();
//     org.jfree.chart.util.RectangleInsets var14 = var12.getLabelInsets();
//     var10.setAxisOffset(var14);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
//     java.awt.Stroke var21 = var17.getItemStroke(0, 0);
//     var10.setRangeZeroBaselineStroke(var21);
//     org.jfree.chart.util.Layer var23 = null;
//     java.util.Collection var24 = var10.getDomainMarkers(var23);
//     org.jfree.chart.util.RectangleInsets var25 = var10.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var27 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var28 = var27.getEndType();
//     java.awt.Stroke var31 = var27.getItemStroke(0, 0);
//     var10.setDomainZeroBaselineStroke(var31);
//     org.jfree.chart.util.RectangleEdge var33 = var10.getDomainAxisEdge();
//     boolean var34 = org.jfree.chart.util.RectangleEdge.isLeftOrRight(var33);
//     org.jfree.data.category.CategoryDataset var35 = null;
//     org.jfree.chart.axis.CategoryAxis var37 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var37.setUpperMargin(0.0d);
//     int var40 = var37.getMaximumCategoryLabelLines();
//     java.lang.Object var41 = var37.clone();
//     org.jfree.chart.axis.DateAxis var42 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var46 = var43.getLegendItem((-1), 100);
//     var43.setBaseShapesFilled(false);
//     java.awt.Paint var50 = var43.getSeriesOutlinePaint((-1));
//     java.awt.Paint var52 = var43.lookupSeriesOutlinePaint(0);
//     var42.setLabelPaint(var52);
//     double var54 = var42.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var58 = var55.getLegendItem(2, 0);
//     double var59 = var55.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var62 = var55.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var66 = var63.getLegendItem((-1), 100);
//     var63.setBaseShapesFilled(false);
//     java.awt.Paint var71 = var63.getItemOutlinePaint(10, 1);
//     var55.setErrorIndicatorPaint(var71);
//     org.jfree.chart.plot.CategoryPlot var73 = new org.jfree.chart.plot.CategoryPlot(var35, var37, (org.jfree.chart.axis.ValueAxis)var42, (org.jfree.chart.renderer.category.CategoryItemRenderer)var55);
//     var73.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var76 = new org.jfree.chart.axis.AxisSpace();
//     double var77 = var76.getLeft();
//     var73.setFixedRangeAxisSpace(var76);
//     org.jfree.chart.axis.AxisSpace var79 = new org.jfree.chart.axis.AxisSpace();
//     double var80 = var79.getLeft();
//     var73.setFixedRangeAxisSpace(var79);
//     org.jfree.chart.axis.AxisSpace var82 = var1.reserveSpace(var6, (org.jfree.chart.plot.Plot)var8, var9, var33, var79);
// 
//   }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    java.awt.geom.Arc2D var0 = null;
    java.awt.geom.Arc2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.jfree.data.time.SerialDate.lastDayOfMonth((-1), 4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }
// 
// 
//     java.text.AttributedString var0 = null;
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, Double.NaN, Double.NaN);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var18 = var16.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var21 = new org.jfree.chart.entity.CategoryItemEntity(var6, "hi!", "", (org.jfree.data.category.CategoryDataset)var16, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var25 = var22.getLegendItem((-1), 100);
//     var22.setBaseShapesFilled(false);
//     java.awt.Paint var29 = var22.getSeriesOutlinePaint((-1));
//     java.awt.Paint var31 = var22.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var32 = new org.jfree.chart.title.LegendGraphic(var6, var31);
//     org.jfree.chart.entity.LegendItemEntity var33 = new org.jfree.chart.entity.LegendItemEntity(var6);
//     org.jfree.chart.plot.IntervalMarker var36 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var37 = var36.getEndValue();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var41 = var38.getLegendItem((-1), 100);
//     var38.setBaseShapesFilled(false);
//     java.awt.Paint var45 = var38.getSeriesOutlinePaint((-1));
//     java.awt.Paint var47 = var38.lookupSeriesOutlinePaint(0);
//     var36.setOutlinePaint(var47);
//     org.jfree.data.general.PieDataset var49 = null;
//     org.jfree.chart.plot.RingPlot var50 = new org.jfree.chart.plot.RingPlot(var49);
//     org.jfree.chart.plot.Plot var51 = var50.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var52 = null;
//     var50.axisChanged(var52);
//     var50.setShadowYOffset(0.0d);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var59 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var62 = var59.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var63 = null;
//     org.jfree.chart.plot.RingPlot var64 = new org.jfree.chart.plot.RingPlot(var63);
//     org.jfree.chart.plot.Plot var65 = var64.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var66 = null;
//     var64.axisChanged(var66);
//     org.jfree.chart.JFreeChart var69 = new org.jfree.chart.JFreeChart("hi!", var62, (org.jfree.chart.plot.Plot)var64, true);
//     java.util.List var70 = var69.getSubtitles();
//     java.awt.Stroke var71 = var69.getBorderStroke();
//     var50.setSectionOutlineStroke((java.lang.Comparable)0.0d, var71);
//     org.jfree.data.general.PieDataset var73 = null;
//     org.jfree.chart.plot.RingPlot var74 = new org.jfree.chart.plot.RingPlot(var73);
//     java.awt.Paint var75 = var74.getBaseSectionPaint();
//     boolean var76 = var74.isOutlineVisible();
//     java.awt.Color var80 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var81 = null;
//     float[] var82 = var80.getRGBColorComponents(var81);
//     var74.setSectionOutlinePaint((java.lang.Comparable)"", (java.awt.Paint)var80);
//     int var84 = var80.getRed();
//     int var85 = var80.getRGB();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       org.jfree.chart.LegendItem var86 = new org.jfree.chart.LegendItem(var0, "ThreadContext", "java.awt.Color[r=0,g=0,b=10]", "hi!", var6, var47, var71, (java.awt.Paint)var80);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == 0.25d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var45);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var47);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var65);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var70);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var71);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var75);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var76 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var84 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var85 == (-16777206));
// 
//   }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    org.jfree.chart.renderer.category.LineRenderer3D var0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    java.awt.Paint var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setWallPaint(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() {}
//   public void test278() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }
// 
// 
//     org.jfree.data.time.Year var1 = new org.jfree.data.time.Year();
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(10, var1);
//     long var3 = var1.getLastMillisecond();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1420099199999L);
// 
//   }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    double var1 = var0.getLimit();
    double var2 = var0.getLimit();
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var3, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    var3.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
    java.lang.Comparable var10 = null;
    java.lang.Number var12 = var3.getMeanValue(var10, (java.lang.Comparable)100.0f);
    var0.setDataset((org.jfree.data.category.CategoryDataset)var3);
    java.lang.String var14 = var0.getPlotType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Multiple Pie Plot"+ "'", var14.equals("Multiple Pie Plot"));

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.chart.plot.XYPlot var22 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var24 = new org.jfree.chart.axis.NumberAxis3D("");
//     var24.configure();
//     org.jfree.chart.util.RectangleInsets var26 = var24.getLabelInsets();
//     var22.setAxisOffset(var26);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var29 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var30 = var29.getEndType();
//     java.awt.Stroke var33 = var29.getItemStroke(0, 0);
//     var22.setRangeZeroBaselineStroke(var33);
//     org.jfree.chart.util.Layer var35 = null;
//     java.util.Collection var36 = var22.getDomainMarkers(var35);
//     org.jfree.chart.util.RectangleInsets var37 = var22.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var39 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var40 = var39.getEndType();
//     java.awt.Stroke var43 = var39.getItemStroke(0, 0);
//     var22.setDomainZeroBaselineStroke(var43);
//     org.jfree.chart.util.RectangleEdge var46 = var22.getDomainAxisEdge(1);
//     var21.setLegendItemGraphicEdge(var46);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var50 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var53 = var50.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var54 = null;
//     org.jfree.chart.plot.RingPlot var55 = new org.jfree.chart.plot.RingPlot(var54);
//     org.jfree.chart.plot.Plot var56 = var55.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var57 = null;
//     var55.axisChanged(var57);
//     org.jfree.chart.JFreeChart var60 = new org.jfree.chart.JFreeChart("hi!", var53, (org.jfree.chart.plot.Plot)var55, true);
//     java.lang.Object var61 = var55.clone();
//     org.jfree.chart.util.HorizontalAlignment var62 = null;
//     org.jfree.chart.util.VerticalAlignment var63 = null;
//     org.jfree.chart.block.FlowArrangement var66 = new org.jfree.chart.block.FlowArrangement(var62, var63, 100.0d, 10.0d);
//     var66.clear();
//     org.jfree.chart.block.Arrangement var68 = null;
//     org.jfree.chart.title.LegendTitle var69 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var55, (org.jfree.chart.block.Arrangement)var66, var68);
//     org.jfree.chart.util.RectangleInsets var70 = var69.getLegendItemGraphicPadding();
//     double var72 = var70.calculateLeftOutset(8.0d);
//     var21.setItemLabelPadding(var70);
//     
//     // Checks the contract:  equals-hashcode on var7 and var55
//     assertTrue("Contract failed: equals-hashcode on var7 and var55", var7.equals(var55) ? var7.hashCode() == var55.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var55 and var7
//     assertTrue("Contract failed: equals-hashcode on var55 and var7", var55.equals(var7) ? var55.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var56
//     assertTrue("Contract failed: equals-hashcode on var8 and var56", var8.equals(var56) ? var8.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var8
//     assertTrue("Contract failed: equals-hashcode on var56 and var8", var56.equals(var8) ? var56.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var60
//     assertTrue("Contract failed: equals-hashcode on var12 and var60", var12.equals(var60) ? var12.hashCode() == var60.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var60 and var12
//     assertTrue("Contract failed: equals-hashcode on var60 and var12", var60.equals(var12) ? var60.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var61
//     assertTrue("Contract failed: equals-hashcode on var13 and var61", var13.equals(var61) ? var13.hashCode() == var61.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var61 and var13
//     assertTrue("Contract failed: equals-hashcode on var61 and var13", var61.equals(var13) ? var61.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var66
//     assertTrue("Contract failed: equals-hashcode on var18 and var66", var18.equals(var66) ? var18.hashCode() == var66.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var66 and var18
//     assertTrue("Contract failed: equals-hashcode on var66 and var18", var66.equals(var18) ? var66.hashCode() == var18.hashCode() : true);
// 
//   }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }
// 
// 
//     org.jfree.data.time.Month var1 = new org.jfree.data.time.Month();
//     org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("ThreadContext", (org.jfree.data.time.TimePeriod)var1);
//     var2.setDescription("poly");
//     org.jfree.data.time.Month var5 = new org.jfree.data.time.Month();
//     long var6 = var5.getSerialIndex();
//     java.util.Date var7 = var5.getEnd();
//     var2.setDuration((org.jfree.data.time.TimePeriod)var5);
//     int var9 = var2.getSubtaskCount();
//     int var10 = var2.getSubtaskCount();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 24180L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0);
// 
//   }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.LegendItemCollection var1 = new org.jfree.chart.LegendItemCollection();
//     int var2 = var1.getItemCount();
//     var0.setFixedLegendItems(var1);
//     org.jfree.data.xy.XYDataset var4 = null;
//     int var5 = var0.indexOf(var4);
//     java.awt.Graphics2D var6 = null;
//     java.awt.geom.Rectangle2D var7 = null;
//     var0.drawBackground(var6, var7);
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    org.jfree.chart.util.BooleanList var0 = new org.jfree.chart.util.BooleanList();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var3 = var2.getTickLabelPaint();
    boolean var4 = var0.equals((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.getObject(100, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var4 = var3.isTickMarksVisible();
    org.jfree.data.Range var7 = new org.jfree.data.Range(1.0d, 100.0d);
    var3.setRangeWithMargins(var7, false, false);
    var1.setRangeWithMargins(var7);
    var1.configure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRange(4.0d, 2.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    double var1 = var0.getLabelAngle();
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, Double.NaN, Double.NaN);
    var0.setDownArrow(var4);
    org.jfree.chart.axis.DateTickMarkPosition var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTickMarkPosition(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
    double var3 = var2.getEndValue();
    var2.setStartValue(0.2d);
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.text.TextAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var6.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var10 = var6.getBaseLinesVisible();
//     java.lang.Boolean var12 = var6.getSeriesVisibleInLegend(10);
//     java.awt.Paint var13 = var6.getBaseItemLabelPaint();
//     org.jfree.chart.text.TextFragment var14 = new org.jfree.chart.text.TextFragment("", var5, var13);
//     java.awt.Graphics2D var15 = null;
//     org.jfree.chart.plot.XYPlot var18 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var20 = new org.jfree.chart.axis.NumberAxis3D("");
//     var20.configure();
//     org.jfree.chart.util.RectangleInsets var22 = var20.getLabelInsets();
//     var18.setAxisOffset(var22);
//     org.jfree.chart.plot.CategoryMarker var25 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var26 = var25.getOutlineStroke();
//     var18.addDomainMarker((org.jfree.chart.plot.Marker)var25);
//     var25.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var31.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var35 = var31.getBaseLinesVisible();
//     java.lang.Boolean var37 = var31.getSeriesVisibleInLegend(10);
//     java.awt.Paint var38 = var31.getBaseItemLabelPaint();
//     java.awt.Color var41 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var42 = null;
//     float[] var43 = var41.getRGBColorComponents(var42);
//     var31.setBaseItemLabelPaint((java.awt.Paint)var41);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var46 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var47 = var46.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var48 = var46.getBaseNegativeItemLabelPosition();
//     var31.setBasePositiveItemLabelPosition(var48, true);
//     var30.setPositiveItemLabelPositionFallback(var48);
//     org.jfree.chart.text.TextAnchor var52 = var48.getRotationAnchor();
//     var25.setLabelTextAnchor(var52);
//     var14.draw(var15, 10.0f, 0.0f, var52, (-1.0f), 1.0f, 0.0d);
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    boolean var4 = var0.getBaseLinesVisible();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var9 = var6.getLegendItem(2, 0);
    double var10 = var6.getBase();
    java.awt.Color var13 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var14 = null;
    float[] var15 = var13.getRGBColorComponents(var14);
    java.awt.Color var18 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var19 = null;
    float[] var20 = var18.getRGBColorComponents(var19);
    float[] var21 = var13.getColorComponents(var19);
    var6.setErrorIndicatorPaint((java.awt.Paint)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesFillPaint((-1), (java.awt.Paint)var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.data.UnknownKeyException var23 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var24 = var23.getSuppressed();
//     java.lang.Throwable[] var25 = var23.getSuppressed();
//     boolean var26 = var21.equals((java.lang.Object)var25);
//     org.jfree.chart.util.RectangleInsets var27 = var21.getItemLabelPadding();
//     org.jfree.data.general.PieDataset var28 = null;
//     org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot(var28);
//     org.jfree.chart.plot.Plot var30 = var29.getRootPlot();
//     org.jfree.chart.JFreeChart var31 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var29);
//     boolean var32 = var31.getAntiAlias();
//     org.jfree.chart.util.RectangleInsets var33 = var31.getPadding();
//     var21.setItemLabelPadding(var33);
//     
//     // Checks the contract:  equals-hashcode on var7 and var29
//     assertTrue("Contract failed: equals-hashcode on var7 and var29", var7.equals(var29) ? var7.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var7
//     assertTrue("Contract failed: equals-hashcode on var29 and var7", var29.equals(var7) ? var29.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var30
//     assertTrue("Contract failed: equals-hashcode on var8 and var30", var8.equals(var30) ? var8.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var8
//     assertTrue("Contract failed: equals-hashcode on var30 and var8", var30.equals(var8) ? var30.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }
// 
// 
//     org.jfree.data.time.Year var1 = new org.jfree.data.time.Year();
//     org.jfree.data.time.Month var2 = new org.jfree.data.time.Month(10, var1);
//     java.util.Calendar var3 = null;
//     var2.peg(var3);
// 
//   }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var3 = var2.getTickLabelPaint();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, Double.NaN, Double.NaN);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 10.0d, 0.0f, 0.0f);
//     var2.setLeftArrow(var13);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var13, 4.0d, 10.0f, 100.0f);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    org.jfree.chart.labels.CategoryToolTipGenerator var6 = null;
    var0.setSeriesToolTipGenerator(0, var6);
    java.lang.Boolean var9 = null;
    var0.setSeriesShapesFilled(0, var9);
    var0.setBaseSeriesVisibleInLegend(false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var32 = var30.getInsets();
//     double var34 = var32.calculateBottomOutset(100.0d);
//     var28.setPadding(var32);
//     double var37 = var32.trimWidth(8.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == 4.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var37 == (-8.0d));
// 
//   }

  public void test295() {}
//   public void test295() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }
// 
// 
//     org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
//     var1.clear();
//     java.util.List var3 = var1.getColumnKeys();
//     java.lang.Object var4 = null;
//     boolean var5 = var1.equals(var4);
//     int var7 = var1.getRowIndex((java.lang.Comparable)' ');
//     org.jfree.data.general.PieDataset var8 = null;
//     org.jfree.chart.plot.RingPlot var9 = new org.jfree.chart.plot.RingPlot(var8);
//     org.jfree.chart.plot.Plot var10 = var9.getRootPlot();
//     org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var9);
//     boolean var12 = var11.getAntiAlias();
//     org.jfree.chart.util.RectangleInsets var13 = var11.getPadding();
//     org.jfree.chart.event.ChartChangeEventType var14 = null;
//     org.jfree.chart.event.ChartChangeEvent var15 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var11, var14);
//     org.jfree.chart.axis.NumberAxis3D var19 = new org.jfree.chart.axis.NumberAxis3D("");
//     var19.configure();
//     java.lang.Object var21 = var19.clone();
//     java.lang.Number var24 = null;
//     java.util.List var30 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var31 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var24, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var30);
//     boolean var32 = var19.equals((java.lang.Object)0);
//     boolean var33 = var19.isAutoRange();
//     java.awt.Font var34 = var19.getLabelFont();
//     org.jfree.chart.plot.CategoryMarker var36 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Object var37 = var36.clone();
//     java.awt.Paint var38 = var36.getOutlinePaint();
//     org.jfree.chart.block.LabelBlock var39 = new org.jfree.chart.block.LabelBlock("Size2D[width=50.5, height=10.0]", var34, var38);
//     org.jfree.chart.plot.RingPlot var40 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.plot.IntervalMarker var43 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var44 = var43.getEndValue();
//     var43.setStartValue(0.2d);
//     java.awt.Stroke var47 = var43.getStroke();
//     var40.setLabelOutlineStroke(var47);
//     org.jfree.chart.JFreeChart var50 = new org.jfree.chart.JFreeChart("poly", var34, (org.jfree.chart.plot.Plot)var40, false);
//     var15.setChart(var50);
//     
//     // Checks the contract:  equals-hashcode on var9 and var40
//     assertTrue("Contract failed: equals-hashcode on var9 and var40", var9.equals(var40) ? var9.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var9
//     assertTrue("Contract failed: equals-hashcode on var40 and var9", var40.equals(var9) ? var40.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.plot.CategoryMarker var5 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var6 = var5.getLabelPaint();
//     org.jfree.chart.text.TextAnchor var7 = var5.getLabelTextAnchor();
//     org.jfree.chart.plot.CategoryMarker var10 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var11 = var10.getLabelPaint();
//     org.jfree.chart.text.TextAnchor var12 = var10.getLabelTextAnchor();
//     java.awt.Shape var13 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("org.jfree.data.UnknownKeyException: ", var1, 0.0f, (-1.0f), var7, 2.0d, var12);
// 
//   }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var6 = var3.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot(var7);
//     org.jfree.chart.plot.Plot var9 = var8.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var10 = null;
//     var8.axisChanged(var10);
//     org.jfree.chart.JFreeChart var13 = new org.jfree.chart.JFreeChart("hi!", var6, (org.jfree.chart.plot.Plot)var8, true);
//     java.lang.Object var14 = var8.clone();
//     org.jfree.chart.util.HorizontalAlignment var15 = null;
//     org.jfree.chart.util.VerticalAlignment var16 = null;
//     org.jfree.chart.block.FlowArrangement var19 = new org.jfree.chart.block.FlowArrangement(var15, var16, 100.0d, 10.0d);
//     var19.clear();
//     org.jfree.chart.block.Arrangement var21 = null;
//     org.jfree.chart.title.LegendTitle var22 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8, (org.jfree.chart.block.Arrangement)var19, var21);
//     org.jfree.chart.plot.XYPlot var23 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var25 = new org.jfree.chart.axis.NumberAxis3D("");
//     var25.configure();
//     org.jfree.chart.util.RectangleInsets var27 = var25.getLabelInsets();
//     var23.setAxisOffset(var27);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var30 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var31 = var30.getEndType();
//     java.awt.Stroke var34 = var30.getItemStroke(0, 0);
//     var23.setRangeZeroBaselineStroke(var34);
//     org.jfree.chart.util.Layer var36 = null;
//     java.util.Collection var37 = var23.getDomainMarkers(var36);
//     org.jfree.chart.util.RectangleInsets var38 = var23.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var40 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var41 = var40.getEndType();
//     java.awt.Stroke var44 = var40.getItemStroke(0, 0);
//     var23.setDomainZeroBaselineStroke(var44);
//     org.jfree.chart.util.RectangleEdge var47 = var23.getDomainAxisEdge(1);
//     var22.setLegendItemGraphicEdge(var47);
//     double var49 = org.jfree.chart.util.RectangleEdge.coordinate(var0, var47);
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    boolean var4 = var0.getBaseLinesVisible();
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var7 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false, false);
    java.awt.Paint var8 = var7.getErrorIndicatorPaint();
    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var9 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    var7.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator)var9);
    var0.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator)var9);
    org.jfree.data.category.DefaultCategoryDataset var12 = new org.jfree.data.category.DefaultCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var9.generateLabel((org.jfree.data.category.CategoryDataset)var12, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.jfree.data.function.Function2D var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataset var5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(var0, 4.0d, 0.2d, 0, (java.lang.Comparable)(-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var1.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var5 = var1.getBaseLinesVisible();
//     java.lang.Boolean var7 = var1.getSeriesVisibleInLegend(10);
//     java.awt.Paint var8 = var1.getBaseItemLabelPaint();
//     org.jfree.chart.axis.NumberAxis3D var13 = new org.jfree.chart.axis.NumberAxis3D("");
//     var13.configure();
//     java.lang.Object var15 = var13.clone();
//     java.lang.Number var18 = null;
//     java.util.List var24 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var25 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var18, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var24);
//     boolean var26 = var13.equals((java.lang.Object)0);
//     boolean var27 = var13.isAutoRange();
//     java.awt.Font var28 = var13.getLabelFont();
//     org.jfree.chart.plot.CategoryMarker var30 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Object var31 = var30.clone();
//     java.awt.Paint var32 = var30.getOutlinePaint();
//     org.jfree.chart.block.LabelBlock var33 = new org.jfree.chart.block.LabelBlock("Size2D[width=50.5, height=10.0]", var28, var32);
//     org.jfree.chart.plot.RingPlot var34 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.plot.IntervalMarker var37 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var38 = var37.getEndValue();
//     var37.setStartValue(0.2d);
//     java.awt.Stroke var41 = var37.getStroke();
//     var34.setLabelOutlineStroke(var41);
//     org.jfree.chart.JFreeChart var44 = new org.jfree.chart.JFreeChart("poly", var28, (org.jfree.chart.plot.Plot)var34, false);
//     var1.setSeriesItemLabelFont(4, var28);
//     org.jfree.chart.title.TextTitle var46 = new org.jfree.chart.title.TextTitle("poly", var28);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var49 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var52 = var49.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var53 = null;
//     org.jfree.chart.plot.RingPlot var54 = new org.jfree.chart.plot.RingPlot(var53);
//     org.jfree.chart.plot.Plot var55 = var54.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var56 = null;
//     var54.axisChanged(var56);
//     org.jfree.chart.JFreeChart var59 = new org.jfree.chart.JFreeChart("hi!", var52, (org.jfree.chart.plot.Plot)var54, true);
//     java.lang.Object var60 = var54.clone();
//     org.jfree.chart.util.HorizontalAlignment var61 = null;
//     org.jfree.chart.util.VerticalAlignment var62 = null;
//     org.jfree.chart.block.FlowArrangement var65 = new org.jfree.chart.block.FlowArrangement(var61, var62, 100.0d, 10.0d);
//     var65.clear();
//     org.jfree.chart.block.Arrangement var67 = null;
//     org.jfree.chart.title.LegendTitle var68 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var54, (org.jfree.chart.block.Arrangement)var65, var67);
//     org.jfree.data.UnknownKeyException var70 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var71 = var70.getSuppressed();
//     java.lang.Throwable[] var72 = var70.getSuppressed();
//     boolean var73 = var68.equals((java.lang.Object)var72);
//     org.jfree.chart.util.RectangleInsets var74 = var68.getItemLabelPadding();
//     org.jfree.chart.util.VerticalAlignment var75 = var68.getVerticalAlignment();
//     var46.setVerticalAlignment(var75);
//     
//     // Checks the contract:  equals-hashcode on var34 and var54
//     assertTrue("Contract failed: equals-hashcode on var34 and var54", var34.equals(var54) ? var34.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var54 and var34
//     assertTrue("Contract failed: equals-hashcode on var54 and var34", var54.equals(var34) ? var54.hashCode() == var34.hashCode() : true);
// 
//   }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Year var1 = org.jfree.data.time.Year.parseYear("ThreadContext");
      fail("Expected exception of type org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException e) {
      // Expected exception.
    }

  }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelative("", var1);
// 
//   }

  public void test303() {}
//   public void test303() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }
// 
// 
//     org.jfree.data.general.WaferMapDataset var0 = null;
//     org.jfree.chart.renderer.WaferMapRenderer var1 = null;
//     org.jfree.chart.plot.WaferMapPlot var2 = new org.jfree.chart.plot.WaferMapPlot(var0, var1);
//     java.lang.Object var3 = var2.clone();
//     java.awt.Graphics2D var4 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     org.jfree.chart.plot.XYPlot var6 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
//     var8.configure();
//     org.jfree.chart.util.RectangleInsets var10 = var8.getLabelInsets();
//     var6.setAxisOffset(var10);
//     org.jfree.chart.plot.CategoryMarker var13 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var14 = var13.getOutlineStroke();
//     var6.addDomainMarker((org.jfree.chart.plot.Marker)var13);
//     java.awt.geom.Point2D var16 = var6.getQuadrantOrigin();
//     org.jfree.chart.plot.PlotState var17 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var18 = null;
//     var2.draw(var4, var5, var16, var17, var18);
// 
//   }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var1 = var0.getLimit();
//     double var2 = var0.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var3, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     var3.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
//     java.lang.Comparable var10 = null;
//     java.lang.Number var12 = var3.getMeanValue(var10, (java.lang.Comparable)100.0f);
//     var0.setDataset((org.jfree.data.category.CategoryDataset)var3);
//     org.jfree.chart.util.TableOrder var14 = var0.getDataExtractOrder();
//     org.jfree.chart.plot.MultiplePiePlot var15 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var16 = var15.getLimit();
//     var15.setLimit(1.0d);
//     org.jfree.chart.plot.MultiplePiePlot var19 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var20 = var19.getLimit();
//     double var21 = var19.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var24 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var22, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var25 = null;
//     org.jfree.chart.plot.RingPlot var26 = new org.jfree.chart.plot.RingPlot(var25);
//     org.jfree.chart.plot.Plot var27 = var26.getRootPlot();
//     var22.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var27);
//     java.lang.Comparable var29 = null;
//     java.lang.Number var31 = var22.getMeanValue(var29, (java.lang.Comparable)100.0f);
//     var19.setDataset((org.jfree.data.category.CategoryDataset)var22);
//     org.jfree.chart.util.TableOrder var33 = var19.getDataExtractOrder();
//     var15.setDataExtractOrder(var33);
//     var0.setDataExtractOrder(var33);
//     
//     // Checks the contract:  equals-hashcode on var0 and var19
//     assertTrue("Contract failed: equals-hashcode on var0 and var19", var0.equals(var19) ? var0.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var0
//     assertTrue("Contract failed: equals-hashcode on var19 and var0", var19.equals(var0) ? var19.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var22
//     assertTrue("Contract failed: equals-hashcode on var3 and var22", var3.equals(var22) ? var3.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var3
//     assertTrue("Contract failed: equals-hashcode on var22 and var3", var22.equals(var3) ? var22.hashCode() == var3.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var26
//     assertTrue("Contract failed: equals-hashcode on var7 and var26", var7.equals(var26) ? var7.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var7
//     assertTrue("Contract failed: equals-hashcode on var26 and var7", var26.equals(var7) ? var26.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var27
//     assertTrue("Contract failed: equals-hashcode on var8 and var27", var8.equals(var27) ? var8.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var8
//     assertTrue("Contract failed: equals-hashcode on var27 and var8", var27.equals(var8) ? var27.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     boolean var21 = var12.equals((java.lang.Object)var13);
//     org.jfree.chart.title.TextTitle var22 = var12.getTitle();
//     java.awt.Graphics2D var23 = null;
//     java.awt.geom.Rectangle2D var24 = null;
//     org.jfree.chart.axis.DateAxis var25 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var29 = var26.getLegendItem((-1), 100);
//     var26.setBaseShapesFilled(false);
//     java.awt.Paint var33 = var26.getSeriesOutlinePaint((-1));
//     java.awt.Paint var35 = var26.lookupSeriesOutlinePaint(0);
//     var25.setLabelPaint(var35);
//     boolean var37 = var25.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var39 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var40 = var39.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var41 = var39.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var42 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var44 = var42.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var47 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var50 = var47.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var51 = null;
//     org.jfree.chart.plot.RingPlot var52 = new org.jfree.chart.plot.RingPlot(var51);
//     org.jfree.chart.plot.Plot var53 = var52.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var54 = null;
//     var52.axisChanged(var54);
//     org.jfree.chart.JFreeChart var57 = new org.jfree.chart.JFreeChart("hi!", var50, (org.jfree.chart.plot.Plot)var52, true);
//     boolean var58 = var42.equals((java.lang.Object)var50);
//     var42.validateObject();
//     org.jfree.data.Range var60 = var39.findRangeBounds((org.jfree.data.category.CategoryDataset)var42);
//     org.jfree.data.general.DatasetChangeEvent var61 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var37, (org.jfree.data.general.Dataset)var42);
//     org.jfree.data.Range var62 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.category.CategoryDataset)var42);
//     java.lang.Object var63 = var22.draw(var23, var24, (java.lang.Object)var62);
//     
//     // Checks the contract:  equals-hashcode on var7 and var52
//     assertTrue("Contract failed: equals-hashcode on var7 and var52", var7.equals(var52) ? var7.hashCode() == var52.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var7
//     assertTrue("Contract failed: equals-hashcode on var52 and var7", var52.equals(var7) ? var52.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var53
//     assertTrue("Contract failed: equals-hashcode on var8 and var53", var8.equals(var53) ? var8.hashCode() == var53.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var53 and var8
//     assertTrue("Contract failed: equals-hashcode on var53 and var8", var53.equals(var8) ? var53.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var57
//     assertTrue("Contract failed: equals-hashcode on var12 and var57", var12.equals(var57) ? var12.hashCode() == var57.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var57 and var12
//     assertTrue("Contract failed: equals-hashcode on var57 and var12", var57.equals(var12) ? var57.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test306() {}
//   public void test306() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Color var3 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var4 = null;
//     float[] var5 = var3.getRGBColorComponents(var4);
//     java.awt.Color var8 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var9 = null;
//     float[] var10 = var8.getRGBColorComponents(var9);
//     float[] var11 = var3.getColorComponents(var9);
//     var0.setBaseItemLabelPaint((java.awt.Paint)var3);
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(10.0d);
//     boolean var15 = var3.equals((java.lang.Object)10.0d);
//     int var16 = var3.getRed();
//     java.awt.color.ColorSpace var17 = null;
//     float[] var24 = new float[] { 100.0f, 100.0f, 0.0f};
//     float[] var25 = java.awt.Color.RGBtoHSB(0, (-457), 2, var24);
//     float[] var26 = var3.getComponents(var17, var25);
// 
//   }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    double var2 = var1.getInteriorGap();
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var5 = var4.isTickMarksVisible();
    org.jfree.data.Range var8 = new org.jfree.data.Range(1.0d, 100.0d);
    var4.setRangeWithMargins(var8, false, false);
    java.text.NumberFormat var12 = var4.getNumberFormatOverride();
    org.jfree.chart.axis.NumberTickUnit var13 = var4.getTickUnit();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var17 = var14.getLegendItem(2, 0);
    double var18 = var14.getBase();
    org.jfree.chart.labels.ItemLabelPosition var21 = var14.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var25 = var22.getLegendItem((-1), 100);
    var22.setBaseShapesFilled(false);
    java.awt.Paint var30 = var22.getItemOutlinePaint(10, 1);
    var14.setErrorIndicatorPaint(var30);
    var1.setSectionPaint((java.lang.Comparable)var13, var30);
    var1.setCircular(true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test308() {}
//   public void test308() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
//     org.jfree.chart.plot.CategoryMarker var5 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var6 = var5.getOutlineStroke();
//     var3.setBorderStroke(var6);
//     org.jfree.data.general.PieDataset var8 = null;
//     org.jfree.chart.plot.RingPlot var9 = new org.jfree.chart.plot.RingPlot(var8);
//     org.jfree.chart.plot.Plot var10 = var9.getRootPlot();
//     org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var9);
//     java.awt.image.BufferedImage var14 = var11.createBufferedImage(1, 2);
//     var3.setBackgroundImage((java.awt.Image)var14);
//     
//     // Checks the contract:  equals-hashcode on var1 and var9
//     assertTrue("Contract failed: equals-hashcode on var1 and var9", var1.equals(var9) ? var1.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var1
//     assertTrue("Contract failed: equals-hashcode on var9 and var1", var9.equals(var1) ? var9.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var10
//     assertTrue("Contract failed: equals-hashcode on var2 and var10", var2.equals(var10) ? var2.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var2
//     assertTrue("Contract failed: equals-hashcode on var10 and var2", var10.equals(var2) ? var10.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
    double var1 = var0.getLimit();
    var0.setLimit(1.0d);
    org.jfree.chart.util.TableOrder var4 = var0.getDataExtractOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test310() {}
//   public void test310() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var6.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var10 = var6.getBaseLinesVisible();
//     java.lang.Boolean var12 = var6.getSeriesVisibleInLegend(10);
//     java.awt.Paint var13 = var6.getBaseItemLabelPaint();
//     org.jfree.chart.text.TextFragment var14 = new org.jfree.chart.text.TextFragment("", var5, var13);
//     java.awt.Graphics2D var15 = null;
//     org.jfree.chart.util.Size2D var16 = var14.calculateDimensions(var15);
// 
//   }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    var0.setDomainCrosshairValue(0.05d);
    java.awt.Paint var3 = var0.getDomainCrosshairPaint();
    var0.mapDatasetToRangeAxis(1, 15);
    org.jfree.chart.plot.CategoryMarker var8 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var9 = var8.getOutlineStroke();
    var0.setDomainCrosshairStroke(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
    var1.setBaseShapesFilled(false);
    java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
    java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
    var0.setLabelPaint(var10);
    double var12 = var0.getFixedAutoRange();
    org.jfree.chart.axis.DateAxis var13 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var17 = var14.getLegendItem((-1), 100);
    var14.setBaseShapesFilled(false);
    java.awt.Paint var21 = var14.getSeriesOutlinePaint((-1));
    java.awt.Paint var23 = var14.lookupSeriesOutlinePaint(0);
    var13.setLabelPaint(var23);
    org.jfree.chart.axis.DateTickMarkPosition var25 = var13.getTickMarkPosition();
    var0.setTickMarkPosition(var25);
    java.lang.String var27 = var25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "DateTickMarkPosition.START"+ "'", var27.equals("DateTickMarkPosition.START"));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    java.lang.Number var9 = var0.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
    org.jfree.data.general.DatasetGroup var10 = var0.getGroup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var12 = var0.getRowKey(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     org.jfree.chart.renderer.category.LineRenderer3D var0 = new org.jfree.chart.renderer.category.LineRenderer3D();
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.axis.DateAxis var2 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var6 = var3.getLegendItem((-1), 100);
//     var3.setBaseShapesFilled(false);
//     java.awt.Paint var10 = var3.getSeriesOutlinePaint((-1));
//     java.awt.Paint var12 = var3.lookupSeriesOutlinePaint(0);
//     var2.setLabelPaint(var12);
//     boolean var14 = var2.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var16 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var17 = var16.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var18 = var16.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var21 = var19.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var24 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var27 = var24.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var28 = null;
//     org.jfree.chart.plot.RingPlot var29 = new org.jfree.chart.plot.RingPlot(var28);
//     org.jfree.chart.plot.Plot var30 = var29.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var31 = null;
//     var29.axisChanged(var31);
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("hi!", var27, (org.jfree.chart.plot.Plot)var29, true);
//     boolean var35 = var19.equals((java.lang.Object)var27);
//     var19.validateObject();
//     org.jfree.data.Range var37 = var16.findRangeBounds((org.jfree.data.category.CategoryDataset)var19);
//     org.jfree.data.general.DatasetChangeEvent var38 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var14, (org.jfree.data.general.Dataset)var19);
//     org.jfree.data.Range var39 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.category.CategoryDataset)var19);
//     org.jfree.data.category.CategoryDataset var40 = null;
//     org.jfree.chart.axis.CategoryAxis var42 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var42.setUpperMargin(0.0d);
//     int var45 = var42.getMaximumCategoryLabelLines();
//     java.lang.Object var46 = var42.clone();
//     org.jfree.chart.axis.DateAxis var47 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var51 = var48.getLegendItem((-1), 100);
//     var48.setBaseShapesFilled(false);
//     java.awt.Paint var55 = var48.getSeriesOutlinePaint((-1));
//     java.awt.Paint var57 = var48.lookupSeriesOutlinePaint(0);
//     var47.setLabelPaint(var57);
//     double var59 = var47.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var63 = var60.getLegendItem(2, 0);
//     double var64 = var60.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var67 = var60.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var71 = var68.getLegendItem((-1), 100);
//     var68.setBaseShapesFilled(false);
//     java.awt.Paint var76 = var68.getItemOutlinePaint(10, 1);
//     var60.setErrorIndicatorPaint(var76);
//     org.jfree.chart.plot.CategoryPlot var78 = new org.jfree.chart.plot.CategoryPlot(var40, var42, (org.jfree.chart.axis.ValueAxis)var47, (org.jfree.chart.renderer.category.CategoryItemRenderer)var60);
//     var78.setRangeCrosshairValue(50.5d);
//     boolean var81 = var19.hasListener((java.util.EventListener)var78);
//     org.jfree.chart.axis.CategoryAxis var83 = var78.getDomainAxis(1);
//     java.awt.geom.Rectangle2D var84 = null;
//     var0.drawDomainGridline(var1, var78, var84, 0.35d);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.jfree.data.UnknownKeyException var1 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.RendererChangeEvent[source=false]");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.jfree.data.UnknownKeyException: org.jfree.chart.event.RendererChangeEvent[source=false]"+ "'", var2.equals("org.jfree.data.UnknownKeyException: org.jfree.chart.event.RendererChangeEvent[source=false]"));

  }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Graphics2D var2 = null;
//     org.jfree.chart.axis.AxisState var3 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     org.jfree.chart.plot.XYPlot var5 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var7 = new org.jfree.chart.axis.NumberAxis3D("");
//     var7.configure();
//     org.jfree.chart.util.RectangleInsets var9 = var7.getLabelInsets();
//     var5.setAxisOffset(var9);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var12 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var13 = var12.getEndType();
//     java.awt.Stroke var16 = var12.getItemStroke(0, 0);
//     var5.setRangeZeroBaselineStroke(var16);
//     org.jfree.chart.util.Layer var18 = null;
//     java.util.Collection var19 = var5.getDomainMarkers(var18);
//     org.jfree.chart.util.RectangleInsets var20 = var5.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var22 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var23 = var22.getEndType();
//     java.awt.Stroke var26 = var22.getItemStroke(0, 0);
//     var5.setDomainZeroBaselineStroke(var26);
//     org.jfree.chart.util.RectangleEdge var28 = var5.getDomainAxisEdge();
//     boolean var29 = org.jfree.chart.util.RectangleEdge.isLeftOrRight(var28);
//     java.util.List var30 = var1.refreshTicks(var2, var3, var4, var28);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.jfree.data.time.Month var1 = new org.jfree.data.time.Month();
    org.jfree.data.gantt.Task var2 = new org.jfree.data.gantt.Task("ThreadContext", (org.jfree.data.time.TimePeriod)var1);
    org.jfree.chart.plot.XYPlot var3 = new org.jfree.chart.plot.XYPlot();
    var3.setDomainCrosshairValue(0.05d);
    java.awt.Paint var6 = var3.getDomainCrosshairPaint();
    org.jfree.chart.plot.IntervalMarker var10 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
    double var11 = var10.getEndValue();
    var10.setStartValue(0.2d);
    org.jfree.chart.util.Layer var14 = null;
    var3.addRangeMarker(0, (org.jfree.chart.plot.Marker)var10, var14);
    boolean var16 = var2.equals((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.gantt.Task var18 = var2.getSubtask((-457));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }
// 
// 
//     org.jfree.data.time.SerialDate var1 = null;
//     org.jfree.data.time.SerialDate var2 = org.jfree.data.time.SerialDate.addMonths((-1), var1);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(2, 0);
    double var4 = var0.getBase();
    org.jfree.chart.labels.ItemLabelPosition var7 = var0.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var16 = var8.getItemOutlinePaint(10, 1);
    var0.setErrorIndicatorPaint(var16);
    java.awt.Stroke var19 = var0.lookupSeriesOutlineStroke(0);
    var0.setItemMargin(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var2 = var1.getLabelPaint();
    org.jfree.chart.text.TextAnchor var3 = var1.getLabelTextAnchor();
    float var4 = var1.getAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0f);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    java.awt.geom.Point2D var10 = var0.getQuadrantOrigin();
    org.jfree.chart.plot.DatasetRenderingOrder var11 = var0.getDatasetRenderingOrder();
    int var12 = var0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     boolean var6 = var0.equals((java.lang.Object)100.0f);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var8.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
//     var12.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var12.getItemOutlinePaint(10, 1);
//     var8.setBaseItemLabelPaint(var20);
//     var0.setSeriesFillPaint(100, var20, false);
//     org.jfree.chart.labels.ItemLabelPosition var24 = var0.getBaseNegativeItemLabelPosition();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var29 = var26.getLegendItem((-1), 100);
//     var26.setBaseShapesFilled(false);
//     java.awt.Paint var34 = var26.getItemOutlinePaint(10, 1);
//     java.awt.Paint var36 = var26.getSeriesOutlinePaint(10);
//     var26.setUseFillPaint(false);
//     var26.setSeriesCreateEntities(100, (java.lang.Boolean)true, false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var47 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var50 = var47.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var51 = null;
//     org.jfree.chart.plot.RingPlot var52 = new org.jfree.chart.plot.RingPlot(var51);
//     org.jfree.chart.plot.Plot var53 = var52.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var54 = null;
//     var52.axisChanged(var54);
//     org.jfree.chart.JFreeChart var57 = new org.jfree.chart.JFreeChart("hi!", var50, (org.jfree.chart.plot.Plot)var52, true);
//     org.jfree.chart.block.LabelBlock var58 = new org.jfree.chart.block.LabelBlock("Range[1.0,100.0]", var50);
//     java.lang.Object var59 = var58.clone();
//     java.awt.Font var60 = var58.getFont();
//     var26.setSeriesItemLabelFont(0, var60);
//     var0.setSeriesItemLabelFont(15, var60, false);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var12 and var26.", var12.equals(var26) == var26.equals(var12));
// 
//   }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
    java.awt.Stroke var11 = var7.getItemStroke(0, 0);
    var0.setRangeZeroBaselineStroke(var11);
    org.jfree.chart.util.Layer var13 = null;
    java.util.Collection var14 = var0.getDomainMarkers(var13);
    org.jfree.chart.util.RectangleInsets var15 = var0.getInsets();
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
    java.awt.Stroke var21 = var17.getItemStroke(0, 0);
    var0.setDomainZeroBaselineStroke(var21);
    org.jfree.chart.util.RectangleEdge var24 = var0.getDomainAxisEdge(1);
    var0.setRangeCrosshairValue((-1.0d), false);
    org.jfree.chart.renderer.xy.XYItemRenderer var28 = var0.getRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.jfree.chart.util.StrokeList var0 = new org.jfree.chart.util.StrokeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var2 = var1.isTickMarksVisible();
    org.jfree.data.Range var5 = new org.jfree.data.Range(1.0d, 100.0d);
    var1.setRangeWithMargins(var5, false, false);
    java.text.NumberFormat var9 = var1.getNumberFormatOverride();
    boolean var10 = var1.isVerticalTickLabels();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var6 = var5.getTickLabelPaint();
    java.awt.Shape var7 = var5.getUpArrow();
    org.jfree.chart.axis.NumberAxis3D var9 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var10 = var9.getTickLabelPaint();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var14 = var11.getLegendItem(2, 0);
    double var15 = var11.getBase();
    java.awt.Color var18 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var19 = null;
    float[] var20 = var18.getRGBColorComponents(var19);
    java.awt.Color var23 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var24 = null;
    float[] var25 = var23.getRGBColorComponents(var24);
    float[] var26 = var18.getColorComponents(var24);
    var11.setErrorIndicatorPaint((java.awt.Paint)var18);
    org.jfree.chart.plot.XYPlot var28 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var30 = new org.jfree.chart.axis.NumberAxis3D("");
    var30.configure();
    org.jfree.chart.util.RectangleInsets var32 = var30.getLabelInsets();
    var28.setAxisOffset(var32);
    org.jfree.chart.plot.CategoryMarker var35 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var36 = var35.getOutlineStroke();
    var28.addDomainMarker((org.jfree.chart.plot.Marker)var35);
    java.awt.geom.Point2D var38 = var28.getQuadrantOrigin();
    java.awt.Paint var39 = var28.getDomainCrosshairPaint();
    org.jfree.chart.renderer.category.StackedAreaRenderer var41 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var42 = var41.getEndType();
    java.awt.Paint var43 = var41.getBaseFillPaint();
    org.jfree.chart.renderer.category.WaterfallBarRenderer var44 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(var10, (java.awt.Paint)var18, var39, var43);
    java.awt.Stroke var45 = null;
    org.jfree.data.general.PieDataset var46 = null;
    org.jfree.chart.plot.RingPlot var47 = new org.jfree.chart.plot.RingPlot(var46);
    org.jfree.chart.plot.Plot var48 = var47.getRootPlot();
    org.jfree.chart.util.RectangleInsets var49 = var47.getInsets();
    java.awt.Stroke var50 = var47.getLabelOutlineStroke();
    java.awt.Paint var51 = var47.getLabelShadowPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var52 = new org.jfree.chart.LegendItem("Pie Plot", "org.jfree.chart.event.RendererChangeEvent[source=false]", "AreaRendererEndType.TAPER", "org.jfree.chart.event.RendererChangeEvent[source=false]", var7, var10, var45, var51);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var1.getSectionOutlinesVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }
// 
// 
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var1 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var4 = var3.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var5 = var3.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var8 = var6.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var11 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var14 = var11.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var15 = null;
//     org.jfree.chart.plot.RingPlot var16 = new org.jfree.chart.plot.RingPlot(var15);
//     org.jfree.chart.plot.Plot var17 = var16.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var18 = null;
//     var16.axisChanged(var18);
//     org.jfree.chart.JFreeChart var21 = new org.jfree.chart.JFreeChart("hi!", var14, (org.jfree.chart.plot.Plot)var16, true);
//     boolean var22 = var6.equals((java.lang.Object)var14);
//     var6.validateObject();
//     org.jfree.data.Range var24 = var3.findRangeBounds((org.jfree.data.category.CategoryDataset)var6);
//     java.awt.Stroke var26 = var3.lookupSeriesStroke(10);
//     var1.setGroupStroke(var26);
//     javax.swing.Icon var28 = var1.getMaxIcon();
//     var0.setMinIcon(var28);
//     org.jfree.data.general.PieDataset var30 = null;
//     org.jfree.chart.plot.RingPlot var31 = new org.jfree.chart.plot.RingPlot(var30);
//     org.jfree.chart.plot.Plot var32 = var31.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var33 = null;
//     var31.axisChanged(var33);
//     var31.setShadowYOffset(0.0d);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var40 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var43 = var40.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var44 = null;
//     org.jfree.chart.plot.RingPlot var45 = new org.jfree.chart.plot.RingPlot(var44);
//     org.jfree.chart.plot.Plot var46 = var45.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var47 = null;
//     var45.axisChanged(var47);
//     org.jfree.chart.JFreeChart var50 = new org.jfree.chart.JFreeChart("hi!", var43, (org.jfree.chart.plot.Plot)var45, true);
//     java.util.List var51 = var50.getSubtitles();
//     java.awt.Stroke var52 = var50.getBorderStroke();
//     var31.setSectionOutlineStroke((java.lang.Comparable)0.0d, var52);
//     java.awt.Paint var54 = var31.getBaseSectionOutlinePaint();
//     var0.setGroupPaint(var54);
//     
//     // Checks the contract:  equals-hashcode on var16 and var45
//     assertTrue("Contract failed: equals-hashcode on var16 and var45", var16.equals(var45) ? var16.hashCode() == var45.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var45 and var16
//     assertTrue("Contract failed: equals-hashcode on var45 and var16", var45.equals(var16) ? var45.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var46
//     assertTrue("Contract failed: equals-hashcode on var17 and var46", var17.equals(var46) ? var17.hashCode() == var46.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var17
//     assertTrue("Contract failed: equals-hashcode on var46 and var17", var46.equals(var17) ? var46.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var50
//     assertTrue("Contract failed: equals-hashcode on var21 and var50", var21.equals(var50) ? var21.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var21
//     assertTrue("Contract failed: equals-hashcode on var50 and var21", var50.equals(var21) ? var50.hashCode() == var21.hashCode() : true);
// 
//   }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    java.awt.Shape[] var0 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }
// 
// 
//     org.jfree.chart.renderer.category.LineRenderer3D var0 = new org.jfree.chart.renderer.category.LineRenderer3D();
//     double var1 = var0.getYOffset();
//     java.awt.Graphics2D var2 = null;
//     org.jfree.data.category.CategoryDataset var3 = null;
//     org.jfree.chart.axis.CategoryAxis var5 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var5.setUpperMargin(0.0d);
//     int var8 = var5.getMaximumCategoryLabelLines();
//     java.lang.Object var9 = var5.clone();
//     org.jfree.chart.axis.DateAxis var10 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var14 = var11.getLegendItem((-1), 100);
//     var11.setBaseShapesFilled(false);
//     java.awt.Paint var18 = var11.getSeriesOutlinePaint((-1));
//     java.awt.Paint var20 = var11.lookupSeriesOutlinePaint(0);
//     var10.setLabelPaint(var20);
//     double var22 = var10.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var26 = var23.getLegendItem(2, 0);
//     double var27 = var23.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var30 = var23.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var34 = var31.getLegendItem((-1), 100);
//     var31.setBaseShapesFilled(false);
//     java.awt.Paint var39 = var31.getItemOutlinePaint(10, 1);
//     var23.setErrorIndicatorPaint(var39);
//     org.jfree.chart.plot.CategoryPlot var41 = new org.jfree.chart.plot.CategoryPlot(var3, var5, (org.jfree.chart.axis.ValueAxis)var10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var23);
//     var41.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var45 = var41.getDomainAxisForDataset(1);
//     org.jfree.chart.axis.NumberAxis3D var47 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var48 = var47.isTickMarksVisible();
//     org.jfree.data.Range var51 = new org.jfree.data.Range(1.0d, 100.0d);
//     var47.setRangeWithMargins(var51, false, false);
//     org.jfree.chart.axis.ValueAxis[] var55 = new org.jfree.chart.axis.ValueAxis[] { var47};
//     var41.setRangeAxes(var55);
//     java.awt.geom.Rectangle2D var57 = null;
//     var0.drawBackground(var2, var41, var57);
// 
//   }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var9 = null;
    var7.axisChanged(var9);
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
    java.lang.Object var13 = var7.clone();
    java.awt.Paint var14 = var7.getLabelLinkPaint();
    double var15 = var7.getStartAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 90.0d);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var2.setUpperMargin(0.0d);
    int var5 = var2.getMaximumCategoryLabelLines();
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
    java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
    var7.setLabelPaint(var17);
    double var19 = var7.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
    double var24 = var20.getBase();
    org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
    var28.setBaseShapesFilled(false);
    java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
    var20.setErrorIndicatorPaint(var36);
    org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
    var38.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxisForDataset(1);
    org.jfree.chart.axis.CategoryAxis var44 = new org.jfree.chart.axis.CategoryAxis();
    var38.setDomainAxis(0, var44, false);
    java.awt.Shape var47 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.AxisLabelEntity var50 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var44, var47, "java.awt.Color[r=0,g=0,b=10]", "poly");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    int var1 = var0.getColumnCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var4 = var0.getValue(2, 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var41 = new org.jfree.chart.axis.AxisSpace();
//     double var42 = var41.getLeft();
//     var38.setFixedRangeAxisSpace(var41);
//     org.jfree.chart.axis.AxisSpace var44 = new org.jfree.chart.axis.AxisSpace();
//     double var45 = var44.getLeft();
//     var38.setFixedRangeAxisSpace(var44);
//     var38.setRangeCrosshairLockedOnData(false);
//     var38.clearDomainMarkers();
//     org.jfree.data.category.CategoryDataset var50 = null;
//     org.jfree.chart.axis.CategoryAxis var52 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var52.setUpperMargin(0.0d);
//     int var55 = var52.getMaximumCategoryLabelLines();
//     java.lang.Object var56 = var52.clone();
//     org.jfree.chart.axis.DateAxis var57 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var61 = var58.getLegendItem((-1), 100);
//     var58.setBaseShapesFilled(false);
//     java.awt.Paint var65 = var58.getSeriesOutlinePaint((-1));
//     java.awt.Paint var67 = var58.lookupSeriesOutlinePaint(0);
//     var57.setLabelPaint(var67);
//     double var69 = var57.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var70 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var73 = var70.getLegendItem(2, 0);
//     double var74 = var70.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var77 = var70.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var78 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var81 = var78.getLegendItem((-1), 100);
//     var78.setBaseShapesFilled(false);
//     java.awt.Paint var86 = var78.getItemOutlinePaint(10, 1);
//     var70.setErrorIndicatorPaint(var86);
//     org.jfree.chart.plot.CategoryPlot var88 = new org.jfree.chart.plot.CategoryPlot(var50, var52, (org.jfree.chart.axis.ValueAxis)var57, (org.jfree.chart.renderer.category.CategoryItemRenderer)var70);
//     org.jfree.chart.axis.CategoryAnchor var89 = var88.getDomainGridlinePosition();
//     var38.setDomainGridlinePosition(var89);
//     
//     // Checks the contract:  equals-hashcode on var27 and var77
//     assertTrue("Contract failed: equals-hashcode on var27 and var77", var27.equals(var77) ? var27.hashCode() == var77.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var77 and var27
//     assertTrue("Contract failed: equals-hashcode on var77 and var27", var77.equals(var27) ? var77.hashCode() == var27.hashCode() : true);
// 
//   }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }
// 
// 
//     org.jfree.chart.util.HorizontalAlignment var0 = null;
//     org.jfree.chart.util.VerticalAlignment var1 = null;
//     org.jfree.chart.block.FlowArrangement var4 = new org.jfree.chart.block.FlowArrangement(var0, var1, Double.NaN, 4.0d);
//     org.jfree.chart.block.BlockContainer var5 = new org.jfree.chart.block.BlockContainer();
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.block.RectangleConstraint var9 = new org.jfree.chart.block.RectangleConstraint(1.0d, (-1.0d));
//     org.jfree.chart.util.Size2D var10 = var4.arrange(var5, var6, var9);
//     java.awt.Graphics2D var11 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     var5.draw(var11, var12);
// 
//   }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.jfree.chart.block.FlowArrangement var0 = new org.jfree.chart.block.FlowArrangement();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var3 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var1, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var4 = null;
//     org.jfree.chart.plot.RingPlot var5 = new org.jfree.chart.plot.RingPlot(var4);
//     org.jfree.chart.plot.Plot var6 = var5.getRootPlot();
//     var1.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var6);
//     org.jfree.data.KeyToGroupMap var16 = new org.jfree.data.KeyToGroupMap();
//     java.util.List var17 = var16.getGroups();
//     org.jfree.data.statistics.BoxAndWhiskerItem var18 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var17);
//     var1.add(var18, (java.lang.Comparable)0.0f, (java.lang.Comparable)"hi!");
//     org.jfree.chart.title.LegendItemBlockContainer var23 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement)var0, (org.jfree.data.general.Dataset)var1, (java.lang.Comparable)false);
//     var23.setToolTipText("AreaRendererEndType.TAPER");
//     org.jfree.chart.renderer.category.StackedBarRenderer var27 = new org.jfree.chart.renderer.category.StackedBarRenderer(false);
//     org.jfree.chart.plot.MultiplePiePlot var28 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var29 = var28.getLimit();
//     double var30 = var28.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var31 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var33 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var31, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var34 = null;
//     org.jfree.chart.plot.RingPlot var35 = new org.jfree.chart.plot.RingPlot(var34);
//     org.jfree.chart.plot.Plot var36 = var35.getRootPlot();
//     var31.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var36);
//     java.lang.Comparable var38 = null;
//     java.lang.Number var40 = var31.getMeanValue(var38, (java.lang.Comparable)100.0f);
//     var28.setDataset((org.jfree.data.category.CategoryDataset)var31);
//     org.jfree.data.Range var42 = var27.findRangeBounds((org.jfree.data.category.CategoryDataset)var31);
//     boolean var43 = var23.equals((java.lang.Object)var27);
//     
//     // Checks the contract:  equals-hashcode on var5 and var35
//     assertTrue("Contract failed: equals-hashcode on var5 and var35", var5.equals(var35) ? var5.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var5
//     assertTrue("Contract failed: equals-hashcode on var35 and var5", var35.equals(var5) ? var35.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var36
//     assertTrue("Contract failed: equals-hashcode on var6 and var36", var6.equals(var36) ? var6.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var6
//     assertTrue("Contract failed: equals-hashcode on var36 and var6", var36.equals(var6) ? var36.hashCode() == var6.hashCode() : true);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
    var3.configure();
    java.lang.Object var5 = var3.clone();
    java.lang.Number var8 = null;
    java.util.List var14 = null;
    org.jfree.data.statistics.BoxAndWhiskerItem var15 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var8, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var14);
    boolean var16 = var3.equals((java.lang.Object)0);
    boolean var17 = var3.isAutoRange();
    java.awt.Font var18 = var3.getLabelFont();
    org.jfree.chart.plot.CategoryMarker var20 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
    java.lang.Object var21 = var20.clone();
    java.awt.Paint var22 = var20.getOutlinePaint();
    org.jfree.chart.block.LabelBlock var23 = new org.jfree.chart.block.LabelBlock("Size2D[width=50.5, height=10.0]", var18, var22);
    org.jfree.chart.plot.RingPlot var24 = new org.jfree.chart.plot.RingPlot();
    org.jfree.chart.plot.IntervalMarker var27 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
    double var28 = var27.getEndValue();
    var27.setStartValue(0.2d);
    java.awt.Stroke var31 = var27.getStroke();
    var24.setLabelOutlineStroke(var31);
    org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("poly", var18, (org.jfree.chart.plot.Plot)var24, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.XYPlot var35 = var34.getXYPlot();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test338() {}
//   public void test338() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }
// 
// 
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var3 = var2.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var4 = var2.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var7 = var5.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var10 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var13 = var10.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var14 = null;
//     org.jfree.chart.plot.RingPlot var15 = new org.jfree.chart.plot.RingPlot(var14);
//     org.jfree.chart.plot.Plot var16 = var15.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var17 = null;
//     var15.axisChanged(var17);
//     org.jfree.chart.JFreeChart var20 = new org.jfree.chart.JFreeChart("hi!", var13, (org.jfree.chart.plot.Plot)var15, true);
//     boolean var21 = var5.equals((java.lang.Object)var13);
//     var5.validateObject();
//     org.jfree.data.Range var23 = var2.findRangeBounds((org.jfree.data.category.CategoryDataset)var5);
//     java.awt.Stroke var25 = var2.lookupSeriesStroke(10);
//     var0.setGroupStroke(var25);
//     javax.swing.Icon var27 = var0.getMaxIcon();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSeriesVisible((-16777206), (java.lang.Boolean)false, true);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
// 
//   }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    java.lang.Class var1 = null;
    java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceAsStream("-100,0,0,0,0,100,0,100,0,0,100,0,100,0,0,0,0,-100,0,-100,0,0,-100,0,-100,0", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    boolean var4 = var3.getAntiAlias();
    org.jfree.chart.event.ChartProgressListener var5 = null;
    var3.removeProgressListener(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.CategoryPlot var7 = var3.getCategoryPlot();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.axis.DateAxis var4 = new org.jfree.chart.axis.DateAxis();
    double var5 = var4.getLabelAngle();
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, Double.NaN, Double.NaN);
    var4.setDownArrow(var8);
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false, false);
    org.jfree.chart.renderer.category.StackedAreaRenderer var19 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var22 = var19.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var23 = null;
    org.jfree.chart.plot.RingPlot var24 = new org.jfree.chart.plot.RingPlot(var23);
    org.jfree.chart.plot.Plot var25 = var24.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var26 = null;
    var24.axisChanged(var26);
    org.jfree.chart.JFreeChart var29 = new org.jfree.chart.JFreeChart("hi!", var22, (org.jfree.chart.plot.Plot)var24, true);
    java.awt.Paint var30 = var24.getBackgroundPaint();
    var15.setSeriesItemLabelPaint(0, var30, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var33 = new org.jfree.chart.LegendItem(var0, "DateTickMarkPosition.START", "", "PlotOrientation.VERTICAL", var8, var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
//     var0.setAxisOffset(var4);
//     org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var8 = var7.getOutlineStroke();
//     var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
//     org.jfree.chart.renderer.xy.XYItemRenderer var10 = var0.getRenderer();
//     org.jfree.chart.axis.DateAxis var11 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
//     var12.setBaseShapesFilled(false);
//     java.awt.Paint var19 = var12.getSeriesOutlinePaint((-1));
//     java.awt.Paint var21 = var12.lookupSeriesOutlinePaint(0);
//     var11.setLabelPaint(var21);
//     boolean var23 = var11.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var25 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var26 = var25.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var25.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var30 = var28.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var33 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var36 = var33.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var37 = null;
//     org.jfree.chart.plot.RingPlot var38 = new org.jfree.chart.plot.RingPlot(var37);
//     org.jfree.chart.plot.Plot var39 = var38.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var40 = null;
//     var38.axisChanged(var40);
//     org.jfree.chart.JFreeChart var43 = new org.jfree.chart.JFreeChart("hi!", var36, (org.jfree.chart.plot.Plot)var38, true);
//     boolean var44 = var28.equals((java.lang.Object)var36);
//     var28.validateObject();
//     org.jfree.data.Range var46 = var25.findRangeBounds((org.jfree.data.category.CategoryDataset)var28);
//     org.jfree.data.general.DatasetChangeEvent var47 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var23, (org.jfree.data.general.Dataset)var28);
//     var0.datasetChanged(var47);
//     java.lang.String var49 = var47.toString();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var44 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var49 + "' != '" + "org.jfree.data.general.DatasetChangeEvent[source=false]"+ "'", var49.equals("org.jfree.data.general.DatasetChangeEvent[source=false]"));
// 
//   }

  public void test343() {}
//   public void test343() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedBarRenderer3D var2 = new org.jfree.chart.renderer.category.StackedBarRenderer3D(0.05d, 4.0d);
//     org.jfree.chart.axis.DateAxis var3 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var7 = var4.getLegendItem((-1), 100);
//     var4.setBaseShapesFilled(false);
//     java.awt.Paint var11 = var4.getSeriesOutlinePaint((-1));
//     java.awt.Paint var13 = var4.lookupSeriesOutlinePaint(0);
//     var3.setLabelPaint(var13);
//     boolean var15 = var3.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var19 = var17.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var22 = var20.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var25 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var28 = var25.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var32 = null;
//     var30.axisChanged(var32);
//     org.jfree.chart.JFreeChart var35 = new org.jfree.chart.JFreeChart("hi!", var28, (org.jfree.chart.plot.Plot)var30, true);
//     boolean var36 = var20.equals((java.lang.Object)var28);
//     var20.validateObject();
//     org.jfree.data.Range var38 = var17.findRangeBounds((org.jfree.data.category.CategoryDataset)var20);
//     org.jfree.data.general.DatasetChangeEvent var39 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var15, (org.jfree.data.general.Dataset)var20);
//     org.jfree.data.Range var40 = org.jfree.data.general.DatasetUtilities.findRangeBounds((org.jfree.data.category.CategoryDataset)var20);
//     org.jfree.chart.plot.MultiplePiePlot var41 = new org.jfree.chart.plot.MultiplePiePlot((org.jfree.data.category.CategoryDataset)var20);
//     org.jfree.data.Range var42 = var2.findRangeBounds((org.jfree.data.category.CategoryDataset)var20);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var45 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var48 = var45.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var49 = null;
//     org.jfree.chart.plot.RingPlot var50 = new org.jfree.chart.plot.RingPlot(var49);
//     org.jfree.chart.plot.Plot var51 = var50.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var52 = null;
//     var50.axisChanged(var52);
//     org.jfree.chart.JFreeChart var55 = new org.jfree.chart.JFreeChart("hi!", var48, (org.jfree.chart.plot.Plot)var50, true);
//     java.lang.Object var56 = var50.clone();
//     org.jfree.chart.util.HorizontalAlignment var57 = null;
//     org.jfree.chart.util.VerticalAlignment var58 = null;
//     org.jfree.chart.block.FlowArrangement var61 = new org.jfree.chart.block.FlowArrangement(var57, var58, 100.0d, 10.0d);
//     var61.clear();
//     org.jfree.chart.block.Arrangement var63 = null;
//     org.jfree.chart.title.LegendTitle var64 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var50, (org.jfree.chart.block.Arrangement)var61, var63);
//     org.jfree.data.UnknownKeyException var66 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var67 = var66.getSuppressed();
//     java.lang.Throwable[] var68 = var66.getSuppressed();
//     boolean var69 = var64.equals((java.lang.Object)var68);
//     org.jfree.chart.util.RectangleInsets var70 = var64.getItemLabelPadding();
//     java.awt.Graphics2D var71 = null;
//     org.jfree.chart.block.RectangleConstraint var74 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     double var75 = var74.getWidth();
//     org.jfree.chart.util.Size2D var76 = var64.arrange(var71, var74);
//     org.jfree.chart.util.RectangleEdge var77 = var64.getLegendItemGraphicEdge();
//     boolean var78 = var2.equals((java.lang.Object)var77);
//     
//     // Checks the contract:  equals-hashcode on var30 and var50
//     assertTrue("Contract failed: equals-hashcode on var30 and var50", var30.equals(var50) ? var30.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var30
//     assertTrue("Contract failed: equals-hashcode on var50 and var30", var50.equals(var30) ? var50.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var51
//     assertTrue("Contract failed: equals-hashcode on var31 and var51", var31.equals(var51) ? var31.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var31
//     assertTrue("Contract failed: equals-hashcode on var51 and var31", var51.equals(var31) ? var51.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var55
//     assertTrue("Contract failed: equals-hashcode on var35 and var55", var35.equals(var55) ? var35.hashCode() == var55.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var55 and var35
//     assertTrue("Contract failed: equals-hashcode on var55 and var35", var55.equals(var35) ? var55.hashCode() == var35.hashCode() : true);
// 
//   }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
    java.awt.Paint var7 = var0.getBaseItemLabelPaint();
    var0.setDrawOutlines(false);
    var0.setSeriesVisible(1, (java.lang.Boolean)true, false);
    var0.setUseFillPaint(true);
    org.jfree.chart.LegendItemCollection var16 = var0.getLegendItems();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     org.jfree.data.UnknownKeyException var23 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var24 = var23.getSuppressed();
//     java.lang.Throwable[] var25 = var23.getSuppressed();
//     boolean var26 = var21.equals((java.lang.Object)var25);
//     java.awt.Graphics2D var27 = null;
//     java.awt.geom.Rectangle2D var28 = null;
//     org.jfree.chart.plot.IntervalMarker var31 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     var31.setEndValue((-1.0d));
//     java.lang.Object var34 = var21.draw(var27, var28, (java.lang.Object)var31);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("Range[1.0,100.0]");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     org.jfree.chart.plot.CategoryMarker var1 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var2 = var1.getOutlineStroke();
//     java.lang.Class var3 = null;
//     java.util.EventListener[] var4 = var1.getListeners(var3);
// 
//   }

  public void test348() {}
//   public void test348() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 10.0f);
// 
//   }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    boolean var6 = var0.equals((java.lang.Object)100.0f);
    org.jfree.chart.event.RendererChangeEvent var7 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var6);
    java.lang.String var8 = var7.toString();
    org.jfree.data.general.PieDataset var9 = null;
    org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot(var9);
    org.jfree.chart.plot.Plot var11 = var10.getRootPlot();
    org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var10);
    java.lang.Object var13 = var12.clone();
    var7.setChart(var12);
    java.awt.Paint var15 = var12.getBorderPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.jfree.chart.event.RendererChangeEvent[source=false]"+ "'", var8.equals("org.jfree.chart.event.RendererChangeEvent[source=false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.jfree.chart.util.PaintList var0 = new org.jfree.chart.util.PaintList();
    java.awt.Paint var2 = var0.getPaint(2);
    org.jfree.chart.renderer.category.StackedAreaRenderer var5 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var8 = var5.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var9 = null;
    org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot(var9);
    org.jfree.chart.plot.Plot var11 = var10.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var12 = null;
    var10.axisChanged(var12);
    org.jfree.chart.JFreeChart var15 = new org.jfree.chart.JFreeChart("hi!", var8, (org.jfree.chart.plot.Plot)var10, true);
    java.awt.Paint var16 = var10.getBackgroundPaint();
    java.awt.Paint var17 = var10.getLabelOutlinePaint();
    boolean var18 = var0.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem((-1), 100);
    var0.setBaseShapesFilled(false);
    boolean var6 = var0.getAutoPopulateSeriesStroke();
    org.jfree.data.general.PieDataset var8 = null;
    org.jfree.chart.plot.RingPlot var9 = new org.jfree.chart.plot.RingPlot(var8);
    java.awt.Paint var10 = var9.getBaseSectionPaint();
    double var11 = var9.getMaximumLabelWidth();
    org.jfree.chart.event.PlotChangeEvent var12 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var9);
    var9.setMinimumArcAngleToDraw(100.0d);
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var20 = var17.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var21 = null;
    org.jfree.chart.plot.RingPlot var22 = new org.jfree.chart.plot.RingPlot(var21);
    org.jfree.chart.plot.Plot var23 = var22.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var24 = null;
    var22.axisChanged(var24);
    org.jfree.chart.JFreeChart var27 = new org.jfree.chart.JFreeChart("hi!", var20, (org.jfree.chart.plot.Plot)var22, true);
    java.lang.Object var28 = var22.clone();
    java.awt.Stroke var29 = var22.getSeparatorStroke();
    java.awt.Stroke var30 = var22.getSeparatorStroke();
    var9.setBaseSectionOutlineStroke(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesOutlineStroke((-16777206), var30, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    java.lang.Object var3 = var1.clone();
    boolean var4 = var1.getIgnoreNullValues();
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var5, (java.lang.Comparable)"");
    var1.setDataset(var7);
    double var9 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.Month var2 = new org.jfree.data.time.Month((-16777206), 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    org.jfree.chart.urls.StandardCategoryURLGenerator var3 = new org.jfree.chart.urls.StandardCategoryURLGenerator("org.jfree.data.general.DatasetChangeEvent[source=false]", "", "ThreadContext");

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.data.category.CategoryDataset var3 = null;
    org.jfree.chart.axis.CategoryAxis var5 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var5.setUpperMargin(0.0d);
    int var8 = var5.getMaximumCategoryLabelLines();
    java.lang.Object var9 = var5.clone();
    org.jfree.chart.axis.DateAxis var10 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var14 = var11.getLegendItem((-1), 100);
    var11.setBaseShapesFilled(false);
    java.awt.Paint var18 = var11.getSeriesOutlinePaint((-1));
    java.awt.Paint var20 = var11.lookupSeriesOutlinePaint(0);
    var10.setLabelPaint(var20);
    double var22 = var10.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var26 = var23.getLegendItem(2, 0);
    double var27 = var23.getBase();
    org.jfree.chart.labels.ItemLabelPosition var30 = var23.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var34 = var31.getLegendItem((-1), 100);
    var31.setBaseShapesFilled(false);
    java.awt.Paint var39 = var31.getItemOutlinePaint(10, 1);
    var23.setErrorIndicatorPaint(var39);
    org.jfree.chart.plot.CategoryPlot var41 = new org.jfree.chart.plot.CategoryPlot(var3, var5, (org.jfree.chart.axis.ValueAxis)var10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var23);
    var41.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var45 = var41.getDomainAxis(0);
    var41.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.PlotRenderingInfo var50 = null;
    org.jfree.chart.plot.XYPlot var51 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var53 = new org.jfree.chart.axis.NumberAxis3D("");
    var53.configure();
    org.jfree.chart.util.RectangleInsets var55 = var53.getLabelInsets();
    var51.setAxisOffset(var55);
    org.jfree.chart.plot.CategoryMarker var58 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var59 = var58.getOutlineStroke();
    var51.addDomainMarker((org.jfree.chart.plot.Marker)var58);
    java.awt.geom.Point2D var61 = var51.getQuadrantOrigin();
    var41.zoomRangeAxes(0.0d, 90.0d, var50, var61);
    java.awt.Stroke var63 = var41.getRangeGridlineStroke();
    org.jfree.chart.plot.PlotRenderingInfo var65 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var66 = var0.initialise(var1, var2, var41, (-1), var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    var1.configure();
    java.lang.Object var3 = var1.clone();
    java.lang.Number var6 = null;
    java.util.List var12 = null;
    org.jfree.data.statistics.BoxAndWhiskerItem var13 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var6, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var12);
    boolean var14 = var1.equals((java.lang.Object)0);
    boolean var15 = var1.isAutoRange();
    java.awt.Font var16 = var1.getLabelFont();
    org.jfree.chart.axis.NumberTickUnit var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setTickUnit(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SpreadsheetDate var3 = new org.jfree.data.time.SpreadsheetDate(0, 1, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.jfree.data.function.Function2D var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataset var5 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(var0, (-1.0d), 2.0d, 4, (java.lang.Comparable)"org.jfree.data.general.DatasetChangeEvent[source=false]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     org.jfree.data.time.Month var4 = new org.jfree.data.time.Month();
//     long var5 = var4.getSerialIndex();
//     java.util.Date var6 = var4.getEnd();
//     org.jfree.chart.text.TextBlock var7 = null;
//     org.jfree.chart.text.TextBlockAnchor var8 = null;
//     org.jfree.chart.plot.XYPlot var9 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var11 = new org.jfree.chart.axis.NumberAxis3D("");
//     var11.configure();
//     org.jfree.chart.util.RectangleInsets var13 = var11.getLabelInsets();
//     var9.setAxisOffset(var13);
//     org.jfree.chart.plot.CategoryMarker var16 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var17 = var16.getOutlineStroke();
//     var9.addDomainMarker((org.jfree.chart.plot.Marker)var16);
//     var16.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var22.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var26 = var22.getBaseLinesVisible();
//     java.lang.Boolean var28 = var22.getSeriesVisibleInLegend(10);
//     java.awt.Paint var29 = var22.getBaseItemLabelPaint();
//     java.awt.Color var32 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var33 = null;
//     float[] var34 = var32.getRGBColorComponents(var33);
//     var22.setBaseItemLabelPaint((java.awt.Paint)var32);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var37 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var38 = var37.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var39 = var37.getBaseNegativeItemLabelPosition();
//     var22.setBasePositiveItemLabelPosition(var39, true);
//     var21.setPositiveItemLabelPositionFallback(var39);
//     org.jfree.chart.text.TextAnchor var43 = var39.getRotationAnchor();
//     var16.setLabelTextAnchor(var43);
//     org.jfree.chart.axis.CategoryTick var46 = new org.jfree.chart.axis.CategoryTick((java.lang.Comparable)var6, var7, var8, var43, 2.0d);
//     org.jfree.chart.text.TextUtilities.drawRotatedString("Range[1.0,100.0]", var1, 10.0f, 10.0f, var43, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = new org.jfree.chart.axis.CategoryLabelPositions();
    org.jfree.chart.axis.CategoryLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var2 = var1.isTickMarksVisible();
    org.jfree.chart.axis.NumberTickUnit var3 = var1.getTickUnit();
    var1.setLabelURL("-100,0,0,0,0,100,0,100,0,0,100,0,100,0,0,0,0,-100,0,-100,0,0,-100,0,-100,0");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    boolean var6 = var0.equals((java.lang.Object)100.0f);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var8.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
    var12.setBaseShapesFilled(false);
    java.awt.Paint var20 = var12.getItemOutlinePaint(10, 1);
    var8.setBaseItemLabelPaint(var20);
    var0.setSeriesFillPaint(100, var20, false);
    org.jfree.chart.labels.ItemLabelPosition var24 = var0.getBaseNegativeItemLabelPosition();
    org.jfree.chart.labels.CategoryItemLabelGenerator var27 = var0.getItemLabelGenerator(4, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
//     var0.setAxisOffset(var4);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
//     java.awt.Stroke var11 = var7.getItemStroke(0, 0);
//     var0.setRangeZeroBaselineStroke(var11);
//     org.jfree.chart.util.Layer var13 = null;
//     java.util.Collection var14 = var0.getDomainMarkers(var13);
//     var0.setForegroundAlpha(100.0f);
//     var0.setRangeCrosshairVisible(true);
//     boolean var19 = var0.isRangeZoomable();
//     org.jfree.chart.util.RectangleEdge var21 = var0.getDomainAxisEdge(1);
//     org.jfree.data.general.PieDataset var22 = null;
//     org.jfree.chart.plot.RingPlot var23 = new org.jfree.chart.plot.RingPlot(var22);
//     java.awt.Paint var24 = var23.getBaseSectionPaint();
//     double var25 = var23.getLabelGap();
//     double var26 = var23.getInnerSeparatorExtension();
//     org.jfree.data.general.PieDataset var27 = null;
//     org.jfree.chart.plot.RingPlot var28 = new org.jfree.chart.plot.RingPlot(var27);
//     org.jfree.chart.plot.Plot var29 = var28.getRootPlot();
//     org.jfree.chart.JFreeChart var30 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var28);
//     boolean var31 = var30.getAntiAlias();
//     java.awt.Stroke var32 = var30.getBorderStroke();
//     var23.setOutlineStroke(var32);
//     var0.setRangeGridlineStroke(var32);
//     org.jfree.data.general.PieDataset var35 = null;
//     org.jfree.chart.plot.RingPlot var36 = new org.jfree.chart.plot.RingPlot(var35);
//     java.awt.Paint var37 = var36.getBaseSectionPaint();
//     double var38 = var36.getMaximumLabelWidth();
//     org.jfree.chart.event.PlotChangeEvent var39 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var36);
//     var36.setMinimumArcAngleToDraw(100.0d);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var44 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var47 = var44.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var48 = null;
//     org.jfree.chart.plot.RingPlot var49 = new org.jfree.chart.plot.RingPlot(var48);
//     org.jfree.chart.plot.Plot var50 = var49.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var51 = null;
//     var49.axisChanged(var51);
//     org.jfree.chart.JFreeChart var54 = new org.jfree.chart.JFreeChart("hi!", var47, (org.jfree.chart.plot.Plot)var49, true);
//     java.lang.Object var55 = var49.clone();
//     java.awt.Stroke var56 = var49.getSeparatorStroke();
//     java.awt.Stroke var57 = var49.getSeparatorStroke();
//     var36.setBaseSectionOutlineStroke(var57);
//     var0.setRangeCrosshairStroke(var57);
//     
//     // Checks the contract:  equals-hashcode on var28 and var49
//     assertTrue("Contract failed: equals-hashcode on var28 and var49", var28.equals(var49) ? var28.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var28
//     assertTrue("Contract failed: equals-hashcode on var49 and var28", var49.equals(var28) ? var49.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var50
//     assertTrue("Contract failed: equals-hashcode on var29 and var50", var29.equals(var50) ? var29.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var29
//     assertTrue("Contract failed: equals-hashcode on var50 and var29", var50.equals(var29) ? var50.hashCode() == var29.hashCode() : true);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
    var1.setBaseShapesFilled(false);
    java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
    java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
    var0.setLabelPaint(var10);
    boolean var12 = var0.isNegativeArrowVisible();
    org.jfree.data.Range var15 = new org.jfree.data.Range(1.0d, 100.0d);
    java.lang.String var16 = var15.toString();
    org.jfree.data.Range var18 = org.jfree.data.Range.shift(var15, 0.0d);
    var0.setRange(var18);
    double var20 = var18.getUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Range[1.0,100.0]"+ "'", var16.equals("Range[1.0,100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    org.jfree.chart.renderer.category.StackedAreaRenderer var12 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var15 = var12.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var16 = null;
    org.jfree.chart.plot.RingPlot var17 = new org.jfree.chart.plot.RingPlot(var16);
    org.jfree.chart.plot.Plot var18 = var17.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var19 = null;
    var17.axisChanged(var19);
    org.jfree.chart.JFreeChart var22 = new org.jfree.chart.JFreeChart("hi!", var15, (org.jfree.chart.plot.Plot)var17, true);
    java.awt.Paint var23 = var17.getBackgroundPaint();
    java.awt.Paint var24 = var17.getLabelOutlinePaint();
    var0.setRangeTickBandPaint(var24);
    org.jfree.chart.plot.DatasetRenderingOrder var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDatasetRenderingOrder(var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    var1.addValue((java.lang.Number)(byte)100, (java.lang.Comparable)"", (java.lang.Comparable)10.0f);
    int var6 = var1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var4 = var1.getLegendItem((-1), 100);
    var1.setBaseShapesFilled(false);
    java.awt.Paint var8 = var1.getSeriesOutlinePaint((-1));
    java.awt.Paint var10 = var1.lookupSeriesOutlinePaint(0);
    var0.setLabelPaint(var10);
    double var12 = var0.getFixedAutoRange();
    var0.setNegativeArrowVisible(true);
    var0.setUpperMargin(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.zoomRange(1.0E-5d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    java.awt.Paint var0 = null;
    org.jfree.chart.renderer.category.GanttRenderer var1 = new org.jfree.chart.renderer.category.GanttRenderer();
    org.jfree.chart.plot.CategoryMarker var3 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var4 = var3.getLabelPaint();
    var1.setCompletePaint(var4);
    boolean var6 = org.jfree.chart.util.PaintUtilities.equal(var0, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    java.awt.geom.Point2D var10 = var0.getQuadrantOrigin();
    var0.configureRangeAxes();
    var0.setBackgroundAlpha(0.0f);
    org.jfree.data.xy.XYDataset var14 = null;
    var0.setDataset(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var0, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var3 = null;
    org.jfree.chart.plot.RingPlot var4 = new org.jfree.chart.plot.RingPlot(var3);
    org.jfree.chart.plot.Plot var5 = var4.getRootPlot();
    var0.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var5);
    java.lang.Comparable var7 = null;
    java.lang.Number var9 = var0.getMeanValue(var7, (java.lang.Comparable)100.0f);
    int var11 = var0.getColumnIndex((java.lang.Comparable)"#ffff9c");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.statistics.BoxAndWhiskerItem var14 = var0.getItem(1, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    java.awt.Paint var2 = var1.getBaseSectionPaint();
    double var3 = var1.getMaximumLabelWidth();
    org.jfree.chart.event.PlotChangeEvent var4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var1);
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var7 = var6.getTickLabelPaint();
    var1.setShadowPaint(var7);
    float var9 = var1.getBackgroundAlpha();
    java.awt.Stroke var11 = var1.getSectionOutlineStroke((java.lang.Comparable)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    org.jfree.chart.block.RectangleConstraint var2 = new org.jfree.chart.block.RectangleConstraint(0.0d, 10.0d);
    org.jfree.chart.block.RectangleConstraint var5 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
    org.jfree.chart.util.Size2D var6 = null;
    org.jfree.chart.util.Size2D var7 = var5.calculateConstrainedSize(var6);
    org.jfree.chart.util.Size2D var8 = var2.calculateConstrainedSize(var7);
    org.jfree.chart.renderer.category.StackedAreaRenderer var11 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var14 = var11.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var15 = null;
    org.jfree.chart.plot.RingPlot var16 = new org.jfree.chart.plot.RingPlot(var15);
    org.jfree.chart.plot.Plot var17 = var16.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var18 = null;
    var16.axisChanged(var18);
    org.jfree.chart.JFreeChart var21 = new org.jfree.chart.JFreeChart("hi!", var14, (org.jfree.chart.plot.Plot)var16, true);
    java.lang.Object var22 = var16.clone();
    org.jfree.chart.util.HorizontalAlignment var23 = null;
    org.jfree.chart.util.VerticalAlignment var24 = null;
    org.jfree.chart.block.FlowArrangement var27 = new org.jfree.chart.block.FlowArrangement(var23, var24, 100.0d, 10.0d);
    var27.clear();
    org.jfree.chart.block.Arrangement var29 = null;
    org.jfree.chart.title.LegendTitle var30 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var16, (org.jfree.chart.block.Arrangement)var27, var29);
    java.awt.Font var31 = var30.getItemFont();
    var30.setNotify(false);
    boolean var34 = var8.equals((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    org.jfree.chart.renderer.xy.XYItemRenderer var10 = var0.getRenderer();
    org.jfree.chart.axis.ValueAxis var12 = var0.getDomainAxis(1);
    org.jfree.chart.renderer.xy.XYItemRenderer var14 = var0.getRenderer((-16777206));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.jfree.chart.block.FlowArrangement var0 = new org.jfree.chart.block.FlowArrangement();
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var3 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var1, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var4 = null;
    org.jfree.chart.plot.RingPlot var5 = new org.jfree.chart.plot.RingPlot(var4);
    org.jfree.chart.plot.Plot var6 = var5.getRootPlot();
    var1.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var6);
    org.jfree.data.KeyToGroupMap var16 = new org.jfree.data.KeyToGroupMap();
    java.util.List var17 = var16.getGroups();
    org.jfree.data.statistics.BoxAndWhiskerItem var18 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var17);
    var1.add(var18, (java.lang.Comparable)0.0f, (java.lang.Comparable)"hi!");
    org.jfree.chart.title.LegendItemBlockContainer var23 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement)var0, (org.jfree.data.general.Dataset)var1, (java.lang.Comparable)false);
    var23.setToolTipText("AreaRendererEndType.TAPER");
    var23.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     boolean var21 = var12.equals((java.lang.Object)var13);
//     org.jfree.chart.title.TextTitle var22 = var12.getTitle();
//     org.jfree.chart.util.HorizontalAlignment var23 = var22.getTextAlignment();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var26 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var29 = var26.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var30 = null;
//     org.jfree.chart.plot.RingPlot var31 = new org.jfree.chart.plot.RingPlot(var30);
//     org.jfree.chart.plot.Plot var32 = var31.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var33 = null;
//     var31.axisChanged(var33);
//     org.jfree.chart.JFreeChart var36 = new org.jfree.chart.JFreeChart("hi!", var29, (org.jfree.chart.plot.Plot)var31, true);
//     java.lang.Object var37 = var31.clone();
//     org.jfree.chart.util.HorizontalAlignment var38 = null;
//     org.jfree.chart.util.VerticalAlignment var39 = null;
//     org.jfree.chart.block.FlowArrangement var42 = new org.jfree.chart.block.FlowArrangement(var38, var39, 100.0d, 10.0d);
//     var42.clear();
//     org.jfree.chart.block.Arrangement var44 = null;
//     org.jfree.chart.title.LegendTitle var45 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var31, (org.jfree.chart.block.Arrangement)var42, var44);
//     org.jfree.data.UnknownKeyException var47 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var48 = var47.getSuppressed();
//     java.lang.Throwable[] var49 = var47.getSuppressed();
//     boolean var50 = var45.equals((java.lang.Object)var49);
//     org.jfree.chart.util.RectangleInsets var51 = var45.getItemLabelPadding();
//     org.jfree.chart.util.VerticalAlignment var52 = var45.getVerticalAlignment();
//     org.jfree.chart.block.ColumnArrangement var55 = new org.jfree.chart.block.ColumnArrangement(var23, var52, 8.0d, 0.0d);
//     
//     // Checks the contract:  equals-hashcode on var7 and var31
//     assertTrue("Contract failed: equals-hashcode on var7 and var31", var7.equals(var31) ? var7.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var7
//     assertTrue("Contract failed: equals-hashcode on var31 and var7", var31.equals(var7) ? var31.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var32
//     assertTrue("Contract failed: equals-hashcode on var8 and var32", var8.equals(var32) ? var8.hashCode() == var32.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var32 and var8
//     assertTrue("Contract failed: equals-hashcode on var32 and var8", var32.equals(var8) ? var32.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var36
//     assertTrue("Contract failed: equals-hashcode on var12 and var36", var12.equals(var36) ? var12.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var12
//     assertTrue("Contract failed: equals-hashcode on var36 and var12", var36.equals(var12) ? var36.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.renderer.category.StackedAreaRenderer var7 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var8 = var7.getEndType();
    java.awt.Stroke var11 = var7.getItemStroke(0, 0);
    var0.setRangeZeroBaselineStroke(var11);
    org.jfree.chart.util.Layer var13 = null;
    java.util.Collection var14 = var0.getDomainMarkers(var13);
    org.jfree.chart.util.RectangleInsets var15 = var0.getInsets();
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var18 = var17.getEndType();
    java.awt.Stroke var21 = var17.getItemStroke(0, 0);
    var0.setDomainZeroBaselineStroke(var21);
    org.jfree.chart.util.RectangleEdge var24 = var0.getDomainAxisEdge(1);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var25.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var29 = var25.getBaseLinesVisible();
    java.lang.Boolean var31 = var25.getSeriesVisibleInLegend(10);
    java.awt.Paint var32 = var25.getBaseItemLabelPaint();
    java.awt.Color var35 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var36 = null;
    float[] var37 = var35.getRGBColorComponents(var36);
    var25.setBaseItemLabelPaint((java.awt.Paint)var35);
    int var39 = var35.getGreen();
    java.lang.String var40 = var35.toString();
    var0.setDomainTickBandPaint((java.awt.Paint)var35);
    org.jfree.chart.axis.ValueAxis var43 = var0.getDomainAxis(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "java.awt.Color[r=0,g=0,b=10]"+ "'", var40.equals("java.awt.Color[r=0,g=0,b=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    boolean var1 = org.jfree.data.time.SerialDate.isLeapYear((-16777206));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.zoomRange(50.5d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxisForDataset(1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var46 = var43.getLegendItem((-1), 100);
//     int var47 = var38.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var43);
//     java.awt.Graphics2D var48 = null;
//     java.awt.geom.Rectangle2D var49 = null;
//     var38.drawOutline(var48, var49);
// 
//   }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var32 = var30.getInsets();
//     double var34 = var32.calculateBottomOutset(100.0d);
//     var28.setPadding(var32);
//     org.jfree.chart.util.RectangleAnchor var36 = var28.getShapeLocation();
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, Double.NaN, Double.NaN);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var49 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var51 = var49.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var54 = new org.jfree.chart.entity.CategoryItemEntity(var39, "hi!", "", (org.jfree.data.category.CategoryDataset)var49, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var58 = var55.getLegendItem((-1), 100);
//     var55.setBaseShapesFilled(false);
//     java.awt.Paint var62 = var55.getSeriesOutlinePaint((-1));
//     java.awt.Paint var64 = var55.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var65 = new org.jfree.chart.title.LegendGraphic(var39, var64);
//     org.jfree.data.general.PieDataset var66 = null;
//     org.jfree.chart.plot.RingPlot var67 = new org.jfree.chart.plot.RingPlot(var66);
//     org.jfree.chart.plot.Plot var68 = var67.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var69 = var67.getInsets();
//     double var71 = var69.calculateBottomOutset(100.0d);
//     var65.setPadding(var69);
//     org.jfree.chart.util.RectangleInsets var73 = var65.getMargin();
//     org.jfree.chart.util.RectangleAnchor var74 = var65.getShapeLocation();
//     var28.setShapeLocation(var74);
//     
//     // Checks the contract:  equals-hashcode on var12 and var49
//     assertTrue("Contract failed: equals-hashcode on var12 and var49", var12.equals(var49) ? var12.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var12
//     assertTrue("Contract failed: equals-hashcode on var49 and var12", var49.equals(var12) ? var49.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var67
//     assertTrue("Contract failed: equals-hashcode on var30 and var67", var30.equals(var67) ? var30.hashCode() == var67.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var67 and var30
//     assertTrue("Contract failed: equals-hashcode on var67 and var30", var67.equals(var30) ? var67.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var68
//     assertTrue("Contract failed: equals-hashcode on var31 and var68", var31.equals(var68) ? var31.hashCode() == var68.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var68 and var31
//     assertTrue("Contract failed: equals-hashcode on var68 and var31", var68.equals(var31) ? var68.hashCode() == var31.hashCode() : true);
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.ChartColor var3 = new org.jfree.chart.ChartColor(15, 100, (-457));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    org.jfree.data.statistics.MeanAndStandardDeviation var2 = new org.jfree.data.statistics.MeanAndStandardDeviation(0.0d, 0.0d);
    java.lang.Number var3 = var2.getStandardDeviation();
    java.lang.Number var4 = var2.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0.0d+ "'", var3.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var2 = var0.getColumnKey(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
    org.jfree.chart.JFreeChart var3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    org.jfree.chart.labels.PieSectionLabelGenerator var4 = var1.getLegendLabelGenerator();
    org.jfree.chart.plot.DrawingSupplier var5 = var1.getDrawingSupplier();
    double var6 = var1.getSectionDepth();
    var1.setLabelLinksVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.2d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


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

  public void test386() {}
//   public void test386() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.chart.entity.LegendItemEntity var29 = new org.jfree.chart.entity.LegendItemEntity(var2);
//     java.lang.Comparable var30 = var29.getSeriesKey();
//     org.jfree.chart.plot.MultiplePiePlot var31 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var32 = var31.getLimit();
//     double var33 = var31.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var34 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var36 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var34, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var37 = null;
//     org.jfree.chart.plot.RingPlot var38 = new org.jfree.chart.plot.RingPlot(var37);
//     org.jfree.chart.plot.Plot var39 = var38.getRootPlot();
//     var34.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var39);
//     java.lang.Comparable var41 = null;
//     java.lang.Number var43 = var34.getMeanValue(var41, (java.lang.Comparable)100.0f);
//     var31.setDataset((org.jfree.data.category.CategoryDataset)var34);
//     org.jfree.data.general.DatasetGroup var45 = var34.getGroup();
//     double var47 = var34.getRangeLowerBound(true);
//     org.jfree.chart.plot.XYPlot var48 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var50 = new org.jfree.chart.axis.NumberAxis3D("");
//     var50.configure();
//     org.jfree.chart.util.RectangleInsets var52 = var50.getLabelInsets();
//     var48.setAxisOffset(var52);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var55 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var56 = var55.getEndType();
//     java.awt.Stroke var59 = var55.getItemStroke(0, 0);
//     var48.setRangeZeroBaselineStroke(var59);
//     org.jfree.chart.util.Layer var61 = null;
//     java.util.Collection var62 = var48.getDomainMarkers(var61);
//     var48.setForegroundAlpha(100.0f);
//     boolean var65 = var34.hasListener((java.util.EventListener)var48);
//     org.jfree.data.general.PieDataset var67 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow((org.jfree.data.category.CategoryDataset)var34, (-16777206));
//     var29.setDataset((org.jfree.data.general.Dataset)var34);
//     
//     // Checks the contract:  equals-hashcode on var12 and var34
//     assertTrue("Contract failed: equals-hashcode on var12 and var34", var12.equals(var34) ? var12.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var12
//     assertTrue("Contract failed: equals-hashcode on var34 and var12", var34.equals(var12) ? var34.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var3 = var0.getLegendItem(2, 0);
    double var4 = var0.getBase();
    org.jfree.chart.labels.ItemLabelPosition var7 = var0.getPositiveItemLabelPosition(2, (-1));
    double var8 = var0.getMaximumBarWidth();
    var0.setSeriesVisible(2, (java.lang.Boolean)false, false);
    java.awt.Graphics2D var13 = null;
    org.jfree.chart.plot.PlotRenderingInfo var14 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var15 = new org.jfree.chart.renderer.category.CategoryItemRendererState(var14);
    org.jfree.chart.plot.PlotRenderingInfo var16 = var15.getInfo();
    java.awt.geom.Rectangle2D var17 = null;
    org.jfree.data.category.CategoryDataset var18 = null;
    org.jfree.chart.axis.CategoryAxis var20 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var20.setUpperMargin(0.0d);
    int var23 = var20.getMaximumCategoryLabelLines();
    java.lang.Object var24 = var20.clone();
    org.jfree.chart.axis.DateAxis var25 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var29 = var26.getLegendItem((-1), 100);
    var26.setBaseShapesFilled(false);
    java.awt.Paint var33 = var26.getSeriesOutlinePaint((-1));
    java.awt.Paint var35 = var26.lookupSeriesOutlinePaint(0);
    var25.setLabelPaint(var35);
    double var37 = var25.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var41 = var38.getLegendItem(2, 0);
    double var42 = var38.getBase();
    org.jfree.chart.labels.ItemLabelPosition var45 = var38.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var49 = var46.getLegendItem((-1), 100);
    var46.setBaseShapesFilled(false);
    java.awt.Paint var54 = var46.getItemOutlinePaint(10, 1);
    var38.setErrorIndicatorPaint(var54);
    org.jfree.chart.plot.CategoryPlot var56 = new org.jfree.chart.plot.CategoryPlot(var18, var20, (org.jfree.chart.axis.ValueAxis)var25, (org.jfree.chart.renderer.category.CategoryItemRenderer)var38);
    var56.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.AxisSpace var59 = new org.jfree.chart.axis.AxisSpace();
    double var60 = var59.getLeft();
    var56.setFixedRangeAxisSpace(var59);
    org.jfree.chart.axis.AxisSpace var62 = new org.jfree.chart.axis.AxisSpace();
    double var63 = var62.getLeft();
    var56.setFixedRangeAxisSpace(var62);
    var56.setRangeCrosshairLockedOnData(false);
    var56.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var70 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var70.setUpperMargin(0.0d);
    var70.setTickMarkOutsideLength((-1.0f));
    org.jfree.chart.axis.NumberAxis var75 = new org.jfree.chart.axis.NumberAxis();
    org.jfree.chart.renderer.category.StackedAreaRenderer var77 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var78 = var77.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var79 = var77.getBaseNegativeItemLabelPosition();
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var80 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.Range var81 = var77.findRangeBounds((org.jfree.data.category.CategoryDataset)var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.drawItem(var13, var15, var17, var56, var70, (org.jfree.chart.axis.ValueAxis)var75, (org.jfree.data.category.CategoryDataset)var80, (-16777206), 0, 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    org.jfree.data.KeyToGroupMap var9 = new org.jfree.data.KeyToGroupMap();
    java.util.List var10 = var9.getGroups();
    org.jfree.data.statistics.BoxAndWhiskerItem var11 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var10);
    java.lang.Comparable var12 = null;
    var0.setObject((java.lang.Object)var10, var12, (java.lang.Comparable)1);
    var0.removeColumn(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow((java.lang.Comparable)0.35d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test389() {}
//   public void test389() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     java.awt.Paint var2 = var1.getBaseSectionPaint();
//     double var3 = var1.getMaximumLabelWidth();
//     org.jfree.chart.event.PlotChangeEvent var4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var1);
//     var1.setMinimumArcAngleToDraw(100.0d);
//     var1.setInnerSeparatorExtension(Double.NaN);
//     java.awt.Stroke var9 = var1.getSeparatorStroke();
//     double var10 = var1.getMaximumExplodePercent();
// 
//   }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    int var1 = var0.getColumnCount();
    org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D("");
    var4.configure();
    org.jfree.chart.axis.NumberTickUnit var6 = var4.getTickUnit();
    org.jfree.chart.renderer.category.StackedAreaRenderer var9 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var12 = var9.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var13 = null;
    org.jfree.chart.plot.RingPlot var14 = new org.jfree.chart.plot.RingPlot(var13);
    org.jfree.chart.plot.Plot var15 = var14.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var16 = null;
    var14.axisChanged(var16);
    org.jfree.chart.JFreeChart var19 = new org.jfree.chart.JFreeChart("hi!", var12, (org.jfree.chart.plot.Plot)var14, true);
    int var20 = var6.compareTo((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementValue(0.0d, (java.lang.Comparable)var6, (java.lang.Comparable)0.0f);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.util.List var13 = var12.getSubtitles();
//     org.jfree.chart.ChartRenderingInfo var16 = null;
//     var12.handleClick((-457), 2, var16);
// 
//   }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    int var2 = var1.getColumnCount();
    var1.removeColumn((java.lang.Comparable)1.0d);
    java.util.List var5 = var1.getColumnKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var7 = var1.getRowKey(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     boolean var21 = var12.equals((java.lang.Object)var13);
//     org.jfree.chart.title.TextTitle var22 = var12.getTitle();
//     org.jfree.chart.util.HorizontalAlignment var23 = var22.getTextAlignment();
//     var22.setText("hi!");
//     org.jfree.data.general.PieDataset var26 = null;
//     org.jfree.chart.plot.RingPlot var27 = new org.jfree.chart.plot.RingPlot(var26);
//     org.jfree.chart.plot.Plot var28 = var27.getRootPlot();
//     org.jfree.chart.JFreeChart var29 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var27);
//     org.jfree.chart.plot.CategoryMarker var31 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var32 = var31.getOutlineStroke();
//     var29.setBorderStroke(var32);
//     var22.addChangeListener((org.jfree.chart.event.TitleChangeListener)var29);
//     
//     // Checks the contract:  equals-hashcode on var7 and var27
//     assertTrue("Contract failed: equals-hashcode on var7 and var27", var7.equals(var27) ? var7.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var7
//     assertTrue("Contract failed: equals-hashcode on var27 and var7", var27.equals(var7) ? var27.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var28
//     assertTrue("Contract failed: equals-hashcode on var8 and var28", var8.equals(var28) ? var8.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var8
//     assertTrue("Contract failed: equals-hashcode on var28 and var8", var28.equals(var8) ? var28.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.jfree.chart.axis.NumberAxis3D var5 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var6 = var5.isTickMarksVisible();
    java.awt.Shape var7 = var5.getDownArrow();
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 100.0d, 0.2d);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var11.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var15 = var11.getBaseLinesVisible();
    java.lang.Boolean var17 = var11.getSeriesVisibleInLegend(10);
    java.awt.Paint var18 = var11.getBaseItemLabelPaint();
    java.awt.Color var21 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var22 = null;
    float[] var23 = var21.getRGBColorComponents(var22);
    var11.setBaseItemLabelPaint((java.awt.Paint)var21);
    int var25 = var21.getGreen();
    java.lang.String var26 = var21.toString();
    org.jfree.chart.LegendItem var27 = new org.jfree.chart.LegendItem("hi!", "ThreadContext", "Pie Plot", "Range[1.0,100.0]", var10, (java.awt.Paint)var21);
    java.lang.Comparable var28 = var27.getSeriesKey();
    java.lang.Comparable var29 = null;
    var27.setSeriesKey(var29);
    java.lang.String var31 = var27.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "java.awt.Color[r=0,g=0,b=10]"+ "'", var26.equals("java.awt.Color[r=0,g=0,b=10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "ThreadContext"+ "'", var31.equals("ThreadContext"));

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var2 = var1.getTickLabelPaint();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var6 = var3.getLegendItem(2, 0);
    double var7 = var3.getBase();
    java.awt.Color var10 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var11 = null;
    float[] var12 = var10.getRGBColorComponents(var11);
    java.awt.Color var15 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var16 = null;
    float[] var17 = var15.getRGBColorComponents(var16);
    float[] var18 = var10.getColorComponents(var16);
    var3.setErrorIndicatorPaint((java.awt.Paint)var10);
    org.jfree.chart.plot.XYPlot var20 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var22 = new org.jfree.chart.axis.NumberAxis3D("");
    var22.configure();
    org.jfree.chart.util.RectangleInsets var24 = var22.getLabelInsets();
    var20.setAxisOffset(var24);
    org.jfree.chart.plot.CategoryMarker var27 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var28 = var27.getOutlineStroke();
    var20.addDomainMarker((org.jfree.chart.plot.Marker)var27);
    java.awt.geom.Point2D var30 = var20.getQuadrantOrigin();
    java.awt.Paint var31 = var20.getDomainCrosshairPaint();
    org.jfree.chart.renderer.category.StackedAreaRenderer var33 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var34 = var33.getEndType();
    java.awt.Paint var35 = var33.getBaseFillPaint();
    org.jfree.chart.renderer.category.WaterfallBarRenderer var36 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(var2, (java.awt.Paint)var10, var31, var35);
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var37 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var39 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var37, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var40 = null;
    org.jfree.chart.plot.RingPlot var41 = new org.jfree.chart.plot.RingPlot(var40);
    org.jfree.chart.plot.Plot var42 = var41.getRootPlot();
    var37.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var42);
    java.lang.Number var46 = var37.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
    int var48 = var37.getRowIndex((java.lang.Comparable)Double.NaN);
    int var49 = var37.getColumnCount();
    org.jfree.data.Range var50 = var36.findRangeBounds((org.jfree.data.category.CategoryDataset)var37);
    var36.setSeriesVisible(100, (java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    var0.setDomainCrosshairValue(Double.NaN);
    org.jfree.chart.axis.AxisLocation var13 = var0.getDomainAxisLocation(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test397() {}
//   public void test397() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }
// 
// 
//     org.jfree.chart.plot.XYPlot var2 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var4 = new org.jfree.chart.axis.NumberAxis3D("");
//     var4.configure();
//     org.jfree.chart.util.RectangleInsets var6 = var4.getLabelInsets();
//     var2.setAxisOffset(var6);
//     org.jfree.chart.plot.CategoryMarker var9 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var10 = var9.getOutlineStroke();
//     var2.addDomainMarker((org.jfree.chart.plot.Marker)var9);
//     var9.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var15.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var19 = var15.getBaseLinesVisible();
//     java.lang.Boolean var21 = var15.getSeriesVisibleInLegend(10);
//     java.awt.Paint var22 = var15.getBaseItemLabelPaint();
//     java.awt.Color var25 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var26 = null;
//     float[] var27 = var25.getRGBColorComponents(var26);
//     var15.setBaseItemLabelPaint((java.awt.Paint)var25);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var30 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var31 = var30.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var32 = var30.getBaseNegativeItemLabelPosition();
//     var15.setBasePositiveItemLabelPosition(var32, true);
//     var14.setPositiveItemLabelPositionFallback(var32);
//     org.jfree.chart.text.TextAnchor var36 = var32.getRotationAnchor();
//     var9.setLabelTextAnchor(var36);
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var39.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var43 = var39.getBaseLinesVisible();
//     java.lang.Boolean var45 = var39.getSeriesVisibleInLegend(10);
//     java.awt.Paint var46 = var39.getBaseItemLabelPaint();
//     java.awt.Color var49 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var50 = null;
//     float[] var51 = var49.getRGBColorComponents(var50);
//     var39.setBaseItemLabelPaint((java.awt.Paint)var49);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var54 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var55 = var54.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var56 = var54.getBaseNegativeItemLabelPosition();
//     var39.setBasePositiveItemLabelPosition(var56, true);
//     var38.setPositiveItemLabelPositionFallback(var56);
//     org.jfree.chart.text.TextAnchor var60 = var56.getRotationAnchor();
//     org.jfree.chart.axis.NumberTick var62 = new org.jfree.chart.axis.NumberTick((java.lang.Number)0.35d, "org.jfree.data.UnknownKeyException: ", var36, var60, 0.0d);
//     
//     // Checks the contract:  equals-hashcode on var32 and var56
//     assertTrue("Contract failed: equals-hashcode on var32 and var56", var32.equals(var56) ? var32.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var32
//     assertTrue("Contract failed: equals-hashcode on var56 and var32", var56.equals(var32) ? var56.hashCode() == var32.hashCode() : true);
// 
//   }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var4 = var0.getBaseLinesVisible();
    java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
    java.awt.Paint var7 = var0.getBaseItemLabelPaint();
    java.awt.Color var10 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var11 = null;
    float[] var12 = var10.getRGBColorComponents(var11);
    var0.setBaseItemLabelPaint((java.awt.Paint)var10);
    java.awt.Paint var16 = var0.getItemPaint(15, (-1));
    java.awt.Paint var17 = var0.getBasePaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(false);
    var1.clear();
    java.util.List var3 = var1.getColumnKeys();
    java.lang.Object var4 = null;
    boolean var5 = var1.equals(var4);
    int var7 = var1.getRowIndex((java.lang.Comparable)' ');
    org.jfree.data.general.PieDataset var8 = null;
    org.jfree.chart.plot.RingPlot var9 = new org.jfree.chart.plot.RingPlot(var8);
    org.jfree.chart.plot.Plot var10 = var9.getRootPlot();
    org.jfree.chart.JFreeChart var11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var9);
    boolean var12 = var11.getAntiAlias();
    org.jfree.chart.util.RectangleInsets var13 = var11.getPadding();
    org.jfree.chart.event.ChartChangeEventType var14 = null;
    org.jfree.chart.event.ChartChangeEvent var15 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var11, var14);
    org.jfree.chart.event.ChartChangeEventType var16 = var15.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
//     var3.configure();
//     java.lang.Object var5 = var3.clone();
//     java.lang.Number var8 = null;
//     java.util.List var14 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var15 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var8, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var14);
//     boolean var16 = var3.equals((java.lang.Object)0);
//     boolean var17 = var3.isAutoRange();
//     java.awt.Font var18 = var3.getLabelFont();
//     org.jfree.chart.plot.CategoryMarker var20 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Object var21 = var20.clone();
//     java.awt.Paint var22 = var20.getOutlinePaint();
//     org.jfree.chart.block.LabelBlock var23 = new org.jfree.chart.block.LabelBlock("Size2D[width=50.5, height=10.0]", var18, var22);
//     org.jfree.chart.plot.RingPlot var24 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.plot.IntervalMarker var27 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var28 = var27.getEndValue();
//     var27.setStartValue(0.2d);
//     java.awt.Stroke var31 = var27.getStroke();
//     var24.setLabelOutlineStroke(var31);
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("poly", var18, (org.jfree.chart.plot.Plot)var24, false);
//     org.jfree.chart.plot.XYPlot var35 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var37 = new org.jfree.chart.axis.NumberAxis3D("");
//     var37.configure();
//     org.jfree.chart.util.RectangleInsets var39 = var37.getLabelInsets();
//     var35.setAxisOffset(var39);
//     org.jfree.chart.axis.DateAxis var41 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var45 = var42.getLegendItem((-1), 100);
//     var42.setBaseShapesFilled(false);
//     java.awt.Paint var49 = var42.getSeriesOutlinePaint((-1));
//     java.awt.Paint var51 = var42.lookupSeriesOutlinePaint(0);
//     var41.setLabelPaint(var51);
//     boolean var53 = var41.isNegativeArrowVisible();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var55 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var56 = var55.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var57 = var55.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var58 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var60 = var58.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var63 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var66 = var63.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var67 = null;
//     org.jfree.chart.plot.RingPlot var68 = new org.jfree.chart.plot.RingPlot(var67);
//     org.jfree.chart.plot.Plot var69 = var68.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var70 = null;
//     var68.axisChanged(var70);
//     org.jfree.chart.JFreeChart var73 = new org.jfree.chart.JFreeChart("hi!", var66, (org.jfree.chart.plot.Plot)var68, true);
//     boolean var74 = var58.equals((java.lang.Object)var66);
//     var58.validateObject();
//     org.jfree.data.Range var76 = var55.findRangeBounds((org.jfree.data.category.CategoryDataset)var58);
//     org.jfree.data.general.DatasetChangeEvent var77 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)var53, (org.jfree.data.general.Dataset)var58);
//     var35.datasetChanged(var77);
//     var24.datasetChanged(var77);
//     
//     // Checks the contract:  equals-hashcode on var24 and var68
//     assertTrue("Contract failed: equals-hashcode on var24 and var68", var24.equals(var68) ? var24.hashCode() == var68.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var68 and var24
//     assertTrue("Contract failed: equals-hashcode on var68 and var24", var68.equals(var24) ? var68.hashCode() == var24.hashCode() : true);
// 
//   }

  public void test401() {}
//   public void test401() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     org.jfree.data.general.PieDataset var29 = null;
//     org.jfree.chart.plot.RingPlot var30 = new org.jfree.chart.plot.RingPlot(var29);
//     org.jfree.chart.plot.Plot var31 = var30.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var32 = var30.getInsets();
//     double var34 = var32.calculateBottomOutset(100.0d);
//     var28.setPadding(var32);
//     org.jfree.chart.util.RectangleInsets var36 = var28.getMargin();
//     java.awt.Color var39 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var40 = null;
//     float[] var41 = var39.getRGBColorComponents(var40);
//     java.awt.Color var44 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var45 = null;
//     float[] var46 = var44.getRGBColorComponents(var45);
//     float[] var47 = var39.getColorComponents(var45);
//     var28.setLinePaint((java.awt.Paint)var39);
//     var28.setShapeOutlineVisible(true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == 4.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var39);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var47);
// 
//   }

  public void test402() {}
//   public void test402() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
//     var3.configure();
//     java.lang.Object var5 = var3.clone();
//     java.lang.Number var8 = null;
//     java.util.List var14 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var15 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var8, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var14);
//     boolean var16 = var3.equals((java.lang.Object)0);
//     boolean var17 = var3.isAutoRange();
//     java.awt.Font var18 = var3.getLabelFont();
//     org.jfree.chart.plot.CategoryMarker var20 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Object var21 = var20.clone();
//     java.awt.Paint var22 = var20.getOutlinePaint();
//     org.jfree.chart.block.LabelBlock var23 = new org.jfree.chart.block.LabelBlock("Size2D[width=50.5, height=10.0]", var18, var22);
//     org.jfree.chart.plot.RingPlot var24 = new org.jfree.chart.plot.RingPlot();
//     org.jfree.chart.plot.IntervalMarker var27 = new org.jfree.chart.plot.IntervalMarker(4.0d, 0.25d);
//     double var28 = var27.getEndValue();
//     var27.setStartValue(0.2d);
//     java.awt.Stroke var31 = var27.getStroke();
//     var24.setLabelOutlineStroke(var31);
//     org.jfree.chart.JFreeChart var34 = new org.jfree.chart.JFreeChart("poly", var18, (org.jfree.chart.plot.Plot)var24, false);
//     org.jfree.data.category.CategoryDataset var35 = null;
//     org.jfree.chart.axis.CategoryAxis var37 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var37.setUpperMargin(0.0d);
//     int var40 = var37.getMaximumCategoryLabelLines();
//     java.lang.Object var41 = var37.clone();
//     org.jfree.chart.axis.DateAxis var42 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var46 = var43.getLegendItem((-1), 100);
//     var43.setBaseShapesFilled(false);
//     java.awt.Paint var50 = var43.getSeriesOutlinePaint((-1));
//     java.awt.Paint var52 = var43.lookupSeriesOutlinePaint(0);
//     var42.setLabelPaint(var52);
//     double var54 = var42.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var58 = var55.getLegendItem(2, 0);
//     double var59 = var55.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var62 = var55.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var66 = var63.getLegendItem((-1), 100);
//     var63.setBaseShapesFilled(false);
//     java.awt.Paint var71 = var63.getItemOutlinePaint(10, 1);
//     var55.setErrorIndicatorPaint(var71);
//     org.jfree.chart.plot.CategoryPlot var73 = new org.jfree.chart.plot.CategoryPlot(var35, var37, (org.jfree.chart.axis.ValueAxis)var42, (org.jfree.chart.renderer.category.CategoryItemRenderer)var55);
//     var73.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var77 = var73.getDomainAxisForDataset(1);
//     org.jfree.chart.plot.CategoryMarker var80 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     org.jfree.chart.util.Layer var81 = null;
//     var73.addRangeMarker(4, (org.jfree.chart.plot.Marker)var80, var81);
//     var24.setParent((org.jfree.chart.plot.Plot)var73);
//     
//     // Checks the contract:  equals-hashcode on var20 and var80
//     assertTrue("Contract failed: equals-hashcode on var20 and var80", var20.equals(var80) ? var20.hashCode() == var80.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var80 and var20
//     assertTrue("Contract failed: equals-hashcode on var80 and var20", var80.equals(var20) ? var80.hashCode() == var20.hashCode() : true);
// 
//   }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    float var1 = var0.getForegroundAlpha();
    java.awt.Paint var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeZeroBaselinePaint(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    org.jfree.data.statistics.DefaultStatisticalCategoryDataset var0 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getValue(15, 2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test405() {}
//   public void test405() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     java.awt.Paint var2 = var1.getBaseSectionPaint();
//     double var3 = var1.getLabelGap();
//     org.jfree.chart.plot.Plot var4 = var1.getRootPlot();
//     var1.setStartAngle(4.0d);
//     java.awt.Graphics2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.XYPlot var9 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var11 = new org.jfree.chart.axis.NumberAxis3D("");
//     var11.configure();
//     org.jfree.chart.util.RectangleInsets var13 = var11.getLabelInsets();
//     var9.setAxisOffset(var13);
//     org.jfree.chart.plot.CategoryMarker var16 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var17 = var16.getOutlineStroke();
//     var9.addDomainMarker((org.jfree.chart.plot.Marker)var16);
//     java.awt.geom.Point2D var19 = var9.getQuadrantOrigin();
//     org.jfree.chart.plot.DatasetRenderingOrder var20 = var9.getDatasetRenderingOrder();
//     org.jfree.chart.plot.PlotRenderingInfo var22 = null;
//     org.jfree.chart.plot.XYPlot var23 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var25 = new org.jfree.chart.axis.NumberAxis3D("");
//     var25.configure();
//     org.jfree.chart.util.RectangleInsets var27 = var25.getLabelInsets();
//     var23.setAxisOffset(var27);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var30 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var31 = var30.getEndType();
//     java.awt.Stroke var34 = var30.getItemStroke(0, 0);
//     var23.setRangeZeroBaselineStroke(var34);
//     org.jfree.chart.util.Layer var36 = null;
//     java.util.Collection var37 = var23.getDomainMarkers(var36);
//     org.jfree.chart.util.RectangleInsets var38 = var23.getInsets();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var40 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var41 = var40.getEndType();
//     java.awt.Stroke var44 = var40.getItemStroke(0, 0);
//     var23.setDomainZeroBaselineStroke(var44);
//     org.jfree.chart.util.RectangleEdge var47 = var23.getDomainAxisEdge(1);
//     org.jfree.data.xy.XYDataset var48 = null;
//     var23.setDataset(var48);
//     var23.setRangeCrosshairValue(1.0d);
//     org.jfree.chart.axis.NumberAxis3D var53 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var54 = var53.isTickMarksVisible();
//     org.jfree.chart.axis.NumberTickUnit var55 = var53.getTickUnit();
//     int var56 = var23.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var53);
//     java.awt.geom.Point2D var57 = var23.getQuadrantOrigin();
//     var9.zoomRangeAxes(2.0d, var22, var57);
//     org.jfree.chart.plot.PlotState var59 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var60 = null;
//     var1.draw(var7, var8, var57, var59, var60);
// 
//   }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     java.lang.Comparable var18 = var17.getRowKey();
//     org.jfree.chart.axis.NumberAxis3D var20 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var21 = var20.getTickLabelPaint();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var25 = var22.getLegendItem(2, 0);
//     double var26 = var22.getBase();
//     java.awt.Color var29 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var30 = null;
//     float[] var31 = var29.getRGBColorComponents(var30);
//     java.awt.Color var34 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var35 = null;
//     float[] var36 = var34.getRGBColorComponents(var35);
//     float[] var37 = var29.getColorComponents(var35);
//     var22.setErrorIndicatorPaint((java.awt.Paint)var29);
//     org.jfree.chart.plot.XYPlot var39 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var41 = new org.jfree.chart.axis.NumberAxis3D("");
//     var41.configure();
//     org.jfree.chart.util.RectangleInsets var43 = var41.getLabelInsets();
//     var39.setAxisOffset(var43);
//     org.jfree.chart.plot.CategoryMarker var46 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var47 = var46.getOutlineStroke();
//     var39.addDomainMarker((org.jfree.chart.plot.Marker)var46);
//     java.awt.geom.Point2D var49 = var39.getQuadrantOrigin();
//     java.awt.Paint var50 = var39.getDomainCrosshairPaint();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var52 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var53 = var52.getEndType();
//     java.awt.Paint var54 = var52.getBaseFillPaint();
//     org.jfree.chart.renderer.category.WaterfallBarRenderer var55 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(var21, (java.awt.Paint)var29, var50, var54);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var56 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var58 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var56, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var59 = null;
//     org.jfree.chart.plot.RingPlot var60 = new org.jfree.chart.plot.RingPlot(var59);
//     org.jfree.chart.plot.Plot var61 = var60.getRootPlot();
//     var56.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var61);
//     java.lang.Number var65 = var56.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
//     int var67 = var56.getRowIndex((java.lang.Comparable)Double.NaN);
//     int var68 = var56.getColumnCount();
//     org.jfree.data.Range var69 = var55.findRangeBounds((org.jfree.data.category.CategoryDataset)var56);
//     var17.setDataset((org.jfree.data.category.CategoryDataset)var56);
//     
//     // Checks the contract:  equals-hashcode on var12 and var56
//     assertTrue("Contract failed: equals-hashcode on var12 and var56", var12.equals(var56) ? var12.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var12
//     assertTrue("Contract failed: equals-hashcode on var56 and var12", var56.equals(var12) ? var56.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var2.setUpperMargin(0.0d);
    int var5 = var2.getMaximumCategoryLabelLines();
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
    java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
    var7.setLabelPaint(var17);
    double var19 = var7.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
    double var24 = var20.getBase();
    org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
    var28.setBaseShapesFilled(false);
    java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
    var20.setErrorIndicatorPaint(var36);
    org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
    var38.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxis(0);
    org.jfree.chart.renderer.category.StackedAreaRenderer var45 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var46 = var45.getEndType();
    java.awt.Stroke var49 = var45.getItemStroke(0, 0);
    boolean var51 = var45.isSeriesItemLabelsVisible(15);
    var38.setRenderer(100, (org.jfree.chart.renderer.category.CategoryItemRenderer)var45, true);
    org.jfree.chart.plot.CategoryMarker var56 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var57 = var56.getLabelPaint();
    java.lang.Comparable var58 = var56.getKey();
    org.jfree.chart.util.Layer var59 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var38.addDomainMarker(0, var56, var59);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + true+ "'", var58.equals(true));

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, Double.NaN, Double.NaN);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 0.0f, 0.0f);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var14 = var12.getRangeUpperBound(false);
//     org.jfree.chart.entity.CategoryItemEntity var17 = new org.jfree.chart.entity.CategoryItemEntity(var2, "hi!", "", (org.jfree.data.category.CategoryDataset)var12, (java.lang.Comparable)100.0f, (java.lang.Comparable)10L);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var21 = var18.getLegendItem((-1), 100);
//     var18.setBaseShapesFilled(false);
//     java.awt.Paint var25 = var18.getSeriesOutlinePaint((-1));
//     java.awt.Paint var27 = var18.lookupSeriesOutlinePaint(0);
//     org.jfree.chart.title.LegendGraphic var28 = new org.jfree.chart.title.LegendGraphic(var2, var27);
//     java.awt.Graphics2D var29 = null;
//     org.jfree.chart.block.ColumnArrangement var30 = new org.jfree.chart.block.ColumnArrangement();
//     org.jfree.chart.util.HorizontalAlignment var31 = null;
//     org.jfree.chart.util.VerticalAlignment var32 = null;
//     org.jfree.chart.block.FlowArrangement var35 = new org.jfree.chart.block.FlowArrangement(var31, var32, Double.NaN, 4.0d);
//     org.jfree.chart.block.BlockContainer var36 = new org.jfree.chart.block.BlockContainer();
//     java.awt.Graphics2D var37 = null;
//     org.jfree.chart.block.RectangleConstraint var40 = new org.jfree.chart.block.RectangleConstraint(1.0d, (-1.0d));
//     org.jfree.chart.util.Size2D var41 = var35.arrange(var36, var37, var40);
//     var36.clear();
//     java.awt.Graphics2D var43 = null;
//     org.jfree.chart.block.RectangleConstraint var46 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     org.jfree.chart.util.Size2D var47 = var30.arrange(var36, var43, var46);
//     org.jfree.chart.util.Size2D var48 = var28.arrange(var29, var46);
//     double var49 = var46.getHeight();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var47);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var49 == 10.0d);
// 
//   }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     var1.configure();
//     java.lang.Object var3 = var1.clone();
//     java.lang.Number var6 = null;
//     java.util.List var12 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var13 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var6, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var12);
//     boolean var14 = var1.equals((java.lang.Object)0);
//     boolean var15 = var1.isAutoRange();
//     boolean var16 = var1.isPositiveArrowVisible();
//     org.jfree.chart.axis.NumberAxis3D var22 = new org.jfree.chart.axis.NumberAxis3D("");
//     var22.configure();
//     java.lang.Object var24 = var22.clone();
//     java.lang.Number var27 = null;
//     java.util.List var33 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var34 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var27, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var33);
//     boolean var35 = var22.equals((java.lang.Object)0);
//     boolean var36 = var22.isAutoRange();
//     java.awt.Font var37 = var22.getLabelFont();
//     org.jfree.chart.axis.MarkerAxisBand var38 = new org.jfree.chart.axis.MarkerAxisBand((org.jfree.chart.axis.NumberAxis)var1, 90.0d, 50.5d, 1.0d, 100.0d, var37);
//     
//     // Checks the contract:  equals-hashcode on var13 and var34
//     assertTrue("Contract failed: equals-hashcode on var13 and var34", var13.equals(var34) ? var13.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var13
//     assertTrue("Contract failed: equals-hashcode on var34 and var13", var34.equals(var13) ? var34.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    org.jfree.chart.axis.DateAxis var0 = new org.jfree.chart.axis.DateAxis();
    double var1 = var0.getLabelAngle();
    java.lang.Object var2 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D((-8.0d), 4.0d);
//     java.awt.Paint var3 = var2.getWallPaint();
//     java.awt.Graphics2D var4 = null;
//     org.jfree.data.category.CategoryDataset var5 = null;
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var7.setUpperMargin(0.0d);
//     int var10 = var7.getMaximumCategoryLabelLines();
//     java.lang.Object var11 = var7.clone();
//     org.jfree.chart.axis.DateAxis var12 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var16 = var13.getLegendItem((-1), 100);
//     var13.setBaseShapesFilled(false);
//     java.awt.Paint var20 = var13.getSeriesOutlinePaint((-1));
//     java.awt.Paint var22 = var13.lookupSeriesOutlinePaint(0);
//     var12.setLabelPaint(var22);
//     double var24 = var12.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var28 = var25.getLegendItem(2, 0);
//     double var29 = var25.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var32 = var25.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var36 = var33.getLegendItem((-1), 100);
//     var33.setBaseShapesFilled(false);
//     java.awt.Paint var41 = var33.getItemOutlinePaint(10, 1);
//     var25.setErrorIndicatorPaint(var41);
//     org.jfree.chart.plot.CategoryPlot var43 = new org.jfree.chart.plot.CategoryPlot(var5, var7, (org.jfree.chart.axis.ValueAxis)var12, (org.jfree.chart.renderer.category.CategoryItemRenderer)var25);
//     var43.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var47 = var43.getDomainAxisForDataset(1);
//     org.jfree.chart.plot.CategoryMarker var50 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     org.jfree.chart.util.Layer var51 = null;
//     var43.addRangeMarker(4, (org.jfree.chart.plot.Marker)var50, var51);
//     java.awt.geom.Rectangle2D var53 = null;
//     var2.drawOutline(var4, var43, var53);
// 
//   }

  public void test412() {}
//   public void test412() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxisForDataset(1);
//     java.awt.Graphics2D var43 = null;
//     org.jfree.chart.axis.AxisState var44 = null;
//     java.awt.geom.Rectangle2D var45 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var48 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var51 = var48.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var52 = null;
//     org.jfree.chart.plot.RingPlot var53 = new org.jfree.chart.plot.RingPlot(var52);
//     org.jfree.chart.plot.Plot var54 = var53.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var55 = null;
//     var53.axisChanged(var55);
//     org.jfree.chart.JFreeChart var58 = new org.jfree.chart.JFreeChart("hi!", var51, (org.jfree.chart.plot.Plot)var53, true);
//     java.lang.Object var59 = var53.clone();
//     org.jfree.chart.util.HorizontalAlignment var60 = null;
//     org.jfree.chart.util.VerticalAlignment var61 = null;
//     org.jfree.chart.block.FlowArrangement var64 = new org.jfree.chart.block.FlowArrangement(var60, var61, 100.0d, 10.0d);
//     var64.clear();
//     org.jfree.chart.block.Arrangement var66 = null;
//     org.jfree.chart.title.LegendTitle var67 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var53, (org.jfree.chart.block.Arrangement)var64, var66);
//     org.jfree.data.UnknownKeyException var69 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var70 = var69.getSuppressed();
//     java.lang.Throwable[] var71 = var69.getSuppressed();
//     boolean var72 = var67.equals((java.lang.Object)var71);
//     org.jfree.chart.util.RectangleInsets var73 = var67.getItemLabelPadding();
//     java.awt.Graphics2D var74 = null;
//     org.jfree.chart.block.RectangleConstraint var77 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     double var78 = var77.getWidth();
//     org.jfree.chart.util.Size2D var79 = var67.arrange(var74, var77);
//     org.jfree.chart.util.RectangleEdge var80 = var67.getLegendItemGraphicEdge();
//     java.util.List var81 = var42.refreshTicks(var43, var44, var45, var80);
// 
//   }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    org.jfree.chart.text.TextUtilities.setUseDrawRotatedStringWorkaround(false);

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     java.awt.Graphics2D var1 = null;
//     org.jfree.chart.plot.CategoryMarker var5 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Paint var6 = var5.getLabelPaint();
//     org.jfree.chart.text.TextAnchor var7 = var5.getLabelTextAnchor();
//     org.jfree.chart.text.TextUtilities.drawRotatedString("2014", var1, 10.0f, 0.0f, var7, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    org.jfree.chart.renderer.xy.XYItemRenderer var10 = var0.getRenderer();
    org.jfree.chart.axis.ValueAxis var12 = var0.getDomainAxis(1);
    double var13 = var0.getDomainCrosshairValue();
    org.jfree.chart.plot.CategoryMarker var15 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Paint var16 = var15.getLabelPaint();
    java.lang.Comparable var17 = var15.getKey();
    java.lang.String var18 = var15.getLabel();
    org.jfree.chart.renderer.category.StackedAreaRenderer var21 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var24 = var21.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var25 = null;
    org.jfree.chart.plot.RingPlot var26 = new org.jfree.chart.plot.RingPlot(var25);
    org.jfree.chart.plot.Plot var27 = var26.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var28 = null;
    var26.axisChanged(var28);
    org.jfree.chart.JFreeChart var31 = new org.jfree.chart.JFreeChart("hi!", var24, (org.jfree.chart.plot.Plot)var26, true);
    var15.removeChangeListener((org.jfree.chart.event.MarkerChangeListener)var26);
    java.awt.Paint var33 = var15.getPaint();
    org.jfree.chart.util.Layer var34 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker((org.jfree.chart.plot.Marker)var15, var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + true+ "'", var17.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("Range[1.0,100.0]");
    var1.setUpperMargin(0.05d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAutoRangeMinimumSize((-8.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    org.jfree.data.KeyToGroupMap var9 = new org.jfree.data.KeyToGroupMap();
    java.util.List var10 = var9.getGroups();
    org.jfree.data.statistics.BoxAndWhiskerItem var11 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)1.0d, (java.lang.Number)100.0f, (java.lang.Number)(short)1, (java.lang.Number)1.0f, (java.lang.Number)(byte)(-1), (java.lang.Number)(-1), (java.lang.Number)(byte)100, var10);
    java.lang.Comparable var12 = null;
    var0.setObject((java.lang.Object)var10, var12, (java.lang.Comparable)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn((java.lang.Comparable)' ');
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Paint var2 = var1.getTickLabelPaint();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var6 = var3.getLegendItem(2, 0);
//     double var7 = var3.getBase();
//     java.awt.Color var10 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var11 = null;
//     float[] var12 = var10.getRGBColorComponents(var11);
//     java.awt.Color var15 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var16 = null;
//     float[] var17 = var15.getRGBColorComponents(var16);
//     float[] var18 = var10.getColorComponents(var16);
//     var3.setErrorIndicatorPaint((java.awt.Paint)var10);
//     org.jfree.chart.plot.XYPlot var20 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var22 = new org.jfree.chart.axis.NumberAxis3D("");
//     var22.configure();
//     org.jfree.chart.util.RectangleInsets var24 = var22.getLabelInsets();
//     var20.setAxisOffset(var24);
//     org.jfree.chart.plot.CategoryMarker var27 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var28 = var27.getOutlineStroke();
//     var20.addDomainMarker((org.jfree.chart.plot.Marker)var27);
//     java.awt.geom.Point2D var30 = var20.getQuadrantOrigin();
//     java.awt.Paint var31 = var20.getDomainCrosshairPaint();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var33 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var34 = var33.getEndType();
//     java.awt.Paint var35 = var33.getBaseFillPaint();
//     org.jfree.chart.renderer.category.WaterfallBarRenderer var36 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(var2, (java.awt.Paint)var10, var31, var35);
//     double var37 = var36.getItemLabelAnchorOffset();
//     org.jfree.chart.plot.XYPlot var38 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var40 = new org.jfree.chart.axis.NumberAxis3D("");
//     var40.configure();
//     org.jfree.chart.util.RectangleInsets var42 = var40.getLabelInsets();
//     var38.setAxisOffset(var42);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var45 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var46 = var45.getEndType();
//     java.awt.Stroke var49 = var45.getItemStroke(0, 0);
//     var38.setRangeZeroBaselineStroke(var49);
//     org.jfree.data.general.DatasetGroup var51 = var38.getDatasetGroup();
//     org.jfree.chart.plot.CategoryMarker var53 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var54 = var53.getOutlineStroke();
//     var38.setRangeCrosshairStroke(var54);
//     var36.addChangeListener((org.jfree.chart.event.RendererChangeListener)var38);
//     
//     // Checks the contract:  equals-hashcode on var27 and var53
//     assertTrue("Contract failed: equals-hashcode on var27 and var53", var27.equals(var53) ? var27.hashCode() == var53.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var53 and var27
//     assertTrue("Contract failed: equals-hashcode on var53 and var27", var53.equals(var27) ? var53.hashCode() == var27.hashCode() : true);
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    java.awt.Paint var1 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var2.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var6 = var2.getBaseLinesVisible();
    var2.setAutoPopulateSeriesFillPaint(true);
    java.awt.Shape var9 = var2.getBaseShape();
    java.awt.Stroke var10 = var2.getBaseOutlineStroke();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(10.0d, var1, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.renderer.category.StatisticalBarRenderer var4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    double var5 = var4.getItemMargin();
    org.jfree.chart.LegendItemCollection var6 = var4.getLegendItems();
    var4.setIncludeBaseInRange(true);
    java.awt.Shape var10 = var4.lookupSeriesShape((-1));
    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false, false);
    org.jfree.chart.renderer.category.StackedAreaRenderer var17 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var20 = var17.getItemLabelFont((-1), 0);
    org.jfree.data.general.PieDataset var21 = null;
    org.jfree.chart.plot.RingPlot var22 = new org.jfree.chart.plot.RingPlot(var21);
    org.jfree.chart.plot.Plot var23 = var22.getRootPlot();
    org.jfree.chart.event.AxisChangeEvent var24 = null;
    var22.axisChanged(var24);
    org.jfree.chart.JFreeChart var27 = new org.jfree.chart.JFreeChart("hi!", var20, (org.jfree.chart.plot.Plot)var22, true);
    java.awt.Paint var28 = var22.getBackgroundPaint();
    var13.setSeriesItemLabelPaint(0, var28, true);
    org.jfree.chart.axis.NumberAxis3D var33 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var34 = var33.getTickLabelPaint();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var38 = var35.getLegendItem(2, 0);
    double var39 = var35.getBase();
    java.awt.Color var42 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var43 = null;
    float[] var44 = var42.getRGBColorComponents(var43);
    java.awt.Color var47 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var48 = null;
    float[] var49 = var47.getRGBColorComponents(var48);
    float[] var50 = var42.getColorComponents(var48);
    var35.setErrorIndicatorPaint((java.awt.Paint)var42);
    org.jfree.chart.plot.XYPlot var52 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var54 = new org.jfree.chart.axis.NumberAxis3D("");
    var54.configure();
    org.jfree.chart.util.RectangleInsets var56 = var54.getLabelInsets();
    var52.setAxisOffset(var56);
    org.jfree.chart.plot.CategoryMarker var59 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var60 = var59.getOutlineStroke();
    var52.addDomainMarker((org.jfree.chart.plot.Marker)var59);
    java.awt.geom.Point2D var62 = var52.getQuadrantOrigin();
    java.awt.Paint var63 = var52.getDomainCrosshairPaint();
    org.jfree.chart.renderer.category.StackedAreaRenderer var65 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var66 = var65.getEndType();
    java.awt.Paint var67 = var65.getBaseFillPaint();
    org.jfree.chart.renderer.category.WaterfallBarRenderer var68 = new org.jfree.chart.renderer.category.WaterfallBarRenderer(var34, (java.awt.Paint)var42, var63, var67);
    org.jfree.chart.axis.NumberAxis3D var70 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var71 = var70.isTickMarksVisible();
    org.jfree.data.Range var74 = new org.jfree.data.Range(1.0d, 100.0d);
    var70.setRangeWithMargins(var74, false, false);
    java.text.NumberFormat var78 = var70.getNumberFormatOverride();
    java.awt.Stroke var79 = var70.getAxisLineStroke();
    org.jfree.chart.plot.CategoryMarker var80 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)10.0d, var67, var79);
    java.awt.Paint var81 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var82 = new org.jfree.chart.LegendItem(var0, "({0}, {1}) = {3} - {4}", "2014", "Oct", var10, var28, var79, var81);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var1.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var5 = var1.getBaseLinesVisible();
    java.lang.Boolean var7 = var1.getSeriesVisibleInLegend(10);
    java.awt.Paint var8 = var1.getBaseItemLabelPaint();
    java.awt.Color var11 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var12 = null;
    float[] var13 = var11.getRGBColorComponents(var12);
    var1.setBaseItemLabelPaint((java.awt.Paint)var11);
    org.jfree.chart.renderer.category.StackedAreaRenderer var16 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var17 = var16.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var18 = var16.getBaseNegativeItemLabelPosition();
    var1.setBasePositiveItemLabelPosition(var18, true);
    var0.setPositiveItemLabelPositionFallback(var18);
    int var22 = var0.getPassCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.time.SerialDate var1 = org.jfree.data.time.SerialDate.createInstance(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     java.lang.Object var4 = var2.clone();
//     java.lang.Number var7 = null;
//     java.util.List var13 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var14 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var7, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var13);
//     boolean var15 = var2.equals((java.lang.Object)0);
//     boolean var16 = var2.isAutoRange();
//     java.awt.Font var17 = var2.getLabelFont();
//     org.jfree.chart.text.TextLine var18 = new org.jfree.chart.text.TextLine("Size2D[width=50.5, height=10.0]", var17);
//     org.jfree.data.DefaultKeyedValues2D var20 = new org.jfree.data.DefaultKeyedValues2D(false);
//     var20.clear();
//     java.util.List var22 = var20.getColumnKeys();
//     boolean var23 = var18.equals((java.lang.Object)var20);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var26 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var29 = var26.getItemLabelFont((-1), 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var30.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var34 = var30.getBaseLinesVisible();
//     java.lang.Boolean var36 = var30.getSeriesVisibleInLegend(10);
//     java.awt.Paint var37 = var30.getBaseItemLabelPaint();
//     org.jfree.chart.text.TextFragment var38 = new org.jfree.chart.text.TextFragment("", var29, var37);
//     var18.removeFragment(var38);
//     java.lang.String var40 = var38.getText();
//     java.awt.Graphics2D var41 = null;
//     org.jfree.chart.text.TextAnchor var42 = null;
//     float var43 = var38.calculateBaselineOffset(var41, var42);
// 
//   }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }
// 
// 
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     double var1 = var0.getItemMargin();
//     org.jfree.chart.LegendItemCollection var2 = var0.getLegendItems();
//     java.lang.Object var3 = var2.clone();
//     org.jfree.chart.LegendItemCollection var4 = new org.jfree.chart.LegendItemCollection();
//     int var5 = var4.getItemCount();
//     int var6 = var4.getItemCount();
//     var2.addAll(var4);
//     
//     // Checks the contract:  equals-hashcode on var2 and var4
//     assertTrue("Contract failed: equals-hashcode on var2 and var4", var2.equals(var4) ? var2.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var2
//     assertTrue("Contract failed: equals-hashcode on var4 and var2", var4.equals(var2) ? var4.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    java.text.AttributedString var0 = null;
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, Double.NaN, Double.NaN);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 10.0d, 0.0f, 0.0f);
    org.jfree.data.general.PieDataset var14 = null;
    org.jfree.chart.plot.RingPlot var15 = new org.jfree.chart.plot.RingPlot(var14);
    java.awt.Paint var16 = var15.getBaseSectionPaint();
    double var17 = var15.getMaximumLabelWidth();
    org.jfree.chart.event.PlotChangeEvent var18 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var15);
    java.awt.Stroke var19 = var15.getLabelOutlineStroke();
    org.jfree.chart.axis.NumberAxis3D var25 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var26 = var25.isTickMarksVisible();
    java.awt.Shape var27 = var25.getDownArrow();
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 100.0d, 0.2d);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var31.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var35 = var31.getBaseLinesVisible();
    java.lang.Boolean var37 = var31.getSeriesVisibleInLegend(10);
    java.awt.Paint var38 = var31.getBaseItemLabelPaint();
    java.awt.Color var41 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var42 = null;
    float[] var43 = var41.getRGBColorComponents(var42);
    var31.setBaseItemLabelPaint((java.awt.Paint)var41);
    int var45 = var41.getGreen();
    java.lang.String var46 = var41.toString();
    org.jfree.chart.LegendItem var47 = new org.jfree.chart.LegendItem("hi!", "ThreadContext", "Pie Plot", "Range[1.0,100.0]", var30, (java.awt.Paint)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var48 = new org.jfree.chart.LegendItem(var0, "12/31/69", "org.jfree.data.general.DatasetChangeEvent[source=false]", "poly", var13, var19, (java.awt.Paint)var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "java.awt.Color[r=0,g=0,b=10]"+ "'", var46.equals("java.awt.Color[r=0,g=0,b=10]"));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    org.jfree.data.DefaultKeyedValues2D var1 = new org.jfree.data.DefaultKeyedValues2D(true);
    var1.setValue((java.lang.Number)1.0d, (java.lang.Comparable)"hi!", (java.lang.Comparable)"Size2D[width=50.5, height=10.0]");

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var4 = var1.getItemLabelFont((-1), 0);
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var6 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    var1.setSeriesToolTipGenerator(4, (org.jfree.chart.labels.CategoryToolTipGenerator)var6);
    org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    org.jfree.data.general.PieDataset var10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var8, (java.lang.Comparable)"");
    org.jfree.data.general.PieDataset var11 = null;
    org.jfree.chart.plot.RingPlot var12 = new org.jfree.chart.plot.RingPlot(var11);
    org.jfree.chart.plot.Plot var13 = var12.getRootPlot();
    var8.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var13);
    java.lang.Comparable var15 = null;
    java.lang.Number var17 = var8.getMeanValue(var15, (java.lang.Comparable)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var6.generateRowLabel((org.jfree.data.category.CategoryDataset)var8, 100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getAxisOffset();
    java.awt.Paint var7 = var0.getDomainTickBandPaint();
    org.jfree.chart.LegendItemCollection var8 = var0.getFixedLegendItems();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var6 = var3.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot(var7);
//     org.jfree.chart.plot.Plot var9 = var8.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var10 = null;
//     var8.axisChanged(var10);
//     org.jfree.chart.JFreeChart var13 = new org.jfree.chart.JFreeChart("hi!", var6, (org.jfree.chart.plot.Plot)var8, true);
//     org.jfree.chart.block.LabelBlock var14 = new org.jfree.chart.block.LabelBlock("Range[1.0,100.0]", var6);
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     double var18 = var17.getItemMargin();
//     org.jfree.chart.LegendItemCollection var19 = var17.getLegendItems();
//     java.lang.Object var20 = var14.draw(var15, var16, (java.lang.Object)var19);
// 
//   }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Graphics2D var2 = null;
//     org.jfree.data.category.CategoryDataset var3 = null;
//     org.jfree.chart.axis.CategoryAxis var5 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var5.setUpperMargin(0.0d);
//     int var8 = var5.getMaximumCategoryLabelLines();
//     java.lang.Object var9 = var5.clone();
//     org.jfree.chart.axis.DateAxis var10 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var14 = var11.getLegendItem((-1), 100);
//     var11.setBaseShapesFilled(false);
//     java.awt.Paint var18 = var11.getSeriesOutlinePaint((-1));
//     java.awt.Paint var20 = var11.lookupSeriesOutlinePaint(0);
//     var10.setLabelPaint(var20);
//     double var22 = var10.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var26 = var23.getLegendItem(2, 0);
//     double var27 = var23.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var30 = var23.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var34 = var31.getLegendItem((-1), 100);
//     var31.setBaseShapesFilled(false);
//     java.awt.Paint var39 = var31.getItemOutlinePaint(10, 1);
//     var23.setErrorIndicatorPaint(var39);
//     org.jfree.chart.plot.CategoryPlot var41 = new org.jfree.chart.plot.CategoryPlot(var3, var5, (org.jfree.chart.axis.ValueAxis)var10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var23);
//     var41.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var44 = new org.jfree.chart.axis.AxisSpace();
//     double var45 = var44.getLeft();
//     var41.setFixedRangeAxisSpace(var44);
//     org.jfree.data.category.CategoryDataset var47 = null;
//     org.jfree.chart.axis.CategoryAxis var49 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var49.setUpperMargin(0.0d);
//     int var52 = var49.getMaximumCategoryLabelLines();
//     java.lang.Object var53 = var49.clone();
//     org.jfree.chart.axis.DateAxis var54 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var58 = var55.getLegendItem((-1), 100);
//     var55.setBaseShapesFilled(false);
//     java.awt.Paint var62 = var55.getSeriesOutlinePaint((-1));
//     java.awt.Paint var64 = var55.lookupSeriesOutlinePaint(0);
//     var54.setLabelPaint(var64);
//     double var66 = var54.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var70 = var67.getLegendItem(2, 0);
//     double var71 = var67.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var74 = var67.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var75 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var78 = var75.getLegendItem((-1), 100);
//     var75.setBaseShapesFilled(false);
//     java.awt.Paint var83 = var75.getItemOutlinePaint(10, 1);
//     var67.setErrorIndicatorPaint(var83);
//     org.jfree.chart.plot.CategoryPlot var85 = new org.jfree.chart.plot.CategoryPlot(var47, var49, (org.jfree.chart.axis.ValueAxis)var54, (org.jfree.chart.renderer.category.CategoryItemRenderer)var67);
//     var49.configure();
//     org.jfree.chart.plot.CategoryMarker var87 = null;
//     java.awt.geom.Rectangle2D var88 = null;
//     var1.drawDomainMarker(var2, var41, var49, var87, var88);
// 
//   }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer(false, false);
    java.awt.Paint var3 = var2.getErrorIndicatorPaint();
    org.jfree.chart.labels.StandardCategorySeriesLabelGenerator var4 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    var2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator)var4);
    org.jfree.data.gantt.TaskSeries var7 = new org.jfree.data.gantt.TaskSeries("");
    java.lang.Comparable var8 = var7.getKey();
    org.jfree.data.gantt.Task var9 = null;
    var7.remove(var9);
    java.lang.Object var11 = var7.clone();
    var7.removeAll();
    boolean var13 = var2.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(10);
//     java.awt.Paint var7 = var0.getBaseItemLabelPaint();
//     java.awt.Color var10 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var11 = null;
//     float[] var12 = var10.getRGBColorComponents(var11);
//     var0.setBaseItemLabelPaint((java.awt.Paint)var10);
//     java.awt.Paint[] var14 = new java.awt.Paint[] { var10};
//     java.awt.Color var17 = java.awt.Color.getColor("ThreadContext", 10);
//     java.awt.Paint[] var18 = new java.awt.Paint[] { var17};
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Color var22 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var23 = null;
//     float[] var24 = var22.getRGBColorComponents(var23);
//     java.awt.Color var27 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var28 = null;
//     float[] var29 = var27.getRGBColorComponents(var28);
//     float[] var30 = var22.getColorComponents(var28);
//     var19.setBaseItemLabelPaint((java.awt.Paint)var22);
//     java.awt.Paint[] var32 = new java.awt.Paint[] { var22};
//     org.jfree.chart.renderer.category.StackedAreaRenderer var34 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var35 = var34.getEndType();
//     java.awt.Stroke var38 = var34.getItemStroke(0, 0);
//     java.awt.Stroke[] var39 = new java.awt.Stroke[] { var38};
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var40 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var42 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var43 = var42.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var44 = var42.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var45 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var47 = var45.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var50 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var53 = var50.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var54 = null;
//     org.jfree.chart.plot.RingPlot var55 = new org.jfree.chart.plot.RingPlot(var54);
//     org.jfree.chart.plot.Plot var56 = var55.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var57 = null;
//     var55.axisChanged(var57);
//     org.jfree.chart.JFreeChart var60 = new org.jfree.chart.JFreeChart("hi!", var53, (org.jfree.chart.plot.Plot)var55, true);
//     boolean var61 = var45.equals((java.lang.Object)var53);
//     var45.validateObject();
//     org.jfree.data.Range var63 = var42.findRangeBounds((org.jfree.data.category.CategoryDataset)var45);
//     java.awt.Stroke var65 = var42.lookupSeriesStroke(10);
//     var40.setGroupStroke(var65);
//     java.awt.Stroke[] var67 = new java.awt.Stroke[] { var65};
//     java.awt.Shape[] var68 = null;
//     org.jfree.chart.plot.DefaultDrawingSupplier var69 = new org.jfree.chart.plot.DefaultDrawingSupplier(var14, var18, var32, var39, var67, var68);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var19 and var0.", var19.equals(var0) == var0.equals(var19));
// 
//   }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    org.jfree.chart.renderer.category.StackedAreaRenderer var1 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var4 = var1.getItemLabelFont((-1), 0);
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var6 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    var1.setSeriesToolTipGenerator(4, (org.jfree.chart.labels.CategoryToolTipGenerator)var6);
    boolean var8 = var1.getRenderAsPercentages();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    org.jfree.chart.util.LengthAdjustmentType var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setLabelOffsetType(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test435() {}
//   public void test435() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }
// 
// 
//     org.jfree.chart.renderer.category.StackedAreaRenderer var2 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var5 = var2.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var9 = null;
//     var7.axisChanged(var9);
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart("hi!", var5, (org.jfree.chart.plot.Plot)var7, true);
//     java.lang.Object var13 = var7.clone();
//     org.jfree.chart.util.HorizontalAlignment var14 = null;
//     org.jfree.chart.util.VerticalAlignment var15 = null;
//     org.jfree.chart.block.FlowArrangement var18 = new org.jfree.chart.block.FlowArrangement(var14, var15, 100.0d, 10.0d);
//     var18.clear();
//     org.jfree.chart.block.Arrangement var20 = null;
//     org.jfree.chart.title.LegendTitle var21 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var7, (org.jfree.chart.block.Arrangement)var18, var20);
//     java.lang.String var22 = var7.getNoDataMessage();
//     org.jfree.data.general.PieDataset var23 = null;
//     org.jfree.chart.plot.RingPlot var24 = new org.jfree.chart.plot.RingPlot(var23);
//     org.jfree.chart.plot.Plot var25 = var24.getRootPlot();
//     org.jfree.chart.JFreeChart var26 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var24);
//     boolean var27 = var26.getAntiAlias();
//     java.awt.Stroke var28 = var26.getBorderStroke();
//     var7.addChangeListener((org.jfree.chart.event.PlotChangeListener)var26);
//     
//     // Checks the contract:  equals-hashcode on var7 and var24
//     assertTrue("Contract failed: equals-hashcode on var7 and var24", var7.equals(var24) ? var7.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var7
//     assertTrue("Contract failed: equals-hashcode on var24 and var7", var24.equals(var7) ? var24.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var25
//     assertTrue("Contract failed: equals-hashcode on var8 and var25", var8.equals(var25) ? var8.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var8
//     assertTrue("Contract failed: equals-hashcode on var25 and var8", var25.equals(var8) ? var25.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    org.jfree.data.DefaultKeyedValues var0 = new org.jfree.data.DefaultKeyedValues();
    int var1 = var0.getItemCount();
    var0.removeValue((java.lang.Comparable)"Oct");
    org.jfree.data.category.CategoryDataset var4 = null;
    org.jfree.chart.axis.CategoryAxis var6 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var6.setUpperMargin(0.0d);
    int var9 = var6.getMaximumCategoryLabelLines();
    java.lang.Object var10 = var6.clone();
    org.jfree.chart.axis.DateAxis var11 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var15 = var12.getLegendItem((-1), 100);
    var12.setBaseShapesFilled(false);
    java.awt.Paint var19 = var12.getSeriesOutlinePaint((-1));
    java.awt.Paint var21 = var12.lookupSeriesOutlinePaint(0);
    var11.setLabelPaint(var21);
    double var23 = var11.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var27 = var24.getLegendItem(2, 0);
    double var28 = var24.getBase();
    org.jfree.chart.labels.ItemLabelPosition var31 = var24.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var35 = var32.getLegendItem((-1), 100);
    var32.setBaseShapesFilled(false);
    java.awt.Paint var40 = var32.getItemOutlinePaint(10, 1);
    var24.setErrorIndicatorPaint(var40);
    org.jfree.chart.plot.CategoryPlot var42 = new org.jfree.chart.plot.CategoryPlot(var4, var6, (org.jfree.chart.axis.ValueAxis)var11, (org.jfree.chart.renderer.category.CategoryItemRenderer)var24);
    var42.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var46 = var42.getDomainAxis(0);
    var42.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.SortOrder var49 = var42.getColumnRenderingOrder();
    var0.sortByKeys(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertValue(10, (java.lang.Comparable)"", 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var6 = var3.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var7 = null;
//     org.jfree.chart.plot.RingPlot var8 = new org.jfree.chart.plot.RingPlot(var7);
//     org.jfree.chart.plot.Plot var9 = var8.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var10 = null;
//     var8.axisChanged(var10);
//     org.jfree.chart.JFreeChart var13 = new org.jfree.chart.JFreeChart("hi!", var6, (org.jfree.chart.plot.Plot)var8, true);
//     java.lang.Object var14 = var8.clone();
//     org.jfree.chart.util.HorizontalAlignment var15 = null;
//     org.jfree.chart.util.VerticalAlignment var16 = null;
//     org.jfree.chart.block.FlowArrangement var19 = new org.jfree.chart.block.FlowArrangement(var15, var16, 100.0d, 10.0d);
//     var19.clear();
//     org.jfree.chart.block.Arrangement var21 = null;
//     org.jfree.chart.title.LegendTitle var22 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var8, (org.jfree.chart.block.Arrangement)var19, var21);
//     org.jfree.data.UnknownKeyException var24 = new org.jfree.data.UnknownKeyException("");
//     java.lang.Throwable[] var25 = var24.getSuppressed();
//     java.lang.Throwable[] var26 = var24.getSuppressed();
//     boolean var27 = var22.equals((java.lang.Object)var26);
//     org.jfree.chart.util.RectangleInsets var28 = var22.getItemLabelPadding();
//     java.awt.Graphics2D var29 = null;
//     org.jfree.chart.block.RectangleConstraint var32 = new org.jfree.chart.block.RectangleConstraint(50.5d, 10.0d);
//     double var33 = var32.getWidth();
//     org.jfree.chart.util.Size2D var34 = var22.arrange(var29, var32);
//     org.jfree.chart.util.RectangleEdge var35 = var22.getLegendItemGraphicEdge();
//     double var36 = org.jfree.chart.util.RectangleEdge.coordinate(var0, var35);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var2.setUpperMargin(0.0d);
    int var5 = var2.getMaximumCategoryLabelLines();
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
    java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
    var7.setLabelPaint(var17);
    double var19 = var7.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
    double var24 = var20.getBase();
    org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
    var28.setBaseShapesFilled(false);
    java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
    var20.setErrorIndicatorPaint(var36);
    org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
    var38.setRangeCrosshairValue(50.5d);
    org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxis(0);
    org.jfree.chart.renderer.category.StackedAreaRenderer var45 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var46 = var45.getEndType();
    java.awt.Stroke var49 = var45.getItemStroke(0, 0);
    boolean var51 = var45.isSeriesItemLabelsVisible(15);
    var38.setRenderer(100, (org.jfree.chart.renderer.category.CategoryItemRenderer)var45, true);
    org.jfree.chart.labels.IntervalCategoryToolTipGenerator var55 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    java.lang.String var56 = var55.getLabelFormat();
    var45.setSeriesToolTipGenerator(10, (org.jfree.chart.labels.CategoryToolTipGenerator)var55, false);
    boolean var59 = var45.getRenderAsPercentages();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "({0}, {1}) = {3} - {4}"+ "'", var56.equals("({0}, {1}) = {3} - {4}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxis(0);
//     var38.setDrawSharedDomainAxis(true);
//     var38.clearDomainMarkers(0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var50 = var47.getLegendItem((-1), 100);
//     var47.setBaseShapesFilled(false);
//     java.awt.Paint var55 = var47.getItemOutlinePaint(10, 1);
//     boolean var56 = var47.getUseOutlinePaint();
//     org.jfree.chart.plot.CategoryMarker var59 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)1L);
//     java.lang.Object var60 = var59.clone();
//     java.awt.Paint var61 = var59.getOutlinePaint();
//     var47.setSeriesPaint(2, var61, false);
//     var38.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer)var47);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var8 and var47.", var8.equals(var47) == var47.equals(var8));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var28 and var47.", var28.equals(var47) == var47.equals(var28));
// 
//   }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
//     var2.configure();
//     java.lang.Object var4 = var2.clone();
//     java.lang.Number var7 = null;
//     java.util.List var13 = null;
//     org.jfree.data.statistics.BoxAndWhiskerItem var14 = new org.jfree.data.statistics.BoxAndWhiskerItem((java.lang.Number)1.0d, (java.lang.Number)0L, var7, (java.lang.Number)100.0f, (java.lang.Number)0L, (java.lang.Number)0, (java.lang.Number)(short)(-1), (java.lang.Number)1.0d, var13);
//     boolean var15 = var2.equals((java.lang.Object)0);
//     boolean var16 = var2.isAutoRange();
//     java.awt.Font var17 = var2.getLabelFont();
//     org.jfree.chart.text.TextLine var18 = new org.jfree.chart.text.TextLine("Size2D[width=50.5, height=10.0]", var17);
//     org.jfree.data.DefaultKeyedValues2D var20 = new org.jfree.data.DefaultKeyedValues2D(false);
//     var20.clear();
//     java.util.List var22 = var20.getColumnKeys();
//     boolean var23 = var18.equals((java.lang.Object)var20);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var26 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var29 = var26.getItemLabelFont((-1), 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var30.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var34 = var30.getBaseLinesVisible();
//     java.lang.Boolean var36 = var30.getSeriesVisibleInLegend(10);
//     java.awt.Paint var37 = var30.getBaseItemLabelPaint();
//     org.jfree.chart.text.TextFragment var38 = new org.jfree.chart.text.TextFragment("", var29, var37);
//     var18.removeFragment(var38);
//     java.lang.String var40 = var38.getText();
//     java.awt.Graphics2D var41 = null;
//     org.jfree.chart.plot.XYPlot var44 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var46 = new org.jfree.chart.axis.NumberAxis3D("");
//     var46.configure();
//     org.jfree.chart.util.RectangleInsets var48 = var46.getLabelInsets();
//     var44.setAxisOffset(var48);
//     org.jfree.chart.plot.CategoryMarker var51 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var52 = var51.getOutlineStroke();
//     var44.addDomainMarker((org.jfree.chart.plot.Marker)var51);
//     var51.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var57 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var57.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var61 = var57.getBaseLinesVisible();
//     java.lang.Boolean var63 = var57.getSeriesVisibleInLegend(10);
//     java.awt.Paint var64 = var57.getBaseItemLabelPaint();
//     java.awt.Color var67 = java.awt.Color.getColor("ThreadContext", 10);
//     float[] var68 = null;
//     float[] var69 = var67.getRGBColorComponents(var68);
//     var57.setBaseItemLabelPaint((java.awt.Paint)var67);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var72 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var73 = var72.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var74 = var72.getBaseNegativeItemLabelPosition();
//     var57.setBasePositiveItemLabelPosition(var74, true);
//     var56.setPositiveItemLabelPositionFallback(var74);
//     org.jfree.chart.text.TextAnchor var78 = var74.getRotationAnchor();
//     var51.setLabelTextAnchor(var78);
//     var38.draw(var41, 1.0f, 1.0f, var78, (-1.0f), 0.0f, 50.5d);
// 
//   }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    double var2 = var1.getInteriorGap();
    org.jfree.chart.renderer.category.StackedAreaRenderer var5 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    java.awt.Font var8 = var5.getItemLabelFont((-1), 0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var9.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var13 = var9.getBaseLinesVisible();
    java.lang.Boolean var15 = var9.getSeriesVisibleInLegend(10);
    java.awt.Paint var16 = var9.getBaseItemLabelPaint();
    org.jfree.chart.text.TextFragment var17 = new org.jfree.chart.text.TextFragment("", var8, var16);
    var1.setLabelFont(var8);
    var1.setNoDataMessage("Pie Plot");
    org.jfree.chart.labels.PieSectionLabelGenerator var21 = var1.getLegendLabelToolTipGenerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    org.jfree.data.general.PieDataset var0 = null;
    org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
    java.awt.Paint var2 = var1.getBaseSectionPaint();
    boolean var3 = var1.isOutlineVisible();
    var1.setMaximumLabelWidth(100.0d);
    org.jfree.data.general.PieDataset var6 = null;
    org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
    org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
    org.jfree.chart.util.RectangleInsets var9 = var7.getInsets();
    java.awt.Stroke var10 = var7.getLabelOutlineStroke();
    var1.setLabelLinkStroke(var10);
    java.io.ObjectOutputStream var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeStroke(var10, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test443() {}
//   public void test443() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }
// 
// 
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     double var1 = var0.getItemMargin();
//     org.jfree.chart.LegendItemCollection var2 = var0.getLegendItems();
//     java.lang.Object var3 = var2.clone();
//     java.lang.Object var4 = var2.clone();
//     
//     // Checks the contract:  equals-hashcode on var3 and var4
//     assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var3
//     assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    int var1 = var0.getColumnCount();
    int var2 = var0.getRowCount();
    int var4 = var0.getColumnIndex((java.lang.Comparable)(byte)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var6 = var0.getRowKey(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
    var2.setUpperMargin(0.0d);
    int var5 = var2.getMaximumCategoryLabelLines();
    java.lang.Object var6 = var2.clone();
    org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
    var8.setBaseShapesFilled(false);
    java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
    java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
    var7.setLabelPaint(var17);
    double var19 = var7.getFixedAutoRange();
    org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
    double var24 = var20.getBase();
    org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
    var28.setBaseShapesFilled(false);
    java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
    var20.setErrorIndicatorPaint(var36);
    org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
    var38.setRangeCrosshairValue(50.5d);
    org.jfree.chart.renderer.category.CategoryItemRenderer var42 = var38.getRenderer((-457));
    var38.setRangeCrosshairLockedOnData(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    org.jfree.chart.util.RectangleEdge var0 = null;
    org.jfree.chart.util.RectangleEdge var1 = org.jfree.chart.util.RectangleEdge.opposite(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.text.G2TextMeasurer var1 = new org.jfree.chart.text.G2TextMeasurer(var0);
//     float var5 = var1.getStringWidth("", 100, (-457));
// 
//   }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     org.jfree.data.general.PieDataset var0 = null;
//     org.jfree.chart.plot.RingPlot var1 = new org.jfree.chart.plot.RingPlot(var0);
//     org.jfree.chart.plot.Plot var2 = var1.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var3 = var1.getInsets();
//     java.awt.Stroke var4 = var1.getLabelOutlineStroke();
//     java.lang.String var5 = var1.getPlotType();
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     org.jfree.chart.util.RectangleInsets var9 = var7.getInsets();
//     var1.setInsets(var9, false);
//     
//     // Checks the contract:  equals-hashcode on var1 and var7
//     assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var1
//     assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var8
//     assertTrue("Contract failed: equals-hashcode on var2 and var8", var2.equals(var8) ? var2.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var2
//     assertTrue("Contract failed: equals-hashcode on var8 and var2", var8.equals(var2) ? var8.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test449() {}
//   public void test449() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.CategoryAxis var42 = var38.getDomainAxisForDataset(1);
//     org.jfree.chart.axis.NumberAxis3D var44 = new org.jfree.chart.axis.NumberAxis3D("");
//     boolean var45 = var44.isTickMarksVisible();
//     org.jfree.data.Range var48 = new org.jfree.data.Range(1.0d, 100.0d);
//     var44.setRangeWithMargins(var48, false, false);
//     org.jfree.chart.axis.ValueAxis[] var52 = new org.jfree.chart.axis.ValueAxis[] { var44};
//     var38.setRangeAxes(var52);
//     int var54 = var38.getDomainAxisCount();
//     org.jfree.data.category.CategoryDataset var55 = null;
//     org.jfree.chart.axis.CategoryAxis var57 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var57.setUpperMargin(0.0d);
//     int var60 = var57.getMaximumCategoryLabelLines();
//     java.lang.Object var61 = var57.clone();
//     org.jfree.chart.axis.DateAxis var62 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var66 = var63.getLegendItem((-1), 100);
//     var63.setBaseShapesFilled(false);
//     java.awt.Paint var70 = var63.getSeriesOutlinePaint((-1));
//     java.awt.Paint var72 = var63.lookupSeriesOutlinePaint(0);
//     var62.setLabelPaint(var72);
//     double var74 = var62.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var75 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var78 = var75.getLegendItem(2, 0);
//     double var79 = var75.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var82 = var75.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var83 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var86 = var83.getLegendItem((-1), 100);
//     var83.setBaseShapesFilled(false);
//     java.awt.Paint var91 = var83.getItemOutlinePaint(10, 1);
//     var75.setErrorIndicatorPaint(var91);
//     org.jfree.chart.plot.CategoryPlot var93 = new org.jfree.chart.plot.CategoryPlot(var55, var57, (org.jfree.chart.axis.ValueAxis)var62, (org.jfree.chart.renderer.category.CategoryItemRenderer)var75);
//     java.util.EventListener var94 = null;
//     boolean var95 = var57.hasListener(var94);
//     var38.setDomainAxis(var57);
//     
//     // Checks the contract:  equals-hashcode on var27 and var82
//     assertTrue("Contract failed: equals-hashcode on var27 and var82", var27.equals(var82) ? var27.hashCode() == var82.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var82 and var27
//     assertTrue("Contract failed: equals-hashcode on var82 and var27", var82.equals(var27) ? var82.hashCode() == var27.hashCode() : true);
// 
//   }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.plot.CategoryMarker var7 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    var0.addDomainMarker((org.jfree.chart.plot.Marker)var7);
    var7.setLabel("org.jfree.chart.event.RendererChangeEvent[source=false]");
    org.jfree.chart.renderer.category.StatisticalBarRenderer var12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var13.setSeriesCreateEntities(1, (java.lang.Boolean)false);
    boolean var17 = var13.getBaseLinesVisible();
    java.lang.Boolean var19 = var13.getSeriesVisibleInLegend(10);
    java.awt.Paint var20 = var13.getBaseItemLabelPaint();
    java.awt.Color var23 = java.awt.Color.getColor("ThreadContext", 10);
    float[] var24 = null;
    float[] var25 = var23.getRGBColorComponents(var24);
    var13.setBaseItemLabelPaint((java.awt.Paint)var23);
    org.jfree.chart.renderer.category.StackedAreaRenderer var28 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
    org.jfree.chart.renderer.AreaRendererEndType var29 = var28.getEndType();
    org.jfree.chart.labels.ItemLabelPosition var30 = var28.getBaseNegativeItemLabelPosition();
    var13.setBasePositiveItemLabelPosition(var30, true);
    var12.setPositiveItemLabelPositionFallback(var30);
    org.jfree.chart.text.TextAnchor var34 = var30.getRotationAnchor();
    var7.setLabelTextAnchor(var34);
    java.awt.Stroke var36 = var7.getStroke();
    org.jfree.chart.util.LengthAdjustmentType var37 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setLabelOffsetType(var37);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     var0.setSeriesCreateEntities(1, (java.lang.Boolean)false);
//     boolean var4 = var0.getBaseLinesVisible();
//     boolean var6 = var0.equals((java.lang.Object)100.0f);
//     org.jfree.chart.event.RendererChangeEvent var7 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)var6);
//     java.lang.String var8 = var7.toString();
//     org.jfree.data.general.PieDataset var9 = null;
//     org.jfree.chart.plot.RingPlot var10 = new org.jfree.chart.plot.RingPlot(var9);
//     org.jfree.chart.plot.Plot var11 = var10.getRootPlot();
//     org.jfree.chart.JFreeChart var12 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var10);
//     java.lang.Object var13 = var12.clone();
//     var7.setChart(var12);
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.plot.XYPlot var17 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var19 = new org.jfree.chart.axis.NumberAxis3D("");
//     var19.configure();
//     org.jfree.chart.util.RectangleInsets var21 = var19.getLabelInsets();
//     var17.setAxisOffset(var21);
//     org.jfree.chart.plot.CategoryMarker var24 = new org.jfree.chart.plot.CategoryMarker((java.lang.Comparable)true);
//     java.awt.Stroke var25 = var24.getOutlineStroke();
//     var17.addDomainMarker((org.jfree.chart.plot.Marker)var24);
//     java.awt.geom.Point2D var27 = var17.getQuadrantOrigin();
//     org.jfree.chart.ChartRenderingInfo var28 = null;
//     var12.draw(var15, var16, var27, var28);
// 
//   }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     var2.setUpperMargin(0.0d);
//     int var5 = var2.getMaximumCategoryLabelLines();
//     java.lang.Object var6 = var2.clone();
//     org.jfree.chart.axis.DateAxis var7 = new org.jfree.chart.axis.DateAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var11 = var8.getLegendItem((-1), 100);
//     var8.setBaseShapesFilled(false);
//     java.awt.Paint var15 = var8.getSeriesOutlinePaint((-1));
//     java.awt.Paint var17 = var8.lookupSeriesOutlinePaint(0);
//     var7.setLabelPaint(var17);
//     double var19 = var7.getFixedAutoRange();
//     org.jfree.chart.renderer.category.StatisticalBarRenderer var20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
//     org.jfree.chart.LegendItem var23 = var20.getLegendItem(2, 0);
//     double var24 = var20.getBase();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var20.getPositiveItemLabelPosition(2, (-1));
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.LegendItem var31 = var28.getLegendItem((-1), 100);
//     var28.setBaseShapesFilled(false);
//     java.awt.Paint var36 = var28.getItemOutlinePaint(10, 1);
//     var20.setErrorIndicatorPaint(var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot(var0, var2, (org.jfree.chart.axis.ValueAxis)var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     var38.setRangeCrosshairValue(50.5d);
//     org.jfree.chart.axis.AxisSpace var41 = new org.jfree.chart.axis.AxisSpace();
//     double var42 = var41.getLeft();
//     var38.setFixedRangeAxisSpace(var41);
//     org.jfree.data.general.PieDataset var44 = null;
//     org.jfree.chart.plot.RingPlot var45 = new org.jfree.chart.plot.RingPlot(var44);
//     org.jfree.chart.plot.Plot var46 = var45.getRootPlot();
//     org.jfree.chart.JFreeChart var47 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var45);
//     boolean var48 = var47.getAntiAlias();
//     java.awt.Stroke var49 = var47.getBorderStroke();
//     org.jfree.chart.util.RectangleInsets var50 = var47.getPadding();
//     var38.setAxisOffset(var50);
//     org.jfree.chart.axis.AxisLocation var53 = var38.getDomainAxisLocation(15);
//     org.jfree.chart.plot.MultiplePiePlot var54 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var55 = var54.getLimit();
//     double var56 = var54.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var57 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var59 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var57, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var60 = null;
//     org.jfree.chart.plot.RingPlot var61 = new org.jfree.chart.plot.RingPlot(var60);
//     org.jfree.chart.plot.Plot var62 = var61.getRootPlot();
//     var57.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var62);
//     java.lang.Comparable var64 = null;
//     java.lang.Number var66 = var57.getMeanValue(var64, (java.lang.Comparable)100.0f);
//     var54.setDataset((org.jfree.data.category.CategoryDataset)var57);
//     org.jfree.data.general.DatasetGroup var68 = var57.getGroup();
//     var38.setDataset((org.jfree.data.category.CategoryDataset)var57);
//     
//     // Checks the contract:  equals-hashcode on var45 and var61
//     assertTrue("Contract failed: equals-hashcode on var45 and var61", var45.equals(var61) ? var45.hashCode() == var61.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var61 and var45
//     assertTrue("Contract failed: equals-hashcode on var61 and var45", var61.equals(var45) ? var61.hashCode() == var45.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var62
//     assertTrue("Contract failed: equals-hashcode on var46 and var62", var46.equals(var62) ? var46.hashCode() == var62.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var62 and var46
//     assertTrue("Contract failed: equals-hashcode on var62 and var46", var62.equals(var46) ? var62.hashCode() == var46.hashCode() : true);
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.jfree.chart.plot.XYPlot var0 = new org.jfree.chart.plot.XYPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    var2.configure();
    org.jfree.chart.util.RectangleInsets var4 = var2.getLabelInsets();
    var0.setAxisOffset(var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getAxisOffset();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    org.jfree.chart.plot.CrosshairState var11 = null;
    boolean var12 = var0.render(var7, var8, 1, var10, var11);
    org.jfree.chart.annotations.XYAnnotation var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.removeAnnotation(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.jfree.chart.util.Size2D var0 = new org.jfree.chart.util.Size2D();

  }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }
// 
// 
//     org.jfree.chart.plot.MultiplePiePlot var0 = new org.jfree.chart.plot.MultiplePiePlot();
//     double var1 = var0.getLimit();
//     double var2 = var0.getLimit();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var3, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var6 = null;
//     org.jfree.chart.plot.RingPlot var7 = new org.jfree.chart.plot.RingPlot(var6);
//     org.jfree.chart.plot.Plot var8 = var7.getRootPlot();
//     var3.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var8);
//     java.lang.Comparable var10 = null;
//     java.lang.Number var12 = var3.getMeanValue(var10, (java.lang.Comparable)100.0f);
//     var0.setDataset((org.jfree.data.category.CategoryDataset)var3);
//     org.jfree.data.general.DatasetGroup var14 = var3.getGroup();
//     double var16 = var3.getRangeLowerBound(true);
//     org.jfree.chart.plot.XYPlot var17 = new org.jfree.chart.plot.XYPlot();
//     org.jfree.chart.axis.NumberAxis3D var19 = new org.jfree.chart.axis.NumberAxis3D("");
//     var19.configure();
//     org.jfree.chart.util.RectangleInsets var21 = var19.getLabelInsets();
//     var17.setAxisOffset(var21);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var24 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var25 = var24.getEndType();
//     java.awt.Stroke var28 = var24.getItemStroke(0, 0);
//     var17.setRangeZeroBaselineStroke(var28);
//     org.jfree.chart.util.Layer var30 = null;
//     java.util.Collection var31 = var17.getDomainMarkers(var30);
//     var17.setForegroundAlpha(100.0f);
//     boolean var34 = var3.hasListener((java.util.EventListener)var17);
//     org.jfree.chart.plot.SeriesRenderingOrder var35 = null;
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var17.setSeriesRenderingOrder(var35);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var34 == false);
// 
//   }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesStroke(10, var2);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets((-1.0d), 0.0d, 0.05d, Double.NaN);
    java.awt.geom.Rectangle2D var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var8 = var4.createOutsetRectangle(var5, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.MinMaxCategoryRenderer var1 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
//     org.jfree.chart.renderer.category.StackedAreaRenderer var3 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     org.jfree.chart.renderer.AreaRendererEndType var4 = var3.getEndType();
//     org.jfree.chart.labels.ItemLabelPosition var5 = var3.getBaseNegativeItemLabelPosition();
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     double var8 = var6.getRangeUpperBound(false);
//     org.jfree.chart.renderer.category.StackedAreaRenderer var11 = new org.jfree.chart.renderer.category.StackedAreaRenderer(false);
//     java.awt.Font var14 = var11.getItemLabelFont((-1), 0);
//     org.jfree.data.general.PieDataset var15 = null;
//     org.jfree.chart.plot.RingPlot var16 = new org.jfree.chart.plot.RingPlot(var15);
//     org.jfree.chart.plot.Plot var17 = var16.getRootPlot();
//     org.jfree.chart.event.AxisChangeEvent var18 = null;
//     var16.axisChanged(var18);
//     org.jfree.chart.JFreeChart var21 = new org.jfree.chart.JFreeChart("hi!", var14, (org.jfree.chart.plot.Plot)var16, true);
//     boolean var22 = var6.equals((java.lang.Object)var14);
//     var6.validateObject();
//     org.jfree.data.Range var24 = var3.findRangeBounds((org.jfree.data.category.CategoryDataset)var6);
//     java.awt.Stroke var26 = var3.lookupSeriesStroke(10);
//     var1.setGroupStroke(var26);
//     javax.swing.Icon var28 = var1.getMaxIcon();
//     var0.setMinIcon(var28);
//     org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset var30 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
//     org.jfree.data.general.PieDataset var32 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn((org.jfree.data.category.CategoryDataset)var30, (java.lang.Comparable)"");
//     org.jfree.data.general.PieDataset var33 = null;
//     org.jfree.chart.plot.RingPlot var34 = new org.jfree.chart.plot.RingPlot(var33);
//     org.jfree.chart.plot.Plot var35 = var34.getRootPlot();
//     var30.removeChangeListener((org.jfree.data.general.DatasetChangeListener)var35);
//     java.lang.Number var39 = var30.getMaxRegularValue((java.lang.Comparable)100.0f, (java.lang.Comparable)10);
//     java.util.List var40 = var30.getRowKeys();
//     org.jfree.data.Range var41 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var30);
//     
//     // Checks the contract:  equals-hashcode on var6 and var30
//     assertTrue("Contract failed: equals-hashcode on var6 and var30", var6.equals(var30) ? var6.hashCode() == var30.hashCode() : 