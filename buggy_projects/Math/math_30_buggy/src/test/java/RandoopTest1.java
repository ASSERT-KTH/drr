
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     java.util.Collection var16 = null;
//     java.lang.Object[] var18 = var0.nextSample(var16, (-86));
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.nextPascal(0, 0.011220233953944515d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.nextBinomial(79, (-1.5116541008517133d));
      fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient(7, 10598444);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var3);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)1.734996605925821d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor((-0.7656658570186433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7853981633974483d));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(1.2510057536292178d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2510057536292178d);

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var17 = var0.nextT((-165140.37185182082d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-71));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 8);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "46d986c"+ "'", var15.equals("46d986c"));
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.37863028386090464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3701217123534604d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.02565475975848403d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var17 = var0.nextF(0.0d, (-0.011754646363680897d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-28));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 72);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
// 
//   }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }
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
//       double var18 = var0.nextT(Double.NEGATIVE_INFINITY);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-82));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 52);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "3e53d46"+ "'", var15.equals("3e53d46"));
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(0.3978253612069936d, (-1.1621021197979655d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.811764803218308d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(0L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-2.698200072758446d));
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acosh((-0.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-276308207), (-14));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, (-1023));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.sqrt((-0.9050225767665427d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution((-0.1576108974116944d), (-0.812595528807679d), 2.2172257481304234d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(1410065408, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(78, (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.substituteMostRecentElement((-1.896930644797258E157d));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalStateException");
    } catch (org.apache.commons.math3.exception.MathIllegalStateException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)2.5f);
    java.lang.Number var2 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 2.5f+ "'", var2.equals(2.5f));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-5), 14348907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 71744535);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(1.8755066060221833E-62d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(0, 94);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt(0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7590788170261643d);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     double var1 = org.apache.commons.math3.special.Gamma.logGamma((-9.479210783530794d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(1.734996605925821d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(4.846013790589009d, (-0.9707742654246908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.830211007852808d));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    boolean var5 = var3.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var6 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var3);
    org.apache.commons.math3.stat.ranking.NaNStrategy var7 = var6.getNanStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    double var2 = org.apache.commons.math3.special.Erf.erf((-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8427007929497151d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-179L), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5735339L));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    org.apache.commons.math3.exception.util.ExceptionContext var5 = var3.getContext();
    org.apache.commons.math3.exception.util.Localizable var6 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var10 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var6, (java.lang.Number)(-1.8969306447972577E157d), (java.lang.Number)(-1L), true);
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.Number var12 = var10.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1L)+ "'", var12.equals((-1L)));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(10.0d, 0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.020733327787426217d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    var3.addElement(0.3978253612069936d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNumElements((-106));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    double var2 = org.apache.commons.math3.special.Erf.erf((-1.4709228568158544E157d), (-1.896930644797258E157d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.9953222650189527d, 251.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.542704755906336E-110d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)(-0.1576108974116944d));

  }

  public void test45() {}
//   public void test45() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     java.util.Collection var6 = null;
//     java.lang.Object[] var8 = var0.nextSample(var6, 0);
// 
//   }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6717793361508371d, (-4.503599627370497E15d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.671779336150837d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-93), 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 372);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-78), 1.1368684E-13f, 1.3552527E-20f, (-1));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(2.7070690411132308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2169414349106484d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
    boolean var6 = var0.isSupportUpperBoundInclusive();
    double var9 = var0.cumulativeProbability(1.5607966601082315d, 2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.05785107761175086d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(30, 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);

  }

  public void test53() {}
//   public void test53() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }
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
//       var0.setSecureAlgorithm("42824a7", "AVERAGE");
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
//     assertTrue(var4 == 1.959064544413068d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.41522715674945704d));
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
//     assertTrue(var17 == 0.23675092236759515d);
// 
//   }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(1.4699094585831982d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.037949929128091d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.37863028386090464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.32109045834035954d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-126), 49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 49);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("42824a7");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(0.3701217123534604d, 0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3701217123534604d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    var1.contract();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = var1.copy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil((-1.4699094585831982d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-102), (-73));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-175));

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-0.812595528807679d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)1.4E-45f);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.2510057536292178d, (-0.6734916263077155d), 2.2172257481304234d, 61);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo((-180L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.71122452428142E98d, 10.037949929128091d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.71122452428142E98d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(18L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians((-0.035104216067321295d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.12684151706252E-4d));

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log((-0.9050225767665427d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("c84b177d3367a46");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(2.281783181607902d, 1.5205356215110556E-9d, 0.013576851530780462d, 1410065408);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
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
//       java.lang.String var13 = var0.nextHexString((-103));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-31));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 4);
// 
//   }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     java.util.Collection var5 = null;
//     java.lang.Object[] var7 = var0.nextSample(var5, 0);
// 
//   }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
//     java.lang.Number var5 = var4.getMax();
//     java.lang.Number var6 = var4.getArgument();
//     org.apache.commons.math3.exception.MathInternalError var7 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var4);
//     java.lang.Throwable[] var8 = var4.getSuppressed();
//     org.apache.commons.math3.exception.NullArgumentException var9 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var8);
//     java.lang.String var10 = var9.toString();
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-0.7116919606539285d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.245945181602119d));

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var5 = var0.nextPoisson(0.43641834738962487d);
//     java.util.Collection var6 = null;
//     java.lang.Object[] var8 = var0.nextSample(var6, (-23));
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.0393353033587625d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var6 = var3.getNumElements();
    var3.contract();
    var3.setElement(0, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.05785107761175086d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh((-0.7853981633974483d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3246090892520057d);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var24 = var0.nextHypergeometric(0, (-103), 30);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-118));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
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
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.020492736543359383d, 2.2172257481304234d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var2.inverseCumulativeProbability(1.766644200655088d);
      fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
    } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    double var2 = org.apache.commons.math3.util.FastMath.max((-1.4709228568158544E157d), 0.44721359549995804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.44721359549995804d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-3), 9.536743E-7f, 0.99999994f, (-22));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(1.2169414349106484d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2677782230448309d));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(0.40306506468729153d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7888610291361848d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(short)0);
    org.apache.commons.math3.exception.MathInternalError var2 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var1);

  }

  public void test91() {}
//   public void test91() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }
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
//       int var19 = var0.nextInt(15, 4);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-32));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 62);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "4c5f761"+ "'", var15.equals("4c5f761"));
// 
//   }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc((-1.4324261860181493d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9572102603976436d);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var4 = var0.inverseCumulativeProbability(0.0d);
//     double var5 = var0.getMean();
//     double var6 = var0.getMean();
//     double var7 = var0.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.18572494273241086d);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-2.245945181602119d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-5735339L), 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-41), 49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2009);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(57, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 57);

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(1.7453292519943295d, 0.0d);
//     long var13 = var0.nextPoisson(0.533126106571059d);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-34));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0L);
// 
//   }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-4.503599627370497E15d), (-0.8765514250489875d), 1.71122452428142E98d, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acosh(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.1261651270732402d, (-6.12684151706252E-4d), 100.0d, (-93));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(76, 17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1292);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.16198331648313202d, 0.020492736543359383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0019585758637430395d));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan((-0.1494681981443936d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1505913125268557d));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-41), 75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.sqrt((-0.35913938368747433d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1((-1.0659160440728628d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6555877865481398d));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)78, (java.lang.Number)2.549579613139942d, (java.lang.Number)2.0f);
    java.lang.Number var4 = var3.getLo();
    java.lang.Number var5 = var3.getLo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 2.549579613139942d+ "'", var4.equals(2.549579613139942d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 2.549579613139942d+ "'", var5.equals(2.549579613139942d));

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(2.9524258967767216d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.550073087603984d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1L), (java.lang.Number)(-1L), true);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(49, 0.99999994f, (-0.99999994f));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-52), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1552941056);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-127), 78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1835964673);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.5021289850615019d, 4.934802200544612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9983063366701814d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    double[] var7 = var3.getElements();
    var3.setExpansionMode(0);
    var3.setNumElements(75);
    var3.discardFrontElements(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-0.7853981633974483d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24.58093971587426d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-84), (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-184));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(5.476971727157973d, 0.6002272555504838d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.476971727157973d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var6 = var3.getNumElements();
    var3.contract();
    float var8 = var3.getExpansionFactor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0f);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(180L, 7L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1260L);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(2.811764803218308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.getElement((-184));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(short)0);
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.9983063366701814d, 0.49049638908362825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.49049638908362825d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    int var11 = var3.getExpansionMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(3.1415926535897936d, 0.5021289850615019d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6017998293367545d));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.random.RandomGenerator var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var1);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }
// 
// 
//     double[] var2 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
//     double[] var4 = var3.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
//     int var6 = var3.getNumElements();
//     double[] var7 = null;
//     var3.addElements(var7);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test134() {}
//   public void test134() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     java.lang.String var6 = var0.nextHexString(15);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("AVERAGE", "7668140");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-1.0134578251175184d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-0.148121509330204d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "a5666cb9cc54df3"+ "'", var6.equals("a5666cb9cc54df3"));
// 
//   }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)2.723562786617452E22d);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.60460290274525d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan((-0.6555877865481398d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5802933415744765d));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    int var2 = org.apache.commons.math3.util.FastMath.max((-84), 1835964673);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1835964673);

  }

  public void test139() {}
//   public void test139() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     var0.reSeedSecure();
//     int var9 = var0.nextInt((-127), (-70));
//     double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
//     org.apache.commons.math3.distribution.IntegerDistribution var13 = null;
//     int var14 = var0.nextInversionDeviate(var13);
// 
//   }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(7L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test141() {}
//   public void test141() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acos(2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, var3);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(0.99999994f, 1.1368685E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.99999994f);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var11 = var0.nextLong(7L, (-180L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.369792132532597E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-0.47368465918563357d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.9999999988545867d);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.0d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(1.6583150819385577E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8712081909397543E-9d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-103), (-34));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var2 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var1);
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var8 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
//     double var10 = var6.substituteMostRecentElement(0.0d);
//     double[] var11 = var6.getElements();
//     org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var11);
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var13 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
//     org.apache.commons.math3.util.ResizableDoubleArray var15 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
//     double[] var16 = var15.getInternalValues();
//     org.apache.commons.math3.stat.ranking.TiesStrategy var17 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var18 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var17);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var19 = var18.getTiesStrategy();
//     double[] var22 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var23 = new org.apache.commons.math3.util.ResizableDoubleArray(var22);
//     double[] var24 = var23.getInternalValues();
//     double[] var25 = var18.rank(var24);
//     org.apache.commons.math3.stat.ranking.NaNStrategy var26 = var18.getNanStrategy();
//     int var27 = var26.ordinal();
//     org.apache.commons.math3.random.RandomGenerator var28 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var29 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var26, var28);
//     int var30 = var26.ordinal();
//     org.apache.commons.math3.stat.ranking.NaNStrategy var31 = null;
//     org.apache.commons.math3.stat.ranking.NaNStrategy var32 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var33 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var32);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var34 = var33.getTiesStrategy();
//     boolean var36 = var34.equals((java.lang.Object)2.5f);
//     org.apache.commons.math3.stat.ranking.NaturalRanking var37 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var31, var34);
//     org.apache.commons.math3.stat.inference.MannWhitneyUTest var38 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var26, var34);
//     double[] var41 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var42 = new org.apache.commons.math3.util.ResizableDoubleArray(var41);
//     double[] var43 = var42.getInternalValues();
//     org.apache.commons.math3.stat.ranking.TiesStrategy var44 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var45 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var44);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var46 = var45.getTiesStrategy();
//     double[] var49 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var50 = new org.apache.commons.math3.util.ResizableDoubleArray(var49);
//     double[] var51 = var50.getInternalValues();
//     double[] var52 = var45.rank(var51);
//     double var53 = var38.mannWhitneyUTest(var43, var51);
//     double var54 = var13.mannWhitneyU(var16, var51);
//     double var55 = var2.mannWhitneyU(var11, var51);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-3), 78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var15 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "hi!");
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7023967071298747d);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos(1.6583150819385577E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963251365815d);

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-1.896930644797258E157d), 2.811764803218308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, (-13));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6094379124341003d);

  }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }
// 
// 
//     org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)1);
//     java.lang.Throwable var2 = null;
//     var1.addSuppressed(var2);
// 
//   }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot((-0.24715274222484102d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.24715274222484102d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos((-0.5954271189370909d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 105.57848626407264d);

  }

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }
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
//       double var19 = var0.nextF(0.5603862049849778d, (-0.812595528807679d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-35));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 96);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test163() {}
//   public void test163() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }
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
//       double var13 = var0.nextExponential(0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-65));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 51);
// 
//   }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(1.7453292519943295d, 0.0d);
//     long var13 = var0.nextPoisson(0.533126106571059d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var16 = var0.nextSecureLong((-1L), (-179L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-18));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 0L);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    float var4 = var3.getExpansionFactor();
    var3.addElement(9.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements(102);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0f);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution((-0.1505913125268557d), (-0.6185298926079591d), 1.2510057536292178d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    double var2 = org.apache.commons.math3.util.FastMath.max((-4.503599627370497E15d), 0.7590788170261643d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7590788170261643d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(100, (-70));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 170);

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }
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
//       double var13 = var0.nextBeta(0.020492736543359383d, (-2.890465262390637d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException");
//     } catch (org.apache.commons.math3.exception.NoBracketingException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-65));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == (-1.2012104119580016d));
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    double var13 = var0.nextExponential(0.4373817081192443d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSecureAlgorithm("", "MAXIMAL");
      fail("Expected exception of type java.security.NoSuchProviderException");
    } catch (java.security.NoSuchProviderException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.2228517214543522d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var2 = var0.nextHexString((-78));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.nextPascal(0, 0.18572494273241086d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var1);
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     double[] var8 = var2.rank(var7);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = var1.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var4.getElement((-55));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(105.57848626407264d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 105.57848626407264d);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = var3.copy();
    double var11 = var9.substituteMostRecentElement((-0.11064176370337271d));
    
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
    assertTrue(var11 == 0.0d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-0.2677782230448309d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.6746351978480065d);

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     org.apache.commons.math3.distribution.IntegerDistribution var18 = null;
//     int var19 = var0.nextInversionDeviate(var18);
// 
//   }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-73), 0.0f, 1.0000001f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var6 = var0.inverseCumulativeProbability(0.020492736543359383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2.043676936805938d));

  }

  public void test182() {}
//   public void test182() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.cumulativeProbability(5.442027134218949d, 0.5218635024424644d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.470909241095453d);
// 
//   }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(57, 1260L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2051160097);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(0.6985353583033387d, (-0.024815491250778372d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.6063064259940278d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(180L, 180L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(1.1368685E-13f, (-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0L, (-5735339L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var5 = var0.nextPoisson(0.43641834738962487d);
//     org.apache.commons.math3.distribution.IntegerDistribution var6 = null;
//     int var7 = var0.nextInversionDeviate(var6);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-14));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(0L, 7L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7L);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }
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
//     java.util.Collection var20 = null;
//     java.lang.Object[] var22 = var0.nextSample(var20, 24);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


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
    java.lang.Class var23 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var25 = java.lang.Enum.<java.lang.Enum>valueOf(var23, "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
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

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(1.2510057536292178d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9231377113408568d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(0.5510054571581893d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6198239740031684d);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-5735339L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-93), (-41));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-52));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9948675413259892d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(0.46049838059322834d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4443946269876852d);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 3.1415926535897936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    var3.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionFactor(100.0f);
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

  }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextF(0.05483113556160755d, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.44017593028248947d));
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-41));
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

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(37, 17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 629);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-121), (-109));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = var3.copy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-0.8765514250489875d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-7.350353018892239d));

  }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-1.0659160440728628d), 1.0393353033587625d, (-1.0d), 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements(57);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }
// 
// 
//     double[] var2 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
//     double[] var4 = var3.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
//     double var7 = var3.addElementRolling(0.0d);
//     double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
//     org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
//     double[] var11 = null;
//     var10.addElements(var11);
// 
//   }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    float var2 = org.apache.commons.math3.util.FastMath.max((-0.99999994f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-2.3239247451534874E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8516371232770192E17d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(3.65259564434486d, (-1.8969306447972577E157d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.6525956443448595d);

  }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 2);
// 
//   }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.1576108974116944d), 3628800.0d, 0.9593976412963791d, (-14));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.750818884463626E-18d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(10L, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, 1.557219058123976d);
    float var9 = var3.getExpansionFactor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-116));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.0f);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    long var1 = org.apache.commons.math3.util.FastMath.round((-0.1505913125268557d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     int var6 = var0.nextInt(30, 1410065408);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var8 = var0.nextChiSquare(0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.4933446204707212E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 1349915934);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(0.5218635024424644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.48098503567265183d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var14 = var0.nextT(24.58093971587426d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var17 = var0.nextPermutation(150, (-73));
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
    assertTrue(var14 == 0.40396181553681765d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    double[] var11 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var11);
    double[] var13 = var12.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var14 = new org.apache.commons.math3.util.ResizableDoubleArray(var12);
    double var16 = var12.addElementRolling(0.0d);
    double[] var17 = var12.getElements();
    var12.setExpansionMode(0);
    double var21 = var12.addElementRolling((-1.0d));
    int var22 = var12.start();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(0.05745482469513025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.pow((-0.215551206382648d), 1.4699094585831982d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(1.734996605925821d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.035291569863828d));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = var1.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var1.getElement(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements((-79));
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

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }
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
//       var0.setSecureAlgorithm("AVERAGE", "7668140");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-124));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 37);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(10L, 362);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8390715290764524d));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.3331168383272715d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2875196880135953d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-276308207));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(1.8516371232770192E17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 40.45316394072901d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, var1, (java.lang.Number)69, var3);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(115.45706259336124d, 0.7023967071298747d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 115.45919913034874d);

  }

  public void test238() {}
//   public void test238() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }
// 
// 
//     double var1 = org.apache.commons.math3.special.Gamma.trigamma((-1.4709228568158544E157d));
// 
//   }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


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
    double[] var33 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var34 = new org.apache.commons.math3.util.ResizableDoubleArray(var33);
    double[] var35 = var34.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var36 = new org.apache.commons.math3.util.ResizableDoubleArray(var34);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var37 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var40 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var41 = new org.apache.commons.math3.util.ResizableDoubleArray(var40);
    double[] var42 = var41.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var43 = new org.apache.commons.math3.util.ResizableDoubleArray(var41);
    double var45 = var41.addElementRolling(0.0d);
    double[] var46 = var41.getElements();
    double[] var47 = var41.getElements();
    double[] var50 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var51 = new org.apache.commons.math3.util.ResizableDoubleArray(var50);
    double[] var52 = var51.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var53 = new org.apache.commons.math3.util.ResizableDoubleArray(var51);
    double var55 = var51.addElementRolling(0.0d);
    double var57 = var51.substituteMostRecentElement(2.220446049250313E-16d);
    int var58 = var51.start();
    double[] var59 = var51.getElements();
    double var60 = var37.mannWhitneyUTest(var47, var59);
    var34.addElements(var59);
    org.apache.commons.math3.stat.ranking.TiesStrategy var62 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var63 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var62);
    org.apache.commons.math3.stat.ranking.TiesStrategy var64 = var63.getTiesStrategy();
    double[] var67 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var68 = new org.apache.commons.math3.util.ResizableDoubleArray(var67);
    double[] var69 = var68.getInternalValues();
    double[] var70 = var63.rank(var69);
    org.apache.commons.math3.stat.ranking.NaNStrategy var71 = var63.getNanStrategy();
    int var72 = var71.ordinal();
    org.apache.commons.math3.random.RandomGenerator var73 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var74 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var71, var73);
    int var75 = var71.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var76 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var77 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var78 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var77);
    org.apache.commons.math3.stat.ranking.TiesStrategy var79 = var78.getTiesStrategy();
    boolean var81 = var79.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var82 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var76, var79);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var83 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var71, var79);
    double[] var86 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var87 = new org.apache.commons.math3.util.ResizableDoubleArray(var86);
    double[] var88 = var87.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var89 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var90 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var89);
    org.apache.commons.math3.stat.ranking.TiesStrategy var91 = var90.getTiesStrategy();
    double[] var94 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var95 = new org.apache.commons.math3.util.ResizableDoubleArray(var94);
    double[] var96 = var95.getInternalValues();
    double[] var97 = var90.rank(var96);
    double var98 = var83.mannWhitneyUTest(var88, var96);
    double var99 = var30.mannWhitneyU(var59, var88);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.6985353583033387d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 2.5d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-88));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-115), 3222L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-618816519));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.14782604738794858d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8302490352228529d));

  }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var3 = org.apache.commons.math3.util.ArithmeticUtils.pow(var1, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, var1);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.6746351978480065d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.070484278652524E-18d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(6917529027641081856L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test246() {}
//   public void test246() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acosh(0.013576851530780462d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = var3.copy();
    var9.setContractionCriteria(2.5f);
    
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

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs((-179L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 179L);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.5210953054937475d, (-0.8302490352228529d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5210953054937474d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-50), (java.lang.Number)(-1.0d), false);
    java.lang.Number var5 = var4.getMax();
    boolean var6 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1.0d)+ "'", var5.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1((-0.1494681981443936d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1388341757445717d));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.3701217123534604d, 22.140692632779277d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.1163541260031398d));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(14348907);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    double var5 = var0.getNumericalVariance();
    var0.reseedRandomGenerator(100L);
    boolean var8 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-106), 1410065408);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(2.220446049250313E-16d, (-0.5722073814834792d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.1415926535897927d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


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
    float var17 = var10.getExpansionFactor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.setExpansionFactor((-0.99999994f));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2.0f);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(8995410, (-115));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8995295);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(0.35300672616711454d, 7.750818884463626E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.35300672616711454d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    var3.addElement(1.0176351058563242d);
    float var9 = var3.getContractionCriteria();
    float var10 = var3.getContractionCriteria();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2.5f);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh((-2.245945181602119d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.671757607430453d));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(3L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test264() {}
//   public void test264() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }
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
//       int var23 = var0.nextSecureInt(94, (-79));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1);
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

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(180L, 3222L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3042L));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-115), 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-108));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp((-0.5954672480415791d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.595467248041579d));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(1260L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test270() {}
//   public void test270() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     double var19 = var0.nextChiSquare(1.5607966601082315d);
//     int[] var22 = var0.nextPermutation(94, 2);
//     double var25 = var0.nextGamma((-1.896930644797258E157d), (-0.5519701884949173d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var27 = var0.nextSecureHexString((-41));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-81));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 70);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.40306506468729153d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == Double.NaN);
// 
//   }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.022730427113892d, 3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.022730427113892d);

  }

  public void test272() {}
//   public void test272() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 3L);
// 
//   }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.discardMostRecentElements((-127));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("42824a7");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(24, 372);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 12);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(10.0d, 3.141592653589793d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var2.cumulativeProbability(1.2169414349106484d, 0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test277() {}
//   public void test277() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.6185298926079591d), 1.5205356215110556E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(150.0d, 9.869604401089358d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9559339836596301d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(8.070484278652524E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)100.0d, (java.lang.Number)1.5574077246549023d, false);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 100.0d+ "'", var4.equals(100.0d));

  }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.8427007929497151d), (-0.6017998293367545d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setExpansionMode(8616612);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, (-180L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(7L, (-179L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-172L));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    double var13 = var0.nextExponential(0.4373817081192443d);
    double var16 = var0.nextCauchy(5.7998579189201327E-64d, 0.5210953054937475d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var19 = var0.nextSecureLong(6917529027641081856L, (-3042L));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.2228517214543522d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-0.42115619735614285d));

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp((-0.1494681981443936d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8611658242554283d);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(0.2228517214543522d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.47207173337783337d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.0d, 1.359867214518029d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.4394688580721162d));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(6917529027641081856L, (-180L));
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin((-0.5802933415744765d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5482692824805393d));

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)0.37863028386090464d, (java.lang.Number)(-1.0f), false);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)(-0.2677782230448309d));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-0.40030753423026644d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(2.7495685662163734E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.798902448981544E-12d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)150);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin((-2.043676936805938d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.890260002156081d));

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees(0.49049638908362825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 28.103372960898604d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos(0.40306506468729153d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1559327705920959d);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, 79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-90L), (-179L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(8616612);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.discardFrontElements(4);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-0.5722073814834792d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4E-45f));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-13), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-13));

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(3.141592653589793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2246467991473532E-16d));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-52));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acos(1.5707963267948966d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.8712081909397543E-9d, (java.lang.Number)1.6094379124341003d, true);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    float var7 = var3.getContractionCriteria();
    var3.discardMostRecentElements(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2.5f);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-25));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


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
    int var12 = var9.ordinal();
    
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
    assertTrue(var12 == 1);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElement((-110), 7.750818884463626E-18d);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-79), 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(71744535, (-41));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-110), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-13));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-180L), (-90L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-90L));

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 4L);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(24.58093971587426d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5301368204596435d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 213.53224149456327d);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.9111302618846769d), 0.8793843777996115d, 0.35300672616711454d, (-127));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(28.103372960898604d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.028720097489951d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    float var7 = var3.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionFactor(10.0f);
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
    assertTrue(var7 == 2.5f);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    double var12 = var10.addElementRolling(4.028720097489951d);
    
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
    assertTrue(var12 == 100.0d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.671779336150837d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011724761262693876d);

  }

  public void test326() {}
//   public void test326() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }
// 
// 
//     org.apache.commons.math3.random.RandomGenerator var0 = null;
//     org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
//     int var4 = var1.nextInt((-70), 10);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var7 = var1.nextZipf((-63), Double.NEGATIVE_INFINITY);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-8));
// 
//   }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var13 = java.lang.Enum.<java.lang.Enum>valueOf(var11, "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.056362217600843124d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    double[] var3 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double[] var5 = var4.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var4);
    int var7 = var4.getNumElements();
    var4.contract();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var0, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setExpansionMode(79);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(2L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6L);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(100.0f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1920929E-7f);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(2.022730427113892d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7044482952846992d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.6717793361508371d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6717793361508371d);

  }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-0.8765514250489875d), 0.533126106571059d, 0.8102040310137474d, 170);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14211228323159422d));

  }

  public void test337() {}
//   public void test337() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }
// 
// 
//     org.apache.commons.math3.random.RandomGenerator var0 = null;
//     org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
//     int var4 = var1.nextInt((-70), 10);
//     java.util.Collection var5 = null;
//     java.lang.Object[] var7 = var1.nextSample(var5, 65);
// 
//   }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.99999994f, (java.lang.Number)1.4E-45f, (java.lang.Number)1.7453292519943295d);
    java.lang.Number var4 = var3.getHi();
    java.lang.Number var5 = var3.getHi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.7453292519943295d+ "'", var4.equals(1.7453292519943295d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.7453292519943295d+ "'", var5.equals(1.7453292519943295d));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(2653561339983737856L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2653561339983737856L);

  }

  public void test340() {}
//   public void test340() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.TiesStrategy var1 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0, var1);
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     org.apache.commons.math3.util.ResizableDoubleArray var8 = new org.apache.commons.math3.util.ResizableDoubleArray(var6);
//     double var10 = var6.substituteMostRecentElement(0.0d);
//     double[] var11 = var6.getElements();
//     org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var11);
//     double[] var13 = var2.rank(var11);
// 
//   }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.7209210669314736d, (java.lang.Number)100, (java.lang.Number)(-0.8427007929497151d));
    org.apache.commons.math3.exception.util.ExceptionContext var4 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)1.557219058123976d, (java.lang.Number)(-90L), (java.lang.Number)(short)100);
    org.apache.commons.math3.exception.NotPositiveException var5 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-1.0f));
    boolean var6 = var5.getBoundIsAllowed();
    java.lang.Number var7 = var5.getArgument();
    boolean var8 = var5.getBoundIsAllowed();
    var3.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (-1.0f)+ "'", var7.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2(1.7598948720186276d, 0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1623798829964924d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(0L, 180L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     double var7 = var0.nextExponential(0.49049638908362825d);
//     double var9 = var0.nextExponential(1.5713845747492456d);
//     java.util.Collection var10 = null;
//     java.lang.Object[] var12 = var0.nextSample(var10, 74);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-106), (-1.0f), 10.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     double var8 = var0.nextBeta(5.442027134218949d, 1.7713659069359526E-40d);
//     double var11 = var0.nextCauchy((-0.812595528807679d), 31.85489831527096d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var14 = var0.nextBinomial((-73), 0.6002272555504838d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.3366846999544964E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-2.0965627626851657d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.9999999989894255d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-70.41427892550928d));
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test349() {}
//   public void test349() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var10 = var0.nextT(1.5574077246549023d);
//     long var12 = var0.nextPoisson(0.11751201469396123d);
//     long var15 = var0.nextSecureLong(2L, 6917529027641081856L);
//     var0.reSeedSecure();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-22));
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
//     assertTrue(var15 == 6469856410481231872L);
// 
//   }

  public void test350() {}
//   public void test350() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }
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
//       double var22 = var0.nextCauchy(0.0d, (-0.2677782230448309d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-65));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 30);
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

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    double var8 = var3.addElementRolling(2.981374056870167d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setExpansionMode(12);
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
    assertTrue(var8 == 0.0d);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc((-1.2246467991473532E-16d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-165140.37185182082d), (java.lang.Number)(-10), (java.lang.Number)18L);
    java.lang.Number var4 = var3.getLo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-10)+ "'", var4.equals((-10)));

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }
// 
// 
//     double var1 = org.apache.commons.math3.special.Gamma.digamma(Double.NEGATIVE_INFINITY);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0L, (-172L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }
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
//     double var19 = var0.nextBeta(31.85489831527096d, 1.4699094585831982d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var22 = var0.nextWeibull(0.02565475975848403d, (-0.6734916263077155d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-7));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 9);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "f83663d"+ "'", var15.equals("f83663d"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.9593976412963791d);
// 
//   }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-3042L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(94);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-276308207), (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-276308199));

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh(0.057859117847628164d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0579238123993394d);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(1.9600758471893716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.3795219383900589d));

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.atan2(Double.NaN, 0.02565475975848403d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-52), 1552941056);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test364() {}
//   public void test364() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     var0.reSeedSecure();
//     int var9 = var0.nextInt((-127), (-70));
//     java.lang.String var11 = var0.nextSecureHexString(10598444);
//     org.apache.commons.math3.distribution.IntegerDistribution var12 = null;
//     int var13 = var0.nextInversionDeviate(var12);
// 
//   }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    int var2 = org.apache.commons.math3.util.FastMath.max(150, (-114));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 150);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.4E-45f, 1.1368685E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(0L, 180L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


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
      double var18 = var3.getElement(16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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

  public void test369() {}
//   public void test369() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log((-0.16068568840084113d), 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)5.476971727157973d);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((-42), 8995410);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(10, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


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
      var3.discardMostRecentElements(7);
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

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.5218635024424644d, (-46));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.416126414376327E-15d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(1.1559327705920959d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11.932745954929619d);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var8 = new org.apache.commons.math3.exception.MathArithmeticException(var5, var7);
    org.apache.commons.math3.exception.MathInternalError var9 = new org.apache.commons.math3.exception.MathInternalError(var4, var7);
    org.apache.commons.math3.exception.MathIllegalArgumentException var10 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var3, var7);
    org.apache.commons.math3.exception.MathInternalError var11 = new org.apache.commons.math3.exception.MathInternalError(var2, var7);
    org.apache.commons.math3.exception.MaxCountExceededException var12 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)2.022730427113892d, var7);
    org.apache.commons.math3.exception.util.ExceptionContext var13 = var12.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(8995410, 61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8995349);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)5.442027134218949d, (java.lang.Number)333032039, (java.lang.Number)8995295);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    float var10 = var3.getExpansionFactor();
    var3.contract();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setContractionCriteria(1.3552527E-20f);
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
    assertTrue(var10 == 2.0f);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(0.5210953054937475d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5388411917497572d);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var8 = new org.apache.commons.math3.exception.MathArithmeticException(var5, var7);
    org.apache.commons.math3.exception.MathInternalError var9 = new org.apache.commons.math3.exception.MathInternalError(var4, var7);
    org.apache.commons.math3.exception.MathIllegalArgumentException var10 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var3, var7);
    org.apache.commons.math3.exception.MathInternalError var11 = new org.apache.commons.math3.exception.MathInternalError(var2, var7);
    org.apache.commons.math3.exception.MathInternalError var12 = new org.apache.commons.math3.exception.MathInternalError(var1, var7);
    org.apache.commons.math3.exception.NullArgumentException var13 = new org.apache.commons.math3.exception.NullArgumentException(var0, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos(0.5210953054937474d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8672744236830215d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(251.8904022097232d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(0.5603862049849778d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.071583579671067d);

  }

  public void test387() {}
//   public void test387() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }
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
//       var0.setSecureAlgorithm("7668140", "c84b177d3367a46");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-58));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 59);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
// 
//   }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.7209210669314736d, (java.lang.Number)100, (java.lang.Number)(-0.8427007929497151d));
    java.lang.Number var4 = var3.getHi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-0.8427007929497151d)+ "'", var4.equals((-0.8427007929497151d)));

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp((-0.9070706940443594d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4037050693245728d);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor((-0.0019585758637430395d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)0.17453292519943295d, (java.lang.Number)0.5388411917497572d, true);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1.0234917754783677d), (java.lang.Number)(-13), true);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    double var1 = org.apache.commons.math3.util.FastMath.log(4.846013790589009d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5781564681577236d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getElement((-175));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.7713659069359526E-40d, 11.932745954929619d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.048652788680128E-47d);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(0, 1.4E-45f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(1.1368684E-13f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(2653561339983737856L, 100L);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    int var9 = var3.start();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-127));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    double var8 = var3.addElementRolling(2.981374056870167d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setContractionCriteria((-1.4E-45f));
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
    assertTrue(var8 == 0.0d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    double var7 = var0.nextExponential(0.49049638908362825d);
    double var9 = var0.nextExponential(1.5713845747492456d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.nextChiSquare((-0.6555877865481398d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4875474306513526d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
    double var7 = var0.cumulativeProbability(0.05483113556160755d);
    boolean var8 = var0.isSupportLowerBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.4373817081192443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5218635024424644d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
//     java.math.BigInteger var7 = null;
//     java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var6, var7);
// 
//   }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0f);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0L, 3222L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3222L));

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setExpansionFactor(10.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test407() {}
//   public void test407() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }
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
//       long var16 = var0.nextLong(3L, 2L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-21));
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
//   }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var23 = var0.nextPascal(2, (-2.890465262390637d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
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
//     assertTrue(var11 == 42);
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

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(0.0f, 1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.getExpansionMode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements(80);
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
    assertTrue(var10 == 0);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(0.0f, 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(0.3172440566036945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.log((-1.5707963246583885d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)66, var1, true);
    boolean var4 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.48098503567265183d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2));

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(18L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15L);

  }

  public void test417() {}
//   public void test417() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var23 = var0.nextLong(4L, 0L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-5));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 3);
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
//   }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0, (-52));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test419() {}
//   public void test419() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     double var15 = var0.nextChiSquare(0.5218635024424644d);
//     long var17 = var0.nextPoisson(9.869604401089358d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("7668140", "b4b58d7");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-89));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 91);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == 0.057859117847628164d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 10L);
// 
//   }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     java.lang.String var6 = var0.nextHexString(15);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.nextCauchy(1.5707963251365815d, (-0.8765514250489875d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-6.767785150956552d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-0.28512629461383265d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var6 + "' != '" + "496c970334ed23e"+ "'", var6.equals("496c970334ed23e"));
// 
//   }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-184), 1.3552527E-20f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(1.3552527E-20f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3552527E-20f);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(1410065408, 34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 34);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan((-2.1055660652199926d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.127403745963549d));

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-0.7656658570186433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-110), 1.1920929E-7f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    float var2 = org.apache.commons.math3.util.FastMath.min(2.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(90);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(3, 9.999999f, 2.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     double var19 = var0.nextChiSquare(1.5607966601082315d);
//     int[] var22 = var0.nextPermutation(94, 2);
//     double var25 = var0.nextGamma((-1.896930644797258E157d), (-0.5519701884949173d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var29 = var0.nextHypergeometric(34, (-41), 89);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
//     } catch (org.apache.commons.math3.exception.NotPositiveException e) {
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
//     assertTrue(var11 == 18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.40306506468729153d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == Double.NaN);
// 
//   }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(1.01072661873565d, 0.6428720507104048d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.01072661873565d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8E-45f);

  }

  public void test433() {}
//   public void test433() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }
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
//       int var16 = var0.nextPascal(84, 251.8904022097232d);
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-75));
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
//   }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(0.7209210669314736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(0L, 6469856410481231872L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.011724761262693876d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011724761262693876d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos((-0.8765514250489875d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6398053010116338d);

  }

  public void test438() {}
//   public void test438() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextGamma(9.332621544395286E157d, (-0.1576108974116944d));
//     int var20 = var0.nextBinomial(21, 0.6985353583033387d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-95));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 63);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == (-1.4709228568158544E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var20 == 14);
// 
//   }

  public void test439() {}
//   public void test439() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     var0.reSeedSecure();
//     int var9 = var0.nextInt((-127), (-70));
//     double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
//     java.util.Collection var13 = null;
//     java.lang.Object[] var15 = var0.nextSample(var13, (-86));
// 
//   }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    var1.setElement(69, (-0.890260002156081d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(1.4E-45f, (-55));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(9.542704755906336E-110d, 1.8166396139736133E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.000000000000013d);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(180L, (-3042L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(0.671779336150837d, 0.9593976412963791d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9593976412963791d);

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 12);
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.9983063366701814d, 0.5021289850615019d, 2.9524258967767216d, (-8));
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(180L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 179L);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint((-0.8390715290764524d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6212103591877449d), 2.281783181607902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6212103591877448d));

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var5 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var6 = var5.getMax();
    java.lang.Number var7 = var5.getArgument();
    org.apache.commons.math3.exception.MathInternalError var8 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var5);
    java.lang.Throwable[] var9 = var5.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException(var1, (java.lang.Object[])var9);
    org.apache.commons.math3.exception.MathArithmeticException var11 = new org.apache.commons.math3.exception.MathArithmeticException(var0, (java.lang.Object[])var9);
    org.apache.commons.math3.exception.util.ExceptionContext var12 = var11.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0f+ "'", var6.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(0, (-121));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-121));

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(9.536743E-7f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test453() {}
//   public void test453() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     int var6 = var0.nextInt(30, 1410065408);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var8 = var0.nextSecureHexString((-114));
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
//     assertTrue(var6 == 347459970);
// 
//   }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 19.714887418613912d);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(17, 49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 17);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees(1.6094379124341003d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 92.2139997708197d);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-175), 15L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 671893169);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.9231377113408568d, 0.4037050693245728d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.007551992255483d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    double var1 = org.apache.commons.math3.special.Erf.erf((-0.7656658570186433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7211094712148152d));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(7L, 6917529027641081856L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6917529027641081849L));

  }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }
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
//       double var20 = var0.nextWeibull(0.0d, 1.01072661873565d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.1298123801036214E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 14.581527891409904d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.07819078784118558d));
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
//     assertTrue(var17 == 0.14705920808247946d);
// 
//   }

  public void test462() {}
//   public void test462() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     var0.reSeed();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.13234520580138529d);
// 
//   }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    var3.contract();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    double var1 = org.apache.commons.math3.special.Gamma.logGamma(0.4597333053541885d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6556241835913665d);

  }

  public void test465() {}
//   public void test465() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     java.lang.String var6 = var0.nextHexString(15);
//     java.util.Collection var7 = null;
//     java.lang.Object[] var9 = var0.nextSample(var7, (-106));
// 
//   }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0L, (-5735339L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    long var1 = org.apache.commons.math3.util.FastMath.round((-1.2630956032107625d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test468() {}
//   public void test468() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var14 = var0.nextGaussian((-0.7656658570186433d), 2.993222846126381d);
//     double var17 = var0.nextCauchy(2.723562786617452E22d, 1.5707963267948966d);
//     double var19 = var0.nextChiSquare(1.5607966601082315d);
//     int[] var22 = var0.nextPermutation(94, 2);
//     double var25 = var0.nextGamma((-1.896930644797258E157d), (-0.5519701884949173d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var28 = var0.nextWeibull((-0.6017998293367545d), 1.6522351127874555d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-39));
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
//     assertTrue(var17 == 2.723562786617452E22d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.40306506468729153d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var22);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == Double.NaN);
// 
//   }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    var3.discardFrontElements(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-46));
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

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(8995410, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8995410);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, 170);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Float.POSITIVE_INFINITY);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.43641834738962487d, 9.869604401089358d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.662756980709212E-6d);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(0.43641834738962487d, 1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.23524054291408542d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(28.103372960898604d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4232935162240434d);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    org.apache.commons.math3.random.RandomGenerator var0 = null;
    org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
    var1.reSeed(180L);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray((-98));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test477() {}
//   public void test477() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     java.util.Collection var6 = null;
//     java.lang.Object[] var8 = var0.nextSample(var6, (-63));
// 
//   }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.99999994f, (java.lang.Number)1.4E-45f, (java.lang.Number)1.7453292519943295d);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math3.exception.OutOfRangeException: 1 out of [0, 1.745] range"+ "'", var4.equals("org.apache.commons.math3.exception.OutOfRangeException: 1 out of [0, 1.745] range"));

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(10.037949929128091d, (-0.8765514250489875d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.7848880588733163d));

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(4, 2.5f);

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(2.408643032341895E-8d, (-0.6555877865481398d), (-0.024815491250778372d), (-114));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)1.9572102603976436d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.17453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1906899454435431d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(8.070484278652524E-18d, (-1.8969306447972577E157d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8969306447972577E157d);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(1.4232935162240434d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    double[] var6 = var3.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode(37);
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

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(2.505505063633595E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.372931278579628E-18d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test489() {}
//   public void test489() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGamma(0.0d, (-0.011754646363680897d));
//     double var14 = var0.nextWeibull(31.85489831527096d, 0.11751201469396123d);
//     int var17 = var0.nextPascal(94, 4.440892098500626E-16d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var20 = var0.nextSecureInt(333032039, 14);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-80));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.11877446081942718d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 2147483647);
// 
//   }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    long var1 = org.apache.commons.math3.util.FastMath.round((-0.35913938368747433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    int var1 = org.apache.commons.math3.util.FastMath.abs(88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 88);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(4.440892098500626E-16d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)1.5205356215110556E-9d);
    org.apache.commons.math3.exception.MaxCountExceededException var3 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)(-0.6734916263077155d));
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-115), (-0.99999994f), 9.536743E-7f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.MathInternalError var2 = new org.apache.commons.math3.exception.MathInternalError(var0, var1);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    double var2 = org.apache.commons.math3.special.Erf.erf((-0.16068568840084113d), 1.734996605925821d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1656246617612935d);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(5.551115123125783E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-54));

  }

  public void test498() {}
//   public void test498() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }
// 
// 
//     org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
//     double[] var5 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
//     double[] var7 = var6.getInternalValues();
//     double[] var8 = var1.rank(var7);
//     org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
//     org.apache.commons.math3.stat.ranking.TiesStrategy var10 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var11 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var10);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var12 = var11.getTiesStrategy();
//     double[] var15 = new double[] { 0.0d, 100.0d};
//     org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
//     double[] var17 = var16.getInternalValues();
//     double[] var18 = var11.rank(var17);
//     org.apache.commons.math3.stat.ranking.NaNStrategy var19 = var11.getNanStrategy();
//     org.apache.commons.math3.stat.ranking.NaturalRanking var20 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var19);
//     org.apache.commons.math3.stat.ranking.TiesStrategy var21 = var20.getTiesStrategy();
//     org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
//     double[] var23 = null;
//     double[] var24 = var22.rank(var23);
// 
//   }

  public void test499() {}
//   public void test499() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.atanh((-2.043676936805938d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb((-3.5405364385079268d), (-111));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.3637650292233107E-33d));

  }

}
