
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    double var1 = org.apache.commons.math3.special.Erf.erf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8427007929497151d));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    long var1 = org.apache.commons.math3.util.FastMath.round((-0.8427007929497151d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0f);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(Double.NEGATIVE_INFINITY, (-0.8427007929497151d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.sqrt((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(100L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000001f);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(0, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { (-1L)};
//     org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)(byte)(-1), var3);
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     org.apache.commons.math3.exception.util.Localizable var6 = null;
//     java.lang.Object[] var9 = new java.lang.Object[] { (-1L)};
//     org.apache.commons.math3.exception.MaxCountExceededException var10 = new org.apache.commons.math3.exception.MaxCountExceededException(var6, (java.lang.Number)(byte)(-1), var9);
//     org.apache.commons.math3.exception.MathIllegalStateException var11 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var4, var5, var9);
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.nextInt(100, 1);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log10((-0.8427007929497151d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7453292519943295d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(10L, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(0, 100);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-1L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-127), 100.0f, 1.4E-45f, (-1));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(100.0d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-127), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100L, (-1L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-127), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-127));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(10, 1.0000001f, 10.0f, (-127));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(10.0f, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    org.apache.commons.math3.exception.MathInternalError var0 = new org.apache.commons.math3.exception.MathInternalError();

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-1));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.993222846126381d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.nextPascal((-127), (-0.8427007929497151d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    java.lang.Number var2 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.141592653589793d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)(-1));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc((-0.8427007929497151d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.766644200655088d);

  }

  public void test46() {}
//   public void test46() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Erf.erf((-0.8427007929497151d), Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(2.220446049250313E-16d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5574077246549023d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(100L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(10L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.503599627370497E15d));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5607966601082315d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-106));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    boolean var6 = var3.getBoundIsAllowed();
    boolean var7 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSecureAlgorithm("", "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-1L), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0f);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     java.util.Collection var1 = null;
//     java.lang.Object[] var3 = var0.nextSample(var1, 0);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-127), 75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 75);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-50));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test67() {}
//   public void test67() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }
// 
// 
//     double var0 = org.apache.commons.math3.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.8793843777996115d);
// 
//   }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    org.apache.commons.math3.exception.NoDataException var0 = new org.apache.commons.math3.exception.NoDataException();
    org.apache.commons.math3.exception.util.ExceptionContext var1 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.332621544395286E157d);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(2.993222846126381d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.nextUniform(2.993222846126381d, 0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(10.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(short)100);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var8 = var0.nextSecureInt(100, 1);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-46));
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-116));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7853981633974483d);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log1p((-4.503599627370497E15d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 10L);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.apache.commons.math3.stat.ranking.NaturalRanking var0 = new org.apache.commons.math3.stat.ranking.NaturalRanking();

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
//     double[] var5 = new double[] { 0.0d, (-1.0d)};
//     double[] var8 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var8);
//     double var10 = var2.mannWhitneyUTest(var5, var8);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(1L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var12 = var0.nextT((-2.1055660652199926d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-41));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    int var1 = org.apache.commons.math3.util.FastMath.round((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)1.0d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var2.mannWhitneyUTest(var5, var7);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3978253612069936d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.apache.commons.math3.random.RandomGenerator var0 = null;
    org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var4 = var1.nextPermutation((-106), 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.896930644797258E157d), 9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.8969306447972577E157d));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(0.0f, 1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000001f);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-106));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log10((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.505505063633595E-16d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math3.exception.MathArithmeticException var3 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var2);
//     java.lang.Throwable var4 = null;
//     var3.addSuppressed(var4);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.934802200544612d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh((-0.8427007929497151d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7656658570186433d));

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(1.5574077246549023d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(short)10, (java.lang.Number)10, true);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.3978253612069936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.40030753423026644d));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos((-0.7656658570186433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7209210669314736d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(3.141592653589793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05483113556160755d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     double var1 = org.apache.commons.math3.special.Gamma.logGamma(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.981374056870167d, 0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.020492736543359383d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(1.766644200655088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.71681867595783d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5607966601082315d, 2.993222846126381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4324261860181493d));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.apache.commons.math3.random.RandomGenerator var0 = null;
    org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.nextChiSquare((-1.4324261860181493d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 8.71681867595783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log10((-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0f, 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.99999994f);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = var0.nextHexString(0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)10.0f);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var14 = var0.nextSecureLong(10L, 1L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-97));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 47);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(1L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh((-2.1055660652199926d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9707742654246908d));

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var6 = var0.nextBinomial(0, (-1.8969306447972577E157d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.3773881863796738E-9d);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    java.lang.Number var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0);

  }

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var8 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
//     double var10 = var6.addElementRolling(0.0d);
//     double[] var11 = var6.getElements();
//     double[] var14 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var15 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
//     double[] var16 = var15.getInternalValues();
//     double var17 = var2.mannWhitneyUTest(var11, var16);
// 
//   }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.993222846126381d, Double.NEGATIVE_INFINITY, 2.220446049250313E-16d, 61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(10.0f, 1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000001f);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var6 = var0.nextLong((-1L), (-1L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
// 
//   }

  public void test128() {}
//   public void test128() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(1.7453292519943295d, 0.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var14 = var0.nextWeibull(0.7209210669314736d, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-45));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
// 
//   }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(1.4E-45f, 0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(1.5574077246549023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(3.141592653589793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1415926535897936d);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
//     double[] var6 = new double[] { 0.0d, (-1.0d), 10.0d};
//     double[] var9 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
//     double[] var11 = var10.getInternalValues();
//     double var12 = var2.mannWhitneyUTest(var6, var11);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(1.7453292519943295d, 0.0d, (-1.8969306447972577E157d), (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test135() {}
//   public void test135() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.tan(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var1 = var0.getNumericalMean();
    double var3 = var0.probability(0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     org.apache.commons.math3.exception.util.Localizable var3 = null;
//     java.lang.Object[] var5 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math3.exception.MathArithmeticException var6 = new org.apache.commons.math3.exception.MathArithmeticException(var3, var5);
//     org.apache.commons.math3.exception.MathInternalError var7 = new org.apache.commons.math3.exception.MathInternalError(var2, var5);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var5);
//     org.apache.commons.math3.exception.MathArithmeticException var9 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var5);
//     java.lang.String var10 = var9.toString();
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    double var2 = org.apache.commons.math3.util.FastMath.max((-1.4699094585831982d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil((-2.1055660652199926d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-127));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(8.71681867595783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.9524258967767216d);

  }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, var1);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2((-1.0d), 0.7853981633974483d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9050225767665427d));

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(8.71681867595783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.0d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElement((-70), 0.7853981633974483d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(61, (-5));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(2L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setContractionCriteria(1.4E-45f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh((-2.1055660652199926d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(1.5607966601082315d, 1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2510057536292178d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor(0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)(short)1, var1, false);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.3978253612069936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3978253612069936d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextSecureInt(1, (-102));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-12));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 43);
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var13 = var0.nextWeibull(0.0d, (-1.4699094585831982d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-52));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(18L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(1.766644200655088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0176351058563242d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.4373817081192443d, 1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6734916263077155d));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var0.nextHypergeometric((-5), 15, 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(0.3978253612069936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.37863028386090464d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-116));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.nextUniform(1.0d, 0.3978253612069936d, true);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
// 
//   }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math3.exception.MathArithmeticException var4 = new org.apache.commons.math3.exception.MathArithmeticException(var1, var3);
//     org.apache.commons.math3.exception.MathInternalError var5 = new org.apache.commons.math3.exception.MathInternalError(var0, var3);
//     org.apache.commons.math3.exception.MathInternalError var6 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var5);
// 
//   }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-1.4699094585831982d), (-1.4324261860181493d), (-4.503599627370497E15d), 16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-106), 0.0f, 1.0f, 10);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.MathIllegalArgumentException var2 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var1);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh((-1.2012104119580016d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5116541008517133d));

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-0.9707742654246908d), 10.0d, (-0.40030753423026644d), (-84));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians((-0.6734916263077155d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.011754646363680897d));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-0.8427007929497151d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-52));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (-110));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-102), (-106));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-106));

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextBeta((-1.0d), (-0.1576108974116944d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException");
//     } catch (org.apache.commons.math3.exception.NoBracketingException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.3522102545542956d);
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(1L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(2.993222846126381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2483666764136787d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100, (-10));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(1.2510057536292178d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.04299280739295786d, Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var3 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var4 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var3);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var5 = var4.getTiesStrategy();
//     double[] var8 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var8);
//     double[] var10 = var9.getInternalValues();
//     double[] var11 = var4.rank(var10);
//     double[] var14 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var15 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
//     double var16 = var2.mannWhitneyUTest(var10, var14);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(0);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.7656658570186433d), 8.71681867595783d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9953222650189527d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-93));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, (-52));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1((-0.9707742654246908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6212103591877449d));

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
    double[] var3 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy var4 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var5 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var4);
    org.apache.commons.math3.stat.ranking.TiesStrategy var6 = var5.getTiesStrategy();
    double[] var9 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
    double[] var11 = var10.getInternalValues();
    double[] var12 = var5.rank(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var2.mannWhitneyUTest(var3, var12);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.5218635024424644d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.5405364385079268d));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(100, (-50));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 150);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(1.2483666764136787d, 1.5607966601082315d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6746351978480065d);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(10L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-90L));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(9.332621544395286E157d, 0.8793843777996115d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8793843777996115d);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(3.1415926535897936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.442027134218949d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb((-3.5405364385079268d), (-5));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.11064176370337271d));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(2.505505063633595E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.505505063633595E-16d);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(15, 9.999999f, 9.999999f, (-106));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.0d, 0.5000000000000001d, 1.0d, (-102));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.981374056870167d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7713659069359526E-40d);

  }

  public void test220() {}
//   public void test220() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(1.7453292519943295d, 0.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var14 = var0.nextSecureLong(0L, (-90L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-31));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
// 
//   }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 251.8904022097232d);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(100, (-116));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(0.37863028386090464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-102), 10.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(2.0f, 0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.99999994f);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-1.4699094585831982d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0176351058563242d, 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    boolean var6 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(1.0176351058563242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.6746351978480065d, 1.5574077246549023d, (-1.5116541008517133d));

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.37863028386090464d, (-0.40030753423026644d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5510054571581893d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NoDataException var1 = new org.apache.commons.math3.exception.NoDataException(var0);

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var14 = var0.nextLong(2L, (-90L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-4));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 6);
// 
//   }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     org.apache.commons.math3.distribution.IntegerDistribution var13 = null;
//     int var14 = var0.nextInversionDeviate(var13);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var14 = var0.nextHexString((-103));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-24));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 27);
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1((-0.9050225767665427d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5954672480415791d));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.3978253612069936d, (-1.5116541008517133d), 0.7209210669314736d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-84), (-93));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(94, (-106));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(1.7453292519943295d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-70), 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.atan2(2.993222846126381d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(5.442027134218949d, 2.505505063633595E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.442027134218949d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(10, 0.0f, 2.0f, (-70));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1368684E-13f);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    java.lang.Number var2 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + (-1.0f)+ "'", var2.equals((-1.0f)));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.013576851530780462d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt((-4.503599627370497E15d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-165140.37185182082d));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.038581377435943975d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0393353033587625d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign((-1.4699094585831982d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4699094585831982d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(8.71681867595783d, 5.442027134218949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.71681867595783d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNumElements((-5));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(0.99999994f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy[] var2 = org.apache.commons.math3.stat.ranking.TiesStrategy.values();
    org.apache.commons.math3.exception.MaxCountExceededException var3 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)9.332621544395286E157d, (java.lang.Object[])var2);
    java.lang.Number var4 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 9.332621544395286E157d+ "'", var4.equals(9.332621544395286E157d));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(1.2483666764136787d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8102040310137474d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9707742654246908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(61, (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-41));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var5 = var0.nextLong(2L, 0L);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(0.7209210669314736d, 0.057859117847628164d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7209210669314736d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    var3.addElement(0.0d);
    int var8 = var3.getExpansionMode();
    var3.setNumElements(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(15, (-116));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0);
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var8 = var0.nextPermutation((-102), 150);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-0.8800687392467534d));
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos(0.013576851530780462d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.557219058123976d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-41), 18L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-276308207));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.7209210669314736d, 75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.723562786617452E22d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(1, 10.0f, 2.5f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.307674368E12d);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.5218635024424644d);
    boolean var3 = var2.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0f), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.nextUniform(0.7209210669314736d, 2.220446049250313E-16d, false);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.nextPascal((-5), 0.6002272555504838d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-52));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double var12 = var3.addElementRolling((-1.0d));
    org.apache.commons.math3.util.ResizableDoubleArray var13 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var13);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1023));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan((-0.7116919606539285d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6185298926079591d));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1L, 18L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 18L);

  }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     org.apache.commons.math3.exception.util.Localizable var3 = null;
//     org.apache.commons.math3.exception.util.Localizable var4 = null;
//     java.lang.Object[] var6 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math3.exception.MathArithmeticException var7 = new org.apache.commons.math3.exception.MathArithmeticException(var4, var6);
//     org.apache.commons.math3.exception.MathInternalError var8 = new org.apache.commons.math3.exception.MathInternalError(var3, var6);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var2, var6);
//     org.apache.commons.math3.exception.MathInternalError var10 = new org.apache.commons.math3.exception.MathInternalError(var1, var6);
//     org.apache.commons.math3.exception.MathInternalError var11 = new org.apache.commons.math3.exception.MathInternalError(var0, var6);
//     org.apache.commons.math3.exception.util.Localizable var12 = null;
//     org.apache.commons.math3.exception.util.Localizable var13 = null;
//     org.apache.commons.math3.exception.NumberIsTooLargeException var17 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
//     java.lang.Number var18 = var17.getMax();
//     java.lang.Number var19 = var17.getArgument();
//     org.apache.commons.math3.exception.MathInternalError var20 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var17);
//     java.lang.Throwable[] var21 = var17.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalStateException var22 = new org.apache.commons.math3.exception.MathIllegalStateException(var13, (java.lang.Object[])var21);
//     org.apache.commons.math3.exception.MathIllegalStateException var23 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var11, var12, (java.lang.Object[])var21);
// 
//   }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)(-1023), (java.lang.Number)1.557219058123976d, true);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var5 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var6 = var5.getMax();
    java.lang.Number var7 = var5.getArgument();
    org.apache.commons.math3.exception.MathInternalError var8 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var5);
    java.lang.Throwable[] var9 = var5.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException(var1, (java.lang.Object[])var9);
    org.apache.commons.math3.exception.MathIllegalArgumentException var11 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0f+ "'", var6.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    org.apache.commons.math3.exception.util.ExceptionContext var6 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, 9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor((-1.2012104119580016d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.281783181607902d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, (-1023));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.TiesStrategy var13 = var12.getTiesStrategy();
    double[] var16 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var17 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double[] var18 = var17.getInternalValues();
    double[] var19 = var12.rank(var18);
    var10.addElements(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setExpansionMode(94);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.cbrt(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(2.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0f);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(3, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14348907);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(0, (-41));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-41));

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.999999f);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(9.332621544395286E157d, (-0.40030753423026644d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.7998579189201327E-64d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.35913938368747433d));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-106), (-116));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     java.util.Collection var15 = null;
//     java.lang.Object[] var17 = var0.nextSample(var15, (-70));
// 
//   }

  public void test308() {}
//   public void test308() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log((-0.8427007929497151d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 0.013576851530780462d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(3.1415926535897936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 22.140692632779277d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(2.505505063633595E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.505505063633595E-16d);

  }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var6 = var0.nextGaussian(Double.NEGATIVE_INFINITY, (-165140.37185182082d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.2326424754183838E-9d);
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.6428720507104048d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011220233953944515d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-90L), 61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6917529027641081856L);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(6917529027641081856L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6917529027641081856L);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double[] var19 = var14.getElements();
    var3.addElements(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var22 = var3.getElement(14348907);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-90L), (-90L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-180L));

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(1.5707963267948966d, 0.04299280739295786d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5713845747492456d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var6 = var0.nextHexString(0);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.4114196352469428d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-1.8317854677144767d));
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(10, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1410065408);

  }

  public void test323() {}
//   public void test323() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 3.1415926535897936d, 0.057859117847628164d, (-93));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(0, 0.0f, 2.5f, (-110));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5f);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements((-1023));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000001f, (-165140.37185182082d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3552527E-20f);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-180L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-179L));

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double[] var19 = var14.getElements();
    var3.addElements(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-70));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(18L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 18L);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.apache.commons.math3.stat.inference.MannWhitneyUTest var0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    double[] var6 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var7 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
    double[] var8 = var7.getInternalValues();
    double[] var9 = var2.rank(var8);
    double[] var11 = new double[] { (-1.0d)};
    double var12 = var0.mannWhitneyUTest(var8, var11);
    double[] var13 = null;
    double[] var16 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var17 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double[] var18 = var17.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var19 = new org.apache.commons.math3.util.ResizableDoubleArray(var17);
    double var21 = var17.addElementRolling(0.0d);
    double[] var22 = var17.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var23 = var0.mannWhitneyUTest(var13, var22);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.22067136191984704d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 22.140692632779277d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(0.7853981633974483d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setNumElements(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var3.getElement((-52));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(5.442027134218949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.0d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(2.281783181607902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.846013790589009d);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(100L, (-90L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-0.6185298926079591d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(1.0d, 0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(2.2172257481304234d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.181822810259439d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.apache.commons.math3.stat.inference.MannWhitneyUTest var0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var1 = null;
    double[] var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.mannWhitneyU(var1, var2);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2((-1.0d), (-2.1055660652199926d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.698200072758446d));

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var14 = var0.nextLong(6917529027641081856L, 100L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-76));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 5);
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.5510054571581893d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.734996605925821d);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-0.011754646363680897d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7239.0451181011d);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1071487177940904d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-73), 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-102));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var2 = var1.getBoundIsAllowed();
    java.lang.Number var3 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    double var2 = org.apache.commons.math3.special.Erf.erf((-0.40030753423026644d), 0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.49049638908362825d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-8), 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10L);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)0.7209210669314736d, (java.lang.Number)10L, var3);
    java.lang.Number var5 = var4.getLo();
    java.lang.Number var6 = var4.getArgument();
    java.lang.Number var7 = var4.getLo();
    java.lang.Number var8 = var4.getLo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.7209210669314736d+ "'", var6.equals(0.7209210669314736d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10L+ "'", var7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 10L+ "'", var8.equals(10L));

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution((-0.5722073814834792d), (-0.9707742654246908d), 0.011220233953944515d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(4.934802200544612d, (-0.7656658570186433d), 0.0d, (-127));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getNumericalVariance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.cumulativeProbability(0.0d, (-0.5722073814834792d));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(0.0d, (-0.011754646363680897d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextBinomial(94, (-0.6185298926079591d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.0d));
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(1.7713659069359526E-40d, (-73));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8755066060221833E-62d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(14348907, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14348907);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(6917529027641081856L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(0.5218635024424644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.46049838059322834d);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-8), 100.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var12 = var0.nextPermutation(75, 10598444);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(5.442027134218949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.395635360956389d);

  }

  public void test370() {}
//   public void test370() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var14 = var0.nextSecureHexString((-8));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-95));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 47);
// 
//   }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(2L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.0d, 0.3978253612069936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6717793361508371d);

  }

  public void test373() {}
//   public void test373() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
// 
//   }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.11751201469396123d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    float var2 = var1.getContractionCriteria();
    double var4 = var1.addElementRolling(0.038581377435943975d);
    int var5 = var1.getNumElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.discardFrontElements((-41));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(1.4699094585831982d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02565475975848403d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(2.993222846126381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.14782604738794858d);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-93), (-103));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test379() {}
//   public void test379() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("hi!", "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.9203075942215937d));
// 
//   }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-1L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    double[] var7 = var3.getElements();
    var3.setExpansionMode(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNumElements((-70));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-8));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-5));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor(251.8904022097232d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 251.0d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = null;
    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var2 = var1.getExpansionMode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray.copy(var0, var1);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.9223500676052069d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.035104216067321295d));

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    long var2 = org.apache.commons.math3.util.FastMath.min((-179L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-179L));

  }

  public void test389() {}
//   public void test389() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     int var20 = var0.nextInt((-103), 3);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var24 = var0.nextHypergeometric(10598444, (-73), (-50));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-79));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 72);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-73));
// 
//   }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh(5.442027134218949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 115.45706259336124d);

  }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var6 = var0.nextSecureLong(2L, 100L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextF((-1.4324261860181493d), 1.5713845747492456d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 50L);
// 
//   }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.5607966601082315d, (java.lang.Number)22.140692632779277d, false);

  }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var20 = var0.nextGaussian(0.0d, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-67));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 12);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test395() {}
//   public void test395() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     int var20 = var0.nextInt((-103), 3);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var23 = var0.nextSecureLong(2L, (-180L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-60));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-73));
// 
//   }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log10((-2.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test398() {}
//   public void test398() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.NaNStrategy var1 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var3);
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var5 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
//     org.apache.commons.math3.stat.ranking.TiesStrategy var6 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var7 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var6);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var8 = var7.getTiesStrategy();
//     double[] var11 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var11);
//     double[] var13 = var12.getInternalValues();
//     double[] var14 = var7.rank(var13);
//     double[] var16 = new double[] { (-1.0d)};
//     double var17 = var5.mannWhitneyUTest(var13, var16);
//     double[] var20 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var21 = new org.apache.commons.math3.util.ResizableDoubleArray(var20);
//     double var22 = var4.mannWhitneyUTest(var16, var20);
// 
//   }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(100);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, (-276308207));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9111302618846769d));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    boolean var3 = var2.isSupportConnected();
    double var4 = var2.getNumericalVariance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var6 = var2.sample((-93));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 9.869604401089358d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.6428720507104048d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(short)(-1), var7);
    org.apache.commons.math3.exception.MathIllegalStateException var9 = new org.apache.commons.math3.exception.MathIllegalStateException(var3, var7);
    org.apache.commons.math3.exception.MathArithmeticException var10 = new org.apache.commons.math3.exception.MathArithmeticException(var2, var7);
    org.apache.commons.math3.exception.MathIllegalStateException var11 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, var1, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0, (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 102);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)100.0d, (java.lang.Number)1.5574077246549023d, false);
    java.lang.String var4 = var3.toString();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)"+ "'", var4.equals("org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 1L);
// 
//   }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh((-0.9050225767665427d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.812595528807679d));

  }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log(0.6717793361508371d, (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(5.0d, (-0.11064176370337271d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.0d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.nextExponential(0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    java.lang.Object[] var5 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var6 = new org.apache.commons.math3.exception.MathArithmeticException(var3, var5);
    org.apache.commons.math3.exception.MathInternalError var7 = new org.apache.commons.math3.exception.MathInternalError(var2, var5);
    org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var5);
    org.apache.commons.math3.exception.MathInternalError var9 = new org.apache.commons.math3.exception.MathInternalError(var0, var5);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var9.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.17453292519943295d);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7615941559557649d);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 100L);
// 
//   }

  public void test418() {}
//   public void test418() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!");
// 
//   }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)(-276308207), (java.lang.Number)1.734996605925821d, false);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2((-4.503599627370497E15d), (-0.035104216067321295d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5707963267948966d));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2((-0.7116919606539285d), 1.5205356215110556E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5707963246583885d));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(1.3552527E-20f, 1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3552527E-20f);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1621021197979655d));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.5707963246583885d), (java.lang.Number)(-180L), false);

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     org.apache.commons.math3.exception.util.Localizable var3 = null;
//     java.lang.Object[] var5 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math3.exception.MathArithmeticException var6 = new org.apache.commons.math3.exception.MathArithmeticException(var3, var5);
//     org.apache.commons.math3.exception.MathInternalError var7 = new org.apache.commons.math3.exception.MathInternalError(var2, var5);
//     org.apache.commons.math3.exception.MathIllegalArgumentException var8 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var5);
//     org.apache.commons.math3.exception.MathArithmeticException var9 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var5);
//     org.apache.commons.math3.exception.MathInternalError var10 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var9);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(1.1071487177940904d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.44721359549995804d);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(2.993222846126381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1494681981443936d));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution((-1.8969306447972577E157d), 0.8793843777996115d, 1.5713845747492456d);
    double var4 = var3.getNumericalMean();
    boolean var5 = var3.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.8969306447972577E157d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum((-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = var0.substituteMostRecentElement(2.220446049250313E-16d);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalStateException");
    } catch (org.apache.commons.math3.exception.MathIllegalStateException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(7L, (-1L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.9953222650189527d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9906445300379054d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-110), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(0.5510054571581893d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt((-0.6734916263077155d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8765514250489875d));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh((-1.5707963267948966d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.3012989023072947d));

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, (-179L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(16, 1.1368684E-13f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-70), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-179L), 18L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3222L);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1920929E-7f);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(1410065408);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test446() {}
//   public void test446() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var17 = var0.nextBinomial(150, (-0.6734916263077155d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-127));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 79);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(8.71681867595783d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(251.0d, 4.846013790589009d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9927171106284476d));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-276308207));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.038581377435943975d, 1.1824871132044223E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.7495685662163734E-10d);

  }

  public void test451() {}
//   public void test451() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     org.apache.commons.math3.distribution.RealDistribution var6 = null;
//     double var7 = var0.nextInversionDeviate(var6);
// 
//   }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    double[] var7 = var3.getElements();
    var3.setExpansionMode(0);
    var3.setNumElements(75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setContractionCriteria(1.1920929E-7f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-93), 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.987192433351468d));

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-180L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-179L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(1.7453292519943295d, (-1.1621021197979655d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(2.2172257481304234d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-103), (-103));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-103));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.11751201469396123d, (-116));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.41449942452733E-36d);

  }

  public void test462() {}
//   public void test462() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var8 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
//     double var10 = var6.addElementRolling(0.0d);
//     double[] var11 = var6.getElements();
//     double[] var12 = var6.getElements();
//     double[] var13 = var1.rank(var12);
// 
//   }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(0.9223500676052069d, 1.4699094585831982d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5603862049849778d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210855E-14f);

  }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "c84b177d3367a46");
// 
//   }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1368685E-13f);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var7 = var0.sample((-107));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(251.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)1.0176351058563242d, (java.lang.Number)7239.0451181011d, (java.lang.Number)(-0.6185298926079591d));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5210953054937475d);

  }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("hi!", "42824a7");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-93));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-107), (-84));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(14348907, 94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14348907);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.5021289850615019d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6522351127874555d);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(16, (-110));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-110));

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs((-180L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 180L);

  }

  public void test478() {}
//   public void test478() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var11 = var0.nextSecureInt(0, (-10));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-123));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
// 
//   }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    var3.addElement(1.0176351058563242d);
    int var9 = var3.getExpansionMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.71122452428142E98d);

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     int var20 = var0.nextInt((-103), 3);
//     var0.reSeed(7L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-13));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == (-73));
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-109));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test483() {}
//   public void test483() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.5021289850615019d, (-4.503599627370497E15d), 2.549579613139942d, (-41));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(0.02565475975848403d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 31.85489831527096d);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.9524258967767216d, 9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(0.16128318301427347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.16198331648313202d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(1.2510057536292178d, 0.533126106571059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.359867214518029d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos((-0.9070706940443594d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7070690411132308d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(74);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh((-0.6212103591877449d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5519701884949173d));

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(1.4E-45f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = var1.getTiesStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(7239.0451181011d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { 10};
//     org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)(short)(-1), var3);
//     org.apache.commons.math3.exception.MathInternalError var5 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var4);
// 
//   }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-88));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1824871132044223E-9d, 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1824871132044225E-9d);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var2 = var1.getInternalValues();
    int var3 = var1.start();
    var1.setNumElements(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setExpansionFactor(0.99999994f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getNumericalVariance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var8 = var0.sample((-109));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test500() {}
//   public void test500() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(0.0d, (-0.011754646363680897d));
//     long var13 = var0.nextPoisson(9.869604401089358d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("42824a7", "AVERAGE");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-55));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 10L);
// 
//   }

}
