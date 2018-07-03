
import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test1"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    int var12 = var11.ordinal();
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.TiesStrategy var14 = var13.getTiesStrategy();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test2"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     double var11 = var0.nextCauchy((-0.812595528807679d), 31.85489831527096d);
//     int var14 = var0.nextZipf(38, 5.7998579189201327E-64d);
//     org.apache.commons.math3.distribution.IntegerDistribution var15 = null;
//     int var16 = var0.nextInversionDeviate(var15);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test3"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var3 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var2);
    org.apache.commons.math3.exception.util.ExceptionContext var4 = var3.getContext();
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var3.getContext();
    org.apache.commons.math3.exception.util.ExceptionContext var6 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test4"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test5"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     java.util.Collection var6 = null;
//     java.lang.Object[] var8 = var0.nextSample(var6, (-121));
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test6"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc((-0.3810029659138307d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.409988635491644d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test7"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    var3.addElement(0.0d);
    int var8 = var3.getExpansionMode();
    int var9 = var3.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test8"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(1.4699094585831982d, (-58.64175910126171d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4699094585831982d));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(179L, (-31));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test10"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(0.49049638908362825d, 0.6746351978480065d);
//     double var20 = var0.nextGamma((-0.035104216067321295d), 1.557219058123976d);
//     var0.reSeedSecure();
//     long var23 = var0.nextPoisson(22.140692632779277d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-92));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 24);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.533126106571059d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 3.65259564434486d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 25L);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(18L, (-122));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test12"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
//     double var7 = var0.cumulativeProbability(0.05483113556160755d);
//     double var8 = var0.getNumericalVariance();
//     boolean var9 = var0.isSupportLowerBoundInclusive();
//     double var11 = var0.cumulativeProbability(0.05338287470879381d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double[] var13 = var0.sample(123727036);
//       fail("Expected exception of type java.lang.OutOfMemoryError");
//     } catch (java.lang.OutOfMemoryError e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.4373817081192443d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.5218635024424644d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.5212865751209389d);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test13"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh(1.734996605925821d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.922654681039436d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test14"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9707742654246908d), 0.7910306863104644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9707742654246907d));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test15"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    boolean var5 = var3.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var6 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var3);
    org.apache.commons.math3.stat.ranking.NaturalRanking var7 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test16"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(2.765478388352142E-11d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-10.558229731104085d));

  }

  public void test17() {}
//   public void test17() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test17"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     var0.reSeed();
//     var0.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var23 = var0.nextHypergeometric(14, (-2), (-41));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-52));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
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
//   }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test18"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    org.apache.commons.math3.exception.MathInternalError var6 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.Number var8 = var3.getMax();
    java.lang.Number var9 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0f+ "'", var8.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1.0d+ "'", var9.equals(1.0d));

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test19"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var5 = var0.nextPoisson(0.43641834738962487d);
//     int var8 = var0.nextPascal(15, 0.0d);
//     org.apache.commons.math3.distribution.IntegerDistribution var9 = null;
//     int var10 = var0.nextInversionDeviate(var9);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test20"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var15 = var0.nextGaussian(115.45919913034874d, 0.17453292519943295d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var18 = var0.nextUniform(0.9983063366701814d, 1.1824871132044225E-9d);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 115.18225325546747d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test21"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    double var5 = var0.getNumericalVariance();
    var0.reseedRandomGenerator(100L);
    double var9 = var0.probability(1.7713659069359526E-40d);
    boolean var10 = var0.isSupportLowerBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-109), 1.0000001f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test23"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5603862049849778d, 1.2898381901895386E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5603862049849778d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test24"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test25"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(1.6207146136291868E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-30));

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test26"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(88, (-95));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8360));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test27"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-116), 76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test28"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-70), 9.999999f, 6.8719485E10f, (-41));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test29"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(1.007551992255483d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.738887982598931d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test30"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.MathArithmeticException var2 = new org.apache.commons.math3.exception.MathArithmeticException();
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(short)(-1), var7);
    org.apache.commons.math3.exception.MathIllegalStateException var9 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var2, var3, var7);
    org.apache.commons.math3.exception.MathArithmeticException var10 = new org.apache.commons.math3.exception.MathArithmeticException(var1, var7);
    org.apache.commons.math3.exception.NullArgumentException var11 = new org.apache.commons.math3.exception.NullArgumentException(var0, var7);
    org.apache.commons.math3.exception.util.Localizable var12 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var16 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var12, (java.lang.Number)(-1.0d), (java.lang.Number)30, false);
    var11.addSuppressed((java.lang.Throwable)var16);
    boolean var18 = var16.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test31"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    var1.contract();
    double[] var3 = var1.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.discardFrontElements((-89));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test32"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(46, (-618816519));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test33"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-0.8765514250489875d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4.9E-324d));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test34"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, var1, var2, (java.lang.Number)6L);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test35"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-0.6185298926079591d), (java.lang.Number)0.99999994f, false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test36"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(0.04835074986971023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0032436320236386d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test37"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.9223500676052069d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8253875658056686d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test38"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    double[] var11 = var3.getElements();
    double[] var12 = var3.getElements();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    var16.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var22 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    int var23 = var22.getNumElements();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-84));
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test39"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    double[] var9 = var3.getElements();
    org.apache.commons.math3.exception.util.Localizable var10 = null;
    org.apache.commons.math3.exception.util.Localizable var11 = null;
    org.apache.commons.math3.exception.util.Localizable var12 = null;
    org.apache.commons.math3.exception.util.Localizable var13 = null;
    org.apache.commons.math3.exception.util.Localizable var14 = null;
    java.lang.Object[] var16 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var17 = new org.apache.commons.math3.exception.MathArithmeticException(var14, var16);
    org.apache.commons.math3.exception.MathInternalError var18 = new org.apache.commons.math3.exception.MathInternalError(var13, var16);
    org.apache.commons.math3.exception.MathIllegalArgumentException var19 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var12, var16);
    org.apache.commons.math3.exception.MathInternalError var20 = new org.apache.commons.math3.exception.MathInternalError(var11, var16);
    org.apache.commons.math3.exception.MathArithmeticException var21 = new org.apache.commons.math3.exception.MathArithmeticException(var10, var16);
    org.apache.commons.math3.exception.util.ExceptionContext var22 = var21.getContext();
    boolean var23 = var3.equals((java.lang.Object)var22);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test40"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.7590788170261643d, (java.lang.Number)80, (java.lang.Number)5.442027134218949d);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test41"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-2.698200072758446d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.0d));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test42"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(1.2898381901895386E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test43"); }


    float var2 = org.apache.commons.math3.util.FastMath.max((-1.4E-45f), (-100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4E-45f));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test44"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos((-1.0868611997591276E159d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999999999999971d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test45"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(2.8E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-45f);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test46"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(2.765478388352142E-11d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.120508200469428E-11d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test47"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("org.apache.commons.math3.exception.OutOfRangeException: -165,140.372 out of [-10, 18] range");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test48"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(11L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 44L);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test49"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(1738435790633256704L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1738435790633256714L);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test50"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(3628800.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test51"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign((-0.011754646363680897d), 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.011754646363680897d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test52"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    org.apache.commons.math3.exception.MathInternalError var6 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var3);
    java.lang.Number var7 = var3.getArgument();
    org.apache.commons.math3.exception.NotPositiveException var9 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var10 = var9.getBoundIsAllowed();
    java.lang.Number var11 = var9.getArgument();
    org.apache.commons.math3.exception.util.ExceptionContext var12 = var9.getContext();
    var3.addSuppressed((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0f)+ "'", var11.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test53"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    int var7 = var3.getExpansionMode();
    double var9 = var3.substituteMostRecentElement(1.5205356215110556E-9d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-3));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test54"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMax();
    java.lang.Number var6 = var3.getArgument();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.0f+ "'", var5.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1.0d+ "'", var6.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.apache.commons.math3.exception.NumberIsTooLargeException: 1 is larger than the maximum (0)"+ "'", var7.equals("org.apache.commons.math3.exception.NumberIsTooLargeException: 1 is larger than the maximum (0)"));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test55"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var15 = var0.nextGaussian(115.45919913034874d, 0.17453292519943295d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var19 = var0.nextUniform(0.4748415556977728d, (-1.3602867522220448d), true);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 115.18225325546747d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test56"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(46, (-92));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 92);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test57"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
    double var7 = var0.cumulativeProbability(0.05483113556160755d);
    double var8 = var0.getSupportLowerBound();
    double var10 = var0.cumulativeProbability((-1.5707963246583885d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5218635024424644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.05811498303162288d);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test58"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     org.apache.commons.math3.distribution.NormalDistribution var5 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var7 = var5.inverseCumulativeProbability(0.4373817081192443d);
//     var5.reseedRandomGenerator(100L);
//     double var10 = var5.getStandardDeviation();
//     double var11 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var5);
//     double var12 = var5.getMean();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.6591722380939804d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.602270660734528d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.0d);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test59"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, 0L);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math3.util.ArithmeticUtils.pow(var5, 0L);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var4, var7);
    java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var4, 0L);
    org.apache.commons.math3.exception.NumberIsTooSmallException var12 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.5845023998721857E-9d), (java.lang.Number)var4, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test60() {}
//   public void test60() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test60"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(3.0032436320236386d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test61"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    boolean var4 = var2.equals((java.lang.Object)2.5f);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "AVERAGE"+ "'", var5.equals("AVERAGE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "AVERAGE"+ "'", var6.equals("AVERAGE"));

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test62"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)0.05633238136817824d, (java.lang.Number)(-4.9E-324d), (java.lang.Number)3.6006261582884225d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test63"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-1.0406427605518116d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24.919440919093844d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test64"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(65, 67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test65"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(2.993222846126381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6869024067587826d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test66"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)2.993222846126381d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test67"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)0.6875549183425804d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test68"); }


    int var1 = org.apache.commons.math3.util.FastMath.round((-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test69"); }


    long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24L);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test70"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(6469856410481231872L, 2653561339983737856L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6469856410481231872L);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test71"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(0.9999999987695397d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test72"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    float var11 = var3.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = var3.copy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double var20 = var16.addElementRolling(0.0d);
    double var22 = var16.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var23 = var16.copy();
    boolean var24 = var3.equals((java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.discardFrontElements(150);
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
    assertTrue(var11 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test73"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var8);
    double[] var10 = var9.getInternalValues();
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    var9.addElements(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test74"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    java.lang.Class var23 = var21.getDeclaringClass();
    java.lang.String var24 = var21.name();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "AVERAGE"+ "'", var24.equals("AVERAGE"));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test75"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign((-0.3795219383900589d), 1.8153955257644046E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3795219383900589d);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test76"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, var1, (java.lang.Number)(-276308126), (java.lang.Number)0.7242239390346705d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test77"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3978253612069936d, (-0.6185298926079591d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.22070453140096552d));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test78"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(2.0827949296372137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.99677584400507d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test79"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-118), 50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5900));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test80"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(0.007110163502012132d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.008022825173647623d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test81"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test82"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(671893169, 372);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 671892797);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test83"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-41), (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test84"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees(0.05745482469513025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.2919189676949796d);

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test85"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acos(4.934802200544612d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test86"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent((-100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test87"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(0.999058177164406d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9990581771644061d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test88"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, var1, (java.lang.Number)0.2679228811801085d, true);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test89"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getNumericalVariance();
    double var7 = var0.getNumericalMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var9 = var0.sample((-19));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test90"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    boolean var4 = var0.isSupportConnected();
    double var5 = var0.getSupportLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == Double.NEGATIVE_INFINITY);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test91"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(3.120508200469428E-11d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24.19044014959354d);

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test92"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     double var19 = var0.nextChiSquare(1.4699094585831982d);
//     var0.reSeed();
//     var0.reSeedSecure(44L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-69));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 91);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.35300672616711454d);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test93"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements(63);
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

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-5900));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test95"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin(2.7755575615628914E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test96"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7266655891834315d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test97"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-38), 57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 57);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test98"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(8.635823353996738d, 0.9104493169731528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9999987733545931d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test99"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(0.04835074986971023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.048313124584442924d);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test100"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     var0.reSeedSecure((-1L));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var19 = var0.nextZipf((-3), 0.013576434429086761d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-106));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 83);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test101"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(0.10244782475453244d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.11519683264539304d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test102"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    var3.addElement((-0.035104216067321295d));
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test103"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)4.934802200544612d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test104"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(0.4875474306513526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5070935047870807d);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test105"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     var0.reSeedSecure(179L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextHypergeometric(46, (-976171513), (-100));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.0445653614189854E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-2.1268525991581995d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
// 
//   }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test106"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     double var5 = var0.nextF(0.14782604738794858d, 3.1415926535897936d);
//     java.lang.String var7 = var0.nextHexString(21);
//     double var10 = var0.nextWeibull(1.5607966601082315d, 0.49049638908362825d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var13 = var0.nextF(0.0d, 4.440892098500626E-16d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.027647068843887828d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.18088535564688388d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "2a4fc9569db8d1de29d40"+ "'", var7.equals("2a4fc9569db8d1de29d40"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 0.6746047870801731d);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test107"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test108"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.4E-45f, 1.3552527E-20f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test109"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    boolean var6 = var3.getBoundIsAllowed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    boolean var8 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test110"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(1738435790633256704L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1738435790633256704L);

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test111"); }
// 
// 
//     org.apache.commons.math3.random.RandomGenerator var0 = null;
//     org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
//     int var4 = var1.nextInt((-70), 10);
//     int var7 = var1.nextInt((-73), (-5));
//     double var10 = var1.nextCauchy(1.9559339836596301d, 1.0306980272969342d);
//     double var12 = var1.nextChiSquare(2.7755575615628914E-17d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-49));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-23));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 27.51991958685364d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0.0d);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test112"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test113"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     double var13 = var0.nextCauchy(0.0d, 9.332621544395286E157d);
//     double var15 = var0.nextChiSquare(1.2183422052836203E-9d);
//     int var18 = var0.nextInt(1292, 2147483647);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-31));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-1.896930644797258E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1.9946535330696554E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 609103558);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test114"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(0.0488752287255467d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test115"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(0.23524054291408542d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.23972982624364422d);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test116"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(1.01072661873565d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.006097429997948822d));

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-30), 0.99999994f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test118"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.05633238136817824d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.831855303638183E-4d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-79), 1.0000001f, 2.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test120"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    double[] var16 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var17 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double[] var18 = var17.getInternalValues();
    double[] var19 = var13.rank(var18);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test121"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)0);
    java.lang.Number var2 = var1.getMax();
    java.lang.Number var3 = var1.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test122() {}
//   public void test122() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test122"); }
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
//     org.apache.commons.math3.exception.MathArithmeticException var11 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var6);
//     org.apache.commons.math3.exception.util.ExceptionContext var12 = var11.getContext();
//     org.apache.commons.math3.exception.util.Localizable var13 = null;
//     org.apache.commons.math3.stat.ranking.NaNStrategy[] var14 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
//     org.apache.commons.math3.exception.MathIllegalStateException var15 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var11, var13, (java.lang.Object[])var14);
// 
//   }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test123"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    var3.contract();
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var12);
    org.apache.commons.math3.stat.ranking.TiesStrategy var14 = var13.getTiesStrategy();
    double[] var17 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var17);
    double[] var19 = var18.getInternalValues();
    double[] var20 = var13.rank(var19);
    org.apache.commons.math3.stat.ranking.NaNStrategy var21 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var22 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var23 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var22);
    org.apache.commons.math3.stat.ranking.TiesStrategy var24 = var23.getTiesStrategy();
    double[] var27 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var28 = new org.apache.commons.math3.util.ResizableDoubleArray(var27);
    double[] var29 = var28.getInternalValues();
    double[] var30 = var23.rank(var29);
    org.apache.commons.math3.stat.ranking.NaNStrategy var31 = var23.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var32 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var31);
    org.apache.commons.math3.stat.ranking.TiesStrategy var33 = var32.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var34 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21, var33);
    java.lang.Class var35 = var33.getDeclaringClass();
    boolean var36 = var3.equals((java.lang.Object)var33);
    org.apache.commons.math3.util.ResizableDoubleArray var37 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var38 = var3.getNumElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test124"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(Float.POSITIVE_INFINITY, 1.6155871E-27f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Float.POSITIVE_INFINITY);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test125"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum((-0.6555877865481398d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test126"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(1.2183422052836203E-9d, 1.2898381901895386E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9098412969835513d));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test127"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    boolean var4 = var0.isSupportConnected();
    double var6 = var0.probability((-1.127403745963549d));
    var0.reseedRandomGenerator((-180L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test128"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.075802138772222E83d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test129"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(32.0f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 32.0f);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test130"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(0.038581377435943975d, 1.1931993509471547E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.038581377435943975d);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test131"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.23794004E27f, 1.4210855E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.23794004E27f);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test132"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-84), (-110));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test133"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    org.apache.commons.math3.random.RandomGenerator var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var11);
    int var13 = var9.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var16 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15);
    org.apache.commons.math3.stat.ranking.TiesStrategy var17 = var16.getTiesStrategy();
    boolean var19 = var17.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var14, var17);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var22 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var23 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var24 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var23);
    org.apache.commons.math3.stat.ranking.TiesStrategy var25 = var24.getTiesStrategy();
    boolean var27 = var25.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var28 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var22, var25);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var29 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var25);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    org.apache.commons.math3.util.ResizableDoubleArray var32 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var33 = var32.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var34 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var35 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var34);
    org.apache.commons.math3.stat.ranking.TiesStrategy var36 = var35.getTiesStrategy();
    double[] var39 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var40 = new org.apache.commons.math3.util.ResizableDoubleArray(var39);
    double[] var41 = var40.getInternalValues();
    double[] var42 = var35.rank(var41);
    org.apache.commons.math3.stat.ranking.NaNStrategy var43 = var35.getNanStrategy();
    int var44 = var43.ordinal();
    org.apache.commons.math3.random.RandomGenerator var45 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var46 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var43, var45);
    int var47 = var43.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var48 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var49 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var50 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var49);
    org.apache.commons.math3.stat.ranking.TiesStrategy var51 = var50.getTiesStrategy();
    boolean var53 = var51.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var54 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var48, var51);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var55 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var43, var51);
    double[] var58 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var59 = new org.apache.commons.math3.util.ResizableDoubleArray(var58);
    double[] var60 = var59.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var61 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var62 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var61);
    org.apache.commons.math3.stat.ranking.TiesStrategy var63 = var62.getTiesStrategy();
    double[] var66 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var67 = new org.apache.commons.math3.util.ResizableDoubleArray(var66);
    double[] var68 = var67.getInternalValues();
    double[] var69 = var62.rank(var68);
    double var70 = var55.mannWhitneyUTest(var60, var68);
    double var71 = var30.mannWhitneyU(var33, var68);
    double[] var74 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var75 = new org.apache.commons.math3.util.ResizableDoubleArray(var74);
    double[] var76 = var75.getInternalValues();
    double var77 = var29.mannWhitneyU(var68, var76);
    org.apache.commons.math3.util.ResizableDoubleArray var78 = new org.apache.commons.math3.util.ResizableDoubleArray(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var78.discardFrontElements(28);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 150.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 2.0d);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test134"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-86), (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test135"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var15 = var0.nextGaussian(115.45919913034874d, 0.17453292519943295d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var18 = var0.nextWeibull((-1.8626690397476047d), (-0.9098412969835513d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 115.18225325546747d);

  }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test136"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.8969306447972577E157d), (java.lang.Number)(-1L), true);
//     java.lang.Number var5 = var4.getMin();
//     java.lang.Number var6 = var4.getArgument();
//     java.lang.String var7 = var4.toString();
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test137"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians((-3.1163541260031398d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.054390640156865025d));

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test138"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     double var16 = var0.nextChiSquare(1.0d);
//     double var18 = var0.nextT(0.671779336150837d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-60));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.3331168383272715d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 1.277030087020704d);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test139"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-116), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test140"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test141"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { (-1L)};
    org.apache.commons.math3.exception.MaxCountExceededException var9 = new org.apache.commons.math3.exception.MaxCountExceededException(var5, (java.lang.Number)(byte)(-1), var8);
    org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException(var4, var8);
    org.apache.commons.math3.exception.MaxCountExceededException var11 = new org.apache.commons.math3.exception.MaxCountExceededException(var2, (java.lang.Number)2.993222846126381d, var8);
    org.apache.commons.math3.exception.MathIllegalArgumentException var12 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var1, var8);
    org.apache.commons.math3.exception.MathIllegalStateException var13 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test142"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)92, (java.lang.Number)0.9889052880156644d, false);
    boolean var5 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test143"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.9983063366701814d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01742373251841767d);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test144"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     long var14 = var0.nextPoisson(2.220446049250313E-16d);
//     double var17 = var0.nextUniform(2.022730427113892d, 9.869604401089358d);
//     long var20 = var0.nextLong(2653561339983737856L, 6917529027641081856L);
//     var0.reSeedSecure();
//     java.util.Collection var22 = null;
//     java.lang.Object[] var24 = var0.nextSample(var22, (-276308199));
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test145"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin((-2.3239247451534874E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.3239247451534874E-9d));

  }

  public void test146() {}
//   public void test146() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test146"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt(100, 14348907);
//     org.apache.commons.math3.distribution.IntegerDistribution var6 = null;
//     int var7 = var0.nextInversionDeviate(var6);
// 
//   }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test147"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    var1.contract();
    double[] var3 = var1.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var1.substituteMostRecentElement(0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalStateException");
    } catch (org.apache.commons.math3.exception.MathIllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test148"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos(0.4438138088761582d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1109461987101525d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test149"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(0.057859117847628164d, 5.7998579189201327E-64d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.06521424301437656d));

  }

  public void test150() {}
//   public void test150() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test150"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     double var11 = var0.nextCauchy((-0.812595528807679d), 31.85489831527096d);
//     int var14 = var0.nextZipf(38, 5.7998579189201327E-64d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var16 = var0.nextChiSquare((-0.5802933415744765d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.4349133655973679E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-7.074977287409775d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 22.627261373584894d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 29);
// 
//   }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test151"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(0.58701019592818d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5327130897509201d));

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test152"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(3.6006261582884225d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 35.62115790762603d);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test153"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     double var13 = var0.nextCauchy(0.0d, 9.332621544395286E157d);
//     double var15 = var0.nextChiSquare(1.2183422052836203E-9d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var19 = var0.nextUniform(2.723562786617452E22d, 0.5d, true);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-19));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-1.896930644797258E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1.9946535330696554E-9d);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test154"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(0.40396181553681765d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5678042461411295d);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test155"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     var0.reSeed();
//     org.apache.commons.math3.distribution.NormalDistribution var19 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var21 = var19.probability(0.0d);
//     double var23 = var19.cumulativeProbability(2.220446049250313E-16d);
//     double var24 = var19.getStandardDeviation();
//     double var25 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var19);
//     java.util.Collection var26 = null;
//     java.lang.Object[] var28 = var0.nextSample(var26, 0);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test156"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-28), 1260L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test157"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, var1);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test158"); }


    int var1 = org.apache.commons.math3.util.FastMath.round((-1.1368685E-13f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test159"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-0.5954271189370909d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.950971845987844d);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test160"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     var0.reSeed();
//     long var14 = var0.nextPoisson(2.220446049250313E-16d);
//     double var17 = var0.nextUniform(2.022730427113892d, 9.869604401089358d);
//     long var20 = var0.nextLong(2653561339983737856L, 6917529027641081856L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var23 = var0.nextF((-2.698200072758446d), 0.99677584400507d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-62));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 88);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.6353957458957114d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 4318986500309125120L);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test161"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1368684E-13f, (-0.5954271189370909d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368683E-13f);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test162"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(25L, 44L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1100L);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test163"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.007110163502012132d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.007110163502012132d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test164"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(1.4081694507521445d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.094740349655029d);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test165"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(6548440436062887936L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6548440436062887936L);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test166"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    double[] var9 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
    double[] var11 = var10.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var10);
    var10.setElement(0, Double.NaN);
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setNumElements(739176776);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test167"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test168"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 90);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test169"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-1.2630956032107625d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2630956032107625d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test170"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(1.766644200655088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.170318942725924d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test171"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(0.5212865751209389d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.8621274493189532d));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test172"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    double var13 = var0.nextExponential(0.002514663766804972d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0012812541972116295d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test173"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    var3.clear();
    var3.addElement(0.11751201469396123d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0f);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test174"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     double var7 = var0.nextChiSquare(115.45706259336124d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var10 = var0.nextPermutation((-116), 40);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-2));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 102.02910678311949d);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test175"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(1.9946535330696554E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.1359030627651384E-25d);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test176"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-0.35913938368747433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test177() {}
//   public void test177() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test177"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     double var16 = var0.nextChiSquare(1.0d);
//     var0.reSeedSecure();
//     java.util.Collection var18 = null;
//     java.lang.Object[] var20 = var0.nextSample(var18, 34);
// 
//   }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test178"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("AVERAGE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test179"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(0.4434956580178252d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.903257199688792d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test180"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(0.06368447421581384d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.7538144789874677d));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test181"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(9.181822810259439d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.9073942581974372d);

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test182"); }
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
//       int var20 = var0.nextInt(102, (-618816519));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-6));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test183"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(1.6155871E-27f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test184"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)0.7209210669314736d, (java.lang.Number)10L, var3);
    java.lang.Number var5 = var4.getLo();
    java.lang.Number var6 = var4.getArgument();
    java.lang.Number var7 = var4.getLo();
    java.lang.Number var8 = var4.getArgument();
    java.lang.Number var9 = var4.getHi();
    java.lang.Throwable[] var10 = var4.getSuppressed();
    java.lang.Number var11 = var4.getHi();
    org.apache.commons.math3.exception.MaxCountExceededException var13 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)14348907);
    var4.addSuppressed((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10L+ "'", var5.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.7209210669314736d+ "'", var6.equals(0.7209210669314736d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10L+ "'", var7.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.7209210669314736d+ "'", var8.equals(0.7209210669314736d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test185"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var1 = var0.getNumericalMean();
    double var2 = var0.getNumericalMean();
    boolean var3 = var0.isSupportConnected();
    double var5 = var0.cumulativeProbability((-1.5707963267948966d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.inverseCumulativeProbability(2.7070690411132308d);
      fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.058114982783409486d);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test186"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     var0.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var19 = var0.nextCauchy(2.811764803218308d, (-0.5954672480415791d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-57));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "00d9012"+ "'", var15.equals("00d9012"));
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test187"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5000002f);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test188"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.25894751937915056d, 9.542704755906336E-110d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.355320435726588E-111d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test189"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-15), 1738435790633256704L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 486019073);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test190"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.002514663766804972d, 76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9000262220874446E20d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test191"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, 0L);
    java.math.BigInteger var9 = null;
    java.math.BigInteger var11 = org.apache.commons.math3.util.ArithmeticUtils.pow(var9, 0L);
    java.math.BigInteger var12 = null;
    java.math.BigInteger var14 = org.apache.commons.math3.util.ArithmeticUtils.pow(var12, 0L);
    java.math.BigInteger var15 = org.apache.commons.math3.util.ArithmeticUtils.pow(var11, var14);
    java.math.BigInteger var16 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var11);
    java.math.BigInteger var18 = org.apache.commons.math3.util.ArithmeticUtils.pow(var11, 102);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var20 = org.apache.commons.math3.util.ArithmeticUtils.pow(var11, (-180L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test192"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var12 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var13 = new org.apache.commons.math3.util.ResizableDoubleArray(var12);
    java.lang.Object var14 = null;
    boolean var15 = var13.equals(var14);
    double[] var16 = var13.getElements();
    double[] var17 = var13.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var9, var13);
    int var19 = var9.start();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test193"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(902511928144852736L, 6469856410481231871L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6469856410481231871L);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test194"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(0.9231377113408568d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9231377113408569d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test195"); }


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
    double[] var21 = var3.getInternalValues();
    double[] var24 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var25 = new org.apache.commons.math3.util.ResizableDoubleArray(var24);
    double[] var26 = var25.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var27 = new org.apache.commons.math3.util.ResizableDoubleArray(var25);
    var25.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var31 = new org.apache.commons.math3.util.ResizableDoubleArray(var25);
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var31.setExpansionFactor((-2.8E-45f));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test196"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1((-0.7211094712148152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5137874821894273d));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test197"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs((-276308126));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 276308126);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test198"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test199"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.02565475975848403d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02565475975848403d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test200"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-70));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test201"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil((-0.054390640156865025d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test202"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos((-0.9070706940443594d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6160558109648833d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test203"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(1738435790633256714L, 20922789888000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1738435790633256714L);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test204"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.2388082580833257d), 1.8755066060221833E-62d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.8236156220057326E-63d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test205"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(170);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test206"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(63.434948822922d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.543628889412541E27d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test207"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(57, (-618816519));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-618816462));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test208"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    double var4 = var0.getMean();
    double var6 = var0.probability(0.013576851530780462d);
    var0.reseedRandomGenerator((-3042L));
    double var9 = var0.getMean();
    double var10 = var0.getSupportUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == Double.POSITIVE_INFINITY);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test209"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(90, 1410065408);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test210"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(0.011754646363680897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.44350668134898d));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test211"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var2 = var1.getBoundIsAllowed();
    boolean var3 = var1.getBoundIsAllowed();
    org.apache.commons.math3.exception.NotPositiveException var5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)2.5f);
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test212"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.5678042461411295d, 0.39650789231781614d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7989835156709091d);

  }

  public void test213() {}
//   public void test213() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test213"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log(0.05066297352460297d, (-0.987192433351468d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test214"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var5.contract();
    var5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test215"); }


    double var2 = org.apache.commons.math3.util.FastMath.min((-1.0743009312480056d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0743009312480056d));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test216"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4364183473896249d);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test217"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(0.23016257191669184d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2343611258628269d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test218"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(1.5047858965555605E-6d, 9.550073087603984d, 1.4570293567706412d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test219"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    java.lang.Class var12 = var11.getDeclaringClass();
    java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "AVERAGE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var16 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "MAXIMAL");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test220"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var10 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var11 = var10.getMax();
    java.lang.Number var12 = var10.getArgument();
    org.apache.commons.math3.exception.MathInternalError var13 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var10);
    java.lang.Throwable[] var14 = var10.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalStateException var15 = new org.apache.commons.math3.exception.MathIllegalStateException(var6, (java.lang.Object[])var14);
    org.apache.commons.math3.exception.MathArithmeticException var16 = new org.apache.commons.math3.exception.MathArithmeticException(var5, (java.lang.Object[])var14);
    org.apache.commons.math3.exception.MathIllegalStateException var17 = new org.apache.commons.math3.exception.MathIllegalStateException(var4, (java.lang.Object[])var14);
    org.apache.commons.math3.exception.NullArgumentException var18 = new org.apache.commons.math3.exception.NullArgumentException(var3, (java.lang.Object[])var14);
    org.apache.commons.math3.exception.MaxCountExceededException var19 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)9.536743E-7f, (java.lang.Object[])var14);
    org.apache.commons.math3.exception.MathArithmeticException var20 = new org.apache.commons.math3.exception.MathArithmeticException(var0, (java.lang.Object[])var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0f+ "'", var11.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 1.0d+ "'", var12.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test221"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var12 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var13 = new org.apache.commons.math3.util.ResizableDoubleArray(var12);
    java.lang.Object var14 = null;
    boolean var15 = var13.equals(var14);
    double[] var16 = var13.getElements();
    double[] var17 = var13.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var9, var13);
    var9.setElement(17, 10.037949929128091d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test222"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    double var7 = var0.nextExponential(0.49049638908362825d);
    double var9 = var0.nextExponential(1.5713845747492456d);
    var0.reSeedSecure();
    int var13 = var0.nextInt(0, 2009);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4875474306513526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 77);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test223"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-5735339L), 20L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4883341929649856143L));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test224"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-110), (-85));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9350);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test225"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(31.85489831527096d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.555972858489473d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test226"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var2 = var1.getInternalValues();
    int var3 = var1.start();
    int var4 = var1.getNumElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNumElements((-67));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test227"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test228"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var21 = var0.nextPascal((-108), 0.057859117847628164d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-121));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 35);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
// 
//   }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test229"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
//     java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, 0L);
//     java.math.BigInteger var9 = null;
//     java.math.BigInteger var11 = org.apache.commons.math3.util.ArithmeticUtils.pow(var9, 0L);
//     java.math.BigInteger var12 = null;
//     java.math.BigInteger var14 = org.apache.commons.math3.util.ArithmeticUtils.pow(var12, 0L);
//     java.math.BigInteger var15 = org.apache.commons.math3.util.ArithmeticUtils.pow(var11, var14);
//     java.math.BigInteger var16 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var11);
//     java.math.BigInteger var17 = null;
//     java.math.BigInteger var18 = org.apache.commons.math3.util.ArithmeticUtils.pow(var16, var17);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test230"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-86));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test231"); }


    org.apache.commons.math3.stat.inference.MannWhitneyUTest var0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var3 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var5 = var4.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var4);
    double var8 = var4.addElementRolling(0.0d);
    double[] var9 = var4.getElements();
    double[] var10 = var4.getElements();
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double var20 = var14.substituteMostRecentElement(2.220446049250313E-16d);
    int var21 = var14.start();
    double[] var22 = var14.getElements();
    double var23 = var0.mannWhitneyUTest(var10, var22);
    org.apache.commons.math3.util.ResizableDoubleArray var24 = new org.apache.commons.math3.util.ResizableDoubleArray(var22);
    var24.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.6985353583033387d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test232"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.40396181553681765d);
    boolean var3 = var2.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test233"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.density(0.5210953054937475d);
    boolean var5 = var0.isSupportLowerBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.34829387335298634d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test234"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    var3.addElement(0.07722223669402022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test235"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.7910306863104644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7910306863104644d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test236"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.9593976412963791d, (-0.20056532714869982d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0083480142534536d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test237"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt((-17.110652411272213d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.576848324454827d));

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test238"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    var3.setElement(8995410, 2.9073942581974372d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test239"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)1.2849654264778793E-9d, (java.lang.Number)(-276308199), (java.lang.Number)1.1368685E-13f);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test240"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     var0.reSeed();
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-57));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 76);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test241"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(115.18225325546747d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.272140874989314E49d);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test242"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    float var11 = var3.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = var3.copy();
    org.apache.commons.math3.exception.util.Localizable var13 = null;
    org.apache.commons.math3.exception.util.Localizable var14 = null;
    org.apache.commons.math3.exception.MathArithmeticException var15 = new org.apache.commons.math3.exception.MathArithmeticException();
    org.apache.commons.math3.exception.util.Localizable var16 = null;
    org.apache.commons.math3.exception.util.Localizable var17 = null;
    java.lang.Object[] var20 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var21 = new org.apache.commons.math3.exception.MaxCountExceededException(var17, (java.lang.Number)(short)(-1), var20);
    org.apache.commons.math3.exception.MathIllegalStateException var22 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var15, var16, var20);
    org.apache.commons.math3.exception.MathArithmeticException var23 = new org.apache.commons.math3.exception.MathArithmeticException(var14, var20);
    org.apache.commons.math3.exception.NullArgumentException var24 = new org.apache.commons.math3.exception.NullArgumentException(var13, var20);
    boolean var25 = var12.equals((java.lang.Object)var20);
    
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
    assertTrue(var11 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test243"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("MAXIMAL");
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test244"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh(1.4232935162240434d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test245"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(0.4364183473896249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.46641240431020003d);

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test246"); }
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
//       int var15 = var0.nextHypergeometric(11, (-86), (-17));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-111));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 38);
// 
//   }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test247"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var15 = var0.nextGaussian(115.45919913034874d, 0.17453292519943295d);
    var0.reSeed(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 115.18225325546747d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test248"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(1.0176351058563242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.01748141168821878d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test249"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.22067136191984704d, 0.9999999987695397d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.142915609964377E-10d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test250"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(3, (-108));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test251"); }


    java.lang.Number var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.7888610291361848d, false);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test252"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-2.043676936805938d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.043676936805938d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test253"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test254"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-4.44350668134898d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.163263597059507d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test255"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(5.7998579189201327E-64d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 145.6076125311045d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test256"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.8146973E-6f);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test257"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(1.9559339836596301d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6708678203577977d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test258"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt(0.1800842607063294d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5647097062075537d);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test259"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-25), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-25));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test260"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.4037050693245728d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.33911521895332675d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test261"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3841858E-7f);

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test262"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     org.apache.commons.math3.exception.util.Localizable var3 = null;
//     org.apache.commons.math3.exception.util.Localizable var4 = null;
//     java.lang.Object[] var7 = new java.lang.Object[] { 10};
//     org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var4, (java.lang.Number)(short)(-1), var7);
//     java.lang.Throwable[] var9 = var8.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalArgumentException var10 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var3, (java.lang.Object[])var9);
//     org.apache.commons.math3.exception.MathIllegalStateException var11 = new org.apache.commons.math3.exception.MathIllegalStateException(var2, (java.lang.Object[])var9);
//     org.apache.commons.math3.exception.MaxCountExceededException var12 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)1.1920929E-7f, (java.lang.Object[])var9);
//     org.apache.commons.math3.exception.MathInternalError var13 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var12);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test263"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("4e2dc6f");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test264"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(1.1955418896349321d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.020866142319644235d);

  }

  public void test265() {}
//   public void test265() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test265"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     long var16 = var0.nextPoisson(3.141592653589793d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextZipf(486019073, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
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
//     assertTrue(var11 == 3);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 4L);
// 
//   }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test266"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-113400L), 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5615139912354365440L));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test267"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(1.1368685E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test268"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(1260L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1260L);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test269"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    org.apache.commons.math3.stat.ranking.NaturalRanking var23 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.NaNStrategy var24 = var23.getNanStrategy();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test270"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(5.075802138772222E83d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 83.70550468440095d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test271"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(1.1368683E-13f, 25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.814697E-6f);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test272"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    var3.addElement(1.0176351058563242d);
    var3.setElement(3, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test273"); }


    java.lang.Number var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)(-3.1163541260031398d), (java.lang.Number)36);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test274"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    double[] var9 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setContractionCriteria(1.4210856E-14f);
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
    assertNotNull(var9);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test275"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.5666361150813415d, 0.9999999981250657d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.3007201520888525E-9d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test276"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-1.5823779268171105d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test277"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.8793843777996115d, 0.5000000000000001d, 0.3978253612069936d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test278"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var1.getTiesStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test279"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(2.0f, 3.814697E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0f);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test280"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), (-1.1368685E-13f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test281"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent((-1.9223264562192064d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test282"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs((-60));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 60);

  }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test283"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     org.apache.commons.math3.distribution.NormalDistribution var5 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var7 = var5.inverseCumulativeProbability(0.4373817081192443d);
//     var5.reseedRandomGenerator(100L);
//     double var10 = var5.getStandardDeviation();
//     double var11 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var5);
//     long var14 = var0.nextLong(0L, 1L);
//     int var17 = var0.nextInt((-34), 15);
//     var0.reSeed(100L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("9c2536019d2f71376ce59fdd0c36d6e93e79cee2ed4936ea15306fc638311b52f88a4", "97484060c7d0dfb70d784");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.414443821479215d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.4586138267729316d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-19));
// 
//   }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test284"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 128);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test285"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    org.apache.commons.math3.random.RandomGenerator var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var11);
    java.lang.String var13 = var9.toString();
    org.apache.commons.math3.random.RandomGenerator var14 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var15 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var14);
    org.apache.commons.math3.stat.ranking.TiesStrategy var16 = var15.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var17 = var15.getTiesStrategy();
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "MAXIMAL"+ "'", var13.equals("MAXIMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test286"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var8);
    int var10 = var9.getNumElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test287"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    float var4 = var3.getExpansionFactor();
    var3.addElement(9.0d);
    double[] var9 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
    double[] var11 = var10.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var10);
    double var14 = var10.addElementRolling(0.0d);
    double[] var15 = var10.getElements();
    var10.setExpansionMode(0);
    double var19 = var10.addElementRolling((-1.0d));
    int var20 = var10.start();
    double var22 = var10.substituteMostRecentElement(0.5218635024424644d);
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var10);
    double[] var24 = var3.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test288"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin(0.48098503567265183d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5017779017888566d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(8995410, 646);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test290"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.6555877865481398d), 1.1824871132044223E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.3712118752265255E-10d));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test291"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)(-16), (java.lang.Number)(-0.06521424301437656d), (java.lang.Number)1.5707963267948966d);
    java.lang.Number var5 = var4.getHi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.5707963267948966d+ "'", var5.equals(1.5707963267948966d));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test292"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(0, (-67));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test293"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("97484060c7d0dfb70d784");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test294"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(1292, 779874230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 779875522);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test295"); }


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
    var3.addElement(0.9953222650189527d);
    
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

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test296"); }


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
    org.apache.commons.math3.exception.util.Localizable var21 = null;
    org.apache.commons.math3.exception.util.Localizable var22 = null;
    org.apache.commons.math3.exception.util.Localizable var23 = null;
    org.apache.commons.math3.exception.util.Localizable var24 = null;
    org.apache.commons.math3.exception.util.Localizable var25 = null;
    java.lang.Object[] var27 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var28 = new org.apache.commons.math3.exception.MathArithmeticException(var25, var27);
    org.apache.commons.math3.exception.MathInternalError var29 = new org.apache.commons.math3.exception.MathInternalError(var24, var27);
    org.apache.commons.math3.exception.MathIllegalArgumentException var30 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var23, var27);
    org.apache.commons.math3.exception.MathInternalError var31 = new org.apache.commons.math3.exception.MathInternalError(var22, var27);
    org.apache.commons.math3.exception.NullArgumentException var32 = new org.apache.commons.math3.exception.NullArgumentException(var21, var27);
    boolean var33 = var10.equals((java.lang.Object)var21);
    float var34 = var10.getExpansionFactor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2.0f);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(99, (-2.8E-45f), 1.6155871E-27f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test298"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(8995410);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test299"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(39, (-102));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test300"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-0.10264926182796444d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test301"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-58.64175910126171d), 0.8611658242554283d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test302"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(1.2630956032107625d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9530324660594021d);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test303"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(24L, 7L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7L);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test304"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    org.apache.commons.math3.random.RandomGenerator var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var11);
    int var13 = var9.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var16 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15);
    org.apache.commons.math3.stat.ranking.TiesStrategy var17 = var16.getTiesStrategy();
    boolean var19 = var17.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var14, var17);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var21 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var17);
    java.lang.Class var22 = var9.getDeclaringClass();
    int var23 = var9.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var24 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var25 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var24);
    org.apache.commons.math3.stat.ranking.TiesStrategy var26 = var25.getTiesStrategy();
    boolean var28 = var26.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var29 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var26);
    org.apache.commons.math3.stat.ranking.TiesStrategy var30 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var31 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var30);
    org.apache.commons.math3.stat.ranking.TiesStrategy var32 = var31.getTiesStrategy();
    double[] var35 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var36 = new org.apache.commons.math3.util.ResizableDoubleArray(var35);
    double[] var37 = var36.getInternalValues();
    double[] var38 = var31.rank(var37);
    org.apache.commons.math3.stat.ranking.NaNStrategy var39 = var31.getNanStrategy();
    int var40 = var39.ordinal();
    org.apache.commons.math3.random.RandomGenerator var41 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var42 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var39, var41);
    double[] var45 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var46 = new org.apache.commons.math3.util.ResizableDoubleArray(var45);
    double[] var47 = var46.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var48 = new org.apache.commons.math3.util.ResizableDoubleArray(var46);
    double var50 = var46.addElementRolling(0.0d);
    double var52 = var46.substituteMostRecentElement(2.220446049250313E-16d);
    int var53 = var46.start();
    var46.contract();
    org.apache.commons.math3.stat.ranking.TiesStrategy var55 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var56 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var55);
    org.apache.commons.math3.stat.ranking.TiesStrategy var57 = var56.getTiesStrategy();
    double[] var60 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var61 = new org.apache.commons.math3.util.ResizableDoubleArray(var60);
    double[] var62 = var61.getInternalValues();
    double[] var63 = var56.rank(var62);
    org.apache.commons.math3.stat.ranking.NaNStrategy var64 = var56.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var65 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var66 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var65);
    org.apache.commons.math3.stat.ranking.TiesStrategy var67 = var66.getTiesStrategy();
    double[] var70 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var71 = new org.apache.commons.math3.util.ResizableDoubleArray(var70);
    double[] var72 = var71.getInternalValues();
    double[] var73 = var66.rank(var72);
    org.apache.commons.math3.stat.ranking.NaNStrategy var74 = var66.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var75 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var74);
    org.apache.commons.math3.stat.ranking.TiesStrategy var76 = var75.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var77 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var64, var76);
    java.lang.Class var78 = var76.getDeclaringClass();
    boolean var79 = var46.equals((java.lang.Object)var76);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var80 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var39, var76);
    org.apache.commons.math3.stat.ranking.NaturalRanking var81 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var39);
    double[] var84 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var85 = new org.apache.commons.math3.util.ResizableDoubleArray(var84);
    java.lang.Object var86 = null;
    boolean var87 = var85.equals(var86);
    double[] var88 = var85.getElements();
    double[] var89 = var81.rank(var88);
    double[] var90 = var29.rank(var89);
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test305"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(2L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test306"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    double var5 = var0.getNumericalVariance();
    var0.reseedRandomGenerator(100L);
    double var9 = var0.probability(1.7713659069359526E-40d);
    double var10 = var0.sample();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.4705756905309871d);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test307"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    int var7 = var3.getExpansionMode();
    double var9 = var3.substituteMostRecentElement(1.5205356215110556E-9d);
    int var10 = var3.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var11 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test308"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var2 = var1.getBoundIsAllowed();
    org.apache.commons.math3.exception.NotPositiveException var4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.5d);
    var1.addSuppressed((java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test309"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var2 = var1.getBoundIsAllowed();
    java.lang.Number var3 = var1.getArgument();
    java.lang.Number var4 = var1.getMin();
    java.lang.Number var5 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + (-1.0f)+ "'", var3.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0+ "'", var5.equals(0));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test310"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(0L, 6469856410481231872L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test311"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(2147483647, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2147483647);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test312"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(61, (-50));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 111);

  }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test313"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 6917529027641081856L);
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test314"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-2));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test315"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-52), (-111));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test316"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)61, (java.lang.Number)(-0.9707742654246908d), false);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test317"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var14 = var0.nextT(0.7209210669314736d);
    long var16 = var0.nextPoisson(2.7495685662163734E-10d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSecureAlgorithm("7668140", "5858e69");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.58701019592818d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test318"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-121), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test319"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = var1.copy();
    int var5 = var4.getExpansionMode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.discardMostRecentElements(66);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test320"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh((-0.13928060890758354d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.138386904159894d));

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test321"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(1.000000000000013d, 1.359867214518029d, (-0.35913938368747433d));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test322"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1931993509471547E-9d, (-0.9529248449235921d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1931993509471544E-9d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test323"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    java.lang.Object[] var4 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var5 = new org.apache.commons.math3.exception.MathArithmeticException(var2, var4);
    org.apache.commons.math3.exception.MathInternalError var6 = new org.apache.commons.math3.exception.MathInternalError(var1, var4);
    org.apache.commons.math3.exception.MathIllegalArgumentException var7 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var4);
    java.lang.Throwable[] var8 = var7.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test324"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(180L, 18L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test325"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(28.103372960898604d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.036223496402024886d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test326"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(67, (-85));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-85));

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test327"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(0.49049638908362825d, 0.6746351978480065d);
//     double var19 = var0.nextT(1.2483666764136787d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var21 = var0.nextChiSquare((-0.4394688580721162d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-108));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 64);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.533126106571059d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.5021289850615019d);
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test328"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    int var4 = var1.start();
    float var5 = var1.getContractionCriteria();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.5f);

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test329"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 6L);
// 
//   }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test330"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 0.02501823732763558d, 0.01742373251841767d, (-102));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test331"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     long var20 = var0.nextSecureLong(1L, 6548440436062887936L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var23 = var0.nextGaussian(0.8175605202409767d, (-0.9927171106284476d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-38));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 87);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1.4709228568158544E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 5913684852646750208L);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test332"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.3452526613163927E49d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test333"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent((-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test334"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    org.apache.commons.math3.stat.ranking.NaNStrategy var23 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var24 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var25 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var24);
    org.apache.commons.math3.stat.ranking.TiesStrategy var26 = var25.getTiesStrategy();
    boolean var28 = var26.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var29 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var23, var26);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var30 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var26);
    org.apache.commons.math3.stat.ranking.NaturalRanking var31 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.NaNStrategy var32 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var33 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var32);
    org.apache.commons.math3.stat.ranking.TiesStrategy var34 = var33.getTiesStrategy();
    boolean var36 = var34.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var34);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test335"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(32.0f, 1.1368683E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368683E-13f);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test336"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(36);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test337"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    boolean var3 = var0.isSupportUpperBoundInclusive();
    double var4 = var0.getSupportLowerBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test338"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.6978320005436003E-9d, (java.lang.Number)0.06390823168443646d, false);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test339"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.984807753012208d);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test340"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    java.lang.Class var11 = var9.getDeclaringClass();
    java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "MAXIMAL");
    java.lang.Enum var15 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "MAXIMAL");
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test341"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     java.lang.Object[] var3 = new java.lang.Object[] { (-1L)};
//     org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)(byte)(-1), var3);
//     org.apache.commons.math3.exception.util.Localizable var5 = null;
//     org.apache.commons.math3.exception.util.Localizable var6 = null;
//     java.lang.Number var7 = null;
//     org.apache.commons.math3.stat.ranking.NaNStrategy[] var8 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
//     org.apache.commons.math3.exception.MaxCountExceededException var9 = new org.apache.commons.math3.exception.MaxCountExceededException(var6, var7, (java.lang.Object[])var8);
//     org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var4, var5, (java.lang.Object[])var8);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test342"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(53, 1.3552527E-20f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test343"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.4364183473896249d, 1.6063064259940278d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.436418347389625d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test344"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(0.16198331648313202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4024715101508826d);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test345"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(2.5000002f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test346"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(8616612);
    double[] var4 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var4);
    double[] var6 = var5.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var7 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double var9 = var5.addElementRolling(0.0d);
    double var11 = var5.substituteMostRecentElement(2.220446049250313E-16d);
    int var12 = var5.start();
    double[] var13 = var5.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var1, var5);
    boolean var16 = var5.equals((java.lang.Object)3.814697E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test347"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)0.011283416866837995d, (java.lang.Number)(-618816519), false);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test348"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc((-0.5137874821894273d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.532532173776735d);

  }

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test349"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.0d, 22.140692632779277d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test350"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    var1.contract();
    double[] var3 = var1.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setContractionCriteria(2.3841858E-7f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test351"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(34, (-1.1368685E-13f), 1.0000001f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test352"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)0.3795219383900589d);

  }

  public void test353() {}
//   public void test353() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test353"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     double var20 = var0.nextF(0.4434956580178252d, 2.2172257481304234d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var23 = var0.nextSecureLong(6469856410481231872L, 25L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-42));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 66);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1.4709228568158544E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 0.014781717171873793d);
// 
//   }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test354"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, (-114));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test355"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)12, (java.lang.Number)1.223524972501522d, true);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test356"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(1.7453292519943295d, 0.0d);
//     double var14 = var0.nextWeibull(115.45919913034874d, 0.011283416866837995d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-81));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.011176630166877767d);
// 
//   }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test357"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-276308199));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test358"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    var3.addElement(1.0176351058563242d);
    double[] var9 = var3.getElements();
    float var10 = var3.getContractionCriteria();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.5f);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test359"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-2.0d));
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test360"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble(468);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test361"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var14 = var0.nextT(0.7209210669314736d);
    long var16 = var0.nextPoisson(2.7495685662163734E-10d);
    var0.reSeedSecure(15L);
    double var21 = var0.nextUniform(0.16198331648313202d, 9.550073087603984d);
    var0.reSeed((-180L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.58701019592818d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 7.699025119553728d);

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test362"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     long var20 = var0.nextSecureLong(1L, 6548440436062887936L);
//     org.apache.commons.math3.distribution.IntegerDistribution var21 = null;
//     int var22 = var0.nextInversionDeviate(var21);
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test363"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(28.103372960898604d, 1.3874488093885192E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5.021687057134169E-10d));

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test364"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)(short)10);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test365"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(180L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test366"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(0.49049638908362825d, 0.6746351978480065d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextPascal(5, (-0.8427007929497151d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-68));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 94);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.533126106571059d);
// 
//   }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test367"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs((-172L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 172L);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test368"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)7239.0451181011d, (java.lang.Number)(-0.5954271189370909d), (java.lang.Number)(-0.7211094712148152d));
    org.apache.commons.math3.exception.MaxCountExceededException var5 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)(-0.6734916263077155d));
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Number var7 = var3.getHi();
    org.apache.commons.math3.exception.util.ExceptionContext var8 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (-0.7211094712148152d)+ "'", var7.equals((-0.7211094712148152d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test369"); }


    double var2 = org.apache.commons.math3.special.Erf.erf((-0.3810029659138307d), (-1.5845023998721857E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4099886337037246d);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test370"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test371"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin(0.04299280739295786d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04300606293972238d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test372"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)1.5131459651989522E-9d, (java.lang.Number)4.9E-324d, true);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test373"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)24.19044014959354d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test374"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    var3.setNumElements(0);
    var3.contract();
    double[] var12 = var3.getInternalValues();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test375"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(0.011220233953944515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011219763137438986d);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test376"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)68, var2, false);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test377"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-95), 0.0f, 1.1368683E-13f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test378() {}
//   public void test378() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test378"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)(-115), (java.lang.Number)1.1071487177940904d, (java.lang.Number)(-0.22070453140096552d));
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test379"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = var3.copy();
    org.apache.commons.math3.distribution.NormalDistribution var10 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var12 = var10.probability(0.0d);
    double var13 = var10.getNumericalMean();
    double var14 = var10.getMean();
    double var16 = var10.density(3628800.0d);
    boolean var17 = var9.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test380"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.5510054571984723d, 2.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5510054571984723d);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test381"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-0.1388341757445717d), (java.lang.Number)0.436418347389625d, (java.lang.Number)1);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test382"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(5.892635459924929d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.0d);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test383"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, 172L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 172L);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-618816519), (-5735339L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test385"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.999058177164406d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6926761582285449d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test386"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(39, 2113318);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 82419402);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test387"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.MathIllegalStateException var2 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, var1);

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test388"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     long var8 = var0.nextSecureLong(6469856410481231871L, 6469856410481231872L);
//     long var11 = var0.nextSecureLong((-552473126826409984L), 20L);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-66));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 6469856410481231872L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-288911044138658496L));
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test389"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(251.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7);

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test390"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     org.apache.commons.math3.distribution.NormalDistribution var5 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var7 = var5.inverseCumulativeProbability(0.4373817081192443d);
//     var5.reseedRandomGenerator(100L);
//     double var10 = var5.getStandardDeviation();
//     double var11 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var5);
//     org.apache.commons.math3.distribution.NormalDistribution var12 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var14 = var12.probability(0.0d);
//     double var15 = var12.getNumericalMean();
//     boolean var16 = var12.isSupportLowerBoundInclusive();
//     double var17 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var20 = var0.nextPermutation((-118), (-73));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.8338318736806765E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.8155498894946935d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.7124062211976872d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.5372766026214364d);
// 
//   }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test391"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var10 = new org.apache.commons.math3.exception.MathArithmeticException(var7, var9);
    org.apache.commons.math3.exception.MathInternalError var11 = new org.apache.commons.math3.exception.MathInternalError(var6, var9);
    org.apache.commons.math3.exception.MathIllegalArgumentException var12 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var5, var9);
    org.apache.commons.math3.exception.MathInternalError var13 = new org.apache.commons.math3.exception.MathInternalError(var4, var9);
    org.apache.commons.math3.exception.MaxCountExceededException var14 = new org.apache.commons.math3.exception.MaxCountExceededException(var2, (java.lang.Number)2.022730427113892d, var9);
    org.apache.commons.math3.exception.NullArgumentException var15 = new org.apache.commons.math3.exception.NullArgumentException(var1, var9);
    org.apache.commons.math3.exception.MathInternalError var16 = new org.apache.commons.math3.exception.MathInternalError(var0, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test392"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    boolean var6 = var0.isSupportLowerBoundInclusive();
    double var8 = var0.density(150.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test393"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.6192762121501395d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test394"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    java.lang.Class var11 = var9.getDeclaringClass();
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var12);
    org.apache.commons.math3.stat.ranking.TiesStrategy var14 = var13.getTiesStrategy();
    double[] var17 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var17);
    double[] var19 = var18.getInternalValues();
    double[] var20 = var13.rank(var19);
    org.apache.commons.math3.stat.ranking.NaNStrategy var21 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21);
    org.apache.commons.math3.stat.ranking.TiesStrategy var23 = var22.getTiesStrategy();
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var23);
    org.apache.commons.math3.stat.ranking.TiesStrategy var25 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var26 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var25);
    org.apache.commons.math3.stat.ranking.TiesStrategy var27 = var26.getTiesStrategy();
    double[] var30 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var31 = new org.apache.commons.math3.util.ResizableDoubleArray(var30);
    double[] var32 = var31.getInternalValues();
    double[] var33 = var26.rank(var32);
    org.apache.commons.math3.stat.ranking.NaNStrategy var34 = var26.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var35 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var36 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var35);
    org.apache.commons.math3.stat.ranking.TiesStrategy var37 = var36.getTiesStrategy();
    double[] var40 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var41 = new org.apache.commons.math3.util.ResizableDoubleArray(var40);
    double[] var42 = var41.getInternalValues();
    double[] var43 = var36.rank(var42);
    org.apache.commons.math3.stat.ranking.NaNStrategy var44 = var36.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var45 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var44);
    org.apache.commons.math3.stat.ranking.TiesStrategy var46 = var45.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var47 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var34, var46);
    int var48 = var46.ordinal();
    int var49 = var46.ordinal();
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var46);
    int var51 = var9.ordinal();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test395"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)1.9559339836596301d);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test396"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("f1af639");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test397() {}
//   public void test397() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test397"); }
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
//       int var14 = var0.nextInt(671892797, (-78));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-46));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
// 
//   }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test398"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)94, (java.lang.Number)40, false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test399"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.MathArithmeticException var1 = new org.apache.commons.math3.exception.MathArithmeticException();
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var7 = new org.apache.commons.math3.exception.MaxCountExceededException(var3, (java.lang.Number)(short)(-1), var6);
    org.apache.commons.math3.exception.MathIllegalStateException var8 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var1, var2, var6);
    org.apache.commons.math3.exception.MathArithmeticException var9 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var6);
    org.apache.commons.math3.exception.util.ExceptionContext var10 = var9.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test400"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.28423701592246897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.28054253213617175d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test401"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(5.892635459924929d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.773703344095937d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test402"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(2.922654681039436d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.46577750540930335d);

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test403"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
//     double var7 = var0.cumulativeProbability(0.05483113556160755d);
//     double var8 = var0.getNumericalVariance();
//     boolean var9 = var0.isSupportLowerBoundInclusive();
//     double var11 = var0.cumulativeProbability(0.05338287470879381d);
//     double var12 = var0.getSupportUpperBound();
//     double var13 = var0.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.4373817081192443d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.5218635024424644d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.5212865751209389d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-0.11695608494089252d));
// 
//   }

  public void test404() {}
//   public void test404() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test404"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     int var5 = var0.nextPascal(36, 0.5210953054937475d);
//     double var8 = var0.nextGaussian((-0.6555877865481398d), 5.551115123125783E-17d);
//     org.apache.commons.math3.distribution.NormalDistribution var11 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
//     double var12 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var11);
//     boolean var13 = var11.isSupportConnected();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-2.520435198698096d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 28);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-0.6555877865481397d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 11.713049317025744d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == true);
// 
//   }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test405"); }


    long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2432902008176640000L);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test406"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
    double var7 = var0.cumulativeProbability(0.05483113556160755d);
    double var8 = var0.getNumericalVariance();
    boolean var9 = var0.isSupportLowerBoundInclusive();
    double var11 = var0.cumulativeProbability(0.05338287470879381d);
    double var12 = var0.getSupportUpperBound();
    boolean var13 = var0.isSupportConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5218635024424644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5212865751209389d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test407"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     long var20 = var0.nextSecureLong(1L, 6548440436062887936L);
//     double var22 = var0.nextChiSquare(0.3701217123534604d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var25 = var0.nextInt(486019073, 0);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-7));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 89);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1.4709228568158544E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 421545722317455872L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 0.0014266832677723345d);
// 
//   }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test408"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(0.04835074986971023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.938893903907228E-18d);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test409"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-270L), (-172L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 46440L);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test410"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.99999994f, (java.lang.Number)1.4E-45f, (java.lang.Number)1.7453292519943295d);
    java.lang.Number var4 = var3.getLo();
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var9 = new org.apache.commons.math3.exception.MathArithmeticException(var6, var8);
    org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var3, var5, var8);
    java.lang.Number var11 = var3.getHi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.4E-45f+ "'", var4.equals(1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.7453292519943295d+ "'", var11.equals(1.7453292519943295d));

  }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test411"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log10((-0.1388341757445717d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test412"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.4364183473896249d);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test413"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test414"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt((-2.698200072758446d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.3921671545520182d));

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test415"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    int var10 = var9.ordinal();
    java.lang.Class var11 = var9.getDeclaringClass();
    java.lang.String var12 = var9.toString();
    org.apache.commons.math3.stat.ranking.NaNStrategy var13 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var15 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var14);
    org.apache.commons.math3.stat.ranking.TiesStrategy var16 = var15.getTiesStrategy();
    boolean var18 = var16.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var19 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var13, var16);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var20 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var16);
    int var21 = var16.ordinal();
    
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "MAXIMAL"+ "'", var12.equals("MAXIMAL"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 3);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test416"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.02501823732763558d, 2.7495685662163734E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.02501823732763558d);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test417"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    float var9 = var3.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-55));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.5f);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test418"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(1L, (-18L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19L);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test419"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    boolean var3 = var2.isSupportConnected();
    boolean var4 = var2.isSupportLowerBoundInclusive();
    boolean var5 = var2.isSupportConnected();
    double var6 = var2.getNumericalMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test420"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-0.99999994f), (java.lang.Number)1.6978320005436003E-9d, true);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test421"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(6548440436062887936L, 25L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test422"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)1074L, (java.lang.Number)(-110), true);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test423"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)14348907);
    java.lang.Number var2 = var1.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 14348907+ "'", var2.equals(14348907));

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test424"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    boolean var3 = var2.isSupportConnected();
    boolean var4 = var2.isSupportConnected();
    double var6 = var2.cumulativeProbability(115.45706259336124d);
    double var7 = var2.getSupportUpperBound();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var2.cumulativeProbability(8.142915609964377E-10d, (-0.9707742654246908d));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test425"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(0.019603110745413113d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9998078651774984d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test426"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0, 71744535);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 71744535);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test427"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-106), 20922789888000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test428"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)", "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-10));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 32);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
// 
//   }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test429"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter((-100.0f), 0.4364183473896249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-99.99999f));

  }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test430"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     double var13 = var0.nextCauchy(0.0d, 9.332621544395286E157d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var16 = var0.nextWeibull(150.0d, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-27));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-1.896930644797258E157d));
// 
//   }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test431"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test432"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = var13.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaNStrategy var15 = var13.getNanStrategy();
    org.apache.commons.math3.random.RandomGenerator var16 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var17 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var15, var16);
    java.lang.Class var18 = var15.getDeclaringClass();
    java.lang.String var19 = var15.toString();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "MAXIMAL"+ "'", var19.equals("MAXIMAL"));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test433"); }


    org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.6717793361508371d, 0.9999999987695397d, 9.048652788680128E-47d);
    boolean var4 = var3.isSupportUpperBoundInclusive();
    double var6 = var3.inverseCumulativeProbability(0.0488752287255467d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-0.9840792609599985d));

  }

  public void test434() {}
//   public void test434() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test434"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     double var13 = var0.nextCauchy(0.0d, 9.332621544395286E157d);
//     double var15 = var0.nextChiSquare(1.2183422052836203E-9d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var18 = var0.nextLong((-1L), (-270L));
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == (-1.896930644797258E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 1.9946535330696554E-9d);
// 
//   }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test435"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(111, 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 102);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test436"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(609103558, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 609103558);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test437"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)2.0d, (java.lang.Number)0.5510054571984723d, (java.lang.Number)24L);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test438"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp((-0.11695608494089252d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1169560849408925d));

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test439"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    double[] var11 = var3.getElements();
    double[] var12 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var13 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.discardMostRecentElements(646);
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test440"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getNumericalMean();
    double var6 = var0.getSupportUpperBound();
    var0.reseedRandomGenerator((-270L));
    double var9 = var0.getStandardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test441"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    org.apache.commons.math3.exception.util.Localizable var11 = null;
    org.apache.commons.math3.stat.ranking.TiesStrategy[] var13 = org.apache.commons.math3.stat.ranking.TiesStrategy.values();
    org.apache.commons.math3.exception.MaxCountExceededException var14 = new org.apache.commons.math3.exception.MaxCountExceededException(var11, (java.lang.Number)9.332621544395286E157d, (java.lang.Object[])var13);
    boolean var15 = var3.equals((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var3.getElement(28);
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
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test442"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
    org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    double[] var18 = var11.rank(var17);
    org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    java.lang.Class var23 = var21.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var25 = java.lang.Enum.<java.lang.Enum>valueOf(var23, "97484060c7d0dfb70d784");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test443"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)0.6428720507104048d, (java.lang.Number)(-103), false);
    java.lang.Number var4 = var3.getMin();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-103)+ "'", var4.equals((-103)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.6428720507104048d+ "'", var5.equals(0.6428720507104048d));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test444"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test445"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(0.49049638908362825d, 0.6746351978480065d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextInt(65, 27);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-69));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 0.533126106571059d);
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test446"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, 25L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test447"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh(1.6978320005436003E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test448"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 105);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test449"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    double var7 = var0.nextExponential(0.49049638908362825d);
    var0.reSeed(6917529027641081856L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.nextZipf((-55), 15.548633291782874d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.43641834738962487d);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test450"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(76, 53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 23);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test451"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(-0.99999994f));

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test452"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0.44721359549995804d);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test453"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(4524524291707106304L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4524524291707106304L);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test454"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(9.831855303638183E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test455"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(92.2139997708197d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.4466195087939075d));

  }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test456"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.5d, (-1.8626690397476047d), 0.37863028386090464d, (-618816462));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test457"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     org.apache.commons.math3.distribution.NormalDistribution var5 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var7 = var5.inverseCumulativeProbability(0.4373817081192443d);
//     var5.reseedRandomGenerator(100L);
//     double var10 = var5.getStandardDeviation();
//     double var11 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var5);
//     long var14 = var0.nextLong(0L, 1L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var17 = var0.nextPermutation(60, 0);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.4776505520593147E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 7.453236823929583d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 1.3286256221461807d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
// 
//   }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test458"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000001f, 1.0306980272969342d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000002f);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test459"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(105.57848626407264d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 105.57848626407265d);

  }

  public void test460() {}
//   public void test460() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test460"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     int var18 = var0.nextZipf(15, 1.1656246617612935d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var21 = var0.nextSecureLong(902511928144852736L, (-27L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-50));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "f484042"+ "'", var15.equals("f484042"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == 2);
// 
//   }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test461"); }


    double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.34829387335298634d, 1.557219058123976d, 0.40306506468729153d, 1552941056);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.9532272223875713d);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test462"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(0.041897618811773944d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 31.195724084720606d);

  }

  public void test463() {}
//   public void test463() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test463"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
//     double var5 = var0.getSupportUpperBound();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double[] var7 = var0.sample(123727036);
//       fail("Expected exception of type java.lang.OutOfMemoryError");
//     } catch (java.lang.OutOfMemoryError e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.5000000000000001d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == Double.POSITIVE_INFINITY);
// 
//   }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test464"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0L, 1260L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test465"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextCauchy(1.8755066060221833E-62d, 1.5845023998721857E-9d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var17 = var0.nextZipf((-67), 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-77));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 42);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-2.3239247451534874E-9d));
// 
//   }

  public void test466() {}
//   public void test466() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test466"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     int var6 = var0.nextInt(30, 1410065408);
//     double var8 = var0.nextExponential(0.05066297352460297d);
//     double var11 = var0.nextF(6.662756980709212E-6d, 1.0176351058563242d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var13 = var0.nextExponential((-1.5116541008517133d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.62908927261115E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 678587898);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.025078089847394472d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
// 
//   }

  public void test467() {}
//   public void test467() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test467"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-6.035291569863828d), 1.9946535330696554E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test468"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = var3.copy();
    double var11 = var3.addElementRolling((-0.35913938368747433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);

  }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test469"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     double var5 = var0.nextF(0.14782604738794858d, 3.1415926535897936d);
//     java.lang.String var7 = var0.nextHexString(21);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var10 = var0.nextLong(203679771771073536L, 3L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.1148660851199541d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.004032024162574257d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "d6094e8493806309bfc1e"+ "'", var7.equals("d6094e8493806309bfc1e"));
// 
//   }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test470"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(1.1368683E-13f, 99.99999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368683E-13f);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test471"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    var3.contract();
    var3.clear();
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test472"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy[] var3 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
    org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, var2, (java.lang.Object[])var3);
    org.apache.commons.math3.exception.MathIllegalArgumentException var5 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test473"); }


    org.apache.commons.math3.stat.inference.MannWhitneyUTest var0 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var3 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var5 = var4.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var4);
    double var8 = var4.addElementRolling(0.0d);
    double[] var9 = var4.getElements();
    double[] var10 = var4.getElements();
    double[] var13 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var13);
    double[] var15 = var14.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var14);
    double var18 = var14.addElementRolling(0.0d);
    double var20 = var14.substituteMostRecentElement(2.220446049250313E-16d);
    int var21 = var14.start();
    double[] var22 = var14.getElements();
    double var23 = var0.mannWhitneyUTest(var10, var22);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var24 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var27 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var28 = new org.apache.commons.math3.util.ResizableDoubleArray(var27);
    double[] var29 = var28.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var30 = new org.apache.commons.math3.util.ResizableDoubleArray(var28);
    double var32 = var28.addElementRolling(0.0d);
    double[] var33 = var28.getElements();
    double[] var34 = var28.getElements();
    double[] var37 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var38 = new org.apache.commons.math3.util.ResizableDoubleArray(var37);
    double[] var39 = var38.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var40 = new org.apache.commons.math3.util.ResizableDoubleArray(var38);
    double var42 = var38.addElementRolling(0.0d);
    double var44 = var38.substituteMostRecentElement(2.220446049250313E-16d);
    int var45 = var38.start();
    double[] var46 = var38.getElements();
    double var47 = var24.mannWhitneyUTest(var34, var46);
    org.apache.commons.math3.util.ResizableDoubleArray var48 = new org.apache.commons.math3.util.ResizableDoubleArray(var34);
    double[] var51 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var52 = new org.apache.commons.math3.util.ResizableDoubleArray(var51);
    double[] var53 = var52.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var54 = new org.apache.commons.math3.util.ResizableDoubleArray(var52);
    double var56 = var52.addElementRolling(0.0d);
    double[] var57 = var52.getElements();
    var52.setExpansionMode(0);
    double var61 = var52.addElementRolling((-1.0d));
    double[] var62 = var52.getInternalValues();
    double var63 = var0.mannWhitneyU(var34, var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.6985353583033387d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.6985353583033387d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 5.5d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test474"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs((-72));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 72);

  }

  public void test475() {}
//   public void test475() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test475"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.pow((-0.6212103591877448d), 4.9E-324d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test476"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(32.94631867978169d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.034250360612386E14d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test477"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    double var7 = var0.nextExponential(0.49049638908362825d);
    double var9 = var0.nextExponential(1.5713845747492456d);
    org.apache.commons.math3.distribution.NormalDistribution var10 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var12 = var10.probability(0.0d);
    double var13 = var10.getNumericalMean();
    boolean var14 = var10.isSupportLowerBoundInclusive();
    double var15 = var0.nextInversionDeviate((org.apache.commons.math3.distribution.RealDistribution)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4875474306513526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.7660231971355804d));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test478"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    double var5 = var0.getNumericalVariance();
    boolean var6 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test479"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     var0.reseedRandomGenerator(100L);
//     double var5 = var0.getMean();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.4261554477290024d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.0d);
// 
//   }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test480"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-0.11695608494089252d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 75.08448920675438d);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test481"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = var10.getTiesStrategy();
    java.lang.Class var12 = var11.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "76e221390e032ec930bac5afa");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test482"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-0.35913938368747433d), (java.lang.Number)(-114), (java.lang.Number)(-1));
    org.apache.commons.math3.exception.NumberIsTooSmallException var7 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)0.6428720507104048d, (java.lang.Number)(-103), false);
    var3.addSuppressed((java.lang.Throwable)var7);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test483"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(1049760000L, 2653561339983737856L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2653561339983737856L);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test484"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.8894342610054773d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test485"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(-0.22070453140096552d));

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test486"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    int var12 = var0.nextInt((-58), 86);
    var0.reSeedSecure(25L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var17 = var0.nextUniform(0.2666616872757418d, 0.02501823732763558d);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 51);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test487"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (-32));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test488"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(779875522);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test489"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)16);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test490"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-9), 23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-207));

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test491"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var12 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var13 = new org.apache.commons.math3.util.ResizableDoubleArray(var12);
    java.lang.Object var14 = null;
    boolean var15 = var13.equals(var14);
    double[] var16 = var13.getElements();
    double[] var17 = var13.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var9, var13);
    var9.addElement(0.4364183473896249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test492"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    boolean var4 = var0.isSupportLowerBoundInclusive();
    boolean var5 = var0.isSupportLowerBoundInclusive();
    double var7 = var0.cumulativeProbability((-0.14211228323159422d));
    double var9 = var0.density((-0.11064176370337271d));
    var0.reseedRandomGenerator(3L);
    double var13 = var0.inverseCumulativeProbability(0.04835074986971023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.4434956580178252d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.39650789231781614d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.6610594882707213d));

  }

  public void test493() {}
//   public void test493() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test493"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     long var12 = var0.nextPoisson(0.11751201469396123d);
//     long var15 = var0.nextSecureLong(2L, 6917529027641081856L);
//     int var18 = var0.nextInt((-1023), 62);
//     double var21 = var0.nextCauchy(6.884685375231978d, 0.9813650400212865d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-46));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var12 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 6816479036193465344L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-204));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 6.0915330207274465d);
// 
//   }

  public void test494() {}
//   public void test494() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test494"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.pow((-1.2630956032107625d), (-0.006097429997948822d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test495"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(0.0f, 99.99999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99.99999f);

  }

  public void test496() {}
//   public void test496() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test496"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.0d, 3.65259564434486d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test497"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)0.39650789231781614d);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test498"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(9.999999f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test499"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(71744535, 1.3552527E-20f, 1.1368685E-13f, (-70));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test500"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(902511928144852736L, 6L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 902511928144852742L);

  }

}
