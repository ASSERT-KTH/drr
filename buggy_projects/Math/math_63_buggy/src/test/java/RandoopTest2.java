
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NEGATIVE_INFINITY, (java.lang.Number)Double.NEGATIVE_INFINITY, 191, var9, false);
    var5.addSuppressed((java.lang.Throwable)var11);
    boolean var13 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.1102230246251565E-16d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1102230246251565E-16d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.8816854544938376d, (-10), 240026100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.07549325845303248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0028509696783217d);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { 0.0d};
//     double[] var4 = new double[] { 100.0d};
//     boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
//     boolean var6 = org.apache.commons.math.util.MathUtils.equals(var0, var2);
//     double[] var7 = null;
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var2, var7);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


    double[] var0 = null;
    double[] var2 = new double[] { 0.0d};
    double[] var4 = new double[] { 100.0d};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var0, var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.8981735759070244d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8981735759070244d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1000573857), (-1442072980));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4826013365986588d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-240026100), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-90L), 91L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 91L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1862915923), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1442072990), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1442072990);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1532522787, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1532522787);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.4229072086738532d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0907660374718036d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(9.765625000000295E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1062207624);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1997450891849582299L), 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3323475524098873185L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.4229072086738532d, 0.8541431904542547d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.42290720867385323d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1774819148);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(363181L, 1200L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 361981L);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    int var2 = org.apache.commons.math.util.FastMath.min(103570195, 240026100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 103570195);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(2.0879311127268826E215d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(90L, 362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-362790L));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.5283380553964488d), 0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.7742028622880628d));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var4);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)0.7365279287428347d, (-240026100));
    java.lang.Number var4 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.7365279287428347d+ "'", var4.equals(0.7365279287428347d));

  }

  public void test27() {}
//   public void test27() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.1909687824216308d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-925632413942248003L), 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 301L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1200L, 362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-361680L));

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }
// 
// 
//     double[] var3 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var4 = null;
//     boolean var5 = org.apache.commons.math.util.MathUtils.equals(var3, var4);
//     double[] var7 = new double[] { 0.0d};
//     double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     boolean var14 = org.apache.commons.math.util.MathUtils.equals(var7, var10);
//     double[] var16 = new double[] { 0.0d};
//     double[] var18 = new double[] { 100.0d};
//     boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
//     double var20 = org.apache.commons.math.util.MathUtils.distance(var10, var18);
//     double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 0.8575532158463934d);
//     double var23 = org.apache.commons.math.util.MathUtils.distance(var4, var18);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.4840480658487383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9098895140646714d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.7367741106353956d, 3.16227766016838d, (-1338502676));

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.552713678800501E-15d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.8575532158463934d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.06673892011162788d));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(362880L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = var17.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var18, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var6, var18, false);
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    boolean var13 = var5.getStrict();
    int var14 = var5.getIndex();
    int var15 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(2L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1442072789), (-1862915923));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    double var1 = org.apache.commons.math.util.FastMath.log(7.481044921481109E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-37.13157410328371d));

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(1.0f, (-1442072789), 1000573857);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.5716125779527041d, 1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.6987369869790655E-217d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.8816854544938376d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6358511945110851d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-636L), 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 264L);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0);
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    java.math.BigInteger var11 = null;
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var11, 0L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 0);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var10, var13);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var3, var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.7615941559557649d, (java.lang.Number)var3, 1442073090);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.9330920755982086d, (-1), (-1338502676));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1442072980), (java.lang.Number)1.1752011936438014d, 99, var3, false);
    java.lang.String var6 = var5.toString();
    java.lang.Number var7 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (-1442072980)+ "'", var7.equals((-1442072980)));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362880.0d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


    long var1 = org.apache.commons.math.util.FastMath.round(9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1997450891849582300L), 181800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 181800L);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(59.517686583057106d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1150131614));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(301L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.2645189576252271d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1862915923), 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 31);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1641532182693481E-10d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-37.13157410328371d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5438715770345877d));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.10022219450316257d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.09988797703726823d));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, (-1122853665), 1442072980);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1442072881, 1062207624);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(280988690, (-1997450891849582935L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1079574559, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1079574658);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.6075672970622579d), 0);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), (-892927039), 2110066489);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    double[] var32 = new double[] { 0.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var32, var35);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var3, var32);
    org.apache.commons.math.exception.NonMonotonousSequenceException var53 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = var53.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var54, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var58 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var54, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var60 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-89L), (java.lang.Number)(-0.6075672970622579d), 280988690, var54, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var54, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 103570195);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(2.198408826999716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8094317870247442d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var12, var21, true);
    double[] var25 = new double[] { 0.0d};
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var28 = org.apache.commons.math.util.MathUtils.distance(var12, var25);
    double[] var30 = new double[] { 0.0d};
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double[] var33 = new double[] { 0.0d};
    double[] var35 = new double[] { 100.0d};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var35);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var38);
    double[] var44 = new double[] { 0.0d};
    double[] var46 = new double[] { 100.0d};
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var46);
    double[] var49 = new double[] { 0.0d};
    double[] var51 = new double[] { 100.0d};
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var49);
    double[] var55 = new double[] { 0.0d};
    double[] var57 = new double[] { 100.0d};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var57);
    double[] var60 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.0239010128918022d);
    double var61 = org.apache.commons.math.util.MathUtils.distance1(var46, var60);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var60);
    boolean var63 = org.apache.commons.math.util.MathUtils.equals(var30, var35);
    double[] var65 = new double[] { 0.0d};
    double var66 = org.apache.commons.math.util.MathUtils.safeNorm(var65);
    double[] var68 = new double[] { 0.0d};
    double[] var70 = new double[] { 100.0d};
    boolean var71 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var70);
    boolean var72 = org.apache.commons.math.util.MathUtils.equals(var65, var68);
    double[] var74 = new double[] { 0.0d};
    double[] var76 = new double[] { 100.0d};
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var74, var76);
    double var78 = org.apache.commons.math.util.MathUtils.distance(var68, var76);
    double[] var80 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 0.8575532158463934d);
    double var81 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var76);
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var76);
    int var83 = org.apache.commons.math.util.MathUtils.hash(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 31);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.0d, 630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(8.655154728220008E12d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test73() {}
//   public void test73() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
//     java.math.BigInteger var5 = null;
//     java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
//     java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
//     java.math.BigInteger var10 = null;
//     java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
//     java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 0);
//     java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var9, var12);
//     java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var2, var12);
//     java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var2, 209);
//     java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 191);
//     java.math.BigInteger var21 = null;
//     java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var18, var21);
// 
//   }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-37.13157410328371d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9999999999999999d));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.7840341610578332d, (java.lang.Number)1.2954778583706679d, (-1150131505));
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-1.5438715770345877d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(31, (-1862915913));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1862915944);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(103570195, (-1997450891849582299L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(3.29371928817332E59d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-39748084));

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(3.4473535081991327d, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8363179542194602E63d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (-362790L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    double var2 = org.apache.commons.math.util.FastMath.max(495.7919686712069d, 0.3043457015073627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 495.7919686712069d);

  }

  public void test83() {}
//   public void test83() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.14695139943744212d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-39748084), 2009326299);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, 5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765624999999445E-4d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.6358511945110851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5663643948376851d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(900, (-1122853665));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.0879311127268826E215d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9223372036854775807L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(9000L, (-1122853665));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(15, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.9773508306736582d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7739443644448949d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.8575532158463934d, 0.021167931572826714d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 25.087633636390517d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    org.apache.commons.math.util.MathUtils.checkOrder(var4);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var22);
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double[] var33 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0239010128918022d);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var19, var33);
    double[] var36 = new double[] { 0.0d};
    double[] var38 = new double[] { 100.0d};
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var38);
    double[] var41 = new double[] { 0.0d};
    double[] var43 = new double[] { 100.0d};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var43);
    double var45 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var41);
    double[] var47 = new double[] { 0.0d};
    double[] var49 = new double[] { 100.0d};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var49);
    double[] var52 = new double[] { 0.0d};
    double[] var54 = new double[] { 100.0d};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var54);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var52);
    double[] var58 = new double[] { 0.0d};
    double[] var60 = new double[] { 100.0d};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var60);
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0239010128918022d);
    double var64 = org.apache.commons.math.util.MathUtils.distance1(var49, var63);
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var63);
    double[] var67 = new double[] { 0.0d};
    double var68 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    double[] var70 = new double[] { 0.0d};
    double[] var72 = new double[] { 100.0d};
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var70, var72);
    boolean var74 = org.apache.commons.math.util.MathUtils.equals(var67, var70);
    boolean var75 = org.apache.commons.math.util.MathUtils.equals(var38, var67);
    org.apache.commons.math.util.MathUtils.OrderDirection var76 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var67, var76, false);
    double var79 = org.apache.commons.math.util.MathUtils.distance1(var33, var67);
    double var80 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var33);
    double[] var81 = new double[] { };
    double[] var85 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var86 = null;
    boolean var87 = org.apache.commons.math.util.MathUtils.equals(var85, var86);
    boolean var88 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var81, var85);
    boolean var89 = org.apache.commons.math.util.MathUtils.equals(var33, var85);
    double var90 = org.apache.commons.math.util.MathUtils.safeNorm(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 10.0d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.0359770329454867d, 0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.36787944117144233d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(362880.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1150131614));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.5403023058681399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7165256995489038d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-291941475));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1150131614));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1150131614);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(15, 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 15);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.8973087686975562E28d, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8528405944312073E25d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(4628162069711240015L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4628162069711240015L);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(10.0d, 13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000000000000002d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.0028673189548942d, (-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0028673189548942d);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(240026100, (-39748084));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(104.94395111059633d, 71.87795598812558d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8293123178330185E145d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(240026100, (-8305579194716910415L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    int[] var2 = new int[] { 0, 100};
    int[] var6 = new int[] { 100, 100, 0};
    int[] var10 = new int[] { 10, 0, 1};
    int var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var10);
    int[] var15 = new int[] { 100, 100, 0};
    int[] var19 = new int[] { 10, 0, 1};
    int var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var19);
    int var21 = org.apache.commons.math.util.MathUtils.distance1(var10, var19);
    int[] var25 = new int[] { 100, 100, 0};
    int[] var29 = new int[] { 10, 0, 1};
    int var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var29);
    int[] var34 = new int[] { 100, 100, 0};
    int[] var38 = new int[] { 10, 0, 1};
    int var39 = org.apache.commons.math.util.MathUtils.distance1(var34, var38);
    int var40 = org.apache.commons.math.util.MathUtils.distance1(var29, var38);
    double var41 = org.apache.commons.math.util.MathUtils.distance(var19, var38);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var2, var38);
    int[] var46 = new int[] { 100, 100, 0};
    int[] var50 = new int[] { 10, 0, 1};
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var50);
    int[] var55 = new int[] { 0, 100, 100};
    int var56 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var55);
    int var57 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var50);
    int[] var61 = new int[] { 100, 100, 0};
    int[] var65 = new int[] { 10, 0, 1};
    int var66 = org.apache.commons.math.util.MathUtils.distance1(var61, var65);
    int[] var70 = new int[] { 100, 100, 0};
    int[] var74 = new int[] { 10, 0, 1};
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var70, var74);
    double var76 = org.apache.commons.math.util.MathUtils.distance(var65, var70);
    int var77 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.4987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 134.5399568901373d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var13, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var13, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1000L, (java.lang.Number)209066259, (-1862915913), var13, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var20 = var19.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.6953039533394731d), 0.8657694832396586d, (-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1150131614));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.770060138012284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6918609160410639d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1442072990, 1532522787);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.9330920755982086d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.36787944117144217d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p((-0.14748086636738275d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.15955962593249867d));

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.168240001941272d, 1.1082845179605563d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6611860783039282d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0239010128918025d);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double[] var27 = new double[] { 0.0d};
    double[] var29 = new double[] { 100.0d};
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var29);
    double var31 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var27);
    double[] var32 = new double[] { };
    double[] var36 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var37 = null;
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var36, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var36);
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var36);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var20, var27);
    double[] var43 = new double[] { 0.0d};
    double var44 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    int var45 = org.apache.commons.math.util.MathUtils.hash(var43);
    double[] var47 = new double[] { 0.0d};
    double var48 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
    double[] var50 = new double[] { 0.0d};
    double[] var52 = new double[] { 100.0d};
    boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var52);
    boolean var54 = org.apache.commons.math.util.MathUtils.equals(var47, var50);
    double[] var56 = new double[] { 0.0d};
    double[] var58 = new double[] { 100.0d};
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var58);
    double var60 = org.apache.commons.math.util.MathUtils.distance(var50, var58);
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 0.8575532158463934d);
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 0.6480542736638855d);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var67 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var58, var67, true);
    double[] var71 = new double[] { 0.0d};
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double var73 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double var74 = org.apache.commons.math.util.MathUtils.distance(var58, var71);
    double[] var76 = new double[] { 0.0d};
    double var77 = org.apache.commons.math.util.MathUtils.safeNorm(var76);
    double[] var79 = new double[] { 0.0d};
    double[] var81 = new double[] { 100.0d};
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var79, var81);
    boolean var83 = org.apache.commons.math.util.MathUtils.equals(var76, var79);
    double[] var85 = new double[] { 0.0d};
    double[] var87 = new double[] { 100.0d};
    boolean var88 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var85, var87);
    double var89 = org.apache.commons.math.util.MathUtils.distance(var79, var87);
    double[] var91 = new double[] { 0.0d};
    double var92 = org.apache.commons.math.util.MathUtils.safeNorm(var91);
    double var93 = org.apache.commons.math.util.MathUtils.safeNorm(var91);
    boolean var94 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var87, var91);
    double var95 = org.apache.commons.math.util.MathUtils.distance1(var58, var87);
    double var96 = org.apache.commons.math.util.MathUtils.distance(var43, var58);
    double var97 = org.apache.commons.math.util.MathUtils.distance1(var27, var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 100.0d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(209066259);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1442072881);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var7, (-10));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (-8305579194716910415L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.1663477970454088d, 951780243, 280988690);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    int var2 = org.apache.commons.math.util.FastMath.max(951780243, 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 951780243);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.6358511945110851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8045664954399904d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1862915923, (-3L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1952354100, 209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209066259);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.4473535081991327d, (-0.2086296610167463d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-37.13157410328371d), 1.7840341610578332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5675377397938064d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.7742028622880628d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-291941475), 2110066489);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(25.087633636390517d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1749763524);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.2623541086902015d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.533730489034676d);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 951780243);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 951780243);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    int var2 = org.apache.commons.math.util.FastMath.min(191, 1532522787);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 191);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 0, 100, 100};
    int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var12);
    int[] var17 = new int[] { 100, 100, 0};
    int[] var21 = new int[] { 10, 0, 1};
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var21);
    int[] var26 = new int[] { 100, 100, 0};
    int[] var30 = new int[] { 10, 0, 1};
    int var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var30);
    int var32 = org.apache.commons.math.util.MathUtils.distance1(var21, var30);
    int[] var36 = new int[] { 100, 100, 0};
    int[] var40 = new int[] { 10, 0, 1};
    int var41 = org.apache.commons.math.util.MathUtils.distance1(var36, var40);
    int[] var45 = new int[] { 100, 100, 0};
    int[] var49 = new int[] { 10, 0, 1};
    int var50 = org.apache.commons.math.util.MathUtils.distance1(var45, var49);
    int[] var54 = new int[] { 100, 100, 0};
    int[] var58 = new int[] { 10, 0, 1};
    int var59 = org.apache.commons.math.util.MathUtils.distance1(var54, var58);
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var49, var58);
    int[] var64 = new int[] { 100, 100, 0};
    int[] var68 = new int[] { 10, 0, 1};
    int var69 = org.apache.commons.math.util.MathUtils.distance1(var64, var68);
    int[] var73 = new int[] { 100, 100, 0};
    int[] var77 = new int[] { 10, 0, 1};
    int var78 = org.apache.commons.math.util.MathUtils.distance1(var73, var77);
    int var79 = org.apache.commons.math.util.MathUtils.distance1(var68, var77);
    double var80 = org.apache.commons.math.util.MathUtils.distance(var58, var77);
    int var81 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var58);
    int var82 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var36);
    double var83 = org.apache.commons.math.util.MathUtils.distance(var12, var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 141.4213562373095d);

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.9540432297515553d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(280988690);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-1862915923));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.0878314150298527d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-8305579194716910415L), 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 301L);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.8657694832396586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.90674277906894d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2777583356184021d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.7856186626880235d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2412837662566061d));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1000L, 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(3.1622776601683795d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.8391851574885061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1150131505, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1722.57483263636d);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-1.6975951802558271d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, 1532522787);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = null;
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var25, 0L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 0);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var24, var27);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var17, var27);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var4, var31);
    java.math.BigInteger var33 = null;
    java.math.BigInteger var35 = org.apache.commons.math.util.MathUtils.pow(var33, 0L);
    java.math.BigInteger var37 = org.apache.commons.math.util.MathUtils.pow(var35, 0);
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var4, var35);
    java.math.BigInteger var40 = org.apache.commons.math.util.MathUtils.pow(var35, 1338502676);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.1932414450926745d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-1.2023733333156474d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3601446966113105d);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(0.0f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(4, 9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.07563716874799481d, (-0.9999999999999999d), 0.9756549932711598d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-5L), 8627737931242410865L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var15 = new double[] { 0.0d};
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    int var17 = org.apache.commons.math.util.MathUtils.hash(var15);
    double[] var19 = new double[] { 0.0d};
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var19, var22);
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double var32 = org.apache.commons.math.util.MathUtils.distance(var22, var30);
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 0.8575532158463934d);
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 0.6480542736638855d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var30, var39, true);
    double[] var43 = new double[] { 0.0d};
    double var44 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    double var46 = org.apache.commons.math.util.MathUtils.distance(var30, var43);
    double[] var48 = new double[] { 0.0d};
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double[] var51 = new double[] { 0.0d};
    double[] var53 = new double[] { 100.0d};
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var53);
    boolean var55 = org.apache.commons.math.util.MathUtils.equals(var48, var51);
    double[] var57 = new double[] { 0.0d};
    double[] var59 = new double[] { 100.0d};
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var57, var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance(var51, var59);
    double[] var63 = new double[] { 0.0d};
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var63);
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var30, var59);
    double var68 = org.apache.commons.math.util.MathUtils.distance(var15, var30);
    double var69 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var15);
    double[] var71 = new double[] { 0.0d};
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double[] var74 = new double[] { 0.0d};
    double[] var76 = new double[] { 100.0d};
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var74, var76);
    boolean var78 = org.apache.commons.math.util.MathUtils.equals(var71, var74);
    double[] var80 = new double[] { 0.0d};
    double[] var82 = new double[] { 100.0d};
    boolean var83 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var80, var82);
    double var84 = org.apache.commons.math.util.MathUtils.distance(var74, var82);
    double[] var86 = org.apache.commons.math.util.MathUtils.normalizeArray(var82, 0.8575532158463934d);
    double[] var88 = org.apache.commons.math.util.MathUtils.normalizeArray(var82, 0.6480542736638855d);
    int var89 = org.apache.commons.math.util.MathUtils.hash(var88);
    org.apache.commons.math.util.MathUtils.checkOrder(var88);
    double var91 = org.apache.commons.math.util.MathUtils.safeNorm(var88);
    double var92 = org.apache.commons.math.util.MathUtils.distance(var15, var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 1862915923);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0.6480542736638855d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(630998.4197775756d, (-32.7698535921364d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 100, 100, 0};
    int[] var16 = new int[] { 10, 0, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var7, var16);
    int[] var22 = new int[] { 100, 100, 0};
    int[] var26 = new int[] { 10, 0, 1};
    int var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var26);
    int[] var31 = new int[] { 100, 100, 0};
    int[] var35 = new int[] { 10, 0, 1};
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var31, var35);
    int var37 = org.apache.commons.math.util.MathUtils.distance1(var26, var35);
    double var38 = org.apache.commons.math.util.MathUtils.distance(var16, var35);
    int[] var42 = new int[] { 100, 100, 0};
    int[] var46 = new int[] { 10, 0, 1};
    int var47 = org.apache.commons.math.util.MathUtils.distance1(var42, var46);
    int[] var51 = new int[] { 0, 100, 100};
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var51);
    int[] var56 = new int[] { 100, 100, 0};
    int[] var60 = new int[] { 10, 0, 1};
    int var61 = org.apache.commons.math.util.MathUtils.distance1(var56, var60);
    int[] var65 = new int[] { 100, 100, 0};
    int[] var69 = new int[] { 10, 0, 1};
    int var70 = org.apache.commons.math.util.MathUtils.distance1(var65, var69);
    int var71 = org.apache.commons.math.util.MathUtils.distance1(var60, var69);
    double var72 = org.apache.commons.math.util.MathUtils.distance(var46, var69);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var16, var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-892927039));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-0.6075672970622579d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test168() {}
//   public void test168() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.8816854544938376d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0209574112366946d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.3601446966113105d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0212493932548101d));

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(315499.70988958d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.8144772166995121d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9075620646965069d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1952354100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-10), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.03645418412529628d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9993356198097555d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.4923092020050719d, 0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.8364259042200248d));

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.2128331401446932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.2623541086902015d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1235453300558023d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 240026100, (-1800407107));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    long var2 = org.apache.commons.math.util.FastMath.max(9000L, 300L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9000L);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0013201176315390667d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5694762087799268d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    int var31 = org.apache.commons.math.util.MathUtils.hash(var28);
    org.apache.commons.math.util.MathUtils.checkOrder(var28);
    org.apache.commons.math.util.MathUtils.checkOrder(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 951780243);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(90L, 4628162069712140015L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4628162069712139925L));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10L, 600L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6000L);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 31);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var19, var22);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var19, 364L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 31);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var27, 1442072990);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var14, var27);
    java.math.BigInteger var33 = null;
    java.math.BigInteger var35 = org.apache.commons.math.util.MathUtils.pow(var33, 0L);
    java.math.BigInteger var37 = org.apache.commons.math.util.MathUtils.pow(var35, 0);
    java.math.BigInteger var38 = null;
    java.math.BigInteger var40 = org.apache.commons.math.util.MathUtils.pow(var38, 0L);
    java.math.BigInteger var42 = org.apache.commons.math.util.MathUtils.pow(var40, 0);
    java.math.BigInteger var43 = org.apache.commons.math.util.MathUtils.pow(var37, var40);
    java.math.BigInteger var45 = org.apache.commons.math.util.MathUtils.pow(var37, 364L);
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var37, 1532522787);
    java.math.BigInteger var48 = null;
    java.math.BigInteger var50 = org.apache.commons.math.util.MathUtils.pow(var48, 0L);
    java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var50, 0);
    java.math.BigInteger var53 = null;
    java.math.BigInteger var55 = org.apache.commons.math.util.MathUtils.pow(var53, 0L);
    java.math.BigInteger var57 = org.apache.commons.math.util.MathUtils.pow(var55, 0);
    java.math.BigInteger var58 = null;
    java.math.BigInteger var60 = org.apache.commons.math.util.MathUtils.pow(var58, 0L);
    java.math.BigInteger var62 = org.apache.commons.math.util.MathUtils.pow(var60, 0);
    java.math.BigInteger var63 = org.apache.commons.math.util.MathUtils.pow(var57, var60);
    java.math.BigInteger var64 = org.apache.commons.math.util.MathUtils.pow(var50, var60);
    java.math.BigInteger var65 = org.apache.commons.math.util.MathUtils.pow(var37, var64);
    java.math.BigInteger var66 = org.apache.commons.math.util.MathUtils.pow(var27, var37);
    java.math.BigInteger var67 = null;
    java.math.BigInteger var69 = org.apache.commons.math.util.MathUtils.pow(var67, 0L);
    java.math.BigInteger var71 = org.apache.commons.math.util.MathUtils.pow(var69, 0);
    java.math.BigInteger var72 = null;
    java.math.BigInteger var74 = org.apache.commons.math.util.MathUtils.pow(var72, 0L);
    java.math.BigInteger var76 = org.apache.commons.math.util.MathUtils.pow(var74, 0);
    java.math.BigInteger var77 = org.apache.commons.math.util.MathUtils.pow(var71, var74);
    java.math.BigInteger var79 = org.apache.commons.math.util.MathUtils.pow(var71, 91L);
    java.math.BigInteger var80 = org.apache.commons.math.util.MathUtils.pow(var66, var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(Double.POSITIVE_INFINITY, 2110066489);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-2.590337896729905d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.925005304658701d));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.4923092020050719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.980418898637706d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0028509696783217d, 1.030494020926757d, 1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.0239010128918022d);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var3, var17);
    double[] var20 = new double[] { 0.0d};
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    boolean var27 = org.apache.commons.math.util.MathUtils.equals(var20, var23);
    double[] var29 = new double[] { 0.0d};
    double[] var31 = new double[] { 100.0d};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var23, var31);
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var31, 0.8575532158463934d);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var17, var35);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    double[] var44 = new double[] { 0.0d};
    double[] var46 = new double[] { 100.0d};
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var46);
    double[] var49 = new double[] { 0.0d};
    double[] var51 = new double[] { 100.0d};
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var49);
    double[] var55 = new double[] { 0.0d};
    double[] var57 = new double[] { 100.0d};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var57);
    double[] var60 = new double[] { 0.0d};
    double[] var62 = new double[] { 100.0d};
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var60, var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var57, var60);
    double[] var66 = new double[] { 0.0d};
    double[] var68 = new double[] { 100.0d};
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var68);
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var68, 1.0239010128918022d);
    double var72 = org.apache.commons.math.util.MathUtils.distance1(var57, var71);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var71);
    double[] var75 = new double[] { 0.0d};
    double var76 = org.apache.commons.math.util.MathUtils.safeNorm(var75);
    double[] var78 = new double[] { 0.0d};
    double[] var80 = new double[] { 100.0d};
    boolean var81 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var78, var80);
    boolean var82 = org.apache.commons.math.util.MathUtils.equals(var75, var78);
    boolean var83 = org.apache.commons.math.util.MathUtils.equals(var46, var75);
    org.apache.commons.math.util.MathUtils.OrderDirection var84 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var75, var84, false);
    double var87 = org.apache.commons.math.util.MathUtils.distance(var40, var75);
    double var88 = org.apache.commons.math.util.MathUtils.distance1(var17, var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.1663477970454088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 98.9760989871082d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 52.47197555529855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.021167931572826714d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2128331401446932d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8049487638684166d, 0.5493061443340549d, (-1862915913));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.2954778583706679d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1442072880));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.1641532182693481E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1641532182693481E-10d);

  }

  public void test199() {}
//   public void test199() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atan(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1079574658, (-90L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.9287285890885333d, 1.1235453300558023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9202834833604815d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(13.355060221994522d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 876188323);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-1997450891849582935L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1997450891849582935L);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var11 = new double[] { };
    double[] var15 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var16 = null;
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var15, var16);
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var15);
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var15);
    double[] var21 = new double[] { 0.0d};
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var21, var24);
    double[] var30 = new double[] { 0.0d};
    double[] var32 = new double[] { 100.0d};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var24, var32);
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.8575532158463934d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.6480542736638855d);
    double var39 = org.apache.commons.math.util.MathUtils.distance(var6, var32);
    org.apache.commons.math.util.MathUtils.checkOrder(var32);
    double[] var42 = new double[] { 0.0d};
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var45 = new double[] { 0.0d};
    double[] var47 = new double[] { 100.0d};
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var47);
    boolean var49 = org.apache.commons.math.util.MathUtils.equals(var42, var45);
    double[] var51 = new double[] { 0.0d};
    double[] var53 = new double[] { 100.0d};
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var53);
    double var55 = org.apache.commons.math.util.MathUtils.distance(var45, var53);
    double[] var57 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 0.8575532158463934d);
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 0.6480542736638855d);
    int var60 = org.apache.commons.math.util.MathUtils.hash(var59);
    org.apache.commons.math.util.MathUtils.checkOrder(var59);
    boolean var62 = org.apache.commons.math.util.MathUtils.equals(var32, var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1862915923);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(9000L, (-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-801000L));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, 1532522787);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = null;
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var25, 0L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 0);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var24, var27);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var17, var27);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var4, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var31, (-1442072990));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.8045664954399904d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8045664954399905d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.479425538604203d, 4.06023871960563d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.479425538604203d);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.021167931572826714d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.021169512717475848d);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-0.9287285890885333d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(3.439274378162969E-29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.9330920755982086d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(9000L, 1442073090);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.770060138012284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { 0.0d};
//     double[] var4 = new double[] { 100.0d};
//     boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
//     double[] var7 = new double[] { 0.0d};
//     double[] var9 = new double[] { 100.0d};
//     boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
//     double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var7);
//     double[] var13 = new double[] { 0.0d};
//     double[] var15 = new double[] { 100.0d};
//     boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var15);
//     double[] var18 = new double[] { 0.0d};
//     double[] var20 = new double[] { 100.0d};
//     boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var20);
//     double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var18);
//     double[] var24 = new double[] { 0.0d};
//     double[] var26 = new double[] { 100.0d};
//     boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
//     double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0239010128918022d);
//     double var30 = org.apache.commons.math.util.MathUtils.distance1(var15, var29);
//     boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var29);
//     org.apache.commons.math.util.MathUtils.checkOrder(var4);
//     boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
//     org.apache.commons.math.util.MathUtils.checkOrder(var0);
// 
//   }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    java.lang.Number var6 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 15.104412573075516d+ "'", var6.equals(15.104412573075516d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0028618546426542d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 31);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var19, var22);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var19, 364L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var19, 1532522787);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var14, var19);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var14, 1997450891849582299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
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
    assertNotNull(var32);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(9.77039337044457E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.770394924923376E-4d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.004252766970684236d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1442072789), 8627737931242410865L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 599254251);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.6611860783039282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7223986315263068d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }


    float var2 = org.apache.commons.math.util.FastMath.min(1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1200L, (-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.444667861009766d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.9540432297515553d, (-1.5438715770345877d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9540432297515553d);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(3.16227766016838d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.624342922017817d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1532522787);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.7223986315263068d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2084206212));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }


    double var2 = org.apache.commons.math.util.FastMath.max(59.517686583057106d, 2.5091784786580567d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 59.517686583057106d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.2545069915963656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6104464895571766d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.42290720867385323d, 2.372549507764957d, 0);

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-0.9412089142041425d), 4.4601490397061246E43d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.9697850179455104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.016925941599661452d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(6.9882121507348245d, 1862915944);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.2240713694000921E-45d));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(2L, 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.672649861992869d, 1.1241171695718353d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.0907660374718036d, 0.3678794411714424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-11.510097637784396d));

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.7856186626880235d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.0239010128918027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.21820359924626725d);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-1122853665));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.37623361672720984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1850684667798346d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, 1532522787);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = null;
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var25, 0L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 0);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var24, var27);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var17, var27);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var4, var31);
    java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var4, 181800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(7.481044921481109E-17d, 4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var11);
    double[] var15 = null;
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var22);
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double[] var33 = new double[] { 0.0d};
    double[] var35 = new double[] { 100.0d};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var35);
    double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var33);
    double[] var39 = new double[] { 0.0d};
    double[] var41 = new double[] { 100.0d};
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var41);
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0239010128918022d);
    double var45 = org.apache.commons.math.util.MathUtils.distance1(var30, var44);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var44);
    boolean var47 = org.apache.commons.math.util.MathUtils.equals(var15, var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var48 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var44);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-892927039));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(4.89681668580424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2128752079148613d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3.1622776601683795d, 363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 361.3038401694048d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.07585429432749323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07570914304139609d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-1.8701991114558751d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.321840699568153d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.34607319064430053d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4135060674515845d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.6490605123312352d, 58.66520667787039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.140344062648719d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1774819148, 1442072980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 332746168);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.2128331401446932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 69.49022018388962d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    java.lang.Number var7 = var5.getPrevious();
    int var8 = var5.getIndex();
    java.lang.Number var9 = var5.getArgument();
    java.lang.Number var10 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (byte)1+ "'", var10.equals((byte)1));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.7367741106353956d, 951780243, 1079574559);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var16 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var16, false);
    java.lang.String var19 = var18.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var20 = var18.getDirection();
    int var21 = var18.getIndex();
    boolean var22 = var18.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var23 = var18.getDirection();
    java.lang.Number var24 = var18.getPrevious();
    var5.addSuppressed((java.lang.Throwable)var18);
    java.lang.Throwable[] var26 = var18.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var19.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 1.1752011936438014d+ "'", var24.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    boolean var13 = var5.getStrict();
    int var14 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var18, false);
    java.lang.String var21 = var20.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var22 = var20.getDirection();
    int var23 = var20.getIndex();
    boolean var24 = var20.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = var20.getDirection();
    java.lang.Number var26 = var20.getArgument();
    java.lang.String var27 = var20.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var31 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var31, false);
    java.lang.String var34 = var33.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var35 = var33.getDirection();
    int var36 = var33.getIndex();
    boolean var37 = var33.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = var33.getDirection();
    java.lang.Number var39 = var33.getPrevious();
    var20.addSuppressed((java.lang.Throwable)var33);
    var5.addSuppressed((java.lang.Throwable)var20);
    java.lang.Throwable[] var42 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 0.9067427790689399d+ "'", var26.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var27.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var34.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + 1.1752011936438014d+ "'", var39.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(7.481044921481109E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }


    double var2 = org.apache.commons.math.util.FastMath.min(23.624342922017807d, (-0.6075672970622579d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6075672970622579d));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.9542985177860862d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1058830614104105d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1722.57483263636d, (-1.8701991114558751d), 9.7703918159661E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(1.0f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(264L, (-362790L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-362526L));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(25.57138483622782d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    double[] var34 = new double[] { 0.0d};
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var37 = new double[] { 0.0d};
    double[] var39 = new double[] { 100.0d};
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var39);
    boolean var41 = org.apache.commons.math.util.MathUtils.equals(var34, var37);
    double[] var43 = new double[] { 0.0d};
    double[] var45 = new double[] { 100.0d};
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var43, var45);
    double var47 = org.apache.commons.math.util.MathUtils.distance(var37, var45);
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 0.8575532158463934d);
    double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 0.6480542736638855d);
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var45, var54, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var63 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var64 = var63.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var66 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var64, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var45, var64, true);
    double var69 = org.apache.commons.math.util.MathUtils.distance1(var3, var45);
    double[] var71 = new double[] { 0.0d};
    double[] var73 = new double[] { 100.0d};
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var71, var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance1(var3, var71);
    org.apache.commons.math.exception.NonMonotonousSequenceException var82 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var83 = var82.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var85 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1L), (java.lang.Number)1150131505, 0, var83, true);
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var83, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-8.419694981306574d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-9.0d));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-90L), 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 910L);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.009949513583114137d), 1.1738088312590378E29d, (-2084206212));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


    long var1 = org.apache.commons.math.util.FastMath.round(71.87795598812559d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 72L);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(100L, 910L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.055952909680744456d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0);
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var5, var8);
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var5, 364L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 31);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9202834833604815d, (java.lang.Number)var15, 1749763524);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(2.2085588309729804E71d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.6163140772864136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.48399857966128323d));

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.5694762087799268d, 1.1752011936438014d, 2110066489);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.087077848795329E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0426302550738344E15d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1000573857, (-2084206212));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    boolean var13 = var5.getStrict();
    int var14 = var5.getIndex();
    java.lang.Throwable[] var15 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(58.66520667787039d, 4.06023871960563d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


    int var2 = org.apache.commons.math.util.FastMath.max(9, 1150131614);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131614);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1814400.000000139d, (-0.8391851574885061d), 0);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(332746168, (-1338502675));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1952354100, 1442072881);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.980418898637706d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.2645189576252271d, 1.0426302550738344E15d, 630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)1.168240001941272d, (-1338502675));
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)100+ "'", var4.equals((short)100));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.07011222389235412d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07005479595293078d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(363181L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 806443333668390665L);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.8816854544938376d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.5380419587163434d, 69.49022018388962d, 1338502676);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, 180L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var10, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)(-0.9287285890885333d), 0, var10, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1079574658, (-5L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(180L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(495.7919686712069d, (-0.5872139151569291d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.18338397434640138d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(9000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-8305579194716910415L), 910L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8305579194716910415L));

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1150131505), 1532522787);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-4628162069712139925L), 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4628162069712139925L));

  }

  public void test310() {}
//   public void test310() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }
// 
// 
//     float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 1862915923, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Float.NaN);
// 
//   }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.07585429432749323d, 0.9098895140646714d, 1442072881);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(2.5091784786580567d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.0d, (-1442072880));

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.6893620967346501d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-1.2240713694000921E-45d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test316() {}
//   public void test316() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }
// 
// 
//     java.lang.Number var0 = null;
//     org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
//     int var6 = var5.getIndex();
//     java.lang.Throwable var7 = null;
//     var5.addSuppressed(var7);
// 
//   }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.5716125779527041d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5110577526502573d);

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(191, 951780243);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), 1062207624, 1862915944);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test322() {}
//   public void test322() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-1442072881));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.2128331401446932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8812845002630335d);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.0d, 0.07005479595293078d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-25.207359322172668d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1287114820778875E-11d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


    java.lang.Number var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var16 = var15.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var16, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var16, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9557502835537018d, (java.lang.Number)1.7840341610578332d, (-240026100), var16, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var24 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, var1, (-1000573857), var16, true);
    java.lang.Number var25 = var24.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    java.lang.Number var7 = var5.getPrevious();
    int var8 = var5.getIndex();
    java.lang.Throwable[] var9 = var5.getSuppressed();
    boolean var10 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.6591208326138481d, (-1442072881), 1079574658);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.2086296610167463d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4.9E-324d));

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(876188323, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 876188322);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test331"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 91L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, (-361680L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test332"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = null;
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 0);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var9, var12);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var2, var12);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var2, 209);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 191);
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var18, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test333"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test334"); }


    double var2 = org.apache.commons.math.util.FastMath.min(2.0879311127268826E215d, (-0.13712105182778433d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.13712105182778433d));

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-0.28308283934013667d), (-892927039), (-1862915923));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test336"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test337"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.5663643948376851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7525718536044814d);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test338"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-0.6893620967346501d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6360450723939454d));

  }

  public void test339() {}
//   public void test339() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test339"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, 99);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(3.615354633267934E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0714456192932014E9d);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test341"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.6358511945110851d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test342"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1862915913), 9000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2092604993);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test343"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.48399857966128323d), 0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.775965325642117d));

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test344"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0028618546426542d, 1.5716125779527041d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0028618546426544d);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test345"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.5403023058681399d, 1442073090);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.8977078164740466E154d));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test346"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.4931702671658056d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 85.55235440302222d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test347"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var16 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var16, false);
    java.lang.String var19 = var18.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var20 = var18.getDirection();
    int var21 = var18.getIndex();
    boolean var22 = var18.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var23 = var18.getDirection();
    java.lang.Number var24 = var18.getPrevious();
    var5.addSuppressed((java.lang.Throwable)var18);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var31 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var29, false);
    java.lang.String var32 = var31.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var31.getDirection();
    int var34 = var31.getIndex();
    java.lang.Number var35 = var31.getPrevious();
    boolean var36 = var31.getStrict();
    var18.addSuppressed((java.lang.Throwable)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var19.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 1.1752011936438014d+ "'", var24.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var32.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 1.1752011936438014d+ "'", var35.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test348"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-10), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test349"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1442072980), (java.lang.Number)1.1752011936438014d, 99, var15, false);
    var5.addSuppressed((java.lang.Throwable)var17);
    java.lang.Number var19 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var22 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var24 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var19, (java.lang.Number)15.104412573075516d, (-1442072990), var22, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NEGATIVE_INFINITY, (java.lang.Number)Double.NEGATIVE_INFINITY, 191, var28, false);
    var24.addSuppressed((java.lang.Throwable)var30);
    org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)1.5612677191481816d, (-1));
    java.lang.Throwable[] var36 = var35.getSuppressed();
    int var37 = var35.getIndex();
    var30.addSuppressed((java.lang.Throwable)var35);
    var5.addSuppressed((java.lang.Throwable)var35);
    java.lang.Throwable[] var40 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.1752011936438014d+ "'", var11.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test350"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test351"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(6.9882121507348245d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6480542736638855d);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.1850684667798346d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1850684667798348d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test353"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1048576));

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test354"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(806443333668390665L, 8627737931242410865L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3115861462696824695L));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test355"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1150131505), (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test356"); }


    long var2 = org.apache.commons.math.util.FastMath.min(1L, (-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test357"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, 1000573857);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var14, 1997450891849582299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test358"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.8045664954399905d, (-0.9999999999999999d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.242905347995051d);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test359"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.7509655283160555d, 1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7509655283160555d);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test360"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.07585429432749323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07592722599850636d);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test361"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 362880.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test362"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0d, (-963.797928145042d), (-1442072881));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test363"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1749763524);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test364"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0239010128918022d);
    double[] var8 = new double[] { 0.0d};
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var11 = new double[] { 0.0d};
    double[] var13 = new double[] { 100.0d};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var8, var11);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var11, var19);
    double[] var23 = new double[] { 0.0d};
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var23);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var3, var19);
    double[] var29 = new double[] { 0.0d};
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    double[] var37 = new double[] { 0.0d};
    double[] var39 = new double[] { 100.0d};
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var39);
    double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var37);
    double[] var43 = new double[] { 0.0d};
    double[] var45 = new double[] { 100.0d};
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var43, var45);
    double[] var48 = new double[] { 0.0d};
    double[] var50 = new double[] { 100.0d};
    boolean var51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var50);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var48);
    double[] var54 = new double[] { 0.0d};
    double[] var56 = new double[] { 100.0d};
    boolean var57 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var56);
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var56, 1.0239010128918022d);
    double var60 = org.apache.commons.math.util.MathUtils.distance1(var45, var59);
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var59);
    boolean var62 = org.apache.commons.math.util.MathUtils.equals(var29, var34);
    int var63 = org.apache.commons.math.util.MathUtils.hash(var29);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 100.0d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test365"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(103570195, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test366"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test367"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1940688187363215d, (-2.833489212424966E38d), (-1150131614));

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test368"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.6611860783039282d, 104.94395111059633d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 104.94395111059633d);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test369"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.6953039533394731d), 630998.4197775756d, 1.0028618546426544d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test370"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1150131505, 1442072980);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test371"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-892927039), 332746168);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 767013377);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test372"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1200L, (-1997450891849582299L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test373"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1722.57483263636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test374"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(28.56098276152118d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test375"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1442072881));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test376"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.6358511945110851d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6358511945110851d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test377"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100L);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test378"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    org.apache.commons.math.util.MathUtils.checkOrder(var4);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var22);
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double[] var33 = new double[] { 0.0d};
    double[] var35 = new double[] { 100.0d};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var35);
    double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var33);
    double[] var39 = new double[] { 0.0d};
    double[] var41 = new double[] { 100.0d};
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var41);
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0239010128918022d);
    double var45 = org.apache.commons.math.util.MathUtils.distance1(var30, var44);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var44);
    org.apache.commons.math.util.MathUtils.checkOrder(var19);
    org.apache.commons.math.util.MathUtils.checkOrder(var19);
    double[] var50 = new double[] { 0.0d};
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var53 = new double[] { 0.0d};
    double[] var55 = new double[] { 100.0d};
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var55);
    boolean var57 = org.apache.commons.math.util.MathUtils.equals(var50, var53);
    double[] var59 = new double[] { 0.0d};
    double[] var61 = new double[] { 100.0d};
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance(var53, var61);
    double[] var65 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 0.8575532158463934d);
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 0.6480542736638855d);
    double[] var69 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var70 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var61, var70, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var79 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var80 = var79.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var82 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var80, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var61, var80, true);
    double var85 = org.apache.commons.math.util.MathUtils.distance1(var19, var61);
    boolean var86 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var61);
    double[] var87 = null;
    boolean var88 = org.apache.commons.math.util.MathUtils.equals(var4, var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test379"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(58.66520667787039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.765066633029581d);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test380"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-925632413942248003L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test381"); }


    double var2 = org.apache.commons.math.util.FastMath.min(27.46905995280715d, 1.7840341610578332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7840341610578332d);

  }

  public void test382() {}
//   public void test382() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test382"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { 0.0d};
//     double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
//     double[] var5 = new double[] { 0.0d};
//     double[] var7 = new double[] { 100.0d};
//     boolean var8 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var7);
//     boolean var9 = org.apache.commons.math.util.MathUtils.equals(var2, var5);
//     double[] var11 = new double[] { 0.0d};
//     double[] var13 = new double[] { 100.0d};
//     boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var13);
//     double var15 = org.apache.commons.math.util.MathUtils.distance(var5, var13);
//     double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 0.8575532158463934d);
//     double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 0.6480542736638855d);
//     double[] var21 = new double[] { 0.0d};
//     double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
//     double[] var24 = new double[] { 0.0d};
//     double[] var26 = new double[] { 100.0d};
//     boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
//     double[] var29 = new double[] { 0.0d};
//     double[] var31 = new double[] { 100.0d};
//     boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var31);
//     double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var29);
//     double[] var35 = new double[] { 0.0d};
//     double[] var37 = new double[] { 100.0d};
//     boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
//     double[] var40 = new double[] { 0.0d};
//     double[] var42 = new double[] { 100.0d};
//     boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var42);
//     double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var40);
//     double[] var46 = new double[] { 0.0d};
//     double[] var48 = new double[] { 100.0d};
//     boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var48);
//     double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.0239010128918022d);
//     double var52 = org.apache.commons.math.util.MathUtils.distance1(var37, var51);
//     boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var51);
//     boolean var54 = org.apache.commons.math.util.MathUtils.equals(var21, var26);
//     double var55 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var21);
//     double var56 = org.apache.commons.math.util.MathUtils.distance(var0, var19);
// 
//   }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test383"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1150131505), (-1150131505));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test384"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(9.765624999999445E-4d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test385"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.0028673189548942d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test386"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(2009326299, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test387"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    double[] var32 = new double[] { 0.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var32, var35);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var3, var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var42 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.1940688187363215d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test388"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, 240026100, (-1000573857));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test389"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1442072980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test390"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var7.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test391"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-4.9E-324d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test392"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var4, 1532522787);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 0);
    java.math.BigInteger var25 = null;
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var25, 0L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 0);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var24, var27);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var17, var27);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var4, var31);
    java.math.BigInteger var33 = null;
    java.math.BigInteger var35 = org.apache.commons.math.util.MathUtils.pow(var33, 0L);
    java.math.BigInteger var37 = org.apache.commons.math.util.MathUtils.pow(var35, 0);
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var4, var35);
    java.math.BigInteger var39 = null;
    java.math.BigInteger var41 = org.apache.commons.math.util.MathUtils.pow(var39, 0L);
    java.math.BigInteger var43 = org.apache.commons.math.util.MathUtils.pow(var41, 0);
    java.math.BigInteger var44 = null;
    java.math.BigInteger var46 = org.apache.commons.math.util.MathUtils.pow(var44, 0L);
    java.math.BigInteger var48 = org.apache.commons.math.util.MathUtils.pow(var46, 0);
    java.math.BigInteger var49 = org.apache.commons.math.util.MathUtils.pow(var43, var46);
    java.math.BigInteger var51 = org.apache.commons.math.util.MathUtils.pow(var43, 364L);
    java.math.BigInteger var53 = org.apache.commons.math.util.MathUtils.pow(var43, 1532522787);
    java.math.BigInteger var54 = null;
    java.math.BigInteger var56 = org.apache.commons.math.util.MathUtils.pow(var54, 0L);
    java.math.BigInteger var58 = org.apache.commons.math.util.MathUtils.pow(var56, 0);
    java.math.BigInteger var59 = null;
    java.math.BigInteger var61 = org.apache.commons.math.util.MathUtils.pow(var59, 0L);
    java.math.BigInteger var63 = org.apache.commons.math.util.MathUtils.pow(var61, 0);
    java.math.BigInteger var64 = null;
    java.math.BigInteger var66 = org.apache.commons.math.util.MathUtils.pow(var64, 0L);
    java.math.BigInteger var68 = org.apache.commons.math.util.MathUtils.pow(var66, 0);
    java.math.BigInteger var69 = org.apache.commons.math.util.MathUtils.pow(var63, var66);
    java.math.BigInteger var70 = org.apache.commons.math.util.MathUtils.pow(var56, var66);
    java.math.BigInteger var71 = org.apache.commons.math.util.MathUtils.pow(var43, var70);
    java.math.BigInteger var72 = null;
    java.math.BigInteger var74 = org.apache.commons.math.util.MathUtils.pow(var72, 0L);
    java.math.BigInteger var76 = org.apache.commons.math.util.MathUtils.pow(var74, 0);
    java.math.BigInteger var77 = org.apache.commons.math.util.MathUtils.pow(var43, var74);
    java.math.BigInteger var78 = org.apache.commons.math.util.MathUtils.pow(var38, var43);
    java.math.BigInteger var80 = org.apache.commons.math.util.MathUtils.pow(var38, 240026100);
    java.math.BigInteger var82 = org.apache.commons.math.util.MathUtils.pow(var38, 767013377);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test393"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(1.1641532182693481E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963266784812d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test394"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.7840341610578332d, 0.9542985177860862d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7840341610578332d);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test395"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1997450891849582935L, 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1997450891849581935L);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test396"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(2009326299, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 82.50620747949382d);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test397"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(8.140344062648719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1715.0487709973513d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test398"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-1.8364259042200248d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.675678494655231d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test399"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.44630485968672645d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1012581906167638d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test400"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.4612695550331807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.479425538604203d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test401"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.1932414450926745d), 0.1663477970454088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test402"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(66.93522156958998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test403"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    double[] var32 = new double[] { 0.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var32, var35);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var3, var32);
    double[] var42 = new double[] { 0.0d};
    double[] var44 = new double[] { 100.0d};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var44);
    double[] var47 = new double[] { 0.0d};
    double[] var49 = new double[] { 100.0d};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var49);
    double var51 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var47);
    double[] var52 = new double[] { };
    double[] var56 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var57 = null;
    boolean var58 = org.apache.commons.math.util.MathUtils.equals(var56, var57);
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var56);
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var56);
    double[] var62 = new double[] { 0.0d};
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double[] var65 = new double[] { 0.0d};
    double[] var67 = new double[] { 100.0d};
    boolean var68 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var65, var67);
    boolean var69 = org.apache.commons.math.util.MathUtils.equals(var62, var65);
    double[] var71 = new double[] { 0.0d};
    double[] var73 = new double[] { 100.0d};
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var71, var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var65, var73);
    double[] var77 = org.apache.commons.math.util.MathUtils.normalizeArray(var73, 0.8575532158463934d);
    double[] var79 = org.apache.commons.math.util.MathUtils.normalizeArray(var73, 0.6480542736638855d);
    double var80 = org.apache.commons.math.util.MathUtils.distance(var47, var73);
    double var81 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double var82 = org.apache.commons.math.util.MathUtils.distance1(var3, var73);
    double[] var84 = org.apache.commons.math.util.MathUtils.normalizeArray(var73, 1.1850684667798348d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test404"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    double[] var20 = new double[] { 0.0d};
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var25, var28);
    double[] var34 = new double[] { 0.0d};
    double[] var36 = new double[] { 100.0d};
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var36);
    double[] var39 = new double[] { 0.0d};
    double[] var41 = new double[] { 100.0d};
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var41);
    double var43 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var39);
    double[] var45 = new double[] { 0.0d};
    double[] var47 = new double[] { 100.0d};
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var47);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.0239010128918022d);
    double var51 = org.apache.commons.math.util.MathUtils.distance1(var36, var50);
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var50);
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var20, var25);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var20);
    java.lang.Number var55 = null;
    java.lang.Number var58 = null;
    java.lang.Number var59 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var73 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var74 = var73.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var76 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var74, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var78 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var74, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var80 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9557502835537018d, (java.lang.Number)1.7840341610578332d, (-240026100), var74, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var82 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var58, var59, (-1000573857), var74, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var84 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var55, (java.lang.Number)0.004252766970684236d, (-1150131614), var74, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var20, var74, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test405"); }


    double[] var3 = new double[] { 10.0d, 0.0d, 100.0d};
    double[] var5 = new double[] { 0.0d};
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    double[] var8 = new double[] { 0.0d};
    double[] var10 = new double[] { 100.0d};
    boolean var11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var8, var10);
    boolean var12 = org.apache.commons.math.util.MathUtils.equals(var5, var8);
    double[] var14 = new double[] { 0.0d};
    double[] var16 = new double[] { 100.0d};
    boolean var17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var14, var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance(var8, var16);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.8575532158463934d);
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.6480542736638855d);
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 1.0239010128918025d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var25 = org.apache.commons.math.util.MathUtils.distance(var3, var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test406() {}
//   public void test406() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test406"); }
// 
// 
//     int[] var3 = new int[] { 100, 100, 0};
//     int[] var7 = new int[] { 10, 0, 1};
//     int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
//     int[] var12 = new int[] { 100, 100, 0};
//     int[] var16 = new int[] { 10, 0, 1};
//     int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
//     int[] var21 = new int[] { 100, 100, 0};
//     int[] var25 = new int[] { 10, 0, 1};
//     int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
//     int[] var30 = new int[] { 100, 100, 0};
//     int[] var34 = new int[] { 10, 0, 1};
//     int var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var34);
//     int var36 = org.apache.commons.math.util.MathUtils.distance1(var25, var34);
//     int[] var40 = new int[] { 100, 100, 0};
//     int[] var44 = new int[] { 10, 0, 1};
//     int var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
//     int[] var49 = new int[] { 100, 100, 0};
//     int[] var53 = new int[] { 10, 0, 1};
//     int var54 = org.apache.commons.math.util.MathUtils.distance1(var49, var53);
//     int var55 = org.apache.commons.math.util.MathUtils.distance1(var44, var53);
//     double var56 = org.apache.commons.math.util.MathUtils.distance(var34, var53);
//     int var57 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var34);
//     double var58 = org.apache.commons.math.util.MathUtils.distance(var7, var12);
//     int[] var59 = null;
//     int var60 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var59);
// 
//   }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test407"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.540289941871101d), (-1.0326329306069673d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test408"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07578173920018638d);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test409"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0426302550738344E15d, 1.5430806348152437d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test410"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians((-0.7742028622880628d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.013512389025290936d));

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test411"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(3.615354633267934E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 330.66150239867255d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test412"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.2623541086902015d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2329783180169909d);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test413"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(11013.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test414"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    int var6 = var5.getIndex();
    boolean var7 = var5.getStrict();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1442072990));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1,442,072,991 and -1,442,072,990 are not decreasing (15.104 < null)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1,442,072,991 and -1,442,072,990 are not decreasing (15.104 < null)"));

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test415"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.4989227756918429d, 1.4931702671658056d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5765846055910384d));

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test416"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    int var19 = org.apache.commons.math.util.MathUtils.hash(var18);
    double[] var20 = new double[] { };
    double[] var24 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var25 = null;
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var24, var25);
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var24);
    double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1862915923);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.6480542736638855d);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test417"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.000441095849621d, 0.770060138012284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.000441095849621d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test418"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test419"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 0, 100, 100};
    int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var12);
    int[] var17 = new int[] { 100, 100, 0};
    int[] var21 = new int[] { 10, 0, 1};
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var21);
    int[] var26 = new int[] { 100, 100, 0};
    int[] var30 = new int[] { 10, 0, 1};
    int var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var30);
    int var32 = org.apache.commons.math.util.MathUtils.distance1(var21, var30);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var7, var30);
    int[] var37 = new int[] { 100, 100, 0};
    int[] var41 = new int[] { 10, 0, 1};
    int var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var41);
    int[] var46 = new int[] { 100, 100, 0};
    int[] var50 = new int[] { 10, 0, 1};
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var50);
    int[] var55 = new int[] { 100, 100, 0};
    int[] var59 = new int[] { 10, 0, 1};
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var55, var59);
    int[] var64 = new int[] { 100, 100, 0};
    int[] var68 = new int[] { 10, 0, 1};
    int var69 = org.apache.commons.math.util.MathUtils.distance1(var64, var68);
    int var70 = org.apache.commons.math.util.MathUtils.distance1(var59, var68);
    int[] var74 = new int[] { 100, 100, 0};
    int[] var78 = new int[] { 10, 0, 1};
    int var79 = org.apache.commons.math.util.MathUtils.distance1(var74, var78);
    int[] var83 = new int[] { 100, 100, 0};
    int[] var87 = new int[] { 10, 0, 1};
    int var88 = org.apache.commons.math.util.MathUtils.distance1(var83, var87);
    int var89 = org.apache.commons.math.util.MathUtils.distance1(var78, var87);
    double var90 = org.apache.commons.math.util.MathUtils.distance(var68, var87);
    int var91 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var68);
    double var92 = org.apache.commons.math.util.MathUtils.distance(var41, var46);
    int var93 = org.apache.commons.math.util.MathUtils.distance1(var7, var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 134.5399568901373d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test420"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    java.lang.Number var9 = null;
    java.lang.Number var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var24 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = var24.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var25, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var25, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var31 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9557502835537018d, (java.lang.Number)1.7840341610578332d, (-240026100), var25, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var9, var10, (-1000573857), var25, true);
    org.apache.commons.math.util.MathUtils.checkOrder(var1, var25, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test421"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(10.0f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test422"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.7310309456440016E13d, 599254251, 209066259);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test423"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.06673892011162788d), 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.06673892011162788d));

  }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test424"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, 1150131604);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test425"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)0L, 100, var3, true);
    java.lang.Number var6 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1.087077848795329E30d+ "'", var6.equals(1.087077848795329E30d));

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test426"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.7739443644448949d, 0.4989227756918429d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test427"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-963.797928145042d), 9.76562034338957E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test428"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(9.765624999999445E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.76562189559264E-4d);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test429"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-0.9555128079474305d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6153851395842559d));

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(209, 599254251);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test431"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1000573857, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test432"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1442072980), (java.lang.Number)1.1752011936438014d, 99, var15, false);
    var5.addSuppressed((java.lang.Throwable)var17);
    java.lang.Number var19 = var17.getArgument();
    boolean var20 = var17.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.1752011936438014d+ "'", var11.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1442072980)+ "'", var19.equals((-1442072980)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test433"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.3947735336066061d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.4036519709818725d));

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test434"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.5765846055910384d), 0);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test435"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var13, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var13, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9557502835537018d, (java.lang.Number)1.7840341610578332d, (-240026100), var13, true);
    java.lang.String var20 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -240,026,101 and -240,026,100 are not strictly increasing (1.784 >= 0.956)"+ "'", var20.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -240,026,101 and -240,026,100 are not strictly increasing (1.784 >= 0.956)"));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test436"); }


    int[] var2 = new int[] { 0, 100};
    int[] var6 = new int[] { 100, 100, 0};
    int[] var10 = new int[] { 10, 0, 1};
    int var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var10);
    int[] var15 = new int[] { 100, 100, 0};
    int[] var19 = new int[] { 10, 0, 1};
    int var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var19);
    int var21 = org.apache.commons.math.util.MathUtils.distance1(var10, var19);
    int[] var25 = new int[] { 100, 100, 0};
    int[] var29 = new int[] { 10, 0, 1};
    int var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var29);
    int[] var34 = new int[] { 100, 100, 0};
    int[] var38 = new int[] { 10, 0, 1};
    int var39 = org.apache.commons.math.util.MathUtils.distance1(var34, var38);
    int var40 = org.apache.commons.math.util.MathUtils.distance1(var29, var38);
    double var41 = org.apache.commons.math.util.MathUtils.distance(var19, var38);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var2, var38);
    int[] var46 = new int[] { 100, 100, 0};
    int[] var50 = new int[] { 10, 0, 1};
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var50);
    int[] var55 = new int[] { 0, 100, 100};
    int var56 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var55);
    int var57 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var50);
    int[] var61 = new int[] { 100, 100, 0};
    int[] var65 = new int[] { 10, 0, 1};
    int var66 = org.apache.commons.math.util.MathUtils.distance1(var61, var65);
    int[] var70 = new int[] { 100, 100, 0};
    int[] var74 = new int[] { 10, 0, 1};
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var70, var74);
    int var76 = org.apache.commons.math.util.MathUtils.distance1(var65, var74);
    int[] var80 = new int[] { 100, 100, 0};
    int[] var84 = new int[] { 10, 0, 1};
    int var85 = org.apache.commons.math.util.MathUtils.distance1(var80, var84);
    int[] var89 = new int[] { 100, 100, 0};
    int[] var93 = new int[] { 10, 0, 1};
    int var94 = org.apache.commons.math.util.MathUtils.distance1(var89, var93);
    int var95 = org.apache.commons.math.util.MathUtils.distance1(var84, var93);
    double var96 = org.apache.commons.math.util.MathUtils.distance(var74, var93);
    int var97 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.4987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 100);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test437"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = null;
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 0);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var9, var12);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var2, var12);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test438"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    java.lang.Number var7 = var5.getPrevious();
    java.lang.String var8 = var5.toString();
    boolean var9 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test439"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.44630485968672645d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4316352937753699d);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test440"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-10), (-1862915923));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1862915923));

  }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test441"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.0326329306069673d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test442"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    java.lang.Throwable[] var9 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test443"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test444"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 69.16104601342298d);

  }

  public void test445() {}
//   public void test445() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test445"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = org.apache.commons.math.util.MathUtils.normalizeArray(var0, 0.07005479595293078d);
// 
//   }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test446"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    double[] var32 = new double[] { 0.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var32, var35);
    double[] var41 = new double[] { 0.0d};
    double[] var43 = new double[] { 100.0d};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var43);
    double var45 = org.apache.commons.math.util.MathUtils.distance(var35, var43);
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 0.8575532158463934d);
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 0.6480542736638855d);
    double[] var51 = new double[] { 0.0d};
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double[] var54 = new double[] { 0.0d};
    double[] var56 = new double[] { 100.0d};
    boolean var57 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var56);
    double[] var59 = new double[] { 0.0d};
    double[] var61 = new double[] { 100.0d};
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var61);
    double var63 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var59);
    double[] var65 = new double[] { 0.0d};
    double[] var67 = new double[] { 100.0d};
    boolean var68 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var65, var67);
    double[] var70 = new double[] { 0.0d};
    double[] var72 = new double[] { 100.0d};
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var70, var72);
    double var74 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var70);
    double[] var76 = new double[] { 0.0d};
    double[] var78 = new double[] { 100.0d};
    boolean var79 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var76, var78);
    double[] var81 = org.apache.commons.math.util.MathUtils.normalizeArray(var78, 1.0239010128918022d);
    double var82 = org.apache.commons.math.util.MathUtils.distance1(var67, var81);
    boolean var83 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var81);
    boolean var84 = org.apache.commons.math.util.MathUtils.equals(var51, var56);
    double var85 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var51);
    double[] var86 = new double[] { };
    double[] var90 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var91 = null;
    boolean var92 = org.apache.commons.math.util.MathUtils.equals(var90, var91);
    boolean var93 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var86, var90);
    double var94 = org.apache.commons.math.util.MathUtils.distance1(var49, var90);
    double var95 = org.apache.commons.math.util.MathUtils.distance1(var3, var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 100.0d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test447"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-89.2328896037985d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9545943990414509d));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test448"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1122853665), 2110066489);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1122853665));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test449"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1150131505), 99);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test450"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(876188322, 1442072881);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test451"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(363181L, 72L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 26149032L);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test452"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(361981L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 361979L);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test453"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(3323475524098873185L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test454"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 240026100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test455"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.4612695550331807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test456"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0239010128918025d);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var12, var24);
    double[] var29 = new double[] { 0.0d};
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    boolean var36 = org.apache.commons.math.util.MathUtils.equals(var29, var32);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var32, var40);
    org.apache.commons.math.util.MathUtils.checkOrder(var32);
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var24, var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test457"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 876188323);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test458"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.07570930918522556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.120850716547405d));

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test459"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(9.765625000000295E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765628104410654E-4d);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test460"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    java.lang.Number var5 = var3.getArgument();
    java.lang.Number var6 = var3.getPrevious();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.149548905166106d+ "'", var5.equals(1.149548905166106d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + Double.POSITIVE_INFINITY+ "'", var6.equals(Double.POSITIVE_INFINITY));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,079,574,558 and 1,079,574,559 are not strictly increasing (\u221E >= 1.15)"+ "'", var7.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,079,574,558 and 1,079,574,559 are not strictly increasing (\u221E >= 1.15)"));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test461"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    java.lang.String var12 = var5.toString();
    boolean var13 = var5.getStrict();
    int var14 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var18, false);
    java.lang.String var21 = var20.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var22 = var20.getDirection();
    int var23 = var20.getIndex();
    boolean var24 = var20.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = var20.getDirection();
    java.lang.Number var26 = var20.getArgument();
    java.lang.String var27 = var20.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var31 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var31, false);
    java.lang.String var34 = var33.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var35 = var33.getDirection();
    int var36 = var33.getIndex();
    boolean var37 = var33.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = var33.getDirection();
    java.lang.Number var39 = var33.getPrevious();
    var20.addSuppressed((java.lang.Throwable)var33);
    var5.addSuppressed((java.lang.Throwable)var20);
    boolean var42 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var43 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.9067427790689399d+ "'", var11.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var12.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 0.9067427790689399d+ "'", var26.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var27.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var34.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + 1.1752011936438014d+ "'", var39.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test462"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    double[] var37 = new double[] { 0.0d};
    double[] var39 = new double[] { 100.0d};
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var39);
    double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var37);
    double[] var43 = new double[] { 0.0d};
    double[] var45 = new double[] { 100.0d};
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var43, var45);
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0239010128918022d);
    double var49 = org.apache.commons.math.util.MathUtils.distance1(var34, var48);
    double var50 = org.apache.commons.math.util.MathUtils.distance(var3, var48);
    double[] var51 = null;
    double[] var53 = new double[] { 0.0d};
    double[] var55 = new double[] { 100.0d};
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var55);
    double[] var58 = new double[] { 0.0d};
    double[] var60 = new double[] { 100.0d};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var60);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var58);
    double[] var64 = new double[] { 0.0d};
    double[] var66 = new double[] { 100.0d};
    boolean var67 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var64, var66);
    double[] var69 = new double[] { 0.0d};
    double[] var71 = new double[] { 100.0d};
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var69, var71);
    double var73 = org.apache.commons.math.util.MathUtils.distanceInf(var66, var69);
    double[] var75 = new double[] { 0.0d};
    double[] var77 = new double[] { 100.0d};
    boolean var78 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var75, var77);
    double[] var80 = org.apache.commons.math.util.MathUtils.normalizeArray(var77, 1.0239010128918022d);
    double var81 = org.apache.commons.math.util.MathUtils.distance1(var66, var80);
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var80);
    org.apache.commons.math.util.MathUtils.checkOrder(var55);
    boolean var84 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var55);
    int var85 = org.apache.commons.math.util.MathUtils.hash(var55);
    boolean var86 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var55);
    int var87 = org.apache.commons.math.util.MathUtils.hash(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1079574559);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test463"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(2.533730489034676d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2623541086902015d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test464"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1442072980));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test465"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1752011936438014d));

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test466"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8045664954399905d, 1.1738088312590378E29d, 1062207624);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test467"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var11 = new double[] { };
    double[] var15 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var16 = null;
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var15, var16);
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var15);
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var15);
    double[] var21 = new double[] { 0.0d};
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var21, var24);
    double[] var30 = new double[] { 0.0d};
    double[] var32 = new double[] { 100.0d};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var24, var32);
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.8575532158463934d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.6480542736638855d);
    double var39 = org.apache.commons.math.util.MathUtils.distance(var6, var32);
    double[] var41 = new double[] { 0.0d};
    double[] var43 = new double[] { 100.0d};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var43);
    double[] var46 = new double[] { 0.0d};
    double[] var48 = new double[] { 100.0d};
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var48);
    double var50 = org.apache.commons.math.util.MathUtils.distanceInf(var43, var46);
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double var52 = org.apache.commons.math.util.MathUtils.distance(var6, var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test468"); }


    double[] var1 = new double[] { 1.0d};
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var4 = new double[] { 0.0d};
    double var5 = org.apache.commons.math.util.MathUtils.safeNorm(var4);
    double[] var7 = new double[] { 0.0d};
    double[] var9 = new double[] { 100.0d};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
    boolean var11 = org.apache.commons.math.util.MathUtils.equals(var4, var7);
    double[] var13 = new double[] { 0.0d};
    double[] var15 = new double[] { 100.0d};
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance(var7, var15);
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 0.8575532158463934d);
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 0.6480542736638855d);
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 1.0239010128918025d);
    double var24 = org.apache.commons.math.util.MathUtils.distance(var1, var23);
    double[] var26 = new double[] { 1.0d};
    org.apache.commons.math.util.MathUtils.checkOrder(var26);
    double[] var29 = new double[] { 0.0d};
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    boolean var36 = org.apache.commons.math.util.MathUtils.equals(var29, var32);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var32, var40);
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 0.8575532158463934d);
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 0.6480542736638855d);
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 1.0239010128918025d);
    double var49 = org.apache.commons.math.util.MathUtils.distance(var26, var48);
    boolean var50 = org.apache.commons.math.util.MathUtils.equals(var1, var26);
    double[] var52 = new double[] { 0.0d};
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double[] var55 = new double[] { 0.0d};
    double[] var57 = new double[] { 100.0d};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var57);
    boolean var59 = org.apache.commons.math.util.MathUtils.equals(var52, var55);
    double[] var61 = new double[] { 0.0d};
    double[] var63 = new double[] { 100.0d};
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var61, var63);
    double var65 = org.apache.commons.math.util.MathUtils.distance(var55, var63);
    int var66 = org.apache.commons.math.util.MathUtils.hash(var63);
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double[] var69 = new double[] { 0.0d};
    double[] var71 = new double[] { 100.0d};
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var69, var71);
    double[] var74 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 1.0239010128918022d);
    double[] var76 = new double[] { 0.0d};
    double var77 = org.apache.commons.math.util.MathUtils.safeNorm(var76);
    double[] var79 = new double[] { 0.0d};
    double[] var81 = new double[] { 100.0d};
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var79, var81);
    boolean var83 = org.apache.commons.math.util.MathUtils.equals(var76, var79);
    double[] var85 = new double[] { 0.0d};
    double[] var87 = new double[] { 100.0d};
    boolean var88 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var85, var87);
    double var89 = org.apache.commons.math.util.MathUtils.distance(var79, var87);
    double[] var91 = new double[] { 0.0d};
    double var92 = org.apache.commons.math.util.MathUtils.safeNorm(var91);
    double var93 = org.apache.commons.math.util.MathUtils.safeNorm(var91);
    boolean var94 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var87, var91);
    double var95 = org.apache.commons.math.util.MathUtils.distance(var71, var87);
    int var96 = org.apache.commons.math.util.MathUtils.hash(var87);
    double var97 = org.apache.commons.math.util.MathUtils.distanceInf(var63, var87);
    boolean var98 = org.apache.commons.math.util.MathUtils.equals(var1, var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.023901012891802464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.023901012891802464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test469() {}
//   public void test469() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test469"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(66.93522156958998d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test470"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.1241171695718353d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test471"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-62.76775642379764d));

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test472"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-0.10022219450316257d), 4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.10022219450316255d));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test473"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.4826013365986588d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11.309098927782431d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test474"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(134.5399568901373d, 0.07570930918522556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test475"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(2009326299);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test476"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0359770329454867d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.817858031239898d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test477"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.16227766016838d, (java.lang.Number)2.0886708959722813d, 1532522787, var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var9, true);
    var5.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math.util.MathUtils.OrderDirection var16 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var16, false);
    var5.addSuppressed((java.lang.Throwable)var18);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test478"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-5L), 1997450891849582299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test479"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.String var8 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 15.104412573075516d+ "'", var6.equals(15.104412573075516d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1,442,072,991 and -1,442,072,990 are not decreasing (15.104 < null)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1,442,072,991 and -1,442,072,990 are not decreasing (15.104 < null)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test480"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.37623361672720984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3678794411714423d);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test481"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(264L, 9000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test482"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = new double[] { 0.0d};
    double[] var8 = new double[] { 100.0d};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.0239010128918022d);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var3, var17);
    double[] var20 = new double[] { 0.0d};
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    boolean var27 = org.apache.commons.math.util.MathUtils.equals(var20, var23);
    double[] var29 = new double[] { 0.0d};
    double[] var31 = new double[] { 100.0d};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var23, var31);
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var31, 0.8575532158463934d);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var17, var35);
    int var37 = org.apache.commons.math.util.MathUtils.hash(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.1663477970454088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1325336842);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test483"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.6358511945110851d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.888629048145898d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test484"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1814400.000000139d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9910963653922334d));

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test485"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.90674277906894d, 0.004252766970684236d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 55.77510373313475d);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test486"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test487"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-361680L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 130812422400L);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test488"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.07570930918522556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.27515324672848324d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test489"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.5707963267948966d), 0.7165256995489038d, 134.5399568901373d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test490() {}
//   public void test490() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test490"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(630999.4197775752d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test491"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(815.7297363039102d, 0.699218330199179d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 815.72973630391d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test492"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0239010128918022d);
    double[] var8 = new double[] { 0.0d};
    double[] var10 = new double[] { 100.0d};
    boolean var11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var8, var10);
    double[] var13 = new double[] { 0.0d};
    double[] var15 = new double[] { 100.0d};
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var15);
    double var17 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var13);
    double[] var19 = new double[] { 0.0d};
    double[] var21 = new double[] { 100.0d};
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var21);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    double var28 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var24);
    double[] var30 = new double[] { 0.0d};
    double[] var32 = new double[] { 100.0d};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.0239010128918022d);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var21, var35);
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var35);
    double[] var39 = new double[] { 0.0d};
    double var40 = org.apache.commons.math.util.MathUtils.safeNorm(var39);
    double[] var42 = new double[] { 0.0d};
    double[] var44 = new double[] { 100.0d};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var44);
    boolean var46 = org.apache.commons.math.util.MathUtils.equals(var39, var42);
    boolean var47 = org.apache.commons.math.util.MathUtils.equals(var10, var39);
    double[] var49 = new double[] { 0.0d};
    double var50 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    double[] var52 = new double[] { 0.0d};
    double[] var54 = new double[] { 100.0d};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var54);
    boolean var56 = org.apache.commons.math.util.MathUtils.equals(var49, var52);
    double[] var58 = new double[] { 0.0d};
    double[] var60 = new double[] { 100.0d};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance(var52, var60);
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 0.8575532158463934d);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 0.6480542736638855d);
    double[] var68 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0239010128918025d);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var68);
    double[] var71 = new double[] { 0.0d};
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    int var73 = org.apache.commons.math.util.MathUtils.hash(var71);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var68, var71);
    double[] var78 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var79 = null;
    boolean var80 = org.apache.commons.math.util.MathUtils.equals(var78, var79);
    int var81 = org.apache.commons.math.util.MathUtils.hash(var78);
    double var82 = org.apache.commons.math.util.MathUtils.distance1(var71, var78);
    org.apache.commons.math.util.MathUtils.checkOrder(var71);
    double var84 = org.apache.commons.math.util.MathUtils.distance1(var3, var71);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-1000573857));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 100.0d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test493"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = new double[] { 0.0d};
    double[] var18 = new double[] { 100.0d};
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
    double[] var21 = new double[] { 0.0d};
    double[] var23 = new double[] { 100.0d};
    boolean var24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var23);
    double var25 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var21);
    double[] var27 = new double[] { 0.0d};
    double[] var29 = new double[] { 100.0d};
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var29);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var32);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 1.0239010128918022d);
    double var44 = org.apache.commons.math.util.MathUtils.distance1(var29, var43);
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var43);
    double[] var47 = new double[] { 0.0d};
    double[] var49 = new double[] { 100.0d};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var49);
    double[] var52 = new double[] { 0.0d};
    double[] var54 = new double[] { 100.0d};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var54);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var52);
    double[] var58 = new double[] { 0.0d};
    double[] var60 = new double[] { 100.0d};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var60);
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0239010128918022d);
    double var64 = org.apache.commons.math.util.MathUtils.distance1(var49, var63);
    double var65 = org.apache.commons.math.util.MathUtils.distance(var18, var63);
    double[] var67 = new double[] { 0.0d};
    double var68 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    double var70 = org.apache.commons.math.util.MathUtils.distance(var18, var67);
    double var71 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 100.0d);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test494"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-2084206212));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test495"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-963.797928145042d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test496"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(100.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5309649148733797d));

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test497"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.6893620967346501d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6893620967346501d);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test498"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.9287285890885334d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test499"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var12, var21, true);
    double[] var25 = new double[] { 0.0d};
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var28 = org.apache.commons.math.util.MathUtils.distance(var12, var25);
    double[] var30 = new double[] { 0.0d};
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double[] var33 = new double[] { 0.0d};
    double[] var35 = new double[] { 100.0d};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var35);
    double[] var38 = new double[] { 0.0d};
    double[] var40 = new double[] { 100.0d};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var40);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var38);
    double[] var44 = new double[] { 0.0d};
    double[] var46 = new double[] { 100.0d};
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var46);
    double[] var49 = new double[] { 0.0d};
    double[] var51 = new double[] { 100.0d};
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var49);
    double[] var55 = new double[] { 0.0d};
    double[] var57 = new double[] { 100.0d};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var57);
    double[] var60 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.0239010128918022d);
    double var61 = org.apache.commons.math.util.MathUtils.distance1(var46, var60);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var60);
    boolean var63 = org.apache.commons.math.util.MathUtils.equals(var30, var35);
    double[] var65 = new double[] { 0.0d};
    double var66 = org.apache.commons.math.util.MathUtils.safeNorm(var65);
    double[] var68 = new double[] { 0.0d};
    double[] var70 = new double[] { 100.0d};
    boolean var71 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var70);
    boolean var72 = org.apache.commons.math.util.MathUtils.equals(var65, var68);
    double[] var74 = new double[] { 0.0d};
    double[] var76 = new double[] { 100.0d};
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var74, var76);
    double var78 = org.apache.commons.math.util.MathUtils.distance(var68, var76);
    double[] var80 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 0.8575532158463934d);
    double var81 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var76);
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var76);
    double[] var84 = new double[] { 0.0d};
    double var85 = org.apache.commons.math.util.MathUtils.safeNorm(var84);
    double[] var87 = new double[] { 0.0d};
    double[] var89 = new double[] { 100.0d};
    boolean var90 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var87, var89);
    boolean var91 = org.apache.commons.math.util.MathUtils.equals(var84, var87);
    boolean var92 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test500"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.9330920755982086d, 0.9557502835537018d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

}
