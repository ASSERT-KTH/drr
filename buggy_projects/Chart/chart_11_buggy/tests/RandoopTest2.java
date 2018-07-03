
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(10.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    org.jfree.chart.util.RectangleAnchor var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, var6, 100.0d, (-1.0d));
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
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 100.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, var14, 10.0d, 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 1.0d, 10.0f, 10.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 1.0d, 10.0f, 10.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 100.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    org.jfree.chart.util.RectangleAnchor var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, var19, (-1.0d), 0.0d);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 10.0d, 100.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 1.0d, 0.0f, 100.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.rotateShape(var17, 1.0d, (-1.0f), (-1.0f));
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 10.0d, 1.0d);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var24, 1.0d, 10.0d);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(10.0f, 1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 1.0f, 1.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 10.0d, (-1.0d));
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, 10.0d, 0.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, var14, 0.0d, 100.0d);
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
    assertNotNull(var13);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 1.0d, 1.0d);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, (-1.0d), 0.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, 1.0f, 0.0f);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 10.0d, 1.0d);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var25);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var25, 0.0d, (-1.0f), 100.0f);
    boolean var31 = org.jfree.chart.util.ShapeUtilities.equal(var23, var30);
    boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var18, var23);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 0.0d, 0.0d);
    org.jfree.chart.util.RectangleAnchor var36 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, var36, (-1.0d), 1.0d);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 100.0d, 0.0f, 1.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, (-1.0d), 1.0f, 0.0f);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 1.0d, 1.0f, 1.0f);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var14, 10.0d, 1.0f, (-1.0f));
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.clone(var8);
    boolean var10 = org.jfree.chart.util.ShapeUtilities.equal(var5, var9);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var5);
    org.jfree.chart.util.RectangleAnchor var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, var12, 0.0d, 0.0d);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 10.0d, 0.0d);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var3);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var9);
//     java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 1.0d, 10.0f, 100.0f);
//     java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 1.0d, 1.0f, 1.0f);
//     boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var7, var18);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 10.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var18, (-1.0d), 100.0f, 10.0f);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


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
    java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.clone(var66);
    java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 1.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var71 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var74 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var70, var71, 0.0d, (-1.0d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.rotateShape(var0, (-1.0d), 0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 10.0f, 1.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, (-1.0d), 0.0d);
    org.jfree.chart.util.RectangleAnchor var15 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var11, var15, 0.0d, (-1.0d));
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
    assertNotNull(var14);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
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
    java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 0.0d, 100.0d);
    boolean var52 = org.jfree.chart.util.ShapeUtilities.equal(var15, var51);
    java.awt.Shape var53 = org.jfree.chart.util.ShapeUtilities.clone(var15);
    org.jfree.chart.util.RectangleAnchor var54 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var53, var54, (-1.0d), 1.0d);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var1 = null;
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var1, 0.0d, 0.0f, (-1.0f));
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 1.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var5, var8);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var5, 0.0d, (-1.0d));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, 100.0d, 100.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, 1.0f);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var12, var18);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, 100.0d, 100.0d);
    org.jfree.chart.util.RectangleAnchor var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var20, var24, (-1.0d), 0.0d);
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 0.0d, (-1.0f), 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, 1.0d, 100.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), 0.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.clone(var9);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var9, (-1.0d), (-1.0d));
    boolean var20 = org.jfree.chart.util.ShapeUtilities.equal(var6, var19);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createRegularCross(10.0f, (-1.0f));
    boolean var24 = org.jfree.chart.util.ShapeUtilities.equal(var19, var23);
    java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, 0.0d, 10.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 100.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, (-1.0d), 1.0d);
    boolean var12 = org.jfree.chart.util.ShapeUtilities.equal(var2, var8);
    java.awt.Shape var13 = null;
    boolean var14 = org.jfree.chart.util.ShapeUtilities.equal(var8, var13);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 1.0d, 100.0d);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var23, (-1.0d), 1.0d);
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var17, var23);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((-1.0f), 100.0f);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var30);
    boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var17, var31);
    java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, 100.0d, 1.0d);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(100.0f);
    boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var35, var37);
    boolean var39 = org.jfree.chart.util.ShapeUtilities.equal(var8, var37);
    org.jfree.chart.util.RectangleAnchor var40 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var37, var40, 0.0d, (-1.0d));
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    java.awt.Shape var0 = null;
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 1.0f, (-1.0f));
    boolean var11 = org.jfree.chart.util.ShapeUtilities.equal(var0, var2);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, (-1.0d));
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.clone(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }
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
//     java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21, 10.0d, 1.0d);
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.clone(var26);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, 0.0d, (-1.0f), 100.0f);
//     boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var24, var31);
//     boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var19, var24);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, 0.0d, 0.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var19, 10.0d, (-1.0f), 1.0f);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 0.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.clone(var4);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((-1.0f), 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 0.0d, 0.0d);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, (-1.0d));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), (-1.0f));
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var18, 10.0d, 0.0d);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.clone(var18);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.clone(var22);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var25);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, 1.0d, 10.0f, 100.0f);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 10.0d, 100.0d);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, (-1.0d), 0.0d);
    boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var22, var26);
    boolean var38 = org.jfree.chart.util.ShapeUtilities.equal(var2, var26);
    java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.rotateShape(var26, (-1.0d), 100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var3, 1.0d, 100.0d);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 100.0d, 100.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var3, (-1.0d), 100.0f, (-1.0f));
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 10.0d, 100.0d);
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, 100.0d, (-1.0d));
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, (-1.0d), 0.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var13, var21, (-1.0d), (-1.0d));
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDiamond(10.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


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
    java.awt.Shape var38 = org.jfree.chart.util.ShapeUtilities.rotateShape(var34, 100.0d, 10.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var39 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var42 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var38, var39, 1.0d, 100.0d);
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
    assertNotNull(var38);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }
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
//     java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 10.0d, (-1.0f), 0.0f);
//     java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var25, 10.0d, 1.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 0.0d, 0.0f, 1.0f);
//     java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var35);
//     java.awt.Shape var37 = null;
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, 100.0f, 10.0f);
//     java.awt.Shape var47 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 1.0d, 1.0f, (-1.0f));
//     boolean var48 = org.jfree.chart.util.ShapeUtilities.equal(var37, var39);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 10.0d, (-1.0d));
//     java.awt.Shape var54 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var39, 10.0d, 100.0d);
//     boolean var55 = org.jfree.chart.util.ShapeUtilities.equal(var36, var54);
//     boolean var56 = org.jfree.chart.util.ShapeUtilities.equal(var28, var54);
//     java.awt.Shape var57 = org.jfree.chart.util.ShapeUtilities.clone(var28);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var28, 10.0d, 0.0f, 100.0f);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


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
    java.awt.Shape var40 = null;
    boolean var41 = org.jfree.chart.util.ShapeUtilities.equal(var38, var40);
    
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
    assertTrue(var41 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


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
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 100.0d, 0.0f, 0.0f);
    java.awt.Shape var28 = org.jfree.chart.util.ShapeUtilities.rotateShape(var14, 10.0d, (-1.0f), (-1.0f));
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiamond(100.0f);
    java.awt.Shape var31 = null;
    boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var30, var31);
    boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var28, var30);
    java.awt.Shape var34 = org.jfree.chart.util.ShapeUtilities.clone(var30);
    java.awt.Shape var37 = org.jfree.chart.util.ShapeUtilities.createRegularCross(100.0f, 0.0f);
    java.awt.Shape var41 = org.jfree.chart.util.ShapeUtilities.rotateShape(var37, 100.0d, 1.0f, 100.0f);
    boolean var42 = org.jfree.chart.util.ShapeUtilities.equal(var30, var37);
    org.jfree.chart.util.RectangleAnchor var43 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var46 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, var43, 100.0d, (-1.0d));
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


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
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 0.0d, 100.0d);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 100.0d, 1.0d);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var4, 1.0d, 1.0d);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var5);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 1.0d, 10.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var6, 10.0d, 10.0f, 0.0f);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 100.0f, (-1.0f));
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.rotateShape(var9, (-1.0d), 10.0f, 0.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var13);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var14, 1.0d, 100.0d);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(0.0f, (-1.0f));
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.clone(var20);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, (-1.0d), 1.0f, 1.0f);
    boolean var26 = org.jfree.chart.util.ShapeUtilities.equal(var14, var21);
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var2, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, (-1.0f));
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 0.0f, 100.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var8, 10.0d, 1.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var13);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.rotateShape(var13, 0.0d, (-1.0f), 100.0f);
    boolean var19 = org.jfree.chart.util.ShapeUtilities.equal(var11, var18);
    java.awt.Shape var21 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.rotateShape(var21, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.clone(var21);
    boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var11, var21);
    java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var33 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var30, 1.0d, 100.0d);
    boolean var34 = org.jfree.chart.util.ShapeUtilities.equal(var11, var33);
    boolean var35 = org.jfree.chart.util.ShapeUtilities.equal(var6, var33);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, 0.0d, (-1.0d));
    org.jfree.chart.util.RectangleAnchor var40 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var40, (-1.0d), 0.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 10.0f, 100.0f);
    java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 0.0d);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var12);
    java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.clone(var13);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, (-1.0f), 100.0f);
    org.jfree.chart.util.RectangleAnchor var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var14 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, var11, 1.0d, 100.0d);
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
    assertNotNull(var10);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(10.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 100.0d, 0.0f, 1.0f);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, (-1.0d));
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 100.0d, 10.0d);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 0.0d, 100.0f, (-1.0f));
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, (-1.0d), (-1.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 1.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, (-1.0d), 10.0f, 100.0f);
    org.jfree.chart.util.RectangleAnchor var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var6, var7, 1.0d, 100.0d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 1.0d, 100.0f, 0.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var7, 0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var4, 100.0d, (-1.0f), 10.0f);
    boolean var9 = org.jfree.chart.util.ShapeUtilities.equal(var2, var4);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, 10.0d, 100.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 1.0d, 0.0f, 100.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.clone(var19);
    java.awt.Shape var23 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, (-1.0d), (-1.0d));
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, (-1.0d), (-1.0d));
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var19, (-1.0d), 1.0d);
    boolean var30 = org.jfree.chart.util.ShapeUtilities.equal(var17, var29);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(100.0f, 100.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var4 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 100.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.clone(var7);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var8, 100.0d, 0.0f, 0.0f);
    org.jfree.chart.util.RectangleAnchor var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var12, var13, 100.0d, 10.0d);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.clone(var2);
//     java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 1.0d, 1.0d);
//     java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
//     java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.clone(var12);
//     java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var12, 0.0d, (-1.0f), 100.0f);
//     java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 10.0f);
//     java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.rotateShape(var22, 100.0d, (-1.0f), 10.0f);
//     boolean var27 = org.jfree.chart.util.ShapeUtilities.equal(var20, var22);
//     java.awt.Shape var30 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, 0.0d, 0.0d);
//     java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.clone(var22);
//     boolean var32 = org.jfree.chart.util.ShapeUtilities.equal(var17, var31);
//     boolean var33 = org.jfree.chart.util.ShapeUtilities.equal(var10, var31);
//     java.awt.Shape var35 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
//     java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.rotateShape(var35, 1.0d, 10.0f, 10.0f);
//     boolean var40 = org.jfree.chart.util.ShapeUtilities.equal(var31, var39);
//     java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, (-1.0d), 100.0f, 10.0f);
//     java.awt.Shape var48 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 1.0d, 10.0f, 10.0f);
//     java.awt.Shape var51 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var31, 0.0d, 1.0d);
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var51, (-1.0d), 1.0f, 10.0f);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle(1.0f);
    java.awt.Shape var3 = org.jfree.chart.util.ShapeUtilities.createDiamond(0.0f);
    boolean var4 = org.jfree.chart.util.ShapeUtilities.equal(var1, var3);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.rotateShape(var3, 1.0d, 1.0f, 100.0f);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((-1.0f));
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.clone(var10);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((-1.0f));
    java.awt.Shape var16 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross(1.0f, 100.0f);
    java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, 1.0d, 100.0d);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var16, (-1.0d), 0.0d);
    boolean var23 = org.jfree.chart.util.ShapeUtilities.equal(var13, var16);
    java.awt.Shape var24 = org.jfree.chart.util.ShapeUtilities.clone(var13);
    java.awt.Shape var26 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
    java.awt.Shape var29 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var26, 10.0d, 1.0d);
    java.awt.Shape var31 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var32 = org.jfree.chart.util.ShapeUtilities.clone(var31);
    java.awt.Shape var36 = org.jfree.chart.util.ShapeUtilities.rotateShape(var31, 0.0d, (-1.0f), 100.0f);
    boolean var37 = org.jfree.chart.util.ShapeUtilities.equal(var29, var36);
    java.awt.Shape var39 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var43 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var44 = org.jfree.chart.util.ShapeUtilities.clone(var39);
    boolean var45 = org.jfree.chart.util.ShapeUtilities.equal(var29, var39);
    java.awt.Shape var49 = org.jfree.chart.util.ShapeUtilities.rotateShape(var39, 0.0d, (-1.0f), (-1.0f));
    java.awt.Shape var52 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var49, (-1.0d), 0.0d);
    boolean var53 = org.jfree.chart.util.ShapeUtilities.equal(var13, var49);
    java.awt.Shape var55 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var56 = org.jfree.chart.util.ShapeUtilities.clone(var55);
    java.awt.Shape var59 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var55, 1.0d, 0.0d);
    java.awt.Shape var63 = org.jfree.chart.util.ShapeUtilities.rotateShape(var59, 1.0d, (-1.0f), (-1.0f));
    boolean var64 = org.jfree.chart.util.ShapeUtilities.equal(var49, var63);
    java.awt.Shape var66 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var67 = org.jfree.chart.util.ShapeUtilities.clone(var66);
    java.awt.Shape var70 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 0.0d, 1.0d);
    java.awt.Shape var73 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var66, 0.0d, 100.0d);
    java.awt.Shape var74 = null;
    java.awt.Shape var76 = org.jfree.chart.util.ShapeUtilities.createDiamond((-1.0f));
    java.awt.Shape var80 = org.jfree.chart.util.ShapeUtilities.rotateShape(var76, 0.0d, 100.0f, 10.0f);
    java.awt.Shape var84 = org.jfree.chart.util.ShapeUtilities.rotateShape(var76, 1.0d, 1.0f, (-1.0f));
    boolean var85 = org.jfree.chart.util.ShapeUtilities.equal(var74, var76);
    java.awt.Shape var88 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var76, 10.0d, (-1.0d));
    boolean var89 = org.jfree.chart.util.ShapeUtilities.equal(var66, var88);
    boolean var90 = org.jfree.chart.util.ShapeUtilities.equal(var63, var88);
    boolean var91 = org.jfree.chart.util.ShapeUtilities.equal(var11, var63);
    boolean var92 = org.jfree.chart.util.ShapeUtilities.equal(var3, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    java.awt.Shape var1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(0.0f);
    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.clone(var1);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 1.0d);
    java.awt.Shape var8 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 0.0d, 100.0d);
    java.awt.Shape var12 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, (-1.0d), (-1.0f), 1.0f);
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 100.0d);
    java.awt.Shape var18 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var1, 10.0d, 0.0d);
    java.awt.Shape var22 = org.jfree.chart.util.ShapeUtilities.rotateShape(var1, 10.0d, 100.0f, 1.0f);
    java.awt.Shape var25 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var22, (-1.0d), (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }
// 
// 
//     java.awt.Graphics2D var0 = null;
//     java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createUpTriangle(1.0f);
//     java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, 10.0d, 1.0d);
//     java.awt.Shape var9 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, 10.0f, (-1.0f));
//     org.jfree.chart.util.ShapeUtilities.drawRotatedShape(var0, var2, (-1.0d), 1.0f, 10.0f);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(1.0f, 0.0f);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 0.0d, 0.0f, 1.0f);
    java.awt.Shape var7 = org.jfree.chart.util.ShapeUtilities.clone(var6);
    java.awt.Shape var11 = org.jfree.chart.util.ShapeUtilities.rotateShape(var6, 100.0d, 100.0f, (-1.0f));
    java.awt.Shape var15 = org.jfree.chart.util.ShapeUtilities.rotateShape(var11, 100.0d, (-1.0f), 0.0f);
    org.jfree.chart.util.RectangleAnchor var16 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Shape var19 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var15, var16, 1.0d, (-1.0d));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    java.awt.Shape var2 = org.jfree.chart.util.ShapeUtilities.createRegularCross(0.0f, 100.0f);
    java.awt.Shape var5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var2, (-1.0d), 1.0d);
    java.awt.Shape var6 = org.jfree.chart.util.ShapeUtilities.clone(var2);
    java.awt.Shape var10 = org.jfree.chart.util.ShapeUtilities.rotateShape(var2, 10.0d, (-1.0f), 100.0f);
    java.awt.Shape var13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var10, (-1.0d), 10.0d);
    java.awt.Shape var17 = org.jfree.chart.util.ShapeUtilities.rotateShape(var10, 10.0d, 10.0f, 0.0f);
    java.awt.Shape var20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var17, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }
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
//     java.awt.Shape var27 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(var21