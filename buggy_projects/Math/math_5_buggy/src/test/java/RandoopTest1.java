
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var4.atan();
    org.apache.commons.math3.complex.Complex var8 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var9 = var8.isInfinite();
    org.apache.commons.math3.complex.Complex var11 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var12 = var8.divide(var11);
    org.apache.commons.math3.complex.Complex var14 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var15 = var14.isInfinite();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var14.divide(var17);
    org.apache.commons.math3.complex.Complex var19 = var18.sin();
    org.apache.commons.math3.complex.Complex var20 = var8.multiply(var19);
    org.apache.commons.math3.complex.Complex var21 = var8.log();
    org.apache.commons.math3.complex.Complex var22 = var21.exp();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var24.acos();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var29 = var27.add(0.0d);
    org.apache.commons.math3.complex.Complex var30 = var25.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var21.add(var25);
    org.apache.commons.math3.complex.Complex var32 = var4.multiply(var31);
    org.apache.commons.math3.complex.Complex var34 = var31.add(11013.686910042774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)10.0f, (java.lang.Number)(-1703134.6230029534d), false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var19 = var4.exp();
    double var20 = var19.getArgument();
    org.apache.commons.math3.complex.Complex var22 = var19.multiply(10);
    org.apache.commons.math3.complex.Complex var24 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var25 = var24.sqrt();
    double var26 = var25.getArgument();
    java.lang.String var27 = var25.toString();
    org.apache.commons.math3.complex.Complex var29 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var30 = var29.sqrt();
    double var31 = var30.getArgument();
    java.lang.String var32 = var30.toString();
    org.apache.commons.math3.complex.Complex var33 = var25.divide(var30);
    org.apache.commons.math3.complex.Complex var34 = var25.sqrt1z();
    org.apache.commons.math3.complex.Complex var36 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var37 = var36.isInfinite();
    org.apache.commons.math3.complex.Complex var39 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var40 = var36.divide(var39);
    org.apache.commons.math3.complex.Complex var41 = var36.tan();
    org.apache.commons.math3.complex.Complex var42 = var34.pow(var41);
    org.apache.commons.math3.complex.Complex var45 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var47 = var45.multiply(0);
    org.apache.commons.math3.complex.Complex var50 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var52 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var53 = var52.isInfinite();
    org.apache.commons.math3.complex.Complex var55 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var56 = var52.divide(var55);
    org.apache.commons.math3.complex.Complex var57 = var56.sin();
    org.apache.commons.math3.complex.Complex var58 = var50.add(var57);
    boolean var59 = var47.equals((java.lang.Object)var58);
    org.apache.commons.math3.complex.Complex var61 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var62 = var61.acos();
    org.apache.commons.math3.complex.Complex var64 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var66 = var64.add(0.0d);
    org.apache.commons.math3.complex.Complex var67 = var62.divide(var66);
    org.apache.commons.math3.complex.Complex var68 = var62.sqrt1z();
    org.apache.commons.math3.complex.Complex var69 = var58.add(var68);
    boolean var70 = var58.isInfinite();
    org.apache.commons.math3.complex.Complex var71 = var41.add(var58);
    org.apache.commons.math3.complex.Complex var72 = var19.multiply(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0.0, 0.0)"+ "'", var27.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "(0.0, 0.0)"+ "'", var32.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    double var3 = var2.getArgument();
    java.lang.String var4 = var2.toString();
    org.apache.commons.math3.complex.Complex var5 = var2.sin();
    org.apache.commons.math3.complex.Complex var6 = var2.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0.0, 0.0)"+ "'", var4.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var12 = var1.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var13 = var1.cosh();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var16 = var13.tan();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var19 = var18.isInfinite();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
    org.apache.commons.math3.complex.Complex var23 = var22.sin();
    org.apache.commons.math3.complex.ComplexField var24 = var23.getField();
    org.apache.commons.math3.complex.Complex var26 = var23.pow(0.0d);
    boolean var27 = var23.isNaN();
    boolean var28 = var13.equals((java.lang.Object)var27);
    org.apache.commons.math3.complex.Complex var29 = var13.log();
    double var30 = var13.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 11013.232920103323d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1.5707963267948966d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    boolean var14 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var17 = var16.isInfinite();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var20 = var16.divide(var19);
    org.apache.commons.math3.complex.Complex var21 = var12.subtract(var16);
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    double var28 = var27.getReal();
    double var29 = var27.getReal();
    org.apache.commons.math3.complex.Complex var30 = var27.sin();
    org.apache.commons.math3.complex.Complex var31 = var21.add(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var33 = var31.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    boolean var14 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = var12.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    boolean var14 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var17 = var16.isInfinite();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var20 = var16.divide(var19);
    org.apache.commons.math3.complex.Complex var21 = var12.subtract(var16);
    org.apache.commons.math3.complex.Complex var22 = var16.asin();
    org.apache.commons.math3.complex.Complex var23 = var16.cosh();
    org.apache.commons.math3.complex.Complex var24 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var25 = var16.divide(var24);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(1.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.reciprocal();
//     
//     // Checks the contract:  equals-hashcode on var1 and var2
//     assertTrue("Contract failed: equals-hashcode on var1 and var2", var1.equals(var2) ? var1.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var1
//     assertTrue("Contract failed: equals-hashcode on var2 and var1", var2.equals(var1) ? var2.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0L);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 0 is smaller than the minimum (0)"+ "'", var2.equals("org.apache.commons.math3.exception.NotPositiveException: 0 is smaller than the minimum (0)"));

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(-1L));
//     java.lang.Number var3 = var2.getMin();
//     org.apache.commons.math3.exception.util.Localizable var4 = null;
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     java.lang.Object[] var7 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var5, var7);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var4, var7);
//     org.apache.commons.math3.exception.NullArgumentException var10 = new org.apache.commons.math3.exception.NullArgumentException();
//     var9.addSuppressed((java.lang.Throwable)var10);
//     var2.addSuppressed((java.lang.Throwable)var9);
//     org.apache.commons.math3.exception.util.ExceptionContext var13 = var2.getContext();
//     java.lang.String var14 = var2.toString();
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var17 = var16.tanh();
    double var18 = var16.abs();
    org.apache.commons.math3.complex.Complex var19 = var16.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1.592446836871681d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     java.util.List var10 = var8.nthRoot(100);
//     org.apache.commons.math3.complex.Complex var11 = var8.reciprocal();
//     
//     // Checks the contract:  equals-hashcode on var5 and var11
//     assertTrue("Contract failed: equals-hashcode on var5 and var11", var5.equals(var11) ? var5.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var8 and var11
//     assertTrue("Contract failed: equals-hashcode on var8 and var11", var8.equals(var11) ? var8.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var5
//     assertTrue("Contract failed: equals-hashcode on var11 and var5", var11.equals(var5) ? var11.hashCode() == var5.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var8
//     assertTrue("Contract failed: equals-hashcode on var11 and var8", var11.equals(var8) ? var11.hashCode() == var8.hashCode() : true);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var2.sinh();
    org.apache.commons.math3.complex.Complex var13 = var12.exp();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.9984277357858338d);
    org.apache.commons.math3.complex.Complex var16 = var15.sqrt1z();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var18 = var15.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var4.atan();
    org.apache.commons.math3.complex.Complex var8 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var9 = var8.isInfinite();
    org.apache.commons.math3.complex.Complex var11 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var12 = var8.divide(var11);
    org.apache.commons.math3.complex.Complex var14 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var15 = var14.isInfinite();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var14.divide(var17);
    org.apache.commons.math3.complex.Complex var19 = var18.sin();
    org.apache.commons.math3.complex.Complex var20 = var8.multiply(var19);
    org.apache.commons.math3.complex.Complex var21 = var8.log();
    org.apache.commons.math3.complex.Complex var22 = var21.exp();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var24.acos();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var29 = var27.add(0.0d);
    org.apache.commons.math3.complex.Complex var30 = var25.divide(var29);
    org.apache.commons.math3.complex.Complex var31 = var21.add(var25);
    org.apache.commons.math3.complex.Complex var32 = var4.multiply(var31);
    org.apache.commons.math3.complex.Complex var33 = var31.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
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

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NotPositiveException var3 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10.841470984807897d);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var5 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, (java.lang.Object[])var4);
    org.apache.commons.math3.exception.MathIllegalArgumentException var6 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.0d);
    java.lang.String var4 = var3.toString();
    org.apache.commons.math3.complex.Complex var5 = var3.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(10.0, 0.0)"+ "'", var4.equals("(10.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var5 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var7 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, (java.lang.Object[])var6);
    java.lang.Throwable[] var8 = var7.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    boolean var27 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var30 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var32 = var30.multiply(0);
    org.apache.commons.math3.complex.Complex var33 = var32.log();
    org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var37 = var35.add(0.0d);
    org.apache.commons.math3.complex.Complex var38 = var32.pow(var37);
    org.apache.commons.math3.complex.Complex var39 = var38.conjugate();
    org.apache.commons.math3.complex.Complex var40 = var38.sqrt1z();
    boolean var41 = var15.equals((java.lang.Object)var40);
    org.apache.commons.math3.complex.Complex var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var43 = var40.pow(var42);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.0d), (java.lang.Number)12.833423582473808d, true);

  }

  public void test22() {}
//   public void test22() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(short)(-1), (java.lang.Number)(-0.0d), false);
//     java.lang.Number var5 = var4.getMin();
//     java.lang.String var6 = var4.toString();
// 
//   }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isNaN();
    org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var17.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var20 = var19.cos();
    org.apache.commons.math3.complex.Complex var21 = var19.log();
    org.apache.commons.math3.complex.Complex var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var23 = var21.add(var22);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.sin();
//     org.apache.commons.math3.complex.Complex var7 = var6.log();
//     org.apache.commons.math3.complex.Complex var9 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var10 = var9.sqrt();
//     org.apache.commons.math3.complex.Complex var11 = var10.tanh();
//     org.apache.commons.math3.complex.Complex var13 = var10.divide(6.9746078810578886E-40d);
//     org.apache.commons.math3.complex.Complex var14 = var7.multiply(var10);
//     
//     // Checks the contract:  equals-hashcode on var9 and var14
//     assertTrue("Contract failed: equals-hashcode on var9 and var14", var9.equals(var14) ? var9.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var10 and var14
//     assertTrue("Contract failed: equals-hashcode on var10 and var14", var10.equals(var14) ? var10.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var11 and var14
//     assertTrue("Contract failed: equals-hashcode on var11 and var14", var11.equals(var14) ? var11.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var13 and var14
//     assertTrue("Contract failed: equals-hashcode on var13 and var14", var13.equals(var14) ? var13.hashCode() == var14.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var9
//     assertTrue("Contract failed: equals-hashcode on var14 and var9", var14.equals(var9) ? var14.hashCode() == var9.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var10
//     assertTrue("Contract failed: equals-hashcode on var14 and var10", var14.equals(var10) ? var14.hashCode() == var10.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var11
//     assertTrue("Contract failed: equals-hashcode on var14 and var11", var14.equals(var11) ? var14.hashCode() == var11.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var14 and var13
//     assertTrue("Contract failed: equals-hashcode on var14 and var13", var14.equals(var13) ? var14.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var9 = var8.cosh();
    double var10 = var9.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-0.0d));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)2.833423582473808d, var2, false);
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.util.Localizable var8 = null;
    org.apache.commons.math3.exception.util.Localizable var9 = null;
    org.apache.commons.math3.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var13 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var10, var12);
    org.apache.commons.math3.exception.MathIllegalArgumentException var14 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var9, var12);
    org.apache.commons.math3.exception.NullArgumentException var15 = new org.apache.commons.math3.exception.NullArgumentException(var8, var12);
    org.apache.commons.math3.exception.MathIllegalArgumentException var16 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var7, var12);
    org.apache.commons.math3.exception.NullArgumentException var17 = new org.apache.commons.math3.exception.NullArgumentException(var6, var12);
    org.apache.commons.math3.exception.NullArgumentException var18 = new org.apache.commons.math3.exception.NullArgumentException(var5, var12);
    var4.addSuppressed((java.lang.Throwable)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
    org.apache.commons.math3.complex.Complex var22 = var20.pow((-3.141592653589793d));
    double var23 = var22.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2.6003178103043236E-6d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    org.apache.commons.math3.complex.Complex var10 = var1.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var12 = var1.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var13 = var1.cosh();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var16 = var13.tan();
    org.apache.commons.math3.complex.Complex var18 = var13.add((-3.141592653589793d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var5 = var2.multiply(1);
    java.lang.String var6 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0.0, 2.9932228461263786)"+ "'", var6.equals("(0.0, 2.9932228461263786)"));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d, 1.5707055269358083d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var4 = var3.isInfinite();
    org.apache.commons.math3.complex.Complex var6 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = var3.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var3.tan();
    org.apache.commons.math3.complex.Complex var9 = var3.cosh();
    org.apache.commons.math3.complex.Complex var10 = var3.sqrt1z();
    org.apache.commons.math3.complex.Complex var11 = var1.multiply(var3);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var22 = var21.isInfinite();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var21.divide(var24);
    org.apache.commons.math3.complex.Complex var26 = var25.sin();
    org.apache.commons.math3.complex.Complex var27 = var19.add(var26);
    boolean var28 = var16.equals((java.lang.Object)var27);
    org.apache.commons.math3.complex.Complex var29 = var11.subtract(var27);
    org.apache.commons.math3.complex.Complex var30 = var27.cos();
    org.apache.commons.math3.complex.Complex var31 = var27.sqrt1z();
    org.apache.commons.math3.complex.Complex var32 = var31.exp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.ComplexField var20 = var18.getField();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var23 = var22.isInfinite();
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var22.divide(var25);
    org.apache.commons.math3.complex.Complex var27 = var22.tan();
    org.apache.commons.math3.complex.Complex var28 = var22.cosh();
    org.apache.commons.math3.complex.Complex var29 = var22.sqrt1z();
    org.apache.commons.math3.complex.Complex var31 = var22.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var33 = var22.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var34 = var18.add(var22);
    java.lang.String var35 = var18.toString();
    org.apache.commons.math3.complex.Complex var37 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var39 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var40 = var39.isInfinite();
    org.apache.commons.math3.complex.Complex var42 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var43 = var39.divide(var42);
    org.apache.commons.math3.complex.Complex var44 = var39.tan();
    org.apache.commons.math3.complex.Complex var45 = var39.cosh();
    org.apache.commons.math3.complex.Complex var46 = var39.sqrt1z();
    org.apache.commons.math3.complex.Complex var47 = var37.multiply(var39);
    org.apache.commons.math3.complex.Complex var50 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var52 = var50.multiply(0);
    org.apache.commons.math3.complex.Complex var55 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var57 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var58 = var57.isInfinite();
    org.apache.commons.math3.complex.Complex var60 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var61 = var57.divide(var60);
    org.apache.commons.math3.complex.Complex var62 = var61.sin();
    org.apache.commons.math3.complex.Complex var63 = var55.add(var62);
    boolean var64 = var52.equals((java.lang.Object)var63);
    org.apache.commons.math3.complex.Complex var65 = var47.subtract(var63);
    org.apache.commons.math3.complex.Complex var66 = var63.cos();
    org.apache.commons.math3.complex.Complex var68 = var63.pow(0.0d);
    org.apache.commons.math3.complex.Complex var69 = var18.divide(var63);
    org.apache.commons.math3.complex.Complex var71 = var63.pow(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "(10.841470984807897, 0.0)"+ "'", var35.equals("(10.841470984807897, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(100.0d, 11013.232920103323d);
    double var3 = var2.abs();
    org.apache.commons.math3.complex.Complex var5 = var2.divide((-3.141592653589793d));
    org.apache.commons.math3.complex.Complex var7 = var2.subtract(2.833423582473808d);
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(0.6483608274590866d, 0.0d);
    org.apache.commons.math3.complex.Complex var11 = var10.log();
    org.apache.commons.math3.complex.Complex var12 = var2.multiply(var10);
    org.apache.commons.math3.complex.Complex var13 = var2.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 11013.686910042774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.acos();
    org.apache.commons.math3.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math3.complex.Complex var8 = var5.multiply(1);
    org.apache.commons.math3.complex.Complex var9 = var2.pow(var5);
    org.apache.commons.math3.complex.Complex var10 = var5.tan();
    org.apache.commons.math3.complex.Complex var11 = var5.cos();
    org.apache.commons.math3.complex.Complex var13 = new org.apache.commons.math3.complex.Complex(1084.1470984807897d);
    org.apache.commons.math3.complex.Complex var14 = var5.add(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    java.lang.String var22 = var13.toString();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var24.add(0.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.multiply(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var29 = var13.pow(var24);
    org.apache.commons.math3.complex.Complex var30 = var13.negate();
    double var31 = var30.getArgument();
    org.apache.commons.math3.complex.Complex var33 = var30.multiply(2.6003178103043236E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(8.414709848078965, 0.0)"+ "'", var22.equals("(8.414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-3.141592653589793d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var1.acos();
    org.apache.commons.math3.complex.Complex var15 = var1.sin();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var17.acos();
    org.apache.commons.math3.complex.Complex var20 = var18.add(100.0d);
    org.apache.commons.math3.complex.Complex var21 = var20.sqrt();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var23.tan();
    double var29 = var28.getImaginary();
    org.apache.commons.math3.complex.Complex var32 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var35 = var34.isInfinite();
    org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
    org.apache.commons.math3.complex.Complex var39 = var38.sin();
    org.apache.commons.math3.complex.Complex var40 = var32.add(var39);
    org.apache.commons.math3.complex.Complex var41 = var28.pow(var40);
    org.apache.commons.math3.complex.ComplexField var42 = var40.getField();
    org.apache.commons.math3.complex.Complex var44 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var45 = var44.isInfinite();
    org.apache.commons.math3.complex.Complex var47 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var48 = var44.divide(var47);
    org.apache.commons.math3.complex.Complex var49 = var44.tan();
    org.apache.commons.math3.complex.Complex var50 = var44.cosh();
    org.apache.commons.math3.complex.Complex var51 = var44.sqrt1z();
    org.apache.commons.math3.complex.Complex var53 = var44.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var55 = var44.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var56 = var40.add(var44);
    org.apache.commons.math3.complex.Complex var57 = var21.multiply(var44);
    org.apache.commons.math3.complex.Complex var58 = var57.conjugate();
    org.apache.commons.math3.complex.Complex var60 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var61 = var60.isInfinite();
    org.apache.commons.math3.complex.Complex var63 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var64 = var60.divide(var63);
    org.apache.commons.math3.complex.Complex var65 = var60.tan();
    org.apache.commons.math3.complex.Complex var67 = var60.multiply(0);
    org.apache.commons.math3.complex.Complex var69 = var60.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.ComplexField var70 = var60.getField();
    org.apache.commons.math3.complex.Complex var72 = var60.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var73 = var57.add(var60);
    org.apache.commons.math3.complex.Complex var74 = var73.cos();
    org.apache.commons.math3.complex.Complex var75 = var1.subtract(var73);
    boolean var76 = var1.isNaN();
    org.apache.commons.math3.complex.Complex var77 = var1.exp();
    org.apache.commons.math3.complex.Complex var78 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var79 = var77.divide(var78);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var11 = var6.pow(var10);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var18 = var16.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var19 = var18.log();
    org.apache.commons.math3.complex.Complex var20 = var19.atan();
    org.apache.commons.math3.complex.Complex var21 = var20.atan();
    org.apache.commons.math3.complex.Complex var22 = var6.multiply(var21);
    org.apache.commons.math3.complex.Complex var25 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var27 = var25.multiply(0);
    org.apache.commons.math3.complex.Complex var29 = var27.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var30 = var29.log();
    org.apache.commons.math3.complex.Complex var31 = var30.atan();
    org.apache.commons.math3.complex.Complex var33 = var31.pow(1.0d);
    org.apache.commons.math3.complex.Complex var34 = var31.sinh();
    org.apache.commons.math3.complex.Complex var35 = var34.sin();
    org.apache.commons.math3.complex.Complex var36 = var22.subtract(var35);
    org.apache.commons.math3.complex.Complex var37 = var35.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var18.atan();
    org.apache.commons.math3.complex.Complex var22 = var18.multiply(100.0d);
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var25 = var24.isInfinite();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
    org.apache.commons.math3.complex.Complex var30 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var31 = var30.isInfinite();
    org.apache.commons.math3.complex.Complex var33 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var34 = var30.divide(var33);
    org.apache.commons.math3.complex.Complex var35 = var34.sin();
    org.apache.commons.math3.complex.Complex var36 = var24.multiply(var35);
    org.apache.commons.math3.complex.Complex var38 = var36.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var39 = var18.multiply(var38);
    org.apache.commons.math3.complex.Complex var40 = var39.exp();
    org.apache.commons.math3.complex.Complex var42 = var40.add(9267.315951198088d);
    org.apache.commons.math3.complex.Complex var43 = var40.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    double var6 = var5.getReal();
    double var7 = var5.getReal();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var19.sin();
    org.apache.commons.math3.complex.Complex var21 = var9.multiply(var20);
    org.apache.commons.math3.complex.Complex var22 = var20.cos();
    org.apache.commons.math3.complex.Complex var23 = var22.log();
    org.apache.commons.math3.complex.Complex var24 = var5.subtract(var23);
    org.apache.commons.math3.complex.Complex var25 = var23.negate();
    double var26 = var23.getImaginary();
    org.apache.commons.math3.complex.Complex var27 = var23.cos();
    org.apache.commons.math3.complex.Complex var28 = var27.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    org.apache.commons.math3.complex.Complex var2 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d, 10.841470984807897d);
    double var3 = var2.abs();
    org.apache.commons.math3.complex.Complex var5 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math3.complex.Complex var8 = var5.pow(Double.NaN);
    org.apache.commons.math3.complex.Complex var9 = var5.exp();
    double var10 = var9.abs();
    org.apache.commons.math3.complex.Complex var11 = var9.atan();
    org.apache.commons.math3.complex.Complex var12 = var2.multiply(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.841470984807897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1703134.6230029534d));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(7.618757681450911E-5d, (-0.4626307887385793d));

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)1.0f);
//     java.lang.Number var3 = var2.getMin();
//     java.lang.String var4 = var2.toString();
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var4 = var3.isInfinite();
    org.apache.commons.math3.complex.Complex var6 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = var3.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var3.tan();
    org.apache.commons.math3.complex.Complex var9 = var3.cosh();
    org.apache.commons.math3.complex.Complex var10 = var3.sqrt1z();
    org.apache.commons.math3.complex.Complex var11 = var1.multiply(var3);
    org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var22 = var21.isInfinite();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var25 = var21.divide(var24);
    org.apache.commons.math3.complex.Complex var26 = var25.sin();
    org.apache.commons.math3.complex.Complex var27 = var19.add(var26);
    boolean var28 = var16.equals((java.lang.Object)var27);
    org.apache.commons.math3.complex.Complex var29 = var11.subtract(var27);
    org.apache.commons.math3.complex.Complex var30 = var27.cos();
    org.apache.commons.math3.complex.Complex var31 = var30.cos();
    org.apache.commons.math3.complex.Complex var34 = new org.apache.commons.math3.complex.Complex(10.0d, 0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var35 = var31.pow(var34);
    boolean var36 = var34.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var6 = var4.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var7 = var6.log();
    org.apache.commons.math3.complex.Complex var8 = var7.atan();
    org.apache.commons.math3.complex.Complex var10 = var8.pow(1.0d);
    org.apache.commons.math3.complex.Complex var11 = var8.sinh();
    org.apache.commons.math3.complex.Complex var12 = var8.cos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)100L, (java.lang.Number)(byte)0, true);
    boolean var4 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.9984277357858338d, (java.lang.Number)2.9932228461263786d, false);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    double var5 = var4.getArgument();
    org.apache.commons.math3.complex.ComplexField var6 = var4.getField();
    double var7 = var4.getArgument();
    org.apache.commons.math3.complex.ComplexField var8 = var4.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var3.add(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var1.subtract(var3);
    double var7 = var1.getImaginary();
    org.apache.commons.math3.complex.Complex var8 = var1.sqrt1z();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var8.nthRoot((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    java.lang.Number var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException(var0);
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Number var3 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.Complex var8 = var6.divide(0.0d);
    org.apache.commons.math3.complex.Complex var11 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var13 = var11.multiply(0);
    org.apache.commons.math3.complex.Complex var14 = var13.log();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var16.add(0.0d);
    org.apache.commons.math3.complex.Complex var19 = var13.pow(var18);
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(8.414709848078965d);
    org.apache.commons.math3.complex.Complex var22 = var8.multiply(var13);
    org.apache.commons.math3.complex.Complex var24 = var13.multiply(1.0d);
    org.apache.commons.math3.complex.ComplexField var25 = var24.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    org.apache.commons.math3.complex.Complex var15 = var14.log();
    org.apache.commons.math3.complex.Complex var17 = var14.divide(1.0d);
    org.apache.commons.math3.complex.Complex var18 = var14.negate();
    org.apache.commons.math3.complex.Complex var19 = var14.cos();
    boolean var20 = var14.isInfinite();
    org.apache.commons.math3.complex.Complex var21 = var14.asin();
    org.apache.commons.math3.complex.Complex var22 = var21.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    double var8 = var6.abs();
    org.apache.commons.math3.complex.Complex var9 = var6.reciprocal();
    org.apache.commons.math3.complex.Complex var10 = var9.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var8 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var4, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var8.getContext();
    org.apache.commons.math3.exception.NumberIsTooSmallException var14 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var15 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var19 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var15, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var14.addSuppressed((java.lang.Throwable)var19);
    org.apache.commons.math3.exception.util.ExceptionContext var21 = var19.getContext();
    java.lang.Number var22 = var19.getMin();
    var8.addSuppressed((java.lang.Throwable)var19);
    java.lang.Number var24 = var19.getArgument();
    java.lang.Number var25 = var19.getMin();
    java.lang.Number var26 = var19.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1L)+ "'", var22.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (short)1+ "'", var24.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1L)+ "'", var25.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + (short)1+ "'", var26.equals((short)1));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    double var3 = var2.getArgument();
    java.lang.String var4 = var2.toString();
    org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
    double var8 = var7.getArgument();
    java.lang.String var9 = var7.toString();
    org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
    org.apache.commons.math3.complex.Complex var11 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var13 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var14 = var13.isInfinite();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var17 = var13.divide(var16);
    org.apache.commons.math3.complex.Complex var18 = var13.tan();
    org.apache.commons.math3.complex.Complex var19 = var11.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var11.tanh();
    org.apache.commons.math3.complex.Complex var21 = var11.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0.0, 0.0)"+ "'", var4.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0.0, 0.0)"+ "'", var9.equals("(0.0, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf((-1.087518441483038d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var9 = var8.cosh();
    org.apache.commons.math3.complex.Complex var10 = var9.sqrt1z();
    boolean var11 = var9.isInfinite();
    double var12 = var9.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.167375502789719d);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(-1L));
    boolean var3 = var2.getBoundIsAllowed();
    java.lang.Number var4 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)3.0756143685137425d, (java.lang.Number)(-0.8414709848078967d), false);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var18.atan();
    org.apache.commons.math3.complex.Complex var21 = var20.log();
    org.apache.commons.math3.complex.Complex var22 = var21.sin();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var25 = var24.isInfinite();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
    org.apache.commons.math3.complex.Complex var29 = var28.sin();
    org.apache.commons.math3.complex.Complex var31 = var29.divide(0.0d);
    org.apache.commons.math3.complex.Complex var32 = var21.divide(var31);
    org.apache.commons.math3.complex.Complex var33 = var31.sin();
    org.apache.commons.math3.complex.Complex var34 = var33.sqrt();
    org.apache.commons.math3.complex.Complex var37 = new org.apache.commons.math3.complex.Complex(11013.232920103323d, (-0.0d));
    org.apache.commons.math3.complex.Complex var38 = var37.tan();
    org.apache.commons.math3.complex.Complex var39 = var33.multiply(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
    org.apache.commons.math3.complex.Complex var21 = var19.sinh();
    double var22 = var19.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.009116265160176875d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    boolean var15 = var12.isNaN();
    org.apache.commons.math3.complex.Complex var17 = var12.add(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var17.acos();
    org.apache.commons.math3.complex.Complex var21 = new org.apache.commons.math3.complex.Complex(11013.232920103323d, 2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var22 = var17.add(var21);
    org.apache.commons.math3.complex.Complex var23 = var17.sin();
    org.apache.commons.math3.complex.Complex var24 = var23.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.acos();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
//     org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
//     org.apache.commons.math3.complex.Complex var8 = var6.cos();
//     org.apache.commons.math3.complex.Complex var10 = var8.divide(11013.232920103323d);
//     org.apache.commons.math3.complex.Complex var11 = var8.sin();
//     org.apache.commons.math3.complex.Complex var13 = var11.multiply(0);
//     org.apache.commons.math3.complex.Complex var15 = var13.pow(6.9746078810578886E-40d);
//     org.apache.commons.math3.complex.Complex var18 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var20 = var18.multiply(0);
//     org.apache.commons.math3.complex.Complex var21 = var20.log();
//     double var22 = var20.abs();
//     org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var25 = var24.isInfinite();
//     org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
//     org.apache.commons.math3.complex.Complex var29 = var24.tan();
//     double var30 = var29.getImaginary();
//     org.apache.commons.math3.complex.Complex var32 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var33 = var32.isInfinite();
//     org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var36 = var32.divide(var35);
//     org.apache.commons.math3.complex.Complex var37 = var32.tan();
//     org.apache.commons.math3.complex.Complex var38 = var32.cosh();
//     org.apache.commons.math3.complex.Complex var39 = var29.add(var38);
//     org.apache.commons.math3.complex.Complex var42 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
//     org.apache.commons.math3.complex.Complex var43 = var39.subtract(var42);
//     org.apache.commons.math3.complex.Complex var44 = var39.exp();
//     org.apache.commons.math3.complex.Complex var45 = var44.cos();
//     org.apache.commons.math3.complex.Complex var47 = var44.multiply(0);
//     org.apache.commons.math3.complex.Complex var48 = var44.cosh();
//     org.apache.commons.math3.complex.Complex var49 = var44.cosh();
//     org.apache.commons.math3.complex.Complex var50 = var20.add(var49);
//     org.apache.commons.math3.complex.Complex var51 = var13.subtract(var50);
//     
//     // Checks the contract:  equals-hashcode on var13 and var20
//     assertTrue("Contract failed: equals-hashcode on var13 and var20", var13.equals(var20) ? var13.hashCode() == var20.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var20 and var13
//     assertTrue("Contract failed: equals-hashcode on var20 and var13", var20.equals(var13) ? var20.hashCode() == var13.hashCode() : true);
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var18.atan();
    org.apache.commons.math3.complex.Complex var22 = var20.divide(0.6483608274590866d);
    org.apache.commons.math3.complex.Complex var23 = var22.tanh();
    org.apache.commons.math3.complex.Complex var24 = var23.exp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test65() {}
//   public void test65() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }
// 
// 
//     org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0L);
//     java.lang.Number var2 = var1.getArgument();
//     org.apache.commons.math3.exception.NotPositiveException var4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10.0d);
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var9 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var5, (java.lang.Number)100.0d, (java.lang.Number)2.833423582473808d, false);
//     var4.addSuppressed((java.lang.Throwable)var9);
//     var1.addSuppressed((java.lang.Throwable)var9);
//     java.lang.String var12 = var9.toString();
// 
//   }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.3700827124762082E-54d), (java.lang.Number)(short)1, true);
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.subtract(0.0d);
    org.apache.commons.math3.complex.Complex var17 = var15.multiply(Double.NaN);
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var20 = var19.acos();
    org.apache.commons.math3.complex.Complex var22 = var20.add(100.0d);
    org.apache.commons.math3.complex.Complex var23 = var22.sqrt();
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var26 = var25.isInfinite();
    org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var29 = var25.divide(var28);
    org.apache.commons.math3.complex.Complex var30 = var25.tan();
    double var31 = var30.getImaginary();
    org.apache.commons.math3.complex.Complex var34 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var36 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var37 = var36.isInfinite();
    org.apache.commons.math3.complex.Complex var39 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var40 = var36.divide(var39);
    org.apache.commons.math3.complex.Complex var41 = var40.sin();
    org.apache.commons.math3.complex.Complex var42 = var34.add(var41);
    org.apache.commons.math3.complex.Complex var43 = var30.pow(var42);
    org.apache.commons.math3.complex.ComplexField var44 = var42.getField();
    org.apache.commons.math3.complex.Complex var46 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var47 = var46.isInfinite();
    org.apache.commons.math3.complex.Complex var49 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var50 = var46.divide(var49);
    org.apache.commons.math3.complex.Complex var51 = var46.tan();
    org.apache.commons.math3.complex.Complex var52 = var46.cosh();
    org.apache.commons.math3.complex.Complex var53 = var46.sqrt1z();
    org.apache.commons.math3.complex.Complex var55 = var46.divide((-1.0d));
    org.apache.commons.math3.complex.Complex var57 = var46.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var58 = var42.add(var46);
    org.apache.commons.math3.complex.Complex var59 = var23.multiply(var46);
    org.apache.commons.math3.complex.Complex var60 = var59.conjugate();
    org.apache.commons.math3.complex.Complex var62 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var63 = var62.isInfinite();
    org.apache.commons.math3.complex.Complex var65 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var66 = var62.divide(var65);
    org.apache.commons.math3.complex.Complex var67 = var62.tan();
    org.apache.commons.math3.complex.Complex var68 = var62.cosh();
    org.apache.commons.math3.complex.Complex var69 = var68.tanh();
    org.apache.commons.math3.complex.Complex var71 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var72 = var69.pow(var71);
    org.apache.commons.math3.complex.Complex var73 = var59.divide(var71);
    org.apache.commons.math3.complex.Complex var74 = var15.multiply(var71);
    org.apache.commons.math3.complex.Complex var75 = var15.reciprocal();
    org.apache.commons.math3.complex.Complex var76 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var77 = var15.divide(var76);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.8414709848078965d, 0.8414709848078965d);
    org.apache.commons.math3.complex.Complex var3 = var2.asin();
    org.apache.commons.math3.complex.Complex var4 = var2.cosh();
    java.util.List var6 = var4.nthRoot(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1.0d);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.0d);
    org.apache.commons.math3.complex.Complex var4 = var1.tanh();
    boolean var5 = var4.isNaN();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var7.tan();
    org.apache.commons.math3.complex.Complex var13 = var7.cosh();
    org.apache.commons.math3.complex.Complex var14 = var13.tanh();
    org.apache.commons.math3.complex.Complex var15 = var13.log();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var18 = var17.isInfinite();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var21 = var17.divide(var20);
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var27.sin();
    org.apache.commons.math3.complex.Complex var29 = var17.multiply(var28);
    org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var32 = var31.isInfinite();
    org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var35 = var31.divide(var34);
    org.apache.commons.math3.complex.Complex var36 = var31.tan();
    org.apache.commons.math3.complex.Complex var37 = var29.multiply(var31);
    java.lang.String var38 = var29.toString();
    org.apache.commons.math3.complex.Complex var39 = var15.subtract(var29);
    org.apache.commons.math3.complex.Complex var41 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var42 = var41.isInfinite();
    org.apache.commons.math3.complex.Complex var44 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var45 = var41.divide(var44);
    org.apache.commons.math3.complex.Complex var46 = var41.tan();
    double var47 = var46.getImaginary();
    org.apache.commons.math3.complex.Complex var49 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var50 = var49.isInfinite();
    org.apache.commons.math3.complex.Complex var52 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var53 = var49.divide(var52);
    org.apache.commons.math3.complex.Complex var54 = var49.tan();
    org.apache.commons.math3.complex.Complex var55 = var49.cosh();
    org.apache.commons.math3.complex.Complex var56 = var46.add(var55);
    org.apache.commons.math3.complex.Complex var58 = var46.multiply(1);
    org.apache.commons.math3.complex.Complex var59 = var58.negate();
    org.apache.commons.math3.complex.Complex var60 = var59.log();
    org.apache.commons.math3.complex.Complex var61 = var15.divide(var60);
    org.apache.commons.math3.complex.Complex var62 = var4.divide(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "(8.414709848078965, 0.0)"+ "'", var38.equals("(8.414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1), (java.lang.Number)1.0f, false);
    java.lang.Throwable[] var5 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var3 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var2);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var27 = var26.reciprocal();
    org.apache.commons.math3.complex.Complex var30 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var32 = var30.multiply(0);
    org.apache.commons.math3.complex.Complex var34 = var32.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var35 = var34.log();
    org.apache.commons.math3.complex.Complex var36 = var35.atan();
    org.apache.commons.math3.complex.Complex var38 = var36.pow(1.0d);
    org.apache.commons.math3.complex.Complex var39 = var38.tan();
    org.apache.commons.math3.complex.Complex var40 = var39.tanh();
    org.apache.commons.math3.complex.Complex var41 = var27.multiply(var39);
    org.apache.commons.math3.complex.Complex var42 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var43 = var41.pow(var42);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(11013.232920103323d);
//     org.apache.commons.math3.complex.Complex var2 = var1.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var1 and var2
//     assertTrue("Contract failed: equals-hashcode on var1 and var2", var1.equals(var2) ? var1.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var1
//     assertTrue("Contract failed: equals-hashcode on var2 and var1", var2.equals(var1) ? var2.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var4.pow(var9);
    boolean var11 = var9.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.acos();
//     org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
//     org.apache.commons.math3.complex.Complex var4 = var3.cos();
//     org.apache.commons.math3.complex.Complex var5 = var3.tanh();
//     org.apache.commons.math3.complex.Complex var6 = var3.asin();
//     org.apache.commons.math3.complex.Complex var7 = var6.tan();
//     org.apache.commons.math3.complex.Complex var8 = var7.cosh();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var11 = var10.isInfinite();
//     org.apache.commons.math3.complex.Complex var13 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var14 = var10.divide(var13);
//     org.apache.commons.math3.complex.Complex var15 = var10.tan();
//     double var16 = var15.getImaginary();
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var19 = var18.isInfinite();
//     org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
//     org.apache.commons.math3.complex.Complex var23 = var18.tan();
//     org.apache.commons.math3.complex.Complex var24 = var18.cosh();
//     org.apache.commons.math3.complex.Complex var25 = var15.add(var24);
//     org.apache.commons.math3.complex.Complex var26 = var15.atan();
//     org.apache.commons.math3.complex.Complex var27 = var8.multiply(var26);
//     org.apache.commons.math3.complex.Complex var28 = var26.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var26 and var28
//     assertTrue("Contract failed: equals-hashcode on var26 and var28", var26.equals(var28) ? var26.hashCode() == var28.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var28 and var26
//     assertTrue("Contract failed: equals-hashcode on var28 and var26", var28.equals(var26) ? var28.hashCode() == var26.hashCode() : true);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var4.log();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var7.tan();
    org.apache.commons.math3.complex.Complex var13 = var7.cosh();
    org.apache.commons.math3.complex.Complex var14 = var13.tanh();
    org.apache.commons.math3.complex.Complex var15 = var4.pow(var13);
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var18 = var17.isInfinite();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var21 = var17.divide(var20);
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var27.sin();
    org.apache.commons.math3.complex.Complex var29 = var17.multiply(var28);
    org.apache.commons.math3.complex.Complex var31 = var29.add(0.0d);
    org.apache.commons.math3.complex.Complex var32 = var31.tan();
    org.apache.commons.math3.complex.Complex var33 = var31.log();
    org.apache.commons.math3.complex.Complex var35 = var31.multiply(11013.686910042774d);
    org.apache.commons.math3.complex.Complex var36 = var31.tan();
    org.apache.commons.math3.complex.Complex var37 = var4.add(var36);
    org.apache.commons.math3.complex.ComplexField var38 = var4.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-3.141592653589793d), (java.lang.Number)0.8414709848078965d, false);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: -3.142 is smaller than, or equal to, the minimum (0.841)"+ "'", var4.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: -3.142 is smaller than, or equal to, the minimum (0.841)"));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(-1.087518441483038d));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.Complex var8 = var6.divide(0.0d);
    org.apache.commons.math3.complex.Complex var11 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var13 = var11.multiply(0);
    org.apache.commons.math3.complex.Complex var14 = var13.log();
    org.apache.commons.math3.complex.Complex var16 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var18 = var16.add(0.0d);
    org.apache.commons.math3.complex.Complex var19 = var13.pow(var18);
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(8.414709848078965d);
    org.apache.commons.math3.complex.Complex var22 = var8.multiply(var13);
    org.apache.commons.math3.complex.Complex var24 = var13.multiply(1.0d);
    org.apache.commons.math3.complex.Complex var26 = var24.add(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)10);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Number var4 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NotPositiveException var3 = new org.apache.commons.math3.exception.NotPositiveException(var1, (java.lang.Number)10);
    java.lang.Number var4 = var3.getArgument();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.apache.commons.math3.exception.NullArgumentException var6 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var5);
    org.apache.commons.math3.exception.util.ExceptionContext var7 = var6.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    org.apache.commons.math3.complex.Complex var15 = var9.cosh();
    org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
    double var17 = var15.getImaginary();
    double var18 = var15.getReal();
    org.apache.commons.math3.complex.Complex var19 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var19.subtract(11013.232920103323d);
    java.util.List var23 = var19.nthRoot(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 11013.232920103323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = var2.add(100.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.sqrt();
    boolean var7 = var5.equals((java.lang.Object)(-0.0d));
    org.apache.commons.math3.complex.Complex var8 = var5.log();
    org.apache.commons.math3.complex.Complex var9 = var8.conjugate();
    org.apache.commons.math3.complex.Complex var11 = var9.add(2.9932228461263786d);
    double var12 = var11.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.296052957206104d);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var5.sin();
    org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
    org.apache.commons.math3.complex.Complex var8 = var6.acos();
    org.apache.commons.math3.complex.Complex var9 = var8.cosh();
    org.apache.commons.math3.complex.Complex var10 = var9.sqrt1z();
    org.apache.commons.math3.complex.Complex var12 = var10.multiply((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var2.sinh();
    org.apache.commons.math3.complex.Complex var13 = var12.exp();
    org.apache.commons.math3.complex.Complex var15 = var13.multiply(0.9984277357858338d);
    org.apache.commons.math3.complex.Complex var16 = var13.sqrt1z();
    double var17 = var13.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == Double.POSITIVE_INFINITY);

  }

  public void test87() {}
//   public void test87() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     double var7 = var6.getImaginary();
//     org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var10 = var9.isInfinite();
//     org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
//     org.apache.commons.math3.complex.Complex var14 = var9.tan();
//     org.apache.commons.math3.complex.Complex var15 = var9.cosh();
//     org.apache.commons.math3.complex.Complex var16 = var6.add(var15);
//     org.apache.commons.math3.complex.Complex var19 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
//     org.apache.commons.math3.complex.Complex var20 = var16.subtract(var19);
//     org.apache.commons.math3.complex.Complex var21 = var16.exp();
//     org.apache.commons.math3.complex.Complex var22 = var21.cos();
//     org.apache.commons.math3.complex.Complex var23 = var22.tan();
//     double var24 = var22.abs();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == Double.NaN);
// 
//   }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.9984277357858338d, (java.lang.Number)0.8414709848078965d, true);
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var3 = var2.sqrt1z();
    org.apache.commons.math3.complex.Complex var5 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var9 = var7.add(0.0d);
    org.apache.commons.math3.complex.Complex var10 = var5.subtract(var7);
    org.apache.commons.math3.complex.Complex var11 = var5.sinh();
    org.apache.commons.math3.complex.Complex var12 = var5.sqrt();
    org.apache.commons.math3.complex.Complex var13 = var2.divide(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Number var2 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)22026.465794806754d, var2, false);
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10);
    org.apache.commons.math3.exception.util.ExceptionContext var2 = var1.getContext();
    java.lang.String var3 = var1.toString();
    org.apache.commons.math3.exception.util.ExceptionContext var4 = var1.getContext();
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var11 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var8, var10);
    org.apache.commons.math3.exception.NullArgumentException var12 = new org.apache.commons.math3.exception.NullArgumentException(var7, var10);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var14 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var6, (java.lang.Object[])var13);
    org.apache.commons.math3.exception.NullArgumentException var15 = new org.apache.commons.math3.exception.NullArgumentException(var5, (java.lang.Object[])var13);
    org.apache.commons.math3.exception.NumberIsTooSmallException var19 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
    java.lang.Number var20 = var19.getMin();
    java.lang.String var21 = var19.toString();
    java.lang.Throwable[] var22 = var19.getSuppressed();
    var15.addSuppressed((java.lang.Throwable)var19);
    org.apache.commons.math3.exception.util.Localizable var24 = null;
    org.apache.commons.math3.exception.util.Localizable var25 = null;
    org.apache.commons.math3.exception.util.Localizable var26 = null;
    java.lang.Object[] var28 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var29 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var26, var28);
    org.apache.commons.math3.exception.NullArgumentException var30 = new org.apache.commons.math3.exception.NullArgumentException(var25, var28);
    org.apache.commons.math3.exception.NullArgumentException var31 = new org.apache.commons.math3.exception.NullArgumentException(var24, var28);
    org.apache.commons.math3.exception.NotPositiveException var33 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)10);
    java.lang.Number var34 = var33.getArgument();
    var31.addSuppressed((java.lang.Throwable)var33);
    var19.addSuppressed((java.lang.Throwable)var33);
    var1.addSuppressed((java.lang.Throwable)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "org.apache.commons.math3.exception.NotPositiveException: 10 is smaller than the minimum (0)"+ "'", var3.equals("org.apache.commons.math3.exception.NotPositiveException: 10 is smaller than the minimum (0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 0+ "'", var20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: -1 is smaller than the minimum (0)"+ "'", var21.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: -1 is smaller than the minimum (0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + 10+ "'", var34.equals(10));

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var11.log();
    org.apache.commons.math3.complex.Complex var13 = var12.tan();
    org.apache.commons.math3.complex.Complex var14 = var13.negate();
    org.apache.commons.math3.complex.Complex var15 = var13.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
//     double var3 = var2.getArgument();
//     java.lang.String var4 = var2.toString();
//     org.apache.commons.math3.complex.Complex var6 = new org.apache.commons.math3.complex.Complex(0.0d);
//     org.apache.commons.math3.complex.Complex var7 = var6.sqrt();
//     double var8 = var7.getArgument();
//     java.lang.String var9 = var7.toString();
//     org.apache.commons.math3.complex.Complex var10 = var2.divide(var7);
//     org.apache.commons.math3.complex.Complex var13 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var16 = var15.isInfinite();
//     org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
//     org.apache.commons.math3.complex.Complex var20 = var19.sin();
//     org.apache.commons.math3.complex.Complex var21 = var13.add(var20);
//     org.apache.commons.math3.complex.Complex var22 = var13.tan();
//     org.apache.commons.math3.complex.Complex var23 = var22.log();
//     org.apache.commons.math3.complex.Complex var24 = var23.tan();
//     double var25 = var24.getReal();
//     org.apache.commons.math3.complex.Complex var26 = var7.add(var24);
//     org.apache.commons.math3.complex.Complex var27 = var7.asin();
//     
//     // Checks the contract:  equals-hashcode on var1 and var27
//     assertTrue("Contract failed: equals-hashcode on var1 and var27", var1.equals(var27) ? var1.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var2 and var27
//     assertTrue("Contract failed: equals-hashcode on var2 and var27", var2.equals(var27) ? var2.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var6 and var27
//     assertTrue("Contract failed: equals-hashcode on var6 and var27", var6.equals(var27) ? var6.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var7 and var27
//     assertTrue("Contract failed: equals-hashcode on var7 and var27", var7.equals(var27) ? var7.hashCode() == var27.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var1
//     assertTrue("Contract failed: equals-hashcode on var27 and var1", var27.equals(var1) ? var27.hashCode() == var1.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var2
//     assertTrue("Contract failed: equals-hashcode on var27 and var2", var27.equals(var2) ? var27.hashCode() == var2.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var6
//     assertTrue("Contract failed: equals-hashcode on var27 and var6", var27.equals(var6) ? var27.hashCode() == var6.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var27 and var7
//     assertTrue("Contract failed: equals-hashcode on var27 and var7", var27.equals(var7) ? var27.hashCode() == var7.hashCode() : true);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    org.apache.commons.math3.complex.Complex var4 = var1.multiply(100.0d);
    boolean var5 = var1.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(11013.686910042774d, 10.841470984807897d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var2.nthRoot(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 1};
    org.apache.commons.math3.exception.MathIllegalArgumentException var4 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var3);
    org.apache.commons.math3.exception.MathIllegalArgumentException var5 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var3);
    org.apache.commons.math3.exception.util.ExceptionContext var6 = var5.getContext();
    org.apache.commons.math3.exception.NotPositiveException var8 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)9.999999999999977d);
    var5.addSuppressed((java.lang.Throwable)var8);
    boolean var10 = var8.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var3.add(0.0d);
    org.apache.commons.math3.complex.Complex var6 = var1.subtract(var3);
    org.apache.commons.math3.complex.Complex var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.complex.Complex var8 = var6.add(var7);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)1.5707963267948966d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(6.9746078810578886E-40d);
    org.apache.commons.math3.complex.Complex var3 = var1.subtract(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var4 = var3.negate();
    org.apache.commons.math3.complex.Complex var5 = var4.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var19 = var18.isInfinite();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var22 = var18.divide(var21);
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var25 = var24.isInfinite();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.divide(var27);
    org.apache.commons.math3.complex.Complex var29 = var28.sin();
    org.apache.commons.math3.complex.Complex var30 = var18.multiply(var29);
    boolean var31 = var29.isInfinite();
    org.apache.commons.math3.complex.Complex var32 = var29.tan();
    java.lang.String var33 = var29.toString();
    org.apache.commons.math3.complex.Complex var34 = var29.reciprocal();
    org.apache.commons.math3.complex.Complex var35 = var34.tanh();
    org.apache.commons.math3.complex.Complex var36 = var16.multiply(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "(0.8414709848078965, 0.0)"+ "'", var33.equals("(0.8414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var9.tan();
    double var15 = var14.getImaginary();
    org.apache.commons.math3.complex.Complex var18 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var21 = var20.isInfinite();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var24 = var20.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var24.sin();
    org.apache.commons.math3.complex.Complex var26 = var18.add(var25);
    org.apache.commons.math3.complex.Complex var27 = var14.pow(var26);
    org.apache.commons.math3.complex.Complex var28 = var26.atan();
    org.apache.commons.math3.complex.Complex var30 = var26.multiply(100.0d);
    boolean var31 = var6.equals((java.lang.Object)var26);
    org.apache.commons.math3.complex.Complex var32 = var6.asin();
    org.apache.commons.math3.complex.Complex var34 = var6.subtract((-3.141592653589793d));
    org.apache.commons.math3.complex.Complex var35 = var34.tan();
    org.apache.commons.math3.complex.Complex var36 = var35.negate();
    org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var39 = var38.isInfinite();
    org.apache.commons.math3.complex.Complex var41 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var42 = var38.divide(var41);
    org.apache.commons.math3.complex.Complex var43 = var38.tan();
    double var44 = var43.getImaginary();
    org.apache.commons.math3.complex.Complex var47 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var49 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var50 = var49.isInfinite();
    org.apache.commons.math3.complex.Complex var52 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var53 = var49.divide(var52);
    org.apache.commons.math3.complex.Complex var54 = var53.sin();
    org.apache.commons.math3.complex.Complex var55 = var47.add(var54);
    org.apache.commons.math3.complex.Complex var56 = var43.pow(var55);
    org.apache.commons.math3.complex.Complex var57 = var55.atan();
    org.apache.commons.math3.complex.Complex var58 = var57.log();
    org.apache.commons.math3.complex.Complex var59 = var58.sin();
    org.apache.commons.math3.complex.Complex var61 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var62 = var61.isInfinite();
    org.apache.commons.math3.complex.Complex var64 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var65 = var61.divide(var64);
    org.apache.commons.math3.complex.Complex var66 = var65.sin();
    org.apache.commons.math3.complex.Complex var68 = var66.divide(0.0d);
    org.apache.commons.math3.complex.Complex var69 = var58.divide(var68);
    org.apache.commons.math3.complex.Complex var70 = var69.asin();
    org.apache.commons.math3.complex.Complex var72 = var70.subtract((-1.087518441483038d));
    org.apache.commons.math3.complex.Complex var73 = var35.add(var72);
    org.apache.commons.math3.complex.Complex var76 = org.apache.commons.math3.complex.Complex.valueOf(10.841470984807897d, (-1.0d));
    boolean var77 = var35.equals((java.lang.Object)10.841470984807897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var5 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math3.exception.NullArgumentException var7 = new org.apache.commons.math3.exception.NullArgumentException(var1, (java.lang.Object[])var6);
    org.apache.commons.math3.exception.NullArgumentException var8 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var14 = var12.cos();
    org.apache.commons.math3.complex.Complex var15 = var12.exp();
    org.apache.commons.math3.complex.Complex var17 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var18 = var17.isInfinite();
    org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var21 = var17.divide(var20);
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var27.sin();
    org.apache.commons.math3.complex.Complex var29 = var17.multiply(var28);
    org.apache.commons.math3.complex.Complex var30 = var28.cos();
    org.apache.commons.math3.complex.Complex var31 = var30.log();
    org.apache.commons.math3.complex.Complex var33 = var30.divide(1.0d);
    org.apache.commons.math3.complex.Complex var34 = var30.negate();
    org.apache.commons.math3.complex.Complex var35 = var30.cos();
    org.apache.commons.math3.complex.Complex var36 = var30.tanh();
    org.apache.commons.math3.complex.Complex var37 = var12.pow(var36);
    org.apache.commons.math3.complex.Complex var38 = var37.sqrt();
    org.apache.commons.math3.complex.Complex var39 = var37.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(1.5707055269358083d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.negate();
    org.apache.commons.math3.complex.ComplexField var9 = var7.getField();
    org.apache.commons.math3.complex.Complex var10 = var7.reciprocal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(2.9932228461263786d, 35.292993472120365d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var5 = var4.isInfinite();
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var8 = var4.divide(var7);
    org.apache.commons.math3.complex.Complex var9 = var8.sin();
    org.apache.commons.math3.complex.Complex var10 = var2.add(var9);
    org.apache.commons.math3.complex.Complex var11 = var2.tan();
    org.apache.commons.math3.complex.Complex var12 = var2.sinh();
    org.apache.commons.math3.complex.Complex var13 = var12.exp();
    org.apache.commons.math3.complex.Complex var14 = var13.asin();
    org.apache.commons.math3.complex.Complex var15 = var13.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    double var8 = var2.getReal();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var10.acos();
    org.apache.commons.math3.complex.Complex var13 = var11.add(100.0d);
    org.apache.commons.math3.complex.Complex var14 = var13.sqrt();
    boolean var16 = var14.equals((java.lang.Object)(-0.0d));
    org.apache.commons.math3.complex.Complex var17 = var14.log();
    org.apache.commons.math3.complex.Complex var19 = var17.add((-1.087518441483038d));
    org.apache.commons.math3.complex.Complex var20 = var17.atan();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var22.acos();
    org.apache.commons.math3.complex.Complex var25 = var23.add(100.0d);
    org.apache.commons.math3.complex.Complex var26 = var25.cos();
    org.apache.commons.math3.complex.Complex var27 = var17.multiply(var25);
    org.apache.commons.math3.complex.Complex var28 = var2.divide(var27);
    boolean var29 = var27.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.acos();
    org.apache.commons.math3.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math3.complex.Complex var8 = var5.multiply(1);
    org.apache.commons.math3.complex.Complex var9 = var2.pow(var5);
    org.apache.commons.math3.complex.Complex var10 = var9.asin();
    org.apache.commons.math3.complex.Complex var11 = var10.atan();
    org.apache.commons.math3.complex.Complex var12 = var10.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var5.sin();
//     org.apache.commons.math3.complex.ComplexField var7 = var6.getField();
//     org.apache.commons.math3.complex.Complex var8 = var6.acos();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(0.009116265160176875d);
//     org.apache.commons.math3.complex.Complex var11 = var6.pow(var10);
//     org.apache.commons.math3.complex.Complex var14 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var16 = var14.multiply(0);
//     org.apache.commons.math3.complex.Complex var18 = var16.pow((-1.0d));
//     org.apache.commons.math3.complex.Complex var19 = var18.log();
//     org.apache.commons.math3.complex.Complex var20 = var19.atan();
//     org.apache.commons.math3.complex.Complex var21 = var20.atan();
//     org.apache.commons.math3.complex.Complex var22 = var6.multiply(var21);
//     double var23 = var21.getArgument();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == Double.NaN);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var3 = var1.add(0.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.multiply(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var8 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var10 = var8.multiply(0);
    org.apache.commons.math3.complex.Complex var12 = var10.pow((-1.0d));
    org.apache.commons.math3.complex.Complex var13 = var12.log();
    org.apache.commons.math3.complex.Complex var14 = var5.subtract(var13);
    org.apache.commons.math3.complex.Complex var16 = var14.multiply(8.414709848078965d);
    org.apache.commons.math3.complex.ComplexField var17 = var14.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.NotPositiveException var4 = new org.apache.commons.math3.exception.NotPositiveException(var2, (java.lang.Number)(-1L));
    boolean var5 = var4.getBoundIsAllowed();
    java.lang.Throwable[] var6 = var4.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var7 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, (java.lang.Object[])var6);
    org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var5 = var2.atan();
    org.apache.commons.math3.complex.Complex var6 = var5.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)8.414709848078965d);
//     boolean var2 = var1.getBoundIsAllowed();
//     org.apache.commons.math3.exception.util.Localizable var3 = null;
//     org.apache.commons.math3.exception.util.Localizable var4 = null;
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     org.apache.commons.math3.exception.util.Localizable var6 = null;
//     java.lang.Object[] var8 = new java.lang.Object[] { 1};
//     org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var6, var8);
//     org.apache.commons.math3.exception.NullArgumentException var10 = new org.apache.commons.math3.exception.NullArgumentException(var5, var8);
//     java.lang.Throwable[] var11 = var10.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalArgumentException var12 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var4, (java.lang.Object[])var11);
//     org.apache.commons.math3.exception.NullArgumentException var13 = new org.apache.commons.math3.exception.NullArgumentException(var3, (java.lang.Object[])var11);
//     org.apache.commons.math3.exception.NumberIsTooSmallException var17 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)0, true);
//     java.lang.Number var18 = var17.getMin();
//     java.lang.String var19 = var17.toString();
//     java.lang.Throwable[] var20 = var17.getSuppressed();
//     var13.addSuppressed((java.lang.Throwable)var17);
//     java.lang.Number var22 = var17.getMin();
//     var1.addSuppressed((java.lang.Throwable)var17);
//     java.lang.Throwable var24 = null;
//     var1.addSuppressed(var24);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    double var7 = var6.getImaginary();
    org.apache.commons.math3.complex.Complex var10 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var13 = var12.isInfinite();
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var16 = var12.divide(var15);
    org.apache.commons.math3.complex.Complex var17 = var16.sin();
    org.apache.commons.math3.complex.Complex var18 = var10.add(var17);
    org.apache.commons.math3.complex.Complex var19 = var6.pow(var18);
    org.apache.commons.math3.complex.Complex var20 = var19.acos();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var22.acos();
    org.apache.commons.math3.complex.Complex var24 = var19.subtract(var22);
    boolean var25 = var22.isInfinite();
    org.apache.commons.math3.complex.Complex var27 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var28 = var27.isInfinite();
    org.apache.commons.math3.complex.Complex var30 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var31 = var27.divide(var30);
    double var32 = var31.getReal();
    double var33 = var31.getReal();
    org.apache.commons.math3.complex.Complex var35 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var36 = var35.isInfinite();
    org.apache.commons.math3.complex.Complex var38 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var39 = var35.divide(var38);
    org.apache.commons.math3.complex.Complex var41 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var42 = var41.isInfinite();
    org.apache.commons.math3.complex.Complex var44 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var45 = var41.divide(var44);
    org.apache.commons.math3.complex.Complex var46 = var45.sin();
    org.apache.commons.math3.complex.Complex var47 = var35.multiply(var46);
    org.apache.commons.math3.complex.Complex var48 = var46.cos();
    org.apache.commons.math3.complex.Complex var49 = var48.log();
    org.apache.commons.math3.complex.Complex var50 = var31.subtract(var49);
    org.apache.commons.math3.complex.Complex var51 = var49.negate();
    org.apache.commons.math3.complex.Complex var52 = var51.tan();
    org.apache.commons.math3.complex.Complex var53 = var22.subtract(var52);
    java.lang.String var54 = var53.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "(9.570216780630092, 0.0)"+ "'", var54.equals("(9.570216780630092, 0.0)"));

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     boolean var2 = var1.isInfinite();
//     org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
//     org.apache.commons.math3.complex.Complex var6 = var1.tan();
//     org.apache.commons.math3.complex.Complex var7 = var1.cosh();
//     org.apache.commons.math3.complex.Complex var8 = var7.tanh();
//     org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var11 = var8.pow(var10);
//     org.apache.commons.math3.complex.Complex var12 = var10.sinh();
//     org.apache.commons.math3.complex.Complex var15 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
//     org.apache.commons.math3.complex.Complex var17 = var15.multiply(0);
//     org.apache.commons.math3.complex.Complex var18 = var17.log();
//     org.apache.commons.math3.complex.Complex var20 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var22 = var20.add(0.0d);
//     org.apache.commons.math3.complex.Complex var23 = var17.pow(var22);
//     org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
//     org.apache.commons.math3.complex.Complex var26 = var25.acos();
//     org.apache.commons.math3.complex.Complex var27 = var26.sqrt1z();
//     org.apache.commons.math3.complex.Complex var29 = var26.multiply(1);
//     double var30 = var26.getImaginary();
//     org.apache.commons.math3.complex.Complex var31 = var23.divide(var26);
//     boolean var32 = var10.equals((java.lang.Object)var26);
//     org.apache.commons.math3.complex.Complex var34 = var10.divide(0.0d);
//     double var35 = var34.getImaginary();
//     org.apache.commons.math3.complex.Complex var37 = var34.divide(1.5707963267948966d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var23);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var27);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var30 == 2.9932228461263786d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var32 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var35 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
// 
//   }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }
// 
// 
//     org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(11013.232920103323d, 0.0d);
//     org.apache.commons.math3.complex.Complex var3 = var2.reciprocal();
//     org.apache.commons.math3.complex.Complex var4 = var3.conjugate();
//     
//     // Checks the contract:  equals-hashcode on var3 and var4
//     assertTrue("Contract failed: equals-hashcode on var3 and var4", var3.equals(var4) ? var3.hashCode() == var4.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var4 and var3
//     assertTrue("Contract failed: equals-hashcode on var4 and var3", var4.equals(var3) ? var4.hashCode() == var3.hashCode() : true);
// 
//   }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)1.5707963267948966d, (java.lang.Number)11013.686910042774d, false);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)2.833423582473808d, var2, false);
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var6 = var1.tan();
    org.apache.commons.math3.complex.Complex var7 = var1.cosh();
    org.apache.commons.math3.complex.Complex var8 = var7.tanh();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var10.acos();
    org.apache.commons.math3.complex.Complex var13 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var11.divide(var15);
    double var17 = var11.getReal();
    org.apache.commons.math3.complex.Complex var19 = var11.subtract(0.0d);
    boolean var20 = var7.equals((java.lang.Object)var11);
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var23 = var22.isInfinite();
    org.apache.commons.math3.complex.Complex var25 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var22.divide(var25);
    org.apache.commons.math3.complex.Complex var27 = var26.sin();
    org.apache.commons.math3.complex.ComplexField var28 = var27.getField();
    org.apache.commons.math3.complex.Complex var29 = var27.sqrt1z();
    java.util.List var31 = var29.nthRoot(1);
    double var32 = var29.getArgument();
    boolean var33 = var11.equals((java.lang.Object)var29);
    boolean var34 = var29.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    double var21 = var20.getImaginary();
    org.apache.commons.math3.complex.Complex var23 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var24 = var23.isInfinite();
    org.apache.commons.math3.complex.Complex var26 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var27 = var23.divide(var26);
    org.apache.commons.math3.complex.Complex var28 = var23.tan();
    org.apache.commons.math3.complex.Complex var29 = var23.cosh();
    org.apache.commons.math3.complex.Complex var30 = var20.add(var29);
    org.apache.commons.math3.complex.Complex var31 = var12.multiply(var29);
    org.apache.commons.math3.complex.Complex var33 = var29.subtract(0.0d);
    double var34 = var33.getImaginary();
    org.apache.commons.math3.complex.Complex var35 = var33.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.acos();
    org.apache.commons.math3.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math3.complex.Complex var8 = var5.multiply(1);
    org.apache.commons.math3.complex.Complex var9 = var2.pow(var5);
    org.apache.commons.math3.complex.Complex var10 = var5.tan();
    org.apache.commons.math3.complex.Complex var11 = var5.cos();
    java.lang.String var12 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(9.999999999999977, -0.0)"+ "'", var12.equals("(9.999999999999977, -0.0)"));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var28 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var29 = var28.isInfinite();
    org.apache.commons.math3.complex.Complex var31 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var32 = var28.divide(var31);
    org.apache.commons.math3.complex.Complex var34 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var35 = var34.isInfinite();
    org.apache.commons.math3.complex.Complex var37 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var38 = var34.divide(var37);
    org.apache.commons.math3.complex.Complex var39 = var38.sin();
    org.apache.commons.math3.complex.Complex var40 = var28.multiply(var39);
    org.apache.commons.math3.complex.Complex var41 = var28.sin();
    org.apache.commons.math3.complex.Complex var42 = var15.add(var28);
    org.apache.commons.math3.exception.NumberIsTooSmallException var46 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.0d, (java.lang.Number)10, true);
    org.apache.commons.math3.exception.util.Localizable var47 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var51 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var47, (java.lang.Number)(short)1, (java.lang.Number)(-1L), true);
    var46.addSuppressed((java.lang.Throwable)var51);
    org.apache.commons.math3.exception.util.ExceptionContext var53 = var51.getContext();
    java.lang.Number var54 = var51.getMin();
    java.lang.Number var55 = var51.getMin();
    boolean var56 = var42.equals((java.lang.Object)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + (-1L)+ "'", var54.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + (-1L)+ "'", var55.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    org.apache.commons.math3.complex.Complex var22 = var13.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(11013.232920103323d, (-0.0d));
    org.apache.commons.math3.complex.Complex var4 = var2.subtract(983.5161532381264d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.841470984807897d);
    java.util.List var3 = var1.nthRoot(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex((-3.141592653589793d));
    org.apache.commons.math3.complex.Complex var3 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var4 = var3.isInfinite();
    org.apache.commons.math3.complex.Complex var6 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var7 = var3.divide(var6);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var3.multiply(var14);
    boolean var16 = var14.isInfinite();
    org.apache.commons.math3.complex.Complex var17 = var14.tan();
    java.lang.String var18 = var14.toString();
    org.apache.commons.math3.complex.Complex var19 = var14.reciprocal();
    org.apache.commons.math3.complex.Complex var20 = var19.tanh();
    org.apache.commons.math3.complex.Complex var21 = var20.asin();
    org.apache.commons.math3.complex.Complex var22 = var1.divide(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0.8414709848078965, 0.0)"+ "'", var18.equals("(0.8414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.6483608274590866d, (java.lang.Number)6.9746078810578886E-40d, true);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    org.apache.commons.math3.complex.Complex var1 = new org.apache.commons.math3.complex.Complex(0.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.sqrt();
    org.apache.commons.math3.complex.Complex var4 = var1.pow(Double.NaN);
    org.apache.commons.math3.complex.Complex var5 = var1.exp();
    double var6 = var5.abs();
    org.apache.commons.math3.complex.Complex var7 = var5.atan();
    org.apache.commons.math3.complex.Complex var9 = var5.multiply((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)0, (java.lang.Number)(-1.0f), false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(0.0d, 0.009116265160176875d);
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var4.acos();
    org.apache.commons.math3.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math3.complex.Complex var8 = var5.multiply(1);
    org.apache.commons.math3.complex.Complex var9 = var2.pow(var5);
    org.apache.commons.math3.complex.Complex var10 = var9.asin();
    org.apache.commons.math3.complex.Complex var11 = var9.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var16 = var15.isInfinite();
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var15.divide(var18);
    org.apache.commons.math3.complex.Complex var20 = var15.tan();
    org.apache.commons.math3.complex.Complex var21 = var13.multiply(var15);
    java.lang.String var22 = var13.toString();
    org.apache.commons.math3.complex.Complex var24 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var26 = var24.add(0.0d);
    org.apache.commons.math3.complex.Complex var28 = var24.multiply(10.841470984807897d);
    org.apache.commons.math3.complex.Complex var29 = var13.pow(var24);
    org.apache.commons.math3.complex.Complex var30 = var13.negate();
    org.apache.commons.math3.complex.Complex var31 = var30.cos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(8.414709848078965, 0.0)"+ "'", var22.equals("(8.414709848078965, 0.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    double var5 = var4.getArgument();
    boolean var6 = var4.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    org.apache.commons.math3.complex.Complex var2 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var4 = var2.multiply(0);
    org.apache.commons.math3.complex.Complex var7 = new org.apache.commons.math3.complex.Complex(10.0d, 0.0d);
    org.apache.commons.math3.complex.Complex var9 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var10 = var9.isInfinite();
    org.apache.commons.math3.complex.Complex var12 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var13 = var9.divide(var12);
    org.apache.commons.math3.complex.Complex var14 = var13.sin();
    org.apache.commons.math3.complex.Complex var15 = var7.add(var14);
    boolean var16 = var4.equals((java.lang.Object)var15);
    org.apache.commons.math3.complex.Complex var18 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var19 = var18.acos();
    org.apache.commons.math3.complex.Complex var21 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var21.add(0.0d);
    org.apache.commons.math3.complex.Complex var24 = var19.divide(var23);
    org.apache.commons.math3.complex.Complex var25 = var19.sqrt1z();
    org.apache.commons.math3.complex.Complex var26 = var15.add(var25);
    org.apache.commons.math3.complex.Complex var27 = var25.atan();
    org.apache.commons.math3.complex.Complex var28 = var27.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var2 = var1.isInfinite();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var5 = var1.divide(var4);
    org.apache.commons.math3.complex.Complex var7 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var8 = var7.isInfinite();
    org.apache.commons.math3.complex.Complex var10 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var11 = var7.divide(var10);
    org.apache.commons.math3.complex.Complex var12 = var11.sin();
    org.apache.commons.math3.complex.Complex var13 = var1.multiply(var12);
    org.apache.commons.math3.complex.Complex var15 = var13.add(0.0d);
    org.apache.commons.math3.complex.Complex var16 = var15.tan();
    org.apache.commons.math3.complex.Complex var17 = var15.log();
    org.apache.commons.math3.complex.Complex var19 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math3.complex.Complex var22 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var23 = var19.divide(var22);
    org.apache.commons.math3.complex.Complex var24 = var19.tan();
    org.apache.commons.math3.complex.Complex var26 = var19.multiply(0);
    org.apache.commons.math3.complex.Complex var28 = var19.pow(2.9932228461263786d);
    org.apache.commons.math3.complex.Complex var29 = var15.multiply(var19);
    org.apache.commons.math3.complex.ComplexField var30 = var15.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    org.apache.commons.math3.complex.Complex var1 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var2 = var1.acos();
    org.apache.commons.math3.complex.Complex var4 = org.apache.commons.math3.complex.Complex.valueOf(10.0d);
    org.apache.commons.math3.complex.Complex var6 = var4.add(0.0d);
    org.apache.commons.math3.complex.Complex var7 = var2.divide(var6);
    org.apache.commons.math3.complex.Complex var8 = var2.sqrt1z();
    org.apache.commons.math3.complex.ComplexField var9 = var8.getField();
    org.apache.commons.math3.complex.Complex var10 = var8.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of 