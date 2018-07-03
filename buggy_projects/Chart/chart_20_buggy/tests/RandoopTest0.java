
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, (-1.0d), 10.0d, var3);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Paint var1 = null;
    java.awt.Stroke var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var3 = new org.jfree.chart.plot.ValueMarker(1.0d, var1, var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Paint var1 = null;
    java.awt.Stroke var2 = null;
    java.awt.Paint var3 = null;
    java.awt.Stroke var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(100.0d, var1, var2, var3, var4, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    java.awt.geom.Rectangle2D var6 = null;
    org.jfree.chart.util.LengthAdjustmentType var7 = null;
    org.jfree.chart.util.LengthAdjustmentType var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var9 = var4.createAdjustedRectangle(var6, var7, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 10.0d, (-1.0d), var3);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset((-1.0d));
    java.awt.geom.Rectangle2D var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var10 = var4.createInsetRectangle(var7, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var5 = null;
    var1.notifyListeners(var5);
    java.awt.Font var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelFont(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    java.awt.geom.Rectangle2D var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var8 = var4.createInsetRectangle(var5, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelAnchor(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var6 = var4.calculateTopInset((-1.0d));
//     java.awt.geom.Rectangle2D var7 = null;
//     var4.trim(var7);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelAnchor(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    java.awt.geom.Rectangle2D var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var9 = var4.createInsetRectangle(var6, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    java.awt.Paint var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelPaint(var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopOutset(100.0d);
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var10.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var13 = var10.getLabelOffsetType();
    org.jfree.chart.plot.ValueMarker var15 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var15.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var18 = var15.getLabelOffsetType();
    java.lang.String var19 = var18.toString();
    boolean var21 = var18.equals((java.lang.Object)10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var22 = var4.createAdjustedRectangle(var8, var13, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "CONTRACT"+ "'", var19.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.Object var6 = var1.clone();
    java.awt.Font var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelFont(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.awt.Paint var1 = null;
    java.awt.Stroke var2 = null;
    java.awt.Paint var3 = null;
    java.awt.Stroke var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(10.0d, var1, var2, var3, var4, 0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    java.awt.Paint var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setPaint(var2);
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
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.0d, 100.0d, var3);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    java.lang.String var8 = var4.toString();
    java.awt.geom.Rectangle2D var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var10 = var4.createOutsetRectangle(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"+ "'", var8.equals("RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    java.awt.geom.Rectangle2D var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var15 = var13.createOutsetRectangle(var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.geom.Rectangle2D var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    java.awt.geom.Point2D var2 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    java.awt.Font var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelFont(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.extendWidth((-1.0d));
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var4.createOutsetRectangle(var11, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 109.0d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.awt.Paint var1 = null;
    java.awt.Stroke var2 = null;
    org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var4.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var7 = var4.getLabelOffsetType();
    java.lang.Object var8 = var4.clone();
    java.awt.Paint var9 = var4.getOutlinePaint();
    java.awt.Stroke var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(9.0d, var1, var2, var9, var10, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    java.awt.geom.Rectangle2D var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var7 = var4.createInsetRectangle(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Paint var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setPaint(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     java.lang.Object var12 = var8.clone();
//     java.awt.Paint var13 = var8.getOutlinePaint();
//     var1.setPaint(var13);
//     
//     // Checks the contract:  equals-hashcode on var1 and var8
//     assertTrue("Contract failed: equals-hashcode on var1 and var8", var1.equals(var8) ? var1.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var1
//     assertTrue("Contract failed: equals-hashcode on var8 and var1", var8.equals(var1) ? var8.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     java.lang.String var7 = var1.getLabel();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var9.notifyListeners(var12);
//     java.awt.Paint var14 = var9.getLabelPaint();
//     var1.setOutlinePaint(var14);
//     java.lang.Class var16 = null;
//     java.util.EventListener[] var17 = var1.getListeners(var16);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 122.0d, 1.0d, 9.0d);
    java.awt.geom.Rectangle2D var12 = null;
    org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var14.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var17 = var14.getLabelOffsetType();
    org.jfree.chart.util.LengthAdjustmentType var18 = var14.getLabelOffsetType();
    org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var20.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var23 = var20.getLabelOffsetType();
    boolean var25 = var23.equals((java.lang.Object)0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var26 = var11.createAdjustedRectangle(var12, var18, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var7.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var10 = var7.getLabelOffsetType();
//     java.lang.Object var11 = var7.clone();
//     java.awt.Paint var12 = var7.getOutlinePaint();
//     var1.setLabelPaint(var12);
//     
//     // Checks the contract:  equals-hashcode on var5 and var11
//     assertTrue("Contract failed: equals-hashcode on var5 and var11", var5.equals(var11) ? var5.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var5
//     assertTrue("Contract failed: equals-hashcode on var11 and var5", var11.equals(var5) ? var11.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    boolean var12 = var4.equals((java.lang.Object)122.0d);
    java.awt.geom.Rectangle2D var13 = null;
    org.jfree.chart.plot.ValueMarker var15 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var15.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var18 = var15.getLabelOffsetType();
    boolean var20 = var18.equals((java.lang.Object)0.0d);
    boolean var22 = var18.equals((java.lang.Object)"hi!");
    org.jfree.chart.plot.ValueMarker var24 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var24.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var27 = var24.getLabelOffsetType();
    boolean var29 = var27.equals((java.lang.Object)0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var30 = var4.createAdjustedRectangle(var13, var18, var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     java.lang.Class var7 = null;
//     java.util.EventListener[] var8 = var1.getListeners(var7);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateBottomInset((-1.0d));
    double var8 = var4.getLeft();
    java.awt.geom.Rectangle2D var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var10 = var4.createOutsetRectangle(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    double var9 = var4.extendHeight(120.0d);
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var12.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
    org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var17.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var20 = var17.getLabelOffsetType();
    org.jfree.chart.util.LengthAdjustmentType var21 = var17.getLabelOffsetType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var22 = var4.createAdjustedRectangle(var10, var15, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 121.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.util.LengthAdjustmentType var5 = var1.getLabelOffsetType();
    java.awt.Font var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelFont(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.util.RectangleAnchor var21 = var1.getLabelAnchor();
//     org.jfree.chart.plot.ValueMarker var23 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var23.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var26 = var23.getLabelOffsetType();
//     java.lang.Object var27 = var23.clone();
//     boolean var28 = var21.equals(var27);
//     
//     // Checks the contract:  equals-hashcode on var13 and var23
//     assertTrue("Contract failed: equals-hashcode on var13 and var23", var13.equals(var23) ? var13.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var13
//     assertTrue("Contract failed: equals-hashcode on var23 and var13", var23.equals(var13) ? var23.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getBottom();
//     org.jfree.chart.util.UnitType var6 = var4.getUnitType();
//     boolean var8 = var6.equals((java.lang.Object)"");
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
//     org.jfree.chart.util.RectangleInsets var18 = new org.jfree.chart.util.RectangleInsets(var6, 120.0d, 0.0d, 100.0d, 121.0d);
//     java.awt.geom.Rectangle2D var19 = null;
//     var18.trim(var19);
// 
//   }

  public void test39() {}
//   public void test39() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.awt.geom.Rectangle2D var25 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 100.0d, 100.0d, var24);
// 
//   }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateBottomInset((-1.0d));
    boolean var9 = var4.equals((java.lang.Object)100.0f);
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var13 = var4.createInsetRectangle(var10, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset((-1.0d));
    double var8 = var4.calculateLeftInset(122.0d);
    double var9 = var4.getLeft();
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
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10.0d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    org.jfree.chart.util.RectangleInsets var18 = new org.jfree.chart.util.RectangleInsets(var6, 120.0d, 0.0d, 100.0d, 121.0d);
    java.awt.geom.Rectangle2D var19 = null;
    org.jfree.chart.plot.ValueMarker var21 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var21.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var24 = var21.getLabelOffsetType();
    java.lang.String var25 = var24.toString();
    org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var27.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var30 = var27.getLabelOffsetType();
    java.lang.String var31 = var30.toString();
    boolean var33 = var30.equals((java.lang.Object)10.0d);
    org.jfree.chart.util.RectangleInsets var38 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var40 = var38.trimHeight(120.0d);
    double var41 = var38.getLeft();
    boolean var42 = var30.equals((java.lang.Object)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var43 = var18.createAdjustedRectangle(var19, var24, var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "CONTRACT"+ "'", var25.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "CONTRACT"+ "'", var31.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.JFreeChart var21 = null;
//     org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1, var21);
//     org.jfree.chart.plot.ValueMarker var24 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var24.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var27 = null;
//     var24.notifyListeners(var27);
//     java.lang.Object var29 = var24.clone();
//     java.awt.Font var30 = var24.getLabelFont();
//     java.awt.Stroke var31 = var24.getOutlineStroke();
//     var1.setStroke(var31);
//     
//     // Checks the contract:  equals-hashcode on var13 and var24
//     assertTrue("Contract failed: equals-hashcode on var13 and var24", var13.equals(var24) ? var13.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var13
//     assertTrue("Contract failed: equals-hashcode on var24 and var13", var24.equals(var13) ? var24.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha(100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    java.lang.Object var0 = null;
    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.util.RectangleInsets var6 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var8 = var6.equals((java.lang.Object)(short)100);
    double var10 = var6.extendHeight(121.0d);
    org.jfree.chart.JFreeChart var11 = null;
    org.jfree.chart.event.ChartChangeEvent var13 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.event.ChartChangeEventType var14 = null;
    var13.setType(var14);
    org.jfree.chart.event.ChartChangeEventType var16 = var13.getType();
    org.jfree.chart.event.ChartChangeEvent var18 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.JFreeChart var19 = null;
    var18.setChart(var19);
    org.jfree.chart.JFreeChart var21 = var18.getChart();
    org.jfree.chart.event.ChartChangeEventType var22 = var18.getType();
    var13.setType(var22);
    org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var10, var11, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.ChartChangeEvent var25 = new org.jfree.chart.event.ChartChangeEvent(var0, var1, var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.lang.String var25 = var24.toString();
//     java.awt.geom.Rectangle2D var26 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 9.0d, 0.0d, var24);
// 
//   }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     double var7 = var1.getValue();
//     java.lang.Object var8 = var1.clone();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var13 = null;
//     var10.notifyListeners(var13);
//     java.lang.Object var15 = var10.clone();
//     java.awt.Font var16 = var10.getLabelFont();
//     java.awt.Stroke var17 = var10.getOutlineStroke();
//     var1.setStroke(var17);
//     
//     // Checks the contract:  equals-hashcode on var1 and var10
//     assertTrue("Contract failed: equals-hashcode on var1 and var10", var1.equals(var10) ? var1.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var1
//     assertTrue("Contract failed: equals-hashcode on var10 and var1", var10.equals(var1) ? var10.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var15
//     assertTrue("Contract failed: equals-hashcode on var8 and var15", var8.equals(var15) ? var8.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var8
//     assertTrue("Contract failed: equals-hashcode on var15 and var8", var15.equals(var8) ? var15.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.awt.Paint var7 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var9.notifyListeners(var12);
//     java.lang.String var14 = var9.getLabel();
//     java.awt.Stroke var15 = null;
//     var9.setOutlineStroke(var15);
//     java.awt.Paint var17 = var9.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var22 = var19.getLabelOffsetType();
//     java.awt.Stroke var23 = null;
//     var19.setOutlineStroke(var23);
//     java.awt.Paint var25 = var19.getOutlinePaint();
//     var9.setLabelPaint(var25);
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("hi!");
//     boolean var31 = var9.equals((java.lang.Object)var28);
//     java.awt.Stroke var32 = var28.getOutlineStroke();
//     java.awt.Paint var33 = null;
//     org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var35.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var38 = null;
//     var35.notifyListeners(var38);
//     java.lang.String var40 = var35.getLabel();
//     java.awt.Stroke var41 = null;
//     var35.setOutlineStroke(var41);
//     java.awt.Paint var43 = var35.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var45 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var45.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var48 = var45.getLabelOffsetType();
//     java.awt.Stroke var49 = null;
//     var45.setOutlineStroke(var49);
//     java.awt.Paint var51 = var45.getOutlinePaint();
//     var35.setLabelPaint(var51);
//     org.jfree.chart.plot.ValueMarker var54 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var54.setLabel("hi!");
//     boolean var57 = var35.equals((java.lang.Object)var54);
//     java.awt.Stroke var58 = var54.getStroke();
//     org.jfree.chart.plot.ValueMarker var60 = new org.jfree.chart.plot.ValueMarker(220.0d, var7, var32, var33, var58, 0.0f);
//     
//     // Checks the contract:  equals-hashcode on var9 and var35
//     assertTrue("Contract failed: equals-hashcode on var9 and var35", var9.equals(var35) ? var9.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var45
//     assertTrue("Contract failed: equals-hashcode on var19 and var45", var19.equals(var45) ? var19.hashCode() == var45.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var54
//     assertTrue("Contract failed: equals-hashcode on var28 and var54", var28.equals(var54) ? var28.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var9
//     assertTrue("Contract failed: equals-hashcode on var35 and var9", var35.equals(var9) ? var35.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var45 and var19
//     assertTrue("Contract failed: equals-hashcode on var45 and var19", var45.equals(var19) ? var45.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var54 and var28
//     assertTrue("Contract failed: equals-hashcode on var54 and var28", var54.equals(var28) ? var54.hashCode() == var28.hashCode() : true);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     java.lang.String var7 = var1.getLabel();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var12 = var9.getLabelOffsetType();
//     java.awt.Stroke var13 = null;
//     var9.setOutlineStroke(var13);
//     org.jfree.chart.text.TextAnchor var15 = var9.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var20 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var21 = var20.getRight();
//     double var23 = var20.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var23);
//     boolean var25 = var15.equals((java.lang.Object)var24);
//     org.jfree.chart.util.RectangleInsets var30 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var31 = var30.getBottom();
//     org.jfree.chart.util.UnitType var32 = var30.getUnitType();
//     boolean var34 = var32.equals((java.lang.Object)"");
//     boolean var35 = var15.equals((java.lang.Object)var32);
//     var1.setLabelTextAnchor(var15);
//     org.jfree.chart.plot.ValueMarker var38 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var38.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var41 = var38.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var42 = null;
//     var38.notifyListeners(var42);
//     java.lang.String var44 = var38.getLabel();
//     org.jfree.chart.plot.ValueMarker var46 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var46.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var49 = null;
//     var46.notifyListeners(var49);
//     java.awt.Paint var51 = var46.getLabelPaint();
//     var38.setOutlinePaint(var51);
//     var1.setOutlinePaint(var51);
//     
//     // Checks the contract:  equals-hashcode on var1 and var38
//     assertTrue("Contract failed: equals-hashcode on var1 and var38", var1.equals(var38) ? var1.hashCode() == var38.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var1
//     assertTrue("Contract failed: equals-hashcode on var38 and var1", var38.equals(var1) ? var38.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var11 = null;
//     var8.notifyListeners(var11);
//     java.awt.Paint var13 = var8.getLabelPaint();
//     java.awt.Font var14 = var8.getLabelFont();
//     var1.setLabelFont(var14);
//     
//     // Checks the contract:  equals-hashcode on var1 and var8
//     assertTrue("Contract failed: equals-hashcode on var1 and var8", var1.equals(var8) ? var1.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var1
//     assertTrue("Contract failed: equals-hashcode on var8 and var1", var8.equals(var1) ? var8.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    org.jfree.chart.util.RectangleInsets var6 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var7 = var6.getBottom();
    org.jfree.chart.util.UnitType var8 = var6.getUnitType();
    var1.setLabelOffset(var6);
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var11 = var6.createOutsetRectangle(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("hi!");
//     java.awt.Paint var4 = var1.getOutlinePaint();
//     java.awt.Paint var5 = var1.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var7.setLabel("");
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var15 = null;
//     var11.notifyListeners(var15);
//     java.lang.String var17 = var11.getLabel();
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var22 = null;
//     var19.notifyListeners(var22);
//     java.awt.Paint var24 = var19.getLabelPaint();
//     var11.setOutlinePaint(var24);
//     var7.setPaint(var24);
//     org.jfree.chart.util.RectangleAnchor var27 = var7.getLabelAnchor();
//     var1.setLabelAnchor(var27);
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var30.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var33 = null;
//     var30.notifyListeners(var33);
//     java.awt.Paint var35 = var30.getLabelPaint();
//     boolean var36 = var27.equals((java.lang.Object)var30);
//     
//     // Checks the contract:  equals-hashcode on var19 and var30
//     assertTrue("Contract failed: equals-hashcode on var19 and var30", var19.equals(var30) ? var19.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var19
//     assertTrue("Contract failed: equals-hashcode on var30 and var19", var30.equals(var19) ? var30.hashCode() == var19.hashCode() : true);
// 
//   }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.JFreeChart var21 = null;
//     org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1, var21);
//     java.lang.Class var23 = null;
//     java.util.EventListener[] var24 = var1.getListeners(var23);
// 
//   }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    double var12 = var4.extendWidth((-111.0d));
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var4.createOutsetRectangle(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    org.jfree.chart.util.RectangleInsets var6 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var7 = var6.getBottom();
    org.jfree.chart.util.UnitType var8 = var6.getUnitType();
    var1.setLabelOffset(var6);
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var11 = var6.createInsetRectangle(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.trimHeight(120.0d);
    double var7 = var4.getLeft();
    double var8 = var4.getTop();
    double var10 = var4.calculateBottomInset(121.0d);
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
    assertTrue(var6 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


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

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     java.awt.Font var9 = var1.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("hi!");
//     java.awt.Paint var14 = var11.getOutlinePaint();
//     var1.setPaint(var14);
//     org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var17.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var20 = var17.getLabelOffsetType();
//     java.lang.Object var21 = var17.clone();
//     java.awt.Paint var22 = var17.getOutlinePaint();
//     java.awt.Paint var23 = var17.getPaint();
//     org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var25.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var28 = var25.getLabelOffsetType();
//     java.awt.Stroke var29 = null;
//     var25.setOutlineStroke(var29);
//     org.jfree.chart.text.TextAnchor var31 = var25.getLabelTextAnchor();
//     var17.setLabelTextAnchor(var31);
//     var1.setLabelTextAnchor(var31);
//     
//     // Checks the contract:  equals-hashcode on var1 and var25
//     assertTrue("Contract failed: equals-hashcode on var1 and var25", var1.equals(var25) ? var1.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var1
//     assertTrue("Contract failed: equals-hashcode on var25 and var1", var25.equals(var1) ? var25.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    java.lang.Object var0 = null;
    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.event.ChartChangeEvent var3 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)109.0d);
    java.lang.Object var4 = var3.getSource();
    org.jfree.chart.event.ChartChangeEventType var5 = var3.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.ChartChangeEvent var6 = new org.jfree.chart.event.ChartChangeEvent(var0, var1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 109.0d+ "'", var4.equals(109.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    java.lang.Object var5 = var1.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha((-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    java.awt.geom.Rectangle2D var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var7 = var4.createOutsetRectangle(var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    java.lang.String var14 = var6.toString();
    org.jfree.chart.util.RectangleInsets var19 = new org.jfree.chart.util.RectangleInsets(var6, 119.0d, 10.0d, 109.0d, 0.0d);
    org.jfree.chart.JFreeChart var20 = null;
    org.jfree.chart.event.ChartChangeEvent var21 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)119.0d, var20);
    org.jfree.chart.JFreeChart var22 = var21.getChart();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "UnitType.ABSOLUTE"+ "'", var14.equals("UnitType.ABSOLUTE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var5 = null;
    var1.notifyListeners(var5);
    org.jfree.chart.event.MarkerChangeListener var7 = null;
    var1.addChangeListener(var7);
    org.jfree.chart.util.RectangleInsets var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelOffset(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var9 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var10 = var9.getBottom();
    org.jfree.chart.util.UnitType var11 = var9.getUnitType();
    boolean var13 = var11.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var18 = new org.jfree.chart.util.RectangleInsets(var11, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var20 = var18.calculateRightInset(0.0d);
    boolean var21 = var4.equals((java.lang.Object)0.0d);
    org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.Object var6 = var1.clone();
//     float var7 = var1.getAlpha();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var16 = var13.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var17 = null;
//     var13.notifyListeners(var17);
//     java.lang.String var19 = var13.getLabel();
//     org.jfree.chart.plot.ValueMarker var21 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var21.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var24 = null;
//     var21.notifyListeners(var24);
//     java.awt.Paint var26 = var21.getLabelPaint();
//     var13.setOutlinePaint(var26);
//     var9.setPaint(var26);
//     org.jfree.chart.JFreeChart var29 = null;
//     org.jfree.chart.event.ChartChangeEvent var30 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var9, var29);
//     org.jfree.chart.event.MarkerChangeEvent var31 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var9);
//     org.jfree.chart.plot.Marker var32 = var31.getMarker();
//     var1.notifyListeners(var31);
//     
//     // Checks the contract:  equals-hashcode on var1 and var21
//     assertTrue("Contract failed: equals-hashcode on var1 and var21", var1.equals(var21) ? var1.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var1
//     assertTrue("Contract failed: equals-hashcode on var21 and var1", var21.equals(var1) ? var21.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("hi!");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var8 = null;
//     var5.notifyListeners(var8);
//     java.awt.Paint var10 = var5.getLabelPaint();
//     var1.setPaint(var10);
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var16 = var13.getLabelOffsetType();
//     boolean var18 = var16.equals((java.lang.Object)0.0d);
//     var1.setLabelOffsetType(var16);
//     
//     // Checks the contract:  equals-hashcode on var5 and var13
//     assertTrue("Contract failed: equals-hashcode on var5 and var13", var5.equals(var13) ? var5.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var5
//     assertTrue("Contract failed: equals-hashcode on var13 and var5", var13.equals(var5) ? var13.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.util.RectangleAnchor var21 = var1.getLabelAnchor();
//     java.lang.Object var22 = var1.clone();
//     org.jfree.chart.plot.ValueMarker var24 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var24.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var27 = null;
//     var24.notifyListeners(var27);
//     java.lang.Object var29 = var24.clone();
//     java.awt.Font var30 = var24.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var32 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var32.setLabel("hi!");
//     java.awt.Paint var35 = var32.getOutlinePaint();
//     java.awt.Paint var36 = var32.getLabelPaint();
//     var24.setOutlinePaint(var36);
//     var1.setPaint(var36);
//     
//     // Checks the contract:  equals-hashcode on var5 and var24
//     assertTrue("Contract failed: equals-hashcode on var5 and var24", var5.equals(var24) ? var5.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var5
//     assertTrue("Contract failed: equals-hashcode on var24 and var5", var24.equals(var5) ? var24.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     java.awt.Paint var9 = var1.getPaint();
//     java.lang.Class var10 = null;
//     java.util.EventListener[] var11 = var1.getListeners(var10);
// 
//   }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getBottom();
//     double var7 = var4.calculateTopInset(1.0d);
//     double var9 = var4.extendHeight(120.0d);
//     double var11 = var4.extendWidth(0.0d);
//     java.awt.geom.Rectangle2D var12 = null;
//     var4.trim(var12);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.Object var6 = var1.clone();
//     java.awt.Font var7 = var1.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var12 = var9.getLabelOffsetType();
//     java.lang.Object var13 = var9.clone();
//     java.awt.Paint var14 = var9.getOutlinePaint();
//     java.awt.Paint var15 = var9.getPaint();
//     var1.setLabelPaint(var15);
//     
//     // Checks the contract:  equals-hashcode on var6 and var13
//     assertTrue("Contract failed: equals-hashcode on var6 and var13", var6.equals(var13) ? var6.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var6
//     assertTrue("Contract failed: equals-hashcode on var13 and var6", var13.equals(var6) ? var13.hashCode() == var6.hashCode() : true);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var2.setLabel("hi!");
    java.awt.Paint var5 = var2.getOutlinePaint();
    java.awt.Paint var6 = var2.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var8.setLabel("hi!");
    java.awt.Paint var11 = var8.getOutlinePaint();
    java.awt.Paint var12 = var8.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var14.setLabel("");
    org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var18.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var21 = var18.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var22 = null;
    var18.notifyListeners(var22);
    java.lang.String var24 = var18.getLabel();
    org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var26.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var29 = null;
    var26.notifyListeners(var29);
    java.awt.Paint var31 = var26.getLabelPaint();
    var18.setOutlinePaint(var31);
    var14.setPaint(var31);
    org.jfree.chart.util.RectangleAnchor var34 = var14.getLabelAnchor();
    var8.setLabelAnchor(var34);
    java.awt.Stroke var36 = var8.getOutlineStroke();
    org.jfree.chart.plot.ValueMarker var38 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var38.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var41 = var38.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var42 = null;
    var38.notifyListeners(var42);
    java.lang.String var44 = var38.getLabel();
    org.jfree.chart.plot.ValueMarker var46 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var46.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var49 = null;
    var46.notifyListeners(var49);
    java.awt.Paint var51 = var46.getLabelPaint();
    var38.setOutlinePaint(var51);
    java.awt.Stroke var53 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var55 = new org.jfree.chart.plot.ValueMarker(0.0d, var6, var36, var51, var53, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getBottom();
//     org.jfree.chart.util.UnitType var6 = var4.getUnitType();
//     boolean var8 = var6.equals((java.lang.Object)"");
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var15 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
//     org.jfree.chart.JFreeChart var16 = null;
//     var15.setChart(var16);
//     boolean var18 = var6.equals((java.lang.Object)var16);
//     org.jfree.chart.util.RectangleInsets var23 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 0.0d, 10.0d);
//     double var24 = var23.getRight();
//     java.awt.geom.Rectangle2D var25 = null;
//     var23.trim(var25);
// 
//   }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.awt.Paint var7 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var9.notifyListeners(var12);
//     java.lang.String var14 = var9.getLabel();
//     java.awt.Stroke var15 = null;
//     var9.setOutlineStroke(var15);
//     java.awt.Paint var17 = var9.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var22 = var19.getLabelOffsetType();
//     java.awt.Stroke var23 = null;
//     var19.setOutlineStroke(var23);
//     java.awt.Paint var25 = var19.getOutlinePaint();
//     var9.setLabelPaint(var25);
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("hi!");
//     boolean var31 = var9.equals((java.lang.Object)var28);
//     java.awt.Stroke var32 = var28.getStroke();
//     org.jfree.chart.plot.ValueMarker var34 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var34.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var37 = null;
//     var34.notifyListeners(var37);
//     java.lang.String var39 = var34.getLabel();
//     java.awt.Stroke var40 = null;
//     var34.setOutlineStroke(var40);
//     java.awt.Paint var42 = var34.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var44.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var47 = null;
//     var44.notifyListeners(var47);
//     java.lang.String var49 = var44.getLabel();
//     java.awt.Stroke var50 = null;
//     var44.setOutlineStroke(var50);
//     java.awt.Paint var52 = var44.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var54 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var54.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var57 = var54.getLabelOffsetType();
//     java.awt.Stroke var58 = null;
//     var54.setOutlineStroke(var58);
//     java.awt.Paint var60 = var54.getOutlinePaint();
//     var44.setLabelPaint(var60);
//     org.jfree.chart.plot.ValueMarker var63 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var63.setLabel("hi!");
//     boolean var66 = var44.equals((java.lang.Object)var63);
//     java.awt.Stroke var67 = var63.getStroke();
//     org.jfree.chart.plot.ValueMarker var69 = new org.jfree.chart.plot.ValueMarker(122.0d, var7, var32, var42, var67, 0.0f);
//     
//     // Checks the contract:  equals-hashcode on var9 and var44
//     assertTrue("Contract failed: equals-hashcode on var9 and var44", var9.equals(var44) ? var9.hashCode() == var44.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var34
//     assertTrue("Contract failed: equals-hashcode on var19 and var34", var19.equals(var34) ? var19.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var19 and var54
//     assertTrue("Contract failed: equals-hashcode on var19 and var54", var19.equals(var54) ? var19.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var63
//     assertTrue("Contract failed: equals-hashcode on var28 and var63", var28.equals(var63) ? var28.hashCode() == var63.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var19
//     assertTrue("Contract failed: equals-hashcode on var34 and var19", var34.equals(var19) ? var34.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var54
//     assertTrue("Contract failed: equals-hashcode on var34 and var54", var34.equals(var54) ? var34.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var9
//     assertTrue("Contract failed: equals-hashcode on var44 and var9", var44.equals(var9) ? var44.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var54 and var19
//     assertTrue("Contract failed: equals-hashcode on var54 and var19", var54.equals(var19) ? var54.hashCode() == var19.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var54 and var34
//     assertTrue("Contract failed: equals-hashcode on var54 and var34", var54.equals(var34) ? var54.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var63 and var28
//     assertTrue("Contract failed: equals-hashcode on var63 and var28", var63.equals(var28) ? var63.hashCode() == var28.hashCode() : true);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     boolean var6 = var4.equals((java.lang.Object)(short)100);
//     double var8 = var4.extendHeight(121.0d);
//     double var10 = var4.extendWidth((-1.0d));
//     double var12 = var4.calculateLeftInset(0.0d);
//     org.jfree.chart.util.RectangleInsets var17 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var18 = var17.getBottom();
//     org.jfree.chart.util.UnitType var19 = var17.getUnitType();
//     boolean var21 = var19.equals((java.lang.Object)"");
//     org.jfree.chart.util.RectangleInsets var26 = new org.jfree.chart.util.RectangleInsets(var19, 10.0d, 0.0d, 1.0d, (-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var28 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
//     org.jfree.chart.JFreeChart var29 = null;
//     var28.setChart(var29);
//     boolean var31 = var19.equals((java.lang.Object)var29);
//     boolean var32 = var4.equals((java.lang.Object)var19);
//     double var34 = var4.calculateLeftInset(0.0d);
//     java.awt.geom.Rectangle2D var35 = null;
//     var4.trim(var35);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    java.awt.geom.Rectangle2D var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var10 = var4.createInsetRectangle(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     java.awt.Paint var9 = var1.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
//     java.awt.Stroke var15 = null;
//     var11.setOutlineStroke(var15);
//     java.awt.Paint var17 = var11.getOutlinePaint();
//     var1.setLabelPaint(var17);
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("hi!");
//     boolean var23 = var1.equals((java.lang.Object)var20);
//     org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var25.setLabel("");
//     org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var29.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var33 = null;
//     var29.notifyListeners(var33);
//     java.lang.String var35 = var29.getLabel();
//     org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var37.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var40 = null;
//     var37.notifyListeners(var40);
//     java.awt.Paint var42 = var37.getLabelPaint();
//     var29.setOutlinePaint(var42);
//     var25.setPaint(var42);
//     org.jfree.chart.util.RectangleAnchor var45 = var25.getLabelAnchor();
//     var20.setLabelAnchor(var45);
//     org.jfree.chart.plot.ValueMarker var48 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var48.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var51 = null;
//     var48.notifyListeners(var51);
//     java.lang.Object var53 = var48.clone();
//     java.awt.Font var54 = var48.getLabelFont();
//     java.awt.Stroke var55 = var48.getOutlineStroke();
//     var20.setOutlineStroke(var55);
//     
//     // Checks the contract:  equals-hashcode on var37 and var48
//     assertTrue("Contract failed: equals-hashcode on var37 and var48", var37.equals(var48) ? var37.hashCode() == var48.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var48 and var37
//     assertTrue("Contract failed: equals-hashcode on var48 and var37", var48.equals(var37) ? var48.hashCode() == var37.hashCode() : true);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Paint var9 = var1.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    java.awt.Stroke var15 = null;
    var11.setOutlineStroke(var15);
    java.awt.Paint var17 = var11.getOutlinePaint();
    var1.setLabelPaint(var17);
    org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var20.setLabel("hi!");
    boolean var23 = var1.equals((java.lang.Object)var20);
    org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var2 = var1.getLabelTextAnchor();
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var5 = var4.getLabelTextAnchor();
//     var1.setLabelTextAnchor(var5);
//     
//     // Checks the contract:  equals-hashcode on var1 and var4
//     assertTrue("Contract failed: equals-hashcode on var1 and var4", var1.equals(var4) ? var1.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var1
//     assertTrue("Contract failed: equals-hashcode on var4 and var1", var4.equals(var1) ? var4.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("hi!");
    java.awt.Paint var4 = var1.getOutlinePaint();
    java.awt.Paint var5 = var1.getLabelPaint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setAlpha(100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("hi!");
//     java.awt.Paint var5 = var2.getOutlinePaint();
//     java.awt.Paint var6 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var12.notifyListeners(var16);
//     java.lang.String var18 = var12.getLabel();
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var23 = null;
//     var20.notifyListeners(var23);
//     java.awt.Paint var25 = var20.getLabelPaint();
//     var12.setOutlinePaint(var25);
//     var8.setPaint(var25);
//     org.jfree.chart.util.RectangleAnchor var28 = var8.getLabelAnchor();
//     var2.setLabelAnchor(var28);
//     java.awt.geom.Point2D var30 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var28);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.extendWidth((-1.0d));
    double var12 = var4.calculateLeftInset(0.0d);
    double var14 = var4.calculateBottomOutset(119.0d);
    java.awt.geom.Rectangle2D var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var16 = var4.createOutsetRectangle(var15);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 109.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.Object var6 = var1.clone();
//     java.awt.Font var7 = var1.getLabelFont();
//     java.awt.Stroke var8 = var1.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var14.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var17 = var14.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var18 = null;
//     var14.notifyListeners(var18);
//     java.lang.String var20 = var14.getLabel();
//     org.jfree.chart.plot.ValueMarker var22 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var22.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var25 = null;
//     var22.notifyListeners(var25);
//     java.awt.Paint var27 = var22.getLabelPaint();
//     var14.setOutlinePaint(var27);
//     var10.setPaint(var27);
//     org.jfree.chart.JFreeChart var30 = null;
//     org.jfree.chart.event.ChartChangeEvent var31 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var10, var30);
//     org.jfree.chart.event.MarkerChangeEvent var32 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var10);
//     org.jfree.chart.plot.Marker var33 = var32.getMarker();
//     var1.notifyListeners(var32);
//     
//     // Checks the contract:  equals-hashcode on var1 and var22
//     assertTrue("Contract failed: equals-hashcode on var1 and var22", var1.equals(var22) ? var1.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var1
//     assertTrue("Contract failed: equals-hashcode on var22 and var1", var22.equals(var1) ? var22.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.JFreeChart var21 = null;
//     org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1, var21);
//     var1.setLabel("UnitType.ABSOLUTE");
//     org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var26.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var29 = null;
//     var26.notifyListeners(var29);
//     java.lang.Object var31 = var26.clone();
//     java.awt.Font var32 = var26.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var34 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var34.setLabel("hi!");
//     java.awt.Paint var37 = var34.getOutlinePaint();
//     java.awt.Paint var38 = var34.getLabelPaint();
//     var26.setOutlinePaint(var38);
//     var1.setPaint(var38);
//     
//     // Checks the contract:  equals-hashcode on var5 and var26
//     assertTrue("Contract failed: equals-hashcode on var5 and var26", var5.equals(var26) ? var5.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var5
//     assertTrue("Contract failed: equals-hashcode on var26 and var5", var26.equals(var5) ? var26.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    java.awt.geom.Rectangle2D var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var9 = var4.createOutsetRectangle(var6, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.lang.String var7 = var2.getLabel();
//     java.awt.Stroke var8 = null;
//     var2.setOutlineStroke(var8);
//     java.awt.Paint var10 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
//     java.awt.Stroke var16 = null;
//     var12.setOutlineStroke(var16);
//     java.awt.Paint var18 = var12.getOutlinePaint();
//     var2.setLabelPaint(var18);
//     org.jfree.chart.plot.ValueMarker var21 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var21.setLabel("hi!");
//     boolean var24 = var2.equals((java.lang.Object)var21);
//     org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var26.setLabel("");
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var30.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var33 = var30.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var34 = null;
//     var30.notifyListeners(var34);
//     java.lang.String var36 = var30.getLabel();
//     org.jfree.chart.plot.ValueMarker var38 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var38.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var41 = null;
//     var38.notifyListeners(var41);
//     java.awt.Paint var43 = var38.getLabelPaint();
//     var30.setOutlinePaint(var43);
//     var26.setPaint(var43);
//     org.jfree.chart.util.RectangleAnchor var46 = var26.getLabelAnchor();
//     var21.setLabelAnchor(var46);
//     java.awt.geom.Point2D var48 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var46);
// 
//   }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.util.RectangleAnchor var21 = var1.getLabelAnchor();
//     org.jfree.chart.plot.ValueMarker var23 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var23.setLabel("");
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var30 = var27.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var31 = null;
//     var27.notifyListeners(var31);
//     java.lang.String var33 = var27.getLabel();
//     org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var35.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var38 = null;
//     var35.notifyListeners(var38);
//     java.awt.Paint var40 = var35.getLabelPaint();
//     var27.setOutlinePaint(var40);
//     var23.setPaint(var40);
//     org.jfree.chart.util.RectangleAnchor var43 = var23.getLabelAnchor();
//     java.lang.String var44 = var43.toString();
//     java.lang.Object var45 = null;
//     boolean var46 = var43.equals(var45);
//     var1.setLabelAnchor(var43);
//     
//     // Checks the contract:  equals-hashcode on var1 and var23
//     assertTrue("Contract failed: equals-hashcode on var1 and var23", var1.equals(var23) ? var1.hashCode() == var23.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var27
//     assertTrue("Contract failed: equals-hashcode on var5 and var27", var5.equals(var27) ? var5.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var35
//     assertTrue("Contract failed: equals-hashcode on var13 and var35", var13.equals(var35) ? var13.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var1
//     assertTrue("Contract failed: equals-hashcode on var23 and var1", var23.equals(var1) ? var23.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var5
//     assertTrue("Contract failed: equals-hashcode on var27 and var5", var27.equals(var5) ? var27.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var35 and var13
//     assertTrue("Contract failed: equals-hashcode on var35 and var13", var35.equals(var13) ? var35.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 122.0d, 1.0d, 9.0d);
    double var13 = var11.calculateRightOutset(0.0d);
    double var15 = var11.calculateTopInset(9.0d);
    org.jfree.chart.event.ChartChangeEvent var17 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.JFreeChart var18 = null;
    var17.setChart(var18);
    org.jfree.chart.JFreeChart var20 = null;
    var17.setChart(var20);
    org.jfree.chart.event.ChartChangeEventType var22 = var17.getType();
    boolean var23 = var11.equals((java.lang.Object)var22);
    java.awt.geom.Rectangle2D var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var27 = var11.createOutsetRectangle(var24, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    double var9 = var4.extendWidth(10.0d);
    boolean var11 = var4.equals((java.lang.Object)1.0f);
    double var13 = var4.calculateLeftOutset(109.0d);
    double var14 = var4.getBottom();
    java.awt.geom.Rectangle2D var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var18 = var4.createInsetRectangle(var15, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 120.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Paint var9 = var1.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    java.awt.Stroke var15 = null;
    var11.setOutlineStroke(var15);
    java.awt.Paint var17 = var11.getOutlinePaint();
    var1.setLabelPaint(var17);
    org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var20.setLabel("hi!");
    boolean var23 = var1.equals((java.lang.Object)var20);
    java.awt.Stroke var24 = var20.getStroke();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.setAlpha(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var6.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var9 = var6.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var10 = null;
//     var6.notifyListeners(var10);
//     java.lang.String var12 = var6.getLabel();
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var14.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var17 = null;
//     var14.notifyListeners(var17);
//     java.awt.Paint var19 = var14.getLabelPaint();
//     var6.setOutlinePaint(var19);
//     var2.setPaint(var19);
//     org.jfree.chart.util.RectangleAnchor var22 = var2.getLabelAnchor();
//     java.lang.String var23 = var22.toString();
//     java.lang.Object var24 = null;
//     boolean var25 = var22.equals(var24);
//     java.awt.geom.Point2D var26 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var22);
// 
//   }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.util.RectangleAnchor var3 = null;
//     java.awt.geom.Rectangle2D var4 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 122.0d, 242.0d, var3);
// 
//   }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var15 = var13.trimHeight(120.0d);
//     double var16 = var13.getLeft();
//     double var17 = var13.getTop();
//     double var19 = var13.calculateBottomInset(121.0d);
//     double var21 = var13.calculateRightOutset(0.0d);
//     double var22 = var13.getRight();
//     var1.setLabelOffset(var13);
//     double var25 = var13.trimHeight(0.0d);
//     java.awt.geom.Rectangle2D var26 = null;
//     var13.trim(var26);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    double var9 = var4.extendWidth(10.0d);
    double var11 = var4.calculateBottomInset(1.0d);
    java.awt.geom.Rectangle2D var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var15 = var4.createInsetRectangle(var12, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 120.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    java.awt.Stroke var5 = null;
    var1.setOutlineStroke(var5);
    java.awt.Paint var7 = var1.getOutlinePaint();
    java.awt.Stroke var8 = var1.getOutlineStroke();
    java.awt.Paint var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelPaint(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.String var5 = var4.toString();
//     boolean var7 = var4.equals((java.lang.Object)10.0d);
//     org.jfree.chart.util.RectangleInsets var12 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var14 = var12.trimHeight(120.0d);
//     double var15 = var12.getLeft();
//     boolean var16 = var4.equals((java.lang.Object)var15);
//     org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var18.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var21 = var18.getLabelOffsetType();
//     boolean var22 = var4.equals((java.lang.Object)var21);
//     
//     // Checks the contract:  equals-hashcode on var1 and var18
//     assertTrue("Contract failed: equals-hashcode on var1 and var18", var1.equals(var18) ? var1.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var1
//     assertTrue("Contract failed: equals-hashcode on var18 and var1", var18.equals(var1) ? var18.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    double var12 = var4.extendWidth((-111.0d));
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var4.createInsetRectangle(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var7 = null;
//     var4.notifyListeners(var7);
//     java.lang.String var9 = var4.getLabel();
//     java.awt.Stroke var10 = null;
//     var4.setOutlineStroke(var10);
//     java.awt.Paint var12 = var4.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var14.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var17 = var14.getLabelOffsetType();
//     java.awt.Stroke var18 = null;
//     var14.setOutlineStroke(var18);
//     java.awt.Paint var20 = var14.getOutlinePaint();
//     var4.setLabelPaint(var20);
//     org.jfree.chart.plot.ValueMarker var23 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var23.setLabel("hi!");
//     boolean var26 = var4.equals((java.lang.Object)var23);
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("");
//     org.jfree.chart.plot.ValueMarker var32 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var32.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var35 = var32.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var36 = null;
//     var32.notifyListeners(var36);
//     java.lang.String var38 = var32.getLabel();
//     org.jfree.chart.plot.ValueMarker var40 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var40.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var43 = null;
//     var40.notifyListeners(var43);
//     java.awt.Paint var45 = var40.getLabelPaint();
//     var32.setOutlinePaint(var45);
//     var28.setPaint(var45);
//     org.jfree.chart.util.RectangleAnchor var48 = var28.getLabelAnchor();
//     var23.setLabelAnchor(var48);
//     java.awt.geom.Rectangle2D var50 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 220.0d, 120.0d, var48);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var15 = var13.trimHeight(120.0d);
    double var16 = var13.getLeft();
    double var17 = var13.getTop();
    double var19 = var13.calculateBottomInset(121.0d);
    double var21 = var13.calculateRightOutset(0.0d);
    double var22 = var13.getRight();
    var1.setLabelOffset(var13);
    double var25 = var13.trimHeight(0.0d);
    java.awt.geom.Rectangle2D var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var27 = var13.createInsetRectangle(var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1.0d));

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     java.lang.String var4 = var1.getLabel();
//     org.jfree.chart.event.MarkerChangeListener var5 = null;
//     var1.addChangeListener(var5);
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     java.awt.Stroke var12 = null;
//     var8.setOutlineStroke(var12);
//     java.awt.Font var14 = var8.getLabelFont();
//     var1.setLabelFont(var14);
//     org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var17.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var17.notifyListeners(var20);
//     java.lang.String var22 = var17.getLabel();
//     java.awt.Stroke var23 = null;
//     var17.setOutlineStroke(var23);
//     java.awt.Paint var25 = var17.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var30 = var27.getLabelOffsetType();
//     java.awt.Stroke var31 = null;
//     var27.setOutlineStroke(var31);
//     java.awt.Paint var33 = var27.getOutlinePaint();
//     var17.setLabelPaint(var33);
//     org.jfree.chart.plot.ValueMarker var36 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var36.setLabel("hi!");
//     boolean var39 = var17.equals((java.lang.Object)var36);
//     java.awt.Stroke var40 = var36.getOutlineStroke();
//     var1.setStroke(var40);
//     
//     // Checks the contract:  equals-hashcode on var8 and var27
//     assertTrue("Contract failed: equals-hashcode on var8 and var27", var8.equals(var27) ? var8.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var8
//     assertTrue("Contract failed: equals-hashcode on var27 and var8", var27.equals(var8) ? var27.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(122.0d);
    org.jfree.chart.text.TextAnchor var3 = var2.getLabelTextAnchor();
    java.awt.Paint var4 = var2.getOutlinePaint();
    org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var6.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var9 = null;
    var6.notifyListeners(var9);
    java.lang.String var11 = var6.getLabel();
    java.awt.Stroke var12 = null;
    var6.setOutlineStroke(var12);
    java.awt.Paint var14 = var6.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var16.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var19 = var16.getLabelOffsetType();
    java.awt.Stroke var20 = null;
    var16.setOutlineStroke(var20);
    java.awt.Paint var22 = var16.getOutlinePaint();
    var6.setLabelPaint(var22);
    org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var25.setLabel("hi!");
    boolean var28 = var6.equals((java.lang.Object)var25);
    java.awt.Stroke var29 = var25.getOutlineStroke();
    org.jfree.chart.plot.ValueMarker var31 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var31.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var34 = var31.getLabelOffsetType();
    java.awt.Stroke var35 = null;
    var31.setOutlineStroke(var35);
    java.awt.Paint var37 = var31.getOutlinePaint();
    org.jfree.chart.plot.ValueMarker var39 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var39.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var42 = var39.getLabelOffsetType();
    java.awt.Stroke var43 = var39.getStroke();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var45 = new org.jfree.chart.plot.ValueMarker((-1.0d), var4, var29, var37, var43, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    java.lang.String var14 = var6.toString();
    org.jfree.chart.util.RectangleInsets var19 = new org.jfree.chart.util.RectangleInsets(var6, 119.0d, 10.0d, 109.0d, 0.0d);
    org.jfree.chart.util.UnitType var20 = var19.getUnitType();
    java.awt.geom.Rectangle2D var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var24 = var19.createOutsetRectangle(var21, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "UnitType.ABSOLUTE"+ "'", var14.equals("UnitType.ABSOLUTE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var8 = null;
//     var5.notifyListeners(var8);
//     java.awt.Paint var10 = var5.getLabelPaint();
//     java.awt.Font var11 = var5.getLabelFont();
//     var1.setLabelFont(var11);
//     
//     // Checks the contract:  equals-hashcode on var1 and var5
//     assertTrue("Contract failed: equals-hashcode on var1 and var5", var1.equals(var5) ? var1.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var1
//     assertTrue("Contract failed: equals-hashcode on var5 and var1", var5.equals(var1) ? var5.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Paint var6 = var1.getOutlinePaint();
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("hi!");
//     java.awt.Paint var13 = var10.getOutlinePaint();
//     java.awt.Paint var14 = var10.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var23 = var20.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var24 = null;
//     var20.notifyListeners(var24);
//     java.lang.String var26 = var20.getLabel();
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var31 = null;
//     var28.notifyListeners(var31);
//     java.awt.Paint var33 = var28.getLabelPaint();
//     var20.setOutlinePaint(var33);
//     var16.setPaint(var33);
//     org.jfree.chart.util.RectangleAnchor var36 = var16.getLabelAnchor();
//     var10.setLabelAnchor(var36);
//     java.awt.Stroke var38 = var10.getOutlineStroke();
//     var1.setOutlineStroke(var38);
//     
//     // Checks the contract:  equals-hashcode on var1 and var28
//     assertTrue("Contract failed: equals-hashcode on var1 and var28", var1.equals(var28) ? var1.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var1
//     assertTrue("Contract failed: equals-hashcode on var28 and var1", var28.equals(var1) ? var28.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.extendWidth((-1.0d));
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 109.0d);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
//     java.lang.Object var6 = var2.clone();
//     java.awt.Paint var7 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     java.lang.String var12 = var9.getLabel();
//     org.jfree.chart.event.MarkerChangeListener var13 = null;
//     var9.addChangeListener(var13);
//     java.awt.Stroke var15 = var9.getStroke();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(220.0d, var7, var15);
//     
//     // Checks the contract:  equals-hashcode on var2 and var9
//     assertTrue("Contract failed: equals-hashcode on var2 and var9", var2.equals(var9) ? var2.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var2
//     assertTrue("Contract failed: equals-hashcode on var9 and var2", var9.equals(var2) ? var9.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("hi!");
//     java.awt.Paint var4 = var1.getOutlinePaint();
//     var1.setValue(119.0d);
//     java.lang.Object var7 = var1.clone();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("hi!");
//     java.awt.Paint var12 = var9.getOutlinePaint();
//     var9.setValue(119.0d);
//     org.jfree.chart.util.LengthAdjustmentType var15 = var9.getLabelOffsetType();
//     var1.setLabelOffsetType(var15);
//     
//     // Checks the contract:  equals-hashcode on var1 and var9
//     assertTrue("Contract failed: equals-hashcode on var1 and var9", var1.equals(var9) ? var1.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var1
//     assertTrue("Contract failed: equals-hashcode on var9 and var1", var9.equals(var1) ? var9.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    java.lang.String var8 = var4.toString();
    double var10 = var4.trimHeight(122.0d);
    double var11 = var4.getLeft();
    java.awt.geom.Rectangle2D var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var13 = var4.createOutsetRectangle(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"+ "'", var8.equals("RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 121.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    java.lang.String var6 = var4.toString();
    java.awt.geom.Rectangle2D var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var8 = var4.createOutsetRectangle(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"+ "'", var6.equals("RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"));

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var6 = null;
//     var2.notifyListeners(var6);
//     java.lang.String var8 = var2.getLabel();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var13 = var10.getLabelOffsetType();
//     java.awt.Stroke var14 = null;
//     var10.setOutlineStroke(var14);
//     org.jfree.chart.text.TextAnchor var16 = var10.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var21 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var22 = var21.getRight();
//     double var24 = var21.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var25 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var24);
//     boolean var26 = var16.equals((java.lang.Object)var25);
//     org.jfree.chart.util.RectangleInsets var31 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var32 = var31.getBottom();
//     org.jfree.chart.util.UnitType var33 = var31.getUnitType();
//     boolean var35 = var33.equals((java.lang.Object)"");
//     boolean var36 = var16.equals((java.lang.Object)var33);
//     var2.setLabelTextAnchor(var16);
//     java.awt.Paint var38 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var40 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var40.setLabel("hi!");
//     java.awt.Paint var43 = var40.getOutlinePaint();
//     java.awt.Paint var44 = var40.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var46 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var46.setLabel("");
//     org.jfree.chart.plot.ValueMarker var50 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var50.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var53 = var50.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var54 = null;
//     var50.notifyListeners(var54);
//     java.lang.String var56 = var50.getLabel();
//     org.jfree.chart.plot.ValueMarker var58 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var58.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var61 = null;
//     var58.notifyListeners(var61);
//     java.awt.Paint var63 = var58.getLabelPaint();
//     var50.setOutlinePaint(var63);
//     var46.setPaint(var63);
//     org.jfree.chart.util.RectangleAnchor var66 = var46.getLabelAnchor();
//     var40.setLabelAnchor(var66);
//     java.awt.Stroke var68 = var40.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var69 = new org.jfree.chart.plot.ValueMarker(120.0d, var38, var68);
//     
//     // Checks the contract:  equals-hashcode on var2 and var58
//     assertTrue("Contract failed: equals-hashcode on var2 and var58", var2.equals(var58) ? var2.hashCode() == var58.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var58 and var2
//     assertTrue("Contract failed: equals-hashcode on var58 and var2", var58.equals(var2) ? var58.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("hi!");
//     java.awt.Paint var4 = var1.getOutlinePaint();
//     java.lang.String var5 = var1.getLabel();
//     java.lang.Class var6 = null;
//     java.util.EventListener[] var7 = var1.getListeners(var6);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Font var9 = var1.getLabelFont();
    var1.setLabel("org.jfree.chart.event.ChartChangeEvent[source=122.0]");
    org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var13.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var16 = var13.getLabelOffsetType();
    java.awt.Stroke var17 = null;
    var13.setOutlineStroke(var17);
    org.jfree.chart.text.TextAnchor var19 = var13.getLabelTextAnchor();
    org.jfree.chart.util.RectangleInsets var24 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var25 = var24.getRight();
    double var27 = var24.calculateBottomInset((-1.0d));
    org.jfree.chart.event.ChartChangeEvent var28 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var27);
    boolean var29 = var19.equals((java.lang.Object)var28);
    org.jfree.chart.util.RectangleInsets var34 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var36 = var34.equals((java.lang.Object)(short)100);
    double var38 = var34.extendHeight(121.0d);
    double var40 = var34.extendWidth((-1.0d));
    double var42 = var34.calculateLeftInset(0.0d);
    boolean var43 = var19.equals((java.lang.Object)var34);
    var1.setLabelTextAnchor(var19);
    java.awt.Stroke var45 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setStroke(var45);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 109.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var5 = null;
    var1.notifyListeners(var5);
    org.jfree.chart.event.MarkerChangeListener var7 = null;
    var1.addChangeListener(var7);
    double var9 = var1.getValue();
    java.awt.Paint var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelPaint(var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Paint var9 = var1.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    java.awt.Stroke var15 = null;
    var11.setOutlineStroke(var15);
    java.awt.Paint var17 = var11.getOutlinePaint();
    var1.setLabelPaint(var17);
    org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var20.setLabel("hi!");
    boolean var23 = var1.equals((java.lang.Object)var20);
    org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var25.setLabel("");
    org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var29.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var33 = null;
    var29.notifyListeners(var33);
    java.lang.String var35 = var29.getLabel();
    org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var37.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var40 = null;
    var37.notifyListeners(var40);
    java.awt.Paint var42 = var37.getLabelPaint();
    var29.setOutlinePaint(var42);
    var25.setPaint(var42);
    org.jfree.chart.util.RectangleAnchor var45 = var25.getLabelAnchor();
    var20.setLabelAnchor(var45);
    var20.setValue(121.0d);
    var20.setLabel("org.jfree.chart.event.ChartChangeEvent[source=119.0]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    java.lang.String var4 = var1.getLabel();
    var1.setLabel("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     java.awt.Font var9 = var1.getLabelFont();
//     java.lang.String var10 = var1.getLabel();
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var15 = null;
//     var12.notifyListeners(var15);
//     java.lang.String var17 = var12.getLabel();
//     java.awt.Stroke var18 = null;
//     var12.setOutlineStroke(var18);
//     java.awt.Paint var20 = var12.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var22 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var22.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var25 = var22.getLabelOffsetType();
//     java.awt.Stroke var26 = null;
//     var22.setOutlineStroke(var26);
//     java.awt.Paint var28 = var22.getOutlinePaint();
//     var12.setLabelPaint(var28);
//     org.jfree.chart.plot.ValueMarker var31 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var31.setLabel("hi!");
//     boolean var34 = var12.equals((java.lang.Object)var31);
//     java.awt.Paint var35 = var12.getOutlinePaint();
//     boolean var36 = var1.equals((java.lang.Object)var35);
//     
//     // Checks the contract:  equals-hashcode on var1 and var22
//     assertTrue("Contract failed: equals-hashcode on var1 and var22", var1.equals(var22) ? var1.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var1
//     assertTrue("Contract failed: equals-hashcode on var22 and var1", var22.equals(var1) ? var22.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 0.0d, 8.0d, 121.0d, 109.0d);
    java.awt.geom.Rectangle2D var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var15 = var11.createInsetRectangle(var12, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateRightOutset(0.0d);
    java.awt.geom.Rectangle2D var8 = null;
    org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var10.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var13 = var10.getLabelOffsetType();
    boolean var15 = var13.equals((java.lang.Object)0.0d);
    java.lang.String var16 = var13.toString();
    org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var18.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var21 = var18.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var26 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var28 = var26.calculateTopInset((-1.0d));
    double var30 = var26.calculateLeftInset(122.0d);
    boolean var31 = var21.equals((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var32 = var4.createAdjustedRectangle(var8, var13, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "CONTRACT"+ "'", var16.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    java.awt.Stroke var5 = null;
    var1.setOutlineStroke(var5);
    var1.setLabel("UnitType.ABSOLUTE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.Object var6 = var1.clone();
    java.awt.Font var7 = var1.getLabelFont();
    org.jfree.chart.util.RectangleInsets var8 = var1.getLabelOffset();
    double var10 = var8.calculateLeftOutset((-1.0d));
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var8.createInsetRectangle(var11, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3.0d);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.plot.ValueMarker var3 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var3.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var6 = null;
//     var3.notifyListeners(var6);
//     java.lang.String var8 = var3.getLabel();
//     java.awt.Stroke var9 = null;
//     var3.setOutlineStroke(var9);
//     java.awt.Paint var11 = var3.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var16 = var13.getLabelOffsetType();
//     java.awt.Stroke var17 = null;
//     var13.setOutlineStroke(var17);
//     java.awt.Paint var19 = var13.getOutlinePaint();
//     var3.setLabelPaint(var19);
//     org.jfree.chart.plot.ValueMarker var22 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var22.setLabel("hi!");
//     boolean var25 = var3.equals((java.lang.Object)var22);
//     java.awt.Stroke var26 = var22.getOutlineStroke();
//     var1.setStroke(var26);
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var30.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var33 = var30.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var34 = null;
//     var30.notifyListeners(var34);
//     java.lang.String var36 = var30.getLabel();
//     org.jfree.chart.plot.ValueMarker var38 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var38.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var41 = var38.getLabelOffsetType();
//     java.awt.Stroke var42 = null;
//     var38.setOutlineStroke(var42);
//     org.jfree.chart.text.TextAnchor var44 = var38.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var49 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var50 = var49.getRight();
//     double var52 = var49.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var53 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var52);
//     boolean var54 = var44.equals((java.lang.Object)var53);
//     org.jfree.chart.util.RectangleInsets var59 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var60 = var59.getBottom();
//     org.jfree.chart.util.UnitType var61 = var59.getUnitType();
//     boolean var63 = var61.equals((java.lang.Object)"");
//     boolean var64 = var44.equals((java.lang.Object)var61);
//     var30.setLabelTextAnchor(var44);
//     java.awt.Paint var66 = var30.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var68 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var69 = var68.getLabelTextAnchor();
//     org.jfree.chart.text.TextAnchor var70 = var68.getLabelTextAnchor();
//     java.awt.Stroke var71 = var68.getStroke();
//     org.jfree.chart.plot.ValueMarker var72 = new org.jfree.chart.plot.ValueMarker(8.0d, var66, var71);
//     var1.setOutlinePaint(var66);
//     
//     // Checks the contract:  equals-hashcode on var1 and var68
//     assertTrue("Contract failed: equals-hashcode on var1 and var68", var1.equals(var68) ? var1.hashCode() == var68.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var38
//     assertTrue("Contract failed: equals-hashcode on var13 and var38", var13.equals(var38) ? var13.hashCode() == var38.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var13
//     assertTrue("Contract failed: equals-hashcode on var38 and var13", var38.equals(var13) ? var38.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var68 and var1
//     assertTrue("Contract failed: equals-hashcode on var68 and var1", var68.equals(var1) ? var68.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("hi!");
    org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var5.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var8 = null;
    var5.notifyListeners(var8);
    java.awt.Paint var10 = var5.getLabelPaint();
    var1.setPaint(var10);
    java.awt.Stroke var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setStroke(var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    org.jfree.chart.event.ChartChangeEvent var15 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.JFreeChart var16 = null;
    var15.setChart(var16);
    boolean var18 = var6.equals((java.lang.Object)var16);
    org.jfree.chart.util.RectangleInsets var23 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 0.0d, 10.0d);
    double var24 = var23.getRight();
    double var26 = var23.calculateRightInset(122.0d);
    java.awt.geom.Rectangle2D var27 = null;
    org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var29.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var39 = var37.calculateTopInset((-1.0d));
    double var41 = var37.calculateLeftInset(122.0d);
    boolean var42 = var32.equals((java.lang.Object)var37);
    org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var44.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var47 = var44.getLabelOffsetType();
    java.lang.String var48 = var47.toString();
    boolean var50 = var47.equals((java.lang.Object)10.0d);
    org.jfree.chart.util.RectangleInsets var55 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var57 = var55.trimHeight(120.0d);
    double var58 = var55.getLeft();
    boolean var59 = var47.equals((java.lang.Object)var58);
    org.jfree.chart.plot.ValueMarker var61 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var61.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var64 = null;
    var61.notifyListeners(var64);
    java.lang.String var66 = var61.getLabel();
    java.awt.Stroke var67 = null;
    var61.setOutlineStroke(var67);
    boolean var69 = var47.equals((java.lang.Object)var67);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var70 = var23.createAdjustedRectangle(var27, var32, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "CONTRACT"+ "'", var48.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + ""+ "'", var66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    boolean var12 = var4.equals((java.lang.Object)122.0d);
    double var14 = var4.calculateLeftInset(100.0d);
    java.awt.geom.Rectangle2D var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var18 = var4.createOutsetRectangle(var15, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10.0d);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("hi!");
//     java.awt.Paint var4 = var1.getOutlinePaint();
//     java.awt.Paint var5 = var1.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var7.setLabel("");
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var15 = null;
//     var11.notifyListeners(var15);
//     java.lang.String var17 = var11.getLabel();
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var22 = null;
//     var19.notifyListeners(var22);
//     java.awt.Paint var24 = var19.getLabelPaint();
//     var11.setOutlinePaint(var24);
//     var7.setPaint(var24);
//     org.jfree.chart.util.RectangleAnchor var27 = var7.getLabelAnchor();
//     var1.setLabelAnchor(var27);
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.plot.ValueMarker var32 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var32.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var35 = null;
//     var32.notifyListeners(var35);
//     java.lang.String var37 = var32.getLabel();
//     java.awt.Stroke var38 = null;
//     var32.setOutlineStroke(var38);
//     java.awt.Paint var40 = var32.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var42 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var42.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var45 = var42.getLabelOffsetType();
//     java.awt.Stroke var46 = null;
//     var42.setOutlineStroke(var46);
//     java.awt.Paint var48 = var42.getOutlinePaint();
//     var32.setLabelPaint(var48);
//     org.jfree.chart.plot.ValueMarker var51 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var51.setLabel("hi!");
//     boolean var54 = var32.equals((java.lang.Object)var51);
//     java.awt.Stroke var55 = var51.getOutlineStroke();
//     var30.setStroke(var55);
//     var1.setOutlineStroke(var55);
//     
//     // Checks the contract:  equals-hashcode on var1 and var51
//     assertTrue("Contract failed: equals-hashcode on var1 and var51", var1.equals(var51) ? var1.hashCode() == var51.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var51 and var1
//     assertTrue("Contract failed: equals-hashcode on var51 and var1", var51.equals(var1) ? var51.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Paint var9 = var1.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    java.awt.Stroke var15 = null;
    var11.setOutlineStroke(var15);
    java.awt.Paint var17 = var11.getOutlinePaint();
    var1.setLabelPaint(var17);
    org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var20.setLabel("hi!");
    boolean var23 = var1.equals((java.lang.Object)var20);
    org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var25.setLabel("");
    org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var29.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var33 = null;
    var29.notifyListeners(var33);
    java.lang.String var35 = var29.getLabel();
    org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var37.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var40 = null;
    var37.notifyListeners(var40);
    java.awt.Paint var42 = var37.getLabelPaint();
    var29.setOutlinePaint(var42);
    var25.setPaint(var42);
    org.jfree.chart.util.RectangleAnchor var45 = var25.getLabelAnchor();
    var20.setLabelAnchor(var45);
    var20.setValue(121.0d);
    java.awt.Stroke var49 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.setStroke(var49);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateBottomInset((-1.0d));
    double var8 = var4.getLeft();
    double var10 = var4.extendHeight(0.0d);
    java.awt.geom.Rectangle2D var11 = null;
    org.jfree.chart.util.LengthAdjustmentType var12 = null;
    org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var14.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var17 = var14.getLabelOffsetType();
    org.jfree.chart.util.LengthAdjustmentType var18 = var14.getLabelOffsetType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var19 = var4.createAdjustedRectangle(var11, var12, var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     boolean var6 = var4.equals((java.lang.Object)(short)100);
//     double var8 = var4.extendHeight(121.0d);
//     double var10 = var4.extendWidth((-1.0d));
//     java.awt.geom.Rectangle2D var11 = null;
//     var4.trim(var11);
// 
//   }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.awt.Paint var7 = var2.getLabelPaint();
//     java.awt.Font var8 = var2.getLabelFont();
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var14 = var13.getRight();
//     var2.setLabelOffset(var13);
//     org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var17.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var17.notifyListeners(var20);
//     java.lang.String var22 = var17.getLabel();
//     java.awt.Stroke var23 = null;
//     var17.setOutlineStroke(var23);
//     java.awt.Paint var25 = var17.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var30 = var27.getLabelOffsetType();
//     java.awt.Stroke var31 = null;
//     var27.setOutlineStroke(var31);
//     java.awt.Paint var33 = var27.getOutlinePaint();
//     var17.setLabelPaint(var33);
//     org.jfree.chart.plot.ValueMarker var36 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var36.setLabel("hi!");
//     boolean var39 = var17.equals((java.lang.Object)var36);
//     java.awt.Paint var40 = var36.getLabelPaint();
//     var2.setOutlinePaint(var40);
//     org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var44.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var47 = var44.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var48 = null;
//     var44.notifyListeners(var48);
//     java.lang.String var50 = var44.getLabel();
//     org.jfree.chart.plot.ValueMarker var52 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var52.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var55 = var52.getLabelOffsetType();
//     java.awt.Stroke var56 = null;
//     var52.setOutlineStroke(var56);
//     org.jfree.chart.text.TextAnchor var58 = var52.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var63 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var64 = var63.getRight();
//     double var66 = var63.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var67 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var66);
//     boolean var68 = var58.equals((java.lang.Object)var67);
//     org.jfree.chart.util.RectangleInsets var73 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var74 = var73.getBottom();
//     org.jfree.chart.util.UnitType var75 = var73.getUnitType();
//     boolean var77 = var75.equals((java.lang.Object)"");
//     boolean var78 = var58.equals((java.lang.Object)var75);
//     var44.setLabelTextAnchor(var58);
//     java.awt.Paint var80 = var44.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var82 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var83 = var82.getLabelTextAnchor();
//     org.jfree.chart.text.TextAnchor var84 = var82.getLabelTextAnchor();
//     java.awt.Stroke var85 = var82.getStroke();
//     org.jfree.chart.plot.ValueMarker var86 = new org.jfree.chart.plot.ValueMarker(8.0d, var80, var85);
//     org.jfree.chart.plot.ValueMarker var87 = new org.jfree.chart.plot.ValueMarker((-111.0d), var40, var85);
//     
//     // Checks the contract:  equals-hashcode on var27 and var52
//     assertTrue("Contract failed: equals-hashcode on var27 and var52", var27.equals(var52) ? var27.hashCode() == var52.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var52 and var27
//     assertTrue("Contract failed: equals-hashcode on var52 and var27", var52.equals(var27) ? var52.hashCode() == var27.hashCode() : true);
// 
//   }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getBottom();
//     org.jfree.chart.util.UnitType var6 = var4.getUnitType();
//     boolean var8 = var6.equals((java.lang.Object)"");
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var15 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
//     org.jfree.chart.JFreeChart var16 = null;
//     var15.setChart(var16);
//     boolean var18 = var6.equals((java.lang.Object)var16);
//     org.jfree.chart.util.RectangleInsets var23 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 0.0d, 10.0d);
//     org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var25.setLabel("");
//     org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var29.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var33 = null;
//     var29.notifyListeners(var33);
//     java.lang.String var35 = var29.getLabel();
//     org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var37.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var40 = null;
//     var37.notifyListeners(var40);
//     java.awt.Paint var42 = var37.getLabelPaint();
//     var29.setOutlinePaint(var42);
//     var25.setPaint(var42);
//     org.jfree.chart.util.RectangleAnchor var45 = var25.getLabelAnchor();
//     java.lang.Object var46 = var25.clone();
//     boolean var47 = var6.equals((java.lang.Object)var25);
//     org.jfree.chart.util.RectangleInsets var52 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 110.0d, 0.0d, 242.0d);
//     org.jfree.chart.plot.ValueMarker var54 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var54.setLabel("hi!");
//     java.awt.Paint var57 = var54.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var59 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var59.setLabel("");
//     org.jfree.chart.plot.ValueMarker var63 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var63.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var66 = var63.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var67 = null;
//     var63.notifyListeners(var67);
//     java.lang.String var69 = var63.getLabel();
//     org.jfree.chart.plot.ValueMarker var71 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var71.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var74 = null;
//     var71.notifyListeners(var74);
//     java.awt.Paint var76 = var71.getLabelPaint();
//     var63.setOutlinePaint(var76);
//     var59.setPaint(var76);
//     org.jfree.chart.JFreeChart var79 = null;
//     org.jfree.chart.event.ChartChangeEvent var80 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var59, var79);
//     org.jfree.chart.event.MarkerChangeEvent var81 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var59);
//     var54.notifyListeners(var81);
//     boolean var83 = var6.equals((java.lang.Object)var81);
//     
//     // Checks the contract:  equals-hashcode on var25 and var59
//     assertTrue("Contract failed: equals-hashcode on var25 and var59", var25.equals(var59) ? var25.hashCode() == var59.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var63
//     assertTrue("Contract failed: equals-hashcode on var29 and var63", var29.equals(var63) ? var29.hashCode() == var63.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var71
//     assertTrue("Contract failed: equals-hashcode on var37 and var71", var37.equals(var71) ? var37.hashCode() == var71.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var59 and var25
//     assertTrue("Contract failed: equals-hashcode on var59 and var25", var59.equals(var25) ? var59.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var63 and var29
//     assertTrue("Contract failed: equals-hashcode on var63 and var29", var63.equals(var29) ? var63.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var71 and var37
//     assertTrue("Contract failed: equals-hashcode on var71 and var37", var71.equals(var37) ? var71.hashCode() == var37.hashCode() : true);
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.awt.geom.Rectangle2D var25 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 9.0d, (-1.0d), var24);
// 
//   }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.lang.String var25 = var24.toString();
//     java.awt.geom.Rectangle2D var26 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 0.0d, 0.0d, var24);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     boolean var7 = var1.equals((java.lang.Object)0);
//     java.lang.Class var8 = null;
//     java.util.EventListener[] var9 = var1.getListeners(var8);
// 
//   }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.awt.Paint var6 = var1.getLabelPaint();
//     float var7 = var1.getAlpha();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("hi!");
//     java.awt.Paint var12 = var9.getOutlinePaint();
//     java.awt.Paint var13 = var9.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var15 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var15.setLabel("");
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var22 = var19.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var23 = null;
//     var19.notifyListeners(var23);
//     java.lang.String var25 = var19.getLabel();
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var30 = null;
//     var27.notifyListeners(var30);
//     java.awt.Paint var32 = var27.getLabelPaint();
//     var19.setOutlinePaint(var32);
//     var15.setPaint(var32);
//     org.jfree.chart.util.RectangleAnchor var35 = var15.getLabelAnchor();
//     var9.setLabelAnchor(var35);
//     java.awt.Stroke var37 = var9.getOutlineStroke();
//     var1.setStroke(var37);
//     
//     // Checks the contract:  equals-hashcode on var1 and var27
//     assertTrue("Contract failed: equals-hashcode on var1 and var27", var1.equals(var27) ? var1.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var1
//     assertTrue("Contract failed: equals-hashcode on var27 and var1", var27.equals(var1) ? var27.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.awt.geom.Rectangle2D var25 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 120.0d, (-1.0d), var24);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("hi!");
    java.awt.Paint var4 = var1.getOutlinePaint();
    java.awt.Paint var5 = var1.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var7.setLabel("");
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var15 = null;
    var11.notifyListeners(var15);
    java.lang.String var17 = var11.getLabel();
    org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var19.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var22 = null;
    var19.notifyListeners(var22);
    java.awt.Paint var24 = var19.getLabelPaint();
    var11.setOutlinePaint(var24);
    var7.setPaint(var24);
    org.jfree.chart.util.RectangleAnchor var27 = var7.getLabelAnchor();
    var1.setLabelAnchor(var27);
    org.jfree.chart.text.TextAnchor var29 = var1.getLabelTextAnchor();
    org.jfree.chart.text.TextAnchor var30 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelTextAnchor(var30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset((-1.0d));
    double var8 = var4.calculateLeftInset(122.0d);
    double var9 = var4.getLeft();
    org.jfree.chart.util.RectangleInsets var14 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var15 = var14.getBottom();
    org.jfree.chart.util.UnitType var16 = var14.getUnitType();
    boolean var18 = var16.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var23 = new org.jfree.chart.util.RectangleInsets(var16, 10.0d, 0.0d, 1.0d, (-1.0d));
    org.jfree.chart.event.ChartChangeEvent var25 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.JFreeChart var26 = null;
    var25.setChart(var26);
    boolean var28 = var16.equals((java.lang.Object)var26);
    org.jfree.chart.util.RectangleInsets var33 = new org.jfree.chart.util.RectangleInsets(var16, 10.0d, 0.0d, 0.0d, 10.0d);
    org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var35.setLabel("");
    org.jfree.chart.plot.ValueMarker var39 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var39.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var42 = var39.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var43 = null;
    var39.notifyListeners(var43);
    java.lang.String var45 = var39.getLabel();
    org.jfree.chart.plot.ValueMarker var47 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var47.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var50 = null;
    var47.notifyListeners(var50);
    java.awt.Paint var52 = var47.getLabelPaint();
    var39.setOutlinePaint(var52);
    var35.setPaint(var52);
    org.jfree.chart.util.RectangleAnchor var55 = var35.getLabelAnchor();
    java.lang.Object var56 = var35.clone();
    boolean var57 = var16.equals((java.lang.Object)var35);
    org.jfree.chart.util.RectangleInsets var62 = new org.jfree.chart.util.RectangleInsets(var16, 10.0d, 110.0d, 0.0d, 242.0d);
    boolean var63 = var4.equals((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.String var6 = var1.getLabel();
    java.awt.Stroke var7 = null;
    var1.setOutlineStroke(var7);
    java.awt.Font var9 = var1.getLabelFont();
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("hi!");
    java.awt.Paint var14 = var11.getOutlinePaint();
    var1.setPaint(var14);
    org.jfree.chart.util.RectangleInsets var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelOffset(var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var7.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var10 = var7.getLabelOffsetType();
//     java.lang.Object var11 = var7.clone();
//     java.awt.Stroke var12 = var7.getStroke();
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var14.setLabel("hi!");
//     java.awt.Paint var17 = var14.getOutlinePaint();
//     var14.setValue(119.0d);
//     java.awt.Paint var20 = var14.getOutlinePaint();
//     org.jfree.chart.util.LengthAdjustmentType var21 = var14.getLabelOffsetType();
//     var7.setLabelOffsetType(var21);
//     var1.setLabelOffsetType(var21);
//     
//     // Checks the contract:  equals-hashcode on var1 and var7
//     assertTrue("Contract failed: equals-hashcode on var1 and var7", var1.equals(var7) ? var1.hashCode() == var7.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var1
//     assertTrue("Contract failed: equals-hashcode on var7 and var1", var7.equals(var1) ? var7.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test140() {}
//   public void test140() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.JFreeChart var21 = null;
//     org.jfree.chart.event.ChartChangeEvent var22 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1, var21);
//     org.jfree.chart.event.MarkerChangeEvent var23 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var1);
//     org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var25.setLabel("hi!");
//     java.awt.Paint var28 = var25.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var30.setLabel("");
//     org.jfree.chart.plot.ValueMarker var34 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var34.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var37 = var34.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var38 = null;
//     var34.notifyListeners(var38);
//     java.lang.String var40 = var34.getLabel();
//     org.jfree.chart.plot.ValueMarker var42 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var42.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var45 = null;
//     var42.notifyListeners(var45);
//     java.awt.Paint var47 = var42.getLabelPaint();
//     var34.setOutlinePaint(var47);
//     var30.setPaint(var47);
//     org.jfree.chart.JFreeChart var50 = null;
//     org.jfree.chart.event.ChartChangeEvent var51 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var30, var50);
//     org.jfree.chart.event.MarkerChangeEvent var52 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var30);
//     var25.notifyListeners(var52);
//     var1.notifyListeners(var52);
//     
//     // Checks the contract:  equals-hashcode on var1 and var30
//     assertTrue("Contract failed: equals-hashcode on var1 and var30", var1.equals(var30) ? var1.hashCode() == var30.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var34
//     assertTrue("Contract failed: equals-hashcode on var5 and var34", var5.equals(var34) ? var5.hashCode() == var34.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var42
//     assertTrue("Contract failed: equals-hashcode on var13 and var42", var13.equals(var42) ? var13.hashCode() == var42.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var30 and var1
//     assertTrue("Contract failed: equals-hashcode on var30 and var1", var30.equals(var1) ? var30.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var5
//     assertTrue("Contract failed: equals-hashcode on var34 and var5", var34.equals(var5) ? var34.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var13
//     assertTrue("Contract failed: equals-hashcode on var42 and var13", var42.equals(var13) ? var42.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    double var9 = var4.extendWidth(10.0d);
    java.awt.geom.Rectangle2D var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var13 = var4.createOutsetRectangle(var10, false, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 120.0d);

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     org.jfree.chart.util.Size2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var4 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var4.setLabel("");
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var19 = null;
//     var16.notifyListeners(var19);
//     java.awt.Paint var21 = var16.getLabelPaint();
//     var8.setOutlinePaint(var21);
//     var4.setPaint(var21);
//     org.jfree.chart.util.RectangleAnchor var24 = var4.getLabelAnchor();
//     java.lang.String var25 = var24.toString();
//     java.lang.Object var26 = null;
//     boolean var27 = var24.equals(var26);
//     java.awt.geom.Rectangle2D var28 = org.jfree.chart.util.RectangleAnchor.createRectangle(var0, 121.0d, (-6.0d), var24);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.awt.Paint var7 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var13 = var10.getLabelOffsetType();
//     java.awt.Stroke var14 = null;
//     var10.setOutlineStroke(var14);
//     java.awt.Paint var16 = var10.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var18.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var21 = null;
//     var18.notifyListeners(var21);
//     java.lang.Object var23 = var18.clone();
//     java.awt.Font var24 = var18.getLabelFont();
//     java.awt.Stroke var25 = var18.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(0.0d, var16, var25);
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker((-110.0d), var7, var25);
//     
//     // Checks the contract:  equals-hashcode on var2 and var18
//     assertTrue("Contract failed: equals-hashcode on var2 and var18", var2.equals(var18) ? var2.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var2
//     assertTrue("Contract failed: equals-hashcode on var18 and var2", var18.equals(var2) ? var18.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.lang.Class var6 = null;
//     java.util.EventListener[] var7 = var1.getListeners(var6);
// 
//   }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
//     java.awt.Stroke var6 = null;
//     var2.setOutlineStroke(var6);
//     java.awt.Paint var8 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var13 = null;
//     var10.notifyListeners(var13);
//     java.lang.Object var15 = var10.clone();
//     java.awt.Font var16 = var10.getLabelFont();
//     java.awt.Stroke var17 = var10.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(0.0d, var8, var17);
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var23 = var20.getLabelOffsetType();
//     java.lang.Object var24 = var20.clone();
//     java.awt.Paint var25 = var20.getOutlinePaint();
//     var20.setLabel("");
//     org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var29.setLabel("hi!");
//     java.awt.Paint var32 = var29.getOutlinePaint();
//     var29.setValue(119.0d);
//     org.jfree.chart.util.LengthAdjustmentType var35 = var29.getLabelOffsetType();
//     var20.setLabelOffsetType(var35);
//     java.awt.Paint var37 = var20.getLabelPaint();
//     var18.setOutlinePaint(var37);
//     
//     // Checks the contract:  equals-hashcode on var10 and var20
//     assertTrue("Contract failed: equals-hashcode on var10 and var20", var10.equals(var20) ? var10.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var10
//     assertTrue("Contract failed: equals-hashcode on var20 and var10", var20.equals(var10) ? var20.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var24
//     assertTrue("Contract failed: equals-hashcode on var15 and var24", var15.equals(var24) ? var15.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var15
//     assertTrue("Contract failed: equals-hashcode on var24 and var15", var24.equals(var15) ? var24.hashCode() == var15.hashCode() : true);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    java.awt.geom.Rectangle2D var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var8 = var4.createOutsetRectangle(var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.lang.Object var7 = var2.clone();
//     java.awt.Font var8 = var2.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("hi!");
//     java.awt.Paint var13 = var10.getOutlinePaint();
//     java.awt.Paint var14 = var10.getLabelPaint();
//     var2.setOutlinePaint(var14);
//     org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var17.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var20 = null;
//     var17.notifyListeners(var20);
//     java.lang.String var22 = var17.getLabel();
//     java.awt.Stroke var23 = null;
//     var17.setOutlineStroke(var23);
//     java.awt.Paint var25 = var17.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var30 = var27.getLabelOffsetType();
//     java.awt.Stroke var31 = null;
//     var27.setOutlineStroke(var31);
//     java.awt.Paint var33 = var27.getOutlinePaint();
//     var17.setLabelPaint(var33);
//     org.jfree.chart.plot.ValueMarker var36 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var36.setLabel("hi!");
//     boolean var39 = var17.equals((java.lang.Object)var36);
//     java.awt.Stroke var40 = var36.getStroke();
//     org.jfree.chart.plot.ValueMarker var41 = new org.jfree.chart.plot.ValueMarker(110.0d, var14, var40);
//     
//     // Checks the contract:  equals-hashcode on var10 and var36
//     assertTrue("Contract failed: equals-hashcode on var10 and var36", var10.equals(var36) ? var10.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var10
//     assertTrue("Contract failed: equals-hashcode on var36 and var10", var36.equals(var10) ? var36.hashCode() == var10.hashCode() : true);
// 
//   }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Stroke var6 = var1.getStroke();
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var12.notifyListeners(var16);
//     java.lang.String var18 = var12.getLabel();
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var23 = null;
//     var20.notifyListeners(var23);
//     java.awt.Paint var25 = var20.getLabelPaint();
//     var12.setOutlinePaint(var25);
//     var8.setPaint(var25);
//     var1.setLabelPaint(var25);
//     
//     // Checks the contract:  equals-hashcode on var1 and var20
//     assertTrue("Contract failed: equals-hashcode on var1 and var20", var1.equals(var20) ? var1.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var1
//     assertTrue("Contract failed: equals-hashcode on var20 and var1", var20.equals(var1) ? var20.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.lang.String var7 = var2.getLabel();
//     java.awt.Stroke var8 = null;
//     var2.setOutlineStroke(var8);
//     java.awt.Paint var10 = var2.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
//     java.awt.Stroke var16 = null;
//     var12.setOutlineStroke(var16);
//     java.awt.Paint var18 = var12.getOutlinePaint();
//     var2.setLabelPaint(var18);
//     org.jfree.chart.plot.ValueMarker var21 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var21.setLabel("hi!");
//     boolean var24 = var2.equals((java.lang.Object)var21);
//     java.awt.Paint var25 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var31 = var28.getLabelOffsetType();
//     java.awt.Stroke var32 = null;
//     var28.setOutlineStroke(var32);
//     java.awt.Paint var34 = var28.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var36 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var36.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var39 = null;
//     var36.notifyListeners(var39);
//     java.lang.Object var41 = var36.clone();
//     java.awt.Font var42 = var36.getLabelFont();
//     java.awt.Stroke var43 = var36.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(0.0d, var34, var43);
//     org.jfree.chart.plot.ValueMarker var46 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var46.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var49 = var46.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var50 = null;
//     var46.notifyListeners(var50);
//     org.jfree.chart.event.MarkerChangeListener var52 = null;
//     var46.addChangeListener(var52);
//     java.awt.Paint var54 = var46.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var56 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var56.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var59 = var56.getLabelOffsetType();
//     java.awt.Stroke var60 = var56.getStroke();
//     org.jfree.chart.plot.ValueMarker var62 = new org.jfree.chart.plot.ValueMarker(0.0d, var25, var43, var54, var60, 0.8f);
//     
//     // Checks the contract:  equals-hashcode on var12 and var28
//     assertTrue("Contract failed: equals-hashcode on var12 and var28", var12.equals(var28) ? var12.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var12
//     assertTrue("Contract failed: equals-hashcode on var28 and var12", var28.equals(var12) ? var28.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var46
//     assertTrue("Contract failed: equals-hashcode on var36 and var46", var36.equals(var46) ? var36.hashCode() == var46.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var36 and var56
//     assertTrue("Contract failed: equals-hashcode on var36 and var56", var36.equals(var56) ? var36.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var36
//     assertTrue("Contract failed: equals-hashcode on var46 and var36", var46.equals(var36) ? var46.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var56
//     assertTrue("Contract failed: equals-hashcode on var46 and var56", var46.equals(var56) ? var46.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var36
//     assertTrue("Contract failed: equals-hashcode on var56 and var36", var56.equals(var36) ? var56.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var56 and var46
//     assertTrue("Contract failed: equals-hashcode on var56 and var46", var56.equals(var46) ? var56.hashCode() == var46.hashCode() : true);
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var6 = null;
//     var2.notifyListeners(var6);
//     java.lang.String var8 = var2.getLabel();
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var13 = var10.getLabelOffsetType();
//     java.awt.Stroke var14 = null;
//     var10.setOutlineStroke(var14);
//     org.jfree.chart.text.TextAnchor var16 = var10.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var21 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var22 = var21.getRight();
//     double var24 = var21.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var25 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var24);
//     boolean var26 = var16.equals((java.lang.Object)var25);
//     org.jfree.chart.util.RectangleInsets var31 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var32 = var31.getBottom();
//     org.jfree.chart.util.UnitType var33 = var31.getUnitType();
//     boolean var35 = var33.equals((java.lang.Object)"");
//     boolean var36 = var16.equals((java.lang.Object)var33);
//     var2.setLabelTextAnchor(var16);
//     java.awt.Paint var38 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var40 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var41 = var40.getLabelTextAnchor();
//     org.jfree.chart.text.TextAnchor var42 = var40.getLabelTextAnchor();
//     java.awt.Stroke var43 = var40.getStroke();
//     org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(8.0d, var38, var43);
//     var44.setValue(121.0d);
//     java.lang.Class var47 = null;
//     java.util.EventListener[] var48 = var44.getListeners(var47);
// 
//   }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     org.jfree.chart.plot.ValueMarker var8 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var8.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var11 = var8.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var8.notifyListeners(var12);
//     java.lang.String var14 = var8.getLabel();
//     org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var16.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var19 = var16.getLabelOffsetType();
//     java.awt.Stroke var20 = null;
//     var16.setOutlineStroke(var20);
//     org.jfree.chart.text.TextAnchor var22 = var16.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var27 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var28 = var27.getRight();
//     double var30 = var27.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var31 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var30);
//     boolean var32 = var22.equals((java.lang.Object)var31);
//     org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var38 = var37.getBottom();
//     org.jfree.chart.util.UnitType var39 = var37.getUnitType();
//     boolean var41 = var39.equals((java.lang.Object)"");
//     boolean var42 = var22.equals((java.lang.Object)var39);
//     var8.setLabelTextAnchor(var22);
//     java.awt.Paint var44 = var8.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var46 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var47 = var46.getLabelTextAnchor();
//     org.jfree.chart.text.TextAnchor var48 = var46.getLabelTextAnchor();
//     java.awt.Stroke var49 = var46.getStroke();
//     org.jfree.chart.plot.ValueMarker var50 = new org.jfree.chart.plot.ValueMarker(8.0d, var44, var49);
//     var1.setOutlineStroke(var49);
//     
//     // Checks the contract:  equals-hashcode on var1 and var8
//     assertTrue("Contract failed: equals-hashcode on var1 and var8", var1.equals(var8) ? var1.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var1
//     assertTrue("Contract failed: equals-hashcode on var8 and var1", var8.equals(var1) ? var8.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     boolean var6 = var4.equals((java.lang.Object)(short)100);
//     double var8 = var4.extendHeight(121.0d);
//     double var10 = var4.extendWidth((-1.0d));
//     double var12 = var4.calculateLeftInset(0.0d);
//     java.awt.geom.Rectangle2D var13 = null;
//     var4.trim(var13);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


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

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.lang.Object var0 = null;
    org.jfree.chart.JFreeChart var1 = null;
    org.jfree.chart.util.RectangleInsets var6 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var7 = var6.getBottom();
    org.jfree.chart.util.UnitType var8 = var6.getUnitType();
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var8, 10.0d, 122.0d, 1.0d, 9.0d);
    double var15 = var13.calculateRightOutset(0.0d);
    double var17 = var13.calculateTopInset(9.0d);
    org.jfree.chart.event.ChartChangeEvent var19 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)10.0f);
    org.jfree.chart.JFreeChart var20 = null;
    var19.setChart(var20);
    org.jfree.chart.JFreeChart var22 = null;
    var19.setChart(var22);
    org.jfree.chart.event.ChartChangeEventType var24 = var19.getType();
    boolean var25 = var13.equals((java.lang.Object)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.event.ChartChangeEvent var26 = new org.jfree.chart.event.ChartChangeEvent(var0, var1, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getRight();
//     double var7 = var4.calculateBottomInset((-1.0d));
//     double var8 = var4.getLeft();
//     double var10 = var4.extendWidth(110.0d);
//     double var12 = var4.calculateBottomInset(10.0d);
//     java.awt.geom.Rectangle2D var13 = null;
//     var4.trim(var13);
// 
//   }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     java.awt.Paint var9 = var1.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
//     java.awt.Stroke var15 = null;
//     var11.setOutlineStroke(var15);
//     java.awt.Paint var17 = var11.getOutlinePaint();
//     var1.setLabelPaint(var17);
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("hi!");
//     boolean var23 = var1.equals((java.lang.Object)var20);
//     java.awt.Stroke var24 = var20.getStroke();
//     var20.setValue(0.0d);
//     org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var28.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var31 = null;
//     var28.notifyListeners(var31);
//     java.lang.String var33 = var28.getLabel();
//     java.awt.Stroke var34 = null;
//     var28.setOutlineStroke(var34);
//     java.awt.Paint var36 = var28.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var38 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var38.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var41 = var38.getLabelOffsetType();
//     java.awt.Stroke var42 = null;
//     var38.setOutlineStroke(var42);
//     java.awt.Paint var44 = var38.getOutlinePaint();
//     var28.setLabelPaint(var44);
//     org.jfree.chart.plot.ValueMarker var47 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var47.setLabel("hi!");
//     boolean var50 = var28.equals((java.lang.Object)var47);
//     java.awt.Paint var51 = var28.getOutlinePaint();
//     var20.setOutlinePaint(var51);
//     
//     // Checks the contract:  equals-hashcode on var1 and var28
//     assertTrue("Contract failed: equals-hashcode on var1 and var28", var1.equals(var28) ? var1.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var38
//     assertTrue("Contract failed: equals-hashcode on var11 and var38", var11.equals(var38) ? var11.hashCode() == var38.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var1
//     assertTrue("Contract failed: equals-hashcode on var28 and var1", var28.equals(var1) ? var28.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var38 and var11
//     assertTrue("Contract failed: equals-hashcode on var38 and var11", var38.equals(var11) ? var38.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Paint var6 = var1.getOutlinePaint();
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var10.setLabel("hi!");
//     java.awt.Paint var13 = var10.getOutlinePaint();
//     var10.setValue(119.0d);
//     org.jfree.chart.util.LengthAdjustmentType var16 = var10.getLabelOffsetType();
//     var1.setLabelOffsetType(var16);
//     java.awt.Paint var18 = var1.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var20 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var20.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var23 = null;
//     var20.notifyListeners(var23);
//     java.lang.Object var25 = var20.clone();
//     java.awt.Font var26 = var20.getLabelFont();
//     var1.setLabelFont(var26);
//     
//     // Checks the contract:  equals-hashcode on var1 and var20
//     assertTrue("Contract failed: equals-hashcode on var1 and var20", var1.equals(var20) ? var1.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var1
//     assertTrue("Contract failed: equals-hashcode on var20 and var1", var20.equals(var1) ? var20.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var25
//     assertTrue("Contract failed: equals-hashcode on var5 and var25", var5.equals(var25) ? var5.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var5
//     assertTrue("Contract failed: equals-hashcode on var25 and var5", var25.equals(var5) ? var25.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    java.awt.Paint var2 = var1.getOutlinePaint();
    org.jfree.chart.event.MarkerChangeListener var3 = null;
    var1.removeChangeListener(var3);
    org.jfree.chart.text.TextAnchor var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setLabelTextAnchor(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var15 = var13.calculateRightInset(0.0d);
    double var16 = var13.getLeft();
    java.awt.geom.Rectangle2D var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var18 = var13.createInsetRectangle(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var2.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
    java.lang.Object var6 = var2.clone();
    java.awt.Paint var7 = var2.getOutlinePaint();
    var2.setLabel("");
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("hi!");
    java.awt.Paint var14 = var11.getOutlinePaint();
    var11.setValue(119.0d);
    org.jfree.chart.util.LengthAdjustmentType var17 = var11.getLabelOffsetType();
    var2.setLabelOffsetType(var17);
    java.awt.Paint var19 = var2.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var21 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var21.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var24 = var21.getLabelOffsetType();
    java.lang.Object var25 = var21.clone();
    java.awt.Stroke var26 = var21.getStroke();
    org.jfree.chart.plot.ValueMarker var28 = new org.jfree.chart.plot.ValueMarker(122.0d);
    org.jfree.chart.text.TextAnchor var29 = var28.getLabelTextAnchor();
    org.jfree.chart.text.TextAnchor var30 = var28.getLabelTextAnchor();
    java.awt.Stroke var31 = var28.getStroke();
    org.jfree.chart.util.RectangleInsets var32 = var28.getLabelOffset();
    java.lang.Object var33 = var28.clone();
    org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var35.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var38 = null;
    var35.notifyListeners(var38);
    java.awt.Paint var40 = var35.getLabelPaint();
    var28.setOutlinePaint(var40);
    java.awt.Stroke var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker((-3.0d), var19, var26, var40, var42, 100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateBottomInset((-1.0d));
    double var9 = var4.calculateBottomOutset(10.0d);
    double var11 = var4.calculateTopOutset(0.0d);
    double var12 = var4.getRight();
    org.jfree.chart.util.UnitType var13 = var4.getUnitType();
    java.awt.geom.Rectangle2D var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var17 = var4.createOutsetRectangle(var14, false, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    boolean var12 = var4.equals((java.lang.Object)122.0d);
    double var13 = var4.getBottom();
    java.awt.geom.Rectangle2D var14 = null;
    org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var16.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var19 = var16.getLabelOffsetType();
    java.lang.String var20 = var19.toString();
    org.jfree.chart.plot.ValueMarker var22 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var22.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var25 = var22.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var30 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var31 = var30.getBottom();
    org.jfree.chart.util.UnitType var32 = var30.getUnitType();
    boolean var34 = var32.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var39 = new org.jfree.chart.util.RectangleInsets(var32, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var41 = var39.calculateRightInset(0.0d);
    boolean var42 = var25.equals((java.lang.Object)0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var43 = var4.createAdjustedRectangle(var14, var19, var25);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "CONTRACT"+ "'", var20.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 122.0d, 1.0d, 9.0d);
    double var13 = var11.calculateRightOutset(0.0d);
    java.awt.geom.Rectangle2D var14 = null;
    org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var16.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var19 = var16.getLabelOffsetType();
    java.lang.String var20 = var19.toString();
    boolean var22 = var19.equals((java.lang.Object)10.0d);
    org.jfree.chart.plot.ValueMarker var24 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var24.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var27 = var24.getLabelOffsetType();
    java.lang.String var28 = var27.toString();
    boolean var30 = var27.equals((java.lang.Object)10.0d);
    org.jfree.chart.util.RectangleInsets var35 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var37 = var35.trimHeight(120.0d);
    double var38 = var35.getLeft();
    boolean var39 = var27.equals((java.lang.Object)var38);
    org.jfree.chart.plot.ValueMarker var41 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var41.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var44 = null;
    var41.notifyListeners(var44);
    java.lang.String var46 = var41.getLabel();
    java.awt.Stroke var47 = null;
    var41.setOutlineStroke(var47);
    boolean var49 = var27.equals((java.lang.Object)var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var50 = var11.createAdjustedRectangle(var14, var19, var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "CONTRACT"+ "'", var20.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "CONTRACT"+ "'", var28.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    java.lang.String var6 = var4.toString();
    java.awt.geom.Rectangle2D var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var10 = var4.createInsetRectangle(var7, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"+ "'", var6.equals("RectangleInsets[t=0.0,l=10.0,b=1.0,r=100.0]"));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    boolean var8 = var6.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 0.0d, 1.0d, (-1.0d));
    java.lang.String var14 = var6.toString();
    org.jfree.chart.util.RectangleInsets var19 = new org.jfree.chart.util.RectangleInsets(var6, 119.0d, 10.0d, 109.0d, 0.0d);
    org.jfree.chart.util.UnitType var20 = var19.getUnitType();
    java.lang.Object var21 = null;
    boolean var22 = var20.equals(var21);
    org.jfree.chart.util.RectangleInsets var27 = new org.jfree.chart.util.RectangleInsets(var20, 118.0d, 8.0d, 110.0d, 8.0d);
    java.lang.String var28 = var20.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "UnitType.ABSOLUTE"+ "'", var14.equals("UnitType.ABSOLUTE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "UnitType.ABSOLUTE"+ "'", var28.equals("UnitType.ABSOLUTE"));

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var4 = null;
    var1.notifyListeners(var4);
    java.lang.Object var6 = var1.clone();
    java.awt.Font var7 = var1.getLabelFont();
    org.jfree.chart.util.RectangleInsets var8 = var1.getLabelOffset();
    double var10 = var8.calculateLeftOutset((-1.0d));
    double var12 = var8.calculateBottomInset((-111.0d));
    double var13 = var8.getLeft();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 122.0d, 1.0d, 9.0d);
    double var12 = var11.getTop();
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var11.createOutsetRectangle(var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.text.TextAnchor var2 = var1.getLabelTextAnchor();
//     org.jfree.chart.text.TextAnchor var3 = var1.getLabelTextAnchor();
//     java.awt.Stroke var4 = var1.getStroke();
//     org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var6.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var9 = var6.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var10 = null;
//     var6.notifyListeners(var10);
//     java.lang.String var12 = var6.getLabel();
//     org.jfree.chart.plot.ValueMarker var14 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var14.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var17 = var14.getLabelOffsetType();
//     java.awt.Stroke var18 = null;
//     var14.setOutlineStroke(var18);
//     org.jfree.chart.text.TextAnchor var20 = var14.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var25 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var26 = var25.getRight();
//     double var28 = var25.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var29 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var28);
//     boolean var30 = var20.equals((java.lang.Object)var29);
//     org.jfree.chart.util.RectangleInsets var35 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var36 = var35.getBottom();
//     org.jfree.chart.util.UnitType var37 = var35.getUnitType();
//     boolean var39 = var37.equals((java.lang.Object)"");
//     boolean var40 = var20.equals((java.lang.Object)var37);
//     var6.setLabelTextAnchor(var20);
//     java.awt.Paint var42 = var6.getOutlinePaint();
//     var1.setOutlinePaint(var42);
//     org.jfree.chart.plot.ValueMarker var45 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var45.setLabel("");
//     org.jfree.chart.plot.ValueMarker var49 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var49.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var52 = var49.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var53 = null;
//     var49.notifyListeners(var53);
//     java.lang.String var55 = var49.getLabel();
//     org.jfree.chart.plot.ValueMarker var57 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var57.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var60 = null;
//     var57.notifyListeners(var60);
//     java.awt.Paint var62 = var57.getLabelPaint();
//     var49.setOutlinePaint(var62);
//     var45.setPaint(var62);
//     java.awt.Font var65 = var45.getLabelFont();
//     var1.setLabelFont(var65);
//     
//     // Checks the contract:  equals-hashcode on var6 and var57
//     assertTrue("Contract failed: equals-hashcode on var6 and var57", var6.equals(var57) ? var6.hashCode() == var57.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var57 and var6
//     assertTrue("Contract failed: equals-hashcode on var57 and var6", var57.equals(var6) ? var57.hashCode() == var6.hashCode() : true);
// 
//   }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("hi!");
//     java.awt.Paint var5 = var2.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var7 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var7.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var10 = null;
//     var7.notifyListeners(var10);
//     java.lang.String var12 = var7.getLabel();
//     java.awt.Stroke var13 = null;
//     var7.setOutlineStroke(var13);
//     java.awt.Paint var15 = var7.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var17 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var17.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var20 = var17.getLabelOffsetType();
//     java.awt.Stroke var21 = null;
//     var17.setOutlineStroke(var21);
//     java.awt.Paint var23 = var17.getOutlinePaint();
//     var7.setLabelPaint(var23);
//     org.jfree.chart.plot.ValueMarker var26 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var26.setLabel("hi!");
//     boolean var29 = var7.equals((java.lang.Object)var26);
//     java.awt.Stroke var30 = var26.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var31 = new org.jfree.chart.plot.ValueMarker(1.0d, var5, var30);
//     
//     // Checks the contract:  equals-hashcode on var2 and var26
//     assertTrue("Contract failed: equals-hashcode on var2 and var26", var2.equals(var26) ? var2.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var26 and var2
//     assertTrue("Contract failed: equals-hashcode on var26 and var2", var26.equals(var2) ? var26.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    boolean var6 = var4.equals((java.lang.Object)(short)100);
    double var8 = var4.extendHeight(121.0d);
    double var10 = var4.trimWidth(119.0d);
    double var12 = var4.extendWidth((-111.0d));
    java.awt.geom.Rectangle2D var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var16 = var4.createOutsetRectangle(var13, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 122.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    org.jfree.chart.util.UnitType var6 = var4.getUnitType();
    org.jfree.chart.util.RectangleInsets var11 = new org.jfree.chart.util.RectangleInsets(var6, 10.0d, 122.0d, 1.0d, 9.0d);
    double var12 = var11.getTop();
    double var13 = var11.getBottom();
    double var15 = var11.trimHeight(120.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 109.0d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.calculateTopInset((-1.0d));
    double var8 = var4.trimHeight(10.0d);
    java.awt.geom.Rectangle2D var9 = null;
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    org.jfree.chart.plot.ValueMarker var16 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var16.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var19 = var16.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var24 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var25 = var24.getBottom();
    org.jfree.chart.util.UnitType var26 = var24.getUnitType();
    boolean var28 = var26.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var33 = new org.jfree.chart.util.RectangleInsets(var26, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var35 = var33.calculateRightInset(0.0d);
    boolean var36 = var19.equals((java.lang.Object)0.0d);
    org.jfree.chart.util.RectangleInsets var41 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var42 = var41.getBottom();
    org.jfree.chart.util.UnitType var43 = var41.getUnitType();
    boolean var45 = var43.equals((java.lang.Object)"");
    java.lang.String var46 = var43.toString();
    boolean var47 = var19.equals((java.lang.Object)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var48 = var4.createAdjustedRectangle(var9, var14, var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "UnitType.ABSOLUTE"+ "'", var46.equals("UnitType.ABSOLUTE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.plot.ValueMarker var5 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var5.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var8 = var5.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var9 = null;
//     var5.notifyListeners(var9);
//     java.lang.String var11 = var5.getLabel();
//     org.jfree.chart.plot.ValueMarker var13 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var13.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var16 = null;
//     var13.notifyListeners(var16);
//     java.awt.Paint var18 = var13.getLabelPaint();
//     var5.setOutlinePaint(var18);
//     var1.setPaint(var18);
//     org.jfree.chart.util.RectangleAnchor var21 = var1.getLabelAnchor();
//     java.lang.Object var22 = var1.clone();
//     org.jfree.chart.event.ChartChangeEvent var23 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var1);
//     java.lang.Object var24 = var23.getSource();
//     
//     // Checks the contract:  equals-hashcode on var22 and var24
//     assertTrue("Contract failed: equals-hashcode on var22 and var24", var22.equals(var24) ? var22.hashCode() == var24.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var22
//     assertTrue("Contract failed: equals-hashcode on var24 and var22", var24.equals(var22) ? var24.hashCode() == var22.hashCode() : true);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    double var8 = var4.getLeft();
    double var9 = var4.getRight();
    java.awt.geom.Rectangle2D var10 = null;
    org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var12.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var15 = var12.getLabelOffsetType();
    boolean var17 = var15.equals((java.lang.Object)0.0d);
    org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var19.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var22 = var19.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var27 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var29 = var27.calculateTopInset((-1.0d));
    double var31 = var27.calculateLeftInset(122.0d);
    boolean var32 = var22.equals((java.lang.Object)var27);
    java.lang.String var33 = var22.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var34 = var4.createAdjustedRectangle(var10, var15, var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "CONTRACT"+ "'", var33.equals("CONTRACT"));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getBottom();
    double var7 = var4.calculateTopInset(1.0d);
    java.awt.geom.Rectangle2D var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var9 = var4.createOutsetRectangle(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var5 = var4.getRight();
//     double var7 = var4.calculateBottomInset((-1.0d));
//     double var9 = var4.calculateBottomOutset(10.0d);
//     java.awt.geom.Rectangle2D var10 = null;
//     var4.trim(var10);
// 
//   }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var5 = var2.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var6 = null;
//     var2.notifyListeners(var6);
//     java.lang.String var8 = var2.getLabel();
//     var2.setLabel("");
//     org.jfree.chart.util.RectangleAnchor var11 = var2.getLabelAnchor();
//     java.awt.geom.Point2D var12 = org.jfree.chart.util.RectangleAnchor.coordinates(var0, var11);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var6 = var4.trimHeight(120.0d);
    double var7 = var4.getLeft();
    double var8 = var4.getTop();
    java.awt.geom.Rectangle2D var9 = null;
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var19 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var20 = var19.getBottom();
    org.jfree.chart.util.UnitType var21 = var19.getUnitType();
    boolean var23 = var21.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var28 = new org.jfree.chart.util.RectangleInsets(var21, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var30 = var28.calculateRightInset(0.0d);
    boolean var31 = var14.equals((java.lang.Object)0.0d);
    java.lang.String var32 = var14.toString();
    org.jfree.chart.plot.ValueMarker var34 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var34.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var37 = var34.getLabelOffsetType();
    boolean var39 = var37.equals((java.lang.Object)0.0d);
    java.lang.String var40 = var37.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var41 = var4.createAdjustedRectangle(var9, var14, var37);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 119.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "CONTRACT"+ "'", var32.equals("CONTRACT"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "CONTRACT"+ "'", var40.equals("CONTRACT"));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.util.RectangleInsets var9 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var10 = var9.getBottom();
    org.jfree.chart.util.UnitType var11 = var9.getUnitType();
    boolean var13 = var11.equals((java.lang.Object)"");
    org.jfree.chart.util.RectangleInsets var18 = new org.jfree.chart.util.RectangleInsets(var11, 10.0d, 0.0d, 1.0d, (-1.0d));
    double var20 = var18.calculateRightInset(0.0d);
    boolean var21 = var4.equals((java.lang.Object)0.0d);
    org.jfree.chart.util.RectangleInsets var26 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var27 = var26.getBottom();
    org.jfree.chart.util.UnitType var28 = var26.getUnitType();
    boolean var30 = var28.equals((java.lang.Object)"");
    java.lang.String var31 = var28.toString();
    boolean var32 = var4.equals((java.lang.Object)var28);
    org.jfree.chart.util.RectangleInsets var37 = new org.jfree.chart.util.RectangleInsets(var28, 120.0d, 104.0d, 119.0d, (-1.0d));
    java.awt.geom.Rectangle2D var38 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var41 = var37.createInsetRectangle(var38, true, true);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "UnitType.ABSOLUTE"+ "'", var31.equals("UnitType.ABSOLUTE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var2.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var2.notifyListeners(var5);
//     java.lang.String var7 = var2.getLabel();
//     java.awt.Stroke var8 = null;
//     var2.setOutlineStroke(var8);
//     java.awt.Font var10 = var2.getLabelFont();
//     org.jfree.chart.plot.ValueMarker var12 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var12.setLabel("hi!");
//     java.awt.Paint var15 = var12.getOutlinePaint();
//     var2.setPaint(var15);
//     org.jfree.chart.plot.ValueMarker var18 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var18.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var21 = null;
//     var18.notifyListeners(var21);
//     java.lang.String var23 = var18.getLabel();
//     java.awt.Stroke var24 = null;
//     var18.setOutlineStroke(var24);
//     java.awt.Font var26 = var18.getLabelFont();
//     org.jfree.chart.event.MarkerChangeListener var27 = null;
//     var18.addChangeListener(var27);
//     java.awt.Stroke var29 = var18.getStroke();
//     org.jfree.chart.plot.ValueMarker var30 = new org.jfree.chart.plot.ValueMarker((-102.0d), var15, var29);
//     
//     // Checks the contract:  equals-hashcode on var2 and var18
//     assertTrue("Contract failed: equals-hashcode on var2 and var18", var2.equals(var18) ? var2.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var18 and var2
//     assertTrue("Contract failed: equals-hashcode on var18 and var2", var18.equals(var2) ? var18.hashCode() == var2.hashCode() : true);
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("hi!");
    java.awt.Paint var4 = var1.getOutlinePaint();
    var1.setValue(119.0d);
    java.lang.Object var7 = var1.clone();
    java.awt.Paint var8 = var1.getOutlinePaint();
    org.jfree.chart.plot.ValueMarker var10 = new org.jfree.chart.plot.ValueMarker(122.0d);
    org.jfree.chart.text.TextAnchor var11 = var10.getLabelTextAnchor();
    org.jfree.chart.text.TextAnchor var12 = var10.getLabelTextAnchor();
    var1.setLabelTextAnchor(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var5 = null;
//     var1.notifyListeners(var5);
//     org.jfree.chart.event.MarkerChangeListener var7 = null;
//     var1.addChangeListener(var7);
//     java.awt.Stroke var9 = var1.getOutlineStroke();
//     org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var11.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var14 = var11.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var15 = null;
//     var11.notifyListeners(var15);
//     java.lang.String var17 = var11.getLabel();
//     org.jfree.chart.plot.ValueMarker var19 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var19.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var22 = var19.getLabelOffsetType();
//     java.awt.Stroke var23 = null;
//     var19.setOutlineStroke(var23);
//     org.jfree.chart.text.TextAnchor var25 = var19.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var30 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var31 = var30.getRight();
//     double var33 = var30.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var34 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var33);
//     boolean var35 = var25.equals((java.lang.Object)var34);
//     org.jfree.chart.util.RectangleInsets var40 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var41 = var40.getBottom();
//     org.jfree.chart.util.UnitType var42 = var40.getUnitType();
//     boolean var44 = var42.equals((java.lang.Object)"");
//     boolean var45 = var25.equals((java.lang.Object)var42);
//     var11.setLabelTextAnchor(var25);
//     java.awt.Paint var47 = var11.getOutlinePaint();
//     var1.setLabelPaint(var47);
//     org.jfree.chart.util.RectangleInsets var53 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var54 = var53.getBottom();
//     double var56 = var53.calculateTopInset(1.0d);
//     java.lang.String var57 = var53.toString();
//     var1.setLabelOffset(var53);
//     org.jfree.chart.plot.ValueMarker var60 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var60.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var63 = null;
//     var60.notifyListeners(var63);
//     java.awt.Paint var65 = var60.getLabelPaint();
//     var1.setPaint(var65);
//     
//     // Checks the contract:  equals-hashcode on var11 and var60
//     assertTrue("Contract failed: equals-hashcode on var11 and var60", var11.equals(var60) ? var11.hashCode() == var60.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var60 and var11
//     assertTrue("Contract failed: equals-hashcode on var60 and var11", var60.equals(var11) ? var60.hashCode() == var11.hashCode() : true);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.chart.plot.ValueMarker var2 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var2.setLabel("hi!");
    org.jfree.chart.plot.ValueMarker var6 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var6.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var9 = null;
    var6.notifyListeners(var9);
    java.awt.Paint var11 = var6.getLabelPaint();
    var2.setPaint(var11);
    org.jfree.chart.plot.ValueMarker var15 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var15.setLabel("hi!");
    java.awt.Paint var18 = var15.getOutlinePaint();
    var15.setValue(119.0d);
    java.awt.Paint var21 = var15.getOutlinePaint();
    org.jfree.chart.plot.ValueMarker var23 = new org.jfree.chart.plot.ValueMarker(122.0d);
    org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var25.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var28 = null;
    var25.notifyListeners(var28);
    java.lang.String var30 = var25.getLabel();
    java.awt.Stroke var31 = null;
    var25.setOutlineStroke(var31);
    java.awt.Paint var33 = var25.getLabelPaint();
    org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var35.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var38 = var35.getLabelOffsetType();
    java.awt.Stroke var39 = null;
    var35.setOutlineStroke(var39);
    java.awt.Paint var41 = var35.getOutlinePaint();
    var25.setLabelPaint(var41);
    org.jfree.chart.plot.ValueMarker var44 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var44.setLabel("hi!");
    boolean var47 = var25.equals((java.lang.Object)var44);
    java.awt.Stroke var48 = var44.getOutlineStroke();
    var23.setStroke(var48);
    org.jfree.chart.plot.ValueMarker var50 = new org.jfree.chart.plot.ValueMarker(9.0d, var21, var48);
    org.jfree.chart.plot.ValueMarker var52 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var52.setLabel("");
    java.lang.String var55 = var52.getLabel();
    org.jfree.chart.event.MarkerChangeListener var56 = null;
    var52.addChangeListener(var56);
    org.jfree.chart.plot.ValueMarker var59 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var59.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var62 = var59.getLabelOffsetType();
    java.awt.Stroke var63 = null;
    var59.setOutlineStroke(var63);
    java.awt.Font var65 = var59.getLabelFont();
    var52.setLabelFont(var65);
    org.jfree.chart.plot.ValueMarker var68 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var68.setLabel("hi!");
    org.jfree.chart.plot.ValueMarker var72 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var72.setLabel("");
    org.jfree.chart.event.MarkerChangeEvent var75 = null;
    var72.notifyListeners(var75);
    java.awt.Paint var77 = var72.getLabelPaint();
    var68.setPaint(var77);
    var52.setOutlinePaint(var77);
    java.awt.Stroke var80 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.plot.ValueMarker var82 = new org.jfree.chart.plot.ValueMarker(8.0d, var11, var48, var77, var80, 100.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var4 = null;
//     var1.notifyListeners(var4);
//     java.lang.String var6 = var1.getLabel();
//     java.awt.Stroke var7 = null;
//     var1.setOutlineStroke(var7);
//     org.jfree.chart.util.RectangleInsets var13 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var15 = var13.trimHeight(120.0d);
//     double var16 = var13.getLeft();
//     double var17 = var13.getTop();
//     double var19 = var13.calculateBottomInset(121.0d);
//     double var21 = var13.calculateRightOutset(0.0d);
//     double var22 = var13.getRight();
//     var1.setLabelOffset(var13);
//     org.jfree.chart.plot.ValueMarker var25 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var25.setLabel("");
//     org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var29.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var32 = var29.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var33 = null;
//     var29.notifyListeners(var33);
//     java.lang.String var35 = var29.getLabel();
//     org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var37.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var40 = null;
//     var37.notifyListeners(var40);
//     java.awt.Paint var42 = var37.getLabelPaint();
//     var29.setOutlinePaint(var42);
//     var25.setPaint(var42);
//     org.jfree.chart.JFreeChart var45 = null;
//     org.jfree.chart.event.ChartChangeEvent var46 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var25, var45);
//     org.jfree.chart.event.MarkerChangeEvent var47 = new org.jfree.chart.event.MarkerChangeEvent((org.jfree.chart.plot.Marker)var25);
//     var1.notifyListeners(var47);
//     org.jfree.chart.plot.ValueMarker var50 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var50.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var53 = var50.getLabelOffsetType();
//     org.jfree.chart.event.MarkerChangeEvent var54 = null;
//     var50.notifyListeners(var54);
//     java.lang.String var56 = var50.getLabel();
//     org.jfree.chart.plot.ValueMarker var58 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var58.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var61 = null;
//     var58.notifyListeners(var61);
//     java.awt.Paint var63 = var58.getLabelPaint();
//     var50.setOutlinePaint(var63);
//     var1.setPaint(var63);
//     
//     // Checks the contract:  equals-hashcode on var29 and var50
//     assertTrue("Contract failed: equals-hashcode on var29 and var50", var29.equals(var50) ? var29.hashCode() == var50.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var58
//     assertTrue("Contract failed: equals-hashcode on var37 and var58", var37.equals(var58) ? var37.hashCode() == var58.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var29
//     assertTrue("Contract failed: equals-hashcode on var50 and var29", var50.equals(var29) ? var50.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var58 and var37
//     assertTrue("Contract failed: equals-hashcode on var58 and var37", var58.equals(var37) ? var58.hashCode() == var37.hashCode() : true);
// 
//   }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Paint var6 = var1.getOutlinePaint();
//     java.awt.Paint var7 = var1.getPaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var12 = var9.getLabelOffsetType();
//     java.awt.Stroke var13 = null;
//     var9.setOutlineStroke(var13);
//     org.jfree.chart.text.TextAnchor var15 = var9.getLabelTextAnchor();
//     org.jfree.chart.util.RectangleInsets var20 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
//     double var21 = var20.getRight();
//     double var23 = var20.calculateBottomInset((-1.0d));
//     org.jfree.chart.event.ChartChangeEvent var24 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var23);
//     boolean var25 = var15.equals((java.lang.Object)var24);
//     var1.setLabelTextAnchor(var15);
//     org.jfree.chart.plot.ValueMarker var29 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var29.setLabel("hi!");
//     java.awt.Paint var32 = var29.getOutlinePaint();
//     var29.setValue(119.0d);
//     java.awt.Paint var35 = var29.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.plot.ValueMarker var39 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var39.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var42 = null;
//     var39.notifyListeners(var42);
//     java.lang.String var44 = var39.getLabel();
//     java.awt.Stroke var45 = null;
//     var39.setOutlineStroke(var45);
//     java.awt.Paint var47 = var39.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var49 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var49.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var52 = var49.getLabelOffsetType();
//     java.awt.Stroke var53 = null;
//     var49.setOutlineStroke(var53);
//     java.awt.Paint var55 = var49.getOutlinePaint();
//     var39.setLabelPaint(var55);
//     org.jfree.chart.plot.ValueMarker var58 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var58.setLabel("hi!");
//     boolean var61 = var39.equals((java.lang.Object)var58);
//     java.awt.Stroke var62 = var58.getOutlineStroke();
//     var37.setStroke(var62);
//     org.jfree.chart.plot.ValueMarker var64 = new org.jfree.chart.plot.ValueMarker(9.0d, var35, var62);
//     var1.setOutlineStroke(var62);
//     
//     // Checks the contract:  equals-hashcode on var9 and var49
//     assertTrue("Contract failed: equals-hashcode on var9 and var49", var9.equals(var49) ? var9.hashCode() == var49.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var9
//     assertTrue("Contract failed: equals-hashcode on var49 and var9", var49.equals(var9) ? var49.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Paint var6 = var1.getOutlinePaint();
//     java.awt.Paint var7 = var1.getPaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var12 = var9.getLabelOffsetType();
//     java.awt.Stroke var13 = null;
//     var9.setOutlineStroke(var13);
//     org.jfree.chart.text.TextAnchor var15 = var9.getLabelTextAnchor();
//     var1.setLabelTextAnchor(var15);
//     org.jfree.chart.util.RectangleInsets var17 = var1.getLabelOffset();
//     org.jfree.chart.event.ChartChangeEvent var18 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object)var17);
//     double var20 = var17.trimHeight(110.0d);
//     double var22 = var17.calculateTopInset(0.0d);
//     java.lang.Object var23 = null;
//     boolean var24 = var17.equals(var23);
//     org.jfree.chart.plot.ValueMarker var27 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var27.setLabel("hi!");
//     java.awt.Paint var30 = var27.getOutlinePaint();
//     var27.setValue(119.0d);
//     java.awt.Paint var33 = var27.getOutlinePaint();
//     org.jfree.chart.plot.ValueMarker var35 = new org.jfree.chart.plot.ValueMarker(122.0d);
//     org.jfree.chart.plot.ValueMarker var37 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var37.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var40 = null;
//     var37.notifyListeners(var40);
//     java.lang.String var42 = var37.getLabel();
//     java.awt.Stroke var43 = null;
//     var37.setOutlineStroke(var43);
//     java.awt.Paint var45 = var37.getLabelPaint();
//     org.jfree.chart.plot.ValueMarker var47 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var47.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var50 = var47.getLabelOffsetType();
//     java.awt.Stroke var51 = null;
//     var47.setOutlineStroke(var51);
//     java.awt.Paint var53 = var47.getOutlinePaint();
//     var37.setLabelPaint(var53);
//     org.jfree.chart.plot.ValueMarker var56 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var56.setLabel("hi!");
//     boolean var59 = var37.equals((java.lang.Object)var56);
//     java.awt.Stroke var60 = var56.getOutlineStroke();
//     var35.setStroke(var60);
//     org.jfree.chart.plot.ValueMarker var62 = new org.jfree.chart.plot.ValueMarker(9.0d, var33, var60);
//     boolean var63 = var17.equals((java.lang.Object)9.0d);
//     
//     // Checks the contract:  equals-hashcode on var9 and var47
//     assertTrue("Contract failed: equals-hashcode on var9 and var47", var9.equals(var47) ? var9.hashCode() == var47.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var47 and var9
//     assertTrue("Contract failed: equals-hashcode on var47 and var9", var47.equals(var9) ? var47.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var1.setLabel("");
    org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
    org.jfree.chart.event.MarkerChangeEvent var5 = null;
    var1.notifyListeners(var5);
    java.lang.String var7 = var1.getLabel();
    var1.setLabel("");
    org.jfree.chart.plot.ValueMarker var11 = new org.jfree.chart.plot.ValueMarker(100.0d);
    var11.setLabel("hi!");
    java.awt.Paint var14 = var11.getOutlinePaint();
    var11.setValue(119.0d);
    java.awt.Paint var17 = var11.getOutlinePaint();
    org.jfree.chart.util.LengthAdjustmentType var18 = var11.getLabelOffsetType();
    org.jfree.chart.util.RectangleAnchor var19 = var11.getLabelAnchor();
    var1.setLabelAnchor(var19);
    java.awt.Paint var21 = var1.getOutlinePaint();
    org.jfree.chart.event.MarkerChangeListener var22 = null;
    var1.removeChangeListener(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }
// 
// 
//     org.jfree.chart.plot.ValueMarker var1 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var1.setLabel("");
//     org.jfree.chart.util.LengthAdjustmentType var4 = var1.getLabelOffsetType();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Paint var6 = var1.getOutlinePaint();
//     java.awt.Paint var7 = var1.getPaint();
//     org.jfree.chart.plot.ValueMarker var9 = new org.jfree.chart.plot.ValueMarker(100.0d);
//     var9.setLabel("");
//     org.jfree.chart.event.MarkerChangeEvent var12 = null;
//     var9.notifyListeners(var12);
//     java.lang.Object var14 = var9.clone();
//     var9.setAlpha(0.0f);
//     java.awt.Font var17 = var9.getLabelFont();
//     var1.setLabelFont(var17);
//     
//     // Checks the contract:  equals-hashcode on var5 and var14
//     assertTrue("Contract failed: equals-hashcode on var5 and var14", var5.equals(var14) ? var5.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var5
//     assertTrue("Contract failed: equals-hashcode on var14 and var5", var14.equals(var5) ? var14.hashCode() == var5.hashCode() : true);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.jfree.chart.util.RectangleInsets var4 = new org.jfree.chart.util.RectangleInsets(0.0d, 10.0d, 1.0d, 100.0d);
    double var5 = var4.getRight();
    double var7 = var4.calculateBottomInset((-1.0d));
    double var8 = var4.getLeft();
    double var10 = var4.extendHeight(0.0d);
    java.awt.geom.Rectangle2D var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.geom.Rectangle2D var14 = var4.createOutsetRectangle(var11, true, false);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the 