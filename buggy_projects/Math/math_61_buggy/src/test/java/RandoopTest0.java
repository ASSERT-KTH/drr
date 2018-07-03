
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    int var2 = org.apache.commons.math.util.FastMath.max(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8414709848078965d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
//     double[] var3 = null;
//     org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var2, var3);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(10.0d, 0.43579705878419134d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999999999998d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3978952727983707d);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { 9.999999999999998d};
//     java.lang.UnsupportedOperationException var3 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var0, var2);
//     java.io.IOException var4 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var3);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(9.999999999999998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 572.9577951308231d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5574077246549023d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.16306402964332198d));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, 1);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     double var0 = org.apache.commons.math.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.7491987728881979d);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7853981633974483d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var2 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var3 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var2);
//     org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException(var0, var1, var3);
//     java.lang.String var5 = var4.getPattern();
// 
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.cumulativeProbability(0.7491987728881979d, 0.43579705878419134d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(572.9577951308231d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.798432482298277E248d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.33353496754666445d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.061280873685841E-48d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9173172759781081d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.33353496754666445d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9448909534606371d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(2.061280873685841E-48d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-9.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0513699053569932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.861568512255232d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.43579705878419134d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9065338654042625d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 0.9173172759781081d);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-9.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-8.999999999999998d));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-8.999999999999998d), 0.9173172759781081d);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.9173172759781081d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9173172759781082d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    org.apache.commons.math.MathException var0 = new org.apache.commons.math.MathException();

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-8.999999999999998d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.4121184852417582d));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    double var2 = var0.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.inverseCumulativeProbability(1.5574077246549023d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6105647004975028d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation((-0.1616339537318908d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.7491987728881979d, (-0.16306402964332198d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7491987728881979d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.0513699053569932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.5574077246549023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2261911708835171d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(2.861568512255232d, 1.0513699053569932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2186961367900524d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    double var2 = var0.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.inverseCumulativeProbability(2.3978952727983707d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.33353496754666445d, 0.7491987728881979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.41884580536897137d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    int var1 = org.apache.commons.math.util.FastMath.round((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    java.lang.Throwable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    org.apache.commons.math.ConvergenceException var5 = new org.apache.commons.math.ConvergenceException(var1, var2, var4);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var13, 1.0d);
    org.apache.commons.math.exception.util.Localizable var16 = var13.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var17 = null;
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var20 = var19.getArguments();
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException(var17, var20);
    java.lang.ArithmeticException var22 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var16, var20);
    org.apache.commons.math.exception.util.Localizable var24 = null;
    java.lang.Object[] var26 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var27 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var24, var26);
    java.util.NoSuchElementException var28 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var26);
    java.lang.ArrayIndexOutOfBoundsException var29 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var16, var26);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var41 = new org.apache.commons.math.exception.NumberIsTooSmallException(var37, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var42 = null;
    org.apache.commons.math.exception.util.Localizable var43 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var44 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var45 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var44);
    org.apache.commons.math.ConvergenceException var46 = new org.apache.commons.math.ConvergenceException(var42, var43, var45);
    java.lang.UnsupportedOperationException var47 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var37, var45);
    org.apache.commons.math.MaxIterationsExceededException var48 = new org.apache.commons.math.MaxIterationsExceededException(8, var16, var45);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 0.41884580536897137d, "hi!", var45);
    java.lang.ArrayIndexOutOfBoundsException var50 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("", var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-8.999999999999998d), (-1.0d));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.6246292191371761d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(2.861568512255232d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7737371454186037d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.16306402964332198d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9716425480818884d);

  }

  public void test63() {}
//   public void test63() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    int var1 = org.apache.commons.math.util.FastMath.round(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    double[] var3 = var1.getArgument();
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var3);
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "hi!");
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.apache.commons.math.exception.util.LocalizedFormats[] var2 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var3 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var2);
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.061280873685841E-48d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.061280873685841E-48d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl((-8.999999999999998d), 0.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7374613234571589d);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    java.lang.Throwable var1 = null;
    double[] var5 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var18 = var17.getArguments();
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException(var15, var18);
    java.io.EOFException var20 = org.apache.commons.math.MathRuntimeException.createEOFException(var14, var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var1, var5, var13, var18);
    java.lang.NullPointerException var22 = org.apache.commons.math.MathRuntimeException.createNullPointerException("", var18);
    java.io.IOException var23 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var2 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var3 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var2);
//     org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException(var0, var1, var3);
//     org.apache.commons.math.exception.util.Localizable var5 = var4.getLocalizablePattern();
//     java.lang.String var6 = var4.getPattern();
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-9.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.460139105621001d));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-9.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-9L));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    float var2 = org.apache.commons.math.util.FastMath.min((-1.0f), 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    java.lang.String var8 = var4.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-1.460139105621001d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9938837346736189d));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    double[] var3 = var1.getArgument();
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7453292519943295d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.388721957374888d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0067844780309888495d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21780540111532407d, 1.7453292519943295d, 2);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-1.460139105621001d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.4601391056210007d));

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var2.inverseCumulativeProbability(1.2261911708835171d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.33353496754666445d, 0.41884580536897137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6313493879676885d);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { 9.999999999999998d};
//     java.lang.UnsupportedOperationException var3 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var0, var2);
//     org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var7 = var6.getArguments();
//     org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("hi!", var7);
//     org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 1.0d);
//     var3.addSuppressed((java.lang.Throwable)var8);
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var15 = var14.getArguments();
//     org.apache.commons.math.MathException var16 = new org.apache.commons.math.MathException("hi!", var15);
//     org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var19 = var16.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var23 = new org.apache.commons.math.exception.NumberIsTooSmallException(var19, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var26 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var25);
//     java.lang.Object[] var29 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException((java.lang.Throwable)var26, "hi!", var29);
//     java.lang.IllegalArgumentException var31 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var19, var29);
//     org.apache.commons.math.exception.NotStrictlyPositiveException var33 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var19, (java.lang.Number)572.9577951308231d);
//     org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var37 = var36.getArguments();
//     org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException("hi!", var37);
//     org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var41 = var38.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var45 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     java.lang.Throwable var46 = null;
//     org.apache.commons.math.exception.util.Localizable var47 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var48 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var49 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var48);
//     org.apache.commons.math.ConvergenceException var50 = new org.apache.commons.math.ConvergenceException(var46, var47, var49);
//     java.lang.UnsupportedOperationException var51 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var41, var49);
//     org.apache.commons.math.MathRuntimeException var52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3, var19, var49);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.9842063533669191d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 56.390870217885784d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(Double.NEGATIVE_INFINITY, 1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1612894529345956d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException(var9, var12);
    java.lang.ArithmeticException var14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var8, var12);
    double[] var16 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var17 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var18 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var19 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var16, var17, (java.lang.Object[])var18);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var25 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var24);
    java.lang.Object[] var28 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException((java.lang.Throwable)var25, "hi!", var28);
    java.lang.IllegalStateException var30 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var28);
    double[] var32 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var33 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var34 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var35 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, var33, (java.lang.Object[])var34);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException("hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, 1.0d);
    org.apache.commons.math.exception.util.Localizable var44 = var41.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var45 = null;
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var48 = var47.getArguments();
    org.apache.commons.math.MathException var49 = new org.apache.commons.math.MathException(var45, var48);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var30, var32, var44, var48);
    org.apache.commons.math.ConvergenceException var51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, "", var48);
    org.apache.commons.math.exception.util.Localizable var53 = null;
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var57 = var56.getArguments();
    org.apache.commons.math.MathException var58 = new org.apache.commons.math.MathException(var54, var57);
    java.io.EOFException var59 = org.apache.commons.math.MathRuntimeException.createEOFException(var53, var57);
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException((java.lang.Throwable)var51, "hi!", var57);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var64 = var63.getArguments();
    org.apache.commons.math.MathException var65 = new org.apache.commons.math.MathException("hi!", var64);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 1.0d);
    org.apache.commons.math.exception.util.Localizable var68 = var65.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var69 = null;
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var72 = var71.getArguments();
    org.apache.commons.math.MathException var73 = new org.apache.commons.math.MathException(var69, var72);
    java.lang.ArithmeticException var74 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var68, var72);
    org.apache.commons.math.exception.util.Localizable var76 = null;
    java.lang.Object[] var78 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var79 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var76, var78);
    java.util.NoSuchElementException var80 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var78);
    java.lang.ArrayIndexOutOfBoundsException var81 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var68, var78);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var85 = var84.getArguments();
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException("hi!", var85);
    org.apache.commons.math.FunctionEvaluationException var88 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var86, 1.0d);
    org.apache.commons.math.exception.util.Localizable var89 = var86.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var90 = null;
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var93 = var92.getArguments();
    org.apache.commons.math.MathException var94 = new org.apache.commons.math.MathException(var90, var93);
    java.lang.ArithmeticException var95 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var89, var93);
    java.lang.Object[] var96 = new java.lang.Object[] { var89};
    org.apache.commons.math.MathException var97 = new org.apache.commons.math.MathException((java.lang.Throwable)var51, var68, var96);
    org.apache.commons.math.FunctionEvaluationException var98 = new org.apache.commons.math.FunctionEvaluationException(1.7737371454186037d, var8, var96);
    org.apache.commons.math.MathRuntimeException var99 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-1.460139105621001d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1104315260748466d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9173172759781082d, 1.2261911708835171d, 2.061280873685841E-48d);
    double var5 = var3.density((-0.4121184852417582d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.18075812187202647d);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(1.3440585709080678E43d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
//     org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var5 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var4);
//     java.lang.Object[] var8 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException((java.lang.Throwable)var5, "hi!", var8);
//     java.lang.IllegalStateException var10 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var8);
//     double[] var12 = new double[] { 1.0d};
//     org.apache.commons.math.exception.util.Localizable var13 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var14 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var15 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var14);
//     org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var12, var13, (java.lang.Object[])var14);
//     org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var20 = var19.getArguments();
//     org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException("hi!", var20);
//     org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var24 = var21.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var25 = null;
//     org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var28 = var27.getArguments();
//     org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException(var25, var28);
//     org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, var12, var24, var28);
//     java.lang.Object[] var31 = null;
//     org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException((java.lang.Throwable)var1, var24, var31);
//     java.lang.Throwable var33 = null;
//     var32.addSuppressed(var33);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-1.4601391056210007d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0099010138502609d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-8.999999999999998d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-8.0d));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.9013191316598097d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.015730986458679944d);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(4.9E-324d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var2 = org.apache.commons.math.util.FastMath.min(8, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var15, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var22 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var21);
    java.lang.Object[] var25 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException((java.lang.Throwable)var22, "hi!", var25);
    java.lang.IllegalArgumentException var27 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var15, var25);
    java.lang.IllegalStateException var28 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var7, var25);
    java.lang.Object[] var29 = null;
    org.apache.commons.math.ConvergenceException var30 = new org.apache.commons.math.ConvergenceException(var7, var29);
    java.lang.Object[] var31 = var30.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var5 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var4);
    java.lang.Object[] var8 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException((java.lang.Throwable)var5, "hi!", var8);
    java.lang.IllegalStateException var10 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var8);
    double[] var12 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var14 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var15 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var14);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var12, var13, (java.lang.Object[])var14);
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var20 = var19.getArguments();
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException("hi!", var20);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, 1.0d);
    org.apache.commons.math.exception.util.Localizable var24 = var21.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException(var25, var28);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, var12, var24, var28);
    java.lang.Object[] var31 = null;
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException((java.lang.Throwable)var1, var24, var31);
    org.apache.commons.math.exception.NumberIsTooLargeException var36 = new org.apache.commons.math.exception.NumberIsTooLargeException(var24, (java.lang.Number)(short)1, (java.lang.Number)(short)10, false);
    org.apache.commons.math.distribution.NormalDistributionImpl var37 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var38 = var37.getStandardDeviation();
    var37.reseedRandomGenerator(100L);
    double[] var42 = var37.sample(3);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, var42);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 1.7737371454186037d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStandardDeviation((-0.16306402964332198d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.8414709848078965d, 1.7737371454186037d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.44296331673218897d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var4 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var5 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, var3, (java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var10);
    java.lang.Object[] var14 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException((java.lang.Throwable)var11, "hi!", var14);
    java.lang.IllegalStateException var16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var14);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var20 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var21 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, var19, (java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var34 = var33.getArguments();
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException(var31, var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var18, var30, var34);
    org.apache.commons.math.ConvergenceException var37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var6, "", var34);
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException(var40, var43);
    java.io.EOFException var45 = org.apache.commons.math.MathRuntimeException.createEOFException(var39, var43);
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, "hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException("hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, 1.0d);
    org.apache.commons.math.exception.util.Localizable var54 = var51.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var55 = null;
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    org.apache.commons.math.MathException var59 = new org.apache.commons.math.MathException(var55, var58);
    java.lang.ArithmeticException var60 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var54, var58);
    org.apache.commons.math.exception.util.Localizable var62 = null;
    java.lang.Object[] var64 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var65 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var62, var64);
    java.util.NoSuchElementException var66 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var64);
    java.lang.ArrayIndexOutOfBoundsException var67 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var54, var64);
    org.apache.commons.math.FunctionEvaluationException var70 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var71 = var70.getArguments();
    org.apache.commons.math.MathException var72 = new org.apache.commons.math.MathException("hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var72, 1.0d);
    org.apache.commons.math.exception.util.Localizable var75 = var72.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var76 = null;
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var79 = var78.getArguments();
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException(var76, var79);
    java.lang.ArithmeticException var81 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var75, var79);
    java.lang.Object[] var82 = new java.lang.Object[] { var75};
    org.apache.commons.math.MathException var83 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, var54, var82);
    java.util.NoSuchElementException var84 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.7491987728881979d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3347592604095586d);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    java.lang.Throwable var3 = null;
    double[] var7 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.util.Localizable var17 = null;
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var20 = var19.getArguments();
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException(var17, var20);
    java.io.EOFException var22 = org.apache.commons.math.MathRuntimeException.createEOFException(var16, var20);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var3, var7, var15, var20);
    java.util.NoSuchElementException var24 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("hi!", var20);
    java.lang.Object[] var25 = org.apache.commons.math.exception.util.ArgUtils.flatten(var20);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(0.9065338654042625d, "hi!", var20);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.21780540111532407d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     java.io.IOException var1 = org.apache.commons.math.MathRuntimeException.createIOException(var0);
// 
//   }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.015730986458679944d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01573033772228485d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.7045072201226685d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6072208968980355d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.9938837346736189d), 0.6313493879676885d, (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.43579705878419134d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4509236637393617d);

  }

  public void test124() {}
//   public void test124() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(var0);
// 
//   }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    int var2 = org.apache.commons.math.util.FastMath.min(2, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    float var2 = org.apache.commons.math.util.FastMath.min((-1.0f), 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var1.nextHypergeometric(8, 100, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.015730986458679944d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01572968903404401d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var4 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var5 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, var3, (java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var10);
    java.lang.Object[] var14 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException((java.lang.Throwable)var11, "hi!", var14);
    java.lang.IllegalStateException var16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var14);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var20 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var21 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, var19, (java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var34 = var33.getArguments();
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException(var31, var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var18, var30, var34);
    org.apache.commons.math.ConvergenceException var37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var6, "", var34);
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException(var40, var43);
    java.io.EOFException var45 = org.apache.commons.math.MathRuntimeException.createEOFException(var39, var43);
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, "hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException("hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, 1.0d);
    org.apache.commons.math.exception.util.Localizable var54 = var51.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var55 = null;
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    org.apache.commons.math.MathException var59 = new org.apache.commons.math.MathException(var55, var58);
    java.lang.ArithmeticException var60 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var54, var58);
    org.apache.commons.math.exception.util.Localizable var62 = null;
    java.lang.Object[] var64 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var65 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var62, var64);
    java.util.NoSuchElementException var66 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var64);
    java.lang.ArrayIndexOutOfBoundsException var67 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var54, var64);
    org.apache.commons.math.FunctionEvaluationException var70 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var71 = var70.getArguments();
    org.apache.commons.math.MathException var72 = new org.apache.commons.math.MathException("hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var72, 1.0d);
    org.apache.commons.math.exception.util.Localizable var75 = var72.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var76 = null;
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var79 = var78.getArguments();
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException(var76, var79);
    java.lang.ArithmeticException var81 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var75, var79);
    java.lang.Object[] var82 = new java.lang.Object[] { var75};
    org.apache.commons.math.MathException var83 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, var54, var82);
    java.util.ConcurrentModificationException var84 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("", var82);
    org.apache.commons.math.MathRuntimeException var85 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var84);
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException((java.lang.Throwable)var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var3.cumulativeProbability(0.9173172759781082d, 0.0067844780309888495d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    int var2 = org.apache.commons.math.util.FastMath.min(10, 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.7374613234571589d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6354279412657219d);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)10L);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    java.lang.Throwable var0 = null;
    double[] var4 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var8 = var7.getArguments();
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException("hi!", var8);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 1.0d);
    org.apache.commons.math.exception.util.Localizable var12 = var9.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var17 = var16.getArguments();
    org.apache.commons.math.MathException var18 = new org.apache.commons.math.MathException(var14, var17);
    java.io.EOFException var19 = org.apache.commons.math.MathRuntimeException.createEOFException(var13, var17);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var0, var4, var12, var17);
    double[] var21 = var20.getArgument();
    org.apache.commons.math.exception.util.LocalizedFormats[] var24 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var25 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var24);
    java.lang.ArithmeticException var26 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var24);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var32 = var31.getArguments();
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException("hi!", var32);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, 1.0d);
    org.apache.commons.math.exception.util.Localizable var36 = var33.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException("hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, 1.0d);
    org.apache.commons.math.exception.util.Localizable var44 = var41.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var48 = new org.apache.commons.math.exception.NumberIsTooSmallException(var44, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var51 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var50);
    java.lang.Object[] var54 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var55 = new org.apache.commons.math.MathException((java.lang.Throwable)var51, "hi!", var54);
    java.lang.IllegalArgumentException var56 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var44, var54);
    java.lang.IllegalStateException var57 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var36, var54);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 0.0d, "", var54);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(var21, "", var54);
    java.lang.String var60 = var59.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.388721957374888d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.40956171022959337d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.21780540111532407d, 0.44296331673218897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.44296331673218897d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var1.nextGaussian(0.6246292191371761d, (-1.4601391056210007d));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.262367104461378d));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.9013191316598097d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0284080490040068d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0067844780309888495d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5640117967155458d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0511466667276397d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7822517578613938d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.9265947336016332d, 0.4509236637393617d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9662062439493844d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.08630187313454572d));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(1.5574077246549023d);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.1612894529345956d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02026832452239242d);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.nextWeibull((-1.460139105621001d), 4.9E-324d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-1L));
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    java.lang.Throwable var2 = null;
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var7 = var6.getArguments();
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("hi!", var7);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 1.0d);
    org.apache.commons.math.exception.util.Localizable var11 = var8.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, "hi!", var18);
    java.lang.IllegalStateException var20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var2, 100.0d, var11, var18);
    java.text.ParseException var22 = org.apache.commons.math.MathRuntimeException.createParseException(8, "85", var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var2 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var3 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var2);
//     org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException(var0, var1, var3);
//     java.lang.IllegalArgumentException var5 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var0);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.388721957374888d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.379543672011928d);

  }

  public void test157() {}
//   public void test157() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "85");
// 
//   }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.43017281537660473d), 2);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     var0.reseedRandomGenerator(1L);
//     double var5 = var0.cumulativeProbability(1.3440585709080678E43d);
//     double[] var7 = var0.sample(0);
//     double var8 = var0.getMean();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setStandardDeviation((-8.999999999999998d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.7460227825165098d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.0d);
// 
//   }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.nextPascal(3, (-0.2048470692831988d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var7 = var0.nextSecureLong(100L, (-9L));
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-1L));
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.0f, var1, true);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var6 = var0.nextHypergeometric(88, (-1), 0);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "fa"+ "'", var2.equals("fa"));
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.nextWeibull(0.0d, Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.1612894529345956d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1612894529345956d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setSecureAlgorithm("hi!", "85");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.054682624982037784d);

  }

  public void test170() {}
//   public void test170() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     java.lang.String var6 = var0.nextSecureHexString(10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextGamma(0.0d, 1.0513699053569932d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-1L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "62b47926fc"+ "'", var6.equals("62b47926fc"));
// 
//   }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextUniform(0.8421690108828669d, 4.9E-324d);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "48"+ "'", var2.equals("48"));
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
    var0.reSeedSecure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.nextExponential((-0.7351210460373782d));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.9265947336016332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.07623898958833586d));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54.13826373338679d);

  }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     var1.reSeed(0L);
//     var1.reSeedSecure();
//     java.util.Collection var5 = null;
//     java.lang.Object[] var7 = var1.nextSample(var5, 100);
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.41884580536897137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6471829767298978d);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var5 = var0.nextSecureLong(0L, (-9L));
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "ba"+ "'", var2.equals("ba"));
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.9232914105526042d, 1.1748018140526537d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1748018140526537d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.544725281664176d));

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(2.3978952727983707d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8276427247316823d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.4477507568008571d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0d, var1, false);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0038848218538872d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, var2, (java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var10 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var9);
    java.lang.Object[] var13 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var14 = new org.apache.commons.math.MathException((java.lang.Throwable)var10, "hi!", var13);
    java.lang.IllegalStateException var15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var13);
    double[] var17 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var19 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var20 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var19);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, var18, (java.lang.Object[])var19);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 1.0d);
    org.apache.commons.math.exception.util.Localizable var29 = var26.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException(var30, var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var15, var17, var29, var33);
    org.apache.commons.math.ConvergenceException var36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5, "", var33);
    org.apache.commons.math.ConvergenceException var37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5);
    java.lang.String var38 = var37.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "{0}"+ "'", var38.equals("{0}"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9173172759781081d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8216834706126773d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1353352832366127d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, var2, (java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var10 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var9);
    java.lang.Object[] var13 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var14 = new org.apache.commons.math.MathException((java.lang.Throwable)var10, "hi!", var13);
    java.lang.IllegalStateException var15 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var13);
    double[] var17 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var19 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var20 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var19);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, var18, (java.lang.Object[])var19);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 1.0d);
    org.apache.commons.math.exception.util.Localizable var29 = var26.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException(var30, var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var15, var17, var29, var33);
    org.apache.commons.math.ConvergenceException var36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var5, "", var33);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException(var39, var42);
    java.io.EOFException var44 = org.apache.commons.math.MathRuntimeException.createEOFException(var38, var42);
    org.apache.commons.math.MathException var45 = new org.apache.commons.math.MathException((java.lang.Throwable)var36, "hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var49 = var48.getArguments();
    org.apache.commons.math.MathException var50 = new org.apache.commons.math.MathException("hi!", var49);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, 1.0d);
    org.apache.commons.math.exception.util.Localizable var53 = var50.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var57 = var56.getArguments();
    org.apache.commons.math.MathException var58 = new org.apache.commons.math.MathException(var54, var57);
    java.lang.ArithmeticException var59 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var53, var57);
    org.apache.commons.math.exception.util.Localizable var61 = null;
    java.lang.Object[] var63 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var64 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var61, var63);
    java.util.NoSuchElementException var65 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var63);
    java.lang.ArrayIndexOutOfBoundsException var66 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var53, var63);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.MathException var71 = new org.apache.commons.math.MathException("hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 1.0d);
    org.apache.commons.math.exception.util.Localizable var74 = var71.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var75 = null;
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var78 = var77.getArguments();
    org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException(var75, var78);
    java.lang.ArithmeticException var80 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var74, var78);
    java.lang.Object[] var81 = new java.lang.Object[] { var74};
    org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException((java.lang.Throwable)var36, var53, var81);
    java.lang.Throwable var83 = null;
    org.apache.commons.math.exception.util.Localizable var84 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var85 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var86 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var85);
    org.apache.commons.math.ConvergenceException var87 = new org.apache.commons.math.ConvergenceException(var83, var84, var86);
    var82.addSuppressed((java.lang.Throwable)var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.7737371454186037d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.8421690108828669d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7652591570218927d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.5640117967155458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0176062821250957d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var7 = var1.nextPermutation(0, 3);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test197() {}
//   public void test197() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var6 = var0.nextPascal((-1), 1.5574077246549023d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.102250612858049d);
// 
//   }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.9232914105526042d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6108897919867806d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var3 = var2.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var2.cumulativeProbability(Double.NEGATIVE_INFINITY, 1.5707963267948966d);
      fail("Expected exception of type org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100.0d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    org.apache.commons.math.exception.util.LocalizedFormats[] var1 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var2 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var1);
    java.util.NoSuchElementException var3 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("{0}", var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var4 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var5 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, var3, (java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var10);
    java.lang.Object[] var14 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException((java.lang.Throwable)var11, "hi!", var14);
    java.lang.IllegalStateException var16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var14);
    double[] var18 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var20 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var21 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, var19, (java.lang.Object[])var20);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var34 = var33.getArguments();
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException(var31, var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var18, var30, var34);
    org.apache.commons.math.ConvergenceException var37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var6, "", var34);
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException(var40, var43);
    java.io.EOFException var45 = org.apache.commons.math.MathRuntimeException.createEOFException(var39, var43);
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, "hi!", var43);
    java.util.NoSuchElementException var47 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("85", var43);
    java.io.IOException var48 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.3440585709080678E43d, (java.lang.Number)0.6655360820377971d, false);

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var3 = var2.sample();
//     double var4 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var7 = var0.nextSecureLong(2L, 0L);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.317756056348666d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.3447663272947223d);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
    double var4 = var2.cumulativeProbability((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.006987206244798594d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    double var2 = org.apache.commons.math.util.FastMath.max(10.0d, 0.44296331673218897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.4477507568008571d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 25.65422863847765d);

  }

  public void test208() {}
//   public void test208() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.util.Collection var7 = null;
//     java.lang.Object[] var9 = var0.nextSample(var7, 3);
// 
//   }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.379543672011928d, (-0.2874589249749064d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.2874589249749064d));

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     org.apache.commons.math.distribution.IntegerDistribution var2 = null;
//     int var3 = var0.nextInversionDeviate(var2);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    double var2 = org.apache.commons.math.util.FastMath.pow((-8.999999999999998d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var8 = var1.nextHypergeometric(3, (-1), 1);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.042997527242125126d);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-9L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.5640117967155458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02729715539271851d);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.9662062439493844d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.014930160283569737d));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.055239418269188496d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1649855295823555d);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.5387985170587266d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var1.nextUniform(10.0d, (-0.9938837346736189d));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.2186961367900524d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 90.0d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 22025.465794806718d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-8.0d), 886.1134514093567d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 886.1134514093567d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
    double var3 = var2.getMean();
    double var5 = var2.probability(3);
    double var8 = var2.cumulativeProbability(4.5399929762484854E-5d, 6.798432482298277E248d);
    double var11 = var2.cumulativeProbability(0, 150);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.6112780426251042d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0176062821250957d, (-1.4601391056210007d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0176062821250957d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 52.55840838798297d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0513699053569932d, (java.lang.Number)Double.NaN, true);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + Double.NaN+ "'", var5.equals(Double.NaN));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.8276427247316823d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9748945791087863d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.0d, 3.1649855295823555d, 32);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var7 = var1.nextBeta(0.7853981633974483d, 0.4477507568008571d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var1.nextBeta(0.8421690108828669d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException");
    } catch (org.apache.commons.math.FunctionEvaluationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.9280753110165308d);

  }

  public void test233() {}
//   public void test233() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var7 = var1.nextHypergeometric(10, 0, (-1));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 2L);
// 
//   }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.41884580536897137d, 1.7737371454186037d, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var3.cumulativeProbability(1, 32);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var1.nextSecureHexString(0);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.tanh(Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var4 = var2.density(0.7491987728881979d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var2.cumulativeProbability(0.6355383653527001d, 0.33353496754666445d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.480804297282697d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.31803165939586947d));

  }

  public void test241() {}
//   public void test241() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     double var8 = var0.nextBeta(1.0513699053569932d, 1.0099010138502609d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var11 = var0.nextGamma(0.7822517578613938d, 0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-2L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.5974634368807754d);
// 
//   }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)");
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.015730986458679944d, 1.5640117967155458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.010057760463763889d);

  }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.nextExponential((-0.17841737207110217d));
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-2L));
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var11 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var11);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var16 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var15);
    java.lang.Object[] var19 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException((java.lang.Throwable)var16, "hi!", var19);
    java.lang.IllegalStateException var21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var25 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var26 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, var24, (java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var31 = var30.getArguments();
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException("hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var32, 1.0d);
    org.apache.commons.math.exception.util.Localizable var35 = var32.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var39 = var38.getArguments();
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException(var36, var39);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, var23, var35, var39);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var44 = var43.getArguments();
    org.apache.commons.math.ConvergenceException var45 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, var35, var44);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var49 = var48.getArguments();
    org.apache.commons.math.MathException var50 = new org.apache.commons.math.MathException("hi!", var49);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, 1.0d);
    org.apache.commons.math.exception.util.Localizable var53 = var50.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var57 = var56.getArguments();
    org.apache.commons.math.MathException var58 = new org.apache.commons.math.MathException(var54, var57);
    java.lang.ArithmeticException var59 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var53, var57);
    org.apache.commons.math.exception.util.Localizable var61 = null;
    java.lang.Object[] var63 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var64 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var61, var63);
    java.util.NoSuchElementException var65 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var63);
    java.lang.ArrayIndexOutOfBoundsException var66 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var53, var63);
    org.apache.commons.math.ConvergenceException var67 = new org.apache.commons.math.ConvergenceException(var35, var63);
    java.lang.String var68 = var67.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!"+ "'", var68.equals("org.apache.commons.math.ConvergenceException: hi!"));

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     int var7 = var0.nextInt(8, 100);
//     org.apache.commons.math.distribution.NormalDistributionImpl var10 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
//     var10.reseedRandomGenerator((-1L));
//     double var13 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var16 = var0.nextPermutation(8, 22);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-2L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 53);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0.13637187905763556d);
// 
//   }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow(10.0d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var30 = var29.getArguments();
    org.apache.commons.math.MathException var31 = new org.apache.commons.math.MathException(var27, var30);
    java.lang.ArithmeticException var32 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var26, var30);
    org.apache.commons.math.exception.util.Localizable var34 = null;
    java.lang.Object[] var36 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var37 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var34, var36);
    java.util.NoSuchElementException var38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var36);
    java.lang.ArrayIndexOutOfBoundsException var39 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var26, var36);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var8, var36);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var43 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var42);
    java.lang.Object[] var46 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var47 = new org.apache.commons.math.MathException((java.lang.Throwable)var43, "hi!", var46);
    java.lang.Object[] var48 = var43.getArguments();
    org.apache.commons.math.MathRuntimeException var49 = new org.apache.commons.math.MathRuntimeException(var8, var48);
    java.lang.RuntimeException var50 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var49);
    org.apache.commons.math.MathRuntimeException var51 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var49);
    java.lang.String var52 = var49.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    double var2 = org.apache.commons.math.util.FastMath.pow((-1.460139105621001d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.6251554257910217d, 1.2261911708835171d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2261911708835171d);

  }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }
// 
// 
//     org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var2 = var1.getArguments();
//     java.lang.Throwable var3 = null;
//     var1.addSuppressed(var3);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.014930160283569737d), (-0.07623898958833586d));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var13 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var12);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var16);
    java.lang.Object[] var20 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException((java.lang.Throwable)var17, "hi!", var20);
    java.lang.IllegalStateException var22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var20);
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var26 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var27 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var26);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, var25, (java.lang.Object[])var26);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var32 = var31.getArguments();
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException("hi!", var32);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, 1.0d);
    org.apache.commons.math.exception.util.Localizable var36 = var33.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException(var37, var40);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, var24, var36, var40);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.ConvergenceException var46 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var13, var36, var45);
    java.lang.IllegalArgumentException var47 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("91", var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 0.06669381571763945d, 0.0d);
    double var5 = var3.density((-0.544725281664176d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.1353352832366127d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.6108897919867806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6108897919867806d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    double var2 = org.apache.commons.math.util.FastMath.max(52.55840838798297d, 4.5399929762484854E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 52.55840838798297d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    long var2 = org.apache.commons.math.util.FastMath.min(10L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.9265947336016332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-0.08630187313454572d), (java.lang.Number)0.44296331673218897d, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.44296331673218897d+ "'", var4.equals(0.44296331673218897d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-0.08630187313454572d)+ "'", var5.equals((-0.08630187313454572d)));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9448909534606371d);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.798432482298277E248d);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var10, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var18 = var17.getArguments();
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException("hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var19, 1.0d);
    org.apache.commons.math.exception.util.Localizable var22 = var19.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var26 = new org.apache.commons.math.exception.NumberIsTooSmallException(var22, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var29 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var28);
    java.lang.Object[] var32 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException((java.lang.Throwable)var29, "hi!", var32);
    java.lang.IllegalArgumentException var34 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var22, var32);
    java.lang.NullPointerException var35 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var10, var32);
    org.apache.commons.math.MaxIterationsExceededException var36 = new org.apache.commons.math.MaxIterationsExceededException(32, "hi!", var32);
    org.apache.commons.math.MathException var37 = new org.apache.commons.math.MathException("d8b9700ff0", var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.06600724576503364d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06595940771553593d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.util.Collection var7 = null;
//     java.lang.Object[] var9 = var0.nextSample(var7, 100);
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.nextChiSquare((-8.999999999999998d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-2L));
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.6355383653527001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6887056219457095d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(-1.460139105621001d), var1, true);
    java.lang.Throwable var4 = null;
    double[] var8 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var13, 1.0d);
    org.apache.commons.math.exception.util.Localizable var16 = var13.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var17 = null;
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var21 = var20.getArguments();
    org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException(var18, var21);
    java.io.EOFException var23 = org.apache.commons.math.MathRuntimeException.createEOFException(var17, var21);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(var4, var8, var16, var21);
    double[] var25 = var24.getArgument();
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var32 = var31.getArguments();
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException(var29, var32);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException((-9.0d), "", var32);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var3, var25, "", var32);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException("hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, 1.0d);
    org.apache.commons.math.exception.util.Localizable var44 = var41.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var48 = new org.apache.commons.math.exception.NumberIsTooSmallException(var44, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var49 = null;
    org.apache.commons.math.exception.util.Localizable var50 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var51 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var52 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var51);
    org.apache.commons.math.ConvergenceException var53 = new org.apache.commons.math.ConvergenceException(var49, var50, var52);
    java.lang.UnsupportedOperationException var54 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var44, var52);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    org.apache.commons.math.MathException var59 = new org.apache.commons.math.MathException("hi!", var58);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var59, 1.0d);
    org.apache.commons.math.exception.util.Localizable var62 = var59.getLocalizablePattern();
    java.lang.Throwable[] var63 = var59.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var44, (java.lang.Object[])var63);
    org.apache.commons.math.exception.NumberIsTooSmallException var68 = new org.apache.commons.math.exception.NumberIsTooSmallException(var44, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    boolean var69 = var68.getBoundIsAllowed();
    var35.addSuppressed((java.lang.Throwable)var68);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var74 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var73);
    java.lang.Object[] var77 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var78 = new org.apache.commons.math.MathException((java.lang.Throwable)var74, "hi!", var77);
    org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException((java.lang.Throwable)var35, "", var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 49);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var2);
    java.lang.Object[] var6 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException((java.lang.Throwable)var3, "hi!", var6);
    java.lang.Object[] var8 = var3.getArguments();
    java.lang.Throwable var10 = null;
    double[] var14 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var18 = var17.getArguments();
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException("hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var19, 1.0d);
    org.apache.commons.math.exception.util.Localizable var22 = var19.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException(var24, var27);
    java.io.EOFException var29 = org.apache.commons.math.MathRuntimeException.createEOFException(var23, var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var10, var14, var22, var27);
    org.apache.commons.math.MathRuntimeException var31 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3, "", var27);
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException("hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var32, 0.33353496754666445d);
    java.lang.String var35 = var34.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var35.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.5640117967155458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2297540179371376d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
    double var3 = var2.getMean();
    double var5 = var2.probability(3);
    int[] var7 = var2.sample(8);
    var2.reseedRandomGenerator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 22);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.17841737207110217d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-10.222562411489442d));

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 0.5119984566736251d);
    double var4 = var2.probability(0);
    double var6 = var2.probability(0.6471829767298978d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.388721957374888d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     double var7 = var1.nextF(0.7822517578613938d, 0.9232914105526042d);
//     var1.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var11 = var1.nextCauchy(0.1353352832366127d, (-0.31803165939586947d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.03769144987347695d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.24128471713530023d);
// 
//   }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var1.nextChiSquare((-0.2048470692831988d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    java.lang.Object[] var1 = null;
    java.io.EOFException var2 = org.apache.commons.math.MathRuntimeException.createEOFException("", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    double[] var4 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var6 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var7 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var6);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(var4, var5, (java.lang.Object[])var6);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var13 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var12);
    java.lang.Object[] var16 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var17 = new org.apache.commons.math.MathException((java.lang.Throwable)var13, "hi!", var16);
    java.lang.IllegalStateException var18 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var16);
    double[] var20 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var22 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var23 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var22);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(var20, var21, (java.lang.Object[])var22);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException("hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 1.0d);
    org.apache.commons.math.exception.util.Localizable var32 = var29.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var33 = null;
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var36 = var35.getArguments();
    org.apache.commons.math.MathException var37 = new org.apache.commons.math.MathException(var33, var36);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var20, var32, var36);
    org.apache.commons.math.ConvergenceException var39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var8, "", var36);
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.exception.util.Localizable var42 = null;
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException(var42, var45);
    java.io.EOFException var47 = org.apache.commons.math.MathRuntimeException.createEOFException(var41, var45);
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException((java.lang.Throwable)var39, "hi!", var45);
    java.util.NoSuchElementException var49 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("85", var45);
    org.apache.commons.math.MaxIterationsExceededException var50 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.ConvergenceException: hi!", var45);
    int var51 = var50.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.2874589249749064d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.cbrt(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
    double var3 = var2.getMean();
    double var5 = var2.probability(3);
    int[] var7 = var2.sample(8);
    int[] var9 = var2.sample(3);
    var2.reseedRandomGenerator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(56.390870217885784d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.8347430193464644d);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14924743764839288d));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.6108897919867806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-24.928354512013925d));

  }

  public void test290() {}
//   public void test290() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     var1.reSeed(0L);
//     var1.reSeedSecure();
//     double var7 = var1.nextBeta(0.7853981633974483d, 0.4477507568008571d);
//     org.apache.commons.math.distribution.NormalDistributionImpl var8 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var9 = var8.sample();
//     double var11 = var8.inverseCumulativeProbability(2.061280873685841E-48d);
//     double[] var13 = var8.sample(150);
//     double[] var15 = var8.sample(0);
//     double var16 = var1.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var8);
//     var8.setStandardDeviation(0.9716425480818884d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.9280753110165308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0.21652170520014546d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-9.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var15);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == (-0.7045780998118899d));
// 
//   }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.014930160283569737d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.014930160283569737d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.1104315260748466d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.10998587378601468d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-2L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2L));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.9173172759781081d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.14924743764839288d), 8);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.05154456169528096d, 0.7374613234571589d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05154456169528097d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var4 = var2.density(0.7491987728881979d);
    double var5 = var2.sample();
    double var6 = var2.sample();
    double var7 = var2.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStandardDeviation((-0.014930160283569737d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-0.9938837346736189d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     var1.reSeedSecure();
//     org.apache.commons.math.distribution.NormalDistributionImpl var6 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var7 = var6.sample();
//     var6.reseedRandomGenerator(1L);
//     double var11 = var6.cumulativeProbability(1.3440585709080678E43d);
//     double var12 = var1.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var6);
//     double var15 = var1.nextGamma(0.7045072201226685d, 3.8347430193464644d);
//     java.util.Collection var16 = null;
//     java.lang.Object[] var18 = var1.nextSample(var16, 100);
// 
//   }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.0176062821250957d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8937684728889185d);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException("3a47e633fc", var1);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    int var2 = org.apache.commons.math.util.FastMath.max(3, 33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 33);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.08630187313454572d), 0.6246292191371761d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.08630187313454572d));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    java.lang.Throwable var1 = null;
    double[] var5 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var18 = var17.getArguments();
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException(var15, var18);
    java.io.EOFException var20 = org.apache.commons.math.MathRuntimeException.createEOFException(var14, var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var1, var5, var13, var18);
    java.lang.NullPointerException var22 = org.apache.commons.math.MathRuntimeException.createNullPointerException("", var18);
    java.lang.String var23 = var22.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "org.apache.commons.math.MathRuntimeException$9: "+ "'", var23.equals("org.apache.commons.math.MathRuntimeException$9: "));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    java.lang.Object[] var1 = null;
    java.io.EOFException var2 = org.apache.commons.math.MathRuntimeException.createEOFException("org.apache.commons.math.MathRuntimeException$9: ", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.6755907911840132d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5941554232362228d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.43017281537660473d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var11 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var11);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var16 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var15);
    java.lang.Object[] var19 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException((java.lang.Throwable)var16, "hi!", var19);
    java.lang.IllegalStateException var21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var19);
    double[] var23 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var25 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var26 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, var24, (java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var31 = var30.getArguments();
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException("hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var32, 1.0d);
    org.apache.commons.math.exception.util.Localizable var35 = var32.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var39 = var38.getArguments();
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException(var36, var39);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, var23, var35, var39);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var44 = var43.getArguments();
    org.apache.commons.math.ConvergenceException var45 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, var35, var44);
    org.apache.commons.math.exception.NotStrictlyPositiveException var47 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var35, (java.lang.Number)2.061280873685841E-48d);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var51);
    java.lang.Object[] var55 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var56 = new org.apache.commons.math.MathException((java.lang.Throwable)var52, "hi!", var55);
    org.apache.commons.math.MathRuntimeException var57 = new org.apache.commons.math.MathRuntimeException("", var55);
    org.apache.commons.math.MathRuntimeException var58 = new org.apache.commons.math.MathRuntimeException("hi!", var55);
    java.lang.UnsupportedOperationException var59 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var35, var55);
    java.io.IOException var60 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    java.lang.NullPointerException var2 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = var0.nextHexString((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9662062439493844d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8227351738543658d);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    java.lang.Throwable[] var27 = var23.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var8, (java.lang.Object[])var27);
    org.apache.commons.math.exception.NumberIsTooSmallException var32 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    java.lang.Number var33 = var32.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 0.388721957374888d+ "'", var33.equals(0.388721957374888d));

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "91");
// 
//   }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.3149413275154456d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 18.04480886088242d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var1.cumulativeProbability(33, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.5574077246549023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.47859127706984d);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.35307782806636057d, 0.05056878675728234d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05056878675728234d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0d, var1, false);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    boolean var6 = var3.getBoundIsAllowed();
    boolean var7 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException(var9, var12);
    java.lang.ArithmeticException var14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var8, var12);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var19 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var16, var18);
    java.util.NoSuchElementException var20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var18);
    java.lang.ArrayIndexOutOfBoundsException var21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var8, var18);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 1.0d);
    org.apache.commons.math.exception.util.Localizable var29 = var26.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var33 = new org.apache.commons.math.exception.NumberIsTooSmallException(var29, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var34 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var36 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var37 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var36);
    org.apache.commons.math.ConvergenceException var38 = new org.apache.commons.math.ConvergenceException(var34, var35, var37);
    java.lang.UnsupportedOperationException var39 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var29, var37);
    org.apache.commons.math.MaxIterationsExceededException var40 = new org.apache.commons.math.MaxIterationsExceededException(8, var8, var37);
    org.apache.commons.math.exception.util.LocalizedFormats[] var44 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var45 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var44);
    java.lang.IllegalStateException var46 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var44);
    java.lang.ArrayIndexOutOfBoundsException var47 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var8, (java.lang.Object[])var44);
    java.io.IOException var48 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
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

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, var2, (java.lang.Object[])var3);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var17 = new org.apache.commons.math.exception.NumberIsTooSmallException(var13, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var18 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var17);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var22 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var21);
    java.lang.Object[] var25 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException((java.lang.Throwable)var22, "hi!", var25);
    java.lang.IllegalStateException var27 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var25);
    double[] var29 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var31 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var32 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(var29, var30, (java.lang.Object[])var31);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var37 = var36.getArguments();
    org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException("hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 1.0d);
    org.apache.commons.math.exception.util.Localizable var41 = var38.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var42 = null;
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException(var42, var45);
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, var29, var41, var45);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.ConvergenceException var51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var18, var41, var50);
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var56 = var55.getArguments();
    java.lang.IllegalStateException var57 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var56);
    java.lang.NullPointerException var58 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var52, var56);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(var1, var41, var56);
    java.lang.Number var61 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var63 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.0f, var61, true);
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var69 = var68.getArguments();
    org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException("hi!", var69);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var70, 1.0d);
    org.apache.commons.math.exception.util.Localizable var73 = var70.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var77 = var76.getArguments();
    org.apache.commons.math.MathException var78 = new org.apache.commons.math.MathException("hi!", var77);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var78, 1.0d);
    org.apache.commons.math.exception.util.Localizable var81 = var78.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var85 = new org.apache.commons.math.exception.NumberIsTooSmallException(var81, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var88 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var87);
    java.lang.Object[] var91 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var92 = new org.apache.commons.math.MathException((java.lang.Throwable)var88, "hi!", var91);
    java.lang.IllegalArgumentException var93 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var81, var91);
    java.lang.IllegalStateException var94 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var73, var91);
    java.lang.IllegalStateException var95 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var91);
    org.apache.commons.math.MathRuntimeException var96 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var63, "", var91);
    org.apache.commons.math.MathRuntimeException var97 = new org.apache.commons.math.MathRuntimeException(var41, var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var5 = var1.nextLong(0L, (-9L));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(572.9577951308231d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 572.9577951308232d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var30 = var29.getArguments();
    org.apache.commons.math.MathException var31 = new org.apache.commons.math.MathException(var27, var30);
    java.lang.ArithmeticException var32 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var26, var30);
    org.apache.commons.math.exception.util.Localizable var34 = null;
    java.lang.Object[] var36 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var37 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var34, var36);
    java.util.NoSuchElementException var38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var36);
    java.lang.ArrayIndexOutOfBoundsException var39 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var26, var36);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var8, var36);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var44 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var43);
    java.lang.Object[] var47 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException((java.lang.Throwable)var44, "hi!", var47);
    java.lang.IllegalStateException var49 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var47);
    double[] var51 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var53 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var54 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var53);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, var52, (java.lang.Object[])var53);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException("hi!", var59);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var60, 1.0d);
    org.apache.commons.math.exception.util.Localizable var63 = var60.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var64 = null;
    org.apache.commons.math.FunctionEvaluationException var66 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var67 = var66.getArguments();
    org.apache.commons.math.MathException var68 = new org.apache.commons.math.MathException(var64, var67);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var49, var51, var63, var67);
    java.util.ConcurrentModificationException var70 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var8, var67);
    java.lang.String var71 = var70.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "org.apache.commons.math.MathRuntimeException$6: hi!"+ "'", var71.equals("org.apache.commons.math.MathRuntimeException$6: hi!"));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 1.7737371454186037d);
    double var4 = var2.cumulativeProbability(4.9E-324d);
    double var7 = var2.cumulativeProbability((-0.07623898958833586d), 0.21780540111532407d);
    var2.setStandardDeviation(0.02729715539271851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.06600724576503364d);

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getStandardDeviation();
//     var0.reseedRandomGenerator(100L);
//     java.lang.Double var4 = null;
//     double var5 = var0.density(var4);
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-2L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.3182561821784878d, 0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.32488337490313424d);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.7374613234571589d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7414925569271285d);

  }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     var1.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var8 = var1.nextPascal(0, 0.6780272932086999d);
//       fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException");
//     } catch (org.apache.commons.math.FunctionEvaluationException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.03183435599021848d);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.6990010320793059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6518479876354057d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 0.5119984566736251d);
    double var4 = var2.cumulativeProbability(0.02026832452239242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.45917098116252053d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.6990010320793059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.1271283640747662d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1355627738911717d);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var8 = var0.nextPoisson(0.0d);
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-2L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.009160782223893124d);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.2186961367900524d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3448699109612684d);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.6108897919867806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.POSITIVE_INFINITY, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6780272932086999d, 52.55840838798297d);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.7491987728881979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9082366419607295d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.037480427280247704d));

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(4.5399929762484854E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999999989694232d);

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.01573033772228485d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     var0.reseedRandomGenerator(1L);
//     var0.setMean(0.0d);
//     double[] var7 = var0.sample(1);
//     double var9 = var0.inverseCumulativeProbability(0.0d);
//     double var11 = var0.inverseCumulativeProbability(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.43621669096521837d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == Double.NEGATIVE_INFINITY);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.2902572652734152d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02251923747679899d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    java.lang.ArrayIndexOutOfBoundsException var2 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    java.lang.Throwable var1 = null;
    double[] var5 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var18 = var17.getArguments();
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException(var15, var18);
    java.io.EOFException var20 = org.apache.commons.math.MathRuntimeException.createEOFException(var14, var18);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var1, var5, var13, var18);
    double[] var22 = var21.getArgument();
    org.apache.commons.math.exception.util.LocalizedFormats[] var25 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var26 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var25);
    java.lang.ArithmeticException var27 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException("hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 1.0d);
    org.apache.commons.math.exception.util.Localizable var45 = var42.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var49 = new org.apache.commons.math.exception.NumberIsTooSmallException(var45, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var51);
    java.lang.Object[] var55 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var56 = new org.apache.commons.math.MathException((java.lang.Throwable)var52, "hi!", var55);
    java.lang.IllegalArgumentException var57 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var45, var55);
    java.lang.IllegalStateException var58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var37, var55);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 0.0d, "", var55);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var22, "", var55);
    java.lang.IllegalArgumentException var61 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("", var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    java.lang.Throwable[] var9 = var5.getSuppressed();
    java.lang.ArithmeticException var10 = org.apache.commons.math.MathRuntimeException.createArithmeticException("1e410e9b1053e937975a9c0285c901d7872595a836528932b", (java.lang.Object[])var9);
    java.lang.IllegalArgumentException var11 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var16 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var15);
    java.lang.Object[] var19 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException((java.lang.Throwable)var16, "hi!", var19);
    java.lang.IllegalArgumentException var21 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var9, var19);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    java.text.ParseException var27 = org.apache.commons.math.MathRuntimeException.createParseException(0, var9, var25);
    org.apache.commons.math.exception.util.LocalizedFormats[] var31 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var32 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var31);
    java.lang.IllegalStateException var33 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var31);
    org.apache.commons.math.MaxIterationsExceededException var34 = new org.apache.commons.math.MaxIterationsExceededException(3, var9, (java.lang.Object[])var31);
    int var35 = var34.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 3);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8646647167633873d));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.02026832452239242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    org.apache.commons.math.exception.util.LocalizedFormats[] var2 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var3 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var2);
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[])var2);
    org.apache.commons.math.MathRuntimeException var5 = new org.apache.commons.math.MathRuntimeException("ccfe1a8af9", (java.lang.Object[])var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test355() {}
//   public void test355() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "{0}");
// 
//   }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.2048470692831988d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2063074606767427d));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.5941554232362228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 34.042598126244734d);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.2048470692831988d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.20778673128834851d));

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.6780272932086999d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.20778673128834851d), 0.0d, 88);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var16 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var17 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var16);
    org.apache.commons.math.ConvergenceException var18 = new org.apache.commons.math.ConvergenceException(var14, var15, var17);
    java.lang.UnsupportedOperationException var19 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var9, var17);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var23 = var22.getArguments();
    org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException("hi!", var23);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var24, 1.0d);
    org.apache.commons.math.exception.util.Localizable var27 = var24.getLocalizablePattern();
    java.lang.Throwable[] var28 = var24.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var9, (java.lang.Object[])var28);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var33 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var32);
    java.lang.Object[] var36 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var37 = new org.apache.commons.math.MathException((java.lang.Throwable)var33, "hi!", var36);
    java.lang.Object[] var38 = var33.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("d8b9700ff0", var38);
    java.io.EOFException var40 = org.apache.commons.math.MathRuntimeException.createEOFException(var9, var38);
    java.lang.IllegalStateException var41 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("4e4320840b", var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var9 = var0.nextHypergeometric(8, 33, 32);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0L);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException((java.lang.Throwable)var4, "hi!", var7);
    java.lang.IllegalStateException var9 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var7);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var13 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var14 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var13);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var11, var12, (java.lang.Object[])var13);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var19 = var18.getArguments();
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException("hi!", var19);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 1.0d);
    org.apache.commons.math.exception.util.Localizable var23 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException(var24, var27);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, var11, var23, var27);
    java.lang.NullPointerException var30 = org.apache.commons.math.MathRuntimeException.createNullPointerException("org.apache.commons.math.MathRuntimeException$6: hi!", var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.02026832452239242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
    var2.reseedRandomGenerator((-1L));
    double var6 = var2.density((java.lang.Double)(-0.6070431245216862d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var2.inverseCumulativeProbability(25.65422863847765d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.08214745326637701d);

  }

  public void test367() {}
//   public void test367() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     double[] var1 = null;
//     org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(var0, var1);
// 
//   }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 0.06669381571763945d, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.inverseCumulativeProbability(1.0513699053569932d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test369() {}
//   public void test369() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var2 = var1.sample();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var1.cumulativeProbability(572.9577951308232d, 0.05465537715455142d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 2);
// 
//   }

  public void test370() {}
//   public void test370() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     int var4 = var1.nextInt(10, 49);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var8 = var1.nextHypergeometric((-1), 0, 63);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 45);
// 
//   }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.5027970753666804d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5027970753666804d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.007301132705501239d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.08544666585362613d);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-0.17841737207110217d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.01573033772228485d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7853981633974483d, 0.21780540111532407d, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var3.inverseCumulativeProbability(34.042598126244734d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.05154456169528097d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.1551717195201523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    java.lang.Throwable[] var27 = var23.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var8, (java.lang.Object[])var27);
    java.lang.Object[] var29 = null;
    java.util.NoSuchElementException var30 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException(var8, var29);
    org.apache.commons.math.ConvergenceException var31 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0176062821250957d, (-0.9938837346736189d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0176062821250957d);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.17841737207110217d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.17654799900690976d));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.45917098116252053d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6776215619079137d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 22);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.07623898958833586d), 88);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.8421690108828669d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6658461180017422d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     double[] var2 = new double[] { 1.0d};
//     org.apache.commons.math.exception.util.Localizable var3 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var4 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var5 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var4);
//     org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, var3, (java.lang.Object[])var4);
//     org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var10 = var9.getArguments();
//     org.apache.commons.math.MathException var11 = new org.apache.commons.math.MathException("hi!", var10);
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var11, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var14 = var11.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var18 = new org.apache.commons.math.exception.NumberIsTooSmallException(var14, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     org.apache.commons.math.MathRuntimeException var19 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var18);
//     org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var23 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var22);
//     java.lang.Object[] var26 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException((java.lang.Throwable)var23, "hi!", var26);
//     java.lang.IllegalStateException var28 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var26);
//     double[] var30 = new double[] { 1.0d};
//     org.apache.commons.math.exception.util.Localizable var31 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var32 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var33 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var32);
//     org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, var31, (java.lang.Object[])var32);
//     org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var38 = var37.getArguments();
//     org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("hi!", var38);
//     org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var42 = var39.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var43 = null;
//     org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var46 = var45.getArguments();
//     org.apache.commons.math.MathException var47 = new org.apache.commons.math.MathException(var43, var46);
//     org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, var30, var42, var46);
//     org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var51 = var50.getArguments();
//     org.apache.commons.math.ConvergenceException var52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var19, var42, var51);
//     org.apache.commons.math.exception.util.Localizable var53 = null;
//     org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var57 = var56.getArguments();
//     java.lang.IllegalStateException var58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var57);
//     java.lang.NullPointerException var59 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var53, var57);
//     org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var2, var42, var57);
//     java.lang.Throwable var61 = null;
//     double[] var65 = new double[] { (-1.0d), 100.0d, 10.0d};
//     org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var69 = var68.getArguments();
//     org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException("hi!", var69);
//     org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var70, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var73 = var70.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var74 = null;
//     org.apache.commons.math.exception.util.Localizable var75 = null;
//     org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var78 = var77.getArguments();
//     org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException(var75, var78);
//     java.io.EOFException var80 = org.apache.commons.math.MathRuntimeException.createEOFException(var74, var78);
//     org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(var61, var65, var73, var78);
//     org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException(var42, var78);
//     java.lang.Throwable var83 = null;
//     org.apache.commons.math.distribution.NormalDistributionImpl var84 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var85 = var84.sample();
//     var84.reseedRandomGenerator(1L);
//     var84.setMean(0.0d);
//     double[] var91 = var84.sample(1);
//     org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(var83, var91);
//     org.apache.commons.math.exception.util.LocalizedFormats[] var95 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var96 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var95);
//     java.lang.ArithmeticException var97 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var95);
//     org.apache.commons.math.FunctionEvaluationException var98 = new org.apache.commons.math.FunctionEvaluationException(var91, "d93925519a8d4cdab384bb75a609a3bf672790ae3911697a9", (java.lang.Object[])var95);
//     java.text.ParseException var99 = org.apache.commons.math.MathRuntimeException.createParseException(1, var42, (java.lang.Object[])var95);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var51);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var65);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var78);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var85 == 0.021597605164724493d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var91);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var95);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var96);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var97);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var99);
// 
//   }

  public void test389() {}
//   public void test389() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-0.037480427280247704d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.8937684728889185d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6264791904346702d);

  }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     double var8 = var0.nextGamma(2.061280873685841E-48d, 2.5537875429729695d);
//     java.util.Collection var9 = null;
//     java.lang.Object[] var11 = var0.nextSample(var9, 32);
// 
//   }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05056878675728234d, 0.9013191316598097d, 1.2902572652734152d);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.479425538604203d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    java.lang.Throwable[] var27 = var23.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var8, (java.lang.Object[])var27);
    org.apache.commons.math.exception.NumberIsTooSmallException var32 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    java.io.IOException var33 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.0d, 0.8084725010809981d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8909105342501892d);

  }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(2.7755575615628914E-17d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.01573033772228485d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.07623898958833586d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(6.078498120318978E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.078498118471572E-10d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(10);
    int var2 = var1.getMaxIterations();
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{0}"+ "'", var4.equals("{0}"));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0511466667276397d, (-1.460139105621001d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.8227351738543658d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8227351738543659d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.9232914105526042d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(56.390870217885784d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.15912044751765483d));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.39146457359249637d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.077605763213862d);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    java.lang.Object[] var1 = null;
    java.lang.ArrayIndexOutOfBoundsException var2 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("hi!", var1);
    org.apache.commons.math.ConvergenceException var3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.2874589249749064d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8623690518350022d);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.02647243584190612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.026475527886013074d);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.6938347821034475d, 0.7822517578613938d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6938347821034476d);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException((java.lang.Throwable)var4, "hi!", var7);
    java.lang.Object[] var9 = var4.getArguments();
    java.lang.Throwable var11 = null;
    double[] var15 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var19 = var18.getArguments();
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException("hi!", var19);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 1.0d);
    org.apache.commons.math.exception.util.Localizable var23 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException(var25, var28);
    java.io.EOFException var30 = org.apache.commons.math.MathRuntimeException.createEOFException(var24, var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(var11, var15, var23, var28);
    org.apache.commons.math.MathRuntimeException var32 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var4, "", var28);
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException("hi!", var28);
    java.util.NoSuchElementException var34 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("org.apache.commons.math.MathRuntimeException$6: hi!", var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeedSecure((-3L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0L);
// 
//   }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.054682624982037784d, 0.9716425480818884d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05468262498203779d);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("07f6f8c055");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var15 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var16 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var15);
    org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException(var13, var14, var16);
    java.lang.UnsupportedOperationException var18 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var8, var16);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    java.lang.Throwable[] var27 = var23.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var8, (java.lang.Object[])var27);
    org.apache.commons.math.exception.NumberIsTooSmallException var32 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    boolean var33 = var32.getBoundIsAllowed();
    boolean var34 = var32.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test415() {}
//   public void test415() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     double var6 = var1.nextF(0.4477507568008571d, 1.0176062821250957d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var1.nextF(0.0d, 4.9E-324d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1.171136647666584d);
// 
//   }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.09545784489950003d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var3 = var2.sample();
//     double var4 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var6 = var2.inverseCumulativeProbability(1.077605763213862d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.08276993808114992d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.0198397488880504d);
// 
//   }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(88);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException(var9, var12);
    java.lang.ArithmeticException var14 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var8, var12);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var19 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var16, var18);
    java.util.NoSuchElementException var20 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var18);
    java.lang.ArrayIndexOutOfBoundsException var21 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var8, var18);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 1.0d);
    org.apache.commons.math.exception.util.Localizable var29 = var26.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var33 = new org.apache.commons.math.exception.NumberIsTooSmallException(var29, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var34 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var36 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var37 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var36);
    org.apache.commons.math.ConvergenceException var38 = new org.apache.commons.math.ConvergenceException(var34, var35, var37);
    java.lang.UnsupportedOperationException var39 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var29, var37);
    org.apache.commons.math.MaxIterationsExceededException var40 = new org.apache.commons.math.MaxIterationsExceededException(8, var8, var37);
    org.apache.commons.math.exception.NumberIsTooSmallException var44 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.9748945791087863d, (java.lang.Number)1.5574077246549023d, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.02729715539271851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5638826079633834d));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(-1.460139105621001d), var1, true);
    org.apache.commons.math.ConvergenceException var4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3);
    boolean var5 = var3.getBoundIsAllowed();
    java.lang.Number var6 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (-1.460139105621001d)+ "'", var6.equals((-1.460139105621001d)));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException(var2, var5);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((-9.0d), "", var5);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var11 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var12 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var11);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, var10, (java.lang.Object[])var11);
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var18 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var17);
    java.lang.Object[] var21 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException((java.lang.Throwable)var18, "hi!", var21);
    java.lang.IllegalStateException var23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var21);
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var27 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var28 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var27);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, var26, (java.lang.Object[])var27);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException(var38, var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, var25, var37, var41);
    org.apache.commons.math.ConvergenceException var44 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var13, "", var41);
    org.apache.commons.math.exception.util.Localizable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException(var47, var50);
    java.io.EOFException var52 = org.apache.commons.math.MathRuntimeException.createEOFException(var46, var50);
    org.apache.commons.math.MathException var53 = new org.apache.commons.math.MathException((java.lang.Throwable)var44, "hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var57 = var56.getArguments();
    org.apache.commons.math.MathException var58 = new org.apache.commons.math.MathException("hi!", var57);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var58, 1.0d);
    org.apache.commons.math.exception.util.Localizable var61 = var58.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var62 = null;
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var65 = var64.getArguments();
    org.apache.commons.math.MathException var66 = new org.apache.commons.math.MathException(var62, var65);
    java.lang.ArithmeticException var67 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var61, var65);
    org.apache.commons.math.exception.util.Localizable var69 = null;
    java.lang.Object[] var71 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var72 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var69, var71);
    java.util.NoSuchElementException var73 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var71);
    java.lang.ArrayIndexOutOfBoundsException var74 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var61, var71);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var78 = var77.getArguments();
    org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException("hi!", var78);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var79, 1.0d);
    org.apache.commons.math.exception.util.Localizable var82 = var79.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var83 = null;
    org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var86 = var85.getArguments();
    org.apache.commons.math.MathException var87 = new org.apache.commons.math.MathException(var83, var86);
    java.lang.ArithmeticException var88 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var82, var86);
    java.lang.Object[] var89 = new java.lang.Object[] { var82};
    org.apache.commons.math.MathException var90 = new org.apache.commons.math.MathException((java.lang.Throwable)var44, var61, var89);
    java.lang.Object[] var91 = null;
    java.io.EOFException var92 = org.apache.commons.math.MathRuntimeException.createEOFException(var61, var91);
    java.lang.Object[] var93 = null;
    org.apache.commons.math.MathRuntimeException var94 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var7, var61, var93);
    org.apache.commons.math.ConvergenceException var95 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var94);
    java.lang.Object[] var96 = var94.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException((java.lang.Throwable)var4, "hi!", var7);
    java.lang.IllegalStateException var9 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var7);
    double[] var11 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var13 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var14 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var13);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var11, var12, (java.lang.Object[])var13);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var19 = var18.getArguments();
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException("hi!", var19);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 1.0d);
    org.apache.commons.math.exception.util.Localizable var23 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException(var24, var27);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, var11, var23, var27);
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException((java.lang.Throwable)var29);
    org.apache.commons.math.exception.util.Localizable var31 = var29.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var35 = var34.getArguments();
    org.apache.commons.math.MathException var36 = new org.apache.commons.math.MathException("hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, 1.0d);
    org.apache.commons.math.exception.util.Localizable var39 = var36.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var43 = new org.apache.commons.math.exception.NumberIsTooSmallException(var39, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var46 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var45);
    java.lang.Object[] var49 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var50 = new org.apache.commons.math.MathException((java.lang.Throwable)var46, "hi!", var49);
    java.lang.IllegalArgumentException var51 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var39, var49);
    org.apache.commons.math.exception.NotStrictlyPositiveException var53 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var39, (java.lang.Number)572.9577951308231d);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var56 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var55);
    java.lang.Object[] var59 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException((java.lang.Throwable)var56, "hi!", var59);
    org.apache.commons.math.ConvergenceException var61 = new org.apache.commons.math.ConvergenceException(var39, var59);
    java.lang.Object[] var64 = null;
    org.apache.commons.math.MaxIterationsExceededException var65 = new org.apache.commons.math.MaxIterationsExceededException((-1), "hi!", var64);
    int var66 = var65.getMaxIterations();
    org.apache.commons.math.exception.util.LocalizedFormats[] var71 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var72 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var71);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 1.3440585709080678E43d, "", (java.lang.Object[])var71);
    java.lang.UnsupportedOperationException var74 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var39, (java.lang.Object[])var71);
    java.text.ParseException var75 = org.apache.commons.math.MathRuntimeException.createParseException(63, var31, (java.lang.Object[])var71);
    java.lang.String var76 = var75.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "org.apache.commons.math.MathRuntimeException$10: hi!"+ "'", var76.equals("org.apache.commons.math.MathRuntimeException$10: hi!"));

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.lang.Throwable var1 = null;
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var14 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var13);
    java.lang.Object[] var17 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var18 = new org.apache.commons.math.MathException((java.lang.Throwable)var14, "hi!", var17);
    java.lang.IllegalStateException var19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var17);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var1, 100.0d, var10, var17);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var25 = var24.getArguments();
    org.apache.commons.math.MathException var26 = new org.apache.commons.math.MathException("hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var26, 1.0d);
    org.apache.commons.math.exception.util.Localizable var29 = var26.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var41 = new org.apache.commons.math.exception.NumberIsTooSmallException(var37, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var44 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var43);
    java.lang.Object[] var47 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException((java.lang.Throwable)var44, "hi!", var47);
    java.lang.IllegalArgumentException var49 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var37, var47);
    java.lang.IllegalStateException var50 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var29, var47);
    java.lang.IllegalStateException var51 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var47);
    java.util.ConcurrentModificationException var52 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var10, var47);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var57 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var56);
    java.lang.Object[] var60 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var61 = new org.apache.commons.math.MathException((java.lang.Throwable)var57, "hi!", var60);
    java.lang.Object[] var62 = var57.getArguments();
    java.lang.Throwable var64 = null;
    double[] var68 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var72 = var71.getArguments();
    org.apache.commons.math.MathException var73 = new org.apache.commons.math.MathException("hi!", var72);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var73, 1.0d);
    org.apache.commons.math.exception.util.Localizable var76 = var73.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var77 = null;
    org.apache.commons.math.exception.util.Localizable var78 = null;
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var81 = var80.getArguments();
    org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException(var78, var81);
    java.io.EOFException var83 = org.apache.commons.math.MathRuntimeException.createEOFException(var77, var81);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException(var64, var68, var76, var81);
    org.apache.commons.math.MathRuntimeException var85 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var57, "", var81);
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException("hi!", var81);
    org.apache.commons.math.MathRuntimeException var87 = new org.apache.commons.math.MathRuntimeException("ccfe1a8af9", var81);
    org.apache.commons.math.FunctionEvaluationException var88 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var10, var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.41884580536897137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.445188886603312d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.8216834706126773d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.43579705878419134d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4357970587841914d);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2L));

  }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.17654799900690976d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.03767750402853736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.03766859019954074d);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.2063074606767427d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5908877382714567d));

  }

  public void test432() {}
//   public void test432() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-2.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
    var3.setStandardDeviation(0.05004256629310059d);
    double[] var7 = var3.sample(49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.4347072887644785d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("org.apache.commons.math.FunctionEvaluationException: hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)0.0d, (java.lang.Number)(byte)10, true);
    boolean var5 = var4.getBoundIsAllowed();
    java.lang.Number var6 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (byte)10+ "'", var6.equals((byte)10));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.44296331673218897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.09988668658869368d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.72308557107815d);

  }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var2 = var1.sample();
//     double var4 = var1.normalApproximateProbability((-1));
//     double var6 = var1.cumulativeProbability(150);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var1.cumulativeProbability(0.7822517578613938d, 0.445188886603312d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.04961328364381645d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1.0d);
// 
//   }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     var0.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextGaussian((-0.2874589249749064d), 0.0d);
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0L);
// 
//   }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.1204928440257471d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4500099981925152d);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.9281781296282651d, 1.0176062821250957d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7394705340188515d);

  }

  public void test446() {}
//   public void test446() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     double var7 = var1.nextF(0.7822517578613938d, 0.9232914105526042d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var10 = var1.nextInt(2, (-1));
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.07777452461196116d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 8.815332823832652d);
// 
//   }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     var0.reseedRandomGenerator(1L);
//     var0.setMean(0.0d);
//     var0.reseedRandomGenerator((-9L));
//     double var9 = var0.density((java.lang.Double)90.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.2032794589395281d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0.0d);
// 
//   }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    double var1 = org.apache.commons.math.util.FastMath.log(22025.465794806718d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.99995459903963d);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    double var7 = var3.probability(0);
    var3.reseedRandomGenerator(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var3.cumulativeProbability(100, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4.5399929762484854E-5d);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.0f, var1, true);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var17 = var16.getArguments();
    org.apache.commons.math.MathException var18 = new org.apache.commons.math.MathException("hi!", var17);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, 1.0d);
    org.apache.commons.math.exception.util.Localizable var21 = var18.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var25 = new org.apache.commons.math.exception.NumberIsTooSmallException(var21, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var28 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var27);
    java.lang.Object[] var31 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException((java.lang.Throwable)var28, "hi!", var31);
    java.lang.IllegalArgumentException var33 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var21, var31);
    java.lang.IllegalStateException var34 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var13, var31);
    java.lang.IllegalStateException var35 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var31);
    org.apache.commons.math.MathRuntimeException var36 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3, "", var31);
    java.lang.Number var40 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var42 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(-1.460139105621001d), var40, true);
    org.apache.commons.math.ConvergenceException var43 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var42);
    org.apache.commons.math.exception.util.Localizable var47 = null;
    java.lang.Object[] var49 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var50 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var47, var49);
    java.util.NoSuchElementException var51 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var49);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 0.0d, "{0}", var49);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var3, 2.3978952727983707d, "{0}", var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.0099010138502609d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.190537109001971d);

  }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var7 = var0.nextSecureLong((-9L), (-3L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var11 = var0.nextHypergeometric(33, 0, 99);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.7640843882547188d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-6L));
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var13 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var12);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var16);
    java.lang.Object[] var20 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException((java.lang.Throwable)var17, "hi!", var20);
    java.lang.IllegalStateException var22 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var20);
    double[] var24 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var26 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var27 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var26);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, var25, (java.lang.Object[])var26);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var32 = var31.getArguments();
    org.apache.commons.math.MathException var33 = new org.apache.commons.math.MathException("hi!", var32);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, 1.0d);
    org.apache.commons.math.exception.util.Localizable var36 = var33.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException(var37, var40);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, var24, var36, var40);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.ConvergenceException var46 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var13, var36, var45);
    org.apache.commons.math.exception.NotStrictlyPositiveException var48 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var36, (java.lang.Number)2.061280873685841E-48d);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var53 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var52);
    java.lang.Object[] var56 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var57 = new org.apache.commons.math.MathException((java.lang.Throwable)var53, "hi!", var56);
    org.apache.commons.math.MathRuntimeException var58 = new org.apache.commons.math.MathRuntimeException("", var56);
    org.apache.commons.math.MathRuntimeException var59 = new org.apache.commons.math.MathRuntimeException("hi!", var56);
    java.lang.UnsupportedOperationException var60 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var36, var56);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var64 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var63);
    java.lang.Object[] var67 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var68 = new org.apache.commons.math.MathException((java.lang.Throwable)var64, "hi!", var67);
    java.lang.Object[] var69 = var64.getArguments();
    java.lang.Throwable var71 = null;
    double[] var75 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var79 = var78.getArguments();
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException("hi!", var79);
    org.apache.commons.math.FunctionEvaluationException var82 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var80, 1.0d);
    org.apache.commons.math.exception.util.Localizable var83 = var80.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var84 = null;
    org.apache.commons.math.exception.util.Localizable var85 = null;
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var88 = var87.getArguments();
    org.apache.commons.math.MathException var89 = new org.apache.commons.math.MathException(var85, var88);
    java.io.EOFException var90 = org.apache.commons.math.MathRuntimeException.createEOFException(var84, var88);
    org.apache.commons.math.FunctionEvaluationException var91 = new org.apache.commons.math.FunctionEvaluationException(var71, var75, var83, var88);
    org.apache.commons.math.MathRuntimeException var92 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var64, "", var88);
    org.apache.commons.math.MathException var93 = new org.apache.commons.math.MathException("hi!", var88);
    java.lang.NullPointerException var94 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var36, var88);
    java.util.ConcurrentModificationException var95 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)", var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test454() {}
//   public void test454() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("org.apache.commons.math.MathRuntimeException$10: hi!", "");
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "aa"+ "'", var2.equals("aa"));
// 
//   }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    double var7 = var3.normalApproximateProbability(100);
    int var9 = var3.inverseCumulativeProbability(0.6246292191371761d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var3.cumulativeProbability(28, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 8);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.6313493879676885d, 0.6938347821034475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.726808863761001d);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.5387985170587266d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5131050984584545d);

  }

  public void test458() {}
//   public void test458() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var3 = null;
//     org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var6 = var5.getArguments();
//     org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException(var3, var6);
//     org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((-9.0d), "", var6);
//     java.lang.ArrayIndexOutOfBoundsException var9 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var0, var6);
//     org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 0.5131050984584545d);
// 
//   }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.sample();
    double var7 = var0.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.inverseCumulativeProbability((-1.0d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.6246292191371761d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.010931894714319157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01093233021198049d);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    java.lang.Object[] var3 = null;
    org.apache.commons.math.MaxIterationsExceededException var4 = new org.apache.commons.math.MaxIterationsExceededException((-1), "hi!", var3);
    int var5 = var4.getMaxIterations();
    org.apache.commons.math.exception.util.LocalizedFormats[] var10 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var11 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.3440585709080678E43d, "", (java.lang.Object[])var10);
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("1e410e9b1053e937975a9c0285c901d7872595a836528932b", (java.lang.Object[])var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9173172759781082d, 1.2261911708835171d, 2.061280873685841E-48d);
    double var5 = var3.density(1.1748018140526537d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var3.inverseCumulativeProbability(1.1612894529345956d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.3182561821784878d);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.5574077246549023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0120948455406893d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.434902137921765d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.313312458232914d);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var4 = var2.density(0.7491987728881979d);
    double var5 = var2.sample();
    double var6 = var2.sample();
    double var8 = var2.density((java.lang.Double)0.9265947336016332d);
    var2.reseedRandomGenerator(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var2.cumulativeProbability(0.026475527886013074d);
      fail("Expected exception of type org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.539992976248491E-5d, 0.02729715539271851d);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.9232914105526042d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.03466120469385463d));

  }

  public void test472() {}
//   public void test472() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed();
//     int var12 = var0.nextInt(8, 33);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var14 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var15 = var14.sample();
//     int var16 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var14);
//     double var18 = var14.cumulativeProbability(1.1102230246251565E-16d);
//     var14.reseedRandomGenerator((-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.24002464887605032d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4c5c9d44a024fd7432f8c675a953639c115e4440a998733db"+ "'", var8.equals("4c5c9d44a024fd7432f8c675a953639c115e4440a998733db"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 0.2106815084135416d);
// 
//   }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    int var2 = org.apache.commons.math.util.FastMath.min(16, 63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 16);

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextBeta(0.05056878675728234d, (-0.6070431245216862d));
//       fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException");
//     } catch (org.apache.commons.math.FunctionEvaluationException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "79"+ "'", var2.equals("79"));
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.021597605164724493d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02159592614648966d);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.6108897919867806d, 0.21652170520014546d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.6108897919867806d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2L));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.40956171022959337d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5061575069989132d);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.0099010138502609d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 57.863065819602845d);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.inverseCumulativeProbability((-0.005120483541896959d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     long var6 = var0.nextLong((-7L), 0L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var9 = var0.nextPermutation(7, 88);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 9.448717071371348d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == (-3L));
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.4500099981925152d, 0.33353496754666445d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.33353496754666445d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.inverseCumulativeProbability(1.0513699053569932d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     double var7 = var1.nextF(0.7822517578613938d, 0.9232914105526042d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var10 = var1.nextSecureInt(33, 33);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.2080519102818089d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.5042078862496345d);
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var5 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.0f, var3, true);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var19 = var18.getArguments();
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException("hi!", var19);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 1.0d);
    org.apache.commons.math.exception.util.Localizable var23 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var27 = new org.apache.commons.math.exception.NumberIsTooSmallException(var23, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var30 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var29);
    java.lang.Object[] var33 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException((java.lang.Throwable)var30, "hi!", var33);
    java.lang.IllegalArgumentException var35 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var23, var33);
    java.lang.IllegalStateException var36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var15, var33);
    java.lang.IllegalStateException var37 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var33);
    org.apache.commons.math.MathRuntimeException var38 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var5, "", var33);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "3446", var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test487() {}
//   public void test487() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d);
//     int var2 = var1.sample();
//     int[] var4 = var1.sample(33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var4);
// 
//   }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(34.042598126244734d, 0.43579705878419134d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.65212082559966d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.01093233021198049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.10455778408124614d);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var14 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var13);
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var18 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var17);
    java.lang.Object[] var21 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException((java.lang.Throwable)var18, "hi!", var21);
    java.lang.IllegalStateException var23 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var21);
    double[] var25 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var27 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var28 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var27);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, var26, (java.lang.Object[])var27);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException(var38, var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, var25, var37, var41);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var46 = var45.getArguments();
    org.apache.commons.math.ConvergenceException var47 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var14, var37, var46);
    org.apache.commons.math.ConvergenceException var48 = new org.apache.commons.math.ConvergenceException("", var46);
    org.apache.commons.math.ConvergenceException var49 = new org.apache.commons.math.ConvergenceException("", var46);
    org.apache.commons.math.MathRuntimeException var50 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed((-1L));
    var1.reSeed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var7 = var1.nextZipf((-1), 0.9748945791087863d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test493() {}
//   public void test493() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.40956171022959337d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(572.9577951308231d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9280753110165308d, 1.0513699053569932d, 2);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    java.lang.Object[] var1 = null;
    java.lang.NullPointerException var2 = org.apache.commons.math.MathRuntimeException.createNullPointerException("426ae2758570592a9f6670c36e805ca157ccf7a3fd4d0d189", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.10998587378601468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.301726373997198d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9999999943688239d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8414709817653591d);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(52.55840838798297d);

  }

}
