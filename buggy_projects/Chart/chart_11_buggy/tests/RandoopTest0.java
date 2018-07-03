
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, (-1.0d), 10.0d);
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
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.intersects(var0, var1);
// 
//   }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 100.0f);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.geom.Ellipse2D var0 = null;
    java.awt.geom.Ellipse2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, (-1.0d), 10.0f, (-1.0f));
// 
//   }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, (-1.0d), 10.0f, 10.0f);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.awt.geom.Arc2D var0 = null;
    java.awt.geom.Arc2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 10.0f);
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.contains(var0, var1);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 0.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.geom.Line2D var0 = null;
    java.awt.geom.Line2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 1.0d, 0.0f, 1.0f);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 10.0d, var2);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, (-1.0f), 10.0f);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var6, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (-1.0d), var2);
// 
//   }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, (-1.0f));
// 
//   }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 1.0f);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.awt.geom.GeneralPath var0 = null;
    java.awt.geom.GeneralPath var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.awt.Polygon var0 = null;
    java.awt.Polygon var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 1.0d, var2);
// 
//   }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 100.0d, 10.0f, (-1.0f));
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 1.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 10.0d, 0.0f, 1.0f);
// 
//   }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, (-1.0f), 10.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 1.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 1.0d, 100.0f, (-1.0f));
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var4, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 0.0d, var2);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 0.0d, var2);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 1.0d, 0.0f, 0.0f);
// 
//   }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 1.0d, var2);
// 
//   }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, (-1.0d), var2);
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 10.0d, 10.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 1.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 10.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test42() {}
//   public void test42() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), (-1.0f), 1.0f);
// 
//   }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 100.0f, 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 1.0d, 10.0f, 0.0f);
// 
//   }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 10.0d, 10.0f, 1.0f);
// 
//   }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, (-1.0d), 10.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var14, 1.0d, (-1.0f), 1.0f);
// 
//   }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 10.0f, 1.0f);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 100.0d, 100.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 10.0f, (-1.0f));
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, (-1.0f), 10.0f);
// 
//   }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 10.0d, (-1.0f), (-1.0f));
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, (-1.0f), 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 1.0d, (-1.0f), 10.0f);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var13);
    org.jfree.chart.util.RectangleAnchor var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, var15, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 0.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var7, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 10.0d, 10.0f, 10.0f);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (-1.0f));
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 0.0d, (-1.0f), 100.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var4, var11);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var20 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 1.0d, 100.0d);
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var4, var26);
    org.jfree.chart.util.RectangleAnchor var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, var28, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 100.0d, (-1.0f), 10.0f);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 0.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, (-1.0d), (-1.0f), 100.0f);
// 
//   }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (-1.0d), var2);
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 1.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var6, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 0.0d, var2);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var6, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var9, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 100.0d, var2);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var6, (-1.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 0.0f);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 1.0d, 100.0d);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, (-1.0d), 0.0d);
    boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var1, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var13, 1.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var13, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 100.0d, var2);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 0.0d, (-1.0f), 100.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var4, var11);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, var13, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 0.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var4, (-1.0d), 0.0f, 10.0f);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (-1.0f));
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var6, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 10.0d);
    org.jfree.chart.util.RectangleAnchor var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var5, 100.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 100.0d, 1.0f, 0.0f);
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var5, 100.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 0.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, 1.0f, 0.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.rotateShape(var17, 0.0d, 100.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var7, 100.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var6, (-1.0d), 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 0.0d, (-1.0f), 100.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var4, var11);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 100.0d, 1.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, var18, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 0.0d, var2);
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 1.0d, var2);
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var4, 1.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 10.0d, var2);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 0.0d, 0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 0.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var7, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 100.0d, 100.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var10, (-1.0d), 1.0f, 0.0f);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), (-1.0d));
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var6, (-1.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 100.0d, 100.0f, 1.0f);
// 
//   }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, (-1.0f), 0.0f);
// 
//   }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, (-1.0f), (-1.0f));
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 100.0d, (-1.0f), 10.0f);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 0.0d, 0.0d);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var6, var20);
    org.jfree.chart.util.RectangleAnchor var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, var22, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 1.0d);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 1.0d, 0.0f, 100.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 10.0d, 1.0d);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var30);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var30, 0.0d, (-1.0f), 100.0f);
    boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var28, var35);
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.rotateShape(var38, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.clone(var38);
    boolean var44 = org.jfree.chart.util.ShapeUtilities.equal(var28, var38);
    java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var47, 1.0d, 100.0d);
    boolean var51 = org.jfree.chart.util.ShapeUtilities.equal(var28, var50);
    boolean var52 = org.jfree.chart.util.ShapeUtilities.equal(var23, var50);
    boolean var53 = org.jfree.chart.util.ShapeUtilities.equal(var12, var23);
    java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 10.0d, (-1.0d));
    org.jfree.chart.util.RectangleAnchor var57 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, var57, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 100.0d, var2);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 10.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 1.0d, 10.0f, (-1.0f));
// 
//   }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, (-1.0d), (-1.0f), 0.0f);
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 100.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), 1.0d);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var13, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var7, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 10.0f, 1.0f);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 0.0d, 1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 1.0d, 0.0f, 100.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 10.0d, 1.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 0.0d, (-1.0f), 100.0f);
//     boolean var20 = org.jfree.chart.util.ShapeUtilities.equal(var12, var19);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var22);
//     boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var12, var22);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var12, var34);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var7, var34);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 0.0d, 10.0f, 0.0f);
// 
//   }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 0.0f, 1.0f);
// 
//   }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, (-1.0d), 10.0f, 100.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 0.0d, (-1.0f), 100.0f);
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, 100.0f, 10.0f);
// 
//   }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 10.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 1.0d, 100.0d);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 0.0d);
//     boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var11, var14);
//     boolean var22 = org.jfree.chart.util.ShapeUtilities.equal(var9, var14);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 100.0d, (-1.0f), 1.0f);
// 
//   }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 10.0d, 10.0f, 0.0f);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var13, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 100.0d, (-1.0f), 10.0f);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 1.0d);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var3, var9);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var3, var17);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 10.0d, 0.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 1.0f, 10.0f);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, 10.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var6, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 100.0d, (-1.0f), 10.0f);
    boolean var26 = org.jfree.chart.util.ShapeUtilities.equal(var19, var21);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 0.0d);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    boolean var31 = org.jfree.chart.util.ShapeUtilities.equal(var16, var30);
    boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var9, var30);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.rotateShape(var34, 1.0d, 10.0f, 10.0f);
    boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var30, var38);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.rotateShape(var41, 100.0d, (-1.0f), 10.0f);
    java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var41, 1.0d, 0.0d);
    java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.clone(var50);
    java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.rotateShape(var50, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, 1.0d, 1.0d);
    java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.rotateShape(var58, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var63 = org.jfree.chart.util.ShapeUtilities.clone(var62);
    boolean var64 = org.jfree.chart.util.ShapeUtilities.equal(var41, var62);
    boolean var65 = org.jfree.chart.util.ShapeUtilities.equal(var30, var62);
    java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.clone(var30);
    org.jfree.chart.util.RectangleAnchor var67 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, var67, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 1.0f, 0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 10.0f);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var19, var22);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, (-1.0d), 1.0f, (-1.0f));
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var10, 0.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, (-1.0f), 100.0f);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var5, var12);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var5, var15);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 100.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var25, 1.0d, 1.0f, 1.0f);
// 
//   }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 1.0d, 0.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, (-1.0f), 0.0f);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 10.0d, var2);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 10.0d, var2);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 0.0d, 1.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 0.0d, 0.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var17, 100.0d, 0.0f, (-1.0f));
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 1.0f, (-1.0f));
    boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, 10.0d, 0.0f, (-1.0f));
    org.jfree.chart.util.RectangleAnchor var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, var18, 10.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 0.0d, 1.0f, 10.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 1.0d, var2);
// 
//   }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 0.0d, 1.0f, 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 100.0d, 10.0f, 0.0f);
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 100.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), (-1.0f), 1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 1.0d, 10.0f, (-1.0f));
// 
//   }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 100.0d, (-1.0f), 100.0f);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var6, 100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 100.0d, var2);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var16, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var6, (-1.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (-1.0d), var2);
// 
//   }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 1.0d, 100.0d);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, (-1.0d), 0.0d);
//     boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var2, var5);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, (-1.0d), 100.0f, (-1.0f));
// 
//   }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 1.0d);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var3, var9);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var3, var17);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 10.0d, 0.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var22, 0.0d, 10.0f, 1.0f);
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 100.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), (-1.0f), 1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var16, 100.0d, 100.0f, 10.0f);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 10.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, var11, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var13, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, (-1.0d), 10.0f, 100.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 1.0d, 1.0f, 100.0f);
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 0.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, (-1.0f), 10.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, (-1.0d), 1.0f, 0.0f);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var7, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test167() {}
//   public void test167() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 0.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 1.0d, 0.0f, 100.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 10.0d, 1.0d);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var18, 0.0d, (-1.0f), 100.0f);
//     boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var16, var23);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var26);
//     boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var16, var26);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var35, 1.0d, 100.0d);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var16, var38);
//     boolean var40 = org.jfree.chart.util.ShapeUtilities.equal(var11, var38);
//     boolean var41 = org.jfree.chart.util.ShapeUtilities.equal(var4, var38);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var4, 0.0d, (-1.0f), 100.0f);
// 
//   }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 10.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 1.0f, (-1.0f));
    boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var0, var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 1.0f, (-1.0f));
// 
//   }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, 0.0f, 10.0f);
// 
//   }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 1.0f, 0.0f);
// 
//   }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, 10.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var6, (-1.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 1.0d, 0.0f, 0.0f);
// 
//   }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 1.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 1.0d, 0.0f, 0.0f);
// 
//   }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, (-1.0f), 100.0f);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var5, var12);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var5, var15);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 1.0d, 100.0d);
//     boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var5, var27);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 100.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var31, 0.0d, 0.0f, 10.0f);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 100.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), 1.0d);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var16);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.rotateShape(var16, 100.0d, 0.0f, 1.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 1.0d, 100.0d);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, (-1.0d), 0.0d);
    boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var23, var26);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var23);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var21, var34);
    org.jfree.chart.util.RectangleAnchor var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, var36, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (-1.0d), var2);
// 
//   }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, (-1.0f), 100.0f);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var5, var12);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var5, var15);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 100.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var15, 10.0d, 1.0f, 0.0f);
// 
//   }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var16, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 0.0d, var2);
// 
//   }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, (-1.0f), 0.0f);
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 1.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var5, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 1.0f, 100.0f);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 100.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 1.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, var11, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var6, (-1.0d), 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 10.0d, var2);
// 
//   }

  public void test190() {}
//   public void test190() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 0.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, (-1.0d), 0.0f, 100.0f);
// 
//   }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 10.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var9);
//     boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var6, var10);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 1.0d, (-1.0f), 100.0f);
// 
//   }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 1.0f, 10.0f);
// 
//   }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 0.0d, 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test196() {}
//   public void test196() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 100.0d, 0.0f, 10.0f);
// 
//   }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var16, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 1.0d, 0.0f, 1.0f);
// 
//   }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 10.0d);
    org.jfree.chart.util.RectangleAnchor var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var18, 1.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 10.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, var11, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 10.0d, (-1.0f), 100.0f);
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 10.0d, (-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test204() {}
//   public void test204() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 100.0d, (-1.0f), 10.0f);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, (-1.0f), 100.0f);
// 
//   }

  public void test205() {}
//   public void test205() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 10.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 1.0f, 100.0f);
// 
//   }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 0.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 1.0d, 0.0d);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var18, 1.0d, (-1.0f), (-1.0f));
    boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var12, var18);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var18, 0.0d, 0.0f, (-1.0f));
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var4, var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, (-1.0f), 10.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 0.0d);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var11);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 1.0d, 1.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, (-1.0d), 10.0f, 100.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     boolean var25 = org.jfree.chart.util.ShapeUtilities.equal(var2, var23);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var23, 1.0d, 10.0f, 1.0f);
// 
//   }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 1.0d, 10.0f, 10.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 100.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 1.0d, 100.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 1.0d);
    boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var11, var17);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var24);
    boolean var26 = org.jfree.chart.util.ShapeUtilities.equal(var11, var25);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 10.0d, 0.0f, (-1.0f));
    boolean var31 = org.jfree.chart.util.ShapeUtilities.equal(var8, var30);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), 100.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, 1.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var38 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, var38, 100.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, 0.0d, 100.0f, 0.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var16, 10.0d, 0.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, var21, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var4, 1.0d, 1.0f, 100.0f);
// 
//   }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, (-1.0f), 10.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var9, 100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 0.0d, 0.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 100.0d, 1.0f, 1.0f);
// 
//   }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 100.0d, (-1.0f), 10.0f);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 0.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, (-1.0f), (-1.0f));
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 100.0d, 100.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, (-1.0d), 0.0f, 1.0f);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 10.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 100.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var7, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 1.0d);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var3, var9);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var3, var17);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var17, 100.0d, 0.0f, 1.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 1.0d, 100.0d);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, (-1.0d), 0.0d);
//     boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var24, var27);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.clone(var24);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var22, var35);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.rotateShape(var35, 0.0d, (-1.0f), 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var40, 10.0d, (-1.0f), (-1.0f));
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 0.0d, 1.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 0.0d, 0.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var17, (-1.0d), 10.0f, 0.0f);
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, (-1.0f));
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, (-1.0f), 1.0f);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var7, 10.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTra