
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    org.jfree.chart.util.RectangleAnchor var0 = null;
    org.jfree.chart.text.TextBlockAnchor var1 = null;
    org.jfree.chart.axis.CategoryLabelWidthType var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition(var0, var1, var2, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Color var1 = null;
    java.awt.Color var2 = java.awt.Color.getColor("", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits(var0);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    org.jfree.chart.axis.Axis var0 = null;
    java.awt.Shape var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.AxisLabelEntity var4 = new org.jfree.chart.entity.AxisLabelEntity(var0, var1, "hi!", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.jfree.data.Range var0 = null;
    org.jfree.data.Range var1 = null;
    org.jfree.data.Range var2 = org.jfree.data.Range.combine(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.awt.Paint var1 = null;
    java.awt.Stroke var2 = null;
    java.awt.Paint var3 = null;
    java.awt.Stroke var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(0.0d, var1, var2, var3, var4, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


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

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)'a', var1);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 1.0d, 0.0d, var3);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    org.jfree.chart.util.RectangleAnchor var0 = null;
    org.jfree.chart.text.TextBlockAnchor var1 = null;
    org.jfree.chart.text.TextAnchor var2 = null;
    org.jfree.chart.axis.CategoryLabelWidthType var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var6 = new org.jfree.chart.axis.CategoryLabelPosition(var0, var1, var2, 0.0d, var4, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.ChartEntity var1 = new org.jfree.chart.entity.ChartEntity(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


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

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.awt.Color var1 = java.awt.Color.getColor("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    java.awt.Paint var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setPaint(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(10.0d, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    java.awt.Stroke var6 = var2.getStroke();
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelAnchor(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.jfree.data.Range var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var3 = org.jfree.data.Range.expand(var0, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(0.0d, var1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Shape var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDownArrow(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    org.jfree.chart.util.RectangleInsets var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelInsets(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.text.TextAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    var2.setLabel("");
    org.jfree.chart.util.RectangleAnchor var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelAnchor(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    org.jfree.chart.JFreeChart var5 = null;
    org.jfree.chart.event.ChartChangeEvent var6 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)1.0d, var5);

  }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     java.awt.geom.Rectangle2D var19 = null;
//     var12.trim(var19);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


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

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    org.jfree.chart.event.MarkerChangeListener var3 = null;
    var2.addChangeListener(var3);
    double var5 = var2.getEndValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit((-1.0d), var1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    boolean var5 = var1.equals((java.lang.Object)(short)10);
    java.awt.Paint var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setTickLabelPaint(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var4 = null;
//     java.awt.Rectangle var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     java.awt.geom.AffineTransform var7 = null;
//     java.awt.RenderingHints var8 = null;
//     java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
//     float[] var13 = new float[] { 100.0f, 0.0f, 10.0f};
//     float[] var14 = var3.getColorComponents(var13);
//     java.awt.Paint[] var15 = new java.awt.Paint[] { var3};
//     org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var18 = var17.getAutoRangeStickyZero();
//     double var19 = var17.getUpperMargin();
//     java.awt.Shape var20 = var17.getUpArrow();
//     double var21 = var17.getUpperMargin();
//     java.awt.Paint var22 = var17.getLabelPaint();
//     java.awt.Paint[] var23 = new java.awt.Paint[] { var22};
//     org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var27 = var26.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var28 = null;
//     var26.removeChangeListener(var28);
//     java.awt.Stroke var30 = var26.getStroke();
//     java.awt.Stroke[] var31 = new java.awt.Stroke[] { var30};
//     org.jfree.chart.plot.IntervalMarker var34 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var35 = var34.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var36 = null;
//     var34.removeChangeListener(var36);
//     java.awt.Stroke var38 = var34.getStroke();
//     java.awt.Stroke[] var39 = new java.awt.Stroke[] { var38};
//     org.jfree.chart.axis.NumberAxis var41 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var42 = var41.getAutoRangeStickyZero();
//     double var43 = var41.getUpperMargin();
//     java.awt.Shape var44 = var41.getUpArrow();
//     java.awt.Shape[] var45 = new java.awt.Shape[] { var44};
//     org.jfree.chart.plot.DefaultDrawingSupplier var46 = new org.jfree.chart.plot.DefaultDrawingSupplier(var15, var23, var31, var39, var45);
//     
//     // Checks the contract:  equals-hashcode on var26 and var34
//     assertTrue("Contract failed: equals-hashcode on var26 and var34", var26.equals(var34) ? var26.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var26
//     assertTrue("Contract failed: equals-hashcode on var34 and var26", var34.equals(var26) ? var34.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var6 = var4.trimWidth(0.0d);
//     double var8 = var4.calculateRightOutset(0.0d);
//     java.awt.geom.Rectangle2D var9 = null;
//     var4.trim(var9);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.TickUnit var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var2 = var0.getCeilingTickUnit(var1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(1.0d, var1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


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

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var9 = var4.getBottom();
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var11 = var4.createOutsetRectangle(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var5 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var6 = var5.getAlpha();
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var5.notifyListeners(var7);
//     org.jfree.chart.util.RectangleAnchor var9 = var5.getLabelAnchor();
//     java.awt.geom.Rectangle2D var10 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, (-1.0d), 0.05d, var9);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    var2.setStartValue(0.0d);
    org.jfree.chart.util.LengthAdjustmentType var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelOffsetType(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var13 = var0.get((-254));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPosition var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var5 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var6 = var5.getAlpha();
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var5.notifyListeners(var7);
//     org.jfree.chart.util.RectangleAnchor var9 = var5.getLabelAnchor();
//     java.awt.geom.Rectangle2D var10 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.2d, 10.0d, var9);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.LengthAdjustmentType var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelOffsetType(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.chart.axis.NumberAxis var0 = new org.jfree.chart.axis.NumberAxis();

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


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

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.util.Locale var0 = null;
//     org.jfree.chart.axis.TickUnitSource var1 = org.jfree.chart.axis.NumberAxis.createIntegerTickUnits(var0);
// 
//   }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var11 = null;
    boolean var12 = var10.hasListener(var11);
    var10.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var16 = var10.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var19 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var20 = var19.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var21 = null;
    var19.removeChangeListener(var21);
    java.awt.Stroke var23 = var19.getStroke();
    int var24 = var16.compareTo((java.lang.Object)var23);
    var2.setTickUnit(var16);
    java.lang.String var27 = var16.valueToString(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var28 = var0.getLargerTickUnit((org.jfree.chart.axis.TickUnit)var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "0"+ "'", var27.equals("0"));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor((-1.0f), 10.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     org.jfree.chart.plot.IntervalMarker var5 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var6 = var5.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var7 = null;
//     var5.removeChangeListener(var7);
//     org.jfree.chart.util.RectangleAnchor var9 = var5.getLabelAnchor();
//     var2.setLabelAnchor(var9);
//     
//     // Checks the contract:  equals-hashcode on var2 and var5
//     assertTrue("Contract failed: equals-hashcode on var2 and var5", var2.equals(var5) ? var2.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var2
//     assertTrue("Contract failed: equals-hashcode on var5 and var2", var5.equals(var2) ? var5.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var3 = var2.getLowerBound();
    double var4 = var2.getLowerBound();
    double var5 = var2.getLength();
    boolean var7 = var2.contains(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 108.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
//     java.awt.Graphics2D var20 = null;
//     org.jfree.chart.plot.Plot var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.util.RectangleEdge var23 = null;
//     org.jfree.chart.axis.AxisSpace var24 = null;
//     org.jfree.chart.axis.AxisSpace var25 = var1.reserveSpace(var20, var21, var22, var23, var24);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    double var7 = var6.getLeft();
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var12 = var11.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var13 = null;
    var11.removeChangeListener(var13);
    org.jfree.chart.util.RectangleInsets var19 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var11.setLabelOffset(var19);
    boolean var22 = var11.equals((java.lang.Object)0.05d);
    org.jfree.chart.util.LengthAdjustmentType var23 = var11.getLabelOffsetType();
    org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var27 = var26.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var28 = null;
    var26.removeChangeListener(var28);
    org.jfree.chart.util.RectangleInsets var34 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var26.setLabelOffset(var34);
    boolean var37 = var26.equals((java.lang.Object)0.05d);
    org.jfree.chart.util.LengthAdjustmentType var38 = var26.getLabelOffsetType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var39 = var6.createAdjustedRectangle(var8, var23, var38);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var4 = null;
    java.awt.Rectangle var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    java.awt.geom.AffineTransform var7 = null;
    java.awt.RenderingHints var8 = null;
    java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
    int var10 = var3.getRed();
    int var11 = var3.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 255);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    java.lang.Object var0 = null;
    org.jfree.chart.JFreeChart var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(0.0d);
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var12 = var4.createInsetRectangle(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var4 = var3.darker();
    java.awt.color.ColorSpace var5 = var4.getColorSpace();
    java.awt.Color var9 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var10 = var9.darker();
    java.awt.color.ColorSpace var11 = var10.getColorSpace();
    float[] var12 = new float[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var13 = var4.getColorComponents(var11, var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var4 = org.jfree.data.Range.shift(var2, (-1.0d));
    org.jfree.data.Range var5 = null;
    org.jfree.data.Range var6 = org.jfree.data.Range.combine(var4, var5);
    double var7 = var6.getCentralValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-47.0d));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var1.setValue(100.0d);
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var1.addChangeListener(var4);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(0.0d);
    double var12 = var4.calculateRightOutset((-100.0d));
    org.jfree.chart.util.RectangleInsets var17 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    boolean var18 = var4.equals((java.lang.Object)1.0d);
    java.lang.String var19 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"+ "'", var19.equals("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"));

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     var1.setRangeAboutValue(0.0d, 10.0d);
//     var1.setAutoRangeIncludesZero(true);
//     var1.setLabelURL("hi!");
//     java.awt.Graphics2D var9 = null;
//     java.awt.geom.Rectangle2D var11 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.util.RectangleEdge var13 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var14 = null;
//     org.jfree.chart.axis.AxisState var15 = var1.draw(var9, 10.0d, var11, var12, var13, var14);
// 
//   }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryStart(1, 178, var3, var4);
//     java.awt.Paint var7 = var0.getTickLabelPaint((java.lang.Comparable)10.0f);
//     org.jfree.data.category.CategoryDataset var10 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.util.RectangleEdge var13 = null;
//     double var14 = var0.getCategorySeriesMiddle((java.lang.Comparable)0L, (java.lang.Comparable)(short)(-1), var10, (-47.0d), var12, var13);
// 
//   }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Graphics2D var8 = null;
//     org.jfree.chart.axis.AxisState var9 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     java.util.List var12 = var1.refreshTicks(var8, var9, var10, var11);
//     java.lang.Object var13 = null;
//     boolean var14 = var1.equals(var13);
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.util.RectangleEdge var19 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var20 = null;
//     org.jfree.chart.axis.AxisState var21 = var1.draw(var15, (-47.0d), var17, var18, var19, var20);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(108.0d);
    org.jfree.chart.axis.CategoryLabelPosition var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var3 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var4 = null;
    java.awt.Rectangle var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    java.awt.geom.AffineTransform var7 = null;
    java.awt.RenderingHints var8 = null;
    java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
    int var10 = var3.getRed();
    java.lang.String var11 = var3.toString();
    java.awt.Color var15 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var16 = null;
    java.awt.Rectangle var17 = null;
    java.awt.geom.Rectangle2D var18 = null;
    java.awt.geom.AffineTransform var19 = null;
    java.awt.RenderingHints var20 = null;
    java.awt.PaintContext var21 = var15.createContext(var16, var17, var18, var19, var20);
    float[] var22 = null;
    float[] var23 = var15.getComponents(var22);
    java.awt.Color var27 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var28 = null;
    java.awt.Rectangle var29 = null;
    java.awt.geom.Rectangle2D var30 = null;
    java.awt.geom.AffineTransform var31 = null;
    java.awt.RenderingHints var32 = null;
    java.awt.PaintContext var33 = var27.createContext(var28, var29, var30, var31, var32);
    float[] var37 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var38 = var27.getColorComponents(var37);
    java.awt.color.ColorSpace var39 = var27.getColorSpace();
    java.awt.Color var43 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var44 = null;
    java.awt.Rectangle var45 = null;
    java.awt.geom.Rectangle2D var46 = null;
    java.awt.geom.AffineTransform var47 = null;
    java.awt.RenderingHints var48 = null;
    java.awt.PaintContext var49 = var43.createContext(var44, var45, var46, var47, var48);
    float[] var53 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var54 = var43.getColorComponents(var53);
    float[] var55 = var15.getColorComponents(var39, var54);
    java.awt.Color var59 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var60 = null;
    java.awt.Rectangle var61 = null;
    java.awt.geom.Rectangle2D var62 = null;
    java.awt.geom.AffineTransform var63 = null;
    java.awt.RenderingHints var64 = null;
    java.awt.PaintContext var65 = var59.createContext(var60, var61, var62, var63, var64);
    float[] var69 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var70 = var59.getColorComponents(var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var71 = var3.getComponents(var39, var70);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var11.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    var2.setLabel("");
    java.awt.Font var5 = var2.getLabelFont();
    org.jfree.chart.text.TextAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelTextAnchor(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setVerticalTickLabels(false);
    double var4 = var1.getUpperMargin();
    java.lang.String var5 = var1.getLabelURL();
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var8 = null;
    boolean var9 = var7.hasListener(var8);
    var7.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var13 = var7.getTickUnit();
    var1.setTickUnit(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeAboutValue((-99.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)"hi!", var1);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var3 = var1.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint var5 = var1.getTickLabelPaint((java.lang.Comparable)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var4 = org.jfree.data.Range.shift(var2, (-1.0d));
    java.lang.String var5 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Range[-101.0,7.0]"+ "'", var5.equals("Range[-101.0,7.0]"));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    var1.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var5 = var1.getPlot();
    boolean var6 = var1.isTickLabelsVisible();
    java.lang.String var7 = var1.getLabel();
    java.awt.Stroke var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAxisLineStroke(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var5 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var6 = var5.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var7 = null;
//     var5.removeChangeListener(var7);
//     org.jfree.chart.util.RectangleAnchor var9 = var5.getLabelAnchor();
//     java.awt.geom.Rectangle2D var10 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.2d, (-1.0d), var9);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    double var4 = var1.getFixedDimension();
    var1.setTickMarksVisible(false);
    var1.setLabelURL("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRange(0.05d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Paint var3 = var1.getTickLabelPaint((java.lang.Comparable)(-1.0f));
//     org.jfree.chart.axis.CategoryAxis var5 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Paint var7 = var5.getTickLabelPaint((java.lang.Comparable)(-1.0f));
//     java.awt.Paint[] var8 = new java.awt.Paint[] { var7};
//     org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var12 = var11.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var13 = null;
//     var11.removeChangeListener(var13);
//     org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var17 = var16.getLabelPaint();
//     var11.setOutlinePaint(var17);
//     java.awt.Paint[] var19 = new java.awt.Paint[] { var17};
//     java.awt.Color var23 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var24 = null;
//     java.awt.Rectangle var25 = null;
//     java.awt.geom.Rectangle2D var26 = null;
//     java.awt.geom.AffineTransform var27 = null;
//     java.awt.RenderingHints var28 = null;
//     java.awt.PaintContext var29 = var23.createContext(var24, var25, var26, var27, var28);
//     int var30 = var23.getRed();
//     java.lang.String var31 = var23.toString();
//     java.awt.Paint[] var32 = new java.awt.Paint[] { var23};
//     org.jfree.chart.axis.NumberAxis var34 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var35 = var34.getAutoRangeStickyZero();
//     double var36 = var34.getUpperMargin();
//     java.awt.Shape var37 = var34.getUpArrow();
//     var34.setTickMarkInsideLength(0.0f);
//     boolean var40 = var34.isTickMarksVisible();
//     java.awt.Shape var41 = var34.getRightArrow();
//     java.awt.Stroke var42 = var34.getTickMarkStroke();
//     java.awt.Stroke[] var43 = new java.awt.Stroke[] { var42};
//     org.jfree.chart.axis.NumberAxis var45 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var46 = var45.getAutoRangeStickyZero();
//     var45.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var50 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var51 = var50.getAutoRangeStickyZero();
//     double var52 = var50.getUpperMargin();
//     java.awt.Shape var53 = var50.getUpArrow();
//     var50.setTickMarkInsideLength(0.0f);
//     boolean var56 = var50.isTickMarksVisible();
//     java.awt.Shape var57 = var50.getRightArrow();
//     var45.setLeftArrow(var57);
//     java.awt.Stroke var59 = var45.getAxisLineStroke();
//     java.awt.Stroke[] var60 = new java.awt.Stroke[] { var59};
//     java.awt.Shape[] var61 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
//     org.jfree.chart.plot.DefaultDrawingSupplier var62 = new org.jfree.chart.plot.DefaultDrawingSupplier(var8, var19, var32, var43, var60, var61);
//     boolean var63 = var1.equals((java.lang.Object)var19);
//     java.awt.Graphics2D var64 = null;
//     org.jfree.chart.plot.Plot var65 = null;
//     java.awt.geom.Rectangle2D var66 = null;
//     org.jfree.chart.util.RectangleEdge var67 = null;
//     org.jfree.chart.axis.AxisSpace var68 = null;
//     org.jfree.chart.axis.AxisSpace var69 = var1.reserveSpace(var64, var65, var66, var67, var68);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var4 = null;
    java.awt.Rectangle var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    java.awt.geom.AffineTransform var7 = null;
    java.awt.RenderingHints var8 = null;
    java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
    float[] var10 = null;
    float[] var11 = var3.getComponents(var10);
    java.awt.Color var15 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var16 = null;
    java.awt.Rectangle var17 = null;
    java.awt.geom.Rectangle2D var18 = null;
    java.awt.geom.AffineTransform var19 = null;
    java.awt.RenderingHints var20 = null;
    java.awt.PaintContext var21 = var15.createContext(var16, var17, var18, var19, var20);
    float[] var25 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var26 = var15.getColorComponents(var25);
    java.awt.color.ColorSpace var27 = var15.getColorSpace();
    java.awt.Color var31 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var32 = null;
    java.awt.Rectangle var33 = null;
    java.awt.geom.Rectangle2D var34 = null;
    java.awt.geom.AffineTransform var35 = null;
    java.awt.RenderingHints var36 = null;
    java.awt.PaintContext var37 = var31.createContext(var32, var33, var34, var35, var36);
    float[] var41 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var42 = var31.getColorComponents(var41);
    float[] var43 = var3.getColorComponents(var27, var42);
    java.awt.image.ColorModel var44 = null;
    java.awt.Rectangle var45 = null;
    java.awt.geom.Rectangle2D var46 = null;
    java.awt.geom.AffineTransform var47 = null;
    java.awt.RenderingHints var48 = null;
    java.awt.PaintContext var49 = var3.createContext(var44, var45, var46, var47, var48);
    java.awt.Color var53 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var54 = null;
    java.awt.Rectangle var55 = null;
    java.awt.geom.Rectangle2D var56 = null;
    java.awt.geom.AffineTransform var57 = null;
    java.awt.RenderingHints var58 = null;
    java.awt.PaintContext var59 = var53.createContext(var54, var55, var56, var57, var58);
    float[] var60 = null;
    float[] var61 = var53.getComponents(var60);
    java.awt.Color var65 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var66 = null;
    java.awt.Rectangle var67 = null;
    java.awt.geom.Rectangle2D var68 = null;
    java.awt.geom.AffineTransform var69 = null;
    java.awt.RenderingHints var70 = null;
    java.awt.PaintContext var71 = var65.createContext(var66, var67, var68, var69, var70);
    float[] var75 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var76 = var65.getColorComponents(var75);
    java.awt.color.ColorSpace var77 = var65.getColorSpace();
    java.awt.Color var81 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var82 = null;
    java.awt.Rectangle var83 = null;
    java.awt.geom.Rectangle2D var84 = null;
    java.awt.geom.AffineTransform var85 = null;
    java.awt.RenderingHints var86 = null;
    java.awt.PaintContext var87 = var81.createContext(var82, var83, var84, var85, var86);
    float[] var91 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var92 = var81.getColorComponents(var91);
    float[] var93 = var53.getColorComponents(var77, var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var94 = var3.getComponents(var92);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.util.LengthAdjustmentType var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelOffsetType(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.util.SortOrder var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRowRenderingOrder(var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var2 = var1.getLabelPaint();
    org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    boolean var6 = var5.getAutoRangeStickyZero();
    double var7 = var5.getUpperMargin();
    java.awt.Shape var8 = var5.getUpArrow();
    var5.setTickMarkInsideLength(0.0f);
    boolean var11 = var5.isTickMarksVisible();
    java.awt.Shape var12 = var5.getRightArrow();
    java.awt.Stroke var13 = var5.getTickMarkStroke();
    boolean var14 = var3.equals((java.lang.Object)var13);
    var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var17 = var3.get(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var4 = null;
    java.awt.Rectangle var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    java.awt.geom.AffineTransform var7 = null;
    java.awt.RenderingHints var8 = null;
    java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
    float[] var10 = null;
    float[] var11 = var3.getComponents(var10);
    java.awt.image.ColorModel var12 = null;
    java.awt.Rectangle var13 = null;
    java.awt.geom.Rectangle2D var14 = null;
    java.awt.geom.AffineTransform var15 = null;
    java.awt.RenderingHints var16 = null;
    java.awt.PaintContext var17 = var3.createContext(var12, var13, var14, var15, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.jfree.chart.ChartColor var3 = new org.jfree.chart.ChartColor(0, 0, 0);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.RectangleInsets var10 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var2.setLabelOffset(var10);
    boolean var13 = var2.equals((java.lang.Object)0.05d);
    org.jfree.chart.util.LengthAdjustmentType var14 = var2.getLabelOffsetType();
    org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
    var16.setVerticalTickLabels(false);
    double var19 = var16.getUpperMargin();
    java.lang.String var20 = var16.getLabelURL();
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var23 = null;
    boolean var24 = var22.hasListener(var23);
    var22.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var28 = var22.getTickUnit();
    var16.setTickUnit(var28);
    boolean var30 = var14.equals((java.lang.Object)var28);
    org.jfree.chart.axis.NumberAxis var32 = new org.jfree.chart.axis.NumberAxis("");
    boolean var33 = var32.getAutoRangeStickyZero();
    double var34 = var32.getUpperMargin();
    var32.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var38 = null;
    org.jfree.chart.util.RectangleEdge var39 = null;
    double var40 = var32.valueToJava2D(8.0d, var38, var39);
    org.jfree.chart.axis.NumberAxis var42 = new org.jfree.chart.axis.NumberAxis("");
    boolean var43 = var42.getAutoRangeStickyZero();
    double var44 = var42.getUpperMargin();
    java.awt.Shape var45 = var42.getUpArrow();
    var42.setTickMarkInsideLength(0.0f);
    boolean var48 = var42.isTickMarksVisible();
    java.awt.Shape var49 = var42.getRightArrow();
    var32.setRightArrow(var49);
    org.jfree.chart.entity.ChartEntity var51 = new org.jfree.chart.entity.ChartEntity(var49);
    org.jfree.chart.axis.NumberAxis var53 = new org.jfree.chart.axis.NumberAxis("");
    boolean var54 = var53.getAutoRangeStickyZero();
    var53.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var58 = new org.jfree.chart.axis.NumberAxis("");
    boolean var59 = var58.getAutoRangeStickyZero();
    double var60 = var58.getUpperMargin();
    java.awt.Shape var61 = var58.getUpArrow();
    var58.setTickMarkInsideLength(0.0f);
    boolean var64 = var58.isTickMarksVisible();
    java.awt.Shape var65 = var58.getRightArrow();
    var53.setLeftArrow(var65);
    var51.setArea(var65);
    org.jfree.chart.entity.ChartEntity var70 = new org.jfree.chart.entity.ChartEntity(var65, "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]", "");
    boolean var71 = var14.equals((java.lang.Object)"RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.axis.CategoryAxis var8 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var10 = var8.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    org.jfree.chart.axis.CategoryAxis var12 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var14 = var12.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var15 = new java.awt.Paint[] { var14};
    org.jfree.chart.plot.IntervalMarker var18 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var19 = var18.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var20 = null;
    var18.removeChangeListener(var20);
    org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var24 = var23.getLabelPaint();
    var18.setOutlinePaint(var24);
    java.awt.Paint[] var26 = new java.awt.Paint[] { var24};
    java.awt.Color var30 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var31 = null;
    java.awt.Rectangle var32 = null;
    java.awt.geom.Rectangle2D var33 = null;
    java.awt.geom.AffineTransform var34 = null;
    java.awt.RenderingHints var35 = null;
    java.awt.PaintContext var36 = var30.createContext(var31, var32, var33, var34, var35);
    int var37 = var30.getRed();
    java.lang.String var38 = var30.toString();
    java.awt.Paint[] var39 = new java.awt.Paint[] { var30};
    org.jfree.chart.axis.NumberAxis var41 = new org.jfree.chart.axis.NumberAxis("");
    boolean var42 = var41.getAutoRangeStickyZero();
    double var43 = var41.getUpperMargin();
    java.awt.Shape var44 = var41.getUpArrow();
    var41.setTickMarkInsideLength(0.0f);
    boolean var47 = var41.isTickMarksVisible();
    java.awt.Shape var48 = var41.getRightArrow();
    java.awt.Stroke var49 = var41.getTickMarkStroke();
    java.awt.Stroke[] var50 = new java.awt.Stroke[] { var49};
    org.jfree.chart.axis.NumberAxis var52 = new org.jfree.chart.axis.NumberAxis("");
    boolean var53 = var52.getAutoRangeStickyZero();
    var52.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var57 = new org.jfree.chart.axis.NumberAxis("");
    boolean var58 = var57.getAutoRangeStickyZero();
    double var59 = var57.getUpperMargin();
    java.awt.Shape var60 = var57.getUpArrow();
    var57.setTickMarkInsideLength(0.0f);
    boolean var63 = var57.isTickMarksVisible();
    java.awt.Shape var64 = var57.getRightArrow();
    var52.setLeftArrow(var64);
    java.awt.Stroke var66 = var52.getAxisLineStroke();
    java.awt.Stroke[] var67 = new java.awt.Stroke[] { var66};
    java.awt.Shape[] var68 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var69 = new org.jfree.chart.plot.DefaultDrawingSupplier(var15, var26, var39, var50, var67, var68);
    boolean var70 = var8.equals((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxis((-254), var8, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var38.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.util.RectangleEdge var12 = var9.getDomainAxisEdge();
//     double var13 = var1.lengthToJava2D(1.0d, var8, var12);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     org.jfree.chart.util.ObjectList var0 = new org.jfree.chart.util.ObjectList();
//     var0.set(255, (java.lang.Object)(-1.0d));
//     var0.clear();
//     org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var7 = var6.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var8 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var11 = var10.getAutoRangeStickyZero();
//     double var12 = var10.getUpperMargin();
//     java.awt.Shape var13 = var10.getUpArrow();
//     var10.setTickMarkInsideLength(0.0f);
//     boolean var16 = var10.isTickMarksVisible();
//     java.awt.Shape var17 = var10.getRightArrow();
//     java.awt.Stroke var18 = var10.getTickMarkStroke();
//     boolean var19 = var8.equals((java.lang.Object)var18);
//     var6.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var8);
//     org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var23 = null;
//     boolean var24 = var22.hasListener(var23);
//     var22.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var28 = var22.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var31 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var32 = var31.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var33 = null;
//     var31.removeChangeListener(var33);
//     java.awt.Stroke var35 = var31.getStroke();
//     int var36 = var28.compareTo((java.lang.Object)var35);
//     var8.add((org.jfree.chart.axis.TickUnit)var28);
//     int var38 = var0.indexOf((java.lang.Object)var8);
//     org.jfree.chart.axis.NumberAxis var40 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var41 = var40.getAutoRangeStickyZero();
//     double var42 = var40.getUpperMargin();
//     java.awt.Shape var43 = var40.getUpArrow();
//     var40.setTickMarkInsideLength(0.0f);
//     boolean var46 = var40.isTickMarksVisible();
//     org.jfree.chart.axis.NumberAxis var48 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var49 = null;
//     boolean var50 = var48.hasListener(var49);
//     var48.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var54 = var48.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var57 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var58 = var57.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var59 = null;
//     var57.removeChangeListener(var59);
//     java.awt.Stroke var61 = var57.getStroke();
//     int var62 = var54.compareTo((java.lang.Object)var61);
//     var40.setTickUnit(var54);
//     java.lang.String var65 = var54.valueToString(0.0d);
//     org.jfree.chart.axis.TickUnit var66 = var8.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var54);
//     
//     // Checks the contract:  equals-hashcode on var31 and var57
//     assertTrue("Contract failed: equals-hashcode on var31 and var57", var31.equals(var57) ? var31.hashCode() == var57.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var57 and var31
//     assertTrue("Contract failed: equals-hashcode on var57 and var31", var57.equals(var31) ? var57.hashCode() == var31.hashCode() : true);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.awt.Paint var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeGridlinePaint(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryStart(1, 178, var3, var4);
//     var0.setMaximumCategoryLabelLines(178);
//     java.awt.Graphics2D var8 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var13 = null;
//     var12.notifyListeners(var13);
//     org.jfree.chart.util.RectangleEdge var15 = var12.getDomainAxisEdge();
//     org.jfree.chart.plot.PlotRenderingInfo var16 = null;
//     org.jfree.chart.axis.AxisState var17 = var0.draw(var8, 1.0d, var10, var11, var15, var16);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.jfree.chart.util.UnitType var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleInsets var5 = new org.jfree.chart.util.RectangleInsets(var0, 108.0d, 100.0d, (-1.0d), 8.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     java.awt.Graphics2D var6 = null;
//     java.awt.geom.Rectangle2D var7 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var9 = null;
//     boolean var10 = var0.render(var6, var7, (-1), var9);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var14 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var13};
//     var11.setRenderers(var14);
//     var0.setRenderers(var14);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     java.awt.Graphics2D var9 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     var7.drawOutline(var9, var10);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    int var12 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var14 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     java.awt.Graphics2D var6 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.axis.AxisLocation var14 = null;
//     var10.setRangeAxisLocation(100, var14);
//     org.jfree.chart.util.RectangleEdge var16 = var10.getDomainAxisEdge();
//     org.jfree.chart.plot.PlotRenderingInfo var17 = null;
//     org.jfree.chart.axis.AxisState var18 = var1.draw(var6, 10.0d, var8, var9, var16, var17);
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    org.jfree.chart.axis.AxisLocation var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation((-1), var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     var1.setRangeAboutValue(0.0d, 10.0d);
//     org.jfree.chart.util.RectangleInsets var5 = var1.getTickLabelInsets();
//     var1.setInverted(false);
//     org.jfree.data.Range var8 = var1.getDefaultAutoRange();
//     boolean var9 = var1.isTickMarksVisible();
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var13 = null;
//     var12.notifyListeners(var13);
//     org.jfree.chart.util.RectangleEdge var15 = var12.getDomainAxisEdge();
//     double var16 = var1.lengthToJava2D((-47.0d), var11, var15);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.axis.AxisLocation var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(var11, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.util.SortOrder var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnRenderingOrder(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     var1.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var5 = var1.getPlot();
//     boolean var6 = var1.isPositiveArrowVisible();
//     java.awt.Graphics2D var7 = null;
//     org.jfree.chart.axis.AxisState var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.util.RectangleEdge var13 = var10.getDomainAxisEdge();
//     java.util.List var14 = var1.refreshTicks(var7, var8, var9, var13);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    java.awt.Font var3 = var2.getLabelFont();
    float var4 = var2.getAlpha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.8f);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    int var12 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var14 = var0.getCeilingTickUnit(0.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var7.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var9 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var10 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var9};
//     var7.setRenderers(var10);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = var7.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var16 = var15.getAutoRangeStickyZero();
//     var15.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var21 = var20.getAutoRangeStickyZero();
//     double var22 = var20.getUpperMargin();
//     java.awt.Shape var23 = var20.getUpArrow();
//     var20.setTickMarkInsideLength(0.0f);
//     boolean var26 = var20.isTickMarksVisible();
//     java.awt.Shape var27 = var20.getRightArrow();
//     var15.setLeftArrow(var27);
//     java.awt.Stroke var29 = var15.getAxisLineStroke();
//     var15.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var32 = var7.getDataRange((org.jfree.chart.axis.ValueAxis)var15);
//     org.jfree.chart.util.SortOrder var33 = var7.getColumnRenderingOrder();
//     var0.setRowRenderingOrder(var33);
//     
//     // Checks the contract:  equals-hashcode on var0 and var7
//     assertTrue("Contract failed: equals-hashcode on var0 and var7", var0.equals(var7) ? var0.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var0
//     assertTrue("Contract failed: equals-hashcode on var7 and var0", var7.equals(var0) ? var7.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.ChartColor var3 = new org.jfree.chart.ChartColor((-254), 100, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.annotations.CategoryAnnotation var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var9 = var4.getBottom();
    double var11 = var4.calculateRightInset((-100.0d));
    java.awt.geom.Rectangle2D var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var15 = var4.createOutsetRectangle(var12, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    org.jfree.chart.plot.PlotOrientation var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleEdge var9 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var7, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var3 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var4 = var3.getAlpha();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var3.notifyListeners(var5);
//     org.jfree.chart.util.RectangleAnchor var7 = var3.getLabelAnchor();
//     java.awt.geom.Point2D var8 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var7);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var14 = var12.trimWidth(0.0d);
    double var16 = var12.calculateRightOutset(0.0d);
    double var17 = var12.getBottom();
    var1.setTickLabelInsets(var12);
    org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
    var1.setRangeAboutValue((-1.0d), 0.0d);
    org.jfree.chart.event.AxisChangeEvent var23 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
    org.jfree.chart.axis.Axis var24 = var23.getAxis();
    float var25 = var24.getTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2.0f);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var10 = var4.calculateBottomOutset(10.0d);
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var12 = var4.createOutsetRectangle(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(100.0d);
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var4.createInsetRectangle(var11, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    java.awt.Color var1 = java.awt.Color.getColor("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    int var3 = java.awt.Color.HSBtoRGB((-1.0f), 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-16777216));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.axis.AxisLocation var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxisLocation(var4, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     var9.clearRangeAxes();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var9);
//     
//     // Checks the contract:  equals-hashcode on var7 and var9
//     assertTrue("Contract failed: equals-hashcode on var7 and var9", var7.equals(var9) ? var7.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var7
//     assertTrue("Contract failed: equals-hashcode on var9 and var7", var9.equals(var7) ? var9.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    java.awt.Paint var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeGridlinePaint(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    double var2 = var1.getLabelAngle();
    java.awt.Stroke var3 = var1.getAxisLineStroke();
    var1.configure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    float var8 = var2.getTickMarkInsideLength();
    var2.setRange((-1.0d), 0.0d);
    java.awt.Paint var12 = var2.getLabelPaint();
    org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
    var13.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var15 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var16 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var15};
    var13.setRenderers(var16);
    org.jfree.chart.renderer.category.CategoryItemRenderer var18 = var13.getRenderer();
    java.awt.Stroke var19 = var13.getRangeCrosshairStroke();
    java.awt.Paint var20 = null;
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    double var23 = var22.getLabelAngle();
    java.awt.Stroke var24 = var22.getAxisLineStroke();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(Double.POSITIVE_INFINITY, var12, var19, var20, var24, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(0.2d, var1, 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.plot.CategoryMarker var5 = null;
    org.jfree.chart.util.Layer var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker((-16777216), var5, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.jfree.chart.util.RectangleInsets var0 = new org.jfree.chart.util.RectangleInsets();
    double var2 = var0.trimWidth(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var2 = var1.getLabelPaint();
    org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    boolean var6 = var5.getAutoRangeStickyZero();
    double var7 = var5.getUpperMargin();
    java.awt.Shape var8 = var5.getUpArrow();
    var5.setTickMarkInsideLength(0.0f);
    boolean var11 = var5.isTickMarksVisible();
    java.awt.Shape var12 = var5.getRightArrow();
    java.awt.Stroke var13 = var5.getTickMarkStroke();
    boolean var14 = var3.equals((java.lang.Object)var13);
    var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
    java.awt.Shape var16 = var1.getUpArrow();
    org.jfree.chart.entity.TickLabelEntity var19 = new org.jfree.chart.entity.TickLabelEntity(var16, "java.awt.Color[r=255,g=255,b=2]", "ChartEntity: tooltip = null");
    java.lang.String var20 = var19.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ChartEntity: tooltip = null"+ "'", var20.equals("ChartEntity: tooltip = null"));

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeWithMargins(108.0d, 0.2d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    java.lang.String var9 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"+ "'", var9.equals("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.text.TextBlockAnchor var7 = null;
    org.jfree.chart.text.TextAnchor var8 = null;
    org.jfree.chart.axis.CategoryLabelWidthType var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition(var6, var7, var8, 2.0d, var10, 100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    java.awt.Color var10 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var11 = null;
    java.awt.Rectangle var12 = null;
    java.awt.geom.Rectangle2D var13 = null;
    java.awt.geom.AffineTransform var14 = null;
    java.awt.RenderingHints var15 = null;
    java.awt.PaintContext var16 = var10.createContext(var11, var12, var13, var14, var15);
    float[] var17 = null;
    float[] var18 = var10.getComponents(var17);
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    float[] var29 = null;
    float[] var30 = var22.getComponents(var29);
    java.awt.Color var34 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var35 = null;
    java.awt.Rectangle var36 = null;
    java.awt.geom.Rectangle2D var37 = null;
    java.awt.geom.AffineTransform var38 = null;
    java.awt.RenderingHints var39 = null;
    java.awt.PaintContext var40 = var34.createContext(var35, var36, var37, var38, var39);
    float[] var44 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var45 = var34.getColorComponents(var44);
    java.awt.color.ColorSpace var46 = var34.getColorSpace();
    java.awt.Color var50 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var51 = null;
    java.awt.Rectangle var52 = null;
    java.awt.geom.Rectangle2D var53 = null;
    java.awt.geom.AffineTransform var54 = null;
    java.awt.RenderingHints var55 = null;
    java.awt.PaintContext var56 = var50.createContext(var51, var52, var53, var54, var55);
    float[] var60 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var61 = var50.getColorComponents(var60);
    float[] var62 = var22.getColorComponents(var46, var61);
    float[] var63 = var10.getColorComponents(var62);
    var0.setRangeGridlinePaint((java.awt.Paint)var10);
    org.jfree.chart.axis.CategoryAxis var66 = var0.getDomainAxisForDataset((-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    org.jfree.chart.plot.CategoryMarker var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var4 = null;
    java.awt.Rectangle var5 = null;
    java.awt.geom.Rectangle2D var6 = null;
    java.awt.geom.AffineTransform var7 = null;
    java.awt.RenderingHints var8 = null;
    java.awt.PaintContext var9 = var3.createContext(var4, var5, var6, var7, var8);
    float[] var10 = null;
    float[] var11 = var3.getComponents(var10);
    java.awt.Color var15 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var16 = null;
    java.awt.Rectangle var17 = null;
    java.awt.geom.Rectangle2D var18 = null;
    java.awt.geom.AffineTransform var19 = null;
    java.awt.RenderingHints var20 = null;
    java.awt.PaintContext var21 = var15.createContext(var16, var17, var18, var19, var20);
    float[] var25 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var26 = var15.getColorComponents(var25);
    java.awt.color.ColorSpace var27 = var15.getColorSpace();
    java.awt.Color var31 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var32 = null;
    java.awt.Rectangle var33 = null;
    java.awt.geom.Rectangle2D var34 = null;
    java.awt.geom.AffineTransform var35 = null;
    java.awt.RenderingHints var36 = null;
    java.awt.PaintContext var37 = var31.createContext(var32, var33, var34, var35, var36);
    float[] var41 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var42 = var31.getColorComponents(var41);
    float[] var43 = var3.getColorComponents(var27, var42);
    java.awt.Color var47 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var48 = null;
    java.awt.Rectangle var49 = null;
    java.awt.geom.Rectangle2D var50 = null;
    java.awt.geom.AffineTransform var51 = null;
    java.awt.RenderingHints var52 = null;
    java.awt.PaintContext var53 = var47.createContext(var48, var49, var50, var51, var52);
    float[] var57 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var58 = var47.getColorComponents(var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var59 = var3.getComponents(var58);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
    boolean var7 = var6.getAutoRangeStickyZero();
    double var8 = var6.getUpperMargin();
    var6.setPositiveArrowVisible(true);
    double var11 = var6.getUpperBound();
    boolean var12 = var4.equals((java.lang.Object)var6);
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var16 = var4.createOutsetRectangle(var13, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var7 = var1.getTickUnit();
    org.jfree.data.Range var10 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var12 = org.jfree.data.Range.shift(var10, (-1.0d));
    var1.setRangeWithMargins(var10, false, true);
    double var16 = var10.getCentralValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-46.0d));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var13 = var0.getCeilingTickUnit(0.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var5 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var6 = var5.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var7 = null;
//     var5.removeChangeListener(var7);
//     org.jfree.chart.util.RectangleAnchor var9 = var5.getLabelAnchor();
//     java.awt.geom.Rectangle2D var10 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.05d, 8.0d, var9);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    java.awt.Stroke var6 = var2.getStroke();
    java.awt.Paint var7 = var2.getOutlinePaint();
    org.jfree.chart.event.MarkerChangeEvent var8 = null;
    var2.notifyListeners(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var3 = var2.getLowerBound();
    double var4 = var2.getCentralValue();
    org.jfree.data.Range var7 = org.jfree.data.Range.shift(var2, 108.0d, true);
    boolean var10 = var7.intersects(1.0d, 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var12 = var8.getPlot();
    var8.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
    org.jfree.chart.util.RectangleInsets var15 = var8.getLabelInsets();
    boolean var16 = var6.equals((java.lang.Object)var15);
    org.jfree.chart.text.TextBlockAnchor var17 = null;
    org.jfree.chart.axis.CategoryLabelWidthType var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var20 = new org.jfree.chart.axis.CategoryLabelPosition(var6, var17, var18, 10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    java.awt.Font var8 = var7.getLabelFont();
    var1.setLabelFont(var8);
    java.awt.Stroke var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAxisLineStroke(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(100.0d);
    double var12 = var4.calculateLeftOutset(10.0d);
    double var14 = var4.calculateBottomOutset(0.05d);
    double var16 = var4.calculateLeftOutset((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    java.awt.Color var12 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    var1.setTickLabelPaint((java.awt.Paint)var12);
    java.awt.Color var17 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var18 = var17.darker();
    int var19 = var18.getRed();
    java.awt.Color var23 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var24 = null;
    java.awt.Rectangle var25 = null;
    java.awt.geom.Rectangle2D var26 = null;
    java.awt.geom.AffineTransform var27 = null;
    java.awt.RenderingHints var28 = null;
    java.awt.PaintContext var29 = var23.createContext(var24, var25, var26, var27, var28);
    float[] var33 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var34 = var23.getColorComponents(var33);
    java.awt.color.ColorSpace var35 = var23.getColorSpace();
    float[] var39 = new float[] { 1.0f, 100.0f, 0.0f};
    float[] var40 = var18.getColorComponents(var35, var39);
    java.awt.Color var44 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var45 = null;
    java.awt.Rectangle var46 = null;
    java.awt.geom.Rectangle2D var47 = null;
    java.awt.geom.AffineTransform var48 = null;
    java.awt.RenderingHints var49 = null;
    java.awt.PaintContext var50 = var44.createContext(var45, var46, var47, var48, var49);
    float[] var54 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var55 = var44.getColorComponents(var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var56 = var12.getComponents(var35, var54);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
    org.jfree.chart.util.RectangleInsets var20 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var22 = var20.trimWidth(0.0d);
    double var24 = var20.calculateRightOutset(0.0d);
    double var25 = var20.getBottom();
    double var26 = var20.getTop();
    var0.setAxisOffset(var20);
    java.awt.geom.Rectangle2D var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var31 = var20.createOutsetRectangle(var28, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var4 = null;
//     var0.setFixedRangeAxisSpace(var4);
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
//     float var13 = var7.getMaximumCategoryLabelWidthRatio();
//     java.awt.Font var14 = var7.getLabelFont();
//     var0.setDomainAxis(0, var7);
//     java.awt.Graphics2D var16 = null;
//     java.awt.geom.Rectangle2D var17 = null;
//     var0.drawOutline(var16, var17);
// 
//   }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var2 = null;
//     boolean var3 = var1.hasListener(var2);
//     double var4 = var1.getFixedDimension();
//     var1.setTickMarksVisible(false);
//     var1.setLabelURL("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
//     var1.setRange(0.2d, 4.0d);
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var15 = null;
//     var14.notifyListeners(var15);
//     org.jfree.chart.axis.AxisLocation var18 = null;
//     var14.setRangeAxisLocation(100, var18);
//     org.jfree.chart.util.RectangleEdge var20 = var14.getDomainAxisEdge();
//     double var21 = var1.lengthToJava2D((-1.0d), var13, var20);
// 
//   }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
//     java.lang.Object var9 = var3.clone();
//     java.util.List var10 = var0.getCategoriesForAxis(var3);
//     org.jfree.chart.LegendItemCollection var11 = var0.getLegendItems();
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     var12.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var14 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var15 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var14};
//     var12.setRenderers(var15);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var17 = var12.getRenderer();
//     org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var21 = var20.getAutoRangeStickyZero();
//     double var22 = var20.getUpperMargin();
//     java.awt.Shape var23 = var20.getUpArrow();
//     var20.setTickMarkInsideLength(0.0f);
//     boolean var26 = var20.isTickMarksVisible();
//     org.jfree.chart.plot.Plot var27 = null;
//     var20.setPlot(var27);
//     boolean var30 = var20.equals((java.lang.Object)100.0f);
//     org.jfree.data.Range var33 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.data.Range var35 = org.jfree.data.Range.shift(var33, (-1.0d));
//     var20.setRangeWithMargins(var35);
//     var12.setRangeAxis(0, (org.jfree.chart.axis.ValueAxis)var20);
//     org.jfree.chart.axis.ValueAxis[] var38 = new org.jfree.chart.axis.ValueAxis[] { var20};
//     var0.setRangeAxes(var38);
//     
//     // Checks the contract:  equals-hashcode on var0 and var12
//     assertTrue("Contract failed: equals-hashcode on var0 and var12", var0.equals(var12) ? var0.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var12 and var0
//     assertTrue("Contract failed: equals-hashcode on var12 and var0", var12.equals(var0) ? var12.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    java.awt.Stroke var6 = var2.getStroke();
    double var7 = var2.getEndValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    org.jfree.chart.axis.CategoryAxis var9 = var0.getDomainAxisForDataset(178);
    org.jfree.chart.annotations.CategoryAnnotation var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.removeAnnotation(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
//     java.lang.Object var9 = var3.clone();
//     java.util.List var10 = var0.getCategoriesForAxis(var3);
//     org.jfree.chart.event.MarkerChangeEvent var11 = null;
//     var0.markerChanged(var11);
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var14 = null;
//     var13.notifyListeners(var14);
//     org.jfree.chart.util.RectangleEdge var16 = var13.getDomainAxisEdge();
//     java.lang.String var17 = var13.getPlotType();
//     java.awt.Paint var18 = var13.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var19 = var13.getDomainAxisLocation();
//     boolean var20 = var0.equals((java.lang.Object)var19);
//     
//     // Checks the contract:  equals-hashcode on var0 and var13
//     assertTrue("Contract failed: equals-hashcode on var0 and var13", var0.equals(var13) ? var0.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var0
//     assertTrue("Contract failed: equals-hashcode on var13 and var0", var13.equals(var0) ? var13.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
//     java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
//     var0.setRangeGridlinesVisible(false);
//     var0.zoom(108.0d);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
//     var4.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var7 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var6};
//     var4.setRenderers(var7);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var9 = var4.getRenderer();
//     java.awt.Stroke var10 = var4.getRangeCrosshairStroke();
//     var0.setRangeCrosshairStroke(var10);
//     
//     // Checks the contract:  equals-hashcode on var0 and var4
//     assertTrue("Contract failed: equals-hashcode on var0 and var4", var0.equals(var4) ? var0.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var0
//     assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.text.TextBlockAnchor var7 = null;
    org.jfree.chart.text.TextAnchor var8 = null;
    org.jfree.chart.axis.CategoryLabelPosition var10 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var13 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var14 = new org.jfree.chart.axis.CategoryLabelPositions(var10, var11, var12, var13);
    org.jfree.chart.axis.CategoryLabelWidthType var15 = var10.getWidthType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var17 = new org.jfree.chart.axis.CategoryLabelPosition(var6, var7, var8, 8.0d, var15, 0.8f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    org.jfree.data.Range var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var3 = org.jfree.data.Range.expand(var0, (-99.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.zoom(0.0d);
// 
//   }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     var1.setTickMarkOutsideLength(10.0f);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var12 = null;
//     var11.notifyListeners(var12);
//     org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
//     var1.setPlot((org.jfree.chart.plot.Plot)var11);
//     var11.configureRangeAxes();
//     org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var18 = null;
//     var17.notifyListeners(var18);
//     org.jfree.chart.util.RectangleEdge var20 = var17.getDomainAxisEdge();
//     java.lang.String var21 = var17.getPlotType();
//     java.awt.Paint var22 = var17.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var23 = var17.getDomainAxisLocation();
//     var11.setDomainAxisLocation(var23, true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var17
//     assertTrue("Contract failed: equals-hashcode on var11 and var17", var11.equals(var17) ? var11.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var11
//     assertTrue("Contract failed: equals-hashcode on var17 and var11", var17.equals(var11) ? var17.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     int var6 = var0.getDomainAxisCount();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.axis.AxisLocation var11 = null;
//     var7.setRangeAxisLocation(100, var11);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = var7.getRenderer();
//     org.jfree.chart.axis.AxisLocation var14 = var7.getRangeAxisLocation();
//     org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var17 = var16.getAutoRangeStickyZero();
//     double var18 = var16.getUpperMargin();
//     java.awt.Shape var19 = var16.getUpArrow();
//     var16.setTickMarkInsideLength(0.0f);
//     boolean var22 = var16.isTickMarksVisible();
//     java.awt.Graphics2D var23 = null;
//     org.jfree.chart.axis.AxisState var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     org.jfree.chart.util.RectangleEdge var26 = null;
//     java.util.List var27 = var16.refreshTicks(var23, var24, var25, var26);
//     org.jfree.chart.axis.MarkerAxisBand var28 = null;
//     var16.setMarkerBand(var28);
//     boolean var30 = var14.equals((java.lang.Object)var16);
//     var0.setRangeAxisLocation(var14);
//     
//     // Checks the contract:  equals-hashcode on var0 and var7
//     assertTrue("Contract failed: equals-hashcode on var0 and var7", var0.equals(var7) ? var0.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var0
//     assertTrue("Contract failed: equals-hashcode on var7 and var0", var7.equals(var0) ? var7.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getShapeCoords();
    org.jfree.chart.imagemap.ToolTipTagFragmentGenerator var8 = null;
    org.jfree.chart.imagemap.URLTagFragmentGenerator var9 = null;
    java.lang.String var10 = var5.getImageMapAreaTag(var8, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartEntity: tooltip = null"+ "'", var6.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0,0,-2,2,2,2,2,2"+ "'", var7.equals("0,0,-2,2,2,2,2,2"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var7 = var4.getRight();
    double var9 = var4.calculateRightInset(10.0d);
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var13 = var4.createOutsetRectangle(var10, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
    org.jfree.chart.util.RectangleInsets var20 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var22 = var20.trimWidth(0.0d);
    double var24 = var20.calculateRightOutset(0.0d);
    double var25 = var20.getBottom();
    double var26 = var20.getTop();
    var0.setAxisOffset(var20);
    var0.setAnchorValue(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToDomainAxis((-254), (-16777216));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var2 = null;
//     boolean var3 = var1.hasListener(var2);
//     var1.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var7 = var1.getTickUnit();
//     var1.setTickMarkOutsideLength(100.0f);
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var13 = null;
//     var12.notifyListeners(var13);
//     org.jfree.chart.util.RectangleEdge var15 = var12.getDomainAxisEdge();
//     double var16 = var1.java2DToValue(0.2d, var11, var15);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    double var7 = var2.getStartValue();
    var2.setStartValue(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
//     java.lang.String var6 = var5.toString();
//     java.lang.String var7 = var5.getShapeCoords();
//     java.lang.String var8 = var5.getShapeType();
//     org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var12 = var11.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var13 = null;
//     var11.removeChangeListener(var13);
//     org.jfree.chart.util.RectangleAnchor var15 = var11.getLabelAnchor();
//     double var16 = var11.getStartValue();
//     boolean var17 = var5.equals((java.lang.Object)var11);
//     org.jfree.chart.plot.IntervalMarker var20 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var21 = var20.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var22 = null;
//     var20.removeChangeListener(var22);
//     java.awt.Stroke var24 = var20.getStroke();
//     var11.setOutlineStroke(var24);
//     
//     // Checks the contract:  equals-hashcode on var11 and var20
//     assertTrue("Contract failed: equals-hashcode on var11 and var20", var11.equals(var20) ? var11.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var11
//     assertTrue("Contract failed: equals-hashcode on var20 and var11", var20.equals(var11) ? var20.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var12 = null;
    var0.setRenderer(1, var12);
    org.jfree.chart.axis.ValueAxis var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.getRangeAxisIndex(var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPosition var1 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var5 = new org.jfree.chart.axis.CategoryLabelPositions(var1, var2, var3, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var6 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var0, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    var1.setLowerBound(8.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAutoRangeMinimumSize(0.0d, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    int var4 = var3.getRGB();
    java.awt.Color var8 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var9 = null;
    java.awt.Rectangle var10 = null;
    java.awt.geom.Rectangle2D var11 = null;
    java.awt.geom.AffineTransform var12 = null;
    java.awt.RenderingHints var13 = null;
    java.awt.PaintContext var14 = var8.createContext(var9, var10, var11, var12, var13);
    float[] var15 = null;
    float[] var16 = var8.getComponents(var15);
    java.awt.Color var20 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var21 = null;
    java.awt.Rectangle var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    java.awt.geom.AffineTransform var24 = null;
    java.awt.RenderingHints var25 = null;
    java.awt.PaintContext var26 = var20.createContext(var21, var22, var23, var24, var25);
    float[] var27 = null;
    float[] var28 = var20.getComponents(var27);
    java.awt.Color var32 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var33 = null;
    java.awt.Rectangle var34 = null;
    java.awt.geom.Rectangle2D var35 = null;
    java.awt.geom.AffineTransform var36 = null;
    java.awt.RenderingHints var37 = null;
    java.awt.PaintContext var38 = var32.createContext(var33, var34, var35, var36, var37);
    float[] var42 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var43 = var32.getColorComponents(var42);
    java.awt.color.ColorSpace var44 = var32.getColorSpace();
    java.awt.Color var48 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var49 = null;
    java.awt.Rectangle var50 = null;
    java.awt.geom.Rectangle2D var51 = null;
    java.awt.geom.AffineTransform var52 = null;
    java.awt.RenderingHints var53 = null;
    java.awt.PaintContext var54 = var48.createContext(var49, var50, var51, var52, var53);
    float[] var58 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var59 = var48.getColorComponents(var58);
    float[] var60 = var20.getColorComponents(var44, var59);
    float[] var61 = var8.getColorComponents(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float[] var62 = var3.getComponents(var61);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    double var6 = var5.getLabelAngle();
    java.awt.Stroke var7 = var5.getAxisLineStroke();
    var0.setDomainGridlineStroke(var7);
    org.jfree.chart.plot.IntervalMarker var12 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var13 = var12.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var14 = null;
    var12.removeChangeListener(var14);
    org.jfree.chart.util.RectangleAnchor var16 = var12.getLabelAnchor();
    org.jfree.chart.util.Layer var17 = null;
    var0.addRangeMarker(10, (org.jfree.chart.plot.Marker)var12, var17);
    org.jfree.chart.util.Layer var20 = null;
    java.util.Collection var21 = var0.getRangeMarkers(0, var20);
    org.jfree.chart.axis.NumberAxis var24 = new org.jfree.chart.axis.NumberAxis("");
    double var25 = var24.getLabelAngle();
    org.jfree.chart.event.AxisChangeEvent var26 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxis((-16777216), (org.jfree.chart.axis.ValueAxis)var24, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    float var7 = var1.getTickMarkInsideLength();
    var1.setRange((-1.0d), 0.0d);
    java.awt.Paint var11 = var1.getLabelPaint();
    org.jfree.data.Range var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeWithMargins(var12, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    org.jfree.chart.util.ObjectList var1 = new org.jfree.chart.util.ObjectList(0);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    int var6 = var0.getDomainAxisCount();
    org.jfree.chart.event.PlotChangeEvent var7 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var0);
    double var8 = var0.getAnchorValue();
    org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis();
    double var10 = var9.getLowerMargin();
    org.jfree.chart.axis.CategoryLabelPositions var12 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
    var9.setCategoryLabelPositions(var12);
    var9.removeCategoryLabelToolTip((java.lang.Comparable)"SortOrder.ASCENDING");
    java.util.List var16 = var0.getCategoriesForAxis(var9);
    float var17 = var9.getTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2.0f);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.resizeRange(108.0d, 0.0d);
    org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var11 = var9.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    var1.setAxisLinePaint(var11);
    org.jfree.data.Range var13 = var1.getDefaultAutoRange();
    var1.zoomRange((-99.0d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
//     var1.setRangeAboutValue((-1.0d), 0.0d);
//     org.jfree.chart.event.AxisChangeEvent var23 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
//     org.jfree.chart.axis.TickUnitSource var24 = var1.getStandardTickUnits();
//     boolean var25 = var1.isNegativeArrowVisible();
//     java.awt.Graphics2D var26 = null;
//     org.jfree.chart.axis.AxisState var27 = null;
//     java.awt.geom.Rectangle2D var28 = null;
//     org.jfree.chart.plot.CategoryPlot var29 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var30 = null;
//     var29.notifyListeners(var30);
//     org.jfree.chart.axis.AxisLocation var33 = null;
//     var29.setRangeAxisLocation(100, var33);
//     org.jfree.chart.util.RectangleEdge var35 = var29.getDomainAxisEdge();
//     java.util.List var36 = var1.refreshTicks(var26, var27, var28, var35);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    float var7 = var0.getBackgroundAlpha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundImageAlpha(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    java.awt.Font var3 = var2.getLabelFont();
    float var4 = var2.getAlpha();
    float var5 = var2.getAlpha();
    var2.setEndValue(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.8f);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var8 = var7.getLabelPaint();
    org.jfree.chart.axis.TickUnits var9 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    java.awt.Stroke var19 = var11.getTickMarkStroke();
    boolean var20 = var9.equals((java.lang.Object)var19);
    var7.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var9);
    java.awt.Shape var22 = var7.getUpArrow();
    var5.setArea(var22);
    var5.setURLText("ChartChangeEventType.GENERAL");
    java.lang.String var26 = var5.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var26.equals("ChartChangeEventType.GENERAL"));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    java.lang.Comparable var0 = null;
    java.awt.Shape var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.CategoryLabelEntity var4 = new org.jfree.chart.entity.CategoryLabelEntity(var0, var1, "0,0,-2,2,2,2,2,2", "0");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var7 = var1.getTickUnit();
    org.jfree.data.Range var10 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var12 = org.jfree.data.Range.shift(var10, (-1.0d));
    var1.setRangeWithMargins(var10, false, true);
    double var16 = var10.getLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 108.0d);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     var0.setTickMarkOutsideLength(1.0f);
//     java.awt.Graphics2D var3 = null;
//     java.awt.geom.Rectangle2D var5 = null;
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.axis.AxisLocation var11 = null;
//     var7.setRangeAxisLocation(100, var11);
//     org.jfree.chart.util.RectangleEdge var13 = var7.getDomainAxisEdge();
//     org.jfree.chart.plot.PlotRenderingInfo var14 = null;
//     org.jfree.chart.axis.AxisState var15 = var0.draw(var3, (-100.0d), var5, var6, var13, var14);
// 
//   }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
//     var1.setRangeAboutValue((-1.0d), 0.0d);
//     var1.zoomRange((-100.0d), 1.0d);
//     java.awt.geom.Rectangle2D var27 = null;
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var29 = null;
//     var28.notifyListeners(var29);
//     org.jfree.chart.axis.AxisLocation var32 = null;
//     var28.setRangeAxisLocation(100, var32);
//     org.jfree.chart.util.RectangleEdge var34 = var28.getDomainAxisEdge();
//     double var35 = var1.java2DToValue((-100.0d), var27, var34);
// 
//   }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("0");
    java.text.NumberFormat var2 = var1.getNumberFormatOverride();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.zoomRange(10.0d, 0.2d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    var1.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var5 = var1.getPlot();
    boolean var6 = var1.isPositiveArrowVisible();
    boolean var7 = var1.getAutoRangeIncludesZero();
    var1.centerRange(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    java.awt.Color var4 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var5 = var4.darker();
    java.awt.Stroke var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker((-99.0d), (java.awt.Paint)var4, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var1);
    org.jfree.chart.JFreeChart var3 = var2.getChart();
    org.jfree.chart.JFreeChart var4 = null;
    var2.setChart(var4);
    java.lang.Object var6 = var2.getSource();
    java.lang.String var7 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ' '+ "'", var6.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.jfree.chart.event.ChartChangeEvent[source= ]"+ "'", var7.equals("org.jfree.chart.event.ChartChangeEvent[source= ]"));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    double var6 = var5.getLabelAngle();
    java.awt.Stroke var7 = var5.getAxisLineStroke();
    var0.setDomainGridlineStroke(var7);
    org.jfree.chart.axis.CategoryAxis var10 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var12 = var10.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var13 = new java.awt.Paint[] { var12};
    org.jfree.chart.plot.IntervalMarker var16 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var17 = var16.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var18 = null;
    var16.removeChangeListener(var18);
    org.jfree.chart.axis.NumberAxis var21 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var22 = var21.getLabelPaint();
    var16.setOutlinePaint(var22);
    java.awt.Paint[] var24 = new java.awt.Paint[] { var22};
    java.awt.Color var28 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var29 = null;
    java.awt.Rectangle var30 = null;
    java.awt.geom.Rectangle2D var31 = null;
    java.awt.geom.AffineTransform var32 = null;
    java.awt.RenderingHints var33 = null;
    java.awt.PaintContext var34 = var28.createContext(var29, var30, var31, var32, var33);
    int var35 = var28.getRed();
    java.lang.String var36 = var28.toString();
    java.awt.Paint[] var37 = new java.awt.Paint[] { var28};
    org.jfree.chart.axis.NumberAxis var39 = new org.jfree.chart.axis.NumberAxis("");
    boolean var40 = var39.getAutoRangeStickyZero();
    double var41 = var39.getUpperMargin();
    java.awt.Shape var42 = var39.getUpArrow();
    var39.setTickMarkInsideLength(0.0f);
    boolean var45 = var39.isTickMarksVisible();
    java.awt.Shape var46 = var39.getRightArrow();
    java.awt.Stroke var47 = var39.getTickMarkStroke();
    java.awt.Stroke[] var48 = new java.awt.Stroke[] { var47};
    org.jfree.chart.axis.NumberAxis var50 = new org.jfree.chart.axis.NumberAxis("");
    boolean var51 = var50.getAutoRangeStickyZero();
    var50.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var55 = new org.jfree.chart.axis.NumberAxis("");
    boolean var56 = var55.getAutoRangeStickyZero();
    double var57 = var55.getUpperMargin();
    java.awt.Shape var58 = var55.getUpArrow();
    var55.setTickMarkInsideLength(0.0f);
    boolean var61 = var55.isTickMarksVisible();
    java.awt.Shape var62 = var55.getRightArrow();
    var50.setLeftArrow(var62);
    java.awt.Stroke var64 = var50.getAxisLineStroke();
    java.awt.Stroke[] var65 = new java.awt.Stroke[] { var64};
    java.awt.Shape[] var66 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var67 = new org.jfree.chart.plot.DefaultDrawingSupplier(var13, var24, var37, var48, var65, var66);
    var0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundImageAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var36.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var5 = null;
//     boolean var6 = var4.hasListener(var5);
//     var4.resizeRange(100.0d, 1.0d);
//     boolean var10 = var1.equals((java.lang.Object)100.0d);
//     org.jfree.chart.axis.NumberAxis var12 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var13 = var12.getAutoRangeStickyZero();
//     double var14 = var12.getUpperMargin();
//     java.awt.Shape var15 = var12.getUpArrow();
//     org.jfree.data.Range var18 = new org.jfree.data.Range((-100.0d), 8.0d);
//     double var19 = var18.getLowerBound();
//     double var20 = var18.getLowerBound();
//     var12.setDefaultAutoRange(var18);
//     var1.setRangeWithMargins(var18);
//     java.awt.geom.Rectangle2D var24 = null;
//     org.jfree.chart.plot.CategoryPlot var25 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var26 = null;
//     var25.notifyListeners(var26);
//     org.jfree.chart.axis.AxisLocation var29 = null;
//     var25.setRangeAxisLocation(100, var29);
//     org.jfree.chart.util.RectangleEdge var31 = var25.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var32 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var31);
//     double var33 = var1.java2DToValue(1.0d, var24, var31);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var1.setValue(8.0d);
    var1.setValue(10.0d);
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    boolean var8 = var7.getAutoRangeStickyZero();
    double var9 = var7.getUpperMargin();
    java.awt.Shape var10 = var7.getUpArrow();
    org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    java.awt.Font var14 = var13.getLabelFont();
    var7.setLabelFont(var14);
    var1.setLabelFont(var14);
    java.awt.Stroke var17 = null;
    var1.setOutlineStroke(var17);
    double var19 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10.0d);

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
//     java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
//     org.jfree.chart.axis.ValueAxis var8 = var0.getRangeAxis(1);
//     boolean var9 = var0.isRangeCrosshairVisible();
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.plot.DatasetRenderingOrder var13 = var10.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var14 = null;
//     var10.rendererChanged(var14);
//     int var16 = var10.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var17 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var10);
//     var0.notifyListeners(var17);
//     
//     // Checks the contract:  equals-hashcode on var0 and var10
//     assertTrue("Contract failed: equals-hashcode on var0 and var10", var0.equals(var10) ? var0.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var0
//     assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    var0.clearDomainMarkers(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToDomainAxis((-254), (-16777216));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     java.awt.Color var4 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.Color var5 = var4.darker();
//     java.awt.color.ColorSpace var6 = var5.getColorSpace();
//     org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
//     double var9 = var8.getLabelAngle();
//     java.awt.Stroke var10 = var8.getAxisLineStroke();
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var14 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var13};
//     var11.setRenderers(var14);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var16 = var11.getRenderer();
//     java.awt.Stroke var17 = var11.getRangeCrosshairStroke();
//     java.awt.Paint var18 = var11.getRangeGridlinePaint();
//     org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var21 = var20.getAutoRangeStickyZero();
//     double var22 = var20.getUpperMargin();
//     var20.setPositiveArrowVisible(true);
//     var20.setFixedDimension(0.0d);
//     boolean var27 = var20.isPositiveArrowVisible();
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var29 = null;
//     var28.notifyListeners(var29);
//     org.jfree.chart.axis.AxisLocation var32 = null;
//     var28.setRangeAxisLocation(100, var32);
//     java.awt.Graphics2D var34 = null;
//     java.awt.geom.Rectangle2D var35 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var37 = null;
//     boolean var38 = var28.render(var34, var35, (-1), var37);
//     java.awt.Stroke var39 = var28.getRangeGridlineStroke();
//     var20.setTickMarkStroke(var39);
//     org.jfree.chart.plot.ValueMarker var42 = new org.jfree.chart.plot.ValueMarker(4.0d, (java.awt.Paint)var5, var10, var18, var39, 0.0f);
//     
//     // Checks the contract:  equals-hashcode on var11 and var28
//     assertTrue("Contract failed: equals-hashcode on var11 and var28", var11.equals(var28) ? var11.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var11
//     assertTrue("Contract failed: equals-hashcode on var28 and var11", var28.equals(var11) ? var28.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     float var7 = var0.getMaximumCategoryLabelWidthRatio();
//     var0.configure();
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.plot.DatasetRenderingOrder var12 = var9.getDatasetRenderingOrder();
//     int var13 = var9.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var15 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.util.RectangleEdge var19 = null;
//     double var20 = var15.getCategoryMiddle(1, 0, var18, var19);
//     double var21 = var15.getUpperMargin();
//     float var22 = var15.getMaximumCategoryLabelWidthRatio();
//     var9.setDomainAxis(2, var15);
//     org.jfree.chart.axis.CategoryAnchor var24 = var9.getDomainGridlinePosition();
//     java.awt.geom.Rectangle2D var27 = null;
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var29 = null;
//     var28.notifyListeners(var29);
//     org.jfree.chart.axis.AxisLocation var32 = null;
//     var28.setRangeAxisLocation(100, var32);
//     org.jfree.chart.util.RectangleEdge var34 = var28.getDomainAxisEdge();
//     double var35 = var0.getCategoryJava2DCoordinate(var24, 178, 1, var27, var34);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    java.lang.String var3 = var1.getLabel();
    org.jfree.chart.event.ChartChangeEvent var4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getShapeCoords();
    java.lang.String var8 = var5.getShapeType();
    org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var12 = var11.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var13 = null;
    var11.removeChangeListener(var13);
    org.jfree.chart.util.RectangleAnchor var15 = var11.getLabelAnchor();
    double var16 = var11.getStartValue();
    boolean var17 = var5.equals((java.lang.Object)var11);
    java.lang.String var18 = var5.getURLText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartEntity: tooltip = null"+ "'", var6.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0,0,-2,2,2,2,2,2"+ "'", var7.equals("0,0,-2,2,2,2,2,2"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "poly"+ "'", var8.equals("poly"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("PlotOrientation.VERTICAL");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setPositiveArrowVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.resizeRange(108.0d, 0.0d);
    org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var11 = var9.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    var1.setAxisLinePaint(var11);
    org.jfree.data.Range var13 = var1.getDefaultAutoRange();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var16 = org.jfree.data.Range.expand(var13, 0.0d, (-47.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     var1.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var5 = var1.getPlot();
//     boolean var6 = var1.isPositiveArrowVisible();
//     java.awt.Graphics2D var7 = null;
//     org.jfree.chart.plot.Plot var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.axis.AxisLocation var14 = null;
//     var10.setRangeAxisLocation(100, var14);
//     org.jfree.chart.util.RectangleEdge var16 = var10.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var17 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var16);
//     org.jfree.chart.axis.AxisSpace var18 = null;
//     org.jfree.chart.axis.AxisSpace var19 = var1.reserveSpace(var7, var8, var9, var16, var18);
// 
//   }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     var0.clearCategoryLabelToolTips();
//     int var7 = var0.getMaximumCategoryLabelLines();
//     java.lang.String var9 = var0.getCategoryLabelToolTip((java.lang.Comparable)0.05d);
//     java.awt.Graphics2D var10 = null;
//     org.jfree.chart.axis.AxisState var11 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var14 = null;
//     var13.notifyListeners(var14);
//     org.jfree.chart.axis.AxisLocation var17 = null;
//     var13.setRangeAxisLocation(100, var17);
//     org.jfree.chart.util.RectangleEdge var19 = var13.getDomainAxisEdge();
//     java.util.List var20 = var0.refreshTicks(var10, var11, var12, var19);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var12 = var8.getPlot();
    var8.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
    org.jfree.chart.util.RectangleInsets var15 = var8.getLabelInsets();
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.awt.geom.Rectangle2D var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var18 = var15.createOutsetRectangle(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var10 = null;
    boolean var11 = var9.hasListener(var10);
    var9.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var15 = var9.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var18 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var19 = var18.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var20 = null;
    var18.removeChangeListener(var20);
    java.awt.Stroke var22 = var18.getStroke();
    int var23 = var15.compareTo((java.lang.Object)var22);
    var1.setTickUnit(var15);
    org.jfree.data.Range var27 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var28 = var27.getLowerBound();
    double var30 = var27.constrain((-1.0d));
    org.jfree.chart.plot.ValueMarker var32 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var32.setValue(8.0d);
    org.jfree.chart.axis.NumberAxis var36 = new org.jfree.chart.axis.NumberAxis("");
    boolean var37 = var36.getAutoRangeStickyZero();
    double var38 = var36.getUpperMargin();
    java.awt.Shape var39 = var36.getUpArrow();
    var36.setTickMarkInsideLength(0.0f);
    boolean var42 = var36.isTickMarksVisible();
    org.jfree.chart.plot.Plot var43 = null;
    var36.setPlot(var43);
    boolean var46 = var36.equals((java.lang.Object)100.0f);
    org.jfree.data.Range var49 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var51 = org.jfree.data.Range.shift(var49, (-1.0d));
    var36.setRangeWithMargins(var51);
    boolean var53 = var32.equals((java.lang.Object)var51);
    org.jfree.data.Range var54 = org.jfree.data.Range.combine(var27, var51);
    var1.setRangeWithMargins(var51, false, false);
    boolean var60 = var51.intersects(8.0d, (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    boolean var2 = var0.isSubplot();
    org.jfree.chart.axis.ValueAxis var4 = var0.getRangeAxisForDataset((-1));
    org.jfree.chart.axis.CategoryAxis var6 = var0.getDomainAxis(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("RangeType.FULL");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.ChartEntity var2 = new org.jfree.chart.entity.ChartEntity(var0, "ChartChangeEventType.GENERAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
//     org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var10 = var9.getAutoRangeStickyZero();
//     double var11 = var9.getUpperMargin();
//     java.awt.Shape var12 = var9.getUpArrow();
//     var9.setTickMarkInsideLength(0.0f);
//     boolean var15 = var9.isTickMarksVisible();
//     java.awt.Graphics2D var16 = null;
//     org.jfree.chart.axis.AxisState var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.util.RectangleEdge var19 = null;
//     java.util.List var20 = var9.refreshTicks(var16, var17, var18, var19);
//     org.jfree.chart.axis.MarkerAxisBand var21 = null;
//     var9.setMarkerBand(var21);
//     boolean var23 = var7.equals((java.lang.Object)var9);
//     org.jfree.chart.axis.AxisLocation var24 = var7.getOpposite();
//     org.jfree.chart.plot.CategoryPlot var25 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var26 = null;
//     var25.notifyListeners(var26);
//     org.jfree.chart.plot.PlotOrientation var28 = var25.getOrientation();
//     java.lang.String var29 = var28.toString();
//     org.jfree.chart.util.RectangleEdge var30 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var7, var28);
//     
//     // Checks the contract:  equals-hashcode on var0 and var25
//     assertTrue("Contract failed: equals-hashcode on var0 and var25", var0.equals(var25) ? var0.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var0
//     assertTrue("Contract failed: equals-hashcode on var25 and var0", var25.equals(var0) ? var25.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
//     org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var10 = var9.getAutoRangeStickyZero();
//     double var11 = var9.getUpperMargin();
//     java.awt.Shape var12 = var9.getUpArrow();
//     var9.setTickMarkInsideLength(0.0f);
//     boolean var15 = var9.isTickMarksVisible();
//     java.awt.Graphics2D var16 = null;
//     org.jfree.chart.axis.AxisState var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.util.RectangleEdge var19 = null;
//     java.util.List var20 = var9.refreshTicks(var16, var17, var18, var19);
//     org.jfree.chart.axis.MarkerAxisBand var21 = null;
//     var9.setMarkerBand(var21);
//     boolean var23 = var7.equals((java.lang.Object)var9);
//     org.jfree.chart.axis.AxisLocation var24 = var7.getOpposite();
//     org.jfree.chart.plot.CategoryPlot var25 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var26 = null;
//     var25.notifyListeners(var26);
//     org.jfree.chart.plot.PlotOrientation var28 = var25.getOrientation();
//     org.jfree.chart.util.RectangleEdge var29 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var24, var28);
//     
//     // Checks the contract:  equals-hashcode on var0 and var25
//     assertTrue("Contract failed: equals-hashcode on var0 and var25", var0.equals(var25) ? var0.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var0
//     assertTrue("Contract failed: equals-hashcode on var25 and var0", var25.equals(var0) ? var25.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var1 = java.awt.Color.decode("Category Plot");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     var1.setTickMarkOutsideLength(10.0f);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var12 = null;
//     var11.notifyListeners(var12);
//     org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
//     var1.setPlot((org.jfree.chart.plot.Plot)var11);
//     var11.configureRangeAxes();
//     int var17 = var11.getBackgroundImageAlignment();
//     org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var20 = null;
//     boolean var21 = var19.hasListener(var20);
//     double var22 = var19.getFixedDimension();
//     java.awt.Font var23 = var19.getTickLabelFont();
//     org.jfree.data.Range var24 = var11.getDataRange((org.jfree.chart.axis.ValueAxis)var19);
//     var11.zoom(0.2d);
// 
//   }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var9 = var4.getBottom();
    double var10 = var4.getTop();
    double var12 = var4.extendWidth(0.0d);
    double var14 = var4.calculateBottomOutset(0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.awt.Paint[] var0 = org.jfree.chart.ChartColor.createDefaultPaintArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.PlotOrientation var3 = var0.getOrientation();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var6 = var5.getAutoRangeStickyZero();
//     double var7 = var5.getUpperMargin();
//     java.awt.Shape var8 = var5.getUpArrow();
//     var5.setTickMarkInsideLength(0.0f);
//     boolean var11 = var5.isTickMarksVisible();
//     java.awt.Shape var12 = var5.getRightArrow();
//     var5.setTickMarkOutsideLength(10.0f);
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var16 = null;
//     var15.notifyListeners(var16);
//     org.jfree.chart.util.RectangleEdge var18 = var15.getDomainAxisEdge();
//     var5.setPlot((org.jfree.chart.plot.Plot)var15);
//     var15.configureRangeAxes();
//     int var21 = var15.getBackgroundImageAlignment();
//     org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var24 = null;
//     boolean var25 = var23.hasListener(var24);
//     double var26 = var23.getFixedDimension();
//     java.awt.Font var27 = var23.getTickLabelFont();
//     org.jfree.data.Range var28 = var15.getDataRange((org.jfree.chart.axis.ValueAxis)var23);
//     boolean var29 = var3.equals((java.lang.Object)var23);
//     
//     // Checks the contract:  equals-hashcode on var0 and var15
//     assertTrue("Contract failed: equals-hashcode on var0 and var15", var0.equals(var15) ? var0.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var0
//     assertTrue("Contract failed: equals-hashcode on var15 and var0", var15.equals(var0) ? var15.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     var0.setLowerMargin(4.0d);
//     var0.clearCategoryLabelToolTips();
//     var0.setVisible(false);
//     org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
//     var8.setRangeAboutValue(0.0d, 10.0d);
//     org.jfree.chart.util.RectangleInsets var12 = var8.getTickLabelInsets();
//     var8.setInverted(false);
//     org.jfree.data.Range var15 = var8.getDefaultAutoRange();
//     boolean var16 = var8.isTickMarksVisible();
//     org.jfree.chart.axis.NumberAxis var18 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var19 = var18.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var20 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var23 = var22.getAutoRangeStickyZero();
//     double var24 = var22.getUpperMargin();
//     java.awt.Shape var25 = var22.getUpArrow();
//     var22.setTickMarkInsideLength(0.0f);
//     boolean var28 = var22.isTickMarksVisible();
//     java.awt.Shape var29 = var22.getRightArrow();
//     java.awt.Stroke var30 = var22.getTickMarkStroke();
//     boolean var31 = var20.equals((java.lang.Object)var30);
//     var18.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var20);
//     org.jfree.chart.axis.NumberAxis var34 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var35 = null;
//     boolean var36 = var34.hasListener(var35);
//     var34.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var40 = var34.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var43 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var44 = var43.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var45 = null;
//     var43.removeChangeListener(var45);
//     java.awt.Stroke var47 = var43.getStroke();
//     int var48 = var40.compareTo((java.lang.Object)var47);
//     var20.add((org.jfree.chart.axis.TickUnit)var40);
//     var8.setTickUnit(var40, true, false);
//     org.jfree.data.category.CategoryDataset var53 = null;
//     java.awt.geom.Rectangle2D var55 = null;
//     org.jfree.chart.plot.CategoryPlot var56 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var57 = null;
//     var56.notifyListeners(var57);
//     org.jfree.chart.axis.AxisLocation var60 = null;
//     var56.setRangeAxisLocation(100, var60);
//     org.jfree.chart.util.RectangleEdge var62 = var56.getDomainAxisEdge();
//     double var63 = var0.getCategorySeriesMiddle((java.lang.Comparable)10.0d, (java.lang.Comparable)false, var53, 0.0d, var55, var62);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
//     java.lang.Object var9 = var3.clone();
//     java.util.List var10 = var0.getCategoriesForAxis(var3);
//     java.awt.Graphics2D var11 = null;
//     org.jfree.chart.axis.CategoryAxis var12 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var15 = null;
//     org.jfree.chart.util.RectangleEdge var16 = null;
//     double var17 = var12.getCategoryMiddle(1, 0, var15, var16);
//     double var18 = var12.getUpperMargin();
//     org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
//     var12.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var19);
//     java.awt.geom.Rectangle2D var21 = null;
//     org.jfree.chart.plot.CategoryPlot var22 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var23 = null;
//     var22.notifyListeners(var23);
//     org.jfree.chart.util.RectangleEdge var25 = var22.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var26 = null;
//     org.jfree.chart.axis.AxisSpace var27 = var3.reserveSpace(var11, (org.jfree.chart.plot.Plot)var19, var21, var25, var26);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    java.awt.Color var10 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var11 = null;
    java.awt.Rectangle var12 = null;
    java.awt.geom.Rectangle2D var13 = null;
    java.awt.geom.AffineTransform var14 = null;
    java.awt.RenderingHints var15 = null;
    java.awt.PaintContext var16 = var10.createContext(var11, var12, var13, var14, var15);
    float[] var17 = null;
    float[] var18 = var10.getComponents(var17);
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    float[] var29 = null;
    float[] var30 = var22.getComponents(var29);
    java.awt.Color var34 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var35 = null;
    java.awt.Rectangle var36 = null;
    java.awt.geom.Rectangle2D var37 = null;
    java.awt.geom.AffineTransform var38 = null;
    java.awt.RenderingHints var39 = null;
    java.awt.PaintContext var40 = var34.createContext(var35, var36, var37, var38, var39);
    float[] var44 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var45 = var34.getColorComponents(var44);
    java.awt.color.ColorSpace var46 = var34.getColorSpace();
    java.awt.Color var50 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var51 = null;
    java.awt.Rectangle var52 = null;
    java.awt.geom.Rectangle2D var53 = null;
    java.awt.geom.AffineTransform var54 = null;
    java.awt.RenderingHints var55 = null;
    java.awt.PaintContext var56 = var50.createContext(var51, var52, var53, var54, var55);
    float[] var60 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var61 = var50.getColorComponents(var60);
    float[] var62 = var22.getColorComponents(var46, var61);
    float[] var63 = var10.getColorComponents(var62);
    var0.setRangeGridlinePaint((java.awt.Paint)var10);
    var0.setRangeCrosshairValue(10.0d, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    var1.setFixedDimension(0.0d);
    boolean var8 = var1.isPositiveArrowVisible();
    float var9 = var1.getTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0f);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.jfree.chart.util.RectangleAnchor var0 = null;
    org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var6 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var7 = new org.jfree.chart.axis.CategoryLabelPositions(var3, var4, var5, var6);
    org.jfree.chart.axis.CategoryLabelWidthType var8 = var3.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var9 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var2, var3);
    double var10 = var3.getAngle();
    org.jfree.chart.text.TextBlockAnchor var11 = var3.getLabelAnchor();
    org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var13 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var14 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var15 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var16 = new org.jfree.chart.axis.CategoryLabelPositions(var12, var13, var14, var15);
    org.jfree.chart.axis.CategoryLabelWidthType var17 = var12.getWidthType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var19 = new org.jfree.chart.axis.CategoryLabelPosition(var0, var11, var17, 100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test207() {}
//   public void test207() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
//     java.lang.Object var9 = var3.clone();
//     java.util.List var10 = var0.getCategoriesForAxis(var3);
//     java.awt.Graphics2D var11 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     var15.clearRangeAxes();
//     boolean var17 = var15.isSubplot();
//     var15.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var21 = var15.getRangeAxisEdge(1);
//     org.jfree.chart.plot.PlotRenderingInfo var22 = null;
//     org.jfree.chart.axis.AxisState var23 = var3.draw(var11, 0.05d, var13, var14, var21, var22);
// 
//   }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    int var3 = java.awt.Color.HSBtoRGB((-1.0f), (-1.0f), 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-3303016));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var3 = var2.getLowerBound();
    double var4 = var2.getLowerBound();
    boolean var7 = var2.intersects((-1.0d), 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    int var6 = var0.getDomainAxisCount();
    org.jfree.chart.renderer.category.CategoryItemRenderer var8 = null;
    var0.setRenderer(10, var8);
    var0.setOutlineVisible(true);
    org.jfree.chart.util.RectangleInsets var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInsets(var12, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit((-46.0d), var1);
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
//     org.jfree.data.Range var0 = null;
//     org.jfree.data.Range var3 = org.jfree.data.Range.shift(var0, 0.0d, true);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var2 = new org.jfree.data.Range(Double.POSITIVE_INFINITY, (-46.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.ValueAxis var7 = var0.getRangeAxisForDataset((-254));
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     var8.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var10 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var11 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var10};
//     var8.setRenderers(var11);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var14 = var8.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var17 = var16.getAutoRangeStickyZero();
//     var16.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var21 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var22 = var21.getAutoRangeStickyZero();
//     double var23 = var21.getUpperMargin();
//     java.awt.Shape var24 = var21.getUpArrow();
//     var21.setTickMarkInsideLength(0.0f);
//     boolean var27 = var21.isTickMarksVisible();
//     java.awt.Shape var28 = var21.getRightArrow();
//     var16.setLeftArrow(var28);
//     java.awt.Stroke var30 = var16.getAxisLineStroke();
//     var16.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var33 = var8.getDataRange((org.jfree.chart.axis.ValueAxis)var16);
//     org.jfree.chart.util.SortOrder var34 = var8.getColumnRenderingOrder();
//     java.awt.Image var35 = var8.getBackgroundImage();
//     var0.setParent((org.jfree.chart.plot.Plot)var8);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     java.awt.Color var4 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     int var5 = var4.getTransparency();
//     org.jfree.chart.plot.CategoryPlot var6 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var7 = null;
//     var6.notifyListeners(var7);
//     org.jfree.chart.plot.DatasetRenderingOrder var9 = var6.getDatasetRenderingOrder();
//     org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
//     double var12 = var11.getLabelAngle();
//     java.awt.Stroke var13 = var11.getAxisLineStroke();
//     var6.setDomainGridlineStroke(var13);
//     org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var18 = var17.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var19 = null;
//     var17.removeChangeListener(var19);
//     org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var23 = var22.getLabelPaint();
//     var17.setOutlinePaint(var23);
//     java.awt.Paint var25 = var17.getLabelPaint();
//     org.jfree.chart.plot.CategoryPlot var26 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var27 = null;
//     var26.notifyListeners(var27);
//     org.jfree.chart.axis.CategoryAxis var30 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Paint var32 = var30.getTickLabelPaint((java.lang.Comparable)(-1.0f));
//     java.awt.Paint[] var33 = new java.awt.Paint[] { var32};
//     org.jfree.chart.plot.IntervalMarker var36 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var37 = var36.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var38 = null;
//     var36.removeChangeListener(var38);
//     org.jfree.chart.axis.NumberAxis var41 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var42 = var41.getLabelPaint();
//     var36.setOutlinePaint(var42);
//     java.awt.Paint[] var44 = new java.awt.Paint[] { var42};
//     java.awt.Color var48 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var49 = null;
//     java.awt.Rectangle var50 = null;
//     java.awt.geom.Rectangle2D var51 = null;
//     java.awt.geom.AffineTransform var52 = null;
//     java.awt.RenderingHints var53 = null;
//     java.awt.PaintContext var54 = var48.createContext(var49, var50, var51, var52, var53);
//     int var55 = var48.getRed();
//     java.lang.String var56 = var48.toString();
//     java.awt.Paint[] var57 = new java.awt.Paint[] { var48};
//     org.jfree.chart.axis.NumberAxis var59 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var60 = var59.getAutoRangeStickyZero();
//     double var61 = var59.getUpperMargin();
//     java.awt.Shape var62 = var59.getUpArrow();
//     var59.setTickMarkInsideLength(0.0f);
//     boolean var65 = var59.isTickMarksVisible();
//     java.awt.Shape var66 = var59.getRightArrow();
//     java.awt.Stroke var67 = var59.getTickMarkStroke();
//     java.awt.Stroke[] var68 = new java.awt.Stroke[] { var67};
//     org.jfree.chart.axis.NumberAxis var70 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var71 = var70.getAutoRangeStickyZero();
//     var70.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var75 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var76 = var75.getAutoRangeStickyZero();
//     double var77 = var75.getUpperMargin();
//     java.awt.Shape var78 = var75.getUpArrow();
//     var75.setTickMarkInsideLength(0.0f);
//     boolean var81 = var75.isTickMarksVisible();
//     java.awt.Shape var82 = var75.getRightArrow();
//     var70.setLeftArrow(var82);
//     java.awt.Stroke var84 = var70.getAxisLineStroke();
//     java.awt.Stroke[] var85 = new java.awt.Stroke[] { var84};
//     java.awt.Shape[] var86 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
//     org.jfree.chart.plot.DefaultDrawingSupplier var87 = new org.jfree.chart.plot.DefaultDrawingSupplier(var33, var44, var57, var68, var85, var86);
//     java.lang.Object var88 = var87.clone();
//     java.awt.Paint var89 = var87.getNextOutlinePaint();
//     var26.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var87);
//     double var91 = var26.getAnchorValue();
//     java.awt.Stroke var92 = var26.getRangeGridlineStroke();
//     org.jfree.chart.plot.ValueMarker var94 = new org.jfree.chart.plot.ValueMarker(0.05d, (java.awt.Paint)var4, var13, var25, var92, 0.0f);
//     
//     // Checks the contract:  equals-hashcode on var17 and var36
//     assertTrue("Contract failed: equals-hashcode on var17 and var36", var17.equals(var36) ? var17.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var17
//     assertTrue("Contract failed: equals-hashcode on var36 and var17", var36.equals(var17) ? var36.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    int var6 = var0.getDomainAxisCount();
    org.jfree.chart.event.PlotChangeEvent var7 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var0);
    double var8 = var0.getAnchorValue();
    int var9 = var0.getBackgroundImageAlignment();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 15);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var4 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var6 = var4.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var7 = new java.awt.Paint[] { var6};
    org.jfree.chart.plot.IntervalMarker var10 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var11 = var10.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var12 = null;
    var10.removeChangeListener(var12);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var16 = var15.getLabelPaint();
    var10.setOutlinePaint(var16);
    java.awt.Paint[] var18 = new java.awt.Paint[] { var16};
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    int var29 = var22.getRed();
    java.lang.String var30 = var22.toString();
    java.awt.Paint[] var31 = new java.awt.Paint[] { var22};
    org.jfree.chart.axis.NumberAxis var33 = new org.jfree.chart.axis.NumberAxis("");
    boolean var34 = var33.getAutoRangeStickyZero();
    double var35 = var33.getUpperMargin();
    java.awt.Shape var36 = var33.getUpArrow();
    var33.setTickMarkInsideLength(0.0f);
    boolean var39 = var33.isTickMarksVisible();
    java.awt.Shape var40 = var33.getRightArrow();
    java.awt.Stroke var41 = var33.getTickMarkStroke();
    java.awt.Stroke[] var42 = new java.awt.Stroke[] { var41};
    org.jfree.chart.axis.NumberAxis var44 = new org.jfree.chart.axis.NumberAxis("");
    boolean var45 = var44.getAutoRangeStickyZero();
    var44.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var49 = new org.jfree.chart.axis.NumberAxis("");
    boolean var50 = var49.getAutoRangeStickyZero();
    double var51 = var49.getUpperMargin();
    java.awt.Shape var52 = var49.getUpArrow();
    var49.setTickMarkInsideLength(0.0f);
    boolean var55 = var49.isTickMarksVisible();
    java.awt.Shape var56 = var49.getRightArrow();
    var44.setLeftArrow(var56);
    java.awt.Stroke var58 = var44.getAxisLineStroke();
    java.awt.Stroke[] var59 = new java.awt.Stroke[] { var58};
    java.awt.Shape[] var60 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var61 = new org.jfree.chart.plot.DefaultDrawingSupplier(var7, var18, var31, var42, var59, var60);
    java.lang.Object var62 = var61.clone();
    java.awt.Paint var63 = var61.getNextOutlinePaint();
    var0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var61);
    org.jfree.chart.axis.NumberAxis var66 = new org.jfree.chart.axis.NumberAxis("");
    boolean var67 = var66.getAutoRangeStickyZero();
    var66.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var70 = var66.getPlot();
    int var71 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var66);
    boolean var72 = var66.isInverted();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var30.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var13 = var0.getCeilingTickUnit((-1.0d));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.ObjectList var1 = new org.jfree.chart.util.ObjectList((-254));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setRangeCrosshairLockedOnData(true);
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var11.setValue(8.0d);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    boolean var16 = var15.getAutoRangeStickyZero();
    double var17 = var15.getUpperMargin();
    java.awt.Shape var18 = var15.getUpArrow();
    var15.setTickMarkInsideLength(0.0f);
    boolean var21 = var15.isTickMarksVisible();
    org.jfree.chart.plot.Plot var22 = null;
    var15.setPlot(var22);
    boolean var25 = var15.equals((java.lang.Object)100.0f);
    org.jfree.data.Range var28 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var30 = org.jfree.data.Range.shift(var28, (-1.0d));
    var15.setRangeWithMargins(var30);
    boolean var32 = var11.equals((java.lang.Object)var30);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var11);
    org.jfree.chart.plot.IntervalMarker var36 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.RectangleInsets var41 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    var36.setLabelOffset(var41);
    var0.setInsets(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var6 = var0.getDomainAxisLocation();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.plot.PlotOrientation var10 = var7.getOrientation();
//     java.lang.Object var11 = null;
//     boolean var12 = var10.equals(var11);
//     org.jfree.chart.util.RectangleEdge var13 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var6, var10);
//     
//     // Checks the contract:  equals-hashcode on var0 and var7
//     assertTrue("Contract failed: equals-hashcode on var0 and var7", var0.equals(var7) ? var0.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var0
//     assertTrue("Contract failed: equals-hashcode on var7 and var0", var7.equals(var0) ? var7.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.plot.CategoryPlot var6 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var7 = null;
//     var6.notifyListeners(var7);
//     org.jfree.chart.axis.AxisLocation var10 = null;
//     var6.setRangeAxisLocation(100, var10);
//     java.awt.Graphics2D var12 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var15 = null;
//     boolean var16 = var6.render(var12, var13, (-1), var15);
//     org.jfree.chart.util.SortOrder var17 = var6.getColumnRenderingOrder();
//     var0.setRowRenderingOrder(var17);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var0
//     assertTrue("Contract failed: equals-hashcode on var6 and var0", var6.equals(var0) ? var6.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.plot.Plot var8 = null;
    var1.setPlot(var8);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var20 = null;
    boolean var21 = var19.hasListener(var20);
    var19.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var25 = var19.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var28 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var29 = var28.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var30 = null;
    var28.removeChangeListener(var30);
    java.awt.Stroke var32 = var28.getStroke();
    int var33 = var25.compareTo((java.lang.Object)var32);
    var11.setTickUnit(var25);
    var1.setTickUnit(var25);
    org.jfree.chart.axis.CategoryAxis var37 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var39 = var37.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var40 = new java.awt.Paint[] { var39};
    org.jfree.chart.plot.IntervalMarker var43 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var44 = var43.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var45 = null;
    var43.removeChangeListener(var45);
    org.jfree.chart.axis.NumberAxis var48 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var49 = var48.getLabelPaint();
    var43.setOutlinePaint(var49);
    java.awt.Paint[] var51 = new java.awt.Paint[] { var49};
    java.awt.Color var55 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var56 = null;
    java.awt.Rectangle var57 = null;
    java.awt.geom.Rectangle2D var58 = null;
    java.awt.geom.AffineTransform var59 = null;
    java.awt.RenderingHints var60 = null;
    java.awt.PaintContext var61 = var55.createContext(var56, var57, var58, var59, var60);
    int var62 = var55.getRed();
    java.lang.String var63 = var55.toString();
    java.awt.Paint[] var64 = new java.awt.Paint[] { var55};
    org.jfree.chart.axis.NumberAxis var66 = new org.jfree.chart.axis.NumberAxis("");
    boolean var67 = var66.getAutoRangeStickyZero();
    double var68 = var66.getUpperMargin();
    java.awt.Shape var69 = var66.getUpArrow();
    var66.setTickMarkInsideLength(0.0f);
    boolean var72 = var66.isTickMarksVisible();
    java.awt.Shape var73 = var66.getRightArrow();
    java.awt.Stroke var74 = var66.getTickMarkStroke();
    java.awt.Stroke[] var75 = new java.awt.Stroke[] { var74};
    org.jfree.chart.axis.NumberAxis var77 = new org.jfree.chart.axis.NumberAxis("");
    boolean var78 = var77.getAutoRangeStickyZero();
    var77.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var82 = new org.jfree.chart.axis.NumberAxis("");
    boolean var83 = var82.getAutoRangeStickyZero();
    double var84 = var82.getUpperMargin();
    java.awt.Shape var85 = var82.getUpArrow();
    var82.setTickMarkInsideLength(0.0f);
    boolean var88 = var82.isTickMarksVisible();
    java.awt.Shape var89 = var82.getRightArrow();
    var77.setLeftArrow(var89);
    java.awt.Stroke var91 = var77.getAxisLineStroke();
    java.awt.Stroke[] var92 = new java.awt.Stroke[] { var91};
    java.awt.Shape[] var93 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var94 = new org.jfree.chart.plot.DefaultDrawingSupplier(var40, var51, var64, var75, var92, var93);
    java.lang.Object var95 = var94.clone();
    java.awt.Paint var96 = var94.getNextOutlinePaint();
    int var97 = var25.compareTo((java.lang.Object)var96);
    java.lang.String var99 = var25.valueToString(0.2d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var63.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "0"+ "'", var99.equals("0"));

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.util.RectangleEdge var6 = var0.getDomainAxisEdge();
//     org.jfree.chart.plot.DatasetRenderingOrder var7 = var0.getDatasetRenderingOrder();
//     java.awt.Paint var8 = var0.getRangeCrosshairPaint();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var10 = null;
//     var0.setRenderer(100, var10);
//     org.jfree.chart.plot.PlotRenderingInfo var14 = null;
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     var15.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var17 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var18 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var17};
//     var15.setRenderers(var18);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var21 = var15.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var24 = var23.getAutoRangeStickyZero();
//     var23.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var28 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var29 = var28.getAutoRangeStickyZero();
//     double var30 = var28.getUpperMargin();
//     java.awt.Shape var31 = var28.getUpArrow();
//     var28.setTickMarkInsideLength(0.0f);
//     boolean var34 = var28.isTickMarksVisible();
//     java.awt.Shape var35 = var28.getRightArrow();
//     var23.setLeftArrow(var35);
//     java.awt.Stroke var37 = var23.getAxisLineStroke();
//     var23.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var40 = var15.getDataRange((org.jfree.chart.axis.ValueAxis)var23);
//     boolean var41 = var15.getDrawSharedDomainAxis();
//     org.jfree.chart.plot.PlotRenderingInfo var44 = null;
//     java.awt.geom.Rectangle2D var45 = null;
//     org.jfree.chart.util.RectangleAnchor var46 = null;
//     java.awt.geom.Point2D var47 = org.jfree.chart.util.RectangleAnchor.coordinates(var45, var46);
//     var15.zoomDomainAxes(2.0d, (-46.0d), var44, var47);
//     var0.zoomDomainAxes(0.0d, (-46.0d), var14, var47);
//     
//     // Checks the contract:  equals-hashcode on var0 and var15
//     assertTrue("Contract failed: equals-hashcode on var0 and var15", var0.equals(var15) ? var0.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var0
//     assertTrue("Contract failed: equals-hashcode on var15 and var0", var15.equals(var0) ? var15.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    boolean var11 = var0.render(var7, var8, (-1), var10);
    boolean var12 = var0.isRangeCrosshairVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     var1.setRangeAboutValue(0.0d, 10.0d);
//     boolean var5 = var1.isPositiveArrowVisible();
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.axis.AxisState var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     var9.clearRangeAxes();
//     boolean var11 = var9.isSubplot();
//     var9.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var15 = var9.getRangeAxisEdge(1);
//     java.util.List var16 = var1.refreshTicks(var6, var7, var8, var15);
// 
//   }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker((-45.0d), (-47.0d));
    float var3 = var2.getAlpha();
    java.awt.Paint var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setLabelPaint(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setVerticalTickLabels(false);
    java.awt.geom.Rectangle2D var5 = null;
    org.jfree.chart.util.RectangleEdge var6 = null;
    double var7 = var1.valueToJava2D(0.0d, var5, var6);
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    boolean var10 = var9.getAutoRangeStickyZero();
    double var11 = var9.getUpperMargin();
    java.awt.Shape var12 = var9.getUpArrow();
    var9.setTickMarkInsideLength(0.0f);
    boolean var15 = var9.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var18 = null;
    boolean var19 = var17.hasListener(var18);
    var17.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var23 = var17.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var27 = var26.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var28 = null;
    var26.removeChangeListener(var28);
    java.awt.Stroke var30 = var26.getStroke();
    int var31 = var23.compareTo((java.lang.Object)var30);
    var9.setTickUnit(var23);
    var1.setTickUnit(var23);
    boolean var34 = var1.getAutoRangeIncludesZero();
    org.jfree.chart.plot.CategoryPlot var35 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var36 = null;
    var35.notifyListeners(var36);
    java.awt.Color var41 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var42 = null;
    java.awt.Rectangle var43 = null;
    java.awt.geom.Rectangle2D var44 = null;
    java.awt.geom.AffineTransform var45 = null;
    java.awt.RenderingHints var46 = null;
    java.awt.PaintContext var47 = var41.createContext(var42, var43, var44, var45, var46);
    float[] var48 = null;
    float[] var49 = var41.getComponents(var48);
    var35.setNoDataMessagePaint((java.awt.Paint)var41);
    org.jfree.chart.renderer.category.CategoryItemRenderer var52 = null;
    var35.setRenderer(100, var52);
    boolean var54 = var1.equals((java.lang.Object)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var2 = null;
//     boolean var3 = var1.hasListener(var2);
//     double var4 = var1.getFixedDimension();
//     var1.setTickMarksVisible(false);
//     var1.setLabelURL("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
//     org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var11 = var10.getAutoRangeStickyZero();
//     double var12 = var10.getUpperMargin();
//     java.awt.Shape var13 = var10.getUpArrow();
//     var10.setTickMarkInsideLength(0.0f);
//     boolean var16 = var10.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var21 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var23 = var21.trimWidth(0.0d);
//     double var25 = var21.calculateRightOutset(0.0d);
//     double var26 = var21.getBottom();
//     var10.setTickLabelInsets(var21);
//     double var28 = var21.getTop();
//     var1.setLabelInsets(var21);
//     java.awt.geom.Rectangle2D var31 = null;
//     org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var33 = null;
//     var32.notifyListeners(var33);
//     org.jfree.chart.util.RectangleEdge var35 = var32.getDomainAxisEdge();
//     double var36 = var1.valueToJava2D(0.2d, var31, var35);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.data.Range var7 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var8 = var7.getLowerBound();
    double var9 = var7.getLowerBound();
    var1.setDefaultAutoRange(var7);
    float var11 = var1.getTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0f);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(0.0d);
    double var12 = var4.calculateRightOutset((-100.0d));
    double var13 = var4.getRight();
    java.awt.geom.Rectangle2D var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var15 = var4.createInsetRectangle(var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(1.0f, 0.0f, 100.0f);
    int var4 = var3.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 255);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     org.jfree.chart.util.ObjectList var0 = new org.jfree.chart.util.ObjectList();
//     var0.set(255, (java.lang.Object)(-1.0d));
//     var0.clear();
//     org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var7 = var6.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var8 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var11 = var10.getAutoRangeStickyZero();
//     double var12 = var10.getUpperMargin();
//     java.awt.Shape var13 = var10.getUpArrow();
//     var10.setTickMarkInsideLength(0.0f);
//     boolean var16 = var10.isTickMarksVisible();
//     java.awt.Shape var17 = var10.getRightArrow();
//     java.awt.Stroke var18 = var10.getTickMarkStroke();
//     boolean var19 = var8.equals((java.lang.Object)var18);
//     var6.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var8);
//     org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var23 = null;
//     boolean var24 = var22.hasListener(var23);
//     var22.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var28 = var22.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var31 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var32 = var31.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var33 = null;
//     var31.removeChangeListener(var33);
//     java.awt.Stroke var35 = var31.getStroke();
//     int var36 = var28.compareTo((java.lang.Object)var35);
//     var8.add((org.jfree.chart.axis.TickUnit)var28);
//     int var38 = var0.indexOf((java.lang.Object)var8);
//     org.jfree.chart.axis.NumberAxis var40 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var41 = var40.getAutoRangeStickyZero();
//     double var42 = var40.getUpperMargin();
//     var40.setPositiveArrowVisible(true);
//     var40.setFixedDimension(0.0d);
//     boolean var47 = var40.isPositiveArrowVisible();
//     org.jfree.chart.axis.NumberAxis var49 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var50 = var49.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var51 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var53 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var54 = var53.getAutoRangeStickyZero();
//     double var55 = var53.getUpperMargin();
//     java.awt.Shape var56 = var53.getUpArrow();
//     var53.setTickMarkInsideLength(0.0f);
//     boolean var59 = var53.isTickMarksVisible();
//     java.awt.Shape var60 = var53.getRightArrow();
//     java.awt.Stroke var61 = var53.getTickMarkStroke();
//     boolean var62 = var51.equals((java.lang.Object)var61);
//     var49.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var51);
//     org.jfree.chart.axis.NumberAxis var65 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var66 = null;
//     boolean var67 = var65.hasListener(var66);
//     var65.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var71 = var65.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var74 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var75 = var74.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var76 = null;
//     var74.removeChangeListener(var76);
//     java.awt.Stroke var78 = var74.getStroke();
//     int var79 = var71.compareTo((java.lang.Object)var78);
//     var51.add((org.jfree.chart.axis.TickUnit)var71);
//     var40.setTickUnit(var71, false, true);
//     var8.add((org.jfree.chart.axis.TickUnit)var71);
//     
//     // Checks the contract:  equals-hashcode on var31 and var74
//     assertTrue("Contract failed: equals-hashcode on var31 and var74", var31.equals(var74) ? var31.hashCode() == var74.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var74 and var31
//     assertTrue("Contract failed: equals-hashcode on var74 and var31", var74.equals(var31) ? var74.hashCode() == var31.hashCode() : true);
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    double var6 = var5.getLabelAngle();
    java.awt.Stroke var7 = var5.getAxisLineStroke();
    var0.setDomainGridlineStroke(var7);
    org.jfree.chart.axis.CategoryAxis var11 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var13 = var11.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    var0.setDomainAxis(100, var11);
    java.util.List var15 = var0.getAnnotations();
    org.jfree.chart.axis.NumberAxis var18 = new org.jfree.chart.axis.NumberAxis("");
    var18.setVerticalTickLabels(false);
    double var21 = var18.getUpperMargin();
    var0.setRangeAxis(0, (org.jfree.chart.axis.ValueAxis)var18, true);
    org.jfree.chart.axis.AxisLocation var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation(var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.05d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    int var6 = var0.getDomainAxisCount();
    org.jfree.chart.plot.Plot var7 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var7 = var1.getTickUnit();
    org.jfree.data.Range var10 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.chart.JFreeChart var11 = null;
    org.jfree.chart.event.ChartChangeEvent var12 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var10, var11);
    var1.setRangeWithMargins(var10, true, true);
    double var17 = var10.constrain(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 8.0d);

  }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var6 = var5.getAutoRangeStickyZero();
//     var5.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var9 = var5.getPlot();
//     boolean var10 = var5.isTickLabelsVisible();
//     java.lang.String var11 = var5.getLabel();
//     boolean var12 = var3.equals((java.lang.Object)var5);
//     var5.setLabelAngle(0.2d);
//     org.jfree.data.Range var17 = new org.jfree.data.Range((-100.0d), 8.0d);
//     double var18 = var17.getLowerBound();
//     double var20 = var17.constrain((-1.0d));
//     org.jfree.chart.plot.ValueMarker var22 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var22.setValue(8.0d);
//     org.jfree.chart.axis.NumberAxis var26 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var27 = var26.getAutoRangeStickyZero();
//     double var28 = var26.getUpperMargin();
//     java.awt.Shape var29 = var26.getUpArrow();
//     var26.setTickMarkInsideLength(0.0f);
//     boolean var32 = var26.isTickMarksVisible();
//     org.jfree.chart.plot.Plot var33 = null;
//     var26.setPlot(var33);
//     boolean var36 = var26.equals((java.lang.Object)100.0f);
//     org.jfree.data.Range var39 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.data.Range var41 = org.jfree.data.Range.shift(var39, (-1.0d));
//     var26.setRangeWithMargins(var41);
//     boolean var43 = var22.equals((java.lang.Object)var41);
//     org.jfree.data.Range var44 = org.jfree.data.Range.combine(var17, var41);
//     var5.setRangeWithMargins(var44);
//     org.jfree.chart.plot.CategoryPlot var46 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var47 = null;
//     var46.notifyListeners(var47);
//     org.jfree.chart.plot.DatasetRenderingOrder var49 = var46.getDatasetRenderingOrder();
//     int var50 = var46.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var52 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var55 = null;
//     org.jfree.chart.util.RectangleEdge var56 = null;
//     double var57 = var52.getCategoryMiddle(1, 0, var55, var56);
//     double var58 = var52.getUpperMargin();
//     float var59 = var52.getMaximumCategoryLabelWidthRatio();
//     var46.setDomainAxis(2, var52);
//     org.jfree.chart.axis.CategoryLabelPositions var61 = var52.getCategoryLabelPositions();
//     boolean var62 = var44.equals((java.lang.Object)var61);
//     
//     // Checks the contract:  equals-hashcode on var0 and var46
//     assertTrue("Contract failed: equals-hashcode on var0 and var46", var0.equals(var46) ? var0.hashCode() == var46.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var46.", var0.equals(var46) == var46.equals(var0));
// 
//   }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
//     java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
//     org.jfree.chart.axis.ValueAxis var8 = var0.getRangeAxis(1);
//     boolean var9 = var0.isRangeCrosshairVisible();
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.util.RectangleEdge var13 = var10.getDomainAxisEdge();
//     java.lang.String var14 = var10.getPlotType();
//     java.awt.Paint var15 = var10.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var16 = var10.getDomainAxisLocation();
//     var0.setDomainAxisLocation(var16);
//     
//     // Checks the contract:  equals-hashcode on var0 and var10
//     assertTrue("Contract failed: equals-hashcode on var0 and var10", var0.equals(var10) ? var0.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var0
//     assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.jfree.chart.util.ObjectList var1 = new org.jfree.chart.util.ObjectList(0);
    java.lang.Object var2 = var1.clone();
    java.lang.Object var4 = var1.get(255);
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("0");
    java.awt.Shape var8 = var7.getUpArrow();
    org.jfree.chart.util.RectangleInsets var9 = var7.getTickLabelInsets();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.set(15, (java.lang.Object)var9);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     var1.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var7 = var6.getAutoRangeStickyZero();
//     double var8 = var6.getUpperMargin();
//     java.awt.Shape var9 = var6.getUpArrow();
//     var6.setTickMarkInsideLength(0.0f);
//     boolean var12 = var6.isTickMarksVisible();
//     java.awt.Shape var13 = var6.getRightArrow();
//     var1.setLeftArrow(var13);
//     org.jfree.data.RangeType var15 = var1.getRangeType();
//     java.awt.Graphics2D var16 = null;
//     org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
//     var17.clearRangeAxes();
//     boolean var19 = var17.isSubplot();
//     var17.setAnchorValue(Double.POSITIVE_INFINITY);
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var24 = null;
//     var23.notifyListeners(var24);
//     org.jfree.chart.axis.AxisLocation var27 = null;
//     var23.setRangeAxisLocation(100, var27);
//     org.jfree.chart.util.RectangleEdge var29 = var23.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var30 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var29);
//     org.jfree.chart.axis.AxisSpace var31 = null;
//     org.jfree.chart.axis.AxisSpace var32 = var1.reserveSpace(var16, (org.jfree.chart.plot.Plot)var17, var22, var29, var31);
// 
//   }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var1.setValue(8.0d);
//     java.awt.Paint var4 = var1.getLabelPaint();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     java.lang.Class var7 = null;
//     java.util.EventListener[] var8 = var1.getListeners(var7);
// 
//   }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    org.jfree.chart.util.RectangleInsets var7 = var1.getTickLabelInsets();
    var1.setLowerMargin(4.0d);
    var1.setPositiveArrowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     org.jfree.chart.util.RectangleInsets var7 = var1.getTickLabelInsets();
//     var1.setLowerMargin(4.0d);
//     java.lang.String var10 = var1.getLabelToolTip();
//     java.awt.Graphics2D var11 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var16 = null;
//     var15.notifyListeners(var16);
//     org.jfree.chart.axis.AxisLocation var19 = null;
//     var15.setRangeAxisLocation(100, var19);
//     org.jfree.chart.util.RectangleEdge var21 = var15.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var21);
//     org.jfree.chart.plot.PlotRenderingInfo var23 = null;
//     org.jfree.chart.axis.AxisState var24 = var1.draw(var11, 3.0d, var13, var14, var21, var23);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    var1.setAutoRangeIncludesZero(true);
    var1.setLabelURL("hi!");
    java.text.NumberFormat var9 = null;
    var1.setNumberFormatOverride(var9);
    var1.setUpperMargin((-47.0d));
    var1.setUpperMargin(1.0d);
    org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var18 = var17.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var19 = null;
    var17.removeChangeListener(var19);
    org.jfree.chart.util.RectangleInsets var25 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var17.setLabelOffset(var25);
    double var28 = var25.calculateBottomInset(0.0d);
    var1.setLabelInsets(var25);
    java.awt.geom.Rectangle2D var30 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var31 = var25.createInsetRectangle(var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     var0.removeChangeListener((org.jfree.chart.event.AxisChangeListener)var7);
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.plot.DatasetRenderingOrder var12 = var9.getDatasetRenderingOrder();
//     int var13 = var9.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var15 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.util.RectangleEdge var19 = null;
//     double var20 = var15.getCategoryMiddle(1, 0, var18, var19);
//     double var21 = var15.getUpperMargin();
//     float var22 = var15.getMaximumCategoryLabelWidthRatio();
//     var9.setDomainAxis(2, var15);
//     org.jfree.chart.axis.CategoryAnchor var24 = var9.getDomainGridlinePosition();
//     java.awt.geom.Rectangle2D var27 = null;
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var29 = null;
//     var28.notifyListeners(var29);
//     org.jfree.chart.axis.AxisLocation var32 = null;
//     var28.setRangeAxisLocation(100, var32);
//     org.jfree.chart.util.RectangleEdge var34 = var28.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var35 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var34);
//     double var36 = var0.getCategoryJava2DCoordinate(var24, 4, 4, var27, var34);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.ChartColor var3 = new org.jfree.chart.ChartColor((-3303016), (-16777216), 15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var5 = null;
    boolean var6 = var4.hasListener(var5);
    var4.resizeRange(100.0d, 1.0d);
    boolean var10 = var1.equals((java.lang.Object)100.0d);
    boolean var11 = var1.isAutoRange();
    var1.setPositiveArrowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
    java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
    var0.setRangeGridlinesVisible(false);
    org.jfree.chart.annotations.CategoryAnnotation var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(0.0d);
    double var12 = var4.calculateRightOutset((-100.0d));
    org.jfree.chart.util.RectangleInsets var17 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    boolean var18 = var4.equals((java.lang.Object)1.0d);
    double var20 = var4.calculateRightOutset(2.0d);
    java.awt.geom.Rectangle2D var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var24 = var4.createInsetRectangle(var21, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.ValueAxis var7 = var0.getRangeAxisForDataset((-254));
//     var0.setDrawSharedDomainAxis(false);
//     org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var12 = var11.getAutoRangeStickyZero();
//     double var13 = var11.getUpperMargin();
//     java.awt.Shape var14 = var11.getUpArrow();
//     var11.setTickMarkInsideLength(0.0f);
//     boolean var17 = var11.isTickMarksVisible();
//     java.awt.Graphics2D var18 = null;
//     org.jfree.chart.axis.AxisState var19 = null;
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.util.RectangleEdge var21 = null;
//     java.util.List var22 = var11.refreshTicks(var18, var19, var20, var21);
//     java.lang.Object var23 = null;
//     boolean var24 = var11.equals(var23);
//     boolean var25 = var11.isInverted();
//     boolean var26 = var11.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var27 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var28 = null;
//     var27.notifyListeners(var28);
//     org.jfree.chart.plot.DatasetRenderingOrder var30 = var27.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var31 = null;
//     var27.rendererChanged(var31);
//     int var33 = var27.getDomainAxisCount();
//     boolean var34 = var11.hasListener((java.util.EventListener)var27);
//     org.jfree.chart.plot.CategoryPlot var36 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var37 = null;
//     var36.notifyListeners(var37);
//     org.jfree.chart.axis.AxisLocation var40 = null;
//     var36.setRangeAxisLocation(100, var40);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var42 = var36.getRenderer();
//     org.jfree.chart.axis.AxisLocation var43 = var36.getRangeAxisLocation();
//     var27.setRangeAxisLocation(15, var43, true);
//     var0.setRangeAxisLocation(var43, false);
//     
//     // Checks the contract:  equals-hashcode on var0 and var27
//     assertTrue("Contract failed: equals-hashcode on var0 and var27", var0.equals(var27) ? var0.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var0 and var36
//     assertTrue("Contract failed: equals-hashcode on var0 and var36", var0.equals(var36) ? var0.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var0
//     assertTrue("Contract failed: equals-hashcode on var36 and var0", var36.equals(var0) ? var36.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var27.", var0.equals(var27) == var27.equals(var0));
// 
//   }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     var10.clearRangeAxes();
//     boolean var12 = var10.isSubplot();
//     var10.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var16 = var10.getRangeAxisEdge(1);
//     double var17 = var0.getCategoryEnd(15, 15, var9, var16);
// 
//   }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     boolean var2 = var0.isSubplot();
//     var0.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.Layer var5 = null;
//     java.util.Collection var6 = var0.getDomainMarkers(var5);
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.axis.AxisLocation var11 = null;
//     var7.setRangeAxisLocation(100, var11);
//     java.awt.Graphics2D var13 = null;
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var16 = null;
//     boolean var17 = var7.render(var13, var14, (-1), var16);
//     org.jfree.chart.util.SortOrder var18 = var7.getColumnRenderingOrder();
//     java.lang.String var19 = var18.toString();
//     var0.setColumnRenderingOrder(var18);
//     org.jfree.chart.event.PlotChangeListener var21 = null;
//     var0.removeChangeListener(var21);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var24 = null;
//     var0.setRenderer(178, var24);
//     org.jfree.chart.plot.CategoryPlot var26 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var27 = null;
//     var26.notifyListeners(var27);
//     org.jfree.chart.plot.DatasetRenderingOrder var29 = var26.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var30 = null;
//     var26.rendererChanged(var30);
//     int var32 = var26.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var33 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var26);
//     var0.notifyListeners(var33);
//     
//     // Checks the contract:  equals-hashcode on var7 and var26
//     assertTrue("Contract failed: equals-hashcode on var7 and var26", var7.equals(var26) ? var7.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var7
//     assertTrue("Contract failed: equals-hashcode on var26 and var7", var26.equals(var7) ? var26.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var10 = null;
    boolean var11 = var9.hasListener(var10);
    var9.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var15 = var9.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var18 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var19 = var18.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var20 = null;
    var18.removeChangeListener(var20);
    java.awt.Stroke var22 = var18.getStroke();
    int var23 = var15.compareTo((java.lang.Object)var22);
    var1.setTickUnit(var15);
    java.lang.String var26 = var15.valueToString(0.0d);
    java.awt.Color var30 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var31 = null;
    java.awt.Rectangle var32 = null;
    java.awt.geom.Rectangle2D var33 = null;
    java.awt.geom.AffineTransform var34 = null;
    java.awt.RenderingHints var35 = null;
    java.awt.PaintContext var36 = var30.createContext(var31, var32, var33, var34, var35);
    float[] var37 = null;
    float[] var38 = var30.getComponents(var37);
    java.awt.Color var42 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var43 = null;
    java.awt.Rectangle var44 = null;
    java.awt.geom.Rectangle2D var45 = null;
    java.awt.geom.AffineTransform var46 = null;
    java.awt.RenderingHints var47 = null;
    java.awt.PaintContext var48 = var42.createContext(var43, var44, var45, var46, var47);
    float[] var49 = null;
    float[] var50 = var42.getComponents(var49);
    java.awt.Color var54 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var55 = null;
    java.awt.Rectangle var56 = null;
    java.awt.geom.Rectangle2D var57 = null;
    java.awt.geom.AffineTransform var58 = null;
    java.awt.RenderingHints var59 = null;
    java.awt.PaintContext var60 = var54.createContext(var55, var56, var57, var58, var59);
    float[] var64 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var65 = var54.getColorComponents(var64);
    java.awt.color.ColorSpace var66 = var54.getColorSpace();
    java.awt.Color var70 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var71 = null;
    java.awt.Rectangle var72 = null;
    java.awt.geom.Rectangle2D var73 = null;
    java.awt.geom.AffineTransform var74 = null;
    java.awt.RenderingHints var75 = null;
    java.awt.PaintContext var76 = var70.createContext(var71, var72, var73, var74, var75);
    float[] var80 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var81 = var70.getColorComponents(var80);
    float[] var82 = var42.getColorComponents(var66, var81);
    float[] var83 = var30.getColorComponents(var82);
    int var84 = var30.getRGB();
    int var85 = var15.compareTo((java.lang.Object)var30);
    int var86 = var30.getAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "0"+ "'", var26.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 255);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit((-46.0d), var1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var2 = var1.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var6 = var5.getAutoRangeStickyZero();
//     double var7 = var5.getUpperMargin();
//     java.awt.Shape var8 = var5.getUpArrow();
//     var5.setTickMarkInsideLength(0.0f);
//     boolean var11 = var5.isTickMarksVisible();
//     java.awt.Shape var12 = var5.getRightArrow();
//     java.awt.Stroke var13 = var5.getTickMarkStroke();
//     boolean var14 = var3.equals((java.lang.Object)var13);
//     var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
//     org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var18 = null;
//     boolean var19 = var17.hasListener(var18);
//     var17.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var23 = var17.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var27 = var26.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var28 = null;
//     var26.removeChangeListener(var28);
//     java.awt.Stroke var30 = var26.getStroke();
//     int var31 = var23.compareTo((java.lang.Object)var30);
//     var3.add((org.jfree.chart.axis.TickUnit)var23);
//     org.jfree.chart.axis.NumberAxis var34 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var35 = var34.getAutoRangeStickyZero();
//     double var36 = var34.getUpperMargin();
//     java.awt.Shape var37 = var34.getUpArrow();
//     var34.setTickMarkInsideLength(0.0f);
//     boolean var40 = var34.isTickMarksVisible();
//     org.jfree.chart.plot.Plot var41 = null;
//     var34.setPlot(var41);
//     org.jfree.chart.axis.NumberAxis var44 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var45 = var44.getAutoRangeStickyZero();
//     double var46 = var44.getUpperMargin();
//     java.awt.Shape var47 = var44.getUpArrow();
//     var44.setTickMarkInsideLength(0.0f);
//     boolean var50 = var44.isTickMarksVisible();
//     org.jfree.chart.axis.NumberAxis var52 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var53 = null;
//     boolean var54 = var52.hasListener(var53);
//     var52.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var58 = var52.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var61 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var62 = var61.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var63 = null;
//     var61.removeChangeListener(var63);
//     java.awt.Stroke var65 = var61.getStroke();
//     int var66 = var58.compareTo((java.lang.Object)var65);
//     var44.setTickUnit(var58);
//     var34.setTickUnit(var58);
//     java.lang.String var69 = var58.toString();
//     var3.add((org.jfree.chart.axis.TickUnit)var58);
//     
//     // Checks the contract:  equals-hashcode on var26 and var61
//     assertTrue("Contract failed: equals-hashcode on var26 and var61", var26.equals(var61) ? var26.hashCode() == var61.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var61 and var26
//     assertTrue("Contract failed: equals-hashcode on var61 and var26", var61.equals(var26) ? var61.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var4 = null;
    var0.setFixedRangeAxisSpace(var4);
    org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
    float var13 = var7.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var14 = var7.getLabelFont();
    var0.setDomainAxis(0, var7);
    org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var17 = null;
    var16.notifyListeners(var17);
    org.jfree.chart.axis.AxisLocation var20 = null;
    var16.setRangeAxisLocation(100, var20);
    java.awt.Graphics2D var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    boolean var26 = var16.render(var22, var23, (-1), var25);
    org.jfree.chart.util.SortOrder var27 = var16.getColumnRenderingOrder();
    var0.setRowRenderingOrder(var27);
    boolean var29 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var32 = null;
    boolean var33 = var31.hasListener(var32);
    var31.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var37 = var31.getTickUnit();
    org.jfree.data.Range var40 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.chart.JFreeChart var41 = null;
    org.jfree.chart.event.ChartChangeEvent var42 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var40, var41);
    var31.setRangeWithMargins(var40, true, true);
    boolean var46 = var0.equals((java.lang.Object)var40);
    org.jfree.chart.plot.IntervalMarker var49 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.RectangleInsets var54 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    var49.setLabelOffset(var54);
    org.jfree.chart.util.Layer var56 = null;
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var49, var56);
    int var58 = var0.getWeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var2 = null;
    var1.notifyListeners(var2);
    org.jfree.chart.plot.DatasetRenderingOrder var4 = var1.getDatasetRenderingOrder();
    int var5 = var1.getRangeAxisCount();
    org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
    double var13 = var7.getUpperMargin();
    float var14 = var7.getMaximumCategoryLabelWidthRatio();
    var1.setDomainAxis(2, var7);
    org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
    boolean var18 = var17.getAutoRangeStickyZero();
    double var19 = var17.getUpperMargin();
    var17.setPositiveArrowVisible(true);
    org.jfree.chart.renderer.category.CategoryItemRenderer var22 = null;
    org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot(var0, var7, (org.jfree.chart.axis.ValueAxis)var17, var22);
    var17.setTickMarkInsideLength((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.05d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    double var4 = var1.getFixedDimension();
    org.jfree.data.Range var5 = var1.getRange();
    org.jfree.chart.plot.Plot var6 = var1.getPlot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     java.awt.Graphics2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var10 = null;
//     boolean var11 = var0.render(var7, var8, (-1), var10);
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var0.addRangeMarker((org.jfree.chart.plot.Marker)var13);
//     double var15 = var13.getValue();
//     org.jfree.chart.plot.IntervalMarker var18 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var19 = var18.getAlpha();
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var18.notifyListeners(var20);
//     org.jfree.chart.util.RectangleAnchor var22 = var18.getLabelAnchor();
//     org.jfree.chart.axis.NumberAxis var24 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var25 = var24.getAutoRangeStickyZero();
//     var24.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var28 = var24.getPlot();
//     var24.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
//     org.jfree.chart.util.RectangleInsets var31 = var24.getLabelInsets();
//     boolean var32 = var22.equals((java.lang.Object)var31);
//     var13.setLabelAnchor(var22);
//     org.jfree.chart.axis.CategoryLabelPositions var35 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
//     org.jfree.chart.axis.CategoryLabelPosition var36 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var37 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var38 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var39 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var40 = new org.jfree.chart.axis.CategoryLabelPositions(var36, var37, var38, var39);
//     org.jfree.chart.axis.CategoryLabelWidthType var41 = var36.getWidthType();
//     org.jfree.chart.axis.CategoryLabelPositions var42 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var35, var36);
//     double var43 = var36.getAngle();
//     org.jfree.chart.text.TextBlockAnchor var44 = var36.getLabelAnchor();
//     boolean var46 = var44.equals((java.lang.Object)10.0d);
//     java.lang.String var47 = var44.toString();
//     org.jfree.chart.plot.IntervalMarker var50 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     java.awt.Font var51 = var50.getLabelFont();
//     float var52 = var50.getAlpha();
//     org.jfree.chart.text.TextAnchor var53 = var50.getLabelTextAnchor();
//     org.jfree.chart.axis.CategoryLabelPosition var55 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var56 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var57 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var58 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var59 = new org.jfree.chart.axis.CategoryLabelPositions(var55, var56, var57, var58);
//     org.jfree.chart.axis.CategoryLabelWidthType var60 = var55.getWidthType();
//     org.jfree.chart.axis.CategoryLabelPosition var62 = new org.jfree.chart.axis.CategoryLabelPosition(var22, var44, var53, 8.0d, var60, 100.0f);
//     
//     // Checks the contract:  equals-hashcode on var18 and var50
//     assertTrue("Contract failed: equals-hashcode on var18 and var50", var18.equals(var50) ? var18.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var18
//     assertTrue("Contract failed: equals-hashcode on var50 and var18", var50.equals(var18) ? var50.hashCode() == var18.hashCode() : true);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.util.RectangleInsets var7 = var0.getAxisOffset();
    java.awt.Paint[] var8 = null;
    java.awt.Paint[] var9 = null;
    org.jfree.chart.axis.CategoryAxis var11 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var13 = var11.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var14 = new java.awt.Paint[] { var13};
    org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var18 = var17.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var19 = null;
    var17.removeChangeListener(var19);
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var23 = var22.getLabelPaint();
    var17.setOutlinePaint(var23);
    java.awt.Paint[] var25 = new java.awt.Paint[] { var23};
    java.awt.Color var29 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var30 = null;
    java.awt.Rectangle var31 = null;
    java.awt.geom.Rectangle2D var32 = null;
    java.awt.geom.AffineTransform var33 = null;
    java.awt.RenderingHints var34 = null;
    java.awt.PaintContext var35 = var29.createContext(var30, var31, var32, var33, var34);
    int var36 = var29.getRed();
    java.lang.String var37 = var29.toString();
    java.awt.Paint[] var38 = new java.awt.Paint[] { var29};
    org.jfree.chart.axis.NumberAxis var40 = new org.jfree.chart.axis.NumberAxis("");
    boolean var41 = var40.getAutoRangeStickyZero();
    double var42 = var40.getUpperMargin();
    java.awt.Shape var43 = var40.getUpArrow();
    var40.setTickMarkInsideLength(0.0f);
    boolean var46 = var40.isTickMarksVisible();
    java.awt.Shape var47 = var40.getRightArrow();
    java.awt.Stroke var48 = var40.getTickMarkStroke();
    java.awt.Stroke[] var49 = new java.awt.Stroke[] { var48};
    org.jfree.chart.axis.NumberAxis var51 = new org.jfree.chart.axis.NumberAxis("");
    boolean var52 = var51.getAutoRangeStickyZero();
    var51.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var56 = new org.jfree.chart.axis.NumberAxis("");
    boolean var57 = var56.getAutoRangeStickyZero();
    double var58 = var56.getUpperMargin();
    java.awt.Shape var59 = var56.getUpArrow();
    var56.setTickMarkInsideLength(0.0f);
    boolean var62 = var56.isTickMarksVisible();
    java.awt.Shape var63 = var56.getRightArrow();
    var51.setLeftArrow(var63);
    java.awt.Stroke var65 = var51.getAxisLineStroke();
    java.awt.Stroke[] var66 = new java.awt.Stroke[] { var65};
    java.awt.Shape[] var67 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var68 = new org.jfree.chart.plot.DefaultDrawingSupplier(var14, var25, var38, var49, var66, var67);
    java.awt.Stroke[] var69 = null;
    org.jfree.chart.plot.IntervalMarker var72 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var73 = var72.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var74 = null;
    var72.removeChangeListener(var74);
    java.awt.Stroke var76 = var72.getStroke();
    java.awt.Stroke[] var77 = new java.awt.Stroke[] { var76};
    java.awt.Shape[] var78 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var79 = new org.jfree.chart.plot.DefaultDrawingSupplier(var8, var9, var38, var69, var77, var78);
    java.awt.Paint var80 = var79.getNextOutlinePaint();
    var0.setRangeGridlinePaint(var80);
    org.jfree.chart.annotations.CategoryAnnotation var82 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var82);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var37.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Graphics2D var8 = null;
    org.jfree.chart.axis.AxisState var9 = null;
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    java.util.List var12 = var1.refreshTicks(var8, var9, var10, var11);
    java.lang.Object var13 = null;
    boolean var14 = var1.equals(var13);
    boolean var15 = var1.isInverted();
    boolean var16 = var1.isAutoTickUnitSelection();
    org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var18 = null;
    var17.notifyListeners(var18);
    org.jfree.chart.plot.DatasetRenderingOrder var20 = var17.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var21 = null;
    var17.rendererChanged(var21);
    int var23 = var17.getDomainAxisCount();
    boolean var24 = var1.hasListener((java.util.EventListener)var17);
    org.jfree.chart.plot.CategoryPlot var26 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var27 = null;
    var26.notifyListeners(var27);
    org.jfree.chart.axis.AxisLocation var30 = null;
    var26.setRangeAxisLocation(100, var30);
    org.jfree.chart.renderer.category.CategoryItemRenderer var32 = var26.getRenderer();
    org.jfree.chart.axis.AxisLocation var33 = var26.getRangeAxisLocation();
    var17.setRangeAxisLocation(15, var33, true);
    org.jfree.chart.axis.NumberAxis var37 = new org.jfree.chart.axis.NumberAxis("");
    boolean var38 = var37.getAutoRangeStickyZero();
    var37.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var41 = var37.getPlot();
    boolean var42 = var37.isTickLabelsVisible();
    java.lang.String var43 = var37.getLabel();
    boolean var44 = var33.equals((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getShapeCoords();
    java.lang.String var8 = var5.getShapeType();
    org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var12 = var11.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var13 = null;
    var11.removeChangeListener(var13);
    org.jfree.chart.util.RectangleAnchor var15 = var11.getLabelAnchor();
    double var16 = var11.getStartValue();
    boolean var17 = var5.equals((java.lang.Object)var11);
    java.lang.String var18 = var5.getShapeType();
    java.lang.String var19 = var5.toString();
    org.jfree.chart.axis.NumberAxis var21 = new org.jfree.chart.axis.NumberAxis("");
    boolean var22 = var21.getAutoRangeStickyZero();
    double var23 = var21.getUpperMargin();
    java.awt.Shape var24 = var21.getUpArrow();
    org.jfree.chart.axis.NumberAxis var26 = new org.jfree.chart.axis.NumberAxis("");
    boolean var27 = var26.getAutoRangeStickyZero();
    double var28 = var26.getUpperMargin();
    java.awt.Shape var29 = var26.getUpArrow();
    var21.setLeftArrow(var29);
    var5.setArea(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartEntity: tooltip = null"+ "'", var6.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "0,0,-2,2,2,2,2,2"+ "'", var7.equals("0,0,-2,2,2,2,2,2"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "poly"+ "'", var8.equals("poly"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "poly"+ "'", var18.equals("poly"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "ChartEntity: tooltip = null"+ "'", var19.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    boolean var2 = var0.isSubplot();
    var0.setAnchorValue(Double.POSITIVE_INFINITY);
    org.jfree.chart.util.Layer var5 = null;
    java.util.Collection var6 = var0.getDomainMarkers(var5);
    org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var8 = null;
    var7.notifyListeners(var8);
    org.jfree.chart.axis.AxisLocation var11 = null;
    var7.setRangeAxisLocation(100, var11);
    java.awt.Graphics2D var13 = null;
    java.awt.geom.Rectangle2D var14 = null;
    org.jfree.chart.plot.PlotRenderingInfo var16 = null;
    boolean var17 = var7.render(var13, var14, (-1), var16);
    org.jfree.chart.util.SortOrder var18 = var7.getColumnRenderingOrder();
    java.lang.String var19 = var18.toString();
    var0.setColumnRenderingOrder(var18);
    org.jfree.chart.event.PlotChangeListener var21 = null;
    var0.removeChangeListener(var21);
    org.jfree.chart.annotations.CategoryAnnotation var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var24 = var0.removeAnnotation(var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "SortOrder.ASCENDING"+ "'", var19.equals("SortOrder.ASCENDING"));

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
    java.awt.Paint var6 = var0.getBackgroundPaint();
    org.jfree.chart.renderer.category.CategoryItemRenderer var8 = null;
    var0.setRenderer(100, var8);
    org.jfree.chart.plot.CategoryMarker var11 = null;
    org.jfree.chart.util.Layer var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker((-1), var11, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    org.jfree.chart.util.ObjectList var1 = new org.jfree.chart.util.ObjectList(0);
    boolean var3 = var1.equals((java.lang.Object)(short)0);
    int var4 = var1.size();
    org.jfree.chart.plot.CategoryPlot var5 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var6 = null;
    var5.notifyListeners(var6);
    org.jfree.chart.axis.CategoryAxis var8 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var11 = null;
    org.jfree.chart.util.RectangleEdge var12 = null;
    double var13 = var8.getCategoryMiddle(1, 0, var11, var12);
    java.lang.Object var14 = var8.clone();
    java.util.List var15 = var5.getCategoriesForAxis(var8);
    org.jfree.chart.LegendItemCollection var16 = var5.getLegendItems();
    boolean var17 = var1.equals((java.lang.Object)var16);
    org.jfree.chart.axis.CategoryAxis var20 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var22 = var20.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var23 = new java.awt.Paint[] { var22};
    org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var27 = var26.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var28 = null;
    var26.removeChangeListener(var28);
    org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var32 = var31.getLabelPaint();
    var26.setOutlinePaint(var32);
    java.awt.Paint[] var34 = new java.awt.Paint[] { var32};
    java.awt.Color var38 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var39 = null;
    java.awt.Rectangle var40 = null;
    java.awt.geom.Rectangle2D var41 = null;
    java.awt.geom.AffineTransform var42 = null;
    java.awt.RenderingHints var43 = null;
    java.awt.PaintContext var44 = var38.createContext(var39, var40, var41, var42, var43);
    int var45 = var38.getRed();
    java.lang.String var46 = var38.toString();
    java.awt.Paint[] var47 = new java.awt.Paint[] { var38};
    org.jfree.chart.axis.NumberAxis var49 = new org.jfree.chart.axis.NumberAxis("");
    boolean var50 = var49.getAutoRangeStickyZero();
    double var51 = var49.getUpperMargin();
    java.awt.Shape var52 = var49.getUpArrow();
    var49.setTickMarkInsideLength(0.0f);
    boolean var55 = var49.isTickMarksVisible();
    java.awt.Shape var56 = var49.getRightArrow();
    java.awt.Stroke var57 = var49.getTickMarkStroke();
    java.awt.Stroke[] var58 = new java.awt.Stroke[] { var57};
    org.jfree.chart.axis.NumberAxis var60 = new org.jfree.chart.axis.NumberAxis("");
    boolean var61 = var60.getAutoRangeStickyZero();
    var60.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var65 = new org.jfree.chart.axis.NumberAxis("");
    boolean var66 = var65.getAutoRangeStickyZero();
    double var67 = var65.getUpperMargin();
    java.awt.Shape var68 = var65.getUpArrow();
    var65.setTickMarkInsideLength(0.0f);
    boolean var71 = var65.isTickMarksVisible();
    java.awt.Shape var72 = var65.getRightArrow();
    var60.setLeftArrow(var72);
    java.awt.Stroke var74 = var60.getAxisLineStroke();
    java.awt.Stroke[] var75 = new java.awt.Stroke[] { var74};
    java.awt.Shape[] var76 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var77 = new org.jfree.chart.plot.DefaultDrawingSupplier(var23, var34, var47, var58, var75, var76);
    java.lang.Object var78 = var77.clone();
    java.awt.Paint var79 = var77.getNextOutlinePaint();
    java.awt.Paint var80 = var77.getNextPaint();
    org.jfree.chart.plot.CategoryPlot var81 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var82 = null;
    var81.notifyListeners(var82);
    org.jfree.chart.axis.AxisLocation var85 = null;
    var81.setRangeAxisLocation(100, var85);
    org.jfree.chart.renderer.category.CategoryItemRenderer var87 = var81.getRenderer();
    org.jfree.chart.util.RectangleInsets var88 = var81.getAxisOffset();
    boolean var89 = var77.equals((java.lang.Object)var81);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.set(2, (java.lang.Object)var81);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var46.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     java.awt.Stroke var9 = var1.getTickMarkStroke();
//     java.awt.Graphics2D var10 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
//     var14.clearRangeAxes();
//     boolean var16 = var14.isSubplot();
//     var14.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var20 = var14.getRangeAxisEdge(1);
//     org.jfree.chart.plot.PlotRenderingInfo var21 = null;
//     org.jfree.chart.axis.AxisState var22 = var1.draw(var10, Double.POSITIVE_INFINITY, var12, var13, var20, var21);
// 
//   }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var6 = var0.getDomainAxisLocation();
//     java.lang.String var7 = var6.toString();
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var9 = null;
//     var8.notifyListeners(var9);
//     org.jfree.chart.plot.PlotOrientation var11 = var8.getOrientation();
//     java.lang.String var12 = var11.toString();
//     java.lang.String var13 = var11.toString();
//     org.jfree.chart.util.RectangleEdge var14 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var6, var11);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var9 = var4.getLeft();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.resizeRange(108.0d, 0.0d);
    java.awt.Shape var8 = var1.getUpArrow();
    java.lang.String var9 = var1.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.ChartChangeEvent var1 = new org.jfree.chart.event.ChartChangeEvent(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(0.0d, var1, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    double var9 = var1.valueToJava2D(8.0d, var7, var8);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    var1.setRightArrow(var18);
    org.jfree.chart.entity.ChartEntity var20 = new org.jfree.chart.entity.ChartEntity(var18);
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    boolean var23 = var22.getAutoRangeStickyZero();
    var22.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var27 = new org.jfree.chart.axis.NumberAxis("");
    boolean var28 = var27.getAutoRangeStickyZero();
    double var29 = var27.getUpperMargin();
    java.awt.Shape var30 = var27.getUpArrow();
    var27.setTickMarkInsideLength(0.0f);
    boolean var33 = var27.isTickMarksVisible();
    java.awt.Shape var34 = var27.getRightArrow();
    var22.setLeftArrow(var34);
    var20.setArea(var34);
    org.jfree.chart.entity.ChartEntity var39 = new org.jfree.chart.entity.ChartEntity(var34, "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]", "");
    org.jfree.chart.entity.TickLabelEntity var42 = new org.jfree.chart.entity.TickLabelEntity(var34, "", "0,0,-2,2,2,2,2,2");
    var42.setURLText("Range[-101.0,7.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.RectangleInsets var10 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var12 = var10.trimWidth(0.0d);
    double var14 = var10.calculateRightOutset(0.0d);
    double var15 = var10.getBottom();
    double var17 = var10.calculateRightInset((-100.0d));
    var2.setLabelOffset(var10);
    double var19 = var10.getTop();
    double var20 = var10.getLeft();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setVerticalTickLabels(false);
    java.awt.geom.Rectangle2D var5 = null;
    org.jfree.chart.util.RectangleEdge var6 = null;
    double var7 = var1.valueToJava2D(0.0d, var5, var6);
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    boolean var10 = var9.getAutoRangeStickyZero();
    double var11 = var9.getUpperMargin();
    java.awt.Shape var12 = var9.getUpArrow();
    var9.setTickMarkInsideLength(0.0f);
    boolean var15 = var9.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var18 = null;
    boolean var19 = var17.hasListener(var18);
    var17.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var23 = var17.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var27 = var26.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var28 = null;
    var26.removeChangeListener(var28);
    java.awt.Stroke var30 = var26.getStroke();
    int var31 = var23.compareTo((java.lang.Object)var30);
    var9.setTickUnit(var23);
    var1.setTickUnit(var23);
    org.jfree.chart.axis.NumberAxis var35 = new org.jfree.chart.axis.NumberAxis("");
    boolean var36 = var35.getAutoRangeStickyZero();
    double var37 = var35.getUpperMargin();
    java.awt.Shape var38 = var35.getUpArrow();
    org.jfree.chart.entity.ChartEntity var39 = new org.jfree.chart.entity.ChartEntity(var38);
    org.jfree.chart.entity.CategoryLabelEntity var42 = new org.jfree.chart.entity.CategoryLabelEntity((java.lang.Comparable)var23, var38, "SortOrder.ASCENDING", "SortOrder.ASCENDING");
    java.awt.Shape var43 = var42.getArea();
    java.lang.String var44 = var42.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "CategoryLabelEntity: category=[size=1], tooltip=SortOrder.ASCENDING, url=SortOrder.ASCENDING"+ "'", var44.equals("CategoryLabelEntity: category=[size=1], tooltip=SortOrder.ASCENDING, url=SortOrder.ASCENDING"));

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var6 = var4.calculateTopInset(10.0d);
//     double var8 = var4.trimHeight(10.0d);
//     double var10 = var4.calculateTopInset(100.0d);
//     java.awt.geom.Rectangle2D var11 = null;
//     var4.trim(var11);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = new org.jfree.chart.axis.CategoryLabelPositions();
    org.jfree.chart.axis.CategoryLabelPosition var1 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var5 = new org.jfree.chart.axis.CategoryLabelPositions(var1, var2, var3, var4);
    boolean var7 = var3.equals((java.lang.Object)108.0d);
    org.jfree.chart.axis.CategoryLabelPositions var8 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var0, var3);
    org.jfree.chart.axis.CategoryLabelWidthType var9 = var3.getWidthType();
    java.lang.String var10 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "CategoryLabelWidthType.CATEGORY"+ "'", var10.equals("CategoryLabelWidthType.CATEGORY"));

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Paint var3 = var1.getTickLabelPaint((java.lang.Comparable)(-1.0f));
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.util.RectangleEdge var10 = var7.getDomainAxisEdge();
//     double var11 = var1.getCategoryEnd(0, 0, var6, var10);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    org.jfree.chart.plot.Plot var9 = var1.getPlot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    java.awt.Color var1 = java.awt.Color.getColor("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setTickMarkOutsideLength(10.0f);
    org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var12 = null;
    var11.notifyListeners(var12);
    org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
    var1.setPlot((org.jfree.chart.plot.Plot)var11);
    var11.configureRangeAxes();
    int var17 = var11.getBackgroundImageAlignment();
    org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var20 = null;
    boolean var21 = var19.hasListener(var20);
    double var22 = var19.getFixedDimension();
    java.awt.Font var23 = var19.getTickLabelFont();
    org.jfree.data.Range var24 = var11.getDataRange((org.jfree.chart.axis.ValueAxis)var19);
    double var25 = var19.getUpperMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.05d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var1);
    org.jfree.chart.event.ChartChangeEventType var3 = var2.getType();
    org.jfree.chart.JFreeChart var4 = null;
    var2.setChart(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    double var2 = var1.getLabelAngle();
    org.jfree.chart.event.AxisChangeEvent var3 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
    boolean var4 = var1.isPositiveArrowVisible();
    java.awt.Graphics2D var5 = null;
    org.jfree.chart.axis.AxisState var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    java.util.List var9 = var1.refreshTicks(var5, var6, var7, var8);
    org.jfree.chart.event.AxisChangeEvent var10 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
    org.jfree.chart.axis.Axis var11 = var10.getAxis();
    org.jfree.chart.JFreeChart var12 = null;
    var10.setChart(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     var1.setTickMarkOutsideLength(10.0f);
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var14 = null;
//     var13.notifyListeners(var14);
//     org.jfree.chart.axis.AxisLocation var17 = null;
//     var13.setRangeAxisLocation(100, var17);
//     org.jfree.chart.util.RectangleEdge var19 = var13.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var20 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var19);
//     double var21 = var1.lengthToJava2D(0.0d, var12, var19);
// 
//   }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     float var7 = var0.getBackgroundAlpha();
//     float var8 = var0.getForegroundAlpha();
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.plot.DatasetRenderingOrder var12 = var9.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var13 = null;
//     var9.rendererChanged(var13);
//     int var15 = var9.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var16 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var9);
//     org.jfree.chart.JFreeChart var17 = var16.getChart();
//     var0.notifyListeners(var16);
//     
//     // Checks the contract:  equals-hashcode on var0 and var9
//     assertTrue("Contract failed: equals-hashcode on var0 and var9", var0.equals(var9) ? var0.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var0
//     assertTrue("Contract failed: equals-hashcode on var9 and var0", var9.equals(var0) ? var9.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    boolean var2 = var0.isSubplot();
    var0.setAnchorValue(Double.POSITIVE_INFINITY);
    int var5 = var0.getBackgroundImageAlignment();
    java.awt.Stroke var6 = var0.getDomainGridlineStroke();
    org.jfree.chart.annotations.CategoryAnnotation var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.removeAnnotation(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    boolean var3 = var0.isRangeGridlinesVisible();
    org.jfree.chart.util.SortOrder var4 = var0.getColumnRenderingOrder();
    org.jfree.chart.axis.ValueAxis var6 = var0.getRangeAxis(255);
    org.jfree.data.category.CategoryDataset var8 = null;
    var0.setDataset(255, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
//     var1.setRangeAboutValue((-1.0d), 0.0d);
//     double var23 = var1.getUpperBound();
//     java.awt.Graphics2D var24 = null;
//     org.jfree.chart.axis.AxisState var25 = null;
//     java.awt.geom.Rectangle2D var26 = null;
//     org.jfree.chart.plot.CategoryPlot var27 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var28 = null;
//     var27.notifyListeners(var28);
//     org.jfree.chart.util.RectangleEdge var30 = var27.getDomainAxisEdge();
//     java.util.List var31 = var1.refreshTicks(var24, var25, var26, var30);
// 
//   }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    var1.setFixedDimension(0.0d);
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
    assertTrue(var3 == 0.05d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    java.lang.Object var0 = new java.lang.Object();
    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.JFreeChart var3 = null;
    org.jfree.chart.event.ChartChangeEvent var4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var3);
    org.jfree.chart.event.ChartChangeEventType var5 = var4.getType();
    java.lang.String var6 = var5.toString();
    org.jfree.chart.event.ChartChangeEvent var7 = new org.jfree.chart.event.ChartChangeEvent(var0, var1, var5);
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var6.equals("ChartChangeEventType.GENERAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var8.equals("ChartChangeEventType.GENERAL"));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setAnchorValue(2.0d, true);
    org.jfree.chart.plot.Plot var11 = var0.getParent();
    java.lang.String var12 = var0.getPlotType();
    org.jfree.chart.axis.AxisSpace var13 = var0.getFixedRangeAxisSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Category Plot"+ "'", var12.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var9 = var8.getAutoRangeStickyZero();
//     var8.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var14 = var13.getAutoRangeStickyZero();
//     double var15 = var13.getUpperMargin();
//     java.awt.Shape var16 = var13.getUpArrow();
//     var13.setTickMarkInsideLength(0.0f);
//     boolean var19 = var13.isTickMarksVisible();
//     java.awt.Shape var20 = var13.getRightArrow();
//     var8.setLeftArrow(var20);
//     java.awt.Stroke var22 = var8.getAxisLineStroke();
//     var8.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
//     org.jfree.chart.util.SortOrder var26 = var0.getColumnRenderingOrder();
//     org.jfree.chart.axis.NumberAxis var28 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var29 = var28.getAutoRangeStickyZero();
//     double var30 = var28.getUpperMargin();
//     java.awt.Shape var31 = var28.getUpArrow();
//     var28.setTickMarkInsideLength(0.0f);
//     boolean var34 = var28.isTickMarksVisible();
//     java.awt.Graphics2D var35 = null;
//     org.jfree.chart.axis.AxisState var36 = null;
//     java.awt.geom.Rectangle2D var37 = null;
//     org.jfree.chart.util.RectangleEdge var38 = null;
//     java.util.List var39 = var28.refreshTicks(var35, var36, var37, var38);
//     java.lang.Object var40 = null;
//     boolean var41 = var28.equals(var40);
//     boolean var42 = var28.isInverted();
//     boolean var43 = var28.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var45 = null;
//     var44.notifyListeners(var45);
//     org.jfree.chart.plot.DatasetRenderingOrder var47 = var44.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var48 = null;
//     var44.rendererChanged(var48);
//     int var50 = var44.getDomainAxisCount();
//     boolean var51 = var28.hasListener((java.util.EventListener)var44);
//     int var52 = var44.getDomainAxisCount();
//     boolean var53 = var26.equals((java.lang.Object)var52);
//     
//     // Checks the contract:  equals-hashcode on var0 and var44
//     assertTrue("Contract failed: equals-hashcode on var0 and var44", var0.equals(var44) ? var0.hashCode() == var44.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var0
//     assertTrue("Contract failed: equals-hashcode on var44 and var0", var44.equals(var0) ? var44.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test293() {}
//   public void test293() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     var0.setMaximumCategoryLabelWidthRatio(1.0f);
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var9 = null;
//     var8.notifyListeners(var9);
//     org.jfree.chart.plot.DatasetRenderingOrder var11 = var8.getDatasetRenderingOrder();
//     int var12 = var8.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var14 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var17 = null;
//     org.jfree.chart.util.RectangleEdge var18 = null;
//     double var19 = var14.getCategoryMiddle(1, 0, var17, var18);
//     double var20 = var14.getUpperMargin();
//     float var21 = var14.getMaximumCategoryLabelWidthRatio();
//     var8.setDomainAxis(2, var14);
//     org.jfree.chart.axis.CategoryAnchor var23 = var8.getDomainGridlinePosition();
//     org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var23);
//     java.awt.geom.Rectangle2D var27 = null;
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     var28.clearRangeAxes();
//     boolean var30 = var28.isSubplot();
//     var28.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var34 = var28.getRangeAxisEdge(1);
//     double var35 = var0.getCategoryJava2DCoordinate(var23, 1, (-1), var27, var34);
// 
//   }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    boolean var11 = var0.render(var7, var8, (-1), var10);
    org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var13);
    org.jfree.chart.renderer.category.CategoryItemRenderer var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRenderer((-16777216), var16, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
    org.jfree.chart.renderer.category.CategoryItemRenderer var17 = null;
    var0.setRenderer(100, var17);
    org.jfree.chart.axis.CategoryAxis var19 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var22 = null;
    org.jfree.chart.util.RectangleEdge var23 = null;
    double var24 = var19.getCategoryStart(1, 178, var22, var23);
    java.awt.Paint var26 = var19.getTickLabelPaint((java.lang.Comparable)10.0f);
    var19.setTickLabelsVisible(false);
    int var29 = var0.getDomainAxisIndex(var19);
    var0.clearDomainMarkers(10);
    org.jfree.chart.renderer.category.CategoryItemRenderer var32 = null;
    var0.setRenderer(var32, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.trimWidth(0.0d);
    double var8 = var4.calculateRightOutset(0.0d);
    double var10 = var4.calculateRightInset(108.0d);
    double var12 = var4.calculateTopOutset(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    double var9 = var1.valueToJava2D(8.0d, var7, var8);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    var1.setRightArrow(var18);
    org.jfree.chart.entity.ChartEntity var20 = new org.jfree.chart.entity.ChartEntity(var18);
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    boolean var23 = var22.getAutoRangeStickyZero();
    var22.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var27 = new org.jfree.chart.axis.NumberAxis("");
    boolean var28 = var27.getAutoRangeStickyZero();
    double var29 = var27.getUpperMargin();
    java.awt.Shape var30 = var27.getUpArrow();
    var27.setTickMarkInsideLength(0.0f);
    boolean var33 = var27.isTickMarksVisible();
    java.awt.Shape var34 = var27.getRightArrow();
    var22.setLeftArrow(var34);
    var20.setArea(var34);
    org.jfree.chart.entity.ChartEntity var39 = new org.jfree.chart.entity.ChartEntity(var34, "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]", "");
    java.lang.String var40 = var39.getShapeCoords();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "0,0,-2,-2,-2,2,-2,2"+ "'", var40.equals("0,0,-2,-2,-2,2,-2,2"));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    java.awt.Paint var5 = var0.getRangeGridlinePaint();
    org.jfree.chart.axis.ValueAxis var7 = var0.getRangeAxisForDataset((-254));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxis((-1), (-254));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    double var6 = var0.getUpperMargin();
    float var7 = var0.getMaximumCategoryLabelWidthRatio();
    var0.configure();
    var0.setMaximumCategoryLabelLines(0);
    var0.setCategoryLabelPositionOffset((-254));
    java.lang.Comparable var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Font var14 = var0.getTickLabelFont(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0f);

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var2 = null;
//     var1.notifyListeners(var2);
//     org.jfree.chart.plot.DatasetRenderingOrder var4 = var1.getDatasetRenderingOrder();
//     int var5 = var1.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
//     double var13 = var7.getUpperMargin();
//     float var14 = var7.getMaximumCategoryLabelWidthRatio();
//     var1.setDomainAxis(2, var7);
//     org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var18 = var17.getAutoRangeStickyZero();
//     double var19 = var17.getUpperMargin();
//     var17.setPositiveArrowVisible(true);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var22 = null;
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot(var0, var7, (org.jfree.chart.axis.ValueAxis)var17, var22);
//     org.jfree.chart.plot.PlotRenderingInfo var26 = null;
//     var23.handleClick(255, 15, var26);
// 
//   }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.util.RectangleEdge var10 = null;
//     double var11 = var0.getCategoryStart(1, (-1), var9, var10);
//     double var12 = var0.getUpperMargin();
//     var0.setMaximumCategoryLabelWidthRatio(1.0f);
//     java.lang.Object var15 = var0.clone();
//     java.lang.String var16 = var0.getLabelToolTip();
//     org.jfree.chart.plot.IntervalMarker var19 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var20 = var19.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var21 = null;
//     var19.removeChangeListener(var21);
//     org.jfree.chart.util.RectangleInsets var27 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     var19.setLabelOffset(var27);
//     boolean var30 = var19.equals((java.lang.Object)0.05d);
//     org.jfree.chart.util.LengthAdjustmentType var31 = var19.getLabelOffsetType();
//     org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var33 = null;
//     var32.notifyListeners(var33);
//     org.jfree.chart.axis.AxisLocation var36 = null;
//     var32.setRangeAxisLocation(100, var36);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var38 = var32.getRenderer();
//     java.awt.Graphics2D var39 = null;
//     java.awt.geom.Rectangle2D var40 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var42 = null;
//     boolean var43 = var32.render(var39, var40, (-1), var42);
//     org.jfree.chart.plot.ValueMarker var45 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var32.addRangeMarker((org.jfree.chart.plot.Marker)var45);
//     var19.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var32);
//     boolean var48 = var0.equals((java.lang.Object)var19);
//     java.awt.Graphics2D var49 = null;
//     org.jfree.chart.axis.AxisState var50 = null;
//     java.awt.geom.Rectangle2D var51 = null;
//     org.jfree.chart.plot.CategoryPlot var52 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var53 = null;
//     var52.notifyListeners(var53);
//     org.jfree.chart.axis.AxisLocation var56 = null;
//     var52.setRangeAxisLocation(100, var56);
//     org.jfree.chart.util.RectangleEdge var58 = var52.getDomainAxisEdge();
//     java.util.List var59 = var0.refreshTicks(var49, var50, var51, var58);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.plot.CategoryMarker var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addDomainMarker(var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test303() {}
//   public void test303() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     var1.setFixedDimension(0.0d);
//     boolean var8 = var1.isPositiveArrowVisible();
//     java.awt.Graphics2D var9 = null;
//     java.awt.geom.Rectangle2D var11 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.util.RectangleEdge var13 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var14 = null;
//     org.jfree.chart.axis.AxisState var15 = var1.draw(var9, 0.05d, var11, var12, var13, var14);
// 
//   }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    float var7 = var0.getBackgroundAlpha();
    float var8 = var0.getForegroundAlpha();
    org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
    boolean var11 = var10.getAutoRangeStickyZero();
    double var12 = var10.getUpperMargin();
    java.awt.Shape var13 = var10.getUpArrow();
    var10.setTickMarkInsideLength(0.0f);
    boolean var16 = var10.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var18 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var19 = null;
    boolean var20 = var18.hasListener(var19);
    var18.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var24 = var18.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var27 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var28 = var27.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var29 = null;
    var27.removeChangeListener(var29);
    java.awt.Stroke var31 = var27.getStroke();
    int var32 = var24.compareTo((java.lang.Object)var31);
    var10.setTickUnit(var24);
    java.lang.String var35 = var24.valueToString(0.0d);
    java.awt.Color var39 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var40 = null;
    java.awt.Rectangle var41 = null;
    java.awt.geom.Rectangle2D var42 = null;
    java.awt.geom.AffineTransform var43 = null;
    java.awt.RenderingHints var44 = null;
    java.awt.PaintContext var45 = var39.createContext(var40, var41, var42, var43, var44);
    float[] var46 = null;
    float[] var47 = var39.getComponents(var46);
    java.awt.Color var51 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var52 = null;
    java.awt.Rectangle var53 = null;
    java.awt.geom.Rectangle2D var54 = null;
    java.awt.geom.AffineTransform var55 = null;
    java.awt.RenderingHints var56 = null;
    java.awt.PaintContext var57 = var51.createContext(var52, var53, var54, var55, var56);
    float[] var58 = null;
    float[] var59 = var51.getComponents(var58);
    java.awt.Color var63 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var64 = null;
    java.awt.Rectangle var65 = null;
    java.awt.geom.Rectangle2D var66 = null;
    java.awt.geom.AffineTransform var67 = null;
    java.awt.RenderingHints var68 = null;
    java.awt.PaintContext var69 = var63.createContext(var64, var65, var66, var67, var68);
    float[] var73 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var74 = var63.getColorComponents(var73);
    java.awt.color.ColorSpace var75 = var63.getColorSpace();
    java.awt.Color var79 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var80 = null;
    java.awt.Rectangle var81 = null;
    java.awt.geom.Rectangle2D var82 = null;
    java.awt.geom.AffineTransform var83 = null;
    java.awt.RenderingHints var84 = null;
    java.awt.PaintContext var85 = var79.createContext(var80, var81, var82, var83, var84);
    float[] var89 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var90 = var79.getColorComponents(var89);
    float[] var91 = var51.getColorComponents(var75, var90);
    float[] var92 = var39.getColorComponents(var91);
    int var93 = var39.getRGB();
    int var94 = var24.compareTo((java.lang.Object)var39);
    var0.setBackgroundPaint((java.awt.Paint)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "0"+ "'", var35.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-1));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    java.lang.Object var12 = var0.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var14 = var0.get((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    org.jfree.chart.axis.TickUnitSource var0 = org.jfree.chart.axis.NumberAxis.createStandardTickUnits();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    int var6 = var0.getDomainAxisCount();
    java.awt.Paint var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setNoDataMessagePaint(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var1.setValue(8.0d);
    java.awt.Paint var4 = var1.getLabelPaint();
    double var5 = var1.getValue();
    var1.setValue((-46.0d));
    java.awt.Stroke var8 = var1.getOutlineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var14 = var12.trimWidth(0.0d);
    double var16 = var12.calculateRightOutset(0.0d);
    double var17 = var12.getBottom();
    var1.setTickLabelInsets(var12);
    java.awt.Font var19 = var1.getTickLabelFont();
    org.jfree.chart.plot.CategoryPlot var20 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var21 = null;
    var20.notifyListeners(var21);
    org.jfree.chart.axis.AxisLocation var24 = null;
    var20.setRangeAxisLocation(100, var24);
    java.awt.Graphics2D var26 = null;
    java.awt.geom.Rectangle2D var27 = null;
    org.jfree.chart.plot.PlotRenderingInfo var29 = null;
    boolean var30 = var20.render(var26, var27, (-1), var29);
    java.awt.Stroke var31 = var20.getRangeGridlineStroke();
    org.jfree.chart.axis.NumberAxis var33 = new org.jfree.chart.axis.NumberAxis("");
    boolean var34 = var33.getAutoRangeStickyZero();
    var33.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var38 = new org.jfree.chart.axis.NumberAxis("");
    boolean var39 = var38.getAutoRangeStickyZero();
    double var40 = var38.getUpperMargin();
    java.awt.Shape var41 = var38.getUpArrow();
    var38.setTickMarkInsideLength(0.0f);
    boolean var44 = var38.isTickMarksVisible();
    java.awt.Shape var45 = var38.getRightArrow();
    var33.setLeftArrow(var45);
    java.awt.Stroke var47 = var33.getAxisLineStroke();
    var20.setRangeGridlineStroke(var47);
    boolean var49 = var1.equals((java.lang.Object)var20);
    org.jfree.chart.plot.CategoryPlot var51 = new org.jfree.chart.plot.CategoryPlot();
    var51.clearRangeAxes();
    boolean var53 = var51.isSubplot();
    var51.setAnchorValue(Double.POSITIVE_INFINITY);
    org.jfree.chart.util.Layer var56 = null;
    java.util.Collection var57 = var51.getDomainMarkers(var56);
    double var58 = var51.getAnchorValue();
    org.jfree.chart.axis.NumberAxis var60 = new org.jfree.chart.axis.NumberAxis("");
    boolean var61 = var60.getAutoRangeStickyZero();
    double var62 = var60.getUpperMargin();
    java.awt.Shape var63 = var60.getUpArrow();
    var60.setTickMarkInsideLength(0.0f);
    boolean var66 = var60.isTickMarksVisible();
    java.awt.Graphics2D var67 = null;
    org.jfree.chart.axis.AxisState var68 = null;
    java.awt.geom.Rectangle2D var69 = null;
    org.jfree.chart.util.RectangleEdge var70 = null;
    java.util.List var71 = var60.refreshTicks(var67, var68, var69, var70);
    java.lang.Object var72 = null;
    boolean var73 = var60.equals(var72);
    boolean var74 = var60.isInverted();
    boolean var75 = var60.isAutoTickUnitSelection();
    org.jfree.chart.plot.CategoryPlot var76 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var77 = null;
    var76.notifyListeners(var77);
    org.jfree.chart.plot.DatasetRenderingOrder var79 = var76.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var80 = null;
    var76.rendererChanged(var80);
    int var82 = var76.getDomainAxisCount();
    boolean var83 = var60.hasListener((java.util.EventListener)var76);
    org.jfree.chart.plot.CategoryPlot var85 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var86 = null;
    var85.notifyListeners(var86);
    org.jfree.chart.axis.AxisLocation var89 = null;
    var85.setRangeAxisLocation(100, var89);
    org.jfree.chart.renderer.category.CategoryItemRenderer var91 = var85.getRenderer();
    org.jfree.chart.axis.AxisLocation var92 = var85.getRangeAxisLocation();
    var76.setRangeAxisLocation(15, var92, true);
    var51.setDomainAxisLocation(var92, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.setRangeAxisLocation((-16777216), var92);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.util.ObjectList var1 = new org.jfree.chart.util.ObjectList();
    var1.set(255, (java.lang.Object)(-1.0d));
    var1.clear();
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var8 = var7.getLabelPaint();
    org.jfree.chart.axis.TickUnits var9 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    java.awt.Stroke var19 = var11.getTickMarkStroke();
    boolean var20 = var9.equals((java.lang.Object)var19);
    var7.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var9);
    org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var24 = null;
    boolean var25 = var23.hasListener(var24);
    var23.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var29 = var23.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var32 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var33 = var32.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var34 = null;
    var32.removeChangeListener(var34);
    java.awt.Stroke var36 = var32.getStroke();
    int var37 = var29.compareTo((java.lang.Object)var36);
    var9.add((org.jfree.chart.axis.TickUnit)var29);
    int var39 = var1.indexOf((java.lang.Object)var9);
    org.jfree.chart.axis.TickUnit var41 = var9.getCeilingTickUnit(0.2d);
    org.jfree.chart.axis.NumberAxis var43 = new org.jfree.chart.axis.NumberAxis("");
    boolean var44 = var43.getAutoRangeStickyZero();
    double var45 = var43.getUpperMargin();
    java.awt.Shape var46 = var43.getUpArrow();
    var43.setTickMarkInsideLength(0.0f);
    boolean var49 = var43.isTickMarksVisible();
    java.awt.Shape var50 = var43.getRightArrow();
    java.awt.Stroke var51 = var43.getTickMarkStroke();
    org.jfree.chart.axis.NumberTickUnit var52 = var43.getTickUnit();
    org.jfree.chart.axis.TickUnit var53 = var9.getLargerTickUnit((org.jfree.chart.axis.TickUnit)var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var54 = var0.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var52);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    java.awt.Color var1 = java.awt.Color.getColor("RangeType.FULL");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     var0.setLowerMargin(4.0d);
//     var0.clearCategoryLabelToolTips();
//     java.awt.Font var5 = null;
//     var0.setTickLabelFont((java.lang.Comparable)(-1.0f), var5);
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.axis.AxisLocation var14 = null;
//     var10.setRangeAxisLocation(100, var14);
//     org.jfree.chart.util.RectangleEdge var16 = var10.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var17 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var16);
//     double var18 = var0.getCategoryMiddle(255, 0, var9, var16);
// 
//   }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.CategoryAxis var8 = var0.getDomainAxisForDataset(2);
    var0.setRangeCrosshairVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var5 = null;
//     boolean var6 = var4.hasListener(var5);
//     var4.resizeRange(100.0d, 1.0d);
//     boolean var10 = var1.equals((java.lang.Object)100.0d);
//     org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var14 = var13.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var15 = null;
//     var13.removeChangeListener(var15);
//     java.awt.Stroke var17 = var13.getStroke();
//     var1.setTickMarkStroke(var17);
//     java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var23 = null;
//     java.awt.Rectangle var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     java.awt.geom.AffineTransform var26 = null;
//     java.awt.RenderingHints var27 = null;
//     java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
//     var1.setTickMarkPaint((java.awt.Paint)var22);
//     org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var32 = var31.getAutoRangeStickyZero();
//     org.jfree.chart.axis.NumberAxis var34 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var35 = null;
//     boolean var36 = var34.hasListener(var35);
//     var34.resizeRange(100.0d, 1.0d);
//     boolean var40 = var31.equals((java.lang.Object)100.0d);
//     org.jfree.chart.plot.IntervalMarker var43 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var44 = var43.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var45 = null;
//     var43.removeChangeListener(var45);
//     java.awt.Stroke var47 = var43.getStroke();
//     var31.setTickMarkStroke(var47);
//     java.awt.Color var52 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var53 = null;
//     java.awt.Rectangle var54 = null;
//     java.awt.geom.Rectangle2D var55 = null;
//     java.awt.geom.AffineTransform var56 = null;
//     java.awt.RenderingHints var57 = null;
//     java.awt.PaintContext var58 = var52.createContext(var53, var54, var55, var56, var57);
//     var31.setTickMarkPaint((java.awt.Paint)var52);
//     java.awt.Color var66 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var67 = null;
//     java.awt.Rectangle var68 = null;
//     java.awt.geom.Rectangle2D var69 = null;
//     java.awt.geom.AffineTransform var70 = null;
//     java.awt.RenderingHints var71 = null;
//     java.awt.PaintContext var72 = var66.createContext(var67, var68, var69, var70, var71);
//     float[] var76 = new float[] { 100.0f, 0.0f, 10.0f};
//     float[] var77 = var66.getColorComponents(var76);
//     float[] var78 = java.awt.Color.RGBtoHSB(10, (-254), 0, var77);
//     float[] var79 = var52.getRGBColorComponents(var77);
//     float[] var80 = var22.getRGBColorComponents(var77);
//     
//     // Checks the contract:  equals-hashcode on var13 and var43
//     assertTrue("Contract failed: equals-hashcode on var13 and var43", var13.equals(var43) ? var13.hashCode() == var43.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var43 and var13
//     assertTrue("Contract failed: equals-hashcode on var43 and var13", var43.equals(var13) ? var43.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setAnchorValue(2.0d, true);
    org.jfree.chart.plot.Plot var11 = var0.getParent();
    float var12 = var0.getBackgroundImageAlpha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
    boolean var14 = var13.getAutoRangeStickyZero();
    double var15 = var13.getUpperMargin();
    java.awt.Shape var16 = var13.getUpArrow();
    var13.setTickMarkInsideLength(0.0f);
    boolean var19 = var13.isTickMarksVisible();
    java.awt.Shape var20 = var13.getRightArrow();
    var8.setLeftArrow(var20);
    java.awt.Stroke var22 = var8.getAxisLineStroke();
    var8.setAutoRangeIncludesZero(false);
    org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
    boolean var26 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.plot.PlotRenderingInfo var29 = null;
    java.awt.geom.Rectangle2D var30 = null;
    org.jfree.chart.util.RectangleAnchor var31 = null;
    java.awt.geom.Point2D var32 = org.jfree.chart.util.RectangleAnchor.coordinates(var30, var31);
    var0.zoomDomainAxes(2.0d, (-46.0d), var29, var32);
    double var34 = var0.getAnchorValue();
    org.jfree.chart.plot.DatasetRenderingOrder var35 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDatasetRenderingOrder(var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setVerticalTickLabels(false);
    org.jfree.chart.axis.MarkerAxisBand var4 = null;
    var1.setMarkerBand(var4);
    boolean var6 = var1.isAutoRange();
    boolean var7 = var1.isNegativeArrowVisible();
    var1.setTickMarksVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    org.jfree.chart.util.RectangleInsets var5 = var1.getTickLabelInsets();
    var1.setFixedAutoRange(0.0d);
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    boolean var10 = var9.getAutoRangeStickyZero();
    double var11 = var9.getUpperMargin();
    java.awt.Shape var12 = var9.getUpArrow();
    var9.setTickMarkInsideLength(0.0f);
    boolean var15 = var9.isTickMarksVisible();
    org.jfree.chart.plot.Plot var16 = null;
    var9.setPlot(var16);
    org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
    boolean var20 = var19.getAutoRangeStickyZero();
    double var21 = var19.getUpperMargin();
    java.awt.Shape var22 = var19.getUpArrow();
    var19.setTickMarkInsideLength(0.0f);
    boolean var25 = var19.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var27 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var28 = null;
    boolean var29 = var27.hasListener(var28);
    var27.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var33 = var27.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var36 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var37 = var36.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var38 = null;
    var36.removeChangeListener(var38);
    java.awt.Stroke var40 = var36.getStroke();
    int var41 = var33.compareTo((java.lang.Object)var40);
    var19.setTickUnit(var33);
    var9.setTickUnit(var33);
    java.lang.String var44 = var33.toString();
    var1.setTickUnit(var33);
    java.lang.String var46 = var1.getLabelURL();
    java.awt.Stroke var47 = var1.getAxisLineStroke();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[size=1]"+ "'", var44.equals("[size=1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    boolean var3 = var0.isRangeGridlinesVisible();
    org.jfree.chart.annotations.CategoryAnnotation var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.removeAnnotation(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.resizeRange(108.0d, 0.0d);
    java.awt.Shape var8 = var1.getUpArrow();
    org.jfree.data.Range var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRange(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.util.RectangleEdge var10 = null;
//     double var11 = var0.getCategoryStart(1, (-1), var9, var10);
//     double var12 = var0.getUpperMargin();
//     var0.setMaximumCategoryLabelWidthRatio(1.0f);
//     java.lang.Object var15 = var0.clone();
//     java.lang.String var16 = var0.getLabelToolTip();
//     org.jfree.chart.plot.IntervalMarker var19 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var20 = var19.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var21 = null;
//     var19.removeChangeListener(var21);
//     org.jfree.chart.util.RectangleInsets var27 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     var19.setLabelOffset(var27);
//     boolean var30 = var19.equals((java.lang.Object)0.05d);
//     org.jfree.chart.util.LengthAdjustmentType var31 = var19.getLabelOffsetType();
//     org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var33 = null;
//     var32.notifyListeners(var33);
//     org.jfree.chart.axis.AxisLocation var36 = null;
//     var32.setRangeAxisLocation(100, var36);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var38 = var32.getRenderer();
//     java.awt.Graphics2D var39 = null;
//     java.awt.geom.Rectangle2D var40 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var42 = null;
//     boolean var43 = var32.render(var39, var40, (-1), var42);
//     org.jfree.chart.plot.ValueMarker var45 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var32.addRangeMarker((org.jfree.chart.plot.Marker)var45);
//     var19.addChangeListener((org.jfree.chart.event.MarkerChangeListener)var32);
//     boolean var48 = var0.equals((java.lang.Object)var19);
//     org.jfree.chart.plot.CategoryPlot var49 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var50 = null;
//     var49.notifyListeners(var50);
//     org.jfree.chart.plot.DatasetRenderingOrder var52 = var49.getDatasetRenderingOrder();
//     int var53 = var49.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var55 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var58 = null;
//     org.jfree.chart.util.RectangleEdge var59 = null;
//     double var60 = var55.getCategoryMiddle(1, 0, var58, var59);
//     double var61 = var55.getUpperMargin();
//     float var62 = var55.getMaximumCategoryLabelWidthRatio();
//     var49.setDomainAxis(2, var55);
//     org.jfree.chart.axis.CategoryAnchor var64 = var49.getDomainGridlinePosition();
//     java.awt.geom.Rectangle2D var67 = null;
//     org.jfree.chart.plot.CategoryPlot var68 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var69 = null;
//     var68.notifyListeners(var69);
//     org.jfree.chart.axis.AxisLocation var72 = null;
//     var68.setRangeAxisLocation(100, var72);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var74 = var68.getRenderer();
//     org.jfree.chart.axis.AxisLocation var75 = var68.getRangeAxisLocation();
//     var68.setAnchorValue(2.0d, true);
//     org.jfree.chart.plot.Plot var79 = var68.getParent();
//     org.jfree.chart.util.RectangleEdge var80 = var68.getDomainAxisEdge();
//     double var81 = var0.getCategoryJava2DCoordinate(var64, (-16777216), (-1), var67, var80);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    var2.setStartValue(0.0d);
    org.jfree.chart.util.GradientPaintTransformer var8 = var2.getGradientPaintTransformer();
    double var9 = var2.getEndValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10.0d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    var1.setLowerBound(8.0d);
    org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var11 = null;
    boolean var12 = var10.hasListener(var11);
    var10.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var16 = var10.getTickUnit();
    org.jfree.data.Range var19 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var21 = org.jfree.data.Range.shift(var19, (-1.0d));
    var10.setRangeWithMargins(var19, false, true);
    org.jfree.data.Range var27 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var28 = var27.getLowerBound();
    double var29 = var27.getCentralValue();
    org.jfree.data.Range var30 = org.jfree.data.Range.combine(var19, var27);
    var1.setRange(var27, false, false);
    org.jfree.chart.axis.NumberAxis var35 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var36 = null;
    boolean var37 = var35.hasListener(var36);
    double var38 = var35.getFixedDimension();
    var35.setTickMarksVisible(false);
    var35.setLabelURL("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]");
    org.jfree.chart.axis.NumberAxis var44 = new org.jfree.chart.axis.NumberAxis("");
    boolean var45 = var44.getAutoRangeStickyZero();
    double var46 = var44.getUpperMargin();
    java.awt.Shape var47 = var44.getUpArrow();
    var44.setTickMarkInsideLength(0.0f);
    boolean var50 = var44.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var55 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var57 = var55.trimWidth(0.0d);
    double var59 = var55.calculateRightOutset(0.0d);
    double var60 = var55.getBottom();
    var44.setTickLabelInsets(var55);
    double var62 = var55.getTop();
    var35.setLabelInsets(var55);
    var1.setTickLabelInsets(var55);
    double var66 = var55.calculateRightInset((-99.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 100.0d);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
    java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
    var0.setRangeGridlinesVisible(false);
    org.jfree.chart.axis.ValueAxis var9 = var0.getRangeAxis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    var2.setLabel("");
    java.awt.Color var8 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var9 = var8.darker();
    var2.setPaint((java.awt.Paint)var8);
    java.awt.Color var11 = var8.brighter();
    org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var13 = null;
    var12.notifyListeners(var13);
    org.jfree.chart.plot.DatasetRenderingOrder var15 = var12.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var16 = null;
    var12.rendererChanged(var16);
    int var18 = var12.getDomainAxisCount();
    org.jfree.chart.renderer.category.CategoryItemRenderer var20 = null;
    var12.setRenderer(10, var20);
    org.jfree.data.general.DatasetChangeEvent var22 = null;
    var12.datasetChanged(var22);
    boolean var24 = var8.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    java.awt.Paint var2 = null;
    org.jfree.chart.plot.CategoryPlot var3 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var4 = null;
    var3.notifyListeners(var4);
    org.jfree.chart.axis.AxisLocation var7 = null;
    var3.setRangeAxisLocation(100, var7);
    java.awt.Graphics2D var9 = null;
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.plot.PlotRenderingInfo var12 = null;
    boolean var13 = var3.render(var9, var10, (-1), var12);
    java.awt.Stroke var14 = var3.getRangeGridlineStroke();
    org.jfree.chart.axis.CategoryAxis var15 = new org.jfree.chart.axis.CategoryAxis();
    boolean var16 = var15.isAxisLineVisible();
    java.lang.Object var17 = var15.clone();
    org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var20 = null;
    var19.notifyListeners(var20);
    org.jfree.chart.axis.AxisLocation var23 = null;
    var19.setRangeAxisLocation(100, var23);
    org.jfree.chart.util.RectangleEdge var25 = var19.getDomainAxisEdge();
    org.jfree.chart.plot.DatasetRenderingOrder var26 = var19.getDatasetRenderingOrder();
    java.awt.Paint var27 = var19.getRangeCrosshairPaint();
    org.jfree.chart.plot.IntervalMarker var30 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var31 = var30.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var32 = null;
    var30.removeChangeListener(var32);
    org.jfree.chart.axis.NumberAxis var35 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var36 = var35.getLabelPaint();
    var30.setOutlinePaint(var36);
    java.awt.Paint var38 = var30.getLabelPaint();
    var19.setNoDataMessagePaint(var38);
    var15.setTickLabelPaint((java.lang.Comparable)100.0d, var38);
    org.jfree.chart.axis.NumberAxis var42 = new org.jfree.chart.axis.NumberAxis("");
    boolean var43 = var42.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var45 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var46 = null;
    boolean var47 = var45.hasListener(var46);
    var45.resizeRange(100.0d, 1.0d);
    boolean var51 = var42.equals((java.lang.Object)100.0d);
    org.jfree.chart.plot.IntervalMarker var54 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var55 = var54.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var56 = null;
    var54.removeChangeListener(var56);
    java.awt.Stroke var58 = var54.getStroke();
    var42.setTickMarkStroke(var58);
    org.jfree.chart.JFreeChart var60 = null;
    org.jfree.chart.event.ChartChangeEvent var61 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var58, var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.IntervalMarker var63 = new org.jfree.chart.plot.IntervalMarker(100.0d, 10.0d, var2, var14, var38, var58, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    var1.setAutoRangeIncludesZero(true);
    var1.setLabelURL("hi!");
    java.text.NumberFormat var9 = null;
    var1.setNumberFormatOverride(var9);
    var1.setUpperMargin((-47.0d));
    var1.setUpperMargin(1.0d);
    var1.setInverted(true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.PlotOrientation var3 = var0.getOrientation();
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    org.jfree.chart.axis.CategoryLabelPositions var7 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var8 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var9 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var10 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var12 = new org.jfree.chart.axis.CategoryLabelPositions(var8, var9, var10, var11);
    org.jfree.chart.axis.CategoryLabelWidthType var13 = var8.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var14 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var7, var8);
    org.jfree.chart.axis.CategoryLabelPositions var16 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var17 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var18 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var19 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var20 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var21 = new org.jfree.chart.axis.CategoryLabelPositions(var17, var18, var19, var20);
    org.jfree.chart.axis.CategoryLabelWidthType var22 = var17.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var23 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var16, var17);
    org.jfree.chart.axis.CategoryLabelPosition var24 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var25 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var26 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var27 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var28 = new org.jfree.chart.axis.CategoryLabelPositions(var24, var25, var26, var27);
    org.jfree.chart.axis.CategoryLabelPosition var29 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var30 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var31 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var32 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var33 = new org.jfree.chart.axis.CategoryLabelPositions(var29, var30, var31, var32);
    org.jfree.chart.axis.CategoryLabelPositions var34 = new org.jfree.chart.axis.CategoryLabelPositions(var8, var17, var26, var30);
    boolean var35 = var3.equals((java.lang.Object)var8);
    double var36 = var8.getAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     double var6 = var5.getLabelAngle();
//     java.awt.Stroke var7 = var5.getAxisLineStroke();
//     var0.setDomainGridlineStroke(var7);
//     org.jfree.chart.plot.IntervalMarker var12 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var13 = var12.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var14 = null;
//     var12.removeChangeListener(var14);
//     org.jfree.chart.util.RectangleAnchor var16 = var12.getLabelAnchor();
//     org.jfree.chart.util.Layer var17 = null;
//     var0.addRangeMarker(10, (org.jfree.chart.plot.Marker)var12, var17);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var20 = null;
//     var0.setRenderer(4, var20, false);
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var24 = null;
//     var23.notifyListeners(var24);
//     org.jfree.chart.plot.DatasetRenderingOrder var26 = var23.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var27 = null;
//     var23.rendererChanged(var27);
//     int var29 = var23.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var30 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var23);
//     var0.notifyListeners(var30);
//     java.awt.Graphics2D var32 = null;
//     java.awt.geom.Rectangle2D var33 = null;
//     var0.drawBackground(var32, var33);
// 
//   }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     double var1 = var0.getLowerMargin();
//     org.jfree.chart.axis.CategoryLabelPositions var3 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
//     var0.setCategoryLabelPositions(var3);
//     java.awt.Graphics2D var5 = null;
//     java.awt.geom.Rectangle2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.axis.CategoryLabelPositions var9 = new org.jfree.chart.axis.CategoryLabelPositions();
//     org.jfree.chart.axis.CategoryLabelPosition var10 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var11 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var13 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var14 = new org.jfree.chart.axis.CategoryLabelPositions(var10, var11, var12, var13);
//     boolean var16 = var12.equals((java.lang.Object)108.0d);
//     org.jfree.chart.axis.CategoryLabelPositions var17 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var9, var12);
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var19 = null;
//     var18.notifyListeners(var19);
//     org.jfree.chart.util.RectangleEdge var21 = var18.getDomainAxisEdge();
//     org.jfree.chart.axis.CategoryLabelPosition var22 = var17.getLabelPosition(var21);
//     org.jfree.chart.plot.PlotRenderingInfo var23 = null;
//     org.jfree.chart.axis.AxisState var24 = var0.draw(var5, Double.POSITIVE_INFINITY, var7, var8, var21, var23);
// 
//   }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.data.Range var7 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var8 = var7.getLowerBound();
    double var9 = var7.getLowerBound();
    var1.setDefaultAutoRange(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeAboutValue(100.0d, (-47.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-100.0d));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    java.awt.Image var5 = var0.getBackgroundImage();
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var8 = null;
    boolean var9 = var7.hasListener(var8);
    var7.resizeRange(100.0d, 1.0d);
    java.awt.Stroke var13 = var7.getTickMarkStroke();
    var0.setRangeGridlineStroke(var13);
    org.jfree.chart.annotations.CategoryAnnotation var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var0.removeAnnotation(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    double var5 = var1.getUpperMargin();
    var1.setAutoRangeStickyZero(false);
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setAutoRange(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     int var6 = var0.getDomainAxisCount();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.plot.DatasetRenderingOrder var10 = var7.getDatasetRenderingOrder();
//     int var11 = var7.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var13 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.util.RectangleEdge var17 = null;
//     double var18 = var13.getCategoryMiddle(1, 0, var16, var17);
//     double var19 = var13.getUpperMargin();
//     float var20 = var13.getMaximumCategoryLabelWidthRatio();
//     var7.setDomainAxis(2, var13);
//     org.jfree.chart.axis.CategoryAnchor var22 = var7.getDomainGridlinePosition();
//     org.jfree.chart.event.ChartChangeEvent var23 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var22);
//     java.lang.String var24 = var22.toString();
//     var0.setDomainGridlinePosition(var22);
//     
//     // Checks the contract:  equals-hashcode on var0 and var7
//     assertTrue("Contract failed: equals-hashcode on var0 and var7", var0.equals(var7) ? var0.hashCode() == var7.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var7.", var0.equals(var7) == var7.equals(var0));
// 
//   }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    var0.clearDomainMarkers(0);
    org.jfree.chart.renderer.category.CategoryItemRenderer var7 = null;
    int var8 = var0.getIndexOf(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     java.awt.Font var3 = var2.getLabelFont();
//     float var4 = var2.getAlpha();
//     double var5 = var2.getEndValue();
//     org.jfree.chart.plot.IntervalMarker var8 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var9 = var8.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var10 = null;
//     var8.removeChangeListener(var10);
//     org.jfree.chart.util.RectangleAnchor var12 = var8.getLabelAnchor();
//     java.lang.Object var13 = var8.clone();
//     java.awt.Stroke var14 = var8.getOutlineStroke();
//     var2.setStroke(var14);
//     
//     // Checks the contract:  equals-hashcode on var2 and var8
//     assertTrue("Contract failed: equals-hashcode on var2 and var8", var2.equals(var8) ? var2.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var2
//     assertTrue("Contract failed: equals-hashcode on var8 and var2", var8.equals(var2) ? var8.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test337() {}
//   public void test337() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var4 = null;
//     var0.rendererChanged(var4);
//     int var6 = var0.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var7 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var0);
//     double var8 = var0.getAnchorValue();
//     org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis();
//     double var10 = var9.getLowerMargin();
//     org.jfree.chart.axis.CategoryLabelPositions var12 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
//     var9.setCategoryLabelPositions(var12);
//     var9.removeCategoryLabelToolTip((java.lang.Comparable)"SortOrder.ASCENDING");
//     java.util.List var16 = var0.getCategoriesForAxis(var9);
//     java.awt.Color var20 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.Color var21 = var20.darker();
//     int var22 = var21.getRed();
//     java.awt.Color var26 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var27 = null;
//     java.awt.Rectangle var28 = null;
//     java.awt.geom.Rectangle2D var29 = null;
//     java.awt.geom.AffineTransform var30 = null;
//     java.awt.RenderingHints var31 = null;
//     java.awt.PaintContext var32 = var26.createContext(var27, var28, var29, var30, var31);
//     float[] var36 = new float[] { 100.0f, 0.0f, 10.0f};
//     float[] var37 = var26.getColorComponents(var36);
//     java.awt.color.ColorSpace var38 = var26.getColorSpace();
//     float[] var42 = new float[] { 1.0f, 100.0f, 0.0f};
//     float[] var43 = var21.getColorComponents(var38, var42);
//     boolean var44 = var0.equals((java.lang.Object)var43);
//     org.jfree.chart.plot.CategoryPlot var45 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var46 = null;
//     var45.notifyListeners(var46);
//     org.jfree.chart.plot.PlotOrientation var48 = var45.getOrientation();
//     java.lang.Object var49 = null;
//     boolean var50 = var48.equals(var49);
//     org.jfree.chart.axis.CategoryLabelPositions var52 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
//     org.jfree.chart.axis.CategoryLabelPosition var53 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var54 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var55 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var56 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var57 = new org.jfree.chart.axis.CategoryLabelPositions(var53, var54, var55, var56);
//     org.jfree.chart.axis.CategoryLabelWidthType var58 = var53.getWidthType();
//     org.jfree.chart.axis.CategoryLabelPositions var59 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var52, var53);
//     org.jfree.chart.axis.CategoryLabelPositions var61 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
//     org.jfree.chart.axis.CategoryLabelPosition var62 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var63 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var64 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var65 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var66 = new org.jfree.chart.axis.CategoryLabelPositions(var62, var63, var64, var65);
//     org.jfree.chart.axis.CategoryLabelWidthType var67 = var62.getWidthType();
//     org.jfree.chart.axis.CategoryLabelPositions var68 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var61, var62);
//     org.jfree.chart.axis.CategoryLabelPosition var69 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var70 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var71 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var72 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var73 = new org.jfree.chart.axis.CategoryLabelPositions(var69, var70, var71, var72);
//     org.jfree.chart.axis.CategoryLabelPosition var74 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var75 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var76 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var77 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var78 = new org.jfree.chart.axis.CategoryLabelPositions(var74, var75, var76, var77);
//     org.jfree.chart.axis.CategoryLabelPositions var79 = new org.jfree.chart.axis.CategoryLabelPositions(var53, var62, var71, var75);
//     boolean var80 = var48.equals((java.lang.Object)var53);
//     var0.setOrientation(var48);
//     
//     // Checks the contract:  equals-hashcode on var0 and var45
//     assertTrue("Contract failed: equals-hashcode on var0 and var45", var0.equals(var45) ? var0.hashCode() == var45.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var45 and var0
//     assertTrue("Contract failed: equals-hashcode on var45 and var0", var45.equals(var0) ? var45.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test338() {}
//   public void test338() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     org.jfree.data.general.DatasetGroup var4 = var0.getDatasetGroup();
//     var0.setBackgroundAlpha(0.0f);
//     org.jfree.chart.plot.IntervalMarker var9 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var10 = var9.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var11 = null;
//     var9.removeChangeListener(var11);
//     var9.setEndValue(1.0d);
//     var0.addRangeMarker((org.jfree.chart.plot.Marker)var9);
//     java.lang.Class var16 = null;
//     java.util.EventListener[] var17 = var9.getListeners(var16);
// 
//   }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     double var5 = var1.getUpperMargin();
//     var1.setAutoRangeStickyZero(false);
//     java.awt.Shape var8 = var1.getRightArrow();
//     boolean var9 = var1.isAutoTickUnitSelection();
//     java.awt.Graphics2D var10 = null;
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var12 = null;
//     var11.notifyListeners(var12);
//     org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
//     java.lang.String var15 = var11.getPlotType();
//     java.awt.Paint var16 = var11.getRangeGridlinePaint();
//     org.jfree.chart.axis.AxisLocation var17 = var11.getDomainAxisLocation();
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.plot.CategoryPlot var19 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var20 = null;
//     var19.notifyListeners(var20);
//     org.jfree.chart.axis.AxisLocation var23 = null;
//     var19.setRangeAxisLocation(100, var23);
//     org.jfree.chart.util.RectangleEdge var25 = var19.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var26 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var25);
//     org.jfree.chart.axis.AxisSpace var27 = null;
//     org.jfree.chart.axis.AxisSpace var28 = var1.reserveSpace(var10, (org.jfree.chart.plot.Plot)var11, var18, var25, var27);
// 
//   }

  public void test340() {}
//   public void test340() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     double var6 = var5.getLabelAngle();
//     java.awt.Stroke var7 = var5.getAxisLineStroke();
//     var0.setDomainGridlineStroke(var7);
//     org.jfree.chart.plot.IntervalMarker var12 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var13 = var12.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var14 = null;
//     var12.removeChangeListener(var14);
//     org.jfree.chart.util.RectangleAnchor var16 = var12.getLabelAnchor();
//     org.jfree.chart.util.Layer var17 = null;
//     var0.addRangeMarker(10, (org.jfree.chart.plot.Marker)var12, var17);
//     org.jfree.chart.util.Layer var20 = null;
//     java.util.Collection var21 = var0.getRangeMarkers(0, var20);
//     org.jfree.chart.plot.IntervalMarker var24 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var25 = var24.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var26 = null;
//     var24.removeChangeListener(var26);
//     org.jfree.chart.util.RectangleAnchor var28 = var24.getLabelAnchor();
//     double var29 = var24.getStartValue();
//     org.jfree.chart.util.Layer var30 = null;
//     var0.addRangeMarker((org.jfree.chart.plot.Marker)var24, var30);
//     
//     // Checks the contract:  equals-hashcode on var12 and var24
//     assertTrue("Contract failed: equals-hashcode on var12 and var24", var12.equals(var24) ? var12.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var12
//     assertTrue("Contract failed: equals-hashcode on var24 and var12", var24.equals(var12) ? var24.hashCode() == var12.hashCode() : true);
// 
//   }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var12 = null;
    var0.setRenderer(1, var12);
    org.jfree.chart.axis.ValueAxis var14 = var0.getRangeAxis();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    boolean var1 = var0.isAxisLineVisible();
    java.lang.Object var2 = var0.clone();
    org.jfree.chart.plot.CategoryPlot var4 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var5 = null;
    var4.notifyListeners(var5);
    org.jfree.chart.axis.AxisLocation var8 = null;
    var4.setRangeAxisLocation(100, var8);
    org.jfree.chart.util.RectangleEdge var10 = var4.getDomainAxisEdge();
    org.jfree.chart.plot.DatasetRenderingOrder var11 = var4.getDatasetRenderingOrder();
    java.awt.Paint var12 = var4.getRangeCrosshairPaint();
    org.jfree.chart.plot.IntervalMarker var15 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var16 = var15.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var17 = null;
    var15.removeChangeListener(var17);
    org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var21 = var20.getLabelPaint();
    var15.setOutlinePaint(var21);
    java.awt.Paint var23 = var15.getLabelPaint();
    var4.setNoDataMessagePaint(var23);
    var0.setTickLabelPaint((java.lang.Comparable)100.0d, var23);
    var0.configure();
    org.jfree.chart.axis.CategoryLabelPositions var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCategoryLabelPositions(var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var8 = null;
    var7.notifyListeners(var8);
    org.jfree.chart.util.RectangleEdge var10 = var7.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var11 = null;
    var7.setFixedRangeAxisSpace(var11);
    org.jfree.chart.axis.CategoryAxis var14 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var17 = null;
    org.jfree.chart.util.RectangleEdge var18 = null;
    double var19 = var14.getCategoryMiddle(1, 0, var17, var18);
    float var20 = var14.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var21 = var14.getLabelFont();
    var7.setDomainAxis(0, var14);
    org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var24 = null;
    var23.notifyListeners(var24);
    org.jfree.chart.axis.AxisLocation var27 = null;
    var23.setRangeAxisLocation(100, var27);
    java.awt.Graphics2D var29 = null;
    java.awt.geom.Rectangle2D var30 = null;
    org.jfree.chart.plot.PlotRenderingInfo var32 = null;
    boolean var33 = var23.render(var29, var30, (-1), var32);
    org.jfree.chart.util.SortOrder var34 = var23.getColumnRenderingOrder();
    var7.setRowRenderingOrder(var34);
    boolean var36 = var7.getDrawSharedDomainAxis();
    org.jfree.chart.axis.NumberAxis var38 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var39 = null;
    boolean var40 = var38.hasListener(var39);
    var38.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var44 = var38.getTickUnit();
    org.jfree.data.Range var47 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.chart.JFreeChart var48 = null;
    org.jfree.chart.event.ChartChangeEvent var49 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var47, var48);
    var38.setRangeWithMargins(var47, true, true);
    boolean var53 = var7.equals((java.lang.Object)var47);
    org.jfree.chart.plot.IntervalMarker var56 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.RectangleInsets var61 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    var56.setLabelOffset(var61);
    org.jfree.chart.util.Layer var63 = null;
    var7.addRangeMarker((org.jfree.chart.plot.Marker)var56, var63);
    var0.setPlot((org.jfree.chart.plot.Plot)var7);
    org.jfree.chart.renderer.category.CategoryItemRenderer var67 = var7.getRenderer(255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    java.awt.Paint var5 = var0.getRangeGridlinePaint();
    org.jfree.chart.axis.ValueAxis var7 = var0.getRangeAxisForDataset((-254));
    var0.setDrawSharedDomainAxis(false);
    org.jfree.chart.annotations.CategoryAnnotation var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    var2.setStartValue(0.0d);
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    var9.setRangeAboutValue(0.0d, 10.0d);
    var9.setAutoRangeIncludesZero(true);
    float var15 = var9.getTickMarkInsideLength();
    java.awt.Font var16 = var9.getTickLabelFont();
    var2.setLabelFont(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    double var2 = var1.getLabelAngle();
    float var3 = var1.getTickMarkOutsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     java.lang.String var4 = var0.getPlotType();
//     java.awt.Paint var5 = var0.getRangeGridlinePaint();
//     org.jfree.chart.axis.ValueAxis var7 = var0.getRangeAxisForDataset((-254));
//     var0.setDrawSharedDomainAxis(false);
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.axis.CategoryAxis var13 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.util.RectangleEdge var17 = null;
//     double var18 = var13.getCategoryMiddle(1, 0, var16, var17);
//     java.lang.Object var19 = var13.clone();
//     java.util.List var20 = var10.getCategoriesForAxis(var13);
//     org.jfree.chart.LegendItemCollection var21 = var10.getLegendItems();
//     var0.setFixedLegendItems(var21);
//     
//     // Checks the contract:  equals-hashcode on var0 and var10
//     assertTrue("Contract failed: equals-hashcode on var0 and var10", var0.equals(var10) ? var0.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var0
//     assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test348() {}
//   public void test348() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var6 = null;
//     org.jfree.chart.util.RectangleEdge var7 = null;
//     double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
//     java.lang.Object var9 = var3.clone();
//     java.util.List var10 = var0.getCategoriesForAxis(var3);
//     org.jfree.chart.axis.NumberAxis var12 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var13 = var12.getAutoRangeStickyZero();
//     double var14 = var12.getUpperMargin();
//     java.awt.Shape var15 = var12.getUpArrow();
//     var12.setTickMarkInsideLength(0.0f);
//     boolean var18 = var12.isTickMarksVisible();
//     java.awt.Shape var19 = var12.getRightArrow();
//     java.awt.Stroke var20 = var12.getTickMarkStroke();
//     org.jfree.chart.axis.NumberTickUnit var21 = var12.getTickUnit();
//     org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
//     var23.setVerticalTickLabels(false);
//     double var26 = var23.getUpperMargin();
//     java.lang.String var27 = var23.getLabelURL();
//     org.jfree.chart.axis.NumberAxis var29 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var30 = null;
//     boolean var31 = var29.hasListener(var30);
//     var29.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var35 = var29.getTickUnit();
//     var23.setTickUnit(var35);
//     java.awt.Font var37 = var23.getTickLabelFont();
//     var3.setTickLabelFont((java.lang.Comparable)var21, var37);
//     org.jfree.chart.axis.CategoryLabelPositions var39 = new org.jfree.chart.axis.CategoryLabelPositions();
//     org.jfree.chart.axis.CategoryLabelPosition var40 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var41 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var42 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var43 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var44 = new org.jfree.chart.axis.CategoryLabelPositions(var40, var41, var42, var43);
//     boolean var46 = var42.equals((java.lang.Object)108.0d);
//     org.jfree.chart.axis.CategoryLabelPositions var47 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var39, var42);
//     org.jfree.chart.plot.CategoryPlot var48 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var49 = null;
//     var48.notifyListeners(var49);
//     org.jfree.chart.util.RectangleEdge var51 = var48.getDomainAxisEdge();
//     org.jfree.chart.axis.CategoryLabelPosition var52 = var47.getLabelPosition(var51);
//     var3.setCategoryLabelPositions(var47);
//     
//     // Checks the contract:  equals-hashcode on var0 and var48
//     assertTrue("Contract failed: equals-hashcode on var0 and var48", var0.equals(var48) ? var0.hashCode() == var48.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var48 and var0
//     assertTrue("Contract failed: equals-hashcode on var48 and var0", var48.equals(var0) ? var48.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setTickMarkOutsideLength(10.0f);
    org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var12 = null;
    var11.notifyListeners(var12);
    org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
    var1.setPlot((org.jfree.chart.plot.Plot)var11);
    var11.configureRangeAxes();
    int var17 = var11.getBackgroundImageAlignment();
    org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var20 = null;
    boolean var21 = var19.hasListener(var20);
    double var22 = var19.getFixedDimension();
    java.awt.Font var23 = var19.getTickLabelFont();
    org.jfree.data.Range var24 = var11.getDataRange((org.jfree.chart.axis.ValueAxis)var19);
    org.jfree.chart.plot.Plot var25 = var19.getPlot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    java.awt.Paint var5 = var0.getRangeGridlinePaint();
    org.jfree.chart.axis.AxisSpace var6 = var0.getFixedDomainAxisSpace();
    org.jfree.chart.axis.CategoryAxis var8 = new org.jfree.chart.axis.CategoryAxis();
    boolean var9 = var8.isAxisLineVisible();
    java.lang.Object var10 = var8.clone();
    org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var13 = null;
    var12.notifyListeners(var13);
    org.jfree.chart.axis.AxisLocation var16 = null;
    var12.setRangeAxisLocation(100, var16);
    org.jfree.chart.util.RectangleEdge var18 = var12.getDomainAxisEdge();
    org.jfree.chart.plot.DatasetRenderingOrder var19 = var12.getDatasetRenderingOrder();
    java.awt.Paint var20 = var12.getRangeCrosshairPaint();
    org.jfree.chart.plot.IntervalMarker var23 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var24 = var23.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var25 = null;
    var23.removeChangeListener(var25);
    org.jfree.chart.axis.NumberAxis var28 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var29 = var28.getLabelPaint();
    var23.setOutlinePaint(var29);
    java.awt.Paint var31 = var23.getLabelPaint();
    var12.setNoDataMessagePaint(var31);
    var8.setTickLabelPaint((java.lang.Comparable)100.0d, var31);
    var8.configure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDomainAxis((-254), var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test351() {}
//   public void test351() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     var0.setLowerMargin(4.0d);
//     var0.clearCategoryLabelToolTips();
//     var0.setVisible(false);
//     java.awt.Graphics2D var6 = null;
//     org.jfree.chart.axis.AxisState var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.axis.AxisLocation var13 = null;
//     var9.setRangeAxisLocation(100, var13);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var15 = var9.getRenderer();
//     java.awt.Graphics2D var16 = null;
//     java.awt.geom.Rectangle2D var17 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var19 = null;
//     boolean var20 = var9.render(var16, var17, (-1), var19);
//     org.jfree.chart.axis.AxisLocation var22 = var9.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var23 = var22.getOpposite();
//     org.jfree.chart.axis.NumberAxis var25 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var26 = var25.getAutoRangeStickyZero();
//     double var27 = var25.getUpperMargin();
//     java.awt.Shape var28 = var25.getUpArrow();
//     var25.setTickMarkInsideLength(0.0f);
//     boolean var31 = var25.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var36 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var38 = var36.trimWidth(0.0d);
//     double var40 = var36.calculateRightOutset(0.0d);
//     double var41 = var36.getBottom();
//     var25.setTickLabelInsets(var36);
//     org.jfree.chart.axis.TickUnitSource var43 = var25.getStandardTickUnits();
//     var25.setRangeAboutValue((-1.0d), 0.0d);
//     var25.zoomRange((-100.0d), 1.0d);
//     org.jfree.chart.plot.CategoryPlot var50 = new org.jfree.chart.plot.CategoryPlot();
//     var50.clearRangeAxes();
//     boolean var52 = var50.isSubplot();
//     var50.setAnchorValue(Double.POSITIVE_INFINITY);
//     int var55 = var50.getBackgroundImageAlignment();
//     java.awt.Stroke var56 = var50.getDomainGridlineStroke();
//     var50.setForegroundAlpha(0.0f);
//     boolean var59 = var25.hasListener((java.util.EventListener)var50);
//     org.jfree.chart.plot.PlotOrientation var60 = var50.getOrientation();
//     org.jfree.chart.util.RectangleEdge var61 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var22, var60);
//     java.util.List var62 = var0.refreshTicks(var6, var7, var8, var61);
// 
//   }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var4 = var3.darker();
    java.awt.image.ColorModel var5 = null;
    java.awt.Rectangle var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    java.awt.geom.AffineTransform var8 = null;
    java.awt.RenderingHints var9 = null;
    java.awt.PaintContext var10 = var3.createContext(var5, var6, var7, var8, var9);
    java.awt.Color var14 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    int var15 = var14.getRGB();
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    float[] var32 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var33 = var22.getColorComponents(var32);
    float[] var34 = java.awt.Color.RGBtoHSB(10, (-254), 0, var33);
    float[] var35 = var14.getColorComponents(var34);
    float[] var36 = var3.getRGBColorComponents(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test353() {}
//   public void test353() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     var0.setMaximumCategoryLabelWidthRatio(1.0f);
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     boolean var13 = var11.isSubplot();
//     var11.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var17 = var11.getRangeAxisEdge(1);
//     double var18 = var0.getCategoryMiddle(0, 2, var10, var17);
// 
//   }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     double var9 = var1.getFixedAutoRange();
//     org.jfree.chart.util.ObjectList var10 = new org.jfree.chart.util.ObjectList();
//     var10.set(255, (java.lang.Object)(-1.0d));
//     var10.clear();
//     org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var17 = var16.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var18 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var21 = var20.getAutoRangeStickyZero();
//     double var22 = var20.getUpperMargin();
//     java.awt.Shape var23 = var20.getUpArrow();
//     var20.setTickMarkInsideLength(0.0f);
//     boolean var26 = var20.isTickMarksVisible();
//     java.awt.Shape var27 = var20.getRightArrow();
//     java.awt.Stroke var28 = var20.getTickMarkStroke();
//     boolean var29 = var18.equals((java.lang.Object)var28);
//     var16.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var18);
//     org.jfree.chart.axis.NumberAxis var32 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var33 = null;
//     boolean var34 = var32.hasListener(var33);
//     var32.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var38 = var32.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var41 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var42 = var41.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var43 = null;
//     var41.removeChangeListener(var43);
//     java.awt.Stroke var45 = var41.getStroke();
//     int var46 = var38.compareTo((java.lang.Object)var45);
//     var18.add((org.jfree.chart.axis.TickUnit)var38);
//     int var48 = var10.indexOf((java.lang.Object)var18);
//     org.jfree.chart.axis.TickUnit var50 = var18.getCeilingTickUnit(0.2d);
//     var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var18);
//     org.jfree.chart.axis.NumberAxis var53 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var54 = var53.getAutoRangeStickyZero();
//     double var55 = var53.getUpperMargin();
//     java.awt.Shape var56 = var53.getUpArrow();
//     var53.setTickMarkInsideLength(0.0f);
//     boolean var59 = var53.isTickMarksVisible();
//     org.jfree.chart.plot.Plot var60 = null;
//     var53.setPlot(var60);
//     org.jfree.chart.axis.NumberAxis var63 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var64 = var63.getAutoRangeStickyZero();
//     double var65 = var63.getUpperMargin();
//     java.awt.Shape var66 = var63.getUpArrow();
//     var63.setTickMarkInsideLength(0.0f);
//     boolean var69 = var63.isTickMarksVisible();
//     org.jfree.chart.axis.NumberAxis var71 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var72 = null;
//     boolean var73 = var71.hasListener(var72);
//     var71.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var77 = var71.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var80 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var81 = var80.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var82 = null;
//     var80.removeChangeListener(var82);
//     java.awt.Stroke var84 = var80.getStroke();
//     int var85 = var77.compareTo((java.lang.Object)var84);
//     var63.setTickUnit(var77);
//     var53.setTickUnit(var77);
//     org.jfree.chart.axis.TickUnit var88 = var18.getLargerTickUnit((org.jfree.chart.axis.TickUnit)var77);
//     
//     // Checks the contract:  equals-hashcode on var41 and var80
//     assertTrue("Contract failed: equals-hashcode on var41 and var80", var41.equals(var80) ? var41.hashCode() == var80.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var80 and var41
//     assertTrue("Contract failed: equals-hashcode on var80 and var41", var80.equals(var41) ? var80.hashCode() == var41.hashCode() : true);
// 
//   }

  public void test355() {}
//   public void test355() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var2 = var1.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var6 = var5.getAutoRangeStickyZero();
//     double var7 = var5.getUpperMargin();
//     java.awt.Shape var8 = var5.getUpArrow();
//     var5.setTickMarkInsideLength(0.0f);
//     boolean var11 = var5.isTickMarksVisible();
//     java.awt.Shape var12 = var5.getRightArrow();
//     java.awt.Stroke var13 = var5.getTickMarkStroke();
//     boolean var14 = var3.equals((java.lang.Object)var13);
//     var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
//     org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var18 = null;
//     boolean var19 = var17.hasListener(var18);
//     var17.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var23 = var17.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var27 = var26.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var28 = null;
//     var26.removeChangeListener(var28);
//     java.awt.Stroke var30 = var26.getStroke();
//     int var31 = var23.compareTo((java.lang.Object)var30);
//     var3.add((org.jfree.chart.axis.TickUnit)var23);
//     org.jfree.chart.util.ObjectList var33 = new org.jfree.chart.util.ObjectList();
//     var33.set(255, (java.lang.Object)(-1.0d));
//     var33.clear();
//     org.jfree.chart.axis.NumberAxis var39 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var40 = var39.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var41 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var43 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var44 = var43.getAutoRangeStickyZero();
//     double var45 = var43.getUpperMargin();
//     java.awt.Shape var46 = var43.getUpArrow();
//     var43.setTickMarkInsideLength(0.0f);
//     boolean var49 = var43.isTickMarksVisible();
//     java.awt.Shape var50 = var43.getRightArrow();
//     java.awt.Stroke var51 = var43.getTickMarkStroke();
//     boolean var52 = var41.equals((java.lang.Object)var51);
//     var39.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var41);
//     org.jfree.chart.axis.NumberAxis var55 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var56 = null;
//     boolean var57 = var55.hasListener(var56);
//     var55.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var61 = var55.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var64 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var65 = var64.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var66 = null;
//     var64.removeChangeListener(var66);
//     java.awt.Stroke var68 = var64.getStroke();
//     int var69 = var61.compareTo((java.lang.Object)var68);
//     var41.add((org.jfree.chart.axis.TickUnit)var61);
//     int var71 = var33.indexOf((java.lang.Object)var41);
//     org.jfree.chart.axis.TickUnit var73 = var41.getCeilingTickUnit(0.2d);
//     boolean var74 = var23.equals((java.lang.Object)var41);
//     
//     // Checks the contract:  equals-hashcode on var3 and var41
//     assertTrue("Contract failed: equals-hashcode on var3 and var41", var3.equals(var41) ? var3.hashCode() == var41.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var41 and var3
//     assertTrue("Contract failed: equals-hashcode on var41 and var3", var41.equals(var3) ? var41.hashCode() == var3.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var64
//     assertTrue("Contract failed: equals-hashcode on var26 and var64", var26.equals(var64) ? var26.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var26
//     assertTrue("Contract failed: equals-hashcode on var64 and var26", var64.equals(var26) ? var64.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var4 = null;
    var0.setFixedRangeAxisSpace(var4);
    org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
    float var13 = var7.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var14 = var7.getLabelFont();
    var0.setDomainAxis(0, var7);
    org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var17 = null;
    var16.notifyListeners(var17);
    org.jfree.chart.axis.AxisLocation var20 = null;
    var16.setRangeAxisLocation(100, var20);
    java.awt.Graphics2D var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    boolean var26 = var16.render(var22, var23, (-1), var25);
    org.jfree.chart.util.SortOrder var27 = var16.getColumnRenderingOrder();
    var0.setRowRenderingOrder(var27);
    boolean var29 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var32 = null;
    boolean var33 = var31.hasListener(var32);
    var31.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var37 = var31.getTickUnit();
    org.jfree.data.Range var40 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.chart.JFreeChart var41 = null;
    org.jfree.chart.event.ChartChangeEvent var42 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var40, var41);
    var31.setRangeWithMargins(var40, true, true);
    boolean var46 = var0.equals((java.lang.Object)var40);
    org.jfree.chart.plot.IntervalMarker var49 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.RectangleInsets var54 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    var49.setLabelOffset(var54);
    org.jfree.chart.util.Layer var56 = null;
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var49, var56);
    float var58 = var49.getAlpha();
    java.awt.Color var62 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var63 = null;
    java.awt.Rectangle var64 = null;
    java.awt.geom.Rectangle2D var65 = null;
    java.awt.geom.AffineTransform var66 = null;
    java.awt.RenderingHints var67 = null;
    java.awt.PaintContext var68 = var62.createContext(var63, var64, var65, var66, var67);
    float[] var69 = null;
    float[] var70 = var62.getComponents(var69);
    var49.setOutlinePaint((java.awt.Paint)var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(4.0d, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setRangeCrosshairLockedOnData(true);
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var11.setValue(8.0d);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    boolean var16 = var15.getAutoRangeStickyZero();
    double var17 = var15.getUpperMargin();
    java.awt.Shape var18 = var15.getUpArrow();
    var15.setTickMarkInsideLength(0.0f);
    boolean var21 = var15.isTickMarksVisible();
    org.jfree.chart.plot.Plot var22 = null;
    var15.setPlot(var22);
    boolean var25 = var15.equals((java.lang.Object)100.0f);
    org.jfree.data.Range var28 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var30 = org.jfree.data.Range.shift(var28, (-1.0d));
    var15.setRangeWithMargins(var30);
    boolean var32 = var11.equals((java.lang.Object)var30);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var11);
    org.jfree.chart.plot.IntervalMarker var36 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var37 = var36.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var38 = null;
    var36.removeChangeListener(var38);
    org.jfree.chart.util.RectangleAnchor var40 = var36.getLabelAnchor();
    var11.setLabelAnchor(var40);
    org.jfree.chart.axis.CategoryLabelPositions var43 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var44 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var45 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var46 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var47 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var48 = new org.jfree.chart.axis.CategoryLabelPositions(var44, var45, var46, var47);
    org.jfree.chart.axis.CategoryLabelWidthType var49 = var44.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var50 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var43, var44);
    double var51 = var44.getAngle();
    org.jfree.chart.text.TextBlockAnchor var52 = var44.getLabelAnchor();
    boolean var54 = var52.equals((java.lang.Object)10.0d);
    org.jfree.chart.axis.CategoryLabelWidthType var55 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var57 = new org.jfree.chart.axis.CategoryLabelPosition(var40, var52, var55, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     java.awt.geom.Rectangle2D var7 = null;
//     org.jfree.chart.util.RectangleEdge var8 = null;
//     double var9 = var1.valueToJava2D(8.0d, var7, var8);
//     org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var12 = var11.getAutoRangeStickyZero();
//     double var13 = var11.getUpperMargin();
//     java.awt.Shape var14 = var11.getUpArrow();
//     var11.setTickMarkInsideLength(0.0f);
//     boolean var17 = var11.isTickMarksVisible();
//     java.awt.Shape var18 = var11.getRightArrow();
//     var1.setRightArrow(var18);
//     var1.configure();
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var23 = null;
//     java.awt.geom.Rectangle2D var24 = null;
//     org.jfree.chart.plot.CategoryPlot var25 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var26 = null;
//     var25.notifyListeners(var26);
//     org.jfree.chart.axis.AxisLocation var29 = null;
//     var25.setRangeAxisLocation(100, var29);
//     org.jfree.chart.util.RectangleEdge var31 = var25.getDomainAxisEdge();
//     org.jfree.chart.plot.PlotRenderingInfo var32 = null;
//     org.jfree.chart.axis.AxisState var33 = var1.draw(var21, (-1.0d), var23, var24, var31, var32);
// 
//   }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     java.lang.Object var6 = var0.clone();
//     org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var8 = null;
//     var7.notifyListeners(var8);
//     org.jfree.chart.axis.AxisLocation var11 = null;
//     var7.setRangeAxisLocation(100, var11);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = var7.getRenderer();
//     java.awt.Graphics2D var14 = null;
//     java.awt.geom.Rectangle2D var15 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var17 = null;
//     boolean var18 = var7.render(var14, var15, (-1), var17);
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var7.addRangeMarker((org.jfree.chart.plot.Marker)var20);
//     var7.setBackgroundAlpha((-1.0f));
//     org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var25 = null;
//     var24.notifyListeners(var25);
//     org.jfree.chart.plot.DatasetRenderingOrder var27 = var24.getDatasetRenderingOrder();
//     int var28 = var24.getRangeAxisCount();
//     org.jfree.chart.axis.CategoryAxis var30 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var33 = null;
//     org.jfree.chart.util.RectangleEdge var34 = null;
//     double var35 = var30.getCategoryMiddle(1, 0, var33, var34);
//     double var36 = var30.getUpperMargin();
//     float var37 = var30.getMaximumCategoryLabelWidthRatio();
//     var24.setDomainAxis(2, var30);
//     org.jfree.chart.axis.CategoryAnchor var39 = var24.getDomainGridlinePosition();
//     var7.setDomainGridlinePosition(var39);
//     java.awt.geom.Rectangle2D var43 = null;
//     org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot();
//     var44.clearRangeAxes();
//     boolean var46 = var44.isSubplot();
//     var44.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var50 = var44.getRangeAxisEdge(1);
//     double var51 = var0.getCategoryJava2DCoordinate(var39, 0, 2, var43, var50);
// 
//   }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    java.awt.geom.Rectangle2D var9 = null;
    org.jfree.chart.util.RectangleEdge var10 = null;
    double var11 = var0.getCategoryStart(1, (-1), var9, var10);
    var0.setTickLabelsVisible(false);
    var0.clearCategoryLabelToolTips();
    java.lang.String var15 = var0.getLabelURL();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    org.jfree.chart.util.RectangleInsets var7 = var1.getTickLabelInsets();
    var1.setLowerMargin(4.0d);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    var11.setTickLabelPaint((java.awt.Paint)var22);
    var1.setLabelPaint((java.awt.Paint)var22);
    java.awt.Color var28 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var29 = var28.darker();
    int var30 = var29.getRed();
    java.awt.Color var34 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var35 = null;
    java.awt.Rectangle var36 = null;
    java.awt.geom.Rectangle2D var37 = null;
    java.awt.geom.AffineTransform var38 = null;
    java.awt.RenderingHints var39 = null;
    java.awt.PaintContext var40 = var34.createContext(var35, var36, var37, var38, var39);
    float[] var44 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var45 = var34.getColorComponents(var44);
    java.awt.color.ColorSpace var46 = var34.getColorSpace();
    float[] var50 = new float[] { 1.0f, 100.0f, 0.0f};
    float[] var51 = var29.getColorComponents(var46, var50);
    float[] var52 = var22.getRGBColorComponents(var51);
    int var53 = var22.getGreen();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 178);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 255);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
    boolean var14 = var13.getAutoRangeStickyZero();
    double var15 = var13.getUpperMargin();
    java.awt.Shape var16 = var13.getUpArrow();
    var13.setTickMarkInsideLength(0.0f);
    boolean var19 = var13.isTickMarksVisible();
    java.awt.Shape var20 = var13.getRightArrow();
    var8.setLeftArrow(var20);
    java.awt.Stroke var22 = var8.getAxisLineStroke();
    var8.setAutoRangeIncludesZero(false);
    org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
    boolean var26 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.axis.NumberAxis var29 = new org.jfree.chart.axis.NumberAxis("");
    boolean var30 = var29.getAutoRangeStickyZero();
    double var31 = var29.getUpperMargin();
    java.awt.Shape var32 = var29.getUpArrow();
    org.jfree.data.Range var35 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var36 = var35.getLowerBound();
    double var37 = var35.getLowerBound();
    var29.setDefaultAutoRange(var35);
    var0.setRangeAxis(10, (org.jfree.chart.axis.ValueAxis)var29, false);
    org.jfree.data.Range var43 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var44 = var43.getLowerBound();
    double var45 = var43.getLowerBound();
    double var46 = var43.getLength();
    double var47 = var43.getLength();
    var29.setRange(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 108.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 108.0d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var4 = null;
    var0.setFixedRangeAxisSpace(var4);
    org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
    float var13 = var7.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var14 = var7.getLabelFont();
    var0.setDomainAxis(0, var7);
    var7.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    boolean var11 = var0.render(var7, var8, (-1), var10);
    org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var13);
    var0.setBackgroundAlpha((-1.0f));
    org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var18 = null;
    var17.notifyListeners(var18);
    org.jfree.chart.plot.DatasetRenderingOrder var20 = var17.getDatasetRenderingOrder();
    int var21 = var17.getRangeAxisCount();
    org.jfree.chart.axis.CategoryAxis var23 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var26 = null;
    org.jfree.chart.util.RectangleEdge var27 = null;
    double var28 = var23.getCategoryMiddle(1, 0, var26, var27);
    double var29 = var23.getUpperMargin();
    float var30 = var23.getMaximumCategoryLabelWidthRatio();
    var17.setDomainAxis(2, var23);
    org.jfree.chart.axis.CategoryAnchor var32 = var17.getDomainGridlinePosition();
    var0.setDomainGridlinePosition(var32);
    org.jfree.chart.axis.CategoryLabelPositions var35 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.JFreeChart var37 = null;
    org.jfree.chart.event.ChartChangeEvent var38 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var37);
    org.jfree.chart.event.ChartChangeEventType var39 = var38.getType();
    java.lang.String var40 = var39.toString();
    java.awt.Color var44 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    int var45 = var44.getRGB();
    java.awt.Color var52 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var53 = null;
    java.awt.Rectangle var54 = null;
    java.awt.geom.Rectangle2D var55 = null;
    java.awt.geom.AffineTransform var56 = null;
    java.awt.RenderingHints var57 = null;
    java.awt.PaintContext var58 = var52.createContext(var53, var54, var55, var56, var57);
    float[] var62 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var63 = var52.getColorComponents(var62);
    float[] var64 = java.awt.Color.RGBtoHSB(10, (-254), 0, var63);
    float[] var65 = var44.getColorComponents(var64);
    boolean var66 = var39.equals((java.lang.Object)var65);
    org.jfree.chart.axis.CategoryLabelPositions var68 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var69 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var70 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var71 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var72 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var73 = new org.jfree.chart.axis.CategoryLabelPositions(var69, var70, var71, var72);
    org.jfree.chart.axis.CategoryLabelWidthType var74 = var69.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var75 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var68, var69);
    double var76 = var69.getAngle();
    boolean var77 = var39.equals((java.lang.Object)var69);
    org.jfree.chart.axis.CategoryLabelPositions var78 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var35, var69);
    boolean var79 = var32.equals((java.lang.Object)var78);
    org.jfree.chart.plot.IntervalMarker var82 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var83 = var82.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var84 = null;
    var82.removeChangeListener(var84);
    org.jfree.chart.util.RectangleAnchor var86 = var82.getLabelAnchor();
    org.jfree.chart.util.LengthAdjustmentType var87 = var82.getLabelOffsetType();
    boolean var88 = var32.equals((java.lang.Object)var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var40.equals("ChartChangeEventType.GENERAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var4 = null;
    var0.rendererChanged(var4);
    java.awt.Paint var6 = var0.getOutlinePaint();
    org.jfree.chart.annotations.CategoryAnnotation var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.addAnnotation(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var4 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var6 = var4.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var7 = new java.awt.Paint[] { var6};
    org.jfree.chart.plot.IntervalMarker var10 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var11 = var10.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var12 = null;
    var10.removeChangeListener(var12);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var16 = var15.getLabelPaint();
    var10.setOutlinePaint(var16);
    java.awt.Paint[] var18 = new java.awt.Paint[] { var16};
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    int var29 = var22.getRed();
    java.lang.String var30 = var22.toString();
    java.awt.Paint[] var31 = new java.awt.Paint[] { var22};
    org.jfree.chart.axis.NumberAxis var33 = new org.jfree.chart.axis.NumberAxis("");
    boolean var34 = var33.getAutoRangeStickyZero();
    double var35 = var33.getUpperMargin();
    java.awt.Shape var36 = var33.getUpArrow();
    var33.setTickMarkInsideLength(0.0f);
    boolean var39 = var33.isTickMarksVisible();
    java.awt.Shape var40 = var33.getRightArrow();
    java.awt.Stroke var41 = var33.getTickMarkStroke();
    java.awt.Stroke[] var42 = new java.awt.Stroke[] { var41};
    org.jfree.chart.axis.NumberAxis var44 = new org.jfree.chart.axis.NumberAxis("");
    boolean var45 = var44.getAutoRangeStickyZero();
    var44.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var49 = new org.jfree.chart.axis.NumberAxis("");
    boolean var50 = var49.getAutoRangeStickyZero();
    double var51 = var49.getUpperMargin();
    java.awt.Shape var52 = var49.getUpArrow();
    var49.setTickMarkInsideLength(0.0f);
    boolean var55 = var49.isTickMarksVisible();
    java.awt.Shape var56 = var49.getRightArrow();
    var44.setLeftArrow(var56);
    java.awt.Stroke var58 = var44.getAxisLineStroke();
    java.awt.Stroke[] var59 = new java.awt.Stroke[] { var58};
    java.awt.Shape[] var60 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var61 = new org.jfree.chart.plot.DefaultDrawingSupplier(var7, var18, var31, var42, var59, var60);
    java.lang.Object var62 = var61.clone();
    java.awt.Paint var63 = var61.getNextOutlinePaint();
    var0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var61);
    org.jfree.chart.axis.NumberAxis var66 = new org.jfree.chart.axis.NumberAxis("");
    boolean var67 = var66.getAutoRangeStickyZero();
    var66.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var70 = var66.getPlot();
    int var71 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var66);
    boolean var72 = var0.isRangeCrosshairLockedOnData();
    var0.setDomainGridlinesVisible(false);
    org.jfree.chart.event.PlotChangeListener var75 = null;
    var0.removeChangeListener(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var30.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Graphics2D var8 = null;
    org.jfree.chart.axis.AxisState var9 = null;
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    java.util.List var12 = var1.refreshTicks(var8, var9, var10, var11);
    org.jfree.chart.axis.NumberAxis var14 = new org.jfree.chart.axis.NumberAxis("");
    var14.setVerticalTickLabels(false);
    java.awt.geom.Rectangle2D var18 = null;
    org.jfree.chart.util.RectangleEdge var19 = null;
    double var20 = var14.valueToJava2D(0.0d, var18, var19);
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    boolean var23 = var22.getAutoRangeStickyZero();
    double var24 = var22.getUpperMargin();
    java.awt.Shape var25 = var22.getUpArrow();
    var22.setTickMarkInsideLength(0.0f);
    boolean var28 = var22.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var30 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var31 = null;
    boolean var32 = var30.hasListener(var31);
    var30.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var36 = var30.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var39 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var40 = var39.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var41 = null;
    var39.removeChangeListener(var41);
    java.awt.Stroke var43 = var39.getStroke();
    int var44 = var36.compareTo((java.lang.Object)var43);
    var22.setTickUnit(var36);
    var14.setTickUnit(var36);
    org.jfree.chart.axis.NumberAxis var48 = new org.jfree.chart.axis.NumberAxis("");
    boolean var49 = var48.getAutoRangeStickyZero();
    double var50 = var48.getUpperMargin();
    java.awt.Shape var51 = var48.getUpArrow();
    org.jfree.chart.entity.ChartEntity var52 = new org.jfree.chart.entity.ChartEntity(var51);
    org.jfree.chart.entity.CategoryLabelEntity var55 = new org.jfree.chart.entity.CategoryLabelEntity((java.lang.Comparable)var36, var51, "SortOrder.ASCENDING", "SortOrder.ASCENDING");
    java.awt.Shape var56 = var55.getArea();
    var1.setRightArrow(var56);
    java.awt.Shape var58 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.entity.AxisLabelEntity var61 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var1, var58, "SortOrder.ASCENDING", "0,0,-2,-2,-2,2,-2,2");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    var1.resizeRange(100.0d, 1.0d);
    var1.setLowerBound(8.0d);
    org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var11 = null;
    boolean var12 = var10.hasListener(var11);
    var10.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var16 = var10.getTickUnit();
    org.jfree.data.Range var19 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var21 = org.jfree.data.Range.shift(var19, (-1.0d));
    var10.setRangeWithMargins(var19, false, true);
    org.jfree.data.Range var27 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var28 = var27.getLowerBound();
    double var29 = var27.getCentralValue();
    org.jfree.data.Range var30 = org.jfree.data.Range.combine(var19, var27);
    var1.setRange(var27, false, false);
    java.lang.String var34 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Range[-100.0,8.0]"+ "'", var34.equals("Range[-100.0,8.0]"));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    org.jfree.chart.util.RectangleInsets var5 = var1.getTickLabelInsets();
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    boolean var8 = var7.getAutoRangeStickyZero();
    double var9 = var7.getUpperMargin();
    java.awt.Shape var10 = var7.getUpArrow();
    var7.setTickMarkInsideLength(0.0f);
    boolean var13 = var7.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var16 = null;
    boolean var17 = var15.hasListener(var16);
    var15.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var21 = var15.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var24 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var25 = var24.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var26 = null;
    var24.removeChangeListener(var26);
    java.awt.Stroke var28 = var24.getStroke();
    int var29 = var21.compareTo((java.lang.Object)var28);
    var7.setTickUnit(var21);
    java.lang.String var32 = var21.valueToString(0.0d);
    var1.setTickUnit(var21, false, false);
    org.jfree.data.Range var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeWithMargins(var36);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "0"+ "'", var32.equals("0"));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var4 = null;
    org.jfree.chart.util.RectangleEdge var5 = null;
    double var6 = var1.getCategoryMiddle(1, 0, var4, var5);
    org.jfree.chart.util.RectangleInsets var7 = var1.getTickLabelInsets();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var1.getCategoryStart(1, (-1), var10, var11);
    double var13 = var1.getUpperMargin();
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    boolean var16 = var15.getAutoRangeStickyZero();
    double var17 = var15.getUpperMargin();
    java.awt.Shape var18 = var15.getUpArrow();
    var15.resizeRange(108.0d, 0.0d);
    org.jfree.chart.axis.CategoryAxis var23 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var25 = var23.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    var15.setAxisLinePaint(var25);
    org.jfree.data.Range var27 = var15.getDefaultAutoRange();
    org.jfree.chart.renderer.category.CategoryItemRenderer var28 = null;
    org.jfree.chart.plot.CategoryPlot var29 = new org.jfree.chart.plot.CategoryPlot(var0, var1, (org.jfree.chart.axis.ValueAxis)var15, var28);
    double var30 = var1.getUpperMargin();
    double var31 = var1.getUpperMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.05d);

  }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     double var5 = var1.getUpperMargin();
//     var1.setAutoRangeStickyZero(false);
//     java.awt.Shape var8 = var1.getRightArrow();
//     java.awt.Font var9 = var1.getTickLabelFont();
//     java.awt.Graphics2D var10 = null;
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     boolean var13 = var11.isSubplot();
//     var11.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.Layer var16 = null;
//     java.util.Collection var17 = var11.getDomainMarkers(var16);
//     org.jfree.chart.plot.CategoryPlot var18 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var19 = null;
//     var18.notifyListeners(var19);
//     org.jfree.chart.axis.AxisLocation var22 = null;
//     var18.setRangeAxisLocation(100, var22);
//     java.awt.Graphics2D var24 = null;
//     java.awt.geom.Rectangle2D var25 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var27 = null;
//     boolean var28 = var18.render(var24, var25, (-1), var27);
//     org.jfree.chart.util.SortOrder var29 = var18.getColumnRenderingOrder();
//     java.lang.String var30 = var29.toString();
//     var11.setColumnRenderingOrder(var29);
//     org.jfree.chart.event.PlotChangeListener var32 = null;
//     var11.removeChangeListener(var32);
//     java.awt.geom.Rectangle2D var34 = null;
//     org.jfree.chart.plot.CategoryPlot var35 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var36 = null;
//     var35.notifyListeners(var36);
//     org.jfree.chart.util.RectangleEdge var38 = var35.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var39 = null;
//     org.jfree.chart.axis.AxisSpace var40 = var1.reserveSpace(var10, (org.jfree.chart.plot.Plot)var11, var34, var38, var39);
// 
//   }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    var1.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var5 = var1.getPlot();
    boolean var6 = var1.isTickLabelsVisible();
    java.lang.String var7 = var1.getLabel();
    var1.setAutoRangeStickyZero(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    double var2 = var1.getLabelAngle();
    org.jfree.chart.event.AxisChangeEvent var3 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
    boolean var4 = var1.isPositiveArrowVisible();
    java.awt.Graphics2D var5 = null;
    org.jfree.chart.axis.AxisState var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    java.util.List var9 = var1.refreshTicks(var5, var6, var7, var8);
    org.jfree.chart.event.AxisChangeEvent var10 = new org.jfree.chart.event.AxisChangeEvent((org.jfree.chart.axis.Axis)var1);
    org.jfree.data.Range var11 = var1.getDefaultAutoRange();
    java.text.NumberFormat var12 = var1.getNumberFormatOverride();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var8 = var7.getAutoRangeStickyZero();
//     double var9 = var7.getUpperMargin();
//     java.awt.Shape var10 = var7.getUpArrow();
//     var7.setTickMarkInsideLength(0.0f);
//     boolean var13 = var7.isTickMarksVisible();
//     java.awt.Graphics2D var14 = null;
//     org.jfree.chart.axis.AxisState var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.util.RectangleEdge var17 = null;
//     java.util.List var18 = var7.refreshTicks(var14, var15, var16, var17);
//     java.lang.Object var19 = null;
//     boolean var20 = var7.equals(var19);
//     boolean var21 = var7.isInverted();
//     boolean var22 = var7.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var24 = null;
//     var23.notifyListeners(var24);
//     org.jfree.chart.plot.DatasetRenderingOrder var26 = var23.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var27 = null;
//     var23.rendererChanged(var27);
//     int var29 = var23.getDomainAxisCount();
//     boolean var30 = var7.hasListener((java.util.EventListener)var23);
//     org.jfree.chart.plot.PlotRenderingInfo var33 = null;
//     java.awt.geom.Rectangle2D var34 = null;
//     org.jfree.chart.util.RectangleAnchor var35 = null;
//     java.awt.geom.Point2D var36 = org.jfree.chart.util.RectangleAnchor.coordinates(var34, var35);
//     var23.zoomDomainAxes((-99.0d), 0.2d, var33, var36);
//     org.jfree.chart.plot.CategoryPlot var38 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var39 = null;
//     var38.notifyListeners(var39);
//     org.jfree.chart.axis.AxisLocation var42 = null;
//     var38.setRangeAxisLocation(100, var42);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var44 = var38.getRenderer();
//     org.jfree.chart.axis.AxisLocation var45 = var38.getRangeAxisLocation();
//     var23.setDomainAxisLocation(var45, true);
//     var0.setDomainAxisLocation(var45, true);
//     
//     // Checks the contract:  equals-hashcode on var0 and var23
//     assertTrue("Contract failed: equals-hashcode on var0 and var23", var0.equals(var23) ? var0.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var0
//     assertTrue("Contract failed: equals-hashcode on var23 and var0", var23.equals(var0) ? var23.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getURLText();
    java.lang.String var8 = var5.getShapeCoords();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartEntity: tooltip = null"+ "'", var6.equals("ChartEntity: tooltip = null"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "0,0,-2,2,2,2,2,2"+ "'", var8.equals("0,0,-2,2,2,2,2,2"));

  }

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     double var7 = var0.getCategoryMargin();
//     var0.setLabelToolTip("hi!");
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     var12.setValue(8.0d);
//     var12.setValue(10.0d);
//     org.jfree.chart.axis.NumberAxis var18 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var19 = var18.getAutoRangeStickyZero();
//     double var20 = var18.getUpperMargin();
//     java.awt.Shape var21 = var18.getUpArrow();
//     org.jfree.chart.plot.IntervalMarker var24 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     java.awt.Font var25 = var24.getLabelFont();
//     var18.setLabelFont(var25);
//     var12.setLabelFont(var25);
//     var0.setTickLabelFont((java.lang.Comparable)(-46.0d), var25);
//     org.jfree.chart.axis.CategoryLabelPositions var29 = new org.jfree.chart.axis.CategoryLabelPositions();
//     org.jfree.chart.axis.CategoryLabelPosition var30 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var31 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var32 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var33 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var34 = new org.jfree.chart.axis.CategoryLabelPositions(var30, var31, var32, var33);
//     org.jfree.chart.axis.CategoryLabelWidthType var35 = var30.getWidthType();
//     org.jfree.chart.axis.CategoryLabelPositions var36 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var29, var30);
//     var0.setCategoryLabelPositions(var29);
//     java.awt.Graphics2D var38 = null;
//     org.jfree.chart.axis.AxisState var39 = null;
//     java.awt.geom.Rectangle2D var40 = null;
//     org.jfree.chart.axis.CategoryLabelPositions var41 = new org.jfree.chart.axis.CategoryLabelPositions();
//     org.jfree.chart.axis.CategoryLabelPosition var42 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var43 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var44 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPosition var45 = new org.jfree.chart.axis.CategoryLabelPosition();
//     org.jfree.chart.axis.CategoryLabelPositions var46 = new org.jfree.chart.axis.CategoryLabelPositions(var42, var43, var44, var45);
//     boolean var48 = var44.equals((java.lang.Object)108.0d);
//     org.jfree.chart.axis.CategoryLabelPositions var49 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var41, var44);
//     org.jfree.chart.plot.CategoryPlot var50 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var51 = null;
//     var50.notifyListeners(var51);
//     org.jfree.chart.util.RectangleEdge var53 = var50.getDomainAxisEdge();
//     org.jfree.chart.axis.CategoryLabelPosition var54 = var49.getLabelPosition(var53);
//     java.util.List var55 = var0.refreshTicks(var38, var39, var40, var53);
// 
//   }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.plot.Plot var3 = var1.getPlot();
    java.lang.String var4 = var1.getLabel();
    org.jfree.chart.util.RectangleInsets var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setTickLabelInsets(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    double var7 = var6.getLeft();
    java.awt.geom.Rectangle2D var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var11 = var6.createInsetRectangle(var8, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4.0d);

  }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var4 = null;
//     var0.rendererChanged(var4);
//     int var6 = var0.getDomainAxisCount();
//     org.jfree.chart.event.PlotChangeEvent var7 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var0);
//     double var8 = var0.getAnchorValue();
//     org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis();
//     double var10 = var9.getLowerMargin();
//     org.jfree.chart.axis.CategoryLabelPositions var12 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
//     var9.setCategoryLabelPositions(var12);
//     var9.removeCategoryLabelToolTip((java.lang.Comparable)"SortOrder.ASCENDING");
//     java.util.List var16 = var0.getCategoriesForAxis(var9);
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     var0.drawBackground(var17, var18);
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
    boolean var14 = var13.getAutoRangeStickyZero();
    double var15 = var13.getUpperMargin();
    java.awt.Shape var16 = var13.getUpArrow();
    var13.setTickMarkInsideLength(0.0f);
    boolean var19 = var13.isTickMarksVisible();
    java.awt.Shape var20 = var13.getRightArrow();
    var8.setLeftArrow(var20);
    java.awt.Stroke var22 = var8.getAxisLineStroke();
    var8.setAutoRangeIncludesZero(false);
    org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
    boolean var26 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.plot.PlotRenderingInfo var29 = null;
    java.awt.geom.Rectangle2D var30 = null;
    org.jfree.chart.util.RectangleAnchor var31 = null;
    java.awt.geom.Point2D var32 = org.jfree.chart.util.RectangleAnchor.coordinates(var30, var31);
    var0.zoomDomainAxes(2.0d, (-46.0d), var29, var32);
    org.jfree.data.category.CategoryDataset var34 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer var35 = var0.getRendererForDataset(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var4 = null;
//     var0.setFixedRangeAxisSpace(var4);
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
//     float var13 = var7.getMaximumCategoryLabelWidthRatio();
//     java.awt.Font var14 = var7.getLabelFont();
//     var0.setDomainAxis(0, var7);
//     org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var17 = null;
//     var16.notifyListeners(var17);
//     org.jfree.chart.axis.AxisLocation var20 = null;
//     var16.setRangeAxisLocation(100, var20);
//     java.awt.Graphics2D var22 = null;
//     java.awt.geom.Rectangle2D var23 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var25 = null;
//     boolean var26 = var16.render(var22, var23, (-1), var25);
//     org.jfree.chart.util.SortOrder var27 = var16.getColumnRenderingOrder();
//     var0.setRowRenderingOrder(var27);
//     boolean var29 = var0.getDrawSharedDomainAxis();
//     org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var32 = null;
//     boolean var33 = var31.hasListener(var32);
//     var31.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var37 = var31.getTickUnit();
//     org.jfree.data.Range var40 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.chart.JFreeChart var41 = null;
//     org.jfree.chart.event.ChartChangeEvent var42 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var40, var41);
//     var31.setRangeWithMargins(var40, true, true);
//     boolean var46 = var0.equals((java.lang.Object)var40);
//     var0.clearDomainAxes();
//     
//     // Checks the contract:  equals-hashcode on var0 and var16
//     assertTrue("Contract failed: equals-hashcode on var0 and var16", var0.equals(var16) ? var0.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var3 = var2.getLowerBound();
    double var5 = var2.constrain((-1.0d));
    org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var7.setValue(8.0d);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    org.jfree.chart.plot.Plot var18 = null;
    var11.setPlot(var18);
    boolean var21 = var11.equals((java.lang.Object)100.0f);
    org.jfree.data.Range var24 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var26 = org.jfree.data.Range.shift(var24, (-1.0d));
    var11.setRangeWithMargins(var26);
    boolean var28 = var7.equals((java.lang.Object)var26);
    org.jfree.data.Range var29 = org.jfree.data.Range.combine(var2, var26);
    double var30 = var26.getCentralValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-47.0d));

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var14 = var12.trimWidth(0.0d);
    double var16 = var12.calculateRightOutset(0.0d);
    double var17 = var12.getBottom();
    var1.setTickLabelInsets(var12);
    java.awt.Font var19 = var1.getTickLabelFont();
    java.awt.Stroke var20 = var1.getAxisLineStroke();
    float var21 = var1.getTickMarkInsideLength();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0f);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(0.0d);
    double var12 = var4.calculateRightOutset((-100.0d));
    double var13 = var4.getRight();
    double var15 = var4.calculateTopInset(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
    boolean var14 = var13.getAutoRangeStickyZero();
    double var15 = var13.getUpperMargin();
    java.awt.Shape var16 = var13.getUpArrow();
    var13.setTickMarkInsideLength(0.0f);
    boolean var19 = var13.isTickMarksVisible();
    java.awt.Shape var20 = var13.getRightArrow();
    var8.setLeftArrow(var20);
    java.awt.Stroke var22 = var8.getAxisLineStroke();
    var8.setAutoRangeIncludesZero(false);
    org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
    org.jfree.chart.util.SortOrder var26 = var0.getColumnRenderingOrder();
    org.jfree.chart.plot.PlotRenderingInfo var29 = null;
    org.jfree.chart.plot.CategoryPlot var30 = new org.jfree.chart.plot.CategoryPlot();
    var30.clearRangeAxes();
    boolean var32 = var30.isSubplot();
    var30.setAnchorValue(Double.POSITIVE_INFINITY);
    int var35 = var30.getBackgroundImageAlignment();
    org.jfree.chart.plot.PlotRenderingInfo var37 = null;
    java.awt.geom.Rectangle2D var38 = null;
    org.jfree.chart.util.RectangleAnchor var39 = null;
    java.awt.geom.Point2D var40 = org.jfree.chart.util.RectangleAnchor.coordinates(var38, var39);
    var30.zoomDomainAxes(100.0d, var37, var40, true);
    var0.zoomRangeAxes(0.05d, Double.POSITIVE_INFINITY, var29, var40);
    org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var45 = null;
    var44.notifyListeners(var45);
    org.jfree.chart.axis.CategoryAxis var47 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var50 = null;
    org.jfree.chart.util.RectangleEdge var51 = null;
    double var52 = var47.getCategoryMiddle(1, 0, var50, var51);
    java.lang.Object var53 = var47.clone();
    java.util.List var54 = var44.getCategoriesForAxis(var47);
    org.jfree.chart.event.MarkerChangeEvent var55 = null;
    var44.markerChanged(var55);
    java.util.List var57 = var44.getCategories();
    org.jfree.chart.axis.CategoryAxis var58 = new org.jfree.chart.axis.CategoryAxis();
    double var59 = var58.getLowerMargin();
    org.jfree.chart.axis.CategoryLabelPositions var61 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
    var58.setCategoryLabelPositions(var61);
    var58.removeCategoryLabelToolTip((java.lang.Comparable)"SortOrder.ASCENDING");
    var44.setDomainAxis(var58);
    java.util.List var66 = var0.getCategoriesForAxis(var58);
    java.awt.Stroke var67 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeCrosshairStroke(var67);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test387() {}
//   public void test387() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var14 = var12.trimWidth(0.0d);
//     double var16 = var12.calculateRightOutset(0.0d);
//     double var17 = var12.getBottom();
//     var1.setTickLabelInsets(var12);
//     org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
//     org.jfree.data.RangeType var20 = var1.getRangeType();
//     org.jfree.chart.plot.CategoryPlot var21 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var22 = null;
//     var21.notifyListeners(var22);
//     org.jfree.chart.plot.PlotOrientation var24 = var21.getOrientation();
//     var1.addChangeListener((org.jfree.chart.event.AxisChangeListener)var21);
//     java.awt.Stroke var26 = var21.getRangeGridlineStroke();
//     org.jfree.chart.plot.PlotOrientation var27 = var21.getOrientation();
//     org.jfree.chart.plot.CategoryPlot var28 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var29 = null;
//     var28.notifyListeners(var29);
//     org.jfree.chart.axis.AxisLocation var32 = null;
//     var28.setRangeAxisLocation(100, var32);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var34 = var28.getRenderer();
//     org.jfree.chart.axis.AxisLocation var35 = var28.getRangeAxisLocation();
//     java.awt.Stroke var36 = var28.getDomainGridlineStroke();
//     var21.setDomainGridlineStroke(var36);
//     
//     // Checks the contract:  equals-hashcode on var21 and var28
//     assertTrue("Contract failed: equals-hashcode on var21 and var28", var21.equals(var28) ? var21.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var21
//     assertTrue("Contract failed: equals-hashcode on var28 and var21", var28.equals(var21) ? var28.hashCode() == var21.hashCode() : true);
// 
//   }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var9 = var8.getAutoRangeStickyZero();
//     var8.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var14 = var13.getAutoRangeStickyZero();
//     double var15 = var13.getUpperMargin();
//     java.awt.Shape var16 = var13.getUpArrow();
//     var13.setTickMarkInsideLength(0.0f);
//     boolean var19 = var13.isTickMarksVisible();
//     java.awt.Shape var20 = var13.getRightArrow();
//     var8.setLeftArrow(var20);
//     java.awt.Stroke var22 = var8.getAxisLineStroke();
//     var8.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
//     org.jfree.chart.util.SortOrder var26 = var0.getColumnRenderingOrder();
//     org.jfree.chart.plot.CategoryPlot var27 = new org.jfree.chart.plot.CategoryPlot();
//     var27.clearRangeAxes();
//     boolean var29 = var27.isSubplot();
//     var27.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.Layer var32 = null;
//     java.util.Collection var33 = var27.getDomainMarkers(var32);
//     org.jfree.chart.plot.CategoryPlot var34 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var35 = null;
//     var34.notifyListeners(var35);
//     org.jfree.chart.axis.AxisLocation var38 = null;
//     var34.setRangeAxisLocation(100, var38);
//     java.awt.Graphics2D var40 = null;
//     java.awt.geom.Rectangle2D var41 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var43 = null;
//     boolean var44 = var34.render(var40, var41, (-1), var43);
//     org.jfree.chart.util.SortOrder var45 = var34.getColumnRenderingOrder();
//     java.lang.String var46 = var45.toString();
//     var27.setColumnRenderingOrder(var45);
//     java.lang.String var48 = var45.toString();
//     var0.setColumnRenderingOrder(var45);
//     
//     // Checks the contract:  equals-hashcode on var0 and var34
//     assertTrue("Contract failed: equals-hashcode on var0 and var34", var0.equals(var34) ? var0.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var0
//     assertTrue("Contract failed: equals-hashcode on var34 and var0", var34.equals(var0) ? var34.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.plot.CategoryPlot var3 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var4 = null;
    var3.notifyListeners(var4);
    org.jfree.chart.plot.DatasetRenderingOrder var6 = var3.getDatasetRenderingOrder();
    int var7 = var3.getRangeAxisCount();
    org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var12 = null;
    org.jfree.chart.util.RectangleEdge var13 = null;
    double var14 = var9.getCategoryMiddle(1, 0, var12, var13);
    double var15 = var9.getUpperMargin();
    float var16 = var9.getMaximumCategoryLabelWidthRatio();
    var3.setDomainAxis(2, var9);
    org.jfree.chart.util.Layer var19 = null;
    java.util.Collection var20 = var3.getDomainMarkers(0, var19);
    var2.removeChangeListener((org.jfree.chart.event.MarkerChangeListener)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setAutoRangeMinimumSize(1.0d);
    var1.setLabelURL("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRange(1.0d, (-100.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var2 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var6 = new org.jfree.chart.axis.CategoryLabelPositions(var2, var3, var4, var5);
    org.jfree.chart.axis.CategoryLabelWidthType var7 = var2.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var8 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var1, var2);
    double var9 = var2.getAngle();
    org.jfree.chart.axis.CategoryLabelPosition var10 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var13 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var14 = new org.jfree.chart.axis.CategoryLabelPositions(var10, var11, var12, var13);
    org.jfree.chart.axis.CategoryLabelPosition var15 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var16 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var17 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var18 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var19 = new org.jfree.chart.axis.CategoryLabelPositions(var15, var16, var17, var18);
    double var20 = var17.getAngle();
    org.jfree.chart.axis.CategoryLabelPositions var22 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var23 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var24 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var25 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var26 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var27 = new org.jfree.chart.axis.CategoryLabelPositions(var23, var24, var25, var26);
    org.jfree.chart.axis.CategoryLabelWidthType var28 = var23.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var29 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var22, var23);
    double var30 = var23.getAngle();
    org.jfree.chart.axis.CategoryLabelPositions var31 = new org.jfree.chart.axis.CategoryLabelPositions(var2, var13, var17, var23);
    float var32 = var13.getWidthRatio();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.95f);

  }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     java.awt.Graphics2D var7 = null;
//     org.jfree.chart.axis.AxisState var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.axis.CategoryLabelPositions var10 = new org.jfree.chart.axis.CategoryLabelPositions();
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     boolean var13 = var11.isSubplot();
//     var11.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.util.RectangleEdge var17 = var11.getRangeAxisEdge(1);
//     org.jfree.chart.axis.CategoryLabelPosition var18 = var10.getLabelPosition(var17);
//     java.util.List var19 = var0.refreshTicks(var7, var8, var9, var17);
// 
//   }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var1.setValue(8.0d);
    java.awt.Paint var4 = var1.getLabelPaint();
    double var5 = var1.getValue();
    var1.setValue((-46.0d));
    java.awt.Paint var8 = var1.getPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Graphics2D var8 = null;
    org.jfree.chart.axis.AxisState var9 = null;
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    java.util.List var12 = var1.refreshTicks(var8, var9, var10, var11);
    java.lang.Object var13 = null;
    boolean var14 = var1.equals(var13);
    boolean var15 = var1.isInverted();
    java.lang.String var16 = var1.getLabelToolTip();
    boolean var17 = var1.isVerticalTickLabels();
    var1.centerRange((-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    var2.setLabel("");
    java.awt.Color var8 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var9 = var8.darker();
    var2.setPaint((java.awt.Paint)var8);
    org.jfree.chart.text.TextAnchor var11 = var2.getLabelTextAnchor();
    double var12 = var2.getStartValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.RectangleInsets var10 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var2.setLabelOffset(var10);
    double var12 = var2.getStartValue();
    java.awt.Stroke var13 = var2.getStroke();
    java.awt.Font var14 = var2.getLabelFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    java.awt.Font var3 = var2.getLabelFont();
    float var4 = var2.getAlpha();
    double var5 = var2.getEndValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.data.general.DatasetGroup var4 = var0.getDatasetGroup();
    var0.configureRangeAxes();
    org.jfree.chart.axis.CategoryAxis var7 = var0.getDomainAxisForDataset(2);
    boolean var8 = var0.getDrawSharedDomainAxis();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
    boolean var14 = var13.getAutoRangeStickyZero();
    double var15 = var13.getUpperMargin();
    java.awt.Shape var16 = var13.getUpArrow();
    var13.setTickMarkInsideLength(0.0f);
    boolean var19 = var13.isTickMarksVisible();
    java.awt.Shape var20 = var13.getRightArrow();
    var8.setLeftArrow(var20);
    java.awt.Stroke var22 = var8.getAxisLineStroke();
    var8.setAutoRangeIncludesZero(false);
    org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
    org.jfree.chart.util.SortOrder var26 = var0.getColumnRenderingOrder();
    org.jfree.chart.plot.PlotRenderingInfo var29 = null;
    org.jfree.chart.plot.CategoryPlot var30 = new org.jfree.chart.plot.CategoryPlot();
    var30.clearRangeAxes();
    boolean var32 = var30.isSubplot();
    var30.setAnchorValue(Double.POSITIVE_INFINITY);
    int var35 = var30.getBackgroundImageAlignment();
    org.jfree.chart.plot.PlotRenderingInfo var37 = null;
    java.awt.geom.Rectangle2D var38 = null;
    org.jfree.chart.util.RectangleAnchor var39 = null;
    java.awt.geom.Point2D var40 = org.jfree.chart.util.RectangleAnchor.coordinates(var38, var39);
    var30.zoomDomainAxes(100.0d, var37, var40, true);
    var0.zoomRangeAxes(0.05d, Double.POSITIVE_INFINITY, var29, var40);
    org.jfree.chart.plot.CategoryPlot var44 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var45 = null;
    var44.notifyListeners(var45);
    org.jfree.chart.axis.CategoryAxis var47 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var50 = null;
    org.jfree.chart.util.RectangleEdge var51 = null;
    double var52 = var47.getCategoryMiddle(1, 0, var50, var51);
    java.lang.Object var53 = var47.clone();
    java.util.List var54 = var44.getCategoriesForAxis(var47);
    org.jfree.chart.event.MarkerChangeEvent var55 = null;
    var44.markerChanged(var55);
    java.util.List var57 = var44.getCategories();
    org.jfree.chart.axis.CategoryAxis var58 = new org.jfree.chart.axis.CategoryAxis();
    double var59 = var58.getLowerMargin();
    org.jfree.chart.axis.CategoryLabelPositions var61 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
    var58.setCategoryLabelPositions(var61);
    var58.removeCategoryLabelToolTip((java.lang.Comparable)"SortOrder.ASCENDING");
    var44.setDomainAxis(var58);
    java.util.List var66 = var0.getCategoriesForAxis(var58);
    org.jfree.chart.plot.Plot var67 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.plot.CategoryPlot var6 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var7 = null;
//     var6.notifyListeners(var7);
//     org.jfree.chart.util.RectangleEdge var9 = var6.getDomainAxisEdge();
//     java.lang.String var10 = var6.getPlotType();
//     org.jfree.chart.axis.CategoryAxis var11 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var14 = null;
//     org.jfree.chart.util.RectangleEdge var15 = null;
//     double var16 = var11.getCategoryMiddle(1, 0, var14, var15);
//     org.jfree.chart.util.RectangleInsets var17 = var11.getTickLabelInsets();
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.util.RectangleEdge var21 = null;
//     double var22 = var11.getCategoryStart(1, (-1), var20, var21);
//     org.jfree.chart.axis.CategoryAxis[] var23 = new org.jfree.chart.axis.CategoryAxis[] { var11};
//     var6.setDomainAxes(var23);
//     var0.setDomainAxes(var23);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var0
//     assertTrue("Contract failed: equals-hashcode on var6 and var0", var6.equals(var0) ? var6.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
    org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
    var0.setRenderers(var3);
    boolean var5 = var0.isRangeGridlinesVisible();
    org.jfree.chart.axis.AxisLocation var6 = var0.getDomainAxisLocation();
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "AxisLocation.BOTTOM_OR_LEFT"+ "'", var7.equals("AxisLocation.BOTTOM_OR_LEFT"));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    java.awt.Color var6 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var7 = null;
    java.awt.Rectangle var8 = null;
    java.awt.geom.Rectangle2D var9 = null;
    java.awt.geom.AffineTransform var10 = null;
    java.awt.RenderingHints var11 = null;
    java.awt.PaintContext var12 = var6.createContext(var7, var8, var9, var10, var11);
    float[] var13 = null;
    float[] var14 = var6.getComponents(var13);
    var0.setNoDataMessagePaint((java.awt.Paint)var6);
    org.jfree.chart.renderer.category.CategoryItemRenderer var17 = null;
    var0.setRenderer(100, var17);
    org.jfree.chart.util.RectangleInsets var19 = var0.getInsets();
    var0.setOutlineVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     java.awt.Graphics2D var6 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     java.awt.geom.Rectangle2D var9 = null;
//     org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var11 = null;
//     var10.notifyListeners(var11);
//     org.jfree.chart.axis.AxisLocation var14 = null;
//     var10.setRangeAxisLocation(100, var14);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var16 = var10.getRenderer();
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var20 = null;
//     boolean var21 = var10.render(var17, var18, (-1), var20);
//     org.jfree.chart.axis.AxisLocation var23 = var10.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var24 = var23.getOpposite();
//     org.jfree.chart.axis.NumberAxis var26 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var27 = var26.getAutoRangeStickyZero();
//     double var28 = var26.getUpperMargin();
//     java.awt.Shape var29 = var26.getUpArrow();
//     var26.setTickMarkInsideLength(0.0f);
//     boolean var32 = var26.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var39 = var37.trimWidth(0.0d);
//     double var41 = var37.calculateRightOutset(0.0d);
//     double var42 = var37.getBottom();
//     var26.setTickLabelInsets(var37);
//     org.jfree.chart.axis.TickUnitSource var44 = var26.getStandardTickUnits();
//     var26.setRangeAboutValue((-1.0d), 0.0d);
//     var26.zoomRange((-100.0d), 1.0d);
//     org.jfree.chart.plot.CategoryPlot var51 = new org.jfree.chart.plot.CategoryPlot();
//     var51.clearRangeAxes();
//     boolean var53 = var51.isSubplot();
//     var51.setAnchorValue(Double.POSITIVE_INFINITY);
//     int var56 = var51.getBackgroundImageAlignment();
//     java.awt.Stroke var57 = var51.getDomainGridlineStroke();
//     var51.setForegroundAlpha(0.0f);
//     boolean var60 = var26.hasListener((java.util.EventListener)var51);
//     org.jfree.chart.plot.PlotOrientation var61 = var51.getOrientation();
//     org.jfree.chart.util.RectangleEdge var62 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var23, var61);
//     org.jfree.chart.plot.PlotRenderingInfo var63 = null;
//     org.jfree.chart.axis.AxisState var64 = var1.draw(var6, Double.POSITIVE_INFINITY, var8, var9, var62, var63);
// 
//   }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var4 = null;
    var0.setFixedRangeAxisSpace(var4);
    float var6 = var0.getForegroundAlpha();
    org.jfree.chart.plot.CategoryPlot var7 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var8 = null;
    var7.notifyListeners(var8);
    org.jfree.chart.util.RectangleEdge var10 = var7.getDomainAxisEdge();
    java.lang.String var11 = var7.getPlotType();
    java.awt.Image var12 = var7.getBackgroundImage();
    java.awt.Color var16 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.Color var17 = var16.darker();
    int var18 = var16.getGreen();
    int var19 = var16.getAlpha();
    var7.setRangeGridlinePaint((java.awt.Paint)var16);
    var0.setOutlinePaint((java.awt.Paint)var16);
    org.jfree.chart.plot.CategoryPlot var23 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var24 = null;
    var23.notifyListeners(var24);
    org.jfree.chart.axis.AxisLocation var27 = null;
    var23.setRangeAxisLocation(100, var27);
    org.jfree.chart.renderer.category.CategoryItemRenderer var29 = var23.getRenderer();
    org.jfree.chart.axis.AxisLocation var30 = var23.getRangeAxisLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxisLocation((-3303016), var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Category Plot"+ "'", var11.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var12 = var8.getPlot();
    var8.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
    org.jfree.chart.util.RectangleInsets var15 = var8.getLabelInsets();
    boolean var16 = var6.equals((java.lang.Object)var15);
    double var18 = var15.calculateLeftInset(0.05d);
    java.awt.geom.Rectangle2D var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var20 = var15.createInsetRectangle(var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 3.0d);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setRangeCrosshairLockedOnData(true);
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker((-1.0d));
    var11.setValue(8.0d);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    boolean var16 = var15.getAutoRangeStickyZero();
    double var17 = var15.getUpperMargin();
    java.awt.Shape var18 = var15.getUpArrow();
    var15.setTickMarkInsideLength(0.0f);
    boolean var21 = var15.isTickMarksVisible();
    org.jfree.chart.plot.Plot var22 = null;
    var15.setPlot(var22);
    boolean var25 = var15.equals((java.lang.Object)100.0f);
    org.jfree.data.Range var28 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var30 = org.jfree.data.Range.shift(var28, (-1.0d));
    var15.setRangeWithMargins(var30);
    boolean var32 = var11.equals((java.lang.Object)var30);
    var0.addRangeMarker((org.jfree.chart.plot.Marker)var11);
    java.lang.String var34 = var0.getNoDataMessage();
    int var35 = var0.getDomainAxisCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var5 = null;
    boolean var6 = var4.hasListener(var5);
    var4.resizeRange(100.0d, 1.0d);
    boolean var10 = var1.equals((java.lang.Object)100.0d);
    org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var14 = var13.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var15 = null;
    var13.removeChangeListener(var15);
    java.awt.Stroke var17 = var13.getStroke();
    var1.setTickMarkStroke(var17);
    org.jfree.chart.JFreeChart var19 = null;
    org.jfree.chart.event.ChartChangeEvent var20 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var17, var19);
    org.jfree.chart.event.ChartChangeEventType var21 = var20.getType();
    org.jfree.chart.JFreeChart var22 = var20.getChart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     var1.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var5 = var1.getPlot();
//     boolean var6 = var1.isTickLabelsVisible();
//     var1.setVerticalTickLabels(false);
//     var1.setLabelURL("AxisLocation.BOTTOM_OR_LEFT");
//     java.awt.Graphics2D var11 = null;
//     org.jfree.chart.axis.AxisState var12 = null;
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var15 = null;
//     var14.notifyListeners(var15);
//     org.jfree.chart.axis.AxisLocation var18 = null;
//     var14.setRangeAxisLocation(100, var18);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var20 = var14.getRenderer();
//     org.jfree.chart.axis.AxisLocation var21 = var14.getRangeAxisLocation();
//     var14.setAnchorValue(2.0d, true);
//     org.jfree.chart.plot.Plot var25 = var14.getParent();
//     org.jfree.chart.util.RectangleEdge var26 = var14.getDomainAxisEdge();
//     java.util.List var27 = var1.refreshTicks(var11, var12, var13, var26);
// 
//   }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     java.awt.Graphics2D var7 = null;
//     java.awt.geom.Rectangle2D var8 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var10 = null;
//     boolean var11 = var0.render(var7, var8, (-1), var10);
//     org.jfree.chart.axis.AxisLocation var13 = var0.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var14 = var13.getOpposite();
//     org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var16 = null;
//     var15.notifyListeners(var16);
//     org.jfree.chart.plot.PlotOrientation var18 = var15.getOrientation();
//     java.lang.String var19 = var18.toString();
//     java.lang.String var20 = var18.toString();
//     java.lang.String var21 = var18.toString();
//     org.jfree.chart.util.RectangleEdge var22 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var13, var18);
//     
//     // Checks the contract:  equals-hashcode on var0 and var15
//     assertTrue("Contract failed: equals-hashcode on var0 and var15", var0.equals(var15) ? var0.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var0
//     assertTrue("Contract failed: equals-hashcode on var15 and var0", var15.equals(var0) ? var15.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     var1.setTickMarkOutsideLength(10.0f);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var12 = null;
//     var11.notifyListeners(var12);
//     org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
//     var1.setPlot((org.jfree.chart.plot.Plot)var11);
//     var11.configureRangeAxes();
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     var11.drawBackgroundImage(var17, var18);
//     org.jfree.chart.axis.NumberAxis var21 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var22 = var21.getAutoRangeStickyZero();
//     double var23 = var21.getUpperMargin();
//     java.awt.Shape var24 = var21.getUpArrow();
//     var21.setTickMarkInsideLength(0.0f);
//     boolean var27 = var21.isTickMarksVisible();
//     java.awt.Graphics2D var28 = null;
//     org.jfree.chart.axis.AxisState var29 = null;
//     java.awt.geom.Rectangle2D var30 = null;
//     org.jfree.chart.util.RectangleEdge var31 = null;
//     java.util.List var32 = var21.refreshTicks(var28, var29, var30, var31);
//     java.lang.Object var33 = null;
//     boolean var34 = var21.equals(var33);
//     boolean var35 = var21.isInverted();
//     boolean var36 = var21.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var37 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var38 = null;
//     var37.notifyListeners(var38);
//     org.jfree.chart.plot.DatasetRenderingOrder var40 = var37.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var41 = null;
//     var37.rendererChanged(var41);
//     int var43 = var37.getDomainAxisCount();
//     boolean var44 = var21.hasListener((java.util.EventListener)var37);
//     org.jfree.chart.plot.CategoryPlot var46 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var47 = null;
//     var46.notifyListeners(var47);
//     org.jfree.chart.axis.AxisLocation var50 = null;
//     var46.setRangeAxisLocation(100, var50);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var52 = var46.getRenderer();
//     org.jfree.chart.axis.AxisLocation var53 = var46.getRangeAxisLocation();
//     var37.setRangeAxisLocation(15, var53, true);
//     var11.setDomainAxisLocation(var53, true);
//     org.jfree.chart.plot.CategoryPlot var58 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var59 = null;
//     var58.notifyListeners(var59);
//     org.jfree.chart.plot.PlotOrientation var61 = var58.getOrientation();
//     java.lang.String var62 = var61.toString();
//     java.lang.String var63 = var61.toString();
//     org.jfree.chart.util.RectangleEdge var64 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var53, var61);
//     
//     // Checks the contract:  equals-hashcode on var46 and var58
//     assertTrue("Contract failed: equals-hashcode on var46 and var58", var46.equals(var58) ? var46.hashCode() == var58.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var58 and var37
//     assertTrue("Contract failed: equals-hashcode on var58 and var37", var58.equals(var37) ? var58.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var58 and var46
//     assertTrue("Contract failed: equals-hashcode on var58 and var46", var58.equals(var46) ? var58.hashCode() == var46.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var58 and var37.", var58.equals(var37) == var37.equals(var58));
// 
//   }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    org.jfree.chart.util.RectangleInsets var7 = var1.getTickLabelInsets();
    var1.setLowerBound((-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    double var5 = var1.getAutoRangeMinimumSize();
    java.awt.Font var6 = var1.getTickLabelFont();
    var1.resizeRange((-99.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
//     org.jfree.chart.plot.CategoryPlot var8 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var9 = null;
//     var8.notifyListeners(var9);
//     org.jfree.chart.plot.PlotOrientation var11 = var8.getOrientation();
//     java.lang.String var12 = var11.toString();
//     org.jfree.chart.util.RectangleEdge var13 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var7, var11);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.DatasetRenderingOrder var3 = var0.getDatasetRenderingOrder();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    double var6 = var5.getLabelAngle();
    java.awt.Stroke var7 = var5.getAxisLineStroke();
    var0.setDomainGridlineStroke(var7);
    org.jfree.chart.plot.IntervalMarker var12 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var13 = var12.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var14 = null;
    var12.removeChangeListener(var14);
    org.jfree.chart.util.RectangleAnchor var16 = var12.getLabelAnchor();
    org.jfree.chart.util.Layer var17 = null;
    var0.addRangeMarker(10, (org.jfree.chart.plot.Marker)var12, var17);
    org.jfree.chart.renderer.category.CategoryItemRenderer var20 = null;
    var0.setRenderer(4, var20, false);
    org.jfree.chart.event.PlotChangeEvent var23 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot)var0);
    org.jfree.chart.plot.Plot var24 = var23.getPlot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    double var2 = var1.getLabelAngle();
    var1.setAutoRangeMinimumSize(8.0d, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeWithMargins(1.0E-8d, (-101.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 4.0d);
    boolean var5 = var2.intersects((-99.0d), 108.0d);
    double var6 = var2.getLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-100.0d));

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    java.awt.Graphics2D var6 = null;
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.plot.PlotRenderingInfo var9 = null;
    boolean var10 = var0.render(var6, var7, (-1), var9);
    java.awt.Stroke var11 = var0.getRangeGridlineStroke();
    org.jfree.chart.JFreeChart var12 = null;
    org.jfree.chart.event.ChartChangeEvent var13 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var0, var12);
    var0.clearDomainMarkers(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var9 = var8.getAutoRangeStickyZero();
//     var8.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var13 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var14 = var13.getAutoRangeStickyZero();
//     double var15 = var13.getUpperMargin();
//     java.awt.Shape var16 = var13.getUpArrow();
//     var13.setTickMarkInsideLength(0.0f);
//     boolean var19 = var13.isTickMarksVisible();
//     java.awt.Shape var20 = var13.getRightArrow();
//     var8.setLeftArrow(var20);
//     java.awt.Stroke var22 = var8.getAxisLineStroke();
//     var8.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var25 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var8);
//     org.jfree.chart.util.SortOrder var26 = var0.getColumnRenderingOrder();
//     java.lang.Object var27 = null;
//     boolean var28 = var26.equals(var27);
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker((-1.0d));
//     org.jfree.chart.util.LengthAdjustmentType var31 = var30.getLabelOffsetType();
//     org.jfree.chart.plot.CategoryPlot var32 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var33 = null;
//     var32.notifyListeners(var33);
//     org.jfree.chart.util.RectangleEdge var35 = var32.getDomainAxisEdge();
//     org.jfree.data.general.DatasetGroup var36 = var32.getDatasetGroup();
//     org.jfree.chart.axis.NumberAxis var38 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var39 = var38.getAutoRangeStickyZero();
//     double var40 = var38.getUpperMargin();
//     java.awt.Shape var41 = var38.getUpArrow();
//     var38.setTickMarkInsideLength(0.0f);
//     boolean var44 = var38.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var49 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var51 = var49.trimWidth(0.0d);
//     double var53 = var49.calculateRightOutset(0.0d);
//     double var54 = var49.getBottom();
//     var38.setTickLabelInsets(var49);
//     java.awt.Font var56 = var38.getTickLabelFont();
//     int var57 = var32.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var38);
//     java.awt.Shape var58 = var38.getDownArrow();
//     boolean var59 = var31.equals((java.lang.Object)var58);
//     boolean var60 = var26.equals((java.lang.Object)var59);
//     
//     // Checks the contract:  equals-hashcode on var0 and var32
//     assertTrue("Contract failed: equals-hashcode on var0 and var32", var0.equals(var32) ? var0.hashCode() == var32.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var32 and var0
//     assertTrue("Contract failed: equals-hashcode on var32 and var0", var32.equals(var0) ? var32.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    java.awt.geom.Rectangle2D var9 = null;
    org.jfree.chart.util.RectangleEdge var10 = null;
    double var11 = var0.getCategoryStart(1, (-1), var9, var10);
    double var12 = var0.getUpperMargin();
    var0.setMaximumCategoryLabelWidthRatio(1.0f);
    var0.setLabel("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.05d);

  }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var2 = var1.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var6 = var5.getAutoRangeStickyZero();
//     double var7 = var5.getUpperMargin();
//     java.awt.Shape var8 = var5.getUpArrow();
//     var5.setTickMarkInsideLength(0.0f);
//     boolean var11 = var5.isTickMarksVisible();
//     java.awt.Shape var12 = var5.getRightArrow();
//     java.awt.Stroke var13 = var5.getTickMarkStroke();
//     boolean var14 = var3.equals((java.lang.Object)var13);
//     var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
//     org.jfree.chart.axis.NumberAxis var17 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var18 = null;
//     boolean var19 = var17.hasListener(var18);
//     var17.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var23 = var17.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var26 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var27 = var26.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var28 = null;
//     var26.removeChangeListener(var28);
//     java.awt.Stroke var30 = var26.getStroke();
//     int var31 = var23.compareTo((java.lang.Object)var30);
//     var3.add((org.jfree.chart.axis.TickUnit)var23);
//     org.jfree.chart.axis.TickUnit var34 = var3.getCeilingTickUnit((-46.0d));
//     org.jfree.chart.axis.NumberAxis var36 = new org.jfree.chart.axis.NumberAxis("");
//     var36.setRangeAboutValue(0.0d, 10.0d);
//     org.jfree.chart.util.RectangleInsets var40 = var36.getTickLabelInsets();
//     var36.setInverted(false);
//     org.jfree.data.Range var43 = var36.getDefaultAutoRange();
//     boolean var44 = var36.isTickMarksVisible();
//     org.jfree.chart.axis.NumberAxis var46 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var47 = var46.getLabelPaint();
//     org.jfree.chart.axis.TickUnits var48 = new org.jfree.chart.axis.TickUnits();
//     org.jfree.chart.axis.NumberAxis var50 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var51 = var50.getAutoRangeStickyZero();
//     double var52 = var50.getUpperMargin();
//     java.awt.Shape var53 = var50.getUpArrow();
//     var50.setTickMarkInsideLength(0.0f);
//     boolean var56 = var50.isTickMarksVisible();
//     java.awt.Shape var57 = var50.getRightArrow();
//     java.awt.Stroke var58 = var50.getTickMarkStroke();
//     boolean var59 = var48.equals((java.lang.Object)var58);
//     var46.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var48);
//     org.jfree.chart.axis.NumberAxis var62 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var63 = null;
//     boolean var64 = var62.hasListener(var63);
//     var62.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var68 = var62.getTickUnit();
//     org.jfree.chart.plot.IntervalMarker var71 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var72 = var71.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var73 = null;
//     var71.removeChangeListener(var73);
//     java.awt.Stroke var75 = var71.getStroke();
//     int var76 = var68.compareTo((java.lang.Object)var75);
//     var48.add((org.jfree.chart.axis.TickUnit)var68);
//     var36.setTickUnit(var68, true, false);
//     org.jfree.chart.axis.TickUnit var81 = var3.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var68);
//     
//     // Checks the contract:  equals-hashcode on var3 and var48
//     assertTrue("Contract failed: equals-hashcode on var3 and var48", var3.equals(var48) ? var3.hashCode() == var48.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var48 and var3
//     assertTrue("Contract failed: equals-hashcode on var48 and var3", var48.equals(var3) ? var48.hashCode() == var3.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var71
//     assertTrue("Contract failed: equals-hashcode on var26 and var71", var26.equals(var71) ? var26.hashCode() == var71.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var71 and var26
//     assertTrue("Contract failed: equals-hashcode on var71 and var26", var71.equals(var26) ? var71.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    var1.setAutoRangeIncludesZero(true);
    var1.setLabelURL("hi!");
    java.text.NumberFormat var9 = null;
    var1.setNumberFormatOverride(var9);
    var1.setUpperMargin((-47.0d));
    var1.setUpperMargin(1.0d);
    org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var18 = var17.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var19 = null;
    var17.removeChangeListener(var19);
    org.jfree.chart.util.RectangleInsets var25 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var17.setLabelOffset(var25);
    double var28 = var25.calculateBottomInset(0.0d);
    var1.setLabelInsets(var25);
    double var31 = var25.extendHeight(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 3.0d);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    org.jfree.chart.axis.CategoryAxis var9 = var0.getDomainAxisForDataset(178);
    int var10 = var0.getDatasetCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var10 = null;
    boolean var11 = var9.hasListener(var10);
    var9.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var15 = var9.getTickUnit();
    org.jfree.chart.plot.IntervalMarker var18 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var19 = var18.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var20 = null;
    var18.removeChangeListener(var20);
    java.awt.Stroke var22 = var18.getStroke();
    int var23 = var15.compareTo((java.lang.Object)var22);
    var1.setTickUnit(var15);
    var1.setTickMarkOutsideLength((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
    var0.setAnchorValue(2.0d, true);
    java.lang.Object var11 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    boolean var2 = var0.isSubplot();
    var0.setAnchorValue(Double.POSITIVE_INFINITY);
    org.jfree.chart.util.RectangleEdge var6 = var0.getRangeAxisEdge(1);
    var0.setBackgroundImageAlignment(4);
    org.jfree.chart.axis.AxisSpace var9 = var0.getFixedRangeAxisSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setLabel("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test427() {}
//   public void test427() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }
// 
// 
//     org.jfree.data.Range var0 = null;
//     org.jfree.data.Range var3 = org.jfree.data.Range.shift(var0, 10.0d, false);
// 
//   }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     float var7 = var0.getBackgroundAlpha();
//     org.jfree.chart.plot.PlotRenderingInfo var10 = null;
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     var11.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var13 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var14 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var13};
//     var11.setRenderers(var14);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var17 = var11.getRenderer(0);
//     org.jfree.chart.axis.NumberAxis var19 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var20 = var19.getAutoRangeStickyZero();
//     var19.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var24 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var25 = var24.getAutoRangeStickyZero();
//     double var26 = var24.getUpperMargin();
//     java.awt.Shape var27 = var24.getUpArrow();
//     var24.setTickMarkInsideLength(0.0f);
//     boolean var30 = var24.isTickMarksVisible();
//     java.awt.Shape var31 = var24.getRightArrow();
//     var19.setLeftArrow(var31);
//     java.awt.Stroke var33 = var19.getAxisLineStroke();
//     var19.setAutoRangeIncludesZero(false);
//     org.jfree.data.Range var36 = var11.getDataRange((org.jfree.chart.axis.ValueAxis)var19);
//     boolean var37 = var11.getDrawSharedDomainAxis();
//     org.jfree.chart.plot.PlotRenderingInfo var40 = null;
//     java.awt.geom.Rectangle2D var41 = null;
//     org.jfree.chart.util.RectangleAnchor var42 = null;
//     java.awt.geom.Point2D var43 = org.jfree.chart.util.RectangleAnchor.coordinates(var41, var42);
//     var11.zoomDomainAxes(2.0d, (-46.0d), var40, var43);
//     var0.zoomDomainAxes(0.0d, 8.0d, var10, var43);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setVerticalTickLabels(false);
    boolean var4 = var1.isPositiveArrowVisible();
    var1.setVerticalTickLabels(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var2.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = var2.getLabelAnchor();
    org.jfree.chart.axis.NumberAxis var8 = new org.jfree.chart.axis.NumberAxis("");
    boolean var9 = var8.getAutoRangeStickyZero();
    var8.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var12 = var8.getPlot();
    var8.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
    org.jfree.chart.util.RectangleInsets var15 = var8.getLabelInsets();
    boolean var16 = var6.equals((java.lang.Object)var15);
    java.lang.String var17 = var6.toString();
    org.jfree.chart.axis.CategoryLabelPositions var19 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var20 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var21 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var22 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var23 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var24 = new org.jfree.chart.axis.CategoryLabelPositions(var20, var21, var22, var23);
    org.jfree.chart.axis.CategoryLabelWidthType var25 = var20.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var26 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var19, var20);
    double var27 = var20.getAngle();
    org.jfree.chart.text.TextBlockAnchor var28 = var20.getLabelAnchor();
    boolean var30 = var28.equals((java.lang.Object)10.0d);
    java.lang.String var31 = var28.toString();
    org.jfree.chart.axis.CategoryLabelPosition var32 = new org.jfree.chart.axis.CategoryLabelPosition(var6, var28);
    float var33 = var32.getWidthRatio();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "RectangleAnchor.TOP_LEFT"+ "'", var17.equals("RectangleAnchor.TOP_LEFT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "TextBlockAnchor.BOTTOM_CENTER"+ "'", var31.equals("TextBlockAnchor.BOTTOM_CENTER"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.95f);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.05d, 0.0d);
    java.awt.Stroke var3 = var2.getOutlineStroke();
    var2.setLabel("ChartEntity: tooltip = null");
    double var6 = var2.getEndValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    var1.setFixedDimension(0.0d);
    boolean var8 = var1.isPositiveArrowVisible();
    org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var10 = null;
    var9.notifyListeners(var10);
    org.jfree.chart.axis.AxisLocation var13 = null;
    var9.setRangeAxisLocation(100, var13);
    java.awt.Graphics2D var15 = null;
    java.awt.geom.Rectangle2D var16 = null;
    org.jfree.chart.plot.PlotRenderingInfo var18 = null;
    boolean var19 = var9.render(var15, var16, (-1), var18);
    java.awt.Stroke var20 = var9.getRangeGridlineStroke();
    var1.setTickMarkStroke(var20);
    var1.setTickMarkOutsideLength(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test433() {}
//   public void test433() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryStart(1, 178, var3, var4);
//     java.awt.Paint var7 = var0.getTickLabelPaint((java.lang.Comparable)10.0f);
//     var0.setTickLabelsVisible(false);
//     java.awt.Graphics2D var10 = null;
//     org.jfree.chart.axis.AxisState var11 = null;
//     java.awt.geom.Rectangle2D var12 = null;
//     org.jfree.chart.plot.CategoryPlot var13 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var14 = null;
//     var13.notifyListeners(var14);
//     org.jfree.chart.axis.CategoryAxis var17 = new org.jfree.chart.axis.CategoryAxis("hi!");
//     java.awt.Paint var19 = var17.getTickLabelPaint((java.lang.Comparable)(-1.0f));
//     java.awt.Paint[] var20 = new java.awt.Paint[] { var19};
//     org.jfree.chart.plot.IntervalMarker var23 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var24 = var23.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var25 = null;
//     var23.removeChangeListener(var25);
//     org.jfree.chart.axis.NumberAxis var28 = new org.jfree.chart.axis.NumberAxis("");
//     java.awt.Paint var29 = var28.getLabelPaint();
//     var23.setOutlinePaint(var29);
//     java.awt.Paint[] var31 = new java.awt.Paint[] { var29};
//     java.awt.Color var35 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
//     java.awt.image.ColorModel var36 = null;
//     java.awt.Rectangle var37 = null;
//     java.awt.geom.Rectangle2D var38 = null;
//     java.awt.geom.AffineTransform var39 = null;
//     java.awt.RenderingHints var40 = null;
//     java.awt.PaintContext var41 = var35.createContext(var36, var37, var38, var39, var40);
//     int var42 = var35.getRed();
//     java.lang.String var43 = var35.toString();
//     java.awt.Paint[] var44 = new java.awt.Paint[] { var35};
//     org.jfree.chart.axis.NumberAxis var46 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var47 = var46.getAutoRangeStickyZero();
//     double var48 = var46.getUpperMargin();
//     java.awt.Shape var49 = var46.getUpArrow();
//     var46.setTickMarkInsideLength(0.0f);
//     boolean var52 = var46.isTickMarksVisible();
//     java.awt.Shape var53 = var46.getRightArrow();
//     java.awt.Stroke var54 = var46.getTickMarkStroke();
//     java.awt.Stroke[] var55 = new java.awt.Stroke[] { var54};
//     org.jfree.chart.axis.NumberAxis var57 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var58 = var57.getAutoRangeStickyZero();
//     var57.setPositiveArrowVisible(false);
//     org.jfree.chart.axis.NumberAxis var62 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var63 = var62.getAutoRangeStickyZero();
//     double var64 = var62.getUpperMargin();
//     java.awt.Shape var65 = var62.getUpArrow();
//     var62.setTickMarkInsideLength(0.0f);
//     boolean var68 = var62.isTickMarksVisible();
//     java.awt.Shape var69 = var62.getRightArrow();
//     var57.setLeftArrow(var69);
//     java.awt.Stroke var71 = var57.getAxisLineStroke();
//     java.awt.Stroke[] var72 = new java.awt.Stroke[] { var71};
//     java.awt.Shape[] var73 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
//     org.jfree.chart.plot.DefaultDrawingSupplier var74 = new org.jfree.chart.plot.DefaultDrawingSupplier(var20, var31, var44, var55, var72, var73);
//     java.lang.Object var75 = var74.clone();
//     java.awt.Paint var76 = var74.getNextOutlinePaint();
//     var13.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var74);
//     org.jfree.chart.axis.NumberAxis var79 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var80 = var79.getAutoRangeStickyZero();
//     var79.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var83 = var79.getPlot();
//     int var84 = var13.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var79);
//     boolean var85 = var13.isRangeCrosshairLockedOnData();
//     org.jfree.chart.util.RectangleEdge var87 = var13.getDomainAxisEdge((-3303016));
//     java.util.List var88 = var0.refreshTicks(var10, var11, var12, var87);
// 
//   }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.chart.axis.AxisSpace var4 = null;
    var0.setFixedRangeAxisSpace(var4);
    org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
    float var13 = var7.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var14 = var7.getLabelFont();
    var0.setDomainAxis(0, var7);
    org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var17 = null;
    var16.notifyListeners(var17);
    org.jfree.chart.axis.AxisLocation var20 = null;
    var16.setRangeAxisLocation(100, var20);
    java.awt.Graphics2D var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.plot.PlotRenderingInfo var25 = null;
    boolean var26 = var16.render(var22, var23, (-1), var25);
    org.jfree.chart.util.SortOrder var27 = var16.getColumnRenderingOrder();
    var0.setRowRenderingOrder(var27);
    boolean var29 = var0.getDrawSharedDomainAxis();
    org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var32 = null;
    boolean var33 = var31.hasListener(var32);
    var31.resizeRange(100.0d, 1.0d);
    var31.setLowerBound(8.0d);
    org.jfree.chart.axis.NumberAxis var40 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var41 = null;
    boolean var42 = var40.hasListener(var41);
    var40.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var46 = var40.getTickUnit();
    org.jfree.data.Range var49 = new org.jfree.data.Range((-100.0d), 8.0d);
    org.jfree.data.Range var51 = org.jfree.data.Range.shift(var49, (-1.0d));
    var40.setRangeWithMargins(var49, false, true);
    org.jfree.data.Range var57 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var58 = var57.getLowerBound();
    double var59 = var57.getCentralValue();
    org.jfree.data.Range var60 = org.jfree.data.Range.combine(var49, var57);
    var31.setRange(var57, false, false);
    org.jfree.data.Range var66 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var67 = var66.getLowerBound();
    double var68 = var66.getLowerBound();
    var31.setRangeWithMargins(var66, true, true);
    org.jfree.data.Range var72 = var0.getDataRange((org.jfree.chart.axis.ValueAxis)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var3 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.RectangleEdge var7 = null;
    double var8 = var3.getCategoryMiddle(1, 0, var6, var7);
    java.lang.Object var9 = var3.clone();
    java.util.List var10 = var0.getCategoriesForAxis(var3);
    org.jfree.chart.axis.NumberAxis var12 = new org.jfree.chart.axis.NumberAxis("");
    boolean var13 = var12.getAutoRangeStickyZero();
    double var14 = var12.getUpperMargin();
    java.awt.Shape var15 = var12.getUpArrow();
    var12.setTickMarkInsideLength(0.0f);
    boolean var18 = var12.isTickMarksVisible();
    java.awt.Shape var19 = var12.getRightArrow();
    java.awt.Stroke var20 = var12.getTickMarkStroke();
    org.jfree.chart.axis.NumberTickUnit var21 = var12.getTickUnit();
    org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
    var23.setVerticalTickLabels(false);
    double var26 = var23.getUpperMargin();
    java.lang.String var27 = var23.getLabelURL();
    org.jfree.chart.axis.NumberAxis var29 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var30 = null;
    boolean var31 = var29.hasListener(var30);
    var29.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var35 = var29.getTickUnit();
    var23.setTickUnit(var35);
    java.awt.Font var37 = var23.getTickLabelFont();
    var3.setTickLabelFont((java.lang.Comparable)var21, var37);
    var3.setMaximumCategoryLabelLines((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    var1.setAutoRangeIncludesZero(true);
    var1.setLabelURL("hi!");
    java.text.NumberFormat var9 = null;
    var1.setNumberFormatOverride(var9);
    var1.setAutoRangeStickyZero(true);
    var1.setPositiveArrowVisible(true);

  }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     float var7 = var0.getMaximumCategoryLabelWidthRatio();
//     var0.setCategoryMargin(100.0d);
//     int var10 = var0.getCategoryLabelPositionOffset();
//     java.awt.geom.Rectangle2D var13 = null;
//     org.jfree.chart.plot.CategoryPlot var14 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var15 = null;
//     var14.notifyListeners(var15);
//     org.jfree.chart.axis.AxisLocation var18 = null;
//     var14.setRangeAxisLocation(100, var18);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var20 = var14.getRenderer();
//     java.awt.Graphics2D var21 = null;
//     java.awt.geom.Rectangle2D var22 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var24 = null;
//     boolean var25 = var14.render(var21, var22, (-1), var24);
//     org.jfree.chart.axis.AxisLocation var27 = var14.getDomainAxisLocation(0);
//     org.jfree.chart.axis.AxisLocation var28 = var27.getOpposite();
//     org.jfree.chart.axis.NumberAxis var30 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var31 = var30.getAutoRangeStickyZero();
//     double var32 = var30.getUpperMargin();
//     java.awt.Shape var33 = var30.getUpArrow();
//     var30.setTickMarkInsideLength(0.0f);
//     boolean var36 = var30.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var41 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var43 = var41.trimWidth(0.0d);
//     double var45 = var41.calculateRightOutset(0.0d);
//     double var46 = var41.getBottom();
//     var30.setTickLabelInsets(var41);
//     org.jfree.chart.axis.TickUnitSource var48 = var30.getStandardTickUnits();
//     var30.setRangeAboutValue((-1.0d), 0.0d);
//     var30.zoomRange((-100.0d), 1.0d);
//     org.jfree.chart.plot.CategoryPlot var55 = new org.jfree.chart.plot.CategoryPlot();
//     var55.clearRangeAxes();
//     boolean var57 = var55.isSubplot();
//     var55.setAnchorValue(Double.POSITIVE_INFINITY);
//     int var60 = var55.getBackgroundImageAlignment();
//     java.awt.Stroke var61 = var55.getDomainGridlineStroke();
//     var55.setForegroundAlpha(0.0f);
//     boolean var64 = var30.hasListener((java.util.EventListener)var55);
//     org.jfree.chart.plot.PlotOrientation var65 = var55.getOrientation();
//     org.jfree.chart.util.RectangleEdge var66 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(var27, var65);
//     double var67 = var0.getCategoryMiddle((-254), 255, var13, var66);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var14 = var12.trimWidth(0.0d);
    double var16 = var12.calculateRightOutset(0.0d);
    double var17 = var12.getBottom();
    var1.setTickLabelInsets(var12);
    org.jfree.chart.axis.TickUnitSource var19 = var1.getStandardTickUnits();
    org.jfree.data.RangeType var20 = var1.getRangeType();
    java.awt.Shape var21 = var1.getUpArrow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    java.awt.Color var3 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    int var4 = var3.getRGB();
    int var5 = var3.getBlue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var5 = null;
    boolean var6 = var4.hasListener(var5);
    var4.resizeRange(100.0d, 1.0d);
    boolean var10 = var1.equals((java.lang.Object)100.0d);
    org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var14 = var13.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var15 = null;
    var13.removeChangeListener(var15);
    java.awt.Stroke var17 = var13.getStroke();
    var1.setTickMarkStroke(var17);
    org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
    boolean var21 = var20.getAutoRangeStickyZero();
    double var22 = var20.getUpperMargin();
    java.awt.Shape var23 = var20.getUpArrow();
    org.jfree.data.Range var26 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var27 = var26.getLowerBound();
    double var28 = var26.getLowerBound();
    var20.setDefaultAutoRange(var26);
    var1.setRangeWithMargins(var26);
    boolean var31 = var1.isTickLabelsVisible();
    org.jfree.data.RangeType var32 = var1.getRangeType();
    org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var39 = var37.calculateTopInset(10.0d);
    double var41 = var37.trimHeight(10.0d);
    double var43 = var37.calculateTopInset(100.0d);
    double var45 = var37.calculateLeftOutset(10.0d);
    var1.setTickLabelInsets(var37);
    double var48 = var37.calculateBottomInset(1.0d);
    java.awt.geom.Rectangle2D var49 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var50 = var37.createOutsetRectangle(var49);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1.0d);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.jfree.chart.axis.CategoryLabelPositions var0 = null;
    org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var6 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var7 = new org.jfree.chart.axis.CategoryLabelPositions(var3, var4, var5, var6);
    org.jfree.chart.axis.CategoryLabelWidthType var8 = var3.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var9 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var2, var3);
    double var10 = var3.getAngle();
    org.jfree.chart.axis.CategoryLabelPosition var11 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var12 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var13 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var14 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var15 = new org.jfree.chart.axis.CategoryLabelPositions(var11, var12, var13, var14);
    org.jfree.chart.axis.CategoryLabelPosition var16 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var17 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var18 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var19 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var20 = new org.jfree.chart.axis.CategoryLabelPositions(var16, var17, var18, var19);
    double var21 = var18.getAngle();
    org.jfree.chart.axis.CategoryLabelPositions var23 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var24 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var25 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var26 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var27 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var28 = new org.jfree.chart.axis.CategoryLabelPositions(var24, var25, var26, var27);
    org.jfree.chart.axis.CategoryLabelWidthType var29 = var24.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var30 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var23, var24);
    double var31 = var24.getAngle();
    org.jfree.chart.axis.CategoryLabelPositions var32 = new org.jfree.chart.axis.CategoryLabelPositions(var3, var14, var18, var24);
    java.lang.Object var33 = null;
    boolean var34 = var24.equals(var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPositions var35 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var0, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    float var6 = var0.getMaximumCategoryLabelWidthRatio();
    java.awt.Font var7 = var0.getLabelFont();
    int var8 = var0.getCategoryLabelPositionOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var2 = var1.getLabelPaint();
    org.jfree.chart.axis.TickUnits var3 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var5 = new org.jfree.chart.axis.NumberAxis("");
    boolean var6 = var5.getAutoRangeStickyZero();
    double var7 = var5.getUpperMargin();
    java.awt.Shape var8 = var5.getUpArrow();
    var5.setTickMarkInsideLength(0.0f);
    boolean var11 = var5.isTickMarksVisible();
    java.awt.Shape var12 = var5.getRightArrow();
    java.awt.Stroke var13 = var5.getTickMarkStroke();
    boolean var14 = var3.equals((java.lang.Object)var13);
    var1.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var3);
    java.awt.Shape var16 = var1.getUpArrow();
    var1.setInverted(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    var1.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var5 = var1.getPlot();
    var1.setAutoTickUnitSelection(false);
    org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("0");
    java.awt.Shape var10 = var9.getUpArrow();
    var1.setRightArrow(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.util.RectangleEdge var4 = null;
    double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
    org.jfree.chart.util.RectangleInsets var6 = var0.getTickLabelInsets();
    double var7 = var6.getLeft();
    double var9 = var6.extendHeight(103.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 107.0d);

  }

  public void test446() {}
//   public void test446() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.IntervalMarker var3 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var4 = var3.getAlpha();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var3.notifyListeners(var5);
//     org.jfree.chart.util.RectangleAnchor var7 = var3.getLabelAnchor();
//     org.jfree.chart.axis.NumberAxis var9 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var10 = var9.getAutoRangeStickyZero();
//     var9.setPositiveArrowVisible(false);
//     org.jfree.chart.plot.Plot var13 = var9.getPlot();
//     var9.setLabelURL("java.awt.Color[r=255,g=255,b=2]");
//     org.jfree.chart.util.RectangleInsets var16 = var9.getLabelInsets();
//     boolean var17 = var7.equals((java.lang.Object)var16);
//     java.lang.String var18 = var7.toString();
//     java.awt.geom.Point2D var19 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var7);
// 
//   }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    java.awt.Color var2 = java.awt.Color.getColor("java.awt.Color[r=255,g=255,b=2]", 1);
    java.lang.String var3 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.awt.Color[r=0,g=0,b=1]"+ "'", var3.equals("java.awt.Color[r=0,g=0,b=1]"));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var3 = var1.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var4 = new java.awt.Paint[] { var3};
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var8 = var7.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var9 = null;
    var7.removeChangeListener(var9);
    org.jfree.chart.axis.NumberAxis var12 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var13 = var12.getLabelPaint();
    var7.setOutlinePaint(var13);
    java.awt.Paint[] var15 = new java.awt.Paint[] { var13};
    java.awt.Color var19 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var20 = null;
    java.awt.Rectangle var21 = null;
    java.awt.geom.Rectangle2D var22 = null;
    java.awt.geom.AffineTransform var23 = null;
    java.awt.RenderingHints var24 = null;
    java.awt.PaintContext var25 = var19.createContext(var20, var21, var22, var23, var24);
    int var26 = var19.getRed();
    java.lang.String var27 = var19.toString();
    java.awt.Paint[] var28 = new java.awt.Paint[] { var19};
    org.jfree.chart.axis.NumberAxis var30 = new org.jfree.chart.axis.NumberAxis("");
    boolean var31 = var30.getAutoRangeStickyZero();
    double var32 = var30.getUpperMargin();
    java.awt.Shape var33 = var30.getUpArrow();
    var30.setTickMarkInsideLength(0.0f);
    boolean var36 = var30.isTickMarksVisible();
    java.awt.Shape var37 = var30.getRightArrow();
    java.awt.Stroke var38 = var30.getTickMarkStroke();
    java.awt.Stroke[] var39 = new java.awt.Stroke[] { var38};
    org.jfree.chart.axis.NumberAxis var41 = new org.jfree.chart.axis.NumberAxis("");
    boolean var42 = var41.getAutoRangeStickyZero();
    var41.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var46 = new org.jfree.chart.axis.NumberAxis("");
    boolean var47 = var46.getAutoRangeStickyZero();
    double var48 = var46.getUpperMargin();
    java.awt.Shape var49 = var46.getUpArrow();
    var46.setTickMarkInsideLength(0.0f);
    boolean var52 = var46.isTickMarksVisible();
    java.awt.Shape var53 = var46.getRightArrow();
    var41.setLeftArrow(var53);
    java.awt.Stroke var55 = var41.getAxisLineStroke();
    java.awt.Stroke[] var56 = new java.awt.Stroke[] { var55};
    java.awt.Shape[] var57 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var58 = new org.jfree.chart.plot.DefaultDrawingSupplier(var4, var15, var28, var39, var56, var57);
    java.lang.Object var59 = var58.clone();
    java.awt.Paint var60 = var58.getNextOutlinePaint();
    java.awt.Paint var61 = var58.getNextPaint();
    org.jfree.chart.plot.CategoryPlot var62 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var63 = null;
    var62.notifyListeners(var63);
    org.jfree.chart.axis.AxisLocation var66 = null;
    var62.setRangeAxisLocation(100, var66);
    org.jfree.chart.renderer.category.CategoryItemRenderer var68 = var62.getRenderer();
    org.jfree.chart.util.RectangleInsets var69 = var62.getAxisOffset();
    boolean var70 = var58.equals((java.lang.Object)var62);
    var62.setWeight((-3303016));
    org.jfree.chart.plot.CategoryPlot var73 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var74 = null;
    var73.notifyListeners(var74);
    org.jfree.chart.plot.DatasetRenderingOrder var76 = var73.getDatasetRenderingOrder();
    org.jfree.chart.event.RendererChangeEvent var77 = null;
    var73.rendererChanged(var77);
    java.awt.Paint var79 = var73.getOutlinePaint();
    double var80 = var73.getRangeCrosshairValue();
    var62.setParent((org.jfree.chart.plot.Plot)var73);
    org.jfree.chart.axis.NumberAxis var83 = new org.jfree.chart.axis.NumberAxis("");
    boolean var84 = var83.getAutoRangeStickyZero();
    double var85 = var83.getUpperMargin();
    java.awt.Shape var86 = var83.getUpArrow();
    var83.setTickMarkInsideLength(0.0f);
    boolean var89 = var83.isTickMarksVisible();
    java.awt.Graphics2D var90 = null;
    org.jfree.chart.axis.AxisState var91 = null;
    java.awt.geom.Rectangle2D var92 = null;
    org.jfree.chart.util.RectangleEdge var93 = null;
    java.util.List var94 = var83.refreshTicks(var90, var91, var92, var93);
    org.jfree.chart.axis.MarkerAxisBand var95 = null;
    var83.setMarkerBand(var95);
    org.jfree.chart.plot.Plot var97 = null;
    var83.setPlot(var97);
    org.jfree.data.Range var99 = var73.getDataRange((org.jfree.chart.axis.ValueAxis)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var27.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.jfree.chart.util.ObjectList var0 = new org.jfree.chart.util.ObjectList();
    var0.set(255, (java.lang.Object)(-1.0d));
    var0.clear();
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var8 = null;
    boolean var9 = var7.hasListener(var8);
    boolean var11 = var7.equals((java.lang.Object)(short)10);
    var7.setAutoTickUnitSelection(false);
    boolean var14 = var7.getAutoRangeIncludesZero();
    var0.set(10, (java.lang.Object)var7);
    org.jfree.data.general.Dataset var16 = null;
    org.jfree.data.general.DatasetChangeEvent var17 = new org.jfree.data.general.DatasetChangeEvent((java.lang.Object)10, var16);
    java.lang.String var18 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.jfree.data.general.DatasetChangeEvent[source=10]"+ "'", var18.equals("org.jfree.data.general.DatasetChangeEvent[source=10]"));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
    double var1 = var0.getLowerMargin();
    org.jfree.chart.axis.CategoryLabelPositions var3 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(8.0d);
    var0.setCategoryLabelPositions(var3);
    org.jfree.chart.axis.CategoryAxis var5 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.util.RectangleEdge var9 = null;
    double var10 = var5.getCategoryMiddle(1, 0, var8, var9);
    double var11 = var5.getUpperMargin();
    var5.setCategoryLabelPositionOffset(1);
    boolean var14 = var3.equals((java.lang.Object)var5);
    org.jfree.chart.axis.NumberAxis var16 = new org.jfree.chart.axis.NumberAxis("");
    boolean var17 = var16.getAutoRangeStickyZero();
    double var18 = var16.getUpperMargin();
    var16.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var22 = null;
    org.jfree.chart.util.RectangleEdge var23 = null;
    double var24 = var16.valueToJava2D(8.0d, var22, var23);
    org.jfree.chart.axis.NumberAxis var26 = new org.jfree.chart.axis.NumberAxis("");
    boolean var27 = var26.getAutoRangeStickyZero();
    double var28 = var26.getUpperMargin();
    java.awt.Shape var29 = var26.getUpArrow();
    var26.setTickMarkInsideLength(0.0f);
    boolean var32 = var26.isTickMarksVisible();
    java.awt.Shape var33 = var26.getRightArrow();
    var16.setRightArrow(var33);
    org.jfree.chart.entity.ChartEntity var35 = new org.jfree.chart.entity.ChartEntity(var33);
    org.jfree.chart.axis.NumberAxis var37 = new org.jfree.chart.axis.NumberAxis("");
    boolean var38 = var37.getAutoRangeStickyZero();
    var37.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var42 = new org.jfree.chart.axis.NumberAxis("");
    boolean var43 = var42.getAutoRangeStickyZero();
    double var44 = var42.getUpperMargin();
    java.awt.Shape var45 = var42.getUpArrow();
    var42.setTickMarkInsideLength(0.0f);
    boolean var48 = var42.isTickMarksVisible();
    java.awt.Shape var49 = var42.getRightArrow();
    var37.setLeftArrow(var49);
    var35.setArea(var49);
    org.jfree.chart.entity.ChartEntity var54 = new org.jfree.chart.entity.ChartEntity(var49, "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]", "");
    boolean var55 = var3.equals((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    double var9 = var1.valueToJava2D(8.0d, var7, var8);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    var1.setRightArrow(var18);
    org.jfree.chart.entity.ChartEntity var20 = new org.jfree.chart.entity.ChartEntity(var18);
    java.lang.String var21 = var20.getURLText();
    org.jfree.chart.axis.NumberAxis var23 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var24 = var23.getLabelPaint();
    org.jfree.chart.axis.TickUnits var25 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var27 = new org.jfree.chart.axis.NumberAxis("");
    boolean var28 = var27.getAutoRangeStickyZero();
    double var29 = var27.getUpperMargin();
    java.awt.Shape var30 = var27.getUpArrow();
    var27.setTickMarkInsideLength(0.0f);
    boolean var33 = var27.isTickMarksVisible();
    java.awt.Shape var34 = var27.getRightArrow();
    java.awt.Stroke var35 = var27.getTickMarkStroke();
    boolean var36 = var25.equals((java.lang.Object)var35);
    var23.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var25);
    boolean var38 = var20.equals((java.lang.Object)var25);
    org.jfree.chart.axis.NumberAxis var40 = new org.jfree.chart.axis.NumberAxis("");
    var40.setVerticalTickLabels(false);
    double var43 = var40.getUpperMargin();
    java.lang.String var44 = var40.getLabelURL();
    org.jfree.chart.axis.NumberAxis var46 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var47 = null;
    boolean var48 = var46.hasListener(var47);
    var46.resizeRange(100.0d, 1.0d);
    org.jfree.chart.axis.NumberTickUnit var52 = var46.getTickUnit();
    var40.setTickUnit(var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var54 = var25.getCeilingTickUnit((org.jfree.chart.axis.TickUnit)var52);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    double var5 = var1.getUpperMargin();
    var1.setAutoRangeStickyZero(false);
    java.awt.Shape var8 = var1.getRightArrow();
    java.awt.Font var9 = var1.getTickLabelFont();
    org.jfree.chart.event.ChartChangeEvent var10 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1);
    org.jfree.chart.JFreeChart var11 = null;
    var10.setChart(var11);
    org.jfree.chart.JFreeChart var13 = null;
    var10.setChart(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    boolean var11 = var0.render(var7, var8, (-1), var10);
    org.jfree.chart.axis.AxisLocation var13 = var0.getDomainAxisLocation(0);
    org.jfree.chart.plot.DatasetRenderingOrder var14 = var0.getDatasetRenderingOrder();
    org.jfree.chart.event.MarkerChangeEvent var15 = null;
    var0.markerChanged(var15);
    org.jfree.data.category.CategoryDataset var17 = null;
    var0.setDataset(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.plot.Plot var8 = null;
    var1.setPlot(var8);
    var1.centerRange(100.0d);
    org.jfree.chart.axis.CategoryAxis var13 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var15 = var13.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var16 = new java.awt.Paint[] { var15};
    org.jfree.chart.plot.IntervalMarker var19 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var20 = var19.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var21 = null;
    var19.removeChangeListener(var21);
    org.jfree.chart.axis.NumberAxis var24 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var25 = var24.getLabelPaint();
    var19.setOutlinePaint(var25);
    java.awt.Paint[] var27 = new java.awt.Paint[] { var25};
    java.awt.Color var31 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var32 = null;
    java.awt.Rectangle var33 = null;
    java.awt.geom.Rectangle2D var34 = null;
    java.awt.geom.AffineTransform var35 = null;
    java.awt.RenderingHints var36 = null;
    java.awt.PaintContext var37 = var31.createContext(var32, var33, var34, var35, var36);
    int var38 = var31.getRed();
    java.lang.String var39 = var31.toString();
    java.awt.Paint[] var40 = new java.awt.Paint[] { var31};
    org.jfree.chart.axis.NumberAxis var42 = new org.jfree.chart.axis.NumberAxis("");
    boolean var43 = var42.getAutoRangeStickyZero();
    double var44 = var42.getUpperMargin();
    java.awt.Shape var45 = var42.getUpArrow();
    var42.setTickMarkInsideLength(0.0f);
    boolean var48 = var42.isTickMarksVisible();
    java.awt.Shape var49 = var42.getRightArrow();
    java.awt.Stroke var50 = var42.getTickMarkStroke();
    java.awt.Stroke[] var51 = new java.awt.Stroke[] { var50};
    org.jfree.chart.axis.NumberAxis var53 = new org.jfree.chart.axis.NumberAxis("");
    boolean var54 = var53.getAutoRangeStickyZero();
    var53.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var58 = new org.jfree.chart.axis.NumberAxis("");
    boolean var59 = var58.getAutoRangeStickyZero();
    double var60 = var58.getUpperMargin();
    java.awt.Shape var61 = var58.getUpArrow();
    var58.setTickMarkInsideLength(0.0f);
    boolean var64 = var58.isTickMarksVisible();
    java.awt.Shape var65 = var58.getRightArrow();
    var53.setLeftArrow(var65);
    java.awt.Stroke var67 = var53.getAxisLineStroke();
    java.awt.Stroke[] var68 = new java.awt.Stroke[] { var67};
    java.awt.Shape[] var69 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var70 = new org.jfree.chart.plot.DefaultDrawingSupplier(var16, var27, var40, var51, var68, var69);
    java.lang.Object var71 = var70.clone();
    java.awt.Paint var72 = var70.getNextOutlinePaint();
    var1.setTickMarkPaint(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var39.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var3 = var2.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var4 = null;
    var2.removeChangeListener(var4);
    org.jfree.chart.util.RectangleInsets var10 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var12 = var10.trimWidth(0.0d);
    double var14 = var10.calculateRightOutset(0.0d);
    double var15 = var10.getBottom();
    double var17 = var10.calculateRightInset((-100.0d));
    var2.setLabelOffset(var10);
    org.jfree.chart.util.UnitType var19 = var10.getUnitType();
    double var20 = var10.getLeft();
    double var22 = var10.calculateBottomInset(4.0d);
    java.awt.geom.Rectangle2D var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var26 = var10.createInsetRectangle(var23, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);

  }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }
// 
// 
//     org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
//     float var3 = var2.getAlpha();
//     org.jfree.chart.event.MarkerChangeListener var4 = null;
//     var2.removeChangeListener(var4);
//     org.jfree.chart.util.RectangleInsets var10 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var12 = var10.trimWidth(0.0d);
//     double var14 = var10.calculateRightOutset(0.0d);
//     double var15 = var10.getBottom();
//     double var17 = var10.calculateRightInset((-100.0d));
//     var2.setLabelOffset(var10);
//     org.jfree.chart.util.UnitType var19 = var10.getUnitType();
//     double var20 = var10.getLeft();
//     double var22 = var10.calculateBottomInset(4.0d);
//     java.awt.geom.Rectangle2D var23 = null;
//     var10.trim(var23);
// 
//   }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     var1.setAutoRangeMinimumSize(1.0d);
//     java.lang.Object var4 = var1.clone();
//     double var5 = var1.getFixedDimension();
//     var1.setPositiveArrowVisible(false);
//     java.awt.Graphics2D var8 = null;
//     org.jfree.chart.plot.CategoryPlot var9 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var10 = null;
//     var9.notifyListeners(var10);
//     org.jfree.chart.axis.AxisLocation var13 = null;
//     var9.setRangeAxisLocation(100, var13);
//     java.awt.Graphics2D var15 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var18 = null;
//     boolean var19 = var9.render(var15, var16, (-1), var18);
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.util.RectangleEdge var21 = null;
//     org.jfree.chart.axis.AxisSpace var22 = null;
//     org.jfree.chart.axis.AxisSpace var23 = var1.reserveSpace(var8, (org.jfree.chart.plot.Plot)var9, var20, var21, var22);
// 
//   }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    var1.setRangeAboutValue(0.0d, 10.0d);
    var1.setAutoRangeIncludesZero(true);
    var1.setLabelURL("hi!");
    java.text.NumberFormat var9 = null;
    var1.setNumberFormatOverride(var9);
    var1.setUpperMargin((-47.0d));
    var1.setUpperMargin(1.0d);
    org.jfree.chart.plot.IntervalMarker var17 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var18 = var17.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var19 = null;
    var17.removeChangeListener(var19);
    org.jfree.chart.util.RectangleInsets var25 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    var17.setLabelOffset(var25);
    double var28 = var25.calculateBottomInset(0.0d);
    var1.setLabelInsets(var25);
    double var30 = var1.getLabelAngle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.AxisLocation var4 = null;
    var0.setRangeAxisLocation(100, var4);
    org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
    java.awt.Graphics2D var7 = null;
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.PlotRenderingInfo var10 = null;
    boolean var11 = var0.render(var7, var8, (-1), var10);
    org.jfree.chart.axis.AxisLocation var13 = var0.getDomainAxisLocation(0);
    org.jfree.chart.plot.DatasetRenderingOrder var14 = var0.getDatasetRenderingOrder();
    org.jfree.chart.plot.Plot var15 = var0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(Double.POSITIVE_INFINITY, var1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    org.jfree.data.general.DatasetGroup var4 = var0.getDatasetGroup();
    var0.setBackgroundAlpha(0.0f);
    boolean var7 = var0.isRangeGridlinesVisible();
    org.jfree.chart.renderer.category.CategoryItemRenderer var9 = var0.getRenderer(10);
    org.jfree.chart.plot.CategoryPlot var10 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var11 = null;
    var10.notifyListeners(var11);
    org.jfree.chart.axis.AxisLocation var14 = null;
    var10.setRangeAxisLocation(100, var14);
    org.jfree.chart.renderer.category.CategoryItemRenderer var16 = var10.getRenderer();
    org.jfree.chart.util.RectangleInsets var17 = var10.getAxisOffset();
    java.awt.Paint[] var18 = null;
    java.awt.Paint[] var19 = null;
    org.jfree.chart.axis.CategoryAxis var21 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var23 = var21.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var24 = new java.awt.Paint[] { var23};
    org.jfree.chart.plot.IntervalMarker var27 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var28 = var27.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var29 = null;
    var27.removeChangeListener(var29);
    org.jfree.chart.axis.NumberAxis var32 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var33 = var32.getLabelPaint();
    var27.setOutlinePaint(var33);
    java.awt.Paint[] var35 = new java.awt.Paint[] { var33};
    java.awt.Color var39 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var40 = null;
    java.awt.Rectangle var41 = null;
    java.awt.geom.Rectangle2D var42 = null;
    java.awt.geom.AffineTransform var43 = null;
    java.awt.RenderingHints var44 = null;
    java.awt.PaintContext var45 = var39.createContext(var40, var41, var42, var43, var44);
    int var46 = var39.getRed();
    java.lang.String var47 = var39.toString();
    java.awt.Paint[] var48 = new java.awt.Paint[] { var39};
    org.jfree.chart.axis.NumberAxis var50 = new org.jfree.chart.axis.NumberAxis("");
    boolean var51 = var50.getAutoRangeStickyZero();
    double var52 = var50.getUpperMargin();
    java.awt.Shape var53 = var50.getUpArrow();
    var50.setTickMarkInsideLength(0.0f);
    boolean var56 = var50.isTickMarksVisible();
    java.awt.Shape var57 = var50.getRightArrow();
    java.awt.Stroke var58 = var50.getTickMarkStroke();
    java.awt.Stroke[] var59 = new java.awt.Stroke[] { var58};
    org.jfree.chart.axis.NumberAxis var61 = new org.jfree.chart.axis.NumberAxis("");
    boolean var62 = var61.getAutoRangeStickyZero();
    var61.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var66 = new org.jfree.chart.axis.NumberAxis("");
    boolean var67 = var66.getAutoRangeStickyZero();
    double var68 = var66.getUpperMargin();
    java.awt.Shape var69 = var66.getUpArrow();
    var66.setTickMarkInsideLength(0.0f);
    boolean var72 = var66.isTickMarksVisible();
    java.awt.Shape var73 = var66.getRightArrow();
    var61.setLeftArrow(var73);
    java.awt.Stroke var75 = var61.getAxisLineStroke();
    java.awt.Stroke[] var76 = new java.awt.Stroke[] { var75};
    java.awt.Shape[] var77 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var78 = new org.jfree.chart.plot.DefaultDrawingSupplier(var24, var35, var48, var59, var76, var77);
    java.awt.Stroke[] var79 = null;
    org.jfree.chart.plot.IntervalMarker var82 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var83 = var82.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var84 = null;
    var82.removeChangeListener(var84);
    java.awt.Stroke var86 = var82.getStroke();
    java.awt.Stroke[] var87 = new java.awt.Stroke[] { var86};
    java.awt.Shape[] var88 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var89 = new org.jfree.chart.plot.DefaultDrawingSupplier(var18, var19, var48, var79, var87, var88);
    java.awt.Paint var90 = var89.getNextOutlinePaint();
    var10.setRangeGridlinePaint(var90);
    var0.setRangeCrosshairPaint(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var47.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    double var9 = var1.valueToJava2D(8.0d, var7, var8);
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    var1.setRightArrow(var18);
    org.jfree.chart.entity.ChartEntity var20 = new org.jfree.chart.entity.ChartEntity(var18);
    org.jfree.chart.axis.NumberAxis var22 = new org.jfree.chart.axis.NumberAxis("");
    boolean var23 = var22.getAutoRangeStickyZero();
    var22.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var27 = new org.jfree.chart.axis.NumberAxis("");
    boolean var28 = var27.getAutoRangeStickyZero();
    double var29 = var27.getUpperMargin();
    java.awt.Shape var30 = var27.getUpArrow();
    var27.setTickMarkInsideLength(0.0f);
    boolean var33 = var27.isTickMarksVisible();
    java.awt.Shape var34 = var27.getRightArrow();
    var22.setLeftArrow(var34);
    var20.setArea(var34);
    org.jfree.chart.entity.ChartEntity var39 = new org.jfree.chart.entity.ChartEntity(var34, "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]", "");
    java.lang.String var40 = var39.getToolTipText();
    var39.setToolTipText("CategoryLabelEntity: category=[size=1], tooltip=SortOrder.ASCENDING, url=SortOrder.ASCENDING");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"+ "'", var40.equals("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    org.jfree.chart.util.RectangleAnchor var0 = null;
    org.jfree.chart.axis.CategoryLabelPositions var2 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var6 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var7 = new org.jfree.chart.axis.CategoryLabelPositions(var3, var4, var5, var6);
    org.jfree.chart.axis.CategoryLabelWidthType var8 = var3.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var9 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var2, var3);
    double var10 = var3.getAngle();
    org.jfree.chart.text.TextBlockAnchor var11 = var3.getLabelAnchor();
    boolean var13 = var11.equals((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.CategoryLabelPosition var14 = new org.jfree.chart.axis.CategoryLabelPosition(var0, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
    boolean var7 = var6.getAutoRangeStickyZero();
    double var8 = var6.getUpperMargin();
    java.awt.Shape var9 = var6.getUpArrow();
    var1.setLeftArrow(var9);
    var1.setNegativeArrowVisible(true);
    boolean var13 = var1.isAutoRange();
    var1.setTickMarkInsideLength(100.0f);
    java.awt.Paint var16 = var1.getTickMarkPaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Shape var8 = var1.getRightArrow();
//     var1.setTickMarkOutsideLength(10.0f);
//     org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var12 = null;
//     var11.notifyListeners(var12);
//     org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
//     var1.setPlot((org.jfree.chart.plot.Plot)var11);
//     var11.configureRangeAxes();
//     java.awt.Graphics2D var17 = null;
//     java.awt.geom.Rectangle2D var18 = null;
//     var11.drawBackgroundImage(var17, var18);
//     org.jfree.chart.axis.NumberAxis var21 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var22 = var21.getAutoRangeStickyZero();
//     double var23 = var21.getUpperMargin();
//     java.awt.Shape var24 = var21.getUpArrow();
//     var21.setTickMarkInsideLength(0.0f);
//     boolean var27 = var21.isTickMarksVisible();
//     java.awt.Graphics2D var28 = null;
//     org.jfree.chart.axis.AxisState var29 = null;
//     java.awt.geom.Rectangle2D var30 = null;
//     org.jfree.chart.util.RectangleEdge var31 = null;
//     java.util.List var32 = var21.refreshTicks(var28, var29, var30, var31);
//     java.lang.Object var33 = null;
//     boolean var34 = var21.equals(var33);
//     boolean var35 = var21.isInverted();
//     boolean var36 = var21.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var37 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var38 = null;
//     var37.notifyListeners(var38);
//     org.jfree.chart.plot.DatasetRenderingOrder var40 = var37.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var41 = null;
//     var37.rendererChanged(var41);
//     int var43 = var37.getDomainAxisCount();
//     boolean var44 = var21.hasListener((java.util.EventListener)var37);
//     org.jfree.chart.plot.CategoryPlot var46 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var47 = null;
//     var46.notifyListeners(var47);
//     org.jfree.chart.axis.AxisLocation var50 = null;
//     var46.setRangeAxisLocation(100, var50);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var52 = var46.getRenderer();
//     org.jfree.chart.axis.AxisLocation var53 = var46.getRangeAxisLocation();
//     var37.setRangeAxisLocation(15, var53, true);
//     var11.setDomainAxisLocation(var53, true);
//     org.jfree.chart.plot.CategoryPlot var58 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var59 = null;
//     var58.notifyListeners(var59);
//     org.jfree.chart.axis.AxisLocation var62 = null;
//     var58.setRangeAxisLocation(100, var62);
//     org.jfree.chart.util.RectangleEdge var64 = var58.getDomainAxisEdge();
//     var11.setParent((org.jfree.chart.plot.Plot)var58);
//     
//     // Checks the contract:  equals-hashcode on var46 and var58
//     assertTrue("Contract failed: equals-hashcode on var46 and var58", var46.equals(var58) ? var46.hashCode() == var58.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var58 and var46
//     assertTrue("Contract failed: equals-hashcode on var58 and var46", var58.equals(var46) ? var58.hashCode() == var46.hashCode() : true);
// 
//   }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var14 = var12.trimWidth(0.0d);
    double var16 = var12.calculateRightOutset(0.0d);
    double var17 = var12.getBottom();
    var1.setTickLabelInsets(var12);
    double var20 = var12.calculateRightOutset((-1.0d));
    double var22 = var12.extendHeight((-47.0d));
    java.lang.String var23 = var12.toString();
    double var25 = var12.calculateTopOutset((-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-45.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"+ "'", var23.equals("RectangleInsets[t=1.0,l=0.0,b=1.0,r=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.plot.PlotOrientation var3 = var0.getOrientation();
    org.jfree.chart.axis.CategoryAxis var4 = var0.getDomainAxis();
    java.awt.Image var5 = var0.getBackgroundImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset(10.0d);
    double var8 = var4.trimHeight(10.0d);
    double var10 = var4.calculateTopInset(100.0d);
    double var12 = var4.calculateLeftOutset(10.0d);
    double var14 = var4.trimWidth((-97.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-197.0d));

  }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var4 = null;
//     var0.setFixedRangeAxisSpace(var4);
//     org.jfree.chart.axis.CategoryAxis var7 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     double var12 = var7.getCategoryMiddle(1, 0, var10, var11);
//     float var13 = var7.getMaximumCategoryLabelWidthRatio();
//     java.awt.Font var14 = var7.getLabelFont();
//     var0.setDomainAxis(0, var7);
//     org.jfree.chart.plot.CategoryPlot var16 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var17 = null;
//     var16.notifyListeners(var17);
//     org.jfree.chart.axis.AxisLocation var20 = null;
//     var16.setRangeAxisLocation(100, var20);
//     java.awt.Graphics2D var22 = null;
//     java.awt.geom.Rectangle2D var23 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var25 = null;
//     boolean var26 = var16.render(var22, var23, (-1), var25);
//     org.jfree.chart.util.SortOrder var27 = var16.getColumnRenderingOrder();
//     var0.setRowRenderingOrder(var27);
//     boolean var29 = var0.getDrawSharedDomainAxis();
//     org.jfree.chart.axis.NumberAxis var31 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var32 = null;
//     boolean var33 = var31.hasListener(var32);
//     var31.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var37 = var31.getTickUnit();
//     org.jfree.data.Range var40 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.chart.JFreeChart var41 = null;
//     org.jfree.chart.event.ChartChangeEvent var42 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var40, var41);
//     var31.setRangeWithMargins(var40, true, true);
//     boolean var46 = var0.equals((java.lang.Object)var40);
//     org.jfree.chart.plot.IntervalMarker var49 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
//     org.jfree.chart.util.RectangleInsets var54 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
//     var49.setLabelOffset(var54);
//     org.jfree.chart.util.Layer var56 = null;
//     var0.addRangeMarker((org.jfree.chart.plot.Marker)var49, var56);
//     var0.setForegroundAlpha(1.0f);
//     java.awt.Graphics2D var60 = null;
//     java.awt.geom.Rectangle2D var61 = null;
//     var0.drawOutline(var60, var61);
// 
//   }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setTickMarkOutsideLength(10.0f);
    org.jfree.data.Range var13 = new org.jfree.data.Range((-100.0d), 4.0d);
    var1.setRangeWithMargins(var13);
    org.jfree.data.Range var17 = org.jfree.data.Range.expand(var13, Double.POSITIVE_INFINITY, (-47.0d));
    java.lang.String var18 = var17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Range[-Infinity,-4884.0]"+ "'", var18.equals("Range[-Infinity,-4884.0]"));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.entity.ChartEntity var5 = new org.jfree.chart.entity.ChartEntity(var4);
    org.jfree.chart.axis.NumberAxis var7 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var8 = var7.getLabelPaint();
    org.jfree.chart.axis.TickUnits var9 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var11 = new org.jfree.chart.axis.NumberAxis("");
    boolean var12 = var11.getAutoRangeStickyZero();
    double var13 = var11.getUpperMargin();
    java.awt.Shape var14 = var11.getUpArrow();
    var11.setTickMarkInsideLength(0.0f);
    boolean var17 = var11.isTickMarksVisible();
    java.awt.Shape var18 = var11.getRightArrow();
    java.awt.Stroke var19 = var11.getTickMarkStroke();
    boolean var20 = var9.equals((java.lang.Object)var19);
    var7.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource)var9);
    java.awt.Shape var22 = var7.getUpArrow();
    var5.setArea(var22);
    org.jfree.chart.entity.ChartEntity var25 = new org.jfree.chart.entity.ChartEntity(var22, "AxisLocation.BOTTOM_OR_LEFT");
    var25.setToolTipText("0,0,-2,2,2,2,2,2");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    org.jfree.chart.axis.TickUnits var0 = new org.jfree.chart.axis.TickUnits();
    org.jfree.chart.axis.NumberAxis var2 = new org.jfree.chart.axis.NumberAxis("");
    boolean var3 = var2.getAutoRangeStickyZero();
    double var4 = var2.getUpperMargin();
    java.awt.Shape var5 = var2.getUpArrow();
    var2.setTickMarkInsideLength(0.0f);
    boolean var8 = var2.isTickMarksVisible();
    java.awt.Shape var9 = var2.getRightArrow();
    java.awt.Stroke var10 = var2.getTickMarkStroke();
    boolean var11 = var0.equals((java.lang.Object)var10);
    int var12 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.TickUnit var14 = var0.getCeilingTickUnit(4.0d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    double var5 = var1.getUpperMargin();
    var1.setAutoRangeStickyZero(false);
    java.lang.String var8 = var1.getLabel();
    org.jfree.chart.axis.CategoryAxis var9 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var12 = null;
    org.jfree.chart.util.RectangleEdge var13 = null;
    double var14 = var9.getCategoryMiddle(1, 0, var12, var13);
    org.jfree.chart.util.RectangleInsets var15 = var9.getTickLabelInsets();
    var1.setLabelInsets(var15);
    var1.setLowerMargin(10.0d);
    java.awt.Paint var19 = var1.getAxisLinePaint();
    org.jfree.chart.axis.MarkerAxisBand var20 = null;
    var1.setMarkerBand(var20);
    org.jfree.chart.util.RectangleInsets var26 = new org.jfree.chart.util.RectangleInsets(Double.POSITIVE_INFINITY, 10.0d, 0.0d, (-46.0d));
    var1.setTickLabelInsets(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    int var3 = java.awt.Color.HSBtoRGB(0.0f, 2.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-667));

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var5 = null;
    boolean var6 = var4.hasListener(var5);
    var4.resizeRange(100.0d, 1.0d);
    boolean var10 = var1.equals((java.lang.Object)100.0d);
    org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var14 = var13.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var15 = null;
    var13.removeChangeListener(var15);
    java.awt.Stroke var17 = var13.getStroke();
    var1.setTickMarkStroke(var17);
    org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
    boolean var21 = var20.getAutoRangeStickyZero();
    double var22 = var20.getUpperMargin();
    java.awt.Shape var23 = var20.getUpArrow();
    org.jfree.data.Range var26 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var27 = var26.getLowerBound();
    double var28 = var26.getLowerBound();
    var20.setDefaultAutoRange(var26);
    var1.setRangeWithMargins(var26);
    boolean var31 = var1.isTickLabelsVisible();
    org.jfree.data.RangeType var32 = var1.getRangeType();
    org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
    double var39 = var37.calculateTopInset(10.0d);
    double var41 = var37.trimHeight(10.0d);
    double var43 = var37.calculateTopInset(100.0d);
    double var45 = var37.calculateLeftOutset(10.0d);
    var1.setTickLabelInsets(var37);
    var1.setLowerBound((-47.0d));
    var1.setTickLabelsVisible(false);
    var1.setPositiveArrowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.jfree.chart.axis.AxisLocation var0 = null;
    org.jfree.chart.plot.CategoryPlot var1 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var2 = null;
    var1.notifyListeners(var2);
    org.jfree.chart.plot.PlotOrientation var4 = var1.getOrientation();
    java.lang.String var5 = var4.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.RectangleEdge var6 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(var0, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PlotOrientation.VERTICAL"+ "'", var5.equals("PlotOrientation.VERTICAL"));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createDownRotationLabelPositions(8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(0.0d);
    org.jfree.chart.axis.CategoryLabelPositions var2 = new org.jfree.chart.axis.CategoryLabelPositions();
    org.jfree.chart.axis.CategoryLabelPosition var3 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var4 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var5 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var6 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var7 = new org.jfree.chart.axis.CategoryLabelPositions(var3, var4, var5, var6);
    boolean var9 = var5.equals((java.lang.Object)108.0d);
    org.jfree.chart.axis.CategoryLabelPositions var10 = org.jfree.chart.axis.CategoryLabelPositions.replaceLeftPosition(var2, var5);
    org.jfree.chart.axis.CategoryLabelWidthType var11 = var5.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var12 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var1, var5);
    org.jfree.chart.axis.CategoryLabelPositions var13 = new org.jfree.chart.axis.CategoryLabelPositions();
    org.jfree.chart.axis.CategoryLabelPosition var14 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var15 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var16 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var17 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var18 = new org.jfree.chart.axis.CategoryLabelPositions(var14, var15, var16, var17);
    org.jfree.chart.axis.CategoryLabelWidthType var19 = var14.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var20 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var13, var14);
    double var21 = var14.getAngle();
    org.jfree.chart.axis.CategoryLabelPositions var22 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var12, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     java.awt.Shape var4 = var1.getUpArrow();
//     var1.setTickMarkInsideLength(0.0f);
//     boolean var7 = var1.isTickMarksVisible();
//     java.awt.Graphics2D var8 = null;
//     org.jfree.chart.axis.AxisState var9 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     java.util.List var12 = var1.refreshTicks(var8, var9, var10, var11);
//     java.lang.Object var13 = null;
//     boolean var14 = var1.equals(var13);
//     boolean var15 = var1.isInverted();
//     boolean var16 = var1.isAutoTickUnitSelection();
//     org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var18 = null;
//     var17.notifyListeners(var18);
//     org.jfree.chart.plot.DatasetRenderingOrder var20 = var17.getDatasetRenderingOrder();
//     org.jfree.chart.event.RendererChangeEvent var21 = null;
//     var17.rendererChanged(var21);
//     int var23 = var17.getDomainAxisCount();
//     boolean var24 = var1.hasListener((java.util.EventListener)var17);
//     int var25 = var17.getDomainAxisCount();
//     org.jfree.chart.plot.CategoryPlot var26 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var27 = null;
//     var26.notifyListeners(var27);
//     org.jfree.chart.axis.CategoryAxis var29 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var32 = null;
//     org.jfree.chart.util.RectangleEdge var33 = null;
//     double var34 = var29.getCategoryMiddle(1, 0, var32, var33);
//     java.lang.Object var35 = var29.clone();
//     java.util.List var36 = var26.getCategoriesForAxis(var29);
//     org.jfree.chart.LegendItemCollection var37 = var26.getLegendItems();
//     var17.setFixedLegendItems(var37);
//     
//     // Checks the contract:  equals-hashcode on var17 and var26
//     assertTrue("Contract failed: equals-hashcode on var17 and var26", var17.equals(var26) ? var17.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var17
//     assertTrue("Contract failed: equals-hashcode on var26 and var17", var26.equals(var17) ? var26.hashCode() == var17.hashCode() : true);
// 
//   }

  public void test480() {}
//   public void test480() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var2 = null;
//     boolean var3 = var1.hasListener(var2);
//     var1.resizeRange(100.0d, 1.0d);
//     var1.setLowerBound(8.0d);
//     org.jfree.chart.axis.NumberAxis var10 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var11 = null;
//     boolean var12 = var10.hasListener(var11);
//     var10.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var16 = var10.getTickUnit();
//     org.jfree.data.Range var19 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.data.Range var21 = org.jfree.data.Range.shift(var19, (-1.0d));
//     var10.setRangeWithMargins(var19, false, true);
//     org.jfree.data.Range var27 = new org.jfree.data.Range((-100.0d), 8.0d);
//     double var28 = var27.getLowerBound();
//     double var29 = var27.getCentralValue();
//     org.jfree.data.Range var30 = org.jfree.data.Range.combine(var19, var27);
//     var1.setRange(var27, false, false);
//     java.awt.geom.Rectangle2D var35 = null;
//     org.jfree.chart.plot.CategoryPlot var36 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var37 = null;
//     var36.notifyListeners(var37);
//     org.jfree.chart.axis.AxisLocation var40 = null;
//     var36.setRangeAxisLocation(100, var40);
//     org.jfree.chart.util.RectangleEdge var42 = var36.getDomainAxisEdge();
//     double var43 = var1.java2DToValue(3.0d, var35, var42);
// 
//   }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var2 = null;
    boolean var3 = var1.hasListener(var2);
    double var4 = var1.getFixedDimension();
    org.jfree.data.Range var5 = var1.getRange();
    boolean var8 = var5.intersects(107.0d, 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    org.jfree.chart.axis.NumberAxis var4 = new org.jfree.chart.axis.NumberAxis("");
    java.util.EventListener var5 = null;
    boolean var6 = var4.hasListener(var5);
    var4.resizeRange(100.0d, 1.0d);
    boolean var10 = var1.equals((java.lang.Object)100.0d);
    org.jfree.chart.plot.IntervalMarker var13 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var14 = var13.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var15 = null;
    var13.removeChangeListener(var15);
    java.awt.Stroke var17 = var13.getStroke();
    var1.setTickMarkStroke(var17);
    org.jfree.chart.JFreeChart var19 = null;
    org.jfree.chart.event.ChartChangeEvent var20 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var17, var19);
    org.jfree.chart.event.ChartChangeEventType var21 = var20.getType();
    org.jfree.chart.JFreeChart var22 = null;
    java.lang.Object var23 = new java.lang.Object();
    org.jfree.chart.JFreeChart var24 = null;
    org.jfree.chart.JFreeChart var26 = null;
    org.jfree.chart.event.ChartChangeEvent var27 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var26);
    org.jfree.chart.event.ChartChangeEventType var28 = var27.getType();
    java.lang.String var29 = var28.toString();
    org.jfree.chart.event.ChartChangeEvent var30 = new org.jfree.chart.event.ChartChangeEvent(var23, var24, var28);
    org.jfree.chart.event.ChartChangeEvent var31 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var21, var22, var28);
    org.jfree.chart.JFreeChart var32 = var31.getChart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var29.equals("ChartChangeEventType.GENERAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    org.jfree.chart.axis.CategoryLabelPositions var1 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.JFreeChart var3 = null;
    org.jfree.chart.event.ChartChangeEvent var4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)' ', var3);
    org.jfree.chart.event.ChartChangeEventType var5 = var4.getType();
    java.lang.String var6 = var5.toString();
    java.awt.Color var10 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    int var11 = var10.getRGB();
    java.awt.Color var18 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var19 = null;
    java.awt.Rectangle var20 = null;
    java.awt.geom.Rectangle2D var21 = null;
    java.awt.geom.AffineTransform var22 = null;
    java.awt.RenderingHints var23 = null;
    java.awt.PaintContext var24 = var18.createContext(var19, var20, var21, var22, var23);
    float[] var28 = new float[] { 100.0f, 0.0f, 10.0f};
    float[] var29 = var18.getColorComponents(var28);
    float[] var30 = java.awt.Color.RGBtoHSB(10, (-254), 0, var29);
    float[] var31 = var10.getColorComponents(var30);
    boolean var32 = var5.equals((java.lang.Object)var31);
    org.jfree.chart.axis.CategoryLabelPositions var34 = org.jfree.chart.axis.CategoryLabelPositions.createUpRotationLabelPositions(4.0d);
    org.jfree.chart.axis.CategoryLabelPosition var35 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var36 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var37 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPosition var38 = new org.jfree.chart.axis.CategoryLabelPosition();
    org.jfree.chart.axis.CategoryLabelPositions var39 = new org.jfree.chart.axis.CategoryLabelPositions(var35, var36, var37, var38);
    org.jfree.chart.axis.CategoryLabelWidthType var40 = var35.getWidthType();
    org.jfree.chart.axis.CategoryLabelPositions var41 = org.jfree.chart.axis.CategoryLabelPositions.replaceTopPosition(var34, var35);
    double var42 = var35.getAngle();
    boolean var43 = var5.equals((java.lang.Object)var35);
    org.jfree.chart.axis.CategoryLabelPositions var44 = org.jfree.chart.axis.CategoryLabelPositions.replaceBottomPosition(var1, var35);
    org.jfree.chart.text.TextBlockAnchor var45 = var35.getLabelAnchor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ChartChangeEventType.GENERAL"+ "'", var6.equals("ChartChangeEventType.GENERAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-254));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     var0.clearRangeAxes();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var2 = null;
//     org.jfree.chart.renderer.category.CategoryItemRenderer[] var3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { var2};
//     var0.setRenderers(var3);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var5 = var0.getRenderer();
//     java.awt.Stroke var6 = var0.getRangeCrosshairStroke();
//     org.jfree.chart.axis.ValueAxis var8 = var0.getRangeAxis(1);
//     org.jfree.chart.plot.PlotRenderingInfo var11 = null;
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     var12.clearRangeAxes();
//     boolean var14 = var12.isSubplot();
//     var12.setAnchorValue(Double.POSITIVE_INFINITY);
//     org.jfree.chart.plot.PlotRenderingInfo var18 = null;
//     org.jfree.chart.axis.NumberAxis var20 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var21 = var20.getAutoRangeStickyZero();
//     double var22 = var20.getUpperMargin();
//     java.awt.Shape var23 = var20.getUpArrow();
//     var20.setTickMarkInsideLength(0.0f);
//     boolean var26 = var20.isTickMarksVisible();
//     org.jfree.chart.util.RectangleInsets var31 = new org.jfree.chart.util.RectangleInsets(1.0d, 0.0d, 1.0d, 100.0d);
//     double var33 = var31.trimWidth(0.0d);
//     double var35 = var31.calculateRightOutset(0.0d);
//     double var36 = var31.getBottom();
//     var20.setTickLabelInsets(var31);
//     org.jfree.chart.axis.TickUnitSource var38 = var20.getStandardTickUnits();
//     org.jfree.data.RangeType var39 = var20.getRangeType();
//     org.jfree.chart.plot.CategoryPlot var40 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var41 = null;
//     var40.notifyListeners(var41);
//     org.jfree.chart.plot.PlotOrientation var43 = var40.getOrientation();
//     var20.addChangeListener((org.jfree.chart.event.AxisChangeListener)var40);
//     org.jfree.chart.plot.PlotRenderingInfo var47 = null;
//     java.awt.geom.Rectangle2D var48 = null;
//     org.jfree.chart.util.RectangleAnchor var49 = null;
//     java.awt.geom.Point2D var50 = org.jfree.chart.util.RectangleAnchor.coordinates(var48, var49);
//     var40.zoomDomainAxes((-99.0d), 2.0d, var47, var50);
//     var12.zoomRangeAxes((-99.0d), var18, var50, true);
//     var0.zoomRangeAxes(1.0E-8d, 100.0d, var11, var50);
//     
//     // Checks the contract:  equals-hashcode on var0 and var40
//     assertTrue("Contract failed: equals-hashcode on var0 and var40", var0.equals(var40) ? var0.hashCode() == var40.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var40 and var0
//     assertTrue("Contract failed: equals-hashcode on var40 and var0", var40.equals(var0) ? var40.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     double var6 = var1.getUpperBound();
//     java.lang.Object var7 = var1.clone();
//     java.awt.Graphics2D var8 = null;
//     java.awt.geom.Rectangle2D var10 = null;
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.plot.CategoryPlot var12 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var13 = null;
//     var12.notifyListeners(var13);
//     org.jfree.chart.axis.AxisLocation var16 = null;
//     var12.setRangeAxisLocation(100, var16);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var18 = var12.getRenderer();
//     org.jfree.chart.axis.AxisLocation var19 = var12.getRangeAxisLocation();
//     var12.setAnchorValue(2.0d, true);
//     org.jfree.chart.plot.Plot var23 = var12.getParent();
//     org.jfree.chart.util.RectangleEdge var24 = var12.getDomainAxisEdge();
//     org.jfree.chart.plot.PlotRenderingInfo var25 = null;
//     org.jfree.chart.axis.AxisState var26 = var1.draw(var8, 0.0d, var10, var11, var24, var25);
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.jfree.data.Range var2 = new org.jfree.data.Range((-100.0d), 8.0d);
    double var3 = var2.getLowerBound();
    double var4 = var2.getCentralValue();
    org.jfree.data.Range var7 = org.jfree.data.Range.shift(var2, 108.0d, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.Range var10 = org.jfree.data.Range.expand(var2, 0.0d, (-197.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-46.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var1 = null;
//     var0.notifyListeners(var1);
//     org.jfree.chart.axis.AxisLocation var4 = null;
//     var0.setRangeAxisLocation(100, var4);
//     org.jfree.chart.renderer.category.CategoryItemRenderer var6 = var0.getRenderer();
//     org.jfree.chart.axis.AxisLocation var7 = var0.getRangeAxisLocation();
//     java.awt.Stroke var8 = var0.getDomainGridlineStroke();
//     org.jfree.data.category.CategoryDataset var9 = var0.getDataset();
//     var0.zoom((-197.0d));
// 
//   }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    org.jfree.chart.axis.NumberAxis var6 = new org.jfree.chart.axis.NumberAxis("");
    boolean var7 = var6.getAutoRangeStickyZero();
    double var8 = var6.getUpperMargin();
    java.awt.Shape var9 = var6.getUpArrow();
    var1.setLeftArrow(var9);
    org.jfree.chart.entity.ChartEntity var11 = new org.jfree.chart.entity.ChartEntity(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.util.RectangleEdge var3 = var0.getDomainAxisEdge();
    java.lang.String var4 = var0.getPlotType();
    var0.clearDomainMarkers(0);
    var0.setDrawSharedDomainAxis(false);
    org.jfree.chart.plot.IntervalMarker var11 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.RectangleInsets var16 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
    var11.setLabelOffset(var16);
    org.jfree.chart.plot.IntervalMarker var20 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var21 = var20.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var22 = null;
    var20.removeChangeListener(var22);
    org.jfree.chart.axis.NumberAxis var25 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var26 = var25.getLabelPaint();
    var20.setOutlinePaint(var26);
    java.awt.Paint var28 = var20.getLabelPaint();
    var11.setOutlinePaint(var28);
    var0.setRangeGridlinePaint(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Category Plot"+ "'", var4.equals("Category Plot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(Double.POSITIVE_INFINITY, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    double var5 = var1.getUpperMargin();
    var1.setAutoRangeMinimumSize(0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.jfree.data.category.CategoryDataset var0 = null;
    org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
    java.awt.geom.Rectangle2D var4 = null;
    org.jfree.chart.util.RectangleEdge var5 = null;
    double var6 = var1.getCategoryMiddle(1, 0, var4, var5);
    double var7 = var1.getUpperMargin();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.util.RectangleEdge var11 = null;
    double var12 = var1.getCategoryStart((-1), 10, var10, var11);
    org.jfree.chart.axis.NumberAxis var14 = new org.jfree.chart.axis.NumberAxis("");
    boolean var15 = var14.getAutoRangeStickyZero();
    double var16 = var14.getUpperMargin();
    java.awt.Shape var17 = var14.getUpArrow();
    var14.setTickMarkInsideLength(0.0f);
    boolean var20 = var14.isTickMarksVisible();
    java.awt.Graphics2D var21 = null;
    org.jfree.chart.axis.AxisState var22 = null;
    java.awt.geom.Rectangle2D var23 = null;
    org.jfree.chart.util.RectangleEdge var24 = null;
    java.util.List var25 = var14.refreshTicks(var21, var22, var23, var24);
    java.lang.Object var26 = null;
    boolean var27 = var14.equals(var26);
    boolean var28 = var14.isInverted();
    boolean var29 = var14.isAutoTickUnitSelection();
    org.jfree.chart.renderer.category.CategoryItemRenderer var30 = null;
    org.jfree.chart.plot.CategoryPlot var31 = new org.jfree.chart.plot.CategoryPlot(var0, var1, (org.jfree.chart.axis.ValueAxis)var14, var30);
    boolean var32 = var14.getAutoRangeIncludesZero();
    var14.configure();
    org.jfree.data.RangeType var34 = var14.getRangeType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test493() {}
//   public void test493() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }
// 
// 
//     org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var2 = var1.getAutoRangeStickyZero();
//     double var3 = var1.getUpperMargin();
//     var1.setPositiveArrowVisible(true);
//     java.awt.geom.Rectangle2D var7 = null;
//     org.jfree.chart.util.RectangleEdge var8 = null;
//     double var9 = var1.valueToJava2D(8.0d, var7, var8);
//     java.awt.geom.Rectangle2D var11 = null;
//     org.jfree.chart.util.RectangleEdge var12 = null;
//     double var13 = var1.lengthToJava2D((-100.0d), var11, var12);
//     boolean var14 = var1.isVisible();
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.axis.CategoryAxis var17 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var20 = null;
//     org.jfree.chart.util.RectangleEdge var21 = null;
//     double var22 = var17.getCategoryMiddle(1, 0, var20, var21);
//     org.jfree.chart.util.RectangleInsets var23 = var17.getTickLabelInsets();
//     org.jfree.chart.plot.CategoryPlot var24 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var25 = null;
//     var24.notifyListeners(var25);
//     org.jfree.chart.util.RectangleEdge var27 = var24.getDomainAxisEdge();
//     org.jfree.chart.axis.AxisSpace var28 = null;
//     var24.setFixedRangeAxisSpace(var28);
//     org.jfree.chart.axis.CategoryAxis var31 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var34 = null;
//     org.jfree.chart.util.RectangleEdge var35 = null;
//     double var36 = var31.getCategoryMiddle(1, 0, var34, var35);
//     float var37 = var31.getMaximumCategoryLabelWidthRatio();
//     java.awt.Font var38 = var31.getLabelFont();
//     var24.setDomainAxis(0, var31);
//     org.jfree.chart.plot.CategoryPlot var40 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var41 = null;
//     var40.notifyListeners(var41);
//     org.jfree.chart.axis.AxisLocation var44 = null;
//     var40.setRangeAxisLocation(100, var44);
//     java.awt.Graphics2D var46 = null;
//     java.awt.geom.Rectangle2D var47 = null;
//     org.jfree.chart.plot.PlotRenderingInfo var49 = null;
//     boolean var50 = var40.render(var46, var47, (-1), var49);
//     org.jfree.chart.util.SortOrder var51 = var40.getColumnRenderingOrder();
//     var24.setRowRenderingOrder(var51);
//     boolean var53 = var24.getDrawSharedDomainAxis();
//     org.jfree.chart.axis.NumberAxis var55 = new org.jfree.chart.axis.NumberAxis("");
//     java.util.EventListener var56 = null;
//     boolean var57 = var55.hasListener(var56);
//     var55.resizeRange(100.0d, 1.0d);
//     org.jfree.chart.axis.NumberTickUnit var61 = var55.getTickUnit();
//     org.jfree.data.Range var64 = new org.jfree.data.Range((-100.0d), 8.0d);
//     org.jfree.chart.JFreeChart var65 = null;
//     org.jfree.chart.event.ChartChangeEvent var66 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var64, var65);
//     var55.setRangeWithMargins(var64, true, true);
//     boolean var70 = var24.equals((java.lang.Object)var64);
//     org.jfree.chart.plot.IntervalMarker var73 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
//     org.jfree.chart.util.RectangleInsets var78 = new org.jfree.chart.util.RectangleInsets(0.0d, 100.0d, (-1.0d), 8.0d);
//     var73.setLabelOffset(var78);
//     org.jfree.chart.util.Layer var80 = null;
//     var24.addRangeMarker((org.jfree.chart.plot.Marker)var73, var80);
//     var17.setPlot((org.jfree.chart.plot.Plot)var24);
//     org.jfree.chart.util.RectangleEdge var84 = var24.getDomainAxisEdge(100);
//     double var85 = var1.java2DToValue((-100.0d), var16, var84);
// 
//   }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    java.text.NumberFormat var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.axis.NumberTickUnit var3 = new org.jfree.chart.axis.NumberTickUnit(4.0d, var1, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    var0.clearRangeAxes();
    boolean var2 = var0.isSubplot();
    var0.setAnchorValue(Double.POSITIVE_INFINITY);
    int var5 = var0.getBackgroundImageAlignment();
    java.awt.Stroke var6 = var0.getDomainGridlineStroke();
    var0.setForegroundAlpha(0.0f);
    org.jfree.chart.plot.IntervalMarker var12 = new org.jfree.chart.plot.IntervalMarker(0.05d, 4.0d);
    org.jfree.chart.util.Layer var13 = null;
    var0.addRangeMarker(255, (org.jfree.chart.plot.Marker)var12, var13);
    org.jfree.chart.plot.CategoryPlot var15 = new org.jfree.chart.plot.CategoryPlot();
    var15.clearRangeAxes();
    boolean var17 = var15.isSubplot();
    var15.setAnchorValue(Double.POSITIVE_INFINITY);
    org.jfree.chart.util.Layer var20 = null;
    java.util.Collection var21 = var15.getDomainMarkers(var20);
    org.jfree.chart.plot.DrawingSupplier var22 = null;
    var15.setDrawingSupplier(var22);
    var12.removeChangeListener((org.jfree.chart.event.MarkerChangeListener)var15);
    double var25 = var12.getEndValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 4.0d);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var1 = null;
    var0.notifyListeners(var1);
    org.jfree.chart.axis.CategoryAxis var4 = new org.jfree.chart.axis.CategoryAxis("hi!");
    java.awt.Paint var6 = var4.getTickLabelPaint((java.lang.Comparable)(-1.0f));
    java.awt.Paint[] var7 = new java.awt.Paint[] { var6};
    org.jfree.chart.plot.IntervalMarker var10 = new org.jfree.chart.plot.IntervalMarker(10.0d, 10.0d);
    float var11 = var10.getAlpha();
    org.jfree.chart.event.MarkerChangeListener var12 = null;
    var10.removeChangeListener(var12);
    org.jfree.chart.axis.NumberAxis var15 = new org.jfree.chart.axis.NumberAxis("");
    java.awt.Paint var16 = var15.getLabelPaint();
    var10.setOutlinePaint(var16);
    java.awt.Paint[] var18 = new java.awt.Paint[] { var16};
    java.awt.Color var22 = java.awt.Color.getHSBColor(100.0f, 0.0f, (-1.0f));
    java.awt.image.ColorModel var23 = null;
    java.awt.Rectangle var24 = null;
    java.awt.geom.Rectangle2D var25 = null;
    java.awt.geom.AffineTransform var26 = null;
    java.awt.RenderingHints var27 = null;
    java.awt.PaintContext var28 = var22.createContext(var23, var24, var25, var26, var27);
    int var29 = var22.getRed();
    java.lang.String var30 = var22.toString();
    java.awt.Paint[] var31 = new java.awt.Paint[] { var22};
    org.jfree.chart.axis.NumberAxis var33 = new org.jfree.chart.axis.NumberAxis("");
    boolean var34 = var33.getAutoRangeStickyZero();
    double var35 = var33.getUpperMargin();
    java.awt.Shape var36 = var33.getUpArrow();
    var33.setTickMarkInsideLength(0.0f);
    boolean var39 = var33.isTickMarksVisible();
    java.awt.Shape var40 = var33.getRightArrow();
    java.awt.Stroke var41 = var33.getTickMarkStroke();
    java.awt.Stroke[] var42 = new java.awt.Stroke[] { var41};
    org.jfree.chart.axis.NumberAxis var44 = new org.jfree.chart.axis.NumberAxis("");
    boolean var45 = var44.getAutoRangeStickyZero();
    var44.setPositiveArrowVisible(false);
    org.jfree.chart.axis.NumberAxis var49 = new org.jfree.chart.axis.NumberAxis("");
    boolean var50 = var49.getAutoRangeStickyZero();
    double var51 = var49.getUpperMargin();
    java.awt.Shape var52 = var49.getUpArrow();
    var49.setTickMarkInsideLength(0.0f);
    boolean var55 = var49.isTickMarksVisible();
    java.awt.Shape var56 = var49.getRightArrow();
    var44.setLeftArrow(var56);
    java.awt.Stroke var58 = var44.getAxisLineStroke();
    java.awt.Stroke[] var59 = new java.awt.Stroke[] { var58};
    java.awt.Shape[] var60 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
    org.jfree.chart.plot.DefaultDrawingSupplier var61 = new org.jfree.chart.plot.DefaultDrawingSupplier(var7, var18, var31, var42, var59, var60);
    java.lang.Object var62 = var61.clone();
    java.awt.Paint var63 = var61.getNextOutlinePaint();
    var0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier)var61);
    org.jfree.chart.axis.NumberAxis var66 = new org.jfree.chart.axis.NumberAxis("");
    boolean var67 = var66.getAutoRangeStickyZero();
    var66.setPositiveArrowVisible(false);
    org.jfree.chart.plot.Plot var70 = var66.getPlot();
    int var71 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var66);
    int var72 = var0.getWeight();
    org.jfree.chart.event.MarkerChangeEvent var73 = null;
    var0.markerChanged(var73);
    org.jfree.chart.event.PlotChangeListener var75 = null;
    var0.removeChangeListener(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.8f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 255);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "java.awt.Color[r=255,g=255,b=2]"+ "'", var30.equals("java.awt.Color[r=255,g=255,b=2]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test497() {}
//   public void test497() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }
// 
// 
//     org.jfree.chart.axis.CategoryAxis var0 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var3 = null;
//     org.jfree.chart.util.RectangleEdge var4 = null;
//     double var5 = var0.getCategoryMiddle(1, 0, var3, var4);
//     double var6 = var0.getUpperMargin();
//     float var7 = var0.getMaximumCategoryLabelWidthRatio();
//     var0.setUpperMargin((-47.0d));
//     boolean var11 = var0.equals((java.lang.Object)4.0d);
//     org.jfree.data.category.CategoryDataset var14 = null;
//     java.awt.geom.Rectangle2D var16 = null;
//     org.jfree.chart.plot.CategoryPlot var17 = new org.jfree.chart.plot.CategoryPlot();
//     org.jfree.chart.event.PlotChangeEvent var18 = null;
//     var17.notifyListeners(var18);
//     org.jfree.chart.axis.AxisLocation var21 = null;
//     var17.setRangeAxisLocation(100, var21);
//     org.jfree.chart.util.RectangleEdge var23 = var17.getDomainAxisEdge();
//     org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var23);
//     double var25 = var0.getCategorySeriesMiddle((java.lang.Comparable)"Range[-Infinity,-4884.0]", (java.lang.Comparable)100.0d, var14, (-1.0d), var16, var23);
// 
//   }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    java.awt.Shape var4 = var1.getUpArrow();
    var1.setTickMarkInsideLength(0.0f);
    boolean var7 = var1.isTickMarksVisible();
    java.awt.Shape var8 = var1.getRightArrow();
    var1.setTickMarkOutsideLength(10.0f);
    org.jfree.chart.plot.CategoryPlot var11 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.event.PlotChangeEvent var12 = null;
    var11.notifyListeners(var12);
    org.jfree.chart.util.RectangleEdge var14 = var11.getDomainAxisEdge();
    var1.setPlot((org.jfree.chart.plot.Plot)var11);
    var11.configureRangeAxes();
    org.jfree.chart.util.RectangleInsets var17 = var11.getAxisOffset();
    var11.setAnchorValue(4.0d);
    var11.setRangeCrosshairLockedOnData(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test499() {}
//   public void test499() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.CategoryAxis var1 = new org.jfree.chart.axis.CategoryAxis();
//     java.awt.geom.Rectangle2D var4 = null;
//     org.jfree.chart.util.RectangleEdge var5 = null;
//     double var6 = var1.getCategoryMiddle(1, 0, var4, var5);
//     double var7 = var1.getUpperMargin();
//     java.awt.geom.Rectangle2D var10 = null;
//     org.jfree.chart.util.RectangleEdge var11 = null;
//     double var12 = var1.getCategoryStart((-1), 10, var10, var11);
//     org.jfree.chart.axis.NumberAxis var14 = new org.jfree.chart.axis.NumberAxis("");
//     boolean var15 = var14.getAutoRangeStickyZero();
//     double var16 = var14.getUpperMargin();
//     java.awt.Shape var17 = var14.getUpArrow();
//     var14.setTickMarkInsideLength(0.0f);
//     boolean var20 = var14.isTickMarksVisible();
//     java.awt.Graphics2D var21 = null;
//     org.jfree.chart.axis.AxisState var22 = null;
//     java.awt.geom.Rectangle2D var23 = null;
//     org.jfree.chart.util.RectangleEdge var24 = null;
//     java.util.List var25 = var14.refreshTicks(var21, var22, var23, var24);
//     java.lang.Object var26 = null;
//     boolean var27 = var14.equals(var26);
//     boolean var28 = var14.isInverted();
//     boolean var29 = var14.isAutoTickUnitSelection();
//     org.jfree.chart.renderer.category.CategoryItemRenderer var30 = null;
//     org.jfree.chart.plot.CategoryPlot var31 = new org.jfree.chart.plot.CategoryPlot(var0, var1, (org.jfree.chart.axis.ValueAxis)var14, var30);
//     org.jfree.chart.plot.Marker var32 = null;
//     org.jfree.chart.util.Layer var33 = null;
//     var31.addRangeMarker(var32, var33);
// 
//   }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    org.jfree.chart.axis.NumberAxis var1 = new org.jfree.chart.axis.NumberAxis("");
    boolean var2 = var1.getAutoRangeStickyZero();
    double var3 = var1.getUpperMargin();
    var1.setPositiveArrowVisible(true);
    java.awt.geom.Rectangle2D var7 = null;
    org.jfree.chart.util.RectangleEdge var8 = null;
    double var9 = var1.valueToJava2D(8.0d, var7, var8);
    java.awt.geom.Rectangle2D var11 = null;
    org.jfree.chart.util.RectangleEdge var12 = null;
    double var13 = var1.lengthToJava2D((-100.0d), var11, var12);
    java.awt.Shape var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setDownArrow(var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

}
