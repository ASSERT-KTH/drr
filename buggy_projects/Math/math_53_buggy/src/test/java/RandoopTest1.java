
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.5333870746439389d), (-1.3468724468673325d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(990L, (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-99000L));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(0.0d, (-3.748403376781957E-9d));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1656171100, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1592.3470367561051d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 990L);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var5, (java.lang.Number)var10, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var10, 10L);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var2, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var2, (-1686316699));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(10, 90);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    org.apache.commons.math.util.MathUtils.checkFinite(2.0d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-1.114782621445709d), (-0.3359937911718539d), 8.655154728220008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Float.NaN, 0.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0d, 0.9801980198019803d, 786341969);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(9900L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9900L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(10.04987562112089d, (-769953791));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.9984630277548983d, 20.48290220493995d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.3611853051969955d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.conjugate();
    org.apache.commons.math.complex.Complex var7 = var2.multiply(0.02191423518768043d);
    org.apache.commons.math.complex.Complex var10 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var11 = var10.conjugate();
    boolean var12 = var11.isNaN();
    double var13 = var11.getArgument();
    org.apache.commons.math.complex.Complex var14 = var11.sin();
    org.apache.commons.math.complex.Complex var15 = var2.multiply(var14);
    org.apache.commons.math.complex.Complex var16 = var14.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-9));

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(1.5582781295114951d, (-0.11038096704629749d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var7 = var5.multiply(100.0d);
    org.apache.commons.math.complex.Complex var8 = var5.conjugate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.tan();
    org.apache.commons.math.complex.Complex var10 = var9.asin();
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var9);
    double var12 = var9.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.8968222924860055d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-0.11038096704629749d), (java.lang.Number)(-2), false);
    java.lang.Number var5 = var4.getArgument();
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-0.11038096704629749d)+ "'", var5.equals((-0.11038096704629749d)));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0f);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(99, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.1147826214457093d);
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double[][] var31 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var42 = var41.getDirection();
    boolean var45 = org.apache.commons.math.util.MathUtils.checkOrder(var36, var42, false, true);
    boolean var48 = org.apache.commons.math.util.MathUtils.checkOrder(var16, var42, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var50 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var11, 10, var42, false);
    boolean var51 = var50.getStrict();
    java.lang.Number var52 = var50.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1566821946);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    org.apache.commons.math.complex.Complex var20 = var4.tan();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var4.nthRoot((-1074790369));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, 0.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1), (java.lang.Number)100.0f, false);
    org.apache.commons.math.exception.util.ExceptionContext var5 = var4.getContext();
    java.lang.Number var6 = var4.getMin();
    java.lang.Number var7 = var4.getMin();
    boolean var8 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 100.0f+ "'", var6.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0f+ "'", var7.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    double[] var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var1 = null;
    double[] var3 = new double[] { (-1.0d)};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 0.027339371326677953d);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var12);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var3, var9);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equals(var19, var28);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double[] var37 = new double[] { 1.0d, 10.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var34, var37);
    int var40 = org.apache.commons.math.util.MathUtils.hash(var37);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    org.apache.commons.math.exception.NonMonotonousSequenceException var49 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var50 = var49.getDirection();
    boolean var53 = org.apache.commons.math.util.MathUtils.checkOrder(var44, var50, false, true);
    double[][] var54 = new double[][] { var44};
    org.apache.commons.math.util.MathUtils.sortInPlace(var37, var54);
    org.apache.commons.math.util.MathUtils.sortInPlace(var19, var54);
    org.apache.commons.math.util.MathUtils.sortInPlace(var9, var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var1, var54);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1656171100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1656171101);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 90, (-30145599));

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     double[] var0 = null;
//     double[] var7 = new double[] { (-1.0d), (-1.0d), 100.0d};
//     double[] var10 = new double[] { 1.0d, 10.0d};
//     double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
//     double[] var14 = new double[] { 1.0d, 10.0d};
//     double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
//     double var16 = org.apache.commons.math.util.MathUtils.distance1(var11, var14);
//     double[] var19 = new double[] { 1.0d, 10.0d};
//     double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
//     double[] var23 = new double[] { 1.0d, 10.0d};
//     double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
//     double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
//     double[][] var26 = new double[][] { var23};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var11, var26);
//     boolean var28 = org.apache.commons.math.util.MathUtils.equals(var7, var11);
//     double[] var31 = new double[] { 1.0d, 10.0d};
//     double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
//     double[] var35 = new double[] { 1.0d, 10.0d};
//     double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
//     double var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var35);
//     double[] var40 = new double[] { 1.0d, 10.0d};
//     double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
//     double[] var44 = new double[] { 1.0d, 10.0d};
//     double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
//     double var46 = org.apache.commons.math.util.MathUtils.distance1(var41, var44);
//     double[][] var47 = new double[][] { var44};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var32, var47);
//     double[] var51 = new double[] { 1.0d, 10.0d};
//     double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
//     double[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var57 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var58 = var57.getDirection();
//     boolean var61 = org.apache.commons.math.util.MathUtils.checkOrder(var52, var58, false, true);
//     boolean var64 = org.apache.commons.math.util.MathUtils.checkOrder(var32, var58, true, false);
//     org.apache.commons.math.util.MathUtils.checkOrder(var11, var58, false);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var68 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)101, (java.lang.Number)0L, 2, var58, false);
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var58, false);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    boolean var10 = org.apache.commons.math.util.MathUtils.equals(var0, var8);
    float[] var11 = null;
    float[] var14 = new float[] { 0.0f, 10.0f};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var14);
    float[] var16 = null;
    float[] var19 = new float[] { 0.0f, 10.0f};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var19);
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var11, var19);
    float[] var22 = null;
    float[] var25 = new float[] { 0.0f, 10.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var25);
    float[] var27 = null;
    float[] var30 = new float[] { 0.0f, 10.0f};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var30);
    float[] var32 = null;
    float[] var35 = new float[] { 0.0f, 10.0f};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var35);
    boolean var37 = org.apache.commons.math.util.MathUtils.equals(var27, var35);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var25, var27);
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var25);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var0, var25);
    float[] var41 = null;
    float[] var44 = new float[] { 0.0f, 10.0f};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var44);
    float[] var46 = null;
    float[] var49 = new float[] { 0.0f, 10.0f};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var49);
    float[] var51 = null;
    float[] var54 = new float[] { 0.0f, 10.0f};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var54);
    boolean var56 = org.apache.commons.math.util.MathUtils.equals(var46, var54);
    boolean var57 = org.apache.commons.math.util.MathUtils.equals(var44, var46);
    float[] var58 = null;
    float[] var61 = new float[] { 0.0f, 10.0f};
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var61);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var58);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var0, var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    int var9 = org.apache.commons.math.util.MathUtils.hash(var6);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var18.getDirection();
    boolean var22 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var19, false, true);
    double[][] var23 = new double[][] { var13};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var23);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var28, var31);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var28, var37);
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double[] var51 = new double[] { 1.0d, 10.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    double var53 = org.apache.commons.math.util.MathUtils.distance1(var48, var51);
    double var54 = org.apache.commons.math.util.MathUtils.distance1(var44, var48);
    double[] var56 = new double[] { (-1.0d)};
    double[] var58 = org.apache.commons.math.util.MathUtils.normalizeArray(var56, 0.027339371326677953d);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double[] var65 = new double[] { 1.0d, 10.0d};
    double[] var66 = org.apache.commons.math.util.MathUtils.copyOf(var65);
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var62, var65);
    boolean var68 = org.apache.commons.math.util.MathUtils.equals(var56, var62);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var56);
    double[] var71 = new double[] { (-1.0d)};
    double[] var73 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 0.027339371326677953d);
    double[] var75 = org.apache.commons.math.util.MathUtils.copyOf(var71, 99);
    double var76 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var71);
    boolean var77 = org.apache.commons.math.util.MathUtils.equals(var37, var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var78 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var56);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var7.sin();
    org.apache.commons.math.complex.Complex var9 = var7.exp();
    boolean var10 = var9.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var10 == false);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.0f), 0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-469.2030354410471d), 0.738774844045322d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
//     double[] var11 = new double[] { 1.0d, 10.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
//     double[] var15 = new double[] { 1.0d, 10.0d};
//     double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
//     double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
//     double[][] var18 = new double[][] { var15};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
//     org.apache.commons.math.util.MathUtils.checkOrder(var3);
//     org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3);
//     double[] var22 = null;
//     double var23 = org.apache.commons.math.util.MathUtils.distance(var3, var22);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 1656171100, 10);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-99000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NEGATIVE_INFINITY, (java.lang.Number)1656171101, (-1074790369), var3, false);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    org.apache.commons.math.complex.Complex var20 = var4.asin();
    double var21 = var4.getReal();
    boolean var22 = var4.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 11900.950259059777d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1656171100, 786341870);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 869829230);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    boolean var4 = var3.getStrict();
    int var5 = var3.getIndex();
    int var6 = var3.getIndex();
    java.lang.Number var7 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0f+ "'", var7.equals(1.0f));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    org.apache.commons.math.complex.Complex var8 = var2.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(9900L, 1795512867667309079L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1795512867667299179L));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)9.950376827045293d, (java.lang.Number)20.48290220493995d, true);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 359.1342053695755d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    double[] var3 = new double[] { 100.0d, 0.0d, (-1.0d)};
    org.apache.commons.math.exception.NonMonotonousSequenceException var10 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var10.getDirection();
    int var12 = var10.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var10.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var13, false);
    boolean var18 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var13, false, false);
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var23, var26);
    int var29 = org.apache.commons.math.util.MathUtils.hash(var26);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    boolean var42 = org.apache.commons.math.util.MathUtils.checkOrder(var33, var39, false, true);
    double[][] var43 = new double[][] { var33};
    org.apache.commons.math.util.MathUtils.sortInPlace(var26, var43);
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    org.apache.commons.math.util.MathUtils.checkFinite(var46);
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var49 = org.apache.commons.math.util.MathUtils.distance(var19, var48);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, (-9));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 90);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-1.114782621445709d));

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.exp();
    org.apache.commons.math.complex.Complex var7 = var3.tan();
    org.apache.commons.math.complex.Complex var8 = var7.cosh();
    boolean var9 = var8.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-769953791), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.3611853051969955d, (-1.114782621445709d), 0.025816509664474907d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(99, 1566821946);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1566822045);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 100.0f, (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.605170185988092d, 1.0d, (-769953791));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 0.0f, 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.log();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.acos();
    org.apache.commons.math.complex.Complex var12 = var2.pow(var7);
    org.apache.commons.math.complex.Complex var13 = var2.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, (-9));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-90));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0d, (-1.1909687824208959d), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-1.114782621445709d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-224004970));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.0d, 11901.05042145663d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.acos();
    org.apache.commons.math.complex.Complex var8 = var2.multiply(var7);
    org.apache.commons.math.complex.Complex var9 = var8.sinh();
    org.apache.commons.math.complex.Complex var12 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var13 = var12.tanh();
    boolean var14 = var12.isInfinite();
    double var15 = var12.getReal();
    org.apache.commons.math.complex.Complex var16 = var12.sqrt1z();
    org.apache.commons.math.complex.Complex var17 = var9.add(var16);
    java.util.List var19 = var16.nthRoot(1010);
    org.apache.commons.math.complex.Complex var20 = var16.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.02191423518768043d, (-1.0d), (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1911350513));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    org.apache.commons.math.util.MathUtils.checkFinite(4.3611853051969955d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1010);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-2.0d), (-99), (-30145599));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-90), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1795512867667309079L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1795512867667309079L);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), (-1656171100), 90);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.3097117106971785d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(786341969, 1656171101);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.04987562112089d, 0.02191423518768043d, 1911350603);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(0, 90);
    int var3 = var2.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 90);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 1010);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 8868003302922989569L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1118089298));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.tanh();
    org.apache.commons.math.complex.Complex var10 = var8.exp();
    org.apache.commons.math.complex.Complex var11 = var8.sqrt();
    java.lang.String var12 = var11.toString();
    org.apache.commons.math.complex.Complex var13 = var3.divide(var11);
    org.apache.commons.math.complex.Complex var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var15 = var13.add(var14);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(3.166218219036781, -0.15791710027873845)"+ "'", var12.equals("(3.166218219036781, -0.15791710027873845)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex((-1.0d), 0.10016239685295168d);
    org.apache.commons.math.complex.Complex var4 = var2.multiply(1.5582781295114951d);
    boolean var5 = var2.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    int[] var6 = new int[] { 1, 100, 0};
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    java.lang.Object[] var8 = new java.lang.Object[] { var6};
    org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)10, var8);
    org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException(var0, var8);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var15 = new org.apache.commons.math.exception.NumberIsTooSmallException(var11, (java.lang.Number)(-0.11038096704629749d), (java.lang.Number)(-2), false);
    java.lang.Number var16 = var15.getArgument();
    var10.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (-0.11038096704629749d)+ "'", var16.equals((-0.11038096704629749d)));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    org.apache.commons.math.complex.Complex var8 = var7.atan();
    org.apache.commons.math.complex.Complex var9 = var8.atan();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var9.nthRoot((-2));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var2.asin();
    org.apache.commons.math.complex.Complex var8 = var7.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.Localizable var28 = null;
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double var43 = org.apache.commons.math.util.MathUtils.distance1(var33, var37);
    double[] var46 = new double[] { 1.0d, 10.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    double[] var50 = new double[] { 1.0d, 10.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distance1(var47, var50);
    double[] var55 = new double[] { 1.0d, 10.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    double[] var59 = new double[] { 1.0d, 10.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance1(var56, var59);
    double[][] var62 = new double[][] { var59};
    org.apache.commons.math.util.MathUtils.sortInPlace(var47, var62);
    org.apache.commons.math.util.MathUtils.sortInPlace(var33, var62);
    org.apache.commons.math.exception.NotFiniteNumberException var65 = new org.apache.commons.math.exception.NotFiniteNumberException(var28, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var62);
    org.apache.commons.math.exception.NotFiniteNumberException var66 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var62);
    org.apache.commons.math.exception.NullArgumentException var67 = new org.apache.commons.math.exception.NullArgumentException(var26, (java.lang.Object[])var62);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var25, (java.lang.Object[])var62);
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 100.00999950005d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1592.3470367561051d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(9.950376827045293d, 2.0d, (-224004970));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var28 = var6.asin();
    org.apache.commons.math.complex.Complex var29 = var6.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.10016239685295168d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0f, (-1.0f), (-90));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    boolean var16 = org.apache.commons.math.util.MathUtils.checkOrder(var7, var13, false, true);
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var13, true);
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var3, 101);
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.util.Localizable var23 = null;
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var35);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var28, var32);
    double[] var41 = new double[] { 1.0d, 10.0d};
    double[] var42 = org.apache.commons.math.util.MathUtils.copyOf(var41);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double var47 = org.apache.commons.math.util.MathUtils.distance1(var42, var45);
    double[] var50 = new double[] { 1.0d, 10.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    double[] var54 = new double[] { 1.0d, 10.0d};
    double[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    double var56 = org.apache.commons.math.util.MathUtils.distance1(var51, var54);
    double[][] var57 = new double[][] { var54};
    org.apache.commons.math.util.MathUtils.sortInPlace(var42, var57);
    org.apache.commons.math.util.MathUtils.sortInPlace(var28, var57);
    org.apache.commons.math.exception.NotFiniteNumberException var60 = new org.apache.commons.math.exception.NotFiniteNumberException(var23, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var57);
    org.apache.commons.math.exception.NotFiniteNumberException var61 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var57);
    org.apache.commons.math.exception.NullArgumentException var62 = new org.apache.commons.math.exception.NullArgumentException(var21, (java.lang.Object[])var57);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var20, var57);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var18 = new int[] { (-1)};
    int[] var22 = new int[] { 1, 100, 0};
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
    int[] var26 = new int[] { (-1)};
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
    int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var1, var18);
    int[] var36 = new int[] { (-1)};
    int[] var40 = new int[] { 1, 100, 0};
    int[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    int var42 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var41);
    int[] var44 = new int[] { (-1)};
    int[] var48 = new int[] { 1, 100, 0};
    int[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    int var50 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var49);
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var36, var44);
    int[] var53 = new int[] { (-1)};
    int[] var57 = new int[] { 1, 100, 0};
    int[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var53, var58);
    int[] var61 = new int[] { (-1)};
    int[] var65 = new int[] { 1, 100, 0};
    int[] var66 = org.apache.commons.math.util.MathUtils.copyOf(var65);
    int var67 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var66);
    int var68 = org.apache.commons.math.util.MathUtils.distance1(var53, var61);
    int[] var72 = new int[] { 1, 100, 0};
    int[] var73 = org.apache.commons.math.util.MathUtils.copyOf(var72);
    int var74 = org.apache.commons.math.util.MathUtils.distance1(var53, var72);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var36, var53);
    int var76 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var36, (-1118089298));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, 786341969);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 786341970);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(9802L, 990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8812L);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign((-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 990L);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    org.apache.commons.math.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var13 = new org.apache.commons.math.exception.MathArithmeticException(var10, var12);
    org.apache.commons.math.exception.NotFiniteNumberException var14 = new org.apache.commons.math.exception.NotFiniteNumberException(var8, (java.lang.Number)0.0d, var12);
    org.apache.commons.math.exception.NotFiniteNumberException var15 = new org.apache.commons.math.exception.NotFiniteNumberException(var2, (java.lang.Number)990L, var12);
    org.apache.commons.math.exception.NotFiniteNumberException var16 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1566822045, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(90, (-30145600));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var8, var11);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var11);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var24 = var23.getDirection();
    boolean var27 = org.apache.commons.math.util.MathUtils.checkOrder(var18, var24, false, true);
    double[][] var28 = new double[][] { var18};
    org.apache.commons.math.util.MathUtils.sortInPlace(var11, var28);
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var3, var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8968222924860055d, (-0.09966865249116202d), 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, var1, (java.lang.Number)(-1686316699), false);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var20 = new int[] { 1, 100, 0};
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    int[] var27 = new int[] { 1, 100, 0};
    int[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distance(var1, var27);
    int[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var27, 786341870);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    double var8 = var7.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.9999452757640324d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.acos();
    org.apache.commons.math.complex.Complex var6 = var5.cos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = null;
    org.apache.commons.math.exception.NotFiniteNumberException var3 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)0.02191423518768043d, var2);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(786341970, (-1911350513));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var0);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-0.0f), 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    java.lang.Object var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1010, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkFinite(Double.NaN);
      fail("Expected exception of type org.apache.commons.math.exception.NotFiniteNumberException");
    } catch (org.apache.commons.math.exception.NotFiniteNumberException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(11.180339887498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 35853.36506461688d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.09966865249116202d), 3.2771640791509435d, (-3.748403376781957E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-100L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.5573913107228545d), (-9));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-0.19801980198019803d), 0.09966865249116202d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(9802L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9801L);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(9801L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, 1566822045);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1566822045);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), (-0.0f), 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.09966865249116202d, (java.lang.Number)100L, true);
    boolean var4 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, (-1656171100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10, (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-30145589));

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var12 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double[][] var31 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var12, var16);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var49 = new double[] { 1.0d, 10.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var49);
    double var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var49);
    double[][] var52 = new double[][] { var49};
    org.apache.commons.math.util.MathUtils.sortInPlace(var37, var52);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    org.apache.commons.math.exception.NonMonotonousSequenceException var62 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var63 = var62.getDirection();
    boolean var66 = org.apache.commons.math.util.MathUtils.checkOrder(var57, var63, false, true);
    boolean var69 = org.apache.commons.math.util.MathUtils.checkOrder(var37, var63, true, false);
    boolean var72 = org.apache.commons.math.util.MathUtils.checkOrder(var12, var63, false, true);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var6, var12);
    double[] var74 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var76 = org.apache.commons.math.util.MathUtils.copyOf(var74, (-1911350513));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 11.180339887498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.09983374988500587d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3.7168146928204138d, (-469.2030354410471d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-467.5220833456485d));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1893909151162593279L), true);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)9801L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1118089298), 2);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1378206651628553216L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1378206651628553216L);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.complex.Complex var6 = var5.log();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)8868003302922989569L, (java.lang.Number)(-0.0f), true);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)1L, (java.lang.Number)(short)0, false);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)0.8968222924860055d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    boolean var13 = var7.isNaN();
    org.apache.commons.math.complex.Complex var16 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var17 = var16.conjugate();
    org.apache.commons.math.complex.Complex var18 = var17.tanh();
    org.apache.commons.math.complex.Complex var21 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var22 = var21.conjugate();
    java.lang.Object var23 = null;
    boolean var24 = var21.equals(var23);
    org.apache.commons.math.complex.Complex var25 = var21.sqrt1z();
    org.apache.commons.math.complex.Complex var26 = var17.divide(var21);
    org.apache.commons.math.complex.Complex var27 = var26.negate();
    org.apache.commons.math.complex.Complex var28 = var7.add(var26);
    double var29 = var28.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 10.98019801980198d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-793020320));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.605170185988092d, 0.08338435247423098d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.114782621445709d), 0.02191423518768043d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(869829230, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(99L, 9900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 980100L);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var13 = var12.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var13 = var12.exp();
    org.apache.commons.math.complex.Complex var14 = var12.sin();
    double var15 = var14.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.8541874089757199d);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.655154728220008E12d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, (-1656171100), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, (-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = org.apache.commons.math.util.MathUtils.normalizeArray(var0, 100.0d);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(10.98019801980198d, (-1.0d), (-1911350513));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-2), (-2));
    int var4 = var3.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-2));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    double[] var2 = new double[] { (-1.0d)};
    double[] var4 = org.apache.commons.math.util.MathUtils.normalizeArray(var2, 0.027339371326677953d);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var8, var11);
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var2, var8);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance1(var18, var21);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    boolean var29 = org.apache.commons.math.util.MathUtils.equals(var18, var27);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var33, var36);
    int var39 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { 1.0d, 10.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.copyOf(var42);
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    org.apache.commons.math.exception.NonMonotonousSequenceException var48 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var49 = var48.getDirection();
    boolean var52 = org.apache.commons.math.util.MathUtils.checkOrder(var43, var49, false, true);
    double[][] var53 = new double[][] { var43};
    org.apache.commons.math.util.MathUtils.sortInPlace(var36, var53);
    org.apache.commons.math.util.MathUtils.sortInPlace(var18, var53);
    org.apache.commons.math.util.MathUtils.sortInPlace(var8, var53);
    org.apache.commons.math.exception.NotFiniteNumberException var57 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)(-1.3468724468673325d), (java.lang.Object[])var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var29.cos();
    double var33 = var29.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1.114782621445709d));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10);
    java.math.BigInteger var11 = null;
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var11, 0L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 990L);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.math.BigInteger var17 = null;
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0L);
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var19, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var24 = new org.apache.commons.math.exception.NumberIsTooSmallException(var16, (java.lang.Number)var21, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var21, 10L);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var13, var21);
    org.apache.commons.math.exception.util.Localizable var28 = null;
    java.math.BigInteger var29 = null;
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var29, 0L);
    java.math.BigInteger var33 = org.apache.commons.math.util.MathUtils.pow(var31, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var36 = new org.apache.commons.math.exception.NumberIsTooSmallException(var28, (java.lang.Number)var33, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var33, 10L);
    java.math.BigInteger var39 = org.apache.commons.math.util.MathUtils.pow(var21, var38);
    java.math.BigInteger var40 = org.apache.commons.math.util.MathUtils.pow(var10, var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var42 = org.apache.commons.math.util.MathUtils.pow(var39, (-1118089298));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-89L));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.conjugate();
    org.apache.commons.math.complex.Complex var6 = var5.negate();
    org.apache.commons.math.complex.Complex var7 = var5.atan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.08338435247423098d, 869829230, 1656171101);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 90, (-1));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.11038096704629749d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-332607061));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11576.453488438818d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, 100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1686316699), (-1118089298));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var17 = null;
    float[] var20 = new float[] { 0.0f, 10.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equals(var5, var20);
    float[] var23 = null;
    float[] var26 = new float[] { 0.0f, 10.0f};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var26);
    float[] var28 = null;
    float[] var31 = new float[] { 0.0f, 10.0f};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var31);
    float[] var33 = null;
    float[] var36 = new float[] { 0.0f, 10.0f};
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var36);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var28, var36);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var26, var28);
    float[] var40 = null;
    float[] var43 = new float[] { 0.0f, 10.0f};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var43);
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var40);
    boolean var46 = org.apache.commons.math.util.MathUtils.equals(var5, var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var5, 100);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 1378206651628553215L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-89L), var2, true);
    org.apache.commons.math.exception.util.ExceptionContext var5 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.5582781295114951d, 0.09983374988500587d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-99), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.19801980198019803d), 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    int var5 = var3.getIndex();
    java.lang.Number var6 = var3.getPrevious();
    boolean var7 = var3.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1.0f+ "'", var6.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.7659808551313332d, (-332607061), (-1911350513));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.0f), 0.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, 4.605170185988092d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(990L, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.tanh();
    org.apache.commons.math.complex.Complex var32 = var30.exp();
    org.apache.commons.math.complex.Complex var33 = var30.sqrt();
    org.apache.commons.math.complex.Complex var34 = var33.sqrt1z();
    boolean var35 = var33.isInfinite();
    org.apache.commons.math.complex.Complex var36 = var27.pow(var33);
    org.apache.commons.math.complex.Complex var37 = var27.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.util.MathUtils.checkFinite(var0);
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1147826214457093d, Double.NaN, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(2, (-99));
    java.lang.Throwable[] var3 = var2.getSuppressed();
    java.lang.Number var4 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 2+ "'", var4.equals(2));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(30.48232336227865d, Double.NaN, 0.19933730498232405d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    double[] var15 = new double[] { (-1.0d)};
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 0.027339371326677953d);
    double var18 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
    double var19 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var20 = org.apache.commons.math.util.MathUtils.distance1(var7, var17);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.027339371326677953d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.027339371326677953d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    org.apache.commons.math.complex.Complex var9 = var8.asin();
    org.apache.commons.math.complex.Complex var10 = var8.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(3.166218219036781, -0.15791710027873845)"+ "'", var6.equals("(3.166218219036781, -0.15791710027873845)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.5333870746439389d), (java.lang.Number)(-0.21891713329967522d), false);
    java.lang.Number var5 = var4.getMin();
    java.lang.Number var6 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-0.21891713329967522d)+ "'", var5.equals((-0.21891713329967522d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (-0.21891713329967522d)+ "'", var6.equals((-0.21891713329967522d)));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-1.1909687824208959d));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-1.0d), 1592.3470367561051d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 10L);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.math.BigInteger var13 = null;
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 0L);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 990L);
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.exception.util.Localizable var20 = null;
    java.lang.Object[] var22 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var23 = new org.apache.commons.math.exception.MathArithmeticException(var20, var22);
    org.apache.commons.math.exception.NotFiniteNumberException var24 = new org.apache.commons.math.exception.NotFiniteNumberException(var18, (java.lang.Number)0.0d, var22);
    org.apache.commons.math.exception.NotFiniteNumberException var25 = new org.apache.commons.math.exception.NotFiniteNumberException(var12, (java.lang.Number)990L, var22);
    org.apache.commons.math.exception.NotFiniteNumberException var26 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)var11, var22);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var11, 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.19933730498232405d, 11900.950259059777d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    org.apache.commons.math.complex.Complex var21 = var19.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1118089298), (-30145589));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    org.apache.commons.math.util.MathUtils.checkFinite((-0.3359937911718539d));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.1147826214457093d);
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var7 = new org.apache.commons.math.exception.MathArithmeticException(var4, var6);
    org.apache.commons.math.exception.MathIllegalArgumentException var8 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var6);
    org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException(var2, var6);
    var1.addSuppressed((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(0.0d, 10.0d);
    org.apache.commons.math.complex.Complex var12 = var11.tanh();
    org.apache.commons.math.complex.Complex var13 = var7.subtract(var12);
    org.apache.commons.math.complex.Complex var14 = var7.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-2), (-2));
    java.lang.Number var4 = var3.getArgument();
    int var5 = var3.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-2)+ "'", var4.equals((-2)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-2));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    int[] var1 = new int[] { 0};
    int[] var3 = new int[] { (-1)};
    int[] var7 = new int[] { 1, 100, 0};
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    int var9 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var8);
    int[] var11 = new int[] { (-1)};
    int[] var15 = new int[] { 1, 100, 0};
    int[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    int var17 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var16);
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var3, var11);
    int[] var22 = new int[] { 1, 100, 0};
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    int var24 = org.apache.commons.math.util.MathUtils.distance1(var3, var22);
    int[] var26 = new int[] { (-1)};
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
    int[] var34 = new int[] { (-1)};
    int[] var38 = new int[] { 1, 100, 0};
    int[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    int var40 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var39);
    int var41 = org.apache.commons.math.util.MathUtils.distance1(var26, var34);
    int[] var45 = new int[] { 1, 100, 0};
    int[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    int var47 = org.apache.commons.math.util.MathUtils.distance1(var26, var45);
    int var48 = org.apache.commons.math.util.MathUtils.distance1(var3, var45);
    int[] var52 = new int[] { 1, 100, 0};
    int[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    int var54 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var53);
    int[] var56 = new int[] { (-1)};
    int[] var60 = new int[] { 1, 100, 0};
    int[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    int var62 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var61);
    int[] var64 = new int[] { (-1)};
    int[] var68 = new int[] { 1, 100, 0};
    int[] var69 = org.apache.commons.math.util.MathUtils.copyOf(var68);
    int var70 = org.apache.commons.math.util.MathUtils.distanceInf(var64, var69);
    int var71 = org.apache.commons.math.util.MathUtils.distance1(var56, var64);
    int[] var75 = new int[] { 1, 100, 0};
    int[] var76 = org.apache.commons.math.util.MathUtils.copyOf(var75);
    int var77 = org.apache.commons.math.util.MathUtils.distance1(var56, var75);
    int var78 = org.apache.commons.math.util.MathUtils.distanceInf(var53, var75);
    int[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    int var80 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, 0.0f, 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1686316699));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, 0.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, 786341870);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    org.apache.commons.math.util.MathUtils.checkFinite(10.04987562112089d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 11901.05042145663d, 3.0055182757323147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.5374020457163808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.433713192213384d);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    org.apache.commons.math.complex.Complex var20 = var4.tan();
    double var21 = var20.getReal();
    boolean var22 = var20.isInfinite();
    org.apache.commons.math.complex.Complex var23 = var20.acos();
    org.apache.commons.math.complex.Complex var24 = var20.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1795512867667309078L, 1378206651628553216L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var52 = new double[] { 1.0d, 10.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    int var54 = org.apache.commons.math.util.MathUtils.hash(var52);
    double var55 = org.apache.commons.math.util.MathUtils.distance1(var3, var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1566821946, (-1911350513));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var18 = new int[] { (-1)};
    int[] var22 = new int[] { 1, 100, 0};
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
    int[] var26 = new int[] { (-1)};
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
    int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var1, var18);
    int[] var36 = new int[] { (-1)};
    int[] var40 = new int[] { 1, 100, 0};
    int[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    int var42 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var41);
    int[] var44 = new int[] { (-1)};
    int[] var48 = new int[] { 1, 100, 0};
    int[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    int var50 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var49);
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var36, var44);
    int[] var55 = new int[] { 1, 100, 0};
    int[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    int var57 = org.apache.commons.math.util.MathUtils.distance1(var36, var55);
    int[] var59 = new int[] { (-1)};
    int[] var63 = new int[] { 1, 100, 0};
    int[] var64 = org.apache.commons.math.util.MathUtils.copyOf(var63);
    int var65 = org.apache.commons.math.util.MathUtils.distanceInf(var59, var64);
    int[] var67 = new int[] { (-1)};
    int[] var71 = new int[] { 1, 100, 0};
    int[] var72 = org.apache.commons.math.util.MathUtils.copyOf(var71);
    int var73 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var72);
    int var74 = org.apache.commons.math.util.MathUtils.distance1(var59, var67);
    int[] var78 = new int[] { 1, 100, 0};
    int[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var78);
    int var80 = org.apache.commons.math.util.MathUtils.distance1(var59, var78);
    int var81 = org.apache.commons.math.util.MathUtils.distance1(var36, var78);
    int[] var85 = new int[] { 1, 100, 0};
    int[] var86 = org.apache.commons.math.util.MathUtils.copyOf(var85);
    int var87 = org.apache.commons.math.util.MathUtils.distanceInf(var78, var86);
    double var88 = org.apache.commons.math.util.MathUtils.distance(var1, var86);
    int[] var90 = new int[] { (-1)};
    int[] var94 = new int[] { 1, 100, 0};
    int[] var95 = org.apache.commons.math.util.MathUtils.copyOf(var94);
    int var96 = org.apache.commons.math.util.MathUtils.distanceInf(var90, var95);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var97 = org.apache.commons.math.util.MathUtils.distance(var86, var90);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 2);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-2.276056593552136d), 8.655154728220008E12d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, (-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.7659808551313332d, (-1118089298), (-1686316699));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-30145599), 1911350603);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1566821946, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(9801L, 1378206651628553216L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1378206651628543415L));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1378206651628553215L, (java.lang.Number)3628800L, true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(3628800.0d, (-1.1909687824208959d));
    java.lang.String var3 = var2.toString();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    org.apache.commons.math.complex.Complex var8 = var7.tanh();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var12 = var11.conjugate();
    java.lang.Object var13 = null;
    boolean var14 = var11.equals(var13);
    org.apache.commons.math.complex.Complex var15 = var11.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var7.divide(var11);
    java.lang.Object var17 = null;
    boolean var18 = var16.equals(var17);
    boolean var19 = var16.isNaN();
    org.apache.commons.math.complex.Complex var20 = var2.pow(var16);
    boolean var21 = var2.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "(3628800.0, -1.1909687824208959)"+ "'", var3.equals("(3628800.0, -1.1909687824208959)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tanh();
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    boolean var43 = var42.isNaN();
    org.apache.commons.math.complex.Complex var44 = var42.asin();
    double var45 = var44.getArgument();
    org.apache.commons.math.complex.Complex var46 = var44.exp();
    org.apache.commons.math.complex.Complex var47 = var46.tan();
    org.apache.commons.math.complex.Complex var48 = var47.acos();
    org.apache.commons.math.complex.Complex var49 = var36.subtract(var47);
    double var50 = var47.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.9984630277548983d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0003737438906983d, 0.8968222924860055d, (-224004970));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 101);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var3, (java.lang.Number)0.08338435247423098d, true);
    boolean var9 = var8.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(3628800.0d, (-1.1909687824208959d));
    java.lang.String var3 = var2.toString();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    org.apache.commons.math.complex.Complex var8 = var7.tanh();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var12 = var11.conjugate();
    java.lang.Object var13 = null;
    boolean var14 = var11.equals(var13);
    org.apache.commons.math.complex.Complex var15 = var11.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var7.divide(var11);
    java.lang.Object var17 = null;
    boolean var18 = var16.equals(var17);
    boolean var19 = var16.isNaN();
    org.apache.commons.math.complex.Complex var20 = var2.pow(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var2.nthRoot((-90));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "(3628800.0, -1.1909687824208959)"+ "'", var3.equals("(3628800.0, -1.1909687824208959)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double var16 = org.apache.commons.math.util.MathUtils.distance1(var11, var14);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var7, var11);
    double var18 = org.apache.commons.math.util.MathUtils.distance(var2, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var11, (-769953791));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    boolean var33 = var31.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    boolean var23 = var22.getStrict();
    int var24 = var22.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = var22.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2, (java.lang.Number)3.7168146928204138d, 0, var25, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = var27.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var12, var28, false);
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.Localizable var33 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance1(var44, var47);
    double var50 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    double[] var53 = new double[] { 1.0d, 10.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance1(var54, var57);
    double[] var62 = new double[] { 1.0d, 10.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    double[] var66 = new double[] { 1.0d, 10.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance1(var63, var66);
    double[][] var69 = new double[][] { var66};
    org.apache.commons.math.util.MathUtils.sortInPlace(var54, var69);
    org.apache.commons.math.util.MathUtils.sortInPlace(var40, var69);
    org.apache.commons.math.exception.NotFiniteNumberException var72 = new org.apache.commons.math.exception.NotFiniteNumberException(var35, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NotFiniteNumberException var73 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NullArgumentException var74 = new org.apache.commons.math.exception.NullArgumentException(var33, (java.lang.Object[])var69);
    org.apache.commons.math.exception.MathArithmeticException var75 = new org.apache.commons.math.exception.MathArithmeticException(var32, (java.lang.Object[])var69);
    org.apache.commons.math.util.MathUtils.sortInPlace(var31, var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(8.655154728220008E12d, 2.433713192213384d, 1656171101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(2.9999452757640324d, 35853.36506461688d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.546012682779287d);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.19801980198019803d), 1.5374020457163808d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(8868003302922989569L, (-99000L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-30145599), 1656171100);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.acos();
    org.apache.commons.math.complex.Complex var8 = var2.multiply(var7);
    org.apache.commons.math.complex.Complex var9 = var8.sinh();
    double var10 = var9.getArgument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var9.nthRoot((-30145599));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.5333870746439389d));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(3.0055182757323147d, 1.5374020457163808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.39083465772316284d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, (-1911350513));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(9900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, 9801L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 98010L);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(1814400.000000139d, 101, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1814400.000000139d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    org.apache.commons.math.util.MathUtils.checkFinite(3.170153879722701d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1795512867667309079L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1795512867667309079L);

  }

  public void test256() {}
//   public void test256() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = null;
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
//     java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[] var16 = new double[] { 1.0d, 10.0d};
//     double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
//     double[] var20 = new double[] { 1.0d, 10.0d};
//     double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
//     double var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var20);
//     double var23 = org.apache.commons.math.util.MathUtils.distance1(var13, var17);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var31 = var30.getDirection();
//     int var32 = var30.getIndex();
//     org.apache.commons.math.util.MathUtils.OrderDirection var33 = var30.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var33, false);
//     org.apache.commons.math.util.MathUtils.OrderDirection var36 = var35.getDirection();
//     boolean var39 = org.apache.commons.math.util.MathUtils.checkOrder(var17, var36, false, true);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0d, (java.lang.Number)var6, 10, var36, false);
//     java.math.BigInteger var42 = null;
//     java.math.BigInteger var44 = org.apache.commons.math.util.MathUtils.pow(var42, 0L);
//     java.math.BigInteger var46 = org.apache.commons.math.util.MathUtils.pow(var44, 990L);
//     org.apache.commons.math.exception.util.Localizable var47 = null;
//     java.math.BigInteger var48 = null;
//     java.math.BigInteger var50 = org.apache.commons.math.util.MathUtils.pow(var48, 0L);
//     java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var50, 990L);
//     org.apache.commons.math.exception.NumberIsTooSmallException var55 = new org.apache.commons.math.exception.NumberIsTooSmallException(var47, (java.lang.Number)var52, (java.lang.Number)30.48232336227865d, false);
//     java.math.BigInteger var57 = org.apache.commons.math.util.MathUtils.pow(var52, 10L);
//     java.math.BigInteger var58 = org.apache.commons.math.util.MathUtils.pow(var44, var52);
//     org.apache.commons.math.exception.util.Localizable var59 = null;
//     java.math.BigInteger var60 = null;
//     java.math.BigInteger var62 = org.apache.commons.math.util.MathUtils.pow(var60, 0L);
//     java.math.BigInteger var64 = org.apache.commons.math.util.MathUtils.pow(var62, 990L);
//     org.apache.commons.math.exception.NumberIsTooSmallException var67 = new org.apache.commons.math.exception.NumberIsTooSmallException(var59, (java.lang.Number)var64, (java.lang.Number)30.48232336227865d, false);
//     java.math.BigInteger var69 = org.apache.commons.math.util.MathUtils.pow(var64, 10L);
//     java.math.BigInteger var70 = org.apache.commons.math.util.MathUtils.pow(var52, var69);
//     java.math.BigInteger var71 = org.apache.commons.math.util.MathUtils.pow(var6, var70);
//     java.math.BigInteger var72 = org.apache.commons.math.util.MathUtils.pow(var0, var6);
// 
//   }

  public void test257() {}
//   public void test257() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 786341970);
// 
//   }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.ComplexField var4 = var3.getField();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var15 = var14.conjugate();
    java.lang.Object var16 = null;
    boolean var17 = var14.equals(var16);
    org.apache.commons.math.complex.Complex var18 = var14.sqrt1z();
    org.apache.commons.math.complex.Complex var19 = var7.add(var14);
    org.apache.commons.math.complex.Complex var20 = var3.pow(var19);
    boolean var21 = var19.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    org.apache.commons.math.complex.Complex var21 = var19.cos();
    org.apache.commons.math.complex.Complex var22 = var19.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    double[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, 786341870);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1147826214457093d, 30.48232336227865d, 786341870);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double[] var10 = new double[] { 1.0d, 10.0d};
//     double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
//     double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
//     double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
//     org.apache.commons.math.util.MathUtils.OrderDirection var14 = null;
//     boolean var17 = org.apache.commons.math.util.MathUtils.checkOrder(var7, var14, false, true);
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    boolean var38 = var37.isInfinite();
    org.apache.commons.math.complex.Complex var39 = var37.sqrt1z();
    org.apache.commons.math.complex.Complex var42 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var43 = var42.tanh();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.acos();
    org.apache.commons.math.complex.Complex var48 = var42.multiply(var47);
    org.apache.commons.math.complex.Complex var49 = var48.sinh();
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.tanh();
    boolean var54 = var52.isInfinite();
    double var55 = var52.getReal();
    org.apache.commons.math.complex.Complex var56 = var52.sqrt1z();
    org.apache.commons.math.complex.Complex var57 = var49.add(var56);
    org.apache.commons.math.complex.Complex var58 = var39.multiply(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, Float.NaN, (-1656171100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(1.0003737438906983d, 1.3440585709080678E43d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (-2.2090209834105576d), 3.7168146928204138d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    double[] var3 = new double[] { 1.0d, 10.0d};
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
    double[][] var19 = new double[][] { var16};
    org.apache.commons.math.util.MathUtils.sortInPlace(var4, var19);
    org.apache.commons.math.exception.NotFiniteNumberException var21 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)10.0f, (java.lang.Object[])var19);
    java.lang.String var22 = var21.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NotFiniteNumberException: 10 is not a finite number"+ "'", var22.equals("org.apache.commons.math.exception.NotFiniteNumberException: 10 is not a finite number"));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, 786341969);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0L, (java.lang.Number)0.9801980198019803d, true);
    java.lang.Number var4 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.9801980198019803d+ "'", var4.equals(0.9801980198019803d));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, (-1686316699));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-98L), (-99000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9702000L);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(869829230, (-793020320));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(9900L, 990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9801000L);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var20 = new float[] { 10.0f, 10.0f, (-1.0f)};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var20);
    float[] var22 = null;
    float[] var25 = new float[] { 0.0f, 10.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var25);
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var25);
    float[] var28 = null;
    float[] var29 = null;
    float[] var32 = new float[] { 0.0f, 10.0f};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var32);
    float[] var34 = null;
    float[] var37 = new float[] { 0.0f, 10.0f};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var37);
    float[] var39 = null;
    float[] var42 = new float[] { 0.0f, 10.0f};
    boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var42);
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var34, var42);
    boolean var45 = org.apache.commons.math.util.MathUtils.equals(var32, var34);
    float[] var46 = null;
    float[] var49 = new float[] { 0.0f, 10.0f};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var49);
    float[] var51 = null;
    float[] var54 = new float[] { 0.0f, 10.0f};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var54);
    float[] var56 = null;
    float[] var59 = new float[] { 0.0f, 10.0f};
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var59);
    boolean var61 = org.apache.commons.math.util.MathUtils.equals(var51, var59);
    boolean var62 = org.apache.commons.math.util.MathUtils.equals(var49, var51);
    boolean var63 = org.apache.commons.math.util.MathUtils.equals(var32, var51);
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var32);
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)10.0d);
    boolean var2 = var1.getBoundIsAllowed();
    java.lang.Number var3 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)99, (java.lang.Number)8.655154728220008E12d, true);
    java.lang.Number var4 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 8.655154728220008E12d+ "'", var4.equals(8.655154728220008E12d));

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.19933730498232405d, 0.8541874089757199d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.conjugate();
    org.apache.commons.math.complex.ComplexField var32 = var31.getField();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var42 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var43 = var42.conjugate();
    java.lang.Object var44 = null;
    boolean var45 = var42.equals(var44);
    org.apache.commons.math.complex.Complex var46 = var42.sqrt1z();
    org.apache.commons.math.complex.Complex var47 = var35.add(var42);
    org.apache.commons.math.complex.Complex var48 = var31.pow(var47);
    org.apache.commons.math.complex.Complex var49 = var23.pow(var31);
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.tanh();
    boolean var54 = var52.isInfinite();
    org.apache.commons.math.complex.Complex var55 = var52.sin();
    org.apache.commons.math.complex.Complex var58 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var59 = var58.conjugate();
    org.apache.commons.math.complex.Complex var60 = var59.tanh();
    org.apache.commons.math.complex.Complex var61 = var60.sin();
    org.apache.commons.math.complex.Complex var62 = var52.multiply(var61);
    org.apache.commons.math.complex.Complex var63 = var61.log();
    org.apache.commons.math.complex.Complex var64 = var49.add(var63);
    org.apache.commons.math.complex.Complex var65 = var64.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var6.sin();
    org.apache.commons.math.complex.ComplexField var8 = var6.getField();
    double var9 = var6.getArgument();
    org.apache.commons.math.complex.Complex var12 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var13 = var12.conjugate();
    java.lang.Object var14 = null;
    boolean var15 = var12.equals(var14);
    org.apache.commons.math.complex.Complex var16 = var12.acos();
    org.apache.commons.math.complex.Complex var19 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var20 = var19.conjugate();
    org.apache.commons.math.complex.Complex var23 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var24 = var23.conjugate();
    org.apache.commons.math.complex.Complex var25 = var24.tanh();
    org.apache.commons.math.complex.Complex var28 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var29 = var28.conjugate();
    java.lang.Object var30 = null;
    boolean var31 = var28.equals(var30);
    org.apache.commons.math.complex.Complex var32 = var28.sqrt1z();
    org.apache.commons.math.complex.Complex var33 = var24.divide(var28);
    org.apache.commons.math.complex.Complex var34 = var19.divide(var33);
    java.util.List var36 = var33.nthRoot(1);
    org.apache.commons.math.complex.Complex var37 = var16.multiply(var33);
    org.apache.commons.math.complex.Complex var40 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var41 = var40.conjugate();
    org.apache.commons.math.complex.ComplexField var42 = var41.getField();
    org.apache.commons.math.complex.Complex var45 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var46 = var45.conjugate();
    java.lang.Object var47 = null;
    boolean var48 = var45.equals(var47);
    org.apache.commons.math.complex.Complex var49 = var45.sqrt1z();
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.conjugate();
    java.lang.Object var54 = null;
    boolean var55 = var52.equals(var54);
    org.apache.commons.math.complex.Complex var56 = var52.sqrt1z();
    org.apache.commons.math.complex.Complex var57 = var45.add(var52);
    org.apache.commons.math.complex.Complex var58 = var41.pow(var57);
    org.apache.commons.math.complex.Complex var59 = var33.pow(var41);
    org.apache.commons.math.complex.Complex var60 = var6.divide(var33);
    org.apache.commons.math.complex.Complex var63 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var64 = var63.conjugate();
    org.apache.commons.math.complex.ComplexField var65 = var64.getField();
    org.apache.commons.math.complex.Complex var68 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var69 = var68.conjugate();
    java.lang.Object var70 = null;
    boolean var71 = var68.equals(var70);
    org.apache.commons.math.complex.Complex var72 = var68.sqrt1z();
    org.apache.commons.math.complex.Complex var75 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var76 = var75.conjugate();
    java.lang.Object var77 = null;
    boolean var78 = var75.equals(var77);
    org.apache.commons.math.complex.Complex var79 = var75.sqrt1z();
    org.apache.commons.math.complex.Complex var80 = var68.add(var75);
    org.apache.commons.math.complex.Complex var81 = var64.pow(var80);
    org.apache.commons.math.complex.Complex var82 = var80.sqrt1z();
    org.apache.commons.math.complex.Complex var83 = var80.cos();
    double var84 = var80.getImaginary();
    org.apache.commons.math.complex.Complex var85 = var80.exp();
    org.apache.commons.math.complex.Complex var86 = var33.multiply(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.5374020457163808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var1);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), 10.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)10L, (java.lang.Number)(short)(-1), false);
    java.lang.Number var5 = var4.getMin();
    org.apache.commons.math.exception.util.ExceptionContext var6 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)(-1)+ "'", var5.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.09966865249116202d, (java.lang.Number)100L, true);
    java.lang.Number var4 = var3.getArgument();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.09966865249116202d+ "'", var4.equals(0.09966865249116202d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(8812L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 77651344L);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(4.3611853051969955d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1686316699));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-224004970), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 224004970);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0f, Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, var1);
    java.lang.Number var3 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var17 = null;
    float[] var20 = new float[] { 0.0f, 10.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var20);
    float[] var22 = null;
    float[] var25 = new float[] { 0.0f, 10.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var25);
    float[] var27 = null;
    float[] var30 = new float[] { 0.0f, 10.0f};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var30);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var22, var30);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var20, var22);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var3, var22);
    float[] var35 = null;
    float[] var38 = new float[] { 0.0f, 10.0f};
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var38);
    float[] var40 = null;
    float[] var43 = new float[] { 0.0f, 10.0f};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var43);
    float[] var45 = null;
    float[] var48 = new float[] { 0.0f, 10.0f};
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var48);
    boolean var50 = org.apache.commons.math.util.MathUtils.equals(var40, var48);
    boolean var51 = org.apache.commons.math.util.MathUtils.equals(var38, var40);
    float[] var52 = null;
    float[] var55 = new float[] { 0.0f, 10.0f};
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var55);
    float[] var57 = null;
    float[] var60 = new float[] { 0.0f, 10.0f};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var57, var60);
    float[] var62 = null;
    float[] var65 = new float[] { 0.0f, 10.0f};
    boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var62, var65);
    boolean var67 = org.apache.commons.math.util.MathUtils.equals(var57, var65);
    boolean var68 = org.apache.commons.math.util.MathUtils.equals(var55, var57);
    boolean var69 = org.apache.commons.math.util.MathUtils.equals(var38, var57);
    boolean var70 = org.apache.commons.math.util.MathUtils.equals(var22, var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    int var5 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    boolean var7 = var3.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var3.getDirection();
    java.lang.Number var9 = var3.getPrevious();
    boolean var10 = var3.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1.0f+ "'", var9.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var28, var31);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double[][] var43 = new double[][] { var40};
    org.apache.commons.math.util.MathUtils.sortInPlace(var28, var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    org.apache.commons.math.exception.NonMonotonousSequenceException var53 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = var53.getDirection();
    boolean var57 = org.apache.commons.math.util.MathUtils.checkOrder(var48, var54, false, true);
    boolean var60 = org.apache.commons.math.util.MathUtils.checkOrder(var28, var54, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var7, var54, false);
    double[] var65 = new double[] { 1.0d, 10.0d};
    double[] var66 = org.apache.commons.math.util.MathUtils.copyOf(var65);
    double[] var69 = new double[] { 1.0d, 10.0d};
    double[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var69);
    double var71 = org.apache.commons.math.util.MathUtils.distance1(var66, var69);
    int var72 = org.apache.commons.math.util.MathUtils.hash(var69);
    org.apache.commons.math.exception.NonMonotonousSequenceException var79 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var80 = var79.getDirection();
    int var81 = var79.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var82 = var79.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var84 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var82, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var85 = var84.getDirection();
    boolean var88 = org.apache.commons.math.util.MathUtils.checkOrder(var69, var85, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var7, var85, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }
// 
// 
//     double var3 = org.apache.commons.math.util.MathUtils.reduce(1.4721312010883756d, (-1.0d), Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, (-2.2090209834105576d), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1911350603, 786341970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1125008633);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1911350513), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 786341970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-2), (-2));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var37.atan();
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.tanh();
    org.apache.commons.math.complex.Complex var43 = var41.exp();
    org.apache.commons.math.complex.Complex var44 = var43.acos();
    org.apache.commons.math.complex.Complex var45 = var44.sqrt();
    org.apache.commons.math.complex.Complex var46 = var45.tan();
    org.apache.commons.math.complex.Complex var47 = var37.multiply(var46);
    org.apache.commons.math.complex.Complex var48 = var47.tan();
    org.apache.commons.math.complex.Complex var50 = var48.multiply(0.09966865249116202d);
    double var51 = var48.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1.0000000001700238d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(100.00999950005d, 1.0d, (-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-99), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-198));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var8 = var2.nthRoot(0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, 100.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)0L);
    boolean var2 = var1.getBoundIsAllowed();
    org.apache.commons.math.exception.util.ExceptionContext var3 = var1.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var7.sin();
    org.apache.commons.math.complex.Complex var9 = var7.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-0.3359937911718539d), (-0.09966865249116202d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.3359937911718539d));

  }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }
// 
// 
//     org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(-1.0f));
//     org.apache.commons.math.exception.util.Localizable var2 = null;
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     java.lang.Object[] var6 = new java.lang.Object[] { 100.0d};
//     org.apache.commons.math.exception.MathArithmeticException var7 = new org.apache.commons.math.exception.MathArithmeticException(var4, var6);
//     org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException(var2, (java.lang.Number)0.0d, var6);
//     java.lang.Number var9 = var8.getArgument();
//     var1.addSuppressed((java.lang.Throwable)var8);
//     java.lang.String var11 = var8.toString();
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1911350515), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 98010L);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    org.apache.commons.math.complex.Complex var6 = var3.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test319() {}
//   public void test319() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, (-99));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(359.1342053695755d, 0.10016239685295168d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 786341969, (-30145599));
    int var4 = var3.getDimension();
    org.apache.commons.math.exception.util.ExceptionContext var5 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    org.apache.commons.math.exception.NumberIsTooLargeException var11 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)30.48232336227865d, (java.lang.Number)(-2.276056593552136d), true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(3628800.0d, (-1.1909687824208959d));
    org.apache.commons.math.complex.Complex var3 = var2.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-769953791));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.7659808551313332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.0003737438906983d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-638805082));

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 990L);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var5, (java.lang.Number)var10, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var10, 10L);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var2, var10);
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.math.BigInteger var18 = null;
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 0L);
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var25 = new org.apache.commons.math.exception.NumberIsTooSmallException(var17, (java.lang.Number)var22, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var22, 10L);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var10, var27);
    org.apache.commons.math.exception.NumberIsTooSmallException var31 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)var10, (java.lang.Number)1814400.000000139d, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    boolean var16 = org.apache.commons.math.util.MathUtils.checkOrder(var7, var13, false, true);
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var13, true);
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var3, 101);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var3, 786341970);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(4.605170185988092d, 0.29755448666817674d, 1592.3470367561051d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var11 = var10.sin();
    org.apache.commons.math.complex.Complex var12 = var2.multiply(var11);
    double var13 = var12.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8.4566787454165d);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.0049710332224018d, (-198));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var11 = var9.exp();
    org.apache.commons.math.complex.Complex var12 = var11.acos();
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    int[] var16 = new int[] { (-1)};
    int[] var20 = new int[] { 1, 100, 0};
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    int var22 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var21);
    int[] var24 = new int[] { (-1)};
    int[] var28 = new int[] { 1, 100, 0};
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var30 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var29);
    int var31 = org.apache.commons.math.util.MathUtils.distance1(var16, var24);
    int[] var35 = new int[] { 1, 100, 0};
    int[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    int var37 = org.apache.commons.math.util.MathUtils.distance1(var16, var35);
    int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    int[] var42 = new int[] { 1, 100, 0};
    int[] var43 = org.apache.commons.math.util.MathUtils.copyOf(var42);
    double var44 = org.apache.commons.math.util.MathUtils.distance(var16, var42);
    java.lang.Object[] var45 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NullArgumentException var46 = new org.apache.commons.math.exception.NullArgumentException(var14, var45);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var12, var13, var45);
    org.apache.commons.math.complex.Complex var48 = var6.add(var12);
    boolean var49 = var6.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(1.1147826214457093d, 1.5582781295114951d, 0.8968222924860055d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.21796032895970374d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(11900.950259059777d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.sin();
    org.apache.commons.math.complex.Complex var7 = var3.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, 0.8541874089757199d);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.complex.ComplexField var6 = var2.getField();
    boolean var7 = var2.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)0.7659808551313332d);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)0.39083465772316284d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.21891713329967522d), Double.NaN, (-9));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var6 = new double[] { (-1.0d)};
    double[] var8 = org.apache.commons.math.util.MathUtils.normalizeArray(var6, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var8, var9, true);
    double[] var18 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    double[] var30 = new double[] { 1.0d, 10.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double[] var34 = new double[] { 1.0d, 10.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var31, var34);
    double[][] var37 = new double[][] { var34};
    org.apache.commons.math.util.MathUtils.sortInPlace(var22, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var18, var22);
    double[] var42 = new double[] { 1.0d, 10.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.copyOf(var42);
    double[] var46 = new double[] { 1.0d, 10.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    double var48 = org.apache.commons.math.util.MathUtils.distance1(var43, var46);
    double[] var51 = new double[] { 1.0d, 10.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    double[] var55 = new double[] { 1.0d, 10.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance1(var52, var55);
    double[][] var58 = new double[][] { var55};
    org.apache.commons.math.util.MathUtils.sortInPlace(var43, var58);
    double[] var62 = new double[] { 1.0d, 10.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    double[] var64 = org.apache.commons.math.util.MathUtils.copyOf(var63);
    org.apache.commons.math.exception.NonMonotonousSequenceException var68 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var69 = var68.getDirection();
    boolean var72 = org.apache.commons.math.util.MathUtils.checkOrder(var63, var69, false, true);
    boolean var75 = org.apache.commons.math.util.MathUtils.checkOrder(var43, var69, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var22, var69, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var79 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)101, (java.lang.Number)0L, 2, var69, false);
    boolean var82 = org.apache.commons.math.util.MathUtils.checkOrder(var8, var69, false, true);
    boolean var85 = org.apache.commons.math.util.MathUtils.checkOrder(var1, var69, false, true);
    double[] var88 = new double[] { 1.0d, 10.0d};
    double[] var89 = org.apache.commons.math.util.MathUtils.copyOf(var88);
    double[] var90 = org.apache.commons.math.util.MathUtils.copyOf(var89);
    double[] var91 = org.apache.commons.math.util.MathUtils.copyOf(var89);
    boolean var92 = org.apache.commons.math.util.MathUtils.equals(var1, var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.ComplexField var7 = var6.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.ComplexField var4 = var3.getField();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var15 = var14.conjugate();
    java.lang.Object var16 = null;
    boolean var17 = var14.equals(var16);
    org.apache.commons.math.complex.Complex var18 = var14.sqrt1z();
    org.apache.commons.math.complex.Complex var19 = var7.add(var14);
    org.apache.commons.math.complex.Complex var20 = var3.pow(var19);
    org.apache.commons.math.complex.Complex var21 = var19.sqrt1z();
    org.apache.commons.math.complex.Complex var22 = var19.conjugate();
    org.apache.commons.math.complex.Complex var23 = var22.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
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

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    org.apache.commons.math.complex.Complex var43 = var32.acos();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.tanh();
    org.apache.commons.math.complex.Complex var48 = var46.exp();
    org.apache.commons.math.complex.Complex var49 = var46.sqrt();
    org.apache.commons.math.complex.Complex var50 = var49.sqrt1z();
    org.apache.commons.math.complex.Complex var51 = var49.sinh();
    org.apache.commons.math.complex.Complex var52 = var51.sin();
    org.apache.commons.math.complex.Complex var53 = var32.subtract(var52);
    org.apache.commons.math.complex.Complex var54 = var32.conjugate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNotNull(var54);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math.complex.Complex var21 = var19.atan();
    org.apache.commons.math.complex.Complex var22 = var21.sin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(11576.453488438818d, (-1118089298), 0);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)0L);
    org.apache.commons.math.exception.NotPositiveException var3 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)10.0d);
    boolean var4 = var3.getBoundIsAllowed();
    var1.addSuppressed((java.lang.Throwable)var3);
    org.apache.commons.math.exception.util.ExceptionContext var6 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.complex.Complex var3 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var3.exp();
    org.apache.commons.math.complex.Complex var6 = var5.acos();
    org.apache.commons.math.complex.Complex var8 = var6.multiply(100.0d);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var20);
    double var23 = org.apache.commons.math.util.MathUtils.distance1(var13, var17);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double[] var30 = new double[] { 1.0d, 10.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distance1(var27, var30);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var36, var39);
    double[][] var42 = new double[][] { var39};
    org.apache.commons.math.util.MathUtils.sortInPlace(var27, var42);
    org.apache.commons.math.util.MathUtils.sortInPlace(var13, var42);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)100.0d, var9, (java.lang.Object[])var42);
    org.apache.commons.math.exception.MathArithmeticException var46 = new org.apache.commons.math.exception.MathArithmeticException(var0, (java.lang.Object[])var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-769953791), 1566821946);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1814400.000000139d, 0.8541874089757199d, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    int[] var4 = new int[] { (-1)};
    int[] var8 = new int[] { 1, 100, 0};
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    int var10 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var9);
    int[] var12 = new int[] { (-1)};
    int[] var16 = new int[] { 1, 100, 0};
    int[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    int var18 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var17);
    int var19 = org.apache.commons.math.util.MathUtils.distance1(var4, var12);
    int[] var23 = new int[] { 1, 100, 0};
    int[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    int var25 = org.apache.commons.math.util.MathUtils.distance1(var4, var23);
    int[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var4);
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distance(var4, var30);
    java.lang.Object[] var33 = new java.lang.Object[] { var32};
    org.apache.commons.math.exception.NullArgumentException var34 = new org.apache.commons.math.exception.NullArgumentException(var2, var33);
    org.apache.commons.math.exception.NotFiniteNumberException var35 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1.3440585709080678E43d, var33);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-30145589));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test357() {}
//   public void test357() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }
// 
// 
//     double[] var0 = null;
//     double[] var3 = new double[] { 1.0d, 10.0d};
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var7 = new double[] { 1.0d, 10.0d};
//     double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
//     double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[] var16 = new double[] { 1.0d, 10.0d};
//     double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
//     double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
//     double[][] var19 = new double[][] { var16};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var4, var19);
//     org.apache.commons.math.util.MathUtils.checkOrder(var4);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var25 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var26 = var25.getDirection();
//     int var27 = var25.getIndex();
//     org.apache.commons.math.util.MathUtils.OrderDirection var28 = var25.getDirection();
//     org.apache.commons.math.util.MathUtils.checkOrder(var4, var28, true);
//     boolean var33 = org.apache.commons.math.util.MathUtils.checkOrder(var0, var28, false, true);
// 
//   }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 0.7473448710816473d, 0.738774844045322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(990L, (-1378206651628543415L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 0.0d);
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, (-0.21891713329967522d));
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    double[] var33 = new double[] { (-1.0d)};
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var33, 0.027339371326677953d);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double[] var42 = new double[] { 1.0d, 10.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.copyOf(var42);
    double var44 = org.apache.commons.math.util.MathUtils.distance1(var39, var42);
    boolean var45 = org.apache.commons.math.util.MathUtils.equals(var33, var39);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var33);
    double[] var48 = new double[] { (-1.0d)};
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 0.027339371326677953d);
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var48, 99);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var48);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var60 = new double[] { 1.0d, 10.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var57, var60);
    int var63 = org.apache.commons.math.util.MathUtils.hash(var60);
    double[] var66 = new double[] { 1.0d, 10.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    double[] var68 = org.apache.commons.math.util.MathUtils.copyOf(var67);
    org.apache.commons.math.exception.NonMonotonousSequenceException var72 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var73 = var72.getDirection();
    boolean var76 = org.apache.commons.math.util.MathUtils.checkOrder(var67, var73, false, true);
    double[][] var77 = new double[][] { var67};
    org.apache.commons.math.util.MathUtils.sortInPlace(var60, var77);
    double[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double[] var80 = org.apache.commons.math.util.MathUtils.copyOf(var79);
    double var81 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var79);
    double[] var83 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 0.7659808551313332d);
    int var84 = org.apache.commons.math.util.MathUtils.hash(var83);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var85 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var83);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 2007782533);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var5 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var8 = new org.apache.commons.math.exception.MathArithmeticException(var5, var7);
    org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var3, (java.lang.Number)0.0d, var7);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(byte)0, var2, var7);
    org.apache.commons.math.exception.NotFiniteNumberException var11 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)(-1.114782621445709d), var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    boolean var19 = var18.isNaN();
    org.apache.commons.math.complex.Complex var20 = var18.asin();
    org.apache.commons.math.complex.Complex var21 = var9.divide(var18);
    org.apache.commons.math.complex.Complex var23 = var18.multiply(3.7168146928204138d);
    double var24 = var23.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 37.3535253695998d);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1592.3470367561051d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var17 = null;
    float[] var20 = new float[] { 0.0f, 10.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var20);
    float[] var22 = null;
    float[] var25 = new float[] { 0.0f, 10.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var25);
    float[] var27 = null;
    float[] var30 = new float[] { 0.0f, 10.0f};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var30);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var22, var30);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var20, var22);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var3, var22);
    float[] var35 = null;
    boolean var36 = org.apache.commons.math.util.MathUtils.equals(var22, var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.8968222924860055d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.429831645580333d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    boolean var7 = var6.getStrict();
    int var8 = var6.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2, (java.lang.Number)3.7168146928204138d, 0, var9, true);
    boolean var12 = var11.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var11.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var11.getDirection();
    java.lang.Number var15 = var11.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 3.7168146928204138d+ "'", var15.equals(3.7168146928204138d));

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, (-0.0f), (-1686316699));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.acos();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    java.lang.Object var8 = null;
    boolean var9 = var6.equals(var8);
    org.apache.commons.math.complex.Complex var10 = var6.sin();
    org.apache.commons.math.complex.Complex var11 = var6.tanh();
    org.apache.commons.math.complex.Complex var12 = var6.acos();
    org.apache.commons.math.complex.Complex var13 = var2.multiply(var12);
    org.apache.commons.math.complex.Complex var14 = var2.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
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

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1074790369));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.114782621445709d), 11.180339887498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var17 = null;
    float[] var20 = new float[] { 0.0f, 10.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var17);
    float[] var23 = null;
    float[] var26 = new float[] { 0.0f, 10.0f};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var26);
    float[] var28 = null;
    float[] var31 = new float[] { 0.0f, 10.0f};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var23, var31);
    float[] var34 = null;
    float[] var37 = new float[] { 0.0f, 10.0f};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var37);
    float[] var39 = null;
    float[] var42 = new float[] { 0.0f, 10.0f};
    boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var42);
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var34, var42);
    float[] var45 = null;
    float[] var48 = new float[] { 0.0f, 10.0f};
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var48);
    float[] var50 = null;
    float[] var53 = new float[] { 0.0f, 10.0f};
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var53);
    float[] var55 = null;
    float[] var58 = new float[] { 0.0f, 10.0f};
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var58);
    boolean var60 = org.apache.commons.math.util.MathUtils.equals(var50, var58);
    boolean var61 = org.apache.commons.math.util.MathUtils.equals(var48, var50);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var48);
    boolean var63 = org.apache.commons.math.util.MathUtils.equals(var23, var48);
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    boolean var19 = var18.isNaN();
    org.apache.commons.math.complex.Complex var20 = var18.asin();
    org.apache.commons.math.complex.Complex var21 = var9.divide(var18);
    org.apache.commons.math.complex.Complex var23 = var18.multiply(3.7168146928204138d);
    org.apache.commons.math.complex.Complex var24 = var23.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    java.lang.String var5 = var2.toString();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    boolean var10 = var9.isNaN();
    org.apache.commons.math.complex.Complex var11 = var9.asin();
    org.apache.commons.math.complex.Complex var12 = var2.multiply(var9);
    org.apache.commons.math.complex.Complex var13 = var2.acos();
    org.apache.commons.math.complex.Complex var14 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var15 = var13.add(var14);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(10.0, -1.0)"+ "'", var5.equals("(10.0, -1.0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tanh();
    org.apache.commons.math.complex.Complex var39 = var36.tanh();
    org.apache.commons.math.complex.Complex var40 = var36.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(869829230, (-9));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-224004970), (-793020320));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 101);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var3, (java.lang.Number)0.08338435247423098d, true);
    java.lang.Number var9 = var8.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.08338435247423098d+ "'", var9.equals(0.08338435247423098d));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    java.lang.Object[] var4 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var5 = new org.apache.commons.math.exception.MathArithmeticException(var2, var4);
    org.apache.commons.math.exception.NotFiniteNumberException var6 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)0.0d, var4);
    java.lang.Number var7 = var6.getArgument();
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.11038096704629749d), 0.39083465772316284d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double[][] var31 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var42 = var41.getDirection();
    boolean var45 = org.apache.commons.math.util.MathUtils.checkOrder(var36, var42, false, true);
    boolean var48 = org.apache.commons.math.util.MathUtils.checkOrder(var16, var42, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var50 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var11, 10, var42, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var11, (-99000L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6884459544518584d);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.1147826214457093d, (-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var13 = var12.exp();
    org.apache.commons.math.complex.Complex var14 = var13.tanh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1893909151162593279L), 9801000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1111484299649056767L));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    int var5 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    int var8 = var3.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-9), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    boolean var38 = var9.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.09966865249116202d), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.tanh();
    org.apache.commons.math.complex.Complex var32 = var30.exp();
    org.apache.commons.math.complex.Complex var33 = var30.sqrt();
    org.apache.commons.math.complex.Complex var34 = var33.sqrt1z();
    boolean var35 = var33.isInfinite();
    org.apache.commons.math.complex.Complex var36 = var27.pow(var33);
    org.apache.commons.math.complex.Complex var37 = var36.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), (-0.0f), (-30145589));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    double[] var5 = new double[] { 1.0d, 10.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var9);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var18);
    double[][] var21 = new double[][] { var18};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var21);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)Double.NaN, var2, (java.lang.Object[])var21);
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(786341870, (-1118089298));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1904431168);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0049710332224018d, 4.3611853051969955d, 1566822045);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(2007782533);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var20 = new int[] { 1, 100, 0};
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
    int[] var24 = new int[] { (-1)};
    int[] var28 = new int[] { 1, 100, 0};
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var30 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var29);
    int[] var32 = new int[] { (-1)};
    int[] var36 = new int[] { 1, 100, 0};
    int[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    int var38 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var37);
    int var39 = org.apache.commons.math.util.MathUtils.distance1(var24, var32);
    int[] var43 = new int[] { 1, 100, 0};
    int[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var24, var43);
    int var46 = org.apache.commons.math.util.MathUtils.distance1(var1, var43);
    int[] var50 = new int[] { 1, 100, 0};
    int[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var43, var51);
    int[] var54 = new int[] { (-1)};
    int[] var58 = new int[] { 1, 100, 0};
    int[] var59 = org.apache.commons.math.util.MathUtils.copyOf(var58);
    int var60 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var59);
    int[] var62 = new int[] { (-1)};
    int[] var66 = new int[] { 1, 100, 0};
    int[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    int var68 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var67);
    int var69 = org.apache.commons.math.util.MathUtils.distance1(var54, var62);
    int[] var73 = new int[] { 1, 100, 0};
    int[] var74 = org.apache.commons.math.util.MathUtils.copyOf(var73);
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var54, var73);
    int var76 = org.apache.commons.math.util.MathUtils.distanceInf(var51, var73);
    int[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var51, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    double[] var4 = new double[] { 1.0d, 10.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var4);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distance1(var5, var8);
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var5, var14);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
    int var26 = org.apache.commons.math.util.MathUtils.hash(var23);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var36 = var35.getDirection();
    boolean var39 = org.apache.commons.math.util.MathUtils.checkOrder(var30, var36, false, true);
    double[][] var40 = new double[][] { var30};
    org.apache.commons.math.util.MathUtils.sortInPlace(var23, var40);
    org.apache.commons.math.util.MathUtils.sortInPlace(var5, var40);
    org.apache.commons.math.exception.NullArgumentException var43 = new org.apache.commons.math.exception.NullArgumentException(var1, (java.lang.Object[])var40);
    org.apache.commons.math.exception.NullArgumentException var44 = new org.apache.commons.math.exception.NullArgumentException(var0, (java.lang.Object[])var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(2, 786341870);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 786341872);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.5573913107228545d), 0.02191423518768043d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-2.0d), (java.lang.Number)(-9), false);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    double[] var5 = new double[] { 1.0d, 10.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var9);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var18);
    double[][] var21 = new double[][] { var18};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var21);
    org.apache.commons.math.exception.NotFiniteNumberException var23 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)10.0f, (java.lang.Object[])var21);
    org.apache.commons.math.exception.NotFiniteNumberException var24 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, var1, (java.lang.Object[])var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(1.9984630277548983d, 0.0d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.19801980198019803d), 0.7659808551313332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-99));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    int var9 = org.apache.commons.math.util.MathUtils.hash(var6);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var18.getDirection();
    boolean var22 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var19, false, true);
    double[][] var23 = new double[][] { var13};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var23);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double var43 = org.apache.commons.math.util.MathUtils.distance1(var33, var37);
    double var44 = org.apache.commons.math.util.MathUtils.distance(var28, var37);
    org.apache.commons.math.util.MathUtils.checkOrder(var37);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var37);
    double[] var50 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var53 = new double[] { 1.0d, 10.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance1(var54, var57);
    double[] var62 = new double[] { 1.0d, 10.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    double[] var66 = new double[] { 1.0d, 10.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance1(var63, var66);
    double[][] var69 = new double[][] { var66};
    org.apache.commons.math.util.MathUtils.sortInPlace(var54, var69);
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var50, var54);
    double[] var74 = new double[] { 1.0d, 10.0d};
    double[] var75 = org.apache.commons.math.util.MathUtils.copyOf(var74);
    double[] var78 = new double[] { 1.0d, 10.0d};
    double[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var78);
    double var80 = org.apache.commons.math.util.MathUtils.distance1(var75, var78);
    int var81 = org.apache.commons.math.util.MathUtils.hash(var78);
    double[] var84 = new double[] { 1.0d, 10.0d};
    double[] var85 = org.apache.commons.math.util.MathUtils.copyOf(var84);
    double[] var86 = org.apache.commons.math.util.MathUtils.copyOf(var85);
    org.apache.commons.math.exception.NonMonotonousSequenceException var90 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var91 = var90.getDirection();
    boolean var94 = org.apache.commons.math.util.MathUtils.checkOrder(var85, var91, false, true);
    double[][] var95 = new double[][] { var85};
    org.apache.commons.math.util.MathUtils.sortInPlace(var78, var95);
    double[] var97 = org.apache.commons.math.util.MathUtils.copyOf(var78);
    boolean var98 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var97);
    boolean var99 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1911350515), 99);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    org.apache.commons.math.exception.MathArithmeticException var0 = new org.apache.commons.math.exception.MathArithmeticException();
    org.apache.commons.math.exception.util.ExceptionContext var1 = var0.getContext();
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.21796032895970374d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1795512867667309079L, 990L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(8696596474033946625L, 6891033258142766080L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.0049710332224018d);
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    org.apache.commons.math.complex.Complex var9 = var8.log();
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    java.lang.Object var15 = null;
    boolean var16 = var13.equals(var15);
    org.apache.commons.math.complex.Complex var17 = var13.acos();
    org.apache.commons.math.complex.Complex var20 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var21 = var20.conjugate();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    org.apache.commons.math.complex.Complex var26 = var25.tanh();
    org.apache.commons.math.complex.Complex var29 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var30 = var29.conjugate();
    java.lang.Object var31 = null;
    boolean var32 = var29.equals(var31);
    org.apache.commons.math.complex.Complex var33 = var29.sqrt1z();
    org.apache.commons.math.complex.Complex var34 = var25.divide(var29);
    org.apache.commons.math.complex.Complex var35 = var20.divide(var34);
    java.util.List var37 = var34.nthRoot(1);
    org.apache.commons.math.complex.Complex var38 = var17.multiply(var34);
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    org.apache.commons.math.complex.ComplexField var43 = var42.getField();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.conjugate();
    java.lang.Object var48 = null;
    boolean var49 = var46.equals(var48);
    org.apache.commons.math.complex.Complex var50 = var46.sqrt1z();
    org.apache.commons.math.complex.Complex var53 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var54 = var53.conjugate();
    java.lang.Object var55 = null;
    boolean var56 = var53.equals(var55);
    org.apache.commons.math.complex.Complex var57 = var53.sqrt1z();
    org.apache.commons.math.complex.Complex var58 = var46.add(var53);
    org.apache.commons.math.complex.Complex var59 = var42.pow(var58);
    org.apache.commons.math.complex.Complex var60 = var34.pow(var42);
    org.apache.commons.math.complex.Complex var61 = var10.multiply(var34);
    boolean var62 = var10.isInfinite();
    org.apache.commons.math.complex.Complex var63 = var10.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1795512867667309079L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1795512867667309079L));

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.546012682779287d, 1.0049710332224018d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.sign(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-30145589), 786341970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-816487559));

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 1.0f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(11901.05042145663d, 1.9984630277548983d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    float[] var2 = new float[] { (-1.0f), 1.0f};
    float[] var6 = new float[] { 1.0f, 10.0f, 0.0f};
    boolean var7 = org.apache.commons.math.util.MathUtils.equals(var2, var6);
    float[] var8 = null;
    float[] var11 = new float[] { 0.0f, 10.0f};
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var8, var11);
    float[] var13 = null;
    float[] var16 = new float[] { 0.0f, 10.0f};
    boolean var17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var16);
    float[] var18 = null;
    float[] var21 = new float[] { 0.0f, 10.0f};
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var21);
    boolean var23 = org.apache.commons.math.util.MathUtils.equals(var13, var21);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var11, var13);
    float[] var25 = null;
    float[] var28 = new float[] { 0.0f, 10.0f};
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var25);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var2, var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-638805082));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.conjugate();
    org.apache.commons.math.complex.ComplexField var32 = var31.getField();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var42 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var43 = var42.conjugate();
    java.lang.Object var44 = null;
    boolean var45 = var42.equals(var44);
    org.apache.commons.math.complex.Complex var46 = var42.sqrt1z();
    org.apache.commons.math.complex.Complex var47 = var35.add(var42);
    org.apache.commons.math.complex.Complex var48 = var31.pow(var47);
    org.apache.commons.math.complex.Complex var49 = var23.pow(var31);
    double var50 = var49.getReal();
    boolean var51 = var49.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-0.3359937911718539d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 990L);
    java.math.BigInteger var11 = null;
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var11, 0L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 101);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)990L, (java.lang.Number)var15, (-30145599));
    java.math.BigInteger var19 = null;
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var19, 0L);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var21, 990L);
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var23, 0);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double[] var37 = new double[] { 1.0d, 10.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var34, var37);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var30, var34);
    org.apache.commons.math.exception.NonMonotonousSequenceException var47 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var48 = var47.getDirection();
    int var49 = var47.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var50 = var47.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var52 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var50, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var53 = var52.getDirection();
    boolean var56 = org.apache.commons.math.util.MathUtils.checkOrder(var34, var53, false, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var58 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0d, (java.lang.Number)var23, 10, var53, false);
    java.math.BigInteger var59 = null;
    java.math.BigInteger var61 = org.apache.commons.math.util.MathUtils.pow(var59, 0L);
    java.math.BigInteger var63 = org.apache.commons.math.util.MathUtils.pow(var61, 990L);
    org.apache.commons.math.exception.util.Localizable var64 = null;
    java.math.BigInteger var65 = null;
    java.math.BigInteger var67 = org.apache.commons.math.util.MathUtils.pow(var65, 0L);
    java.math.BigInteger var69 = org.apache.commons.math.util.MathUtils.pow(var67, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var72 = new org.apache.commons.math.exception.NumberIsTooSmallException(var64, (java.lang.Number)var69, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var74 = org.apache.commons.math.util.MathUtils.pow(var69, 10L);
    java.math.BigInteger var75 = org.apache.commons.math.util.MathUtils.pow(var61, var69);
    org.apache.commons.math.exception.util.Localizable var76 = null;
    java.math.BigInteger var77 = null;
    java.math.BigInteger var79 = org.apache.commons.math.util.MathUtils.pow(var77, 0L);
    java.math.BigInteger var81 = org.apache.commons.math.util.MathUtils.pow(var79, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var84 = new org.apache.commons.math.exception.NumberIsTooSmallException(var76, (java.lang.Number)var81, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var86 = org.apache.commons.math.util.MathUtils.pow(var81, 10L);
    java.math.BigInteger var87 = org.apache.commons.math.util.MathUtils.pow(var69, var86);
    java.math.BigInteger var88 = org.apache.commons.math.util.MathUtils.pow(var23, var87);
    java.math.BigInteger var89 = org.apache.commons.math.util.MathUtils.pow(var15, var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1118089298));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm((-1795512867667309079L), 6891033258142766080L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.sin();
    org.apache.commons.math.complex.Complex var7 = var6.tanh();
    double var8 = var6.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-0.9860778625231765d));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.acos();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    java.lang.Object var8 = null;
    boolean var9 = var6.equals(var8);
    org.apache.commons.math.complex.Complex var10 = var6.sin();
    org.apache.commons.math.complex.Complex var11 = var6.tanh();
    org.apache.commons.math.complex.Complex var12 = var6.acos();
    org.apache.commons.math.complex.Complex var13 = var2.multiply(var12);
    org.apache.commons.math.complex.Complex var14 = var12.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
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

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1125008633, 869829230);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(100.00999950005d, (-0.21891713329967522d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.9801980198019803d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.144873561044819d);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = var17.getDirection();
    boolean var21 = org.apache.commons.math.util.MathUtils.checkOrder(var12, var18, false, true);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-90));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var18 = new int[] { (-1)};
    int[] var22 = new int[] { 1, 100, 0};
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
    int[] var26 = new int[] { (-1)};
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
    int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var1, var18);
    int[] var36 = new int[] { (-1)};
    int[] var40 = new int[] { 1, 100, 0};
    int[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    int var42 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var41);
    int[] var44 = new int[] { (-1)};
    int[] var48 = new int[] { 1, 100, 0};
    int[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    int var50 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var49);
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var36, var44);
    int[] var55 = new int[] { 1, 100, 0};
    int[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    int var57 = org.apache.commons.math.util.MathUtils.distance1(var36, var55);
    int[] var59 = new int[] { (-1)};
    int[] var63 = new int[] { 1, 100, 0};
    int[] var64 = org.apache.commons.math.util.MathUtils.copyOf(var63);
    int var65 = org.apache.commons.math.util.MathUtils.distanceInf(var59, var64);
    int[] var67 = new int[] { (-1)};
    int[] var71 = new int[] { 1, 100, 0};
    int[] var72 = org.apache.commons.math.util.MathUtils.copyOf(var71);
    int var73 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var72);
    int var74 = org.apache.commons.math.util.MathUtils.distance1(var59, var67);
    int[] var78 = new int[] { 1, 100, 0};
    int[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var78);
    int var80 = org.apache.commons.math.util.MathUtils.distance1(var59, var78);
    int var81 = org.apache.commons.math.util.MathUtils.distance1(var36, var78);
    int[] var85 = new int[] { 1, 100, 0};
    int[] var86 = org.apache.commons.math.util.MathUtils.copyOf(var85);
    int var87 = org.apache.commons.math.util.MathUtils.distanceInf(var78, var86);
    double var88 = org.apache.commons.math.util.MathUtils.distance(var1, var86);
    int[] var90 = org.apache.commons.math.util.MathUtils.copyOf(var86, 0);
    int[] var91 = org.apache.commons.math.util.MathUtils.copyOf(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.546012682779287d, 100.00999950005d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(byte)(-1), (java.lang.Number)0.0f, false);
    org.apache.commons.math.exception.util.ExceptionContext var5 = var4.getContext();
    boolean var6 = var4.getBoundIsAllowed();
    boolean var7 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10);
    java.math.BigInteger var11 = null;
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var11, 0L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 990L);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.math.BigInteger var17 = null;
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0L);
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var19, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var24 = new org.apache.commons.math.exception.NumberIsTooSmallException(var16, (java.lang.Number)var21, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var21, 10L);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var13, var21);
    org.apache.commons.math.exception.util.Localizable var28 = null;
    java.math.BigInteger var29 = null;
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var29, 0L);
    java.math.BigInteger var33 = org.apache.commons.math.util.MathUtils.pow(var31, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var36 = new org.apache.commons.math.exception.NumberIsTooSmallException(var28, (java.lang.Number)var33, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var33, 10L);
    java.math.BigInteger var39 = org.apache.commons.math.util.MathUtils.pow(var21, var38);
    java.math.BigInteger var40 = org.apache.commons.math.util.MathUtils.pow(var10, var39);
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.exception.util.Localizable var43 = null;
    int[] var45 = new int[] { (-1)};
    int[] var49 = new int[] { 1, 100, 0};
    int[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var49);
    int var51 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var50);
    int[] var53 = new int[] { (-1)};
    int[] var57 = new int[] { 1, 100, 0};
    int[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var53, var58);
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var45, var53);
    int[] var64 = new int[] { 1, 100, 0};
    int[] var65 = org.apache.commons.math.util.MathUtils.copyOf(var64);
    int var66 = org.apache.commons.math.util.MathUtils.distance1(var45, var64);
    int[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    int[] var71 = new int[] { 1, 100, 0};
    int[] var72 = org.apache.commons.math.util.MathUtils.copyOf(var71);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var45, var71);
    java.lang.Object[] var74 = new java.lang.Object[] { var73};
    org.apache.commons.math.exception.NullArgumentException var75 = new org.apache.commons.math.exception.NullArgumentException(var43, var74);
    org.apache.commons.math.exception.NotFiniteNumberException var76 = new org.apache.commons.math.exception.NotFiniteNumberException(var41, (java.lang.Number)1.3440585709080678E43d, var74);
    org.apache.commons.math.exception.NotFiniteNumberException var77 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var40, var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-2.5469187218411187d), var2, true);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    int var39 = org.apache.commons.math.util.MathUtils.hash(var38);
    org.apache.commons.math.exception.NonMonotonousSequenceException var46 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var47 = var46.getDirection();
    int var48 = var46.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var49 = var46.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var51 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var49, false);
    double[] var54 = new double[] { 1.0d, 10.0d};
    double[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    double[] var58 = new double[] { 1.0d, 10.0d};
    double[] var59 = org.apache.commons.math.util.MathUtils.copyOf(var58);
    double[] var62 = new double[] { 1.0d, 10.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distance1(var59, var62);
    double var65 = org.apache.commons.math.util.MathUtils.distance1(var55, var59);
    double[] var68 = new double[] { 1.0d, 10.0d};
    double[] var69 = org.apache.commons.math.util.MathUtils.copyOf(var68);
    double[] var72 = new double[] { 1.0d, 10.0d};
    double[] var73 = org.apache.commons.math.util.MathUtils.copyOf(var72);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var69, var72);
    double[] var77 = new double[] { 1.0d, 10.0d};
    double[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var77);
    double[] var81 = new double[] { 1.0d, 10.0d};
    double[] var82 = org.apache.commons.math.util.MathUtils.copyOf(var81);
    double var83 = org.apache.commons.math.util.MathUtils.distance1(var78, var81);
    double[][] var84 = new double[][] { var81};
    org.apache.commons.math.util.MathUtils.sortInPlace(var69, var84);
    org.apache.commons.math.util.MathUtils.sortInPlace(var55, var84);
    org.apache.commons.math.util.MathUtils.sortInPlace(var38, var49, var84);
    double[] var89 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 2.3097117106971785d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    double[] var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    double[] var4 = new double[] { (-1.0d)};
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 0.027339371326677953d);
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double var15 = org.apache.commons.math.util.MathUtils.distance1(var10, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var4, var10);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var20, var29);
    double[] var34 = new double[] { 1.0d, 10.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var35, var38);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var38);
    double[] var44 = new double[] { 1.0d, 10.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    org.apache.commons.math.exception.NonMonotonousSequenceException var50 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var51 = var50.getDirection();
    boolean var54 = org.apache.commons.math.util.MathUtils.checkOrder(var45, var51, false, true);
    double[][] var55 = new double[][] { var45};
    org.apache.commons.math.util.MathUtils.sortInPlace(var38, var55);
    org.apache.commons.math.util.MathUtils.sortInPlace(var20, var55);
    org.apache.commons.math.util.MathUtils.sortInPlace(var10, var55);
    org.apache.commons.math.exception.NotFiniteNumberException var59 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)1795512867667309078L, (java.lang.Object[])var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var55);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var5 = null;
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var14, var17);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var10, var14);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var24, var27);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var33, var36);
    double[][] var39 = new double[][] { var36};
    org.apache.commons.math.util.MathUtils.sortInPlace(var24, var39);
    org.apache.commons.math.util.MathUtils.sortInPlace(var10, var39);
    org.apache.commons.math.exception.NotFiniteNumberException var42 = new org.apache.commons.math.exception.NotFiniteNumberException(var5, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NotFiniteNumberException var43 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NullArgumentException var44 = new org.apache.commons.math.exception.NullArgumentException(var3, (java.lang.Object[])var39);
    org.apache.commons.math.exception.MathArithmeticException var45 = new org.apache.commons.math.exception.MathArithmeticException(var2, (java.lang.Object[])var39);
    org.apache.commons.math.exception.MathArithmeticException var46 = new org.apache.commons.math.exception.MathArithmeticException(var1, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NullArgumentException var47 = new org.apache.commons.math.exception.NullArgumentException(var0, (java.lang.Object[])var39);
    org.apache.commons.math.exception.util.Localizable var48 = null;
    double[] var52 = new double[] { 1.0d, 10.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double var58 = org.apache.commons.math.util.MathUtils.distance1(var53, var56);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double[] var65 = new double[] { 1.0d, 10.0d};
    double[] var66 = org.apache.commons.math.util.MathUtils.copyOf(var65);
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var62, var65);
    double[][] var68 = new double[][] { var65};
    org.apache.commons.math.util.MathUtils.sortInPlace(var53, var68);
    org.apache.commons.math.exception.NotFiniteNumberException var70 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)10.0f, (java.lang.Object[])var68);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var47, var48, (java.lang.Object[])var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1592.3470367561051d, 0.10016239685295168d, (-1686316699));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1378206651628553215L, (-1378206651628543415L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2756413303257096630L);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1111484299649056767L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1L);
    java.lang.Number var3 = var2.getMin();
    java.lang.Number var4 = var2.getMin();
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.math.BigInteger var7 = null;
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0L);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var9, 990L);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.math.BigInteger var13 = null;
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 0L);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var12, (java.lang.Number)var17, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var17, 10L);
    org.apache.commons.math.exception.NumberIsTooSmallException var24 = new org.apache.commons.math.exception.NumberIsTooSmallException(var6, (java.lang.Number)var9, (java.lang.Number)var22, false);
    double[] var26 = new double[] { (-1.0d)};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 0.027339371326677953d);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var35);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var26, var32);
    double[] var41 = new double[] { 1.0d, 10.0d};
    double[] var42 = org.apache.commons.math.util.MathUtils.copyOf(var41);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double var47 = org.apache.commons.math.util.MathUtils.distance1(var42, var45);
    double[] var50 = new double[] { 1.0d, 10.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var42, var51);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var60 = new double[] { 1.0d, 10.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var57, var60);
    int var63 = org.apache.commons.math.util.MathUtils.hash(var60);
    double[] var66 = new double[] { 1.0d, 10.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    double[] var68 = org.apache.commons.math.util.MathUtils.copyOf(var67);
    org.apache.commons.math.exception.NonMonotonousSequenceException var72 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var73 = var72.getDirection();
    boolean var76 = org.apache.commons.math.util.MathUtils.checkOrder(var67, var73, false, true);
    double[][] var77 = new double[][] { var67};
    org.apache.commons.math.util.MathUtils.sortInPlace(var60, var77);
    org.apache.commons.math.util.MathUtils.sortInPlace(var42, var77);
    org.apache.commons.math.util.MathUtils.sortInPlace(var32, var77);
    org.apache.commons.math.exception.NotFiniteNumberException var81 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var22, (java.lang.Object[])var77);
    org.apache.commons.math.exception.NumberIsTooSmallException var83 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)1.5374020457163808d, (java.lang.Number)var22, false);
    var2.addSuppressed((java.lang.Throwable)var83);
    java.lang.Number var85 = var83.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.39083465772316284d, 11900.950259059777d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)8868003302922989569L, (java.lang.Number)0, true);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    boolean var20 = var19.isInfinite();
    org.apache.commons.math.complex.Complex var21 = var19.sinh();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    boolean var26 = var25.isNaN();
    double var27 = var25.getArgument();
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.tanh();
    org.apache.commons.math.complex.Complex var32 = var30.exp();
    org.apache.commons.math.complex.Complex var33 = var30.sqrt();
    java.lang.String var34 = var33.toString();
    org.apache.commons.math.complex.Complex var35 = var25.divide(var33);
    org.apache.commons.math.complex.Complex var38 = new org.apache.commons.math.complex.Complex((-1.0d), 0.10016239685295168d);
    org.apache.commons.math.complex.Complex var40 = var38.multiply(1.5582781295114951d);
    org.apache.commons.math.complex.Complex var41 = var40.exp();
    org.apache.commons.math.complex.Complex var42 = var41.acos();
    org.apache.commons.math.complex.Complex var43 = var33.multiply(var42);
    org.apache.commons.math.complex.Complex var44 = var19.divide(var43);
    org.apache.commons.math.complex.Complex var45 = var44.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(3.166218219036781, -0.15791710027873845)"+ "'", var34.equals("(3.166218219036781, -0.15791710027873845)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
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
    assertNotNull(var45);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var33 = var32.sin();
    org.apache.commons.math.complex.Complex var34 = var33.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var34);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-9));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, (-638805082));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1378206651628553216L, (-989L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    org.apache.commons.math.complex.Complex var23 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var24 = var23.acos();
    org.apache.commons.math.complex.Complex var27 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var28 = var27.conjugate();
    java.lang.Object var29 = null;
    boolean var30 = var27.equals(var29);
    org.apache.commons.math.complex.Complex var31 = var27.sin();
    org.apache.commons.math.complex.Complex var32 = var27.tanh();
    org.apache.commons.math.complex.Complex var33 = var27.acos();
    org.apache.commons.math.complex.Complex var34 = var23.multiply(var33);
    org.apache.commons.math.complex.Complex var35 = var19.multiply(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0f, 10.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    org.apache.commons.math.util.MathUtils.checkOrder(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, (-1.0f), (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.19933730498232405d, true);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var13 = var12.exp();
    org.apache.commons.math.complex.Complex var14 = var12.exp();
    org.apache.commons.math.complex.Complex var16 = var14.multiply(0.0d);
    org.apache.commons.math.complex.Complex var17 = var14.asin();
    java.lang.String var18 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(2.612904955450767, 0.5242775318909058)"+ "'", var18.equals("(2.612904955450767, 0.5242775318909058)"));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.complex.Complex var9 = var8.acos();
    org.apache.commons.math.complex.Complex var10 = var8.tan();
    org.apache.commons.math.complex.Complex var11 = var8.sqrt1z();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
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

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var6, (java.lang.Number)1.0000000001700238d, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1074790369), 1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1074789359));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    int var5 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    boolean var7 = var3.getStrict();
    boolean var8 = var3.getStrict();
    boolean var9 = var3.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(5L, 1795512867667309079L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(90, (-638805082));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 638805172);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.conjugate();
    org.apache.commons.math.complex.ComplexField var32 = var31.getField();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var42 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var43 = var42.conjugate();
    java.lang.Object var44 = null;
    boolean var45 = var42.equals(var44);
    org.apache.commons.math.complex.Complex var46 = var42.sqrt1z();
    org.apache.commons.math.complex.Complex var47 = var35.add(var42);
    org.apache.commons.math.complex.Complex var48 = var31.pow(var47);
    org.apache.commons.math.complex.Complex var49 = var23.pow(var31);
    org.apache.commons.math.complex.Complex var50 = var23.cosh();
    org.apache.commons.math.exception.util.Localizable var51 = null;
    org.apache.commons.math.exception.DimensionMismatchException var54 = new org.apache.commons.math.exception.DimensionMismatchException(var51, 101, 99);
    java.lang.Throwable[] var55 = var54.getSuppressed();
    boolean var56 = var50.equals((java.lang.Object)var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)(-1.114782621445709d), false);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-2.2090209834105576d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var2.negate();
    org.apache.commons.math.complex.Complex var7 = var2.atan();
    org.apache.commons.math.complex.Complex var8 = var2.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.10016239685295168d, (-469.2030354410471d), (-1911350513));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.log();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.acos();
    org.apache.commons.math.complex.Complex var12 = var2.pow(var7);
    org.apache.commons.math.complex.Complex var13 = var7.acos();
    org.apache.commons.math.complex.Complex var14 = var13.tanh();
    org.apache.commons.math.complex.Complex var16 = var14.multiply(8.655154728221008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.conjugate();
    org.apache.commons.math.complex.Complex var6 = var2.tanh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-769953791), (-1911350515));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }
// 
// 
//     int[] var0 = null;
//     int[] var1 = org.apache.commons.math.util.MathUtils.copyOf(var0);
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(2, (-99));
    java.lang.Throwable[] var3 = var2.getSuppressed();
    int var4 = var2.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-99));

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(77651344L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    int var11 = var9.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var12, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)9801000L, var1, (-224004970), var15, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var7, (-198));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10.04987562112089d);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var15 = var9.negate();
    org.apache.commons.math.complex.ComplexField var16 = var15.getField();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.5582781295114951d, 1.9984630277548983d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(0.0d, (-2.2090209834105576d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1656171101, (-769953791));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(8.655154728220008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-1118089298), 1);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.9984630277548983d, (java.lang.Number)35853.36506461688d, true);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double var16 = org.apache.commons.math.util.MathUtils.distance1(var11, var14);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var7, var11);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var24);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var33);
    double[][] var36 = new double[][] { var33};
    org.apache.commons.math.util.MathUtils.sortInPlace(var21, var36);
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var36);
    org.apache.commons.math.exception.NotFiniteNumberException var39 = new org.apache.commons.math.exception.NotFiniteNumberException(var2, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var36);
    org.apache.commons.math.exception.NotFiniteNumberException var40 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var36);
    org.apache.commons.math.exception.MathIllegalArgumentException var41 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100L, (java.lang.Number)(short)10, 100, var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var5.getDirection();
    int var7 = var5.getIndex();
    java.lang.Number var8 = var5.getPrevious();
    java.lang.Number var9 = var5.getPrevious();
    java.lang.Number var10 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)10+ "'", var8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)10+ "'", var9.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (short)10+ "'", var10.equals((short)10));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    double var7 = var2.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.0d));

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.sin();
    org.apache.commons.math.complex.Complex var6 = var5.cos();
    boolean var7 = var5.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    org.apache.commons.math.complex.Complex var8 = var7.tanh();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var12 = var11.conjugate();
    java.lang.Object var13 = null;
    boolean var14 = var11.equals(var13);
    org.apache.commons.math.complex.Complex var15 = var11.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var7.divide(var11);
    org.apache.commons.math.complex.Complex var17 = var2.divide(var16);
    java.util.List var19 = var16.nthRoot(1);
    org.apache.commons.math.complex.Complex var20 = var16.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    java.lang.Object var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    boolean var9 = var8.getStrict();
    int var10 = var8.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var8.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2, (java.lang.Number)3.7168146928204138d, 0, var11, true);
    boolean var14 = var13.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var13.getDirection();
    java.lang.Throwable[] var16 = var13.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0, var1, (java.lang.Object[])var16);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-1.114782621445709d), 3.170153879722701d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.168402685733877d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.5374020457163808d, 1.0000000001700238d, (-793020320));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var11 = var10.sin();
    org.apache.commons.math.complex.Complex var12 = var2.multiply(var11);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var19 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var20 = var19.acos();
    org.apache.commons.math.complex.Complex var21 = var15.multiply(var20);
    org.apache.commons.math.complex.Complex var22 = var21.sinh();
    org.apache.commons.math.complex.Complex var25 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var26 = var25.tanh();
    boolean var27 = var25.isInfinite();
    double var28 = var25.getReal();
    org.apache.commons.math.complex.Complex var29 = var25.sqrt1z();
    org.apache.commons.math.complex.Complex var30 = var22.add(var29);
    java.util.List var32 = var29.nthRoot(1010);
    org.apache.commons.math.complex.Complex var33 = var2.multiply(var29);
    org.apache.commons.math.complex.Complex var34 = var33.cosh();
    boolean var35 = var33.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.exp();
    org.apache.commons.math.complex.Complex var7 = var6.sqrt();
    org.apache.commons.math.complex.Complex var8 = var7.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.0049710332224018d, 224004970, (-769953791));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1795512867667309079L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1795512867667309179L));

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 8.655154728220008E12d);
    double[] var52 = new double[] { (-1.0d)};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.027339371326677953d);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var52, var58);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.0d);
    double[] var68 = org.apache.commons.math.util.MathUtils.copyOf(var52, 99);
    double var69 = org.apache.commons.math.util.MathUtils.distance1(var50, var68);
    double[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 8.655154728221008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    double var20 = var13.abs();
    org.apache.commons.math.complex.Complex var23 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var24 = var23.tanh();
    org.apache.commons.math.complex.Complex var25 = var23.exp();
    org.apache.commons.math.complex.Complex var26 = var25.acos();
    org.apache.commons.math.complex.Complex var27 = var26.sqrt();
    org.apache.commons.math.complex.Complex var28 = var27.tan();
    double var29 = var27.abs();
    org.apache.commons.math.complex.Complex var30 = var27.log();
    double var31 = var27.getArgument();
    org.apache.commons.math.complex.Complex var34 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var35 = var34.conjugate();
    java.lang.Object var36 = null;
    boolean var37 = var34.equals(var36);
    org.apache.commons.math.complex.Complex var38 = var34.acos();
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    org.apache.commons.math.complex.Complex var45 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var46 = var45.conjugate();
    org.apache.commons.math.complex.Complex var47 = var46.tanh();
    org.apache.commons.math.complex.Complex var50 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var51 = var50.conjugate();
    java.lang.Object var52 = null;
    boolean var53 = var50.equals(var52);
    org.apache.commons.math.complex.Complex var54 = var50.sqrt1z();
    org.apache.commons.math.complex.Complex var55 = var46.divide(var50);
    org.apache.commons.math.complex.Complex var56 = var41.divide(var55);
    java.util.List var58 = var55.nthRoot(1);
    org.apache.commons.math.complex.Complex var59 = var38.multiply(var55);
    org.apache.commons.math.complex.Complex var62 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var63 = var62.conjugate();
    org.apache.commons.math.complex.ComplexField var64 = var63.getField();
    org.apache.commons.math.complex.Complex var67 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var68 = var67.conjugate();
    java.lang.Object var69 = null;
    boolean var70 = var67.equals(var69);
    org.apache.commons.math.complex.Complex var71 = var67.sqrt1z();
    org.apache.commons.math.complex.Complex var74 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var75 = var74.conjugate();
    java.lang.Object var76 = null;
    boolean var77 = var74.equals(var76);
    org.apache.commons.math.complex.Complex var78 = var74.sqrt1z();
    org.apache.commons.math.complex.Complex var79 = var67.add(var74);
    org.apache.commons.math.complex.Complex var80 = var63.pow(var79);
    org.apache.commons.math.complex.Complex var81 = var55.pow(var63);
    org.apache.commons.math.complex.Complex var82 = var27.multiply(var63);
    org.apache.commons.math.complex.Complex var83 = var13.pow(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2.9999452757640324d);
    
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
    assertTrue(var29 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.738774844045322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var3 = new double[] { 1.0d, 10.0d};
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var4, var13);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
    int var25 = org.apache.commons.math.util.MathUtils.hash(var22);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var35 = var34.getDirection();
    boolean var38 = org.apache.commons.math.util.MathUtils.checkOrder(var29, var35, false, true);
    double[][] var39 = new double[][] { var29};
    org.apache.commons.math.util.MathUtils.sortInPlace(var22, var39);
    org.apache.commons.math.util.MathUtils.sortInPlace(var4, var39);
    org.apache.commons.math.exception.MathArithmeticException var42 = new org.apache.commons.math.exception.MathArithmeticException(var0, (java.lang.Object[])var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

}
