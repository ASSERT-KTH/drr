
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(0.7888610291361848d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5815791207581219d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var6 = var3.getNumElements();
    var3.contract();
    double var9 = var3.substituteMostRecentElement((-6.12684151706252E-4d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(0.9231377113408568d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-103), 1.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(6548440436062887936L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-93), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-93));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(2.5f, 0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    org.apache.commons.math3.stat.ranking.NaNStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var1 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var2 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var1);
    org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var2.getTiesStrategy();
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var4 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var0, var3);
    org.apache.commons.math3.stat.ranking.NaturalRanking var5 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)(-4.671757607430453d), (java.lang.Number)4.798902448981544E-12d, false);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     double var16 = var0.nextChiSquare(1.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var19 = var0.nextPascal(14, (-2.245945181602119d));
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-13));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 66);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.3331168383272715d);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(6548440436062887936L, 18L);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-110), 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-110));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    double var2 = org.apache.commons.math3.util.FastMath.atan2((-0.5482692824805393d), (-0.5954271189370909d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.39740397424506d));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(1260L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-552473126826409984L));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-41), (-84));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var5, 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var5, (-103));
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

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-180L), 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1049760000L);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin((-9.479210783530794d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05440594661617359d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-103), (-122));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-2.1055660652199926d), (java.lang.Number)0.5815791207581219d, false);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    int var7 = var3.getExpansionMode();
    int var8 = var3.getNumElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    float var10 = var3.getExpansionFactor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElement((-110), 0.011724761262693876d);
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
    assertTrue(var10 == 2.0f);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)3.4279602128629287d, (java.lang.Number)1.7453292519943295d, (java.lang.Number)100L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-6917529027641081849L), (-552473126826409984L));
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    org.apache.commons.math3.random.RandomGenerator var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.NaNStrategy var2 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var3 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    boolean var5 = var0.isSupportLowerBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.TiesStrategy var1 = org.apache.commons.math3.stat.ranking.TiesStrategy.valueOf("b4b58d7");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)2.0d, (java.lang.Number)9.869604401089358d, false);
    java.lang.Number var5 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 9.869604401089358d+ "'", var5.equals(9.869604401089358d));

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var5 = var0.cumulativeProbability((-1.4699094585831982d), 0.020492736543359383d);
//     double var6 = var0.getSupportLowerBound();
//     double var7 = var0.sample();
//     boolean var8 = var0.isSupportUpperBoundInclusive();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.4373817081192443d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1.3602867522220448d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == false);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


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
    java.lang.String var22 = var21.name();
    org.apache.commons.math3.stat.ranking.NaturalRanking var23 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    boolean var25 = var21.equals((java.lang.Object)2.5d);
    
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
    assertTrue("'" + var22 + "' != '" + "AVERAGE"+ "'", var22.equals("AVERAGE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 1049760000L);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)0.3978253612069936d);
    java.lang.Number var2 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }
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
//       int var17 = var0.nextPascal((-116), (-4.671757607430453d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-37));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 94);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Float.POSITIVE_INFINITY);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-50), (java.lang.Number)14348907, false);
    boolean var5 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test38() {}
//   public void test38() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log(0.0d, (-165140.37185182082d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(1049760000L, (-3042L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1049760000L);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(0.37863028386090464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6153294108531662d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-41), 333032039);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.3701217123534604d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-51), (-175));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(61, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeedSecure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var0.nextPascal(0, (-9.479210783530794d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(30);
    org.apache.commons.math3.util.ResizableDoubleArray var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray.copy(var1, var2);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)1.7598948720186276d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)9.550073087603984d, (java.lang.Number)(-106), var3);
    java.lang.Number var5 = var4.getHi();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7211094712148152d), (-0.11064176370337271d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05338287470879381d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(7.750818884463626E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, var5);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 8.71681867595783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-13), 36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 468);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    double[] var7 = var3.getInternalValues();
    var3.clear();
    var3.addElement((-0.9050225767665427d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(0.44721359549995804d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.9806034621180615d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(6469856410481231872L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6469856410481231871L);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(468, 1.1920929E-7f, 0.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.acos(2.7070690411132308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh((-0.24715274222484102d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0306980272969342d);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-3222L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3222L);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(372, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(180L, (-5735339L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    float var2 = var1.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setExpansionFactor((-1.4E-45f));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-5), 14348907);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-71744535));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray((-276308199), 2.8E-45f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     var0.reseedRandomGenerator(100L);
//     double var7 = var0.cumulativeProbability((-0.890260002156081d), 0.3331168383272715d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-1.5082001213445502d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.4438138088761582d);
// 
//   }

  public void test69() {}
//   public void test69() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     double var11 = var0.nextGaussian((-0.11064176370337271d), 0.7853981633974483d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-29));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.25894751937915056d);
// 
//   }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    float var5 = var3.getExpansionFactor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2.0f);

  }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
//     java.math.BigInteger var7 = null;
//     java.math.BigInteger var9 = org.apache.commons.math3.util.ArithmeticUtils.pow(var7, 0L);
//     java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var7);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(0.7590788170261643d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.548633291782874d);

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var11 = var0.nextSecureLong(1049760000L, 4L);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-89));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    boolean var4 = var0.isSupportConnected();
    double var6 = var0.probability((-1.127403745963549d));
    double var8 = var0.probability(31.85489831527096d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign((-1.4E-45f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    java.lang.Object[] var4 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var5 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)(short)(-1), var4);
    org.apache.commons.math3.exception.MathIllegalStateException var6 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, var4);
    org.apache.commons.math3.exception.util.ExceptionContext var7 = var6.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.5388411917497572d, 0.05440594661617359d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.23016257191669184d);

  }

  public void test78() {}
//   public void test78() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-0.11064176370337271d), 0.13234520580138529d, 0.3172440566036945d, (-85));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-1L), 1552941056);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1.3602867522220448d), var1, true);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    double var1 = org.apache.commons.math3.util.FastMath.exp(0.8672744236830215d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3804140036831676d);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    double var1 = org.apache.commons.math3.util.FastMath.atanh((-0.890260002156081d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.423177876943437d));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    float var4 = var3.getExpansionFactor();
    double[] var5 = var3.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }
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
//       int[] var16 = var0.nextPermutation((-46), 0);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-9));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 10L);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.discardMostRecentElements((-25));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(115.45706259336124d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    double var4 = var0.getSupportUpperBound();
    double var6 = var0.cumulativeProbability(1.307674368E12d);
    boolean var7 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp((-1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0f));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("7668140");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(3.1415926535897936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-5735339L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.6198239740031684d, 0.533126106571059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8175605202409767d);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.0d, 1.0393353033587625d, 92.2139997708197d, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.9999999987695397d, 1.0393353033587625d, 0.5603862049849778d, (-100));
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(63, (-110));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(0.05338287470879381d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05338287470879381d);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficient((-77), (-94));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(2.0f, 89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.23794004E27f);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }


    double var1 = org.apache.commons.math3.util.FastMath.sinh((-0.1388341757445717d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.13928060890758354d));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(0.056362217600843124d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05633238136817824d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-29), (-175));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    org.apache.commons.math3.util.ResizableDoubleArray var0 = new org.apache.commons.math3.util.ResizableDoubleArray();
    int var1 = var0.getExpansionMode();
    int var2 = var0.getExpansionMode();
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var0);
    float var4 = var3.getExpansionFactor();
    var3.addElement(9.0d);
    var3.contract();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements(37);
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

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    var0.reseedRandomGenerator(100L);
    boolean var7 = var0.isSupportConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test107() {}
//   public void test107() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     double var7 = var0.nextBeta(0.8102040310137474d, 1.766644200655088d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.2679228811801085d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-0.6267123454455888d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.3761294311811366d);
// 
//   }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt(0.671779336150837d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8758079443120118d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(0, 21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var4 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, (java.lang.Number)(short)(-1), var3);
    java.lang.Throwable[] var5 = var4.getSuppressed();
    java.lang.Number var6 = var4.getMax();
    java.lang.Number var7 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)(-1)+ "'", var6.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)(-1)+ "'", var7.equals((short)(-1)));

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }
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
//     long var23 = var0.nextLong(1260L, 2653561339983737856L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-70));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 25);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 1738435790633256704L);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh(4.798902448981544E-12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.798902448981544E-12d);

  }

  public void test113() {}
//   public void test113() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }
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
//       int var19 = var0.nextBinomial(79, 1.5574077246549023d);
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-73));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 73);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


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
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var25 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    org.apache.commons.math3.util.ResizableDoubleArray var27 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var28 = var27.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var29 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var30 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var29);
    org.apache.commons.math3.stat.ranking.TiesStrategy var31 = var30.getTiesStrategy();
    double[] var34 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var35 = new org.apache.commons.math3.util.ResizableDoubleArray(var34);
    double[] var36 = var35.getInternalValues();
    double[] var37 = var30.rank(var36);
    org.apache.commons.math3.stat.ranking.NaNStrategy var38 = var30.getNanStrategy();
    int var39 = var38.ordinal();
    org.apache.commons.math3.random.RandomGenerator var40 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var41 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var38, var40);
    int var42 = var38.ordinal();
    org.apache.commons.math3.stat.ranking.NaNStrategy var43 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy var44 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var45 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var44);
    org.apache.commons.math3.stat.ranking.TiesStrategy var46 = var45.getTiesStrategy();
    boolean var48 = var46.equals((java.lang.Object)2.5f);
    org.apache.commons.math3.stat.ranking.NaturalRanking var49 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var43, var46);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var38, var46);
    double[] var53 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var54 = new org.apache.commons.math3.util.ResizableDoubleArray(var53);
    double[] var55 = var54.getInternalValues();
    org.apache.commons.math3.stat.ranking.TiesStrategy var56 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var57 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var56);
    org.apache.commons.math3.stat.ranking.TiesStrategy var58 = var57.getTiesStrategy();
    double[] var61 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var62 = new org.apache.commons.math3.util.ResizableDoubleArray(var61);
    double[] var63 = var62.getInternalValues();
    double[] var64 = var57.rank(var63);
    double var65 = var50.mannWhitneyUTest(var55, var63);
    double var66 = var25.mannWhitneyU(var28, var63);
    double[] var69 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var70 = new org.apache.commons.math3.util.ResizableDoubleArray(var69);
    double[] var71 = var70.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var72 = new org.apache.commons.math3.util.ResizableDoubleArray(var70);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var73 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var76 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var77 = new org.apache.commons.math3.util.ResizableDoubleArray(var76);
    double[] var78 = var77.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var79 = new org.apache.commons.math3.util.ResizableDoubleArray(var77);
    double var81 = var77.addElementRolling(0.0d);
    double[] var82 = var77.getElements();
    double[] var83 = var77.getElements();
    double[] var86 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var87 = new org.apache.commons.math3.util.ResizableDoubleArray(var86);
    double[] var88 = var87.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var89 = new org.apache.commons.math3.util.ResizableDoubleArray(var87);
    double var91 = var87.addElementRolling(0.0d);
    double var93 = var87.substituteMostRecentElement(2.220446049250313E-16d);
    int var94 = var87.start();
    double[] var95 = var87.getElements();
    double var96 = var73.mannWhitneyUTest(var83, var95);
    var70.addElements(var95);
    double var98 = var24.mannWhitneyUTest(var63, var95);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 150.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 0.6985353583033387d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 0.6985353583033387d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var6 = var3.getNumElements();
    double[] var7 = var3.getElements();
    boolean var9 = var3.equals((java.lang.Object)(-85));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements((-54));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(0.5510054571581893d, 6.662756980709212E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5510054571984723d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-552473126826409984L), 2653561339983737856L);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = var1.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElement((-41), 0.0d);
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

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    double var4 = var0.getNumericalVariance();
    double var5 = var0.getNumericalVariance();
    double var6 = var0.getStandardDeviation();
    var0.reseedRandomGenerator((-1L));
    double var10 = var0.probability(4.372931278579628E-18d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.cumulativeProbability(1.1824871132044223E-9d, (-0.890260002156081d));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


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
    java.lang.String var22 = var21.name();
    org.apache.commons.math3.stat.ranking.NaturalRanking var23 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var21);
    java.lang.String var24 = var21.toString();
    java.lang.Class var25 = var21.getDeclaringClass();
    java.lang.String var26 = var21.toString();
    
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
    assertTrue("'" + var22 + "' != '" + "AVERAGE"+ "'", var22.equals("AVERAGE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "AVERAGE"+ "'", var24.equals("AVERAGE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "AVERAGE"+ "'", var26.equals("AVERAGE"));

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     var0.reSeedSecure(0L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setSecureAlgorithm("", "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
//       fail("Expected exception of type java.security.NoSuchProviderException");
//     } catch (java.security.NoSuchProviderException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-100));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode(3);
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

  public void test123() {}
//   public void test123() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }
// 
// 
//     org.apache.commons.math3.random.RandomGenerator var0 = null;
//     org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
//     java.util.Collection var2 = null;
//     java.lang.Object[] var4 = var1.nextSample(var2, 671893169);
// 
//   }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(2, 16);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.0d, 1.5607966601082315d);
    double var4 = var2.probability(1.766644200655088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var3 = var0.getNumericalMean();
//     boolean var4 = var0.isSupportLowerBoundInclusive();
//     boolean var5 = var0.isSupportLowerBoundInclusive();
//     boolean var6 = var0.isSupportConnected();
//     double var7 = var0.getMean();
//     double var8 = var0.sample();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double[] var10 = var0.sample((-70));
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
//     assertTrue(var3 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1.5377137238501901d));
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(36, (-22));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var5, 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var10 = org.apache.commons.math3.util.ArithmeticUtils.pow(var8, (-47));
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

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(1.41449942452733E-36d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    float var1 = org.apache.commons.math3.util.FastMath.nextUp(1.4210855E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210856E-14f);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.8755066060221833E-62d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8755066060221833E-62d);

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     java.lang.Object[] var4 = new java.lang.Object[] { 10};
//     org.apache.commons.math3.exception.MaxCountExceededException var5 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)(short)(-1), var4);
//     java.lang.Throwable[] var6 = var5.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalArgumentException var7 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var6);
//     org.apache.commons.math3.exception.MathInternalError var8 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var7);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-23));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    float var1 = org.apache.commons.math3.util.FastMath.signum((-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0f));

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var4 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, (-51));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-0.35913938368747433d), (java.lang.Number)(-114), (java.lang.Number)(-1));
    java.lang.Number var4 = var3.getLo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-114)+ "'", var4.equals((-114)));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    double var1 = org.apache.commons.math3.util.FastMath.rint(0.8427007929497151d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }
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
//       double var21 = var0.nextUniform(5.0d, 1.3874488093885192E-9d, false);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.023509059324643E-9d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 1.6438696507715254d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 0.49433623138273675d);
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
//     assertTrue(var17 == (-0.9458378504881872d));
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var1.getElement((-14));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    int var4 = var1.start();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.5607966601082315d, 8.00436565272179d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.00436565272179d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(1.7453292519943295d, (-3.1163541260031398d), 0.6002272555504838d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    double var1 = org.apache.commons.math3.special.Erf.erf(0.6198239740031684d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6192762121501395d);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-1.830211007852808d), var1, (java.lang.Number)0.5815791207581219d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-1), 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan((-4.503599627370497E15d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06390823168443646d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-1023));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    var0.reseedRandomGenerator(100L);
    double var5 = var0.getStandardDeviation();
    double var7 = var0.probability(0.4597333053541885d);
    var0.reseedRandomGenerator(902511928144852736L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }
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
//     java.util.Collection var21 = null;
//     java.lang.Object[] var23 = var0.nextSample(var21, (-107));
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(1.4210855E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm((-22), (-16));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 176);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(372, (-73));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-27156));

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    double var7 = var0.nextExponential(0.49049638908362825d);
    double var9 = var0.nextExponential(1.5713845747492456d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var12 = var0.nextBinomial((-54), (-0.7116919606539285d));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.4875474306513526d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(6469856410481231872L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.5574077246549023d, 1.0393353033587625d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5574077246549023d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-73));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.2630956032107625d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-72.37004718550756d));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var6 = var0.nextSecureLong(2L, 100L);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var9 = var0.nextInt(63, (-98));
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
//     assertTrue(var6 == 45L);
// 
//   }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }
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
//       java.lang.String var27 = var0.nextHexString((-20));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
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
//     assertTrue(var11 == 32);
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

  public void test162() {}
//   public void test162() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.NumberIsTooLargeException var5 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
//     java.lang.Number var6 = var5.getMax();
//     java.lang.Number var7 = var5.getArgument();
//     org.apache.commons.math3.exception.MathInternalError var8 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var5);
//     java.lang.Throwable[] var9 = var5.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException(var1, (java.lang.Object[])var9);
//     org.apache.commons.math3.exception.NullArgumentException var11 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var9);
//     java.lang.String var12 = var11.toString();
// 
//   }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma((-0.024815491250778372d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 39.678616286953876d);

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var5 = var0.nextGamma(1.5574077246549023d, (-1.2012104119580016d));
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var7 = var0.nextSecureHexString((-85));
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
//     assertTrue(var5 == (-1.537265875312053d));
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    double var1 = org.apache.commons.math3.util.FastMath.nextUp(2.981374056870167d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.9813740568701674d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-102), (-1.4E-45f), 1.0000001f, 0);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(0.5d, 9.0d, 0.7615941559557649d, (-42));
      fail("Expected exception of type org.apache.commons.math3.exception.MaxCountExceededException");
    } catch (org.apache.commons.math3.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    var1.contract();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNumElements((-102));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(1.9906445300379054d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(90, (-618816519));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(10.60460290274525d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.18508523651945266d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(115.18225325546747d, 0.05483113556160755d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9381916364439176d));

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }
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
//     double var19 = var0.nextExponential(0.22067136191984704d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-79));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 46);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var17 == 7.026872134823778d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == 0.041897618811773944d);
// 
//   }

  public void test175() {}
//   public void test175() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     long var5 = var0.nextLong((-1L), 0L);
//     var0.reSeedSecure();
//     int var9 = var0.nextSecureInt(30, 372);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var12 = var0.nextF(1.734996605925821d, (-1.127403745963549d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-1L));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 107);
// 
//   }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(71744535, (-108));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(1.0176351058563242d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.007592080632072426d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(5.9806034621180615d, 1.0453119545106444d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9992265135286629d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-54), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-54));

  }

  public void test180() {}
//   public void test180() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     double var5 = var0.nextF(0.14782604738794858d, 3.1415926535897936d);
//     java.lang.String var7 = var0.nextHexString(21);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var10 = var0.nextCauchy(0.9953222650189527d, (-0.9285865017878514d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.03302287142204186d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 8.551861569404826d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var7 + "' != '" + "b31e484a7787257399041"+ "'", var7.equals("b31e484a7787257399041"));
// 
//   }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(6L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6L);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    double[] var8 = var3.getElements();
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var8);
    var9.addElement(0.6556241835913665d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    float var6 = var3.getContractionCriteria();
    var3.addElement(1.0176351058563242d);
    float var9 = var3.getContractionCriteria();
    double var11 = var3.addElementRolling(0.5388411917497572d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var7 = new org.apache.commons.math3.exception.MaxCountExceededException(var3, (java.lang.Number)(short)(-1), var6);
    org.apache.commons.math3.exception.MathIllegalStateException var8 = new org.apache.commons.math3.exception.MathIllegalStateException(var2, var6);
    org.apache.commons.math3.exception.MaxCountExceededException var9 = new org.apache.commons.math3.exception.MaxCountExceededException(var0, var1, var6);
    java.lang.Number var10 = var9.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-50));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 40.45316394072901d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray(468, 10.0f, 100.0f, 8995349);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


    double var2 = org.apache.commons.math3.util.FastMath.copySign(1.5845023998721857E-9d, (-2.245945181602119d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5845023998721857E-9d));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum(0.5603862049849778d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-73), 6469856410481231871L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-976171513));

  }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.asin(1.5707963267948966d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     double var16 = var0.nextChiSquare(1.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var18 = var0.nextPoisson(0.0d);
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
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 16);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.3331168383272715d);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(0.7044482952846992d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.20748015729388d));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


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
    org.apache.commons.math3.stat.ranking.NaturalRanking var24 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    
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

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.TiesStrategy var13 = var12.getTiesStrategy();
    double[] var16 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var17 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double[] var18 = var17.getInternalValues();
    double[] var19 = var12.rank(var18);
    org.apache.commons.math3.stat.ranking.NaNStrategy var20 = var12.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21);
    org.apache.commons.math3.stat.ranking.TiesStrategy var23 = var22.getTiesStrategy();
    double[] var26 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var27 = new org.apache.commons.math3.util.ResizableDoubleArray(var26);
    double[] var28 = var27.getInternalValues();
    double[] var29 = var22.rank(var28);
    org.apache.commons.math3.stat.ranking.NaNStrategy var30 = var22.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var31 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var30);
    org.apache.commons.math3.stat.ranking.TiesStrategy var32 = var31.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var33 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var20, var32);
    int var34 = var32.ordinal();
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var35 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var32);
    double[] var38 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var39 = new org.apache.commons.math3.util.ResizableDoubleArray(var38);
    double[] var40 = var39.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var41 = new org.apache.commons.math3.util.ResizableDoubleArray(var39);
    double var43 = var39.substituteMostRecentElement(0.0d);
    double[] var44 = var39.getElements();
    double[] var47 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var48 = new org.apache.commons.math3.util.ResizableDoubleArray(var47);
    double[] var49 = var48.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var50 = new org.apache.commons.math3.util.ResizableDoubleArray(var48);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var51 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest();
    double[] var54 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var55 = new org.apache.commons.math3.util.ResizableDoubleArray(var54);
    double[] var56 = var55.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var57 = new org.apache.commons.math3.util.ResizableDoubleArray(var55);
    double var59 = var55.addElementRolling(0.0d);
    double[] var60 = var55.getElements();
    double[] var61 = var55.getElements();
    double[] var64 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var65 = new org.apache.commons.math3.util.ResizableDoubleArray(var64);
    double[] var66 = var65.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var67 = new org.apache.commons.math3.util.ResizableDoubleArray(var65);
    double var69 = var65.addElementRolling(0.0d);
    double var71 = var65.substituteMostRecentElement(2.220446049250313E-16d);
    int var72 = var65.start();
    double[] var73 = var65.getElements();
    double var74 = var51.mannWhitneyUTest(var61, var73);
    var48.addElements(var73);
    double var76 = var35.mannWhitneyUTest(var44, var73);
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.6985353583033387d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.12133525035848214d);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(115.45706259336124d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(7.026872134823778d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0827949296372137d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }


    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)1.1824871132044223E-9d, (java.lang.Number)(-552473126826409984L), false);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    double var13 = var0.nextExponential(0.4373817081192443d);
    double var16 = var0.nextCauchy(5.7998579189201327E-64d, 0.5210953054937475d);
    java.lang.String var18 = var0.nextHexString(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var21 = var0.nextPermutation(10, 8995349);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "ab4"+ "'", var18.equals("ab4"));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialDouble((-103));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)2.5f);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)0);
    java.lang.Number var2 = var1.getMax();
    org.apache.commons.math3.exception.NotPositiveException var4 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)(-2.698200072758446d));
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Number var6 = var1.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0+ "'", var6.equals(0));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(-1.423177876943437d));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    double var5 = var0.getNumericalVariance();
    var0.reseedRandomGenerator(100L);
    double var9 = var0.probability(1.7713659069359526E-40d);
    double var10 = var0.getNumericalMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }
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
//       long var19 = var0.nextSecureLong(1L, (-3222L));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
//     assertTrue(var11 == 92);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 0.6428720507104048d);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.869604401089358d, 7.026872134823778d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.84273226626558d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(2.8E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)0.7209210669314736d, (java.lang.Number)100, (java.lang.Number)(-0.8427007929497151d));
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var9 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var10 = var9.getMax();
    java.lang.Number var11 = var9.getArgument();
    java.lang.Throwable[] var12 = var9.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var13 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var5, (java.lang.Object[])var12);
    org.apache.commons.math3.exception.MathIllegalStateException var14 = new org.apache.commons.math3.exception.MathIllegalStateException((java.lang.Throwable)var3, var4, (java.lang.Object[])var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0.0f+ "'", var10.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.0d+ "'", var11.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var5 = var0.nextSecureInt(84, (-47));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.006310930905473339d);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(0.22067136191984704d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(19.714887418613912d, (-0.7211094712148152d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.6921780022305477d));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


    double var2 = org.apache.commons.math3.special.Erf.erf(0.0d, 2.0827949296372137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.99677584400507d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


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
    double[] var15 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var16 = new org.apache.commons.math3.util.ResizableDoubleArray(var15);
    double[] var17 = var16.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double var20 = var16.addElementRolling(0.0d);
    double var22 = var16.substituteMostRecentElement(2.220446049250313E-16d);
    int var23 = var16.start();
    var16.contract();
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
    java.lang.Class var48 = var46.getDeclaringClass();
    boolean var49 = var16.equals((java.lang.Object)var46);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var50 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var46);
    java.lang.String var51 = var46.name();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "AVERAGE"+ "'", var51.equals("AVERAGE"));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


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
      double var34 = var3.getElement(4);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(2.0827949296372137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1231755110397246d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((-175), 372);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(6917529027641081856L, 66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-0.1494681981443936d), (java.lang.Number)(-0.35913938368747433d), true);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var22 = var0.nextWeibull((-0.215551206382648d), 0.18508523651945266d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-3));
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
//     assertTrue(var19 == 0.35300672616711454d);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var14 = new double[] { (-1.0d), 100.0d, (-1.0d)};
    var3.addElements(var14);
    double var17 = var3.substituteMostRecentElement(0.5000000000000001d);
    float var18 = var3.getContractionCriteria();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2.5f);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-42));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var22 = var0.nextPermutation(80, (-114));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-117));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 6);
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
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(10.60460290274525d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11L);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    boolean var4 = var0.isSupportLowerBoundInclusive();
    double var6 = var0.cumulativeProbability((-0.6229408772788463d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.2666616872757418d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog((-184));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    float var8 = var3.getExpansionFactor();
    org.apache.commons.math3.random.RandomDataImpl var9 = new org.apache.commons.math3.random.RandomDataImpl();
    var9.reSeed(100L);
    long var14 = var9.nextLong((-1L), 0L);
    var9.reSeedSecure();
    int var18 = var9.nextInt((-127), (-70));
    java.lang.String var20 = var9.nextSecureHexString(10598444);
    boolean var21 = var3.equals((java.lang.Object)10598444);
    org.apache.commons.math3.util.ResizableDoubleArray var22 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var22);
      fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException");
    } catch (org.apache.commons.math3.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    org.apache.commons.math3.stat.ranking.TiesStrategy var0 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
    org.apache.commons.math3.stat.ranking.TiesStrategy var2 = var1.getTiesStrategy();
    double[] var5 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var6 = new org.apache.commons.math3.util.ResizableDoubleArray(var5);
    double[] var7 = var6.getInternalValues();
    double[] var8 = var1.rank(var7);
    org.apache.commons.math3.stat.ranking.NaNStrategy var9 = var1.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var10 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9);
    org.apache.commons.math3.stat.ranking.TiesStrategy var11 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var12 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var11);
    org.apache.commons.math3.stat.ranking.TiesStrategy var13 = var12.getTiesStrategy();
    double[] var16 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var17 = new org.apache.commons.math3.util.ResizableDoubleArray(var16);
    double[] var18 = var17.getInternalValues();
    double[] var19 = var12.rank(var18);
    org.apache.commons.math3.stat.ranking.NaNStrategy var20 = var12.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var21 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var22 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var21);
    org.apache.commons.math3.stat.ranking.TiesStrategy var23 = var22.getTiesStrategy();
    double[] var26 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var27 = new org.apache.commons.math3.util.ResizableDoubleArray(var26);
    double[] var28 = var27.getInternalValues();
    double[] var29 = var22.rank(var28);
    org.apache.commons.math3.stat.ranking.NaNStrategy var30 = var22.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var31 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var30);
    org.apache.commons.math3.stat.ranking.TiesStrategy var32 = var31.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var33 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var20, var32);
    java.lang.Class var34 = var32.getDeclaringClass();
    org.apache.commons.math3.stat.ranking.NaturalRanking var35 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var32);
    org.apache.commons.math3.stat.ranking.TiesStrategy var36 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var37 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var36);
    org.apache.commons.math3.stat.ranking.TiesStrategy var38 = var37.getTiesStrategy();
    double[] var41 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var42 = new org.apache.commons.math3.util.ResizableDoubleArray(var41);
    double[] var43 = var42.getInternalValues();
    double[] var44 = var37.rank(var43);
    org.apache.commons.math3.stat.ranking.NaNStrategy var45 = var37.getNanStrategy();
    org.apache.commons.math3.stat.ranking.TiesStrategy var46 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var47 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var46);
    org.apache.commons.math3.stat.ranking.TiesStrategy var48 = var47.getTiesStrategy();
    double[] var51 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var52 = new org.apache.commons.math3.util.ResizableDoubleArray(var51);
    double[] var53 = var52.getInternalValues();
    double[] var54 = var47.rank(var53);
    org.apache.commons.math3.stat.ranking.NaNStrategy var55 = var47.getNanStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var56 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var55);
    org.apache.commons.math3.stat.ranking.TiesStrategy var57 = var56.getTiesStrategy();
    org.apache.commons.math3.stat.ranking.NaturalRanking var58 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var45, var57);
    org.apache.commons.math3.stat.inference.MannWhitneyUTest var59 = new org.apache.commons.math3.stat.inference.MannWhitneyUTest(var9, var57);
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }
// 
// 
//     double var2 = org.apache.commons.math3.util.FastMath.log((-2.698200072758446d), 3.4279602128629287d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }


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
    java.lang.String var24 = var9.name();
    
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
    assertTrue("'" + var24 + "' != '" + "MAXIMAL"+ "'", var24.equals("MAXIMAL"));

  }

  public void test232() {}
//   public void test232() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     double var4 = var0.nextChiSquare(2.993222846126381d);
//     double var7 = var0.nextCauchy((-1.896930644797258E157d), 1.307674368E12d);
//     var0.reSeedSecure();
//     double var10 = var0.nextT(0.6717793361508371d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       long var13 = var0.nextSecureLong(11L, (-3042L));
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
//     assertTrue(var4 == 1.311016503349777d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-1.896930644797258E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 3.3234881385047825d);
// 
//   }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(10, 1.4E-45f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }


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
    org.apache.commons.math3.random.RandomGenerator var12 = null;
    org.apache.commons.math3.stat.ranking.NaturalRanking var13 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var9, var12);
    org.apache.commons.math3.stat.ranking.NaNStrategy var14 = var13.getNanStrategy();
    
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

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getArgument();
    boolean var6 = var3.getBoundIsAllowed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    org.apache.commons.math3.exception.util.ExceptionContext var8 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0f+ "'", var4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0d+ "'", var5.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(0.2666616872757418d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2731674290021756d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-90L), (-180L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-270L));

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements((-118));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    boolean var4 = var0.isSupportLowerBoundInclusive();
    boolean var5 = var0.isSupportLowerBoundInclusive();
    boolean var6 = var0.isSupportConnected();
    double var7 = var0.getMean();
    double var8 = var0.getSupportUpperBound();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.cumulativeProbability(150.0d, 1.8712081909397543E-9d);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.POSITIVE_INFINITY);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }
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
//     var0.reSeedSecure();
//     double var24 = var0.nextChiSquare(1.000000000000013d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-121));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 76);
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
//     assertTrue(var24 == 1.5599489905203603d);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos((-0.6734916263077155d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3097185641088296d);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-54), (-10));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck((-74), 74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(3.0d, 0.0d, 1.7598948720186276d, (-38));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-17), 2.0f, 1.1368684E-13f, (-55));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(0, Double.NaN);
    var3.addElement(0.3978253612069936d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardFrontElements((-17));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }


    double var2 = org.apache.commons.math3.util.FastMath.pow(3.65259564434486d, 0.007592080632072426d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.009883593379991d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(1.1824871132044223E-9d, 0.43641834738962487d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.43641834738962487d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    double var1 = org.apache.commons.math3.util.FastMath.log1p(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.791759469228055d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(1.9946535330696554E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(671893169);
      fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException");
    } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var5.contract();
    double var8 = var5.substituteMostRecentElement(0.5172725925802899d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


    double var1 = org.apache.commons.math3.util.FastMath.asin(4.798902448981544E-12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.798902448981544E-12d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }


    double var1 = org.apache.commons.math3.util.FastMath.cosh((-0.9229546454449029d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4570293567706412d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh((-0.812595528807679d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6710195928831936d));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    double var1 = org.apache.commons.math3.util.FastMath.log10(7.750818884463626E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-17.110652411272213d));

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


    double var1 = org.apache.commons.math3.util.FastMath.cos((-0.9285865017878514d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5989664730340137d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-276308199), (-73));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-276308126));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp((-0.215551206382648d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.5212865751209389d, 0.4373817081192443d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.inverseCumulativeProbability(0.4373817081192443d);
    double var3 = var0.getStandardDeviation();
    double var4 = var0.getSupportUpperBound();
    double var6 = var0.density(0.0d);
    double var7 = var0.getSupportUpperBound();
    double var8 = var0.getSupportUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1576108974116944d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.3989422804014327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == Double.POSITIVE_INFINITY);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.5510054571581893d, 1.8755066060221833E-62d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 238.47127066755266d);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(2.7495685662163734E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP(3.1415926535897936d, 23.137931794777643d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.999999964194097d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math3.exception.MathArithmeticException var2 = new org.apache.commons.math3.exception.MathArithmeticException(var0, var1);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(0.11877446081942718d, 5.476971727157973d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.11877446081942719d);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(7L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(0.5000000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7071067811865476d);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(0.011220233953944515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.011283416866837995d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-10), 0);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(57, (-110));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-53));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((-88), (-276308207));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor((-4.503599627370497E15d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.503599627370497E15d));

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)2.993222846126381d, (java.lang.Number)3.4279602128629287d, (java.lang.Number)9.0d);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }


    int var1 = org.apache.commons.math3.util.FastMath.round(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }


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
      java.lang.Enum var16 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "org.apache.commons.math3.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (1.557)");
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

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


    double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog(25, (-41));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    double[] var8 = var3.getElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElement((-175), (-0.5802933415744765d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


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
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "5858e69");
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

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble(3, 88);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-112), (-50));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.05066297352460297d, 1.9572102603976436d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.05066297352460297d);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.0234917754783677d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-58.64175910126171d));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


    long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20922789888000L);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }


    double var1 = org.apache.commons.math3.special.Gamma.lanczos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 32.94631867978169d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var20 = var13.getElement((-2));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)7239.0451181011d, (java.lang.Number)(-0.5954271189370909d), (java.lang.Number)(-0.7211094712148152d));
    org.apache.commons.math3.exception.MaxCountExceededException var5 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)(-0.6734916263077155d));
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Number var7 = var5.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (-0.6734916263077155d)+ "'", var7.equals((-0.6734916263077155d)));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(0.8894342610054773d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(2.8E-45f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8E-45f);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    float var3 = var1.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var4 = var1.copy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setNumElements((-79));
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

  }

  public void test291() {}
//   public void test291() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     double var4 = var0.inverseCumulativeProbability(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.5105764685628476d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NEGATIVE_INFINITY);
// 
//   }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    double var2 = org.apache.commons.math3.util.FastMath.log(0.0d, 1.2183422052836203E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


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
      java.lang.Enum var25 = java.lang.Enum.<java.lang.Enum>valueOf(var23, "c84b177d3367a46");
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

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(2.8E-45f, (-1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.8E-45f));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    double var1 = org.apache.commons.math3.util.ArithmeticUtils.factorialLog(8616612);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2898381901895386E8d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(1.8166396139736133E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8166396139736133E-9d);

  }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int[] var22 = var0.nextPermutation(74, 176);
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
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
//     assertTrue(var11 == 69);
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
//   }

  public void test298() {}
//   public void test298() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-0.8765514250489875d), (-1.896930644797258E157d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    org.apache.commons.math3.util.ResizableDoubleArray var9 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var10 = var9.getNumElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.setExpansionMode(46);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(180L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(9.542704755906336E-110d, 0.058114982783409486d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.058114982783409486d);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(15.548633291782874d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.548633291782874d);

  }

  public void test303() {}
//   public void test303() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var6 = var0.nextBeta(0.0d, 1.6522351127874555d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException");
//     } catch (org.apache.commons.math3.exception.NoBracketingException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.3256475605846833E-9d);
// 
//   }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }
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
//     double var26 = var19.getStandardDeviation();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-105));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var21 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == 0.5000000000000001d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var24 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var25 == 0.30262378459840933d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var26 == 1.0d);
// 
//   }

  public void test305() {}
//   public void test305() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     double var18 = var0.nextGaussian((-0.5954271189370909d), 0.6198239740031684d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var20 = var0.nextSecureHexString((-42));
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
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 26);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "6043d13"+ "'", var15.equals("6043d13"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-1.0234917754783677d));
// 
//   }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-47), (-1.4E-45f), (-1.0f), (-102));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.1368684E-13f, 1.4210855E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368684E-13f);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs((-2.3239247451534874E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.3239247451534874E-9d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)0L);
    java.lang.Number var3 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 0+ "'", var3.equals(0));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.41449942452733E-36d, 1.5131459651989522E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5131459651989522E-9d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)0.7209210669314736d, (java.lang.Number)10L, var3);
    java.lang.Number var5 = var4.getLo();
    java.lang.Number var6 = var4.getArgument();
    java.lang.Number var7 = var4.getLo();
    java.lang.Number var8 = var4.getArgument();
    java.lang.Number var9 = var4.getHi();
    java.lang.Throwable[] var10 = var4.getSuppressed();
    java.lang.Number var11 = var4.getLo();
    
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
    assertTrue("'" + var11 + "' != '" + 10L+ "'", var11.equals(10L));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    double var2 = org.apache.commons.math3.util.FastMath.min((-0.9927171106284476d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9927171106284476d));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(2.7755575615628914E-17d, 2.723562786617452E22d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.723562786617452E22d);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution((-0.9050225767665427d), (-0.9285865017878514d), 15.548633291782874d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var3 = var0.getNumericalMean();
//     boolean var4 = var0.isSupportLowerBoundInclusive();
//     boolean var5 = var0.isSupportLowerBoundInclusive();
//     boolean var6 = var0.isSupportConnected();
//     double var7 = var0.getMean();
//     double var8 = var0.sample();
//     double var9 = var0.getSupportUpperBound();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.007110163502012132d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == Double.POSITIVE_INFINITY);
// 
//   }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }


    double var2 = org.apache.commons.math3.util.FastMath.hypot(1.2183422052836203E-9d, 1.1824871132044225E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.6978320005436003E-9d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.1368685E-13f, (-1.4E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.1368685E-13f));

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     int var5 = var0.nextPascal(36, 0.5210953054937475d);
//     double var8 = var0.nextWeibull(1.41449942452733E-36d, 1.1656246617612935d);
//     org.apache.commons.math3.distribution.IntegerDistribution var9 = null;
//     int var10 = var0.nextInversionDeviate(var9);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var14 = new double[] { (-1.0d), 100.0d, (-1.0d)};
    var3.addElements(var14);
    double var17 = var3.substituteMostRecentElement(0.5000000000000001d);
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.discardMostRecentElements(69);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.OutOfRangeException var4 = new org.apache.commons.math3.exception.OutOfRangeException(var0, (java.lang.Number)(-2.698200072758446d), (java.lang.Number)(-6.12684151706252E-4d), (java.lang.Number)9.550073087603984d);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(74, (-5));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 79);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(1.3246090892520057d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02311878990929093d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    double var1 = org.apache.commons.math3.util.FastMath.expm1(0.9983063366701814d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7136818706955432d);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees(1.1071487177940904d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 63.434948822922d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)66, var1, true);
    java.lang.Number var4 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


    double var2 = org.apache.commons.math3.util.FastMath.max(1.3246090892520057d, 1.1824871132044223E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3246090892520057d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma((-0.9707742654246908d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1173.4018394875266d);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    long var2 = org.apache.commons.math3.util.FastMath.max(3L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }
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
//     long var22 = var0.nextPoisson(1.6583150819385577E-9d);
//     java.lang.String var24 = var0.nextSecureHexString(80);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-91));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 16);
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
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var22 == 0L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var24 + "' != '" + "ece1bee7e90b6607ec8a327f8b733a4f1b70268091d3b412e15b77f7e7eb2ad0568378ca08c8c375"+ "'", var24.equals("ece1bee7e90b6607ec8a327f8b733a4f1b70268091d3b412e15b77f7e7eb2ad0568378ca08c8c375"));
// 
//   }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(1.23794004E27f, (-85));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 32.0f);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test331"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)34, (java.lang.Number)6548440436062887936L, false);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test332"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.cumulativeProbability(2.220446049250313E-16d);
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getNumericalVariance();
    double var7 = var0.getNumericalMean();
    boolean var8 = var0.isSupportConnected();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test333"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(1.5845023998721857E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.765478388352142E-11d);

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test334"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     int var5 = var0.nextPascal(36, 0.5210953054937475d);
//     double var8 = var0.nextWeibull(1.41449942452733E-36d, 1.1656246617612935d);
//     java.lang.String var10 = var0.nextHexString(69);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 1.5415703049858722d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 30);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var10 + "' != '" + "9c2536019d2f71376ce59fdd0c36d6e93e79cee2ed4936ea15306fc638311b52f88a4"+ "'", var10.equals("9c2536019d2f71376ce59fdd0c36d6e93e79cee2ed4936ea15306fc638311b52f88a4"));
// 
//   }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test335"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var1 = var0.getNumericalMean();
    double var2 = var0.getNumericalMean();
    boolean var3 = var0.isSupportConnected();
    double var4 = var0.getMean();
    boolean var5 = var0.isSupportLowerBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test336"); }
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
//     var0.reSeed(179L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-83));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 97);
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

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test337"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, var1, (java.lang.Number)(-0.40030753423026644d), true);
    java.lang.Number var5 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-0.40030753423026644d)+ "'", var5.equals((-0.40030753423026644d)));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test338"); }


    double var1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.8969306447972577E157d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0868611997591276E159d));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test339"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.0d, 1.5607966601082315d);
    boolean var3 = var2.isSupportConnected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test340"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    var3.contract();
    float var12 = var3.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.discardMostRecentElements(18);
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
    assertTrue(var12 == 2.5f);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test341"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow((-112), 333032039);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test342"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    int var10 = var3.start();
    int var11 = var3.start();
    
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
    assertTrue(var11 == 1);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test343"); }


    long var1 = org.apache.commons.math3.util.FastMath.abs(15L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15L);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test344"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.inverseCumulativeProbability(0.0d);
    var0.reseedRandomGenerator(100L);
    double var8 = var0.cumulativeProbability(1.1559327705920959d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.8761456714480222d);

  }

  public void test345() {}
//   public void test345() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test345"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-0.8427007929497151d), 0.13234520580138529d, 0.9231377113408568d, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test346"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.stat.ranking.NaNStrategy var1 = org.apache.commons.math3.stat.ranking.NaNStrategy.valueOf("c84b177d3367a46");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test347"); }


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
      var13.discardMostRecentElements((-93));
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

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test348"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd(71744535, (-78));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(0, (-6917529027641081849L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test350"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-276308207), (-111));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-276308207));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test351"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotStrictlyPositiveException var2 = new org.apache.commons.math3.exception.NotStrictlyPositiveException(var0, (java.lang.Number)(byte)10);
    org.apache.commons.math3.exception.util.ExceptionContext var3 = var2.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test352"); }


    double var1 = org.apache.commons.math3.util.FastMath.asinh(0.8761456714480222d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7910306863104644d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test353"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(9.999999f, 1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test354"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var3 = org.apache.commons.math3.util.ArithmeticUtils.pow(var1, 0L);
//     java.math.BigInteger var4 = null;
//     java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var4, 0L);
//     java.math.BigInteger var7 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, var6);
//     java.math.BigInteger var9 = org.apache.commons.math3.util.ArithmeticUtils.pow(var7, 902511928144852736L);
//     java.math.BigInteger var11 = org.apache.commons.math3.util.ArithmeticUtils.pow(var7, 6917529027641081856L);
//     java.math.BigInteger var12 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, var11);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test355"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)1.5205356215110556E-9d);
    org.apache.commons.math3.exception.util.ExceptionContext var2 = var1.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test356() {}
//   public void test356() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test356"); }
// 
// 
//     org.apache.commons.math3.random.RandomGenerator var0 = null;
//     org.apache.commons.math3.stat.ranking.NaturalRanking var1 = new org.apache.commons.math3.stat.ranking.NaturalRanking(var0);
//     org.apache.commons.math3.stat.ranking.NaNStrategy var2 = var1.getNanStrategy();
//     org.apache.commons.math3.stat.ranking.TiesStrategy var3 = var1.getTiesStrategy();
//     double[] var4 = null;
//     double[] var5 = var1.rank(var4);
// 
//   }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test357"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    java.lang.Object var4 = null;
    boolean var5 = var3.equals(var4);
    var3.addElement(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionFactor(0.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test358"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test359() {}
//   public void test359() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test359"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt(100, 14348907);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var7 = var0.nextHexString(2147483647);
//       fail("Expected exception of type java.lang.OutOfMemoryError");
//     } catch (java.lang.OutOfMemoryError e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 9283985);
// 
//   }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test360"); }
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
//     int var23 = var0.nextSecureInt((-22), 1);
//     var0.reSeedSecure();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-89));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 20);
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
//     assertTrue(var23 == 1);
// 
//   }

  public void test361() {}
//   public void test361() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test361"); }
// 
// 
//     double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ((-1.2388082580833257d), 2.220446049250313E-16d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test362"); }


    double var1 = org.apache.commons.math3.util.FastMath.floor((-0.5802933415744765d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test363"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos((-0.024815491250778372d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5956143656839032d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test364"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var4 = var0.density(0.5210953054937475d);
    double var7 = var0.cumulativeProbability(0.0d, 3.1415926535897936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.34829387335298634d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.4991598418317366d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test365"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NotPositiveException var2 = new org.apache.commons.math3.exception.NotPositiveException(var0, (java.lang.Number)0.8427007929497151d);

  }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test366"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextT(1.766644200655088d);
//     double var4 = var0.nextT(10.0d);
//     double var8 = var0.nextUniform(0.0d, 1.9906445300379054d, true);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.10486158271829911d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == 0.7242239390346705d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0.10244782475453244d);
// 
//   }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test367"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(0.013576851530780462d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.013576434429086761d);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test368"); }


    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)1.8166396139736133E-9d, (java.lang.Number)9.181822810259439d, (java.lang.Number)(-22));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test369"); }


    double var2 = org.apache.commons.math3.util.FastMath.scalb(0.011724761262693876d, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0468990450507755d);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test370"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var3 = new org.apache.commons.math3.exception.NumberIsTooSmallException((java.lang.Number)(-1.8969306447972577E157d), var1, false);
    java.lang.Number var4 = var3.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test371"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-32), (-34));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test372"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.0d, (-1.9223264562192064d), 1.2898381901895386E8d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test373"); }


    double var1 = org.apache.commons.math3.special.Erf.erfc(0.533126106571059d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4508767413532666d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test374"); }


    double var2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2666616872757418d, 1.5707963251365815d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.2666616872757418d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test375"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double var9 = var3.substituteMostRecentElement(2.220446049250313E-16d);
    org.apache.commons.math3.util.ResizableDoubleArray var10 = var3.copy();
    float var11 = var3.getExpansionFactor();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = var3.copy();
    int var13 = var3.getNumElements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setExpansionMode((-42));
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
    assertTrue(var13 == 2);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test376"); }


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
      double var19 = var0.nextGaussian(1.4494495589266545E-9d, 0.0d);
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
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

  public void test377() {}
//   public void test377() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test377"); }
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
//       int var22 = var0.nextPascal(21, (-1.3637650292233107E-33d));
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
//     assertTrue(var11 == 5);
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

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test378"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    int var6 = var3.getNumElements();
    double[] var7 = var3.getElements();
    boolean var9 = var3.equals((java.lang.Object)(-85));
    var3.contract();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNumElements((-184));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test379"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math3.util.ArithmeticUtils.factorial((-23));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test380"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.020492736543359383d, 2.2172257481304234d);
    double var3 = var2.getNumericalMean();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.020492736543359383d);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test381"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(50, (-13));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-13));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test382"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(67, (-38));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 105);

  }

  public void test383() {}
//   public void test383() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test383"); }
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
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.String var13 = var0.nextSecureHexString((-276308207));
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
//     assertTrue(var4 == 0.2105891516788968d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == (-0.1576108974116944d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == (-0.1625833131177793d));
// 
//   }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test384"); }


    double var1 = org.apache.commons.math3.util.FastMath.cbrt(0.10486158271829911d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4715620019895047d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test385"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-90L), 1260L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-113400L));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(6L, (-552473126826409984L));
      fail("Expected exception of type org.apache.commons.math3.exception.NotPositiveException");
    } catch (org.apache.commons.math3.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test387() {}
//   public void test387() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test387"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var3 = new org.apache.commons.math3.distribution.NormalDistribution(0.4373817081192443d, 1.9572102603976436d, 0.013576851530780462d);
//     double var4 = var3.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == (-0.8875554497681712d));
// 
//   }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test388"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy[] var3 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
    org.apache.commons.math3.exception.MathIllegalStateException var4 = new org.apache.commons.math3.exception.MathIllegalStateException(var2, (java.lang.Object[])var3);
    org.apache.commons.math3.exception.MathInternalError var5 = new org.apache.commons.math3.exception.MathInternalError(var1, (java.lang.Object[])var3);
    org.apache.commons.math3.exception.NullArgumentException var6 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var3);
    org.apache.commons.math3.exception.util.Localizable var7 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
    java.lang.Number var12 = var11.getMax();
    java.lang.Number var13 = var11.getArgument();
    java.lang.Throwable[] var14 = var11.getSuppressed();
    org.apache.commons.math3.exception.MathIllegalArgumentException var15 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var7, (java.lang.Object[])var14);
    var6.addSuppressed((java.lang.Throwable)var15);
    org.apache.commons.math3.exception.util.Localizable var17 = null;
    org.apache.commons.math3.exception.util.Localizable var18 = null;
    java.lang.Number var19 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy[] var20 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
    org.apache.commons.math3.exception.MaxCountExceededException var21 = new org.apache.commons.math3.exception.MaxCountExceededException(var18, var19, (java.lang.Object[])var20);
    org.apache.commons.math3.exception.MathIllegalStateException var22 = new org.apache.commons.math3.exception.MathIllegalStateException(var17, (java.lang.Object[])var20);
    var6.addSuppressed((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.0f+ "'", var12.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 1.0d+ "'", var13.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test389"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(1.5301368204596435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9889052880156644d);

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test390"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     double var5 = var0.nextUniform((-1.0743009312480056d), 0.0d);
//     java.util.Collection var6 = null;
//     java.lang.Object[] var8 = var0.nextSample(var6, (-10));
// 
//   }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test391"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(2.281783181607902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.466206360324285d);

  }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test392"); }
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
//       java.lang.String var22 = var0.nextHexString((-116));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
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
//     assertTrue(var11 == 79);
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

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test393"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8302490352228529d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test394"); }


    org.apache.commons.math3.random.RandomGenerator var0 = null;
    org.apache.commons.math3.random.RandomDataImpl var1 = new org.apache.commons.math3.random.RandomDataImpl(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var4 = var1.nextSecureInt(1292, 100);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test395"); }


    double var1 = org.apache.commons.math3.util.FastMath.acos(1.41449942452733E-36d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test396"); }


    float var2 = org.apache.commons.math3.util.FastMath.scalb(1.0000001f, 36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.8719485E10f);

  }

  public void test397() {}
//   public void test397() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test397"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     double var18 = var0.nextGaussian((-0.5954271189370909d), 0.6198239740031684d);
//     var0.reSeedSecure();
//     java.util.Collection var20 = null;
//     java.lang.Object[] var22 = var0.nextSample(var20, (-276308126));
// 
//   }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test398"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-107), 1292);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1399));

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test399"); }


    double var1 = org.apache.commons.math3.util.FastMath.atan(1.2183422052836203E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2183422052836203E-9d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test400"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(0.06390823168443646d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 246.34581953879072d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test401"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(2.9524258967767216d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9038191318719038d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test402"); }


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
    java.lang.Number var13 = var12.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 2.022730427113892d+ "'", var13.equals(2.022730427113892d));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test403"); }


    double var1 = org.apache.commons.math3.special.Erf.erf((-0.6710195928831936d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6573615911118675d));

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test404"); }


    double var1 = org.apache.commons.math3.util.FastMath.toRadians(1.1231755110397246d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.019603110745413113d);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test405"); }


    org.apache.commons.math3.distribution.NormalDistribution var2 = new org.apache.commons.math3.distribution.NormalDistribution(0.0579238123993394d, 213.53224149456327d);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientDouble((-112), 1292);
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test407"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    double var12 = var0.nextGaussian(1.7713659069359526E-40d, 115.45706259336124d);
    double var14 = var0.nextT(0.7209210669314736d);
    long var16 = var0.nextPoisson(2.7495685662163734E-10d);
    var0.reSeedSecure(15L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var21 = var0.nextCauchy(0.9999999987695397d, (-0.7656658570186433d));
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
    assertTrue(var14 == 0.58701019592818d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0L);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test408"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.cumulativeProbability(0.0d, (-0.5722073814834792d));
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
//     assertTrue(var2 == (-0.9669916334462957d));
// 
//   }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test409"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(34, 38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 646);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test410"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    float var11 = var3.getExpansionFactor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2.0f);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test411"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-270L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test412"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(1.6522351127874555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test413"); }


    long var2 = org.apache.commons.math3.util.FastMath.max((-90L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test414"); }
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
//       int[] var17 = var0.nextPermutation(87, (-28));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-110));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 66);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
// 
//   }

  public void test415() {}
//   public void test415() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test415"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP(0.0d, 1.8755066060221833E-62d, (-4.671757607430453d), (-976171513));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test416"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    var3.clear();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setNumElements((-127));
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

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test417"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    boolean var4 = var0.isSupportLowerBoundInclusive();
    boolean var5 = var0.isSupportLowerBoundInclusive();
    boolean var6 = var0.isSupportConnected();
    double var7 = var0.getStandardDeviation();
    double var9 = var0.cumulativeProbability(1.223524972501522d);
    boolean var10 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.8894342610054773d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test418"); }


    int var2 = org.apache.commons.math3.util.FastMath.min(12, (-8));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8));

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test419"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(1.4210856E-14f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210856E-14f);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test420"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck(20L, 2653561339983737856L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2653561339983737836L));

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test421"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.subAndCheck((-104), (-175));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 71);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test422"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(1.3552527E-20f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6155871E-27f);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test423"); }


    double var1 = org.apache.commons.math3.special.Gamma.trigamma(1.5301368204596435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9104493169731528d);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test424"); }


    double var2 = org.apache.commons.math3.special.Gamma.regularizedGammaQ(1.5131459651989522E-9d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test425"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.stat.ranking.NaNStrategy[] var5 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
    org.apache.commons.math3.exception.MathIllegalStateException var6 = new org.apache.commons.math3.exception.MathIllegalStateException(var4, (java.lang.Object[])var5);
    org.apache.commons.math3.exception.MathInternalError var7 = new org.apache.commons.math3.exception.MathInternalError(var3, (java.lang.Object[])var5);
    org.apache.commons.math3.exception.MaxCountExceededException var8 = new org.apache.commons.math3.exception.MaxCountExceededException(var1, (java.lang.Number)1.5131459651989522E-9d, (java.lang.Object[])var5);
    org.apache.commons.math3.exception.MathIllegalArgumentException var9 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test426"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.49049638908362825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test427() {}
//   public void test427() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test427"); }
// 
// 
//     double var4 = org.apache.commons.math3.special.Gamma.regularizedGammaP((-0.8765514250489875d), 0.0d, 1.5047858965555605E-6d, 102);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test428"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp((-2.8E-45f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var2 = new org.apache.commons.math3.util.ResizableDoubleArray(3, 9.536743E-7f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test430"); }


    float var1 = org.apache.commons.math3.util.FastMath.abs(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.99999994f);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test431"); }


    org.apache.commons.math3.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math3.exception.NotStrictlyPositiveException((java.lang.Number)(-5735339L));

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test432"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-1L), 18L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-18L));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test433"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.1368684E-13f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368684E-13f);

  }

  public void test434() {}
//   public void test434() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test434"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextExponential(0.14782604738794858d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var5 = var0.nextUniform(7.416126414376327E-15d, (-1.0743009312480056d));
//       fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
//     } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.09666338481193025d);
// 
//   }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test435"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    float var2 = var1.getContractionCriteria();
    double var4 = var1.addElementRolling(0.038581377435943975d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.discardMostRecentElements((-16));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test436"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, (-1.1368685E-13f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100.0f));

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test437"); }


    double var1 = org.apache.commons.math3.util.FastMath.sin(9.542704755906336E-110d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.542704755906336E-110d);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test438"); }


    float var2 = org.apache.commons.math3.util.FastMath.max(9.536743E-7f, 1.23794004E27f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.23794004E27f);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test439"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    java.lang.Object[] var4 = new java.lang.Object[] { (short)(-1)};
    org.apache.commons.math3.exception.MathArithmeticException var5 = new org.apache.commons.math3.exception.MathArithmeticException(var2, var4);
    org.apache.commons.math3.exception.MathInternalError var6 = new org.apache.commons.math3.exception.MathInternalError(var1, var4);
    org.apache.commons.math3.exception.MathIllegalStateException var7 = new org.apache.commons.math3.exception.MathIllegalStateException(var0, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test440"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck(179L, 6L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1074L);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test441"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray((-53), 0.0f, (-1.1368685E-13f));
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test442"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.util.Localizable var1 = null;
    org.apache.commons.math3.exception.util.Localizable var2 = null;
    org.apache.commons.math3.exception.util.Localizable var3 = null;
    org.apache.commons.math3.exception.util.Localizable var4 = null;
    org.apache.commons.math3.exception.util.Localizable var5 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 10};
    org.apache.commons.math3.exception.MaxCountExceededException var9 = new org.apache.commons.math3.exception.MaxCountExceededException(var5, (java.lang.Number)(short)(-1), var8);
    org.apache.commons.math3.exception.MathIllegalStateException var10 = new org.apache.commons.math3.exception.MathIllegalStateException(var4, var8);
    org.apache.commons.math3.exception.MathArithmeticException var11 = new org.apache.commons.math3.exception.MathArithmeticException(var3, var8);
    org.apache.commons.math3.exception.MathIllegalStateException var12 = new org.apache.commons.math3.exception.MathIllegalStateException(var2, var8);
    org.apache.commons.math3.exception.MathIllegalStateException var13 = new org.apache.commons.math3.exception.MathIllegalStateException(var1, var8);
    org.apache.commons.math3.exception.MathIllegalArgumentException var14 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var0, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test443"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.substituteMostRecentElement(0.0d);
    float var8 = var3.getExpansionFactor();
    org.apache.commons.math3.random.RandomDataImpl var9 = new org.apache.commons.math3.random.RandomDataImpl();
    var9.reSeed(100L);
    long var14 = var9.nextLong((-1L), 0L);
    var9.reSeedSecure();
    int var18 = var9.nextInt((-127), (-70));
    java.lang.String var20 = var9.nextSecureHexString(10598444);
    boolean var21 = var3.equals((java.lang.Object)10598444);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setElement((-78), (-9.479210783530794d));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test444"); }


    double var1 = org.apache.commons.math3.util.FastMath.ulp(0.8175605202409767d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test445"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)2.5f);
    org.apache.commons.math3.exception.MathInternalError var2 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test446"); }


    long var1 = org.apache.commons.math3.util.FastMath.round(1.5131459651989522E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test447() {}
//   public void test447() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test447"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     long var14 = var0.nextLong((-1L), 100L);
//     double var16 = var0.nextChiSquare(1.0d);
//     long var19 = var0.nextSecureLong((-270L), 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-72));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 68);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == 18L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var16 == 0.3331168383272715d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var19 == (-27L));
// 
//   }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test448"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    float var6 = var3.getExpansionFactor();
    double[] var9 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var10 = new org.apache.commons.math3.util.ResizableDoubleArray(var9);
    double[] var11 = var10.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var12 = new org.apache.commons.math3.util.ResizableDoubleArray(var10);
    double var14 = var10.addElementRolling(0.0d);
    double var16 = var10.substituteMostRecentElement(2.220446049250313E-16d);
    float var17 = var10.getExpansionFactor();
    var10.contract();
    org.apache.commons.math3.util.ResizableDoubleArray.copy(var3, var10);
    var10.contract();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2.0f);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test449"); }


    double var1 = org.apache.commons.math3.util.FastMath.sqrt(1.2183422052836203E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.490475906353774E-5d);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test450"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-43));

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test451"); }


    double var1 = org.apache.commons.math3.util.FastMath.signum((-0.5954271189370909d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test452() {}
//   public void test452() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test452"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     var0.reSeed(100L);
//     int var5 = var0.nextSecureInt((-127), 1);
//     int var8 = var0.nextSecureInt((-1), 0);
//     int var11 = var0.nextSecureInt(0, 100);
//     double var13 = var0.nextExponential(1.5607966601082315d);
//     java.lang.String var15 = var0.nextSecureHexString(7);
//     double var18 = var0.nextGaussian((-0.5954271189370909d), 0.6198239740031684d);
//     var0.reSeedSecure();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var22 = var0.nextBeta(0.99677584400507d, 0.0d);
//       fail("Expected exception of type org.apache.commons.math3.exception.NoBracketingException");
//     } catch (org.apache.commons.math3.exception.NoBracketingException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-68));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 57);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var13 == 2.981374056870167d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var15 + "' != '" + "333ca46"+ "'", var15.equals("333ca46"));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var18 == (-1.0234917754783677d));
// 
//   }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test453"); }


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
      java.lang.Enum var14 = java.lang.Enum.<java.lang.Enum>valueOf(var12, "42824a7");
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

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test454"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.lcm(1074L, 3222L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3222L);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test455"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(180L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test456() {}
//   public void test456() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test456"); }
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
//       int[] var17 = var0.nextPermutation(71, (-106));
//       fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
//     } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == (-30));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == 29);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var14 == (-2.3239247451534874E-9d));
// 
//   }

  public void test457() {}
//   public void test457() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test457"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getStandardDeviation();
//     double var2 = var0.sample();
//     var0.reseedRandomGenerator(100L);
//     double var5 = var0.getNumericalVariance();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == (-0.045483814993003725d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 1.0d);
// 
//   }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test458"); }


    org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
    var0.reSeed(100L);
    long var5 = var0.nextLong((-1L), 0L);
    var0.reSeedSecure();
    int var9 = var0.nextInt((-127), (-70));
    java.lang.String var11 = var0.nextSecureHexString(10598444);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var13 = var0.nextSecureHexString((-924));
      fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException");
    } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-102));

  }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test459"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var2 = var0.probability(0.0d);
//     double var3 = var0.getNumericalMean();
//     boolean var4 = var0.isSupportLowerBoundInclusive();
//     boolean var5 = var0.isSupportLowerBoundInclusive();
//     double var7 = var0.density((-1.4709228568158544E157d));
//     double var8 = var0.sample();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.4081694507521445d);
// 
//   }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test460"); }


    java.lang.Number var1 = null;
    org.apache.commons.math3.exception.OutOfRangeException var3 = new org.apache.commons.math3.exception.OutOfRangeException((java.lang.Number)(-2.3012989023072947d), var1, (java.lang.Number)1410065408);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test461"); }


    float var1 = org.apache.commons.math3.util.FastMath.ulp(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test462"); }


    long var2 = org.apache.commons.math3.util.FastMath.min(20922789888000L, 6469856410481231872L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20922789888000L);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test463"); }


    double var1 = org.apache.commons.math3.util.FastMath.ceil(0.3172440566036945d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test464() {}
//   public void test464() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test464"); }
// 
// 
//     double var1 = org.apache.commons.math3.util.FastMath.asin(1.2483666764136787d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test465"); }


    long var2 = org.apache.commons.math3.util.ArithmeticUtils.gcd((-552473126826409984L), (-18L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test466"); }


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
    double[] var36 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var37 = new org.apache.commons.math3.util.ResizableDoubleArray(var36);
    double[] var38 = var37.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var39 = new org.apache.commons.math3.util.ResizableDoubleArray(var37);
    float var40 = var37.getExpansionFactor();
    double[] var41 = var37.getElements();
    double var42 = var24.mannWhitneyUTest(var33, var41);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test467"); }


    org.apache.commons.math3.exception.NumberIsTooLargeException var3 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)2.505505063633595E-16d, (java.lang.Number)0.22067136191984704d, false);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 2.505505063633595E-16d+ "'", var4.equals(2.505505063633595E-16d));

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test468"); }


    int var1 = org.apache.commons.math3.util.FastMath.getExponent(32.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test469"); }


    double var2 = org.apache.commons.math3.util.FastMath.nextAfter(4.028720097489951d, 1.1261651270732402d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.02872009748995d);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test470"); }


    double var1 = org.apache.commons.math3.util.FastMath.acosh(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1555516045788385d);

  }

  public void test471() {}
//   public void test471() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test471"); }
// 
// 
//     org.apache.commons.math3.random.RandomDataImpl var0 = new org.apache.commons.math3.random.RandomDataImpl();
//     double var2 = var0.nextChiSquare(2.220446049250313E-16d);
//     var0.reSeed();
//     long var5 = var0.nextPoisson(0.43641834738962487d);
//     int var8 = var0.nextPascal(15, 0.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var11 = var0.nextUniform(1.8969306447972577E157d, 0.0d);
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
//     assertTrue(var5 == 1L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 2147483647);
// 
//   }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test472"); }


    org.apache.commons.math3.exception.MaxCountExceededException var1 = new org.apache.commons.math3.exception.MaxCountExceededException((java.lang.Number)2.220446049250313E-16d);
    java.lang.Number var2 = var1.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 2.220446049250313E-16d+ "'", var2.equals(2.220446049250313E-16d));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test473"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(75);
    float var2 = var1.getContractionCriteria();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setContractionCriteria(0.0f);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5f);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test474"); }


    double var1 = org.apache.commons.math3.util.FastMath.tan(0.9038191318719038d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2700899729470623d);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test475"); }


    double var2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.8755066060221833E-62d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test476"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var3.setElement(1, 0.0d);
    var3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test477"); }


    float var2 = org.apache.commons.math3.util.FastMath.copySign(1.4E-45f, (-1.1368685E-13f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4E-45f));

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test478"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-276308126), 32.0f, 1.4E-45f, 2113318);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test479"); }


    float var2 = org.apache.commons.math3.util.FastMath.nextAfter(100.0f, 1.9600758471893716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99.99999f);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test480"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math3.util.ResizableDoubleArray var4 = new org.apache.commons.math3.util.ResizableDoubleArray((-16), 1.0000001f, 1.4210856E-14f, 20);
      fail("Expected exception of type org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test481"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.mulAndCheck((-22), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test482() {}
//   public void test482() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test482"); }
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
//     long var22 = var0.nextPoisson(1.6583150819385577E-9d);
//     var0.reSeed(0L);
//     java.util.Collection var25 = null;
//     java.lang.Object[] var27 = var0.nextSample(var25, 8616612);
// 
//   }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test483"); }


    org.apache.commons.math3.exception.NotPositiveException var1 = new org.apache.commons.math3.exception.NotPositiveException((java.lang.Number)2.5f);
    boolean var2 = var1.getBoundIsAllowed();
    boolean var3 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test484"); }


    double var1 = org.apache.commons.math3.util.FastMath.abs(0.37863028386090464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.37863028386090464d);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test485"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooSmallException var4 = new org.apache.commons.math3.exception.NumberIsTooSmallException(var0, (java.lang.Number)1.9946535330696554E-9d, (java.lang.Number)0.2228517214543522d, false);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test486"); }


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
    var3.setNumElements(0);
    float var39 = var3.getContractionCriteria();
    
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
    assertTrue(var39 == 2.5f);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test487"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math3.util.ArithmeticUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math3.util.ArithmeticUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var8 = org.apache.commons.math3.util.ArithmeticUtils.pow(var2, (-88));
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

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test488"); }


    float var2 = org.apache.commons.math3.util.FastMath.min((-0.99999994f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test489"); }


    boolean var1 = org.apache.commons.math3.util.ArithmeticUtils.isPowerOfTwo(6008724826932376576L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test490() {}
//   public void test490() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test490"); }
// 
// 
//     org.apache.commons.math3.exception.util.Localizable var0 = null;
//     org.apache.commons.math3.exception.util.Localizable var1 = null;
//     org.apache.commons.math3.exception.util.Localizable var2 = null;
//     org.apache.commons.math3.stat.ranking.NaNStrategy[] var3 = org.apache.commons.math3.stat.ranking.NaNStrategy.values();
//     org.apache.commons.math3.exception.MathIllegalStateException var4 = new org.apache.commons.math3.exception.MathIllegalStateException(var2, (java.lang.Object[])var3);
//     org.apache.commons.math3.exception.MathInternalError var5 = new org.apache.commons.math3.exception.MathInternalError(var1, (java.lang.Object[])var3);
//     org.apache.commons.math3.exception.NullArgumentException var6 = new org.apache.commons.math3.exception.NullArgumentException(var0, (java.lang.Object[])var3);
//     org.apache.commons.math3.exception.util.Localizable var7 = null;
//     org.apache.commons.math3.exception.NumberIsTooLargeException var11 = new org.apache.commons.math3.exception.NumberIsTooLargeException((java.lang.Number)1.0d, (java.lang.Number)0.0f, true);
//     java.lang.Number var12 = var11.getMax();
//     java.lang.Number var13 = var11.getArgument();
//     java.lang.Throwable[] var14 = var11.getSuppressed();
//     org.apache.commons.math3.exception.MathIllegalArgumentException var15 = new org.apache.commons.math3.exception.MathIllegalArgumentException(var7, (java.lang.Object[])var14);
//     var6.addSuppressed((java.lang.Throwable)var15);
//     org.apache.commons.math3.exception.MathInternalError var17 = new org.apache.commons.math3.exception.MathInternalError((java.lang.Throwable)var6);
// 
//   }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test491"); }


    double var1 = org.apache.commons.math3.special.Gamma.digamma(2.0827949296372137d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4748415556977728d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test492"); }


    org.apache.commons.math3.exception.util.Localizable var0 = null;
    org.apache.commons.math3.exception.NumberIsTooLargeException var4 = new org.apache.commons.math3.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-175), (java.lang.Number)0.34829387335298634d, true);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test493"); }


    int var2 = org.apache.commons.math3.util.FastMath.min((-42), (-46));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-46));

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test494"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math3.util.ArithmeticUtils.binomialCoefficientLog((-52), (-2));
      fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math3.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test495"); }
// 
// 
//     org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
//     double var1 = var0.getNumericalMean();
//     double var2 = var0.sample();
//     double var5 = var0.cumulativeProbability(0.7853981633974483d, 1.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.inverseCumulativeProbability(28.103372960898604d);
//       fail("Expected exception of type org.apache.commons.math3.exception.OutOfRangeException");
//     } catch (org.apache.commons.math3.exception.OutOfRangeException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == 0.5488095617311608d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0.05745482469513025d);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test496"); }


    org.apache.commons.math3.util.ResizableDoubleArray var1 = new org.apache.commons.math3.util.ResizableDoubleArray(100);
    double[] var2 = var1.getInternalValues();
    int var3 = var1.start();
    var1.setNumElements(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setElement((-19), (-0.7853981633974483d));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test497"); }


    org.apache.commons.math3.distribution.NormalDistribution var0 = new org.apache.commons.math3.distribution.NormalDistribution();
    double var2 = var0.probability(0.0d);
    double var3 = var0.getNumericalMean();
    double var4 = var0.getMean();
    double var6 = var0.density(3628800.0d);
    boolean var7 = var0.isSupportUpperBoundInclusive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test498"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math3.util.ResizableDoubleArray var3 = new org.apache.commons.math3.util.ResizableDoubleArray(var2);
    double[] var4 = var3.getInternalValues();
    org.apache.commons.math3.util.ResizableDoubleArray var5 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    double var7 = var3.addElementRolling(0.0d);
    double[] var8 = var3.getElements();
    var3.setExpansionMode(0);
    double[] var14 = new double[] { (-1.0d), 100.0d, (-1.0d)};
    var3.addElements(var14);
    double var17 = var3.substituteMostRecentElement(0.5000000000000001d);
    org.apache.commons.math3.util.ResizableDoubleArray var18 = new org.apache.commons.math3.util.ResizableDoubleArray(var3);
    var18.addElement(0.6002272555504838d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test499"); }


    int var2 = org.apache.commons.math3.util.ArithmeticUtils.addAndCheck(8995349, 114731687);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 123727036);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test500"); }


    double var1 = org.apache.commons.math3.util.FastMath.tanh((-1.8626690397476047d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9529248449235921d));

  }

}
