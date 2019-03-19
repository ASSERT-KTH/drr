
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     java.lang.Class var0 = null;
//     boolean var1 = org.jfree.chart.util.SerialUtilities.isSerializable(var0);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


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

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
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

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.io.ObjectInputStream var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Stroke var1 = org.jfree.chart.util.SerialUtilities.readStroke(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


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

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    java.awt.geom.Point2D var0 = null;
    java.io.ObjectOutputStream var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writePoint2D(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 1.0f, (-1.0f));
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    boolean var2 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)1, (java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    java.lang.ClassLoader var0 = org.jfree.chart.util.ObjectUtilities.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var0);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.contains(var0, var1);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    java.awt.geom.Arc2D var0 = null;
    java.awt.geom.Arc2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.awt.geom.GeneralPath var0 = null;
    java.awt.geom.GeneralPath var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.awt.Shape var0 = null;
    java.io.ObjectOutputStream var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var0 = org.jfree.chart.util.ObjectUtilities.isJDK14();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


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

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.lang.ClassLoader var0 = null;
    org.jfree.chart.util.ObjectUtilities.setClassLoader(var0);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelativeAsStream("", var1);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.awt.Polygon var0 = null;
    java.awt.Polygon var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


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

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.awt.Stroke var0 = null;
    java.io.ObjectOutputStream var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeStroke(var0, var1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.lang.Class var1 = null;
    java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResource("hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


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

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }
// 
// 
//     java.awt.geom.Rectangle2D var0 = null;
//     java.awt.geom.Rectangle2D var1 = null;
//     boolean var2 = org.jfree.chart.util.ShapeUtilities.intersects(var0, var1);
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)' ');
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.lang.Class var1 = null;
    java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceAsStream("hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.jfree.chart.util.ObjectUtilities.setClassLoaderSource("");

  }

  public void test28() {}
//   public void test28() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, 10.0f, (-1.0f));
// 
//   }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.io.ObjectOutputStream var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    org.jfree.chart.util.RectangleAnchor var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var2, 10.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.jfree.chart.util.ObjectUtilities.setClassLoaderSource("hi!");

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelative("hi!", var1);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.Class var1 = null;
    java.lang.Object var2 = org.jfree.chart.util.ObjectUtilities.loadAndInstantiate("", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.lang.String var0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "hi!"+ "'", var0.equals("hi!"));

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 100.0d, 100.0f, 0.0f);
// 
//   }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, (-1.0f));
// 
//   }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


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

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelative("", var1);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    java.awt.geom.Line2D var0 = null;
    java.awt.geom.Line2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)(short)0);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 100.0d, var2);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    java.awt.geom.Ellipse2D var0 = null;
    java.awt.geom.Ellipse2D var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 0.0d, var2);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    java.io.ObjectInputStream var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.text.AttributedString var1 = org.jfree.chart.util.SerialUtilities.readAttributedString(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    java.lang.Object var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
    boolean var11 = org.jfree.chart.util.ObjectUtilities.equal(var0, (java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


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

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     java.lang.Class var1 = null;
//     java.io.InputStream var2 = org.jfree.chart.util.ObjectUtilities.getResourceRelativeAsStream("hi!", var1);
// 
//   }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 10.0d, var2);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var3, 10.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    java.lang.Class var1 = null;
    java.lang.Object var2 = org.jfree.chart.util.ObjectUtilities.loadAndInstantiate("hi!", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 10.0d, var2);
// 
//   }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 10.0d, var2);
// 
//   }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 10.0f);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.lang.Object var5 = org.jfree.chart.util.ObjectUtilities.clone(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, (-1.0d), 100.0f, 10.0f);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.io.ObjectOutputStream var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var10, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 10.0f, 0.0f);
// 
//   }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     boolean var7 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)'#');
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 10.0d, 1.0f, 0.0f);
// 
//   }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var0.setShape(100, var6);
//     java.lang.Object var8 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var3 and var8
//     assertTrue("Contract failed: equals-hashcode on var3 and var8", var3.equals(var8) ? var3.hashCode() == var8.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var8.", var3.equals(var8) == var8.equals(var3));
// 
//   }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 1.0f);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    java.lang.Class var1 = null;
    java.lang.Class var2 = null;
    java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.loadAndInstantiate("hi!", var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = var1.clone();
//     java.awt.Shape var4 = var1.getShape(0);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
//     var1.setShape(100, var7);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 1.0d, 100.0f, 100.0f);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
    org.jfree.chart.util.RectangleAnchor var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var17, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 0.0d, var2);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var1 = null;
    boolean var2 = org.jfree.chart.util.ShapeUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     var0.clear();
//     java.awt.Shape var4 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var5 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, 0.0d, 1.0d);
//     var5.setShape(100, var11);
//     var5.clear();
//     java.lang.Object var14 = var5.clone();
//     var5.clear();
//     boolean var17 = var5.equals((java.lang.Object)0);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var19);
//     boolean var21 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var5, (java.lang.Object)var20);
//     int var22 = var5.size();
//     boolean var23 = var0.equals((java.lang.Object)var22);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     var0.setShape(0, var27);
//     
//     // Checks the contract:  equals-hashcode on var5 and var0
//     assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var5 and var0.", var5.equals(var0) == var0.equals(var5));
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 1.0d, 1.0f, (-1.0f));
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)100.0d);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    java.lang.Class var1 = null;
    java.lang.Class var2 = null;
    java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.loadAndInstantiate("", var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 100.0f);
// 
//   }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     org.jfree.chart.util.ShapeList var29 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 0.0d, 1.0f, 10.0f);
//     boolean var36 = var29.equals((java.lang.Object)var31);
//     java.awt.Shape var37 = null;
//     boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var31, var37);
//     var0.setShape(0, var37);
//     
//     // Checks the contract:  equals-hashcode on var0 and var17
//     assertTrue("Contract failed: equals-hashcode on var0 and var17", var0.equals(var17) ? var0.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var0 and var29
//     assertTrue("Contract failed: equals-hashcode on var0 and var29", var0.equals(var29) ? var0.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var0
//     assertTrue("Contract failed: equals-hashcode on var29 and var0", var29.equals(var0) ? var29.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 1.0d, (-1.0f), 0.0f);
// 
//   }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 1.0d, var2);
// 
//   }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = null;
//     var0.setShape(0, var12);
//     java.lang.Object var14 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var14
//     assertTrue("Contract failed: equals-hashcode on var9 and var14", var9.equals(var14) ? var9.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var9
//     assertTrue("Contract failed: equals-hashcode on var14 and var9", var14.equals(var9) ? var14.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    var0.setShape(100, var6);
    java.io.ObjectOutputStream var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var6, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var13, 1.0d, 0.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     int var11 = var1.size();
//     java.awt.Shape var13 = var1.getShape(0);
//     boolean var15 = var1.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var16 = var1.clone();
//     int var17 = var1.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     var18.clear();
//     int var27 = var18.size();
//     boolean var28 = var1.equals((java.lang.Object)var27);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, (-1.0d), 100.0d);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var30, var32);
//     boolean var37 = var1.equals((java.lang.Object)var32);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 10.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var32, 0.0d, (-1.0f), 1.0f);
// 
//   }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     java.awt.geom.Line2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(var0, 0.0f);
// 
//   }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
//     boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var0.setShape(0, var20);
//     java.lang.Object var22 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var22
//     assertTrue("Contract failed: equals-hashcode on var9 and var22", var9.equals(var22) ? var9.hashCode() == var22.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var22.", var9.equals(var22) == var22.equals(var9));
// 
//   }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, (-1.0f), 100.0f);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 100.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, (-1.0d), var2);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    var1.setShape(100, var7);
    var1.clear();
    java.lang.Object var10 = var1.clone();
    var1.clear();
    boolean var13 = var1.equals((java.lang.Object)0);
    boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var1);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
    boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setShape((-1), var22);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.io.ObjectOutputStream var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var20);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 10.0d, 0.0d);
    java.io.ObjectOutputStream var40 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var39, var40);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     var14.setShape(100, var20);
//     var14.clear();
//     java.lang.Object var23 = var14.clone();
//     int var24 = var14.size();
//     java.awt.Shape var26 = var14.getShape(0);
//     boolean var28 = var14.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var29 = var14.clone();
//     int var30 = var14.size();
//     org.jfree.chart.util.ShapeList var31 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, 0.0d, 1.0d);
//     var31.setShape(100, var37);
//     var31.clear();
//     int var40 = var31.size();
//     boolean var41 = var14.equals((java.lang.Object)var40);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, (-1.0d), 100.0d);
//     boolean var49 = org.jfree.chart.util.ShapeUtilities.equal(var43, var45);
//     boolean var50 = var14.equals((java.lang.Object)var45);
//     java.lang.Object var51 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var45);
//     var0.setShape(10, var45);
//     
//     // Checks the contract:  equals-hashcode on var14 and var0
//     assertTrue("Contract failed: equals-hashcode on var14 and var0", var14.equals(var0) ? var14.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var0
//     assertTrue("Contract failed: equals-hashcode on var31 and var0", var31.equals(var0) ? var31.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var0.", var14.equals(var0) == var0.equals(var14));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var31 and var0.", var31.equals(var0) == var0.equals(var31));
// 
//   }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.lang.Object var20 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var4);
    java.io.ObjectOutputStream var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var4, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
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

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, (-1.0d), 100.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 0.0d, (-1.0f), 10.0f);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var2, var13);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var13, (-1.0d), 10.0f, 0.0f);
// 
//   }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     var13.setShape(100, var19);
//     var13.clear();
//     java.awt.Shape var23 = var13.getShape((-1));
//     int var24 = var13.size();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var27, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, (-1.0d), 100.0d);
//     boolean var41 = org.jfree.chart.util.ShapeUtilities.equal(var27, var37);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.rotateShape(var37, (-1.0d), 1.0f, 10.0f);
//     var13.setShape(0, var37);
//     boolean var47 = var0.equals((java.lang.Object)var37);
//     
//     // Checks the contract:  equals-hashcode on var0 and var13
//     assertTrue("Contract failed: equals-hashcode on var0 and var13", var0.equals(var13) ? var0.hashCode() == var13.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var13.", var0.equals(var13) == var13.equals(var0));
// 
//   }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, (-1.0d), var2);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, var4, 0.0d, 0.0d);
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

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var23, 100.0d, 0.0f, 1.0f);
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var8 = null;
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var1, var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(0.0d, 100.0d, var2);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var3);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, (-1.0d), 100.0d);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var3, var13);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, (-1.0d), 1.0f, 10.0f);
    boolean var22 = org.jfree.chart.util.ShapeUtilities.equal(var1, var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, (-1.0f), 10.0f);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var1, var12);
    org.jfree.chart.util.RectangleAnchor var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var18, 100.0d, 100.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test104() {}
//   public void test104() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape((-1));
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     var0.setShape(100, var14);
//     org.jfree.chart.util.ShapeList var16 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
//     var16.setShape(100, var22);
//     var16.clear();
//     int var25 = var16.size();
//     java.lang.Object var26 = null;
//     boolean var27 = var16.equals(var26);
//     boolean var28 = var0.equals((java.lang.Object)var16);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
// 
//   }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, (-1.0d));
    java.io.ObjectOutputStream var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var22, var23);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(100);
    org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    java.lang.Object var6 = var3.clone();
    boolean var7 = var0.equals((java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var7);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     java.lang.Object var2 = var0.clone();
//     org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 0.0d, 1.0f, 10.0f);
//     boolean var10 = var3.equals((java.lang.Object)var5);
//     java.awt.Shape var12 = var3.getShape((-1));
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, 0.0d, 1.0d);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, (-1.0d), 100.0d);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, 0.0d, (-1.0f), 10.0f);
//     boolean var31 = org.jfree.chart.util.ShapeUtilities.equal(var15, var26);
//     var3.setShape(101, var26);
//     boolean var33 = var0.equals((java.lang.Object)var3);
//     
//     // Checks the contract:  equals-hashcode on var0 and var3
//     assertTrue("Contract failed: equals-hashcode on var0 and var3", var0.equals(var3) ? var0.hashCode() == var3.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var3.", var0.equals(var3) == var3.equals(var0));
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var1);
    org.jfree.chart.util.RectangleAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var4, 0.0d, 0.0d);
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

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var13, 100.0d, 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var6, var12);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var14, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape((-1));
//     java.awt.Shape var12 = var0.getShape((-1));
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     var13.setShape(100, var19);
//     var13.clear();
//     int var22 = var13.size();
//     int var23 = var13.size();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var13.setShape(0, var27);
//     int var29 = var13.size();
//     boolean var30 = var0.equals((java.lang.Object)var29);
//     
//     // Checks the contract:  equals-hashcode on var0 and var13
//     assertTrue("Contract failed: equals-hashcode on var0 and var13", var0.equals(var13) ? var0.hashCode() == var13.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var13.", var0.equals(var13) == var13.equals(var0));
// 
//   }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 10.0d, var2);
// 
//   }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 0.0d, 100.0f, 10.0f);
// 
//   }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     int var1 = var0.size();
//     boolean var3 = var0.equals((java.lang.Object)100.0d);
//     boolean var5 = var0.equals((java.lang.Object)(-1));
//     org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var8 = var6.getShape(0);
//     var6.clear();
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 1.0d);
//     var6.setShape(1, var12);
//     java.lang.Object var20 = var6.clone();
//     boolean var21 = var0.equals(var20);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var6.", var0.equals(var6) == var6.equals(var0));
// 
//   }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 0.0f, 10.0f);
// 
//   }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape((-1));
    java.awt.Shape var12 = var0.getShape((-1));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, (-1.0d), 100.0d);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var18, 0.0d, (-1.0f), 10.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 100.0d, var2);
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     java.lang.Object var12 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var10);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var7, var10);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var10, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 10.0d, 10.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, var24, 0.0d, 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var13, (-1.0d), 100.0f, 10.0f);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var13, 0.0d, 0.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 10.0f, 10.0f);
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
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

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(10.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, 100.0f, 1.0f);
// 
//   }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     var0.clear();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 0.0d);
//     var0.setShape(0, var19);
//     java.lang.Object var21 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var21
//     assertTrue("Contract failed: equals-hashcode on var9 and var21", var9.equals(var21) ? var9.hashCode() == var21.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var21.", var9.equals(var21) == var21.equals(var9));
// 
//   }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, (-1.0d), 100.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 0.0d, (-1.0f), 10.0f);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var2, var13);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var21, 100.0d, 10.0f, (-1.0f));
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var7, (-1.0d), 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 100.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 100.0d, 10.0f, 10.0f);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    var0.setShape(100, var6);
    org.jfree.chart.util.RectangleAnchor var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var8, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.io.ObjectOutputStream var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var7, var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, 1.0d, (-1.0f), 10.0f);
// 
//   }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 0.0d, var2);
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     int var11 = var1.size();
//     java.awt.Shape var13 = var1.getShape(0);
//     boolean var15 = var1.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var16 = var1.clone();
//     int var17 = var1.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     var18.clear();
//     int var27 = var18.size();
//     boolean var28 = var1.equals((java.lang.Object)var27);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, (-1.0d), 100.0d);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var30, var32);
//     boolean var37 = var1.equals((java.lang.Object)var32);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 10.0d, 0.0d);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.rotateShape(var32, 1.0d, (-1.0f), (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var44, (-1.0d), 0.0f, 0.0f);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, (-1.0d));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 10.0d, 1.0d);
    java.io.ObjectOutputStream var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var8, var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    org.jfree.chart.util.RectangleAnchor var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var20, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), (-1.0d));
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.awt.Shape var29 = var0.getShape(1);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
//     var0.setShape(100, var33);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var0.", var17.equals(var0) == var0.equals(var17));
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var7, (-1.0d), 0.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 1.0d, 0.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.io.ObjectOutputStream var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var16, var17);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.lang.Object var13 = var0.clone();
    java.lang.Object var14 = org.jfree.chart.util.ObjectUtilities.clone(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)"");
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeList var5 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, 0.0d, 1.0d);
//     var5.setShape(100, var11);
//     var5.clear();
//     int var14 = var5.size();
//     boolean var15 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var4, (java.lang.Object)var14);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var4, 1.0d, 0.0f, 0.0f);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 10.0d, var2);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 10.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var40 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, var40, 0.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 10.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var21, 0.0d, (-1.0f), 1.0f);
// 
//   }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var0.setShape(100, var6);
//     java.lang.Object var8 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var3 and var8
//     assertTrue("Contract failed: equals-hashcode on var3 and var8", var3.equals(var8) ? var3.hashCode() == var8.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var8.", var3.equals(var8) == var8.equals(var3));
// 
//   }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var4 = null;
//     boolean var5 = var3.equals(var4);
//     java.lang.Object var6 = var3.clone();
//     boolean var7 = var0.equals((java.lang.Object)var3);
//     org.jfree.chart.util.ShapeList var8 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var10 = var8.getShape(0);
//     var8.clear();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var8.setShape(1, var14);
//     java.lang.Object var22 = var8.clone();
//     boolean var23 = var0.equals(var22);
//     
//     // Checks the contract:  equals-hashcode on var0 and var8
//     assertTrue("Contract failed: equals-hashcode on var0 and var8", var0.equals(var8) ? var0.hashCode() == var8.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var8
//     assertTrue("Contract failed: equals-hashcode on var3 and var8", var3.equals(var8) ? var3.hashCode() == var8.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var8.", var0.equals(var8) == var8.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var8.", var3.equals(var8) == var8.equals(var3));
//     
//     // Checks the contract:  equals-hashcode on var6 and var22
//     assertTrue("Contract failed: equals-hashcode on var6 and var22", var6.equals(var22) ? var6.hashCode() == var22.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var6 and var22.", var6.equals(var22) == var22.equals(var6));
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var19);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 0.0d, (-1.0f), 10.0f);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = var0.getShape(100);
    var0.clear();
    org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    var11.setShape(100, var17);
    var11.clear();
    java.lang.Object var20 = var11.clone();
    var11.clear();
    int var22 = var11.size();
    boolean var23 = var0.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape((-1));
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var11.setShape(100, var17);
//     var11.clear();
//     java.lang.Object var20 = var11.clone();
//     int var21 = var11.size();
//     java.awt.Shape var23 = var11.getShape(0);
//     boolean var25 = var11.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var26 = var11.clone();
//     int var27 = var11.size();
//     org.jfree.chart.util.ShapeList var28 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     var28.setShape(100, var34);
//     var28.clear();
//     int var37 = var28.size();
//     boolean var38 = var11.equals((java.lang.Object)var37);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, (-1.0d), 100.0d);
//     boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var40, var42);
//     boolean var47 = var11.equals((java.lang.Object)var42);
//     java.lang.Object var48 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var42);
//     boolean var49 = var0.equals(var48);
//     org.jfree.chart.util.ShapeList var50 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, 0.0d, 1.0d);
//     var50.setShape(100, var56);
//     var50.clear();
//     java.lang.Object var59 = var50.clone();
//     var50.clear();
//     boolean var62 = var50.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var63 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var69 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 0.0d, 1.0d);
//     var63.setShape(100, var69);
//     var63.clear();
//     java.lang.Object var72 = var63.clone();
//     var63.clear();
//     boolean var75 = var63.equals((java.lang.Object)0);
//     java.lang.Object var76 = var63.clone();
//     boolean var77 = var50.equals((java.lang.Object)var63);
//     java.awt.Shape var79 = var50.getShape(100);
//     boolean var80 = var0.equals((java.lang.Object)var50);
//     java.awt.Shape var84 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var0.setShape(0, var84);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var0
//     assertTrue("Contract failed: equals-hashcode on var28 and var0", var28.equals(var0) ? var28.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var0
//     assertTrue("Contract failed: equals-hashcode on var50 and var0", var50.equals(var0) ? var50.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var63 and var0
//     assertTrue("Contract failed: equals-hashcode on var63 and var0", var63.equals(var0) ? var63.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var0.", var11.equals(var0) == var0.equals(var11));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var28 and var0.", var28.equals(var0) == var0.equals(var28));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var50 and var0.", var50.equals(var0) == var0.equals(var50));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var63 and var0.", var63.equals(var0) == var0.equals(var63));
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    var1.setShape(100, var7);
    var1.clear();
    java.awt.Shape var11 = var1.getShape((-1));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    var1.setShape(100, var15);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var0, var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
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

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
//     boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var0.setShape(0, var20);
//     var0.clear();
//     java.lang.Object var23 = var0.clone();
//     var0.clear();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, (-1.0d), 100.0d);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.rotateShape(var33, 1.0d, 10.0f, (-1.0f));
//     var0.setShape(10, var33);
//     java.lang.Object var39 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var39
//     assertTrue("Contract failed: equals-hashcode on var9 and var39", var9.equals(var39) ? var9.hashCode() == var39.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var39
//     assertTrue("Contract failed: equals-hashcode on var23 and var39", var23.equals(var39) ? var23.hashCode() == var39.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var39.", var9.equals(var39) == var39.equals(var9));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var23 and var39.", var23.equals(var39) == var39.equals(var23));
// 
//   }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.io.ObjectOutputStream var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 0.0d);
    java.io.ObjectOutputStream var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 100.0d, (-1.0f), 1.0f);
// 
//   }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    boolean var7 = var0.equals((java.lang.Object)var6);
    org.jfree.chart.util.RectangleAnchor var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var8, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     org.jfree.chart.util.ShapeList var15 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var17 = var15.getShape(0);
//     var15.clear();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, (-1.0d), 100.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var15.setShape(1, var21);
//     java.lang.Object var29 = var15.clone();
//     boolean var30 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, var29);
//     
//     // Checks the contract:  equals-hashcode on var0 and var15
//     assertTrue("Contract failed: equals-hashcode on var0 and var15", var0.equals(var15) ? var0.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var0
//     assertTrue("Contract failed: equals-hashcode on var15 and var0", var15.equals(var0) ? var15.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var29
//     assertTrue("Contract failed: equals-hashcode on var14 and var29", var14.equals(var29) ? var14.hashCode() == var29.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var29 and var14
//     assertTrue("Contract failed: equals-hashcode on var29 and var14", var29.equals(var14) ? var29.hashCode() == var14.hashCode() : true);
// 
//   }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 1.0d, (-1.0f), 1.0f);
// 
//   }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = var0.getShape((-1));
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 1.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, (-1.0d), 100.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 0.0d, (-1.0f), 10.0f);
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var12, var23);
    var0.setShape(101, var23);
    org.jfree.chart.util.ShapeList var30 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var33, 0.0d, 1.0d);
    var30.setShape(100, var36);
    boolean var38 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)101, (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(10.0f);
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

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    var0.setShape(0, var20);
    var0.clear();
    java.lang.Object var23 = var0.clone();
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 10.0f);
    var0.setShape(0, var27);
    java.awt.Shape var30 = var0.getShape(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    java.io.ObjectOutputStream var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var9, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)var9);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var9, var17);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var21, var31);
    boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var17, var21);
    org.jfree.chart.util.RectangleAnchor var37 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, var37, 1.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


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

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var11, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     int var1 = var0.size();
//     boolean var3 = var0.equals((java.lang.Object)100.0d);
//     boolean var5 = var0.equals((java.lang.Object)(-1));
//     org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var7 = null;
//     boolean var8 = var6.equals(var7);
//     java.lang.Object var9 = var6.clone();
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var6.setShape(100, var12);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 100.0d, 10.0d);
//     boolean var17 = var0.equals((java.lang.Object)10.0d);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var6.", var0.equals(var6) == var6.equals(var0));
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = var0.getShape((-1));
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 1.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, (-1.0d), 100.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 0.0d, (-1.0f), 10.0f);
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var12, var23);
    var0.setShape(101, var23);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 1.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var33 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, var33, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    boolean var7 = var0.equals((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var7);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    java.awt.Shape var11 = null;
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 0.0d, 1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    java.lang.Object var0 = null;
    java.lang.Object var1 = null;
    boolean var2 = org.jfree.chart.util.ObjectUtilities.equal(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    var0.clear();
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 10.0d, (-1.0d));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, 10.0d, 1.0d);
    boolean var12 = var0.equals((java.lang.Object)var8);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, var13, 1.0d, 100.0d);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
//     boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var0.setShape(0, var20);
//     java.awt.Shape var23 = var0.getShape((-1));
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     boolean var27 = var0.equals((java.lang.Object)1.0f);
//     java.lang.Object var28 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var28
//     assertTrue("Contract failed: equals-hashcode on var9 and var28", var9.equals(var28) ? var9.hashCode() == var28.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var28.", var9.equals(var28) == var28.equals(var9));
// 
//   }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     var0.clear();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 0.0d);
//     var0.setShape(0, var19);
//     org.jfree.chart.util.ShapeList var21 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 0.0d, 1.0f, 10.0f);
//     boolean var28 = var21.equals((java.lang.Object)var23);
//     java.awt.Shape var30 = var21.getShape(100);
//     var21.clear();
//     org.jfree.chart.util.ShapeList var32 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var35, 0.0d, 1.0d);
//     var32.setShape(100, var38);
//     var32.clear();
//     java.lang.Object var41 = var32.clone();
//     var32.clear();
//     boolean var44 = var32.equals((java.lang.Object)0);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var46);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var49, 0.0d, 1.0d);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.clone(var49);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.rotateShape(var49, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var59, (-1.0d), 100.0d);
//     boolean var63 = org.jfree.chart.util.ShapeUtilities.equal(var49, var59);
//     boolean var64 = org.jfree.chart.util.ShapeUtilities.equal(var47, var49);
//     boolean var65 = var32.equals((java.lang.Object)var64);
//     java.lang.Object var66 = var32.clone();
//     boolean var67 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var21, var66);
//     boolean var68 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var67);
//     
//     // Checks the contract:  equals-hashcode on var21 and var0
//     assertTrue("Contract failed: equals-hashcode on var21 and var0", var21.equals(var0) ? var21.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var32 and var0
//     assertTrue("Contract failed: equals-hashcode on var32 and var0", var32.equals(var0) ? var32.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var21 and var0.", var21.equals(var0) == var0.equals(var21));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var32 and var0.", var32.equals(var0) == var0.equals(var32));
// 
//   }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var4 = null;
//     boolean var5 = var3.equals(var4);
//     java.lang.Object var6 = var3.clone();
//     boolean var7 = var0.equals((java.lang.Object)var3);
//     java.lang.Object var8 = var3.clone();
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.rotateShape(var16, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 100.0d, 1.0d);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 1.0d, 0.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var30);
//     boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var14, var30);
//     var3.setShape(100, var30);
//     
//     // Checks the contract:  equals-hashcode on var0 and var3
//     assertTrue("Contract failed: equals-hashcode on var0 and var3", var0.equals(var3) ? var0.hashCode() == var3.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var3.", var0.equals(var3) == var3.equals(var0));
// 
//   }

  public void test181() {}
//   public void test181() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 0.0d, var2);
// 
//   }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 10.0f, 0.0f);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    int var10 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    var0.setShape(0, var14);
    java.awt.Shape var17 = var0.getShape(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.io.ObjectOutputStream var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 1.0d, 10.0f, (-1.0f));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 1.0d, 0.0f, 1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)0.0f);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape(0);
//     org.jfree.chart.util.ShapeList var12 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 0.0d, 1.0f, 10.0f);
//     boolean var19 = var12.equals((java.lang.Object)var14);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     boolean var22 = var12.equals((java.lang.Object)var21);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 0.0d);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var25);
//     var0.setShape(1, var26);
//     
//     // Checks the contract:  equals-hashcode on var12 and var0
//     assertTrue("Contract failed: equals-hashcode on var12 and var0", var12.equals(var0) ? var12.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var12 and var0.", var12.equals(var0) == var0.equals(var12));
// 
//   }

  public void test187() {}
//   public void test187() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 100.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 100.0d, (-1.0f), 10.0f);
// 
//   }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.lang.Object var5 = var0.clone();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     var0.setShape(0, var10);
//     java.awt.Shape var14 = var0.getShape(10);
//     java.awt.Shape var16 = var0.getShape((-1));
//     int var17 = var0.size();
//     java.lang.Object var18 = var0.clone();
//     org.jfree.chart.util.ShapeList var19 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var20 = null;
//     boolean var21 = var19.equals(var20);
//     java.lang.Object var22 = var19.clone();
//     java.lang.Object var23 = var19.clone();
//     java.lang.Object var24 = var19.clone();
//     java.lang.Object var25 = var19.clone();
//     boolean var26 = var0.equals(var25);
//     
//     // Checks the contract:  equals-hashcode on var19 and var0
//     assertTrue("Contract failed: equals-hashcode on var19 and var0", var19.equals(var0) ? var19.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var19 and var0.", var19.equals(var0) == var0.equals(var19));
//     
//     // Checks the contract:  equals-hashcode on var22 and var18
//     assertTrue("Contract failed: equals-hashcode on var22 and var18", var22.equals(var18) ? var22.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var18
//     assertTrue("Contract failed: equals-hashcode on var23 and var18", var23.equals(var18) ? var23.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var18
//     assertTrue("Contract failed: equals-hashcode on var24 and var18", var24.equals(var18) ? var24.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var25 and var18
//     assertTrue("Contract failed: equals-hashcode on var25 and var18", var25.equals(var18) ? var25.hashCode() == var18.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var22 and var18.", var22.equals(var18) == var18.equals(var22));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var23 and var18.", var23.equals(var18) == var18.equals(var23));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var24 and var18.", var24.equals(var18) == var18.equals(var24));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var25 and var18.", var25.equals(var18) == var18.equals(var25));
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1.0d);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    int var1 = var0.size();
    boolean var3 = var0.equals((java.lang.Object)100.0d);
    java.awt.Shape var5 = var0.getShape(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, (-1.0d));
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, (-1.0d), 0.0f, 0.0f);
// 
//   }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 100.0f, (-1.0f));
// 
//   }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, (-1.0d), 10.0f, 100.0f);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    int var18 = var17.size();
    boolean var19 = var0.equals((java.lang.Object)var18);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var21, var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 0.0d, (-1.0d));
    boolean var43 = var0.equals((java.lang.Object)var39);
    java.lang.Object var44 = null;
    boolean var45 = var0.equals(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.io.ObjectOutputStream var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
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

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }
// 
// 
//     java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
//     boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var11.setShape(100, var17);
//     var11.clear();
//     java.lang.Object var20 = var11.clone();
//     int var21 = var11.size();
//     java.awt.Shape var23 = var11.getShape(0);
//     boolean var25 = var11.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var26 = var11.clone();
//     int var27 = var11.size();
//     org.jfree.chart.util.ShapeList var28 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     var28.setShape(100, var34);
//     var28.clear();
//     int var37 = var28.size();
//     boolean var38 = var11.equals((java.lang.Object)var37);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, (-1.0d), 100.0d);
//     boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var40, var42);
//     boolean var47 = var11.equals((java.lang.Object)var42);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 10.0d, 0.0d);
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.rotateShape(var42, 1.0d, (-1.0f), (-1.0f));
//     boolean var55 = org.jfree.chart.util.ShapeUtilities.equal(var10, var54);
//     org.jfree.chart.util.ShapeList var56 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var57 = null;
//     boolean var58 = var56.equals(var57);
//     java.lang.Object var59 = var56.clone();
//     java.lang.Object var60 = var56.clone();
//     java.awt.Shape var63 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.rotateShape(var63, 0.0d, 1.0f, 10.0f);
//     var56.setShape(1, var63);
//     java.awt.Shape var71 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var63, 10.0d, 0.0d);
//     boolean var72 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var10, (java.lang.Object)10.0d);
//     
//     // Checks the contract:  equals-hashcode on var11 and var56
//     assertTrue("Contract failed: equals-hashcode on var11 and var56", var11.equals(var56) ? var11.hashCode() == var56.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var56
//     assertTrue("Contract failed: equals-hashcode on var28 and var56", var28.equals(var56) ? var28.hashCode() == var56.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var56.", var11.equals(var56) == var56.equals(var11));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var28 and var56.", var28.equals(var56) == var56.equals(var28));
// 
//   }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 1.0d, var2);
// 
//   }

  public void test201() {}
//   public void test201() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(100);
//     java.awt.Shape var4 = var0.getShape(10);
//     java.lang.Object var5 = var0.clone();
//     org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var8, 0.0d, 1.0f, 10.0f);
//     boolean var13 = var6.equals((java.lang.Object)var8);
//     java.awt.Shape var15 = var6.getShape((-1));
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 0.0d, 1.0d);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, (-1.0d), 100.0d);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.rotateShape(var29, 0.0d, (-1.0f), 10.0f);
//     boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var18, var29);
//     var6.setShape(101, var29);
//     boolean var36 = var0.equals((java.lang.Object)101);
//     
//     // Checks the contract:  equals-hashcode on var0 and var6
//     assertTrue("Contract failed: equals-hashcode on var0 and var6", var0.equals(var6) ? var0.hashCode() == var6.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var6.", var0.equals(var6) == var6.equals(var0));
// 
//   }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    var3.setShape(100, var9);
    var3.clear();
    int var12 = var3.size();
    java.lang.Object var13 = null;
    boolean var14 = var3.equals(var13);
    java.awt.Shape var16 = var3.getShape(1);
    boolean var17 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
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
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     var0.setShape(0, var10);
//     java.lang.Object var13 = var0.clone();
//     boolean var15 = var0.equals((java.lang.Object)0.0d);
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     java.awt.Shape var27 = var17.getShape((-1));
//     int var28 = var17.size();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.clone(var31);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var41, (-1.0d), 100.0d);
//     boolean var45 = org.jfree.chart.util.ShapeUtilities.equal(var31, var41);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.rotateShape(var41, (-1.0d), 1.0f, 10.0f);
//     var17.setShape(0, var41);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.clone(var41);
//     var0.setShape(100, var41);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var0.", var17.equals(var0) == var0.equals(var17));
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, (-1.0f), 10.0f);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var1, var12);
    java.io.ObjectOutputStream var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var12, var18);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.awt.Shape var14 = var0.getShape(10);
    java.awt.Shape var16 = var0.getShape((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)(-1));
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape((-1));
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     var0.setShape(100, var14);
//     org.jfree.chart.util.ShapeList var16 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var18, 0.0d, 1.0f, 10.0f);
//     boolean var23 = var16.equals((java.lang.Object)var18);
//     boolean var24 = var0.equals((java.lang.Object)var23);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
    var13.setShape(100, var19);
    var13.clear();
    java.lang.Object var22 = var13.clone();
    var13.clear();
    boolean var25 = var13.equals((java.lang.Object)0);
    java.lang.Object var26 = var13.clone();
    boolean var27 = var0.equals((java.lang.Object)var13);
    java.lang.Object var28 = var13.clone();
    org.jfree.chart.util.ShapeList var29 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 0.0d, 1.0d);
    var29.setShape(100, var35);
    var29.clear();
    java.awt.Shape var39 = var29.getShape((-1));
    org.jfree.chart.util.ShapeList var40 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var43, 0.0d, 1.0d);
    var40.setShape(100, var46);
    var40.clear();
    java.lang.Object var49 = var40.clone();
    int var50 = var40.size();
    java.awt.Shape var52 = var40.getShape(0);
    boolean var54 = var40.equals((java.lang.Object)(short)(-1));
    java.lang.Object var55 = var40.clone();
    int var56 = var40.size();
    org.jfree.chart.util.ShapeList var57 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var63 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var60, 0.0d, 1.0d);
    var57.setShape(100, var63);
    var57.clear();
    int var66 = var57.size();
    boolean var67 = var40.equals((java.lang.Object)var66);
    java.awt.Shape var69 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var71 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var74 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var71, (-1.0d), 100.0d);
    boolean var75 = org.jfree.chart.util.ShapeUtilities.equal(var69, var71);
    boolean var76 = var40.equals((java.lang.Object)var71);
    java.lang.Object var77 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var71);
    boolean var78 = var29.equals(var77);
    boolean var79 = var13.equals(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    var0.clear();
    java.awt.Shape var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 1.0d, 10.0f, (-1.0f));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 1.0d, 0.0f, 1.0f);
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var16);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
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

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     var0.clear();
//     org.jfree.chart.util.ShapeList var4 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 1.0d);
//     var4.setShape(100, var10);
//     var4.clear();
//     java.lang.Object var13 = var4.clone();
//     int var14 = var4.size();
//     java.awt.Shape var16 = var4.getShape(0);
//     boolean var18 = var4.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var19 = var4.clone();
//     int var20 = var4.size();
//     org.jfree.chart.util.ShapeList var21 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 0.0d, 1.0d);
//     var21.setShape(100, var27);
//     var21.clear();
//     int var30 = var21.size();
//     boolean var31 = var4.equals((java.lang.Object)var30);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var35, (-1.0d), 100.0d);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var33, var35);
//     boolean var40 = var4.equals((java.lang.Object)var35);
//     var0.setShape(10, var35);
//     
//     // Checks the contract:  equals-hashcode on var4 and var0
//     assertTrue("Contract failed: equals-hashcode on var4 and var0", var4.equals(var0) ? var4.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var21 and var0
//     assertTrue("Contract failed: equals-hashcode on var21 and var0", var21.equals(var0) ? var21.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var4 and var0.", var4.equals(var0) == var0.equals(var4));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var21 and var0.", var21.equals(var0) == var0.equals(var21));
// 
//   }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, (-1.0d), 100.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 10.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 0.0d, 1.0f, 10.0f);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 10.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.io.ObjectOutputStream var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 0.0f);
    java.io.ObjectOutputStream var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 1.0d, 0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, 1.0d, var2);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.lang.Object var13 = var0.clone();
    java.awt.Shape var15 = var0.getShape(100);
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 1.0d, 0.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    org.jfree.chart.util.RectangleAnchor var18 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var18, 10.0d, 100.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 1.0d, 10.0f, (-1.0f));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 100.0d, 100.0f, (-1.0f));
    java.lang.Object var16 = null;
    boolean var17 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1.0f), var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    var0.clear();
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = org.jfree.chart.util.ObjectUtilities.clone(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    boolean var2 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)1.0d, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 100.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 100.0d, 10.0f, 1.0f);
// 
//   }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, (-1.0f), 1.0f);
//     org.jfree.chart.util.ShapeList var10 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, 1.0f, 10.0f);
//     boolean var17 = var10.equals((java.lang.Object)var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     boolean var20 = var10.equals((java.lang.Object)var19);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 0.0d);
//     boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var2, var19);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 100.0d, 1.0f, (-1.0f));
// 
//   }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 100.0d, 100.0f, 100.0f);
// 
//   }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, (-1.0d), var2);
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 100.0f, 100.0f);
    java.io.ObjectOutputStream var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
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

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     org.jfree.chart.util.ShapeList var16 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var17 = var16.clone();
//     var16.clear();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 10.0d, (-1.0d));
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var20);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 10.0d, 1.0d);
//     boolean var28 = var16.equals((java.lang.Object)var24);
//     var0.setShape(1, var24);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    var0.clear();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    var0.setShape(1, var6);
    java.lang.Object var14 = var0.clone();
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 100.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 1.0d, 10.0f, (-1.0f));
    var0.setShape(1, var23);
    java.lang.Object var29 = var0.clone();
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.clone(var32);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var33);
    java.lang.Object var35 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var34);
    var0.setShape(101, var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var37 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)101);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 1.0d, var2);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    org.jfree.chart.util.RectangleAnchor var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, var8, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 100.0d, var2);
// 
//   }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     var0.setShape(0, var10);
//     java.awt.Shape var14 = var0.getShape(10);
//     java.lang.Object var15 = var0.clone();
//     java.lang.Object var16 = var0.clone();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var18 = null;
//     boolean var19 = var17.equals(var18);
//     java.lang.Object var20 = var17.clone();
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var17.setShape(100, var23);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 100.0d, 10.0d);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     boolean var29 = var0.equals((java.lang.Object)var28);
//     
//     // Checks the contract:  equals-hashcode on var20 and var15
//     assertTrue("Contract failed: equals-hashcode on var20 and var15", var20.equals(var15) ? var20.hashCode() == var15.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var16
//     assertTrue("Contract failed: equals-hashcode on var20 and var16", var20.equals(var16) ? var20.hashCode() == var16.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var20 and var15.", var20.equals(var15) == var15.equals(var20));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var20 and var16.", var20.equals(var16) == var16.equals(var20));
// 
//   }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), 100.0d, var2);
// 
//   }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     java.awt.Shape var3 = var0.getShape(0);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
//     var0.setShape(100, var6);
//     org.jfree.chart.util.ShapeList var9 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var10 = null;
//     boolean var11 = var9.equals(var10);
//     java.lang.Object var12 = var9.clone();
//     java.lang.Object var13 = var9.clone();
//     java.lang.Object var14 = var9.clone();
//     boolean var15 = var0.equals((java.lang.Object)var9);
//     
//     // Checks the contract:  equals-hashcode on var9 and var0
//     assertTrue("Contract failed: equals-hashcode on var9 and var0", var9.equals(var0) ? var9.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var0.", var9.equals(var0) == var0.equals(var9));
// 
//   }

  public void test237() {}
//   public void test237() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     int var10 = var0.size();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var0.setShape(0, var14);
//     int var16 = var0.size();
//     int var17 = var0.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var19 = var18.clone();
//     var18.clear();
//     java.awt.Shape var22 = var18.getShape(100);
//     org.jfree.chart.util.ShapeList var23 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 0.0d, 1.0d);
//     var23.setShape(100, var29);
//     var23.clear();
//     java.lang.Object var32 = var23.clone();
//     var23.clear();
//     boolean var35 = var23.equals((java.lang.Object)0);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var23, (java.lang.Object)var38);
//     int var40 = var23.size();
//     boolean var41 = var18.equals((java.lang.Object)var40);
//     var18.clear();
//     boolean var43 = var0.equals((java.lang.Object)var18);
//     
//     // Checks the contract:  equals-hashcode on var18 and var0
//     assertTrue("Contract failed: equals-hashcode on var18 and var0", var18.equals(var0) ? var18.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var0
//     assertTrue("Contract failed: equals-hashcode on var23 and var0", var23.equals(var0) ? var23.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var18 and var0.", var18.equals(var0) == var0.equals(var18));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var23 and var0.", var23.equals(var0) == var0.equals(var23));
// 
//   }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var2 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 1.0d);
//     var2.setShape(100, var8);
//     var2.clear();
//     java.lang.Object var11 = var2.clone();
//     var2.clear();
//     boolean var14 = var2.equals((java.lang.Object)0);
//     boolean var15 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var2);
//     java.lang.Object var16 = var2.clone();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var18 = var17.clone();
//     var17.clear();
//     boolean var20 = var2.equals((java.lang.Object)var17);
//     java.lang.Object var21 = var2.clone();
//     org.jfree.chart.util.ShapeList var22 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 0.0d, 1.0d);
//     var22.setShape(100, var28);
//     var22.clear();
//     java.lang.Object var31 = var22.clone();
//     int var32 = var22.size();
//     java.awt.Shape var34 = var22.getShape(0);
//     boolean var36 = var22.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var37 = var22.clone();
//     int var38 = var22.size();
//     org.jfree.chart.util.ShapeList var39 = new org.jfree.chart.util.ShapeList();
//     int var40 = var39.size();
//     boolean var41 = var22.equals((java.lang.Object)var40);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var43, 0.0d, 1.0d);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var43);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.rotateShape(var43, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, (-1.0d), 100.0d);
//     boolean var57 = org.jfree.chart.util.ShapeUtilities.equal(var43, var53);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.rotateShape(var53, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var61, 0.0d, (-1.0d));
//     boolean var65 = var22.equals((java.lang.Object)var61);
//     boolean var66 = var2.equals((java.lang.Object)var61);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var61, (-1.0d), 0.0f, 100.0f);
// 
//   }

  public void test239() {}
//   public void test239() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     var0.clear();
//     java.awt.Shape var4 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var5 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var7 = var5.getShape(100);
//     java.lang.Object var8 = var5.clone();
//     var5.clear();
//     boolean var10 = var0.equals((java.lang.Object)var5);
//     java.lang.Object var11 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var5);
//     int var12 = var5.size();
//     java.awt.Shape var14 = null;
//     var5.setShape(1, var14);
//     
//     // Checks the contract:  equals-hashcode on var0 and var5
//     assertTrue("Contract failed: equals-hashcode on var0 and var5", var0.equals(var5) ? var0.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var0
//     assertTrue("Contract failed: equals-hashcode on var5 and var0", var5.equals(var0) ? var5.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 0.0d, 1.0f, (-1.0f));
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, 0.0f, 10.0f);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 100.0d, 0.0f, 0.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 100.0d, 100.0d);
    java.io.ObjectOutputStream var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var25, var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var9);
//     boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)var9);
//     org.jfree.chart.util.ShapeList var15 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 0.0d, 1.0d);
//     var15.setShape(100, var21);
//     var15.clear();
//     int var24 = var15.size();
//     int var25 = var15.size();
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var15.setShape(0, var29);
//     boolean var31 = org.jfree.chart.util.ShapeUtilities.equal(var2, var29);
//     
//     // Checks the contract:  equals-hashcode on var0 and var15
//     assertTrue("Contract failed: equals-hashcode on var0 and var15", var0.equals(var15) ? var0.hashCode() == var15.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var15.", var0.equals(var15) == var15.equals(var0));
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     var0.clear();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 0.0d);
//     var0.setShape(0, var19);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 0.0d, 1.0d);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.clone(var25);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.rotateShape(var25, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var33, 100.0d, 1.0d);
//     boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var23, var33);
//     boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var19, var23);
//     org.jfree.chart.util.ShapeList var39 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 0.0d, 1.0d);
//     var39.setShape(100, var45);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.clone(var49);
//     var39.setShape(0, var49);
//     java.awt.Shape var53 = var39.getShape(10);
//     java.lang.Object var54 = var39.clone();
//     java.lang.Object var55 = var39.clone();
//     boolean var56 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var19, (java.lang.Object)var39);
//     
//     // Checks the contract:  equals-hashcode on var9 and var54
//     assertTrue("Contract failed: equals-hashcode on var9 and var54", var9.equals(var54) ? var9.hashCode() == var54.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var55
//     assertTrue("Contract failed: equals-hashcode on var9 and var55", var9.equals(var55) ? var9.hashCode() == var55.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var54.", var9.equals(var54) == var54.equals(var9));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var55.", var9.equals(var55) == var55.equals(var9));
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var13 = var11.getShape(100);
    org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var15 = null;
    boolean var16 = var14.equals(var15);
    java.lang.Object var17 = var14.clone();
    boolean var18 = var11.equals((java.lang.Object)var14);
    boolean var19 = var0.equals((java.lang.Object)var14);
    java.lang.Object var20 = null;
    boolean var21 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var19, var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    var0.setShape(100, var6);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 0.0f);
    var0.setShape(10, var11);
    java.lang.Object var13 = null;
    boolean var14 = var0.equals(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, (-1.0f), 10.0f);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var1, var12);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 10.0d, 0.0f, 10.0f);
    java.lang.Object var22 = null;
    boolean var23 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)0.0f, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 1.0d, 100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)var9);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 100.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, (-1.0f), 10.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 1.0d, (-1.0d));
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var9, var23);
    org.jfree.chart.util.RectangleAnchor var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var28, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    int var10 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    var0.setShape(0, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)0);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.lang.Object var13 = var0.clone();
    java.lang.Object var14 = null;
    boolean var15 = var0.equals(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    var0.clear();
    java.lang.Object var6 = var0.clone();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test252() {}
//   public void test252() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(1.0d, 0.0d, var2);
// 
//   }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 10.0d, 0.0d);
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 1.0d, (-1.0f), (-1.0f));
    org.jfree.chart.util.RectangleAnchor var44 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var43, var44, 1.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 10.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 1.0d);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 1.0d, 0.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 100.0d, 0.0f, 1.0f);
// 
//   }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 0.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 0.0d, 10.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var9, 0.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test258() {}
//   public void test258() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var14 = var13.clone();
//     java.lang.Object var15 = var13.clone();
//     boolean var16 = var0.equals((java.lang.Object)var13);
//     java.lang.Object var17 = var0.clone();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     java.lang.Object var29 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var27);
//     boolean var30 = org.jfree.chart.util.ShapeUtilities.equal(var24, var27);
//     org.jfree.chart.util.ShapeList var31 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var32 = null;
//     boolean var33 = var31.equals(var32);
//     java.lang.Object var34 = var31.clone();
//     java.lang.Object var35 = var31.clone();
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.rotateShape(var38, 0.0d, 1.0f, 10.0f);
//     var31.setShape(1, var38);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var38, (-1.0d), (-1.0d));
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var46);
//     boolean var48 = org.jfree.chart.util.ShapeUtilities.equal(var27, var46);
//     boolean var49 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var46);
//     
//     // Checks the contract:  equals-hashcode on var0 and var18
//     assertTrue("Contract failed: equals-hashcode on var0 and var18", var0.equals(var18) ? var0.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var0 and var31
//     assertTrue("Contract failed: equals-hashcode on var0 and var31", var0.equals(var31) ? var0.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var18
//     assertTrue("Contract failed: equals-hashcode on var13 and var18", var13.equals(var18) ? var13.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var31
//     assertTrue("Contract failed: equals-hashcode on var13 and var31", var13.equals(var31) ? var13.hashCode() == var31.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var18.", var0.equals(var18) == var18.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var31.", var0.equals(var31) == var31.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var18.", var13.equals(var18) == var18.equals(var13));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var31.", var13.equals(var31) == var31.equals(var13));
// 
//   }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 100.0d, 100.0f, 100.0f);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 100.0d, 10.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 100.0d, (-1.0d));
    java.io.ObjectOutputStream var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var6, var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.ShapeList var4 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 1.0d);
    var4.setShape(100, var10);
    var4.clear();
    int var13 = var4.size();
    boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var3, (java.lang.Object)var13);
    java.io.ObjectOutputStream var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var3, var15);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var4, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
    var13.setShape(100, var19);
    var13.clear();
    java.lang.Object var22 = var13.clone();
    var13.clear();
    boolean var25 = var13.equals((java.lang.Object)0);
    java.lang.Object var26 = var13.clone();
    boolean var27 = var0.equals((java.lang.Object)var13);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var33, 0.0d, 1.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.clone(var33);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.rotateShape(var33, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var41, 100.0d, 1.0d);
    boolean var45 = org.jfree.chart.util.ShapeUtilities.equal(var31, var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 10.0d, 0.0f, (-1.0f));
// 
//   }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 1.0d);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 1.0d, 0.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 10.0d, 1.0f, 1.0f);
// 
//   }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 100.0d, (-1.0d));
    java.lang.Object var16 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var11);
    java.io.ObjectOutputStream var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var11, var17);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     java.awt.Shape var11 = var0.getShape(10);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 10.0d, 1.0d);
//     boolean var18 = var0.equals((java.lang.Object)var17);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, 0.0d, 1.0d);
//     boolean var26 = org.jfree.chart.util.ShapeUtilities.equal(var20, var25);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, (-1.0d), 100.0d);
//     boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var28, var30);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var20, var30);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var30);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.clone(var30);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     org.jfree.chart.util.ShapeList var39 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var41 = var39.getShape(0);
//     var39.clear();
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, (-1.0d), 100.0d);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, 1.0d);
//     var39.setShape(1, var45);
//     java.lang.Object var53 = var39.clone();
//     java.awt.Shape var55 = var39.getShape(0);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var57, (-1.0d), 100.0d);
//     java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var62, 0.0d, 1.0d);
//     java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.clone(var62);
//     java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.rotateShape(var62, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var73 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var70, 100.0d, 1.0d);
//     java.awt.Shape var76 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var70, 1.0d, 0.0d);
//     java.awt.Shape var77 = org.jfree.chart.util.ShapeUtilities.clone(var76);
//     boolean var78 = org.jfree.chart.util.ShapeUtilities.equal(var60, var76);
//     boolean var79 = var39.equals((java.lang.Object)var78);
//     boolean var80 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var38, (java.lang.Object)var79);
//     java.awt.Shape var83 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var38, 100.0d, 10.0d);
//     boolean var84 = org.jfree.chart.util.ShapeUtilities.equal(var17, var83);
//     
//     // Checks the contract:  equals-hashcode on var0 and var39
//     assertTrue("Contract failed: equals-hashcode on var0 and var39", var0.equals(var39) ? var0.hashCode() == var39.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var39.", var0.equals(var39) == var39.equals(var0));
//     
//     // Checks the contract:  equals-hashcode on var9 and var53
//     assertTrue("Contract failed: equals-hashcode on var9 and var53", var9.equals(var53) ? var9.hashCode() == var53.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var53.", var9.equals(var53) == var53.equals(var9));
// 
//   }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 1.0f, 1.0f);
// 
//   }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeList var7 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var9 = var7.getShape(100);
//     java.lang.Object var10 = var7.clone();
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var13);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, (-1.0d));
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var13);
//     var7.setShape(1, var18);
//     boolean var20 = org.jfree.chart.util.ShapeUtilities.equal(var6, var18);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 10.0f, (-1.0f));
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
    java.io.ObjectOutputStream var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 100.0d, (-1.0d));
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var16);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 1.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1.0f);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var12, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, (-1.0d));
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 10.0d, 1.0f, 0.0f);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var26);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 100.0d, 0.0d);
    java.io.ObjectOutputStream var31 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var30, var31);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test278() {}
//   public void test278() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, 1.0f, 10.0f);
//     boolean var24 = var17.equals((java.lang.Object)var19);
//     boolean var25 = var0.equals((java.lang.Object)var19);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var28, 0.0d, 1.0d);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.clone(var28);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.clone(var28);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var28);
//     java.lang.Object var35 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var34);
//     var0.setShape(100, var34);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var0.", var17.equals(var0) == var0.equals(var17));
// 
//   }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var8 = var0.clone();
    int var9 = var0.size();
    org.jfree.chart.util.ShapeList var10 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, 1.0d);
    var10.setShape(100, var16);
    var10.clear();
    java.lang.Object var19 = var10.clone();
    var10.clear();
    boolean var22 = var10.equals((java.lang.Object)0);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var24);
    boolean var26 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var10, (java.lang.Object)var25);
    boolean var27 = var0.equals((java.lang.Object)var10);
    int var28 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, 100.0d, 1.0f, 1.0f);
// 
//   }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


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

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, (-1.0d), (-1.0f), 1.0f);
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 1.0f);
    boolean var5 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var1, (java.lang.Object)1.0f);
    java.io.ObjectOutputStream var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    var0.setShape(0, var20);
    var0.clear();
    java.lang.Object var23 = var0.clone();
    var0.clear();
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, (-1.0d), 100.0d);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.rotateShape(var33, 1.0d, 10.0f, (-1.0f));
    var0.setShape(10, var33);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, (-1.0f));
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, 1.0d);
    boolean var49 = org.jfree.chart.util.ShapeUtilities.equal(var43, var48);
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, (-1.0d), 100.0d);
    boolean var57 = org.jfree.chart.util.ShapeUtilities.equal(var51, var53);
    boolean var58 = org.jfree.chart.util.ShapeUtilities.equal(var43, var53);
    java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.clone(var53);
    java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.clone(var53);
    java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.rotateShape(var53, 100.0d, 0.0f, 0.0f);
    boolean var65 = org.jfree.chart.util.ShapeUtilities.equal(var41, var64);
    boolean var66 = org.jfree.chart.util.ShapeUtilities.equal(var33, var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);

  }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var0.setShape(100, var6);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 0.0f);
//     var0.setShape(10, var11);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     var13.setShape(100, var19);
//     var13.clear();
//     java.lang.Object var22 = var13.clone();
//     var13.clear();
//     boolean var25 = var13.equals((java.lang.Object)0);
//     var13.clear();
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var29, (-1.0d), 0.0d);
//     var13.setShape(0, var32);
//     boolean var34 = var0.equals((java.lang.Object)var32);
//     java.lang.Object var35 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
//     
//     // Checks the contract:  equals-hashcode on var3 and var35
//     assertTrue("Contract failed: equals-hashcode on var3 and var35", var3.equals(var35) ? var3.hashCode() == var35.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var22 and var35
//     assertTrue("Contract failed: equals-hashcode on var22 and var35", var22.equals(var35) ? var22.hashCode() == var35.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var35.", var3.equals(var35) == var35.equals(var3));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var22 and var35.", var22.equals(var35) == var35.equals(var22));
// 
//   }

  public void test286() {}
//   public void test286() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
//     boolean var36 = var0.equals((java.lang.Object)var31);
//     org.jfree.chart.util.ShapeList var37 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var38 = var37.clone();
//     var37.clear();
//     java.awt.Shape var41 = var37.getShape(100);
//     org.jfree.chart.util.ShapeList var42 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, 1.0d);
//     var42.setShape(100, var48);
//     var42.clear();
//     java.lang.Object var51 = var42.clone();
//     var42.clear();
//     boolean var54 = var42.equals((java.lang.Object)0);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.clone(var56);
//     boolean var58 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var42, (java.lang.Object)var57);
//     int var59 = var42.size();
//     boolean var60 = var37.equals((java.lang.Object)var59);
//     java.awt.Shape var62 = var37.getShape(0);
//     boolean var63 = var0.equals((java.lang.Object)var37);
//     org.jfree.chart.util.ShapeList var64 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var67, 0.0d, 1.0d);
//     var64.setShape(100, var70);
//     var64.clear();
//     java.awt.Shape var74 = var64.getShape(0);
//     boolean var75 = var37.equals((java.lang.Object)var64);
//     java.awt.Shape var77 = null;
//     var37.setShape(0, var77);
//     
//     // Checks the contract:  equals-hashcode on var0 and var37
//     assertTrue("Contract failed: equals-hashcode on var0 and var37", var0.equals(var37) ? var0.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var37
//     assertTrue("Contract failed: equals-hashcode on var17 and var37", var17.equals(var37) ? var17.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var0
//     assertTrue("Contract failed: equals-hashcode on var37 and var0", var37.equals(var0) ? var37.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var17
//     assertTrue("Contract failed: equals-hashcode on var37 and var17", var37.equals(var17) ? var37.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var42
//     assertTrue("Contract failed: equals-hashcode on var37 and var42", var37.equals(var42) ? var37.hashCode() == var42.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var37 and var64
//     assertTrue("Contract failed: equals-hashcode on var37 and var64", var37.equals(var64) ? var37.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var37
//     assertTrue("Contract failed: equals-hashcode on var42 and var37", var42.equals(var37) ? var42.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var37
//     assertTrue("Contract failed: equals-hashcode on var64 and var37", var64.equals(var37) ? var64.hashCode() == var37.hashCode() : true);
// 
//   }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var16 = var0.getShape(0);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
//     boolean var40 = var0.equals((java.lang.Object)var39);
//     var0.clear();
//     org.jfree.chart.util.ShapeList var43 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var44 = null;
//     boolean var45 = var43.equals(var44);
//     java.lang.Object var46 = var43.clone();
//     java.lang.Object var47 = var43.clone();
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.rotateShape(var50, 0.0d, 1.0f, 10.0f);
//     var43.setShape(1, var50);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, (-1.0d), (-1.0d));
//     java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.clone(var58);
//     java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.clone(var58);
//     var0.setShape(0, var60);
//     
//     // Checks the contract:  equals-hashcode on var46 and var14
//     assertTrue("Contract failed: equals-hashcode on var46 and var14", var46.equals(var14) ? var46.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var47 and var14
//     assertTrue("Contract failed: equals-hashcode on var47 and var14", var47.equals(var14) ? var47.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var46 and var14.", var46.equals(var14) == var14.equals(var46));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var47 and var14.", var47.equals(var14) == var14.equals(var47));
// 
//   }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     var0.clear();
//     java.awt.Shape var4 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var5 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var7 = var5.getShape(100);
//     java.lang.Object var8 = var5.clone();
//     var5.clear();
//     boolean var10 = var0.equals((java.lang.Object)var5);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var11.setShape(100, var17);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.clone(var20);
//     java.lang.Object var22 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var20);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var20);
//     boolean var24 = var0.equals((java.lang.Object)var20);
//     
//     // Checks the contract:  equals-hashcode on var0 and var11
//     assertTrue("Contract failed: equals-hashcode on var0 and var11", var0.equals(var11) ? var0.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var11
//     assertTrue("Contract failed: equals-hashcode on var5 and var11", var5.equals(var11) ? var5.hashCode() == var11.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var11.", var0.equals(var11) == var11.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var5 and var11.", var5.equals(var11) == var11.equals(var5));
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var38 = var0.getShape(0);
    java.lang.Object var39 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
    java.lang.Object var40 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(100);
    java.awt.Shape var4 = var0.getShape(10);
    java.lang.Object var5 = var0.clone();
    java.lang.Object var6 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.awt.Shape var14 = var0.getShape(10);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
    var0.setShape(0, var17);
    java.awt.Shape var23 = var0.getShape(100);
    java.lang.Object var24 = var0.clone();
    java.lang.Object var25 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, (-1.0d));
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 10.0d, 1.0f, 0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var27, 0.0d, 1.0f, 0.0f);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.lang.Object var13 = var0.clone();
    boolean var15 = var0.equals((java.lang.Object)0.0d);
    java.awt.Shape var17 = var0.getShape(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle((-1.0d), (-1.0d), var2);
// 
//   }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, (-1.0d));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 10.0d, 1.0d);
    java.io.ObjectOutputStream var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var5, var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 1.0d, 0.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
    java.io.ObjectOutputStream var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var16, var20);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
    var13.setShape(100, var19);
    var13.clear();
    java.lang.Object var22 = var13.clone();
    var13.clear();
    boolean var25 = var13.equals((java.lang.Object)0);
    java.lang.Object var26 = var13.clone();
    boolean var27 = var0.equals((java.lang.Object)var13);
    org.jfree.chart.util.ShapeList var28 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var29 = var28.clone();
    var28.clear();
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 10.0d, (-1.0d));
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var32);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, 10.0d, 1.0d);
    boolean var40 = var28.equals((java.lang.Object)var36);
    boolean var41 = var0.equals((java.lang.Object)var28);
    var28.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test298() {}
//   public void test298() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var19);
//     org.jfree.chart.util.ShapeList var21 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var23 = var21.getShape(0);
//     var21.clear();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, (-1.0d), 100.0d);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     var21.setShape(1, var27);
//     java.lang.Object var35 = var21.clone();
//     java.awt.Shape var37 = var21.getShape(0);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, (-1.0d), 100.0d);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var44, 0.0d, 1.0d);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.clone(var44);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.rotateShape(var44, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 100.0d, 1.0d);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 1.0d, 0.0d);
//     java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.clone(var58);
//     boolean var60 = org.jfree.chart.util.ShapeUtilities.equal(var42, var58);
//     boolean var61 = var21.equals((java.lang.Object)var60);
//     boolean var62 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var20, (java.lang.Object)var61);
//     java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var65, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     var1.clear();
//     boolean var13 = var1.equals((java.lang.Object)0);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     boolean var17 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var1, (java.lang.Object)var16);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var1.setShape(0, var21);
//     var1.clear();
//     java.lang.Object var24 = var1.clone();
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 10.0f);
//     var1.setShape(0, var28);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var28, 10.0d, 0.0f, 100.0f);
// 
//   }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     var13.setShape(100, var19);
//     var13.clear();
//     java.lang.Object var22 = var13.clone();
//     var13.clear();
//     boolean var25 = var13.equals((java.lang.Object)0);
//     java.lang.Object var26 = var13.clone();
//     boolean var27 = var0.equals((java.lang.Object)var13);
//     java.lang.Object var28 = var0.clone();
//     org.jfree.chart.util.ShapeList var30 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var31 = null;
//     boolean var32 = var30.equals(var31);
//     java.lang.Object var33 = var30.clone();
//     java.lang.Object var34 = var30.clone();
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.rotateShape(var37, 0.0d, 1.0f, 10.0f);
//     var30.setShape(1, var37);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, (-1.0d), (-1.0d));
//     var0.setShape(0, var37);
//     
//     // Checks the contract:  equals-hashcode on var13 and var0
//     assertTrue("Contract failed: equals-hashcode on var13 and var0", var13.equals(var0) ? var13.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var30
//     assertTrue("Contract failed: equals-hashcode on var13 and var30", var13.equals(var30) ? var13.hashCode() == var30.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var0.", var13.equals(var0) == var0.equals(var13));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var30.", var13.equals(var30) == var30.equals(var13));
// 
//   }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)var9);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 100.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, (-1.0f), 10.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 1.0d, (-1.0d));
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var9, var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var27);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(10);
    java.lang.Object var3 = var0.clone();
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, var14, 0.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, 1.0f, 10.0f);
//     boolean var24 = var17.equals((java.lang.Object)var19);
//     boolean var25 = var0.equals((java.lang.Object)var19);
//     org.jfree.chart.util.ShapeList var26 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var29, 0.0d, 1.0d);
//     var26.setShape(100, var32);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.clone(var36);
//     var26.setShape(0, var36);
//     java.lang.Object var39 = var26.clone();
//     java.awt.Shape var41 = var26.getShape(100);
//     boolean var42 = org.jfree.chart.util.ShapeUtilities.equal(var19, var41);
//     
//     // Checks the contract:  equals-hashcode on var0 and var26
//     assertTrue("Contract failed: equals-hashcode on var0 and var26", var0.equals(var26) ? var0.hashCode() == var26.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var26
//     assertTrue("Contract failed: equals-hashcode on var17 and var26", var17.equals(var26) ? var17.hashCode() == var26.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var26.", var0.equals(var26) == var26.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var26.", var17.equals(var26) == var26.equals(var17));
//     
//     // Checks the contract:  equals-hashcode on var9 and var39
//     assertTrue("Contract failed: equals-hashcode on var9 and var39", var9.equals(var39) ? var9.hashCode() == var39.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var15 and var39
//     assertTrue("Contract failed: equals-hashcode on var15 and var39", var15.equals(var39) ? var15.hashCode() == var39.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var39.", var9.equals(var39) == var39.equals(var9));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var15 and var39.", var15.equals(var39) == var39.equals(var15));
// 
//   }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     java.lang.Object var10 = null;
//     boolean var11 = var0.equals(var10);
//     java.awt.Shape var13 = var0.getShape(1);
//     java.lang.Object var14 = null;
//     boolean var15 = var0.equals(var14);
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     java.lang.Object var26 = var17.clone();
//     java.awt.Shape var28 = var17.getShape(10);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 10.0d, 1.0d);
//     boolean var35 = var17.equals((java.lang.Object)var34);
//     var0.setShape(101, var34);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var0.", var17.equals(var0) == var0.equals(var17));
// 
//   }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    var0.clear();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    var0.setShape(1, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 1.0d);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 10.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var10, 0.0d, (-1.0f), 0.0f);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    java.lang.Object var0 = null;
    org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    var1.setShape(100, var7);
    var1.clear();
    java.lang.Object var10 = var1.clone();
    var1.clear();
    boolean var13 = var1.equals((java.lang.Object)0);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    boolean var17 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var1, (java.lang.Object)var16);
    int var18 = var1.size();
    java.lang.Object var19 = var1.clone();
    boolean var20 = org.jfree.chart.util.ObjectUtilities.equal(var0, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = null;
//     boolean var3 = var1.equals(var2);
//     java.lang.Object var4 = var1.clone();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var8, 0.0d, 1.0f, 10.0f);
//     var1.setShape(1, var8);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), (-1.0d));
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 0.0d, 1.0f, 0.0f);
// 
//   }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, (-1.0d), 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test311() {}
//   public void test311() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.lang.Object var28 = null;
//     boolean var29 = var0.equals(var28);
//     java.lang.Object var30 = var0.clone();
//     java.lang.Object var31 = var0.clone();
//     org.jfree.chart.util.ShapeList var32 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var35, 0.0d, 1.0d);
//     var32.setShape(100, var38);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.clone(var42);
//     var32.setShape(0, var42);
//     java.awt.Shape var46 = var32.getShape(10);
//     java.awt.Shape var48 = var32.getShape((-1));
//     int var49 = var32.size();
//     boolean var50 = var0.equals((java.lang.Object)var32);
//     
//     // Checks the contract:  equals-hashcode on var0 and var32
//     assertTrue("Contract failed: equals-hashcode on var0 and var32", var0.equals(var32) ? var0.hashCode() == var32.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var32
//     assertTrue("Contract failed: equals-hashcode on var17 and var32", var17.equals(var32) ? var17.hashCode() == var32.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var32.", var0.equals(var32) == var32.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var32.", var17.equals(var32) == var32.equals(var17));
// 
//   }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     int var10 = var0.size();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var0.setShape(0, var14);
//     int var16 = var0.size();
//     java.lang.Object var17 = var0.clone();
//     org.jfree.chart.util.ShapeList var19 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var20 = var19.clone();
//     var19.clear();
//     java.awt.Shape var23 = var19.getShape(100);
//     org.jfree.chart.util.ShapeList var24 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     var24.setShape(100, var30);
//     var24.clear();
//     java.lang.Object var33 = var24.clone();
//     var24.clear();
//     boolean var36 = var24.equals((java.lang.Object)0);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.clone(var38);
//     boolean var40 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var24, (java.lang.Object)var39);
//     int var41 = var24.size();
//     boolean var42 = var19.equals((java.lang.Object)var41);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.rotateShape(var44, 0.0d, 1.0f, 10.0f);
//     boolean var49 = var19.equals((java.lang.Object)var48);
//     var0.setShape(10, var48);
//     
//     // Checks the contract:  equals-hashcode on var19 and var0
//     assertTrue("Contract failed: equals-hashcode on var19 and var0", var19.equals(var0) ? var19.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var24 and var0
//     assertTrue("Contract failed: equals-hashcode on var24 and var0", var24.equals(var0) ? var24.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var19 and var0.", var19.equals(var0) == var0.equals(var19));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var24 and var0.", var24.equals(var0) == var0.equals(var24));
//     
//     // Checks the contract:  equals-hashcode on var20 and var17
//     assertTrue("Contract failed: equals-hashcode on var20 and var17", var20.equals(var17) ? var20.hashCode() == var17.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var33 and var17
//     assertTrue("Contract failed: equals-hashcode on var33 and var17", var33.equals(var17) ? var33.hashCode() == var17.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var20 and var17.", var20.equals(var17) == var17.equals(var20));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var33 and var17.", var33.equals(var17) == var17.equals(var33));
// 
//   }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = var1.getShape(0);
//     var1.clear();
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), 100.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 1.0d);
//     var1.setShape(1, var7);
//     java.lang.Object var15 = var1.clone();
//     java.awt.Shape var17 = var1.getShape(0);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     var1.setShape(101, var20);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var20, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    java.lang.Class var1 = null;
    java.net.URL var2 = org.jfree.chart.util.ObjectUtilities.getResource("", var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)"");
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    var0.clear();
    java.lang.Object var14 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     var1.clear();
//     boolean var13 = var1.equals((java.lang.Object)0);
//     var1.clear();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 0.0d);
//     var1.setShape(0, var20);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 0.0d, 1.0d);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.clone(var26);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, 100.0d, 1.0d);
//     boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var24, var34);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var20, var24);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var24, 100.0d, 0.0f, 0.0f);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 1.0f);
    org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    var3.setShape(100, var9);
    var3.clear();
    int var12 = var3.size();
    java.lang.Object var13 = null;
    boolean var14 = var3.equals(var13);
    int var15 = var3.size();
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    boolean var18 = var3.equals((java.lang.Object)var17);
    boolean var19 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)100.0f, (java.lang.Object)var3);
    java.awt.Shape var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setShape((-1), var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = null;
    boolean var5 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, var4);
    org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var7 = var6.clone();
    var6.clear();
    java.awt.Shape var10 = var6.getShape(100);
    org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    var11.setShape(100, var17);
    var11.clear();
    java.lang.Object var20 = var11.clone();
    var11.clear();
    boolean var23 = var11.equals((java.lang.Object)0);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var25);
    boolean var27 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var11, (java.lang.Object)var26);
    int var28 = var11.size();
    boolean var29 = var6.equals((java.lang.Object)var28);
    boolean var30 = var0.equals((java.lang.Object)var28);
    int var31 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var11, 0.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test320() {}
//   public void test320() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     org.jfree.chart.util.ShapeList var2 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 1.0d);
//     var2.setShape(100, var8);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     var2.setShape(0, var12);
//     java.lang.Object var15 = var2.clone();
//     java.awt.Shape var17 = var2.getShape(100);
//     boolean var18 = var0.equals((java.lang.Object)var2);
//     
//     // Checks the contract:  equals-hashcode on var0 and var2
//     assertTrue("Contract failed: equals-hashcode on var0 and var2", var0.equals(var2) ? var0.hashCode() == var2.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var2.", var0.equals(var2) == var2.equals(var0));
//     
//     // Checks the contract:  equals-hashcode on var1 and var15
//     assertTrue("Contract failed: equals-hashcode on var1 and var15", var1.equals(var15) ? var1.hashCode() == var15.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var1 and var15.", var1.equals(var15) == var15.equals(var1));
// 
//   }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    boolean var9 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var6, (java.lang.Object)"");
    java.io.ObjectOutputStream var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var6, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 100.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() {}
//   public void test323() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var9);
//     boolean var14 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var2, (java.lang.Object)var9);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, (-1.0f), 10.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 1.0d, (-1.0d));
//     boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var9, var23);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, 100.0d, 0.0d);
//     boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var9, var33);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, 10.0d, (-1.0d));
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.clone(var36);
//     org.jfree.chart.util.ShapeList var41 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var43 = var41.getShape(100);
//     java.lang.Object var44 = var41.clone();
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.clone(var47);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var47, 0.0d, (-1.0d));
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.clone(var47);
//     var41.setShape(1, var52);
//     boolean var54 = org.jfree.chart.util.ShapeUtilities.equal(var40, var52);
//     boolean var55 = org.jfree.chart.util.ShapeUtilities.equal(var9, var52);
//     
//     // Checks the contract:  equals-hashcode on var0 and var41
//     assertTrue("Contract failed: equals-hashcode on var0 and var41", var0.equals(var41) ? var0.hashCode() == var41.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var41.", var0.equals(var41) == var41.equals(var0));
// 
//   }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), (-1.0d));
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 0.0d);
    boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var15, var23);
    org.jfree.chart.util.RectangleAnchor var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var25, 1.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 0.0d, 1.0f, 10.0f);
//     boolean var8 = var1.equals((java.lang.Object)var3);
//     int var9 = var1.size();
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     boolean var15 = var1.equals((java.lang.Object)var12);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 100.0d, 0.0f, 0.0f);
// 
//   }

  public void test326() {}
//   public void test326() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 100.0d);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var8, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, (-1.0d));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 10.0d, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)10.0d);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var8 = null;
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.io.ObjectOutputStream var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var10, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    var0.clear();
    var0.clear();
    int var6 = var0.size();
    var0.clear();
    java.awt.Shape var9 = var0.getShape(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    java.awt.Shape var3 = var0.getShape(0);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    var0.setShape(100, var6);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 100.0d, 0.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var13, 100.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 10.0d, 0.0d);
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var16);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    java.lang.Object var10 = null;
    boolean var11 = var0.equals(var10);
    java.awt.Shape var13 = var0.getShape(1);
    java.lang.Object var14 = null;
    boolean var15 = var0.equals(var14);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var18);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test333() {}
//   public void test333() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     java.lang.Object var10 = null;
//     boolean var11 = var0.equals(var10);
//     java.lang.Object var12 = var0.clone();
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     var14.setShape(100, var20);
//     var14.clear();
//     java.lang.Object var23 = var14.clone();
//     var14.clear();
//     boolean var26 = var14.equals((java.lang.Object)0);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.clone(var28);
//     boolean var30 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var14, (java.lang.Object)var29);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var29, 1.0d, 100.0d);
//     var0.setShape(0, var33);
//     
//     // Checks the contract:  equals-hashcode on var14 and var0
//     assertTrue("Contract failed: equals-hashcode on var14 and var0", var14.equals(var0) ? var14.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var0.", var14.equals(var0) == var0.equals(var14));
// 
//   }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = var1.clone();
//     var1.clear();
//     java.awt.Shape var5 = var1.getShape(100);
//     org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
//     var6.setShape(100, var12);
//     var6.clear();
//     java.lang.Object var15 = var6.clone();
//     var6.clear();
//     boolean var18 = var6.equals((java.lang.Object)0);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.clone(var20);
//     boolean var22 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var6, (java.lang.Object)var21);
//     int var23 = var6.size();
//     boolean var24 = var1.equals((java.lang.Object)var23);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, 0.0d, 1.0f, 10.0f);
//     boolean var31 = var1.equals((java.lang.Object)var30);
//     java.lang.Object var32 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var30);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var30, 0.0d, 10.0f, 100.0f);
// 
//   }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
//     boolean var36 = var0.equals((java.lang.Object)var31);
//     java.awt.Shape var38 = var0.getShape(0);
//     java.lang.Object var39 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
//     var0.clear();
//     org.jfree.chart.util.ShapeList var41 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var44, 0.0d, 1.0d);
//     var41.setShape(100, var47);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.clone(var51);
//     var41.setShape(0, var51);
//     boolean var54 = var0.equals((java.lang.Object)0);
//     
//     // Checks the contract:  equals-hashcode on var0 and var41
//     assertTrue("Contract failed: equals-hashcode on var0 and var41", var0.equals(var41) ? var0.hashCode() == var41.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var41
//     assertTrue("Contract failed: equals-hashcode on var17 and var41", var17.equals(var41) ? var17.hashCode() == var41.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var41.", var0.equals(var41) == var41.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var41.", var17.equals(var41) == var41.equals(var17));
// 
//   }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 1.0d, 10.0f, (-1.0f));
//     var0.setShape(1, var23);
//     org.jfree.chart.util.ShapeList var29 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 0.0d, 1.0d);
//     var29.setShape(100, var35);
//     var29.clear();
//     java.lang.Object var38 = var29.clone();
//     int var39 = var29.size();
//     java.awt.Shape var41 = var29.getShape(0);
//     boolean var43 = var29.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var44 = var29.clone();
//     int var45 = var29.size();
//     org.jfree.chart.util.ShapeList var46 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var49, 0.0d, 1.0d);
//     var46.setShape(100, var52);
//     var46.clear();
//     int var55 = var46.size();
//     boolean var56 = var29.equals((java.lang.Object)var55);
//     java.lang.Object var57 = null;
//     boolean var58 = var29.equals(var57);
//     java.lang.Object var59 = var29.clone();
//     boolean var60 = var0.equals((java.lang.Object)var29);
//     
//     // Checks the contract:  equals-hashcode on var29 and var0
//     assertTrue("Contract failed: equals-hashcode on var29 and var0", var29.equals(var0) ? var29.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var46 and var0
//     assertTrue("Contract failed: equals-hashcode on var46 and var0", var46.equals(var0) ? var46.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var29 and var0.", var29.equals(var0) == var0.equals(var29));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var46 and var0.", var46.equals(var0) == var0.equals(var46));
//     
//     // Checks the contract:  equals-hashcode on var38 and var14
//     assertTrue("Contract failed: equals-hashcode on var38 and var14", var38.equals(var14) ? var38.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var14
//     assertTrue("Contract failed: equals-hashcode on var44 and var14", var44.equals(var14) ? var44.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var59 and var14
//     assertTrue("Contract failed: equals-hashcode on var59 and var14", var59.equals(var14) ? var59.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var38 and var14.", var38.equals(var14) == var14.equals(var38));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var44 and var14.", var44.equals(var14) == var14.equals(var44));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var59 and var14.", var59.equals(var14) == var14.equals(var59));
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
    java.io.ObjectOutputStream var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 10.0d, 0.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 10.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, var24, 10.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     java.lang.Object var8 = var0.clone();
//     java.awt.Shape var10 = var0.getShape(0);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var11.setShape(100, var17);
//     var11.clear();
//     int var20 = var11.size();
//     java.lang.Object var21 = null;
//     boolean var22 = var11.equals(var21);
//     java.awt.Shape var24 = var11.getShape(1);
//     java.lang.Object var25 = var11.clone();
//     boolean var26 = var0.equals(var25);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var0.", var11.equals(var0) == var0.equals(var11));
//     
//     // Checks the contract:  equals-hashcode on var25 and var8
//     assertTrue("Contract failed: equals-hashcode on var25 and var8", var25.equals(var8) ? var25.hashCode() == var8.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var25 and var8.", var25.equals(var8) == var8.equals(var25));
// 
//   }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.lang.Object var13 = var0.clone();
    boolean var15 = var0.equals((java.lang.Object)0.0d);
    java.lang.Object var16 = null;
    boolean var17 = var0.equals(var16);
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 10.0d, 0.0d);
    java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.clone(var39);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.clone(var39);
    java.io.ObjectOutputStream var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var41, var42);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape((-1));
    int var11 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, (-1.0d), 100.0d);
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var14, var24);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.rotateShape(var24, (-1.0d), 1.0f, 10.0f);
    var0.setShape(0, var24);
    var0.clear();
    java.lang.Object var35 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test343() {}
//   public void test343() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     boolean var10 = var0.equals((java.lang.Object)var9);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = var11.getShape(100);
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var15 = null;
//     boolean var16 = var14.equals(var15);
//     java.lang.Object var17 = var14.clone();
//     boolean var18 = var11.equals((java.lang.Object)var14);
//     boolean var19 = var0.equals((java.lang.Object)var14);
//     java.lang.Object var20 = var0.clone();
//     java.lang.Object var21 = var0.clone();
//     java.lang.Object var22 = null;
//     boolean var23 = var0.equals(var22);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     var0.setShape(1, var27);
//     
//     // Checks the contract:  equals-hashcode on var11 and var0
//     assertTrue("Contract failed: equals-hashcode on var11 and var0", var11.equals(var0) ? var11.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var0
//     assertTrue("Contract failed: equals-hashcode on var14 and var0", var14.equals(var0) ? var14.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var0.", var11.equals(var0) == var0.equals(var11));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var0.", var14.equals(var0) == var0.equals(var14));
// 
//   }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 10.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     int var11 = var1.size();
//     java.awt.Shape var13 = var1.getShape(0);
//     boolean var15 = var1.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var16 = var1.clone();
//     int var17 = var1.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     int var19 = var18.size();
//     boolean var20 = var1.equals((java.lang.Object)var19);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, 0.0d, 1.0d);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var22);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, (-1.0d), 100.0d);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var22, var32);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.rotateShape(var32, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var40, 0.0d, (-1.0d));
//     boolean var44 = var1.equals((java.lang.Object)var40);
//     org.jfree.chart.util.ShapeList var45 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.rotateShape(var47, 0.0d, 1.0f, 10.0f);
//     boolean var52 = var45.equals((java.lang.Object)var47);
//     java.awt.Shape var53 = null;
//     boolean var54 = org.jfree.chart.util.ShapeUtilities.equal(var47, var53);
//     java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.clone(var47);
//     boolean var56 = var1.equals((java.lang.Object)var55);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var55, 10.0d, 1.0f, 0.0f);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 10.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var0.setShape(100, var6);
//     org.jfree.chart.util.ShapeList var8 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var10 = var8.getShape(0);
//     java.lang.Object var11 = var8.clone();
//     java.lang.Object var12 = var8.clone();
//     var8.clear();
//     java.lang.Object var14 = var8.clone();
//     java.lang.Object var15 = null;
//     boolean var16 = org.jfree.chart.util.ObjectUtilities.equal(var14, var15);
//     boolean var17 = var0.equals(var14);
//     
//     // Checks the contract:  equals-hashcode on var8 and var0
//     assertTrue("Contract failed: equals-hashcode on var8 and var0", var8.equals(var0) ? var8.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var8 and var0.", var8.equals(var0) == var0.equals(var8));
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


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

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 1.0d, 10.0f, (-1.0f));
// 
//   }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    java.awt.Shape var3 = var0.getShape(0);
    java.awt.Shape var5 = var0.getShape((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var8, 100.0d, (-1.0d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(byte)10);
    java.lang.Object var15 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var6, 10.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var22);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     var0.setShape(0, var17);
//     org.jfree.chart.util.ShapeList var26 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var29, 0.0d, 1.0d);
//     var26.setShape(100, var32);
//     var26.clear();
//     int var35 = var26.size();
//     java.lang.Object var36 = null;
//     boolean var37 = var26.equals(var36);
//     java.lang.Object var38 = var26.clone();
//     int var39 = var26.size();
//     int var40 = var26.size();
//     boolean var41 = var0.equals((java.lang.Object)var40);
//     
//     // Checks the contract:  equals-hashcode on var26 and var0
//     assertTrue("Contract failed: equals-hashcode on var26 and var0", var26.equals(var0) ? var26.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var26 and var0.", var26.equals(var0) == var0.equals(var26));
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var8 = var0.clone();
    int var9 = var0.size();
    org.jfree.chart.util.ShapeList var10 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, 1.0d);
    var10.setShape(100, var16);
    var10.clear();
    java.lang.Object var19 = var10.clone();
    var10.clear();
    boolean var22 = var10.equals((java.lang.Object)0);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var24);
    boolean var26 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var10, (java.lang.Object)var25);
    boolean var27 = var0.equals((java.lang.Object)var10);
    var10.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 10.0f, 0.0f);
// 
//   }

  public void test357() {}
//   public void test357() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, (-1.0d), 100.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var11, var14);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var14, 0.0d, 100.0f, 0.0f);
// 
//   }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    java.awt.Shape var11 = var0.getShape(10);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 100.0d, 100.0d);
    var0.setShape(1, var22);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, (-1.0d), 0.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, var28, 0.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.lang.Object var8 = var0.clone();
//     int var9 = var0.size();
//     org.jfree.chart.util.ShapeList var10 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, 1.0d);
//     var10.setShape(100, var16);
//     var10.clear();
//     java.lang.Object var19 = var10.clone();
//     var10.clear();
//     boolean var22 = var10.equals((java.lang.Object)0);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var24);
//     boolean var26 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var10, (java.lang.Object)var25);
//     boolean var27 = var0.equals((java.lang.Object)var10);
//     org.jfree.chart.util.ShapeList var29 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 0.0d, 1.0f, 10.0f);
//     boolean var36 = var29.equals((java.lang.Object)var31);
//     java.awt.Shape var38 = var29.getShape((-1));
//     java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var41, 0.0d, 1.0d);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.clone(var41);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.clone(var41);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var41);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var49, (-1.0d), 100.0d);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.rotateShape(var52, 0.0d, (-1.0f), 10.0f);
//     boolean var57 = org.jfree.chart.util.ShapeUtilities.equal(var41, var52);
//     var29.setShape(101, var52);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 1.0d, 1.0d);
//     java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.clone(var52);
//     var0.setShape(100, var62);
//     
//     // Checks the contract:  equals-hashcode on var10 and var0
//     assertTrue("Contract failed: equals-hashcode on var10 and var0", var10.equals(var0) ? var10.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var29
//     assertTrue("Contract failed: equals-hashcode on var10 and var29", var10.equals(var29) ? var10.hashCode() == var29.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var10 and var0.", var10.equals(var0) == var0.equals(var10));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var10 and var29.", var10.equals(var29) == var29.equals(var10));
// 
//   }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, 1.0d, 0.0f, (-1.0f));
// 
//   }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
//     var11.setShape(100, var17);
//     var11.clear();
//     java.lang.Object var20 = var11.clone();
//     var11.clear();
//     boolean var23 = var11.equals((java.lang.Object)0);
//     boolean var24 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var11);
//     java.lang.Object var25 = var11.clone();
//     org.jfree.chart.util.ShapeList var26 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var27 = var26.clone();
//     var26.clear();
//     boolean var29 = var11.equals((java.lang.Object)var26);
//     java.lang.Object var30 = var11.clone();
//     org.jfree.chart.util.ShapeList var31 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, 0.0d, 1.0d);
//     var31.setShape(100, var37);
//     var31.clear();
//     java.lang.Object var40 = var31.clone();
//     int var41 = var31.size();
//     java.awt.Shape var43 = var31.getShape(0);
//     boolean var45 = var31.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var46 = var31.clone();
//     int var47 = var31.size();
//     org.jfree.chart.util.ShapeList var48 = new org.jfree.chart.util.ShapeList();
//     int var49 = var48.size();
//     boolean var50 = var31.equals((java.lang.Object)var49);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 0.0d, 1.0d);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.clone(var52);
//     java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.rotateShape(var52, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var62, (-1.0d), 100.0d);
//     boolean var66 = org.jfree.chart.util.ShapeUtilities.equal(var52, var62);
//     java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.rotateShape(var62, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var73 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var70, 0.0d, (-1.0d));
//     boolean var74 = var31.equals((java.lang.Object)var70);
//     boolean var75 = var11.equals((java.lang.Object)var70);
//     boolean var76 = org.jfree.chart.util.ShapeUtilities.equal(var9, var70);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 1.0d, 0.0f, 0.0f);
// 
//   }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     int var11 = var0.size();
//     java.awt.Shape var13 = var0.getShape((-1));
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     var14.setShape(100, var20);
//     var14.clear();
//     int var23 = var14.size();
//     int var24 = var14.size();
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var14.setShape(0, var28);
//     int var30 = var14.size();
//     java.lang.Object var31 = var14.clone();
//     java.lang.Object var32 = var14.clone();
//     java.awt.Shape var34 = var14.getShape(1);
//     boolean var35 = var0.equals((java.lang.Object)var14);
//     
//     // Checks the contract:  equals-hashcode on var0 and var14
//     assertTrue("Contract failed: equals-hashcode on var0 and var14", var0.equals(var14) ? var0.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var14.", var0.equals(var14) == var14.equals(var0));
//     
//     // Checks the contract:  equals-hashcode on var9 and var31
//     assertTrue("Contract failed: equals-hashcode on var9 and var31", var9.equals(var31) ? var9.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var9 and var32
//     assertTrue("Contract failed: equals-hashcode on var9 and var32", var9.equals(var32) ? var9.hashCode() == var32.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var31.", var9.equals(var31) == var31.equals(var9));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var32.", var9.equals(var32) == var32.equals(var9));
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    org.jfree.chart.util.ShapeList var2 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 1.0d);
    var2.setShape(100, var8);
    var2.clear();
    java.lang.Object var11 = var2.clone();
    var2.clear();
    boolean var14 = var2.equals((java.lang.Object)0);
    boolean var15 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var2);
    java.lang.Object var16 = var2.clone();
    boolean var17 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)1.0d, (java.lang.Object)var2);
    org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
    var18.setShape(100, var24);
    var18.clear();
    java.awt.Shape var28 = var18.getShape((-1));
    java.awt.Shape var30 = var18.getShape((-1));
    java.lang.Object var31 = var18.clone();
    var18.clear();
    org.jfree.chart.util.ShapeList var33 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, 0.0d, 1.0d);
    var33.setShape(100, var39);
    var33.clear();
    java.lang.Object var42 = var33.clone();
    var33.clear();
    boolean var45 = var33.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var46 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var49, 0.0d, 1.0d);
    var46.setShape(100, var52);
    var46.clear();
    java.lang.Object var55 = var46.clone();
    var46.clear();
    boolean var58 = var46.equals((java.lang.Object)0);
    java.lang.Object var59 = var46.clone();
    boolean var60 = var33.equals((java.lang.Object)var46);
    java.awt.Shape var62 = var33.getShape(100);
    var33.clear();
    boolean var64 = var18.equals((java.lang.Object)var33);
    boolean var65 = var2.equals((java.lang.Object)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    java.lang.Object var10 = null;
    boolean var11 = var0.equals(var10);
    java.lang.Object var12 = var0.clone();
    int var13 = var0.size();
    int var14 = var0.size();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 1.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var14 = var13.clone();
//     java.lang.Object var15 = var13.clone();
//     boolean var16 = var0.equals((java.lang.Object)var13);
//     java.lang.Object var17 = var13.clone();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     var18.clear();
//     java.lang.Object var27 = var18.clone();
//     int var28 = var18.size();
//     java.awt.Shape var30 = var18.getShape(0);
//     boolean var32 = var18.equals((java.lang.Object)(short)(-1));
//     org.jfree.chart.util.ShapeList var34 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, 0.0d, 1.0d);
//     var34.setShape(100, var40);
//     var34.clear();
//     java.lang.Object var43 = var34.clone();
//     var34.clear();
//     boolean var46 = var34.equals((java.lang.Object)0);
//     boolean var47 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var34);
//     java.lang.Object var48 = var34.clone();
//     boolean var49 = var18.equals(var48);
//     boolean var50 = var13.equals((java.lang.Object)var18);
//     var18.clear();
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.clone(var54);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var57, 0.0d, 1.0d);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.clone(var57);
//     java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.rotateShape(var57, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var67, (-1.0d), 100.0d);
//     boolean var71 = org.jfree.chart.util.ShapeUtilities.equal(var57, var67);
//     boolean var72 = org.jfree.chart.util.ShapeUtilities.equal(var55, var57);
//     java.lang.Object var73 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var57);
//     java.awt.Shape var74 = org.jfree.chart.util.ShapeUtilities.clone(var57);
//     var18.setShape(101, var74);
//     
//     // Checks the contract:  equals-hashcode on var0 and var18
//     assertTrue("Contract failed: equals-hashcode on var0 and var18", var0.equals(var18) ? var0.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var18
//     assertTrue("Contract failed: equals-hashcode on var13 and var18", var13.equals(var18) ? var13.hashCode() == var18.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var34 and var18
//     assertTrue("Contract failed: equals-hashcode on var34 and var18", var34.equals(var18) ? var34.hashCode() == var18.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var18.", var0.equals(var18) == var18.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var13 and var18.", var13.equals(var18) == var18.equals(var13));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var34 and var18.", var34.equals(var18) == var18.equals(var34));
// 
//   }

  public void test367() {}
//   public void test367() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.awt.Shape var11 = var1.getShape((-1));
//     int var12 = var1.size();
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, 0.0d, 1.0d);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, (-1.0d), 100.0d);
//     boolean var29 = org.jfree.chart.util.ShapeUtilities.equal(var15, var25);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.rotateShape(var25, (-1.0d), 1.0f, 10.0f);
//     var1.setShape(0, var25);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, (-1.0d), 100.0d);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.rotateShape(var40, 0.0d, (-1.0f), 10.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     boolean var48 = org.jfree.chart.util.ShapeUtilities.equal(var40, var47);
//     var1.setShape(1, var47);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var47, 1.0d, (-1.0f), 0.0f);
// 
//   }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var4, (-1.0d), 10.0f, 0.0f);
// 
//   }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var10 = var0.equals((java.lang.Object)var9);
    org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var13 = var11.getShape(100);
    org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var15 = null;
    boolean var16 = var14.equals(var15);
    java.lang.Object var17 = var14.clone();
    boolean var18 = var11.equals((java.lang.Object)var14);
    boolean var19 = var0.equals((java.lang.Object)var14);
    java.lang.Object var20 = var14.clone();
    java.lang.Object var21 = var14.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test370() {}
//   public void test370() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     java.awt.Shape var12 = var1.getShape(10);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, 0.0d, 1.0d);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var15);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 100.0d);
//     var1.setShape(1, var23);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 0.0f, 100.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var28, 100.0d, 0.0f, 10.0f);
// 
//   }

  public void test371() {}
//   public void test371() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = null;
//     boolean var3 = var1.equals(var2);
//     java.lang.Object var4 = var1.clone();
//     java.lang.Object var5 = var1.clone();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var8, 0.0d, 1.0f, 10.0f);
//     var1.setShape(1, var8);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), (-1.0d));
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     java.lang.Object var19 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var18);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, (-1.0d), 1.0f, 100.0f);
// 
//   }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     int var10 = var1.size();
//     java.lang.Object var11 = null;
//     boolean var12 = var1.equals(var11);
//     int var13 = var1.size();
//     java.lang.Object var14 = var1.clone();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, 1.0f, (-1.0f));
//     boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var17, var19);
//     boolean var25 = var1.equals((java.lang.Object)var17);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var17, 1.0d, (-1.0f), 0.0f);
// 
//   }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    var0.clear();
    java.awt.Shape var15 = var0.getShape(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    java.lang.Object var2 = org.jfree.chart.util.ObjectUtilities.clone(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 1.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    java.lang.Object var1 = null;
    boolean var2 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)0.0f, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    var0.clear();
    java.lang.Object var2 = null;
    boolean var3 = var0.equals(var2);
    java.awt.Shape var5 = var0.getShape((-1));
    int var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), (-1.0d));
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var16);
    java.lang.Object var18 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var17);
    org.jfree.chart.util.RectangleAnchor var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, var19, 0.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    int var10 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    var0.setShape(0, var14);
    java.io.ObjectOutputStream var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var14, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.lang.Object var8 = var0.clone();
    java.awt.Shape var10 = var0.getShape(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape((-1));
    int var11 = var0.size();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test383() {}
//   public void test383() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     int var11 = var1.size();
//     java.awt.Shape var13 = var1.getShape(0);
//     boolean var15 = var1.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var16 = var1.clone();
//     int var17 = var1.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     var18.clear();
//     int var27 = var18.size();
//     boolean var28 = var1.equals((java.lang.Object)var27);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, (-1.0d), 100.0d);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var30, var32);
//     boolean var37 = var1.equals((java.lang.Object)var32);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var32, 0.0d, 0.0f, 10.0f);
// 
//   }

  public void test384() {}
//   public void test384() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     var0.clear();
//     boolean var12 = var0.equals((java.lang.Object)0);
//     org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
//     var13.setShape(100, var19);
//     var13.clear();
//     java.lang.Object var22 = var13.clone();
//     var13.clear();
//     boolean var25 = var13.equals((java.lang.Object)0);
//     java.lang.Object var26 = var13.clone();
//     boolean var27 = var0.equals((java.lang.Object)var13);
//     java.awt.Shape var29 = var0.getShape(100);
//     var0.clear();
//     java.awt.Shape var32 = null;
//     var0.setShape(1, var32);
//     
//     // Checks the contract:  equals-hashcode on var0 and var13
//     assertTrue("Contract failed: equals-hashcode on var0 and var13", var0.equals(var13) ? var0.hashCode() == var13.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var0
//     assertTrue("Contract failed: equals-hashcode on var13 and var0", var13.equals(var0) ? var13.hashCode() == var0.hashCode() : true);
// 
//   }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 10.0d, 1.0d);
//     java.lang.Object var10 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var6);
//     java.lang.Object var11 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var6);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, (-1.0d), 10.0f, 0.0f);
// 
//   }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    boolean var4 = org.jfree.chart.util.ShapeUtilities.equal(var0, var2);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 100.0d, (-1.0d));
    org.jfree.chart.util.RectangleAnchor var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var16, (-1.0d), (-1.0d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = var0.clone();
//     var0.clear();
//     java.awt.Shape var4 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var5 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var7 = var5.getShape(100);
//     java.lang.Object var8 = var5.clone();
//     var5.clear();
//     boolean var10 = var0.equals((java.lang.Object)var5);
//     java.awt.Shape var12 = var0.getShape(1);
//     java.lang.Object var13 = var0.clone();
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     var14.setShape(100, var20);
//     var14.clear();
//     java.lang.Object var23 = var14.clone();
//     var14.clear();
//     boolean var26 = var14.equals((java.lang.Object)0);
//     var14.clear();
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, (-1.0d), 0.0d);
//     var14.setShape(0, var33);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 0.0d, 1.0d);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.clone(var39);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var47, 100.0d, 1.0d);
//     boolean var51 = org.jfree.chart.util.ShapeUtilities.equal(var37, var47);
//     boolean var52 = org.jfree.chart.util.ShapeUtilities.equal(var33, var37);
//     boolean var53 = var0.equals((java.lang.Object)var37);
//     
//     // Checks the contract:  equals-hashcode on var0 and var14
//     assertTrue("Contract failed: equals-hashcode on var0 and var14", var0.equals(var14) ? var0.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var5 and var14
//     assertTrue("Contract failed: equals-hashcode on var5 and var14", var5.equals(var14) ? var5.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var14.", var0.equals(var14) == var14.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var5 and var14.", var5.equals(var14) == var14.equals(var5));
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape(0);
    java.lang.Object var11 = var0.clone();
    java.lang.Object var12 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
    int var13 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(100);
    org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    java.lang.Object var6 = var3.clone();
    boolean var7 = var0.equals((java.lang.Object)var3);
    java.lang.Object var8 = var0.clone();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(100);
    java.lang.Object var3 = var0.clone();
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, (-1.0d), (-1.0d));
    boolean var9 = var0.equals((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var22);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     var0.setShape(0, var17);
//     java.lang.Object var26 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var26
//     assertTrue("Contract failed: equals-hashcode on var9 and var26", var9.equals(var26) ? var9.hashCode() == var26.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var26.", var9.equals(var26) == var26.equals(var9));
// 
//   }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.io.ObjectOutputStream var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var3, var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    var0.clear();
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 0.0d);
    var0.setShape(0, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)0);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test395() {}
//   public void test395() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     int var18 = var17.size();
//     boolean var19 = var0.equals((java.lang.Object)var18);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var21);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var21, var31);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 0.0d, (-1.0d));
//     boolean var43 = var0.equals((java.lang.Object)var39);
//     org.jfree.chart.util.ShapeList var44 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.rotateShape(var46, 0.0d, 1.0f, 10.0f);
//     boolean var51 = var44.equals((java.lang.Object)var46);
//     java.awt.Shape var52 = null;
//     boolean var53 = org.jfree.chart.util.ShapeUtilities.equal(var46, var52);
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.clone(var46);
//     boolean var55 = var0.equals((java.lang.Object)var54);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var58, 0.0d, 1.0d);
//     java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.clone(var58);
//     java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.rotateShape(var58, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var68 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var71 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var68, (-1.0d), 100.0d);
//     boolean var72 = org.jfree.chart.util.ShapeUtilities.equal(var58, var68);
//     java.awt.Shape var76 = org.jfree.chart.util.ShapeUtilities.rotateShape(var68, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var79 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var76, 0.0d, (-1.0d));
//     java.awt.Shape var83 = org.jfree.chart.util.ShapeUtilities.rotateShape(var79, 10.0d, 1.0f, 0.0f);
//     java.awt.Shape var84 = org.jfree.chart.util.ShapeUtilities.clone(var79);
//     var0.setShape(2, var79);
//     
//     // Checks the contract:  equals-hashcode on var17 and var0
//     assertTrue("Contract failed: equals-hashcode on var17 and var0", var17.equals(var0) ? var17.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var0
//     assertTrue("Contract failed: equals-hashcode on var44 and var0", var44.equals(var0) ? var44.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var0.", var17.equals(var0) == var0.equals(var17));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var44 and var0.", var44.equals(var0) == var0.equals(var44));
// 
//   }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     int var10 = var0.size();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var0.setShape(0, var14);
//     int var16 = var0.size();
//     java.lang.Object var17 = var0.clone();
//     var0.clear();
//     org.jfree.chart.util.ShapeList var19 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, 0.0d, 1.0d);
//     var19.setShape(100, var25);
//     var19.clear();
//     int var28 = var19.size();
//     int var29 = var19.size();
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var19.setShape(0, var33);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, (-1.0d), 100.0d);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 0.0d, 1.0d);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.clone(var42);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.rotateShape(var42, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, 100.0d, 1.0d);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, 1.0d, 0.0d);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.clone(var56);
//     boolean var58 = org.jfree.chart.util.ShapeUtilities.equal(var40, var56);
//     var19.setShape(10, var56);
//     java.awt.Shape var61 = var19.getShape(10);
//     boolean var62 = var0.equals((java.lang.Object)var61);
//     
//     // Checks the contract:  equals-hashcode on var0 and var19
//     assertTrue("Contract failed: equals-hashcode on var0 and var19", var0.equals(var19) ? var0.hashCode() == var19.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var19.", var0.equals(var19) == var19.equals(var0));
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.awt.Shape var14 = var0.getShape(10);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
    var0.setShape(0, var17);
    java.lang.Object var22 = null;
    boolean var23 = var0.equals(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 0.0d, (-1.0f), 10.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 100.0d);
    java.io.ObjectOutputStream var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var11, var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    int var10 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    var0.setShape(0, var14);
    int var16 = var0.size();
    java.lang.Object var17 = var0.clone();
    java.lang.Object var18 = var0.clone();
    var0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     int var13 = var0.size();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, 1.0f, (-1.0f));
//     boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var17, var19);
//     org.jfree.chart.util.ShapeList var25 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var28, 0.0d, 1.0d);
//     var25.setShape(100, var31);
//     var25.clear();
//     java.awt.Shape var35 = var25.getShape((-1));
//     java.awt.Shape var37 = var25.getShape((-1));
//     java.lang.Object var38 = var25.clone();
//     boolean var39 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var24, (java.lang.Object)var25);
//     java.lang.Object var40 = var25.clone();
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 0.0d, 1.0d);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.clone(var42);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var42);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.clone(var42);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var50, (-1.0d), 100.0d);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.rotateShape(var53, 0.0d, (-1.0f), 10.0f);
//     boolean var58 = org.jfree.chart.util.ShapeUtilities.equal(var42, var53);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, 0.0d, (-1.0d));
//     java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, 1.0d, 0.0d);
//     boolean var65 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var25, (java.lang.Object)var53);
//     java.awt.Shape var68 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, 10.0d, 0.0d);
//     var0.setShape(0, var53);
//     
//     // Checks the contract:  equals-hashcode on var25 and var0
//     assertTrue("Contract failed: equals-hashcode on var25 and var0", var25.equals(var0) ? var25.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var25 and var0.", var25.equals(var0) == var0.equals(var25));
// 
//   }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 1.0f);
    java.io.ObjectOutputStream var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test402() {}
//   public void test402() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     boolean var10 = var0.equals((java.lang.Object)var9);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = var11.getShape(100);
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var15 = null;
//     boolean var16 = var14.equals(var15);
//     java.lang.Object var17 = var14.clone();
//     boolean var18 = var11.equals((java.lang.Object)var14);
//     boolean var19 = var0.equals((java.lang.Object)var14);
//     java.lang.Object var20 = var0.clone();
//     org.jfree.chart.util.ShapeList var21 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 0.0d, 1.0d);
//     var21.setShape(100, var27);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.clone(var31);
//     var21.setShape(0, var31);
//     java.awt.Shape var35 = var21.getShape(10);
//     java.lang.Object var36 = var21.clone();
//     boolean var37 = var0.equals((java.lang.Object)var21);
//     
//     // Checks the contract:  equals-hashcode on var0 and var21
//     assertTrue("Contract failed: equals-hashcode on var0 and var21", var0.equals(var21) ? var0.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var21
//     assertTrue("Contract failed: equals-hashcode on var11 and var21", var11.equals(var21) ? var11.hashCode() == var21.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var21
//     assertTrue("Contract failed: equals-hashcode on var14 and var21", var14.equals(var21) ? var14.hashCode() == var21.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var21.", var0.equals(var21) == var21.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var21.", var11.equals(var21) == var21.equals(var11));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var21.", var14.equals(var21) == var21.equals(var14));
//     
//     // Checks the contract:  equals-hashcode on var17 and var36
//     assertTrue("Contract failed: equals-hashcode on var17 and var36", var17.equals(var36) ? var17.hashCode() == var36.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var36
//     assertTrue("Contract failed: equals-hashcode on var20 and var36", var20.equals(var36) ? var20.hashCode() == var36.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var36.", var17.equals(var36) == var36.equals(var17));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var20 and var36.", var20.equals(var36) == var36.equals(var20));
// 
//   }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), (-1.0d));
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.io.ObjectOutputStream var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var15, var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test404() {}
//   public void test404() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(100.0d, (-1.0d), var2);
// 
//   }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
    int var17 = var0.size();
    var0.clear();
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), (-1.0f));
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 1.0d, (-1.0f), (-1.0f));
    boolean var27 = var0.equals((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var16 = var0.getShape(0);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
//     boolean var40 = var0.equals((java.lang.Object)var39);
//     var0.clear();
//     java.lang.Object var42 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var42 and var14
//     assertTrue("Contract failed: equals-hashcode on var42 and var14", var42.equals(var14) ? var42.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var42 and var14.", var42.equals(var14) == var14.equals(var42));
// 
//   }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, (-1.0d));
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
//     boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 10.0d, 1.0d);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     boolean var22 = org.jfree.chart.util.ShapeUtilities.equal(var18, var21);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var2, var21);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 100.0d, 0.0f, 100.0f);
// 
//   }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, (-1.0d));
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 10.0d, 1.0f, 0.0f);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var26);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 100.0d, 0.0d);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.rotateShape(var30, 1.0d, 0.0f, (-1.0f));
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, 0.0d, 1.0d);
    java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.clone(var36);
    java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.rotateShape(var36, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var46, (-1.0d), 100.0d);
    boolean var50 = org.jfree.chart.util.ShapeUtilities.equal(var36, var46);
    java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.rotateShape(var46, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var54, 0.0d, (-1.0d));
    java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.rotateShape(var57, 10.0d, 1.0f, 0.0f);
    java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.clone(var61);
    java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var61, 100.0d, 0.0d);
    java.awt.Shape var68 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var61, 100.0d, (-1.0d));
    boolean var69 = org.jfree.chart.util.ShapeUtilities.equal(var30, var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    boolean var16 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var15);
    int var17 = var0.size();
    var0.clear();
    int var19 = var0.size();
    java.awt.Shape var21 = var0.getShape(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape(100);
    java.lang.Object var11 = var0.clone();
    var0.clear();
    var0.clear();
    java.lang.Object var14 = var0.clone();
    org.jfree.chart.util.ShapeList var15 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var17 = var15.getShape(0);
    java.lang.Object var18 = var15.clone();
    java.lang.Object var19 = var15.clone();
    var15.clear();
    java.lang.Object var21 = var15.clone();
    boolean var22 = org.jfree.chart.util.ObjectUtilities.equal(var14, var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 100.0d, (-1.0f), 10.0f);
// 
//   }

  public void test412() {}
//   public void test412() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }
// 
// 
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 0.0d, 1.0f, (-1.0f));
//     boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
//     org.jfree.chart.util.ShapeList var10 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, 1.0d);
//     var10.setShape(100, var16);
//     var10.clear();
//     java.awt.Shape var20 = var10.getShape((-1));
//     java.awt.Shape var22 = var10.getShape((-1));
//     java.lang.Object var23 = var10.clone();
//     boolean var24 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var9, (java.lang.Object)var10);
//     java.lang.Object var25 = var10.clone();
//     org.jfree.chart.util.ShapeList var26 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var29, 0.0d, 1.0d);
//     var26.setShape(100, var32);
//     var26.clear();
//     java.lang.Object var35 = var26.clone();
//     var26.clear();
//     boolean var38 = var26.equals((java.lang.Object)0);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.clone(var40);
//     boolean var42 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var26, (java.lang.Object)var41);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var26.setShape(0, var46);
//     java.awt.Shape var49 = var26.getShape((-1));
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     boolean var53 = var26.equals((java.lang.Object)1.0f);
//     boolean var54 = org.jfree.chart.util.ObjectUtilities.equal(var25, (java.lang.Object)var53);
//     
//     // Checks the contract:  equals-hashcode on var10 and var26
//     assertTrue("Contract failed: equals-hashcode on var10 and var26", var10.equals(var26) ? var10.hashCode() == var26.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var10 and var26.", var10.equals(var26) == var26.equals(var10));
// 
//   }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 100.0d);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var8, 10.0d, 1.0f, 0.0f);
// 
//   }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 100.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.io.ObjectOutputStream var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var8);
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

  }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 100.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 0.0d, (-1.0f), 10.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var5, var12);
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var16, 0.0d, 1.0f, 10.0f);
//     boolean var21 = var14.equals((java.lang.Object)var16);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     boolean var28 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var16, (java.lang.Object)var23);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var30);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.clone(var31);
//     boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var23, var31);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var35, 0.0d, 1.0d);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.clone(var35);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var35, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, (-1.0d), 100.0d);
//     boolean var49 = org.jfree.chart.util.ShapeUtilities.equal(var35, var45);
//     boolean var50 = org.jfree.chart.util.ShapeUtilities.equal(var31, var35);
//     java.awt.Shape var51 = null;
//     boolean var52 = org.jfree.chart.util.ShapeUtilities.equal(var35, var51);
//     boolean var53 = org.jfree.chart.util.ShapeUtilities.equal(var5, var35);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, (-1.0d), 1.0f, 10.0f);
// 
//   }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     org.jfree.chart.util.ShapeList var4 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var5 = null;
//     boolean var6 = var4.equals(var5);
//     java.lang.Object var7 = var4.clone();
//     var4.clear();
//     java.awt.Shape var10 = var4.getShape(100);
//     boolean var11 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var4);
//     org.jfree.chart.util.ShapeList var12 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, 0.0d, 1.0d);
//     var12.setShape(100, var18);
//     var12.clear();
//     java.awt.Shape var22 = var12.getShape(100);
//     java.lang.Object var23 = var12.clone();
//     var12.clear();
//     boolean var25 = var0.equals((java.lang.Object)var12);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, (-1.0d), 100.0d);
//     boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var28, var30);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.rotateShape(var28, (-1.0d), 10.0f, 0.0f);
//     var12.setShape(100, var38);
//     
//     // Checks the contract:  equals-hashcode on var0 and var12
//     assertTrue("Contract failed: equals-hashcode on var0 and var12", var0.equals(var12) ? var0.hashCode() == var12.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var12
//     assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var12.", var0.equals(var12) == var12.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var4 and var12.", var4.equals(var12) == var12.equals(var4));
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.awt.Shape var4 = var0.getShape(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var14 = var13.clone();
    java.lang.Object var15 = var13.clone();
    boolean var16 = var0.equals((java.lang.Object)var13);
    java.lang.Object var17 = var0.clone();
    java.lang.Object var18 = org.jfree.chart.util.ObjectUtilities.clone(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test422() {}
//   public void test422() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, (-1.0d));
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 10.0d, 1.0f, 0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 100.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var27, 10.0d, (-1.0f), 0.0f);
// 
//   }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.io.ObjectOutputStream var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    int var3 = var0.size();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 10.0d, 1.0d);
    var0.setShape(100, var7);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, 0.0d, 1.0d);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var13, var18);
    java.awt.Shape var20 = null;
    boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var13, var20);
    boolean var22 = var0.equals((java.lang.Object)var13);
    java.io.ObjectOutputStream var23 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var13, var23);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(0);
    var0.clear();
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    var0.setShape(1, var6);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var14, 100.0d, 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 1.0f, 10.0f);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
    boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var4, var9);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var12, var14);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 10.0d, 0.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 1.0d, 0.0f, 100.0f);
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var2, var23);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
    org.jfree.chart.util.RectangleAnchor var32 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var32, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 1.0d, 10.0f, (-1.0f));
//     var0.setShape(1, var23);
//     java.lang.Object var29 = var0.clone();
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.clone(var32);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var33);
//     java.lang.Object var35 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var34);
//     var0.setShape(101, var34);
//     org.jfree.chart.util.ShapeList var37 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, 1.0f, 10.0f);
//     boolean var44 = var37.equals((java.lang.Object)var39);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var46, 0.0d, 1.0d);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.clone(var46);
//     boolean var51 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var39, (java.lang.Object)var46);
//     boolean var52 = org.jfree.chart.util.ShapeUtilities.equal(var34, var39);
//     
//     // Checks the contract:  equals-hashcode on var37 and var0
//     assertTrue("Contract failed: equals-hashcode on var37 and var0", var37.equals(var0) ? var37.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var37 and var0.", var37.equals(var0) == var0.equals(var37));
// 
//   }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
//     boolean var36 = var0.equals((java.lang.Object)var31);
//     org.jfree.chart.util.ShapeList var37 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var38 = var37.clone();
//     var37.clear();
//     java.awt.Shape var41 = var37.getShape(100);
//     org.jfree.chart.util.ShapeList var42 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, 1.0d);
//     var42.setShape(100, var48);
//     var42.clear();
//     java.lang.Object var51 = var42.clone();
//     var42.clear();
//     boolean var54 = var42.equals((java.lang.Object)0);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.clone(var56);
//     boolean var58 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var42, (java.lang.Object)var57);
//     int var59 = var42.size();
//     boolean var60 = var37.equals((java.lang.Object)var59);
//     java.awt.Shape var62 = var37.getShape(0);
//     boolean var63 = var0.equals((java.lang.Object)var37);
//     int var64 = var37.size();
//     org.jfree.chart.util.ShapeList var66 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var69 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var72 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var69, 0.0d, 1.0d);
//     var66.setShape(100, var72);
//     var66.clear();
//     java.lang.Object var75 = var66.clone();
//     var66.clear();
//     boolean var78 = var66.equals((java.lang.Object)0);
//     java.awt.Shape var80 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var81 = org.jfree.chart.util.ShapeUtilities.clone(var80);
//     boolean var82 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var66, (java.lang.Object)var81);
//     var37.setShape(0, var81);
//     
//     // Checks the contract:  equals-hashcode on var0 and var37
//     assertTrue("Contract failed: equals-hashcode on var0 and var37", var0.equals(var37) ? var0.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var37
//     assertTrue("Contract failed: equals-hashcode on var17 and var37", var17.equals(var37) ? var17.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var37
//     assertTrue("Contract failed: equals-hashcode on var42 and var37", var42.equals(var37) ? var42.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var66 and var37
//     assertTrue("Contract failed: equals-hashcode on var66 and var37", var66.equals(var37) ? var66.hashCode() == var37.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var37.", var0.equals(var37) == var37.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var37.", var17.equals(var37) == var37.equals(var17));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var42 and var37.", var42.equals(var37) == var37.equals(var42));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var66 and var37.", var66.equals(var37) == var37.equals(var66));
// 
//   }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.awt.Shape var10 = var0.getShape(100);
//     java.lang.Object var11 = var0.clone();
//     var0.clear();
//     var0.clear();
//     java.lang.Object var14 = null;
//     boolean var15 = var0.equals(var14);
//     var0.clear();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 0.0d, 1.0d);
//     boolean var30 = org.jfree.chart.util.ShapeUtilities.equal(var23, var29);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.rotateShape(var29, (-1.0d), 100.0f, 10.0f);
//     boolean var35 = var0.equals((java.lang.Object)var34);
//     
//     // Checks the contract:  equals-hashcode on var0 and var17
//     assertTrue("Contract failed: equals-hashcode on var0 and var17", var0.equals(var17) ? var0.hashCode() == var17.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var17.", var0.equals(var17) == var17.equals(var0));
// 
//   }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, (-1.0d), 100.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 0.0d, (-1.0f), 10.0f);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var2, var13);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var21, (-1.0d), 100.0f, 10.0f);
// 
//   }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var1 = null;
//     boolean var2 = var0.equals(var1);
//     java.lang.Object var3 = var0.clone();
//     var0.clear();
//     org.jfree.chart.util.ShapeList var6 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 0.0d, 1.0d);
//     var6.setShape(100, var12);
//     var6.clear();
//     java.lang.Object var15 = var6.clone();
//     int var16 = var6.size();
//     java.awt.Shape var18 = var6.getShape(0);
//     boolean var20 = var6.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var21 = var6.clone();
//     int var22 = var6.size();
//     org.jfree.chart.util.ShapeList var23 = new org.jfree.chart.util.ShapeList();
//     int var24 = var23.size();
//     boolean var25 = var6.equals((java.lang.Object)var24);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var27, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, (-1.0d), 100.0d);
//     boolean var41 = org.jfree.chart.util.ShapeUtilities.equal(var27, var37);
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.rotateShape(var37, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, (-1.0d));
//     boolean var49 = var6.equals((java.lang.Object)var45);
//     var0.setShape(1, var45);
//     
//     // Checks the contract:  equals-hashcode on var6 and var0
//     assertTrue("Contract failed: equals-hashcode on var6 and var0", var6.equals(var0) ? var6.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var23 and var0
//     assertTrue("Contract failed: equals-hashcode on var23 and var0", var23.equals(var0) ? var23.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var6 and var0.", var6.equals(var0) == var0.equals(var6));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var23 and var0.", var23.equals(var0) == var0.equals(var23));
// 
//   }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    int var9 = var0.size();
    int var10 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    var0.setShape(0, var14);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
    boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
    var0.setShape(10, var37);
    java.awt.Shape var42 = var0.getShape(10);
    java.lang.Object var43 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


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

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    var0.setShape(0, var10);
    java.awt.Shape var14 = var0.getShape(10);
    java.lang.Object var15 = var0.clone();
    java.lang.Object var16 = var0.clone();
    var0.clear();
    java.awt.Shape var19 = var0.getShape(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 0.0d, 1.0f, (-1.0f));
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.io.ObjectOutputStream var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var4, var11);
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

  }

  public void test437() {}
//   public void test437() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
//     org.jfree.chart.util.ShapeList var4 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 1.0d);
//     var4.setShape(100, var10);
//     var4.clear();
//     java.awt.Shape var14 = var4.getShape((-1));
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     var4.setShape(100, var18);
//     boolean var20 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var3, (java.lang.Object)var18);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 0.0d, (-1.0f), 0.0f);
// 
//   }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = var0.clone();
    var0.clear();
    java.awt.Shape var4 = var0.getShape(100);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 1.0d, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((-1), var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var8 = null;
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    org.jfree.chart.util.RectangleAnchor var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var10, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 10.0d, 100.0f, 100.0f);
// 
//   }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, (-1.0d), 1.0f, 1.0f);
    boolean var23 = var0.equals((java.lang.Object)(-1.0d));
    int var24 = var0.size();
    java.lang.Object var25 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 10.0d, 0.0d);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.rotateShape(var20, 1.0d, 0.0f, 100.0f);
    org.jfree.chart.util.ShapeList var25 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var27 = var25.getShape(0);
    var25.clear();
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
    var25.setShape(1, var31);
    java.lang.Object var39 = var25.clone();
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, (-1.0d), 100.0d);
    java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 0.0d, 1.0d);
    java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.rotateShape(var48, 1.0d, 10.0f, (-1.0f));
    var25.setShape(1, var48);
    java.lang.Object var54 = var25.clone();
    boolean var55 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)1.0d, var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 1.0f);
    java.lang.Object var3 = null;
    boolean var4 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)1.0f, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test444() {}
//   public void test444() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, (-1.0d));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 10.0d, 0.0f, 0.0f);
// 
//   }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    int var11 = var0.size();
    java.lang.Object var12 = var0.clone();
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 1.0d, 10.0f, 10.0f);
    boolean var20 = var0.equals((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 0.0d, 1.0f, (-1.0f));
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, var11, 0.0d, 0.0d);
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

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 1.0f, 100.0f);
    java.io.ObjectOutputStream var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = var1.getShape(10);
//     var1.clear();
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     var1.setShape(1, var8);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var8, 0.0d, (-1.0f), 100.0f);
// 
//   }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    java.lang.Object var4 = var0.clone();
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    var0.setShape(1, var7);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), (-1.0d));
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 0.0d);
    boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var15, var23);
    org.jfree.chart.util.RectangleAnchor var25 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var25, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test450() {}
//   public void test450() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     int var9 = var0.size();
//     int var10 = var0.size();
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     var0.setShape(0, var14);
//     org.jfree.chart.util.ShapeList var16 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
//     var16.setShape(100, var22);
//     var16.clear();
//     java.awt.Shape var26 = var16.getShape((-1));
//     org.jfree.chart.util.ShapeList var27 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, 0.0d, 1.0d);
//     var27.setShape(100, var33);
//     var27.clear();
//     java.lang.Object var36 = var27.clone();
//     int var37 = var27.size();
//     java.awt.Shape var39 = var27.getShape(0);
//     boolean var41 = var27.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var42 = var27.clone();
//     int var43 = var27.size();
//     org.jfree.chart.util.ShapeList var44 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var47, 0.0d, 1.0d);
//     var44.setShape(100, var50);
//     var44.clear();
//     int var53 = var44.size();
//     boolean var54 = var27.equals((java.lang.Object)var53);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var58, (-1.0d), 100.0d);
//     boolean var62 = org.jfree.chart.util.ShapeUtilities.equal(var56, var58);
//     boolean var63 = var27.equals((java.lang.Object)var58);
//     java.lang.Object var64 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var58);
//     boolean var65 = var16.equals(var64);
//     boolean var66 = var0.equals(var64);
//     
//     // Checks the contract:  equals-hashcode on var16 and var0
//     assertTrue("Contract failed: equals-hashcode on var16 and var0", var16.equals(var0) ? var16.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var0
//     assertTrue("Contract failed: equals-hashcode on var27 and var0", var27.equals(var0) ? var27.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var0
//     assertTrue("Contract failed: equals-hashcode on var44 and var0", var44.equals(var0) ? var44.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var16 and var0.", var16.equals(var0) == var0.equals(var16));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var27 and var0.", var27.equals(var0) == var0.equals(var27));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var44 and var0.", var44.equals(var0) == var0.equals(var44));
// 
//   }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), (-1.0d));
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, (-1.0d), 100.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 0.0d, (-1.0f), 10.0f);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 0.0d, 100.0d);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var5, var17);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var5, 1.0d, 0.0f, 100.0f);
// 
//   }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
    boolean var7 = var0.equals((java.lang.Object)var2);
    java.awt.Shape var8 = null;
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.io.ObjectOutputStream var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = var1.clone();
//     var1.clear();
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 10.0d, (-1.0d));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 10.0d, 1.0d);
//     boolean var13 = var1.equals((java.lang.Object)var9);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var9);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var14, 0.0d, 1.0f, 10.0f);
// 
//   }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 10.0d, 0.0d);
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 1.0d, 0.0f, 100.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, (-1.0d), (-1.0d));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var28, 10.0d, (-1.0f), (-1.0f));
// 
//   }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.lang.Object var28 = null;
    boolean var29 = var0.equals(var28);
    java.lang.Object var30 = var0.clone();
    java.lang.Object var31 = org.jfree.chart.util.ObjectUtilities.clone(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)100.0f);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
    var17.setShape(100, var23);
    var17.clear();
    int var26 = var17.size();
    boolean var27 = var0.equals((java.lang.Object)var26);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
    boolean var36 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var37 = null;
    boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var31, var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
    java.io.ObjectOutputStream var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape((-1));
    org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    var11.setShape(100, var17);
    var11.clear();
    java.lang.Object var20 = var11.clone();
    int var21 = var11.size();
    java.awt.Shape var23 = var11.getShape(0);
    boolean var25 = var11.equals((java.lang.Object)(short)(-1));
    java.lang.Object var26 = var11.clone();
    int var27 = var11.size();
    org.jfree.chart.util.ShapeList var28 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
    var28.setShape(100, var34);
    var28.clear();
    int var37 = var28.size();
    boolean var38 = var11.equals((java.lang.Object)var37);
    java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, (-1.0d), 100.0d);
    boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var40, var42);
    boolean var47 = var11.equals((java.lang.Object)var42);
    java.lang.Object var48 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var42);
    boolean var49 = var0.equals(var48);
    org.jfree.chart.util.ShapeList var50 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, 0.0d, 1.0d);
    var50.setShape(100, var56);
    var50.clear();
    java.lang.Object var59 = var50.clone();
    var50.clear();
    boolean var62 = var50.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var63 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var69 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 0.0d, 1.0d);
    var63.setShape(100, var69);
    var63.clear();
    java.lang.Object var72 = var63.clone();
    var63.clear();
    boolean var75 = var63.equals((java.lang.Object)0);
    java.lang.Object var76 = var63.clone();
    boolean var77 = var50.equals((java.lang.Object)var63);
    java.awt.Shape var79 = var50.getShape(100);
    boolean var80 = var0.equals((java.lang.Object)var50);
    org.jfree.chart.util.ShapeList var81 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var83 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var87 = org.jfree.chart.util.ShapeUtilities.rotateShape(var83, 0.0d, 1.0f, 10.0f);
    boolean var88 = var81.equals((java.lang.Object)var83);
    java.lang.Object var89 = var81.clone();
    boolean var90 = var0.equals(var89);
    int var91 = var0.size();
    java.lang.Object var92 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, (-1.0d), 100.0d);
    boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var4, var14);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.lang.Object var20 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var4);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 10.0d, (-1.0d));
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var25);
    java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var28, 0.0d, 1.0d);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.clone(var28);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.rotateShape(var28, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var38, (-1.0d), 100.0d);
    boolean var42 = org.jfree.chart.util.ShapeUtilities.equal(var28, var38);
    boolean var43 = org.jfree.chart.util.ShapeUtilities.equal(var26, var28);
    java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.rotateShape(var28, (-1.0d), 100.0f, 10.0f);
    boolean var48 = org.jfree.chart.util.ShapeUtilities.equal(var23, var28);
    java.io.ObjectOutputStream var49 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var28, var49);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     int var10 = var1.size();
//     java.lang.Object var11 = null;
//     boolean var12 = var1.equals(var11);
//     int var13 = var1.size();
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     boolean var16 = var1.equals((java.lang.Object)var15);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, 1.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var20, 10.0d, (-1.0f), 0.0f);
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    int var1 = var0.size();
    boolean var3 = var0.equals((java.lang.Object)100.0d);
    boolean var5 = var0.equals((java.lang.Object)(-1));
    java.lang.Object var6 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    boolean var14 = org.jfree.chart.util.ShapeUtilities.equal(var10, var13);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 1.0d, 100.0f, 1.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)1.0d);
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test464() {}
//   public void test464() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var16 = var0.getShape(0);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
//     boolean var40 = var0.equals((java.lang.Object)var39);
//     var0.clear();
//     java.lang.Object var42 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var42 and var14
//     assertTrue("Contract failed: equals-hashcode on var42 and var14", var42.equals(var14) ? var42.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var42 and var14.", var42.equals(var14) == var14.equals(var42));
// 
//   }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, (-1.0d), 100.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 0.0d, (-1.0f), 10.0f);
//     boolean var18 = org.jfree.chart.util.ShapeUtilities.equal(var2, var13);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var13);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 100.0d, 0.0f, (-1.0f));
// 
//   }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = var1.clone();
//     java.awt.Shape var4 = var1.getShape(0);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
//     var1.setShape(100, var7);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 100.0d, 0.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var13, 1.0d, 0.0f, 1.0f);
// 
//   }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, (-1.0f), 10.0f);
    boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var1, var12);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    org.jfree.chart.util.RectangleAnchor var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var19, (-1.0d), 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var4 = null;
//     boolean var5 = var3.equals(var4);
//     java.lang.Object var6 = var3.clone();
//     boolean var7 = var0.equals((java.lang.Object)var3);
//     java.lang.Object var8 = var3.clone();
//     org.jfree.chart.util.ShapeList var9 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 0.0d, 1.0d);
//     var9.setShape(100, var15);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     java.lang.Object var20 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)var18);
//     boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var15, var18);
//     boolean var22 = org.jfree.chart.util.ObjectUtilities.equal(var8, (java.lang.Object)var15);
//     
//     // Checks the contract:  equals-hashcode on var0 and var9
//     assertTrue("Contract failed: equals-hashcode on var0 and var9", var0.equals(var9) ? var0.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var9
//     assertTrue("Contract failed: equals-hashcode on var3 and var9", var3.equals(var9) ? var3.hashCode() == var9.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var9.", var0.equals(var9) == var9.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var9.", var3.equals(var9) == var9.equals(var3));
// 
//   }

  public void test470() {}
//   public void test470() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var16 = var0.getShape(0);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
//     boolean var40 = var0.equals((java.lang.Object)var39);
//     org.jfree.chart.util.ShapeList var41 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var43 = var41.getShape(100);
//     org.jfree.chart.util.ShapeList var44 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var45 = null;
//     boolean var46 = var44.equals(var45);
//     java.lang.Object var47 = var44.clone();
//     boolean var48 = var41.equals((java.lang.Object)var44);
//     java.lang.Object var49 = var44.clone();
//     java.lang.Object var50 = org.jfree.chart.util.ObjectUtilities.clone(var49);
//     boolean var51 = var0.equals(var49);
//     
//     // Checks the contract:  equals-hashcode on var41 and var0
//     assertTrue("Contract failed: equals-hashcode on var41 and var0", var41.equals(var0) ? var41.hashCode() == var0.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var44 and var0
//     assertTrue("Contract failed: equals-hashcode on var44 and var0", var44.equals(var0) ? var44.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var41 and var0.", var41.equals(var0) == var0.equals(var41));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var44 and var0.", var44.equals(var0) == var0.equals(var44));
//     
//     // Checks the contract:  equals-hashcode on var47 and var14
//     assertTrue("Contract failed: equals-hashcode on var47 and var14", var47.equals(var14) ? var47.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var49 and var14
//     assertTrue("Contract failed: equals-hashcode on var49 and var14", var49.equals(var14) ? var49.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var50 and var14
//     assertTrue("Contract failed: equals-hashcode on var50 and var14", var50.equals(var14) ? var50.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var47 and var14.", var47.equals(var14) == var14.equals(var47));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var49 and var14.", var49.equals(var14) == var14.equals(var49));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var50 and var14.", var50.equals(var14) == var14.equals(var50));
// 
//   }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var14 = var13.clone();
    java.lang.Object var15 = var13.clone();
    boolean var16 = var0.equals((java.lang.Object)var13);
    java.lang.Object var17 = var0.clone();
    java.lang.Object var18 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.lang.Object var18 = null;
//     boolean var19 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var12, var18);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var12, 100.0d, 0.0f, 1.0f);
// 
//   }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var8 = null;
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var1, var8);
    java.io.ObjectOutputStream var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var8, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
    boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var22);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var17);
    var0.setShape(0, var17);
    java.awt.Shape var27 = var0.getShape(1);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, 0.0d, 1.0d);
    boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var32, var37);
    java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, (-1.0d), 100.0d);
    boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var40, var42);
    boolean var47 = org.jfree.chart.util.ShapeUtilities.equal(var32, var42);
    java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.clone(var42);
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var42, 10.0d, 0.0d);
    java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.rotateShape(var51, 1.0d, 0.0f, 100.0f);
    boolean var56 = org.jfree.chart.util.ShapeUtilities.equal(var30, var51);
    boolean var57 = var0.equals((java.lang.Object)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test475() {}
//   public void test475() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var15 = var0.clone();
//     int var16 = var0.size();
//     org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, 1.0d);
//     var17.setShape(100, var23);
//     var17.clear();
//     int var26 = var17.size();
//     boolean var27 = var0.equals((java.lang.Object)var26);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var29, var31);
//     boolean var36 = var0.equals((java.lang.Object)var31);
//     org.jfree.chart.util.ShapeList var37 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var38 = var37.clone();
//     var37.clear();
//     java.awt.Shape var41 = var37.getShape(100);
//     org.jfree.chart.util.ShapeList var42 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var45, 0.0d, 1.0d);
//     var42.setShape(100, var48);
//     var42.clear();
//     java.lang.Object var51 = var42.clone();
//     var42.clear();
//     boolean var54 = var42.equals((java.lang.Object)0);
//     java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.clone(var56);
//     boolean var58 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var42, (java.lang.Object)var57);
//     int var59 = var42.size();
//     boolean var60 = var37.equals((java.lang.Object)var59);
//     java.awt.Shape var62 = var37.getShape(0);
//     boolean var63 = var0.equals((java.lang.Object)var37);
//     org.jfree.chart.util.ShapeList var64 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var67, 0.0d, 1.0d);
//     var64.setShape(100, var70);
//     var64.clear();
//     java.awt.Shape var74 = var64.getShape(0);
//     boolean var75 = var37.equals((java.lang.Object)var64);
//     var37.clear();
//     java.awt.Shape var79 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var83 = org.jfree.chart.util.ShapeUtilities.rotateShape(var79, (-1.0d), 100.0f, 100.0f);
//     java.awt.Shape var84 = org.jfree.chart.util.ShapeUtilities.clone(var79);
//     var37.setShape(0, var79);
//     
//     // Checks the contract:  equals-hashcode on var0 and var37
//     assertTrue("Contract failed: equals-hashcode on var0 and var37", var0.equals(var37) ? var0.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var17 and var37
//     assertTrue("Contract failed: equals-hashcode on var17 and var37", var17.equals(var37) ? var17.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var37
//     assertTrue("Contract failed: equals-hashcode on var42 and var37", var42.equals(var37) ? var42.hashCode() == var37.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var37
//     assertTrue("Contract failed: equals-hashcode on var64 and var37", var64.equals(var37) ? var64.hashCode() == var37.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var37.", var0.equals(var37) == var37.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var17 and var37.", var17.equals(var37) == var37.equals(var17));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var42 and var37.", var42.equals(var37) == var37.equals(var42));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var64 and var37.", var64.equals(var37) == var37.equals(var64));
// 
//   }

  public void test476() {}
//   public void test476() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     var0.clear();
//     java.lang.Object var9 = var0.clone();
//     int var10 = var0.size();
//     java.awt.Shape var12 = var0.getShape(0);
//     boolean var14 = var0.equals((java.lang.Object)(short)(-1));
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 1.0d);
//     boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var17, var22);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     var0.setShape(0, var17);
//     java.awt.Shape var27 = var0.getShape(1);
//     java.lang.Object var28 = var0.clone();
//     
//     // Checks the contract:  equals-hashcode on var9 and var28
//     assertTrue("Contract failed: equals-hashcode on var9 and var28", var9.equals(var28) ? var9.hashCode() == var28.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var9 and var28.", var9.equals(var28) == var28.equals(var9));
// 
//   }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var1 = null;
    boolean var2 = var0.equals(var1);
    java.lang.Object var3 = var0.clone();
    org.jfree.chart.util.ShapeList var4 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var5 = null;
    boolean var6 = var4.equals(var5);
    java.lang.Object var7 = var4.clone();
    var4.clear();
    java.awt.Shape var10 = var4.getShape(100);
    boolean var11 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var0, (java.lang.Object)var4);
    int var12 = var4.size();
    int var13 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.io.ObjectOutputStream var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var1, var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }
// 
// 
//     java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 100.0d);
//     boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = var11.getShape(0);
//     var11.clear();
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 0.0d, 1.0d);
//     var11.setShape(1, var17);
//     java.lang.Object var25 = var11.clone();
//     boolean var26 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var10, (java.lang.Object)var11);
//     org.jfree.chart.util.ShapeList var28 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     var28.setShape(100, var34);
//     var28.clear();
//     java.lang.Object var37 = var28.clone();
//     var28.clear();
//     boolean var40 = var28.equals((java.lang.Object)0);
//     boolean var41 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)(-1L), (java.lang.Object)var28);
//     java.lang.Object var42 = var28.clone();
//     var28.clear();
//     java.awt.Shape var45 = var28.getShape(10);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var48, 0.0d, 1.0d);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.clone(var48);
//     var28.setShape(0, var52);
//     boolean var54 = var11.equals((java.lang.Object)var52);
//     
//     // Checks the contract:  equals-hashcode on var37 and var25
//     assertTrue("Contract failed: equals-hashcode on var37 and var25", var37.equals(var25) ? var37.hashCode() == var25.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var42 and var25
//     assertTrue("Contract failed: equals-hashcode on var42 and var25", var42.equals(var25) ? var42.hashCode() == var25.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var37 and var25.", var37.equals(var25) == var25.equals(var37));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var42 and var25.", var42.equals(var25) == var25.equals(var42));
// 
//   }

  public void test480() {}
//   public void test480() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var7);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var10, var12);
//     boolean var17 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var19);
//     org.jfree.chart.util.ShapeList var21 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var23 = var21.getShape(0);
//     var21.clear();
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, (-1.0d), 100.0d);
//     java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     var21.setShape(1, var27);
//     java.lang.Object var35 = var21.clone();
//     java.awt.Shape var37 = var21.getShape(0);
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, (-1.0d), 100.0d);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var44, 0.0d, 1.0d);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.clone(var44);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.rotateShape(var44, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 100.0d, 1.0d);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var52, 1.0d, 0.0d);
//     java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.clone(var58);
//     boolean var60 = org.jfree.chart.util.ShapeUtilities.equal(var42, var58);
//     boolean var61 = var21.equals((java.lang.Object)var60);
//     boolean var62 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var20, (java.lang.Object)var61);
//     java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var65, 1.0d, 100.0f, 0.0f);
// 
//   }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(100);
//     org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var4 = null;
//     boolean var5 = var3.equals(var4);
//     java.lang.Object var6 = var3.clone();
//     boolean var7 = var0.equals((java.lang.Object)var3);
//     java.lang.Object var8 = var3.clone();
//     org.jfree.chart.util.ShapeList var9 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var11 = var9.getShape(0);
//     int var12 = var9.size();
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 10.0f);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 10.0d, 1.0d);
//     var9.setShape(100, var16);
//     boolean var21 = var3.equals((java.lang.Object)var9);
//     
//     // Checks the contract:  equals-hashcode on var0 and var9
//     assertTrue("Contract failed: equals-hashcode on var0 and var9", var0.equals(var9) ? var0.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var3 and var9
//     assertTrue("Contract failed: equals-hashcode on var3 and var9", var3.equals(var9) ? var3.hashCode() == var9.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var9.", var0.equals(var9) == var9.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var3 and var9.", var3.equals(var9) == var9.equals(var3));
// 
//   }

  public void test482() {}
//   public void test482() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }
// 
// 
//     java.awt.geom.Rectangle2D var2 = null;
//     java.awt.geom.Point2D var3 = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(10.0d, 1.0d, var2);
// 
//   }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 10.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    boolean var8 = org.jfree.chart.util.ShapeUtilities.equal(var2, var5);
    java.io.ObjectOutputStream var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var2, var9);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 100.0d);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, (-1.0d), 1.0f, 10.0f);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 0.0d, (-1.0d));
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 10.0d, 1.0f, 0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 100.0d, 0.0d);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 1.0d, 0.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var35, 0.0d, (-1.0f), (-1.0f));
// 
//   }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
//     boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
//     boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var11);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.clone(var18);
//     org.jfree.chart.util.ShapeList var20 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var22 = var20.getShape(0);
//     var20.clear();
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, (-1.0d), 100.0d);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 0.0d, 1.0d);
//     var20.setShape(1, var26);
//     java.lang.Object var34 = var20.clone();
//     java.awt.Shape var36 = var20.getShape(0);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var38, (-1.0d), 100.0d);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var43, 0.0d, 1.0d);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.clone(var43);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.rotateShape(var43, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var51, 100.0d, 1.0d);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var51, 1.0d, 0.0d);
//     java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.clone(var57);
//     boolean var59 = org.jfree.chart.util.ShapeUtilities.equal(var41, var57);
//     boolean var60 = var20.equals((java.lang.Object)var59);
//     boolean var61 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var19, (java.lang.Object)var60);
//     java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 100.0d, 1.0d);
//     org.jfree.chart.util.ShapeList var65 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var66 = null;
//     boolean var67 = var65.equals(var66);
//     java.lang.Object var68 = var65.clone();
//     java.awt.Shape var71 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     var65.setShape(100, var71);
//     java.awt.Shape var75 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var71, 100.0d, 10.0d);
//     boolean var76 = org.jfree.chart.util.ShapeUtilities.equal(var19, var75);
//     
//     // Checks the contract:  equals-hashcode on var68 and var34
//     assertTrue("Contract failed: equals-hashcode on var68 and var34", var68.equals(var34) ? var68.hashCode() == var34.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var68 and var34.", var68.equals(var34) == var34.equals(var68));
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    var0.clear();
    boolean var12 = var0.equals((java.lang.Object)0);
    org.jfree.chart.util.ShapeList var13 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 0.0d, 1.0d);
    var13.setShape(100, var19);
    var13.clear();
    java.lang.Object var22 = var13.clone();
    var13.clear();
    boolean var25 = var13.equals((java.lang.Object)0);
    java.lang.Object var26 = var13.clone();
    boolean var27 = var0.equals((java.lang.Object)var13);
    java.awt.Shape var29 = var0.getShape(100);
    var0.clear();
    org.jfree.chart.util.ShapeList var31 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var32 = var31.clone();
    var31.clear();
    java.awt.Shape var35 = var31.getShape(100);
    org.jfree.chart.util.ShapeList var36 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 0.0d, 1.0d);
    var36.setShape(100, var42);
    var36.clear();
    java.lang.Object var45 = var36.clone();
    var36.clear();
    boolean var48 = var36.equals((java.lang.Object)0);
    java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.clone(var50);
    boolean var52 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var36, (java.lang.Object)var51);
    int var53 = var36.size();
    boolean var54 = var31.equals((java.lang.Object)var53);
    boolean var55 = var0.equals((java.lang.Object)var31);
    java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var60 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var57, 0.0d, 1.0d);
    java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.clone(var57);
    java.awt.Shape var62 = org.jfree.chart.util.ShapeUtilities.clone(var57);
    java.awt.Shape var65 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var62, 100.0d, 100.0d);
    java.awt.Shape var69 = org.jfree.chart.util.ShapeUtilities.rotateShape(var62, 100.0d, (-1.0f), 1.0f);
    boolean var70 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var55, (java.lang.Object)var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    int var18 = var17.size();
    boolean var19 = var0.equals((java.lang.Object)var18);
    org.jfree.chart.util.ShapeList var20 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 0.0d, 1.0f, 10.0f);
    boolean var27 = var20.equals((java.lang.Object)var22);
    int var28 = var20.size();
    boolean var29 = var0.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 10.0d, 0.0d);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.rotateShape(var20, 1.0d, 0.0f, 100.0f);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, (-1.0d), (-1.0d));
    java.io.ObjectOutputStream var28 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var24, var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    boolean var7 = org.jfree.chart.util.ShapeUtilities.equal(var1, var6);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 100.0d);
    boolean var15 = org.jfree.chart.util.ShapeUtilities.equal(var9, var11);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var1, var11);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 0.0d, 0.0f, 1.0f);
    java.io.ObjectOutputStream var27 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var11, var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = org.jfree.chart.util.ObjectUtilities.clone((java.lang.Object)(byte)(-1));
      fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  public void test492() {}
//   public void test492() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var2 = var1.clone();
//     var1.clear();
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 10.0d, (-1.0d));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 10.0d, 1.0d);
//     boolean var13 = var1.equals((java.lang.Object)var9);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var9, 1.0d, 100.0f, (-1.0f));
// 
//   }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, (-1.0d));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, (-1.0d), 1.0d);
    java.io.ObjectOutputStream var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var5, var9);
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

  }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 1.0f, 10.0f);
//     boolean var7 = var0.equals((java.lang.Object)var2);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     boolean var10 = var0.equals((java.lang.Object)var9);
//     org.jfree.chart.util.ShapeList var11 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var13 = var11.getShape(100);
//     org.jfree.chart.util.ShapeList var14 = new org.jfree.chart.util.ShapeList();
//     java.lang.Object var15 = null;
//     boolean var16 = var14.equals(var15);
//     java.lang.Object var17 = var14.clone();
//     boolean var18 = var11.equals((java.lang.Object)var14);
//     boolean var19 = var0.equals((java.lang.Object)var14);
//     java.lang.Object var20 = var0.clone();
//     java.lang.Object var21 = var0.clone();
//     org.jfree.chart.util.ShapeList var22 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 0.0d, 1.0d);
//     var22.setShape(100, var28);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var28, var34);
//     boolean var36 = var0.equals((java.lang.Object)var35);
//     
//     // Checks the contract:  equals-hashcode on var0 and var22
//     assertTrue("Contract failed: equals-hashcode on var0 and var22", var0.equals(var22) ? var0.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var22
//     assertTrue("Contract failed: equals-hashcode on var11 and var22", var11.equals(var22) ? var11.hashCode() == var22.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var22
//     assertTrue("Contract failed: equals-hashcode on var14 and var22", var14.equals(var22) ? var14.hashCode() == var22.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var0 and var22.", var0.equals(var22) == var22.equals(var0));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var11 and var22.", var11.equals(var22) == var22.equals(var11));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var14 and var22.", var14.equals(var22) == var22.equals(var14));
// 
//   }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     org.jfree.chart.util.ShapeList var1 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
//     var1.setShape(100, var7);
//     var1.clear();
//     java.lang.Object var10 = var1.clone();
//     int var11 = var1.size();
//     java.awt.Shape var13 = var1.getShape(0);
//     boolean var15 = var1.equals((java.lang.Object)(short)(-1));
//     java.lang.Object var16 = var1.clone();
//     int var17 = var1.size();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
//     var18.setShape(100, var24);
//     var18.clear();
//     int var27 = var18.size();
//     boolean var28 = var1.equals((java.lang.Object)var27);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, (-1.0d), 100.0d);
//     boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var30, var32);
//     boolean var37 = var1.equals((java.lang.Object)var32);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var32, 100.0d, 100.0f, 10.0f);
// 
//   }

  public void test496() {}
//   public void test496() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
//     var0.setShape(100, var6);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
//     var0.setShape(0, var10);
//     java.lang.Object var13 = var0.clone();
//     boolean var15 = var0.equals((java.lang.Object)0.0d);
//     java.lang.Object var16 = var0.clone();
//     org.jfree.chart.util.ShapeList var18 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.rotateShape(var20, 0.0d, 1.0f, 10.0f);
//     boolean var25 = var18.equals((java.lang.Object)var20);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var27, 0.0d, 1.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var27);
//     boolean var32 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var20, (java.lang.Object)var27);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.clone(var34);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var35);
//     boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var27, var35);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var35);
//     var0.setShape(100, var35);
//     
//     // Checks the contract:  equals-hashcode on var18 and var0
//     assertTrue("Contract failed: equals-hashcode on var18 and var0", var18.equals(var0) ? var18.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var18 and var0.", var18.equals(var0) == var0.equals(var18));
// 
//   }

  public void test497() {}
//   public void test497() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }
// 
// 
//     org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var2 = var0.getShape(0);
//     var0.clear();
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, (-1.0d), 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, 1.0d);
//     var0.setShape(1, var6);
//     java.lang.Object var14 = var0.clone();
//     java.awt.Shape var16 = var0.getShape(0);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, (-1.0d), 100.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 1.0d);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, (-1.0d), 1.0f, 1.0f);
//     java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 100.0d, 1.0d);
//     java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 1.0d, 0.0d);
//     java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.clone(var37);
//     boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var21, var37);
//     boolean var40 = var0.equals((java.lang.Object)var39);
//     var0.clear();
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var46, 0.0d, 1.0d);
//     boolean var50 = org.jfree.chart.util.ShapeUtilities.equal(var44, var49);
//     java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var54, (-1.0d), 100.0d);
//     boolean var58 = org.jfree.chart.util.ShapeUtilities.equal(var52, var54);
//     boolean var59 = org.jfree.chart.util.ShapeUtilities.equal(var44, var54);
//     var0.setShape(1, var44);
//     org.jfree.chart.util.ShapeList var61 = new org.jfree.chart.util.ShapeList();
//     java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
//     java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var64, 0.0d, 1.0d);
//     var61.setShape(100, var67);
//     var61.clear();
//     java.lang.Object var70 = var61.clone();
//     var61.clear();
//     boolean var73 = var61.equals((java.lang.Object)0);
//     java.awt.Shape var75 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
//     java.awt.Shape var76 = org.jfree.chart.util.ShapeUtilities.clone(var75);
//     boolean var77 = org.jfree.chart.util.ObjectUtilities.equal((java.lang.Object)var61, (java.lang.Object)var76);
//     java.awt.Shape var81 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
//     var61.setShape(0, var81);
//     var61.clear();
//     java.lang.Object var84 = var61.clone();
//     java.lang.Object var85 = org.jfree.chart.util.ObjectUtilities.clone(var84);
//     boolean var86 = var0.equals(var84);
//     
//     // Checks the contract:  equals-hashcode on var61 and var0
//     assertTrue("Contract failed: equals-hashcode on var61 and var0", var61.equals(var0) ? var61.hashCode() == var0.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var61 and var0.", var61.equals(var0) == var0.equals(var61));
//     
//     // Checks the contract:  equals-hashcode on var70 and var14
//     assertTrue("Contract failed: equals-hashcode on var70 and var14", var70.equals(var14) ? var70.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var84 and var14
//     assertTrue("Contract failed: equals-hashcode on var84 and var14", var84.equals(var14) ? var84.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var85 and var14
//     assertTrue("Contract failed: equals-hashcode on var85 and var14", var85.equals(var14) ? var85.hashCode() == var14.hashCode() : true);
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var70 and var14.", var70.equals(var14) == var14.equals(var70));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var84 and var14.", var84.equals(var14) == var14.equals(var84));
//     
//     // This assertion (symmetry of equals) fails 
//     assertTrue("Contract failed: equals-symmetric on var85 and var14.", var85.equals(var14) == var14.equals(var85));
// 
//   }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.awt.Shape var10 = var0.getShape((-1));
    int var11 = var0.size();
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 0.0d, 1.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var14);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, (-1.0d), 100.0d);
    boolean var28 = org.jfree.chart.util.ShapeUtilities.equal(var14, var24);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.rotateShape(var24, (-1.0d), 1.0f, 10.0f);
    var0.setShape(0, var24);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var36, (-1.0d), 100.0d);
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, (-1.0f), 10.0f);
    java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 0.0f);
    boolean var47 = org.jfree.chart.util.ShapeUtilities.equal(var39, var46);
    var0.setShape(1, var46);
    java.lang.Object var49 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var2 = var0.getShape(100);
    org.jfree.chart.util.ShapeList var3 = new org.jfree.chart.util.ShapeList();
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    java.lang.Object var6 = var3.clone();
    boolean var7 = var0.equals((java.lang.Object)var3);
    java.lang.Object var8 = var3.clone();
    java.lang.Object var9 = var3.clone();
    int var10 = var3.size();
    boolean var12 = var3.equals((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    org.jfree.chart.util.ShapeList var0 = new org.jfree.chart.util.ShapeList();
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    var0.setShape(100, var6);
    var0.clear();
    java.lang.Object var9 = var0.clone();
    int var10 = var0.size();
    java.awt.Shape var12 = var0.getShape(0);
    boolean var14 = var0.equals((java.lang.Object)(short)(-1));
    java.lang.Object var15 = var0.clone();
    int var16 = var0.size();
    org.jfree.chart.util.ShapeList var17 = new org.jfree.chart.util.ShapeList();
    int var18 = var17.size();
    boolean var19 = var0.equals((java.lang.Object)var18);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 0.0d, 1.0d);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, (-1.0d), 1.0f, 1.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond(1.0f);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, (-1.0d), 100.0d);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var21, var31);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, (-1.0d), 1.0f, 10.0f);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 0.0d, (-1.0d));
    boolean var43 = var0.equals((java.lang.Object)var39);
    java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, 100.0f, 10.0f);
    java.io.ObjectOutputStream var48 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.chart.util.SerialUtilities.writeShape(var39, var48);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

}
