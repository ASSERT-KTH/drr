
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    int var4 = var1.nextZipf(22, 22025.465794806718d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var1.nextHexString(0);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "df");
// 
//   }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     int var4 = var1.nextZipf(22, 22025.465794806718d);
//     double var7 = var1.nextGaussian(0.7420986201408424d, 0.31247220597891073d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var10 = var1.nextGamma((-1.1071487177940904d), 0.0019110998440120797d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.19655942012923544d);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(1.7763568394002505E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7763568394002505E-15d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NEGATIVE_INFINITY, 0.06669381571763945d, 0.0d);
    var3.setStandardDeviation(22025.465794806718d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var3.cumulativeProbability(0.0d);
      fail("Expected exception of type org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException e) {
      // Expected exception.
    }

  }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var7 = var0.nextSecureLong((-9L), (-3L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var10 = var0.nextGamma(1.7031839360032603E-108d, 0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.4444640293706468d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-9L));
// 
//   }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "31");
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.0E-323d, 0.4509236637393617d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0E-323d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
    var3.reseedRandomGenerator((-4L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.6887056219457095d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    long var2 = org.apache.commons.math.util.FastMath.max(3L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.3235908786085069d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.318194232288568d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    java.lang.Throwable var3 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var5 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.ConvergenceException var7 = new org.apache.commons.math.ConvergenceException(var3, var4, var6);
    java.lang.Throwable[] var8 = var7.getSuppressed();
    java.lang.ArithmeticException var9 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var8);
    java.lang.Object[] var10 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var8);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "8cc321d302fc30370a946a406ad470305b78fe9b24e1dc707", (java.lang.Object[])var8);
    
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

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     double var6 = var1.nextF(0.4477507568008571d, 1.0176062821250957d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var9 = var1.nextPascal(16, (-0.4017802381159433d));
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
//     assertTrue(var6 == 83.14356551250397d);
// 
//   }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-0.5851183155514169d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.MathException var2 = new org.apache.commons.math.MathException("", var1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(2.0E-323d, (-1.4722421297031818d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, (-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


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
    org.apache.commons.math.exception.NumberIsTooLargeException var25 = new org.apache.commons.math.exception.NumberIsTooLargeException(var9, (java.lang.Number)63, (java.lang.Number)1, true);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var29 = var28.getArguments();
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException("hi!", var29);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var30, 1.0d);
    org.apache.commons.math.exception.util.Localizable var33 = var30.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var37 = new org.apache.commons.math.exception.NumberIsTooSmallException(var33, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
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
    java.lang.NullPointerException var58 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var33, var55);
    java.lang.ArrayIndexOutOfBoundsException var59 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var9, var55);
    java.text.ParseException var60 = org.apache.commons.math.MathRuntimeException.createParseException((-1), "5b06eb1a62", var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    double var7 = var3.normalApproximateProbability(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var3.cumulativeProbability(1.8579322851097537d, (-0.16306402964332198d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    java.lang.Throwable var2 = null;
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var8 = var7.getArguments();
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException("hi!", var8);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 1.0d);
    org.apache.commons.math.exception.util.Localizable var12 = var9.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var16 = var15.getArguments();
    org.apache.commons.math.MathException var17 = new org.apache.commons.math.MathException(var13, var16);
    java.lang.ArithmeticException var18 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var12, var16);
    java.lang.IllegalStateException var19 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var16);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException("{0}", var16);
    org.apache.commons.math.exception.util.Localizable var21 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var25 = new org.apache.commons.math.exception.NumberIsTooSmallException(var21, (java.lang.Number)0.06595940771553593d, (java.lang.Number)1.044193245253925d, true);
    java.lang.Throwable var29 = null;
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var31 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var32 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var31);
    org.apache.commons.math.ConvergenceException var33 = new org.apache.commons.math.ConvergenceException(var29, var30, var32);
    java.lang.Throwable[] var34 = var33.getSuppressed();
    java.text.ParseException var35 = org.apache.commons.math.MathRuntimeException.createParseException(0, "85", (java.lang.Object[])var34);
    java.io.EOFException var36 = org.apache.commons.math.MathRuntimeException.createEOFException("5f30dfc3a2", (java.lang.Object[])var34);
    org.apache.commons.math.ConvergenceException var37 = new org.apache.commons.math.ConvergenceException(var2, var21, (java.lang.Object[])var34);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(0.028286235440123958d, "", (java.lang.Object[])var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed();
//     double var11 = var0.nextChiSquare(0.5758919188377781d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextZipf(99, (-0.0d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 7.161668825402727E-6d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "cdf249431806a995b4e1676340ed6ba44f202c759a89eb598"+ "'", var8.equals("cdf249431806a995b4e1676340ed6ba44f202c759a89eb598"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.04139902339869949d);
// 
//   }

  public void test24() {}
//   public void test24() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     java.lang.String var6 = var0.nextSecureHexString(10);
//     org.apache.commons.math.distribution.NormalDistributionImpl var9 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.01572968903404401d);
//     double var11 = var9.density((java.lang.Double)0.9065338654042625d);
//     double var12 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var9);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("00d832ae8e", "18b6392965");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "903df339e7"+ "'", var6.equals("903df339e7"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 5.362814066972317E-4d);
// 
//   }

  public void test25() {}
//   public void test25() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.190537109001971d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    int var2 = org.apache.commons.math.util.FastMath.max(100, 85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1L), (-6L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


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
    java.lang.Object[] var60 = null;
    org.apache.commons.math.ConvergenceException var61 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var36, var53, var60);
    java.lang.Throwable var62 = null;
    org.apache.commons.math.exception.util.Localizable var63 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var64 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var65 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var64);
    org.apache.commons.math.ConvergenceException var66 = new org.apache.commons.math.ConvergenceException(var62, var63, var65);
    java.lang.ArrayIndexOutOfBoundsException var67 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var53, var65);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var70 = var69.getArguments();
    java.io.EOFException var71 = org.apache.commons.math.MathRuntimeException.createEOFException(var53, var70);
    org.apache.commons.math.exception.util.Localizable var72 = null;
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var75 = var74.getArguments();
    org.apache.commons.math.MathException var76 = new org.apache.commons.math.MathException(var72, var75);
    java.lang.ArithmeticException var77 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var53, var75);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    double var4 = var3.getMean();
    double var6 = var3.cumulativeProbability(31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.9999999827462527d);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var7 = var0.nextSecureLong((-9L), (-3L));
//     double var9 = var0.nextT(1.1612894529345956d);
//     double var12 = var0.nextUniform(0.015730986458679944d, 1.3347592604095586d);
//     double var14 = var0.nextChiSquare(5.438972977369899d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.4762194053814269d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-6L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-0.3822879225194127d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.38888021512768045d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 3.192301187461802d);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    long var2 = org.apache.commons.math.util.FastMath.max(2L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var7 = var0.cumulativeProbability(2.5537875429729695d);
    double var8 = var0.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.9946720873046331d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.016854941772256608d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.6502464941895341d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException((-0.7351210460373782d));

  }

  public void test36() {}
//   public void test36() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     int var4 = var1.nextBinomial(88, 0.01572968903404401d);
//     double var7 = var1.nextGaussian(0.12463066724728189d, 0.8694923984335489d);
//     var1.reSeed((-1L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setSecureAlgorithm("", "8cc321d302fc30370a946a406ad470305b78fe9b24e1dc707");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1.309233750484007d));
// 
//   }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }
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
//     var1.reSeedSecure(0L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setSecureAlgorithm("9b0551cbbfb903f5d9126caa7d2971323273d581d59418c1f", "00d832ae8e");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.9280753110165308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-0.2345156488841585d));
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

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.456383932825396d, 1.1249004052314096d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var4 = var2.density(0.7491987728881979d);
    double var5 = var2.sample();
    double var6 = var2.sample();
    double var7 = var2.sample();
    double var8 = var2.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var2.cumulativeProbability(2.2095932434250263d, (-0.005107396213390728d));
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
    assertTrue(var7 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 6.798432482298277E248d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var9 = var1.nextCauchy(1.7453292519943295d, 0.006987206244798594d);
    int[] var12 = var1.nextPermutation(150, 10);
    var1.reSeedSecure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.737913715527783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)0.548862257995288d, (java.lang.Number)22L, false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.5119984566736251d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5119984566736251d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.4011237653239909d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3809100886728186d);

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var1 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var2 = var1.sample();
//     var1.reseedRandomGenerator(1L);
//     var1.setMean(0.0d);
//     double[] var8 = var1.sample(1);
//     org.apache.commons.math.exception.util.Localizable var10 = null;
//     org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var13 = var12.getArguments();
//     org.apache.commons.math.MathException var14 = new org.apache.commons.math.MathException(var10, var13);
//     org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var8, "{0}", var13);
//     org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var20 = var19.getArguments();
//     org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException("hi!", var20);
//     org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var24 = var21.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var28 = new org.apache.commons.math.exception.NumberIsTooSmallException(var24, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var31 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var30);
//     java.lang.Object[] var34 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException((java.lang.Throwable)var31, "hi!", var34);
//     java.lang.IllegalArgumentException var36 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var24, var34);
//     org.apache.commons.math.exception.NotStrictlyPositiveException var38 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var24, (java.lang.Number)572.9577951308231d);
//     org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var41 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var40);
//     java.lang.Object[] var44 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var45 = new org.apache.commons.math.MathException((java.lang.Throwable)var41, "hi!", var44);
//     org.apache.commons.math.ConvergenceException var46 = new org.apache.commons.math.ConvergenceException(var24, var44);
//     org.apache.commons.math.exception.util.Localizable var47 = null;
//     org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var50 = var49.getArguments();
//     org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException(var47, var50);
//     org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var15, 0.0d, var24, var50);
//     org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var58 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var57);
//     java.lang.Object[] var61 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var62 = new org.apache.commons.math.MathException((java.lang.Throwable)var58, "hi!", var61);
//     java.lang.Object[] var63 = var58.getArguments();
//     java.lang.Throwable var65 = null;
//     double[] var69 = new double[] { (-1.0d), 100.0d, 10.0d};
//     org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var73 = var72.getArguments();
//     org.apache.commons.math.MathException var74 = new org.apache.commons.math.MathException("hi!", var73);
//     org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var74, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var77 = var74.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var78 = null;
//     org.apache.commons.math.exception.util.Localizable var79 = null;
//     org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var82 = var81.getArguments();
//     org.apache.commons.math.MathException var83 = new org.apache.commons.math.MathException(var79, var82);
//     java.io.EOFException var84 = org.apache.commons.math.MathRuntimeException.createEOFException(var78, var82);
//     org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException(var65, var69, var77, var82);
//     org.apache.commons.math.MathRuntimeException var86 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var58, "", var82);
//     org.apache.commons.math.MathException var87 = new org.apache.commons.math.MathException("hi!", var82);
//     org.apache.commons.math.MathRuntimeException var88 = new org.apache.commons.math.MathRuntimeException("ccfe1a8af9", var82);
//     org.apache.commons.math.MathException var89 = new org.apache.commons.math.MathException("8f5e59aaad", var82);
//     java.text.ParseException var90 = org.apache.commons.math.MathRuntimeException.createParseException(64, var24, var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-1.735195022949358d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var13);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var63);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var77);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var82);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var84);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var90);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.17448354460005314d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1753812425619401d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.7737371454186037d, 100.0d, 10);
    double var5 = var3.cumulativeProbability(0);
    double var8 = var3.cumulativeProbability(0.4357970587841914d, 1.6194048662911045d);
    int var10 = var3.inverseCumulativeProbability(0.12902891467721883d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var3.cumulativeProbability(1.737913715527783d, 0.36346840928253865d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.6990010320793059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.034052442853895304d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.021597605164724493d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.27848503719129425d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.40956171022959337d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5061575069989133d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.10455778408124614d, 0.006987206244798594d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.10455778408124614d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.6776215619079137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5899709858745067d);

  }

  public void test52() {}
//   public void test52() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(2.4347072887644785d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    int var2 = org.apache.commons.math.util.FastMath.max(12, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 12);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


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
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var20 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var17, var19);
    java.util.NoSuchElementException var21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var19);
    java.lang.ArrayIndexOutOfBoundsException var22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var9, var19);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var34 = new org.apache.commons.math.exception.NumberIsTooSmallException(var30, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var37 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var36);
    java.lang.Object[] var40 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException((java.lang.Throwable)var37, "hi!", var40);
    java.lang.IllegalArgumentException var42 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var30, var40);
    java.lang.UnsupportedOperationException var43 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var9, var40);
    org.apache.commons.math.MaxIterationsExceededException var44 = new org.apache.commons.math.MaxIterationsExceededException(28, "18b6392965", var40);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 0.0d);
    java.lang.Object[] var47 = var46.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9832676487980728d, 0.39685633693572103d, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var3.cumulativeProbability(0.24002464887605032d, 1.2214066090250377d);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6938347821034475d, 0.7853981633974483d, 33);
    int[] var5 = var3.sample(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    java.lang.ArithmeticException var5 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var3);
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
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 0.0d, "", var33);
    java.lang.IllegalStateException var38 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("org.apache.commons.math.MathRuntimeException$6: hi!", var33);
    java.lang.IllegalStateException var39 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("be8fe77e0a6ac99277e0a0043e75105d24549fadbf19de3db", var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.21780540111532407d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var1.cumulativeProbability(59, 6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException("4293dd4c36b3d0b4752e0fcd282b74d98e05565360c7985317109a554a5fad60ec6fb891a2c174e9816b73b5d443f4fdaf9", var1);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed();
//     int var12 = var0.nextInt(8, 33);
//     var0.reSeed(22L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var17 = var0.nextGamma(0.41296333710562166d, (-0.08383632234371619d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.0015574636732078523d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "598025c76929142beeefc08eb0e7fa60f89eb3ed8ec85d0ee"+ "'", var8.equals("598025c76929142beeefc08eb0e7fa60f89eb3ed8ec85d0ee"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 16);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    int[] var6 = var1.nextPermutation(49, 1);
    double var8 = var1.nextExponential(0.017453292519913222d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var1.nextHypergeometric(2, 150, 96);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.024868913495755676d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.00816946263772182d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.008169553512270262d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.3343928982388156d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3970919507216666d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.861568512255232d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(56.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.71841914237288d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.010057760463763889d, 0.0d, 0.5061575069989132d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0513699053569932d, (java.lang.Number)Double.NaN, true);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.0513699053569932d+ "'", var4.equals(1.0513699053569932d));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(10);
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
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException("hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 1.0d);
    org.apache.commons.math.exception.util.Localizable var31 = var28.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var35 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var36 = null;
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var38 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var39 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var38);
    org.apache.commons.math.ConvergenceException var40 = new org.apache.commons.math.ConvergenceException(var36, var37, var39);
    java.lang.UnsupportedOperationException var41 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var31, var39);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException("hi!", var45);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var46, 1.0d);
    org.apache.commons.math.exception.util.Localizable var49 = var46.getLocalizablePattern();
    java.lang.Throwable[] var50 = var46.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var31, (java.lang.Object[])var50);
    org.apache.commons.math.exception.NumberIsTooSmallException var55 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException("hi!", var59);
    org.apache.commons.math.MathException var61 = new org.apache.commons.math.MathException((java.lang.Throwable)var60);
    java.lang.Throwable[] var62 = var61.getSuppressed();
    org.apache.commons.math.MaxIterationsExceededException var63 = new org.apache.commons.math.MaxIterationsExceededException(22, var31, (java.lang.Object[])var62);
    java.lang.Object[] var64 = var63.getArguments();
    org.apache.commons.math.MathRuntimeException var65 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1, var9, var64);
    java.lang.Object[] var66 = null;
    org.apache.commons.math.MathException var67 = new org.apache.commons.math.MathException(var9, var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)38, (java.lang.Number)2.4347072887644785d, false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-0.005120483541896959d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.00513363814223864d));

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }
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
//     double var17 = var1.nextExponential(0.05154456169528097d);
//     double var20 = var1.nextGamma(1.0014954673259773d, 0.46565617929080083d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var23 = var1.nextF(0.0d, 0.43579705878419134d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.008842589840149486d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.5814654745012883d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1.7606960622238579d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 5.102836047816573d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.021571930340896613d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 0.4190978773371951d);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.0d, (-0.48242732237890296d), 13);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    int var5 = var3.inverseCumulativeProbability(0.7491987728881979d);
    var3.reseedRandomGenerator(0L);
    double var9 = var3.cumulativeProbability(0.07044902378763229d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4.539992976248491E-5d);

  }

  public void test74() {}
//   public void test74() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var3 = var2.sample();
//     var2.reseedRandomGenerator(1L);
//     var2.setMean(0.0d);
//     double[] var9 = var2.sample(1);
//     org.apache.commons.math.exception.util.Localizable var11 = null;
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var14 = var13.getArguments();
//     org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException(var11, var14);
//     org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var9, "{0}", var14);
//     double[] var17 = var16.getArgument();
//     org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var22 = var21.getArguments();
//     org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException("hi!", var22);
//     org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var26 = var23.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var30 = new org.apache.commons.math.exception.NumberIsTooSmallException(var26, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     java.lang.Throwable var31 = null;
//     org.apache.commons.math.exception.util.Localizable var32 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
//     org.apache.commons.math.ConvergenceException var35 = new org.apache.commons.math.ConvergenceException(var31, var32, var34);
//     java.lang.UnsupportedOperationException var36 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var26, var34);
//     org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var40 = var39.getArguments();
//     org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException("hi!", var40);
//     org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var44 = var41.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var45 = null;
//     org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var48 = var47.getArguments();
//     org.apache.commons.math.MathException var49 = new org.apache.commons.math.MathException(var45, var48);
//     java.lang.ArithmeticException var50 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var44, var48);
//     org.apache.commons.math.exception.util.Localizable var52 = null;
//     java.lang.Object[] var54 = new java.lang.Object[] { 9.999999999999998d};
//     java.lang.UnsupportedOperationException var55 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var52, var54);
//     java.util.NoSuchElementException var56 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var54);
//     java.lang.ArrayIndexOutOfBoundsException var57 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var44, var54);
//     org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var26, var54);
//     java.lang.Object[] var59 = null;
//     org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var17, var26, var59);
//     java.lang.Object[] var61 = new java.lang.Object[] { var59};
//     org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(0.09708159647614563d, "4293dd4c36b3d0b4752e0fcd282b74d98e05565360c7985317109a554a5fad60ec6fb891a2c174e9816b73b5d443f4fdaf9", var59);
//     java.io.IOException var63 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-1.4051142204394742d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var34);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var36);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var44);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var48);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var50);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var54);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var55);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var56);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var63);
// 
//   }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 0.5119984566736251d);
    double var4 = var2.probability(33);
    var2.reseedRandomGenerator(2L);
    double var8 = var2.normalApproximateProbability(59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6.895236855929124E-39d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     int var6 = var0.nextInt(0, 8);
//     var0.reSeedSecure();
//     double var10 = var0.nextWeibull(0.12601204934874258d, 0.379543672011928d);
//     int var13 = var0.nextPascal(1, 0.05465537715455142d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var0.nextZipf(0, (-2.2197287551515004d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.3005887631460408d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 6);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 52.022005067265326d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 3);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(6.895236855929124E-39d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-1.964530719994223d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-112.55931897946587d));

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     double var8 = var0.nextBeta(1.0513699053569932d, 1.0099010138502609d);
//     double var11 = var0.nextCauchy(1.5574077246549023d, 0.9748945791087863d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var15 = var0.nextHypergeometric(100, 122, 2888);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.3391623330577973d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.8894784629042896d);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, "hi!", var18);
    java.lang.IllegalArgumentException var20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var8, var18);
    org.apache.commons.math.exception.NotStrictlyPositiveException var22 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var8, (java.lang.Number)572.9577951308231d);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var25 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var24);
    java.lang.Object[] var28 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException((java.lang.Throwable)var25, "hi!", var28);
    org.apache.commons.math.ConvergenceException var30 = new org.apache.commons.math.ConvergenceException(var8, var28);
    org.apache.commons.math.MathException var31 = new org.apache.commons.math.MathException("45e781d3b5889b57c", var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test82() {}
//   public void test82() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed();
//     int var12 = var0.nextInt(8, 33);
//     org.apache.commons.math.random.RandomDataImpl var13 = new org.apache.commons.math.random.RandomDataImpl();
//     var13.reSeedSecure();
//     long var17 = var13.nextLong((-9L), 1L);
//     java.lang.String var19 = var13.nextSecureHexString(10);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var21 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var22 = var21.sample();
//     int var23 = var13.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var21);
//     int var24 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var21);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("27f6d8a04be5ddf5a087fb11aa4e98b886e812c3445ccd832", "2eb9d85315f2dae4f4e483ea45fda7fc800d0d4b525bbe156");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.0032927560369469095d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "33f253f9ee5097fe86385bc9981f4fe823d1538693fa2b62d"+ "'", var8.equals("33f253f9ee5097fe86385bc9981f4fe823d1538693fa2b62d"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var19 + "' != '" + "0299fb5aee"+ "'", var19.equals("0299fb5aee"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 2);
// 
//   }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-2.1874820303161426d), (-0.2531501296211728d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.2531501296211728d));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


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
    org.apache.commons.math.exception.util.Localizable var30 = null;
    java.lang.Number var34 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var36 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.0f, var34, true);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException("hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 1.0d);
    org.apache.commons.math.exception.util.Localizable var46 = var43.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException("hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, 1.0d);
    org.apache.commons.math.exception.util.Localizable var54 = var51.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var58 = new org.apache.commons.math.exception.NumberIsTooSmallException(var54, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var61 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var60);
    java.lang.Object[] var64 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var65 = new org.apache.commons.math.MathException((java.lang.Throwable)var61, "hi!", var64);
    java.lang.IllegalArgumentException var66 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var54, var64);
    java.lang.IllegalStateException var67 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var46, var64);
    java.lang.IllegalStateException var68 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var64);
    org.apache.commons.math.MathRuntimeException var69 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var36, "", var64);
    org.apache.commons.math.MaxIterationsExceededException var70 = new org.apache.commons.math.MaxIterationsExceededException((-1), "85", var64);
    java.util.ConcurrentModificationException var71 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var30, var64);
    org.apache.commons.math.MathException var72 = new org.apache.commons.math.MathException((java.lang.Throwable)var28, "", var64);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.41884580536897137d, 1.7737371454186037d, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var3.cumulativeProbability(60);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


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
    java.util.NoSuchElementException var49 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("6c8b540bbdf53666952550e4f8009554e071c65f5b1f40067", var46);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.03989157201897057d, (-1.0d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)0.8694923984335489d, true);

  }

  public void test89() {}
//   public void test89() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed();
//     double var12 = var0.nextCauchy(0.01572968903404401d, 572.9577951308231d);
//     int var15 = var0.nextInt(35, 60);
//     int var18 = var0.nextBinomial(52, 0.548862257995288d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.01502480391122093d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "519519ea7a81bb8ec54c9e55fd740b89b3238a7ceb36df8b3"+ "'", var8.equals("519519ea7a81bb8ec54c9e55fd740b89b3238a7ceb36df8b3"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-327.33997206929064d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 28);
// 
//   }

  public void test90() {}
//   public void test90() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     int var7 = var1.nextBinomial(22, 0.054682624982037784d);
//     int var10 = var1.nextSecureInt(3, 8);
//     var1.reSeedSecure((-5L));
//     org.apache.commons.math.distribution.NormalDistributionImpl var15 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0923273093116304d, 0.01530074222187635d);
//     double var16 = var1.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var15);
//     org.apache.commons.math.distribution.ContinuousDistribution var17 = null;
//     double var18 = var1.nextInversionDeviate(var17);
// 
//   }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.21780540111532407d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.21780540111532407d);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.17654799900690976d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1774665725949453d));

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    double var2 = var0.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.inverseCumulativeProbability((-8.999999999999998d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var5 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, var4, (java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var12 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var11);
    java.lang.Object[] var15 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var16 = new org.apache.commons.math.MathException((java.lang.Throwable)var12, "hi!", var15);
    java.lang.IllegalStateException var17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var15);
    double[] var19 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var21 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var22 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var21);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, var20, (java.lang.Object[])var21);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException("hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 1.0d);
    org.apache.commons.math.exception.util.Localizable var31 = var28.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var35 = var34.getArguments();
    org.apache.commons.math.MathException var36 = new org.apache.commons.math.MathException(var32, var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var17, var19, var31, var35);
    org.apache.commons.math.ConvergenceException var38 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var7, "", var35);
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.exception.util.Localizable var41 = null;
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var44 = var43.getArguments();
    org.apache.commons.math.MathException var45 = new org.apache.commons.math.MathException(var41, var44);
    java.io.EOFException var46 = org.apache.commons.math.MathRuntimeException.createEOFException(var40, var44);
    org.apache.commons.math.MathException var47 = new org.apache.commons.math.MathException((java.lang.Throwable)var38, "hi!", var44);
    java.util.NoSuchElementException var48 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("85", var44);
    org.apache.commons.math.ConvergenceException var49 = new org.apache.commons.math.ConvergenceException("cd43ba15e0", var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.05154456169528096d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05159025884265102d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


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
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var20 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var17, var19);
    java.util.NoSuchElementException var21 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var19);
    java.lang.ArrayIndexOutOfBoundsException var22 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var9, var19);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var34 = new org.apache.commons.math.exception.NumberIsTooSmallException(var30, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var35 = null;
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var37 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var38 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var37);
    org.apache.commons.math.ConvergenceException var39 = new org.apache.commons.math.ConvergenceException(var35, var36, var38);
    java.lang.UnsupportedOperationException var40 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var30, var38);
    org.apache.commons.math.MaxIterationsExceededException var41 = new org.apache.commons.math.MaxIterationsExceededException(8, var9, var38);
    java.lang.IllegalArgumentException var42 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("4293dd4c36b3d0b4752e0fcd282b74d98e05565360c7985317109a554a5fad60ec6fb891a2c174e9816b73b5d443f4fdaf9", var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.3628159327419405d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.36281593274194057d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.8960770045870032d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, "hi!", var18);
    java.lang.IllegalArgumentException var20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var8, var18);
    org.apache.commons.math.exception.NotStrictlyPositiveException var22 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var8, (java.lang.Number)572.9577951308231d);
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException(var23, var26);
    java.lang.Throwable var30 = null;
    double[] var34 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var38 = var37.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("hi!", var38);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, 1.0d);
    org.apache.commons.math.exception.util.Localizable var42 = var39.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var43 = null;
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException(var44, var47);
    java.io.EOFException var49 = org.apache.commons.math.MathRuntimeException.createEOFException(var43, var47);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(var30, var34, var42, var47);
    java.lang.NullPointerException var51 = org.apache.commons.math.MathRuntimeException.createNullPointerException("", var47);
    org.apache.commons.math.ConvergenceException var52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var27, "", var47);
    java.lang.NullPointerException var53 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var8, var47);
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
    java.lang.Object[] var68 = null;
    java.lang.IllegalArgumentException var69 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var61, var68);
    java.lang.Throwable var71 = null;
    org.apache.commons.math.exception.util.Localizable var72 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var73 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var74 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var73);
    org.apache.commons.math.ConvergenceException var75 = new org.apache.commons.math.ConvergenceException(var71, var72, var74);
    java.lang.Throwable[] var76 = var75.getSuppressed();
    java.lang.ArithmeticException var77 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var76);
    java.lang.Object[] var78 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var76);
    java.lang.NullPointerException var79 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var61, (java.lang.Object[])var76);
    java.lang.Object[] var80 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var76);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException((-0.2925253621696275d), var8, (java.lang.Object[])var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.02251923747679899d, 52.55840838798297d, 2);
    double var5 = var3.probability(641.1962127946947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.8862636038898793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10L);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl((-0.8085359190707371d), (-0.7351210460373782d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.6233269224174744d, 0.4363419036467123d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }


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
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var31 = var30.getArguments();
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException("hi!", var31);
    java.text.ParseException var33 = org.apache.commons.math.MathRuntimeException.createParseException(0, var9, var31);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var38 = var37.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("hi!", var38);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, 1.0d);
    org.apache.commons.math.exception.util.Localizable var42 = var39.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var46 = new org.apache.commons.math.exception.NumberIsTooSmallException(var42, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var47 = null;
    org.apache.commons.math.exception.util.Localizable var48 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var49 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var50 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var49);
    org.apache.commons.math.ConvergenceException var51 = new org.apache.commons.math.ConvergenceException(var47, var48, var50);
    java.lang.UnsupportedOperationException var52 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var42, var50);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var56 = var55.getArguments();
    org.apache.commons.math.MathException var57 = new org.apache.commons.math.MathException("hi!", var56);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var57, 1.0d);
    org.apache.commons.math.exception.util.Localizable var60 = var57.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var61 = null;
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var64 = var63.getArguments();
    org.apache.commons.math.MathException var65 = new org.apache.commons.math.MathException(var61, var64);
    java.lang.ArithmeticException var66 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var60, var64);
    org.apache.commons.math.exception.util.Localizable var68 = null;
    java.lang.Object[] var70 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var71 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var68, var70);
    java.util.NoSuchElementException var72 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var70);
    java.lang.ArrayIndexOutOfBoundsException var73 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var60, var70);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var42, var70);
    java.lang.Throwable var75 = null;
    org.apache.commons.math.FunctionEvaluationException var79 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var80 = var79.getArguments();
    org.apache.commons.math.MathException var81 = new org.apache.commons.math.MathException("hi!", var80);
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var81, 1.0d);
    org.apache.commons.math.exception.util.Localizable var84 = var81.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var88 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var87);
    java.lang.Object[] var91 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var92 = new org.apache.commons.math.MathException((java.lang.Throwable)var88, "hi!", var91);
    java.lang.IllegalStateException var93 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var91);
    org.apache.commons.math.FunctionEvaluationException var94 = new org.apache.commons.math.FunctionEvaluationException(var75, 100.0d, var84, var91);
    java.lang.UnsupportedOperationException var95 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var42, var91);
    java.lang.ArithmeticException var96 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var9, var91);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    var0.reseedRandomGenerator(0L);
    double var9 = var0.cumulativeProbability((-1.4601391056210007d));
    double[] var11 = var0.sample(3);
    double var13 = var0.density(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.07212592349390606d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.3989422804014327d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(byte)10, (java.lang.Number)10L, true);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var8 = var7.getArguments();
    org.apache.commons.math.MathException var9 = new org.apache.commons.math.MathException("hi!", var8);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 1.0d);
    org.apache.commons.math.exception.util.Localizable var12 = var9.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var16 = new org.apache.commons.math.exception.NumberIsTooSmallException(var12, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var17 = null;
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var19 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var20 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var19);
    org.apache.commons.math.ConvergenceException var21 = new org.apache.commons.math.ConvergenceException(var17, var18, var20);
    java.lang.UnsupportedOperationException var22 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var12, var20);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 1.0d);
    org.apache.commons.math.exception.util.Localizable var30 = var27.getLocalizablePattern();
    java.lang.Throwable[] var31 = var27.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var12, (java.lang.Object[])var31);
    org.apache.commons.math.exception.NumberIsTooSmallException var36 = new org.apache.commons.math.exception.NumberIsTooSmallException(var12, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    java.lang.Object[] var37 = null;
    java.lang.IllegalArgumentException var38 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var12, var37);
    java.lang.Object[] var39 = null;
    org.apache.commons.math.MathRuntimeException var40 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3, var12, var39);
    org.apache.commons.math.exception.NotStrictlyPositiveException var42 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var12, (java.lang.Number)1.2186961367900524d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.36429708573896125d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.1790391095949957d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(4.65212082559966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7320308420884176d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.0226696292004174E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0226696292004175E-7d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var2 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    java.lang.Object[] var5 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException((java.lang.Throwable)var2, "hi!", var5);
    java.lang.Object[] var7 = var2.getArguments();
    java.lang.Throwable var9 = null;
    double[] var13 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var17 = var16.getArguments();
    org.apache.commons.math.MathException var18 = new org.apache.commons.math.MathException("hi!", var17);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, 1.0d);
    org.apache.commons.math.exception.util.Localizable var21 = var18.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var22 = null;
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException(var23, var26);
    java.io.EOFException var28 = org.apache.commons.math.MathRuntimeException.createEOFException(var22, var26);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var9, var13, var21, var26);
    org.apache.commons.math.MathRuntimeException var30 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var2, "", var26);
    java.lang.String var31 = var30.getPattern();
    java.lang.RuntimeException var32 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.5217169378831249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.009105678329483264d);

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "be8fe77e0a6ac99277e0a0043e75105d24549fadbf19de3db");
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(15.757127271808354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999999999999588d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0003504153929477d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7192345231638035d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.8084725010809981d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8994694125526296d);

  }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.0428007199335982d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.8994694125526296d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8994694125526296d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.3483300301110437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7126458698461752d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)0.0d, (java.lang.Number)(byte)10, true);
    java.lang.Number var5 = var4.getArgument();
    org.apache.commons.math.ConvergenceException var6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.0d+ "'", var5.equals(0.0d));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.5131050984584545d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5131050984584545d);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     org.apache.commons.math.distribution.NormalDistributionImpl var5 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
//     double var6 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var5);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextUniform(0.7823383776692152d, 0.2589118643143409d);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.9662062439493844d);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.4425146763337846d, 0.01572968903404401d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.44251467633378455d);

  }

  public void test127() {}
//   public void test127() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.9748741287442365d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    int[] var6 = var1.nextPermutation(49, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var1.nextWeibull(1.7390194376383311E-6d, (-1.8863791002536638d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5729.5779513082325d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.09988668658869368d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.10504569448373412d);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, "hi!", var18);
    java.lang.IllegalArgumentException var20 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var8, var18);
    org.apache.commons.math.exception.util.LocalizedFormats[] var22 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var23 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var22);
    java.lang.ArithmeticException var24 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var22);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var30 = var29.getArguments();
    org.apache.commons.math.MathException var31 = new org.apache.commons.math.MathException("hi!", var30);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, 1.0d);
    org.apache.commons.math.exception.util.Localizable var34 = var31.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var38 = var37.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("hi!", var38);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, 1.0d);
    org.apache.commons.math.exception.util.Localizable var42 = var39.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var46 = new org.apache.commons.math.exception.NumberIsTooSmallException(var42, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var49 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var48);
    java.lang.Object[] var52 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var53 = new org.apache.commons.math.MathException((java.lang.Throwable)var49, "hi!", var52);
    java.lang.IllegalArgumentException var54 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var42, var52);
    java.lang.IllegalStateException var55 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var34, var52);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var24, 0.0d, "", var52);
    org.apache.commons.math.MaxIterationsExceededException var57 = new org.apache.commons.math.MaxIterationsExceededException(0, var8, var52);
    org.apache.commons.math.exception.NumberIsTooSmallException var61 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.012199869484622393d, (java.lang.Number)1.237709308178573d, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     double var6 = var0.nextChiSquare(0.6246292191371761d);
//     java.lang.String var8 = var0.nextHexString(49);
//     var0.reSeed((-9L));
//     java.lang.String var12 = var0.nextHexString(47);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var0.nextHypergeometric(47, 21, 150);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-6L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 8.488081607057881E-4d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "4f42effdd5a1351e32919505a14fb652b23561af2477b5900"+ "'", var8.equals("4f42effdd5a1351e32919505a14fb652b23561af2477b5900"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var12 + "' != '" + "9ae488c543450cc9ed886a27813927a3b7c6069919f5074"+ "'", var12.equals("9ae488c543450cc9ed886a27813927a3b7c6069919f5074"));
// 
//   }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }
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
//     double[] var14 = var6.sample(7);
//     double var15 = var6.getMean();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.005692787817124211d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.26788411157398534d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-1.288611824804826d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0.0d);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9173172759781082d, 1.2261911708835171d, 2.061280873685841E-48d);
    var3.reseedRandomGenerator(2L);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.17841737207110217d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9841257977509622d);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.2032794589395281d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8346521766974887d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.6539215947529802d);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.5669910619864593d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 32.48619487346456d);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     org.apache.commons.math.distribution.NormalDistributionImpl var6 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
//     var6.reseedRandomGenerator((-1L));
//     double var10 = var6.density(0.073638122295604d);
//     double var13 = var6.cumulativeProbability(0.010057760463763889d, 1.0038848218538872d);
//     double var14 = var1.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var6);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var17 = var1.nextPascal(0, (-2.765277862419256d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0.3149413275154456d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0.4522551201914006d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-0.839301782467301d));
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var9 = var1.nextCauchy(1.7453292519943295d, 0.006987206244798594d);
    int[] var12 = var1.nextPermutation(150, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var1.nextSecureInt(32, 10);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.737913715527783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.38888021512768045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.4101841516826948d));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0d, var1, false);
    java.lang.Number var4 = var3.getArgument();
    java.lang.Number var5 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.0d+ "'", var4.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    double[] var5 = var3.getArgument();
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var9 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var8);
    java.lang.Object[] var12 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException((java.lang.Throwable)var9, "hi!", var12);
    java.lang.Object[] var14 = var9.getArguments();
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var19);
    java.lang.Object[] var23 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException((java.lang.Throwable)var20, "hi!", var23);
    java.lang.IllegalStateException var25 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var23);
    double[] var27 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var29 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var30 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var29);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(var27, var28, (java.lang.Object[])var29);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var35 = var34.getArguments();
    org.apache.commons.math.MathException var36 = new org.apache.commons.math.MathException("hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, 1.0d);
    org.apache.commons.math.exception.util.Localizable var39 = var36.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var40 = null;
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException(var40, var43);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, var27, var39, var43);
    java.lang.Object[] var46 = null;
    org.apache.commons.math.MathException var47 = new org.apache.commons.math.MathException((java.lang.Throwable)var16, var39, var46);
    org.apache.commons.math.exception.NumberIsTooLargeException var51 = new org.apache.commons.math.exception.NumberIsTooLargeException(var39, (java.lang.Number)(short)1, (java.lang.Number)(short)10, false);
    org.apache.commons.math.distribution.NormalDistributionImpl var52 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var53 = var52.getStandardDeviation();
    var52.reseedRandomGenerator(100L);
    double[] var57 = var52.sample(3);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, var57);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, var57);
    org.apache.commons.math.exception.util.Localizable var60 = var9.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var66 = var65.getArguments();
    org.apache.commons.math.MathException var67 = new org.apache.commons.math.MathException("hi!", var66);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var67, 1.0d);
    org.apache.commons.math.exception.util.Localizable var70 = var67.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var74 = new org.apache.commons.math.exception.NumberIsTooSmallException(var70, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var77 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var76);
    java.lang.Object[] var80 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var81 = new org.apache.commons.math.MathException((java.lang.Throwable)var77, "hi!", var80);
    java.lang.IllegalArgumentException var82 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var70, var80);
    org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var86 = var85.getArguments();
    org.apache.commons.math.MathException var87 = new org.apache.commons.math.MathException("hi!", var86);
    java.text.ParseException var88 = org.apache.commons.math.MathRuntimeException.createParseException(0, var70, var86);
    org.apache.commons.math.exception.util.LocalizedFormats[] var92 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var93 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var92);
    java.lang.IllegalStateException var94 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var92);
    org.apache.commons.math.MaxIterationsExceededException var95 = new org.apache.commons.math.MaxIterationsExceededException(3, var70, (java.lang.Object[])var92);
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var3, 6.438972977369899d, var60, (java.lang.Object[])var92);
    java.lang.Throwable[] var97 = var3.getSuppressed();
    org.apache.commons.math.ConvergenceException var98 = new org.apache.commons.math.ConvergenceException("9c95", (java.lang.Object[])var97);
    org.apache.commons.math.MathException var99 = new org.apache.commons.math.MathException("", (java.lang.Object[])var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.6072208968980355d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var4 = var2.density(0.7491987728881979d);
    double var5 = var2.sample();
    double var6 = var2.sample();
    double var8 = var2.density((java.lang.Double)0.9265947336016332d);
    var2.reseedRandomGenerator(10L);
    double var11 = var2.getMean();
    var2.setStandardDeviation(1.6194048662911045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6.798432482298277E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 6.798432482298277E248d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.388721957374888d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4750943552028846d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


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
    java.lang.Number var31 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var34 = new org.apache.commons.math.exception.NumberIsTooLargeException(var8, var31, (java.lang.Number)32, false);
    
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

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(163.10489638781948d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 163.0d);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }
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
//     double var20 = var0.nextF(0.05154456169528096d, 0.7491987728881979d);
//     var0.reSeed(0L);
//     int var25 = var0.nextZipf(1, 0.6518479876354057d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var28 = var0.nextWeibull((-1555.4522569212395d), 0.6541839190244226d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "1cc1ac4154"+ "'", var6.equals("1cc1ac4154"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-0.01174968064688421d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.9448909534606371d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 4.230358560835121E-7d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 1);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


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
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException("hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 1.0d);
    org.apache.commons.math.exception.util.Localizable var31 = var28.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var35 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var36 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var35);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var40 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var39);
    java.lang.Object[] var43 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException((java.lang.Throwable)var40, "hi!", var43);
    java.lang.IllegalStateException var45 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var43);
    double[] var47 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var48 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var49 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var50 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var49);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(var47, var48, (java.lang.Object[])var49);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var55 = var54.getArguments();
    org.apache.commons.math.MathException var56 = new org.apache.commons.math.MathException("hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var56, 1.0d);
    org.apache.commons.math.exception.util.Localizable var59 = var56.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var60 = null;
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var63 = var62.getArguments();
    org.apache.commons.math.MathException var64 = new org.apache.commons.math.MathException(var60, var63);
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var45, var47, var59, var63);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var68 = var67.getArguments();
    org.apache.commons.math.ConvergenceException var69 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var36, var59, var68);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var73 = var72.getArguments();
    org.apache.commons.math.MathException var74 = new org.apache.commons.math.MathException("hi!", var73);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var74, 1.0d);
    org.apache.commons.math.exception.util.Localizable var77 = var74.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var78 = null;
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var81 = var80.getArguments();
    org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException(var78, var81);
    java.lang.ArithmeticException var83 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var77, var81);
    org.apache.commons.math.exception.util.Localizable var85 = null;
    java.lang.Object[] var87 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var88 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var85, var87);
    java.util.NoSuchElementException var89 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var87);
    java.lang.ArrayIndexOutOfBoundsException var90 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var77, var87);
    org.apache.commons.math.ConvergenceException var91 = new org.apache.commons.math.ConvergenceException(var59, var87);
    java.lang.NullPointerException var92 = org.apache.commons.math.MathRuntimeException.createNullPointerException("85", var87);
    org.apache.commons.math.MathRuntimeException var93 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var21, "85", var87);
    org.apache.commons.math.MaxIterationsExceededException var94 = new org.apache.commons.math.MaxIterationsExceededException(22, "8f7915267b281bd4de483e953c13a0c24117647c413e71021", var87);
    int var95 = var94.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 22);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.9173172759781081d, 9.999999999999998d);
    double var5 = var3.density(0.6768839838114289d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.3312501998977059d);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     var0.reseedRandomGenerator(1L);
//     var0.setMean(0.0d);
//     var0.reseedRandomGenerator((-9L));
//     double var9 = var0.cumulativeProbability(1.8623690518350022d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == (-1.2880601782763685d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0.9687244558314854d);
// 
//   }

  public void test154() {}
//   public void test154() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     java.lang.String var2 = var0.nextSecureHexString(2);
//     double var5 = var0.nextGaussian(0.9265947336016332d, 6.798432482298277E248d);
//     double var8 = var0.nextGamma(0.01725021899511961d, 0.0754959158420001d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var11 = var0.nextGaussian(4.31971632643598d, (-0.005120483541896959d));
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var2 + "' != '" + "f8"+ "'", var2.equals("f8"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-1.1102779744638305E248d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 9.043210601568748E-7d);
// 
//   }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.8789879768963514d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8789879768963513d));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.14028629028117665d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0098562702097242d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.47942553860420306d);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-1.5638826079633834d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.2840060103019058d));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.06669381571763945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06679296661393913d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-1.282187446945152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double var3 = var2.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var2.cumulativeProbability(0.0d, 2.0E-323d);
      fail("Expected exception of type org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100.0d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.07208261808742245d, 12);

  }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     java.lang.String var6 = var0.nextSecureHexString(10);
//     org.apache.commons.math.distribution.NormalDistributionImpl var9 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.01572968903404401d);
//     double var11 = var9.density((java.lang.Double)0.9065338654042625d);
//     double var12 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var9);
//     java.lang.String var14 = var0.nextSecureHexString(64);
//     java.lang.String var16 = var0.nextHexString(150);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var19 = var0.nextCauchy(0.28761553288826425d, 0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-5L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "606a2cea22"+ "'", var6.equals("606a2cea22"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == (-0.015039737886865044d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var14 + "' != '" + "bed9d8faf0c3d37137e9cc7fe86123feb59a80b2ff60a38de83dbfed7eb4b168"+ "'", var14.equals("bed9d8faf0c3d37137e9cc7fe86123feb59a80b2ff60a38de83dbfed7eb4b168"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var16 + "' != '" + "d721f5dc14dcfd6ad1d9b4b7920de3bac4814b94e41471525548d9fd7dd20288ebc68d7853c4f7432cf9334e17e12cbdd8d67e29c8815db45f05a7216229ef79ba2bf6b0839f72c23df325"+ "'", var16.equals("d721f5dc14dcfd6ad1d9b4b7920de3bac4814b94e41471525548d9fd7dd20288ebc68d7853c4f7432cf9334e17e12cbdd8d67e29c8815db45f05a7216229ef79ba2bf6b0839f72c23df325"));
// 
//   }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


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
    java.lang.Object[] var68 = null;
    java.lang.UnsupportedOperationException var69 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var35, var68);
    java.lang.Object[] var71 = null;
    org.apache.commons.math.ConvergenceException var72 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var69, "9dc4908dcf113bb35fabef90ffef5cee61f31fe74de6c7ae6", var71);
    
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
    assertNotNull(var69);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.4129633371056216d);
    double var3 = var1.probability(60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 7.164192615447834E-106d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-9L), (-6L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6L));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.3628159327419405d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20.78782168621553d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(4.993992273873336E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.028613468021388325d);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


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
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var31 = var30.getArguments();
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException(var28, var31);
    java.lang.ArithmeticException var33 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var27, var31);
    org.apache.commons.math.exception.util.Localizable var35 = null;
    java.lang.Object[] var37 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var38 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var35, var37);
    java.util.NoSuchElementException var39 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var37);
    java.lang.ArrayIndexOutOfBoundsException var40 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var27, var37);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var9, var37);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var44 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var43);
    java.lang.Object[] var47 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException((java.lang.Throwable)var44, "hi!", var47);
    java.lang.Object[] var49 = var44.getArguments();
    org.apache.commons.math.MathRuntimeException var50 = new org.apache.commons.math.MathRuntimeException(var9, var49);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, 0.9999999943688239d);
    org.apache.commons.math.exception.util.Localizable var53 = var52.getLocalizablePattern();
    java.lang.Throwable var56 = null;
    org.apache.commons.math.exception.util.Localizable var57 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var58 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var59 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var58);
    org.apache.commons.math.ConvergenceException var60 = new org.apache.commons.math.ConvergenceException(var56, var57, var59);
    java.lang.Throwable[] var61 = var60.getSuppressed();
    java.lang.ArithmeticException var62 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var61);
    java.lang.Object[] var63 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var61);
    java.lang.ArrayIndexOutOfBoundsException var64 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("", (java.lang.Object[])var61);
    java.lang.ArrayIndexOutOfBoundsException var65 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var53, (java.lang.Object[])var61);
    java.util.ConcurrentModificationException var66 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("evaluation failed for argument = {0}", (java.lang.Object[])var61);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    int var2 = org.apache.commons.math.util.FastMath.min(35, 60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 35);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    int var2 = org.apache.commons.math.util.FastMath.min(4, 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var11 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var14 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var13);
    java.lang.Object[] var17 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var18 = new org.apache.commons.math.MathException((java.lang.Throwable)var14, "hi!", var17);
    java.lang.IllegalArgumentException var19 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var7, var17);
    java.lang.Object[] var20 = null;
    java.lang.IllegalStateException var21 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var7, var20);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var24 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var23);
    double[] var25 = var23.getArgument();
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(var25);
    java.lang.Object[] var28 = null;
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, var25, "hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var34, 1.0d);
    org.apache.commons.math.exception.util.Localizable var37 = var34.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException(var38, var41);
    java.lang.ArithmeticException var43 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var37, var41);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var47 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var46);
    java.lang.Object[] var50 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException((java.lang.Throwable)var47, "hi!", var50);
    java.lang.Object[] var52 = var47.getArguments();
    org.apache.commons.math.MathException var53 = new org.apache.commons.math.MathException("d8b9700ff0", var52);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var25, var37, var52);
    org.apache.commons.math.exception.NumberIsTooSmallException var58 = new org.apache.commons.math.exception.NumberIsTooSmallException(var37, (java.lang.Number)1.737913715527783d, (java.lang.Number)(byte)(-1), false);
    java.lang.Number var59 = var58.getArgument();
    java.io.IOException var60 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + 1.737913715527783d+ "'", var59.equals(1.737913715527783d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var3 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var0, var2);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var7 = var6.getArguments();
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("hi!", var7);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 1.0d);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    java.lang.Object[] var18 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var19 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, "hi!", var18);
    java.lang.IllegalStateException var20 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var18);
    double[] var22 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var24 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var25 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var24);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(var22, var23, (java.lang.Object[])var24);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var30 = var29.getArguments();
    org.apache.commons.math.MathException var31 = new org.apache.commons.math.MathException("hi!", var30);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, 1.0d);
    org.apache.commons.math.exception.util.Localizable var34 = var31.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var38 = var37.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException(var35, var38);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, var22, var34, var38);
    org.apache.commons.math.MathException var41 = new org.apache.commons.math.MathException((java.lang.Throwable)var40);
    org.apache.commons.math.exception.util.Localizable var42 = var40.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var43 = var40.getLocalizablePattern();
    java.lang.Object[] var44 = null;
    org.apache.commons.math.ConvergenceException var45 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var8, var43, var44);
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var50 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var51 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var50);
    org.apache.commons.math.MathRuntimeException var52 = new org.apache.commons.math.MathRuntimeException(var47, (java.lang.Object[])var50);
    java.lang.Throwable[] var53 = var52.getSuppressed();
    java.lang.ArrayIndexOutOfBoundsException var54 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("4dbc902399", (java.lang.Object[])var53);
    java.lang.UnsupportedOperationException var55 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var43, (java.lang.Object[])var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.MathException var1 = new org.apache.commons.math.MathException(var0);
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
    org.apache.commons.math.exception.NotStrictlyPositiveException var23 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var9, (java.lang.Number)572.9577951308231d);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var26 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var25);
    java.lang.Object[] var29 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException((java.lang.Throwable)var26, "hi!", var29);
    org.apache.commons.math.ConvergenceException var31 = new org.apache.commons.math.ConvergenceException(var9, var29);
    java.lang.Object[] var34 = null;
    org.apache.commons.math.MaxIterationsExceededException var35 = new org.apache.commons.math.MaxIterationsExceededException((-1), "hi!", var34);
    int var36 = var35.getMaxIterations();
    org.apache.commons.math.exception.util.LocalizedFormats[] var41 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var42 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, 1.3440585709080678E43d, "", (java.lang.Object[])var41);
    java.lang.UnsupportedOperationException var44 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var9, (java.lang.Object[])var41);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var50 = var49.getArguments();
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException("hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, 1.0d);
    org.apache.commons.math.exception.util.Localizable var54 = var51.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var58 = new org.apache.commons.math.exception.NumberIsTooSmallException(var54, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var59 = null;
    org.apache.commons.math.exception.util.Localizable var60 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var61 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var62 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var61);
    org.apache.commons.math.ConvergenceException var63 = new org.apache.commons.math.ConvergenceException(var59, var60, var62);
    java.lang.UnsupportedOperationException var64 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var54, var62);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var68 = var67.getArguments();
    org.apache.commons.math.MathException var69 = new org.apache.commons.math.MathException("hi!", var68);
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var69, 1.0d);
    org.apache.commons.math.exception.util.Localizable var72 = var69.getLocalizablePattern();
    java.lang.Throwable[] var73 = var69.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var54, (java.lang.Object[])var73);
    org.apache.commons.math.exception.NumberIsTooSmallException var78 = new org.apache.commons.math.exception.NumberIsTooSmallException(var54, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var82 = var81.getArguments();
    org.apache.commons.math.MathException var83 = new org.apache.commons.math.MathException("hi!", var82);
    org.apache.commons.math.MathException var84 = new org.apache.commons.math.MathException((java.lang.Throwable)var83);
    java.lang.Throwable[] var85 = var84.getSuppressed();
    org.apache.commons.math.MaxIterationsExceededException var86 = new org.apache.commons.math.MaxIterationsExceededException(22, var54, (java.lang.Object[])var85);
    org.apache.commons.math.exception.util.LocalizedFormats[] var87 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.ArithmeticException var88 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var54, (java.lang.Object[])var87);
    org.apache.commons.math.ConvergenceException var89 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1, var9, (java.lang.Object[])var87);
    org.apache.commons.math.exception.NumberIsTooLargeException var93 = new org.apache.commons.math.exception.NumberIsTooLargeException(var9, (java.lang.Number)1.015272488552856d, (java.lang.Number)0.6658461180017422d, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var5 = var4.getArguments();
    org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
    org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var13 = var12.getArguments();
    org.apache.commons.math.MathException var14 = new org.apache.commons.math.MathException("hi!", var13);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, 1.0d);
    org.apache.commons.math.exception.util.Localizable var17 = var14.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var21 = new org.apache.commons.math.exception.NumberIsTooSmallException(var17, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var24 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var23);
    java.lang.Object[] var27 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException((java.lang.Throwable)var24, "hi!", var27);
    java.lang.IllegalArgumentException var29 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var17, var27);
    java.lang.IllegalStateException var30 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var9, var27);
    java.text.ParseException var31 = org.apache.commons.math.MathRuntimeException.createParseException(0, "5ad8b7c88a", var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException((-0.1616339537318908d));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    java.lang.Throwable var0 = null;
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
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(var0, (-4.435165758788555d), "03b2c63c457ea25266115c43853645bc316d7059d94383eda", var45);
    
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

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     int var6 = var0.nextInt(0, 8);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("b0", "cb1bf7b8a84babf675d62d26de4b74a49542bed7ef52b077c");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.4726604361048275d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 2);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(2.3483300301110437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3707591318361932d);

  }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var5 = var4.getArguments();
//     org.apache.commons.math.MathException var6 = new org.apache.commons.math.MathException("hi!", var5);
//     org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var9 = var6.getLocalizablePattern();
//     org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
//     org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException(var9, (java.lang.Number)1.0f, (java.lang.Number)(byte)0, false);
//     double[] var19 = new double[] { 1.0d};
//     org.apache.commons.math.exception.util.Localizable var20 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var21 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var22 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var21);
//     org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, var20, (java.lang.Object[])var21);
//     org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException(var9, (java.lang.Object[])var21);
//     org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var28 = var27.getArguments();
//     org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException("hi!", var28);
//     org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var32 = var29.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var33 = null;
//     org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var36 = var35.getArguments();
//     org.apache.commons.math.MathException var37 = new org.apache.commons.math.MathException(var33, var36);
//     java.lang.ArithmeticException var38 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var32, var36);
//     java.lang.Object[] var39 = null;
//     java.lang.IllegalArgumentException var40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var32, var39);
//     java.lang.Throwable var42 = null;
//     org.apache.commons.math.exception.util.Localizable var43 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var44 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var45 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var44);
//     org.apache.commons.math.ConvergenceException var46 = new org.apache.commons.math.ConvergenceException(var42, var43, var45);
//     java.lang.Throwable[] var47 = var46.getSuppressed();
//     java.lang.ArithmeticException var48 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var47);
//     java.lang.Object[] var49 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var47);
//     java.lang.NullPointerException var50 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var32, (java.lang.Object[])var47);
//     org.apache.commons.math.ConvergenceException var51 = new org.apache.commons.math.ConvergenceException(var9, (java.lang.Object[])var47);
//     org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     org.apache.commons.math.MathRuntimeException var55 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var54);
//     java.lang.Object[] var58 = new java.lang.Object[] { (short)(-1)};
//     org.apache.commons.math.MathException var59 = new org.apache.commons.math.MathException((java.lang.Throwable)var55, "hi!", var58);
//     java.lang.IllegalStateException var60 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var58);
//     double[] var62 = new double[] { 1.0d};
//     org.apache.commons.math.exception.util.Localizable var63 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var64 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var65 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var64);
//     org.apache.commons.math.FunctionEvaluationException var66 = new org.apache.commons.math.FunctionEvaluationException(var62, var63, (java.lang.Object[])var64);
//     org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var70 = var69.getArguments();
//     org.apache.commons.math.MathException var71 = new org.apache.commons.math.MathException("hi!", var70);
//     org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var74 = var71.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var75 = null;
//     org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var78 = var77.getArguments();
//     org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException(var75, var78);
//     org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var60, var62, var74, var78);
//     java.lang.Object[] var81 = org.apache.commons.math.exception.util.ArgUtils.flatten(var78);
//     org.apache.commons.math.MaxIterationsExceededException var82 = new org.apache.commons.math.MaxIterationsExceededException(23, var9, var81);
//     org.apache.commons.math.exception.util.Localizable var83 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var86 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.text.ParseException var87 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var86);
//     org.apache.commons.math.MathRuntimeException var88 = new org.apache.commons.math.MathRuntimeException(var83, (java.lang.Object[])var86);
//     java.lang.Throwable[] var89 = var88.getSuppressed();
//     org.apache.commons.math.FunctionEvaluationException var90 = new org.apache.commons.math.FunctionEvaluationException(var0, var9, (java.lang.Object[])var89);
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(10);
    int var2 = var1.getMaxIterations();
    org.apache.commons.math.MathRuntimeException var3 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1);
    int var4 = var1.getMaxIterations();
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var9 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var10 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var9);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException(var6, (java.lang.Object[])var9);
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException((java.lang.Throwable)var1, "", (java.lang.Object[])var9);
    java.lang.IllegalArgumentException var13 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSecureAlgorithm("9dc4908dcf113bb35fabef90ffef5cee61f31fe74de6c7ae6", "fdba3c617e");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var13, 1.0d);
    org.apache.commons.math.exception.util.Localizable var16 = var13.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var16, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var23 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var22);
    java.lang.Object[] var26 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException((java.lang.Throwable)var23, "hi!", var26);
    java.lang.IllegalArgumentException var28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var16, var26);
    java.lang.IllegalStateException var29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var8, var26);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var33 = var32.getArguments();
    java.io.EOFException var34 = org.apache.commons.math.MathRuntimeException.createEOFException("", var33);
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException(var8, var33);
    java.lang.NullPointerException var36 = org.apache.commons.math.MathRuntimeException.createNullPointerException("hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException("hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 1.0d);
    org.apache.commons.math.exception.util.Localizable var45 = var42.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var49 = new org.apache.commons.math.exception.NumberIsTooSmallException(var45, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var50 = null;
    org.apache.commons.math.exception.util.Localizable var51 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var52 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var53 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var52);
    org.apache.commons.math.ConvergenceException var54 = new org.apache.commons.math.ConvergenceException(var50, var51, var53);
    java.lang.UnsupportedOperationException var55 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var45, var53);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException("hi!", var59);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var60, 1.0d);
    org.apache.commons.math.exception.util.Localizable var63 = var60.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var64 = null;
    org.apache.commons.math.FunctionEvaluationException var66 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var67 = var66.getArguments();
    org.apache.commons.math.MathException var68 = new org.apache.commons.math.MathException(var64, var67);
    java.lang.ArithmeticException var69 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var63, var67);
    org.apache.commons.math.exception.util.Localizable var71 = null;
    java.lang.Object[] var73 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var74 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var71, var73);
    java.util.NoSuchElementException var75 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var73);
    java.lang.ArrayIndexOutOfBoundsException var76 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var63, var73);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var45, var73);
    org.apache.commons.math.FunctionEvaluationException var79 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var80 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var79);
    java.lang.Object[] var83 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var84 = new org.apache.commons.math.MathException((java.lang.Throwable)var80, "hi!", var83);
    java.lang.Object[] var85 = var80.getArguments();
    org.apache.commons.math.MathRuntimeException var86 = new org.apache.commons.math.MathRuntimeException(var45, var85);
    java.lang.RuntimeException var87 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var86);
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var86, 0.8421690108828669d);
    var36.addSuppressed((java.lang.Throwable)var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.434902137921765d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test185() {}
//   public void test185() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     int var7 = var0.nextInt(8, 100);
//     int var11 = var0.nextHypergeometric(100, 49, 49);
//     org.apache.commons.math.random.RandomDataImpl var12 = new org.apache.commons.math.random.RandomDataImpl();
//     var12.reSeedSecure();
//     long var16 = var12.nextLong((-9L), 1L);
//     java.lang.String var18 = var12.nextSecureHexString(10);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var20 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var21 = var20.sample();
//     int var22 = var12.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var20);
//     double var23 = var20.getMean();
//     int var24 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var20);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-4L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == (-4L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var18 + "' != '" + "2eacd8b4b5"+ "'", var18.equals("2eacd8b4b5"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 5);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1.5574077246549023d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 3);
// 
//   }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    java.lang.Object[] var9 = new java.lang.Object[] { 572.9577951308231d};
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException(var7, var9);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var15 = var14.getArguments();
    org.apache.commons.math.MathException var16 = new org.apache.commons.math.MathException("hi!", var15);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, 1.0d);
    org.apache.commons.math.exception.util.Localizable var19 = var16.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var23 = new org.apache.commons.math.exception.NumberIsTooSmallException(var19, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var26 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var25);
    java.lang.Object[] var29 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException((java.lang.Throwable)var26, "hi!", var29);
    java.lang.IllegalArgumentException var31 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var19, var29);
    org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
    java.lang.ArithmeticException var35 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException("hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 1.0d);
    org.apache.commons.math.exception.util.Localizable var45 = var42.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var49 = var48.getArguments();
    org.apache.commons.math.MathException var50 = new org.apache.commons.math.MathException("hi!", var49);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, 1.0d);
    org.apache.commons.math.exception.util.Localizable var53 = var50.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var57 = new org.apache.commons.math.exception.NumberIsTooSmallException(var53, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var60 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var59);
    java.lang.Object[] var63 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var64 = new org.apache.commons.math.MathException((java.lang.Throwable)var60, "hi!", var63);
    java.lang.IllegalArgumentException var65 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var53, var63);
    java.lang.IllegalStateException var66 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var45, var63);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, 0.0d, "", var63);
    org.apache.commons.math.MaxIterationsExceededException var68 = new org.apache.commons.math.MaxIterationsExceededException(0, var19, var63);
    var10.addSuppressed((java.lang.Throwable)var68);
    org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.0d, var1, false);
    java.io.IOException var4 = org.apache.commons.math.MathRuntimeException.createIOException((java.lang.Throwable)var3);
    java.lang.Number var5 = var3.getMax();
    org.apache.commons.math.MathRuntimeException var6 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var3);
    java.lang.Number var7 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


    double var2 = org.apache.commons.math.util.FastMath.min(7.922087046617958d, 53018.720546698525d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.922087046617958d);

  }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     double var6 = var0.nextT(572.9577951308232d);
//     var0.reSeed();
//     double var10 = var0.nextGaussian(0.0d, 0.6518479876354057d);
//     double var13 = var0.nextBeta(0.5085619431551482d, 5.72308557107815d);
//     java.lang.String var15 = var0.nextSecureHexString(100);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var18 = var0.nextPermutation(20, 32);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.4593039631974752d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == (-0.2692989012622042d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-0.06043365316146964d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0.009732332667863067d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "7c2ef03e7c3a07eeb8a9881f0262347fc09c1d25d197bd7b81025b2112bfb5f806f336102b04522f0e83ee00e025a4b94389"+ "'", var15.equals("7c2ef03e7c3a07eeb8a9881f0262347fc09c1d25d197bd7b81025b2112bfb5f806f336102b04522f0e83ee00e025a4b94389"));
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var14 = var13.getArguments();
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException(var11, var14);
    java.lang.ArithmeticException var16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var10, var14);
    java.lang.IllegalStateException var17 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var14);
    org.apache.commons.math.MathRuntimeException var18 = new org.apache.commons.math.MathRuntimeException("{0}", var14);
    org.apache.commons.math.exception.util.Localizable var19 = var18.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var23 = new org.apache.commons.math.exception.NumberIsTooSmallException(var19, (java.lang.Number)0.06595940771553593d, (java.lang.Number)1.044193245253925d, true);
    java.lang.Throwable var27 = null;
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var29 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var30 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var29);
    org.apache.commons.math.ConvergenceException var31 = new org.apache.commons.math.ConvergenceException(var27, var28, var30);
    java.lang.Throwable[] var32 = var31.getSuppressed();
    java.text.ParseException var33 = org.apache.commons.math.MathRuntimeException.createParseException(0, "85", (java.lang.Object[])var32);
    java.io.EOFException var34 = org.apache.commons.math.MathRuntimeException.createEOFException("5f30dfc3a2", (java.lang.Object[])var32);
    org.apache.commons.math.ConvergenceException var35 = new org.apache.commons.math.ConvergenceException(var0, var19, (java.lang.Object[])var32);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException("hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 1.0d);
    org.apache.commons.math.exception.util.Localizable var46 = var43.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var50 = new org.apache.commons.math.exception.NumberIsTooSmallException(var46, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var53 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var52);
    java.lang.Object[] var56 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var57 = new org.apache.commons.math.MathException((java.lang.Throwable)var53, "hi!", var56);
    java.lang.IllegalArgumentException var58 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var46, var56);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var62 = var61.getArguments();
    org.apache.commons.math.MathException var63 = new org.apache.commons.math.MathException("hi!", var62);
    java.text.ParseException var64 = org.apache.commons.math.MathRuntimeException.createParseException(0, var46, var62);
    org.apache.commons.math.exception.util.LocalizedFormats[] var68 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var69 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var68);
    java.lang.IllegalStateException var70 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var68);
    org.apache.commons.math.MaxIterationsExceededException var71 = new org.apache.commons.math.MaxIterationsExceededException(3, var46, (java.lang.Object[])var68);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 0.0d);
    java.lang.Object[] var74 = var73.getArguments();
    org.apache.commons.math.ConvergenceException var75 = new org.apache.commons.math.ConvergenceException("04c5a4bea1", var74);
    java.lang.NullPointerException var76 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var19, var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-1.735195022949358d), 9.476024060103686d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.735195022949358d));

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     java.lang.String var6 = var0.nextSecureHexString(10);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var8 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var9 = var8.sample();
//     int var10 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var8);
//     double var11 = var8.getMean();
//     double var13 = var8.cumulativeProbability(0.011561458636849719d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-4L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "0bcd07e494"+ "'", var6.equals("0bcd07e494"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.5574077246549023d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0.2106815084135416d);
// 
//   }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var7 = var0.nextSecureLong((-9L), (-3L));
//     double var9 = var0.nextT(1.1612894529345956d);
//     double var12 = var0.nextUniform(0.015730986458679944d, 1.3347592604095586d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var15 = var0.nextGamma(0.0d, 0.6938347821034476d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.5172542093577439d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-7L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-0.33201323168964353d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.14989162059016892d);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


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
    java.util.NoSuchElementException var25 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("hi!", var21);
    java.lang.Object[] var26 = org.apache.commons.math.exception.util.ArgUtils.flatten(var21);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(0.9065338654042625d, "hi!", var21);
    java.lang.IllegalArgumentException var28 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("b0692563fefb9844574005e18e155ead63a3e6319f954c78342bc33f30dc50a7d0f079b657252c1fcf26d735f87842c4333d", var21);
    java.lang.IllegalArgumentException var29 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var28);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(0);
    org.apache.commons.math.exception.util.Localizable var2 = var1.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var9 = var8.getArguments();
    org.apache.commons.math.MathException var10 = new org.apache.commons.math.MathException("hi!", var9);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 1.0d);
    org.apache.commons.math.exception.util.Localizable var13 = var10.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var17 = new org.apache.commons.math.exception.NumberIsTooSmallException(var13, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var19);
    java.lang.Object[] var23 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException((java.lang.Throwable)var20, "hi!", var23);
    java.lang.IllegalArgumentException var25 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var13, var23);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var29 = var28.getArguments();
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException("hi!", var29);
    java.text.ParseException var31 = org.apache.commons.math.MathRuntimeException.createParseException(0, var13, var29);
    org.apache.commons.math.exception.util.LocalizedFormats[] var35 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var36 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var35);
    java.lang.IllegalStateException var37 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var35);
    org.apache.commons.math.MaxIterationsExceededException var38 = new org.apache.commons.math.MaxIterationsExceededException(3, var13, (java.lang.Object[])var35);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 0.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.ConvergenceException var42 = new org.apache.commons.math.ConvergenceException("04c5a4bea1", var41);
    java.lang.ArrayIndexOutOfBoundsException var43 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var2, var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var3 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var0, var2);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var7 = var6.getArguments();
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("hi!", var7);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 1.0d);
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.Object[] var12 = var8.getArguments();
    org.apache.commons.math.exception.util.Localizable var13 = var8.getLocalizablePattern();
    java.lang.Object[] var14 = null;
    java.lang.NullPointerException var15 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var13, var14);
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var13, (java.lang.Number)(-0.7692368661427047d), (java.lang.Number)57, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.9999999993921502d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.07849770702273E-10d));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var6 = var0.nextPoisson(0.3149413275154456d);
//     var0.reSeed((-4L));
//     var0.reSeedSecure((-5L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextHypergeometric((-1), 5, 71);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.49641616866110816d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0L);
// 
//   }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d);
//     int var2 = var1.sample();
//     double var5 = var1.cumulativeProbability((-0.455516058591265d), 0.00939478673862955d);
//     var1.reseedRandomGenerator((-6L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.3887219573748958d);
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(10.0d, 100.0d, 100);
    double var4 = var3.getMean();
    double var6 = var3.cumulativeProbability(0);
    double var8 = var3.cumulativeProbability(1.1612894529345956d);
    double var10 = var3.normalApproximateProbability(71);
    double var12 = var3.normalApproximateProbability(35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4.539992976248491E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4.993992273873336E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.9999999999999996d);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(22025.465794806718d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
    double var4 = var2.density((java.lang.Double)1.0513699053569932d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var2.inverseCumulativeProbability(1.5640117967155458d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5119984566736251d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed((-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var6 = var1.nextSecureLong(55L, 1L);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.6541839190244226d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }


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
    java.lang.Object[] var41 = var40.getArguments();
    
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
    assertNotNull(var41);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7853981633974483d, 0.21780540111532407d, 100);
    double var4 = var3.getMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.7853981633974483d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.0010506229546617168d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.001050623147942835d);

  }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var3 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.7853981633974483d, 0.21780540111532407d, 100);
//     int var4 = var3.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0);
// 
//   }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }


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
    java.lang.Object[] var50 = org.apache.commons.math.exception.util.ArgUtils.flatten(var48);
    java.lang.Object[] var51 = org.apache.commons.math.exception.util.ArgUtils.flatten(var48);
    
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
    assertNotNull(var51);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var5 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, var4, (java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var15, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var19);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var24 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var23);
    java.lang.Object[] var27 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException((java.lang.Throwable)var24, "hi!", var27);
    java.lang.IllegalStateException var29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var27);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, var32, (java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var39 = var38.getArguments();
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException("hi!", var39);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, 1.0d);
    org.apache.commons.math.exception.util.Localizable var43 = var40.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException(var44, var47);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, var31, var43, var47);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var52 = var51.getArguments();
    org.apache.commons.math.ConvergenceException var53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, var43, var52);
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    java.lang.IllegalStateException var59 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var58);
    java.lang.NullPointerException var60 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var54, var58);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var3, var43, var58);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(0.02647243584190612d, "ccfe1a8af9", var58);
    java.lang.String var63 = var62.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "ccfe1a8af9"+ "'", var63.equals("ccfe1a8af9"));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.getMean();
    var0.setMean(2.953285841991287d);
    double var10 = var0.inverseCumulativeProbability(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == Double.NEGATIVE_INFINITY);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


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
    org.apache.commons.math.MathException var51 = new org.apache.commons.math.MathException((java.lang.Throwable)var50);
    var45.addSuppressed((java.lang.Throwable)var50);
    java.lang.String var53 = var45.getPattern();
    
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
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-0.004103917346467561d), 0.5217169378831249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.00410391734646756d));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }


    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var4 = var3.getArguments();
    org.apache.commons.math.MathException var5 = new org.apache.commons.math.MathException("hi!", var4);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 1.0d);
    org.apache.commons.math.exception.util.Localizable var8 = var5.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.exception.NumberIsTooLargeException var16 = new org.apache.commons.math.exception.NumberIsTooLargeException(var8, (java.lang.Number)1.0f, (java.lang.Number)(byte)0, false);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var21 = var20.getArguments();
    org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException("hi!", var21);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 1.0d);
    org.apache.commons.math.exception.util.Localizable var25 = var22.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var29 = new org.apache.commons.math.exception.NumberIsTooSmallException(var25, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var32 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var31);
    java.lang.Object[] var35 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var36 = new org.apache.commons.math.MathException((java.lang.Throwable)var32, "hi!", var35);
    java.lang.IllegalArgumentException var37 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var25, var35);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var41 = var40.getArguments();
    org.apache.commons.math.MathException var42 = new org.apache.commons.math.MathException("hi!", var41);
    java.text.ParseException var43 = org.apache.commons.math.MathRuntimeException.createParseException(0, var25, var41);
    java.text.ParseException var44 = org.apache.commons.math.MathRuntimeException.createParseException(28, var8, var41);
    java.lang.Throwable var45 = null;
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var49 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var48);
    java.lang.Object[] var52 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var53 = new org.apache.commons.math.MathException((java.lang.Throwable)var49, "hi!", var52);
    java.lang.Object[] var54 = var49.getArguments();
    java.lang.Throwable var56 = null;
    double[] var60 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var64 = var63.getArguments();
    org.apache.commons.math.MathException var65 = new org.apache.commons.math.MathException("hi!", var64);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 1.0d);
    org.apache.commons.math.exception.util.Localizable var68 = var65.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var69 = null;
    org.apache.commons.math.exception.util.Localizable var70 = null;
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var73 = var72.getArguments();
    org.apache.commons.math.MathException var74 = new org.apache.commons.math.MathException(var70, var73);
    java.io.EOFException var75 = org.apache.commons.math.MathRuntimeException.createEOFException(var69, var73);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(var56, var60, var68, var73);
    org.apache.commons.math.MathRuntimeException var77 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var49, "", var73);
    org.apache.commons.math.MathRuntimeException var78 = new org.apache.commons.math.MathRuntimeException(var45, "hi!", var73);
    java.lang.NullPointerException var79 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var8, var73);
    java.lang.Throwable var81 = null;
    org.apache.commons.math.exception.util.Localizable var82 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var83 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var84 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var83);
    org.apache.commons.math.ConvergenceException var85 = new org.apache.commons.math.ConvergenceException(var81, var82, var84);
    java.lang.Throwable[] var86 = var85.getSuppressed();
    java.lang.ArithmeticException var87 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var86);
    java.lang.Object[] var88 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var86);
    java.lang.ArithmeticException var89 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var8, var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var10, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var16);
    java.lang.Object[] var20 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var21 = new org.apache.commons.math.MathException((java.lang.Throwable)var17, "hi!", var20);
    java.lang.IllegalArgumentException var22 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var10, var20);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var26 = var25.getArguments();
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException("hi!", var26);
    java.text.ParseException var28 = org.apache.commons.math.MathRuntimeException.createParseException(0, var10, var26);
    java.lang.Throwable var29 = null;
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var31 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var32 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var31);
    org.apache.commons.math.ConvergenceException var33 = new org.apache.commons.math.ConvergenceException(var29, var30, var32);
    java.util.ConcurrentModificationException var34 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var10, var32);
    java.lang.Object[] var36 = null;
    java.lang.ArrayIndexOutOfBoundsException var37 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("hi!", var36);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException("hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 1.0d);
    org.apache.commons.math.exception.util.Localizable var47 = var44.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var51 = new org.apache.commons.math.exception.NumberIsTooSmallException(var47, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var52 = null;
    org.apache.commons.math.exception.util.Localizable var53 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var54 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var55 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var54);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException(var52, var53, var55);
    java.lang.UnsupportedOperationException var57 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var47, var55);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var61 = var60.getArguments();
    org.apache.commons.math.MathException var62 = new org.apache.commons.math.MathException("hi!", var61);
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var62, 1.0d);
    org.apache.commons.math.exception.util.Localizable var65 = var62.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var66 = null;
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var69 = var68.getArguments();
    org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException(var66, var69);
    java.lang.ArithmeticException var71 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var65, var69);
    org.apache.commons.math.exception.util.Localizable var73 = null;
    java.lang.Object[] var75 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var76 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var73, var75);
    java.util.NoSuchElementException var77 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var75);
    java.lang.ArrayIndexOutOfBoundsException var78 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var65, var75);
    org.apache.commons.math.FunctionEvaluationException var79 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var47, var75);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var82 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var81);
    java.lang.Object[] var85 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException((java.lang.Throwable)var82, "hi!", var85);
    java.lang.Object[] var87 = var82.getArguments();
    org.apache.commons.math.MathRuntimeException var88 = new org.apache.commons.math.MathRuntimeException(var47, var87);
    java.lang.Object[] var89 = org.apache.commons.math.exception.util.ArgUtils.flatten(var87);
    org.apache.commons.math.MathRuntimeException var90 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var37, var38, var87);
    java.lang.UnsupportedOperationException var91 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var10, var87);
    java.util.NoSuchElementException var92 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("be1387eba2", var87);
    org.apache.commons.math.MathRuntimeException var93 = new org.apache.commons.math.MathRuntimeException("27f6d8a04be5ddf5a087fb11aa4e98b886e812c3445ccd832", var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.01245773807578859d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.23181759639559318d));

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     int var7 = var0.nextInt(8, 100);
//     int var11 = var0.nextHypergeometric(100, 49, 49);
//     var0.reSeedSecure(2L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var15 = var0.nextT((-0.2531501296211728d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-4L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 58);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 26);
// 
//   }

  public void test219() {}
//   public void test219() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     org.apache.commons.math.distribution.NormalDistributionImpl var1 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var2 = var1.sample();
//     var1.reseedRandomGenerator(1L);
//     var1.setMean(0.0d);
//     double[] var8 = var1.sample(1);
//     org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(var0, var8);
//     org.apache.commons.math.exception.util.LocalizedFormats[] var12 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var13 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var12);
//     java.lang.ArithmeticException var14 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var12);
//     org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var8, "d93925519a8d4cdab384bb75a609a3bf672790ae3911697a9", (java.lang.Object[])var12);
//     org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var21 = var20.getArguments();
//     org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException("hi!", var21);
//     org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 1.0d);
//     org.apache.commons.math.exception.util.Localizable var25 = var22.getLocalizablePattern();
//     org.apache.commons.math.exception.util.Localizable var26 = null;
//     org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var29 = var28.getArguments();
//     org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException(var26, var29);
//     java.lang.ArithmeticException var31 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var25, var29);
//     java.lang.Object[] var32 = null;
//     java.lang.IllegalArgumentException var33 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var25, var32);
//     java.lang.Throwable var35 = null;
//     org.apache.commons.math.exception.util.Localizable var36 = null;
//     org.apache.commons.math.exception.util.LocalizedFormats[] var37 = org.apache.commons.math.exception.util.LocalizedFormats.values();
//     java.lang.Object[] var38 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var37);
//     org.apache.commons.math.ConvergenceException var39 = new org.apache.commons.math.ConvergenceException(var35, var36, var38);
//     java.lang.Throwable[] var40 = var39.getSuppressed();
//     java.lang.ArithmeticException var41 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var40);
//     java.lang.Object[] var42 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var40);
//     java.lang.NullPointerException var43 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var25, (java.lang.Object[])var40);
//     org.apache.commons.math.MathRuntimeException var44 = new org.apache.commons.math.MathRuntimeException("org.apache.commons.math.exception.NumberIsTooLargeException: 63 is larger than the maximum (1): hi!", (java.lang.Object[])var40);
//     org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(var8, "2eb9d85315f2dae4f4e483ea45fda7fc800d0d4b525bbe156", (java.lang.Object[])var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.6296411999968107d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var8);
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
//     assertNotNull(var21);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var25);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var31);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var38);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var40);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var41);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var43);
// 
//   }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.getMean();
    var0.setMean(2.953285841991287d);
    double var9 = var0.getStandardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var10, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var15 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var14);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var19 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var18);
    java.lang.Object[] var22 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException((java.lang.Throwable)var19, "hi!", var22);
    java.lang.IllegalStateException var24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var22);
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var28 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var29 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var28);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, var27, (java.lang.Object[])var28);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var34 = var33.getArguments();
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException("hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, 1.0d);
    org.apache.commons.math.exception.util.Localizable var38 = var35.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException(var39, var42);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var24, var26, var38, var42);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.ConvergenceException var48 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var15, var38, var47);
    org.apache.commons.math.ConvergenceException var49 = new org.apache.commons.math.ConvergenceException("", var47);
    org.apache.commons.math.MathRuntimeException var50 = new org.apache.commons.math.MathRuntimeException(var0, "85", var47);
    org.apache.commons.math.exception.util.Localizable var51 = var50.getLocalizablePattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)0.9252901772543515d);
    java.lang.String var2 = var1.toString();
    org.apache.commons.math.ConvergenceException var3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var1);
    boolean var4 = var1.getBoundIsAllowed();
    java.lang.RuntimeException var5 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)"+ "'", var2.equals("org.apache.commons.math.exception.NotStrictlyPositiveException: 0.925 is smaller than, or equal to, the minimum (0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.5519550580637275d, (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5519550580637275d);

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     double var7 = var1.nextF(0.7822517578613938d, 0.9232914105526042d);
//     var1.reSeedSecure();
//     double var10 = var1.nextChiSquare(0.7652591570218927d);
//     double var13 = var1.nextCauchy(4.144544512747313d, 0.5d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setSecureAlgorithm("", "");
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.015124503996189078d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.023870215385139996d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0.5885599313619869d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 11.243338352966191d);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-1.4722421297031818d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2942040852912085d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.sample();
    double var7 = var0.getStandardDeviation();
    double var8 = var0.getStandardDeviation();
    double var10 = var0.density((-0.8085359190707371d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-0.1616339537318908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.6246292191371761d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.2877095831606803d);

  }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     int var4 = var1.nextInt(10, 49);
//     double var7 = var1.nextBeta(1.5574077246549023d, 0.8862636038898793d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var10 = var1.nextF(0.0d, 0.007301132705501239d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.492929107377195d);
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(97.6667403719262d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 98.0d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.075136753983952d, 1.0038848218538872d, (-0.47055948644137463d));
    double var4 = var3.getStandardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0038848218538872d);

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.2032794589395281d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test231() {}
//   public void test231() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     int var6 = var1.nextInt(22, 93);
//     java.util.Collection var7 = null;
//     java.lang.Object[] var9 = var1.nextSample(var7, 22);
// 
//   }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.434902137921765d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double[] var5 = var0.sample(3);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var11 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var10);
    java.lang.Object[] var14 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException((java.lang.Throwable)var11, "hi!", var14);
    org.apache.commons.math.MathRuntimeException var16 = new org.apache.commons.math.MathRuntimeException("", var14);
    org.apache.commons.math.MathRuntimeException var17 = new org.apache.commons.math.MathRuntimeException("hi!", var14);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var5, "91", var14);
    org.apache.commons.math.exception.util.Localizable var19 = var18.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var21 = null;
    java.lang.Object[] var23 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var24 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var21, var23);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException("hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 1.0d);
    var24.addSuppressed((java.lang.Throwable)var29);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var36 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var35);
    java.lang.Object[] var39 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException((java.lang.Throwable)var36, "hi!", var39);
    java.lang.IllegalStateException var41 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var39);
    double[] var43 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var45 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var46 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var45);
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(var43, var44, (java.lang.Object[])var45);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var51 = var50.getArguments();
    org.apache.commons.math.MathException var52 = new org.apache.commons.math.MathException("hi!", var51);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var52, 1.0d);
    org.apache.commons.math.exception.util.Localizable var55 = var52.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var56 = null;
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException(var56, var59);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var41, var43, var55, var59);
    org.apache.commons.math.MathException var62 = new org.apache.commons.math.MathException((java.lang.Throwable)var61);
    org.apache.commons.math.exception.util.Localizable var63 = var61.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var64 = var61.getLocalizablePattern();
    java.lang.Object[] var65 = null;
    org.apache.commons.math.ConvergenceException var66 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var29, var64, var65);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.MathException var71 = new org.apache.commons.math.MathException("hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 1.0d);
    org.apache.commons.math.exception.util.Localizable var74 = var71.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var78 = new org.apache.commons.math.exception.NumberIsTooSmallException(var74, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var81 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var80);
    java.lang.Object[] var84 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var85 = new org.apache.commons.math.MathException((java.lang.Throwable)var81, "hi!", var84);
    java.lang.IllegalArgumentException var86 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var74, var84);
    org.apache.commons.math.exception.NotStrictlyPositiveException var88 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var74, (java.lang.Number)572.9577951308231d);
    org.apache.commons.math.FunctionEvaluationException var90 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var91 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var90);
    java.lang.Object[] var94 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var95 = new org.apache.commons.math.MathException((java.lang.Throwable)var91, "hi!", var94);
    org.apache.commons.math.ConvergenceException var96 = new org.apache.commons.math.ConvergenceException(var74, var94);
    org.apache.commons.math.FunctionEvaluationException var97 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, (-0.4017802381159433d), var64, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }


    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var5 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, var4, (java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var15, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var19);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var24 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var23);
    java.lang.Object[] var27 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException((java.lang.Throwable)var24, "hi!", var27);
    java.lang.IllegalStateException var29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var27);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, var32, (java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var39 = var38.getArguments();
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException("hi!", var39);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, 1.0d);
    org.apache.commons.math.exception.util.Localizable var43 = var40.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException(var44, var47);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, var31, var43, var47);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var52 = var51.getArguments();
    org.apache.commons.math.ConvergenceException var53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, var43, var52);
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    java.lang.IllegalStateException var59 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var58);
    java.lang.NullPointerException var60 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var54, var58);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var3, var43, var58);
    java.lang.Throwable var62 = null;
    double[] var66 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.MathException var71 = new org.apache.commons.math.MathException("hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 1.0d);
    org.apache.commons.math.exception.util.Localizable var74 = var71.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var75 = null;
    org.apache.commons.math.exception.util.Localizable var76 = null;
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var79 = var78.getArguments();
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException(var76, var79);
    java.io.EOFException var81 = org.apache.commons.math.MathRuntimeException.createEOFException(var75, var79);
    org.apache.commons.math.FunctionEvaluationException var82 = new org.apache.commons.math.FunctionEvaluationException(var62, var66, var74, var79);
    org.apache.commons.math.MathException var83 = new org.apache.commons.math.MathException(var43, var79);
    java.lang.NullPointerException var84 = org.apache.commons.math.MathRuntimeException.createNullPointerException("b584d89dc2e07458a88956ebaada649a6ead603bc7afb4dfe", var79);
    java.util.ConcurrentModificationException var85 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("519519ea7a81bb8ec54c9e55fd740b89b3238a7ceb36df8b3", var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test235() {}
//   public void test235() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(3.469446951953614E-18d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     int var6 = var0.nextInt(0, 8);
//     var0.reSeedSecure();
//     double var10 = var0.nextWeibull(0.12601204934874258d, 0.379543672011928d);
//     int var13 = var0.nextPascal(1, 0.05465537715455142d);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.31660338309868313d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 58.655973994561315d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 6);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.01161045638873576d));
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }
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
//     var1.reSeedSecure();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.9280753110165308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == (-1.8398930223039023d));
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

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


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
    org.apache.commons.math.exception.NumberIsTooSmallException var53 = new org.apache.commons.math.exception.NumberIsTooSmallException(var8, (java.lang.Number)1.1102230246251565E-16d, (java.lang.Number)(-0.47055948644137463d), true);
    boolean var54 = var53.getBoundIsAllowed();
    
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
    assertTrue(var54 == true);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }


    org.apache.commons.math.exception.util.LocalizedFormats[] var3 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var4 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var3);
    java.lang.ArithmeticException var5 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var3);
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
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 0.0d, "", var33);
    java.lang.ArrayIndexOutOfBoundsException var38 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException("d8b9700ff0", var33);
    java.io.EOFException var39 = org.apache.commons.math.MathRuntimeException.createEOFException("9b0551cbbfb903f5d9126caa7d2971323273d581d59418c1f", var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.901004401874304d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.03317878590761207d);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    java.lang.Throwable var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var5 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)(byte)10, (java.lang.Number)10L, true);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var10 = var9.getArguments();
    org.apache.commons.math.MathException var11 = new org.apache.commons.math.MathException("hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var11, 1.0d);
    org.apache.commons.math.exception.util.Localizable var14 = var11.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var18 = new org.apache.commons.math.exception.NumberIsTooSmallException(var14, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var19 = null;
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var21 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var22 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var21);
    org.apache.commons.math.ConvergenceException var23 = new org.apache.commons.math.ConvergenceException(var19, var20, var22);
    java.lang.UnsupportedOperationException var24 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var14, var22);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException("hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 1.0d);
    org.apache.commons.math.exception.util.Localizable var32 = var29.getLocalizablePattern();
    java.lang.Throwable[] var33 = var29.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var14, (java.lang.Object[])var33);
    org.apache.commons.math.exception.NumberIsTooSmallException var38 = new org.apache.commons.math.exception.NumberIsTooSmallException(var14, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    java.lang.Object[] var39 = null;
    java.lang.IllegalArgumentException var40 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var14, var39);
    java.lang.Object[] var41 = null;
    org.apache.commons.math.MathRuntimeException var42 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var5, var14, var41);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException("hi!", var47);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var48, 1.0d);
    org.apache.commons.math.exception.util.Localizable var51 = var48.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var55 = var54.getArguments();
    org.apache.commons.math.MathException var56 = new org.apache.commons.math.MathException(var52, var55);
    java.lang.ArithmeticException var57 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var51, var55);
    org.apache.commons.math.exception.util.Localizable var59 = null;
    java.lang.Object[] var61 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var62 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var59, var61);
    java.util.NoSuchElementException var63 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var61);
    java.lang.ArrayIndexOutOfBoundsException var64 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var51, var61);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var68 = var67.getArguments();
    org.apache.commons.math.MathException var69 = new org.apache.commons.math.MathException("hi!", var68);
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var69, 1.0d);
    org.apache.commons.math.exception.util.Localizable var72 = var69.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var76 = new org.apache.commons.math.exception.NumberIsTooSmallException(var72, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var77 = null;
    org.apache.commons.math.exception.util.Localizable var78 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var79 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var80 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var79);
    org.apache.commons.math.ConvergenceException var81 = new org.apache.commons.math.ConvergenceException(var77, var78, var80);
    java.lang.UnsupportedOperationException var82 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var72, var80);
    org.apache.commons.math.MaxIterationsExceededException var83 = new org.apache.commons.math.MaxIterationsExceededException(8, var51, var80);
    org.apache.commons.math.MathRuntimeException var84 = new org.apache.commons.math.MathRuntimeException(var1, var14, var80);
    java.io.EOFException var85 = org.apache.commons.math.MathRuntimeException.createEOFException("9b0551cbbfb903f5d9126caa7d2971323273d581d59418c1f", var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    double[] var2 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var4 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var5 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, var3, (java.lang.Object[])var4);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var10 = var9.getArguments();
    org.apache.commons.math.MathException var11 = new org.apache.commons.math.MathException("hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var11, 1.0d);
    org.apache.commons.math.exception.util.Localizable var14 = var11.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var18 = new org.apache.commons.math.exception.NumberIsTooSmallException(var14, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var19 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var18);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var23 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var22);
    java.lang.Object[] var26 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var27 = new org.apache.commons.math.MathException((java.lang.Throwable)var23, "hi!", var26);
    java.lang.IllegalStateException var28 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var26);
    double[] var30 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var32 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var33 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var32);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, var31, (java.lang.Object[])var32);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var38 = var37.getArguments();
    org.apache.commons.math.MathException var39 = new org.apache.commons.math.MathException("hi!", var38);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, 1.0d);
    org.apache.commons.math.exception.util.Localizable var42 = var39.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var43 = null;
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var46 = var45.getArguments();
    org.apache.commons.math.MathException var47 = new org.apache.commons.math.MathException(var43, var46);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, var30, var42, var46);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var51 = var50.getArguments();
    org.apache.commons.math.ConvergenceException var52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var19, var42, var51);
    org.apache.commons.math.exception.util.Localizable var53 = null;
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var57 = var56.getArguments();
    java.lang.IllegalStateException var58 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var57);
    java.lang.NullPointerException var59 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var53, var57);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var2, var42, var57);
    java.lang.Throwable var61 = null;
    double[] var65 = new double[] { (-1.0d), 100.0d, 10.0d};
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var69 = var68.getArguments();
    org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException("hi!", var69);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var70, 1.0d);
    org.apache.commons.math.exception.util.Localizable var73 = var70.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var74 = null;
    org.apache.commons.math.exception.util.Localizable var75 = null;
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var78 = var77.getArguments();
    org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException(var75, var78);
    java.io.EOFException var80 = org.apache.commons.math.MathRuntimeException.createEOFException(var74, var78);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(var61, var65, var73, var78);
    org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException(var42, var78);
    java.lang.IllegalArgumentException var83 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("4c5c9d44a024fd7432f8c675a953639c115e4440a998733db", var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.388721957374888d, 0.9173172759781082d);
    double[] var4 = var2.sample(33);
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var4);
    java.lang.IllegalArgumentException var6 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.6233269224174744d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3460311224366281d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-19.826122895793436d));

  }

  public void test247() {}
//   public void test247() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     double var7 = var1.nextF(0.7822517578613938d, 0.9232914105526042d);
//     var1.reSeedSecure();
//     double var10 = var1.nextChiSquare(0.7652591570218927d);
//     double var12 = var1.nextChiSquare(0.43579705878419134d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var15 = var1.nextF(0.09545784489950003d, (-0.28654240783713303d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.21459049896447446d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.6239408141128826d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0.003322471740005994d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.05333558769107856d);
// 
//   }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(10);
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
    double[] var35 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var37 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var38 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var37);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException(var35, var36, (java.lang.Object[])var37);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var43 = var42.getArguments();
    org.apache.commons.math.MathException var44 = new org.apache.commons.math.MathException("hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 1.0d);
    org.apache.commons.math.exception.util.Localizable var47 = var44.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var51 = new org.apache.commons.math.exception.NumberIsTooSmallException(var47, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var52 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var51);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var56 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var55);
    java.lang.Object[] var59 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException((java.lang.Throwable)var56, "hi!", var59);
    java.lang.IllegalStateException var61 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var59);
    double[] var63 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var64 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var65 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var66 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var65);
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, var64, (java.lang.Object[])var65);
    org.apache.commons.math.FunctionEvaluationException var70 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var71 = var70.getArguments();
    org.apache.commons.math.MathException var72 = new org.apache.commons.math.MathException("hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var72, 1.0d);
    org.apache.commons.math.exception.util.Localizable var75 = var72.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var76 = null;
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var79 = var78.getArguments();
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException(var76, var79);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var61, var63, var75, var79);
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var84 = var83.getArguments();
    org.apache.commons.math.ConvergenceException var85 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var52, var75, var84);
    org.apache.commons.math.exception.util.Localizable var86 = null;
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var90 = var89.getArguments();
    java.lang.IllegalStateException var91 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var90);
    java.lang.NullPointerException var92 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var86, var90);
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException(var35, var75, var90);
    org.apache.commons.math.FunctionEvaluationException var94 = new org.apache.commons.math.FunctionEvaluationException(0.02647243584190612d, "ccfe1a8af9", var90);
    org.apache.commons.math.FunctionEvaluationException var95 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var1, var12, "4293dd4c36b3d0b4752e0fcd282b74d98e05565360c7985317109a554a5fad60ec6fb891a2c174e9816b73b5d443f4fdaf9", var90);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.5718235734643806d, (-0.2531501296211728d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(641.1962127946947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.156483302919968d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.07208261808742246d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0720202119105501d);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(10);
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
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException("hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 1.0d);
    org.apache.commons.math.exception.util.Localizable var31 = var28.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var35 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var36 = null;
    org.apache.commons.math.exception.util.Localizable var37 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var38 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var39 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var38);
    org.apache.commons.math.ConvergenceException var40 = new org.apache.commons.math.ConvergenceException(var36, var37, var39);
    java.lang.UnsupportedOperationException var41 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var31, var39);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var45 = var44.getArguments();
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException("hi!", var45);
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var46, 1.0d);
    org.apache.commons.math.exception.util.Localizable var49 = var46.getLocalizablePattern();
    java.lang.Throwable[] var50 = var46.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(0.0d, var31, (java.lang.Object[])var50);
    org.apache.commons.math.exception.NumberIsTooSmallException var55 = new org.apache.commons.math.exception.NumberIsTooSmallException(var31, (java.lang.Number)(-1.4601391056210007d), (java.lang.Number)0.388721957374888d, true);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    org.apache.commons.math.MathException var60 = new org.apache.commons.math.MathException("hi!", var59);
    org.apache.commons.math.MathException var61 = new org.apache.commons.math.MathException((java.lang.Throwable)var60);
    java.lang.Throwable[] var62 = var61.getSuppressed();
    org.apache.commons.math.MaxIterationsExceededException var63 = new org.apache.commons.math.MaxIterationsExceededException(22, var31, (java.lang.Object[])var62);
    java.lang.Object[] var64 = var63.getArguments();
    org.apache.commons.math.MathRuntimeException var65 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var1, var9, var64);
    org.apache.commons.math.distribution.NormalDistributionImpl var71 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.9662062439493844d, 0.0067844780309888495d, 1.5707963267948966d);
    var71.setStandardDeviation(0.05004256629310059d);
    double[] var75 = var71.sample(49);
    java.lang.Throwable var78 = null;
    org.apache.commons.math.exception.util.Localizable var79 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var80 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var81 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var80);
    org.apache.commons.math.ConvergenceException var82 = new org.apache.commons.math.ConvergenceException(var78, var79, var81);
    java.lang.Throwable[] var83 = var82.getSuppressed();
    java.lang.ArithmeticException var84 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var83);
    java.lang.Object[] var85 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var83);
    org.apache.commons.math.FunctionEvaluationException var86 = new org.apache.commons.math.FunctionEvaluationException(var75, "85", (java.lang.Object[])var83);
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var1, 25.75695561357544d, "4c5c9d44a024fd7432f8c675a953639c115e4440a998733db", (java.lang.Object[])var83);
    int var88 = var1.getMaxIterations();
    int var89 = var1.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 10);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-6.07849770702273E-10d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.078497708870136E-10d));

  }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     var0.reSeed();
//     double var8 = var0.nextBeta(1.0513699053569932d, 1.0099010138502609d);
//     double var11 = var0.nextCauchy(1.5574077246549023d, 0.9748945791087863d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var14 = var0.nextGamma(0.0d, 0.13052161380527005d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-8L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.002767681494945847d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 5.905599069658631d);
// 
//   }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(12L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 12L);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getStandardDeviation();
    var0.reseedRandomGenerator(100L);
    double var5 = var0.inverseCumulativeProbability(0.43579705878419134d);
    double var6 = var0.sample();
    double var8 = var0.density((java.lang.Double)1.0003504972612298d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation((-0.01161045638873576d));
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
    assertTrue(var8 == 0.24188591444637425d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.18075812187202647d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


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
    java.lang.Object[] var14 = null;
    java.lang.IllegalArgumentException var15 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var7, var14);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var19 = var18.getArguments();
    org.apache.commons.math.MathException var20 = new org.apache.commons.math.MathException("hi!", var19);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 1.0d);
    org.apache.commons.math.exception.util.Localizable var23 = var20.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var27 = var26.getArguments();
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException(var24, var27);
    java.lang.ArithmeticException var29 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var23, var27);
    org.apache.commons.math.exception.util.Localizable var31 = null;
    java.lang.Object[] var33 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var34 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var31, var33);
    java.util.NoSuchElementException var35 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var33);
    java.lang.ArrayIndexOutOfBoundsException var36 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var23, var33);
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
    java.lang.UnsupportedOperationException var57 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var23, var54);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var62 = var61.getArguments();
    org.apache.commons.math.MathException var63 = new org.apache.commons.math.MathException("hi!", var62);
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var63, 1.0d);
    org.apache.commons.math.exception.util.Localizable var66 = var63.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var70 = new org.apache.commons.math.exception.NumberIsTooSmallException(var66, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var73 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var72);
    java.lang.Object[] var76 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var77 = new org.apache.commons.math.MathException((java.lang.Throwable)var73, "hi!", var76);
    java.lang.IllegalArgumentException var78 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var66, var76);
    org.apache.commons.math.exception.NotStrictlyPositiveException var80 = new org.apache.commons.math.exception.NotStrictlyPositiveException(var66, (java.lang.Number)572.9577951308231d);
    java.lang.Throwable var81 = null;
    org.apache.commons.math.exception.util.Localizable var82 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var83 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var84 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var83);
    org.apache.commons.math.ConvergenceException var85 = new org.apache.commons.math.ConvergenceException(var81, var82, var84);
    org.apache.commons.math.FunctionEvaluationException var86 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var57, (-9.0d), var66, var84);
    java.lang.NullPointerException var87 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var7, var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
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
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     int var7 = var0.nextInt(8, 100);
//     org.apache.commons.math.distribution.NormalDistributionImpl var10 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.8414709848078965d, 0.7491987728881979d);
//     var10.reseedRandomGenerator((-1L));
//     double var13 = var0.nextInversionDeviate((org.apache.commons.math.distribution.ContinuousDistribution)var10);
//     double var16 = var0.nextF(0.7045072201226685d, 0.6105647004975028d);
//     java.lang.String var18 = var0.nextSecureHexString(4);
//     double var21 = var0.nextUniform(0.01093233021198049d, 10.0d);
//     double var23 = var0.nextExponential(0.7414925569271285d);
//     int[] var26 = var0.nextPermutation(122, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 33);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0.425045877524947d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 1642.086041724519d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var18 + "' != '" + "0721"+ "'", var18.equals("0721"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 5.301543926600047d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 0.08089676738803224d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var26);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(106.70588656592646d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.196735266022191E46d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    double[] var4 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var6 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var7 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var6);
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(var4, var5, (java.lang.Object[])var6);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var12 = var11.getArguments();
    org.apache.commons.math.MathException var13 = new org.apache.commons.math.MathException("hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var13, 1.0d);
    org.apache.commons.math.exception.util.Localizable var16 = var13.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var16, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var21 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var20);
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
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var53 = var52.getArguments();
    org.apache.commons.math.ConvergenceException var54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var21, var44, var53);
    org.apache.commons.math.exception.util.Localizable var55 = null;
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var59 = var58.getArguments();
    java.lang.IllegalStateException var60 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var59);
    java.lang.NullPointerException var61 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var55, var59);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(var4, var44, var59);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(0.02647243584190612d, "ccfe1a8af9", var59);
    org.apache.commons.math.MathException var64 = new org.apache.commons.math.MathException("41820b4226", var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var9 = var1.nextCauchy(1.7453292519943295d, 0.006987206244798594d);
    int var12 = var1.nextBinomial(64, 0.45092366373936177d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.737913715527783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);

  }

  public void test263() {}
//   public void test263() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     org.apache.commons.math.distribution.PoissonDistributionImpl var7 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.2261911708835171d, 54.13826373338679d);
//     int[] var9 = var7.sample(22);
//     var7.reseedRandomGenerator((-1L));
//     int var12 = var0.nextInversionDeviate((org.apache.commons.math.distribution.IntegerDistribution)var7);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-8L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 1);
// 
//   }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    java.lang.Throwable[] var11 = var7.getSuppressed();
    java.lang.NullPointerException var12 = org.apache.commons.math.MathRuntimeException.createNullPointerException("d8b9700ff0", (java.lang.Object[])var11);
    java.lang.IllegalStateException var13 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("1e410e9b1053e937975a9c0285c901d7872595a836528932b", (java.lang.Object[])var11);
    org.apache.commons.math.ConvergenceException var14 = new org.apache.commons.math.ConvergenceException("27f6d8a04be5ddf5a087fb11aa4e98b886e812c3445ccd832", (java.lang.Object[])var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.4011237653239909d, (-0.3201631546921979d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4011237653239909d);

  }

  public void test266() {}
//   public void test266() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "18b6392965");
// 
//   }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     double var6 = var0.nextBeta(0.16270481739814155d, 0.3331622735724187d);
//     double var9 = var0.nextF(0.016086323390531173d, 0.3142898656313108d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-27.266073702446455d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 3.743212502814327E-8d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0.0d);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.8412001785242295E248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2000532813258409d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(2.9376377242252683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


    double[] var3 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var5 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, var4, (java.lang.Object[])var5);
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var11 = var10.getArguments();
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException("hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 1.0d);
    org.apache.commons.math.exception.util.Localizable var15 = var12.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var15, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.MathRuntimeException var20 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var19);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var24 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var23);
    java.lang.Object[] var27 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var28 = new org.apache.commons.math.MathException((java.lang.Throwable)var24, "hi!", var27);
    java.lang.IllegalStateException var29 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var27);
    double[] var31 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var33 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var34 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, var32, (java.lang.Object[])var33);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var39 = var38.getArguments();
    org.apache.commons.math.MathException var40 = new org.apache.commons.math.MathException("hi!", var39);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, 1.0d);
    org.apache.commons.math.exception.util.Localizable var43 = var40.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var47 = var46.getArguments();
    org.apache.commons.math.MathException var48 = new org.apache.commons.math.MathException(var44, var47);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, var31, var43, var47);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var52 = var51.getArguments();
    org.apache.commons.math.ConvergenceException var53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, var43, var52);
    org.apache.commons.math.exception.util.Localizable var54 = null;
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var58 = var57.getArguments();
    java.lang.IllegalStateException var59 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("hi!", var58);
    java.lang.NullPointerException var60 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var54, var58);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var3, var43, var58);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(0.02647243584190612d, "ccfe1a8af9", var58);
    org.apache.commons.math.ConvergenceException var63 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.9232914105526042d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.016114475069525663d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var6 = var5.getArguments();
    org.apache.commons.math.MathException var7 = new org.apache.commons.math.MathException("hi!", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 1.0d);
    org.apache.commons.math.exception.util.Localizable var10 = var7.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var14 = var13.getArguments();
    org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException(var11, var14);
    java.lang.ArithmeticException var16 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var10, var14);
    java.lang.Object[] var17 = null;
    java.lang.IllegalArgumentException var18 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var10, var17);
    java.lang.Throwable var20 = null;
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var22 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var23 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var22);
    org.apache.commons.math.ConvergenceException var24 = new org.apache.commons.math.ConvergenceException(var20, var21, var23);
    java.lang.Throwable[] var25 = var24.getSuppressed();
    java.lang.ArithmeticException var26 = org.apache.commons.math.MathRuntimeException.createArithmeticException("", (java.lang.Object[])var25);
    java.lang.Object[] var27 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var25);
    java.lang.NullPointerException var28 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var10, (java.lang.Object[])var25);
    org.apache.commons.math.MathRuntimeException var29 = new org.apache.commons.math.MathRuntimeException("org.apache.commons.math.exception.NumberIsTooLargeException: 63 is larger than the maximum (1): hi!", (java.lang.Object[])var25);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(1.5765956264216126E-4d, "", (java.lang.Object[])var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "6c8b540bbdf53666952550e4f8009554e071c65f5b1f40067");
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var7 = var1.nextUniform(0.0d, 1.2902572652734152d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.9431364983435647d);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.7737371454186037d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3318172342399701d);

  }

  public void test278() {}
//   public void test278() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }
// 
// 
//     org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.5574077246549023d);
//     int var2 = var1.sample();
//     double var3 = var1.getMean();
//     double var5 = var1.cumulativeProbability(1);
//     double var7 = var1.cumulativeProbability(49);
//     var1.reseedRandomGenerator((-3L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.5574077246549023d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.5387985170587266d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1.0d);
// 
//   }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.016086323390531173d, (java.lang.Number)0.8754658250345624d, false);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.8994694125526296d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7829969809343503d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    org.apache.commons.math.MathException var4 = new org.apache.commons.math.MathException("hi!", var3);
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 1.0d);
    org.apache.commons.math.exception.util.Localizable var7 = var4.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var11 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var15 = var14.getArguments();
    org.apache.commons.math.MathException var16 = new org.apache.commons.math.MathException("hi!", var15);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, 1.0d);
    org.apache.commons.math.exception.util.Localizable var19 = var16.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var23 = new org.apache.commons.math.exception.NumberIsTooSmallException(var19, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var26 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var25);
    java.lang.Object[] var29 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var30 = new org.apache.commons.math.MathException((java.lang.Throwable)var26, "hi!", var29);
    java.lang.IllegalArgumentException var31 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var19, var29);
    java.lang.NullPointerException var32 = org.apache.commons.math.MathRuntimeException.createNullPointerException(var7, var29);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var37 = var36.getArguments();
    org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException("hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 1.0d);
    org.apache.commons.math.exception.util.Localizable var41 = var38.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var45 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    java.lang.Throwable var46 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var48 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var49 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var48);
    org.apache.commons.math.ConvergenceException var50 = new org.apache.commons.math.ConvergenceException(var46, var47, var49);
    java.lang.UnsupportedOperationException var51 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var41, var49);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var55 = var54.getArguments();
    org.apache.commons.math.MathException var56 = new org.apache.commons.math.MathException("hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var56, 1.0d);
    org.apache.commons.math.exception.util.Localizable var59 = var56.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var60 = null;
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var63 = var62.getArguments();
    org.apache.commons.math.MathException var64 = new org.apache.commons.math.MathException(var60, var63);
    java.lang.ArithmeticException var65 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var59, var63);
    org.apache.commons.math.exception.util.Localizable var67 = null;
    java.lang.Object[] var69 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var70 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var67, var69);
    java.util.NoSuchElementException var71 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var69);
    java.lang.ArrayIndexOutOfBoundsException var72 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var59, var69);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var41, var69);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var76 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var75);
    java.lang.Object[] var79 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException((java.lang.Throwable)var76, "hi!", var79);
    java.lang.Object[] var81 = var76.getArguments();
    org.apache.commons.math.MathRuntimeException var82 = new org.apache.commons.math.MathRuntimeException(var41, var81);
    java.lang.RuntimeException var83 = org.apache.commons.math.MathRuntimeException.createInternalError((java.lang.Throwable)var82);
    org.apache.commons.math.MathRuntimeException var84 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var82);
    java.lang.Object[] var85 = var82.getArguments();
    java.lang.IllegalStateException var86 = org.apache.commons.math.MathRuntimeException.createIllegalStateException(var7, var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.08089676738803224d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4898110632666473d);

  }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     var0.reSeedSecure();
//     long var4 = var0.nextLong((-9L), 1L);
//     int var7 = var0.nextInt(8, 100);
//     java.lang.String var9 = var0.nextSecureHexString(10);
//     double var12 = var0.nextF(0.05056878675728234d, 2.2741981342660926d);
//     long var14 = var0.nextPoisson(0.028286235440123958d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 96);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var9 + "' != '" + "561067139a"+ "'", var9.equals("561067139a"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 5.300578905358149E-10d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
// 
//   }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 12);

  }

  public void test285() {}
//   public void test285() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     long var3 = var1.nextPoisson(1.0284080490040068d);
//     java.lang.String var5 = var1.nextHexString(17);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var1.setSecureAlgorithm("6c8b540bbdf53666952550e4f8009554e071c65f5b1f40067", "");
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 2L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var5 + "' != '" + "7b641a78a3bc27478"+ "'", var5.equals("7b641a78a3bc27478"));
// 
//   }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.527825389772612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.9173172759781081d, 9.999999999999998d);
    var3.setMean(4.993992273873336E-4d);
    double var7 = var3.inverseCumulativeProbability(0.0d);
    double var9 = var3.cumulativeProbability(0.05468262498203779d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5235506486054211d);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(3.469446951953614E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.469446951953614E-18d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
    double var3 = var2.getMean();
    double var5 = var2.probability(3);
    int[] var7 = var2.sample(8);
    int[] var9 = var2.sample(3);
    double var11 = var2.probability(63);
    int[] var13 = var2.sample(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.9448909534606371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.05465537715455142d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 5.513770465711367E-90d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.004280018915757731d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06542185350292157d);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }


    org.apache.commons.math.FunctionEvaluationException var2 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var3 = var2.getArguments();
    double[] var4 = var2.getArgument();
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var8 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var7);
    java.lang.Object[] var11 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var12 = new org.apache.commons.math.MathException((java.lang.Throwable)var8, "hi!", var11);
    java.lang.Object[] var13 = var8.getArguments();
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(0.0d);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var19 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var18);
    java.lang.Object[] var22 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var23 = new org.apache.commons.math.MathException((java.lang.Throwable)var19, "hi!", var22);
    java.lang.IllegalStateException var24 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var22);
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var27 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var28 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var29 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var28);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, var27, (java.lang.Object[])var28);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var34 = var33.getArguments();
    org.apache.commons.math.MathException var35 = new org.apache.commons.math.MathException("hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, 1.0d);
    org.apache.commons.math.exception.util.Localizable var38 = var35.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var39 = null;
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var42 = var41.getArguments();
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException(var39, var42);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var24, var26, var38, var42);
    java.lang.Object[] var45 = null;
    org.apache.commons.math.MathException var46 = new org.apache.commons.math.MathException((java.lang.Throwable)var15, var38, var45);
    org.apache.commons.math.exception.NumberIsTooLargeException var50 = new org.apache.commons.math.exception.NumberIsTooLargeException(var38, (java.lang.Number)(short)1, (java.lang.Number)(short)10, false);
    org.apache.commons.math.distribution.NormalDistributionImpl var51 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var52 = var51.getStandardDeviation();
    var51.reseedRandomGenerator(100L);
    double[] var56 = var51.sample(3);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, var56);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, var56);
    org.apache.commons.math.exception.util.Localizable var59 = var8.getLocalizablePattern();
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var65 = var64.getArguments();
    org.apache.commons.math.MathException var66 = new org.apache.commons.math.MathException("hi!", var65);
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var66, 1.0d);
    org.apache.commons.math.exception.util.Localizable var69 = var66.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var73 = new org.apache.commons.math.exception.NumberIsTooSmallException(var69, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var76 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var75);
    java.lang.Object[] var79 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException((java.lang.Throwable)var76, "hi!", var79);
    java.lang.IllegalArgumentException var81 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var69, var79);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var85 = var84.getArguments();
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException("hi!", var85);
    java.text.ParseException var87 = org.apache.commons.math.MathRuntimeException.createParseException(0, var69, var85);
    org.apache.commons.math.exception.util.LocalizedFormats[] var91 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.text.ParseException var92 = org.apache.commons.math.MathRuntimeException.createParseException(0, "hi!", (java.lang.Object[])var91);
    java.lang.IllegalStateException var93 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", (java.lang.Object[])var91);
    org.apache.commons.math.MaxIterationsExceededException var94 = new org.apache.commons.math.MaxIterationsExceededException(3, var69, (java.lang.Object[])var91);
    org.apache.commons.math.FunctionEvaluationException var95 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var2, 6.438972977369899d, var59, (java.lang.Object[])var91);
    org.apache.commons.math.ConvergenceException var96 = new org.apache.commons.math.ConvergenceException("9ae488c543450cc9ed886a27813927a3b7c6069919f5074", (java.lang.Object[])var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-54.16789370197634d), 1.7044473884905718E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7044473884905718E-9d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(29.398756588314008d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1684.4246754428157d);

  }

  public void test294() {}
//   public void test294() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var3 = var2.sample();
//     var2.reseedRandomGenerator(1L);
//     var2.setMean(0.0d);
//     double[] var9 = var2.sample(1);
//     org.apache.commons.math.exception.util.Localizable var11 = null;
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
//     java.lang.Object[] var14 = var13.getArguments();
//     org.apache.commons.math.MathException var15 = new org.apache.commons.math.MathException(var11, var14);
//     org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var9, "{0}", var14);
//     java.io.EOFException var17 = org.apache.commons.math.MathRuntimeException.createEOFException("org.apache.commons.math.MathRuntimeException$10: hi!", var14);
//     java.util.ConcurrentModificationException var18 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException("b0692563fefb9844574005e18e155ead63a3e6319f954c78342bc33f30dc50a7d0f079b657252c1fcf26d735f87842c4333d", var14);
//     java.lang.Object[] var19 = org.apache.commons.math.exception.util.ArgUtils.flatten(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.012925778077915116d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var14);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var17);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var19);
// 
//   }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    int[] var6 = var1.nextPermutation(49, 1);
    double var8 = var1.nextExponential(0.017453292519913222d);
    java.lang.String var10 = var1.nextHexString(122);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var1.nextT(1.3440585709080678E43d);
      fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException");
    } catch (org.apache.commons.math.FunctionEvaluationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.024868913495755676d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "7649ad23ba709dcf37f0690c83a5749dbe3a7818ed279248ab4dcdd5cb7035c0a3421be2cd696f1caf139e7cd88f1a7b889b9261873168857234757071"+ "'", var10.equals("7649ad23ba709dcf37f0690c83a5749dbe3a7818ed279248ab4dcdd5cb7035c0a3421be2cd696f1caf139e7cd88f1a7b889b9261873168857234757071"));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.190537109001971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8721617030714442d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var8 = var1.nextExponential(0.01572968903404401d);
    int var11 = var1.nextZipf(31, 1.044193245253925d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.022412978838030846d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 7);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 1.7737371454186037d);
    var2.setMean(0.9173172759781082d);
    double var5 = var2.getMean();
    var2.setStandardDeviation(0.04961328364381645d);
    double var9 = var2.density((java.lang.Double)2.683588335994929d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.9173172759781082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4.894318599089206E-275d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.12704536727820434d, 0.41296333710562166d);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.6502464941895341d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


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
    org.apache.commons.math.ConvergenceException var22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathRuntimeException$9: ", var18);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var28 = var27.getArguments();
    org.apache.commons.math.MathException var29 = new org.apache.commons.math.MathException("hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 1.0d);
    org.apache.commons.math.exception.util.Localizable var32 = var29.getLocalizablePattern();
    org.apache.commons.math.exception.NumberIsTooSmallException var36 = new org.apache.commons.math.exception.NumberIsTooSmallException(var32, (java.lang.Number)0.7853981633974483d, (java.lang.Number)10.0d, false);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var39 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var38);
    java.lang.Object[] var42 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException((java.lang.Throwable)var39, "hi!", var42);
    java.lang.IllegalArgumentException var44 = org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(var32, var42);
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var48 = var47.getArguments();
    org.apache.commons.math.MathException var49 = new org.apache.commons.math.MathException("hi!", var48);
    java.text.ParseException var50 = org.apache.commons.math.MathRuntimeException.createParseException(0, var32, var48);
    java.lang.Throwable var51 = null;
    org.apache.commons.math.exception.util.Localizable var52 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var53 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var54 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var53);
    org.apache.commons.math.ConvergenceException var55 = new org.apache.commons.math.ConvergenceException(var51, var52, var54);
    java.util.ConcurrentModificationException var56 = org.apache.commons.math.MathRuntimeException.createConcurrentModificationException(var32, var54);
    org.apache.commons.math.exception.NumberIsTooLargeException var60 = new org.apache.commons.math.exception.NumberIsTooLargeException(var32, (java.lang.Number)9.999999999999998d, (java.lang.Number)0.9265947336016332d, false);
    boolean var61 = var60.getBoundIsAllowed();
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    org.apache.commons.math.MathRuntimeException var66 = new org.apache.commons.math.MathRuntimeException((java.lang.Throwable)var65);
    java.lang.Object[] var69 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math.MathException var70 = new org.apache.commons.math.MathException((java.lang.Throwable)var66, "hi!", var69);
    java.lang.IllegalStateException var71 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("", var69);
    double[] var73 = new double[] { 1.0d};
    org.apache.commons.math.exception.util.Localizable var74 = null;
    org.apache.commons.math.exception.util.LocalizedFormats[] var75 = org.apache.commons.math.exception.util.LocalizedFormats.values();
    java.lang.Object[] var76 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var75);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException(var73, var74, (java.lang.Object[])var75);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var81 = var80.getArguments();
    org.apache.commons.math.MathException var82 = new org.apache.commons.math.MathException("hi!", var81);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var82, 1.0d);
    org.apache.commons.math.exception.util.Localizable var85 = var82.getLocalizablePattern();
    org.apache.commons.math.exception.util.Localizable var86 = null;
    org.apache.commons.math.FunctionEvaluationException var88 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var89 = var88.getArguments();
    org.apache.commons.math.MathException var90 = new org.apache.commons.math.MathException(var86, var89);
    org.apache.commons.math.FunctionEvaluationException var91 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, var73, var85, var89);
    java.lang.Object[] var92 = var91.getArguments();
    org.apache.commons.math.ConvergenceException var93 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var60, "{0}", var92);
    org.apache.commons.math.MathException var94 = new org.apache.commons.math.MathException((java.lang.Throwable)var22, "85", var92);
    org.apache.commons.math.MathException var95 = new org.apache.commons.math.MathException((java.lang.Throwable)var94);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


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
    org.apache.commons.math.exception.util.Localizable var28 = null;
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(100.0d);
    java.lang.Object[] var31 = var30.getArguments();
    org.apache.commons.math.MathException var32 = new org.apache.commons.math.MathException(var28, var31);
    java.lang.ArithmeticException var33 = org.apache.commons.math.MathRuntimeException.createArithmeticException(var27, var31);
    org.apache.commons.math.exception.util.Localizable var35 = null;
    java.lang.Object[] var37 = new java.lang.Object[] { 9.999999999999998d};
    java.lang.UnsupportedOperationException var38 = org.apache.commons.math.MathRuntimeException.createUnsupportedOperationException(var35, var37);
    java.util.NoSuchElementException var39 = org.apache.commons.math.MathRuntimeException.createNoSuchElementException("", var37);
    java.lang.ArrayIndexOutOfBoundsException var40 = org.apache.commons.math.MathRuntimeException.createArrayIndexOutOfBoundsException(var27, var37);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(0.6105647004975028d, var9, var37);
    org.apache.commons.math.ConvergenceException var42 = new org.apache.commons.math.ConvergenceException("", var37);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test303() {}
//   public void test303() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "df039736d316132294049297dc0ad4d687610836519badf18");
// 
//   }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(1.1249004052314096d, 3);
    double var4 = var2.probability(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.3246848026558951d);

  }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextHypergeometric(23, 100, 60);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-7L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.4233552099761912d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var8 + "' != '" + "d005ad8e3faa32b9b2d487b24734b10179005ef1269b78257"+ "'", var8.equals("d005ad8e3faa32b9b2d487b24734b10179005ef1269b78257"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 2);
// 
//   }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    int var4 = var1.nextZipf(22, 22025.465794806718d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var1.nextF(0.31247220597891073d, (-0.6296411999968107d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.7822517578613938d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7822517578613938d);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    var1.reSeedSecure();
    double var6 = var1.nextT(0.05004256629310059d);
    double var8 = var1.nextExponential(0.01572968903404401d);
    long var11 = var1.nextLong((-5L), 12L);
    var1.reSeedSecure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var1.nextT((-0.4794104429571735d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 27289.65965504149d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.022412978838030846d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 6L);

  }

  public void test309() {}
//   public void test309() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.sample();
//     var0.reseedRandomGenerator(1L);
//     var0.setMean(0.0d);
//     var0.reseedRandomGenerator(10L);
//     double var9 = var0.density((java.lang.Double)2.5537875429729695d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var12 = var0.cumulativeProbability(9.999999999999998d, 0.7078003295874091d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == (-0.5275404063287633d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 0.01530074222187635d);
// 
//   }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }


    java.lang.Object[] var1 = null;
    java.lang.IllegalStateException var2 = org.apache.commons.math.MathRuntimeException.createIllegalStateException("bd80f158b479dc7d09edd", var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test311() {}
//   public void test311() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.196541369595433d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(6.798432482298277E248d, 100.0d);
    double[] var4 = var2.sample(0);
    double var6 = var2.density((java.lang.Double)1.0E-323d);
    double var7 = var2.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var2.cumulativeProbability(0.09545784489950003d);
      fail("Expected exception of type org.apache.commons.math.ConvergenceException");
    } catch (org.apache.commons.math.ConvergenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.0410647363561958d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.03767750402853736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }


    double var2 = org.apache.commons.math.util.FastMath.max(15.757127271808354d, 1.25251991058711d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15.757127271808354d);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var3 = new org.apache.commons.math.distribution.NormalDistributionImpl(15.757127271808354d, 0.5119984566736251d, 0.0d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var1 = new org.apache.commons.math.distribution.PoissonDistributionImpl(4.5399929762484854E-5d);
    double var3 = var1.cumulativeProbability(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.7693588773968176d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.262197737717977d));

  }

  public void test319() {}
//   public void test319() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }
// 
// 
//     org.apache.commons.math.random.RandomGenerator var0 = null;
//     org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
//     double var4 = var1.nextBeta(0.5d, 9.999999999999998d);
//     var1.reSeedSecure((-2L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var8 = var1.nextPoisson((-2.2840060103019058d));
//       fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.0010657168193496807d);
// 
//   }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.758002570922701d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.05465537715455142d, 0.726808863761001d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl((-0.03970645364127918d), 51);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    org.apache.commons.math.random.RandomGenerator var0 = null;
    org.apache.commons.math.random.RandomDataImpl var1 = new org.apache.commons.math.random.RandomDataImpl(var0);
    var1.reSeed(0L);
    int[] var6 = var1.nextPermutation(49, 1);
    double var8 = var1.nextExponential(0.017453292519913222d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var10 = var1.nextPoisson(0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.024868913495755676d);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7568024953079282d));

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    org.apache.commons.math.distribution.PoissonDistributionImpl var2 = new org.apache.commons.math.distribution.PoissonDistributionImpl(0.9448909534606371d, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var2.cumulativeProbability(0.0d, (-0.01161045638873576d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.06600724576503364d, 0.3149413275154456d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.06600724576503365d);

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }
// 
// 
//     org.apache.commons.math.random.RandomDataImpl var0 = new org.apache.commons.math.random.RandomDataImpl();
//     double var3 = var0.nextCauchy(0.7853981633974483d, 0.7822517578613938d);
//     var0.reSeed();
//     long var7 = var0.nextSecureLong((-9L), (-3L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var10 = var0.nextInt(51, 12);
//       fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == (-1.3108630216311146d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-4L));
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(2.9376377242252683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.409111921960296d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.5807148347846651d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.45787717180350523d);

  }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }
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
//     var0.reSeed((-5L));
//     // The following exception wa