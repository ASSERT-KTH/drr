
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var6 = var0.nextPoisson(0.3149413275154456d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextWeibull((-0.037480427280247704d), 0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 3.3167655844882886d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1L);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
    int[] var3 = var1.sample(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var1.cumulativeProbability(0.027508807623614077d, 0.01573033772228485d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.5027970753666804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4073280885929992d);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     int var6 = var0.nextInt(0, 8);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var9 = var0.nextPermutation(49, 0);
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 3.3142428216502644d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 8);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


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
    java.lang.Throwable var28 = null;
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var30 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var31 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var30);
    org.apache.commons.math.ConvergenceException var32 = new org.apache.commons.math.ConvergenceException(var28, var29, var31);
    java.util.ConcurrentModificationException var33 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var9, var31);
    java.lang.Object[] var35 = null;
    java.lang.ArrayIndexOutOfBoundsException var36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("hi!", var35);
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException("hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 1.0d);
    org.apache.commons.math.exception.util.Localizable var46 = var43.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var50 = new org.apache.commons.math.exception.NumberIsTooSmallException(var46, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var51 = null;
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var53 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var54 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var53);
    org.apache.commons.math.ConvergenceException var55 = new org.apache.commons.math.ConvergenceException(var51, var52, var54);
    java.lang.UnsupportedOperationException var56 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var46, var54);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var60 = var59.getArguments();
    org.apache.commons.math.MathException var61 = new org.apache.commons.math.MathException("hi!", var60);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var61, 1.0d);
    org.apache.commons.math.exception.util.Localizable var64 = var61.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var65 = null;
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var68 = var67.getArguments();
    org.apache.commons.math.MathException var69 = new org.apache.commons.math.MathException(var65, var68);
    java.lang.ArithmeticException var70 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var64, var68);
    org.apache.commons.math.exception.util.Localizable var72 = null;
    java.lang.Object[] var74 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var75 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var72, var74);
    java.util.NoSuchElementException var76 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var74);
    java.lang.ArrayIndexOutOfBoundsException var77 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var64, var74);
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var46, var74);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var81 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var80);
    java.lang.Object[] var84 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var85 = new org.apache.commons.math.MathException((java.lang.Throwable)var81, "hi!", var84);
    java.lang.Object[] var86 = var81.getArguments();
    org.apache.commons.math.MathRuntimeException var87 = new org.apache.commons.math.MathRuntimeException(var46, var86);
    java.lang.Object[] var88 = org.apache.commons.math.exception.util.ArgUtils.flatten(var86);
    org.apache.commons.math.MathRuntimeException var89 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var36, var37, var86);
    java.lang.UnsupportedOperationException var90 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var9, var86);
    java.lang.NullPointerException var91 = org.apache.commons.math.MathRuntimeException.createNullPointerException("{0}", var86);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(2.061280873685841E-48d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.061280873685841E-48d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double[] var5 = var0.sample(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.cumulativeProbability(7.313312458232914d, 0.479425538604203d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


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
    java.lang.Throwable[] var33 = var1.getSuppressed();
    
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
    assertNotNull(var33);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var2 = var1.sample();
//     double var4 = var1.normalApproximateProbability((-1));
//     double var6 = var1.cumulativeProbability(100);
//     double var8 = var1.probability(33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.04961328364381645d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 5.422723225671075E-32d);
// 
//   }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     java.lang.String var6 = var0.nextSecureHexString(10);
//     org.apache.commons.math.distribution.NormalDistributionImpl var9 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.01572968903404401d);
//     double var11 = var9.density((java.lang.Double)0.9065338654042625d);
//     double var12 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var9);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var15 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
//     double var16 = var15.getMean();
//     int var17 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var15);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var21 = var0.nextHypergeometric(16, 88, 100);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "2edf8090f4"+ "'", var6.equals("2edf8090f4"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.010051239724557981d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.9448909534606371d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 1);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var9 = var1.nextCauchy(1.7453292519943295d, 0.006987206244798594d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var1.nextUniform(0.03767750402853736d, (-8.0d));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.737913715527783d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.2297540179371376d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.021463256602632458d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.2297540179371376d, 1.0099010138502609d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.232274728136811d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("4e4320840b");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.9999999999982769d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    double var7 = var3.normalApproximateProbability(100);
    double var9 = var3.cumulativeProbability(4.9E-324d);
    int var11 = var3.inverseCumulativeProbability(0.6768839838114289d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4.539992976248491E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 8);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    double var5 = var3.probability(Double.NEGATIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var3.cumulativeProbability(0.4477507568008571d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var4 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException((java.lang.Throwable)var4, "hi!", var7);
    java.lang.Object[] var9 = var4.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("d93925519a8d4cdab384bb75a609a3bf672790ae3911697a9", var9);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException("ccfe1a8af9", var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.8623690518350022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.438972977369899d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 16);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.5574077246549023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999103740052037d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.32488337490313424d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    double var7 = var3.normalApproximateProbability(100);
    double var9 = var3.cumulativeProbability(4.9E-324d);
    double var10 = var3.getMean();
    double var12 = var3.probability(1.1612894529345956d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4.539992976248491E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    double var2 = org.apache.commons.math.util.FastMath.min(5.461176267347676E248d, 6.078498120318978E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.078498120318978E-10d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var7 = var1.nextBeta(0.7853981633974483d, 0.4477507568008571d);
    org.apache.commons.math.distribution.PoissonDistributionImpl var10 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 0.5119984566736251d);
    double var12 = var10.cumulativeProbability(10);
    int var13 = var1.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = var1.nextBeta((-2.0d), 0.02026832452239242d);
      fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException");
    } catch (org.apache.commons.math.FunctionEvaluationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.9280753110165308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.9999999943688239d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.03767750402853736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.5387985170587266d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1486975912703157d);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    int var2 = org.apache.commons.math.util.FastMath.max(32, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 32);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var2 = var1.sample();
//     double var4 = var1.normalApproximateProbability((-1));
//     double var6 = var1.probability(64);
//     double var8 = var1.probability(5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.04961328364381645d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 3.4194659698747033E-78d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.016086323390531173d);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 1.8312047378227096d, 0.9173172759781081d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.9252901772543515d);
    java.lang.String var2 = var1.toString();
    org.apache.commons.math.ConvergenceException var3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1);
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var3, 0.8089401865863317d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)"+ "'", var2.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)"));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.026475527886013074d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0003504972612298d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.5941554232362228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9345810969926102d);

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     double var3 = var0.inverseCumulativeProbability(0.41884580536897137d);
//     double var5 = var0.cumulativeProbability(0.021463256602632458d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.7796675909523737d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-0.2048470692831988d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.5085619431551482d);
// 
//   }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.atan2(2.861568512255232d, 1.0E-323d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    double[] var3 = var1.getArgument();
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var3);
    org.apache.commons.math.exception.util.Localizable var5 = var4.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var10 = var9.getArguments();
    org.apache.commons.math.MathException var11 = new org.apache.commons.math.MathException("hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var11, 1.0d);
    org.apache.commons.math.exception.util.Localizable var14 = var11.getLocalizablePattern();
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
    java.lang.IllegalStateException var35 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var14, var32);
    java.lang.IllegalStateException var36 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var32);
    org.apache.commons.math.MathException var37 = new org.apache.commons.math.MathException(var5, var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.026475527886013074d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.026478621881377083d);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     double var6 = var1.nextF(0.4477507568008571d, 1.0176062821250957d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var8 = var1.nextT((-0.43017281537660473d));
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
//     assertTrue(var6 == 1.217629805231283d);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21780540111532407d);
    double var2 = var1.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.21780540111532407d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.6990010320793059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.012199869484622393d);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }
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
//     long var15 = var1.nextLong((-3L), 10L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var19 = var1.nextHypergeometric(63, 88, 28);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.09949548055551156d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.7420986201408424d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-0.5875569036488778d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 7L);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.011665158741247577d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011597645306406688d);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
//     double var3 = var2.getMean();
//     double var5 = var2.probability(3);
//     double var8 = var2.cumulativeProbability(4.5399929762484854E-5d, 6.798432482298277E248d);
//     int var9 = var2.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.9448909534606371d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.05465537715455142d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.6112780426251042d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 1);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9832676487980728d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8694923984335489d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(Double.NaN);
    double var3 = var1.probability(0.6776215619079137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("3a47e633fc");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.sample();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.cumulativeProbability(1.0003504972612298d, 0.03767750402853736d);
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

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    int[] var6 = var1.nextPermutation(49, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var1.nextHypergeometric(1, (-1), 1628);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }
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
//     org.apache.commons.math.ConvergenceException var12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var3);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.882762046549212d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7078003295874091d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0513699053569932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7823383776692152d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, var1, (java.lang.Number)(byte)100, true);
    java.lang.Number var5 = var4.getMax();
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var9 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var8);
    java.lang.Object[] var12 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException((java.lang.Throwable)var9, "hi!", var12);
    java.lang.Object[] var14 = var9.getArguments();
    org.apache.commons.math.ConvergenceException var15 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var4, "3446", var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (byte)100+ "'", var5.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var6 = var1.nextSecureLong(0L, (-3L));
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1L);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.6887056219457095d);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.034052442853895304d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    java.lang.Throwable[] var10 = var6.getSuppressed();
    java.lang.ArithmeticException var11 = org.apache.commons.math.MathRuntimeException.createArithmeticException("1e410e9b1053e937975a9c0285c901d7872595a836528932b", (java.lang.Object[])var10);
    java.util.NoSuchElementException var12 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("8f5e59aaad", (java.lang.Object[])var10);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    
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
    assertNotNull(var13);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


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
    java.lang.Throwable var28 = null;
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var30 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var31 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var30);
    org.apache.commons.math.ConvergenceException var32 = new org.apache.commons.math.ConvergenceException(var28, var29, var31);
    java.util.ConcurrentModificationException var33 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var9, var31);
    java.lang.Object[] var35 = null;
    java.lang.ArrayIndexOutOfBoundsException var36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("hi!", var35);
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException("hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 1.0d);
    org.apache.commons.math.exception.util.Localizable var46 = var43.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var50 = new org.apache.commons.math.exception.NumberIsTooSmallException(var46, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var51 = null;
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var53 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var54 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var53);
    org.apache.commons.math.ConvergenceException var55 = new org.apache.commons.math.ConvergenceException(var51, var52, var54);
    java.lang.UnsupportedOperationException var56 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var46, var54);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var60 = var59.getArguments();
    org.apache.commons.math.MathException var61 = new org.apache.commons.math.MathException("hi!", var60);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var61, 1.0d);
    org.apache.commons.math.exception.util.Localizable var64 = var61.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var65 = null;
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var68 = var67.getArguments();
    org.apache.commons.math.MathException var69 = new org.apache.commons.math.MathException(var65, var68);
    java.lang.ArithmeticException var70 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var64, var68);
    org.apache.commons.math.exception.util.Localizable var72 = null;
    java.lang.Object[] var74 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var75 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var72, var74);
    java.util.NoSuchElementException var76 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var74);
    java.lang.ArrayIndexOutOfBoundsException var77 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var64, var74);
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var46, var74);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var81 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var80);
    java.lang.Object[] var84 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var85 = new org.apache.commons.math.MathException((java.lang.Throwable)var81, "hi!", var84);
    java.lang.Object[] var86 = var81.getArguments();
    org.apache.commons.math.MathRuntimeException var87 = new org.apache.commons.math.MathRuntimeException(var46, var86);
    java.lang.Object[] var88 = org.apache.commons.math.exception.util.ArgUtils.flatten(var86);
    org.apache.commons.math.MathRuntimeException var89 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var36, var37, var86);
    java.lang.UnsupportedOperationException var90 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var9, var86);
    java.util.NoSuchElementException var91 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("8f5e59aaad", var86);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.4073280885929992d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


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
    java.lang.Number var34 = var32.getArgument();
    
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
    assertTrue("'" + var34 + "' != '" + (-1.4601391056210007d)+ "'", var34.equals((-1.4601391056210007d)));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.8089401865863317d, 0.726808863761001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.726808863761001d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.5119984566736251d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(9.99995459903963d, 0.0067844780309888495d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999954599039627d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(6.798432482298277E248d, 0.4357970587841914d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.756968984170985E108d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.9E-324d, 63);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.758002570922701d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var8 = null;
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException(var8, var11);
    java.lang.ArithmeticException var13 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var7, var11);
    java.lang.Throwable var16 = null;
    double[] var20 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var24 = var23.getArguments();
    org.apache.commons.math.MathException var25 = new org.apache.commons.math.MathException("hi!", var24);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 1.0d);
    org.apache.commons.math.exception.util.Localizable var28 = var25.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var29 = null;
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException(var30, var33);
    java.io.EOFException var35 = org.apache.commons.math.MathRuntimeException.createEOFException(var29, var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var16, var20, var28, var33);
    java.lang.NullPointerException var37 = org.apache.commons.math.MathRuntimeException.createNullPointerException("", var33);
    java.util.NoSuchElementException var38 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("1e410e9b1053e937975a9c0285c901d7872595a836528932b", var33);
    java.lang.NullPointerException var39 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var7, var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var11 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var12 = null;
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var14 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var15 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var14);
    org.apache.commons.math.ConvergenceException var16 = new org.apache.commons.math.ConvergenceException(var12, var13, var15);
    java.lang.UnsupportedOperationException var17 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var7, var15);
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var22 = var21.getArguments();
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
    org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var30 = new org.apache.commons.math.exception.NumberIsTooSmallException(var26, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var31 = null;
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
    org.apache.commons.math.ConvergenceException var35 = new org.apache.commons.math.ConvergenceException(var31, var32, var34);
    java.lang.UnsupportedOperationException var36 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var26, var34);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var40 = var39.getArguments();
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException("hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, 1.0d);
    org.apache.commons.math.exception.util.Localizable var44 = var41.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var45 = null;
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var48 = var47.getArguments();
    org.apache.commons.math.MathException var49 = new org.apache.commons.math.MathException(var45, var48);
    java.lang.ArithmeticException var50 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var44, var48);
    org.apache.commons.math.exception.util.Localizable var52 = null;
    java.lang.Object[] var54 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var55 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var52, var54);
    java.util.NoSuchElementException var56 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var54);
    java.lang.ArrayIndexOutOfBoundsException var57 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var44, var54);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var26, var54);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var61 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var60);
    java.lang.Object[] var64 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var65 = new org.apache.commons.math.MathException((java.lang.Throwable)var61, "hi!", var64);
    java.lang.Object[] var66 = var61.getArguments();
    org.apache.commons.math.MathRuntimeException var67 = new org.apache.commons.math.MathRuntimeException(var26, var66);
    java.lang.RuntimeException var68 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var67);
    org.apache.commons.math.MathRuntimeException var69 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var67);
    java.lang.Object[] var70 = var69.getArguments();
    java.io.EOFException var71 = org.apache.commons.math.MathRuntimeException.createEOFException(var7, var70);
    org.apache.commons.math.exception.NumberIsTooLargeException var75 = new org.apache.commons.math.exception.NumberIsTooLargeException(var7, (java.lang.Number)4.539992976248491E-5d, (java.lang.Number)0.634022184233441d, false);
    java.lang.Number var76 = var75.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + 0.634022184233441d+ "'", var76.equals(0.634022184233441d));

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    java.lang.Object[] var2 = null;
    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "d8b9700ff0", var2);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.2297540179371376d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0713698407192878d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var13 = var12.getArguments();
    org.apache.commons.math.MathException var14 = new org.apache.commons.math.MathException(var10, var13);
    java.lang.ArithmeticException var15 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var9, var13);
    java.lang.IllegalStateException var16 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var13);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException("{0}", var13);
    org.apache.commons.math.exception.util.Localizable var18 = var17.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var23 = var22.getArguments();
    org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException("hi!", var23);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var24, 1.0d);
    org.apache.commons.math.exception.util.Localizable var27 = var24.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var31 = new org.apache.commons.math.exception.NumberIsTooSmallException(var27, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var34 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var33);
    java.lang.Object[] var37 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException((java.lang.Throwable)var34, "hi!", var37);
    java.lang.IllegalArgumentException var39 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var27, var37);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException("hi!", var43);
    java.text.ParseException var45 = org.apache.commons.math.MathRuntimeException.createParseException(0, var27, var43);
    java.lang.Throwable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var48 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var49 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var48);
    org.apache.commons.math.ConvergenceException var50 = new org.apache.commons.math.ConvergenceException(var46, var47, var49);
    java.util.ConcurrentModificationException var51 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var27, var49);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var55 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var54);
    java.lang.Object[] var58 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var59 = new org.apache.commons.math.MathException((java.lang.Throwable)var55, "hi!", var58);
    java.lang.Object[] var60 = var55.getArguments();
    java.lang.Throwable var62 = null;
    double[] var66 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.MathException var71 = new org.apache.commons.math.MathException("hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 1.0d);
    org.apache.commons.math.exception.util.Localizable var74 = var71.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var75 = null;
    org.apache.commons.math.exception.util.Locali