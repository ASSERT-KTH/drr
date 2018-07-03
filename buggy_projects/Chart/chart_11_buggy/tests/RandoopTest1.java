
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, 0.0d, 100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 10.0d);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 1.0d);
//     boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var3, var9);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 1.0f, (-1.0f));
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 0.0d, 10.0f, 1.0f);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(100.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 100.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
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
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 100.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 0.0d, 100.0f, 0.0f);
// 
//   }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 100.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), (-1.0f), 1.0f);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
//     java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 0.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 100.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var23, (-1.0d), 0.0f, 0.0f);
// 
//   }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 1.0d);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var9);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, 0.0d, 10.0f, 100.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 0.0d, (-1.0f), 10.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, 1.0d, 0.0f, 1.0f);
// 
//   }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    java.awt.Shape var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, 100.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 1.0d, 10.0f, 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 10.0d, 100.0d);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 0.0d);
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, (-1.0d), 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 100.0d, 0.0f, 100.0f);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 1.0d, 1.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var15, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.rotateShape(var25, 100.0d, (-1.0f), 10.0f);
    boolean var30 = org.jfree.chart.util.ShapeUtilities.equal(var23, var25);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 0.0d, 0.0d);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var25);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var20, var34);
    boolean var36 = org.jfree.chart.util.ShapeUtilities.equal(var13, var34);
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.rotateShape(var38, 1.0d, 10.0f, 10.0f);
    boolean var43 = org.jfree.chart.util.ShapeUtilities.equal(var34, var42);
    java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.rotateShape(var34, (-1.0d), 100.0f, 10.0f);
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.rotateShape(var34, 1.0d, 10.0f, 10.0f);
    java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var34, 0.0d, 1.0d);
    java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
    java.awt.Shape var58 = org.jfree.chart.util.ShapeUtilities.clone(var57);
    boolean var59 = org.jfree.chart.util.ShapeUtilities.equal(var34, var58);
    boolean var60 = org.jfree.chart.util.ShapeUtilities.equal(var3, var58);
    java.awt.Shape var63 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 0.0f);
    boolean var64 = org.jfree.chart.util.ShapeUtilities.equal(var58, var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 1.0d);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, 0.0f, 1.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 1.0d);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 100.0d);
    
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

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, (-1.0d), 100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, (-1.0f), 10.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 100.0d, 10.0d);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 100.0d, (-1.0f), 10.0f);
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var20, var22);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, 0.0d, 0.0d);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.rotateShape(var30, 10.0d, 0.0f, 1.0f);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var9, var30);
    org.jfree.chart.util.RectangleAnchor var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, var36, 10.0d, 100.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var5, 100.0d, (-1.0f), 10.0f);
//     boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var3, var5);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, 0.0d);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 10.0d, 0.0f, 1.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), (-1.0d));
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 100.0d, 10.0f, 10.0f);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var21);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var21, 1.0d, (-1.0f), 0.0f);
// 
//   }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
//     java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, 1.0d, 100.0f, 100.0f);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 1.0f);
    org.jfree.chart.util.RectangleAnchor var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var3, 10.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 10.0d, 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 100.0d, 10.0d);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 1.0d, 10.0d);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 0.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 10.0d, 0.0f, 1.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 100.0d, 10.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, 0.0d, 0.0f, 100.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.rotateShape(var28, 100.0d, (-1.0f), 10.0f);
    boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var26, var28);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, (-1.0d), 1.0f, 10.0f);
    boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var23, var37);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.clone(var23);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    java.awt.Shape var0 = null;
    org.jfree.chart.util.RectangleAnchor var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var0, var1, 0.0d, 10.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var3);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, 0.0d, 1.0f, 10.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var7);
    boolean var14 = org.jfree.chart.util.ShapeUtilities.equal(var1, var7);
    org.jfree.chart.util.RectangleAnchor var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var15, (-1.0d), (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 100.0f, 1.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var14, 10.0d, 1.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 10.0d);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
    java.awt.Shape var10 = null;
    boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var9, var10);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    boolean var13 = org.jfree.chart.util.ShapeUtilities.equal(var7, var9);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, var14, 0.0d, 10.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 0.0d, 1.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 0.0d, 0.0d);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var16, 1.0d, 100.0f, (-1.0f));
    boolean var21 = org.jfree.chart.util.ShapeUtilities.equal(var0, var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 1.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 0.0d);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var7, (-1.0d), 1.0f, 0.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var7, 100.0d, 1.0f, (-1.0f));
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 1.0d);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, (-1.0d), 1.0d);
    boolean var16 = org.jfree.chart.util.ShapeUtilities.equal(var2, var12);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 100.0d, 10.0d);
    org.jfree.chart.util.RectangleAnchor var20 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, var20, 10.0d, 0.0d);
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

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 10.0f);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
//     java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 1.0d, 0.0f, 100.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 10.0d, 1.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var23);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 0.0d, (-1.0f), 100.0f);
//     boolean var29 = org.jfree.chart.util.ShapeUtilities.equal(var21, var28);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var31);
//     boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var21, var31);
//     java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var40, 1.0d, 100.0d);
//     boolean var44 = org.jfree.chart.util.ShapeUtilities.equal(var21, var43);
//     boolean var45 = org.jfree.chart.util.ShapeUtilities.equal(var16, var43);
//     boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var2, var43);
//     java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 10.0f);
//     boolean var50 = org.jfree.chart.util.ShapeUtilities.equal(var43, var49);
//     java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var43, (-1.0d), 100.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var43, 10.0d, 10.0f, 100.0f);
// 
//   }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 100.0d, (-1.0f), 0.0f);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


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
      java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, var38, (-1.0d), 10.0d);
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

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }
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
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 100.0d, 1.0d);
//     java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(100.0f);
//     boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var21, var23);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.rotateShape(var23, 10.0d, 10.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var23, (-1.0d), 10.0f, (-1.0f));
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 1.0f);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, 0.0d, 0.0f, 0.0f);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, 10.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, (-1.0f));
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.clone(var11);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, 1.0d, 1.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.rotateShape(var19, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var19);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 100.0d, 10.0d);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.rotateShape(var32, 100.0d, (-1.0f), 10.0f);
    boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var30, var32);
    java.awt.Shape var40 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var32, 0.0d, 0.0d);
    java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.rotateShape(var40, 10.0d, 0.0f, 1.0f);
    boolean var45 = org.jfree.chart.util.ShapeUtilities.equal(var19, var40);
    boolean var46 = org.jfree.chart.util.ShapeUtilities.equal(var8, var40);
    org.jfree.chart.util.RectangleAnchor var47 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, var47, 0.0d, 100.0d);
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


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
      java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, var18, (-1.0d), 10.0d);
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

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 10.0f);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var17, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 1.0d, 1.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.clone(var27);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.rotateShape(var27, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.rotateShape(var37, 100.0d, (-1.0f), 10.0f);
    boolean var42 = org.jfree.chart.util.ShapeUtilities.equal(var35, var37);
    java.awt.Shape var45 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, 0.0d, 0.0d);
    java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.clone(var37);
    boolean var47 = org.jfree.chart.util.ShapeUtilities.equal(var32, var46);
    boolean var48 = org.jfree.chart.util.ShapeUtilities.equal(var25, var46);
    java.awt.Shape var50 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.rotateShape(var50, 1.0d, 10.0f, 10.0f);
    boolean var55 = org.jfree.chart.util.ShapeUtilities.equal(var46, var54);
    java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var61 = org.jfree.chart.util.ShapeUtilities.rotateShape(var57, 100.0d, (-1.0f), 10.0f);
    java.awt.Shape var64 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var57, 1.0d, 0.0d);
    java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.clone(var66);
    java.awt.Shape var71 = org.jfree.chart.util.ShapeUtilities.rotateShape(var66, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var74 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 1.0d, 1.0d);
    java.awt.Shape var78 = org.jfree.chart.util.ShapeUtilities.rotateShape(var74, (-1.0d), 10.0f, 100.0f);
    java.awt.Shape var79 = org.jfree.chart.util.ShapeUtilities.clone(var78);
    boolean var80 = org.jfree.chart.util.ShapeUtilities.equal(var57, var78);
    boolean var81 = org.jfree.chart.util.ShapeUtilities.equal(var46, var78);
    java.awt.Shape var85 = org.jfree.chart.util.ShapeUtilities.rotateShape(var46, 0.0d, 10.0f, 0.0f);
    boolean var86 = org.jfree.chart.util.ShapeUtilities.equal(var2, var46);
    java.awt.Shape var89 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 100.0d, (-1.0d));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current be