
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.jfree.chart.util.UnitType var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleInsets var5 = new org.jfree.chart.util.RectangleInsets(var0, (-1.0d), (-1.0d), 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Shape var5 = null;
    java.awt.Paint var7 = null;
    java.awt.Paint var9 = null;
    java.awt.Stroke var10 = null;
    java.awt.Shape var12 = null;
    java.awt.Stroke var13 = null;
    java.awt.Paint var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var15 = new org.jfree.chart.LegendItem("", "", "hi!", "", true, var5, false, var7, false, var9, var10, true, var12, var13, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    java.awt.Stroke var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseOutlineStroke(var4, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.lang.ClassLoader var2 = null;
//     java.util.ResourceBundle var3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("hi!", var1, var2);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    org.jfree.chart.axis.AxisLocation var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.AxisLocation var1 = org.jfree.chart.axis.AxisLocation.getOpposite(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    org.jfree.chart.plot.CategoryPlot var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPlot(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    org.jfree.chart.annotations.CategoryAnnotation var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.jfree.chart.renderer.category.BarRenderer.setDefaultShadowsVisible(true);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Paint var2 = var0.getSeriesFillPaint(0);
//     java.awt.Graphics2D var3 = null;
//     org.jfree.chart.plot.CategoryPlot var4 = null;
//     org.jfree.chart.axis.ValueAxis var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var10 = null;
//     var8.setSeriesOutlineStroke(100, var10);
//     java.awt.Paint var13 = null;
//     var8.setSeriesOutlinePaint(0, var13, true);
//     java.awt.Shape var17 = var8.lookupSeriesShape(10);
//     java.awt.Paint var19 = null;
//     var8.setSeriesFillPaint(0, var19, false);
//     boolean var22 = var8.getBaseShapesVisible();
//     java.awt.Paint var23 = var8.getBaseOutlinePaint();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var26 = null;
//     var24.setSeriesURLGenerator(10, var26);
//     org.jfree.chart.labels.ItemLabelPosition var29 = null;
//     var24.setSeriesNegativeItemLabelPosition(0, var29, true);
//     java.awt.Stroke var33 = var24.lookupSeriesStroke(0);
//     var0.drawRangeLine(var3, var4, var5, var6, 0.0d, var23, var33);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var6 = null;
    var4.setSeriesOutlineStroke(100, var6);
    java.awt.Paint var9 = null;
    var4.setSeriesOutlinePaint(0, var9, true);
    var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var16 = var4.lookupSeriesShape((-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var19 = null;
    var17.setSeriesOutlineStroke(100, var19);
    java.awt.Paint var22 = null;
    var17.setSeriesOutlinePaint(0, var22, true);
    java.awt.Shape var26 = var17.lookupSeriesShape(10);
    java.awt.Paint var28 = null;
    var17.setSeriesFillPaint(0, var28, false);
    boolean var31 = var17.getBaseShapesVisible();
    java.awt.Paint var32 = var17.getBaseOutlinePaint();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var35 = null;
    var33.setSeriesURLGenerator(10, var35);
    org.jfree.chart.labels.ItemLabelPosition var38 = null;
    var33.setSeriesNegativeItemLabelPosition(0, var38, true);
    java.awt.Stroke var42 = var33.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var45 = null;
    var43.setSeriesOutlineStroke(100, var45);
    java.awt.Paint var48 = null;
    var43.setSeriesOutlinePaint(0, var48, true);
    java.awt.Shape var52 = var43.lookupSeriesShape(10);
    java.awt.Paint var54 = null;
    var43.setSeriesFillPaint(0, var54, false);
    boolean var57 = var43.getBaseShapesVisible();
    java.awt.Paint var58 = var43.getBaseOutlinePaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var59 = new org.jfree.chart.LegendItem(var0, "", "", "", var16, var32, var42, var58);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = var0.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var8 = null;
//     var6.setSeriesOutlineStroke(100, var8);
//     java.awt.Paint var11 = null;
//     var6.setSeriesOutlinePaint(0, var11, true);
//     java.awt.Shape var15 = var6.lookupSeriesShape(10);
//     var0.setBaseShape(var15, false);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var0
//     assertTrue("Contract failed: equals-hashcode on var6 and var0", var6.equals(var0) ? var6.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     var0.setUseSeriesOffset(true);
//     java.awt.Graphics2D var6 = null;
//     java.awt.geom.Rectangle2D var7 = null;
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.axis.CategoryAxis var9 = null;
//     org.jfree.chart.axis.ValueAxis var10 = null;
//     org.jfree.data.category.CategoryDataset var11 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     java.awt.geom.Rectangle2D var17 = var0.createHotSpotBounds(var6, var7, var8, var9, var10, var11, (-1), 10, false, var15, var16);
// 
//   }

  public void test13() {}
//   public void test13() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Stroke var3 = var0.getItemOutlineStroke((-1), 10);
// 
//   }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     java.awt.Graphics2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     java.awt.geom.Point2D var9 = null;
//     org.jfree.chart.plot.PlotState var10 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var11 = null;
//     var0.draw(var7, var8, var9, var10, var11);
// 
//   }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Stroke var3 = var0.getItemOutlineStroke(1, 10);
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = var0.getSeriesPositiveItemLabelPosition(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesLinesVisible((-1), true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     boolean var7 = var0.isOutlineVisible();
//     org.jfree.chart.plot.Marker var9 = null;
//     org.jfree.chart.util.Layer var10 = null;
//     var0.addRangeMarker(100, var9, var10, false);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     var0.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var12 = var0.lookupSeriesShape((-1));
//     java.awt.Paint var14 = null;
//     var0.setLegendTextPaint(0, var14);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var18 = null;
//     var16.setSeriesURLGenerator(10, var18);
//     org.jfree.chart.labels.ItemLabelPosition var21 = null;
//     var16.setSeriesNegativeItemLabelPosition(0, var21, true);
//     java.awt.Stroke var25 = var16.lookupSeriesStroke(0);
//     var0.setBaseOutlineStroke(var25);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var7 = null;
    var5.setSeriesOutlineStroke(100, var7);
    java.awt.Paint var10 = null;
    var5.setSeriesOutlinePaint(0, var10, true);
    var5.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var17 = var5.lookupSeriesShape((-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var21 = null;
    var19.setSeriesOutlineStroke(100, var21);
    java.awt.Paint var24 = null;
    var19.setSeriesOutlinePaint(0, var24, true);
    java.awt.Shape var28 = var19.lookupSeriesShape(10);
    java.awt.Paint var30 = null;
    var19.setSeriesFillPaint(0, var30, false);
    boolean var33 = var19.getBaseShapesVisible();
    java.awt.Paint var34 = var19.getBaseOutlinePaint();
    java.awt.Color var39 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    java.awt.Stroke var40 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var44 = null;
    var42.setSeriesOutlineStroke(100, var44);
    java.awt.Paint var47 = null;
    var42.setSeriesOutlinePaint(0, var47, true);
    java.awt.Shape var51 = var42.lookupSeriesShape(10);
    org.jfree.chart.entity.ChartEntity var52 = new org.jfree.chart.entity.ChartEntity(var51);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var55 = null;
    var53.setSeriesURLGenerator(10, var55);
    org.jfree.chart.labels.ItemLabelPosition var58 = null;
    var53.setSeriesNegativeItemLabelPosition(0, var58, true);
    java.awt.Stroke var62 = var53.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var65 = null;
    var63.setSeriesOutlineStroke(100, var65);
    java.awt.Paint var68 = null;
    var63.setSeriesOutlinePaint(0, var68, true);
    java.awt.Shape var72 = var63.lookupSeriesShape(10);
    java.awt.Paint var74 = null;
    var63.setSeriesFillPaint(0, var74, false);
    boolean var77 = var63.getBaseShapesVisible();
    java.awt.Paint var78 = var63.getBaseOutlinePaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var79 = new org.jfree.chart.LegendItem(var0, "hi!", "", "", false, var17, false, var34, true, (java.awt.Paint)var39, var40, false, var51, var62, var78);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setWeight(10);
    org.jfree.chart.axis.AxisLocation var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(0, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

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
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     double var4 = var0.getItemLabelAnchorOffset();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var7 = null;
//     var5.setSeriesOutlineStroke(100, var7);
//     java.awt.Paint var10 = null;
//     var5.setSeriesOutlinePaint(0, var10, true);
//     java.awt.Shape var14 = var5.lookupSeriesShape(10);
//     java.awt.Paint var16 = null;
//     var5.setSeriesFillPaint(0, var16, false);
//     boolean var19 = var5.getBaseShapesVisible();
//     java.awt.Paint var20 = var5.getBaseOutlinePaint();
//     java.awt.Stroke var21 = var5.getBaseStroke();
//     var0.setBaseStroke(var21);
//     
//     // Checks the contract:  equals-hashcode on var0 and var5
//     assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var0
//     assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
//     org.jfree.chart.plot.Marker var12 = null;
//     org.jfree.chart.util.Layer var13 = null;
//     var0.addRangeMarker(var12, var13);
// 
//   }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     boolean var7 = var0.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var10 = null;
//     var8.setSeriesOutlineStroke(100, var10);
//     java.awt.Paint var13 = null;
//     var8.setSeriesOutlinePaint(0, var13, true);
//     java.awt.Shape var17 = var8.lookupSeriesShape(10);
//     java.awt.Paint var19 = null;
//     var8.setSeriesFillPaint(0, var19, false);
//     boolean var22 = var8.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var26 = var8.getPositiveItemLabelPosition(1, 10, true);
//     var0.setBasePositiveItemLabelPosition(var26);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     boolean var7 = var0.isOutlineVisible();
//     org.jfree.chart.plot.Marker var9 = null;
//     org.jfree.chart.util.Layer var10 = null;
//     var0.addRangeMarker(0, var9, var10);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    boolean var7 = var0.isOutlineVisible();
    org.jfree.chart.axis.AxisLocation var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var2 = var0.getSeriesFillPaint(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var6 = null;
    var4.setSeriesURLGenerator(10, var6);
    org.jfree.chart.labels.ItemLabelPosition var9 = null;
    var4.setSeriesNegativeItemLabelPosition(0, var9, true);
    java.awt.Stroke var13 = var4.lookupSeriesStroke(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesStroke((-1), var13, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn((java.lang.Comparable)'#');
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var7 = null;
    var5.setSeriesOutlineStroke(100, var7);
    java.awt.Paint var10 = null;
    var5.setSeriesOutlinePaint(0, var10, true);
    var5.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var17 = var5.lookupSeriesShape((-1));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var21 = null;
    var19.setSeriesOutlineStroke(100, var21);
    java.awt.Paint var24 = null;
    var19.setSeriesOutlinePaint(0, var24, true);
    java.awt.Shape var28 = var19.lookupSeriesShape(10);
    java.awt.Paint var30 = null;
    var19.setSeriesFillPaint(0, var30, false);
    boolean var33 = var19.getBaseShapesVisible();
    java.awt.Paint var34 = var19.getBaseOutlinePaint();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var38 = null;
    var36.setSeriesOutlineStroke(100, var38);
    java.awt.Paint var41 = null;
    var36.setSeriesOutlinePaint(0, var41, true);
    java.awt.Shape var45 = var36.lookupSeriesShape(10);
    java.awt.Paint var47 = null;
    var36.setSeriesFillPaint(0, var47, false);
    boolean var50 = var36.getBaseShapesVisible();
    java.awt.Paint var51 = var36.getBaseOutlinePaint();
    java.awt.Stroke var52 = null;
    java.awt.Shape var54 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var57 = null;
    var55.setSeriesOutlineStroke(100, var57);
    java.awt.Paint var60 = null;
    var55.setSeriesOutlinePaint(0, var60, true);
    java.awt.Shape var64 = var55.lookupSeriesShape(10);
    java.awt.Paint var66 = null;
    var55.setSeriesFillPaint(0, var66, false);
    boolean var69 = var55.getBaseShapesVisible();
    java.awt.Paint var70 = var55.getBaseOutlinePaint();
    java.awt.Stroke var71 = var55.getBaseStroke();
    org.jfree.chart.plot.CategoryPlot var72 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var73 = null;
    java.awt.geom.Rectangle2D var74 = null;
    org.jfree.chart.plot.PlotRenderingInfo var76 = null;
    org.jfree.chart.plot.CategoryCrosshairState var77 = null;
    boolean var78 = var72.render(var73, var74, 100, var76, var77);
    org.jfree.chart.event.MarkerChangeEvent var79 = null;
    var72.markerChanged(var79);
    var72.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var83 = var72.getDrawingSupplier();
    java.awt.Paint var84 = var72.getRangeGridlinePaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var85 = new org.jfree.chart.LegendItem("java.awt.Color[r=0,g=0,b=0]", "hi!", "java.awt.Color[r=0,g=0,b=0]", "", true, var17, false, var34, false, var51, var52, false, var54, var71, var84);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var6 = null;
//     var4.setSeriesOutlineStroke(100, var6);
//     java.awt.Paint var9 = null;
//     var4.setSeriesOutlinePaint(0, var9, true);
//     java.awt.Shape var13 = var4.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var16 = null;
//     var14.setSeriesOutlineStroke(100, var16);
//     java.awt.Paint var19 = null;
//     var14.setSeriesOutlinePaint(0, var19, true);
//     java.awt.Shape var23 = var14.lookupSeriesShape(10);
//     java.awt.Paint var25 = null;
//     var14.setSeriesFillPaint(0, var25, false);
//     boolean var28 = var14.getBaseShapesVisible();
//     java.awt.Paint var29 = var14.getBaseOutlinePaint();
//     java.awt.Stroke var30 = var14.getBaseStroke();
//     org.jfree.chart.plot.CategoryPlot var31 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var32 = null;
//     java.awt.geom.Rectangle2D var33 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var35 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var36 = null;
//     boolean var37 = var31.render(var32, var33, 100, var35, var36);
//     org.jfree.chart.event.MarkerChangeEvent var38 = null;
//     var31.markerChanged(var38);
//     var31.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var42 = var31.getDrawingSupplier();
//     java.awt.Paint var43 = var31.getRangeGridlinePaint();
//     org.jfree.chart.LegendItem var44 = new org.jfree.chart.LegendItem("hi!", "java.awt.Color[r=0,g=0,b=0]", "NOID", "hi!", var13, var30, var43);
//     
//     // Checks the contract:  equals-hashcode on var4 and var14
//     assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var4
//     assertTrue("Contract failed: equals-hashcode on var14 and var4", var14.equals(var4) ? var14.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Paint var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultLabelPaint(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.annotations.CategoryAnnotation var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var4);
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
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     org.jfree.chart.labels.ItemLabelPosition var8 = var0.getBaseNegativeItemLabelPosition();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     java.awt.Shape var19 = var10.lookupSeriesShape(10);
//     java.awt.Paint var21 = null;
//     var10.setSeriesFillPaint(0, var21, false);
//     boolean var24 = var10.getBaseShapesVisible();
//     java.awt.Paint var25 = var10.getBaseOutlinePaint();
//     java.awt.Stroke var26 = var10.getBaseStroke();
//     var0.setSeriesStroke(0, var26, true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var0
//     assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var10 and var0.", var10.equals(var0) == var0.equals(var10));
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var14 = null;
//     var12.setSeriesOutlineStroke(100, var14);
//     java.awt.Paint var17 = null;
//     var12.setSeriesOutlinePaint(0, var17, true);
//     java.awt.Shape var21 = var12.lookupSeriesShape(10);
//     java.awt.Paint var23 = null;
//     var12.setSeriesFillPaint(0, var23, false);
//     boolean var26 = var12.getBaseShapesVisible();
//     java.awt.Paint var27 = var12.getBaseOutlinePaint();
//     int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var31 = null;
//     var29.setSeriesOutlineStroke(100, var31);
//     java.awt.Paint var34 = null;
//     var29.setSeriesOutlinePaint(0, var34, true);
//     java.awt.Shape var38 = var29.lookupSeriesShape(10);
//     org.jfree.chart.entity.ChartEntity var39 = new org.jfree.chart.entity.ChartEntity(var38);
//     var12.setBaseShape(var38, true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var29
//     assertTrue("Contract failed: equals-hashcode on var12 and var29", var12.equals(var29) ? var12.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var12
//     assertTrue("Contract failed: equals-hashcode on var29 and var12", var29.equals(var12) ? var29.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    java.lang.String var4 = var3.toString();
    float[] var6 = new float[] { 10.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var7 = var3.getRGBComponents(var6);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.awt.Color[r=0,g=0,b=0]"+ "'", var4.equals("java.awt.Color[r=0,g=0,b=0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     java.util.Locale var1 = null;
//     java.util.ResourceBundle var2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("java.awt.Color[r=0,g=0,b=0]", var1);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.axis.AxisSpace var12 = null;
    var0.setFixedRangeAxisSpace(var12);
    org.jfree.chart.plot.Marker var15 = null;
    org.jfree.chart.util.Layer var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var0.removeRangeMarker(10, var15, var16, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var18 = var0.getPositiveItemLabelPosition(1, 10, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var21 = null;
//     var19.setSeriesURLGenerator(10, var21);
//     org.jfree.chart.labels.ItemLabelPosition var24 = null;
//     var19.setSeriesNegativeItemLabelPosition(0, var24, true);
//     java.awt.Stroke var28 = var19.lookupSeriesStroke(0);
//     var0.setBaseOutlineStroke(var28);
//     
//     // Checks the contract:  equals-hashcode on var0 and var19
//     assertTrue("Contract failed: equals-hashcode on var0 and var19", var0.equals(var19) ? var0.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var0
//     assertTrue("Contract failed: equals-hashcode on var19 and var0", var19.equals(var0) ? var19.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var3 = var0.getColumnKey(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeObject(var2, (java.lang.Comparable)0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.chart.labels.ItemLabelAnchor var0 = null;
    org.jfree.chart.text.TextAnchor var1 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    org.jfree.chart.labels.ItemLabelPosition var7 = var2.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.text.TextAnchor var8 = var7.getRotationAnchor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.labels.ItemLabelPosition var10 = new org.jfree.chart.labels.ItemLabelPosition(var0, var1, var8, 2.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var13 = null;
    var11.setSeriesOutlineStroke(100, var13);
    java.awt.Paint var16 = null;
    var11.setSeriesOutlinePaint(0, var16, true);
    var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var23 = var11.lookupSeriesShape((-1));
    var0.setSeriesShape(0, var23);
    java.awt.Graphics2D var25 = null;
    java.awt.geom.Rectangle2D var26 = null;
    org.jfree.chart.plot.CategoryPlot var27 = new org.jfree.chart.plot.CategoryPlot();
    var27.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var30 = null;
    org.jfree.chart.axis.ValueAxis var31 = null;
    org.jfree.data.category.CategoryDataset var32 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var37 = var0.createHotSpotShape(var25, var26, var27, var30, var31, var32, 15, 1, false, var36);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var14 = null;
//     var12.setSeriesOutlineStroke(100, var14);
//     java.awt.Paint var17 = null;
//     var12.setSeriesOutlinePaint(0, var17, true);
//     java.awt.Shape var21 = var12.lookupSeriesShape(10);
//     java.awt.Paint var23 = null;
//     var12.setSeriesFillPaint(0, var23, false);
//     boolean var26 = var12.getBaseShapesVisible();
//     java.awt.Paint var27 = var12.getBaseOutlinePaint();
//     int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
//     org.jfree.chart.LegendItemCollection var29 = var0.getFixedLegendItems();
//     org.jfree.chart.plot.Marker var30 = null;
//     org.jfree.chart.util.Layer var31 = null;
//     var0.addRangeMarker(var30, var31);
// 
//   }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.awt.Color var3 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
//     java.awt.color.ColorSpace var4 = null;
//     float[] var8 = new float[] { (-1.0f), (-1.0f), 1.0f};
//     float[] var9 = var3.getComponents(var4, var8);
// 
//   }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
    org.jfree.chart.plot.CategoryMarker var12 = null;
    org.jfree.chart.util.Layer var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addDomainMarker(1, var12, var13, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    boolean var14 = var0.isRangePannable();
    org.jfree.chart.annotations.CategoryAnnotation var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var15, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     java.awt.Paint var15 = var0.getBaseOutlinePaint();
//     java.awt.Stroke var16 = var0.getBaseStroke();
//     java.awt.Graphics2D var17 = null;
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     var18.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var21 = null;
//     org.jfree.chart.plot.CategoryMarker var22 = null;
//     java.awt.geom.Rectangle2D var23 = null;
//     var0.drawDomainMarker(var17, var18, var21, var22, var23);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     var0.setBaseSeriesVisibleInLegend(true);
//     java.awt.Font var17 = var0.getBaseLegendTextFont();
//     java.awt.Graphics2D var18 = null;
//     java.awt.geom.Rectangle2D var19 = null;
//     org.jfree.chart.axis.CategoryAxis var20 = null;
//     org.jfree.chart.axis.ValueAxis var21 = null;
//     org.jfree.chart.util.Layer var22 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var23 = null;
//     var0.drawAnnotations(var18, var19, var20, var21, var22, var23);
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var6 = null;
    var4.setSeriesURLGenerator(10, var6);
    org.jfree.chart.labels.ItemLabelPosition var9 = null;
    var4.setSeriesNegativeItemLabelPosition(0, var9, true);
    java.awt.Stroke var13 = var4.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var17 = null;
    var15.setSeriesOutlineStroke(100, var17);
    java.awt.Paint var20 = null;
    var15.setSeriesOutlinePaint(0, var20, true);
    var15.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var27 = var15.lookupSeriesShape((-1));
    var4.setSeriesShape(0, var27);
    java.awt.Paint var29 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var30 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", "hi!", "", "NOID", var27, var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
//     java.awt.Paint var12 = var0.getRangeGridlinePaint();
//     var0.setForegroundAlpha((-1.0f));
//     org.jfree.chart.axis.CategoryAxis var15 = null;
//     java.util.List var16 = var0.getCategoriesForAxis(var15);
//     var0.zoom(100.0d);
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeObject((java.lang.Comparable)10L, var2);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.util.Layer var7 = null;
//     java.util.Collection var8 = var0.getDomainMarkers(var7);
//     org.jfree.chart.axis.AxisSpace var9 = var0.getFixedRangeAxisSpace();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var12 = null;
//     var10.setSeriesURLGenerator(10, var12);
//     org.jfree.chart.labels.ItemLabelPosition var15 = null;
//     var10.setSeriesNegativeItemLabelPosition(0, var15, true);
//     java.awt.Stroke var19 = var10.lookupSeriesStroke(0);
//     var0.setRangeGridlineStroke(var19);
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     java.awt.geom.Point2D var23 = null;
//     org.jfree.chart.plot.PlotState var24 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var25 = null;
//     var0.draw(var21, var22, var23, var24, var25);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn(15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var18);
//     java.awt.Graphics2D var20 = null;
//     org.jfree.chart.plot.CategoryPlot var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     var0.drawBackground(var20, var21, var22);
// 
//   }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var10 = null;
//     var8.setSeriesOutlineStroke(100, var10);
//     java.awt.Paint var13 = null;
//     var8.setSeriesOutlinePaint(0, var13, true);
//     java.awt.Shape var17 = var8.lookupSeriesShape(10);
//     java.awt.Paint var19 = null;
//     var8.setSeriesFillPaint(0, var19, false);
//     boolean var22 = var8.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var24 = var8.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var25 = var8.getBaseItemLabelFont();
//     var0.setSeriesLabelFont(15, var25);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    var0.setUseSeriesOffset(true);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var9 = null;
    var7.setSeriesURLGenerator(10, var9);
    org.jfree.chart.labels.ItemLabelPosition var12 = var7.getSeriesPositiveItemLabelPosition(1);
    var0.setSeriesPositiveItemLabelPosition(2, var12, true);
    java.awt.Paint var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseOutlinePaint(var15, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    java.awt.Graphics2D var19 = null;
    java.awt.geom.Rectangle2D var20 = null;
    org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    org.jfree.chart.plot.CategoryCrosshairState var26 = null;
    boolean var27 = var21.render(var22, var23, 100, var25, var26);
    org.jfree.chart.event.MarkerChangeEvent var28 = null;
    var21.markerChanged(var28);
    var21.setDrawSharedDomainAxis(true);
    int var32 = var21.getBackgroundImageAlignment();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var35 = null;
    var33.setSeriesOutlineStroke(100, var35);
    java.awt.Paint var38 = null;
    var33.setSeriesOutlinePaint(0, var38, true);
    java.awt.Shape var42 = var33.lookupSeriesShape(10);
    java.awt.Paint var44 = null;
    var33.setSeriesFillPaint(0, var44, false);
    boolean var47 = var33.getBaseShapesVisible();
    java.awt.Paint var48 = var33.getBaseOutlinePaint();
    int var49 = var21.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var33);
    org.jfree.chart.LegendItemCollection var50 = var21.getFixedLegendItems();
    org.jfree.chart.axis.CategoryAxis var51 = null;
    org.jfree.chart.axis.ValueAxis var52 = null;
    org.jfree.data.category.CategoryDataset var53 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var57 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var58 = var0.createHotSpotShape(var19, var20, var21, var51, var52, var53, 0, 100, false, var57);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.awt.Color var4 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    int var5 = var4.getRed();
    java.awt.Color var6 = java.awt.Color.getColor("", var4);
    float[] var7 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var8 = var6.getColorComponents(var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var10 = null;
//     var8.setSeriesURLGenerator(10, var10);
//     java.awt.Font var12 = var8.getBaseItemLabelFont();
//     var0.setSeriesLabelFont(0, var12);
// 
//   }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var10 = null;
//     var8.setSeriesURLGenerator(10, var10);
//     boolean var15 = var8.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
//     var8.setPlot(var16);
//     org.jfree.chart.axis.ValueAxis var18 = null;
//     org.jfree.data.Range var19 = var16.getDataRange(var18);
//     var0.setPlot(var16);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.jfree.chart.renderer.category.BarPainter var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.renderer.category.BarRenderer.setDefaultBarPainter(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var6 = null;
    var4.setSeriesOutlineStroke(100, var6);
    java.awt.Paint var9 = null;
    var4.setSeriesOutlinePaint(0, var9, true);
    var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var16 = var4.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
    java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    int var22 = var21.getRed();
    org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
    java.awt.Color var27 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var23.setFillPaint((java.awt.Paint)var27);
    java.awt.Paint var29 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setOutlinePaint(var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    java.awt.Graphics2D var10 = null;
    java.awt.geom.Rectangle2D var11 = null;
    org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var13 = null;
    java.awt.geom.Rectangle2D var14 = null;
    org.jfree.chart.plot.PlotRenderingInfo var16 = null;
    org.jfree.chart.plot.CategoryCrosshairState var17 = null;
    boolean var18 = var12.render(var13, var14, 100, var16, var17);
    org.jfree.chart.event.MarkerChangeEvent var19 = null;
    var12.markerChanged(var19);
    org.jfree.chart.axis.CategoryAxis var21 = null;
    org.jfree.chart.axis.ValueAxis var22 = null;
    org.jfree.data.category.CategoryDataset var23 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var28 = var0.createHotSpotShape(var10, var11, var12, var21, var22, var23, 10, (-1), false, var27);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var5 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var0.setSeriesOutlinePaint(0, (java.awt.Paint)var5);
//     java.lang.Boolean var7 = var0.getDefaultCreateEntity();
//     org.jfree.chart.util.ObjectList var9 = new org.jfree.chart.util.ObjectList();
//     java.lang.Object var11 = var9.get(1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var14 = null;
//     var12.setSeriesURLGenerator(10, var14);
//     org.jfree.chart.labels.ItemLabelPosition var17 = var12.getSeriesPositiveItemLabelPosition(1);
//     var12.setItemLabelAnchorOffset(1.0d);
//     java.awt.Color var24 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var25 = var24.getRed();
//     java.awt.Color var26 = java.awt.Color.getColor("", var24);
//     var12.setBasePaint((java.awt.Paint)var24);
//     boolean var28 = var9.equals((java.lang.Object)var24);
//     var0.setSeriesLabelPaint((-1), (java.awt.Paint)var24);
// 
//   }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     var0.removeAnnotations();
//     org.jfree.chart.labels.CategoryToolTipGenerator var5 = var0.getBaseToolTipGenerator();
//     java.awt.Paint var6 = var0.getBaseItemLabelPaint();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var10 = null;
//     var8.setSeriesURLGenerator(10, var10);
//     org.jfree.chart.labels.ItemLabelPosition var13 = null;
//     var8.setSeriesNegativeItemLabelPosition(0, var13, true);
//     java.awt.Stroke var17 = var8.lookupSeriesStroke(0);
//     var0.setSeriesOutlineStroke(3, var17, false);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var8 and var0.", var8.equals(var0) == var0.equals(var8));
// 
//   }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var6 = null;
//     var4.setSeriesOutlineStroke(100, var6);
//     java.awt.Paint var9 = null;
//     var4.setSeriesOutlinePaint(0, var9, true);
//     java.awt.Shape var13 = var4.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var16 = null;
//     var14.setSeriesURLGenerator(10, var16);
//     org.jfree.chart.labels.ItemLabelPosition var19 = null;
//     var14.setSeriesNegativeItemLabelPosition(0, var19, true);
//     java.awt.Stroke var23 = var14.lookupSeriesStroke(0);
//     org.jfree.chart.plot.DefaultDrawingSupplier var24 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.awt.Paint var25 = var24.getNextPaint();
//     org.jfree.chart.LegendItem var26 = new org.jfree.chart.LegendItem("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", "ChartEntity: tooltip = null", "hi!", "hi!", var13, var23, var25);
//     
//     // Checks the contract:  equals-hashcode on var4 and var14
//     assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var4
//     assertTrue("Contract failed: equals-hashcode on var14 and var4", var14.equals(var4) ? var14.hashCode() == var4.hashCode() : true);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var12 = null;
    var10.setSeriesOutlineStroke(100, var12);
    java.awt.Paint var15 = null;
    var10.setSeriesOutlinePaint(0, var15, true);
    org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
    var0.setBaseNegativeItemLabelPosition(var18);
    boolean var20 = var0.getAutoPopulateSeriesOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.entity.ChartEntity var10 = new org.jfree.chart.entity.ChartEntity(var9);
//     java.lang.String var11 = var10.getURLText();
//     java.lang.String var12 = var10.toString();
//     java.lang.String var13 = var10.getShapeCoords();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var16 = null;
//     var14.setSeriesOutlineStroke(100, var16);
//     java.awt.Paint var19 = null;
//     var14.setSeriesOutlinePaint(0, var19, true);
//     var14.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var26 = var14.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var27 = new org.jfree.chart.entity.ChartEntity(var26);
//     var10.setArea(var26);
//     
//     // Checks the contract:  equals-hashcode on var0 and var14
//     assertTrue("Contract failed: equals-hashcode on var0 and var14", var0.equals(var14) ? var0.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var14.", var0.equals(var14) == var14.equals(var0));
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.plot.PlotOrientation var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOrientation(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     boolean var7 = var0.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     var0.setPlot(var8);
//     org.jfree.chart.axis.CategoryAnchor var10 = var8.getDomainGridlinePosition();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var13 = null;
//     var11.setSeriesOutlineStroke(100, var13);
//     java.awt.Paint var16 = null;
//     var11.setSeriesOutlinePaint(0, var16, true);
//     java.awt.Shape var20 = var11.lookupSeriesShape(10);
//     java.awt.Paint var22 = null;
//     var11.setSeriesFillPaint(0, var22, false);
//     boolean var25 = var11.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var29 = var11.getPositiveItemLabelPosition(1, 10, true);
//     java.awt.Paint var30 = var11.getBasePaint();
//     var8.setRangeZeroBaselinePaint(var30);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var1 = null;
    org.jfree.chart.axis.ValueAxis var2 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    java.awt.Paint var8 = null;
    var3.setSeriesOutlinePaint(0, var8, true);
    java.awt.Shape var12 = var3.lookupSeriesShape(10);
    java.awt.Paint var14 = null;
    var3.setSeriesFillPaint(0, var14, false);
    boolean var17 = var3.getBaseShapesVisible();
    java.awt.Paint var18 = var3.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var19 = var3.getBaseNegativeItemLabelPosition();
    var3.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot(var0, var1, var2, (org.jfree.chart.renderer.category.CategoryItemRenderer)var3);
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    java.awt.geom.Point2D var26 = null;
    var22.zoomDomainAxes(0.0d, 0.0d, var25, var26);
    org.jfree.chart.axis.ValueAxis var29 = var22.getRangeAxisForDataset(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test72() {}
//   public void test72() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }
// 
// 
//     java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, 0.0f);
//     java.awt.color.ColorSpace var4 = null;
//     float[] var8 = new float[] { 10.0f, 100.0f, 10.0f};
//     float[] var9 = var3.getColorComponents(var4, var8);
// 
//   }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var18);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var22 = null;
//     var20.setSeriesURLGenerator(10, var22);
//     java.awt.Font var24 = var20.getBaseItemLabelFont();
//     org.jfree.chart.labels.CategorySeriesLabelGenerator var25 = null;
//     var20.setLegendItemToolTipGenerator(var25);
//     java.awt.Paint var28 = var20.getSeriesFillPaint(10);
//     boolean var29 = var18.equals((java.lang.Object)var20);
//     
//     // Checks the contract:  equals-hashcode on var0 and var20
//     assertTrue("Contract failed: equals-hashcode on var0 and var20", var0.equals(var20) ? var0.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var20
//     assertTrue("Contract failed: equals-hashcode on var10 and var20", var10.equals(var20) ? var10.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var0
//     assertTrue("Contract failed: equals-hashcode on var20 and var0", var20.equals(var0) ? var20.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var10
//     assertTrue("Contract failed: equals-hashcode on var20 and var10", var20.equals(var10) ? var20.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeValue((java.lang.Comparable)15);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    double var15 = var11.calculateTopInset(100.0d);
    double var17 = var11.calculateLeftInset(100.0d);
    java.awt.geom.Rectangle2D var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var21 = var11.createOutsetRectangle(var18, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 8.0d);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
    org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var11 = null;
    java.awt.geom.Rectangle2D var12 = null;
    org.jfree.chart.plot.PlotRenderingInfo var14 = null;
    org.jfree.chart.plot.CategoryCrosshairState var15 = null;
    boolean var16 = var10.render(var11, var12, 100, var14, var15);
    org.jfree.chart.event.MarkerChangeEvent var17 = null;
    var10.markerChanged(var17);
    var10.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var21 = var10.getDrawingSupplier();
    java.awt.Paint var22 = var10.getRangeGridlinePaint();
    var10.setForegroundAlpha((-1.0f));
    org.jfree.chart.axis.CategoryAxis var25 = null;
    java.util.List var26 = var10.getCategoriesForAxis(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxes(100, var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    var0.setNoDataMessage("");
    java.awt.Color var8 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var0.setRangeZeroBaselinePaint((java.awt.Paint)var8);
    org.jfree.chart.util.Layer var10 = null;
    java.util.Collection var11 = var0.getDomainMarkers(var10);
    org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var14 = null;
    java.awt.geom.Rectangle2D var15 = null;
    org.jfree.chart.plot.PlotRenderingInfo var17 = null;
    org.jfree.chart.plot.CategoryCrosshairState var18 = null;
    boolean var19 = var13.render(var14, var15, 100, var17, var18);
    org.jfree.chart.event.MarkerChangeEvent var20 = null;
    var13.markerChanged(var20);
    org.jfree.chart.plot.Marker var23 = null;
    org.jfree.chart.util.Layer var24 = null;
    boolean var26 = var13.removeDomainMarker(10, var23, var24, true);
    org.jfree.chart.axis.AxisLocation var28 = var13.getDomainAxisLocation(0);
    org.jfree.chart.axis.AxisLocation var29 = org.jfree.chart.axis.AxisLocation.getOpposite(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation((-16777216), var28, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }
// 
// 
//     org.jfree.chart.util.StandardGradientPaintTransformer var0 = new org.jfree.chart.util.StandardGradientPaintTransformer();
//     java.awt.GradientPaint var1 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var4 = null;
//     var2.setSeriesOutlineStroke(100, var4);
//     java.awt.Paint var7 = null;
//     var2.setSeriesOutlinePaint(0, var7, true);
//     java.awt.Shape var11 = var2.lookupSeriesShape(10);
//     java.awt.GradientPaint var12 = var0.transform(var1, var11);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
    org.jfree.chart.plot.PlotRenderingInfo var13 = null;
    java.awt.geom.Point2D var14 = null;
    var8.zoomDomainAxes(1.0d, 4.0d, var13, var14);
    org.jfree.chart.axis.CategoryAnchor var16 = var8.getDomainGridlinePosition();
    var8.setRangeCrosshairValue(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     org.jfree.chart.renderer.RenderAttributes var19 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var22 = var19.getItemShape(0, 0);
//     java.awt.Paint var23 = var19.getDefaultLabelPaint();
//     java.lang.Boolean var24 = var19.getDefaultLabelVisible();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var27 = null;
//     var25.setSeriesOutlineStroke(100, var27);
//     java.awt.Paint var30 = null;
//     var25.setSeriesOutlinePaint(0, var30, true);
//     java.awt.Shape var34 = var25.lookupSeriesShape(10);
//     java.awt.Paint var36 = null;
//     var25.setSeriesFillPaint(0, var36, false);
//     boolean var39 = var25.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var41 = var25.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var42 = var25.getBaseItemLabelFont();
//     var19.setDefaultLabelFont(var42);
//     var0.setLabelFont(var42);
//     
//     // Checks the contract:  equals-hashcode on var1 and var25
//     assertTrue("Contract failed: equals-hashcode on var1 and var25", var1.equals(var25) ? var1.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var1
//     assertTrue("Contract failed: equals-hashcode on var25 and var1", var25.equals(var1) ? var25.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var2 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var5 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var6 = null;
//     boolean var7 = var1.render(var2, var3, 100, var5, var6);
//     org.jfree.chart.plot.Plot var8 = var1.getParent();
//     org.jfree.data.general.DatasetGroup var9 = var1.getDatasetGroup();
//     java.awt.Paint var10 = var1.getDomainGridlinePaint();
//     var0.setDefaultPaint(var10);
//     java.awt.Shape var13 = var0.getSeriesShape(10);
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     var15.setWeight(10);
//     java.awt.Paint var18 = var15.getRangeZeroBaselinePaint();
//     var0.setSeriesLabelPaint(1, var18);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
//     org.jfree.chart.plot.Marker var12 = null;
//     org.jfree.chart.util.Layer var13 = null;
//     boolean var14 = var0.removeDomainMarker(var12, var13);
//     org.jfree.chart.plot.Marker var15 = null;
//     var0.addRangeMarker(var15);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
    org.jfree.chart.plot.Plot var12 = var0.getRootPlot();
    org.jfree.chart.annotations.CategoryAnnotation var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var13, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var3 = null;
//     var1.setSeriesOutlineStroke(100, var3);
//     java.awt.Paint var6 = null;
//     var1.setSeriesOutlinePaint(0, var6, true);
//     java.awt.Shape var10 = var1.lookupSeriesShape(10);
//     java.awt.Paint var12 = null;
//     var1.setSeriesFillPaint(0, var12, false);
//     boolean var15 = var1.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var17 = var1.getSeriesNegativeItemLabelPosition(2);
//     var0.setPositiveItemLabelPositionFallback(var17);
//     java.awt.Graphics2D var19 = null;
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var21.setRangeCrosshairValue((-1.0d));
//     var21.setNoDataMessage("");
//     java.awt.Color var29 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var21.setRangeZeroBaselinePaint((java.awt.Paint)var29);
//     org.jfree.chart.util.Layer var31 = null;
//     java.util.Collection var32 = var21.getDomainMarkers(var31);
//     org.jfree.chart.axis.CategoryAxis var33 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var36 = null;
//     var34.setSeriesURLGenerator(10, var36);
//     java.awt.Font var38 = var34.getBaseItemLabelFont();
//     var33.setLabelFont(var38);
//     org.jfree.chart.plot.CategoryPlot var40 = new org.jfree.chart.plot.CategoryPlot();
//     var40.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var43 = var40.getDomainAxis();
//     var33.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var40);
//     var33.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var33.setCategoryMargin(1.0d);
//     var33.setFixedDimension(2.0d);
//     org.jfree.chart.plot.CategoryPlot var52 = new org.jfree.chart.plot.CategoryPlot();
//     var52.setRangeCrosshairValue((-1.0d));
//     var33.setPlot((org.jfree.chart.plot.Plot)var52);
//     org.jfree.chart.axis.ValueAxis var56 = null;
//     org.jfree.data.category.CategoryDataset var57 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var61 = null;
//     java.awt.geom.Rectangle2D var62 = null;
//     java.awt.geom.Rectangle2D var63 = var0.createHotSpotBounds(var19, var20, var21, var33, var56, var57, 0, (-1), true, var61, var62);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    var0.mapDatasetToDomainAxis(1, 10);
    var0.setAnchorValue(100.0d, true);
    org.jfree.chart.annotations.CategoryAnnotation var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = var0.removeAnnotation(var20, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    var8.setDomainCrosshairRowKey((java.lang.Comparable)(-1.0f));
    java.awt.Paint var12 = var8.getRangeCrosshairPaint();
    org.jfree.chart.axis.ValueAxis var13 = null;
    org.jfree.chart.axis.ValueAxis[] var14 = new org.jfree.chart.axis.ValueAxis[] { var13};
    var8.setRangeAxes(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.mapDatasetToRangeAxis((-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.util.List var1 = var0.getAnnotations();
    org.jfree.chart.util.DefaultShadowGenerator var2 = new org.jfree.chart.util.DefaultShadowGenerator();
    var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var2);
    org.jfree.chart.plot.Marker var4 = null;
    org.jfree.chart.util.Layer var5 = null;
    boolean var6 = var0.removeDomainMarker(var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     var0.setSeriesLabelVisible(3, (java.lang.Boolean)true);
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.chart.renderer.RenderAttributes var1 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var6 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var1.setSeriesOutlinePaint(0, (java.awt.Paint)var6);
    java.awt.image.ColorModel var8 = null;
    java.awt.Rectangle var9 = null;
    java.awt.geom.Rectangle2D var10 = null;
    java.awt.geom.AffineTransform var11 = null;
    java.awt.RenderingHints var12 = null;
    java.awt.PaintContext var13 = var6.createContext(var8, var9, var10, var11, var12);
    java.awt.Color var14 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var6);
    float[] var17 = new float[] { 0.0f, 100.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var18 = var14.getColorComponents(var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.awt.Stroke var8 = var0.getItemStroke(0, 0);
//     java.awt.Paint var11 = var0.getItemFillPaint(100, 0);
//     java.awt.Stroke var13 = var0.getSeriesOutlineStroke((-1));
// 
//   }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
//     var19.setRangeCrosshairValue((-1.0d));
//     var0.setPlot((org.jfree.chart.plot.Plot)var19);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var29 = null;
//     var27.setSeriesOutlineStroke(100, var29);
//     java.awt.Paint var32 = null;
//     var27.setSeriesOutlinePaint(0, var32, true);
//     var27.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var39 = var27.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var40 = new org.jfree.chart.entity.ChartEntity(var39);
//     java.awt.Color var44 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var45 = var44.getRed();
//     org.jfree.chart.LegendItem var46 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var39, (java.awt.Paint)var44);
//     java.awt.Color var50 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var46.setFillPaint((java.awt.Paint)var50);
//     var0.setTickMarkPaint((java.awt.Paint)var50);
//     
//     // Checks the contract:  equals-hashcode on var1 and var27
//     assertTrue("Contract failed: equals-hashcode on var1 and var27", var1.equals(var27) ? var1.hashCode() == var27.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var1 and var27.", var1.equals(var27) == var27.equals(var1));
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var2 = var0.getSeriesFillPaint(0);
    java.awt.Paint var6 = var0.getItemPaint(0, 0, true);
    java.awt.Color var11 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var12 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var11);
    java.awt.Shape var13 = var12.getShape();
    var0.setBaseShape(var13);
    org.jfree.chart.event.RendererChangeListener var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeChangeListener(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var3 = var0.getDomainAxis();
//     org.jfree.chart.axis.CategoryAxis var4 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var7 = null;
//     var5.setSeriesURLGenerator(10, var7);
//     java.awt.Font var9 = var5.getBaseItemLabelFont();
//     var4.setLabelFont(var9);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var14 = var11.getDomainAxis();
//     var4.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var11);
//     var4.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var4.setCategoryMargin(1.0d);
//     java.util.List var21 = var0.getCategoriesForAxis(var4);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     boolean var0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == true);
// 
//   }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = null;
//     var0.setSeriesNegativeItemLabelPosition(0, var5, true);
//     java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var13 = null;
//     var11.setSeriesOutlineStroke(100, var13);
//     java.awt.Paint var16 = null;
//     var11.setSeriesOutlinePaint(0, var16, true);
//     var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var23 = var11.lookupSeriesShape((-1));
//     var0.setSeriesShape(0, var23);
//     int var25 = var0.getPassCount();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var29 = null;
//     var27.setSeriesOutlineStroke(100, var29);
//     java.awt.Paint var32 = null;
//     var27.setSeriesOutlinePaint(0, var32, true);
//     java.awt.Shape var36 = var27.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var39 = null;
//     var37.setSeriesOutlineStroke(100, var39);
//     java.awt.Paint var42 = null;
//     var37.setSeriesOutlinePaint(0, var42, true);
//     org.jfree.chart.labels.ItemLabelPosition var45 = var37.getBaseNegativeItemLabelPosition();
//     var27.setBaseNegativeItemLabelPosition(var45);
//     var0.setSeriesNegativeItemLabelPosition(10, var45, true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var0
//     assertTrue("Contract failed: equals-hashcode on var27 and var0", var27.equals(var0) ? var27.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var11
//     assertTrue("Contract failed: equals-hashcode on var27 and var11", var27.equals(var11) ? var27.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var0
//     assertTrue("Contract failed: equals-hashcode on var37 and var0", var37.equals(var0) ? var37.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var11
//     assertTrue("Contract failed: equals-hashcode on var37 and var11", var37.equals(var11) ? var37.hashCode() == var11.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var27 and var0.", var27.equals(var0) == var0.equals(var27));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var27 and var11.", var27.equals(var11) == var11.equals(var27));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var37 and var0.", var37.equals(var0) == var0.equals(var37));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var37 and var11.", var37.equals(var11) == var11.equals(var37));
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     org.jfree.chart.plot.DefaultDrawingSupplier var0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.lang.Object var1 = var0.clone();
//     java.lang.Object var2 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var1 and var2
//     assertTrue("Contract failed: equals-hashcode on var1 and var2", var1.equals(var2) ? var1.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var1
//     assertTrue("Contract failed: equals-hashcode on var2 and var1", var2.equals(var1) ? var2.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var16 = var0.getSeriesNegativeItemLabelPosition(2);
//     org.jfree.chart.urls.CategoryURLGenerator var17 = null;
//     var0.setBaseURLGenerator(var17, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var23 = null;
//     var21.setSeriesOutlineStroke(100, var23);
//     java.awt.Paint var26 = null;
//     var21.setSeriesOutlinePaint(0, var26, true);
//     org.jfree.chart.labels.ItemLabelPosition var29 = var21.getBaseNegativeItemLabelPosition();
//     var0.setSeriesNegativeItemLabelPosition(1, var29);
//     
//     // Checks the contract:  equals-hashcode on var21 and var0
//     assertTrue("Contract failed: equals-hashcode on var21 and var0", var21.equals(var0) ? var21.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var21 and var0.", var21.equals(var0) == var0.equals(var21));
//     
//     // Checks the contract:  equals-hashcode on var16 and var29
//     assertTrue("Contract failed: equals-hashcode on var16 and var29", var16.equals(var29) ? var16.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var16
//     assertTrue("Contract failed: equals-hashcode on var29 and var16", var29.equals(var16) ? var29.hashCode() == var16.hashCode() : true);
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var5 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var0.setSeriesOutlinePaint(0, (java.awt.Paint)var5);
//     java.lang.Boolean var7 = var0.getDefaultCreateEntity();
//     org.jfree.chart.renderer.category.BarRenderer var9 = new org.jfree.chart.renderer.category.BarRenderer();
//     boolean var10 = var9.isDrawBarOutline();
//     boolean var11 = var9.isDrawBarOutline();
//     java.awt.Paint var12 = var9.getShadowPaint();
//     org.jfree.chart.LegendItem var13 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var12);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var16 = null;
//     var14.setSeriesOutlineStroke(100, var16);
//     java.awt.Paint var19 = null;
//     var14.setSeriesOutlinePaint(0, var19, true);
//     java.awt.Shape var23 = var14.lookupSeriesShape(10);
//     java.awt.Paint var25 = null;
//     var14.setSeriesFillPaint(0, var25, false);
//     boolean var28 = var14.getBaseShapesVisible();
//     java.awt.Paint var29 = null;
//     var14.setBasePaint(var29);
//     var14.setAutoPopulateSeriesOutlineStroke(false);
//     org.jfree.chart.urls.CategoryURLGenerator var34 = null;
//     var14.setSeriesURLGenerator(2, var34, true);
//     org.jfree.chart.plot.CategoryPlot var37 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var38 = null;
//     java.awt.geom.Rectangle2D var39 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var41 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var42 = null;
//     boolean var43 = var37.render(var38, var39, 100, var41, var42);
//     org.jfree.chart.event.MarkerChangeEvent var44 = null;
//     var37.markerChanged(var44);
//     var37.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var48 = var37.getDrawingSupplier();
//     java.awt.Paint var49 = var37.getRangeGridlinePaint();
//     var14.setBaseItemLabelPaint(var49, false);
//     var13.setOutlinePaint(var49);
//     var0.setDefaultFillPaint(var49);
//     java.lang.Boolean var56 = var0.getCreateEntity((-1), 1);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.util.List var1 = var0.getAnnotations();
//     org.jfree.chart.util.DefaultShadowGenerator var2 = new org.jfree.chart.util.DefaultShadowGenerator();
//     var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var2);
//     java.awt.image.BufferedImage var4 = null;
//     java.awt.image.BufferedImage var5 = var2.createDropShadow(var4);
// 
//   }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var14 = null;
//     var12.setSeriesOutlineStroke(100, var14);
//     java.awt.Paint var17 = null;
//     var12.setSeriesOutlinePaint(0, var17, true);
//     java.awt.Shape var21 = var12.lookupSeriesShape(10);
//     java.awt.Paint var23 = null;
//     var12.setSeriesFillPaint(0, var23, false);
//     boolean var26 = var12.getBaseShapesVisible();
//     java.awt.Paint var27 = var12.getBaseOutlinePaint();
//     int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
//     org.jfree.chart.LegendItemCollection var29 = var0.getFixedLegendItems();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var32 = null;
//     var30.setSeriesURLGenerator(10, var32);
//     org.jfree.chart.labels.ItemLabelPosition var35 = null;
//     var30.setSeriesNegativeItemLabelPosition(0, var35, true);
//     org.jfree.chart.labels.ItemLabelPosition var41 = var30.getPositiveItemLabelPosition(0, 1, false);
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var42 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var30};
//     var0.setRenderers(var42);
//     
//     // Checks the contract:  equals-hashcode on var12 and var30
//     assertTrue("Contract failed: equals-hashcode on var12 and var30", var12.equals(var30) ? var12.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var12
//     assertTrue("Contract failed: equals-hashcode on var30 and var12", var30.equals(var12) ? var30.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     org.jfree.chart.LegendItemCollection var0 = new org.jfree.chart.LegendItemCollection();
//     int var1 = var0.getItemCount();
//     org.jfree.chart.LegendItemCollection var2 = null;
//     var0.addAll(var2);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var16 = var0.getSeriesNegativeItemLabelPosition(2);
    java.awt.Font var17 = var0.getBaseItemLabelFont();
    var0.setSeriesShapesFilled(2, (java.lang.Boolean)false);
    org.jfree.chart.labels.CategoryToolTipGenerator var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesToolTipGenerator((-16777216), var22, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     java.awt.Paint var15 = var0.getBaseOutlinePaint();
//     org.jfree.chart.renderer.RenderAttributes var17 = new org.jfree.chart.renderer.RenderAttributes();
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var19 = null;
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var22 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var23 = null;
//     boolean var24 = var18.render(var19, var20, 100, var22, var23);
//     org.jfree.chart.plot.Plot var25 = var18.getParent();
//     org.jfree.data.general.DatasetGroup var26 = var18.getDatasetGroup();
//     java.awt.Paint var27 = var18.getDomainGridlinePaint();
//     var17.setDefaultPaint(var27);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Paint var32 = var30.getSeriesFillPaint(0);
//     java.awt.Paint var36 = var30.getItemPaint(0, 0, true);
//     var17.setSeriesFillPaint(10, var36);
//     var0.setSeriesFillPaint(2, var36);
//     
//     // Checks the contract:  equals-hashcode on var30 and var0
//     assertTrue("Contract failed: equals-hashcode on var30 and var0", var30.equals(var0) ? var30.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var30 and var0.", var30.equals(var0) == var0.equals(var30));
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     boolean var8 = var0.getBaseSeriesVisibleInLegend();
//     var0.setBaseCreateEntities(true);
//     java.awt.Graphics2D var11 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var14 = null;
//     var12.setSeriesURLGenerator(10, var14);
//     boolean var19 = var12.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var20 = new org.jfree.chart.plot.CategoryPlot();
//     var12.setPlot(var20);
//     org.jfree.chart.axis.ValueAxis var22 = var20.getRangeAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Paint var25 = var23.getSeriesFillPaint(0);
//     java.awt.Paint var29 = var23.getItemPaint(0, 0, true);
//     var20.setNoDataMessagePaint(var29);
//     java.awt.geom.Rectangle2D var31 = null;
//     var0.drawOutline(var11, var20, var31);
// 
//   }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }
// 
// 
//     org.jfree.chart.util.ObjectList var0 = new org.jfree.chart.util.ObjectList();
//     java.lang.Object var2 = var0.get(1);
//     org.jfree.chart.renderer.RenderAttributes var3 = new org.jfree.chart.renderer.RenderAttributes();
//     boolean var4 = var0.equals((java.lang.Object)var3);
//     java.awt.Stroke var7 = var3.getItemOutlineStroke(1, 10);
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.awt.Stroke var8 = var0.getItemStroke(0, 0);
//     java.awt.Paint var11 = var0.getItemFillPaint(100, 0);
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var17 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var18 = null;
//     boolean var19 = var13.render(var14, var15, 100, var17, var18);
//     org.jfree.chart.plot.Plot var20 = var13.getParent();
//     org.jfree.chart.axis.CategoryAxis var21 = null;
//     org.jfree.chart.axis.CategoryAxis[] var22 = new org.jfree.chart.axis.CategoryAxis[] { var21};
//     var13.setDomainAxes(var22);
//     java.awt.Stroke var24 = var13.getDomainGridlineStroke();
//     var0.setSeriesOutlineStroke(3, var24);
// 
//   }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var1 = null;
//     org.jfree.chart.axis.ValueAxis var2 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var5 = null;
//     var3.setSeriesOutlineStroke(100, var5);
//     java.awt.Paint var8 = null;
//     var3.setSeriesOutlinePaint(0, var8, true);
//     java.awt.Shape var12 = var3.lookupSeriesShape(10);
//     java.awt.Paint var14 = null;
//     var3.setSeriesFillPaint(0, var14, false);
//     boolean var17 = var3.getBaseShapesVisible();
//     java.awt.Paint var18 = var3.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var19 = var3.getBaseNegativeItemLabelPosition();
//     var3.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot(var0, var1, var2, (org.jfree.chart.renderer.category.CategoryItemRenderer)var3);
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var27 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var28 = null;
//     boolean var29 = var23.render(var24, var25, 100, var27, var28);
//     org.jfree.chart.event.MarkerChangeEvent var30 = null;
//     var23.markerChanged(var30);
//     org.jfree.chart.plot.Marker var33 = null;
//     org.jfree.chart.util.Layer var34 = null;
//     boolean var36 = var23.removeDomainMarker(10, var33, var34, true);
//     org.jfree.chart.axis.AxisLocation var38 = var23.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var39 = org.jfree.chart.axis.AxisLocation.getOpposite(var38);
//     var22.setDomainAxisLocation(var39, false);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var44 = null;
//     var42.setSeriesURLGenerator(10, var44);
//     boolean var49 = var42.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var50 = new org.jfree.chart.plot.CategoryPlot();
//     var42.setPlot(var50);
//     org.jfree.chart.axis.CategoryAnchor var52 = var50.getDomainGridlinePosition();
//     var22.setDomainGridlinePosition(var52);
//     
//     // Checks the contract:  equals-hashcode on var23 and var50
//     assertTrue("Contract failed: equals-hashcode on var23 and var50", var23.equals(var50) ? var23.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var23
//     assertTrue("Contract failed: equals-hashcode on var50 and var23", var50.equals(var23) ? var50.hashCode() == var23.hashCode() : true);
// 
//   }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var18);
//     org.jfree.chart.labels.ItemLabelAnchor var20 = var18.getItemLabelAnchor();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var23 = null;
//     var21.setSeriesURLGenerator(10, var23);
//     org.jfree.chart.labels.ItemLabelPosition var26 = var21.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.text.TextAnchor var27 = var26.getRotationAnchor();
//     java.lang.String var28 = var27.toString();
//     org.jfree.chart.labels.ItemLabelPosition var29 = new org.jfree.chart.labels.ItemLabelPosition(var20, var27);
//     
//     // Checks the contract:  equals-hashcode on var0 and var21
//     assertTrue("Contract failed: equals-hashcode on var0 and var21", var0.equals(var21) ? var0.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var21
//     assertTrue("Contract failed: equals-hashcode on var10 and var21", var10.equals(var21) ? var10.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var0
//     assertTrue("Contract failed: equals-hashcode on var21 and var0", var21.equals(var0) ? var21.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var10
//     assertTrue("Contract failed: equals-hashcode on var21 and var10", var21.equals(var10) ? var21.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var21 = null;
//     var19.setSeriesOutlineStroke(100, var21);
//     java.awt.Paint var24 = null;
//     var19.setSeriesOutlinePaint(0, var24, true);
//     java.awt.Shape var28 = var19.lookupSeriesShape(10);
//     java.awt.Paint var30 = null;
//     var19.setSeriesFillPaint(0, var30, false);
//     boolean var33 = var19.getBaseShapesVisible();
//     java.awt.Paint var34 = var19.getBaseOutlinePaint();
//     java.awt.Paint var36 = var19.lookupSeriesOutlinePaint(100);
//     var0.setLabelPaint(var36);
//     
//     // Checks the contract:  equals-hashcode on var1 and var19
//     assertTrue("Contract failed: equals-hashcode on var1 and var19", var1.equals(var19) ? var1.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var1
//     assertTrue("Contract failed: equals-hashcode on var19 and var1", var19.equals(var1) ? var19.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.entity.ChartEntity var10 = new org.jfree.chart.entity.ChartEntity(var9);
//     var10.setToolTipText("ChartEntity: tooltip = null");
//     org.jfree.chart.imagemap.ToolTipTagFragmentGenerator var13 = null;
//     org.jfree.chart.imagemap.URLTagFragmentGenerator var14 = null;
//     java.lang.String var15 = var10.getImageMapAreaTag(var13, var14);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    org.jfree.chart.util.UnitType var14 = var11.getUnitType();
    double var16 = var11.trimWidth(2.0d);
    java.awt.geom.Rectangle2D var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var18 = var11.createOutsetRectangle(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-14.0d));

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.awt.Stroke var8 = var0.getItemStroke(0, 0);
//     java.awt.Paint var11 = var0.getItemFillPaint(100, 0);
//     java.awt.Paint var12 = var0.getDefaultFillPaint();
//     java.lang.Boolean var14 = var0.getSeriesCreateEntity(0);
// 
//   }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.plot.PlotRenderingInfo var9 = null;
//     var0.handleClick(1, 100, var9);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    boolean var14 = var0.isRangeZeroBaselineVisible();
    org.jfree.chart.annotations.CategoryAnnotation var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var15, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.data.KeyedObject var2 = new org.jfree.data.KeyedObject((java.lang.Comparable)2.0d, (java.lang.Object)var1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var5 = null;
//     var3.setSeriesOutlineStroke(100, var5);
//     java.awt.Paint var8 = null;
//     var3.setSeriesOutlinePaint(0, var8, true);
//     java.awt.Shape var12 = var3.lookupSeriesShape(10);
//     org.jfree.chart.entity.ChartEntity var13 = new org.jfree.chart.entity.ChartEntity(var12);
//     java.lang.String var14 = var13.toString();
//     var2.setObject((java.lang.Object)var14);
//     
//     // Checks the contract:  equals-hashcode on var1 and var3
//     assertTrue("Contract failed: equals-hashcode on var1 and var3", var1.equals(var3) ? var1.hashCode() == var3.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var1
//     assertTrue("Contract failed: equals-hashcode on var3 and var1", var3.equals(var1) ? var3.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     java.awt.Paint var15 = null;
//     var0.setBasePaint(var15);
//     var0.setAutoPopulateSeriesOutlineStroke(false);
//     boolean var22 = var0.getItemCreateEntity(1, 0, false);
//     org.jfree.chart.labels.ItemLabelPosition var26 = var0.getPositiveItemLabelPosition(0, 15, true);
//     java.awt.Graphics2D var27 = null;
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var29 = null;
//     java.awt.geom.Rectangle2D var30 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var32 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var33 = null;
//     boolean var34 = var28.render(var29, var30, 100, var32, var33);
//     org.jfree.chart.event.MarkerChangeEvent var35 = null;
//     var28.markerChanged(var35);
//     org.jfree.chart.plot.Marker var38 = null;
//     org.jfree.chart.util.Layer var39 = null;
//     boolean var41 = var28.removeDomainMarker(10, var38, var39, true);
//     boolean var42 = var28.isRangeZeroBaselineVisible();
//     org.jfree.chart.axis.CategoryAxis var43 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var46 = null;
//     var44.setSeriesURLGenerator(10, var46);
//     java.awt.Font var48 = var44.getBaseItemLabelFont();
//     var43.setLabelFont(var48);
//     java.lang.Object var50 = var43.clone();
//     org.jfree.chart.plot.CategoryMarker var51 = null;
//     java.awt.geom.Rectangle2D var52 = null;
//     var0.drawDomainMarker(var27, var28, var43, var51, var52);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    int var2 = var0.getRowCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow((java.lang.Comparable)0.0f);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     java.awt.Paint var15 = var0.getBaseOutlinePaint();
//     var0.setUseSeriesOffset(false);
//     org.jfree.chart.labels.CategoryToolTipGenerator var18 = null;
//     var0.setBaseToolTipGenerator(var18, false);
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var27 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var28 = null;
//     boolean var29 = var23.render(var24, var25, 100, var27, var28);
//     boolean var30 = var23.isOutlineVisible();
//     org.jfree.chart.util.SortOrder var31 = var23.getRowRenderingOrder();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var34 = null;
//     var32.setSeriesOutlineStroke(100, var34);
//     java.awt.Paint var37 = null;
//     var32.setSeriesOutlinePaint(0, var37, true);
//     boolean var40 = var32.getBaseSeriesVisibleInLegend();
//     java.awt.Font var42 = var32.getSeriesItemLabelFont(1);
//     int var43 = var23.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var32);
//     org.jfree.data.category.CategoryDataset var44 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var45 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var46 = var0.initialise(var21, var22, var23, var44, var45);
//     
//     // Checks the contract:  equals-hashcode on var0 and var32
//     assertTrue("Contract failed: equals-hashcode on var0 and var32", var0.equals(var32) ? var0.hashCode() == var32.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var32 and var0
//     assertTrue("Contract failed: equals-hashcode on var32 and var0", var32.equals(var0) ? var32.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    boolean var12 = var0.canSelectByRegion();
    int var13 = var0.getDatasetCount();
    java.lang.String var14 = var0.getNoDataMessage();
    org.jfree.chart.plot.DatasetRenderingOrder var15 = var0.getDatasetRenderingOrder();
    org.jfree.chart.annotations.CategoryAnnotation var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = var0.removeAnnotation(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     org.jfree.chart.labels.ItemLabelPosition var8 = var0.getBaseNegativeItemLabelPosition();
//     boolean var9 = var0.getBaseSeriesVisible();
//     java.awt.Graphics2D var10 = null;
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var14 = null;
//     var12.setSeriesURLGenerator(10, var14);
//     boolean var19 = var12.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var20 = new org.jfree.chart.plot.CategoryPlot();
//     var12.setPlot(var20);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var24 = null;
//     var22.setSeriesOutlineStroke(100, var24);
//     java.awt.Paint var27 = null;
//     var22.setSeriesOutlinePaint(0, var27, true);
//     java.awt.Shape var31 = var22.lookupSeriesShape(10);
//     java.awt.Paint var33 = null;
//     var22.setSeriesFillPaint(0, var33, false);
//     boolean var36 = var22.getBaseShapesVisible();
//     java.awt.Paint var37 = var22.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var38 = var22.getBaseNegativeItemLabelPosition();
//     var22.setBaseSeriesVisible(false);
//     double var41 = var22.getItemLabelAnchorOffset();
//     org.jfree.chart.renderer.category.BarRenderer var43 = new org.jfree.chart.renderer.category.BarRenderer();
//     boolean var44 = var43.isDrawBarOutline();
//     boolean var45 = var43.isDrawBarOutline();
//     java.awt.Paint var46 = var43.getShadowPaint();
//     org.jfree.chart.LegendItem var47 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var46);
//     var22.setBaseLegendTextPaint(var46);
//     var20.setRangeMinorGridlinePaint(var46);
//     org.jfree.data.category.DefaultCategoryDataset var50 = new org.jfree.data.category.DefaultCategoryDataset();
//     org.jfree.chart.plot.PlotRenderingInfo var51 = null;
//     org.jfree.chart.renderer.category.CategoryItemRendererState var52 = var0.initialise(var10, var11, var20, (org.jfree.data.category.CategoryDataset)var50, var51);
//     
//     // Checks the contract:  equals-hashcode on var0 and var12
//     assertTrue("Contract failed: equals-hashcode on var0 and var12", var0.equals(var12) ? var0.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var0
//     assertTrue("Contract failed: equals-hashcode on var12 and var0", var12.equals(var0) ? var12.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var38
//     assertTrue("Contract failed: equals-hashcode on var8 and var38", var8.equals(var38) ? var8.hashCode() == var38.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var8
//     assertTrue("Contract failed: equals-hashcode on var38 and var8", var38.equals(var8) ? var38.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.lang.Boolean var8 = var0.getCreateEntity(100, 15);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(10);
    java.awt.Graphics2D var10 = null;
    java.awt.geom.Rectangle2D var11 = null;
    org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var13 = null;
    java.awt.geom.Rectangle2D var14 = null;
    org.jfree.chart.plot.PlotRenderingInfo var16 = null;
    org.jfree.chart.plot.CategoryCrosshairState var17 = null;
    boolean var18 = var12.render(var13, var14, 100, var16, var17);
    org.jfree.chart.event.MarkerChangeEvent var19 = null;
    var12.markerChanged(var19);
    var12.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var23 = var12.getDrawingSupplier();
    java.awt.Paint var24 = var12.getRangeGridlinePaint();
    org.jfree.chart.axis.ValueAxis var25 = null;
    var12.setRangeAxis(var25);
    org.jfree.chart.axis.CategoryAxis var27 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var30 = null;
    var28.setSeriesURLGenerator(10, var30);
    java.awt.Font var32 = var28.getBaseItemLabelFont();
    var27.setLabelFont(var32);
    org.jfree.chart.plot.CategoryPlot var34 = new org.jfree.chart.plot.CategoryPlot();
    var34.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var37 = var34.getDomainAxis();
    var27.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var34);
    org.jfree.chart.axis.ValueAxis var39 = null;
    org.jfree.data.category.DefaultCategoryDataset var40 = new org.jfree.data.category.DefaultCategoryDataset();
    int var41 = var40.getRowCount();
    org.jfree.chart.renderer.category.CategoryItemRendererState var45 = null;
    java.awt.geom.Rectangle2D var46 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var47 = var0.createHotSpotBounds(var10, var11, var12, var27, var39, (org.jfree.data.category.CategoryDataset)var40, 15, (-2), true, var45, var46);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeValue((-16777216));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var1 = var0.isDrawBarOutline();
    org.jfree.chart.labels.ItemLabelPosition var2 = var0.getPositiveItemLabelPositionFallback();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setMinorTickMarksVisible(false);
//     java.awt.geom.Rectangle2D var21 = null;
//     org.jfree.data.category.CategoryDataset var22 = null;
//     org.jfree.chart.axis.CategoryAxis var23 = null;
//     org.jfree.chart.axis.ValueAxis var24 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var27 = null;
//     var25.setSeriesOutlineStroke(100, var27);
//     java.awt.Paint var30 = null;
//     var25.setSeriesOutlinePaint(0, var30, true);
//     java.awt.Shape var34 = var25.lookupSeriesShape(10);
//     java.awt.Paint var36 = null;
//     var25.setSeriesFillPaint(0, var36, false);
//     boolean var39 = var25.getBaseShapesVisible();
//     java.awt.Paint var40 = var25.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var41 = var25.getBaseNegativeItemLabelPosition();
//     var25.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot(var22, var23, var24, (org.jfree.chart.renderer.category.CategoryItemRenderer)var25);
//     org.jfree.chart.plot.CategoryPlot var45 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var46 = null;
//     java.awt.geom.Rectangle2D var47 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var49 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var50 = null;
//     boolean var51 = var45.render(var46, var47, 100, var49, var50);
//     org.jfree.chart.event.MarkerChangeEvent var52 = null;
//     var45.markerChanged(var52);
//     org.jfree.chart.plot.Marker var55 = null;
//     org.jfree.chart.util.Layer var56 = null;
//     boolean var58 = var45.removeDomainMarker(10, var55, var56, true);
//     org.jfree.chart.axis.AxisLocation var60 = var45.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var61 = org.jfree.chart.axis.AxisLocation.getOpposite(var60);
//     var44.setDomainAxisLocation(var61, false);
//     org.jfree.chart.plot.CategoryPlot var64 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var65 = null;
//     java.awt.geom.Rectangle2D var66 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var68 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var69 = null;
//     boolean var70 = var64.render(var65, var66, 100, var68, var69);
//     org.jfree.chart.event.MarkerChangeEvent var71 = null;
//     var64.markerChanged(var71);
//     var64.setDrawSharedDomainAxis(true);
//     int var75 = var64.getBackgroundImageAlignment();
//     org.jfree.chart.axis.AxisSpace var76 = null;
//     var64.setFixedRangeAxisSpace(var76);
//     double var78 = var64.getRangeCrosshairValue();
//     org.jfree.chart.plot.PlotOrientation var79 = var64.getOrientation();
//     org.jfree.chart.util.RectangleEdge var80 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var61, var79);
//     double var81 = var0.getCategoryStart(3, (-2), var21, var80);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    java.awt.Paint var8 = null;
    var3.setSeriesOutlinePaint(0, var8, true);
    java.awt.Shape var12 = var3.lookupSeriesShape(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertValue((-16777216), (java.lang.Comparable)4.0d, (java.lang.Object)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    var0.setNoDataMessage("");
    java.awt.Color var8 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var0.setRangeZeroBaselinePaint((java.awt.Paint)var8);
    float[] var10 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var11 = var8.getComponents(var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var3 = var0.getValue(2, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    org.jfree.chart.util.DefaultShadowGenerator var18 = new org.jfree.chart.util.DefaultShadowGenerator();
    int var19 = var18.calculateOffsetX();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var22 = null;
    var20.setSeriesOutlineStroke(100, var22);
    var20.removeAnnotations();
    org.jfree.chart.labels.CategoryToolTipGenerator var25 = var20.getBaseToolTipGenerator();
    java.awt.Paint var26 = var20.getBaseItemLabelPaint();
    boolean var27 = var18.equals((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLegendTextPaint((-2), var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.plot.Plot var7 = var0.getParent();
//     org.jfree.chart.axis.CategoryAxis var8 = null;
//     org.jfree.chart.axis.CategoryAxis[] var9 = new org.jfree.chart.axis.CategoryAxis[] { var8};
//     var0.setDomainAxes(var9);
//     java.awt.Image var11 = var0.getBackgroundImage();
//     org.jfree.data.category.CategoryDataset var13 = null;
//     org.jfree.chart.axis.CategoryAxis var14 = null;
//     org.jfree.chart.axis.ValueAxis var15 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var18 = null;
//     var16.setSeriesOutlineStroke(100, var18);
//     java.awt.Paint var21 = null;
//     var16.setSeriesOutlinePaint(0, var21, true);
//     java.awt.Shape var25 = var16.lookupSeriesShape(10);
//     java.awt.Paint var27 = null;
//     var16.setSeriesFillPaint(0, var27, false);
//     boolean var30 = var16.getBaseShapesVisible();
//     java.awt.Paint var31 = var16.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var32 = var16.getBaseNegativeItemLabelPosition();
//     var16.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var35 = new org.jfree.chart.plot.CategoryPlot(var13, var14, var15, (org.jfree.chart.renderer.category.CategoryItemRenderer)var16);
//     org.jfree.chart.plot.CategoryPlot var36 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var37 = null;
//     java.awt.geom.Rectangle2D var38 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var40 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var41 = null;
//     boolean var42 = var36.render(var37, var38, 100, var40, var41);
//     org.jfree.chart.event.MarkerChangeEvent var43 = null;
//     var36.markerChanged(var43);
//     org.jfree.chart.plot.Marker var46 = null;
//     org.jfree.chart.util.Layer var47 = null;
//     boolean var49 = var36.removeDomainMarker(10, var46, var47, true);
//     org.jfree.chart.axis.AxisLocation var51 = var36.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var52 = org.jfree.chart.axis.AxisLocation.getOpposite(var51);
//     var35.setDomainAxisLocation(var52, false);
//     org.jfree.chart.plot.CategoryPlot var55 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var56 = null;
//     java.awt.geom.Rectangle2D var57 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var59 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var60 = null;
//     boolean var61 = var55.render(var56, var57, 100, var59, var60);
//     org.jfree.chart.event.MarkerChangeEvent var62 = null;
//     var55.markerChanged(var62);
//     var55.setDrawSharedDomainAxis(true);
//     int var66 = var55.getBackgroundImageAlignment();
//     org.jfree.chart.axis.AxisSpace var67 = null;
//     var55.setFixedRangeAxisSpace(var67);
//     double var69 = var55.getRangeCrosshairValue();
//     org.jfree.chart.plot.PlotOrientation var70 = var55.getOrientation();
//     org.jfree.chart.util.RectangleEdge var71 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var52, var70);
//     var0.setDomainAxisLocation(1, var52, true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var0
//     assertTrue("Contract failed: equals-hashcode on var36 and var0", var36.equals(var0) ? var36.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var36 and var0.", var36.equals(var0) == var0.equals(var36));
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     boolean var7 = var0.isOutlineVisible();
//     org.jfree.chart.util.SortOrder var8 = var0.getRowRenderingOrder();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var11 = null;
//     var9.setSeriesOutlineStroke(100, var11);
//     java.awt.Paint var14 = null;
//     var9.setSeriesOutlinePaint(0, var14, true);
//     boolean var17 = var9.getBaseSeriesVisibleInLegend();
//     java.awt.Font var19 = var9.getSeriesItemLabelFont(1);
//     int var20 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var9);
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     var0.drawBackground(var21, var22);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var13 = null;
    var11.setSeriesOutlineStroke(100, var13);
    java.awt.Paint var16 = null;
    var11.setSeriesOutlinePaint(0, var16, true);
    var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var23 = var11.lookupSeriesShape((-1));
    var0.setSeriesShape(0, var23);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var25 = null;
    var0.setLegendItemToolTipGenerator(var25);
    org.jfree.chart.labels.CategoryToolTipGenerator var27 = var0.getBaseToolTipGenerator();
    org.jfree.chart.event.RendererChangeListener var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeChangeListener(var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = var0.getSeriesItemLabelPaint(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var13 = null;
    var11.setSeriesOutlineStroke(100, var13);
    java.awt.Paint var16 = null;
    var11.setSeriesOutlinePaint(0, var16, true);
    var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var23 = var11.lookupSeriesShape((-1));
    var0.setSeriesShape(0, var23);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var25 = null;
    var0.setLegendItemToolTipGenerator(var25);
    org.jfree.chart.labels.CategoryToolTipGenerator var27 = var0.getBaseToolTipGenerator();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var31 = null;
    var29.setSeriesURLGenerator(10, var31);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var35 = null;
    var33.setSeriesURLGenerator(10, var35);
    org.jfree.chart.labels.ItemLabelPosition var38 = null;
    var33.setSeriesNegativeItemLabelPosition(0, var38, true);
    java.awt.Stroke var42 = var33.lookupSeriesStroke(0);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var43 = var33.getLegendItemURLGenerator();
    var33.setSeriesItemLabelsVisible(0, true);
    java.awt.Font var50 = var33.getItemLabelFont(0, (-16777216), true);
    var29.setBaseLegendTextFont(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLegendTextFont((-1), var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setMinorTickMarksVisible(false);
//     java.awt.geom.Rectangle2D var24 = null;
//     org.jfree.chart.plot.CategoryPlot var25 = new org.jfree.chart.plot.CategoryPlot();
//     var25.setRangeCrosshairValue((-1.0d));
//     java.awt.Stroke var28 = var25.getDomainGridlineStroke();
//     org.jfree.chart.util.RectangleEdge var30 = var25.getDomainAxisEdge(15);
//     double var31 = var0.getCategorySeriesMiddle((-1), 0, 0, (-16777216), 100.0d, var24, var30);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setRangeCrosshairValue((-1.0d));
//     var7.setNoDataMessage("");
//     java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
//     var0.setDefaultFillPaint((java.awt.Paint)var15);
//     java.lang.Boolean var19 = var0.getSeriesCreateEntity(2);
// 
//   }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.jfree.chart.util.DefaultShadowGenerator var0 = new org.jfree.chart.util.DefaultShadowGenerator();
//     int var1 = var0.calculateOffsetX();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var4 = null;
//     var2.setSeriesOutlineStroke(100, var4);
//     var2.removeAnnotations();
//     org.jfree.chart.labels.CategoryToolTipGenerator var7 = var2.getBaseToolTipGenerator();
//     java.awt.Paint var8 = var2.getBaseItemLabelPaint();
//     boolean var9 = var0.equals((java.lang.Object)var8);
//     double var10 = var0.getAngle();
//     java.awt.image.BufferedImage var11 = null;
//     java.awt.image.BufferedImage var12 = var0.createDropShadow(var11);
// 
//   }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     java.awt.Graphics2D var19 = null;
//     org.jfree.chart.axis.AxisState var20 = null;
//     java.awt.geom.Rectangle2D var21 = null;
//     org.jfree.data.category.CategoryDataset var22 = null;
//     org.jfree.chart.axis.CategoryAxis var23 = null;
//     org.jfree.chart.axis.ValueAxis var24 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var27 = null;
//     var25.setSeriesOutlineStroke(100, var27);
//     java.awt.Paint var30 = null;
//     var25.setSeriesOutlinePaint(0, var30, true);
//     java.awt.Shape var34 = var25.lookupSeriesShape(10);
//     java.awt.Paint var36 = null;
//     var25.setSeriesFillPaint(0, var36, false);
//     boolean var39 = var25.getBaseShapesVisible();
//     java.awt.Paint var40 = var25.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var41 = var25.getBaseNegativeItemLabelPosition();
//     var25.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot(var22, var23, var24, (org.jfree.chart.renderer.category.CategoryItemRenderer)var25);
//     org.jfree.chart.axis.AxisSpace var45 = null;
//     var44.setFixedRangeAxisSpace(var45);
//     org.jfree.chart.util.RectangleEdge var48 = var44.getDomainAxisEdge(15);
//     java.util.List var49 = var0.refreshTicks(var19, var20, var21, var48);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    java.awt.Color var4 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var5 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var4);
    int var6 = var4.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
    org.jfree.chart.plot.PlotRenderingInfo var13 = null;
    java.awt.geom.Point2D var14 = null;
    var8.zoomDomainAxes(1.0d, 4.0d, var13, var14);
    var8.mapDatasetToRangeAxis(15, 10);
    org.jfree.chart.event.PlotChangeListener var19 = null;
    var8.addChangeListener(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.getObject((java.lang.Comparable)(byte)10);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var17 = null;
//     var15.setSeriesURLGenerator(10, var17);
//     org.jfree.chart.labels.ItemLabelPosition var20 = null;
//     var15.setSeriesNegativeItemLabelPosition(0, var20, true);
//     java.awt.Stroke var24 = var15.lookupSeriesStroke(10);
//     var0.setSeriesOutlineStroke(100, var24, false);
//     
//     // Checks the contract:  equals-hashcode on var15 and var0
//     assertTrue("Contract failed: equals-hashcode on var15 and var0", var15.equals(var0) ? var15.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var15 and var0.", var15.equals(var0) == var0.equals(var15));
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var6 = null;
//     var4.setSeriesOutlineStroke(100, var6);
//     java.awt.Paint var9 = null;
//     var4.setSeriesOutlinePaint(0, var9, true);
//     var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var16 = var4.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
//     java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var22 = var21.getRed();
//     org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
//     java.awt.Color var27 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var23.setFillPaint((java.awt.Paint)var27);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var31 = null;
//     var29.setSeriesOutlineStroke(100, var31);
//     var29.removeAnnotations();
//     org.jfree.chart.labels.CategoryToolTipGenerator var34 = var29.getBaseToolTipGenerator();
//     java.awt.Paint var35 = var29.getBaseItemLabelPaint();
//     var23.setOutlinePaint(var35);
//     
//     // Checks the contract:  equals-hashcode on var29 and var4
//     assertTrue("Contract failed: equals-hashcode on var29 and var4", var29.equals(var4) ? var29.hashCode() == var4.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var29 and var4.", var29.equals(var4) == var4.equals(var29));
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    var0.addValue((java.lang.Number)(-14.0d), (java.lang.Comparable)(-16777216), (java.lang.Comparable)3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var7 = var0.getValue(15, 15);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     boolean var8 = var1.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     var1.setPlot(var9);
//     org.jfree.chart.axis.ValueAxis var11 = var9.getRangeAxis();
//     org.jfree.chart.plot.PlotRenderingInfo var14 = null;
//     java.awt.geom.Point2D var15 = null;
//     var9.zoomDomainAxes(1.0d, 4.0d, var14, var15);
//     org.jfree.chart.axis.AxisLocation var18 = var9.getDomainAxisLocation((-1));
//     boolean var19 = var0.equals((java.lang.Object)var9);
//     org.jfree.chart.plot.CategoryPlot var20 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var24 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var25 = null;
//     boolean var26 = var20.render(var21, var22, 100, var24, var25);
//     boolean var27 = var20.isOutlineVisible();
//     org.jfree.chart.util.SortOrder var28 = var20.getRowRenderingOrder();
//     java.lang.String var29 = var28.toString();
//     var0.sortByKeys(var28);
//     
//     // Checks the contract:  equals-hashcode on var9 and var20
//     assertTrue("Contract failed: equals-hashcode on var9 and var20", var9.equals(var20) ? var9.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var9
//     assertTrue("Contract failed: equals-hashcode on var20 and var9", var20.equals(var9) ? var20.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    float[] var4 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var5 = var3.getComponents(var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    java.awt.Font var6 = var2.getBaseItemLabelFont();
    var1.setLabelFont(var6);
    java.lang.Object var8 = var1.clone();
    org.jfree.chart.axis.ValueAxis var9 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var12 = null;
    var10.setSeriesURLGenerator(10, var12);
    org.jfree.chart.labels.ItemLabelPosition var15 = var10.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.plot.CategoryPlot var16 = var10.getPlot();
    org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var0, var1, var9, (org.jfree.chart.renderer.category.CategoryItemRenderer)var10);
    java.lang.Comparable var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Paint var19 = var1.getTickLabelPaint(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setWeight(10);
    org.jfree.chart.plot.CategoryMarker var3 = null;
    org.jfree.chart.util.Layer var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var3, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var18);
//     org.jfree.chart.urls.CategoryURLGenerator var21 = var0.getSeriesURLGenerator(0);
//     java.awt.Graphics2D var22 = null;
//     org.jfree.chart.plot.CategoryPlot var23 = null;
//     java.awt.geom.Rectangle2D var24 = null;
//     var0.drawBackground(var22, var23, var24);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
//     boolean var1 = var0.isDrawBarOutline();
//     boolean var2 = var0.isDrawBarOutline();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var5 = null;
//     var3.setSeriesURLGenerator(10, var5);
//     boolean var10 = var3.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var3.setPlot(var11);
//     boolean var13 = var0.equals((java.lang.Object)var3);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var17 = null;
//     var15.setSeriesURLGenerator(10, var17);
//     boolean var22 = var15.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     var15.setPlot(var23);
//     java.awt.Paint var28 = var15.getItemFillPaint(1, 0, false);
//     var0.setSeriesOutlinePaint(100, var28);
//     
//     // Checks the contract:  equals-hashcode on var11 and var23
//     assertTrue("Contract failed: equals-hashcode on var11 and var23", var11.equals(var23) ? var11.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var11
//     assertTrue("Contract failed: equals-hashcode on var23 and var11", var23.equals(var11) ? var23.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.awt.Paint var7 = var0.getTickMarkPaint();
//     float var8 = var0.getTickMarkInsideLength();
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.data.category.CategoryDataset var12 = null;
//     org.jfree.chart.axis.CategoryAxis var13 = null;
//     org.jfree.chart.axis.ValueAxis var14 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var17 = null;
//     var15.setSeriesOutlineStroke(100, var17);
//     java.awt.Paint var20 = null;
//     var15.setSeriesOutlinePaint(0, var20, true);
//     java.awt.Shape var24 = var15.lookupSeriesShape(10);
//     java.awt.Paint var26 = null;
//     var15.setSeriesFillPaint(0, var26, false);
//     boolean var29 = var15.getBaseShapesVisible();
//     java.awt.Paint var30 = var15.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var31 = var15.getBaseNegativeItemLabelPosition();
//     var15.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var34 = new org.jfree.chart.plot.CategoryPlot(var12, var13, var14, (org.jfree.chart.renderer.category.CategoryItemRenderer)var15);
//     org.jfree.chart.plot.CategoryPlot var35 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var36 = null;
//     java.awt.geom.Rectangle2D var37 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var39 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var40 = null;
//     boolean var41 = var35.render(var36, var37, 100, var39, var40);
//     org.jfree.chart.event.MarkerChangeEvent var42 = null;
//     var35.markerChanged(var42);
//     org.jfree.chart.plot.Marker var45 = null;
//     org.jfree.chart.util.Layer var46 = null;
//     boolean var48 = var35.removeDomainMarker(10, var45, var46, true);
//     org.jfree.chart.axis.AxisLocation var50 = var35.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var51 = org.jfree.chart.axis.AxisLocation.getOpposite(var50);
//     var34.setDomainAxisLocation(var51, false);
//     org.jfree.chart.plot.CategoryPlot var54 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var55 = null;
//     java.awt.geom.Rectangle2D var56 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var58 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var59 = null;
//     boolean var60 = var54.render(var55, var56, 100, var58, var59);
//     org.jfree.chart.event.MarkerChangeEvent var61 = null;
//     var54.markerChanged(var61);
//     var54.setDrawSharedDomainAxis(true);
//     int var65 = var54.getBackgroundImageAlignment();
//     org.jfree.chart.axis.AxisSpace var66 = null;
//     var54.setFixedRangeAxisSpace(var66);
//     double var68 = var54.getRangeCrosshairValue();
//     org.jfree.chart.plot.PlotOrientation var69 = var54.getOrientation();
//     org.jfree.chart.util.RectangleEdge var70 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var51, var69);
//     double var71 = var0.getCategoryStart(10, 0, var11, var70);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    java.awt.Font var5 = var1.getBaseItemLabelFont();
    var0.setLabelFont(var5);
    org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
    var7.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
    var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
    var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
    var0.setCategoryMargin(1.0d);
    var0.setTickMarkOutsideLength(100.0f);
    java.awt.Stroke var19 = var0.getTickMarkStroke();
    org.jfree.chart.plot.Plot var20 = var0.getPlot();
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
    var24.setRangeCrosshairValue((-1.0d));
    java.awt.Stroke var27 = var24.getDomainGridlineStroke();
    org.jfree.chart.util.RectangleEdge var29 = var24.getDomainAxisEdge(15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var30 = var0.getCategoryMiddle(1, (-16777216), var23, var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var2 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var5 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var6 = null;
//     boolean var7 = var1.render(var2, var3, 100, var5, var6);
//     org.jfree.chart.plot.Plot var8 = var1.getParent();
//     org.jfree.data.general.DatasetGroup var9 = var1.getDatasetGroup();
//     java.awt.Paint var10 = var1.getDomainGridlinePaint();
//     var0.setDefaultPaint(var10);
//     var0.setDefaultCreateEntity((java.lang.Boolean)true);
//     org.jfree.chart.plot.DefaultDrawingSupplier var14 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.lang.Object var15 = var14.clone();
//     java.awt.Stroke var16 = var14.getNextOutlineStroke();
//     java.awt.Stroke var17 = var14.getNextStroke();
//     var0.setDefaultOutlineStroke(var17);
//     java.lang.Boolean var19 = var0.getDefaultLabelVisible();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var23 = null;
//     var21.setSeriesOutlineStroke(100, var23);
//     java.awt.Paint var26 = null;
//     var21.setSeriesOutlinePaint(0, var26, true);
//     var21.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var33 = var21.lookupSeriesShape((-1));
//     java.awt.Paint var35 = null;
//     var21.setLegendTextPaint(0, var35);
//     java.awt.Font var37 = var21.getBaseItemLabelFont();
//     var0.setSeriesLabelFont(0, var37);
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var22 = null;
//     var20.setSeriesOutlineStroke(100, var22);
//     java.awt.Paint var25 = null;
//     var20.setSeriesOutlinePaint(0, var25, true);
//     java.awt.Shape var29 = var20.lookupSeriesShape(10);
//     java.awt.Paint var31 = null;
//     var20.setSeriesFillPaint(0, var31, false);
//     boolean var34 = var20.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var36 = var20.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var37 = var20.getBaseItemLabelFont();
//     var0.setTickLabelFont((java.lang.Comparable)2.0d, var37);
//     
//     // Checks the contract:  equals-hashcode on var1 and var20
//     assertTrue("Contract failed: equals-hashcode on var1 and var20", var1.equals(var20) ? var1.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var1
//     assertTrue("Contract failed: equals-hashcode on var20 and var1", var20.equals(var1) ? var20.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var1 = var0.isDrawBarOutline();
    boolean var2 = var0.isDrawBarOutline();
    var0.setShadowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.lang.Object var7 = var0.clone();
//     var0.setVisible(true);
//     boolean var10 = var0.isAxisLineVisible();
//     var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
//     java.lang.String var13 = var0.getLabelURL();
//     java.awt.Graphics2D var14 = null;
//     org.jfree.data.KeyedObjects2D var15 = new org.jfree.data.KeyedObjects2D();
//     java.util.List var16 = var15.getRowKeys();
//     int var17 = var15.getColumnCount();
//     java.lang.Object var18 = null;
//     boolean var19 = var15.equals(var18);
//     org.jfree.chart.plot.CategoryPlot var20 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var24 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var25 = null;
//     boolean var26 = var20.render(var21, var22, 100, var24, var25);
//     org.jfree.chart.event.MarkerChangeEvent var27 = null;
//     var20.markerChanged(var27);
//     var20.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var31 = var20.getInsets();
//     java.awt.Stroke var32 = var20.getRangeZeroBaselineStroke();
//     var15.addObject((java.lang.Object)var20, (java.lang.Comparable)100, (java.lang.Comparable)'4');
//     java.awt.geom.Rectangle2D var36 = null;
//     org.jfree.chart.util.RectangleEdge var37 = null;
//     org.jfree.chart.axis.AxisSpace var38 = null;
//     org.jfree.chart.axis.AxisSpace var39 = var0.reserveSpace(var14, (org.jfree.chart.plot.Plot)var20, var36, var37, var38);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.text.AttributedString var0 = null;
    java.awt.Color var8 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var9 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var8);
    java.awt.Shape var10 = var9.getShape();
    var9.setSeriesKey((java.lang.Comparable)1);
    java.awt.Shape var13 = var9.getLine();
    org.jfree.chart.renderer.category.BarRenderer var15 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var16 = var15.isDrawBarOutline();
    boolean var17 = var15.isDrawBarOutline();
    java.awt.Paint var18 = var15.getShadowPaint();
    org.jfree.chart.LegendItem var19 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var18);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var22 = null;
    var20.setSeriesOutlineStroke(100, var22);
    java.awt.Paint var25 = null;
    var20.setSeriesOutlinePaint(0, var25, true);
    java.awt.Shape var29 = var20.lookupSeriesShape(10);
    java.awt.Paint var31 = null;
    var20.setSeriesFillPaint(0, var31, false);
    boolean var34 = var20.getBaseShapesVisible();
    java.awt.Paint var35 = null;
    var20.setBasePaint(var35);
    var20.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var40 = null;
    var20.setSeriesURLGenerator(2, var40, true);
    org.jfree.chart.plot.CategoryPlot var43 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var44 = null;
    java.awt.geom.Rectangle2D var45 = null;
    org.jfree.chart.plot.PlotRenderingInfo var47 = null;
    org.jfree.chart.plot.CategoryCrosshairState var48 = null;
    boolean var49 = var43.render(var44, var45, 100, var47, var48);
    org.jfree.chart.event.MarkerChangeEvent var50 = null;
    var43.markerChanged(var50);
    var43.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var54 = var43.getDrawingSupplier();
    java.awt.Paint var55 = var43.getRangeGridlinePaint();
    var20.setBaseItemLabelPaint(var55, false);
    var19.setOutlinePaint(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var59 = new org.jfree.chart.LegendItem(var0, "DatasetRenderingOrder.REVERSE", "java.awt.Color[r=0,g=0,b=0]", "ChartEntity: tooltip = ChartEntity: tooltip = null", var13, var55);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.chart.axis.CategoryAxis var8 = null;
    org.jfree.chart.axis.CategoryAxis[] var9 = new org.jfree.chart.axis.CategoryAxis[] { var8};
    var0.setDomainAxes(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToDomainAxis((-16777216), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    org.jfree.chart.labels.ItemLabelPosition var1 = var0.getNegativeItemLabelPositionFallback();
    var0.setDrawBarOutline(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.util.List var1 = var0.getAnnotations();
//     org.jfree.chart.util.DefaultShadowGenerator var2 = new org.jfree.chart.util.DefaultShadowGenerator();
//     var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var2);
//     org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var9 = null;
//     boolean var10 = var4.render(var5, var6, 100, var8, var9);
//     org.jfree.chart.util.Layer var11 = null;
//     java.util.Collection var12 = var4.getDomainMarkers(var11);
//     org.jfree.chart.axis.AxisSpace var13 = var4.getFixedRangeAxisSpace();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var16 = null;
//     var14.setSeriesURLGenerator(10, var16);
//     org.jfree.chart.labels.ItemLabelPosition var19 = null;
//     var14.setSeriesNegativeItemLabelPosition(0, var19, true);
//     java.awt.Stroke var23 = var14.lookupSeriesStroke(0);
//     var4.setRangeGridlineStroke(var23);
//     java.awt.Paint var25 = var4.getOutlinePaint();
//     var0.setParent((org.jfree.chart.plot.Plot)var4);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var29 = null;
//     var27.setSeriesOutlineStroke(100, var29);
//     java.awt.Paint var32 = null;
//     var27.setSeriesOutlinePaint(0, var32, true);
//     var27.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var39 = var27.lookupSeriesShape((-1));
//     java.awt.Paint var41 = null;
//     var27.setLegendTextPaint(0, var41);
//     java.awt.Font var43 = var27.getBaseItemLabelFont();
//     var4.setNoDataMessageFont(var43);
//     
//     // Checks the contract:  equals-hashcode on var14 and var27
//     assertTrue("Contract failed: equals-hashcode on var14 and var27", var14.equals(var27) ? var14.hashCode() == var27.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var27.", var14.equals(var27) == var27.equals(var14));
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    java.awt.Stroke var12 = var0.getRangeZeroBaselineStroke();
    var0.setBackgroundImageAlignment(15);
    org.jfree.chart.util.SortOrder var15 = var0.getColumnRenderingOrder();
    java.awt.Font var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setNoDataMessageFont(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesVisibleInLegend((-1), (java.lang.Boolean)true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    var0.addValue((java.lang.Number)(-14.0d), (java.lang.Comparable)(-16777216), (java.lang.Comparable)3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.isSelected(0, (-2));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     org.jfree.chart.plot.DefaultDrawingSupplier var5 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.lang.Object var6 = var5.clone();
//     java.awt.Stroke var7 = var5.getNextOutlineStroke();
//     java.awt.Stroke var8 = var5.getNextStroke();
//     var0.setSeriesOutlineStroke(1, var8);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.data.general.DatasetGroup var0 = new org.jfree.data.general.DatasetGroup();
    java.lang.String var1 = var0.getID();
    java.lang.String var2 = var0.getID();
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "NOID"+ "'", var1.equals("NOID"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NOID"+ "'", var2.equals("NOID"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var1 = var0.isDrawBarOutline();
    boolean var2 = var0.isDrawBarOutline();
    java.awt.Paint var3 = var0.getShadowPaint();
    org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.plot.PlotRenderingInfo var8 = null;
    org.jfree.chart.plot.CategoryCrosshairState var9 = null;
    boolean var10 = var4.render(var5, var6, 100, var8, var9);
    boolean var11 = var4.isOutlineVisible();
    var4.setDomainGridlinesVisible(true);
    org.jfree.chart.axis.CategoryAnchor var14 = var4.getDomainGridlinePosition();
    java.awt.Paint var15 = var4.getBackgroundPaint();
    var0.addChangeListener((org.jfree.chart.event.RendererChangeListener)var4);
    java.awt.Stroke var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setRangeMinorGridlineStroke(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    boolean var7 = var0.isOutlineVisible();
    var0.setDomainGridlinesVisible(true);
    org.jfree.data.category.CategoryDataset var11 = null;
    org.jfree.chart.axis.CategoryAxis var12 = null;
    org.jfree.chart.axis.ValueAxis var13 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var16 = null;
    var14.setSeriesOutlineStroke(100, var16);
    java.awt.Paint var19 = null;
    var14.setSeriesOutlinePaint(0, var19, true);
    java.awt.Shape var23 = var14.lookupSeriesShape(10);
    java.awt.Paint var25 = null;
    var14.setSeriesFillPaint(0, var25, false);
    boolean var28 = var14.getBaseShapesVisible();
    java.awt.Paint var29 = var14.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var30 = var14.getBaseNegativeItemLabelPosition();
    var14.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var33 = new org.jfree.chart.plot.CategoryPlot(var11, var12, var13, (org.jfree.chart.renderer.category.CategoryItemRenderer)var14);
    org.jfree.chart.axis.AxisSpace var34 = null;
    var33.setFixedRangeAxisSpace(var34);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var39 = null;
    var37.setSeriesOutlineStroke(100, var39);
    java.awt.Paint var42 = null;
    var37.setSeriesOutlinePaint(0, var42, true);
    var37.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var49 = var37.lookupSeriesShape((-1));
    java.awt.Paint var51 = null;
    var37.setLegendTextPaint(0, var51);
    boolean var53 = var37.getAutoPopulateSeriesOutlineStroke();
    var37.setDataBoundsIncludesVisibleSeriesOnly(false);
    var33.setRenderer(1, (org.jfree.chart.renderer.category.CategoryItemRenderer)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRenderer((-1), (org.jfree.chart.renderer.category.CategoryItemRenderer)var37, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = var0.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.plot.CategoryPlot var6 = var0.getPlot();
//     java.awt.Graphics2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.axis.CategoryAxis var9 = null;
//     org.jfree.chart.axis.ValueAxis var10 = null;
//     org.jfree.chart.util.Layer var11 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var12 = null;
//     var0.drawAnnotations(var7, var8, var9, var10, var11, var12);
// 
//   }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setRangeCrosshairValue((-1.0d));
//     var7.setNoDataMessage("");
//     java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
//     var0.setDefaultFillPaint((java.awt.Paint)var15);
//     java.awt.Shape var18 = var0.getDefaultShape();
//     java.awt.Paint var21 = var0.getItemOutlinePaint(2, 10);
//     java.awt.Stroke var23 = var0.getSeriesOutlineStroke(15);
// 
//   }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     org.jfree.chart.ChartColor var3 = new org.jfree.chart.ChartColor(10, 2, 0);
//     java.awt.Paint[] var4 = new java.awt.Paint[] { var3};
//     org.jfree.chart.renderer.RenderAttributes var6 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var11 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var6.setSeriesOutlinePaint(0, (java.awt.Paint)var11);
//     java.awt.image.ColorModel var13 = null;
//     java.awt.Rectangle var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     java.awt.geom.AffineTransform var16 = null;
//     java.awt.RenderingHints var17 = null;
//     java.awt.PaintContext var18 = var11.createContext(var13, var14, var15, var16, var17);
//     java.awt.Color var19 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var11);
//     java.awt.Paint[] var20 = new java.awt.Paint[] { var11};
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var21.setRangeCrosshairValue((-1.0d));
//     var21.setNoDataMessage("");
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var28 = null;
//     var26.setSeriesURLGenerator(10, var28);
//     org.jfree.chart.labels.ItemLabelPosition var31 = null;
//     var26.setSeriesNegativeItemLabelPosition(0, var31, true);
//     java.awt.Stroke var35 = var26.lookupSeriesStroke(0);
//     var21.setDomainCrosshairStroke(var35);
//     java.awt.Stroke[] var37 = new java.awt.Stroke[] { var35};
//     org.jfree.chart.axis.CategoryAxis var38 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var41 = null;
//     var39.setSeriesURLGenerator(10, var41);
//     java.awt.Font var43 = var39.getBaseItemLabelFont();
//     var38.setLabelFont(var43);
//     org.jfree.chart.plot.CategoryPlot var45 = new org.jfree.chart.plot.CategoryPlot();
//     var45.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var48 = var45.getDomainAxis();
//     var38.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var45);
//     var38.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var38.setCategoryMargin(1.0d);
//     var38.setTickMarkOutsideLength(100.0f);
//     java.awt.Stroke var57 = var38.getTickMarkStroke();
//     java.awt.Stroke var58 = var38.getTickMarkStroke();
//     java.awt.Stroke[] var59 = new java.awt.Stroke[] { var58};
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var60 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var62 = null;
//     var60.setSeriesOutlineStroke(100, var62);
//     java.awt.Paint var65 = null;
//     var60.setSeriesOutlinePaint(0, var65, true);
//     java.awt.Shape var69 = var60.lookupSeriesShape(10);
//     java.awt.Shape[] var70 = new java.awt.Shape[] { var69};
//     org.jfree.chart.plot.DefaultDrawingSupplier var71 = new org.jfree.chart.plot.DefaultDrawingSupplier(var4, var20, var37, var59, var70);
//     
//     // Checks the contract:  equals-hashcode on var26 and var60
//     assertTrue("Contract failed: equals-hashcode on var26 and var60", var26.equals(var60) ? var26.hashCode() == var60.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var39 and var60
//     assertTrue("Contract failed: equals-hashcode on var39 and var60", var39.equals(var60) ? var39.hashCode() == var60.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var60 and var26
//     assertTrue("Contract failed: equals-hashcode on var60 and var26", var60.equals(var26) ? var60.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var60 and var39
//     assertTrue("Contract failed: equals-hashcode on var60 and var39", var60.equals(var39) ? var60.hashCode() == var39.hashCode() : true);
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    org.jfree.chart.labels.ItemLabelPosition var8 = new org.jfree.chart.labels.ItemLabelPosition();
    var0.setBaseNegativeItemLabelPosition(var8, true);
    var0.setSeriesShapesVisible(1, (java.lang.Boolean)false);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    boolean var7 = var0.isOutlineVisible();
    org.jfree.chart.util.SortOrder var8 = var0.getRowRenderingOrder();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var11 = null;
    var9.setSeriesOutlineStroke(100, var11);
    java.awt.Paint var14 = null;
    var9.setSeriesOutlinePaint(0, var14, true);
    boolean var17 = var9.getBaseSeriesVisibleInLegend();
    java.awt.Font var19 = var9.getSeriesItemLabelFont(1);
    int var20 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var9);
    org.jfree.chart.plot.Marker var22 = null;
    org.jfree.chart.util.Layer var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var25 = var0.removeRangeMarker((-2), var22, var23, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    java.awt.Stroke var3 = var0.getDomainGridlineStroke();
    org.jfree.chart.util.RectangleEdge var5 = var0.getDomainAxisEdge(15);
    var0.setRangeCrosshairLockedOnData(true);
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    java.awt.geom.Point2D var11 = null;
    var0.zoomDomainAxes((-0.7853981633974483d), 0.0d, var10, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var5 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var0.setSeriesOutlinePaint(0, (java.awt.Paint)var5);
//     java.lang.Boolean var7 = var0.getDefaultCreateEntity();
//     java.awt.Stroke var9 = var0.getSeriesStroke(4);
//     org.jfree.chart.renderer.category.BarRenderer var12 = new org.jfree.chart.renderer.category.BarRenderer();
//     boolean var13 = var12.isDrawBarOutline();
//     boolean var14 = var12.isDrawBarOutline();
//     java.awt.Paint var15 = var12.getShadowPaint();
//     org.jfree.chart.LegendItem var16 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var15);
//     java.awt.Stroke var17 = var16.getLineStroke();
//     var0.setSeriesOutlineStroke((-16777216), var17);
// 
//   }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     java.awt.geom.Rectangle2D var4 = null;
//     org.jfree.data.category.CategoryDataset var5 = null;
//     org.jfree.chart.axis.CategoryAxis var6 = null;
//     org.jfree.chart.axis.ValueAxis var7 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var10 = null;
//     var8.setSeriesOutlineStroke(100, var10);
//     java.awt.Paint var13 = null;
//     var8.setSeriesOutlinePaint(0, var13, true);
//     java.awt.Shape var17 = var8.lookupSeriesShape(10);
//     java.awt.Paint var19 = null;
//     var8.setSeriesFillPaint(0, var19, false);
//     boolean var22 = var8.getBaseShapesVisible();
//     java.awt.Paint var23 = var8.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var24 = var8.getBaseNegativeItemLabelPosition();
//     var8.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var27 = new org.jfree.chart.plot.CategoryPlot(var5, var6, var7, (org.jfree.chart.renderer.category.CategoryItemRenderer)var8);
//     org.jfree.chart.axis.AxisSpace var28 = null;
//     var27.setFixedRangeAxisSpace(var28);
//     org.jfree.chart.util.RectangleEdge var31 = var27.getDomainAxisEdge(15);
//     org.jfree.chart.plot.PlotRenderingInfo var32 = null;
//     org.jfree.chart.axis.AxisState var33 = var0.draw(var1, 1.0d, var3, var4, var31, var32);
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var13 = null;
    var11.setSeriesOutlineStroke(100, var13);
    java.awt.Paint var16 = null;
    var11.setSeriesOutlinePaint(0, var16, true);
    var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var23 = var11.lookupSeriesShape((-1));
    var0.setSeriesShape(0, var23);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var25 = null;
    var0.setLegendItemToolTipGenerator(var25);
    org.jfree.chart.labels.CategoryToolTipGenerator var27 = var0.getBaseToolTipGenerator();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var31 = null;
    var29.setSeriesOutlineStroke(100, var31);
    java.awt.Paint var34 = null;
    var29.setSeriesOutlinePaint(0, var34, true);
    org.jfree.chart.labels.ItemLabelPosition var37 = new org.jfree.chart.labels.ItemLabelPosition();
    var29.setBaseNegativeItemLabelPosition(var37, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesPositiveItemLabelPosition((-2), var37);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var12 = var11.getRight();
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var16 = var11.createOutsetRectangle(var13, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 8.0d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.renderer.category.BarRenderer var1 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var2 = var1.isDrawBarOutline();
    boolean var3 = var1.isDrawBarOutline();
    java.awt.Paint var4 = var1.getShadowPaint();
    org.jfree.chart.LegendItem var5 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var4);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var8 = null;
    var6.setSeriesOutlineStroke(100, var8);
    java.awt.Paint var11 = null;
    var6.setSeriesOutlinePaint(0, var11, true);
    java.awt.Shape var15 = var6.lookupSeriesShape(10);
    java.awt.Paint var17 = null;
    var6.setSeriesFillPaint(0, var17, false);
    boolean var20 = var6.getBaseShapesVisible();
    java.awt.Paint var21 = null;
    var6.setBasePaint(var21);
    var6.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var26 = null;
    var6.setSeriesURLGenerator(2, var26, true);
    org.jfree.chart.plot.CategoryPlot var29 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var30 = null;
    java.awt.geom.Rectangle2D var31 = null;
    org.jfree.chart.plot.PlotRenderingInfo var33 = null;
    org.jfree.chart.plot.CategoryCrosshairState var34 = null;
    boolean var35 = var29.render(var30, var31, 100, var33, var34);
    org.jfree.chart.event.MarkerChangeEvent var36 = null;
    var29.markerChanged(var36);
    var29.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var40 = var29.getDrawingSupplier();
    java.awt.Paint var41 = var29.getRangeGridlinePaint();
    var6.setBaseItemLabelPaint(var41, false);
    var5.setOutlinePaint(var41);
    java.awt.Paint var45 = var5.getOutlinePaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var1 = null;
    org.jfree.chart.axis.ValueAxis var2 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    java.awt.Paint var8 = null;
    var3.setSeriesOutlinePaint(0, var8, true);
    java.awt.Shape var12 = var3.lookupSeriesShape(10);
    java.awt.Paint var14 = null;
    var3.setSeriesFillPaint(0, var14, false);
    boolean var17 = var3.getBaseShapesVisible();
    java.awt.Paint var18 = var3.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var19 = var3.getBaseNegativeItemLabelPosition();
    var3.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot(var0, var1, var2, (org.jfree.chart.renderer.category.CategoryItemRenderer)var3);
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    java.awt.geom.Point2D var26 = null;
    var22.zoomDomainAxes(0.0d, 0.0d, var25, var26);
    org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var29 = null;
    java.awt.geom.Rectangle2D var30 = null;
    org.jfree.chart.plot.PlotRenderingInfo var32 = null;
    org.jfree.chart.plot.CategoryCrosshairState var33 = null;
    boolean var34 = var28.render(var29, var30, 100, var32, var33);
    org.jfree.chart.plot.Plot var35 = var28.getParent();
    org.jfree.chart.axis.CategoryAxis var36 = null;
    org.jfree.chart.axis.CategoryAxis[] var37 = new org.jfree.chart.axis.CategoryAxis[] { var36};
    var28.setDomainAxes(var37);
    var22.setDomainAxes(var37);
    boolean var40 = var22.canSelectByRegion();
    java.lang.Comparable var41 = var22.getDomainCrosshairColumnKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    int var1 = var0.getRowCount();
    var0.validateObject();
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var6 = null;
    var4.setSeriesURLGenerator(10, var6);
    java.awt.Font var8 = var4.getBaseItemLabelFont();
    var3.setLabelFont(var8);
    java.awt.Paint var10 = var3.getTickMarkPaint();
    float var11 = var3.getTickMarkInsideLength();
    org.jfree.chart.axis.ValueAxis var12 = null;
    org.jfree.chart.renderer.category.BarRenderer var13 = new org.jfree.chart.renderer.category.BarRenderer();
    var13.setBase((-1.0d));
    org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var0, var3, var12, (org.jfree.chart.renderer.category.CategoryItemRenderer)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var18 = var0.getColumnKey(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0f);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Shape var3 = var0.getItemShape(0, 0);
    java.awt.Paint var4 = var0.getDefaultLabelPaint();
    java.lang.Boolean var5 = var0.getDefaultLabelVisible();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var8 = null;
    var6.setSeriesOutlineStroke(100, var8);
    java.awt.Paint var11 = null;
    var6.setSeriesOutlinePaint(0, var11, true);
    java.awt.Shape var15 = var6.lookupSeriesShape(10);
    java.awt.Paint var17 = null;
    var6.setSeriesFillPaint(0, var17, false);
    boolean var20 = var6.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var22 = var6.getSeriesNegativeItemLabelPosition(2);
    java.awt.Font var23 = var6.getBaseItemLabelFont();
    var0.setDefaultLabelFont(var23);
    java.awt.Shape var25 = var0.getDefaultShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    double var15 = var11.calculateTopInset(100.0d);
    java.awt.geom.Rectangle2D var16 = null;
    org.jfree.chart.util.LengthAdjustmentType var17 = null;
    org.jfree.chart.util.LengthAdjustmentType var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var19 = var11.createAdjustedRectangle(var16, var17, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4.0d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.chart.util.DefaultShadowGenerator var0 = new org.jfree.chart.util.DefaultShadowGenerator();
    int var1 = var0.calculateOffsetX();
    int var2 = var0.calculateOffsetY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2));

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    java.awt.Font var5 = var1.getBaseItemLabelFont();
    var0.setLabelFont(var5);
    java.lang.Object var7 = var0.clone();
    var0.setVisible(true);
    boolean var10 = var0.isAxisLineVisible();
    var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
    org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var14 = null;
    java.awt.geom.Rectangle2D var15 = null;
    org.jfree.chart.plot.PlotRenderingInfo var17 = null;
    org.jfree.chart.plot.CategoryCrosshairState var18 = null;
    boolean var19 = var13.render(var14, var15, 100, var17, var18);
    org.jfree.chart.event.MarkerChangeEvent var20 = null;
    var13.markerChanged(var20);
    var13.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var24 = var13.getDrawingSupplier();
    org.jfree.chart.LegendItemCollection var25 = var13.getLegendItems();
    var0.addChangeListener((org.jfree.chart.event.AxisChangeListener)var13);
    org.jfree.data.category.DefaultCategoryDataset var27 = new org.jfree.data.category.DefaultCategoryDataset();
    var27.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
    int var32 = var27.getRowCount();
    org.jfree.chart.event.DatasetChangeInfo var33 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.event.DatasetChangeEvent var34 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object)var13, (org.jfree.data.general.Dataset)var27, var33);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.chart.axis.CategoryAxis var8 = null;
    org.jfree.chart.axis.CategoryAxis[] var9 = new org.jfree.chart.axis.CategoryAxis[] { var8};
    var0.setDomainAxes(var9);
    java.awt.Stroke var11 = var0.getDomainGridlineStroke();
    java.awt.Graphics2D var12 = null;
    java.awt.geom.Rectangle2D var13 = null;
    org.jfree.chart.plot.PlotRenderingInfo var15 = null;
    org.jfree.chart.plot.CategoryCrosshairState var16 = null;
    boolean var17 = var0.render(var12, var13, 2, var15, var16);
    org.jfree.data.KeyedObjects2D var19 = new org.jfree.data.KeyedObjects2D();
    java.util.List var20 = var19.getRowKeys();
    java.util.List var21 = var19.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToDomainAxes((-16777216), var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var16 = var0.getSeriesNegativeItemLabelPosition(2);
    java.awt.Font var17 = var0.getBaseItemLabelFont();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var21 = null;
    var19.setSeriesURLGenerator(10, var21);
    org.jfree.chart.labels.ItemLabelPosition var24 = null;
    var19.setSeriesNegativeItemLabelPosition(0, var24, true);
    java.awt.Stroke var28 = var19.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var32 = null;
    var30.setSeriesOutlineStroke(100, var32);
    java.awt.Paint var35 = null;
    var30.setSeriesOutlinePaint(0, var35, true);
    var30.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var42 = var30.lookupSeriesShape((-1));
    var19.setSeriesShape(0, var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShape((-16777216), var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     boolean var12 = var0.canSelectByRegion();
//     int var13 = var0.getDatasetCount();
//     java.lang.String var14 = var0.getNoDataMessage();
//     org.jfree.chart.plot.DatasetRenderingOrder var15 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.axis.CategoryAxis var16 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var19 = null;
//     var17.setSeriesURLGenerator(10, var19);
//     java.awt.Font var21 = var17.getBaseItemLabelFont();
//     var16.setLabelFont(var21);
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     var23.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var26 = var23.getDomainAxis();
//     var16.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var23);
//     var16.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setDomainAxis(var16);
//     java.awt.Stroke var32 = var16.getAxisLineStroke();
//     java.awt.geom.Rectangle2D var35 = null;
//     org.jfree.data.category.CategoryDataset var36 = null;
//     org.jfree.chart.axis.CategoryAxis var37 = null;
//     org.jfree.chart.axis.ValueAxis var38 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var41 = null;
//     var39.setSeriesOutlineStroke(100, var41);
//     java.awt.Paint var44 = null;
//     var39.setSeriesOutlinePaint(0, var44, true);
//     java.awt.Shape var48 = var39.lookupSeriesShape(10);
//     java.awt.Paint var50 = null;
//     var39.setSeriesFillPaint(0, var50, false);
//     boolean var53 = var39.getBaseShapesVisible();
//     java.awt.Paint var54 = var39.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var55 = var39.getBaseNegativeItemLabelPosition();
//     var39.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var58 = new org.jfree.chart.plot.CategoryPlot(var36, var37, var38, (org.jfree.chart.renderer.category.CategoryItemRenderer)var39);
//     org.jfree.chart.plot.CategoryPlot var59 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var60 = null;
//     java.awt.geom.Rectangle2D var61 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var63 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var64 = null;
//     boolean var65 = var59.render(var60, var61, 100, var63, var64);
//     org.jfree.chart.event.MarkerChangeEvent var66 = null;
//     var59.markerChanged(var66);
//     org.jfree.chart.plot.Marker var69 = null;
//     org.jfree.chart.util.Layer var70 = null;
//     boolean var72 = var59.removeDomainMarker(10, var69, var70, true);
//     org.jfree.chart.axis.AxisLocation var74 = var59.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var75 = org.jfree.chart.axis.AxisLocation.getOpposite(var74);
//     var58.setDomainAxisLocation(var75, false);
//     org.jfree.chart.plot.CategoryPlot var78 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var79 = null;
//     java.awt.geom.Rectangle2D var80 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var82 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var83 = null;
//     boolean var84 = var78.render(var79, var80, 100, var82, var83);
//     org.jfree.chart.event.MarkerChangeEvent var85 = null;
//     var78.markerChanged(var85);
//     var78.setDrawSharedDomainAxis(true);
//     int var89 = var78.getBackgroundImageAlignment();
//     org.jfree.chart.axis.AxisSpace var90 = null;
//     var78.setFixedRangeAxisSpace(var90);
//     double var92 = var78.getRangeCrosshairValue();
//     org.jfree.chart.plot.PlotOrientation var93 = var78.getOrientation();
//     org.jfree.chart.util.RectangleEdge var94 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var75, var93);
//     double var95 = var16.getCategoryEnd(0, 15, var35, var94);
// 
//   }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.lang.Object var7 = var0.clone();
//     var0.setVisible(true);
//     boolean var10 = var0.isAxisLineVisible();
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var12 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var15 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var16 = null;
//     boolean var17 = var11.render(var12, var13, 100, var15, var16);
//     org.jfree.chart.event.MarkerChangeEvent var18 = null;
//     var11.markerChanged(var18);
//     var11.setDrawSharedDomainAxis(true);
//     int var22 = var11.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var25 = null;
//     var23.setSeriesOutlineStroke(100, var25);
//     java.awt.Paint var28 = null;
//     var23.setSeriesOutlinePaint(0, var28, true);
//     java.awt.Shape var32 = var23.lookupSeriesShape(10);
//     java.awt.Paint var34 = null;
//     var23.setSeriesFillPaint(0, var34, false);
//     boolean var37 = var23.getBaseShapesVisible();
//     java.awt.Paint var38 = var23.getBaseOutlinePaint();
//     int var39 = var11.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var23);
//     int var40 = var11.getWeight();
//     org.jfree.chart.axis.AxisSpace var41 = null;
//     var11.setFixedRangeAxisSpace(var41, false);
//     org.jfree.chart.event.PlotChangeListener var44 = null;
//     var11.addChangeListener(var44);
//     java.awt.geom.Rectangle2D var48 = null;
//     org.jfree.chart.RenderingSource var49 = null;
//     var11.select((-14.0d), (-14.0d), var48, var49);
//     boolean var51 = var0.hasListener((java.util.EventListener)var11);
//     
//     // Checks the contract:  equals-hashcode on var1 and var23
//     assertTrue("Contract failed: equals-hashcode on var1 and var23", var1.equals(var23) ? var1.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var1
//     assertTrue("Contract failed: equals-hashcode on var23 and var1", var23.equals(var1) ? var23.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var2 = null;
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.plot.PlotRenderingInfo var5 = null;
    org.jfree.chart.plot.CategoryCrosshairState var6 = null;
    boolean var7 = var1.render(var2, var3, 100, var5, var6);
    org.jfree.chart.plot.Plot var8 = var1.getParent();
    org.jfree.data.general.DatasetGroup var9 = var1.getDatasetGroup();
    java.awt.Paint var10 = var1.getDomainGridlinePaint();
    var0.setDefaultPaint(var10);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var15 = var13.getSeriesFillPaint(0);
    java.awt.Paint var19 = var13.getItemPaint(0, 0, true);
    var0.setSeriesFillPaint(10, var19);
    java.awt.Paint var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultFillPaint(var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
    var19.setRangeCrosshairValue((-1.0d));
    var19.setNoDataMessage("");
    org.jfree.chart.renderer.category.LineAndShapeRenderer var24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var26 = null;
    var24.setSeriesURLGenerator(10, var26);
    org.jfree.chart.labels.ItemLabelPosition var29 = null;
    var24.setSeriesNegativeItemLabelPosition(0, var29, true);
    java.awt.Stroke var33 = var24.lookupSeriesStroke(0);
    var19.setDomainCrosshairStroke(var33);
    var0.setBaseStroke(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = null;
//     var0.setSeriesNegativeItemLabelPosition(0, var5, true);
//     java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
//     var0.setSeriesShapesVisible(15, (java.lang.Boolean)true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var15 = null;
//     var13.setSeriesURLGenerator(10, var15);
//     boolean var20 = var13.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var13.setPlot(var21);
//     org.jfree.chart.axis.CategoryAnchor var23 = var21.getDomainGridlinePosition();
//     var0.addChangeListener((org.jfree.chart.event.RendererChangeListener)var21);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var0.", var13.equals(var0) == var0.equals(var13));
// 
//   }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.axis.AxisSpace var12 = null;
    var0.setFixedRangeAxisSpace(var12);
    double var14 = var0.getRangeCrosshairValue();
    org.jfree.chart.plot.PlotOrientation var15 = var0.getOrientation();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var18 = null;
    var16.setSeriesOutlineStroke(100, var18);
    java.awt.Paint var21 = null;
    var16.setSeriesOutlinePaint(0, var21, true);
    java.awt.Shape var25 = var16.lookupSeriesShape(10);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var28 = null;
    var26.setSeriesOutlineStroke(100, var28);
    java.awt.Paint var31 = null;
    var26.setSeriesOutlinePaint(0, var31, true);
    org.jfree.chart.labels.ItemLabelPosition var34 = var26.getBaseNegativeItemLabelPosition();
    var16.setBaseNegativeItemLabelPosition(var34);
    boolean var36 = var15.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var18 = var0.getPositiveItemLabelPosition(1, 10, true);
    java.awt.Paint var19 = var0.getBasePaint();
    boolean var20 = var0.getBaseItemLabelsVisible();
    org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
    var21.setRangeCrosshairValue((-1.0d));
    var21.setNoDataMessage("");
    java.awt.Color var29 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var21.setRangeZeroBaselinePaint((java.awt.Paint)var29);
    org.jfree.chart.util.Layer var31 = null;
    java.util.Collection var32 = var21.getDomainMarkers(var31);
    boolean var33 = var0.hasListener((java.util.EventListener)var21);
    org.jfree.data.category.DefaultCategoryDataset var35 = new org.jfree.data.category.DefaultCategoryDataset();
    var35.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
    int var40 = var35.getRowCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.setDataset((-2), (org.jfree.data.category.CategoryDataset)var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
    org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
    int var10 = var0.getBackgroundImageAlignment();
    boolean var11 = var0.isDomainZoomable();
    java.awt.Paint var12 = var0.getOutlinePaint();
    org.jfree.chart.annotations.CategoryAnnotation var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var13, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


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

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    var0.setAnchorValue(8.0d, false);
    java.awt.Paint var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeCrosshairPaint(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    var0.setNoDataMessage("");
    org.jfree.data.category.CategoryDataset var5 = null;
    var0.setDataset(var5);
    org.jfree.chart.plot.CategoryMarker var7 = null;
    org.jfree.chart.util.Layer var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var7, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.jfree.chart.plot.DefaultDrawingSupplier var0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    java.lang.Object var1 = var0.clone();
    java.awt.Stroke var2 = var0.getNextOutlineStroke();
    org.jfree.data.category.DefaultCategoryDataset var3 = new org.jfree.data.category.DefaultCategoryDataset();
    var3.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var10 = null;
    var8.setSeriesOutlineStroke(100, var10);
    java.awt.Paint var13 = null;
    var8.setSeriesOutlinePaint(0, var13, true);
    java.awt.Shape var17 = var8.lookupSeriesShape(10);
    java.awt.Paint var19 = null;
    var8.setSeriesFillPaint(0, var19, false);
    boolean var22 = var8.getBaseShapesVisible();
    java.awt.Paint var23 = null;
    var8.setBasePaint(var23);
    var8.setAutoPopulateSeriesOutlineStroke(false);
    boolean var30 = var8.getItemCreateEntity(1, 0, false);
    org.jfree.chart.labels.ItemLabelPosition var34 = var8.getPositiveItemLabelPosition(1, 0, true);
    org.jfree.data.general.Dataset var35 = null;
    org.jfree.chart.event.DatasetChangeInfo var36 = new org.jfree.chart.event.DatasetChangeInfo();
    org.jfree.data.event.DatasetChangeEvent var37 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object)1, var35, var36);
    org.jfree.data.event.DatasetChangeEvent var38 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object)var2, (org.jfree.data.general.Dataset)var3, var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var41 = var3.isSelected((-2), 3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var10 = var0.getLegendItemURLGenerator();
    var0.setSeriesItemLabelsVisible(0, true);
    java.awt.Font var17 = var0.getItemLabelFont(0, (-16777216), true);
    var0.setDataBoundsIncludesVisibleSeriesOnly(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var14 = null;
    var12.setSeriesOutlineStroke(100, var14);
    java.awt.Paint var17 = null;
    var12.setSeriesOutlinePaint(0, var17, true);
    java.awt.Shape var21 = var12.lookupSeriesShape(10);
    java.awt.Paint var23 = null;
    var12.setSeriesFillPaint(0, var23, false);
    boolean var26 = var12.getBaseShapesVisible();
    java.awt.Paint var27 = var12.getBaseOutlinePaint();
    int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
    int var29 = var0.getWeight();
    int var30 = var0.getCrosshairDatasetIndex();
    org.jfree.chart.plot.CategoryMarker var31 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = null;
    org.jfree.data.Range var11 = var8.getDataRange(var10);
    java.util.List var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.mapDatasetToRangeAxes((-16777216), var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setFixedDimension(2.0d);
//     org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
//     var19.setRangeCrosshairValue((-1.0d));
//     var0.setPlot((org.jfree.chart.plot.Plot)var19);
//     var19.configureRangeAxes();
//     org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var25 = null;
//     java.awt.geom.Rectangle2D var26 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var28 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var29 = null;
//     boolean var30 = var24.render(var25, var26, 100, var28, var29);
//     org.jfree.chart.event.MarkerChangeEvent var31 = null;
//     var24.markerChanged(var31);
//     var24.setDrawSharedDomainAxis(true);
//     int var35 = var24.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var38 = null;
//     var36.setSeriesOutlineStroke(100, var38);
//     java.awt.Paint var41 = null;
//     var36.setSeriesOutlinePaint(0, var41, true);
//     java.awt.Shape var45 = var36.lookupSeriesShape(10);
//     java.awt.Paint var47 = null;
//     var36.setSeriesFillPaint(0, var47, false);
//     boolean var50 = var36.getBaseShapesVisible();
//     java.awt.Paint var51 = var36.getBaseOutlinePaint();
//     int var52 = var24.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var36);
//     int var53 = var24.getWeight();
//     org.jfree.chart.axis.AxisSpace var54 = null;
//     var24.setFixedRangeAxisSpace(var54, false);
//     boolean var57 = var19.equals((java.lang.Object)var54);
//     
//     // Checks the contract:  equals-hashcode on var1 and var36
//     assertTrue("Contract failed: equals-hashcode on var1 and var36", var1.equals(var36) ? var1.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var1
//     assertTrue("Contract failed: equals-hashcode on var36 and var1", var36.equals(var1) ? var36.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
//     java.awt.Paint var12 = var0.getRangeGridlinePaint();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var15 = null;
//     var13.setSeriesURLGenerator(10, var15);
//     org.jfree.chart.labels.ItemLabelPosition var18 = null;
//     var13.setSeriesNegativeItemLabelPosition(0, var18, true);
//     java.awt.Stroke var22 = var13.lookupSeriesStroke(0);
//     var13.setSeriesShapesVisible(15, (java.lang.Boolean)true);
//     var0.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer)var13, false);
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var29 = null;
//     java.awt.geom.Rectangle2D var30 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var32 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var33 = null;
//     boolean var34 = var28.render(var29, var30, 100, var32, var33);
//     org.jfree.chart.event.MarkerChangeEvent var35 = null;
//     var28.markerChanged(var35);
//     var28.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var39 = var28.getInsets();
//     java.lang.String var40 = var39.toString();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var43 = null;
//     var41.setSeriesOutlineStroke(100, var43);
//     java.awt.Paint var46 = null;
//     var41.setSeriesOutlinePaint(0, var46, true);
//     java.awt.Shape var50 = var41.lookupSeriesShape(10);
//     java.awt.Paint var52 = null;
//     var41.setSeriesFillPaint(0, var52, false);
//     boolean var55 = var41.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var57 = var41.getSeriesNegativeItemLabelPosition(2);
//     boolean var58 = var39.equals((java.lang.Object)2);
//     var0.setAxisOffset(var39);
//     
//     // Checks the contract:  equals-hashcode on var41 and var13
//     assertTrue("Contract failed: equals-hashcode on var41 and var13", var41.equals(var13) ? var41.hashCode() == var13.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var41 and var13.", var41.equals(var13) == var13.equals(var41));
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    var0.setBaseSeriesVisibleInLegend(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesCreateEntities((-2), (java.lang.Boolean)false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    java.awt.Font var5 = var1.getBaseItemLabelFont();
    var0.setLabelFont(var5);
    java.lang.Object var7 = var0.clone();
    var0.setVisible(true);
    boolean var10 = var0.isAxisLineVisible();
    var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
    java.lang.String var13 = var0.getLabelURL();
    java.lang.String var15 = var0.getCategoryLabelToolTip((java.lang.Comparable)4.0d);
    var0.setMaximumCategoryLabelLines((-1));
    double var18 = var0.getLowerMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.05d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
    java.awt.Paint var12 = var0.getRangeGridlinePaint();
    java.awt.Image var13 = null;
    var0.setBackgroundImage(var13);
    org.jfree.chart.plot.CategoryMarker var16 = null;
    org.jfree.chart.util.Layer var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(4, var16, var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var5 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var0.setSeriesOutlinePaint(0, (java.awt.Paint)var5);
    java.lang.Boolean var7 = var0.getDefaultCreateEntity();
    org.jfree.chart.renderer.category.BarRenderer var9 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var10 = var9.isDrawBarOutline();
    boolean var11 = var9.isDrawBarOutline();
    java.awt.Paint var12 = var9.getShadowPaint();
    org.jfree.chart.LegendItem var13 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var12);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var16 = null;
    var14.setSeriesOutlineStroke(100, var16);
    java.awt.Paint var19 = null;
    var14.setSeriesOutlinePaint(0, var19, true);
    java.awt.Shape var23 = var14.lookupSeriesShape(10);
    java.awt.Paint var25 = null;
    var14.setSeriesFillPaint(0, var25, false);
    boolean var28 = var14.getBaseShapesVisible();
    java.awt.Paint var29 = null;
    var14.setBasePaint(var29);
    var14.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var34 = null;
    var14.setSeriesURLGenerator(2, var34, true);
    org.jfree.chart.plot.CategoryPlot var37 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var38 = null;
    java.awt.geom.Rectangle2D var39 = null;
    org.jfree.chart.plot.PlotRenderingInfo var41 = null;
    org.jfree.chart.plot.CategoryCrosshairState var42 = null;
    boolean var43 = var37.render(var38, var39, 100, var41, var42);
    org.jfree.chart.event.MarkerChangeEvent var44 = null;
    var37.markerChanged(var44);
    var37.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var48 = var37.getDrawingSupplier();
    java.awt.Paint var49 = var37.getRangeGridlinePaint();
    var14.setBaseItemLabelPaint(var49, false);
    var13.setOutlinePaint(var49);
    var0.setDefaultFillPaint(var49);
    java.awt.Paint var54 = var0.getDefaultFillPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var20 = null;
    var0.setSeriesURLGenerator(2, var20, true);
    org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    org.jfree.chart.plot.PlotRenderingInfo var27 = null;
    org.jfree.chart.plot.CategoryCrosshairState var28 = null;
    boolean var29 = var23.render(var24, var25, 100, var27, var28);
    org.jfree.chart.event.MarkerChangeEvent var30 = null;
    var23.markerChanged(var30);
    var23.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var34 = var23.getDrawingSupplier();
    java.awt.Paint var35 = var23.getRangeGridlinePaint();
    var0.setBaseItemLabelPaint(var35, false);
    var0.setBaseSeriesVisible(true, false);
    org.jfree.chart.labels.CategoryItemLabelGenerator var44 = var0.getItemLabelGenerator(100, 15, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    org.jfree.chart.util.UnitType var14 = var11.getUnitType();
    double var16 = var11.trimWidth(2.0d);
    double var17 = var11.getRight();
    java.awt.geom.Rectangle2D var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var21 = var11.createInsetRectangle(var18, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-14.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 8.0d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setWeight(10);
    java.awt.Paint var3 = var0.getRangeZeroBaselinePaint();
    boolean var4 = var0.getDrawSharedDomainAxis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     boolean var12 = var0.canSelectByRegion();
//     org.jfree.data.category.CategoryDataset var14 = var0.getDataset(15);
//     org.jfree.chart.renderer.RenderAttributes var16 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var16.setSeriesOutlinePaint(0, (java.awt.Paint)var21);
//     java.awt.image.ColorModel var23 = null;
//     java.awt.Rectangle var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     java.awt.geom.AffineTransform var26 = null;
//     java.awt.RenderingHints var27 = null;
//     java.awt.PaintContext var28 = var21.createContext(var23, var24, var25, var26, var27);
//     java.awt.Color var29 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var21);
//     var0.setDomainGridlinePaint((java.awt.Paint)var21);
//     java.util.List var32 = null;
//     var0.mapDatasetToDomainAxes(10, var32);
// 
//   }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    org.jfree.chart.util.UnitType var14 = var11.getUnitType();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var17 = null;
    var15.setSeriesOutlineStroke(100, var17);
    java.awt.Paint var20 = null;
    var15.setSeriesOutlinePaint(0, var20, true);
    java.awt.Shape var24 = var15.lookupSeriesShape(10);
    java.awt.Paint var26 = null;
    var15.setSeriesFillPaint(0, var26, false);
    boolean var29 = var15.getBaseShapesVisible();
    java.awt.Paint var30 = null;
    var15.setBasePaint(var30);
    var15.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var35 = null;
    var15.setSeriesURLGenerator(2, var35, true);
    java.awt.Color var42 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var43 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var42);
    java.awt.Shape var44 = var43.getShape();
    var15.setBaseLegendShape(var44);
    boolean var46 = var14.equals((java.lang.Object)var15);
    org.jfree.chart.util.RectangleInsets var51 = new org.jfree.chart.util.RectangleInsets(var14, 0.0d, (-6.0d), 10.0d, 8.0d);
    java.lang.Object var52 = null;
    boolean var53 = var14.equals(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Font var10 = var0.getBaseItemLabelFont();
//     java.awt.Graphics2D var11 = null;
//     org.jfree.data.category.CategoryDataset var12 = null;
//     org.jfree.chart.axis.CategoryAxis var13 = null;
//     org.jfree.chart.axis.ValueAxis var14 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var17 = null;
//     var15.setSeriesOutlineStroke(100, var17);
//     java.awt.Paint var20 = null;
//     var15.setSeriesOutlinePaint(0, var20, true);
//     java.awt.Shape var24 = var15.lookupSeriesShape(10);
//     java.awt.Paint var26 = null;
//     var15.setSeriesFillPaint(0, var26, false);
//     boolean var29 = var15.getBaseShapesVisible();
//     java.awt.Paint var30 = var15.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var31 = var15.getBaseNegativeItemLabelPosition();
//     var15.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var34 = new org.jfree.chart.plot.CategoryPlot(var12, var13, var14, (org.jfree.chart.renderer.category.CategoryItemRenderer)var15);
//     org.jfree.chart.axis.CategoryAxis var35 = var34.getDomainAxis();
//     org.jfree.chart.axis.CategoryAxis var36 = null;
//     org.jfree.chart.plot.CategoryMarker var37 = null;
//     java.awt.geom.Rectangle2D var38 = null;
//     var0.drawDomainMarker(var11, var34, var36, var37, var38);
// 
//   }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     java.awt.Color var4 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var5 = var4.getRed();
//     java.awt.Color var6 = java.awt.Color.getColor("", var4);
//     java.awt.Paint[] var7 = new java.awt.Paint[] { var6};
//     java.awt.Shape var12 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var15 = null;
//     var13.setSeriesURLGenerator(10, var15);
//     boolean var20 = var13.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var13.setPlot(var21);
//     org.jfree.chart.axis.ValueAxis var23 = var21.getRangeAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Paint var26 = var24.getSeriesFillPaint(0);
//     java.awt.Paint var30 = var24.getItemPaint(0, 0, true);
//     var21.setNoDataMessagePaint(var30);
//     org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var33 = null;
//     java.awt.geom.Rectangle2D var34 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var36 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var37 = null;
//     boolean var38 = var32.render(var33, var34, 100, var36, var37);
//     org.jfree.chart.event.MarkerChangeEvent var39 = null;
//     var32.markerChanged(var39);
//     var32.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var43 = var32.getInsets();
//     java.awt.Stroke var44 = var32.getRangeZeroBaselineStroke();
//     java.awt.Color var48 = java.awt.Color.getHSBColor(10.0f, 10.0f, 10.0f);
//     org.jfree.chart.LegendItem var49 = new org.jfree.chart.LegendItem("", "RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", "-3,-3,3,3", "", var12, var30, var44, (java.awt.Paint)var48);
//     java.awt.Paint[] var50 = new java.awt.Paint[] { var48};
//     java.awt.Color var54 = java.awt.Color.getHSBColor(100.0f, 0.0f, 0.0f);
//     java.awt.Paint[] var55 = new java.awt.Paint[] { var54};
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var58 = null;
//     var56.setSeriesOutlineStroke(100, var58);
//     java.awt.Paint var61 = null;
//     var56.setSeriesOutlinePaint(0, var61, true);
//     java.awt.Shape var65 = var56.lookupSeriesShape(10);
//     java.awt.Paint var67 = null;
//     var56.setSeriesFillPaint(0, var67, false);
//     boolean var70 = var56.getBaseShapesVisible();
//     java.awt.Paint var71 = var56.getBaseOutlinePaint();
//     java.awt.Stroke var72 = var56.getBaseStroke();
//     java.awt.Stroke[] var73 = new java.awt.Stroke[] { var72};
//     org.jfree.chart.plot.DefaultDrawingSupplier var74 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.lang.Object var75 = var74.clone();
//     java.awt.Stroke var76 = var74.getNextOutlineStroke();
//     java.awt.Stroke[] var77 = new java.awt.Stroke[] { var76};
//     java.awt.Shape[] var78 = null;
//     org.jfree.chart.plot.DefaultDrawingSupplier var79 = new org.jfree.chart.plot.DefaultDrawingSupplier(var7, var50, var55, var73, var77, var78);
//     
//     // Checks the contract:  equals-hashcode on var13 and var56
//     assertTrue("Contract failed: equals-hashcode on var13 and var56", var13.equals(var56) ? var13.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var56
//     assertTrue("Contract failed: equals-hashcode on var24 and var56", var24.equals(var56) ? var24.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var13
//     assertTrue("Contract failed: equals-hashcode on var56 and var13", var56.equals(var13) ? var56.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var24
//     assertTrue("Contract failed: equals-hashcode on var56 and var24", var56.equals(var24) ? var56.hashCode() == var24.hashCode() : true);
// 
//   }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    java.awt.Font var4 = var0.getBaseItemLabelFont();
    org.jfree.chart.labels.CategorySeriesLabelGenerator var5 = null;
    var0.setLegendItemToolTipGenerator(var5);
    java.awt.Paint var8 = var0.getSeriesFillPaint(10);
    org.jfree.chart.labels.ItemLabelPosition var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseNegativeItemLabelPosition(var9, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var2 = null;
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var5 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var6 = null;
//     boolean var7 = var1.render(var2, var3, 100, var5, var6);
//     org.jfree.chart.plot.Plot var8 = var1.getParent();
//     org.jfree.data.general.DatasetGroup var9 = var1.getDatasetGroup();
//     java.awt.Paint var10 = var1.getDomainGridlinePaint();
//     var0.setDefaultPaint(var10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Paint var15 = var13.getSeriesFillPaint(0);
//     java.awt.Paint var19 = var13.getItemPaint(0, 0, true);
//     var0.setSeriesFillPaint(10, var19);
//     java.lang.Boolean var22 = var0.getSeriesCreateEntity(0);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    int var2 = var0.getColumnCount();
    java.lang.Object var3 = null;
    boolean var4 = var0.equals(var3);
    var0.clear();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var8 = null;
    var6.setSeriesOutlineStroke(100, var8);
    java.awt.Paint var11 = null;
    var6.setSeriesOutlinePaint(0, var11, true);
    java.awt.Shape var15 = var6.lookupSeriesShape(10);
    java.awt.Paint var17 = null;
    var6.setSeriesFillPaint(0, var17, false);
    boolean var20 = var6.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var22 = var6.getSeriesNegativeItemLabelPosition(2);
    var6.setUseOutlinePaint(true);
    var6.clearSeriesStrokes(false);
    int var27 = var6.getRowCount();
    java.lang.Comparable var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setObject((java.lang.Object)var27, var28, (java.lang.Comparable)'#');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    var0.removeAnnotations();
    org.jfree.chart.renderer.RenderAttributes var6 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var11 = java.awt.Color.getHSBColor(100.0f, 0.0f, 0.0f);
    var6.setSeriesPaint(0, (java.awt.Paint)var11);
    org.jfree.chart.plot.DefaultDrawingSupplier var14 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    java.awt.Paint var15 = var14.getNextPaint();
    java.awt.Shape var16 = var14.getNextShape();
    var6.setSeriesShape(5, var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLegendShape((-16777216), var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
//     java.awt.Stroke var12 = var0.getRangeZeroBaselineStroke();
//     org.jfree.chart.axis.AxisLocation var14 = var0.getDomainAxisLocation(100);
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     var0.drawBackground(var15, var16);
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesLinesVisible((-16777216), (java.lang.Boolean)false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
//     java.awt.Paint var12 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.ValueAxis var14 = null;
//     var0.setRangeAxis(15, var14);
//     org.jfree.chart.plot.Marker var16 = null;
//     org.jfree.chart.util.Layer var17 = null;
//     var0.addRangeMarker(var16, var17);
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)(byte)100, "TextAnchor.CENTER");
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var23 = null;
//     var21.setSeriesURLGenerator(10, var23);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var27 = null;
//     var25.setSeriesURLGenerator(10, var27);
//     org.jfree.chart.labels.ItemLabelPosition var30 = null;
//     var25.setSeriesNegativeItemLabelPosition(0, var30, true);
//     java.awt.Stroke var34 = var25.lookupSeriesStroke(0);
//     org.jfree.chart.labels.CategorySeriesLabelGenerator var35 = var25.getLegendItemURLGenerator();
//     var25.setSeriesItemLabelsVisible(0, true);
//     java.awt.Font var42 = var25.getItemLabelFont(0, (-16777216), true);
//     var21.setBaseLegendTextFont(var42);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var46 = null;
//     var44.setSeriesOutlineStroke(100, var46);
//     java.awt.Paint var49 = null;
//     var44.setSeriesOutlinePaint(0, var49, true);
//     var44.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var56 = var44.lookupSeriesShape((-1));
//     java.awt.Paint var58 = null;
//     var44.setLegendTextPaint(0, var58);
//     java.awt.Font var60 = var44.getBaseItemLabelFont();
//     var21.setBaseItemLabelFont(var60);
//     var0.setTickLabelFont((java.lang.Comparable)0.05d, var60);
//     
//     // Checks the contract:  equals-hashcode on var1 and var25
//     assertTrue("Contract failed: equals-hashcode on var1 and var25", var1.equals(var25) ? var1.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var1 and var44
//     assertTrue("Contract failed: equals-hashcode on var1 and var44", var1.equals(var44) ? var1.hashCode() == var44.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var1 and var25.", var1.equals(var25) == var25.equals(var1));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var1 and var44.", var1.equals(var44) == var44.equals(var1));
// 
//   }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    boolean var12 = var0.canSelectByRegion();
    org.jfree.data.category.CategoryDataset var14 = var0.getDataset(15);
    org.jfree.chart.renderer.RenderAttributes var16 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var16.setSeriesOutlinePaint(0, (java.awt.Paint)var21);
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var21.createContext(var23, var24, var25, var26, var27);
    java.awt.Color var29 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var21);
    var0.setDomainGridlinePaint((java.awt.Paint)var21);
    org.jfree.chart.plot.Marker var31 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.removeRangeMarker(var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.lang.Object var7 = var0.clone();
//     var0.setVisible(true);
//     boolean var10 = var0.isAxisLineVisible();
//     var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var17 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var18 = null;
//     boolean var19 = var13.render(var14, var15, 100, var17, var18);
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var13.markerChanged(var20);
//     var13.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var24 = var13.getDrawingSupplier();
//     org.jfree.chart.LegendItemCollection var25 = var13.getLegendItems();
//     var0.addChangeListener((org.jfree.chart.event.AxisChangeListener)var13);
//     double var27 = var0.getLabelAngle();
//     double var28 = var0.getLowerMargin();
//     org.jfree.data.category.DefaultCategoryDataset var31 = new org.jfree.data.category.DefaultCategoryDataset();
//     int var32 = var31.getRowCount();
//     java.awt.geom.Rectangle2D var34 = null;
//     org.jfree.data.category.CategoryDataset var35 = null;
//     org.jfree.chart.axis.CategoryAxis var36 = null;
//     org.jfree.chart.axis.ValueAxis var37 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var40 = null;
//     var38.setSeriesOutlineStroke(100, var40);
//     java.awt.Paint var43 = null;
//     var38.setSeriesOutlinePaint(0, var43, true);
//     java.awt.Shape var47 = var38.lookupSeriesShape(10);
//     java.awt.Paint var49 = null;
//     var38.setSeriesFillPaint(0, var49, false);
//     boolean var52 = var38.getBaseShapesVisible();
//     java.awt.Paint var53 = var38.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var54 = var38.getBaseNegativeItemLabelPosition();
//     var38.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var57 = new org.jfree.chart.plot.CategoryPlot(var35, var36, var37, (org.jfree.chart.renderer.category.CategoryItemRenderer)var38);
//     org.jfree.chart.axis.AxisSpace var58 = null;
//     var57.setFixedRangeAxisSpace(var58);
//     org.jfree.chart.util.RectangleEdge var61 = var57.getDomainAxisEdge(15);
//     double var62 = var0.getCategorySeriesMiddle((java.lang.Comparable)5, (java.lang.Comparable)0.0f, (org.jfree.data.category.CategoryDataset)var31, 2.0d, var34, var61);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.util.List var1 = var0.getAnnotations();
//     org.jfree.chart.util.DefaultShadowGenerator var2 = new org.jfree.chart.util.DefaultShadowGenerator();
//     var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var2);
//     org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var9 = null;
//     boolean var10 = var4.render(var5, var6, 100, var8, var9);
//     org.jfree.chart.util.Layer var11 = null;
//     java.util.Collection var12 = var4.getDomainMarkers(var11);
//     org.jfree.chart.axis.AxisSpace var13 = var4.getFixedRangeAxisSpace();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var16 = null;
//     var14.setSeriesURLGenerator(10, var16);
//     org.jfree.chart.labels.ItemLabelPosition var19 = null;
//     var14.setSeriesNegativeItemLabelPosition(0, var19, true);
//     java.awt.Stroke var23 = var14.lookupSeriesStroke(0);
//     var4.setRangeGridlineStroke(var23);
//     java.awt.Paint var25 = var4.getOutlinePaint();
//     var0.setParent((org.jfree.chart.plot.Plot)var4);
//     var0.zoom((-1.0d));
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    java.awt.Font var6 = var2.getBaseItemLabelFont();
    var1.setLabelFont(var6);
    java.lang.Object var8 = var1.clone();
    org.jfree.chart.axis.ValueAxis var9 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var12 = null;
    var10.setSeriesURLGenerator(10, var12);
    org.jfree.chart.labels.ItemLabelPosition var15 = var10.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.plot.CategoryPlot var16 = var10.getPlot();
    org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var0, var1, var9, (org.jfree.chart.renderer.category.CategoryItemRenderer)var10);
    java.lang.Comparable var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addValue(0.0d, var19, (java.lang.Comparable)(-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    java.text.AttributedString var0 = null;
    java.awt.Color var8 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var9 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var8);
    java.awt.Shape var10 = var9.getShape();
    var9.setSeriesKey((java.lang.Comparable)1);
    java.awt.Shape var13 = var9.getLine();
    org.jfree.chart.renderer.category.BarRenderer var15 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var16 = var15.isDrawBarOutline();
    boolean var17 = var15.isDrawBarOutline();
    java.awt.Paint var18 = var15.getShadowPaint();
    org.jfree.chart.LegendItem var19 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = null", var18);
    java.awt.Stroke var20 = var19.getLineStroke();
    java.awt.Color var24 = java.awt.Color.getHSBColor((-1.0f), 0.0f, 0.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var25 = new org.jfree.chart.LegendItem(var0, "NOID", "TextAnchor.CENTER", "-3,-3,3,3", var13, var20, (java.awt.Paint)var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertValue(3, (java.lang.Comparable)(-2), (java.lang.Object)"");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.jfree.data.SelectableValue var1 = new org.jfree.data.SelectableValue((java.lang.Number)(short)10);

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var12 = null;
//     var10.setSeriesOutlineStroke(100, var12);
//     java.awt.Paint var15 = null;
//     var10.setSeriesOutlinePaint(0, var15, true);
//     org.jfree.chart.labels.ItemLabelPosition var18 = var10.getBaseNegativeItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var18);
//     org.jfree.chart.labels.ItemLabelAnchor var20 = var18.getItemLabelAnchor();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var23 = null;
//     var21.setSeriesURLGenerator(10, var23);
//     org.jfree.chart.labels.ItemLabelPosition var26 = var21.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.text.TextAnchor var27 = var26.getRotationAnchor();
//     org.jfree.chart.labels.ItemLabelPosition var28 = new org.jfree.chart.labels.ItemLabelPosition(var20, var27);
//     
//     // Checks the contract:  equals-hashcode on var0 and var21
//     assertTrue("Contract failed: equals-hashcode on var0 and var21", var0.equals(var21) ? var0.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var21
//     assertTrue("Contract failed: equals-hashcode on var10 and var21", var10.equals(var21) ? var10.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var0
//     assertTrue("Contract failed: equals-hashcode on var21 and var0", var21.equals(var0) ? var21.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var10
//     assertTrue("Contract failed: equals-hashcode on var21 and var10", var21.equals(var10) ? var21.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.lang.Object var7 = var0.clone();
//     var0.setVisible(true);
//     boolean var10 = var0.isAxisLineVisible();
//     var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
//     java.lang.String var13 = var0.getLabelURL();
//     var0.setLowerMargin(4.0d);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var18 = null;
//     var16.setSeriesOutlineStroke(100, var18);
//     java.awt.Paint var21 = null;
//     var16.setSeriesOutlinePaint(0, var21, true);
//     var16.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Paint var30 = var16.getItemFillPaint(3, 100, true);
//     var0.setAxisLinePaint(var30);
//     
//     // Checks the contract:  equals-hashcode on var1 and var16
//     assertTrue("Contract failed: equals-hashcode on var1 and var16", var1.equals(var16) ? var1.hashCode() == var16.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var1 and var16.", var1.equals(var16) == var16.equals(var1));
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    var0.clear();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    java.awt.Paint var8 = null;
    var3.setSeriesOutlinePaint(0, var8, true);
    var3.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var15 = var3.lookupSeriesShape((-1));
    java.awt.Paint var17 = null;
    var3.setLegendTextPaint(0, var17);
    var0.setObject((java.lang.Comparable)10.0f, (java.lang.Object)0);
    java.lang.Comparable var21 = null;
    org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var23 = null;
    java.awt.geom.Rectangle2D var24 = null;
    org.jfree.chart.plot.PlotRenderingInfo var26 = null;
    org.jfree.chart.plot.CategoryCrosshairState var27 = null;
    boolean var28 = var22.render(var23, var24, 100, var26, var27);
    org.jfree.chart.util.Layer var29 = null;
    java.util.Collection var30 = var22.getDomainMarkers(var29);
    org.jfree.chart.axis.AxisSpace var31 = var22.getFixedRangeAxisSpace();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var34 = null;
    var32.setSeriesURLGenerator(10, var34);
    org.jfree.chart.labels.ItemLabelPosition var37 = null;
    var32.setSeriesNegativeItemLabelPosition(0, var37, true);
    java.awt.Stroke var41 = var32.lookupSeriesStroke(0);
    var22.setRangeGridlineStroke(var41);
    java.awt.Paint var43 = var22.getOutlinePaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertValue(15, var21, (java.lang.Object)var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setRangeCrosshairValue((-1.0d));
//     var7.setNoDataMessage("");
//     java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
//     var0.setDefaultFillPaint((java.awt.Paint)var15);
//     java.awt.Shape var18 = var0.getDefaultShape();
//     java.lang.Boolean var20 = var0.getSeriesCreateEntity(15);
// 
//   }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     org.jfree.chart.labels.ItemLabelPosition var8 = new org.jfree.chart.labels.ItemLabelPosition();
//     var0.setBaseNegativeItemLabelPosition(var8, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var13 = null;
//     var11.setSeriesOutlineStroke(100, var13);
//     java.awt.Paint var16 = null;
//     var11.setSeriesOutlinePaint(0, var16, true);
//     java.awt.Shape var20 = var11.lookupSeriesShape(10);
//     java.awt.Paint var22 = null;
//     var11.setSeriesFillPaint(0, var22, false);
//     boolean var25 = var11.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var27 = var11.getSeriesNegativeItemLabelPosition(2);
//     org.jfree.chart.urls.CategoryURLGenerator var28 = null;
//     var11.setBaseURLGenerator(var28, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var33 = null;
//     var31.setSeriesURLGenerator(10, var33);
//     org.jfree.chart.labels.ItemLabelPosition var36 = var31.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.text.TextAnchor var37 = var36.getRotationAnchor();
//     var11.setBaseNegativeItemLabelPosition(var36, true);
//     java.awt.Shape var41 = var11.lookupSeriesShape(100);
//     var0.setBaseShape(var41, false);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var36
//     assertTrue("Contract failed: equals-hashcode on var8 and var36", var8.equals(var36) ? var8.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var8
//     assertTrue("Contract failed: equals-hashcode on var36 and var8", var36.equals(var8) ? var36.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    boolean var22 = var0.getItemCreateEntity(1, 0, false);
    org.jfree.chart.labels.ItemLabelPosition var26 = var0.getPositiveItemLabelPosition(1, 0, true);
    org.jfree.data.general.Dataset var27 = null;
    org.jfree.chart.event.DatasetChangeInfo var28 = new org.jfree.chart.event.DatasetChangeInfo();
    org.jfree.data.event.DatasetChangeEvent var29 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object)1, var27, var28);
    org.jfree.data.general.Dataset var30 = var29.getDataset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.jfree.chart.util.StrokeList var0 = new org.jfree.chart.util.StrokeList();
    java.awt.Stroke var2 = null;
    var0.setStroke(2, var2);
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    var0.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var6 = var0.getRowKey(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    var0.addValue((java.lang.Number)(-14.0d), (java.lang.Comparable)(-16777216), (java.lang.Comparable)3);
    java.util.List var5 = var0.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelected(1, 4, true, true);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    int var1 = var0.getRowCount();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    org.jfree.data.category.CategoryDataset var6 = null;
    org.jfree.chart.axis.CategoryAxis var7 = null;
    org.jfree.chart.axis.ValueAxis var8 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var11 = null;
    var9.setSeriesOutlineStroke(100, var11);
    java.awt.Paint var14 = null;
    var9.setSeriesOutlinePaint(0, var14, true);
    java.awt.Shape var18 = var9.lookupSeriesShape(10);
    java.awt.Paint var20 = null;
    var9.setSeriesFillPaint(0, var20, false);
    boolean var23 = var9.getBaseShapesVisible();
    java.awt.Paint var24 = var9.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var25 = var9.getBaseNegativeItemLabelPosition();
    var9.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot(var6, var7, var8, (org.jfree.chart.renderer.category.CategoryItemRenderer)var9);
    boolean var29 = var2.hasListener((java.util.EventListener)var28);
    java.awt.Stroke var33 = var2.getItemOutlineStroke((-1), 100, false);
    boolean var34 = var0.equals((java.lang.Object)false);
    org.jfree.data.KeyedObjects2D var35 = new org.jfree.data.KeyedObjects2D();
    java.util.List var36 = var35.getRowKeys();
    int var37 = var35.getColumnCount();
    java.lang.Object var38 = null;
    boolean var39 = var35.equals(var38);
    var0.addObject((java.lang.Object)var35, (java.lang.Comparable)1L, (java.lang.Comparable)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeColumn(5);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = null;
//     var0.setSeriesNegativeItemLabelPosition(0, var5, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var11 = null;
//     var9.setSeriesURLGenerator(10, var11);
//     org.jfree.chart.labels.ItemLabelPosition var14 = var9.getSeriesPositiveItemLabelPosition(1);
//     java.awt.Shape var16 = var9.lookupLegendShape(0);
//     var0.setSeriesShape(15, var16, true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var0.", var9.equals(var0) == var0.equals(var9));
// 
//   }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     double var4 = var0.getItemLabelAnchorOffset();
//     java.lang.Boolean var6 = var0.getSeriesVisibleInLegend(2);
//     org.jfree.data.KeyedObjects var7 = new org.jfree.data.KeyedObjects();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var10 = null;
//     var8.setSeriesURLGenerator(10, var10);
//     boolean var15 = var8.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
//     var8.setPlot(var16);
//     org.jfree.chart.axis.ValueAxis var18 = var16.getRangeAxis();
//     org.jfree.chart.plot.PlotRenderingInfo var21 = null;
//     java.awt.geom.Point2D var22 = null;
//     var16.zoomDomainAxes(1.0d, 4.0d, var21, var22);
//     org.jfree.chart.axis.AxisLocation var25 = var16.getDomainAxisLocation((-1));
//     boolean var26 = var7.equals((java.lang.Object)var16);
//     org.jfree.chart.util.DefaultShadowGenerator var28 = new org.jfree.chart.util.DefaultShadowGenerator();
//     float var29 = var28.getShadowOpacity();
//     int var30 = var28.calculateOffsetY();
//     org.jfree.chart.plot.CategoryPlot var31 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var32 = null;
//     java.awt.geom.Rectangle2D var33 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var35 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var36 = null;
//     boolean var37 = var31.render(var32, var33, 100, var35, var36);
//     org.jfree.chart.event.MarkerChangeEvent var38 = null;
//     var31.markerChanged(var38);
//     var31.setDrawSharedDomainAxis(true);
//     int var42 = var31.getBackgroundImageAlignment();
//     boolean var43 = var31.canSelectByRegion();
//     int var44 = var31.getDatasetCount();
//     java.lang.String var45 = var31.getNoDataMessage();
//     org.jfree.chart.plot.DatasetRenderingOrder var46 = var31.getDatasetRenderingOrder();
//     java.lang.String var47 = var46.toString();
//     boolean var48 = var28.equals((java.lang.Object)var46);
//     var7.addObject((java.lang.Comparable)0.5f, (java.lang.Object)var46);
//     boolean var50 = var0.equals((java.lang.Object)var7);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
    org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
    org.jfree.chart.util.RectangleInsets var14 = new org.jfree.chart.util.RectangleInsets(0.0d, 0.0d, 0.0d, 0.0d);
    var0.setAxisOffset(var14);
    java.awt.geom.Rectangle2D var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var17 = var14.createInsetRectangle(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.util.Layer var7 = null;
//     java.util.Collection var8 = var0.getDomainMarkers(var7);
//     java.awt.Paint var9 = var0.getOutlinePaint();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var13 = null;
//     var11.setSeriesURLGenerator(10, var13);
//     org.jfree.chart.labels.ItemLabelPosition var16 = null;
//     var11.setSeriesNegativeItemLabelPosition(0, var16, true);
//     org.jfree.chart.labels.ItemLabelPosition var22 = var11.getPositiveItemLabelPosition(0, 1, false);
//     var0.setRenderer(0, (org.jfree.chart.renderer.category.CategoryItemRenderer)var11, true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.data.category.DefaultCategoryDataset var26 = new org.jfree.data.category.DefaultCategoryDataset();
//     org.jfree.chart.axis.CategoryAxis var27 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var30 = null;
//     var28.setSeriesURLGenerator(10, var30);
//     java.awt.Font var32 = var28.getBaseItemLabelFont();
//     var27.setLabelFont(var32);
//     java.lang.Object var34 = var27.clone();
//     org.jfree.chart.axis.ValueAxis var35 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var38 = null;
//     var36.setSeriesURLGenerator(10, var38);
//     org.jfree.chart.labels.ItemLabelPosition var41 = var36.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.plot.CategoryPlot var42 = var36.getPlot();
//     org.jfree.chart.plot.CategoryPlot var43 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var26, var27, var35, (org.jfree.chart.renderer.category.CategoryItemRenderer)var36);
//     org.jfree.data.Range var44 = var25.findRangeBounds((org.jfree.data.category.CategoryDataset)var26);
//     var26.addValue((java.lang.Number)100.0f, (java.lang.Comparable)2.0f, (java.lang.Comparable)4.0d);
//     int var49 = var0.indexOf((org.jfree.data.category.CategoryDataset)var26);
//     
//     // Checks the contract:  equals-hashcode on var22 and var41
//     assertTrue("Contract failed: equals-hashcode on var22 and var41", var22.equals(var41) ? var22.hashCode() == var41.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var41 and var22
//     assertTrue("Contract failed: equals-hashcode on var41 and var22", var41.equals(var22) ? var41.hashCode() == var22.hashCode() : true);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    var0.setBaseShapesFilled(false);
    org.jfree.chart.labels.ItemLabelPosition var13 = var0.getSeriesNegativeItemLabelPosition(3);
    boolean var14 = var0.getUseFillPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    var0.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.getObject(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    java.awt.Paint var13 = var0.getItemFillPaint(1, 0, false);
    org.jfree.data.category.DefaultCategoryDataset var16 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var17 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var20 = null;
    var18.setSeriesURLGenerator(10, var20);
    java.awt.Font var22 = var18.getBaseItemLabelFont();
    var17.setLabelFont(var22);
    java.lang.Object var24 = var17.clone();
    org.jfree.chart.axis.ValueAxis var25 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var28 = null;
    var26.setSeriesURLGenerator(10, var28);
    org.jfree.chart.labels.ItemLabelPosition var31 = var26.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.plot.CategoryPlot var32 = var26.getPlot();
    org.jfree.chart.plot.CategoryPlot var33 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var16, var17, var25, (org.jfree.chart.renderer.category.CategoryItemRenderer)var26);
    org.jfree.chart.axis.CategoryAxis var34 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var37 = null;
    var35.setSeriesURLGenerator(10, var37);
    java.awt.Font var39 = var35.getBaseItemLabelFont();
    var34.setLabelFont(var39);
    org.jfree.chart.plot.CategoryPlot var41 = new org.jfree.chart.plot.CategoryPlot();
    var41.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var44 = var41.getDomainAxis();
    var34.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var41);
    var34.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
    var34.setCategoryMargin(1.0d);
    var34.setTickMarkOutsideLength(100.0f);
    java.awt.Stroke var53 = var34.getTickMarkStroke();
    org.jfree.chart.plot.Plot var54 = var34.getPlot();
    java.awt.geom.Rectangle2D var55 = null;
    org.jfree.chart.plot.CategoryPlot var56 = new org.jfree.chart.plot.CategoryPlot();
    var56.setRangeCrosshairValue((-1.0d));
    java.awt.Stroke var59 = var56.getDomainGridlineStroke();
    org.jfree.chart.util.RectangleEdge var61 = var56.getDomainAxisEdge(15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var62 = var0.getItemMiddle((java.lang.Comparable)"DatasetRenderingOrder.REVERSE", (java.lang.Comparable)100L, (org.jfree.data.category.CategoryDataset)var16, var34, var55, var61);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = null;
//     var0.setSeriesNegativeItemLabelPosition(0, var5, true);
//     java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
//     var0.setSeriesShapesVisible(15, (java.lang.Boolean)true);
//     boolean var13 = var0.getBaseCreateEntities();
//     java.awt.Paint var15 = var0.getSeriesPaint(1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var18 = null;
//     var16.setSeriesURLGenerator(10, var18);
//     boolean var23 = var16.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
//     var16.setPlot(var24);
//     org.jfree.chart.axis.ValueAxis var27 = var24.getRangeAxis(15);
//     boolean var28 = var24.isRangeCrosshairLockedOnData();
//     var0.addChangeListener((org.jfree.chart.event.RendererChangeListener)var24);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var16 = var0.getSeriesNegativeItemLabelPosition(2);
    java.awt.Font var17 = var0.getBaseItemLabelFont();
    int var18 = var0.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    var0.setNoDataMessage("");
    org.jfree.data.category.CategoryDataset var5 = null;
    var0.setDataset(var5);
    int var7 = var0.getBackgroundImageAlignment();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     boolean var7 = var0.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     var0.setPlot(var8);
//     org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
//     org.jfree.chart.plot.PlotRenderingInfo var13 = null;
//     java.awt.geom.Point2D var14 = null;
//     var8.zoomDomainAxes(1.0d, 4.0d, var13, var14);
//     org.jfree.chart.axis.CategoryAnchor var16 = var8.getDomainGridlinePosition();
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var19 = null;
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var22 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var23 = null;
//     boolean var24 = var18.render(var19, var20, 100, var22, var23);
//     org.jfree.data.category.CategoryDataset var25 = null;
//     org.jfree.chart.axis.CategoryAxis var26 = null;
//     org.jfree.chart.axis.ValueAxis var27 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var30 = null;
//     var28.setSeriesOutlineStroke(100, var30);
//     java.awt.Paint var33 = null;
//     var28.setSeriesOutlinePaint(0, var33, true);
//     java.awt.Shape var37 = var28.lookupSeriesShape(10);
//     java.awt.Paint var39 = null;
//     var28.setSeriesFillPaint(0, var39, false);
//     boolean var42 = var28.getBaseShapesVisible();
//     java.awt.Paint var43 = var28.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var44 = var28.getBaseNegativeItemLabelPosition();
//     var28.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var47 = new org.jfree.chart.plot.CategoryPlot(var25, var26, var27, (org.jfree.chart.renderer.category.CategoryItemRenderer)var28);
//     org.jfree.chart.plot.CategoryPlot var48 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var49 = null;
//     java.awt.geom.Rectangle2D var50 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var52 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var53 = null;
//     boolean var54 = var48.render(var49, var50, 100, var52, var53);
//     org.jfree.chart.event.MarkerChangeEvent var55 = null;
//     var48.markerChanged(var55);
//     org.jfree.chart.plot.Marker var58 = null;
//     org.jfree.chart.util.Layer var59 = null;
//     boolean var61 = var48.removeDomainMarker(10, var58, var59, true);
//     org.jfree.chart.axis.AxisLocation var63 = var48.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var64 = org.jfree.chart.axis.AxisLocation.getOpposite(var63);
//     var47.setDomainAxisLocation(var64, false);
//     var18.setRangeAxisLocation(var64, false);
//     var8.setRangeAxisLocation(3, var64);
//     
//     // Checks the contract:  equals-hashcode on var48 and var8
//     assertTrue("Contract failed: equals-hashcode on var48 and var8", var48.equals(var8) ? var48.hashCode() == var8.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var48 and var8.", var48.equals(var8) == var8.equals(var48));
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var4 = null;
    var2.setSeriesOutlineStroke(100, var4);
    java.awt.Paint var7 = null;
    var2.setSeriesOutlinePaint(0, var7, true);
    var2.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var15 = null;
    var13.setSeriesOutlineStroke(100, var15);
    java.awt.Paint var18 = null;
    var13.setSeriesOutlinePaint(0, var18, true);
    var13.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var25 = var13.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var26 = new org.jfree.chart.entity.ChartEntity(var25);
    var2.setBaseShape(var25, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-16777216), var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.plot.Plot var7 = var0.getParent();
//     org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
//     org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
//     int var10 = var0.getBackgroundImageAlignment();
//     boolean var11 = var0.isDomainZoomable();
//     java.awt.Paint var12 = var0.getOutlinePaint();
//     org.jfree.chart.plot.Marker var14 = null;
//     org.jfree.chart.util.Layer var15 = null;
//     var0.addRangeMarker(0, var14, var15, false);
// 
//   }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    boolean var4 = var0.getBaseItemLabelsVisible();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var11 = null;
    var9.setSeriesURLGenerator(10, var11);
    boolean var16 = var9.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
    var9.setPlot(var17);
    var17.setDomainCrosshairRowKey((java.lang.Comparable)(-1.0f));
    java.awt.Paint var21 = var17.getRangeCrosshairPaint();
    org.jfree.chart.axis.CategoryAxis var22 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var25 = null;
    var23.setSeriesURLGenerator(10, var25);
    java.awt.Font var27 = var23.getBaseItemLabelFont();
    var22.setLabelFont(var27);
    org.jfree.chart.axis.ValueAxis var29 = null;
    org.jfree.data.category.DefaultCategoryDataset var30 = new org.jfree.data.category.DefaultCategoryDataset();
    var30.setValue((java.lang.Number)5, (java.lang.Comparable)"ChartEntity: tooltip = null", (java.lang.Comparable)"java.awt.Color[r=0,g=0,b=0]");
    org.jfree.chart.renderer.category.LineAndShapeRenderer var38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var38.setBaseSeriesVisibleInLegend(false, true);
    java.awt.Graphics2D var42 = null;
    java.awt.geom.Rectangle2D var43 = null;
    org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var45 = null;
    java.awt.geom.Rectangle2D var46 = null;
    org.jfree.chart.plot.PlotRenderingInfo var48 = null;
    org.jfree.chart.plot.CategoryCrosshairState var49 = null;
    boolean var50 = var44.render(var45, var46, 100, var48, var49);
    org.jfree.chart.event.MarkerChangeEvent var51 = null;
    var44.markerChanged(var51);
    var44.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var55 = var44.getDrawingSupplier();
    java.awt.Paint var56 = var44.getRangeGridlinePaint();
    var44.setForegroundAlpha((-1.0f));
    org.jfree.data.category.DefaultCategoryDataset var59 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.plot.PlotRenderingInfo var60 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var61 = var38.initialise(var42, var43, var44, (org.jfree.data.category.CategoryDataset)var59, var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var62 = var0.hitTest(4.0d, 0.0d, var7, var8, var17, var22, var29, (org.jfree.data.category.CategoryDataset)var30, 2, 255, false, var61);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.util.Layer var7 = null;
    java.util.Collection var8 = var0.getDomainMarkers(var7);
    org.jfree.chart.axis.AxisSpace var9 = var0.getFixedRangeAxisSpace();
    org.jfree.chart.renderer.category.CategoryItemRenderer var11 = var0.getRenderer(1);
    boolean var12 = var0.isDomainGridlinesVisible();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var16 = null;
    var14.setSeriesOutlineStroke(100, var16);
    java.awt.Paint var19 = null;
    var14.setSeriesOutlinePaint(0, var19, true);
    var14.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var26 = var14.lookupSeriesShape((-1));
    java.awt.Paint var28 = null;
    var14.setLegendTextPaint(0, var28);
    boolean var30 = var14.getAutoPopulateSeriesOutlineStroke();
    java.awt.Color var34 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var14.setBasePaint((java.awt.Paint)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRenderer((-2), (org.jfree.chart.renderer.category.CategoryItemRenderer)var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    org.jfree.chart.axis.AxisLocation var15 = var0.getDomainAxisLocation(0);
    org.jfree.chart.axis.AxisLocation var17 = var0.getRangeAxisLocation((-16777216));
    org.jfree.chart.annotations.CategoryAnnotation var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = var0.getSeriesPositiveItemLabelPosition(1);
    java.awt.Shape var7 = var0.lookupLegendShape(0);
    java.awt.Font var9 = var0.getLegendTextFont(100);
    org.jfree.chart.labels.CategoryToolTipGenerator var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesToolTipGenerator((-2), var11, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    java.text.AttributedString var0 = null;
    java.awt.Color var8 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var9 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var8);
    java.awt.Shape var10 = var9.getShape();
    var9.setSeriesKey((java.lang.Comparable)1);
    java.awt.Shape var13 = var9.getLine();
    java.awt.Paint var14 = null;
    org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var16 = null;
    java.awt.geom.Rectangle2D var17 = null;
    org.jfree.chart.plot.PlotRenderingInfo var19 = null;
    org.jfree.chart.plot.CategoryCrosshairState var20 = null;
    boolean var21 = var15.render(var16, var17, 100, var19, var20);
    org.jfree.chart.event.MarkerChangeEvent var22 = null;
    var15.markerChanged(var22);
    var15.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var26 = var15.getInsets();
    java.awt.Stroke var27 = var15.getRangeZeroBaselineStroke();
    java.awt.Paint var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var29 = new org.jfree.chart.LegendItem(var0, "", "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", "DatasetRenderingOrder.REVERSE", var13, var14, var27, var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    org.jfree.chart.util.StrokeList var0 = new org.jfree.chart.util.StrokeList();
    java.awt.Stroke var2 = null;
    var0.setStroke(2, var2);
    java.awt.Stroke var5 = var0.getStroke(0);
    java.lang.Object var6 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    boolean var22 = var0.getItemCreateEntity(1, 0, false);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var25 = null;
    var23.setSeriesURLGenerator(10, var25);
    org.jfree.chart.labels.ItemLabelPosition var28 = var23.getSeriesPositiveItemLabelPosition(1);
    var23.setItemLabelAnchorOffset(1.0d);
    java.awt.Color var35 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    int var36 = var35.getRed();
    java.awt.Color var37 = java.awt.Color.getColor("", var35);
    var23.setBasePaint((java.awt.Paint)var35);
    var0.setBaseLegendTextPaint((java.awt.Paint)var35);
    org.jfree.chart.labels.CategoryToolTipGenerator var41 = null;
    var0.setSeriesToolTipGenerator(255, var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeValue((java.lang.Comparable)"hi!", (java.lang.Comparable)1.0f);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    int var15 = var0.getDefaultEntityRadius();
    java.lang.Object var16 = var0.clone();
    org.jfree.chart.urls.CategoryURLGenerator var17 = var0.getBaseURLGenerator();
    java.awt.Shape var19 = var0.getSeriesShape(100);
    java.lang.Boolean var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesVisibleInLegend((-2), var21, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    var0.clear();
    java.lang.Comparable var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeValue(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var13 = var11.getSeriesFillPaint(0);
    java.awt.Paint var17 = var11.getItemPaint(0, 0, true);
    var8.setNoDataMessagePaint(var17);
    org.jfree.chart.plot.Marker var20 = null;
    org.jfree.chart.util.Layer var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var8.removeRangeMarker(0, var20, var21, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    org.jfree.chart.urls.CategoryURLGenerator var10 = var0.getBaseURLGenerator();
    org.jfree.chart.plot.DefaultDrawingSupplier var11 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    java.lang.Object var12 = var11.clone();
    java.awt.Stroke var13 = var11.getNextOutlineStroke();
    var0.setBaseOutlineStroke(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.ItemLabelPosition var5 = null;
    var0.setSeriesNegativeItemLabelPosition(0, var5, true);
    java.awt.Stroke var9 = var0.lookupSeriesStroke(0);
    org.jfree.chart.labels.CategorySeriesLabelGenerator var10 = var0.getLegendItemURLGenerator();
    java.awt.Paint var12 = var0.lookupLegendTextPaint(4);
    org.jfree.chart.labels.CategoryItemLabelGenerator var16 = var0.getItemLabelGenerator(100, 2, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     java.awt.Shape var9 = var0.lookupSeriesShape(10);
//     java.awt.Paint var11 = null;
//     var0.setSeriesFillPaint(0, var11, false);
//     boolean var14 = var0.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var18 = var0.getPositiveItemLabelPosition(1, 10, true);
//     java.awt.Paint var19 = var0.getBasePaint();
//     boolean var20 = var0.getBaseItemLabelsVisible();
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var21.setRangeCrosshairValue((-1.0d));
//     var21.setNoDataMessage("");
//     java.awt.Color var29 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var21.setRangeZeroBaselinePaint((java.awt.Paint)var29);
//     org.jfree.chart.util.Layer var31 = null;
//     java.util.Collection var32 = var21.getDomainMarkers(var31);
//     boolean var33 = var0.hasListener((java.util.EventListener)var21);
//     var0.setBaseCreateEntities(false, true);
//     boolean var37 = var0.getBaseShapesVisible();
//     java.lang.Comparable var39 = null;
//     org.jfree.data.category.DefaultCategoryDataset var40 = new org.jfree.data.category.DefaultCategoryDataset();
//     var40.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
//     int var45 = var40.getRowCount();
//     org.jfree.chart.axis.CategoryAxis var46 = null;
//     java.awt.geom.Rectangle2D var47 = null;
//     org.jfree.data.category.CategoryDataset var48 = null;
//     org.jfree.chart.axis.CategoryAxis var49 = null;
//     org.jfree.chart.axis.ValueAxis var50 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var53 = null;
//     var51.setSeriesOutlineStroke(100, var53);
//     java.awt.Paint var56 = null;
//     var51.setSeriesOutlinePaint(0, var56, true);
//     java.awt.Shape var60 = var51.lookupSeriesShape(10);
//     java.awt.Paint var62 = null;
//     var51.setSeriesFillPaint(0, var62, false);
//     boolean var65 = var51.getBaseShapesVisible();
//     java.awt.Paint var66 = var51.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var67 = var51.getBaseNegativeItemLabelPosition();
//     var51.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var70 = new org.jfree.chart.plot.CategoryPlot(var48, var49, var50, (org.jfree.chart.renderer.category.CategoryItemRenderer)var51);
//     org.jfree.chart.axis.AxisSpace var71 = null;
//     var70.setFixedRangeAxisSpace(var71);
//     org.jfree.chart.util.RectangleEdge var74 = var70.getDomainAxisEdge(15);
//     double var75 = var0.getItemMiddle((java.lang.Comparable)'#', var39, (org.jfree.data.category.CategoryDataset)var40, var46, var47, var74);
// 
//   }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.renderer.RenderAttributes var4 = new org.jfree.chart.renderer.RenderAttributes();
    org.jfree.chart.plot.CategoryPlot var5 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.plot.PlotRenderingInfo var9 = null;
    org.jfree.chart.plot.CategoryCrosshairState var10 = null;
    boolean var11 = var5.render(var6, var7, 100, var9, var10);
    org.jfree.chart.plot.Plot var12 = var5.getParent();
    org.jfree.data.general.DatasetGroup var13 = var5.getDatasetGroup();
    java.awt.Paint var14 = var5.getDomainGridlinePaint();
    var4.setDefaultPaint(var14);
    java.awt.Shape var17 = var4.getSeriesShape(10);
    java.lang.Boolean var18 = var4.getDefaultLabelVisible();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var22 = null;
    var20.setSeriesURLGenerator(10, var22);
    org.jfree.chart.labels.ItemLabelPosition var25 = null;
    var20.setSeriesNegativeItemLabelPosition(0, var25, true);
    java.awt.Stroke var29 = var20.lookupSeriesStroke(0);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var33 = null;
    var31.setSeriesOutlineStroke(100, var33);
    java.awt.Paint var36 = null;
    var31.setSeriesOutlinePaint(0, var36, true);
    var31.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var43 = var31.lookupSeriesShape((-1));
    var20.setSeriesShape(0, var43);
    var4.setSeriesShape(100, var43);
    org.jfree.chart.plot.CategoryPlot var46 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var47 = null;
    java.awt.geom.Rectangle2D var48 = null;
    org.jfree.chart.plot.PlotRenderingInfo var50 = null;
    org.jfree.chart.plot.CategoryCrosshairState var51 = null;
    boolean var52 = var46.render(var47, var48, 100, var50, var51);
    org.jfree.chart.event.MarkerChangeEvent var53 = null;
    var46.markerChanged(var53);
    var46.setDrawSharedDomainAxis(true);
    int var57 = var46.getBackgroundImageAlignment();
    boolean var58 = var46.canSelectByRegion();
    int var59 = var46.getDatasetCount();
    java.lang.String var60 = var46.getNoDataMessage();
    org.jfree.chart.plot.DatasetRenderingOrder var61 = var46.getDatasetRenderingOrder();
    org.jfree.chart.axis.CategoryAxis var62 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var65 = null;
    var63.setSeriesURLGenerator(10, var65);
    java.awt.Font var67 = var63.getBaseItemLabelFont();
    var62.setLabelFont(var67);
    org.jfree.chart.plot.CategoryPlot var69 = new org.jfree.chart.plot.CategoryPlot();
    var69.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var72 = var69.getDomainAxis();
    var62.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var69);
    var62.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
    var46.setDomainAxis(var62);
    java.awt.Stroke var78 = var62.getAxisLineStroke();
    org.jfree.chart.renderer.RenderAttributes var80 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var85 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var80.setSeriesOutlinePaint(0, (java.awt.Paint)var85);
    java.awt.image.ColorModel var87 = null;
    java.awt.Rectangle var88 = null;
    java.awt.geom.Rectangle2D var89 = null;
    java.awt.geom.AffineTransform var90 = null;
    java.awt.RenderingHints var91 = null;
    java.awt.PaintContext var92 = var85.createContext(var87, var88, var89, var90, var91);
    java.awt.Color var93 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.LegendItem var94 = new org.jfree.chart.LegendItem(var0, "hi!", "hi!", "hi!", var43, var78, (java.awt.Paint)var85);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    var0.mapDatasetToDomainAxis(1, 10);
    var0.setAnchorValue(100.0d, true);
    var0.clearAnnotations();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var14 = null;
//     var12.setSeriesOutlineStroke(100, var14);
//     java.awt.Paint var17 = null;
//     var12.setSeriesOutlinePaint(0, var17, true);
//     java.awt.Shape var21 = var12.lookupSeriesShape(10);
//     java.awt.Paint var23 = null;
//     var12.setSeriesFillPaint(0, var23, false);
//     boolean var26 = var12.getBaseShapesVisible();
//     java.awt.Paint var27 = var12.getBaseOutlinePaint();
//     int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
//     org.jfree.chart.util.Layer var30 = null;
//     java.util.Collection var31 = var0.getRangeMarkers(3, var30);
//     java.util.List var32 = var0.getCategories();
//     org.jfree.chart.plot.Marker var34 = null;
//     org.jfree.chart.util.Layer var35 = null;
//     var0.addRangeMarker(15, var34, var35);
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    int var2 = var0.getColumnCount();
    java.lang.Object var3 = null;
    boolean var4 = var0.equals(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeObject((java.lang.Comparable)100.0d, (java.lang.Comparable)(byte)10);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     var0.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var13 = null;
//     var11.setSeriesOutlineStroke(100, var13);
//     java.awt.Paint var16 = null;
//     var11.setSeriesOutlinePaint(0, var16, true);
//     var11.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var23 = var11.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var24 = new org.jfree.chart.entity.ChartEntity(var23);
//     var0.setBaseShape(var23, false);
//     org.jfree.chart.labels.CategoryItemLabelGenerator var28 = null;
//     var0.setSeriesItemLabelGenerator(0, var28);
//     org.jfree.chart.axis.CategoryAxis var30 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var33 = null;
//     var31.setSeriesURLGenerator(10, var33);
//     java.awt.Font var35 = var31.getBaseItemLabelFont();
//     var30.setLabelFont(var35);
//     var0.setBaseItemLabelFont(var35, true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var0
//     assertTrue("Contract failed: equals-hashcode on var31 and var0", var31.equals(var0) ? var31.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var11
//     assertTrue("Contract failed: equals-hashcode on var31 and var11", var31.equals(var11) ? var31.hashCode() == var11.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var31 and var0.", var31.equals(var0) == var0.equals(var31));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var31 and var11.", var31.equals(var11) == var11.equals(var31));
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var2 = null;
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.plot.PlotRenderingInfo var5 = null;
    org.jfree.chart.plot.CategoryCrosshairState var6 = null;
    boolean var7 = var1.render(var2, var3, 100, var5, var6);
    boolean var8 = var1.isOutlineVisible();
    var1.setDomainGridlinesVisible(true);
    org.jfree.chart.axis.CategoryAnchor var11 = var1.getDomainGridlinePosition();
    java.awt.Paint var12 = var1.getBackgroundPaint();
    org.jfree.chart.LegendItemCollection var13 = var1.getLegendItems();
    var0.setFixedLegendItems(var13);
    boolean var15 = var0.isSubplot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test273() {}
//   public void test273() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     var0.setLabel("ChartEntity: tooltip = null");
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var5 = null;
//     var3.setSeriesURLGenerator(10, var5);
//     java.awt.Font var7 = var3.getBaseItemLabelFont();
//     var0.setTickLabelFont(var7);
//     java.lang.String var9 = var0.getLabelURL();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var12 = null;
//     var10.setSeriesURLGenerator(10, var12);
//     boolean var17 = var10.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     var10.setPlot(var18);
//     org.jfree.chart.axis.CategoryAnchor var20 = var18.getDomainGridlinePosition();
//     java.awt.geom.Rectangle2D var23 = null;
//     org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var25 = null;
//     java.awt.geom.Rectangle2D var26 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var28 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var29 = null;
//     boolean var30 = var24.render(var25, var26, 100, var28, var29);
//     org.jfree.chart.event.MarkerChangeEvent var31 = null;
//     var24.markerChanged(var31);
//     var24.setDrawSharedDomainAxis(true);
//     int var35 = var24.getBackgroundImageAlignment();
//     boolean var36 = var24.canSelectByRegion();
//     org.jfree.data.category.CategoryDataset var38 = var24.getDataset(15);
//     boolean var39 = var24.isSubplot();
//     org.jfree.chart.util.RectangleEdge var40 = var24.getRangeAxisEdge();
//     double var41 = var0.getCategoryJava2DCoordinate(var20, 0, 1, var23, var40);
// 
//   }

  public void test274() {}
//   public void test274() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var5 = java.awt.Color.getHSBColor(100.0f, 0.0f, 0.0f);
//     var0.setSeriesPaint(0, (java.awt.Paint)var5);
//     org.jfree.chart.plot.DefaultDrawingSupplier var8 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     java.awt.Paint var9 = var8.getNextPaint();
//     java.awt.Shape var10 = var8.getNextShape();
//     var0.setSeriesShape(5, var10);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var15 = null;
//     var13.setSeriesOutlineStroke(100, var15);
//     java.awt.Paint var18 = null;
//     var13.setSeriesOutlinePaint(0, var18, true);
//     var13.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var25 = var13.lookupSeriesShape((-1));
//     java.awt.Paint var27 = null;
//     var13.setLegendTextPaint(0, var27);
//     boolean var29 = var13.getAutoPopulateSeriesOutlineStroke();
//     var13.setDataBoundsIncludesVisibleSeriesOnly(false);
//     java.awt.Color var35 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     org.jfree.chart.event.ChartChangeEvent var36 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var35);
//     var13.setBasePaint((java.awt.Paint)var35, false);
//     java.awt.image.ColorModel var39 = null;
//     java.awt.Rectangle var40 = null;
//     java.awt.geom.Rectangle2D var41 = null;
//     java.awt.geom.AffineTransform var42 = null;
//     java.awt.RenderingHints var43 = null;
//     java.awt.PaintContext var44 = var35.createContext(var39, var40, var41, var42, var43);
//     java.awt.Color var45 = var35.darker();
//     var0.setSeriesLabelPaint(1, (java.awt.Paint)var35);
// 
//   }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     boolean var7 = var0.isOutlineVisible();
//     org.jfree.chart.util.SortOrder var8 = var0.getRowRenderingOrder();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var11 = null;
//     var9.setSeriesOutlineStroke(100, var11);
//     java.awt.Paint var14 = null;
//     var9.setSeriesOutlinePaint(0, var14, true);
//     boolean var17 = var9.getBaseSeriesVisibleInLegend();
//     java.awt.Font var19 = var9.getSeriesItemLabelFont(1);
//     int var20 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var9);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var24 = null;
//     var22.setSeriesURLGenerator(10, var24);
//     java.awt.Font var26 = var22.getBaseItemLabelFont();
//     java.awt.Font var27 = var22.getBaseLegendTextFont();
//     java.awt.Stroke var28 = var22.getBaseOutlineStroke();
//     var0.setRenderer(1, (org.jfree.chart.renderer.category.CategoryItemRenderer)var22);
//     
//     // Checks the contract:  equals-hashcode on var9 and var22
//     assertTrue("Contract failed: equals-hashcode on var9 and var22", var9.equals(var22) ? var9.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var9
//     assertTrue("Contract failed: equals-hashcode on var22 and var9", var22.equals(var9) ? var22.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var6 = null;
//     var4.setSeriesOutlineStroke(100, var6);
//     java.awt.Paint var9 = null;
//     var4.setSeriesOutlinePaint(0, var9, true);
//     var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var16 = var4.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
//     java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var22 = var21.getRed();
//     org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
//     java.lang.Comparable var24 = var23.getSeriesKey();
//     org.jfree.chart.renderer.RenderAttributes var25 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var30 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var25.setSeriesOutlinePaint(0, (java.awt.Paint)var30);
//     java.lang.Boolean var32 = var25.getDefaultCreateEntity();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var35 = null;
//     var33.setSeriesOutlineStroke(100, var35);
//     java.awt.Paint var38 = null;
//     var33.setSeriesOutlinePaint(0, var38, true);
//     java.awt.Shape var42 = var33.lookupSeriesShape(10);
//     java.awt.Font var43 = var33.getBaseItemLabelFont();
//     var25.setDefaultLabelFont(var43);
//     var23.setLabelFont(var43);
//     
//     // Checks the contract:  equals-hashcode on var33 and var4
//     assertTrue("Contract failed: equals-hashcode on var33 and var4", var33.equals(var4) ? var33.hashCode() == var4.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var33 and var4.", var33.equals(var4) == var4.equals(var33));
// 
//   }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.axis.AxisSpace var12 = null;
    var0.setFixedRangeAxisSpace(var12);
    double var14 = var0.getRangeCrosshairValue();
    org.jfree.chart.plot.PlotOrientation var15 = var0.getOrientation();
    org.jfree.chart.annotations.CategoryAnnotation var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var16, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    int var1 = var0.getRowCount();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    org.jfree.data.category.CategoryDataset var6 = null;
    org.jfree.chart.axis.CategoryAxis var7 = null;
    org.jfree.chart.axis.ValueAxis var8 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var11 = null;
    var9.setSeriesOutlineStroke(100, var11);
    java.awt.Paint var14 = null;
    var9.setSeriesOutlinePaint(0, var14, true);
    java.awt.Shape var18 = var9.lookupSeriesShape(10);
    java.awt.Paint var20 = null;
    var9.setSeriesFillPaint(0, var20, false);
    boolean var23 = var9.getBaseShapesVisible();
    java.awt.Paint var24 = var9.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var25 = var9.getBaseNegativeItemLabelPosition();
    var9.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot(var6, var7, var8, (org.jfree.chart.renderer.category.CategoryItemRenderer)var9);
    boolean var29 = var2.hasListener((java.util.EventListener)var28);
    java.awt.Stroke var33 = var2.getItemOutlineStroke((-1), 100, false);
    boolean var34 = var0.equals((java.lang.Object)false);
    org.jfree.data.KeyedObjects2D var35 = new org.jfree.data.KeyedObjects2D();
    java.util.List var36 = var35.getRowKeys();
    int var37 = var35.getColumnCount();
    java.lang.Object var38 = null;
    boolean var39 = var35.equals(var38);
    var0.addObject((java.lang.Object)var35, (java.lang.Comparable)1L, (java.lang.Comparable)(short)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var44 = var35.getRowKey(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var1 = null;
    org.jfree.chart.axis.ValueAxis var2 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    double var7 = var3.getItemLabelAnchorOffset();
    var3.setBaseShapesVisible(false);
    org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var0, var1, var2, (org.jfree.chart.renderer.category.CategoryItemRenderer)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var12 = var0.getColumnKey(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.0d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var14 = null;
    var12.setSeriesOutlineStroke(100, var14);
    java.awt.Paint var17 = null;
    var12.setSeriesOutlinePaint(0, var17, true);
    java.awt.Shape var21 = var12.lookupSeriesShape(10);
    java.awt.Paint var23 = null;
    var12.setSeriesFillPaint(0, var23, false);
    boolean var26 = var12.getBaseShapesVisible();
    java.awt.Paint var27 = var12.getBaseOutlinePaint();
    int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
    org.jfree.chart.util.Layer var30 = null;
    java.util.Collection var31 = var0.getRangeMarkers(3, var30);
    java.util.List var32 = var0.getCategories();
    org.jfree.chart.plot.Marker var34 = null;
    org.jfree.chart.util.Layer var35 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var37 = var0.removeRangeMarker(0, var34, var35, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    var0.removeAnnotations();
    org.jfree.chart.labels.CategoryToolTipGenerator var5 = var0.getBaseToolTipGenerator();
    java.lang.Object var6 = var0.clone();
    var0.setBaseSeriesVisible(false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var5 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var0.setSeriesOutlinePaint(0, (java.awt.Paint)var5);
//     java.awt.Font var8 = var0.getSeriesLabelFont(4);
// 
//   }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var6 = null;
//     var4.setSeriesOutlineStroke(100, var6);
//     java.awt.Paint var9 = null;
//     var4.setSeriesOutlinePaint(0, var9, true);
//     var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var16 = var4.lookupSeriesShape((-1));
//     org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
//     java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     int var22 = var21.getRed();
//     org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
//     var23.setURLText("");
//     var23.setDescription("java.awt.Color[r=0,g=0,b=0]");
//     org.jfree.data.category.DefaultCategoryDataset var28 = new org.jfree.data.category.DefaultCategoryDataset();
//     org.jfree.chart.axis.CategoryAxis var29 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var32 = null;
//     var30.setSeriesURLGenerator(10, var32);
//     java.awt.Font var34 = var30.getBaseItemLabelFont();
//     var29.setLabelFont(var34);
//     java.lang.Object var36 = var29.clone();
//     org.jfree.chart.axis.ValueAxis var37 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var40 = null;
//     var38.setSeriesURLGenerator(10, var40);
//     org.jfree.chart.labels.ItemLabelPosition var43 = var38.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.plot.CategoryPlot var44 = var38.getPlot();
//     org.jfree.chart.plot.CategoryPlot var45 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var28, var29, var37, (org.jfree.chart.renderer.category.CategoryItemRenderer)var38);
//     var28.setValue((java.lang.Number)4.0d, (java.lang.Comparable)8.0d, (java.lang.Comparable)10.0d);
//     var23.setDataset((org.jfree.data.general.Dataset)var28);
//     
//     // Checks the contract:  equals-hashcode on var30 and var4
//     assertTrue("Contract failed: equals-hashcode on var30 and var4", var30.equals(var4) ? var30.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var4
//     assertTrue("Contract failed: equals-hashcode on var38 and var4", var38.equals(var4) ? var38.hashCode() == var4.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var30 and var4.", var30.equals(var4) == var4.equals(var30));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var38 and var4.", var38.equals(var4) == var4.equals(var38));
// 
//   }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     org.jfree.chart.plot.Marker var10 = null;
//     org.jfree.chart.util.Layer var11 = null;
//     boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
//     org.jfree.chart.axis.AxisLocation var15 = var0.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var16 = var15.getOpposite();
//     org.jfree.data.category.CategoryDataset var17 = null;
//     org.jfree.chart.axis.CategoryAxis var18 = null;
//     org.jfree.chart.axis.ValueAxis var19 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var22 = null;
//     var20.setSeriesOutlineStroke(100, var22);
//     java.awt.Paint var25 = null;
//     var20.setSeriesOutlinePaint(0, var25, true);
//     java.awt.Shape var29 = var20.lookupSeriesShape(10);
//     java.awt.Paint var31 = null;
//     var20.setSeriesFillPaint(0, var31, false);
//     boolean var34 = var20.getBaseShapesVisible();
//     java.awt.Paint var35 = var20.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var36 = var20.getBaseNegativeItemLabelPosition();
//     var20.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var39 = new org.jfree.chart.plot.CategoryPlot(var17, var18, var19, (org.jfree.chart.renderer.category.CategoryItemRenderer)var20);
//     org.jfree.chart.plot.CategoryPlot var40 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var41 = null;
//     java.awt.geom.Rectangle2D var42 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var44 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var45 = null;
//     boolean var46 = var40.render(var41, var42, 100, var44, var45);
//     org.jfree.chart.event.MarkerChangeEvent var47 = null;
//     var40.markerChanged(var47);
//     org.jfree.chart.plot.Marker var50 = null;
//     org.jfree.chart.util.Layer var51 = null;
//     boolean var53 = var40.removeDomainMarker(10, var50, var51, true);
//     org.jfree.chart.axis.AxisLocation var55 = var40.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var56 = org.jfree.chart.axis.AxisLocation.getOpposite(var55);
//     var39.setDomainAxisLocation(var56, false);
//     org.jfree.chart.plot.CategoryPlot var59 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var60 = null;
//     java.awt.geom.Rectangle2D var61 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var63 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var64 = null;
//     boolean var65 = var59.render(var60, var61, 100, var63, var64);
//     org.jfree.chart.event.MarkerChangeEvent var66 = null;
//     var59.markerChanged(var66);
//     var59.setDrawSharedDomainAxis(true);
//     int var70 = var59.getBackgroundImageAlignment();
//     org.jfree.chart.axis.AxisSpace var71 = null;
//     var59.setFixedRangeAxisSpace(var71);
//     double var73 = var59.getRangeCrosshairValue();
//     org.jfree.chart.plot.PlotOrientation var74 = var59.getOrientation();
//     org.jfree.chart.util.RectangleEdge var75 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var56, var74);
//     org.jfree.chart.util.RectangleEdge var76 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var16, var74);
//     
//     // Checks the contract:  equals-hashcode on var0 and var40
//     assertTrue("Contract failed: equals-hashcode on var0 and var40", var0.equals(var40) ? var0.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var0
//     assertTrue("Contract failed: equals-hashcode on var40 and var0", var40.equals(var0) ? var40.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     java.net.URL var0 = null;
//     java.net.URLClassLoader var1 = null;
//     org.jfree.chart.util.ResourceBundleWrapper.removeCodeBase(var0, var1);
// 
//   }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    var0.addValue((-14.0d), (java.lang.Comparable)100.0f, (java.lang.Comparable)(-0.7853981633974483d));
    java.util.List var5 = var0.getColumnKeys();
    java.lang.Comparable var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeRow(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var1 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Color var6 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var1.setSeriesOutlinePaint(0, (java.awt.Paint)var6);
//     java.awt.image.ColorModel var8 = null;
//     java.awt.Rectangle var9 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     java.awt.geom.AffineTransform var11 = null;
//     java.awt.RenderingHints var12 = null;
//     java.awt.PaintContext var13 = var6.createContext(var8, var9, var10, var11, var12);
//     java.awt.Color var14 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", var6);
//     java.awt.color.ColorSpace var15 = null;
//     org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
//     var16.setRangeCrosshairValue((-1.0d));
//     var16.setNoDataMessage("");
//     java.awt.Color var24 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var16.setRangeZeroBaselinePaint((java.awt.Paint)var24);
//     float[] var29 = new float[] { 100.0f, 1.0f, 100.0f};
//     float[] var30 = var24.getRGBColorComponents(var29);
//     float[] var31 = var6.getComponents(var15, var30);
// 
//   }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    var0.setBaseSeriesVisibleInLegend(false, true);
    java.awt.Graphics2D var4 = null;
    java.awt.geom.Rectangle2D var5 = null;
    org.jfree.chart.plot.CategoryPlot var6 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    org.jfree.chart.plot.CategoryCrosshairState var11 = null;
    boolean var12 = var6.render(var7, var8, 100, var10, var11);
    org.jfree.chart.event.MarkerChangeEvent var13 = null;
    var6.markerChanged(var13);
    var6.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var17 = var6.getDrawingSupplier();
    java.awt.Paint var18 = var6.getRangeGridlinePaint();
    var6.setForegroundAlpha((-1.0f));
    org.jfree.data.category.DefaultCategoryDataset var21 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.plot.PlotRenderingInfo var22 = null;
    org.jfree.chart.renderer.category.CategoryItemRendererState var23 = var0.initialise(var4, var5, var6, (org.jfree.data.category.CategoryDataset)var21, var22);
    org.jfree.chart.plot.Marker var24 = null;
    org.jfree.chart.util.Layer var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var26 = var6.removeRangeMarker(var24, var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test289() {}
//   public void test289() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.awt.Stroke var8 = var0.getItemStroke(0, 0);
//     java.awt.Paint var11 = var0.getItemFillPaint(100, 0);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var15 = null;
//     var13.setSeriesURLGenerator(10, var15);
//     boolean var20 = var13.getItemCreateEntity(1, 10, true);
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     var13.setPlot(var21);
//     java.awt.Paint var26 = var13.getItemFillPaint(1, 0, false);
//     var0.setSeriesLabelPaint(100, var26);
// 
//   }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.jfree.chart.renderer.category.BarRenderer var0 = new org.jfree.chart.renderer.category.BarRenderer();
    var0.setBase((-1.0d));
    boolean var3 = var0.getAutoPopulateSeriesOutlinePaint();
    int var4 = var0.getPassCount();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var7 = null;
    var5.setSeriesOutlineStroke(100, var7);
    java.awt.Paint var10 = null;
    var5.setSeriesOutlinePaint(0, var10, true);
    org.jfree.chart.labels.ItemLabelPosition var13 = var5.getBaseNegativeItemLabelPosition();
    var0.setBasePositiveItemLabelPosition(var13, false);
    java.awt.Paint var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseOutlinePaint(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.jfree.chart.plot.DefaultDrawingSupplier var0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0, var1);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var5 = null;
    var3.setSeriesOutlineStroke(100, var5);
    java.awt.Paint var8 = null;
    var3.setSeriesOutlinePaint(0, var8, true);
    java.awt.Shape var12 = var3.lookupSeriesShape(10);
    java.awt.Paint var14 = null;
    var3.setSeriesFillPaint(0, var14, false);
    boolean var17 = var3.getBaseShapesVisible();
    org.jfree.chart.labels.ItemLabelPosition var19 = var3.getSeriesNegativeItemLabelPosition(2);
    java.awt.Font var20 = var3.getBaseItemLabelFont();
    boolean var21 = var0.equals((java.lang.Object)var3);
    var3.setBaseSeriesVisible(false);
    var3.setBaseSeriesVisibleInLegend(false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    org.jfree.data.category.AbstractCategoryDataset var0 = new org.jfree.data.category.AbstractCategoryDataset();

  }

  public void test293() {}
//   public void test293() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setRangeCrosshairValue((-1.0d));
//     var7.setNoDataMessage("");
//     java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
//     var0.setDefaultFillPaint((java.awt.Paint)var15);
//     java.awt.Shape var18 = var0.getDefaultShape();
//     var0.setDefaultCreateEntity((java.lang.Boolean)true);
//     java.awt.Paint var23 = var0.getItemPaint(0, (-2));
//     java.awt.Font var26 = var0.getItemLabelFont(4, 15);
// 
//   }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var2 = null;
//     var0.setSeriesOutlineStroke(100, var2);
//     java.awt.Paint var5 = null;
//     var0.setSeriesOutlinePaint(0, var5, true);
//     var0.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Shape var12 = var0.lookupSeriesShape((-1));
//     java.awt.Paint var14 = null;
//     var0.setLegendTextPaint(0, var14);
//     boolean var16 = var0.getAutoPopulateSeriesOutlineStroke();
//     org.jfree.chart.labels.CategoryItemLabelGenerator var18 = var0.getSeriesItemLabelGenerator(3);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var21 = null;
//     var19.setSeriesOutlineStroke(100, var21);
//     java.awt.Paint var24 = null;
//     var19.setSeriesOutlinePaint(0, var24, true);
//     java.awt.Shape var28 = var19.lookupSeriesShape(10);
//     java.awt.Paint var30 = null;
//     var19.setSeriesFillPaint(0, var30, false);
//     boolean var33 = var19.getBaseShapesVisible();
//     java.awt.Paint var34 = null;
//     var19.setBasePaint(var34);
//     var19.setAutoPopulateSeriesOutlineStroke(false);
//     org.jfree.chart.urls.CategoryURLGenerator var39 = null;
//     var19.setSeriesURLGenerator(2, var39, true);
//     org.jfree.chart.plot.CategoryPlot var42 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var43 = null;
//     java.awt.geom.Rectangle2D var44 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var46 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var47 = null;
//     boolean var48 = var42.render(var43, var44, 100, var46, var47);
//     org.jfree.chart.event.MarkerChangeEvent var49 = null;
//     var42.markerChanged(var49);
//     var42.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var53 = var42.getDrawingSupplier();
//     java.awt.Paint var54 = var42.getRangeGridlinePaint();
//     var19.setBaseItemLabelPaint(var54, false);
//     org.jfree.chart.renderer.RenderAttributes var57 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var60 = var57.getItemShape(0, 0);
//     java.awt.Paint var61 = var57.getDefaultLabelPaint();
//     java.lang.Boolean var62 = var57.getDefaultLabelVisible();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var65 = null;
//     var63.setSeriesOutlineStroke(100, var65);
//     java.awt.Paint var68 = null;
//     var63.setSeriesOutlinePaint(0, var68, true);
//     java.awt.Shape var72 = var63.lookupSeriesShape(10);
//     java.awt.Paint var74 = null;
//     var63.setSeriesFillPaint(0, var74, false);
//     boolean var77 = var63.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var79 = var63.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var80 = var63.getBaseItemLabelFont();
//     var57.setDefaultLabelFont(var80);
//     var19.setBaseItemLabelFont(var80);
//     var0.setBaseItemLabelFont(var80, false);
//     
//     // Checks the contract:  equals-hashcode on var63 and var0
//     assertTrue("Contract failed: equals-hashcode on var63 and var0", var63.equals(var0) ? var63.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var63 and var0.", var63.equals(var0) == var0.equals(var63));
// 
//   }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.data.category.DefaultCategoryDataset var1 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var5 = null;
    var3.setSeriesURLGenerator(10, var5);
    java.awt.Font var7 = var3.getBaseItemLabelFont();
    var2.setLabelFont(var7);
    java.lang.Object var9 = var2.clone();
    org.jfree.chart.axis.ValueAxis var10 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var13 = null;
    var11.setSeriesURLGenerator(10, var13);
    org.jfree.chart.labels.ItemLabelPosition var16 = var11.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.plot.CategoryPlot var17 = var11.getPlot();
    org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var1, var2, var10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var11);
    org.jfree.data.Range var19 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var22 = var1.getValue((-2), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     org.jfree.chart.LegendItemCollection var0 = new org.jfree.chart.LegendItemCollection();
//     int var1 = var0.getItemCount();
//     java.lang.Object var2 = null;
//     boolean var3 = var0.equals(var2);
//     org.jfree.chart.LegendItemCollection var4 = new org.jfree.chart.LegendItemCollection();
//     java.awt.Color var9 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
//     org.jfree.chart.LegendItem var10 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var9);
//     java.awt.Shape var11 = var10.getShape();
//     boolean var12 = var4.equals((java.lang.Object)var10);
//     var0.addAll(var4);
//     
//     // Checks the contract:  equals-hashcode on var0 and var4
//     assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var0
//     assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    var0.setBaseSeriesVisibleInLegend(true);
    java.awt.Font var17 = var0.getBaseLegendTextFont();
    org.jfree.chart.urls.CategoryURLGenerator var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesURLGenerator((-2), var19, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.plot.DrawingSupplier var11 = var0.getDrawingSupplier();
    java.awt.Paint var12 = var0.getRangeGridlinePaint();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var15 = null;
    var13.setSeriesURLGenerator(10, var15);
    org.jfree.chart.labels.ItemLabelPosition var18 = null;
    var13.setSeriesNegativeItemLabelPosition(0, var18, true);
    java.awt.Stroke var22 = var13.lookupSeriesStroke(0);
    var13.setSeriesShapesVisible(15, (java.lang.Boolean)true);
    var0.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer)var13, false);
    org.jfree.chart.annotations.CategoryAnnotation var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var28, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.util.List var1 = var0.getAnnotations();
//     org.jfree.chart.util.DefaultShadowGenerator var2 = new org.jfree.chart.util.DefaultShadowGenerator();
//     var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var2);
//     org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var9 = null;
//     boolean var10 = var4.render(var5, var6, 100, var8, var9);
//     org.jfree.chart.util.Layer var11 = null;
//     java.util.Collection var12 = var4.getDomainMarkers(var11);
//     org.jfree.chart.axis.AxisSpace var13 = var4.getFixedRangeAxisSpace();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var16 = null;
//     var14.setSeriesURLGenerator(10, var16);
//     org.jfree.chart.labels.ItemLabelPosition var19 = null;
//     var14.setSeriesNegativeItemLabelPosition(0, var19, true);
//     java.awt.Stroke var23 = var14.lookupSeriesStroke(0);
//     var4.setRangeGridlineStroke(var23);
//     java.awt.Paint var25 = var4.getOutlinePaint();
//     var0.setParent((org.jfree.chart.plot.Plot)var4);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var30 = null;
//     var28.setSeriesOutlineStroke(100, var30);
//     java.awt.Paint var33 = null;
//     var28.setSeriesOutlinePaint(0, var33, true);
//     var28.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
//     java.awt.Paint var42 = var28.getItemFillPaint(3, 100, true);
//     var0.setRenderer(100, (org.jfree.chart.renderer.category.CategoryItemRenderer)var28);
//     
//     // Checks the contract:  equals-hashcode on var14 and var28
//     assertTrue("Contract failed: equals-hashcode on var14 and var28", var14.equals(var28) ? var14.hashCode() == var28.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var28.", var14.equals(var28) == var28.equals(var14));
// 
//   }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var8 = null;
//     var6.setSeriesOutlineStroke(100, var8);
//     java.awt.Paint var11 = null;
//     var6.setSeriesOutlinePaint(0, var11, true);
//     java.awt.Shape var15 = var6.lookupSeriesShape(10);
//     java.awt.Paint var17 = null;
//     var6.setSeriesFillPaint(0, var17, false);
//     boolean var20 = var6.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var22 = var6.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var23 = var6.getBaseItemLabelFont();
//     var0.setDefaultLabelFont(var23);
//     java.lang.Boolean var27 = var0.isLabelVisible(2, (-1));
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var6 = var0.getItemOutlinePaint(2, 0);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setRangeCrosshairValue((-1.0d));
//     var7.setNoDataMessage("");
//     java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
//     var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
//     var0.setDefaultFillPaint((java.awt.Paint)var15);
//     java.awt.Shape var18 = var0.getDefaultShape();
//     var0.setDefaultCreateEntity((java.lang.Boolean)true);
//     java.awt.Paint var23 = var0.getItemPaint(0, (-2));
//     java.awt.Stroke var25 = null;
//     var0.setSeriesOutlineStroke(255, var25);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var6 = null;
    var4.setSeriesOutlineStroke(100, var6);
    java.awt.Paint var9 = null;
    var4.setSeriesOutlinePaint(0, var9, true);
    var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var16 = var4.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
    java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    int var22 = var21.getRed();
    org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
    org.jfree.chart.entity.ChartEntity var24 = new org.jfree.chart.entity.ChartEntity(var16);
    java.lang.String var25 = var24.getShapeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "rect"+ "'", var25.equals("rect"));

  }

  public void test303() {}
//   public void test303() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var2 = null;
//     var0.setSeriesURLGenerator(10, var2);
//     org.jfree.chart.labels.ItemLabelPosition var5 = var0.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.labels.ItemLabelAnchor var6 = var5.getItemLabelAnchor();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var9 = null;
//     var7.setSeriesURLGenerator(10, var9);
//     org.jfree.chart.labels.ItemLabelPosition var12 = var7.getSeriesPositiveItemLabelPosition(1);
//     org.jfree.chart.text.TextAnchor var13 = var12.getRotationAnchor();
//     org.jfree.chart.text.TextAnchor var14 = var12.getRotationAnchor();
//     org.jfree.chart.renderer.category.BarRenderer var15 = new org.jfree.chart.renderer.category.BarRenderer();
//     var15.setBase((-1.0d));
//     double var18 = var15.getBase();
//     boolean var19 = var14.equals((java.lang.Object)var15);
//     org.jfree.chart.labels.ItemLabelPosition var20 = new org.jfree.chart.labels.ItemLabelPosition(var6, var14);
//     
//     // Checks the contract:  equals-hashcode on var5 and var12
//     assertTrue("Contract failed: equals-hashcode on var5 and var12", var5.equals(var12) ? var5.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var5
//     assertTrue("Contract failed: equals-hashcode on var12 and var5", var12.equals(var5) ? var12.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var8 = null;
//     var6.setSeriesOutlineStroke(100, var8);
//     java.awt.Paint var11 = null;
//     var6.setSeriesOutlinePaint(0, var11, true);
//     java.awt.Shape var15 = var6.lookupSeriesShape(10);
//     java.awt.Paint var17 = null;
//     var6.setSeriesFillPaint(0, var17, false);
//     boolean var20 = var6.getBaseShapesVisible();
//     org.jfree.chart.labels.ItemLabelPosition var22 = var6.getSeriesNegativeItemLabelPosition(2);
//     java.awt.Font var23 = var6.getBaseItemLabelFont();
//     var0.setDefaultLabelFont(var23);
//     org.jfree.chart.JFreeChart var25 = null;
//     org.jfree.chart.plot.DefaultDrawingSupplier var26 = new org.jfree.chart.plot.DefaultDrawingSupplier();
//     org.jfree.chart.JFreeChart var27 = null;
//     org.jfree.chart.event.ChartChangeEvent var28 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var26, var27);
//     org.jfree.chart.event.ChartChangeEventType var29 = var28.getType();
//     org.jfree.chart.event.ChartChangeEvent var30 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0, var25, var29);
//     java.lang.Boolean var33 = var0.isLabelVisible(4, 255);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    boolean var8 = var0.getBaseSeriesVisibleInLegend();
    var0.setBaseCreateEntities(true);
    java.awt.Stroke var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseStroke(var11, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    org.jfree.chart.labels.CategoryToolTipGenerator var5 = null;
    var0.setSeriesToolTipGenerator(10, var5);
    java.awt.Paint var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBaseOutlinePaint(var7, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.util.Layer var7 = null;
    java.util.Collection var8 = var0.getDomainMarkers(var7);
    org.jfree.chart.util.RectangleInsets var9 = var0.getAxisOffset();
    boolean var10 = var0.isRangeCrosshairVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    org.jfree.data.category.DefaultCategoryDataset var0 = new org.jfree.data.category.DefaultCategoryDataset();
    int var1 = var0.getRowCount();
    var0.validateObject();
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var6 = null;
    var4.setSeriesURLGenerator(10, var6);
    java.awt.Font var8 = var4.getBaseItemLabelFont();
    var3.setLabelFont(var8);
    java.awt.Paint var10 = var3.getTickMarkPaint();
    float var11 = var3.getTickMarkInsideLength();
    org.jfree.chart.axis.ValueAxis var12 = null;
    org.jfree.chart.renderer.category.BarRenderer var13 = new org.jfree.chart.renderer.category.BarRenderer();
    var13.setBase((-1.0d));
    org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var0, var3, var12, (org.jfree.chart.renderer.category.CategoryItemRenderer)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelected(0, (-1), true);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0f);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.event.RendererChangeEvent var11 = null;
    var0.rendererChanged(var11);
    float var13 = var0.getBackgroundAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0f);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.axis.AxisSpace var12 = null;
    var0.setFixedRangeAxisSpace(var12);
    org.jfree.chart.plot.Marker var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var0.removeRangeMarker(var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.removeObject((java.lang.Comparable)(byte)1, (java.lang.Comparable)(short)10);
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.data.category.DefaultCategoryDataset var1 = new org.jfree.data.category.DefaultCategoryDataset();
    org.jfree.chart.axis.CategoryAxis var2 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var5 = null;
    var3.setSeriesURLGenerator(10, var5);
    java.awt.Font var7 = var3.getBaseItemLabelFont();
    var2.setLabelFont(var7);
    java.lang.Object var9 = var2.clone();
    org.jfree.chart.axis.ValueAxis var10 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var13 = null;
    var11.setSeriesURLGenerator(10, var13);
    org.jfree.chart.labels.ItemLabelPosition var16 = var11.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.plot.CategoryPlot var17 = var11.getPlot();
    org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset)var1, var2, var10, (org.jfree.chart.renderer.category.CategoryItemRenderer)var11);
    org.jfree.data.Range var19 = var0.findRangeBounds((org.jfree.data.category.CategoryDataset)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Number var22 = var1.getValue((java.lang.Comparable)false, (java.lang.Comparable)(short)(-1));
      fail("Expected exception of type org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    boolean var14 = var0.getBaseShapesVisible();
    java.awt.Paint var15 = null;
    var0.setBasePaint(var15);
    var0.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var20 = null;
    var0.setSeriesURLGenerator(2, var20, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesCreateEntities((-16777216), (java.lang.Boolean)false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var6 = null;
    var4.setSeriesOutlineStroke(100, var6);
    java.awt.Paint var9 = null;
    var4.setSeriesOutlinePaint(0, var9, true);
    var4.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var16 = var4.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var17 = new org.jfree.chart.entity.ChartEntity(var16);
    java.awt.Color var21 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    int var22 = var21.getRed();
    org.jfree.chart.LegendItem var23 = new org.jfree.chart.LegendItem("", "ChartEntity: tooltip = null", "hi!", "TextAnchor.CENTER", var16, (java.awt.Paint)var21);
    java.awt.Color var27 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var23.setFillPaint((java.awt.Paint)var27);
    java.lang.String var29 = var23.getURLText();
    org.jfree.chart.plot.CategoryPlot var30 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.AxisLocation var32 = var30.getRangeAxisLocation(10);
    java.awt.Stroke var33 = var30.getRangeCrosshairStroke();
    org.jfree.chart.util.RectangleInsets var34 = var30.getInsets();
    boolean var35 = var23.equals((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "TextAnchor.CENTER"+ "'", var29.equals("TextAnchor.CENTER"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.plot.Plot var7 = var0.getParent();
//     org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
//     org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
//     var0.setDomainCrosshairColumnKey((java.lang.Comparable)(-1.0f));
//     org.jfree.data.category.CategoryDataset var12 = var0.getDataset();
//     org.jfree.chart.util.Layer var13 = null;
//     java.util.Collection var14 = var0.getDomainMarkers(var13);
//     org.jfree.chart.plot.Marker var16 = null;
//     org.jfree.chart.util.Layer var17 = null;
//     var0.addRangeMarker(0, var16, var17);
// 
//   }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
//     java.awt.Stroke var12 = var0.getRangeZeroBaselineStroke();
//     org.jfree.chart.axis.AxisSpace var13 = var0.getFixedDomainAxisSpace();
//     org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var18 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var19 = null;
//     boolean var20 = var14.render(var15, var16, 100, var18, var19);
//     org.jfree.chart.event.MarkerChangeEvent var21 = null;
//     var14.markerChanged(var21);
//     var14.setDrawSharedDomainAxis(true);
//     int var25 = var14.getBackgroundImageAlignment();
//     boolean var26 = var14.canSelectByRegion();
//     int var27 = var14.getDatasetCount();
//     java.lang.String var28 = var14.getNoDataMessage();
//     org.jfree.data.category.CategoryDataset var29 = null;
//     org.jfree.chart.axis.CategoryAxis var30 = null;
//     org.jfree.chart.axis.ValueAxis var31 = null;
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var34 = null;
//     var32.setSeriesOutlineStroke(100, var34);
//     java.awt.Paint var37 = null;
//     var32.setSeriesOutlinePaint(0, var37, true);
//     java.awt.Shape var41 = var32.lookupSeriesShape(10);
//     java.awt.Paint var43 = null;
//     var32.setSeriesFillPaint(0, var43, false);
//     boolean var46 = var32.getBaseShapesVisible();
//     java.awt.Paint var47 = var32.getBaseOutlinePaint();
//     org.jfree.chart.labels.ItemLabelPosition var48 = var32.getBaseNegativeItemLabelPosition();
//     var32.setBaseSeriesVisible(false);
//     org.jfree.chart.plot.CategoryPlot var51 = new org.jfree.chart.plot.CategoryPlot(var29, var30, var31, (org.jfree.chart.renderer.category.CategoryItemRenderer)var32);
//     var14.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer)var32, false);
//     boolean var54 = var32.getBaseLinesVisible();
//     java.awt.Paint var55 = var32.getBaseItemLabelPaint();
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var56 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var32};
//     var0.setRenderers(var56);
//     
//     // Checks the contract:  equals-hashcode on var0 and var14
//     assertTrue("Contract failed: equals-hashcode on var0 and var14", var0.equals(var14) ? var0.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var0
//     assertTrue("Contract failed: equals-hashcode on var14 and var0", var14.equals(var0) ? var14.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var11 = var0.getInsets();
    double var13 = var11.calculateRightOutset(0.0d);
    org.jfree.chart.util.UnitType var14 = var11.getUnitType();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var17 = null;
    var15.setSeriesOutlineStroke(100, var17);
    java.awt.Paint var20 = null;
    var15.setSeriesOutlinePaint(0, var20, true);
    java.awt.Shape var24 = var15.lookupSeriesShape(10);
    java.awt.Paint var26 = null;
    var15.setSeriesFillPaint(0, var26, false);
    boolean var29 = var15.getBaseShapesVisible();
    java.awt.Paint var30 = null;
    var15.setBasePaint(var30);
    var15.setAutoPopulateSeriesOutlineStroke(false);
    org.jfree.chart.urls.CategoryURLGenerator var35 = null;
    var15.setSeriesURLGenerator(2, var35, true);
    java.awt.Color var42 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var43 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var42);
    java.awt.Shape var44 = var43.getShape();
    var15.setBaseLegendShape(var44);
    boolean var46 = var14.equals((java.lang.Object)var15);
    java.awt.Font var48 = var15.getLegendTextFont(15);
    java.awt.Shape var53 = null;
    org.jfree.chart.renderer.RenderAttributes var54 = new org.jfree.chart.renderer.RenderAttributes();
    org.jfree.chart.plot.CategoryPlot var55 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var56 = null;
    java.awt.geom.Rectangle2D var57 = null;
    org.jfree.chart.plot.PlotRenderingInfo var59 = null;
    org.jfree.chart.plot.CategoryCrosshairState var60 = null;
    boolean var61 = var55.render(var56, var57, 100, var59, var60);
    org.jfree.chart.plot.Plot var62 = var55.getParent();
    org.jfree.data.general.DatasetGroup var63 = var55.getDatasetGroup();
    java.awt.Paint var64 = var55.getDomainGridlinePaint();
    var54.setDefaultPaint(var64);
    org.jfree.chart.LegendItem var66 = new org.jfree.chart.LegendItem("ChartEntity: tooltip = ChartEntity: tooltip = null", "RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", "org.jfree.data.UnknownKeyException: ChartEntity: tooltip = null", "java.awt.Color[r=0,g=0,b=0]", var53, var64);
    var15.setBaseFillPaint(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var4 = null;
    var2.setSeriesURLGenerator(10, var4);
    java.awt.Font var6 = var2.getBaseItemLabelFont();
    var1.setLabelFont(var6);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var8.setWeight(10);
    org.jfree.chart.axis.CategoryAxis var11 = var8.getDomainAxis();
    var1.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var8);
    org.jfree.chart.renderer.RenderAttributes var13 = new org.jfree.chart.renderer.RenderAttributes();
    java.awt.Color var18 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var13.setSeriesOutlinePaint(0, (java.awt.Paint)var18);
    var8.setRangeCrosshairPaint((java.awt.Paint)var18);
    java.awt.Color var21 = java.awt.Color.getColor("rect", var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    int var2 = var0.getColumnCount();
    int var3 = var0.getRowCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.getObject(2, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    java.awt.Shape var4 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var7 = null;
    var5.setSeriesURLGenerator(10, var7);
    boolean var12 = var5.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
    var5.setPlot(var13);
    org.jfree.chart.axis.ValueAxis var15 = var13.getRangeAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var18 = var16.getSeriesFillPaint(0);
    java.awt.Paint var22 = var16.getItemPaint(0, 0, true);
    var13.setNoDataMessagePaint(var22);
    org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var25 = null;
    java.awt.geom.Rectangle2D var26 = null;
    org.jfree.chart.plot.PlotRenderingInfo var28 = null;
    org.jfree.chart.plot.CategoryCrosshairState var29 = null;
    boolean var30 = var24.render(var25, var26, 100, var28, var29);
    org.jfree.chart.event.MarkerChangeEvent var31 = null;
    var24.markerChanged(var31);
    var24.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var35 = var24.getInsets();
    java.awt.Stroke var36 = var24.getRangeZeroBaselineStroke();
    java.awt.Color var40 = java.awt.Color.getHSBColor(10.0f, 10.0f, 10.0f);
    org.jfree.chart.LegendItem var41 = new org.jfree.chart.LegendItem("", "RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", "-3,-3,3,3", "", var4, var22, var36, (java.awt.Paint)var40);
    var41.setToolTipText("ChartEntity: tooltip = ChartEntity: tooltip = null");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    var0.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var12 = var0.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var13 = new org.jfree.chart.entity.ChartEntity(var12);
    java.lang.String var14 = var13.toString();
    var13.setToolTipText("TextAnchor.CENTER");
    java.awt.Shape var17 = var13.getArea();
    java.lang.String var18 = var13.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "ChartEntity: tooltip = null"+ "'", var14.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     java.lang.Object var7 = var0.clone();
//     var0.setVisible(true);
//     boolean var10 = var0.isAxisLineVisible();
//     var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var17 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var18 = null;
//     boolean var19 = var13.render(var14, var15, 100, var17, var18);
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var13.markerChanged(var20);
//     var13.setDrawSharedDomainAxis(true);
//     org.jfree.chart.plot.DrawingSupplier var24 = var13.getDrawingSupplier();
//     org.jfree.chart.LegendItemCollection var25 = var13.getLegendItems();
//     var0.addChangeListener((org.jfree.chart.event.AxisChangeListener)var13);
//     double var27 = var0.getLabelAngle();
//     double var28 = var0.getLowerMargin();
//     org.jfree.chart.util.RectangleInsets var29 = var0.getLabelInsets();
//     org.jfree.chart.plot.CategoryPlot var30 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var31 = null;
//     java.awt.geom.Rectangle2D var32 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var34 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var35 = null;
//     boolean var36 = var30.render(var31, var32, 100, var34, var35);
//     org.jfree.chart.event.MarkerChangeEvent var37 = null;
//     var30.markerChanged(var37);
//     var30.setDrawSharedDomainAxis(true);
//     org.jfree.chart.util.RectangleInsets var41 = var30.getInsets();
//     double var43 = var41.calculateRightOutset(0.0d);
//     double var45 = var41.extendHeight((-14.0d));
//     var0.setLabelInsets(var41, false);
//     
//     // Checks the contract:  equals-hashcode on var13 and var30
//     assertTrue("Contract failed: equals-hashcode on var13 and var30", var13.equals(var30) ? var13.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var13
//     assertTrue("Contract failed: equals-hashcode on var30 and var13", var30.equals(var13) ? var30.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.ValueAxis var10 = var8.getRangeAxis();
    org.jfree.chart.plot.PlotRenderingInfo var13 = null;
    java.awt.geom.Point2D var14 = null;
    var8.zoomDomainAxes(1.0d, 4.0d, var13, var14);
    org.jfree.chart.plot.Marker var17 = null;
    org.jfree.chart.util.Layer var18 = null;
    boolean var20 = var8.removeDomainMarker(1, var17, var18, true);
    boolean var21 = var8.isDomainCrosshairVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    var0.setDrawSharedDomainAxis(true);
    int var11 = var0.getBackgroundImageAlignment();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var14 = null;
    var12.setSeriesOutlineStroke(100, var14);
    java.awt.Paint var17 = null;
    var12.setSeriesOutlinePaint(0, var17, true);
    java.awt.Shape var21 = var12.lookupSeriesShape(10);
    java.awt.Paint var23 = null;
    var12.setSeriesFillPaint(0, var23, false);
    boolean var26 = var12.getBaseShapesVisible();
    java.awt.Paint var27 = var12.getBaseOutlinePaint();
    int var28 = var0.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer)var12);
    org.jfree.chart.LegendItemCollection var29 = var0.getFixedLegendItems();
    var0.clearSelection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    var0.setSeriesLinesVisible(100, (java.lang.Boolean)true);
    org.jfree.chart.urls.CategoryURLGenerator var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesURLGenerator((-2), var12, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.event.MarkerChangeEvent var7 = null;
    var0.markerChanged(var7);
    org.jfree.chart.plot.Marker var10 = null;
    org.jfree.chart.util.Layer var11 = null;
    boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
    org.jfree.chart.axis.AxisLocation var15 = var0.getDomainAxisLocation(0);
    org.jfree.chart.axis.AxisLocation var17 = var0.getRangeAxisLocation((-16777216));
    org.jfree.chart.plot.Marker var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var19 = var0.removeRangeMarker(var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    java.awt.Color var1 = java.awt.Color.getColor("ChartEntity: tooltip = null");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var1 = null;
    java.awt.geom.Rectangle2D var2 = null;
    org.jfree.chart.plot.PlotRenderingInfo var4 = null;
    org.jfree.chart.plot.CategoryCrosshairState var5 = null;
    boolean var6 = var0.render(var1, var2, 100, var4, var5);
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    org.jfree.data.general.DatasetGroup var8 = var0.getDatasetGroup();
    org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
    org.jfree.chart.util.RectangleInsets var14 = new org.jfree.chart.util.RectangleInsets(0.0d, 0.0d, 0.0d, 0.0d);
    var0.setAxisOffset(var14);
    boolean var16 = var0.isNotify();
    org.jfree.chart.plot.CategoryMarker var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     var0.setDrawSharedDomainAxis(true);
//     int var11 = var0.getBackgroundImageAlignment();
//     boolean var12 = var0.canSelectByRegion();
//     int var13 = var0.getDatasetCount();
//     org.jfree.chart.JFreeChart var14 = null;
//     org.jfree.chart.event.ChartChangeEventType var15 = null;
//     org.jfree.chart.event.ChartChangeEvent var16 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0, var14, var15);
//     org.jfree.chart.axis.CategoryAxis var17 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.axis.CategoryAxis[] var18 = new org.jfree.chart.axis.CategoryAxis[] { var17};
//     var0.setDomainAxes(var18);
//     java.awt.Color var24 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
//     org.jfree.chart.LegendItem var25 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var24);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var28 = null;
//     var26.setSeriesOutlineStroke(100, var28);
//     java.awt.Paint var31 = null;
//     var26.setSeriesOutlinePaint(0, var31, true);
//     java.awt.Shape var35 = var26.lookupSeriesShape(10);
//     org.jfree.chart.entity.ChartEntity var36 = new org.jfree.chart.entity.ChartEntity(var35);
//     var25.setShape(var35);
//     java.awt.Stroke var38 = var25.getLineStroke();
//     var0.setRangeCrosshairStroke(var38);
//     org.jfree.chart.util.DefaultShadowGenerator var40 = new org.jfree.chart.util.DefaultShadowGenerator();
//     int var41 = var40.calculateOffsetX();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var44 = null;
//     var42.setSeriesOutlineStroke(100, var44);
//     var42.removeAnnotations();
//     org.jfree.chart.labels.CategoryToolTipGenerator var47 = var42.getBaseToolTipGenerator();
//     java.awt.Paint var48 = var42.getBaseItemLabelPaint();
//     boolean var49 = var40.equals((java.lang.Object)var48);
//     double var50 = var40.getAngle();
//     var0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator)var40);
//     
//     // Checks the contract:  equals-hashcode on var26 and var42
//     assertTrue("Contract failed: equals-hashcode on var26 and var42", var26.equals(var42) ? var26.hashCode() == var42.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var26
//     assertTrue("Contract failed: equals-hashcode on var42 and var26", var42.equals(var26) ? var42.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    org.jfree.data.KeyedObjects2D var0 = new org.jfree.data.KeyedObjects2D();
    java.util.List var1 = var0.getRowKeys();
    int var2 = var0.getColumnCount();
    java.lang.Object var3 = null;
    boolean var4 = var0.equals(var3);
    org.jfree.chart.plot.CategoryPlot var5 = new org.jfree.chart.plot.CategoryPlot();
    java.awt.Graphics2D var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.plot.PlotRenderingInfo var9 = null;
    org.jfree.chart.plot.CategoryCrosshairState var10 = null;
    boolean var11 = var5.render(var6, var7, 100, var9, var10);
    org.jfree.chart.event.MarkerChangeEvent var12 = null;
    var5.markerChanged(var12);
    var5.setDrawSharedDomainAxis(true);
    org.jfree.chart.util.RectangleInsets var16 = var5.getInsets();
    java.awt.Stroke var17 = var5.getRangeZeroBaselineStroke();
    var0.addObject((java.lang.Object)var5, (java.lang.Comparable)100, (java.lang.Comparable)'4');
    org.jfree.chart.util.Layer var22 = null;
    java.util.Collection var23 = var5.getDomainMarkers((-2), var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    java.awt.Font var5 = var1.getBaseItemLabelFont();
    var0.setLabelFont(var5);
    java.lang.Object var7 = var0.clone();
    var0.setVisible(true);
    boolean var10 = var0.isAxisLineVisible();
    var0.removeCategoryLabelToolTip((java.lang.Comparable)(-16777216));
    org.jfree.chart.renderer.category.LineAndShapeRenderer var13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var15 = null;
    var13.setSeriesURLGenerator(10, var15);
    org.jfree.chart.labels.ItemLabelPosition var18 = null;
    var13.setSeriesNegativeItemLabelPosition(0, var18, true);
    java.awt.Stroke var22 = var13.lookupSeriesStroke(0);
    var0.setAxisLineStroke(var22);
    var0.setLabelURL("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Paint var2 = var0.getSeriesFillPaint(0);
    java.awt.Paint var3 = null;
    var0.setBaseLegendTextPaint(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    java.awt.Font var5 = var1.getBaseItemLabelFont();
    var0.setLabelFont(var5);
    java.lang.Object var7 = var0.clone();
    var0.setVisible(true);
    boolean var10 = var0.isAxisLineVisible();
    java.util.List var12 = null;
    java.awt.geom.Rectangle2D var13 = null;
    org.jfree.data.category.CategoryDataset var14 = null;
    org.jfree.chart.axis.CategoryAxis var15 = null;
    org.jfree.chart.axis.ValueAxis var16 = null;
    org.jfree.chart.renderer.category.LineAndShapeRenderer var17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var19 = null;
    var17.setSeriesOutlineStroke(100, var19);
    java.awt.Paint var22 = null;
    var17.setSeriesOutlinePaint(0, var22, true);
    java.awt.Shape var26 = var17.lookupSeriesShape(10);
    java.awt.Paint var28 = null;
    var17.setSeriesFillPaint(0, var28, false);
    boolean var31 = var17.getBaseShapesVisible();
    java.awt.Paint var32 = var17.getBaseOutlinePaint();
    org.jfree.chart.labels.ItemLabelPosition var33 = var17.getBaseNegativeItemLabelPosition();
    var17.setBaseSeriesVisible(false);
    org.jfree.chart.plot.CategoryPlot var36 = new org.jfree.chart.plot.CategoryPlot(var14, var15, var16, (org.jfree.chart.renderer.category.CategoryItemRenderer)var17);
    org.jfree.chart.axis.AxisSpace var37 = null;
    var36.setFixedRangeAxisSpace(var37);
    org.jfree.chart.util.RectangleEdge var40 = var36.getDomainAxisEdge(15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var41 = var0.getCategoryMiddle((java.lang.Comparable)"", var12, var13, var40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.data.KeyedObject var2 = new org.jfree.data.KeyedObject((java.lang.Comparable)2.0d, (java.lang.Object)var1);
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var5 = null;
//     var3.setSeriesURLGenerator(10, var5);
//     java.awt.Font var7 = var3.getBaseItemLabelFont();
//     java.lang.Boolean var9 = var3.getSeriesVisibleInLegend(10);
//     boolean var10 = var2.equals((java.lang.Object)var3);
//     java.lang.Object var11 = var2.clone();
//     java.lang.Object var12 = var2.clone();
//     
//     // Checks the contract:  equals-hashcode on var11 and var12
//     assertTrue("Contract failed: equals-hashcode on var11 and var12", var11.equals(var12) ? var11.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var11
//     assertTrue("Contract failed: equals-hashcode on var12 and var11", var12.equals(var11) ? var12.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    java.awt.Shape var9 = var0.lookupSeriesShape(10);
    java.awt.Paint var11 = null;
    var0.setSeriesFillPaint(0, var11, false);
    org.jfree.chart.labels.CategoryItemLabelGenerator var17 = var0.getItemLabelGenerator(15, 1, false);
    org.jfree.chart.renderer.category.LineAndShapeRenderer var19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var21 = null;
    var19.setSeriesOutlineStroke(100, var21);
    java.awt.Paint var24 = null;
    var19.setSeriesOutlinePaint(0, var24, true);
    java.awt.Shape var28 = var19.lookupSeriesShape(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesShape((-1), var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.setRangeCrosshairValue((-1.0d));
    java.awt.Stroke var3 = var0.getDomainGridlineStroke();
    java.util.List var4 = var0.getCategories();
    var0.configureDomainAxes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test337() {}
//   public void test337() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     org.jfree.chart.urls.CategoryURLGenerator var3 = null;
//     var1.setSeriesURLGenerator(10, var3);
//     java.awt.Font var5 = var1.getBaseItemLabelFont();
//     var0.setLabelFont(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.setWeight(10);
//     org.jfree.chart.axis.CategoryAxis var10 = var7.getDomainAxis();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     var0.addCategoryLabelToolTip((java.lang.Comparable)"ChartEntity: tooltip = null", "NOID");
//     var0.setCategoryMargin(1.0d);
//     var0.setTickMarkOutsideLength(100.0f);
//     java.awt.Stroke var19 = var0.getTickMarkStroke();
//     java.awt.Stroke var20 = var0.getTickMarkStroke();
//     org.jfree.chart.renderer.category.LineAndShapeRenderer var21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
//     java.awt.Stroke var23 = null;
//     var21.setSeriesOutlineStroke(100, var23);
//     java.awt.Paint var26 = null;
//     var21.setSeriesOutlinePaint(0, var26, true);
//     java.awt.Shape var30 = var21.lookupSeriesShape(10);
//     java.awt.Paint var32 = null;
//     var21.setSeriesFillPaint(0, var32, false);
//     boolean var35 = var21.getBaseShapesVisible();
//     java.awt.Paint var36 = var21.getBaseOutlinePaint();
//     java.awt.Stroke var37 = var21.getBaseStroke();
//     var0.setTickMarkStroke(var37);
//     
//     // Checks the contract:  equals-hashcode on var1 and var21
//     assertTrue("Contract failed: equals-hashcode on var1 and var21", var1.equals(var21) ? var1.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var1
//     assertTrue("Contract failed: equals-hashcode on var21 and var1", var21.equals(var1) ? var21.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    java.awt.Color var4 = java.awt.Color.getHSBColor(10.0f, 10.0f, 0.0f);
    org.jfree.chart.LegendItem var5 = new org.jfree.chart.LegendItem("TextAnchor.CENTER", (java.awt.Paint)var4);
    int var6 = var4.getRGB();
    org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
    var7.setRangeCrosshairValue((-1.0d));
    var7.setNoDataMessage("");
    java.awt.Color var15 = java.awt.Color.getHSBColor(10.0f, 100.0f, 0.0f);
    var7.setRangeZeroBaselinePaint((java.awt.Paint)var15);
    float[] var20 = new float[] { 100.0f, 1.0f, 100.0f};
    float[] var21 = var15.getRGBColorComponents(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var22 = var4.getComponents(var20);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-16777216));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    org.jfree.data.KeyedObjects var0 = new org.jfree.data.KeyedObjects();
    org.jfree.chart.renderer.category.LineAndShapeRenderer var1 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var3 = null;
    var1.setSeriesURLGenerator(10, var3);
    boolean var8 = var1.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
    var1.setPlot(var9);
    org.jfree.chart.axis.ValueAxis var11 = var9.getRangeAxis();
    org.jfree.chart.plot.PlotRenderingInfo var14 = null;
    java.awt.geom.Point2D var15 = null;
    var9.zoomDomainAxes(1.0d, 4.0d, var14, var15);
    org.jfree.chart.axis.AxisLocation var18 = var9.getDomainAxisLocation((-1));
    boolean var19 = var0.equals((java.lang.Object)var9);
    org.jfree.chart.util.BooleanList var21 = new org.jfree.chart.util.BooleanList();
    var0.setObject((java.lang.Comparable)(short)(-1), (java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Comparable var24 = var0.getKey((-2));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    org.jfree.chart.urls.CategoryURLGenerator var2 = null;
    var0.setSeriesURLGenerator(10, var2);
    boolean var7 = var0.getItemCreateEntity(1, 10, true);
    org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
    var0.setPlot(var8);
    org.jfree.chart.axis.CategoryAnchor var10 = var8.getDomainGridlinePosition();
    org.jfree.chart.plot.Marker var12 = null;
    org.jfree.chart.util.Layer var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var8.removeRangeMarker(1, var12, var13, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     java.awt.Graphics2D var1 = null;
//     java.awt.geom.Rectangle2D var2 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var4 = null;
//     org.jfree.chart.plot.CategoryCrosshairState var5 = null;
//     boolean var6 = var0.render(var1, var2, 100, var4, var5);
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var0.markerChanged(var7);
//     org.jfree.chart.plot.Marker var10 = null;
//     org.jfree.chart.util.Layer var11 = null;
//     boolean var13 = var0.removeDomainMarker(10, var10, var11, true);
//     org.jfree.chart.axis.AxisLocation var15 = var0.getDomainAxisLocation(0);
//     int var16 = var0.getDomainAxisCount();
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     var0.drawBackground(var17, var18);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    var0.removeAnnotations();
    org.jfree.chart.labels.CategorySeriesLabelGenerator var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLegendItemLabelGenerator(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.jfree.chart.renderer.category.LineAndShapeRenderer var0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    java.awt.Stroke var2 = null;
    var0.setSeriesOutlineStroke(100, var2);
    java.awt.Paint var5 = null;
    var0.setSeriesOutlinePaint(0, var5, true);
    var0.setSeriesVisibleInLegend(0, (java.lang.Boolean)true);
    java.awt.Shape var12 = var0.lookupSeriesShape((-1));
    org.jfree.chart.entity.ChartEntity var13 = new org.jfree.chart.entity.ChartEntity(var12);
    java.lang.String var14 = var13.toString();
    org.jfree.chart.imagemap.ToolTipTagFragmentGenerator var15 = null;
    org.jfree.chart.imagemap.URLTagFragmentGenerator var16 = null;
    java.lang.String var17 = var13.getImageMapAreaTag(var15, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "ChartEntity: tooltip = null"+ "'", var14.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     org.jfree.chart.renderer.RenderAttributes var0 = new org.jfree.chart.renderer.RenderAttributes();
//     java.awt.Shape var3 = var0.getItemShape(0, 0);
//     java.awt.Paint var4 = var0.getDefaultLabelPaint();
//     java.lang.Boolean var5 = var0.getDefaultLabelVisible();
//     java.awt.Stroke var8 = var0.getItemStroke(0, 0);
//     java.awt.Stroke var9 = var0.getDefaultStroke();
//     java.awt.Font var11 = null;
//     var0.setSeriesLabelFont(255, var11);
// 
//   }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    java.text.AttributedString var0 = null;
    org.jfree.chart.renderer.category.BarRenderer var5 = new org.jfree.chart.renderer.category.BarRenderer();
    boolean var6 = var5.isDrawBarOutline();
    boolean var7 = var5.isDrawBarOutline();
    java.awt.Paint var8